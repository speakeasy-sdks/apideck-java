# AtsJobs
(*ats.jobs*)

### Available Operations

* [all](#all) - List Jobs
* [one](#one) - Get Job

## all

List Jobs

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.JobsAllRequest;
import apideck.ats.apideck.models.operations.JobsAllResponse;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            JobsAllRequest req = new JobsAllRequest("string", "string"){{
                cursor = "string";
                fields = "string";
                limit = 457312L;
                passThrough = new java.util.HashMap<String, Object>(){{
                    put("search", "string");
                }};
                raw = false;
                xApideckServiceId = "string";
            }};            

            JobsAllResponse res = sdk.ats.jobs.all(req);

            if (res.getJobsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [apideck.ats.apideck.models.operations.JobsAllRequest](../../models/operations/JobsAllRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[apideck.ats.apideck.models.operations.JobsAllResponse](../../models/operations/JobsAllResponse.md)**


## one

Get Job

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.JobsOneRequest;
import apideck.ats.apideck.models.operations.JobsOneResponse;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            JobsOneRequest req = new JobsOneRequest("string", "string", "string"){{
                fields = "string";
                raw = false;
                xApideckServiceId = "string";
            }};            

            JobsOneResponse res = sdk.ats.jobs.one(req);

            if (res.getJobResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [apideck.ats.apideck.models.operations.JobsOneRequest](../../models/operations/JobsOneRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[apideck.ats.apideck.models.operations.JobsOneResponse](../../models/operations/JobsOneResponse.md)**

