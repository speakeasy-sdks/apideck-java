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


public class UnprocessableResponse {

    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("detail")
    private Optional<? extends String> detail;

    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends String> error;

    /**
     * A human-readable message providing more details about the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<? extends String> message;

    /**
     * Link to documentation of error type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ref")
    private Optional<? extends String> ref;

    /**
     * HTTP status code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status_code")
    private Optional<? extends Double> statusCode;

    /**
     * The type of error returned
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type_name")
    private Optional<? extends String> typeName;

    public UnprocessableResponse(
            @JsonProperty("detail") Optional<? extends String> detail,
            @JsonProperty("error") Optional<? extends String> error,
            @JsonProperty("message") Optional<? extends String> message,
            @JsonProperty("ref") Optional<? extends String> ref,
            @JsonProperty("status_code") Optional<? extends Double> statusCode,
            @JsonProperty("type_name") Optional<? extends String> typeName) {
        Utils.checkNotNull(detail, "detail");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(ref, "ref");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(typeName, "typeName");
        this.detail = detail;
        this.error = error;
        this.message = message;
        this.ref = ref;
        this.statusCode = statusCode;
        this.typeName = typeName;
    }

    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    public Optional<? extends String> detail() {
        return detail;
    }

    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    public Optional<? extends String> error() {
        return error;
    }

    /**
     * A human-readable message providing more details about the error.
     */
    public Optional<? extends String> message() {
        return message;
    }

    /**
     * Link to documentation of error type
     */
    public Optional<? extends String> ref() {
        return ref;
    }

    /**
     * HTTP status code
     */
    public Optional<? extends Double> statusCode() {
        return statusCode;
    }

    /**
     * The type of error returned
     */
    public Optional<? extends String> typeName() {
        return typeName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    public UnprocessableResponse withDetail(String detail) {
        Utils.checkNotNull(detail, "detail");
        this.detail = Optional.ofNullable(detail);
        return this;
    }

    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    public UnprocessableResponse withDetail(Optional<? extends String> detail) {
        Utils.checkNotNull(detail, "detail");
        this.detail = detail;
        return this;
    }

    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    public UnprocessableResponse withError(String error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    public UnprocessableResponse withError(Optional<? extends String> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * A human-readable message providing more details about the error.
     */
    public UnprocessableResponse withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * A human-readable message providing more details about the error.
     */
    public UnprocessableResponse withMessage(Optional<? extends String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Link to documentation of error type
     */
    public UnprocessableResponse withRef(String ref) {
        Utils.checkNotNull(ref, "ref");
        this.ref = Optional.ofNullable(ref);
        return this;
    }

    /**
     * Link to documentation of error type
     */
    public UnprocessableResponse withRef(Optional<? extends String> ref) {
        Utils.checkNotNull(ref, "ref");
        this.ref = ref;
        return this;
    }

    /**
     * HTTP status code
     */
    public UnprocessableResponse withStatusCode(double statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = Optional.ofNullable(statusCode);
        return this;
    }

    /**
     * HTTP status code
     */
    public UnprocessableResponse withStatusCode(Optional<? extends Double> statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * The type of error returned
     */
    public UnprocessableResponse withTypeName(String typeName) {
        Utils.checkNotNull(typeName, "typeName");
        this.typeName = Optional.ofNullable(typeName);
        return this;
    }

    /**
     * The type of error returned
     */
    public UnprocessableResponse withTypeName(Optional<? extends String> typeName) {
        Utils.checkNotNull(typeName, "typeName");
        this.typeName = typeName;
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
        UnprocessableResponse other = (UnprocessableResponse) o;
        return 
            java.util.Objects.deepEquals(this.detail, other.detail) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.ref, other.ref) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.typeName, other.typeName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            detail,
            error,
            message,
            ref,
            statusCode,
            typeName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnprocessableResponse.class,
                "detail", detail,
                "error", error,
                "message", message,
                "ref", ref,
                "statusCode", statusCode,
                "typeName", typeName);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> detail = Optional.empty();
 
        private Optional<? extends String> error = Optional.empty();
 
        private Optional<? extends String> message = Optional.empty();
 
        private Optional<? extends String> ref = Optional.empty();
 
        private Optional<? extends Double> statusCode = Optional.empty();
 
        private Optional<? extends String> typeName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Contains parameter or domain specific information related to the error and why it occurred.
         */
        public Builder detail(String detail) {
            Utils.checkNotNull(detail, "detail");
            this.detail = Optional.ofNullable(detail);
            return this;
        }

        /**
         * Contains parameter or domain specific information related to the error and why it occurred.
         */
        public Builder detail(Optional<? extends String> detail) {
            Utils.checkNotNull(detail, "detail");
            this.detail = detail;
            return this;
        }

        /**
         * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
         */
        public Builder error(String error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
         */
        public Builder error(Optional<? extends String> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        /**
         * A human-readable message providing more details about the error.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        /**
         * A human-readable message providing more details about the error.
         */
        public Builder message(Optional<? extends String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * Link to documentation of error type
         */
        public Builder ref(String ref) {
            Utils.checkNotNull(ref, "ref");
            this.ref = Optional.ofNullable(ref);
            return this;
        }

        /**
         * Link to documentation of error type
         */
        public Builder ref(Optional<? extends String> ref) {
            Utils.checkNotNull(ref, "ref");
            this.ref = ref;
            return this;
        }

        /**
         * HTTP status code
         */
        public Builder statusCode(double statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = Optional.ofNullable(statusCode);
            return this;
        }

        /**
         * HTTP status code
         */
        public Builder statusCode(Optional<? extends Double> statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * The type of error returned
         */
        public Builder typeName(String typeName) {
            Utils.checkNotNull(typeName, "typeName");
            this.typeName = Optional.ofNullable(typeName);
            return this;
        }

        /**
         * The type of error returned
         */
        public Builder typeName(Optional<? extends String> typeName) {
            Utils.checkNotNull(typeName, "typeName");
            this.typeName = typeName;
            return this;
        }
        
        public UnprocessableResponse build() {
            return new UnprocessableResponse(
                detail,
                error,
                message,
                ref,
                statusCode,
                typeName);
        }
    }
}

