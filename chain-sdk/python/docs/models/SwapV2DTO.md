# openapi_client.model.swap_v2_dto.SwapV2DTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**entry_time** | str, datetime,  | str,  |  | [optional] value must conform to RFC-3339 date-time
**recv_time** | str, datetime,  | str,  |  | [optional] value must conform to RFC-3339 date-time
**block_number** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] value must be a 64 bit integer
**vid** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] value must be a 64 bit integer
**id** | None, str,  | NoneClass, str,  |  | [optional] 
**transaction** | None, str,  | NoneClass, str,  |  | [optional] 
**timestamp** | str, datetime,  | str,  |  | [optional] value must conform to RFC-3339 date-time
**pair** | None, str,  | NoneClass, str,  |  | [optional] 
**sender** | None, str,  | NoneClass, str,  |  | [optional] 
**from** | None, str,  | NoneClass, str,  |  | [optional] 
**amount_0_in** | None, str,  | NoneClass, str,  |  | [optional] 
**amount_1_in** | None, str,  | NoneClass, str,  |  | [optional] 
**amount_0_out** | None, str,  | NoneClass, str,  |  | [optional] 
**amount_1_out** | None, str,  | NoneClass, str,  |  | [optional] 
**to** | None, str,  | NoneClass, str,  |  | [optional] 
**log_index** | [**BigInteger**](BigInteger.md) | [**BigInteger**](BigInteger.md) |  | [optional] 
**amount_usd** | None, str,  | NoneClass, str,  |  | [optional] 
**evaluated_price** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] value must be a 64 bit float
**evaluated_amount** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] value must be a 64 bit float
**evaluated_aggressor** | [**ETradeAggressiveSide**](ETradeAggressiveSide.md) | [**ETradeAggressiveSide**](ETradeAggressiveSide.md) |  | [optional] 
**pool_id** | None, str,  | NoneClass, str,  |  | [optional] 
**transaction_id** | None, str,  | NoneClass, str,  |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
