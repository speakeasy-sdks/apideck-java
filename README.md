# apideck

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://github.com/speakeasy-sdks/apideck-java.git/actions"><img src="https://img.shields.io/github/actions/workflow/status/speakeasy-sdks/apideck-java/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
    
</div>


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/productionize-sdks/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README
<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

Speakeasy offers [automatic publishing](https://www.speakeasyapi.dev/docs/advanced-setup/publish-sdks) of SDK artifacts via GitHub Actions. 

Once published to a repository (local or otherwise), the SDK artifact is used as below:

Gradle:
```groovy
implementation 'apideck.ats.apideck:apideck:0.3.0'
```

Maven:
```xml
<dependency>
    <groupId>apideck.ats.apideck</groupId>
    <artifactId>apideck</artifactId>
    <version>0.3.0</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [ats().applicants()](docs/sdks/applicants/README.md)

* [add](docs/sdks/applicants/README.md#add) - Create Applicant
* [all](docs/sdks/applicants/README.md#all) - List Applicants
* [delete](docs/sdks/applicants/README.md#delete) - Delete Applicant
* [one](docs/sdks/applicants/README.md#one) - Get Applicant
* [update](docs/sdks/applicants/README.md#update) - Update Applicant

### [ats().applications()](docs/sdks/applications/README.md)

* [add](docs/sdks/applications/README.md#add) - Create Application
* [all](docs/sdks/applications/README.md#all) - List Applications
* [delete](docs/sdks/applications/README.md#delete) - Delete Application
* [one](docs/sdks/applications/README.md#one) - Get Application
* [update](docs/sdks/applications/README.md#update) - Update Application

### [ats().jobs()](docs/sdks/jobs/README.md)

* [all](docs/sdks/jobs/README.md#all) - List Jobs
* [one](docs/sdks/jobs/README.md#one) - Get Job
<!-- End Available Resources and Operations [operations] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

Certain parameters are configured globally. These parameters must be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, These global values will be used as defaults on the operations that use them. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `x-apideck-app-id` to `"<value>"` at SDK initialization and then you do not have to pass the same value on calls to operations like `add`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameters are available. The required parameters must be set when you initialize the SDK client.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| xApideckAppId | String | ✔️ | The ID of your Unify application |
| xApideckConsumerId | String | ✔️ | ID of the consumer which you want to get or push data from |


### Example

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
<!-- End Global Parameters [global-parameters] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

### Example

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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://unify.apideck.com` | None |

#### Example

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
                .serverIndex(0)
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


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
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
                .serverURL("https://unify.apideck.com")
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
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name     | Type     | Scheme   |
| -------- | -------- | -------- |
| `apiKey` | apiKey   | API key  |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
