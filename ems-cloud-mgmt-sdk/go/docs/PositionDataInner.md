# PositionDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SymbolIdExchange** | Pointer to **string** | Exchange symbol. | [optional] 
**SymbolIdCoinapi** | Pointer to **string** | CoinAPI symbol. | [optional] 
**AvgEntryPrice** | Pointer to **float32** | Calculated average price of all fills on this position. | [optional] 
**Quantity** | Pointer to **float32** | The current position quantity. | [optional] 
**Side** | Pointer to [**OrdSide**](OrdSide.md) |  | [optional] 
**UnrealizedPnl** | Pointer to **float32** | Unrealised profit or loss (PNL) of this position. | [optional] 
**Leverage** | Pointer to **float32** | Leverage for this position reported by the exchange. | [optional] 
**CrossMargin** | Pointer to **bool** | Is cross margin mode enable for this position? | [optional] 
**LiquidationPrice** | Pointer to **float32** | Liquidation price. If mark price will reach this value, the position will be liquidated. | [optional] 
**RawData** | Pointer to **map[string]interface{}** |  | [optional] 

## Methods

### NewPositionDataInner

`func NewPositionDataInner() *PositionDataInner`

NewPositionDataInner instantiates a new PositionDataInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPositionDataInnerWithDefaults

`func NewPositionDataInnerWithDefaults() *PositionDataInner`

NewPositionDataInnerWithDefaults instantiates a new PositionDataInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSymbolIdExchange

`func (o *PositionDataInner) GetSymbolIdExchange() string`

GetSymbolIdExchange returns the SymbolIdExchange field if non-nil, zero value otherwise.

### GetSymbolIdExchangeOk

`func (o *PositionDataInner) GetSymbolIdExchangeOk() (*string, bool)`

GetSymbolIdExchangeOk returns a tuple with the SymbolIdExchange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbolIdExchange

`func (o *PositionDataInner) SetSymbolIdExchange(v string)`

SetSymbolIdExchange sets SymbolIdExchange field to given value.

### HasSymbolIdExchange

`func (o *PositionDataInner) HasSymbolIdExchange() bool`

HasSymbolIdExchange returns a boolean if a field has been set.

### GetSymbolIdCoinapi

`func (o *PositionDataInner) GetSymbolIdCoinapi() string`

GetSymbolIdCoinapi returns the SymbolIdCoinapi field if non-nil, zero value otherwise.

### GetSymbolIdCoinapiOk

`func (o *PositionDataInner) GetSymbolIdCoinapiOk() (*string, bool)`

GetSymbolIdCoinapiOk returns a tuple with the SymbolIdCoinapi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbolIdCoinapi

`func (o *PositionDataInner) SetSymbolIdCoinapi(v string)`

SetSymbolIdCoinapi sets SymbolIdCoinapi field to given value.

### HasSymbolIdCoinapi

`func (o *PositionDataInner) HasSymbolIdCoinapi() bool`

HasSymbolIdCoinapi returns a boolean if a field has been set.

### GetAvgEntryPrice

`func (o *PositionDataInner) GetAvgEntryPrice() float32`

GetAvgEntryPrice returns the AvgEntryPrice field if non-nil, zero value otherwise.

### GetAvgEntryPriceOk

`func (o *PositionDataInner) GetAvgEntryPriceOk() (*float32, bool)`

GetAvgEntryPriceOk returns a tuple with the AvgEntryPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvgEntryPrice

`func (o *PositionDataInner) SetAvgEntryPrice(v float32)`

SetAvgEntryPrice sets AvgEntryPrice field to given value.

### HasAvgEntryPrice

`func (o *PositionDataInner) HasAvgEntryPrice() bool`

HasAvgEntryPrice returns a boolean if a field has been set.

### GetQuantity

`func (o *PositionDataInner) GetQuantity() float32`

GetQuantity returns the Quantity field if non-nil, zero value otherwise.

### GetQuantityOk

`func (o *PositionDataInner) GetQuantityOk() (*float32, bool)`

GetQuantityOk returns a tuple with the Quantity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQuantity

`func (o *PositionDataInner) SetQuantity(v float32)`

SetQuantity sets Quantity field to given value.

### HasQuantity

`func (o *PositionDataInner) HasQuantity() bool`

HasQuantity returns a boolean if a field has been set.

### GetSide

`func (o *PositionDataInner) GetSide() OrdSide`

GetSide returns the Side field if non-nil, zero value otherwise.

### GetSideOk

`func (o *PositionDataInner) GetSideOk() (*OrdSide, bool)`

GetSideOk returns a tuple with the Side field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSide

`func (o *PositionDataInner) SetSide(v OrdSide)`

SetSide sets Side field to given value.

### HasSide

`func (o *PositionDataInner) HasSide() bool`

HasSide returns a boolean if a field has been set.

### GetUnrealizedPnl

`func (o *PositionDataInner) GetUnrealizedPnl() float32`

GetUnrealizedPnl returns the UnrealizedPnl field if non-nil, zero value otherwise.

### GetUnrealizedPnlOk

`func (o *PositionDataInner) GetUnrealizedPnlOk() (*float32, bool)`

GetUnrealizedPnlOk returns a tuple with the UnrealizedPnl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnrealizedPnl

`func (o *PositionDataInner) SetUnrealizedPnl(v float32)`

SetUnrealizedPnl sets UnrealizedPnl field to given value.

### HasUnrealizedPnl

`func (o *PositionDataInner) HasUnrealizedPnl() bool`

HasUnrealizedPnl returns a boolean if a field has been set.

### GetLeverage

`func (o *PositionDataInner) GetLeverage() float32`

GetLeverage returns the Leverage field if non-nil, zero value otherwise.

### GetLeverageOk

`func (o *PositionDataInner) GetLeverageOk() (*float32, bool)`

GetLeverageOk returns a tuple with the Leverage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeverage

`func (o *PositionDataInner) SetLeverage(v float32)`

SetLeverage sets Leverage field to given value.

### HasLeverage

`func (o *PositionDataInner) HasLeverage() bool`

HasLeverage returns a boolean if a field has been set.

### GetCrossMargin

`func (o *PositionDataInner) GetCrossMargin() bool`

GetCrossMargin returns the CrossMargin field if non-nil, zero value otherwise.

### GetCrossMarginOk

`func (o *PositionDataInner) GetCrossMarginOk() (*bool, bool)`

GetCrossMarginOk returns a tuple with the CrossMargin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCrossMargin

`func (o *PositionDataInner) SetCrossMargin(v bool)`

SetCrossMargin sets CrossMargin field to given value.

### HasCrossMargin

`func (o *PositionDataInner) HasCrossMargin() bool`

HasCrossMargin returns a boolean if a field has been set.

### GetLiquidationPrice

`func (o *PositionDataInner) GetLiquidationPrice() float32`

GetLiquidationPrice returns the LiquidationPrice field if non-nil, zero value otherwise.

### GetLiquidationPriceOk

`func (o *PositionDataInner) GetLiquidationPriceOk() (*float32, bool)`

GetLiquidationPriceOk returns a tuple with the LiquidationPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLiquidationPrice

`func (o *PositionDataInner) SetLiquidationPrice(v float32)`

SetLiquidationPrice sets LiquidationPrice field to given value.

### HasLiquidationPrice

`func (o *PositionDataInner) HasLiquidationPrice() bool`

HasLiquidationPrice returns a boolean if a field has been set.

### GetRawData

`func (o *PositionDataInner) GetRawData() map[string]interface{}`

GetRawData returns the RawData field if non-nil, zero value otherwise.

### GetRawDataOk

`func (o *PositionDataInner) GetRawDataOk() (*map[string]interface{}, bool)`

GetRawDataOk returns a tuple with the RawData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawData

`func (o *PositionDataInner) SetRawData(v map[string]interface{})`

SetRawData sets RawData field to given value.

### HasRawData

`func (o *PositionDataInner) HasRawData() bool`

HasRawData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


