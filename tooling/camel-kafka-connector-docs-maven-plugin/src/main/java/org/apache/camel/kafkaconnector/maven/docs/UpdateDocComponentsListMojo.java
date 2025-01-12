/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.maven.docs;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.apache.camel.kafkaconnector.maven.docs.dto.CamelKafkaConnectorTableModel;
import org.apache.camel.kafkaconnector.maven.docs.dto.CamelKafkaConnectorTableOptionModel;
import org.apache.camel.maven.packaging.MvelHelper;
import org.apache.camel.tooling.util.Strings;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.apache.commons.lang3.StringUtils;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.project.MavenProjectHelper;
import org.mvel2.templates.TemplateRuntime;

import static org.apache.camel.tooling.util.PackageHelper.loadText;
import static org.apache.camel.tooling.util.PackageHelper.writeText;

/**
 * Updates the documentation in: - docs/modules/ROOT/pages/connectors.adoc
 */
@Mojo(name = "update-doc-connectors-list", threadSafe = true)
public class UpdateDocComponentsListMojo extends AbstractMojo {

    @Parameter( property = "sinkConnectorLinkSuffixAdoc", defaultValue = "kafka-sink-connector.adoc[Sink Docs]")
    private String sinkConnectorLinkSuffixAdoc;

    @Parameter(property = "sourceConnectorLinkSuffixAdoc", defaultValue = "kafka-source-connector.adoc[Source Docs]")
    private String sourceConnectorLinkSuffixAdoc;

    @Parameter(property = "xrefConnectorLinkPrefix", defaultValue = "xref:reference/connectors/")
    private String xrefConnectorLinkPrefix;

    @Parameter(property = "docFolderWebsiteChildPath", defaultValue = "docs/modules/ROOT/")
    private String docFolderWebsiteChildPath;

    @Parameter(property = "docFileWebsiteChildPath", defaultValue = "pages/reference/index.adoc")
    private String docFileWebsiteChildPath;

    /**
     * The maven project.
     */
    @Parameter(property = "project", required = true, readonly = true)
    protected MavenProject project;

    /**
     * The directory for components catalog
     */
    @Parameter(defaultValue = "${project.directory}/../../connectors/")
    protected File connectorsDir;

    /**
     * The project directory
     */
    @Parameter(defaultValue = "${basedir}/../")
    protected File projectBaseDir;
    
    /**
     * The Apache Repository
     */
    @Parameter(defaultValue = "https://repo.maven.apache.org/maven2/org/apache/camel/kafkaconnector/")
    protected String repositoryPath;
    
    
    /**
     * The Last Released version
     */
    @Parameter
    protected String lastReleasedVersion;
    
    /**
     * The maven project.
     */
    @Parameter(property = "connectors-project-name", defaultValue = "connectors", readonly = true)
    protected String connectorsProjectName;

    /**
     * Maven ProjectHelper.
     */
    @Component
    private MavenProjectHelper projectHelper;

    /**
     * Execute goal.
     *
     * @throws MojoExecutionException execution of the main class or one of the
     *             threads it generated failed.
     * @throws MojoFailureException something bad happened...
     */
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (!project.getArtifactId().equals(connectorsProjectName)) {
            getLog().debug("Skipping project " + project.getArtifactId() + " since it is not " + connectorsProjectName + " can be configured with <connectors-project-name> option.");
            return;
        }
        executeComponentsReadme();
    }

    protected void executeComponentsReadme() throws MojoExecutionException, MojoFailureException {
        CamelKafkaConnectorTableModel tableModel = new CamelKafkaConnectorTableModel();
        ArrayList<CamelKafkaConnectorTableOptionModel> options = new ArrayList<>();

        if (connectorsDir != null && connectorsDir.isDirectory()) {
            File[] files = connectorsDir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        Collection sinkConnector = FileUtils.listFiles(file, new RegexFileFilter(".*SinkTask.*"), DirectoryFileFilter.DIRECTORY);
                        Collection sourceConnector = FileUtils.listFiles(file, new RegexFileFilter(".*SourceTask.*"), DirectoryFileFilter.DIRECTORY);
                        if (!sinkConnector.isEmpty() || !sourceConnector.isEmpty()) {
                            CamelKafkaConnectorTableOptionModel singleConnector = new CamelKafkaConnectorTableOptionModel();
                            singleConnector.setName(file.getName());
                            if (!sinkConnector.isEmpty()) {
                                singleConnector.setSink(true);
                                String connectorFinal = StringUtils.removeEnd(file.getName(), "kafka-connector");
                                if (connectorFinal.equalsIgnoreCase("camel-coap-tcp-")) {
                                    singleConnector.setDocsSink(xrefConnectorLinkPrefix + "camel-coap+tcp-" + sinkConnectorLinkSuffixAdoc);
                                } else if (connectorFinal.equalsIgnoreCase("camel-coaps-tcp-")) {
                                    singleConnector.setDocsSink(xrefConnectorLinkPrefix + "camel-coaps+tcp-" + sinkConnectorLinkSuffixAdoc);
                                } else if (connectorFinal.equalsIgnoreCase("camel-solrcloud-")) {
                                    singleConnector.setDocsSink(xrefConnectorLinkPrefix + "camel-solrCloud-" + sinkConnectorLinkSuffixAdoc);
                                } else {
                                    singleConnector.setDocsSink(xrefConnectorLinkPrefix + connectorFinal + sinkConnectorLinkSuffixAdoc);
                                }
                            }
                            if (!sourceConnector.isEmpty()) {
                                singleConnector.setSource(true);
                                String connectorFinal = StringUtils.removeEnd(file.getName(), "kafka-connector");
                                if (connectorFinal.equalsIgnoreCase("camel-coap-tcp-")) {
                                    singleConnector.setDocsSource(xrefConnectorLinkPrefix + "camel-coap+tcp-" + sourceConnectorLinkSuffixAdoc);
                                } else if (connectorFinal.equalsIgnoreCase("camel-coaps-tcp-")) {
                                    singleConnector.setDocsSource(xrefConnectorLinkPrefix + "camel-coaps+tcp-" + sourceConnectorLinkSuffixAdoc);
                                } else if (connectorFinal.equalsIgnoreCase("camel-solrcloud-")) {
                                    singleConnector.setDocsSource(xrefConnectorLinkPrefix + "camel-solrCloud-" + sourceConnectorLinkSuffixAdoc);
                                } else {
                                    singleConnector.setDocsSource(xrefConnectorLinkPrefix + connectorFinal + sourceConnectorLinkSuffixAdoc);
                                }
                            }
                            String downloadLinkTar = repositoryPath + singleConnector.getName() + "/" + lastReleasedVersion + "/" + singleConnector.getName() + "-" + lastReleasedVersion + "-package.tar.gz[Download]";
                            singleConnector.setDownloadLinkTar(downloadLinkTar);
                            options.add(singleConnector);
                        }
                    }
                }
                options.sort((model1, model2) -> {
                    String name1 = model1.getName();
                    String name2 = model2.getName();
                    int res = String.CASE_INSENSITIVE_ORDER.compare(name1, name2);
                    return (res != 0) ? res : name1.compareTo(name2);
                });
                tableModel.setOptions(options);
            }
        }

        File docFolderWebsite = new File(projectBaseDir, docFolderWebsiteChildPath);
        File docFileWebsite = new File(docFolderWebsite, docFileWebsiteChildPath);

        String changed = templateConnnectorsTable(tableModel);
        boolean updated = updateConnectorsTable(docFileWebsite, changed);
        if (updated) {
            getLog().info("Updated connectors table file: " + docFileWebsite);
        } else {
            getLog().debug("No changes to connectors table file: " + docFileWebsite);
        }
        File navWebsite = new File(docFolderWebsite, "nav.adoc");
        boolean navUpdated = updateNav(navWebsite, tableModel);
        if (navUpdated) {
            getLog().info("Updated nav file: " + navWebsite);
        } else {
            getLog().debug("No changes to nav file: " + navWebsite);
        }
    }

    private String templateConnnectorsTable(CamelKafkaConnectorTableModel model) throws MojoExecutionException {

        try {
            String template;
            template = loadText(UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("connectors.mvel"));
            String out = (String)TemplateRuntime.eval(template, model, Collections.singletonMap("util", MvelHelper.INSTANCE));
            return out;
        } catch (Exception e) {
            throw new MojoExecutionException("Error processing mvel template. Reason: " + e, e);
        }
    }

    private boolean updateConnectorsTable(File file, String changed) throws MojoExecutionException {
        try {
            if (!file.exists()) {
                // include markers for new files
                changed = "// kafka-connectors list: START\n" + changed + "\n// kafka-connectors list: END\n";
                writeText(file, changed);
                return true;
            }

            String text = loadText(new FileInputStream(file));

            String existing = Strings.between(text, "// kafka-connectors list: START", "// kafka-connectors list: END");
            if (existing != null) {
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    return false;
                } else {
                    String before = Strings.before(text, "// kafka-connectors list: START");
                    String after = Strings.after(text, "// kafka-connectors list: END");
                    text = before + "// kafka-connectors list: START\n" + changed + "\n// kafka-connectors list: END" + after;
                    writeText(file, text);
                    return true;
                }
            } else {
                getLog().warn("Cannot find markers in file " + file);
                getLog().warn("Add the following markers");
                getLog().warn("\t// kafka-connectors list: START");
                getLog().warn("\t// kafka-connectors list: END");
                return false;
            }
        } catch (Exception e) {
            throw new MojoExecutionException("Error reading file " + file + " Reason: " + e, e);
        }
    }

    private boolean updateNav(File file, CamelKafkaConnectorTableModel model) throws MojoExecutionException {
        String changed = null;
        try {
            String template = loadText(UpdateDocComponentsListMojo.class.getClassLoader().getResourceAsStream("nav.mvel"));
            changed = (String)TemplateRuntime.eval(template, model, Collections.singletonMap("util", MvelHelper.INSTANCE));
        } catch (Exception e) {
            throw new MojoExecutionException("Error processing mvel template. Reason: " + e, e);
        }

        try {
            String text = loadText(file);

            String existing = Strings.between(text, "// connectors: START", "// connectors: END");
            if (existing != null) {
                // remove leading line breaks etc
                existing = existing.trim();
                changed = changed.trim();
                if (existing.equals(changed)) {
                    return false;
                } else {
                    String before = Strings.before(text, "// connectors: START");
                    String after = Strings.after(text, "// connectors: END");
                    text = before + "// connectors: START\n" + changed + "\n// connectors: END" + after;
                    writeText(file, text);
                    return true;
                }
            } else {
                getLog().warn("Cannot find markers in file " + file);
                getLog().warn("Add the following markers");
                getLog().warn("\t// connectors: START");
                getLog().warn("\t// connectors: END");
                return false;
            }
        } catch (Exception e) {
            throw new MojoExecutionException("Error reading file " + file + " Reason: " + e, e);
        }
    }
}
