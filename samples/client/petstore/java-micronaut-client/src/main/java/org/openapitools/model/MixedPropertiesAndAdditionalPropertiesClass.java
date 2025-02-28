/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.openapitools.model.Animal;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * MixedPropertiesAndAdditionalPropertiesClass
 */
@JsonPropertyOrder({
  MixedPropertiesAndAdditionalPropertiesClass.JSON_PROPERTY_UUID,
  MixedPropertiesAndAdditionalPropertiesClass.JSON_PROPERTY_DATE_TIME,
  MixedPropertiesAndAdditionalPropertiesClass.JSON_PROPERTY_MAP
})
@JsonTypeName("MixedPropertiesAndAdditionalPropertiesClass")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
@Introspected
public class MixedPropertiesAndAdditionalPropertiesClass {
    public static final String JSON_PROPERTY_UUID = "uuid";
    private UUID uuid;

    public static final String JSON_PROPERTY_DATE_TIME = "dateTime";
    private OffsetDateTime dateTime;

    public static final String JSON_PROPERTY_MAP = "map";
    private Map<String, Animal> map = null;

    public MixedPropertiesAndAdditionalPropertiesClass() {
    }
    public MixedPropertiesAndAdditionalPropertiesClass uuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Get uuid
     * @return uuid
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_UUID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getUuid() {
        return uuid;
    }

    @JsonProperty(JSON_PROPERTY_UUID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public MixedPropertiesAndAdditionalPropertiesClass dateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get dateTime
     * @return dateTime
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    @JsonProperty(JSON_PROPERTY_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public MixedPropertiesAndAdditionalPropertiesClass map(Map<String, Animal> map) {
        this.map = map;
        return this;
    }

    public MixedPropertiesAndAdditionalPropertiesClass putMapItem(String key, Animal mapItem) {
        if (this.map == null) {
            this.map = new HashMap<>();
        }
        this.map.put(key, mapItem);
        return this;
  }

    /**
     * Get map
     * @return map
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_MAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, Animal> getMap() {
        return map;
    }

    @JsonProperty(JSON_PROPERTY_MAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMap(Map<String, Animal> map) {
        this.map = map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MixedPropertiesAndAdditionalPropertiesClass mixedPropertiesAndAdditionalPropertiesClass = (MixedPropertiesAndAdditionalPropertiesClass) o;
        return Objects.equals(this.uuid, mixedPropertiesAndAdditionalPropertiesClass.uuid) &&
            Objects.equals(this.dateTime, mixedPropertiesAndAdditionalPropertiesClass.dateTime) &&
            Objects.equals(this.map, mixedPropertiesAndAdditionalPropertiesClass.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, dateTime, map);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
        sb.append("    map: ").append(toIndentedString(map)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

