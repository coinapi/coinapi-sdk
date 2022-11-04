# WWW::OpenAPIClient::Object::UniswapV3MintV3DTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::UniswapV3MintV3DTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entry_time** | **DATE_TIME** |  | [optional] 
**recv_time** | **DATE_TIME** |  | [optional] 
**block_number** | **int** | Number of block in which entity was recorded. | [optional] 
**id** | **string** | Transaction hash + &#39;#&#39; + index in mints Transaction array. | [optional] 
**transaction** | **string** | Which txn the mint was included in. | [optional] 
**timestamp** | **string** | Time of transaction. | [optional] 
**pool** | **string** | Pool address. | [optional] 
**token_0** | **string** | Reference to token0 as stored in pool contract. | [optional] 
**token_1** | **string** | Reference to token1 as stored in pool contract. | [optional] 
**owner** | **string** | Owner of position where liquidity minted to. | [optional] 
**sender** | **string** | The address that minted the liquidity. | [optional] 
**origin** | **string** | Transaction origin: the EOA (Externally Owned Account) that initiated the transaction. | [optional] 
**amount** | **string** | Amount of liquidity minted. | [optional] 
**amount_0** | **string** | Amount of token 0 minted. | [optional] 
**amount_1** | **string** | Amount of token 1 minted. | [optional] 
**amount_usd** | **string** | Derived amount based on available prices of tokens. | [optional] 
**tick_lower** | **string** | Lower tick of the position. | [optional] 
**tick_upper** | **string** | Upper tick of the position. | [optional] 
**log_index** | **string** | Order within the transaction. | [optional] 
**vid** | **int** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

