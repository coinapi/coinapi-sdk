# WWW::OpenAPIClient::Object::OrderExecutionReportAllOf

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrderExecutionReportAllOf;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**client_order_id_format_exchange** | **string** | The unique identifier of the order assigned by the client converted to the exchange order tag format for the purpose of tracking it. | 
**exchange_order_id** | **string** | The unique identifier of the order assigned by the exchange. | [optional] 
**amount_open** | **double** | Amount open | 
**amount_filled** | **double** | Amount filled | 
**status** | [**OrdStatus**](OrdStatus.md) |  | 
**time_order** | **ARRAY[ARRAY[string]]** | Timestamped history of order status changes. | 
**error_message** | **string** | Error message | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

