# Applicants
(*ats().applicants()*)

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
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicantsAddRequest;
import apideck.ats.apideck.models.operations.ApplicantsAddResponse;
import apideck.ats.apideck.models.shared.*;
import apideck.ats.apideck.models.shared.Address;
import apideck.ats.apideck.models.shared.ApplicantInput;
import apideck.ats.apideck.models.shared.ApplicantType;
import apideck.ats.apideck.models.shared.CustomField;
import apideck.ats.apideck.models.shared.Email;
import apideck.ats.apideck.models.shared.EmailType;
import apideck.ats.apideck.models.shared.Four;
import apideck.ats.apideck.models.shared.PhoneNumber;
import apideck.ats.apideck.models.shared.PhoneNumberType;
import apideck.ats.apideck.models.shared.Security;
import apideck.ats.apideck.models.shared.SocialLinks;
import apideck.ats.apideck.models.shared.Type;
import apideck.ats.apideck.models.shared.Websites;
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

            ApplicantsAddRequest req = ApplicantsAddRequest.builder()
                .applicant(ApplicantInput.builder()
                        .addresses(java.util.List.of(
                            Address.builder()
                                .city("San Francisco")
                                .contactName("Elon Musk")
                                .country("US")
                                .county("Santa Clara")
                                .email("elon@musk.com")
                                .fax("122-111-1111")
                                .id("123")
                                .latitude("40.759211")
                                .line1("Main street")
                                .line2("apt #")
                                .line3("Suite #")
                                .line4("delivery instructions")
                                .longitude("-73.984638")
                                .name("HQ US")
                                .notes("Address notes or delivery instructions.")
                                .phoneNumber("111-111-1111")
                                .postalCode("94104")
                                .rowVersion("1-12345")
                                .salutation("Mr")
                                .state("CA")
                                .streetNumber("25")
                                .string("25 Spring Street, Blackburn, VIC 3130")
                                .type(Type.PRIMARY)
                                .website("https://elonmusk.com")
                                .build()))
                        .anonymized(true)
                        .applicationIds(java.util.List.of(
                            "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                            "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                        .applications(java.util.List.of(
                            "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                            "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                        .archived(false)
                        .birthday(LocalDate.parse("2000-08-12"))
                        .confidential(false)
                        .coordinatorId("12345")
                        .coverLetter("I submit this application to express my sincere interest in the API developer position. In the previous role, I was responsible for leadership and ...")
                        .customFields(java.util.List.of(
                            CustomField.builder()
                                .id("2389328923893298")
                                .description("Employee Level")
                                .name("employee_level")
                                .build()))
                        .deleted(true)
                        .emails(java.util.List.of(
                            Email.builder()
                                .email("elon@musk.com")
                                .id("123")
                                .type(EmailType.PRIMARY)
                                .build()))
                        .firstName("Elon")
                        .followers(java.util.List.of(
                            "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                            "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                        .headline("PepsiCo, Inc, Central Perk")
                        .initials("EM")
                        .lastName("Musk")
                        .middleName("D.")
                        .name("Elon Musk")
                        .ownerId("54321")
                        .phoneNumbers(java.util.List.of(
                            PhoneNumber.builder()
                                .number("111-111-1111")
                                .areaCode("323")
                                .countryCode("1")
                                .extension("105")
                                .id("12345")
                                .type(PhoneNumberType.PRIMARY)
                                .build()))
                        .photoUrl("https://unavatar.io/elon-musk")
                        .positionId("123")
                        .recordUrl("https://app.intercom.io/contacts/12345")
                        .recruiterId("12345")
                        .socialLinks(java.util.List.of(
                            SocialLinks.builder()
                                .url("https://www.twitter.com/apideck")
                                .id("12345")
                                .type("twitter")
                                .build()))
                        .sources(java.util.List.of(
                            "Job site"))
                        .stageId("12345")
                        .tags(java.util.List.of(
                            "New"))
                        .title("CEO")
                        .websites(java.util.List.of(
                            Websites.builder()
                                .url("http://example.com")
                                .id("12345")
                                .type(ApplicantType.PRIMARY)
                                .build()))
                        .build())
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicantsAddResponse res = sdk.ats().applicants().add()
                .request(req)
                .call();

            if (res.createApplicantResponse().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [apideck.ats.apideck.models.operations.ApplicantsAddRequest](../../models/operations/ApplicantsAddRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicantsAddResponse>](../../models/operations/ApplicantsAddResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## all

List Applicants

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicantsAllRequest;
import apideck.ats.apideck.models.operations.ApplicantsAllResponse;
import apideck.ats.apideck.models.shared.*;
import apideck.ats.apideck.models.shared.ApplicantsFilter;
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

            ApplicantsAllRequest req = ApplicantsAllRequest.builder()
                .cursor("<value>")
                .fields("<value>")
                .filter(ApplicantsFilter.builder()
                    .jobId("1234")
                    .build())
                .limit(457312L)
                .passThrough(java.util.Map.ofEntries(
                    entry("search", "San Francisco")))
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicantsAllResponse res = sdk.ats().applicants().all()
                .request(req)
                .call();

            if (res.getApplicantsResponse().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [apideck.ats.apideck.models.operations.ApplicantsAllRequest](../../models/operations/ApplicantsAllRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicantsAllResponse>](../../models/operations/ApplicantsAllResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Delete Applicant

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicantsDeleteRequest;
import apideck.ats.apideck.models.operations.ApplicantsDeleteResponse;
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

            ApplicantsDeleteRequest req = ApplicantsDeleteRequest.builder()
                .id("<value>")
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicantsDeleteResponse res = sdk.ats().applicants().delete()
                .request(req)
                .call();

            if (res.deleteApplicantResponse().isPresent()) {
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [apideck.ats.apideck.models.operations.ApplicantsDeleteRequest](../../models/operations/ApplicantsDeleteRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicantsDeleteResponse>](../../models/operations/ApplicantsDeleteResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## one

Get Applicant

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicantsOneRequest;
import apideck.ats.apideck.models.operations.ApplicantsOneResponse;
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

            ApplicantsOneRequest req = ApplicantsOneRequest.builder()
                .id("<value>")
                .fields("<value>")
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicantsOneResponse res = sdk.ats().applicants().one()
                .request(req)
                .call();

            if (res.getApplicantResponse().isPresent()) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [apideck.ats.apideck.models.operations.ApplicantsOneRequest](../../models/operations/ApplicantsOneRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicantsOneResponse>](../../models/operations/ApplicantsOneResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Update Applicant

### Example Usage

```java
package hello.world;

import apideck.ats.apideck.Apideck;
import apideck.ats.apideck.models.operations.*;
import apideck.ats.apideck.models.operations.ApplicantsUpdateRequest;
import apideck.ats.apideck.models.operations.ApplicantsUpdateResponse;
import apideck.ats.apideck.models.shared.*;
import apideck.ats.apideck.models.shared.Address;
import apideck.ats.apideck.models.shared.ApplicantInput;
import apideck.ats.apideck.models.shared.ApplicantType;
import apideck.ats.apideck.models.shared.CustomField;
import apideck.ats.apideck.models.shared.Email;
import apideck.ats.apideck.models.shared.EmailType;
import apideck.ats.apideck.models.shared.Four;
import apideck.ats.apideck.models.shared.PhoneNumber;
import apideck.ats.apideck.models.shared.PhoneNumberType;
import apideck.ats.apideck.models.shared.Security;
import apideck.ats.apideck.models.shared.SocialLinks;
import apideck.ats.apideck.models.shared.Type;
import apideck.ats.apideck.models.shared.Websites;
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

            ApplicantsUpdateRequest req = ApplicantsUpdateRequest.builder()
                .applicant(ApplicantInput.builder()
                        .addresses(java.util.List.of(
                            Address.builder()
                                .city("San Francisco")
                                .contactName("Elon Musk")
                                .country("US")
                                .county("Santa Clara")
                                .email("elon@musk.com")
                                .fax("122-111-1111")
                                .id("123")
                                .latitude("40.759211")
                                .line1("Main street")
                                .line2("apt #")
                                .line3("Suite #")
                                .line4("delivery instructions")
                                .longitude("-73.984638")
                                .name("HQ US")
                                .notes("Address notes or delivery instructions.")
                                .phoneNumber("111-111-1111")
                                .postalCode("94104")
                                .rowVersion("1-12345")
                                .salutation("Mr")
                                .state("CA")
                                .streetNumber("25")
                                .string("25 Spring Street, Blackburn, VIC 3130")
                                .type(Type.PRIMARY)
                                .website("https://elonmusk.com")
                                .build()))
                        .anonymized(true)
                        .applicationIds(java.util.List.of(
                            "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                            "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                        .applications(java.util.List.of(
                            "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                            "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                        .archived(false)
                        .birthday(LocalDate.parse("2000-08-12"))
                        .confidential(false)
                        .coordinatorId("12345")
                        .coverLetter("I submit this application to express my sincere interest in the API developer position. In the previous role, I was responsible for leadership and ...")
                        .customFields(java.util.List.of(
                            CustomField.builder()
                                .id("2389328923893298")
                                .description("Employee Level")
                                .name("employee_level")
                                .build()))
                        .deleted(true)
                        .emails(java.util.List.of(
                            Email.builder()
                                .email("elon@musk.com")
                                .id("123")
                                .type(EmailType.PRIMARY)
                                .build()))
                        .firstName("Elon")
                        .followers(java.util.List.of(
                            "a0d636c6-43b3-4bde-8c70-85b707d992f4",
                            "a98lfd96-43b3-4bde-8c70-85b707d992e6"))
                        .headline("PepsiCo, Inc, Central Perk")
                        .initials("EM")
                        .lastName("Musk")
                        .middleName("D.")
                        .name("Elon Musk")
                        .ownerId("54321")
                        .phoneNumbers(java.util.List.of(
                            PhoneNumber.builder()
                                .number("111-111-1111")
                                .areaCode("323")
                                .countryCode("1")
                                .extension("105")
                                .id("12345")
                                .type(PhoneNumberType.PRIMARY)
                                .build()))
                        .photoUrl("https://unavatar.io/elon-musk")
                        .positionId("123")
                        .recordUrl("https://app.intercom.io/contacts/12345")
                        .recruiterId("12345")
                        .socialLinks(java.util.List.of(
                            SocialLinks.builder()
                                .url("https://www.twitter.com/apideck")
                                .id("12345")
                                .type("twitter")
                                .build()))
                        .sources(java.util.List.of(
                            "Job site"))
                        .stageId("12345")
                        .tags(java.util.List.of(
                            "New"))
                        .title("CEO")
                        .websites(java.util.List.of(
                            Websites.builder()
                                .url("http://example.com")
                                .id("12345")
                                .type(ApplicantType.PRIMARY)
                                .build()))
                        .build())
                .id("<value>")
                .raw(false)
                .xApideckServiceId("<value>")
                .build();

            ApplicantsUpdateResponse res = sdk.ats().applicants().update()
                .request(req)
                .call();

            if (res.updateApplicantResponse().isPresent()) {
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

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [apideck.ats.apideck.models.operations.ApplicantsUpdateRequest](../../models/operations/ApplicantsUpdateRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Optional<? extends apideck.ats.apideck.models.operations.ApplicantsUpdateResponse>](../../models/operations/ApplicantsUpdateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
