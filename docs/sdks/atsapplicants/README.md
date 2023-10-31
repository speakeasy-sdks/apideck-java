# AtsApplicants
(*ats.applicants*)

### Available Operations

* [add](#add) - Create Applicant
* [all](#all) - List Applicants
* [delete](#delete) - Delete Applicant
* [one](#one) - Get Applicant
* [update](#update) - Update Applicant

## add

Create Applicant

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicantsAddRequest;
import apideck.ats.apideck.models.operations.ApplicantsAddResponse;
import apideck.ats.apideck.models.shared.Address;
import apideck.ats.apideck.models.shared.AddressType;
import apideck.ats.apideck.models.shared.ApplicantInput;
import apideck.ats.apideck.models.shared.ApplicantSocialLinks;
import apideck.ats.apideck.models.shared.ApplicantWebsites;
import apideck.ats.apideck.models.shared.ApplicantWebsitesType;
import apideck.ats.apideck.models.shared.CustomField;
import apideck.ats.apideck.models.shared.Email;
import apideck.ats.apideck.models.shared.EmailType;
import apideck.ats.apideck.models.shared.PhoneNumber;
import apideck.ats.apideck.models.shared.PhoneNumberType;
import apideck.ats.apideck.models.shared.Security;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicantsAddRequest req = new ApplicantsAddRequest(new ApplicantInput(){{
addresses = new apideck.ats.apideck.models.shared.Address[]{{
    add(new Address(){{
        city = "San Francisco";
        contactName = "Elon Musk";
        country = "US";
        county = "Santa Clara";
        email = "elon@musk.com";
        fax = "122-111-1111";
        id = "123";
        latitude = "40.759211";
        line1 = "Main street";
        line2 = "apt #";
        line3 = "Suite #";
        line4 = "delivery instructions";
        longitude = "-73.984638";
        name = "HQ US";
        notes = "Address notes or delivery instructions.";
        phoneNumber = "111-111-1111";
        postalCode = "94104";
        rowVersion = "1-12345";
        salutation = "Mr";
        state = "CA";
        streetNumber = "25";
        string = "25 Spring Street, Blackburn, VIC 3130";
        type = AddressType.PRIMARY;
        website = "https://elonmusk.com";
    }}),
}};
anonymized = true;
applicationIds = new String[]{{
    add("a0d636c6-43b3-4bde-8c70-85b707d992f4"),
    add("a98lfd96-43b3-4bde-8c70-85b707d992e6"),
}};
applications = new String[]{{
    add("a0d636c6-43b3-4bde-8c70-85b707d992f4"),
    add("a98lfd96-43b3-4bde-8c70-85b707d992e6"),
}};
archived = false;
birthday = LocalDate.parse("2000-08-12");
confidential = false;
coordinatorId = "12345";
coverLetter = "I submit this application to express my sincere interest in the API developer position. In the previous role, I was responsible for leadership and ...";
customFields = new apideck.ats.apideck.models.shared.CustomField[]{{
    add(new CustomField("2389328923893298"){{
        description = "Employee Level";
        id = "2389328923893298";
        name = "employee_level";
        value = "string";
    }}),
}};
deleted = true;
emails = new apideck.ats.apideck.models.shared.Email[]{{
    add(new Email("elon@musk.com"){{
        email = "elon@musk.com";
        id = "123";
        type = EmailType.PRIMARY;
    }}),
}};
firstName = "Elon";
followers = new String[]{{
    add("a0d636c6-43b3-4bde-8c70-85b707d992f4"),
    add("a98lfd96-43b3-4bde-8c70-85b707d992e6"),
}};
headline = "PepsiCo, Inc, Central Perk";
initials = "EM";
lastName = "Musk";
middleName = "D.";
name = "Elon Musk";
ownerId = "54321";
phoneNumbers = new apideck.ats.apideck.models.shared.PhoneNumber[]{{
    add(new PhoneNumber("111-111-1111"){{
        areaCode = "323";
        countryCode = "1";
        extension = "105";
        id = "12345";
        number = "111-111-1111";
        type = PhoneNumberType.PRIMARY;
    }}),
}};
photoUrl = "https://unavatar.io/elon-musk";
positionId = "123";
recordUrl = "https://app.intercom.io/contacts/12345";
recruiterId = "12345";
socialLinks = new apideck.ats.apideck.models.shared.ApplicantSocialLinks[]{{
    add(new ApplicantSocialLinks("https://www.twitter.com/apideck"){{
        id = "12345";
        type = "twitter";
        url = "https://www.twitter.com/apideck";
    }}),
}};
sources = new String[]{{
    add("Job site"),
}};
stageId = "12345";
tags = new String[]{{
    add("New"),
}};
title = "CEO";
websites = new apideck.ats.apideck.models.shared.ApplicantWebsites[]{{
    add(new ApplicantWebsites("http://example.com"){{
        id = "12345";
        type = ApplicantWebsitesType.PRIMARY;
        url = "http://example.com";
    }}),
}};
}}, "string", "string"){{
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicantsAddResponse res = sdk.ats.applicants.add(req);

            if (res.createApplicantResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [apideck.ats.apideck.models.operations.ApplicantsAddRequest](../../models/operations/ApplicantsAddRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[apideck.ats.apideck.models.operations.ApplicantsAddResponse](../../models/operations/ApplicantsAddResponse.md)**


## all

List Applicants

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicantsAllRequest;
import apideck.ats.apideck.models.operations.ApplicantsAllResponse;
import apideck.ats.apideck.models.shared.ApplicantsFilter;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicantsAllRequest req = new ApplicantsAllRequest("string", "string"){{
                cursor = "string";
                fields = "string";
                filter = new ApplicantsFilter(){{
                    jobId = "1234";
                }};
                limit = 457312L;
                passThrough = new java.util.HashMap<String, Object>(){{
                    put("search", "string");
                }};
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicantsAllResponse res = sdk.ats.applicants.all(req);

            if (res.getApplicantsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [apideck.ats.apideck.models.operations.ApplicantsAllRequest](../../models/operations/ApplicantsAllRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[apideck.ats.apideck.models.operations.ApplicantsAllResponse](../../models/operations/ApplicantsAllResponse.md)**


## delete

Delete Applicant

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicantsDeleteRequest;
import apideck.ats.apideck.models.operations.ApplicantsDeleteResponse;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicantsDeleteRequest req = new ApplicantsDeleteRequest("string", "string", "string"){{
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicantsDeleteResponse res = sdk.ats.applicants.delete(req);

            if (res.deleteApplicantResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [apideck.ats.apideck.models.operations.ApplicantsDeleteRequest](../../models/operations/ApplicantsDeleteRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[apideck.ats.apideck.models.operations.ApplicantsDeleteResponse](../../models/operations/ApplicantsDeleteResponse.md)**


## one

Get Applicant

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicantsOneRequest;
import apideck.ats.apideck.models.operations.ApplicantsOneResponse;
import apideck.ats.apideck.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicantsOneRequest req = new ApplicantsOneRequest("string", "string", "string"){{
                fields = "string";
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicantsOneResponse res = sdk.ats.applicants.one(req);

            if (res.getApplicantResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [apideck.ats.apideck.models.operations.ApplicantsOneRequest](../../models/operations/ApplicantsOneRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[apideck.ats.apideck.models.operations.ApplicantsOneResponse](../../models/operations/ApplicantsOneResponse.md)**


## update

Update Applicant

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.ApplicantsUpdateRequest;
import apideck.ats.apideck.models.operations.ApplicantsUpdateResponse;
import apideck.ats.apideck.models.shared.Address;
import apideck.ats.apideck.models.shared.AddressType;
import apideck.ats.apideck.models.shared.ApplicantInput;
import apideck.ats.apideck.models.shared.ApplicantSocialLinks;
import apideck.ats.apideck.models.shared.ApplicantWebsites;
import apideck.ats.apideck.models.shared.ApplicantWebsitesType;
import apideck.ats.apideck.models.shared.CustomField;
import apideck.ats.apideck.models.shared.Email;
import apideck.ats.apideck.models.shared.EmailType;
import apideck.ats.apideck.models.shared.PhoneNumber;
import apideck.ats.apideck.models.shared.PhoneNumberType;
import apideck.ats.apideck.models.shared.Security;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            Apideck sdk = Apideck.builder()
                .setSecurity(new Security("Bearer <your-apideck-api-key>"){{
                    apiKey = "Bearer <your-apideck-api-key>";
                }})
                .build();

            ApplicantsUpdateRequest req = new ApplicantsUpdateRequest(new ApplicantInput(){{
addresses = new apideck.ats.apideck.models.shared.Address[]{{
    add(new Address(){{
        city = "San Francisco";
        contactName = "Elon Musk";
        country = "US";
        county = "Santa Clara";
        email = "elon@musk.com";
        fax = "122-111-1111";
        id = "123";
        latitude = "40.759211";
        line1 = "Main street";
        line2 = "apt #";
        line3 = "Suite #";
        line4 = "delivery instructions";
        longitude = "-73.984638";
        name = "HQ US";
        notes = "Address notes or delivery instructions.";
        phoneNumber = "111-111-1111";
        postalCode = "94104";
        rowVersion = "1-12345";
        salutation = "Mr";
        state = "CA";
        streetNumber = "25";
        string = "25 Spring Street, Blackburn, VIC 3130";
        type = AddressType.PRIMARY;
        website = "https://elonmusk.com";
    }}),
}};
anonymized = true;
applicationIds = new String[]{{
    add("a0d636c6-43b3-4bde-8c70-85b707d992f4"),
    add("a98lfd96-43b3-4bde-8c70-85b707d992e6"),
}};
applications = new String[]{{
    add("a0d636c6-43b3-4bde-8c70-85b707d992f4"),
    add("a98lfd96-43b3-4bde-8c70-85b707d992e6"),
}};
archived = false;
birthday = LocalDate.parse("2000-08-12");
confidential = false;
coordinatorId = "12345";
coverLetter = "I submit this application to express my sincere interest in the API developer position. In the previous role, I was responsible for leadership and ...";
customFields = new apideck.ats.apideck.models.shared.CustomField[]{{
    add(new CustomField("2389328923893298"){{
        description = "Employee Level";
        id = "2389328923893298";
        name = "employee_level";
        value = "string";
    }}),
}};
deleted = true;
emails = new apideck.ats.apideck.models.shared.Email[]{{
    add(new Email("elon@musk.com"){{
        email = "elon@musk.com";
        id = "123";
        type = EmailType.PRIMARY;
    }}),
}};
firstName = "Elon";
followers = new String[]{{
    add("a0d636c6-43b3-4bde-8c70-85b707d992f4"),
    add("a98lfd96-43b3-4bde-8c70-85b707d992e6"),
}};
headline = "PepsiCo, Inc, Central Perk";
initials = "EM";
lastName = "Musk";
middleName = "D.";
name = "Elon Musk";
ownerId = "54321";
phoneNumbers = new apideck.ats.apideck.models.shared.PhoneNumber[]{{
    add(new PhoneNumber("111-111-1111"){{
        areaCode = "323";
        countryCode = "1";
        extension = "105";
        id = "12345";
        number = "111-111-1111";
        type = PhoneNumberType.PRIMARY;
    }}),
}};
photoUrl = "https://unavatar.io/elon-musk";
positionId = "123";
recordUrl = "https://app.intercom.io/contacts/12345";
recruiterId = "12345";
socialLinks = new apideck.ats.apideck.models.shared.ApplicantSocialLinks[]{{
    add(new ApplicantSocialLinks("https://www.twitter.com/apideck"){{
        id = "12345";
        type = "twitter";
        url = "https://www.twitter.com/apideck";
    }}),
}};
sources = new String[]{{
    add("Job site"),
}};
stageId = "12345";
tags = new String[]{{
    add("New"),
}};
title = "CEO";
websites = new apideck.ats.apideck.models.shared.ApplicantWebsites[]{{
    add(new ApplicantWebsites("http://example.com"){{
        id = "12345";
        type = ApplicantWebsitesType.PRIMARY;
        url = "http://example.com";
    }}),
}};
}}, "string", "string", "string"){{
                raw = false;
                xApideckServiceId = "string";
            }};            

            ApplicantsUpdateResponse res = sdk.ats.applicants.update(req);

            if (res.updateApplicantResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [apideck.ats.apideck.models.operations.ApplicantsUpdateRequest](../../models/operations/ApplicantsUpdateRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[apideck.ats.apideck.models.operations.ApplicantsUpdateResponse](../../models/operations/ApplicantsUpdateResponse.md)**

