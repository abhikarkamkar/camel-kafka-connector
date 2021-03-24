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
package org.apache.camel.kafkaconnector.infinispanembedded;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelInfinispanembeddedSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_INFINISPANEMBEDDED_PATH_CACHE_NAME_CONF = "camel.sink.path.cacheName";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_PATH_CACHE_NAME_DOC = "The name of the cache to use. Use current to use the existing cache name from the currently configured cached manager. Or use default for the default cache manager name.";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_PATH_CACHE_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_CONF = "camel.sink.endpoint.queryBuilder";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_DOC = "Specifies the query builder.";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_DEFAULT_VALUE_CONF = "camel.sink.endpoint.defaultValue";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_DEFAULT_VALUE_DOC = "Set a specific default value for some producer operations";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_DEFAULT_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_KEY_CONF = "camel.sink.endpoint.key";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_KEY_DOC = "Set a specific key for producer operations";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OLD_VALUE_CONF = "camel.sink.endpoint.oldValue";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OLD_VALUE_DOC = "Set a specific old value for some producer operations";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OLD_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OPERATION_DOC = "The operation to perform One of: [PUT] [PUTASYNC] [PUTALL] [PUTALLASYNC] [PUTIFABSENT] [PUTIFABSENTASYNC] [GET] [GETORDEFAULT] [CONTAINSKEY] [CONTAINSVALUE] [REMOVE] [REMOVEASYNC] [REPLACE] [REPLACEASYNC] [SIZE] [CLEAR] [CLEARASYNC] [QUERY] [STATS] [COMPUTE] [COMPUTEASYNC]";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OPERATION_DEFAULT = "PUT";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_VALUE_CONF = "camel.sink.endpoint.value";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_VALUE_DOC = "Set a specific value for producer operations";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONF = "camel.sink.endpoint.cacheContainer";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_DOC = "Specifies the cache Container to connect";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_CONF = "camel.sink.endpoint.cacheContainerConfiguration";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_DOC = "The CacheContainer configuration. Used if the cacheContainer is not defined.";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_CONF = "camel.sink.endpoint.configurationUri";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_DOC = "An implementation specific URI for the CacheManager";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_FLAGS_CONF = "camel.sink.endpoint.flags";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_FLAGS_DOC = "A comma separated list of org.infinispan.context.Flag to be applied by default on each cache invocation";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_FLAGS_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_CONF = "camel.sink.endpoint.remappingFunction";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_DOC = "Set a specific remappingFunction to use in a compute operation.";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_CONF = "camel.sink.endpoint.resultHeader";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_DOC = "Store the operation result in a header instead of the message body. By default, resultHeader == null and the query result is stored in the message body, any existing content in the message body is discarded. If resultHeader is set, the value is used as the name of the header to store the query result and the original message body is preserved. This value can be overridden by an in message header named: CamelInfinispanOperationResultHeader";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_CONF = "camel.component.infinispan-embedded.configuration";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_DOC = "Component configuration";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_CONF = "camel.component.infinispan-embedded.queryBuilder";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_DOC = "Specifies the query builder.";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_DEFAULT_VALUE_CONF = "camel.component.infinispan-embedded.defaultValue";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_DEFAULT_VALUE_DOC = "Set a specific default value for some producer operations";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_DEFAULT_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_KEY_CONF = "camel.component.infinispan-embedded.key";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_KEY_DOC = "Set a specific key for producer operations";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.infinispan-embedded.lazyStartProducer";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OLD_VALUE_CONF = "camel.component.infinispan-embedded.oldValue";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OLD_VALUE_DOC = "Set a specific old value for some producer operations";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OLD_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OPERATION_CONF = "camel.component.infinispan-embedded.operation";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OPERATION_DOC = "The operation to perform One of: [PUT] [PUTASYNC] [PUTALL] [PUTALLASYNC] [PUTIFABSENT] [PUTIFABSENTASYNC] [GET] [GETORDEFAULT] [CONTAINSKEY] [CONTAINSVALUE] [REMOVE] [REMOVEASYNC] [REPLACE] [REPLACEASYNC] [SIZE] [CLEAR] [CLEARASYNC] [QUERY] [STATS] [COMPUTE] [COMPUTEASYNC]";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OPERATION_DEFAULT = "PUT";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_VALUE_CONF = "camel.component.infinispan-embedded.value";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_VALUE_DOC = "Set a specific value for producer operations";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_VALUE_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.infinispan-embedded.autowiredEnabled";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONF = "camel.component.infinispan-embedded.cacheContainer";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_DOC = "Specifies the cache Container to connect";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_CONF = "camel.component.infinispan-embedded.cacheContainerConfiguration";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_DOC = "The CacheContainer configuration. Used if the cacheContainer is not defined.";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_CONF = "camel.component.infinispan-embedded.configurationUri";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_DOC = "An implementation specific URI for the CacheManager";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_FLAGS_CONF = "camel.component.infinispan-embedded.flags";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_FLAGS_DOC = "A comma separated list of org.infinispan.context.Flag to be applied by default on each cache invocation";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_FLAGS_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_CONF = "camel.component.infinispan-embedded.remappingFunction";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_DOC = "Set a specific remappingFunction to use in a compute operation.";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_DEFAULT = null;
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_CONF = "camel.component.infinispan-embedded.resultHeader";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_DOC = "Store the operation result in a header instead of the message body. By default, resultHeader == null and the query result is stored in the message body, any existing content in the message body is discarded. If resultHeader is set, the value is used as the name of the header to store the query result and the original message body is preserved. This value can be overridden by an in message header named: CamelInfinispanOperationResultHeader";
    public static final String CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_DEFAULT = null;

    public CamelInfinispanembeddedSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelInfinispanembeddedSinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_PATH_CACHE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_PATH_CACHE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_INFINISPANEMBEDDED_PATH_CACHE_NAME_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_QUERY_BUILDER_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_DEFAULT_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_DEFAULT_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_DEFAULT_VALUE_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_KEY_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OLD_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OLD_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OLD_VALUE_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_VALUE_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CACHE_CONTAINER_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_FLAGS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_FLAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_FLAGS_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_REMAPPING_FUNCTION_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_ENDPOINT_RESULT_HEADER_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_QUERY_BUILDER_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_DEFAULT_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_DEFAULT_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_DEFAULT_VALUE_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_KEY_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OLD_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OLD_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OLD_VALUE_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_VALUE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_VALUE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_VALUE_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CACHE_CONTAINER_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_FLAGS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_FLAGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_FLAGS_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_REMAPPING_FUNCTION_DOC);
        conf.define(CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_INFINISPANEMBEDDED_COMPONENT_RESULT_HEADER_DOC);
        return conf;
    }
}