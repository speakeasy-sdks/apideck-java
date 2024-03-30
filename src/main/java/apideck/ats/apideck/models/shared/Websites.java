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


public class Websites {

    /**
     * Unique identifier for the website
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<? extends String> id;

    /**
     * The type of website
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private JsonNullable<? extends ApplicantType> type;

    /**
     * The website URL
     */
    @JsonProperty("url")
    private String url;

    public Websites(
            @JsonProperty("id") JsonNullable<? extends String> id,
            @JsonProperty("type") JsonNullable<? extends ApplicantType> type,
            @JsonProperty("url") String url) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(url, "url");
        this.id = id;
        this.type = type;
        this.url = url;
    }

    /**
     * Unique identifier for the website
     */
    public JsonNullable<? extends String> id() {
        return id;
    }

    /**
     * The type of website
     */
    public JsonNullable<? extends ApplicantType> type() {
        return type;
    }

    /**
     * The website URL
     */
    public String url() {
        return url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for the website
     */
    public Websites withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Unique identifier for the website
     */
    public Websites withId(JsonNullable<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * The type of website
     */
    public Websites withType(ApplicantType type) {
        Utils.checkNotNull(type, "type");
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The type of website
     */
    public Websites withType(JsonNullable<? extends ApplicantType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The website URL
     */
    public Websites withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
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
        Websites other = (Websites) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            type,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Websites.class,
                "id", id,
                "type", type,
                "url", url);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> id = JsonNullable.undefined();
 
        private JsonNullable<? extends ApplicantType> type = JsonNullable.undefined();
 
        private String url;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for the website
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Unique identifier for the website
         */
        public Builder id(JsonNullable<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * The type of website
         */
        public Builder type(ApplicantType type) {
            Utils.checkNotNull(type, "type");
            this.type = JsonNullable.of(type);
            return this;
        }

        /**
         * The type of website
         */
        public Builder type(JsonNullable<? extends ApplicantType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The website URL
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public Websites build() {
            return new Websites(
                id,
                type,
                url);
        }
    }
}

