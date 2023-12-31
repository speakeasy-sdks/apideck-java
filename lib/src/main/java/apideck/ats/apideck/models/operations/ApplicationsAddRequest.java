/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.operations;

import apideck.ats.apideck.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationsAddRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public apideck.ats.apideck.models.shared.ApplicationInput applicationInput;

    public ApplicationsAddRequest withApplicationInput(apideck.ats.apideck.models.shared.ApplicationInput applicationInput) {
        this.applicationInput = applicationInput;
        return this;
    }
    
    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    public Boolean raw;

    public ApplicationsAddRequest withRaw(Boolean raw) {
        this.raw = raw;
        return this;
    }
    
    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    public String xApideckAppId;

    public ApplicationsAddRequest withXApideckAppId(String xApideckAppId) {
        this.xApideckAppId = xApideckAppId;
        return this;
    }
    
    /**
     * ID of the consumer which you want to get or push data from
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-consumer-id")
    public String xApideckConsumerId;

    public ApplicationsAddRequest withXApideckConsumerId(String xApideckConsumerId) {
        this.xApideckConsumerId = xApideckConsumerId;
        return this;
    }
    
    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-service-id")
    public String xApideckServiceId;

    public ApplicationsAddRequest withXApideckServiceId(String xApideckServiceId) {
        this.xApideckServiceId = xApideckServiceId;
        return this;
    }
    
    public ApplicationsAddRequest(@JsonProperty("ApplicationInput") apideck.ats.apideck.models.shared.ApplicationInput applicationInput, @JsonProperty("x-apideck-app-id") String xApideckAppId, @JsonProperty("x-apideck-consumer-id") String xApideckConsumerId) {
        this.applicationInput = applicationInput;
        this.xApideckAppId = xApideckAppId;
        this.xApideckConsumerId = xApideckConsumerId;
  }
}
