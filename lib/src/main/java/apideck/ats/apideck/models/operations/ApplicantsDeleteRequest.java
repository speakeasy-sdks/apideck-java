/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.operations;

import apideck.ats.apideck.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicantsDeleteRequest {
    /**
     * ID of the record you are acting upon.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public ApplicantsDeleteRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Include raw response. Mostly used for debugging purposes
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=raw")
    public Boolean raw;

    public ApplicantsDeleteRequest withRaw(Boolean raw) {
        this.raw = raw;
        return this;
    }
    
    /**
     * The ID of your Unify application
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-app-id")
    public String xApideckAppId;

    public ApplicantsDeleteRequest withXApideckAppId(String xApideckAppId) {
        this.xApideckAppId = xApideckAppId;
        return this;
    }
    
    /**
     * ID of the consumer which you want to get or push data from
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-consumer-id")
    public String xApideckConsumerId;

    public ApplicantsDeleteRequest withXApideckConsumerId(String xApideckConsumerId) {
        this.xApideckConsumerId = xApideckConsumerId;
        return this;
    }
    
    /**
     * Provide the service id you want to call (e.g., pipedrive). Only needed when a consumer has activated multiple integrations for a Unified API.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-apideck-service-id")
    public String xApideckServiceId;

    public ApplicantsDeleteRequest withXApideckServiceId(String xApideckServiceId) {
        this.xApideckServiceId = xApideckServiceId;
        return this;
    }
    
    public ApplicantsDeleteRequest(@JsonProperty("id") String id, @JsonProperty("x-apideck-app-id") String xApideckAppId, @JsonProperty("x-apideck-consumer-id") String xApideckConsumerId) {
        this.id = id;
        this.xApideckAppId = xApideckAppId;
        this.xApideckConsumerId = xApideckConsumerId;
  }
}
