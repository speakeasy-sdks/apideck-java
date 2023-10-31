# AtsApplications
(*ats.applications*)

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
import apideck.ats.apideck.models.operations.ApplicationsAddRequest;
import apideck.ats.apideck.models.operations.ApplicationsAddResponse;
import apideck.ats.apideck.models.shared.ApplicationInput;
import apideck.ats.apideck.models.shared.ApplicationStage;
import apideck.ats.apideck.models.shared.ApplicationStatus;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicationsAddRequest req = new ApplicationsAddRequest(new ApplicationInput("12345", "12345"){{
stage = new ApplicationStage(){{
    id = "12345";
    name = "12345";
}};
status = ApplicationStatus.OPEN;
}}, "string", "string"){{
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicationsAddResponse res = sdk.ats.applications.add(req);

            if (res.createApplicationResponse != null) {
                // handle response
            }
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

**[apideck.ats.apideck.models.operations.ApplicationsAddResponse](../../models/operations/ApplicationsAddResponse.md)**


## all

List Applications

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicationsAllRequest;
import apideck.ats.apideck.models.operations.ApplicationsAllResponse;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicationsAllRequest req = new ApplicationsAllRequest("string", "string"){{
                cursor = "string";
                limit = 457312L;
                passThrough = new java.util.HashMap<String, Object>(){{
                    put("search", "string");
                }};
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicationsAllResponse res = sdk.ats.applications.all(req);

            if (res.getApplicationsResponse != null) {
                // handle response
            }
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

**[apideck.ats.apideck.models.operations.ApplicationsAllResponse](../../models/operations/ApplicationsAllResponse.md)**


## delete

Delete Application

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicationsDeleteRequest;
import apideck.ats.apideck.models.operations.ApplicationsDeleteResponse;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicationsDeleteRequest req = new ApplicationsDeleteRequest("string", "string", "string"){{
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicationsDeleteResponse res = sdk.ats.applications.delete(req);

            if (res.deleteApplicationResponse != null) {
                // handle response
            }
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

**[apideck.ats.apideck.models.operations.ApplicationsDeleteResponse](../../models/operations/ApplicationsDeleteResponse.md)**


## one

Get Application

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicationsOneRequest;
import apideck.ats.apideck.models.operations.ApplicationsOneResponse;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicationsOneRequest req = new ApplicationsOneRequest("string", "string", "string"){{
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicationsOneResponse res = sdk.ats.applications.one(req);

            if (res.getApplicationResponse != null) {
                // handle response
            }
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

**[apideck.ats.apideck.models.operations.ApplicationsOneResponse](../../models/operations/ApplicationsOneResponse.md)**


## update

Update Application

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicationsUpdateRequest;
import apideck.ats.apideck.models.operations.ApplicationsUpdateResponse;
import apideck.ats.apideck.models.shared.ApplicationInput;
import apideck.ats.apideck.models.shared.ApplicationStage;
import apideck.ats.apideck.models.shared.ApplicationStatus;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicationsUpdateRequest req = new ApplicationsUpdateRequest(new ApplicationInput("12345", "12345"){{
stage = new ApplicationStage(){{
    id = "12345";
    name = "12345";
}};
status = ApplicationStatus.OPEN;
}}, "string", "string", "string"){{
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicationsUpdateResponse res = sdk.ats.applications.update(req);

            if (res.updateApplicationResponse != null) {
                // handle response
            }
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

**[apideck.ats.apideck.models.operations.ApplicationsUpdateResponse](../../models/operations/ApplicationsUpdateResponse.md)**

