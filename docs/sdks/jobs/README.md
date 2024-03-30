# Jobs
(*ats().jobs()*)

### Available Operations

* [all](#all) - List Jobs
* [one](#one) - Get Job

## all

List Jobs

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.JobsAllRequest;
import apideck.ats.apideck.models.operations.JobsAllResponse;
import apideck.ats.apideck.models.shared.*;
import apideck.ats.apideck.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .security(Security.builder()
                    .apiKey("Bearer <your-apideck-api-key>")
                    .build())
                .xApideckAppId("<value>")
                .xApideckConsumerId("<value>")
                .build();

            JobsAllRequest req = JobsAllRequest.builder()
                .cursor("<value>")
                .fields("<value>")
                .limit(457312L)
                .passThrough(java.util.Map.ofEntries(
                    entry("search", "San Francisco")))
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            JobsAllResponse res = sdk.ats().jobs().all()
                .request(req)
                .call();

            if (res.getJobsResponse().isPresent()) {
                // handle response
            }
        } catch (apideck.ats.apideck.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends apideck.ats.apideck.models.operations.JobsAllResponse>](../../models/operations/JobsAllResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## one

Get Job

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.JobsOneRequest;
import apideck.ats.apideck.models.operations.JobsOneResponse;
import apideck.ats.apideck.models.shared.*;
import apideck.ats.apideck.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .security(Security.builder()
                    .apiKey("Bearer <your-apideck-api-key>")
                    .build())
                .xApideckAppId("<value>")
                .xApideckConsumerId("<value>")
                .build();

            JobsOneRequest req = JobsOneRequest.builder()
                .id("<value>")
                .fields("<value>")
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            JobsOneResponse res = sdk.ats().jobs().one()
                .request(req)
                .call();

            if (res.getJobResponse().isPresent()) {
                // handle response
            }
        } catch (apideck.ats.apideck.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends apideck.ats.apideck.models.operations.JobsOneResponse>](../../models/operations/JobsOneResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
