# CoinAPI.OMS.API.SDK.Api.LocationApi

All URIs are relative to *https://ems-mgmt-sandbox.coinapi.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Locations**](LocationApi.md#locations) | **GET** /v1/locations | Get site locations


<a name="locations"></a>
# **Locations**
> List&lt;Locations&gt; Locations ()

Get site locations

This endpoint providing information about the server site locations supported in the EMS API.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using CoinAPI.OMS.API.SDK.Api;
using CoinAPI.OMS.API.SDK.Client;
using CoinAPI.OMS.API.SDK.Model;

namespace Example
{
    public class LocationsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://ems-mgmt-sandbox.coinapi.io";
            // Configure API key authorization: APIKeyHeader
            config.AddApiKey("X-CoinAPI-Key", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("X-CoinAPI-Key", "Bearer");
            // Configure API key authorization: APIKeyQueryParam
            config.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new LocationApi(config);

            try
            {
                // Get site locations
                List<Locations> result = apiInstance.Locations();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling LocationApi.Locations: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Locations&gt;**](Locations.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
