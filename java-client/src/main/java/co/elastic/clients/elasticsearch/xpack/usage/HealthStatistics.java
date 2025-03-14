/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.HealthStatistics

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.HealthStatistics">API
 *      specification</a>
 */
@JsonpDeserializable
public class HealthStatistics extends Base {
	private final Invocations invocations;

	// ---------------------------------------------------------------------------------------------

	private HealthStatistics(Builder builder) {
		super(builder);

		this.invocations = ApiTypeHelper.requireNonNull(builder.invocations, this, "invocations");

	}

	public static HealthStatistics of(Function<Builder, ObjectBuilder<HealthStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code invocations}
	 */
	public final Invocations invocations() {
		return this.invocations;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("invocations");
		this.invocations.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HealthStatistics}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<HealthStatistics> {
		private Invocations invocations;

		/**
		 * Required - API name: {@code invocations}
		 */
		public final Builder invocations(Invocations value) {
			this.invocations = value;
			return this;
		}

		/**
		 * Required - API name: {@code invocations}
		 */
		public final Builder invocations(Function<Invocations.Builder, ObjectBuilder<Invocations>> fn) {
			return this.invocations(fn.apply(new Invocations.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HealthStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HealthStatistics build() {
			_checkSingleUse();

			return new HealthStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HealthStatistics}
	 */
	public static final JsonpDeserializer<HealthStatistics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			HealthStatistics::setupHealthStatisticsDeserializer);

	protected static void setupHealthStatisticsDeserializer(ObjectDeserializer<HealthStatistics.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::invocations, Invocations._DESERIALIZER, "invocations");

	}

}
