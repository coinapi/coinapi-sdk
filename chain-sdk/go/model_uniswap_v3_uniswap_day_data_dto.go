/*
OnChain API

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

// UniswapV3UniswapDayDataDTO Data accumulated and condensed into day stats for all of Uniswap.
type UniswapV3UniswapDayDataDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	// Timestamp rounded to current day by dividing by 86400.
	Id NullableString `json:"id,omitempty"`
	// Timestamp rounded to current day by dividing by 86400.
	Date *int32 `json:"date,omitempty"`
	// Total volume across all pairs on this day, stored as a derived amount of ETH.
	VolumeEth NullableString `json:"volume_eth,omitempty"`
	// Total volume across all pairs on this day, stored as a derived amount of USD.
	VolumeUsd NullableString `json:"volume_usd,omitempty"`
	// Total daily volume in Uniswap derived in terms of USD untracked.
	VolumeUsdUntracked NullableString `json:"volume_usd_untracked,omitempty"`
	// Fees in USD
	FeesUsd NullableString `json:"fees_usd,omitempty"`
	TxCount *NumericsBigInteger `json:"tx_count,omitempty"`
	// Tvl in terms of USD.
	TvlUsd NullableString `json:"tvl_usd,omitempty"`
}

// NewUniswapV3UniswapDayDataDTO instantiates a new UniswapV3UniswapDayDataDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV3UniswapDayDataDTO() *UniswapV3UniswapDayDataDTO {
	this := UniswapV3UniswapDayDataDTO{}
	return &this
}

// NewUniswapV3UniswapDayDataDTOWithDefaults instantiates a new UniswapV3UniswapDayDataDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV3UniswapDayDataDTOWithDefaults() *UniswapV3UniswapDayDataDTO {
	this := UniswapV3UniswapDayDataDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV3UniswapDayDataDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3UniswapDayDataDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV3UniswapDayDataDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV3UniswapDayDataDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3UniswapDayDataDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV3UniswapDayDataDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV3UniswapDayDataDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3UniswapDayDataDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV3UniswapDayDataDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV3UniswapDayDataDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3UniswapDayDataDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV3UniswapDayDataDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3UniswapDayDataDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3UniswapDayDataDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV3UniswapDayDataDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV3UniswapDayDataDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV3UniswapDayDataDTO) UnsetId() {
	o.Id.Unset()
}

// GetDate returns the Date field value if set, zero value otherwise.
func (o *UniswapV3UniswapDayDataDTO) GetDate() int32 {
	if o == nil || isNil(o.Date) {
		var ret int32
		return ret
	}
	return *o.Date
}

// GetDateOk returns a tuple with the Date field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3UniswapDayDataDTO) GetDateOk() (*int32, bool) {
	if o == nil || isNil(o.Date) {
    return nil, false
	}
	return o.Date, true
}

// HasDate returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasDate() bool {
	if o != nil && !isNil(o.Date) {
		return true
	}

	return false
}

// SetDate gets a reference to the given int32 and assigns it to the Date field.
func (o *UniswapV3UniswapDayDataDTO) SetDate(v int32) {
	o.Date = &v
}

// GetVolumeEth returns the VolumeEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3UniswapDayDataDTO) GetVolumeEth() string {
	if o == nil || isNil(o.VolumeEth.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeEth.Get()
}

// GetVolumeEthOk returns a tuple with the VolumeEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3UniswapDayDataDTO) GetVolumeEthOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.VolumeEth.Get(), o.VolumeEth.IsSet()
}

// HasVolumeEth returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasVolumeEth() bool {
	if o != nil && o.VolumeEth.IsSet() {
		return true
	}

	return false
}

// SetVolumeEth gets a reference to the given NullableString and assigns it to the VolumeEth field.
func (o *UniswapV3UniswapDayDataDTO) SetVolumeEth(v string) {
	o.VolumeEth.Set(&v)
}
// SetVolumeEthNil sets the value for VolumeEth to be an explicit nil
func (o *UniswapV3UniswapDayDataDTO) SetVolumeEthNil() {
	o.VolumeEth.Set(nil)
}

// UnsetVolumeEth ensures that no value is present for VolumeEth, not even an explicit nil
func (o *UniswapV3UniswapDayDataDTO) UnsetVolumeEth() {
	o.VolumeEth.Unset()
}

// GetVolumeUsd returns the VolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3UniswapDayDataDTO) GetVolumeUsd() string {
	if o == nil || isNil(o.VolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeUsd.Get()
}

// GetVolumeUsdOk returns a tuple with the VolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3UniswapDayDataDTO) GetVolumeUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.VolumeUsd.Get(), o.VolumeUsd.IsSet()
}

// HasVolumeUsd returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasVolumeUsd() bool {
	if o != nil && o.VolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetVolumeUsd gets a reference to the given NullableString and assigns it to the VolumeUsd field.
func (o *UniswapV3UniswapDayDataDTO) SetVolumeUsd(v string) {
	o.VolumeUsd.Set(&v)
}
// SetVolumeUsdNil sets the value for VolumeUsd to be an explicit nil
func (o *UniswapV3UniswapDayDataDTO) SetVolumeUsdNil() {
	o.VolumeUsd.Set(nil)
}

// UnsetVolumeUsd ensures that no value is present for VolumeUsd, not even an explicit nil
func (o *UniswapV3UniswapDayDataDTO) UnsetVolumeUsd() {
	o.VolumeUsd.Unset()
}

// GetVolumeUsdUntracked returns the VolumeUsdUntracked field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3UniswapDayDataDTO) GetVolumeUsdUntracked() string {
	if o == nil || isNil(o.VolumeUsdUntracked.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeUsdUntracked.Get()
}

// GetVolumeUsdUntrackedOk returns a tuple with the VolumeUsdUntracked field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3UniswapDayDataDTO) GetVolumeUsdUntrackedOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.VolumeUsdUntracked.Get(), o.VolumeUsdUntracked.IsSet()
}

// HasVolumeUsdUntracked returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasVolumeUsdUntracked() bool {
	if o != nil && o.VolumeUsdUntracked.IsSet() {
		return true
	}

	return false
}

// SetVolumeUsdUntracked gets a reference to the given NullableString and assigns it to the VolumeUsdUntracked field.
func (o *UniswapV3UniswapDayDataDTO) SetVolumeUsdUntracked(v string) {
	o.VolumeUsdUntracked.Set(&v)
}
// SetVolumeUsdUntrackedNil sets the value for VolumeUsdUntracked to be an explicit nil
func (o *UniswapV3UniswapDayDataDTO) SetVolumeUsdUntrackedNil() {
	o.VolumeUsdUntracked.Set(nil)
}

// UnsetVolumeUsdUntracked ensures that no value is present for VolumeUsdUntracked, not even an explicit nil
func (o *UniswapV3UniswapDayDataDTO) UnsetVolumeUsdUntracked() {
	o.VolumeUsdUntracked.Unset()
}

// GetFeesUsd returns the FeesUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3UniswapDayDataDTO) GetFeesUsd() string {
	if o == nil || isNil(o.FeesUsd.Get()) {
		var ret string
		return ret
	}
	return *o.FeesUsd.Get()
}

// GetFeesUsdOk returns a tuple with the FeesUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3UniswapDayDataDTO) GetFeesUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.FeesUsd.Get(), o.FeesUsd.IsSet()
}

// HasFeesUsd returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasFeesUsd() bool {
	if o != nil && o.FeesUsd.IsSet() {
		return true
	}

	return false
}

// SetFeesUsd gets a reference to the given NullableString and assigns it to the FeesUsd field.
func (o *UniswapV3UniswapDayDataDTO) SetFeesUsd(v string) {
	o.FeesUsd.Set(&v)
}
// SetFeesUsdNil sets the value for FeesUsd to be an explicit nil
func (o *UniswapV3UniswapDayDataDTO) SetFeesUsdNil() {
	o.FeesUsd.Set(nil)
}

// UnsetFeesUsd ensures that no value is present for FeesUsd, not even an explicit nil
func (o *UniswapV3UniswapDayDataDTO) UnsetFeesUsd() {
	o.FeesUsd.Unset()
}

// GetTxCount returns the TxCount field value if set, zero value otherwise.
func (o *UniswapV3UniswapDayDataDTO) GetTxCount() NumericsBigInteger {
	if o == nil || isNil(o.TxCount) {
		var ret NumericsBigInteger
		return ret
	}
	return *o.TxCount
}

// GetTxCountOk returns a tuple with the TxCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3UniswapDayDataDTO) GetTxCountOk() (*NumericsBigInteger, bool) {
	if o == nil || isNil(o.TxCount) {
    return nil, false
	}
	return o.TxCount, true
}

// HasTxCount returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasTxCount() bool {
	if o != nil && !isNil(o.TxCount) {
		return true
	}

	return false
}

// SetTxCount gets a reference to the given NumericsBigInteger and assigns it to the TxCount field.
func (o *UniswapV3UniswapDayDataDTO) SetTxCount(v NumericsBigInteger) {
	o.TxCount = &v
}

// GetTvlUsd returns the TvlUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3UniswapDayDataDTO) GetTvlUsd() string {
	if o == nil || isNil(o.TvlUsd.Get()) {
		var ret string
		return ret
	}
	return *o.TvlUsd.Get()
}

// GetTvlUsdOk returns a tuple with the TvlUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3UniswapDayDataDTO) GetTvlUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TvlUsd.Get(), o.TvlUsd.IsSet()
}

// HasTvlUsd returns a boolean if a field has been set.
func (o *UniswapV3UniswapDayDataDTO) HasTvlUsd() bool {
	if o != nil && o.TvlUsd.IsSet() {
		return true
	}

	return false
}

// SetTvlUsd gets a reference to the given NullableString and assigns it to the TvlUsd field.
func (o *UniswapV3UniswapDayDataDTO) SetTvlUsd(v string) {
	o.TvlUsd.Set(&v)
}
// SetTvlUsdNil sets the value for TvlUsd to be an explicit nil
func (o *UniswapV3UniswapDayDataDTO) SetTvlUsdNil() {
	o.TvlUsd.Set(nil)
}

// UnsetTvlUsd ensures that no value is present for TvlUsd, not even an explicit nil
func (o *UniswapV3UniswapDayDataDTO) UnsetTvlUsd() {
	o.TvlUsd.Unset()
}

func (o UniswapV3UniswapDayDataDTO) MarshalJSON() ([]byte, error) {
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
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if !isNil(o.Date) {
		toSerialize["date"] = o.Date
	}
	if o.VolumeEth.IsSet() {
		toSerialize["volume_eth"] = o.VolumeEth.Get()
	}
	if o.VolumeUsd.IsSet() {
		toSerialize["volume_usd"] = o.VolumeUsd.Get()
	}
	if o.VolumeUsdUntracked.IsSet() {
		toSerialize["volume_usd_untracked"] = o.VolumeUsdUntracked.Get()
	}
	if o.FeesUsd.IsSet() {
		toSerialize["fees_usd"] = o.FeesUsd.Get()
	}
	if !isNil(o.TxCount) {
		toSerialize["tx_count"] = o.TxCount
	}
	if o.TvlUsd.IsSet() {
		toSerialize["tvl_usd"] = o.TvlUsd.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableUniswapV3UniswapDayDataDTO struct {
	value *UniswapV3UniswapDayDataDTO
	isSet bool
}

func (v NullableUniswapV3UniswapDayDataDTO) Get() *UniswapV3UniswapDayDataDTO {
	return v.value
}

func (v *NullableUniswapV3UniswapDayDataDTO) Set(val *UniswapV3UniswapDayDataDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV3UniswapDayDataDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV3UniswapDayDataDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV3UniswapDayDataDTO(val *UniswapV3UniswapDayDataDTO) *NullableUniswapV3UniswapDayDataDTO {
	return &NullableUniswapV3UniswapDayDataDTO{value: val, isSet: true}
}

func (v NullableUniswapV3UniswapDayDataDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV3UniswapDayDataDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


