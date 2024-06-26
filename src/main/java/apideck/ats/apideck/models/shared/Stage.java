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
import org.openapitools.jackson.nullable.JsonNullable;


public class Stage {

    /**
     * Stage the candidate should be in. If omitted, the default stage for this job will be used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<? extends String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<? extends String> name;

    public Stage(
            @JsonProperty("id") JsonNullable<? extends String> id,
            @JsonProperty("name") JsonNullable<? extends String> name) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        this.id = id;
        this.name = name;
    }

    /**
     * Stage the candidate should be in. If omitted, the default stage for this job will be used.
     */
    public JsonNullable<? extends String> id() {
        return id;
    }

    public JsonNullable<? extends String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Stage the candidate should be in. If omitted, the default stage for this job will be used.
     */
    public Stage withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Stage the candidate should be in. If omitted, the default stage for this job will be used.
     */
    public Stage withId(JsonNullable<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Stage withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    public Stage withName(JsonNullable<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        Stage other = (Stage) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Stage.class,
                "id", id,
                "name", name);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> id = JsonNullable.undefined();
 
        private JsonNullable<? extends String> name = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Stage the candidate should be in. If omitted, the default stage for this job will be used.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Stage the candidate should be in. If omitted, the default stage for this job will be used.
         */
        public Builder id(JsonNullable<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        public Builder name(JsonNullable<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public Stage build() {
            return new Stage(
                id,
                name);
        }
    }
}

