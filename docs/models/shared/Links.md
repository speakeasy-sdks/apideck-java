# Links

Links to navigate to previous or next pages through the API


## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `current`                                                                 | *Optional<? extends String>*                                              | :heavy_minus_sign:                                                        | Link to navigate to the current page through the API                      | https://unify.apideck.com/crm/companies                                   |
| `next`                                                                    | *JsonNullable<? extends String>*                                          | :heavy_minus_sign:                                                        | Link to navigate to the previous page through the API                     | https://unify.apideck.com/crm/companies?cursor=em9oby1jcm06OnBhZ2U6OjM    |
| `previous`                                                                | *JsonNullable<? extends String>*                                          | :heavy_minus_sign:                                                        | Link to navigate to the previous page through the API                     | https://unify.apideck.com/crm/companies?cursor=em9oby1jcm06OnBhZ2U6OjE%3D |