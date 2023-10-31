# CreateApplicationResponse


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `data`                                        | [UnifiedId](../../models/shared/UnifiedId.md) | :heavy_check_mark:                            | N/A                                           |                                               |
| `operation`                                   | *String*                                      | :heavy_check_mark:                            | Operation performed                           | add                                           |
| `resource`                                    | *String*                                      | :heavy_check_mark:                            | Unified API resource name                     | Applications                                  |
| `service`                                     | *String*                                      | :heavy_check_mark:                            | Apideck ID of service provider                | sap-successfactors                            |
| `status`                                      | *String*                                      | :heavy_check_mark:                            | HTTP Response Status                          | OK                                            |
| `statusCode`                                  | *Long*                                        | :heavy_check_mark:                            | HTTP Response Status Code                     | 200                                           |