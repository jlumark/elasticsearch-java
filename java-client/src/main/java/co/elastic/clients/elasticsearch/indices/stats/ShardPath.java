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

package co.elastic.clients.elasticsearch.indices.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardPath
@JsonpDeserializable
public final class ShardPath implements JsonpSerializable {
	private final String dataPath;

	private final boolean isCustomDataPath;

	private final String statePath;

	// ---------------------------------------------------------------------------------------------

	public ShardPath(Builder builder) {

		this.dataPath = Objects.requireNonNull(builder.dataPath, "data_path");
		this.isCustomDataPath = Objects.requireNonNull(builder.isCustomDataPath, "is_custom_data_path");
		this.statePath = Objects.requireNonNull(builder.statePath, "state_path");

	}

	public ShardPath(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code data_path}
	 */
	public String dataPath() {
		return this.dataPath;
	}

	/**
	 * API name: {@code is_custom_data_path}
	 */
	public boolean isCustomDataPath() {
		return this.isCustomDataPath;
	}

	/**
	 * API name: {@code state_path}
	 */
	public String statePath() {
		return this.statePath;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("data_path");
		generator.write(this.dataPath);

		generator.writeKey("is_custom_data_path");
		generator.write(this.isCustomDataPath);

		generator.writeKey("state_path");
		generator.write(this.statePath);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardPath}.
	 */
	public static class Builder implements ObjectBuilder<ShardPath> {
		private String dataPath;

		private Boolean isCustomDataPath;

		private String statePath;

		/**
		 * API name: {@code data_path}
		 */
		public Builder dataPath(String value) {
			this.dataPath = value;
			return this;
		}

		/**
		 * API name: {@code is_custom_data_path}
		 */
		public Builder isCustomDataPath(boolean value) {
			this.isCustomDataPath = value;
			return this;
		}

		/**
		 * API name: {@code state_path}
		 */
		public Builder statePath(String value) {
			this.statePath = value;
			return this;
		}

		/**
		 * Builds a {@link ShardPath}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardPath build() {

			return new ShardPath(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardPath}
	 */
	public static final JsonpDeserializer<ShardPath> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardPath::setupShardPathDeserializer, Builder::build);

	protected static void setupShardPathDeserializer(DelegatingDeserializer<ShardPath.Builder> op) {

		op.add(Builder::dataPath, JsonpDeserializer.stringDeserializer(), "data_path");
		op.add(Builder::isCustomDataPath, JsonpDeserializer.booleanDeserializer(), "is_custom_data_path");
		op.add(Builder::statePath, JsonpDeserializer.stringDeserializer(), "state_path");

	}

}
