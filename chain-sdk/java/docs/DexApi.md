# DexApi

All URIs are relative to *https://onchain.coinapi.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dexBatchsCurrent**](DexApi.md#dexBatchsCurrent) | **GET** /dapps/dex/batchs/current | Batchs (current) |
| [**dexDepositsCurrent**](DexApi.md#dexDepositsCurrent) | **GET** /dapps/dex/deposits/current | Deposits (current) |
| [**dexGetBatchsHistorical**](DexApi.md#dexGetBatchsHistorical) | **GET** /dapps/dex/batchs/historical | Batchs (historical) 🔥 |
| [**dexGetDepositsHistorical**](DexApi.md#dexGetDepositsHistorical) | **GET** /dapps/dex/deposits/historical | Deposits (historical) 🔥 |
| [**dexGetOrdersHistorical**](DexApi.md#dexGetOrdersHistorical) | **GET** /dapps/dex/orders/historical | Orders (historical) 🔥 |
| [**dexGetPricesHistorical**](DexApi.md#dexGetPricesHistorical) | **GET** /dapps/dex/prices/historical | Prices (historical) 🔥 |
| [**dexGetSolutionsHistorical**](DexApi.md#dexGetSolutionsHistorical) | **GET** /dapps/dex/solutions/historical | Solutions (historical) 🔥 |
| [**dexGetStatssHistorical**](DexApi.md#dexGetStatssHistorical) | **GET** /dapps/dex/statss/historical | Statss (historical) 🔥 |
| [**dexGetTokensHistorical**](DexApi.md#dexGetTokensHistorical) | **GET** /dapps/dex/tokens/historical | Tokens (historical) 🔥 |
| [**dexGetTradesHistorical**](DexApi.md#dexGetTradesHistorical) | **GET** /dapps/dex/trades/historical | Trades (historical) 🔥 |
| [**dexGetUsersHistorical**](DexApi.md#dexGetUsersHistorical) | **GET** /dapps/dex/users/historical | Users (historical) 🔥 |
| [**dexGetWithdrawRequestsHistorical**](DexApi.md#dexGetWithdrawRequestsHistorical) | **GET** /dapps/dex/withdrawRequests/historical | WithdrawRequests (historical) 🔥 |
| [**dexGetWithdrawsHistorical**](DexApi.md#dexGetWithdrawsHistorical) | **GET** /dapps/dex/withdraws/historical | Withdraws (historical) 🔥 |
| [**dexOrdersCurrent**](DexApi.md#dexOrdersCurrent) | **GET** /dapps/dex/orders/current | Orders (current) |
| [**dexPricesCurrent**](DexApi.md#dexPricesCurrent) | **GET** /dapps/dex/prices/current | Prices (current) |
| [**dexSolutionsCurrent**](DexApi.md#dexSolutionsCurrent) | **GET** /dapps/dex/solutions/current | Solutions (current) |
| [**dexStatssCurrent**](DexApi.md#dexStatssCurrent) | **GET** /dapps/dex/statss/current | Statss (current) |
| [**dexTokensCurrent**](DexApi.md#dexTokensCurrent) | **GET** /dapps/dex/tokens/current | Tokens (current) |
| [**dexTradesCurrent**](DexApi.md#dexTradesCurrent) | **GET** /dapps/dex/trades/current | Trades (current) |
| [**dexUsersCurrent**](DexApi.md#dexUsersCurrent) | **GET** /dapps/dex/users/current | Users (current) |
| [**dexWithdrawRequestsCurrent**](DexApi.md#dexWithdrawRequestsCurrent) | **GET** /dapps/dex/withdrawRequests/current | WithdrawRequests (current) |
| [**dexWithdrawsCurrent**](DexApi.md#dexWithdrawsCurrent) | **GET** /dapps/dex/withdraws/current | Withdraws (current) |


<a name="dexBatchsCurrent"></a>
# **dexBatchsCurrent**
> List&lt;DexBatchDTO&gt; dexBatchsCurrent()

Batchs (current)

Gets batchs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexBatchDTO> result = apiInstance.dexBatchsCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexBatchsCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexBatchDTO&gt;**](DexBatchDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexDepositsCurrent"></a>
# **dexDepositsCurrent**
> List&lt;DexDepositDTO&gt; dexDepositsCurrent()

Deposits (current)

Gets deposits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexDepositDTO> result = apiInstance.dexDepositsCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexDepositsCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexDepositDTO&gt;**](DexDepositDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetBatchsHistorical"></a>
# **dexGetBatchsHistorical**
> List&lt;DexBatchDTO&gt; dexGetBatchsHistorical(startBlock, endBlock, startDate, endDate, id)

Batchs (historical) 🔥

Gets batchs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    Long endBlock = 56L; // Long | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The end date of timeframe.
    String id = "id_example"; // String | Identifier.
    try {
      List<DexBatchDTO> result = apiInstance.dexGetBatchsHistorical(startBlock, endBlock, startDate, endDate, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetBatchsHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**| The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | [optional] |
| **endBlock** | **Long**| The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | [optional] |
| **startDate** | **OffsetDateTime**| The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | [optional] |
| **endDate** | **OffsetDateTime**| The end date of timeframe. | [optional] |
| **id** | **String**| Identifier. | [optional] |

### Return type

[**List&lt;DexBatchDTO&gt;**](DexBatchDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetDepositsHistorical"></a>
# **dexGetDepositsHistorical**
> List&lt;DexDepositDTO&gt; dexGetDepositsHistorical(startBlock, endBlock, startDate, endDate, id, user)

Deposits (historical) 🔥

Gets deposits.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | 
    Long endBlock = 56L; // Long | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
    String id = "id_example"; // String | 
    String user = "user_example"; // String | 
    try {
      List<DexDepositDTO> result = apiInstance.dexGetDepositsHistorical(startBlock, endBlock, startDate, endDate, id, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetDepositsHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**|  | [optional] |
| **endBlock** | **Long**|  | [optional] |
| **startDate** | **OffsetDateTime**|  | [optional] |
| **endDate** | **OffsetDateTime**|  | [optional] |
| **id** | **String**|  | [optional] |
| **user** | **String**|  | [optional] |

### Return type

[**List&lt;DexDepositDTO&gt;**](DexDepositDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetOrdersHistorical"></a>
# **dexGetOrdersHistorical**
> List&lt;DexOrderDTO&gt; dexGetOrdersHistorical(startBlock, endBlock, startDate, endDate, id, buyToken, sellToken)

Orders (historical) 🔥

Gets orders.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | 
    Long endBlock = 56L; // Long | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
    String id = "id_example"; // String | 
    String buyToken = "buyToken_example"; // String | 
    String sellToken = "sellToken_example"; // String | 
    try {
      List<DexOrderDTO> result = apiInstance.dexGetOrdersHistorical(startBlock, endBlock, startDate, endDate, id, buyToken, sellToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetOrdersHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**|  | [optional] |
| **endBlock** | **Long**|  | [optional] |
| **startDate** | **OffsetDateTime**|  | [optional] |
| **endDate** | **OffsetDateTime**|  | [optional] |
| **id** | **String**|  | [optional] |
| **buyToken** | **String**|  | [optional] |
| **sellToken** | **String**|  | [optional] |

### Return type

[**List&lt;DexOrderDTO&gt;**](DexOrderDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetPricesHistorical"></a>
# **dexGetPricesHistorical**
> List&lt;DexPriceDTO&gt; dexGetPricesHistorical(startBlock, endBlock, startDate, endDate, id)

Prices (historical) 🔥

Gets prices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | 
    Long endBlock = 56L; // Long | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
    String id = "id_example"; // String | 
    try {
      List<DexPriceDTO> result = apiInstance.dexGetPricesHistorical(startBlock, endBlock, startDate, endDate, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetPricesHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**|  | [optional] |
| **endBlock** | **Long**|  | [optional] |
| **startDate** | **OffsetDateTime**|  | [optional] |
| **endDate** | **OffsetDateTime**|  | [optional] |
| **id** | **String**|  | [optional] |

### Return type

[**List&lt;DexPriceDTO&gt;**](DexPriceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetSolutionsHistorical"></a>
# **dexGetSolutionsHistorical**
> List&lt;DexSolutionDTO&gt; dexGetSolutionsHistorical(startBlock, endBlock, startDate, endDate, id)

Solutions (historical) 🔥

Gets solutions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    Long endBlock = 56L; // Long | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The end date of timeframe.
    String id = "id_example"; // String | 
    try {
      List<DexSolutionDTO> result = apiInstance.dexGetSolutionsHistorical(startBlock, endBlock, startDate, endDate, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetSolutionsHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**| The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | [optional] |
| **endBlock** | **Long**| The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | [optional] |
| **startDate** | **OffsetDateTime**| The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | [optional] |
| **endDate** | **OffsetDateTime**| The end date of timeframe. | [optional] |
| **id** | **String**|  | [optional] |

### Return type

[**List&lt;DexSolutionDTO&gt;**](DexSolutionDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetStatssHistorical"></a>
# **dexGetStatssHistorical**
> List&lt;DexStatsDTO&gt; dexGetStatssHistorical(startBlock, endBlock, startDate, endDate, id)

Statss (historical) 🔥

Gets statss.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    Long endBlock = 56L; // Long | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The end date of timeframe.
    String id = "id_example"; // String | 
    try {
      List<DexStatsDTO> result = apiInstance.dexGetStatssHistorical(startBlock, endBlock, startDate, endDate, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetStatssHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**| The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | [optional] |
| **endBlock** | **Long**| The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | [optional] |
| **startDate** | **OffsetDateTime**| The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | [optional] |
| **endDate** | **OffsetDateTime**| The end date of timeframe. | [optional] |
| **id** | **String**|  | [optional] |

### Return type

[**List&lt;DexStatsDTO&gt;**](DexStatsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetTokensHistorical"></a>
# **dexGetTokensHistorical**
> List&lt;DexTokenDTO&gt; dexGetTokensHistorical(startBlock, endBlock, startDate, endDate, id, address, symbol, name)

Tokens (historical) 🔥

Gets tokens.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    Long endBlock = 56L; // Long | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The end date of timeframe.
    String id = "id_example"; // String | 
    String address = "address_example"; // String | 
    String symbol = "symbol_example"; // String | 
    String name = "name_example"; // String | 
    try {
      List<DexTokenDTO> result = apiInstance.dexGetTokensHistorical(startBlock, endBlock, startDate, endDate, id, address, symbol, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetTokensHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**| The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | [optional] |
| **endBlock** | **Long**| The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | [optional] |
| **startDate** | **OffsetDateTime**| The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | [optional] |
| **endDate** | **OffsetDateTime**| The end date of timeframe. | [optional] |
| **id** | **String**|  | [optional] |
| **address** | **String**|  | [optional] |
| **symbol** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |

### Return type

[**List&lt;DexTokenDTO&gt;**](DexTokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetTradesHistorical"></a>
# **dexGetTradesHistorical**
> List&lt;DexTradeDTO&gt; dexGetTradesHistorical(startBlock, endBlock, startDate, endDate, id, buyToken, sellToken)

Trades (historical) 🔥

Gets trades.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    Long endBlock = 56L; // Long | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The end date of timeframe.
    String id = "id_example"; // String | 
    String buyToken = "buyToken_example"; // String | 
    String sellToken = "sellToken_example"; // String | 
    try {
      List<DexTradeDTO> result = apiInstance.dexGetTradesHistorical(startBlock, endBlock, startDate, endDate, id, buyToken, sellToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetTradesHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**| The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | [optional] |
| **endBlock** | **Long**| The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | [optional] |
| **startDate** | **OffsetDateTime**| The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | [optional] |
| **endDate** | **OffsetDateTime**| The end date of timeframe. | [optional] |
| **id** | **String**|  | [optional] |
| **buyToken** | **String**|  | [optional] |
| **sellToken** | **String**|  | [optional] |

### Return type

[**List&lt;DexTradeDTO&gt;**](DexTradeDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetUsersHistorical"></a>
# **dexGetUsersHistorical**
> List&lt;DexUserDTO&gt; dexGetUsersHistorical(startBlock, endBlock, startDate, endDate, id)

Users (historical) 🔥

Gets users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    Long endBlock = 56L; // Long | The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The end date of timeframe.
    String id = "id_example"; // String | 
    try {
      List<DexUserDTO> result = apiInstance.dexGetUsersHistorical(startBlock, endBlock, startDate, endDate, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetUsersHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**| The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock. | [optional] |
| **endBlock** | **Long**| The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock). | [optional] |
| **startDate** | **OffsetDateTime**| The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included. | [optional] |
| **endDate** | **OffsetDateTime**| The end date of timeframe. | [optional] |
| **id** | **String**|  | [optional] |

### Return type

[**List&lt;DexUserDTO&gt;**](DexUserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetWithdrawRequestsHistorical"></a>
# **dexGetWithdrawRequestsHistorical**
> List&lt;DexWithdrawRequestDTO&gt; dexGetWithdrawRequestsHistorical(startBlock, endBlock, startDate, endDate, id, user)

WithdrawRequests (historical) 🔥

Gets withdrawRequests.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | 
    Long endBlock = 56L; // Long | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
    String id = "id_example"; // String | 
    String user = "user_example"; // String | 
    try {
      List<DexWithdrawRequestDTO> result = apiInstance.dexGetWithdrawRequestsHistorical(startBlock, endBlock, startDate, endDate, id, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetWithdrawRequestsHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**|  | [optional] |
| **endBlock** | **Long**|  | [optional] |
| **startDate** | **OffsetDateTime**|  | [optional] |
| **endDate** | **OffsetDateTime**|  | [optional] |
| **id** | **String**|  | [optional] |
| **user** | **String**|  | [optional] |

### Return type

[**List&lt;DexWithdrawRequestDTO&gt;**](DexWithdrawRequestDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexGetWithdrawsHistorical"></a>
# **dexGetWithdrawsHistorical**
> List&lt;DexWithdrawDTO&gt; dexGetWithdrawsHistorical(startBlock, endBlock, startDate, endDate, id, user)

Withdraws (historical) 🔥

Gets withdraws.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    Long startBlock = 56L; // Long | 
    Long endBlock = 56L; // Long | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
    String id = "id_example"; // String | 
    String user = "user_example"; // String | 
    try {
      List<DexWithdrawDTO> result = apiInstance.dexGetWithdrawsHistorical(startBlock, endBlock, startDate, endDate, id, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexGetWithdrawsHistorical");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startBlock** | **Long**|  | [optional] |
| **endBlock** | **Long**|  | [optional] |
| **startDate** | **OffsetDateTime**|  | [optional] |
| **endDate** | **OffsetDateTime**|  | [optional] |
| **id** | **String**|  | [optional] |
| **user** | **String**|  | [optional] |

### Return type

[**List&lt;DexWithdrawDTO&gt;**](DexWithdrawDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexOrdersCurrent"></a>
# **dexOrdersCurrent**
> List&lt;DexOrderDTO&gt; dexOrdersCurrent()

Orders (current)

Gets orders.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexOrderDTO> result = apiInstance.dexOrdersCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexOrdersCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexOrderDTO&gt;**](DexOrderDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexPricesCurrent"></a>
# **dexPricesCurrent**
> List&lt;DexPriceDTO&gt; dexPricesCurrent()

Prices (current)

Gets prices.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexPriceDTO> result = apiInstance.dexPricesCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexPricesCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexPriceDTO&gt;**](DexPriceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexSolutionsCurrent"></a>
# **dexSolutionsCurrent**
> List&lt;DexSolutionDTO&gt; dexSolutionsCurrent()

Solutions (current)

Gets solutions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexSolutionDTO> result = apiInstance.dexSolutionsCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexSolutionsCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexSolutionDTO&gt;**](DexSolutionDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexStatssCurrent"></a>
# **dexStatssCurrent**
> List&lt;DexStatsDTO&gt; dexStatssCurrent()

Statss (current)

Gets statss.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexStatsDTO> result = apiInstance.dexStatssCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexStatssCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexStatsDTO&gt;**](DexStatsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexTokensCurrent"></a>
# **dexTokensCurrent**
> List&lt;DexTokenDTO&gt; dexTokensCurrent()

Tokens (current)

Gets tokens.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexTokenDTO> result = apiInstance.dexTokensCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexTokensCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexTokenDTO&gt;**](DexTokenDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexTradesCurrent"></a>
# **dexTradesCurrent**
> List&lt;DexTradeDTO&gt; dexTradesCurrent()

Trades (current)

Gets trades.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexTradeDTO> result = apiInstance.dexTradesCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexTradesCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexTradeDTO&gt;**](DexTradeDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexUsersCurrent"></a>
# **dexUsersCurrent**
> List&lt;DexUserDTO&gt; dexUsersCurrent()

Users (current)

Gets users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexUserDTO> result = apiInstance.dexUsersCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexUsersCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexUserDTO&gt;**](DexUserDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexWithdrawRequestsCurrent"></a>
# **dexWithdrawRequestsCurrent**
> List&lt;DexWithdrawRequestDTO&gt; dexWithdrawRequestsCurrent()

WithdrawRequests (current)

Gets withdrawRequests.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexWithdrawRequestDTO> result = apiInstance.dexWithdrawRequestsCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexWithdrawRequestsCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexWithdrawRequestDTO&gt;**](DexWithdrawRequestDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

<a name="dexWithdrawsCurrent"></a>
# **dexWithdrawsCurrent**
> List&lt;DexWithdrawDTO&gt; dexWithdrawsCurrent()

Withdraws (current)

Gets withdraws.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DexApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://onchain.coinapi.io");

    DexApi apiInstance = new DexApi(defaultClient);
    try {
      List<DexWithdrawDTO> result = apiInstance.dexWithdrawsCurrent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DexApi#dexWithdrawsCurrent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DexWithdrawDTO&gt;**](DexWithdrawDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
