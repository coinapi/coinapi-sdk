# WWW::OpenAPIClient::Object::SwapV3DTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::SwapV3DTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entry_time** | **DATE_TIME** |  | [optional] 
**recv_time** | **DATE_TIME** |  | [optional] 
**block_number** | **int** |  | [optional] 
**vid** | **int** |  | [optional] 
**id** | **string** |  | [optional] 
**transaction** | **string** |  | [optional] 
**timestamp** | **DATE_TIME** |  | [optional] 
**pool** | **string** |  | [optional] 
**token_0** | **string** |  | [optional] 
**token_1** | **string** |  | [optional] 
**sender** | **string** |  | [optional] 
**recipient** | **string** |  | [optional] 
**origin** | **string** |  | [optional] 
**amount_0** | **string** |  | [optional] 
**amount_1** | **string** |  | [optional] 
**amount_usd** | **string** |  | [optional] 
**sqrt_price_x96** | [**BigInteger**](BigInteger.md) |  | [optional] 
**tick** | [**BigInteger**](BigInteger.md) |  | [optional] 
**log_index** | [**BigInteger**](BigInteger.md) |  | [optional] 
**evaluated_price** | **double** |  | [optional] [readonly] 
**evaluated_amount** | **double** |  | [optional] [readonly] 
**evaluated_aggressor** | [**ETradeAggressiveSide**](ETradeAggressiveSide.md) |  | [optional] 
**pool_id** | **string** |  | [optional] [readonly] 
**transaction_id** | **string** |  | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

