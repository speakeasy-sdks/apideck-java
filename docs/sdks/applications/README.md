# Applications
(*ats().applications()*)

### Available Operations

* [add](#add) - Create Application
* [all](#all) - List Applications
* [delete](#delete) - Delete Application
* [one](#one) - Get Application
* [update](#update) - Update Application

## add

Create Application

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicationsAddRequest;
import apideck.ats.apideck.models.operations.ApplicationsAddResponse;
import apideck.ats.apideck.models.shared.*;
import apideck.ats.apideck.models.shared.ApplicationInput;
import apideck.ats.apideck.models.shared.Security;
import apideck.ats.apideck.models.shared.Stage;
import apideck.ats.apideck.models.shared.Status;
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

            ApplicationsAddRequest req = ApplicationsAddRequest.builder()
                .application(ApplicationInput.builder()
                        .applicantId("12345")
                        .jobId("12345")
                        .stage(Stage.builder()
                            .id("12345")
                            .name("12345")
                            .build())
                        .status(Status.OPEN)
                        .build())
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicationsAddResponse res = sdk.ats().applications().add()
                .request(req)
                .call();

            if (res.createApplicationResponse().isPresent()) {
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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [apideck.ats.apideck.models.operations.ApplicationsAddRequest](../../models/operations/ApplicationsAddRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicationsAddResponse>](../../models/operations/ApplicationsAddResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## all

List Applications

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicationsAllRequest;
import apideck.ats.apideck.models.operations.ApplicationsAllResponse;
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

            ApplicationsAllRequest req = ApplicationsAllRequest.builder()
                .cursor("<value>")
                .limit(457312L)
                .passThrough(java.util.Map.ofEntries(
                    entry("search", "San Francisco")))
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicationsAllResponse res = sdk.ats().applications().all()
                .request(req)
                .call();

            if (res.getApplicationsResponse().isPresent()) {
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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [apideck.ats.apideck.models.operations.ApplicationsAllRequest](../../models/operations/ApplicationsAllRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicationsAllResponse>](../../models/operations/ApplicationsAllResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Delete Application

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicationsDeleteRequest;
import apideck.ats.apideck.models.operations.ApplicationsDeleteResponse;
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

            ApplicationsDeleteRequest req = ApplicationsDeleteRequest.builder()
                .id("<value>")
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicationsDeleteResponse res = sdk.ats().applications().delete()
                .request(req)
                .call();

            if (res.deleteApplicationResponse().isPresent()) {
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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [apideck.ats.apideck.models.operations.ApplicationsDeleteRequest](../../models/operations/ApplicationsDeleteRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicationsDeleteResponse>](../../models/operations/ApplicationsDeleteResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## one

Get Application

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicationsOneRequest;
import apideck.ats.apideck.models.operations.ApplicationsOneResponse;
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

            ApplicationsOneRequest req = ApplicationsOneRequest.builder()
                .id("<value>")
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicationsOneResponse res = sdk.ats().applications().one()
                .request(req)
                .call();

            if (res.getApplicationResponse().isPresent()) {
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

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [apideck.ats.apideck.models.operations.ApplicationsOneRequest](../../models/operations/ApplicationsOneRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicationsOneResponse>](../../models/operations/ApplicationsOneResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Update Application

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicationsUpdateRequest;
import apideck.ats.apideck.models.operations.ApplicationsUpdateResponse;
import apideck.ats.apideck.models.shared.*;
import apideck.ats.apideck.models.shared.ApplicationInput;
import apideck.ats.apideck.models.shared.Security;
import apideck.ats.apideck.models.shared.Stage;
import apideck.ats.apideck.models.shared.Status;
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

            ApplicationsUpdateRequest req = ApplicationsUpdateRequest.builder()
                .application(ApplicationInput.builder()
                        .applicantId("12345")
                        .jobId("12345")
                        .stage(Stage.builder()
                            .id("12345")
                            .name("12345")
                            .build())
                        .status(Status.OPEN)
                        .build())
                .id("<value>")
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicationsUpdateResponse res = sdk.ats().applications().update()
                .request(req)
                .call();

            if (res.updateApplicationResponse().isPresent()) {
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

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [apideck.ats.apideck.models.operations.ApplicationsUpdateRequest](../../models/operations/ApplicationsUpdateRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicationsUpdateResponse>](../../models/operations/ApplicationsUpdateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
