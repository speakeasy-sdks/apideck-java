/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateApplicationResponse {
    @JsonProperty("data")
    public UnifiedId data;

    public CreateApplicationResponse withData(UnifiedId data) {
        this.data = data;
        return this;
    }
    
    /**
     * Operation performed
     */
    @JsonProperty("operation")
    public String operation;

    public CreateApplicationResponse withOperation(String operation) {
        this.operation = operation;
        return this;
    }
    
    /**
     * Unified API resource name
     */
    @JsonProperty("resource")
    public String resource;

    public CreateApplicationResponse withResource(String resource) {
        this.resource = resource;
        return this;
    }
    
    /**
     * Apideck ID of service provider
     */
    @JsonProperty("service")
    public String service;

    public CreateApplicationResponse withService(String service) {
        this.service = service;
        return this;
    }
    
    /**
     * HTTP Response Status
     */
    @JsonProperty("status")
    public String status;

    public CreateApplicationResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
    /**
     * HTTP Response Status Code
     */
    @JsonProperty("status_code")
    public Long statusCode;

    public CreateApplicationResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public CreateApplicationResponse(@JsonProperty("data") UnifiedId data, @JsonProperty("operation") String operation, @JsonProperty("resource") String resource, @JsonProperty("service") String service, @JsonProperty("status") String status, @JsonProperty("status_code") Long statusCode) {
        this.data = data;
        this.operation = operation;
        this.resource = resource;
        this.service = service;
        this.status = status;
        this.statusCode = statusCode;
  }
}
