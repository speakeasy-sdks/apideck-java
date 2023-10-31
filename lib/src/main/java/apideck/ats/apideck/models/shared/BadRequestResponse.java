/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BadRequestResponse {
    /**
     * Contains parameter or domain specific information related to the error and why it occurred.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("detail")
    public Object detail;

    public BadRequestResponse withDetail(Object detail) {
        this.detail = detail;
        return this;
    }
    
    /**
     * Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public String error;

    public BadRequestResponse withError(String error) {
        this.error = error;
        return this;
    }
    
    /**
     * A human-readable message providing more details about the error.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public BadRequestResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * Link to documentation of error type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ref")
    public String ref;

    public BadRequestResponse withRef(String ref) {
        this.ref = ref;
        return this;
    }
    
    /**
     * HTTP status code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status_code")
    public Double statusCode;

    public BadRequestResponse withStatusCode(Double statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * The type of error returned
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type_name")
    public String typeName;

    public BadRequestResponse withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    
    public BadRequestResponse(){}
}
