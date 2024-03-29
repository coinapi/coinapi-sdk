/*
On Chain Dapps - REST API

 This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

API version: v1
Contact: support@coinapi.io
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"time"
)

// checks if the UniswapV2TokenDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UniswapV2TokenDTO{}

// UniswapV2TokenDTO Stores aggregated information for a specific token across all pairs that token is included in.
type UniswapV2TokenDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	// Token address.
	Id NullableString `json:"id,omitempty"`
	// Token symbol.
	Symbol NullableString `json:"symbol,omitempty"`
	// Token name.
	Name NullableString `json:"name,omitempty"`
	// Token decimals.
	Decimals *int32 `json:"decimals,omitempty"`
	TotalSupply *NumericsBigInteger `json:"total_supply,omitempty"`
	// Amount of token traded all time across all pairs.
	TradeVolume NullableString `json:"trade_volume,omitempty"`
	// Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).
	TradeVolumeUsd NullableString `json:"trade_volume_usd,omitempty"`
	// Amount of token in USD traded all time across pairs (no minimum liquidity threshold).
	UntrackedVolumeUsd NullableString `json:"untracked_volume_usd,omitempty"`
	TxCount *NumericsBigInteger `json:"tx_count,omitempty"`
	// Total amount of token provided as liquidity across all pairs.
	TotalLiquidity NullableString `json:"total_liquidity,omitempty"`
	// ETH per token.
	DerivedEth NullableString `json:"derived_eth,omitempty"`
	TokenSymbol NullableString `json:"token_symbol,omitempty"`
}

// NewUniswapV2TokenDTO instantiates a new UniswapV2TokenDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV2TokenDTO() *UniswapV2TokenDTO {
	this := UniswapV2TokenDTO{}
	return &this
}

// NewUniswapV2TokenDTOWithDefaults instantiates a new UniswapV2TokenDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV2TokenDTOWithDefaults() *UniswapV2TokenDTO {
	this := UniswapV2TokenDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV2TokenDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV2TokenDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV2TokenDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV2TokenDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV2TokenDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV2TokenDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV2TokenDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV2TokenDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV2TokenDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV2TokenDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetId() {
	o.Id.Unset()
}

// GetSymbol returns the Symbol field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetSymbol() string {
	if o == nil || IsNil(o.Symbol.Get()) {
		var ret string
		return ret
	}
	return *o.Symbol.Get()
}

// GetSymbolOk returns a tuple with the Symbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetSymbolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Symbol.Get(), o.Symbol.IsSet()
}

// HasSymbol returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasSymbol() bool {
	if o != nil && o.Symbol.IsSet() {
		return true
	}

	return false
}

// SetSymbol gets a reference to the given NullableString and assigns it to the Symbol field.
func (o *UniswapV2TokenDTO) SetSymbol(v string) {
	o.Symbol.Set(&v)
}
// SetSymbolNil sets the value for Symbol to be an explicit nil
func (o *UniswapV2TokenDTO) SetSymbolNil() {
	o.Symbol.Set(nil)
}

// UnsetSymbol ensures that no value is present for Symbol, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetSymbol() {
	o.Symbol.Unset()
}

// GetName returns the Name field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetName() string {
	if o == nil || IsNil(o.Name.Get()) {
		var ret string
		return ret
	}
	return *o.Name.Get()
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

// HasName returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasName() bool {
	if o != nil && o.Name.IsSet() {
		return true
	}

	return false
}

// SetName gets a reference to the given NullableString and assigns it to the Name field.
func (o *UniswapV2TokenDTO) SetName(v string) {
	o.Name.Set(&v)
}
// SetNameNil sets the value for Name to be an explicit nil
func (o *UniswapV2TokenDTO) SetNameNil() {
	o.Name.Set(nil)
}

// UnsetName ensures that no value is present for Name, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetName() {
	o.Name.Unset()
}

// GetDecimals returns the Decimals field value if set, zero value otherwise.
func (o *UniswapV2TokenDTO) GetDecimals() int32 {
	if o == nil || IsNil(o.Decimals) {
		var ret int32
		return ret
	}
	return *o.Decimals
}

// GetDecimalsOk returns a tuple with the Decimals field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDTO) GetDecimalsOk() (*int32, bool) {
	if o == nil || IsNil(o.Decimals) {
		return nil, false
	}
	return o.Decimals, true
}

// HasDecimals returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasDecimals() bool {
	if o != nil && !IsNil(o.Decimals) {
		return true
	}

	return false
}

// SetDecimals gets a reference to the given int32 and assigns it to the Decimals field.
func (o *UniswapV2TokenDTO) SetDecimals(v int32) {
	o.Decimals = &v
}

// GetTotalSupply returns the TotalSupply field value if set, zero value otherwise.
func (o *UniswapV2TokenDTO) GetTotalSupply() NumericsBigInteger {
	if o == nil || IsNil(o.TotalSupply) {
		var ret NumericsBigInteger
		return ret
	}
	return *o.TotalSupply
}

// GetTotalSupplyOk returns a tuple with the TotalSupply field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDTO) GetTotalSupplyOk() (*NumericsBigInteger, bool) {
	if o == nil || IsNil(o.TotalSupply) {
		return nil, false
	}
	return o.TotalSupply, true
}

// HasTotalSupply returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasTotalSupply() bool {
	if o != nil && !IsNil(o.TotalSupply) {
		return true
	}

	return false
}

// SetTotalSupply gets a reference to the given NumericsBigInteger and assigns it to the TotalSupply field.
func (o *UniswapV2TokenDTO) SetTotalSupply(v NumericsBigInteger) {
	o.TotalSupply = &v
}

// GetTradeVolume returns the TradeVolume field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetTradeVolume() string {
	if o == nil || IsNil(o.TradeVolume.Get()) {
		var ret string
		return ret
	}
	return *o.TradeVolume.Get()
}

// GetTradeVolumeOk returns a tuple with the TradeVolume field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetTradeVolumeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TradeVolume.Get(), o.TradeVolume.IsSet()
}

// HasTradeVolume returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasTradeVolume() bool {
	if o != nil && o.TradeVolume.IsSet() {
		return true
	}

	return false
}

// SetTradeVolume gets a reference to the given NullableString and assigns it to the TradeVolume field.
func (o *UniswapV2TokenDTO) SetTradeVolume(v string) {
	o.TradeVolume.Set(&v)
}
// SetTradeVolumeNil sets the value for TradeVolume to be an explicit nil
func (o *UniswapV2TokenDTO) SetTradeVolumeNil() {
	o.TradeVolume.Set(nil)
}

// UnsetTradeVolume ensures that no value is present for TradeVolume, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetTradeVolume() {
	o.TradeVolume.Unset()
}

// GetTradeVolumeUsd returns the TradeVolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetTradeVolumeUsd() string {
	if o == nil || IsNil(o.TradeVolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.TradeVolumeUsd.Get()
}

// GetTradeVolumeUsdOk returns a tuple with the TradeVolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetTradeVolumeUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TradeVolumeUsd.Get(), o.TradeVolumeUsd.IsSet()
}

// HasTradeVolumeUsd returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasTradeVolumeUsd() bool {
	if o != nil && o.TradeVolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetTradeVolumeUsd gets a reference to the given NullableString and assigns it to the TradeVolumeUsd field.
func (o *UniswapV2TokenDTO) SetTradeVolumeUsd(v string) {
	o.TradeVolumeUsd.Set(&v)
}
// SetTradeVolumeUsdNil sets the value for TradeVolumeUsd to be an explicit nil
func (o *UniswapV2TokenDTO) SetTradeVolumeUsdNil() {
	o.TradeVolumeUsd.Set(nil)
}

// UnsetTradeVolumeUsd ensures that no value is present for TradeVolumeUsd, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetTradeVolumeUsd() {
	o.TradeVolumeUsd.Unset()
}

// GetUntrackedVolumeUsd returns the UntrackedVolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetUntrackedVolumeUsd() string {
	if o == nil || IsNil(o.UntrackedVolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.UntrackedVolumeUsd.Get()
}

// GetUntrackedVolumeUsdOk returns a tuple with the UntrackedVolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetUntrackedVolumeUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.UntrackedVolumeUsd.Get(), o.UntrackedVolumeUsd.IsSet()
}

// HasUntrackedVolumeUsd returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasUntrackedVolumeUsd() bool {
	if o != nil && o.UntrackedVolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetUntrackedVolumeUsd gets a reference to the given NullableString and assigns it to the UntrackedVolumeUsd field.
func (o *UniswapV2TokenDTO) SetUntrackedVolumeUsd(v string) {
	o.UntrackedVolumeUsd.Set(&v)
}
// SetUntrackedVolumeUsdNil sets the value for UntrackedVolumeUsd to be an explicit nil
func (o *UniswapV2TokenDTO) SetUntrackedVolumeUsdNil() {
	o.UntrackedVolumeUsd.Set(nil)
}

// UnsetUntrackedVolumeUsd ensures that no value is present for UntrackedVolumeUsd, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetUntrackedVolumeUsd() {
	o.UntrackedVolumeUsd.Unset()
}

// GetTxCount returns the TxCount field value if set, zero value otherwise.
func (o *UniswapV2TokenDTO) GetTxCount() NumericsBigInteger {
	if o == nil || IsNil(o.TxCount) {
		var ret NumericsBigInteger
		return ret
	}
	return *o.TxCount
}

// GetTxCountOk returns a tuple with the TxCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDTO) GetTxCountOk() (*NumericsBigInteger, bool) {
	if o == nil || IsNil(o.TxCount) {
		return nil, false
	}
	return o.TxCount, true
}

// HasTxCount returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasTxCount() bool {
	if o != nil && !IsNil(o.TxCount) {
		return true
	}

	return false
}

// SetTxCount gets a reference to the given NumericsBigInteger and assigns it to the TxCount field.
func (o *UniswapV2TokenDTO) SetTxCount(v NumericsBigInteger) {
	o.TxCount = &v
}

// GetTotalLiquidity returns the TotalLiquidity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetTotalLiquidity() string {
	if o == nil || IsNil(o.TotalLiquidity.Get()) {
		var ret string
		return ret
	}
	return *o.TotalLiquidity.Get()
}

// GetTotalLiquidityOk returns a tuple with the TotalLiquidity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetTotalLiquidityOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TotalLiquidity.Get(), o.TotalLiquidity.IsSet()
}

// HasTotalLiquidity returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasTotalLiquidity() bool {
	if o != nil && o.TotalLiquidity.IsSet() {
		return true
	}

	return false
}

// SetTotalLiquidity gets a reference to the given NullableString and assigns it to the TotalLiquidity field.
func (o *UniswapV2TokenDTO) SetTotalLiquidity(v string) {
	o.TotalLiquidity.Set(&v)
}
// SetTotalLiquidityNil sets the value for TotalLiquidity to be an explicit nil
func (o *UniswapV2TokenDTO) SetTotalLiquidityNil() {
	o.TotalLiquidity.Set(nil)
}

// UnsetTotalLiquidity ensures that no value is present for TotalLiquidity, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetTotalLiquidity() {
	o.TotalLiquidity.Unset()
}

// GetDerivedEth returns the DerivedEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetDerivedEth() string {
	if o == nil || IsNil(o.DerivedEth.Get()) {
		var ret string
		return ret
	}
	return *o.DerivedEth.Get()
}

// GetDerivedEthOk returns a tuple with the DerivedEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetDerivedEthOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.DerivedEth.Get(), o.DerivedEth.IsSet()
}

// HasDerivedEth returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasDerivedEth() bool {
	if o != nil && o.DerivedEth.IsSet() {
		return true
	}

	return false
}

// SetDerivedEth gets a reference to the given NullableString and assigns it to the DerivedEth field.
func (o *UniswapV2TokenDTO) SetDerivedEth(v string) {
	o.DerivedEth.Set(&v)
}
// SetDerivedEthNil sets the value for DerivedEth to be an explicit nil
func (o *UniswapV2TokenDTO) SetDerivedEthNil() {
	o.DerivedEth.Set(nil)
}

// UnsetDerivedEth ensures that no value is present for DerivedEth, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetDerivedEth() {
	o.DerivedEth.Unset()
}

// GetTokenSymbol returns the TokenSymbol field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDTO) GetTokenSymbol() string {
	if o == nil || IsNil(o.TokenSymbol.Get()) {
		var ret string
		return ret
	}
	return *o.TokenSymbol.Get()
}

// GetTokenSymbolOk returns a tuple with the TokenSymbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDTO) GetTokenSymbolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TokenSymbol.Get(), o.TokenSymbol.IsSet()
}

// HasTokenSymbol returns a boolean if a field has been set.
func (o *UniswapV2TokenDTO) HasTokenSymbol() bool {
	if o != nil && o.TokenSymbol.IsSet() {
		return true
	}

	return false
}

// SetTokenSymbol gets a reference to the given NullableString and assigns it to the TokenSymbol field.
func (o *UniswapV2TokenDTO) SetTokenSymbol(v string) {
	o.TokenSymbol.Set(&v)
}
// SetTokenSymbolNil sets the value for TokenSymbol to be an explicit nil
func (o *UniswapV2TokenDTO) SetTokenSymbolNil() {
	o.TokenSymbol.Set(nil)
}

// UnsetTokenSymbol ensures that no value is present for TokenSymbol, not even an explicit nil
func (o *UniswapV2TokenDTO) UnsetTokenSymbol() {
	o.TokenSymbol.Unset()
}

func (o UniswapV2TokenDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UniswapV2TokenDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.EntryTime) {
		toSerialize["entry_time"] = o.EntryTime
	}
	if !IsNil(o.RecvTime) {
		toSerialize["recv_time"] = o.RecvTime
	}
	if !IsNil(o.BlockNumber) {
		toSerialize["block_number"] = o.BlockNumber
	}
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if o.Symbol.IsSet() {
		toSerialize["symbol"] = o.Symbol.Get()
	}
	if o.Name.IsSet() {
		toSerialize["name"] = o.Name.Get()
	}
	if !IsNil(o.Decimals) {
		toSerialize["decimals"] = o.Decimals
	}
	if !IsNil(o.TotalSupply) {
		toSerialize["total_supply"] = o.TotalSupply
	}
	if o.TradeVolume.IsSet() {
		toSerialize["trade_volume"] = o.TradeVolume.Get()
	}
	if o.TradeVolumeUsd.IsSet() {
		toSerialize["trade_volume_usd"] = o.TradeVolumeUsd.Get()
	}
	if o.UntrackedVolumeUsd.IsSet() {
		toSerialize["untracked_volume_usd"] = o.UntrackedVolumeUsd.Get()
	}
	if !IsNil(o.TxCount) {
		toSerialize["tx_count"] = o.TxCount
	}
	if o.TotalLiquidity.IsSet() {
		toSerialize["total_liquidity"] = o.TotalLiquidity.Get()
	}
	if o.DerivedEth.IsSet() {
		toSerialize["derived_eth"] = o.DerivedEth.Get()
	}
	if o.TokenSymbol.IsSet() {
		toSerialize["token_symbol"] = o.TokenSymbol.Get()
	}
	return toSerialize, nil
}

type NullableUniswapV2TokenDTO struct {
	value *UniswapV2TokenDTO
	isSet bool
}

func (v NullableUniswapV2TokenDTO) Get() *UniswapV2TokenDTO {
	return v.value
}

func (v *NullableUniswapV2TokenDTO) Set(val *UniswapV2TokenDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV2TokenDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV2TokenDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV2TokenDTO(val *UniswapV2TokenDTO) *NullableUniswapV2TokenDTO {
	return &NullableUniswapV2TokenDTO{value: val, isSet: true}
}

func (v NullableUniswapV2TokenDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV2TokenDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


