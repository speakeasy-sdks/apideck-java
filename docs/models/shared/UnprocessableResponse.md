# UnprocessableResponse


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `detail`                                                                                    | *String*                                                                                    | :heavy_minus_sign:                                                                          | Contains parameter or domain specific information related to the error and why it occurred. | Unprocessable request, please verify your request headers and body.                         |
| `error`                                                                                     | *String*                                                                                    | :heavy_minus_sign:                                                                          | Contains an explanation of the status_code as defined in HTTP/1.1 standard (RFC 7231)       | Unprocessable Entity                                                                        |
| `message`                                                                                   | *String*                                                                                    | :heavy_minus_sign:                                                                          | A human-readable message providing more details about the error.                            | Invalid State                                                                               |
| `ref`                                                                                       | *String*                                                                                    | :heavy_minus_sign:                                                                          | Link to documentation of error type                                                         | https://developers.apideck.com/errors#invalidstateerror                                     |
| `statusCode`                                                                                | *Double*                                                                                    | :heavy_minus_sign:                                                                          | HTTP status code                                                                            | 422                                                                                         |
| `typeName`                                                                                  | *String*                                                                                    | :heavy_minus_sign:                                                                          | The type of error returned                                                                  | InvalidStateError                                                                           |