

# UniswapV3TokenV3DTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryTime** | [**Date**](Date.md) |  |  [optional]
**recvTime** | [**Date**](Date.md) |  |  [optional]
**blockNumber** | **Long** | Number of block in which entity was recorded. |  [optional]
**vid** | **Long** |  |  [optional]
**id** | **String** | Token address. |  [optional]
**symbol** | **String** | Token symbol. |  [optional]
**name** | **String** | Token name. |  [optional]
**decimals** | **Integer** | Token decimals. |  [optional]
**totalSupply** | [**NumericsBigInteger**](NumericsBigInteger.md) |  |  [optional]
**volume** | **String** | Volume in token units. |  [optional]
**volumeUsd** | **String** | Volume in derived USD. |  [optional]
**untrackedVolumeUsd** | **String** | Volume in USD even on pools with less reliable USD values. |  [optional]
**feesUsd** | **String** | Fees in USD. |  [optional]
**txCount** | [**NumericsBigInteger**](NumericsBigInteger.md) |  |  [optional]
**poolCount** | [**NumericsBigInteger**](NumericsBigInteger.md) |  |  [optional]
**totalValueLocked** | **String** | Liquidity across all pools in token units. |  [optional]
**totalValueLockedUsd** | **String** | Liquidity across all pools in derived USD. |  [optional]
**totalValueLockedUsdUntracked** | **String** | TVL derived in USD untracked. |  [optional]
**derivedEth** | **String** | Derived price in ETH. |  [optional]
**whitelistPools** | **List&lt;String&gt;** | Pools token is in that are white listed for USD pricing. |  [optional]
**tokenSymbol** | **String** |  |  [optional] [readonly]



