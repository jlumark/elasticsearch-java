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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.indices.IndicesRecord;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.indices.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#cat.indices.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndicesResponse implements JsonpSerializable {
	private final List<IndicesRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	private IndicesResponse(Builder builder) {

		this.valueBody = ApiTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static IndicesResponse of(Function<Builder, ObjectBuilder<IndicesResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 */
	public final List<IndicesRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (IndicesRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<IndicesResponse> {
		private List<IndicesRecord> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * Adds all elements of <code>list</code> to <code>valueBody</code>.
		 */
		public final Builder valueBody(List<IndicesRecord> list) {
			this.valueBody = _listAddAll(this.valueBody, list);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds one or more values to <code>valueBody</code>.
		 */
		public final Builder valueBody(IndicesRecord value, IndicesRecord... values) {
			this.valueBody = _listAdd(this.valueBody, value, values);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * Adds a value to <code>valueBody</code> using a builder lambda.
		 */
		public final Builder valueBody(Function<IndicesRecord.Builder, ObjectBuilder<IndicesRecord>> fn) {
			return valueBody(fn.apply(new IndicesRecord.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			List<IndicesRecord> value = (List<IndicesRecord>) JsonpDeserializer
					.arrayDeserializer(IndicesRecord._DESERIALIZER).deserialize(parser, mapper);
			return this.valueBody(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndicesResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesResponse build() {
			_checkSingleUse();

			return new IndicesResponse(this);
		}
	}

	public static final JsonpDeserializer<IndicesResponse> _DESERIALIZER = createIndicesResponseDeserializer();
	protected static JsonpDeserializer<IndicesResponse> createIndicesResponseDeserializer() {

		JsonpDeserializer<List<IndicesRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(IndicesRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
