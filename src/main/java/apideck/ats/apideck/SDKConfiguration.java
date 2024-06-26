/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package apideck.ats.apideck;

import apideck.ats.apideck.utils.HTTPClient;
import apideck.ats.apideck.utils.RetryConfig;
import apideck.ats.apideck.models.shared.Security;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    public HTTPClient defaultClient;
	  public String serverUrl;
    public int serverIdx = 0;
  	public String language = "java";
  	public String openapiDocVersion = "9.9.2";
  	public String sdkVersion = "0.3.1";
  	public String genVersion = "2.295.1";
  	public String userAgent = "speakeasy-sdk/java 0.3.1 2.295.1 9.9.2 apideck.ats.apideck";
  	public Map<String, Map<String, Map<String, java.lang.Object>>> globals = new HashMap<>(){{
  		put("parameters", new HashMap<>());
  	}};
  	
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
