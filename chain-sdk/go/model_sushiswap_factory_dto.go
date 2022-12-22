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

// SushiswapFactoryDTO The Sushiswap Factory entity is responsible for storing aggregate information across all Sushiswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
type SushiswapFactoryDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Factory address.
	Id NullableString `json:"id,omitempty"`
	// Amount of pairs created by the Sushiswap factory.
	PairCount NullableString `json:"pair_count,omitempty"`
	// All time USD volume across all pairs (USD is derived).
	VolumeUsd NullableString `json:"volume_usd,omitempty"`
	// All time volume in ETH across all pairs (ETH is derived).
	VolumeEth NullableString `json:"volume_eth,omitempty"`
	// Untracked volume USD.
	UntrackedVolumeUsd NullableString `json:"untracked_volume_usd,omitempty"`
	// Total liquidity across all pairs stored as a derived USD amount.
	LiquidityUsd NullableString `json:"liquidity_usd,omitempty"`
	// Total liquidity across all pairs stored as a derived ETH amount.
	LiquidityEth NullableString `json:"liquidity_eth,omitempty"`
	// All time amount of transactions across all pairs.
	TxCount NullableString `json:"tx_count,omitempty"`
	// Total count of tokens.
	TokenCount NullableString `json:"token_count,omitempty"`
	// Users count.
	UserCount NullableString `json:"user_count,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewSushiswapFactoryDTO instantiates a new SushiswapFactoryDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSushiswapFactoryDTO() *SushiswapFactoryDTO {
	this := SushiswapFactoryDTO{}
	return &this
}

// NewSushiswapFactoryDTOWithDefaults instantiates a new SushiswapFactoryDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSushiswapFactoryDTOWithDefaults() *SushiswapFactoryDTO {
	this := SushiswapFactoryDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *SushiswapFactoryDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapFactoryDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *SushiswapFactoryDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *SushiswapFactoryDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapFactoryDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *SushiswapFactoryDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *SushiswapFactoryDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapFactoryDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *SushiswapFactoryDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *SushiswapFactoryDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *SushiswapFactoryDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetId() {
	o.Id.Unset()
}

// GetPairCount returns the PairCount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetPairCount() string {
	if o == nil || isNil(o.PairCount.Get()) {
		var ret string
		return ret
	}
	return *o.PairCount.Get()
}

// GetPairCountOk returns a tuple with the PairCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetPairCountOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.PairCount.Get(), o.PairCount.IsSet()
}

// HasPairCount returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasPairCount() bool {
	if o != nil && o.PairCount.IsSet() {
		return true
	}

	return false
}

// SetPairCount gets a reference to the given NullableString and assigns it to the PairCount field.
func (o *SushiswapFactoryDTO) SetPairCount(v string) {
	o.PairCount.Set(&v)
}
// SetPairCountNil sets the value for PairCount to be an explicit nil
func (o *SushiswapFactoryDTO) SetPairCountNil() {
	o.PairCount.Set(nil)
}

// UnsetPairCount ensures that no value is present for PairCount, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetPairCount() {
	o.PairCount.Unset()
}

// GetVolumeUsd returns the VolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetVolumeUsd() string {
	if o == nil || isNil(o.VolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeUsd.Get()
}

// GetVolumeUsdOk returns a tuple with the VolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetVolumeUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.VolumeUsd.Get(), o.VolumeUsd.IsSet()
}

// HasVolumeUsd returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasVolumeUsd() bool {
	if o != nil && o.VolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetVolumeUsd gets a reference to the given NullableString and assigns it to the VolumeUsd field.
func (o *SushiswapFactoryDTO) SetVolumeUsd(v string) {
	o.VolumeUsd.Set(&v)
}
// SetVolumeUsdNil sets the value for VolumeUsd to be an explicit nil
func (o *SushiswapFactoryDTO) SetVolumeUsdNil() {
	o.VolumeUsd.Set(nil)
}

// UnsetVolumeUsd ensures that no value is present for VolumeUsd, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetVolumeUsd() {
	o.VolumeUsd.Unset()
}

// GetVolumeEth returns the VolumeEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetVolumeEth() string {
	if o == nil || isNil(o.VolumeEth.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeEth.Get()
}

// GetVolumeEthOk returns a tuple with the VolumeEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetVolumeEthOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.VolumeEth.Get(), o.VolumeEth.IsSet()
}

// HasVolumeEth returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasVolumeEth() bool {
	if o != nil && o.VolumeEth.IsSet() {
		return true
	}

	return false
}

// SetVolumeEth gets a reference to the given NullableString and assigns it to the VolumeEth field.
func (o *SushiswapFactoryDTO) SetVolumeEth(v string) {
	o.VolumeEth.Set(&v)
}
// SetVolumeEthNil sets the value for VolumeEth to be an explicit nil
func (o *SushiswapFactoryDTO) SetVolumeEthNil() {
	o.VolumeEth.Set(nil)
}

// UnsetVolumeEth ensures that no value is present for VolumeEth, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetVolumeEth() {
	o.VolumeEth.Unset()
}

// GetUntrackedVolumeUsd returns the UntrackedVolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetUntrackedVolumeUsd() string {
	if o == nil || isNil(o.UntrackedVolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.UntrackedVolumeUsd.Get()
}

// GetUntrackedVolumeUsdOk returns a tuple with the UntrackedVolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetUntrackedVolumeUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.UntrackedVolumeUsd.Get(), o.UntrackedVolumeUsd.IsSet()
}

// HasUntrackedVolumeUsd returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasUntrackedVolumeUsd() bool {
	if o != nil && o.UntrackedVolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetUntrackedVolumeUsd gets a reference to the given NullableString and assigns it to the UntrackedVolumeUsd field.
func (o *SushiswapFactoryDTO) SetUntrackedVolumeUsd(v string) {
	o.UntrackedVolumeUsd.Set(&v)
}
// SetUntrackedVolumeUsdNil sets the value for UntrackedVolumeUsd to be an explicit nil
func (o *SushiswapFactoryDTO) SetUntrackedVolumeUsdNil() {
	o.UntrackedVolumeUsd.Set(nil)
}

// UnsetUntrackedVolumeUsd ensures that no value is present for UntrackedVolumeUsd, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetUntrackedVolumeUsd() {
	o.UntrackedVolumeUsd.Unset()
}

// GetLiquidityUsd returns the LiquidityUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetLiquidityUsd() string {
	if o == nil || isNil(o.LiquidityUsd.Get()) {
		var ret string
		return ret
	}
	return *o.LiquidityUsd.Get()
}

// GetLiquidityUsdOk returns a tuple with the LiquidityUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetLiquidityUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.LiquidityUsd.Get(), o.LiquidityUsd.IsSet()
}

// HasLiquidityUsd returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasLiquidityUsd() bool {
	if o != nil && o.LiquidityUsd.IsSet() {
		return true
	}

	return false
}

// SetLiquidityUsd gets a reference to the given NullableString and assigns it to the LiquidityUsd field.
func (o *SushiswapFactoryDTO) SetLiquidityUsd(v string) {
	o.LiquidityUsd.Set(&v)
}
// SetLiquidityUsdNil sets the value for LiquidityUsd to be an explicit nil
func (o *SushiswapFactoryDTO) SetLiquidityUsdNil() {
	o.LiquidityUsd.Set(nil)
}

// UnsetLiquidityUsd ensures that no value is present for LiquidityUsd, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetLiquidityUsd() {
	o.LiquidityUsd.Unset()
}

// GetLiquidityEth returns the LiquidityEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetLiquidityEth() string {
	if o == nil || isNil(o.LiquidityEth.Get()) {
		var ret string
		return ret
	}
	return *o.LiquidityEth.Get()
}

// GetLiquidityEthOk returns a tuple with the LiquidityEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetLiquidityEthOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.LiquidityEth.Get(), o.LiquidityEth.IsSet()
}

// HasLiquidityEth returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasLiquidityEth() bool {
	if o != nil && o.LiquidityEth.IsSet() {
		return true
	}

	return false
}

// SetLiquidityEth gets a reference to the given NullableString and assigns it to the LiquidityEth field.
func (o *SushiswapFactoryDTO) SetLiquidityEth(v string) {
	o.LiquidityEth.Set(&v)
}
// SetLiquidityEthNil sets the value for LiquidityEth to be an explicit nil
func (o *SushiswapFactoryDTO) SetLiquidityEthNil() {
	o.LiquidityEth.Set(nil)
}

// UnsetLiquidityEth ensures that no value is present for LiquidityEth, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetLiquidityEth() {
	o.LiquidityEth.Unset()
}

// GetTxCount returns the TxCount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetTxCount() string {
	if o == nil || isNil(o.TxCount.Get()) {
		var ret string
		return ret
	}
	return *o.TxCount.Get()
}

// GetTxCountOk returns a tuple with the TxCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetTxCountOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TxCount.Get(), o.TxCount.IsSet()
}

// HasTxCount returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasTxCount() bool {
	if o != nil && o.TxCount.IsSet() {
		return true
	}

	return false
}

// SetTxCount gets a reference to the given NullableString and assigns it to the TxCount field.
func (o *SushiswapFactoryDTO) SetTxCount(v string) {
	o.TxCount.Set(&v)
}
// SetTxCountNil sets the value for TxCount to be an explicit nil
func (o *SushiswapFactoryDTO) SetTxCountNil() {
	o.TxCount.Set(nil)
}

// UnsetTxCount ensures that no value is present for TxCount, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetTxCount() {
	o.TxCount.Unset()
}

// GetTokenCount returns the TokenCount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetTokenCount() string {
	if o == nil || isNil(o.TokenCount.Get()) {
		var ret string
		return ret
	}
	return *o.TokenCount.Get()
}

// GetTokenCountOk returns a tuple with the TokenCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetTokenCountOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TokenCount.Get(), o.TokenCount.IsSet()
}

// HasTokenCount returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasTokenCount() bool {
	if o != nil && o.TokenCount.IsSet() {
		return true
	}

	return false
}

// SetTokenCount gets a reference to the given NullableString and assigns it to the TokenCount field.
func (o *SushiswapFactoryDTO) SetTokenCount(v string) {
	o.TokenCount.Set(&v)
}
// SetTokenCountNil sets the value for TokenCount to be an explicit nil
func (o *SushiswapFactoryDTO) SetTokenCountNil() {
	o.TokenCount.Set(nil)
}

// UnsetTokenCount ensures that no value is present for TokenCount, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetTokenCount() {
	o.TokenCount.Unset()
}

// GetUserCount returns the UserCount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapFactoryDTO) GetUserCount() string {
	if o == nil || isNil(o.UserCount.Get()) {
		var ret string
		return ret
	}
	return *o.UserCount.Get()
}

// GetUserCountOk returns a tuple with the UserCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapFactoryDTO) GetUserCountOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.UserCount.Get(), o.UserCount.IsSet()
}

// HasUserCount returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasUserCount() bool {
	if o != nil && o.UserCount.IsSet() {
		return true
	}

	return false
}

// SetUserCount gets a reference to the given NullableString and assigns it to the UserCount field.
func (o *SushiswapFactoryDTO) SetUserCount(v string) {
	o.UserCount.Set(&v)
}
// SetUserCountNil sets the value for UserCount to be an explicit nil
func (o *SushiswapFactoryDTO) SetUserCountNil() {
	o.UserCount.Set(nil)
}

// UnsetUserCount ensures that no value is present for UserCount, not even an explicit nil
func (o *SushiswapFactoryDTO) UnsetUserCount() {
	o.UserCount.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *SushiswapFactoryDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapFactoryDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *SushiswapFactoryDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *SushiswapFactoryDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o SushiswapFactoryDTO) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.EntryTime) {
		toSerialize["entry_time"] = o.EntryTime
	}
	if !isNil(o.RecvTime) {
		toSerialize["recv_time"] = o.RecvTime
	}
	if !isNil(o.BlockNumber) {
		toSerialize["block_number"] = o.BlockNumber
	}
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if o.PairCount.IsSet() {
		toSerialize["pair_count"] = o.PairCount.Get()
	}
	if o.VolumeUsd.IsSet() {
		toSerialize["volume_usd"] = o.VolumeUsd.Get()
	}
	if o.VolumeEth.IsSet() {
		toSerialize["volume_eth"] = o.VolumeEth.Get()
	}
	if o.UntrackedVolumeUsd.IsSet() {
		toSerialize["untracked_volume_usd"] = o.UntrackedVolumeUsd.Get()
	}
	if o.LiquidityUsd.IsSet() {
		toSerialize["liquidity_usd"] = o.LiquidityUsd.Get()
	}
	if o.LiquidityEth.IsSet() {
		toSerialize["liquidity_eth"] = o.LiquidityEth.Get()
	}
	if o.TxCount.IsSet() {
		toSerialize["tx_count"] = o.TxCount.Get()
	}
	if o.TokenCount.IsSet() {
		toSerialize["token_count"] = o.TokenCount.Get()
	}
	if o.UserCount.IsSet() {
		toSerialize["user_count"] = o.UserCount.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableSushiswapFactoryDTO struct {
	value *SushiswapFactoryDTO
	isSet bool
}

func (v NullableSushiswapFactoryDTO) Get() *SushiswapFactoryDTO {
	return v.value
}

func (v *NullableSushiswapFactoryDTO) Set(val *SushiswapFactoryDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableSushiswapFactoryDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableSushiswapFactoryDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSushiswapFactoryDTO(val *SushiswapFactoryDTO) *NullableSushiswapFactoryDTO {
	return &NullableSushiswapFactoryDTO{value: val, isSet: true}
}

func (v NullableSushiswapFactoryDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSushiswapFactoryDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

