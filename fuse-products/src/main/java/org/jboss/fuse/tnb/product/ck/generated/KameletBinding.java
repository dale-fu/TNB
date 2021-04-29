/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
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

package org.jboss.fuse.tnb.product.ck.generated;

import org.jboss.fuse.tnb.product.ck.utils.CamelKSettings;
import org.jboss.fuse.tnb.product.ck.utils.CamelKSupport;
import org.jboss.fuse.tnb.product.ck.utils.KubernetesSupport;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;

/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Group(CamelKSupport.CAMELK_CRD_GROUP)
@Version(CamelKSettings.KAMELET_API_VERSION_DEFAULT)
public class KameletBinding extends CustomResource<KameletBindingSpec, KameletBindingStatus> {

    public KameletBinding() {
        super();
        this.status = null;
        this.spec = new KameletBindingSpec();
    }

    /**
     * Fluent builder
     */
    public static class Builder {
        private String name;
        private Integration integration;
        private KameletBindingSpec.Endpoint source;
        private KameletBindingSpec.Endpoint sink;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public Builder source(KameletBindingSpec.Endpoint source) {
            this.source = source;
            return this;
        }

        public Builder source(String uri) {
            return source(new KameletBindingSpec.Endpoint(uri));
        }

        public Builder source(KameletBindingSpec.Endpoint.ObjectReference ref, String properties) {
            Map<String, Object> props = null;
            if (properties != null && !properties.isEmpty()) {
                props = KubernetesSupport.yaml().load(properties);
            }

            return source(new KameletBindingSpec.Endpoint(ref, props));
        }

        public Builder sink(KameletBindingSpec.Endpoint sink) {
            this.sink = sink;
            return this;
        }

        public Builder sink(String uri) {
            return sink(new KameletBindingSpec.Endpoint(uri));
        }

        public Builder sink(KameletBindingSpec.Endpoint.ObjectReference ref, String properties) {
            Map<String, Object> props = null;
            if (properties != null && !properties.isEmpty()) {
                props = KubernetesSupport.yaml().load(properties);
            }

            return sink(new KameletBindingSpec.Endpoint(ref, props));
        }

        public KameletBinding build() {
            KameletBinding binding = new KameletBinding();
            binding.getMetadata().setName(name);

            if (integration != null) {
                binding.getSpec().setIntegration(integration);
            }

            if (source != null) {
                binding.getSpec().setSource(source);
            }

            if (sink != null) {
                binding.getSpec().setSink(sink);
            }

            return binding;
        }
    }
}