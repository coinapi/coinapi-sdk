

# UniswapV3TickDayDataDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entryTime** | [**Date**](Date.md) |  |  [optional]
**recvTime** | [**Date**](Date.md) |  |  [optional]
**blockNumber** | **Long** | Number of block in which entity was recorded. |  [optional]
**id** | **String** | Identifier, format: &lt;pool address&gt;-&lt;tick index&gt;-&lt;timestamp&gt;. |  [optional]
**date** | **Integer** | Timestamp rounded to current day by dividing by 86400. |  [optional]
**pool** | **String** | Pointer to pool. |  [optional]
**tick** | **String** | Pointer to tick. |  [optional]
**liquidityGross** | **String** | Total liquidity pool has as tick lower or upper at end of period. |  [optional]
**liquidityNet** | **String** | How much liquidity changes when tick crossed at end of period. |  [optional]
**volumeToken0** | **String** | Hourly volume of token0 with this tick in range. |  [optional]
**volumeToken1** | **String** | Hourly volume of token1 with this tick in range. |  [optional]
**volumeUsd** | **String** | Hourly volume in derived USD with this tick in range. |  [optional]
**feesUsd** | **String** | Fees in USD. |  [optional]
**feeGrowthOutside0x128** | **String** | Variable needed for fee computation. |  [optional]
**feeGrowthOutside1x128** | **String** | Variable needed for fee computation. |  [optional]
**vid** | **Long** |  |  [optional]



