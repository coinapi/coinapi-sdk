# UniswapV3TokenV3DTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntryTime** | Pointer to **time.Time** |  | [optional] 
**RecvTime** | Pointer to **time.Time** |  | [optional] 
**BlockNumber** | Pointer to **int64** | Number of block in which entity was recorded. | [optional] 
**Vid** | Pointer to **int64** |  | [optional] 
**Id** | Pointer to **NullableString** | Token address. | [optional] 
**Symbol** | Pointer to **NullableString** | Token symbol. | [optional] 
**Name** | Pointer to **NullableString** | Token name. | [optional] 
**Decimals** | Pointer to **int32** | Token decimals. | [optional] 
**TotalSupply** | Pointer to [**NumericsBigInteger**](NumericsBigInteger.md) |  | [optional] 
**Volume** | Pointer to **NullableString** | Volume in token units. | [optional] 
**VolumeUsd** | Pointer to **NullableString** | Volume in derived USD. | [optional] 
**UntrackedVolumeUsd** | Pointer to **NullableString** | Volume in USD even on pools with less reliable USD values. | [optional] 
**FeesUsd** | Pointer to **NullableString** | Fees in USD. | [optional] 
**TxCount** | Pointer to [**NumericsBigInteger**](NumericsBigInteger.md) |  | [optional] 
**PoolCount** | Pointer to [**NumericsBigInteger**](NumericsBigInteger.md) |  | [optional] 
**TotalValueLocked** | Pointer to **NullableString** | Liquidity across all pools in token units. | [optional] 
**TotalValueLockedUsd** | Pointer to **NullableString** | Liquidity across all pools in derived USD. | [optional] 
**TotalValueLockedUsdUntracked** | Pointer to **NullableString** | TVL derived in USD untracked. | [optional] 
**DerivedEth** | Pointer to **NullableString** | Derived price in ETH. | [optional] 
**WhitelistPools** | Pointer to **[]string** | Pools token is in that are white listed for USD pricing. | [optional] 
**TokenSymbol** | Pointer to **NullableString** |  | [optional] [readonly] 

## Methods

### NewUniswapV3TokenV3DTO

`func NewUniswapV3TokenV3DTO() *UniswapV3TokenV3DTO`

NewUniswapV3TokenV3DTO instantiates a new UniswapV3TokenV3DTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUniswapV3TokenV3DTOWithDefaults

`func NewUniswapV3TokenV3DTOWithDefaults() *UniswapV3TokenV3DTO`

NewUniswapV3TokenV3DTOWithDefaults instantiates a new UniswapV3TokenV3DTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEntryTime

`func (o *UniswapV3TokenV3DTO) GetEntryTime() time.Time`

GetEntryTime returns the EntryTime field if non-nil, zero value otherwise.

### GetEntryTimeOk

`func (o *UniswapV3TokenV3DTO) GetEntryTimeOk() (*time.Time, bool)`

GetEntryTimeOk returns a tuple with the EntryTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEntryTime

`func (o *UniswapV3TokenV3DTO) SetEntryTime(v time.Time)`

SetEntryTime sets EntryTime field to given value.

### HasEntryTime

`func (o *UniswapV3TokenV3DTO) HasEntryTime() bool`

HasEntryTime returns a boolean if a field has been set.

### GetRecvTime

`func (o *UniswapV3TokenV3DTO) GetRecvTime() time.Time`

GetRecvTime returns the RecvTime field if non-nil, zero value otherwise.

### GetRecvTimeOk

`func (o *UniswapV3TokenV3DTO) GetRecvTimeOk() (*time.Time, bool)`

GetRecvTimeOk returns a tuple with the RecvTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecvTime

`func (o *UniswapV3TokenV3DTO) SetRecvTime(v time.Time)`

SetRecvTime sets RecvTime field to given value.

### HasRecvTime

`func (o *UniswapV3TokenV3DTO) HasRecvTime() bool`

HasRecvTime returns a boolean if a field has been set.

### GetBlockNumber

`func (o *UniswapV3TokenV3DTO) GetBlockNumber() int64`

GetBlockNumber returns the BlockNumber field if non-nil, zero value otherwise.

### GetBlockNumberOk

`func (o *UniswapV3TokenV3DTO) GetBlockNumberOk() (*int64, bool)`

GetBlockNumberOk returns a tuple with the BlockNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockNumber

`func (o *UniswapV3TokenV3DTO) SetBlockNumber(v int64)`

SetBlockNumber sets BlockNumber field to given value.

### HasBlockNumber

`func (o *UniswapV3TokenV3DTO) HasBlockNumber() bool`

HasBlockNumber returns a boolean if a field has been set.

### GetVid

`func (o *UniswapV3TokenV3DTO) GetVid() int64`

GetVid returns the Vid field if non-nil, zero value otherwise.

### GetVidOk

`func (o *UniswapV3TokenV3DTO) GetVidOk() (*int64, bool)`

GetVidOk returns a tuple with the Vid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVid

`func (o *UniswapV3TokenV3DTO) SetVid(v int64)`

SetVid sets Vid field to given value.

### HasVid

`func (o *UniswapV3TokenV3DTO) HasVid() bool`

HasVid returns a boolean if a field has been set.

### GetId

`func (o *UniswapV3TokenV3DTO) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *UniswapV3TokenV3DTO) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *UniswapV3TokenV3DTO) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *UniswapV3TokenV3DTO) HasId() bool`

HasId returns a boolean if a field has been set.

### SetIdNil

`func (o *UniswapV3TokenV3DTO) SetIdNil(b bool)`

 SetIdNil sets the value for Id to be an explicit nil

### UnsetId
`func (o *UniswapV3TokenV3DTO) UnsetId()`

UnsetId ensures that no value is present for Id, not even an explicit nil
### GetSymbol

`func (o *UniswapV3TokenV3DTO) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *UniswapV3TokenV3DTO) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *UniswapV3TokenV3DTO) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.

### HasSymbol

`func (o *UniswapV3TokenV3DTO) HasSymbol() bool`

HasSymbol returns a boolean if a field has been set.

### SetSymbolNil

`func (o *UniswapV3TokenV3DTO) SetSymbolNil(b bool)`

 SetSymbolNil sets the value for Symbol to be an explicit nil

### UnsetSymbol
`func (o *UniswapV3TokenV3DTO) UnsetSymbol()`

UnsetSymbol ensures that no value is present for Symbol, not even an explicit nil
### GetName

`func (o *UniswapV3TokenV3DTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *UniswapV3TokenV3DTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *UniswapV3TokenV3DTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *UniswapV3TokenV3DTO) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *UniswapV3TokenV3DTO) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *UniswapV3TokenV3DTO) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetDecimals

`func (o *UniswapV3TokenV3DTO) GetDecimals() int32`

GetDecimals returns the Decimals field if non-nil, zero value otherwise.

### GetDecimalsOk

`func (o *UniswapV3TokenV3DTO) GetDecimalsOk() (*int32, bool)`

GetDecimalsOk returns a tuple with the Decimals field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecimals

`func (o *UniswapV3TokenV3DTO) SetDecimals(v int32)`

SetDecimals sets Decimals field to given value.

### HasDecimals

`func (o *UniswapV3TokenV3DTO) HasDecimals() bool`

HasDecimals returns a boolean if a field has been set.

### GetTotalSupply

`func (o *UniswapV3TokenV3DTO) GetTotalSupply() NumericsBigInteger`

GetTotalSupply returns the TotalSupply field if non-nil, zero value otherwise.

### GetTotalSupplyOk

`func (o *UniswapV3TokenV3DTO) GetTotalSupplyOk() (*NumericsBigInteger, bool)`

GetTotalSupplyOk returns a tuple with the TotalSupply field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalSupply

`func (o *UniswapV3TokenV3DTO) SetTotalSupply(v NumericsBigInteger)`

SetTotalSupply sets TotalSupply field to given value.

### HasTotalSupply

`func (o *UniswapV3TokenV3DTO) HasTotalSupply() bool`

HasTotalSupply returns a boolean if a field has been set.

### GetVolume

`func (o *UniswapV3TokenV3DTO) GetVolume() string`

GetVolume returns the Volume field if non-nil, zero value otherwise.

### GetVolumeOk

`func (o *UniswapV3TokenV3DTO) GetVolumeOk() (*string, bool)`

GetVolumeOk returns a tuple with the Volume field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolume

`func (o *UniswapV3TokenV3DTO) SetVolume(v string)`

SetVolume sets Volume field to given value.

### HasVolume

`func (o *UniswapV3TokenV3DTO) HasVolume() bool`

HasVolume returns a boolean if a field has been set.

### SetVolumeNil

`func (o *UniswapV3TokenV3DTO) SetVolumeNil(b bool)`

 SetVolumeNil sets the value for Volume to be an explicit nil

### UnsetVolume
`func (o *UniswapV3TokenV3DTO) UnsetVolume()`

UnsetVolume ensures that no value is present for Volume, not even an explicit nil
### GetVolumeUsd

`func (o *UniswapV3TokenV3DTO) GetVolumeUsd() string`

GetVolumeUsd returns the VolumeUsd field if non-nil, zero value otherwise.

### GetVolumeUsdOk

`func (o *UniswapV3TokenV3DTO) GetVolumeUsdOk() (*string, bool)`

GetVolumeUsdOk returns a tuple with the VolumeUsd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVolumeUsd

`func (o *UniswapV3TokenV3DTO) SetVolumeUsd(v string)`

SetVolumeUsd sets VolumeUsd field to given value.

### HasVolumeUsd

`func (o *UniswapV3TokenV3DTO) HasVolumeUsd() bool`

HasVolumeUsd returns a boolean if a field has been set.

### SetVolumeUsdNil

`func (o *UniswapV3TokenV3DTO) SetVolumeUsdNil(b bool)`

 SetVolumeUsdNil sets the value for VolumeUsd to be an explicit nil

### UnsetVolumeUsd
`func (o *UniswapV3TokenV3DTO) UnsetVolumeUsd()`

UnsetVolumeUsd ensures that no value is present for VolumeUsd, not even an explicit nil
### GetUntrackedVolumeUsd

`func (o *UniswapV3TokenV3DTO) GetUntrackedVolumeUsd() string`

GetUntrackedVolumeUsd returns the UntrackedVolumeUsd field if non-nil, zero value otherwise.

### GetUntrackedVolumeUsdOk

`func (o *UniswapV3TokenV3DTO) GetUntrackedVolumeUsdOk() (*string, bool)`

GetUntrackedVolumeUsdOk returns a tuple with the UntrackedVolumeUsd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUntrackedVolumeUsd

`func (o *UniswapV3TokenV3DTO) SetUntrackedVolumeUsd(v string)`

SetUntrackedVolumeUsd sets UntrackedVolumeUsd field to given value.

### HasUntrackedVolumeUsd

`func (o *UniswapV3TokenV3DTO) HasUntrackedVolumeUsd() bool`

HasUntrackedVolumeUsd returns a boolean if a field has been set.

### SetUntrackedVolumeUsdNil

`func (o *UniswapV3TokenV3DTO) SetUntrackedVolumeUsdNil(b bool)`

 SetUntrackedVolumeUsdNil sets the value for UntrackedVolumeUsd to be an explicit nil

### UnsetUntrackedVolumeUsd
`func (o *UniswapV3TokenV3DTO) UnsetUntrackedVolumeUsd()`

UnsetUntrackedVolumeUsd ensures that no value is present for UntrackedVolumeUsd, not even an explicit nil
### GetFeesUsd

`func (o *UniswapV3TokenV3DTO) GetFeesUsd() string`

GetFeesUsd returns the FeesUsd field if non-nil, zero value otherwise.

### GetFeesUsdOk

`func (o *UniswapV3TokenV3DTO) GetFeesUsdOk() (*string, bool)`

GetFeesUsdOk returns a tuple with the FeesUsd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFeesUsd

`func (o *UniswapV3TokenV3DTO) SetFeesUsd(v string)`

SetFeesUsd sets FeesUsd field to given value.

### HasFeesUsd

`func (o *UniswapV3TokenV3DTO) HasFeesUsd() bool`

HasFeesUsd returns a boolean if a field has been set.

### SetFeesUsdNil

`func (o *UniswapV3TokenV3DTO) SetFeesUsdNil(b bool)`

 SetFeesUsdNil sets the value for FeesUsd to be an explicit nil

### UnsetFeesUsd
`func (o *UniswapV3TokenV3DTO) UnsetFeesUsd()`

UnsetFeesUsd ensures that no value is present for FeesUsd, not even an explicit nil
### GetTxCount

`func (o *UniswapV3TokenV3DTO) GetTxCount() NumericsBigInteger`

GetTxCount returns the TxCount field if non-nil, zero value otherwise.

### GetTxCountOk

`func (o *UniswapV3TokenV3DTO) GetTxCountOk() (*NumericsBigInteger, bool)`

GetTxCountOk returns a tuple with the TxCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxCount

`func (o *UniswapV3TokenV3DTO) SetTxCount(v NumericsBigInteger)`

SetTxCount sets TxCount field to given value.

### HasTxCount

`func (o *UniswapV3TokenV3DTO) HasTxCount() bool`

HasTxCount returns a boolean if a field has been set.

### GetPoolCount

`func (o *UniswapV3TokenV3DTO) GetPoolCount() NumericsBigInteger`

GetPoolCount returns the PoolCount field if non-nil, zero value otherwise.

### GetPoolCountOk

`func (o *UniswapV3TokenV3DTO) GetPoolCountOk() (*NumericsBigInteger, bool)`

GetPoolCountOk returns a tuple with the PoolCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPoolCount

`func (o *UniswapV3TokenV3DTO) SetPoolCount(v NumericsBigInteger)`

SetPoolCount sets PoolCount field to given value.

### HasPoolCount

`func (o *UniswapV3TokenV3DTO) HasPoolCount() bool`

HasPoolCount returns a boolean if a field has been set.

### GetTotalValueLocked

`func (o *UniswapV3TokenV3DTO) GetTotalValueLocked() string`

GetTotalValueLocked returns the TotalValueLocked field if non-nil, zero value otherwise.

### GetTotalValueLockedOk

`func (o *UniswapV3TokenV3DTO) GetTotalValueLockedOk() (*string, bool)`

GetTotalValueLockedOk returns a tuple with the TotalValueLocked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalValueLocked

`func (o *UniswapV3TokenV3DTO) SetTotalValueLocked(v string)`

SetTotalValueLocked sets TotalValueLocked field to given value.

### HasTotalValueLocked

`func (o *UniswapV3TokenV3DTO) HasTotalValueLocked() bool`

HasTotalValueLocked returns a boolean if a field has been set.

### SetTotalValueLockedNil

`func (o *UniswapV3TokenV3DTO) SetTotalValueLockedNil(b bool)`

 SetTotalValueLockedNil sets the value for TotalValueLocked to be an explicit nil

### UnsetTotalValueLocked
`func (o *UniswapV3TokenV3DTO) UnsetTotalValueLocked()`

UnsetTotalValueLocked ensures that no value is present for TotalValueLocked, not even an explicit nil
### GetTotalValueLockedUsd

`func (o *UniswapV3TokenV3DTO) GetTotalValueLockedUsd() string`

GetTotalValueLockedUsd returns the TotalValueLockedUsd field if non-nil, zero value otherwise.

### GetTotalValueLockedUsdOk

`func (o *UniswapV3TokenV3DTO) GetTotalValueLockedUsdOk() (*string, bool)`

GetTotalValueLockedUsdOk returns a tuple with the TotalValueLockedUsd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalValueLockedUsd

`func (o *UniswapV3TokenV3DTO) SetTotalValueLockedUsd(v string)`

SetTotalValueLockedUsd sets TotalValueLockedUsd field to given value.

### HasTotalValueLockedUsd

`func (o *UniswapV3TokenV3DTO) HasTotalValueLockedUsd() bool`

HasTotalValueLockedUsd returns a boolean if a field has been set.

### SetTotalValueLockedUsdNil

`func (o *UniswapV3TokenV3DTO) SetTotalValueLockedUsdNil(b bool)`

 SetTotalValueLockedUsdNil sets the value for TotalValueLockedUsd to be an explicit nil

### UnsetTotalValueLockedUsd
`func (o *UniswapV3TokenV3DTO) UnsetTotalValueLockedUsd()`

UnsetTotalValueLockedUsd ensures that no value is present for TotalValueLockedUsd, not even an explicit nil
### GetTotalValueLockedUsdUntracked

`func (o *UniswapV3TokenV3DTO) GetTotalValueLockedUsdUntracked() string`

GetTotalValueLockedUsdUntracked returns the TotalValueLockedUsdUntracked field if non-nil, zero value otherwise.

### GetTotalValueLockedUsdUntrackedOk

`func (o *UniswapV3TokenV3DTO) GetTotalValueLockedUsdUntrackedOk() (*string, bool)`

GetTotalValueLockedUsdUntrackedOk returns a tuple with the TotalValueLockedUsdUntracked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalValueLockedUsdUntracked

`func (o *UniswapV3TokenV3DTO) SetTotalValueLockedUsdUntracked(v string)`

SetTotalValueLockedUsdUntracked sets TotalValueLockedUsdUntracked field to given value.

### HasTotalValueLockedUsdUntracked

`func (o *UniswapV3TokenV3DTO) HasTotalValueLockedUsdUntracked() bool`

HasTotalValueLockedUsdUntracked returns a boolean if a field has been set.

### SetTotalValueLockedUsdUntrackedNil

`func (o *UniswapV3TokenV3DTO) SetTotalValueLockedUsdUntrackedNil(b bool)`

 SetTotalValueLockedUsdUntrackedNil sets the value for TotalValueLockedUsdUntracked to be an explicit nil

### UnsetTotalValueLockedUsdUntracked
`func (o *UniswapV3TokenV3DTO) UnsetTotalValueLockedUsdUntracked()`

UnsetTotalValueLockedUsdUntracked ensures that no value is present for TotalValueLockedUsdUntracked, not even an explicit nil
### GetDerivedEth

`func (o *UniswapV3TokenV3DTO) GetDerivedEth() string`

GetDerivedEth returns the DerivedEth field if non-nil, zero value otherwise.

### GetDerivedEthOk

`func (o *UniswapV3TokenV3DTO) GetDerivedEthOk() (*string, bool)`

GetDerivedEthOk returns a tuple with the DerivedEth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDerivedEth

`func (o *UniswapV3TokenV3DTO) SetDerivedEth(v string)`

SetDerivedEth sets DerivedEth field to given value.

### HasDerivedEth

`func (o *UniswapV3TokenV3DTO) HasDerivedEth() bool`

HasDerivedEth returns a boolean if a field has been set.

### SetDerivedEthNil

`func (o *UniswapV3TokenV3DTO) SetDerivedEthNil(b bool)`

 SetDerivedEthNil sets the value for DerivedEth to be an explicit nil

### UnsetDerivedEth
`func (o *UniswapV3TokenV3DTO) UnsetDerivedEth()`

UnsetDerivedEth ensures that no value is present for DerivedEth, not even an explicit nil
### GetWhitelistPools

`func (o *UniswapV3TokenV3DTO) GetWhitelistPools() []string`

GetWhitelistPools returns the WhitelistPools field if non-nil, zero value otherwise.

### GetWhitelistPoolsOk

`func (o *UniswapV3TokenV3DTO) GetWhitelistPoolsOk() (*[]string, bool)`

GetWhitelistPoolsOk returns a tuple with the WhitelistPools field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWhitelistPools

`func (o *UniswapV3TokenV3DTO) SetWhitelistPools(v []string)`

SetWhitelistPools sets WhitelistPools field to given value.

### HasWhitelistPools

`func (o *UniswapV3TokenV3DTO) HasWhitelistPools() bool`

HasWhitelistPools returns a boolean if a field has been set.

### SetWhitelistPoolsNil

`func (o *UniswapV3TokenV3DTO) SetWhitelistPoolsNil(b bool)`

 SetWhitelistPoolsNil sets the value for WhitelistPools to be an explicit nil

### UnsetWhitelistPools
`func (o *UniswapV3TokenV3DTO) UnsetWhitelistPools()`

UnsetWhitelistPools ensures that no value is present for WhitelistPools, not even an explicit nil
### GetTokenSymbol

`func (o *UniswapV3TokenV3DTO) GetTokenSymbol() string`

GetTokenSymbol returns the TokenSymbol field if non-nil, zero value otherwise.

### GetTokenSymbolOk

`func (o *UniswapV3TokenV3DTO) GetTokenSymbolOk() (*string, bool)`

GetTokenSymbolOk returns a tuple with the TokenSymbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenSymbol

`func (o *UniswapV3TokenV3DTO) SetTokenSymbol(v string)`

SetTokenSymbol sets TokenSymbol field to given value.

### HasTokenSymbol

`func (o *UniswapV3TokenV3DTO) HasTokenSymbol() bool`

HasTokenSymbol returns a boolean if a field has been set.

### SetTokenSymbolNil

`func (o *UniswapV3TokenV3DTO) SetTokenSymbolNil(b bool)`

 SetTokenSymbolNil sets the value for TokenSymbol to be an explicit nil

### UnsetTokenSymbol
`func (o *UniswapV3TokenV3DTO) UnsetTokenSymbol()`

UnsetTokenSymbol ensures that no value is present for TokenSymbol, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

