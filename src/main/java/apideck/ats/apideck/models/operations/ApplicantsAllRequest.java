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


public class ApplicantsAllRequest {

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private JsonNullable<? extends String> cursor;

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private JsonNullable<? extends String> fields;

    /**
     * Apply filters
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=filter")
    private Optional<? extends apideck.ats.apideck.models.shared.ApplicantsFilter> filter;

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Long> limit;

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=pass_through")
    private Optional<? extends java.util.Map<String, java.lang.Object>> passThrough;

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

    public ApplicantsAllRequest(
            JsonNullable<? extends String> cursor,
            JsonNullable<? extends String> fields,
            Optional<? extends apideck.ats.apideck.models.shared.ApplicantsFilter> filter,
            Optional<? extends Long> limit,
            Optional<? extends java.util.Map<String, java.lang.Object>> passThrough,
            Optional<? extends Boolean> raw,
            Optional<? extends String> xApideckAppId,
            Optional<? extends String> xApideckConsumerId,
            Optional<? extends String> xApideckServiceId) {
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(passThrough, "passThrough");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
        this.cursor = cursor;
        this.fields = fields;
        this.filter = filter;
        this.limit = limit;
        this.passThrough = passThrough;
        this.raw = raw;
        this.xApideckAppId = xApideckAppId;
        this.xApideckConsumerId = xApideckConsumerId;
        this.xApideckServiceId = xApideckServiceId;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public JsonNullable<? extends String> cursor() {
        return cursor;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public JsonNullable<? extends String> fields() {
        return fields;
    }

    /**
     * Apply filters
     */
    public Optional<? extends apideck.ats.apideck.models.shared.ApplicantsFilter> filter() {
        return filter;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public Optional<? extends Long> limit() {
        return limit;
    }

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    public Optional<? extends java.util.Map<String, java.lang.Object>> passThrough() {
        return passThrough;
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
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public ApplicantsAllRequest withCursor(String cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = JsonNullable.of(cursor);
        return this;
    }

    /**
     * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     */
    public ApplicantsAllRequest withCursor(JsonNullable<? extends String> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public ApplicantsAllRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = JsonNullable.of(fields);
        return this;
    }

    /**
     * The 'fields' parameter allows API users to specify the fields they want to include in the API response. If this parameter is not present, the API will return all available fields. If this parameter is present, only the fields specified in the comma-separated string will be included in the response. Nested properties can also be requested by using a dot notation. &lt;br /&gt;&lt;br /&gt;Example: `fields=name,email,addresses.city`&lt;br /&gt;&lt;br /&gt;In the example above, the response will only include the fields "name", "email" and "addresses.city". If any other fields are available, they will be excluded.
     */
    public ApplicantsAllRequest withFields(JsonNullable<? extends String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Apply filters
     */
    public ApplicantsAllRequest withFilter(apideck.ats.apideck.models.shared.ApplicantsFilter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * Apply filters
     */
    public ApplicantsAllRequest withFilter(Optional<? extends apideck.ats.apideck.models.shared.ApplicantsFilter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public ApplicantsAllRequest withLimit(long limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Number of results to return. Minimum 1, Maximum 200, Default 20
     */
    public ApplicantsAllRequest withLimit(Optional<? extends Long> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    public ApplicantsAllRequest withPassThrough(java.util.Map<String, java.lang.Object> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }

    /**
     * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
     */
    public ApplicantsAllRequest withPassThrough(Optional<? extends java.util.Map<String, java.lang.Object>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public ApplicantsAllRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public ApplicantsAllRequest withRaw(Optional<? extends Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public ApplicantsAllRequest withXApideckAppId(String xApideckAppId) {
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        this.xApideckAppId = Optional.ofNullable(xApideckAppId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public ApplicantsAllRequest withXApideckAppId(Optional<? extends String> xApideckAppId) {
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        this.xApideckAppId = xApideckAppId;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public ApplicantsAllRequest withXApideckConsumerId(String xApideckConsumerId) {
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        this.xApideckConsumerId = Optional.ofNullable(xApideckConsumerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public ApplicantsAllRequest withXApideckConsumerId(Optional<? extends String> xApideckConsumerId) {
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        this.xApideckConsumerId = xApideckConsumerId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public ApplicantsAllRequest withXApideckServiceId(String xApideckServiceId) {
        Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
        this.xApideckServiceId = Optional.ofNullable(xApideckServiceId);
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public ApplicantsAllRequest withXApideckServiceId(Optional<? extends String> xApideckServiceId) {
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
        ApplicantsAllRequest other = (ApplicantsAllRequest) o;
        return 
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.fields, other.fields) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.passThrough, other.passThrough) &&
            java.util.Objects.deepEquals(this.raw, other.raw) &&
            java.util.Objects.deepEquals(this.xApideckAppId, other.xApideckAppId) &&
            java.util.Objects.deepEquals(this.xApideckConsumerId, other.xApideckConsumerId) &&
            java.util.Objects.deepEquals(this.xApideckServiceId, other.xApideckServiceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            cursor,
            fields,
            filter,
            limit,
            passThrough,
            raw,
            xApideckAppId,
            xApideckConsumerId,
            xApideckServiceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplicantsAllRequest.class,
                "cursor", cursor,
                "fields", fields,
                "filter", filter,
                "limit", limit,
                "passThrough", passThrough,
                "raw", raw,
                "xApideckAppId", xApideckAppId,
                "xApideckConsumerId", xApideckConsumerId,
                "xApideckServiceId", xApideckServiceId);
    }
    
    public final static class Builder {
 
        private JsonNullable<? extends String> cursor = JsonNullable.undefined();
 
        private JsonNullable<? extends String> fields = JsonNullable.undefined();
 
        private Optional<? extends apideck.ats.apideck.models.shared.ApplicantsFilter> filter = Optional.empty();
 
        private Optional<? extends Long> limit;
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> passThrough = Optional.empty();
 
        private Optional<? extends Boolean> raw;
 
        private Optional<? extends String> xApideckAppId = Optional.empty();
 
        private Optional<? extends String> xApideckConsumerId = Optional.empty();
 
        private Optional<? extends String> xApideckServiceId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
         */
        public Builder cursor(String cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = JsonNullable.of(cursor);
            return this;
        }

        /**
         * Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
         */
        public Builder cursor(JsonNullable<? extends String> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
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
         * Apply filters
         */
        public Builder filter(apideck.ats.apideck.models.shared.ApplicantsFilter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * Apply filters
         */
        public Builder filter(Optional<? extends apideck.ats.apideck.models.shared.ApplicantsFilter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * Number of results to return. Minimum 1, Maximum 200, Default 20
         */
        public Builder limit(long limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Number of results to return. Minimum 1, Maximum 200, Default 20
         */
        public Builder limit(Optional<? extends Long> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        /**
         * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
         */
        public Builder passThrough(java.util.Map<String, java.lang.Object> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = Optional.ofNullable(passThrough);
            return this;
        }

        /**
         * Optional unmapped key/values that will be passed through to downstream as query parameters. Ie: ?pass_through[search]=leads becomes ?search=leads
         */
        public Builder passThrough(Optional<? extends java.util.Map<String, java.lang.Object>> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = passThrough;
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
        
        public ApplicantsAllRequest build() {
            if (limit == null) {
                limit = _SINGLETON_VALUE_Limit.value();
            }
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }
            return new ApplicantsAllRequest(
                cursor,
                fields,
                filter,
                limit,
                passThrough,
                raw,
                xApideckAppId,
                xApideckConsumerId,
                xApideckServiceId);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Limit =
                new LazySingletonValue<>(
                        "limit",
                        "20",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Boolean>> _SINGLETON_VALUE_Raw =
                new LazySingletonValue<>(
                        "raw",
                        "false",
                        new TypeReference<Optional<? extends Boolean>>() {});
    }
}
