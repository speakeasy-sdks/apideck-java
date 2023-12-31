/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicantWebsites {
    /**
     * Unique identifier for the website
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public ApplicantWebsites withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The type of website
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public ApplicantWebsitesType type;

    public ApplicantWebsites withType(ApplicantWebsitesType type) {
        this.type = type;
        return this;
    }
    
    /**
     * The website URL
     */
    @JsonProperty("url")
    public String url;

    public ApplicantWebsites withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public ApplicantWebsites(@JsonProperty("url") String url) {
        this.url = url;
  }
}
