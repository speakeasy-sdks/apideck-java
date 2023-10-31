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
<!-- Start SDK Installation -->
# SDK Installation

## Gradle

```groovy
implementation 'apideck.ats.apideck:apideck:0.1.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->


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
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
# Available Resources and Operations



## [ats.applicants](docs/sdks/atsapplicants/README.md)

* [add](docs/sdks/atsapplicants/README.md#add) - Create Applicant
* [all](docs/sdks/atsapplicants/README.md#all) - List Applicants
* [delete](docs/sdks/atsapplicants/README.md#delete) - Delete Applicant
* [one](docs/sdks/atsapplicants/README.md#one) - Get Applicant
* [update](docs/sdks/atsapplicants/README.md#update) - Update Applicant

## [ats.applications](docs/sdks/atsapplications/README.md)

* [add](docs/sdks/atsapplications/README.md#add) - Create Application
* [all](docs/sdks/atsapplications/README.md#all) - List Applications
* [delete](docs/sdks/atsapplications/README.md#delete) - Delete Application
* [one](docs/sdks/atsapplications/README.md#one) - Get Application
* [update](docs/sdks/atsapplications/README.md#update) - Update Application

## [ats.jobs](docs/sdks/atsjobs/README.md)

* [all](docs/sdks/atsjobs/README.md#all) - List Jobs
* [one](docs/sdks/atsjobs/README.md#one) - Get Job
<!-- End SDK Available Operations -->

<!-- Start Dev Containers -->



<!-- End Dev Containers -->

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
