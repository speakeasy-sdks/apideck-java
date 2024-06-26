/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.operations;

import apideck.ats.apideck.utils.LazySingletonValue;
import apideck.ats.apideck.utils.SpeakeasyMetadata;
import apideck.ats.apideck.utils.Utils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class JobsOneRequest {

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private JsonNullable<? extends String> fields;

    /**
     * ID of the record you are acting upon.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    private Optional<? extends Boolean> raw;

    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    private Optional<? extends String> xApideckAppId;

    /**
     * ID of the consumer which you want to get or push data from
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-consumer-id")
    private Optional<? extends String> xApideckConsumerId;

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-service-id")
    private Optional<? extends String> xApideckServiceId;

    public JobsOneRequest(
            JsonNullable<? extends String> fields,
            String id,
            Optional<? extends Boolean> raw,
            Optional<? extends String> xApideckAppId,
            Optional<? extends String> xApideckConsumerId,
            Optional<? extends String> xApideckServiceId) {
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
        this.fields = fields;
        this.id = id;
        this.raw = raw;
        this.xApideckAppId = xApideckAppId;
        this.xApideckConsumerId = xApideckConsumerId;
        this.xApideckServiceId = xApideckServiceId;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public JsonNullable<? extends String> fields() {
        return fields;
    }

    /**
     * ID of the record you are acting upon.
     */
    public String id() {
        return id;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public Optional<? extends Boolean> raw() {
        return raw;
    }

    /**
     * The ID of your Unify application
     */
    public Optional<? extends String> xApideckAppId() {
        return xApideckAppId;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public Optional<? extends String> xApideckConsumerId() {
        return xApideckConsumerId;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public Optional<? extends String> xApideckServiceId() {
        return xApideckServiceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public JobsOneRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public JobsOneRequest withFields(JsonNullable<? extends String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * ID of the record you are acting upon.
     */
    public JobsOneRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public JobsOneRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public JobsOneRequest withRaw(Optional<? extends Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public JobsOneRequest withXApideckAppId(String xApideckAppId) {
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        this.xApideckAppId = Optional.ofNullable(xApideckAppId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public JobsOneRequest withXApideckAppId(Optional<? extends String> xApideckAppId) {
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        this.xApideckAppId = xApideckAppId;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public JobsOneRequest withXApideckConsumerId(String xApideckConsumerId) {
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        this.xApideckConsumerId = Optional.ofNullable(xApideckConsumerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public JobsOneRequest withXApideckConsumerId(Optional<? extends String> xApideckConsumerId) {
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        this.xApideckConsumerId = xApideckConsumerId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public JobsOneRequest withXApideckServiceId(String xApideckServiceId) {
        Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
        this.xApideckServiceId = Optional.ofNullable(xApideckServiceId);
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public JobsOneRequest withXApideckServiceId(Optional<? extends String> xApideckServiceId) {
        Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
        this.xApideckServiceId = xApideckServiceId;
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
        JobsOneRequest other = (JobsOneRequest) o;
        return 
            java.util.Objects.deepEquals(this.fields, other.fields) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.raw, other.raw) &&
            java.util.Objects.deepEquals(this.xApideckAppId, other.xApideckAppId) &&
            java.util.Objects.deepEquals(this.xApideckConsumerId, other.xApideckConsumerId) &&
            java.util.Objects.deepEquals(this.xApideckServiceId, other.xApideckServiceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            fields,
            id,
            raw,
            xApideckAppId,
            xApideckConsumerId,
            xApideckServiceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(JobsOneRequest.class,
                "fields", fields,
                "id", id,
                "raw", raw,
                "xApideckAppId", xApideckAppId,
                "xApideckConsumerId", xApideckConsumerId,
                "xApideckServiceId", xApideckServiceId);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> fields = JsonNullable.undefined();
 
        private String id;
 
        private Optional<? extends Boolean> raw;
 
        private Optional<? extends String> xApideckAppId = Optional.empty();
 
        private Optional<? extends String> xApideckConsumerId = Optional.empty();
 
        private Optional<? extends String> xApideckServiceId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
         */
        public Builder fields(String fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = JsonNullable.of(fields);
            return this;
        }

        /**
         * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
         */
        public Builder fields(JsonNullable<? extends String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }

        /**
         * ID of the record you are acting upon.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * Include raw response. Mostly used for debugging purposes
         */
        public Builder raw(boolean raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = Optional.ofNullable(raw);
            return this;
        }

        /**
         * Include raw response. Mostly used for debugging purposes
         */
        public Builder raw(Optional<? extends Boolean> raw) {
            Utils.checkNotNull(raw, "raw");
            this.raw = raw;
            return this;
        }

        /**
         * The ID of your Unify application
         */
        public Builder xApideckAppId(String xApideckAppId) {
            Utils.checkNotNull(xApideckAppId, "xApideckAppId");
            this.xApideckAppId = Optional.ofNullable(xApideckAppId);
            return this;
        }

        /**
         * The ID of your Unify application
         */
        public Builder xApideckAppId(Optional<? extends String> xApideckAppId) {
            Utils.checkNotNull(xApideckAppId, "xApideckAppId");
            this.xApideckAppId = xApideckAppId;
            return this;
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder xApideckConsumerId(String xApideckConsumerId) {
            Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
            this.xApideckConsumerId = Optional.ofNullable(xApideckConsumerId);
            return this;
        }

        /**
         * ID of the consumer which you want to get or push data from
         */
        public Builder xApideckConsumerId(Optional<? extends String> xApideckConsumerId) {
            Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
            this.xApideckConsumerId = xApideckConsumerId;
            return this;
        }

        /**
         * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
         */
        public Builder xApideckServiceId(String xApideckServiceId) {
            Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
            this.xApideckServiceId = Optional.ofNullable(xApideckServiceId);
            return this;
        }

        /**
         * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
         */
        public Builder xApideckServiceId(Optional<? extends String> xApideckServiceId) {
            Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
            this.xApideckServiceId = xApideckServiceId;
            return this;
        }
        
        public JobsOneRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }
            return new JobsOneRequest(
                fields,
                id,
                raw,
                xApideckAppId,
                xApideckConsumerId,
                xApideckServiceId);
        }

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}

