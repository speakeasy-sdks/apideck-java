/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import apideck.ats.apideck.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class CustomField {

    /**
     * More information about the custom field
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<? extends String> description;

    /**
     * Unique identifier for the custom field.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("id")
    private Optional<? extends String> id;

    /**
     * Name of the custom field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private JsonNullable<? extends Value> value;

    public CustomField(
            @JsonProperty("description") JsonNullable<? extends String> description,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("name") JsonNullable<? extends String> name,
            @JsonProperty("value") JsonNullable<? extends Value> value) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(value, "value");
        this.description = description;
        this.id = id;
        this.name = name;
        this.value = value;
    }

    /**
     * More information about the custom field
     */
    public JsonNullable<? extends String> description() {
        return description;
    }

    /**
     * Unique identifier for the custom field.
     */
    public Optional<? extends String> id() {
        return id;
    }

    /**
     * Name of the custom field.
     */
    public JsonNullable<? extends String> name() {
        return name;
    }

    public JsonNullable<? extends Value> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * More information about the custom field
     */
    public CustomField withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * More information about the custom field
     */
    public CustomField withDescription(JsonNullable<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * Unique identifier for the custom field.
     */
    public CustomField withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Unique identifier for the custom field.
     */
    public CustomField withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Name of the custom field.
     */
    public CustomField withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the custom field.
     */
    public CustomField withName(JsonNullable<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CustomField withValue(Value value) {
        Utils.checkNotNull(value, "value");
        this.value = JsonNullable.of(value);
        return this;
    }

    public CustomField withValue(JsonNullable<? extends Value> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomField other = (CustomField) o;
        return 
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            description,
            id,
            name,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomField.class,
                "description", description,
                "id", id,
                "name", name,
                "value", value);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> description = JsonNullable.undefined();
 
        private Optional<? extends String> id = Optional.empty();
 
        private JsonNullable<? extends String> name = JsonNullable.undefined();
 
        private JsonNullable<? extends Value> value = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * More information about the custom field
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * More information about the custom field
         */
        public Builder description(JsonNullable<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * Unique identifier for the custom field.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * Unique identifier for the custom field.
         */
        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Name of the custom field.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * Name of the custom field.
         */
        public Builder name(JsonNullable<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder value(Value value) {
            Utils.checkNotNull(value, "value");
            this.value = JsonNullable.of(value);
            return this;
        }

        public Builder value(JsonNullable<? extends Value> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public CustomField build() {
            return new CustomField(
                description,
                id,
                name,
                value);
        }
    }
}

