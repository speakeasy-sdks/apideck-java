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


public class ApplicantsUpdateRequest {

    @SpeakeasyMetadata("request:mediaType=application/json")
    private apideck.ats.apideck.models.shared.ApplicantInput applicant;

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

    public ApplicantsUpdateRequest(
            apideck.ats.apideck.models.shared.ApplicantInput applicant,
            String id,
            Optional<? extends Boolean> raw,
            Optional<? extends String> xApideckAppId,
            Optional<? extends String> xApideckConsumerId,
            Optional<? extends String> xApideckServiceId) {
        Utils.checkNotNull(applicant, "applicant");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(raw, "raw");
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
        this.applicant = applicant;
        this.id = id;
        this.raw = raw;
        this.xApideckAppId = xApideckAppId;
        this.xApideckConsumerId = xApideckConsumerId;
        this.xApideckServiceId = xApideckServiceId;
    }

    public apideck.ats.apideck.models.shared.ApplicantInput applicant() {
        return applicant;
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

    public ApplicantsUpdateRequest withApplicant(apideck.ats.apideck.models.shared.ApplicantInput applicant) {
        Utils.checkNotNull(applicant, "applicant");
        this.applicant = applicant;
        return this;
    }

    /**
     * ID of the record you are acting upon.
     */
    public ApplicantsUpdateRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public ApplicantsUpdateRequest withRaw(boolean raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = Optional.ofNullable(raw);
        return this;
    }

    /**
     * Include raw response. Mostly used for debugging purposes
     */
    public ApplicantsUpdateRequest withRaw(Optional<? extends Boolean> raw) {
        Utils.checkNotNull(raw, "raw");
        this.raw = raw;
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public ApplicantsUpdateRequest withXApideckAppId(String xApideckAppId) {
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        this.xApideckAppId = Optional.ofNullable(xApideckAppId);
        return this;
    }

    /**
     * The ID of your Unify application
     */
    public ApplicantsUpdateRequest withXApideckAppId(Optional<? extends String> xApideckAppId) {
        Utils.checkNotNull(xApideckAppId, "xApideckAppId");
        this.xApideckAppId = xApideckAppId;
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public ApplicantsUpdateRequest withXApideckConsumerId(String xApideckConsumerId) {
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        this.xApideckConsumerId = Optional.ofNullable(xApideckConsumerId);
        return this;
    }

    /**
     * ID of the consumer which you want to get or push data from
     */
    public ApplicantsUpdateRequest withXApideckConsumerId(Optional<? extends String> xApideckConsumerId) {
        Utils.checkNotNull(xApideckConsumerId, "xApideckConsumerId");
        this.xApideckConsumerId = xApideckConsumerId;
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public ApplicantsUpdateRequest withXApideckServiceId(String xApideckServiceId) {
        Utils.checkNotNull(xApideckServiceId, "xApideckServiceId");
        this.xApideckServiceId = Optional.ofNullable(xApideckServiceId);
        return this;
    }

    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    public ApplicantsUpdateRequest withXApideckServiceId(Optional<? extends String> xApideckServiceId) {
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
        ApplicantsUpdateRequest other = (ApplicantsUpdateRequest) o;
        return 
            java.util.Objects.deepEquals(this.applicant, other.applicant) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.raw, other.raw) &&
            java.util.Objects.deepEquals(this.xApideckAppId, other.xApideckAppId) &&
            java.util.Objects.deepEquals(this.xApideckConsumerId, other.xApideckConsumerId) &&
            java.util.Objects.deepEquals(this.xApideckServiceId, other.xApideckServiceId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            applicant,
            id,
            raw,
            xApideckAppId,
            xApideckConsumerId,
            xApideckServiceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApplicantsUpdateRequest.class,
                "applicant", applicant,
                "id", id,
                "raw", raw,
                "xApideckAppId", xApideckAppId,
                "xApideckConsumerId", xApideckConsumerId,
                "xApideckServiceId", xApideckServiceId);
    }
    
    public final static class Builder {
 
        private apideck.ats.apideck.models.shared.ApplicantInput applicant;
 
        private String id;
 
        private Optional<? extends Boolean> raw;
 
        private Optional<? extends String> xApideckAppId = Optional.empty();
 
        private Optional<? extends String> xApideckConsumerId = Optional.empty();
 
        private Optional<? extends String> xApideckServiceId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder applicant(apideck.ats.apideck.models.shared.ApplicantInput applicant) {
            Utils.checkNotNull(applicant, "applicant");
            this.applicant = applicant;
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
        
        public ApplicantsUpdateRequest build() {
            if (raw == null) {
                raw = _SINGLETON_VALUE_Raw.value();
            }
            return new ApplicantsUpdateRequest(
                applicant,
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

