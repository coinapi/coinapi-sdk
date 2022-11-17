# \DexApi

All URIs are relative to *https://onchain.coinapi.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DexBatchsCurrent**](DexApi.md#DexBatchsCurrent) | **Get** /dapps/dex/batchs/current | Batchs (current)
[**DexDepositsCurrent**](DexApi.md#DexDepositsCurrent) | **Get** /dapps/dex/deposits/current | Deposits (current)
[**DexGetBatchsHistorical**](DexApi.md#DexGetBatchsHistorical) | **Get** /dapps/dex/batchs/historical | Batchs (historical) 🔥
[**DexGetDepositsHistorical**](DexApi.md#DexGetDepositsHistorical) | **Get** /dapps/dex/deposits/historical | Deposits (historical) 🔥
[**DexGetOrdersHistorical**](DexApi.md#DexGetOrdersHistorical) | **Get** /dapps/dex/orders/historical | Orders (historical) 🔥
[**DexGetPricesHistorical**](DexApi.md#DexGetPricesHistorical) | **Get** /dapps/dex/prices/historical | Prices (historical) 🔥
[**DexGetSolutionsHistorical**](DexApi.md#DexGetSolutionsHistorical) | **Get** /dapps/dex/solutions/historical | Solutions (historical) 🔥
[**DexGetStatssHistorical**](DexApi.md#DexGetStatssHistorical) | **Get** /dapps/dex/statss/historical | Statss (historical) 🔥
[**DexGetTokensHistorical**](DexApi.md#DexGetTokensHistorical) | **Get** /dapps/dex/tokens/historical | Tokens (historical) 🔥
[**DexGetTradesHistorical**](DexApi.md#DexGetTradesHistorical) | **Get** /dapps/dex/trades/historical | Trades (historical) 🔥
[**DexGetUsersHistorical**](DexApi.md#DexGetUsersHistorical) | **Get** /dapps/dex/users/historical | Users (historical) 🔥
[**DexGetWithdrawRequestsHistorical**](DexApi.md#DexGetWithdrawRequestsHistorical) | **Get** /dapps/dex/withdrawRequests/historical | WithdrawRequests (historical) 🔥
[**DexGetWithdrawsHistorical**](DexApi.md#DexGetWithdrawsHistorical) | **Get** /dapps/dex/withdraws/historical | Withdraws (historical) 🔥
[**DexOrdersCurrent**](DexApi.md#DexOrdersCurrent) | **Get** /dapps/dex/orders/current | Orders (current)
[**DexPricesCurrent**](DexApi.md#DexPricesCurrent) | **Get** /dapps/dex/prices/current | Prices (current)
[**DexSolutionsCurrent**](DexApi.md#DexSolutionsCurrent) | **Get** /dapps/dex/solutions/current | Solutions (current)
[**DexStatssCurrent**](DexApi.md#DexStatssCurrent) | **Get** /dapps/dex/statss/current | Statss (current)
[**DexTokensCurrent**](DexApi.md#DexTokensCurrent) | **Get** /dapps/dex/tokens/current | Tokens (current)
[**DexTradesCurrent**](DexApi.md#DexTradesCurrent) | **Get** /dapps/dex/trades/current | Trades (current)
[**DexUsersCurrent**](DexApi.md#DexUsersCurrent) | **Get** /dapps/dex/users/current | Users (current)
[**DexWithdrawRequestsCurrent**](DexApi.md#DexWithdrawRequestsCurrent) | **Get** /dapps/dex/withdrawRequests/current | WithdrawRequests (current)
[**DexWithdrawsCurrent**](DexApi.md#DexWithdrawsCurrent) | **Get** /dapps/dex/withdraws/current | Withdraws (current)



## DexBatchsCurrent

> []DexBatchDTO DexBatchsCurrent(ctx).Execute()

Batchs (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexBatchsCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexBatchsCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexBatchsCurrent`: []DexBatchDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexBatchsCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexBatchsCurrentRequest struct via the builder pattern


### Return type

[**[]DexBatchDTO**](DexBatchDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexDepositsCurrent

> []DexDepositDTO DexDepositsCurrent(ctx).Execute()

Deposits (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexDepositsCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexDepositsCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexDepositsCurrent`: []DexDepositDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexDepositsCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexDepositsCurrentRequest struct via the builder pattern


### Return type

[**[]DexDepositDTO**](DexDepositDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetBatchsHistorical

> []DexBatchDTO DexGetBatchsHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()

Batchs (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
    endBlock := int64(789) // int64 | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
    startDate := time.Now() // time.Time | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
    endDate := time.Now() // time.Time | The end date of timeframe. (optional)
    id := "id_example" // string | Identifier. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetBatchsHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetBatchsHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetBatchsHistorical`: []DexBatchDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetBatchsHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetBatchsHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | 
 **endBlock** | **int64** | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | 
 **startDate** | **time.Time** | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | 
 **endDate** | **time.Time** | The end date of timeframe. | 
 **id** | **string** | Identifier. | 

### Return type

[**[]DexBatchDTO**](DexBatchDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetDepositsHistorical

> []DexDepositDTO DexGetDepositsHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).User(user).Execute()

Deposits (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 |  (optional)
    endBlock := int64(789) // int64 |  (optional)
    startDate := time.Now() // time.Time |  (optional)
    endDate := time.Now() // time.Time |  (optional)
    id := "id_example" // string |  (optional)
    user := "user_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetDepositsHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetDepositsHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetDepositsHistorical`: []DexDepositDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetDepositsHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetDepositsHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** |  | 
 **endBlock** | **int64** |  | 
 **startDate** | **time.Time** |  | 
 **endDate** | **time.Time** |  | 
 **id** | **string** |  | 
 **user** | **string** |  | 

### Return type

[**[]DexDepositDTO**](DexDepositDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetOrdersHistorical

> []DexOrderDTO DexGetOrdersHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).BuyToken(buyToken).SellToken(sellToken).Execute()

Orders (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 |  (optional)
    endBlock := int64(789) // int64 |  (optional)
    startDate := time.Now() // time.Time |  (optional)
    endDate := time.Now() // time.Time |  (optional)
    id := "id_example" // string |  (optional)
    buyToken := "buyToken_example" // string |  (optional)
    sellToken := "sellToken_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetOrdersHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).BuyToken(buyToken).SellToken(sellToken).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetOrdersHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetOrdersHistorical`: []DexOrderDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetOrdersHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetOrdersHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** |  | 
 **endBlock** | **int64** |  | 
 **startDate** | **time.Time** |  | 
 **endDate** | **time.Time** |  | 
 **id** | **string** |  | 
 **buyToken** | **string** |  | 
 **sellToken** | **string** |  | 

### Return type

[**[]DexOrderDTO**](DexOrderDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetPricesHistorical

> []DexPriceDTO DexGetPricesHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()

Prices (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 |  (optional)
    endBlock := int64(789) // int64 |  (optional)
    startDate := time.Now() // time.Time |  (optional)
    endDate := time.Now() // time.Time |  (optional)
    id := "id_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetPricesHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetPricesHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetPricesHistorical`: []DexPriceDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetPricesHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetPricesHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** |  | 
 **endBlock** | **int64** |  | 
 **startDate** | **time.Time** |  | 
 **endDate** | **time.Time** |  | 
 **id** | **string** |  | 

### Return type

[**[]DexPriceDTO**](DexPriceDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetSolutionsHistorical

> []DexSolutionDTO DexGetSolutionsHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()

Solutions (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
    endBlock := int64(789) // int64 | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
    startDate := time.Now() // time.Time | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
    endDate := time.Now() // time.Time | The end date of timeframe. (optional)
    id := "id_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetSolutionsHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetSolutionsHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetSolutionsHistorical`: []DexSolutionDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetSolutionsHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetSolutionsHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | 
 **endBlock** | **int64** | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | 
 **startDate** | **time.Time** | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | 
 **endDate** | **time.Time** | The end date of timeframe. | 
 **id** | **string** |  | 

### Return type

[**[]DexSolutionDTO**](DexSolutionDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetStatssHistorical

> []DexStatsDTO DexGetStatssHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()

Statss (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
    endBlock := int64(789) // int64 | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
    startDate := time.Now() // time.Time | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
    endDate := time.Now() // time.Time | The end date of timeframe. (optional)
    id := "id_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetStatssHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetStatssHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetStatssHistorical`: []DexStatsDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetStatssHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetStatssHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | 
 **endBlock** | **int64** | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | 
 **startDate** | **time.Time** | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | 
 **endDate** | **time.Time** | The end date of timeframe. | 
 **id** | **string** |  | 

### Return type

[**[]DexStatsDTO**](DexStatsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetTokensHistorical

> []DexTokenDTO DexGetTokensHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Address(address).Symbol(symbol).Name(name).Execute()

Tokens (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
    endBlock := int64(789) // int64 | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
    startDate := time.Now() // time.Time | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
    endDate := time.Now() // time.Time | The end date of timeframe. (optional)
    id := "id_example" // string |  (optional)
    address := "address_example" // string |  (optional)
    symbol := "symbol_example" // string |  (optional)
    name := "name_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetTokensHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Address(address).Symbol(symbol).Name(name).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetTokensHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetTokensHistorical`: []DexTokenDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetTokensHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetTokensHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | 
 **endBlock** | **int64** | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | 
 **startDate** | **time.Time** | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | 
 **endDate** | **time.Time** | The end date of timeframe. | 
 **id** | **string** |  | 
 **address** | **string** |  | 
 **symbol** | **string** |  | 
 **name** | **string** |  | 

### Return type

[**[]DexTokenDTO**](DexTokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetTradesHistorical

> []DexTradeDTO DexGetTradesHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).BuyToken(buyToken).SellToken(sellToken).Execute()

Trades (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
    endBlock := int64(789) // int64 | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
    startDate := time.Now() // time.Time | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
    endDate := time.Now() // time.Time | The end date of timeframe. (optional)
    id := "id_example" // string |  (optional)
    buyToken := "buyToken_example" // string |  (optional)
    sellToken := "sellToken_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetTradesHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).BuyToken(buyToken).SellToken(sellToken).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetTradesHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetTradesHistorical`: []DexTradeDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetTradesHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetTradesHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | 
 **endBlock** | **int64** | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | 
 **startDate** | **time.Time** | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | 
 **endDate** | **time.Time** | The end date of timeframe. | 
 **id** | **string** |  | 
 **buyToken** | **string** |  | 
 **sellToken** | **string** |  | 

### Return type

[**[]DexTradeDTO**](DexTradeDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetUsersHistorical

> []DexUserDTO DexGetUsersHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()

Users (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. (optional)
    endBlock := int64(789) // int64 | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). (optional)
    startDate := time.Now() // time.Time | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. (optional)
    endDate := time.Now() // time.Time | The end date of timeframe. (optional)
    id := "id_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetUsersHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetUsersHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetUsersHistorical`: []DexUserDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetUsersHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetUsersHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | 
 **endBlock** | **int64** | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | 
 **startDate** | **time.Time** | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | 
 **endDate** | **time.Time** | The end date of timeframe. | 
 **id** | **string** |  | 

### Return type

[**[]DexUserDTO**](DexUserDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetWithdrawRequestsHistorical

> []DexWithdrawRequestDTO DexGetWithdrawRequestsHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).User(user).Execute()

WithdrawRequests (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 |  (optional)
    endBlock := int64(789) // int64 |  (optional)
    startDate := time.Now() // time.Time |  (optional)
    endDate := time.Now() // time.Time |  (optional)
    id := "id_example" // string |  (optional)
    user := "user_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetWithdrawRequestsHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetWithdrawRequestsHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetWithdrawRequestsHistorical`: []DexWithdrawRequestDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetWithdrawRequestsHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetWithdrawRequestsHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** |  | 
 **endBlock** | **int64** |  | 
 **startDate** | **time.Time** |  | 
 **endDate** | **time.Time** |  | 
 **id** | **string** |  | 
 **user** | **string** |  | 

### Return type

[**[]DexWithdrawRequestDTO**](DexWithdrawRequestDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexGetWithdrawsHistorical

> []DexWithdrawDTO DexGetWithdrawsHistorical(ctx).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).User(user).Execute()

Withdraws (historical) 🔥



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    "time"
    openapiclient "./openapi"
)

func main() {
    startBlock := int64(789) // int64 |  (optional)
    endBlock := int64(789) // int64 |  (optional)
    startDate := time.Now() // time.Time |  (optional)
    endDate := time.Now() // time.Time |  (optional)
    id := "id_example" // string |  (optional)
    user := "user_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexGetWithdrawsHistorical(context.Background()).StartBlock(startBlock).EndBlock(endBlock).StartDate(startDate).EndDate(endDate).Id(id).User(user).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexGetWithdrawsHistorical``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexGetWithdrawsHistorical`: []DexWithdrawDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexGetWithdrawsHistorical`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDexGetWithdrawsHistoricalRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startBlock** | **int64** |  | 
 **endBlock** | **int64** |  | 
 **startDate** | **time.Time** |  | 
 **endDate** | **time.Time** |  | 
 **id** | **string** |  | 
 **user** | **string** |  | 

### Return type

[**[]DexWithdrawDTO**](DexWithdrawDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexOrdersCurrent

> []DexOrderDTO DexOrdersCurrent(ctx).Execute()

Orders (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexOrdersCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexOrdersCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexOrdersCurrent`: []DexOrderDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexOrdersCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexOrdersCurrentRequest struct via the builder pattern


### Return type

[**[]DexOrderDTO**](DexOrderDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexPricesCurrent

> []DexPriceDTO DexPricesCurrent(ctx).Execute()

Prices (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexPricesCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexPricesCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexPricesCurrent`: []DexPriceDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexPricesCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexPricesCurrentRequest struct via the builder pattern


### Return type

[**[]DexPriceDTO**](DexPriceDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexSolutionsCurrent

> []DexSolutionDTO DexSolutionsCurrent(ctx).Execute()

Solutions (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexSolutionsCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexSolutionsCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexSolutionsCurrent`: []DexSolutionDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexSolutionsCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexSolutionsCurrentRequest struct via the builder pattern


### Return type

[**[]DexSolutionDTO**](DexSolutionDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexStatssCurrent

> []DexStatsDTO DexStatssCurrent(ctx).Execute()

Statss (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexStatssCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexStatssCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexStatssCurrent`: []DexStatsDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexStatssCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexStatssCurrentRequest struct via the builder pattern


### Return type

[**[]DexStatsDTO**](DexStatsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexTokensCurrent

> []DexTokenDTO DexTokensCurrent(ctx).Execute()

Tokens (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexTokensCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexTokensCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexTokensCurrent`: []DexTokenDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexTokensCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexTokensCurrentRequest struct via the builder pattern


### Return type

[**[]DexTokenDTO**](DexTokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexTradesCurrent

> []DexTradeDTO DexTradesCurrent(ctx).Execute()

Trades (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexTradesCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexTradesCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexTradesCurrent`: []DexTradeDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexTradesCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexTradesCurrentRequest struct via the builder pattern


### Return type

[**[]DexTradeDTO**](DexTradeDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexUsersCurrent

> []DexUserDTO DexUsersCurrent(ctx).Execute()

Users (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexUsersCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexUsersCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexUsersCurrent`: []DexUserDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexUsersCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexUsersCurrentRequest struct via the builder pattern


### Return type

[**[]DexUserDTO**](DexUserDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexWithdrawRequestsCurrent

> []DexWithdrawRequestDTO DexWithdrawRequestsCurrent(ctx).Execute()

WithdrawRequests (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexWithdrawRequestsCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexWithdrawRequestsCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexWithdrawRequestsCurrent`: []DexWithdrawRequestDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexWithdrawRequestsCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexWithdrawRequestsCurrentRequest struct via the builder pattern


### Return type

[**[]DexWithdrawRequestDTO**](DexWithdrawRequestDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DexWithdrawsCurrent

> []DexWithdrawDTO DexWithdrawsCurrent(ctx).Execute()

Withdraws (current)



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DexApi.DexWithdrawsCurrent(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DexApi.DexWithdrawsCurrent``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DexWithdrawsCurrent`: []DexWithdrawDTO
    fmt.Fprintf(os.Stdout, "Response from `DexApi.DexWithdrawsCurrent`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiDexWithdrawsCurrentRequest struct via the builder pattern


### Return type

[**[]DexWithdrawDTO**](DexWithdrawDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)
