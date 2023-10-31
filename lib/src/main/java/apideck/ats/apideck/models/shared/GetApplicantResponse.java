/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetApplicantResponse {
    @JsonProperty("data")
    public Applicant data;

    public GetApplicantResponse withData(Applicant data) {
        this.data = data;
        return this;
    }
    
    /**
     * Operation performed
     */
    @JsonProperty("operation")
    public String operation;

    public GetApplicantResponse withOperation(String operation) {
        this.operation = operation;
        return this;
    }
    
    /**
     * Unified API resource name
     */
    @JsonProperty("resource")
    public String resource;

    public GetApplicantResponse withResource(String resource) {
        this.resource = resource;
        return this;
    }
    
    /**
     * Apideck ID of service provider
     */
    @JsonProperty("service")
    public String service;

    public GetApplicantResponse withService(String service) {
        this.service = service;
        return this;
    }
    
    /**
     * HTTP Response Status
     */
    @JsonProperty("status")
    public String status;

    public GetApplicantResponse withStatus(String status) {
        this.status = status;
        return this;
    }
    
    /**
     * HTTP Response Status Code
     */
    @JsonProperty("status_code")
    public Long statusCode;

    public GetApplicantResponse withStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public GetApplicantResponse(@JsonProperty("data") Applicant data, @JsonProperty("operation") String operation, @JsonProperty("resource") String resource, @JsonProperty("service") String service, @JsonProperty("status") String status, @JsonProperty("status_code") Long statusCode) {
        this.data = data;
        this.operation = operation;
        this.resource = resource;
        this.service = service;
        this.status = status;
        this.statusCode = statusCode;
  }
}
