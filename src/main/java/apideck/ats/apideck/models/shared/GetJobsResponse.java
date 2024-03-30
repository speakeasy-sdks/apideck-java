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


public class GetJobsResponse {

    @JsonProperty("data")
    private java.util.List<Job> data;

    /**
     * Links to navigate to previous or next pages through the API
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("links")
    private Optional<? extends Links> links;

    /**
     * Response metadata
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends Meta> meta;

    /**
     * Operation performed
     */
    @JsonProperty("operation")
    private String operation;

    /**
     * Unified API resource name
     */
    @JsonProperty("resource")
    private String resource;

    /**
     * Apideck ID of service provider
     */
    @JsonProperty("service")
    private String service;

    /**
     * HTTP Response Status
     */
    @JsonProperty("status")
    private String status;

    /**
     * HTTP Response Status Code
     */
    @JsonProperty("status_code")
    private long statusCode;

    public GetJobsResponse(
            @JsonProperty("data") java.util.List<Job> data,
            @JsonProperty("links") Optional<? extends Links> links,
            @JsonProperty("meta") Optional<? extends Meta> meta,
            @JsonProperty("operation") String operation,
            @JsonProperty("resource") String resource,
            @JsonProperty("service") String service,
            @JsonProperty("status") String status,
            @JsonProperty("status_code") long statusCode) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(links, "links");
        Utils.checkNotNull(meta, "meta");
        Utils.checkNotNull(operation, "operation");
        Utils.checkNotNull(resource, "resource");
        Utils.checkNotNull(service, "service");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(statusCode, "statusCode");
        this.data = data;
        this.links = links;
        this.meta = meta;
        this.operation = operation;
        this.resource = resource;
        this.service = service;
        this.status = status;
        this.statusCode = statusCode;
    }

    public java.util.List<Job> data() {
        return data;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public Optional<? extends Links> links() {
        return links;
    }

    /**
     * Response metadata
     */
    public Optional<? extends Meta> meta() {
        return meta;
    }

    /**
     * Operation performed
     */
    public String operation() {
        return operation;
    }

    /**
     * Unified API resource name
     */
    public String resource() {
        return resource;
    }

    /**
     * Apideck ID of service provider
     */
    public String service() {
        return service;
    }

    /**
     * HTTP Response Status
     */
    public String status() {
        return status;
    }

    /**
     * HTTP Response Status Code
     */
    public long statusCode() {
        return statusCode;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetJobsResponse withData(java.util.List<Job> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetJobsResponse withLinks(Links links) {
        Utils.checkNotNull(links, "links");
        this.links = Optional.ofNullable(links);
        return this;
    }

    /**
     * Links to navigate to previous or next pages through the API
     */
    public GetJobsResponse withLinks(Optional<? extends Links> links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    /**
     * Response metadata
     */
    public GetJobsResponse withMeta(Meta meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    /**
     * Response metadata
     */
    public GetJobsResponse withMeta(Optional<? extends Meta> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }

    /**
     * Operation performed
     */
    public GetJobsResponse withOperation(String operation) {
        Utils.checkNotNull(operation, "operation");
        this.operation = operation;
        return this;
    }

    /**
     * Unified API resource name
     */
    public GetJobsResponse withResource(String resource) {
        Utils.checkNotNull(resource, "resource");
        this.resource = resource;
        return this;
    }

    /**
     * Apideck ID of service provider
     */
    public GetJobsResponse withService(String service) {
        Utils.checkNotNull(service, "service");
        this.service = service;
        return this;
    }

    /**
     * HTTP Response Status
     */
    public GetJobsResponse withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * HTTP Response Status Code
     */
    public GetJobsResponse withStatusCode(long statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
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
        GetJobsResponse other = (GetJobsResponse) o;
        return 
            java.util.Objects.deepEquals(this.data, other.data) &&
            java.util.Objects.deepEquals(this.links, other.links) &&
            java.util.Objects.deepEquals(this.meta, other.meta) &&
            java.util.Objects.deepEquals(this.operation, other.operation) &&
            java.util.Objects.deepEquals(this.resource, other.resource) &&
            java.util.Objects.deepEquals(this.service, other.service) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            data,
            links,
            meta,
            operation,
            resource,
            service,
            status,
            statusCode);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetJobsResponse.class,
                "data", data,
                "links", links,
                "meta", meta,
                "operation", operation,
                "resource", resource,
                "service", service,
                "status", status,
                "statusCode", statusCode);
    }
    
    public final static class Builder {
 
        private java.util.List<Job> data;
 
        private Optional<? extends Links> links = Optional.empty();
 
        private Optional<? extends Meta> meta = Optional.empty();
 
        private String operation;
 
        private String resource;
 
        private String service;
 
        private String status;
 
        private Long statusCode;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(java.util.List<Job> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        /**
         * Links to navigate to previous or next pages through the API
         */
        public Builder links(Links links) {
            Utils.checkNotNull(links, "links");
            this.links = Optional.ofNullable(links);
            return this;
        }

        /**
         * Links to navigate to previous or next pages through the API
         */
        public Builder links(Optional<? extends Links> links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        /**
         * Response metadata
         */
        public Builder meta(Meta meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        /**
         * Response metadata
         */
        public Builder meta(Optional<? extends Meta> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }

        /**
         * Operation performed
         */
        public Builder operation(String operation) {
            Utils.checkNotNull(operation, "operation");
            this.operation = operation;
            return this;
        }

        /**
         * Unified API resource name
         */
        public Builder resource(String resource) {
            Utils.checkNotNull(resource, "resource");
            this.resource = resource;
            return this;
        }

        /**
         * Apideck ID of service provider
         */
        public Builder service(String service) {
            Utils.checkNotNull(service, "service");
            this.service = service;
            return this;
        }

        /**
         * HTTP Response Status
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * HTTP Response Status Code
         */
        public Builder statusCode(long statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }
        
        public GetJobsResponse build() {
            return new GetJobsResponse(
                data,
                links,
                meta,
                operation,
                resource,
                service,
                status,
                statusCode);
        }
    }
}

