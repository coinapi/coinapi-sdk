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

// checks if the SushiswapHourDataDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SushiswapHourDataDTO{}

// SushiswapHourDataDTO struct for SushiswapHourDataDTO
type SushiswapHourDataDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Start of hour timestamp.
	Id NullableString `json:"id,omitempty"`
	// 
	Date *int32 `json:"date,omitempty"`
	// 
	Factory NullableString `json:"factory,omitempty"`
	// 
	VolumeEth NullableString `json:"volume_eth,omitempty"`
	// 
	VolumeUsd NullableString `json:"volume_usd,omitempty"`
	// 
	UntrackedVolume NullableString `json:"untracked_volume,omitempty"`
	// 
	LiquidityEth NullableString `json:"liquidity_eth,omitempty"`
	// 
	LiquidityUsd NullableString `json:"liquidity_usd,omitempty"`
	// 
	TxCount NullableString `json:"tx_count,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewSushiswapHourDataDTO instantiates a new SushiswapHourDataDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSushiswapHourDataDTO() *SushiswapHourDataDTO {
	this := SushiswapHourDataDTO{}
	return &this
}

// NewSushiswapHourDataDTOWithDefaults instantiates a new SushiswapHourDataDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSushiswapHourDataDTOWithDefaults() *SushiswapHourDataDTO {
	this := SushiswapHourDataDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *SushiswapHourDataDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapHourDataDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *SushiswapHourDataDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *SushiswapHourDataDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapHourDataDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *SushiswapHourDataDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *SushiswapHourDataDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapHourDataDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *SushiswapHourDataDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapHourDataDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapHourDataDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *SushiswapHourDataDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *SushiswapHourDataDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *SushiswapHourDataDTO) UnsetId() {
	o.Id.Unset()
}

// GetDate returns the Date field value if set, zero value otherwise.
func (o *SushiswapHourDataDTO) GetDate() int32 {
	if o == nil || isNil(o.Date) {
		var ret int32
		return ret
	}
	return *o.Date
}

// GetDateOk returns a tuple with the Date field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapHourDataDTO) GetDateOk() (*int32, bool) {
	if o == nil || isNil(o.Date) {
		return nil, false
	}
	return o.Date, true
}

// HasDate returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasDate() bool {
	if o != nil && !isNil(o.Date) {
		return true
	}

	return false
}

// SetDate gets a reference to the given int32 and assigns it to the Date field.
func (o *SushiswapHourDataDTO) SetDate(v int32) {
	o.Date = &v
}

// GetFactory returns the Factory field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapHourDataDTO) GetFactory() string {
	if o == nil || isNil(o.Factory.Get()) {
		var ret string
		return ret
	}
	return *o.Factory.Get()
}

// GetFactoryOk returns a tuple with the Factory field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapHourDataDTO) GetFactoryOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Factory.Get(), o.Factory.IsSet()
}

// HasFactory returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasFactory() bool {
	if o != nil && o.Factory.IsSet() {
		return true
	}

	return false
}

// SetFactory gets a reference to the given NullableString and assigns it to the Factory field.
func (o *SushiswapHourDataDTO) SetFactory(v string) {
	o.Factory.Set(&v)
}
// SetFactoryNil sets the value for Factory to be an explicit nil
func (o *SushiswapHourDataDTO) SetFactoryNil() {
	o.Factory.Set(nil)
}

// UnsetFactory ensures that no value is present for Factory, not even an explicit nil
func (o *SushiswapHourDataDTO) UnsetFactory() {
	o.Factory.Unset()
}

// GetVolumeEth returns the VolumeEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapHourDataDTO) GetVolumeEth() string {
	if o == nil || isNil(o.VolumeEth.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeEth.Get()
}

// GetVolumeEthOk returns a tuple with the VolumeEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapHourDataDTO) GetVolumeEthOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeEth.Get(), o.VolumeEth.IsSet()
}

// HasVolumeEth returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasVolumeEth() bool {
	if o != nil && o.VolumeEth.IsSet() {
		return true
	}

	return false
}

// SetVolumeEth gets a reference to the given NullableString and assigns it to the VolumeEth field.
func (o *SushiswapHourDataDTO) SetVolumeEth(v string) {
	o.VolumeEth.Set(&v)
}
// SetVolumeEthNil sets the value for VolumeEth to be an explicit nil
func (o *SushiswapHourDataDTO) SetVolumeEthNil() {
	o.VolumeEth.Set(nil)
}

// UnsetVolumeEth ensures that no value is present for VolumeEth, not even an explicit nil
func (o *SushiswapHourDataDTO) UnsetVolumeEth() {
	o.VolumeEth.Unset()
}

// GetVolumeUsd returns the VolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapHourDataDTO) GetVolumeUsd() string {
	if o == nil || isNil(o.VolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeUsd.Get()
}

// GetVolumeUsdOk returns a tuple with the VolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapHourDataDTO) GetVolumeUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeUsd.Get(), o.VolumeUsd.IsSet()
}

// HasVolumeUsd returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasVolumeUsd() bool {
	if o != nil && o.VolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetVolumeUsd gets a reference to the given NullableString and assigns it to the VolumeUsd field.
func (o *SushiswapHourDataDTO) SetVolumeUsd(v string) {
	o.VolumeUsd.Set(&v)
}
// SetVolumeUsdNil sets the value for VolumeUsd to be an explicit nil
func (o *SushiswapHourDataDTO) SetVolumeUsdNil() {
	o.VolumeUsd.Set(nil)
}

// UnsetVolumeUsd ensures that no value is present for VolumeUsd, not even an explicit nil
func (o *SushiswapHourDataDTO) UnsetVolumeUsd() {
	o.VolumeUsd.Unset()
}

// GetUntrackedVolume returns the UntrackedVolume field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapHourDataDTO) GetUntrackedVolume() string {
	if o == nil || isNil(o.UntrackedVolume.Get()) {
		var ret string
		return ret
	}
	return *o.UntrackedVolume.Get()
}

// GetUntrackedVolumeOk returns a tuple with the UntrackedVolume field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapHourDataDTO) GetUntrackedVolumeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.UntrackedVolume.Get(), o.UntrackedVolume.IsSet()
}

// HasUntrackedVolume returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasUntrackedVolume() bool {
	if o != nil && o.UntrackedVolume.IsSet() {
		return true
	}

	return false
}

// SetUntrackedVolume gets a reference to the given NullableString and assigns it to the UntrackedVolume field.
func (o *SushiswapHourDataDTO) SetUntrackedVolume(v string) {
	o.UntrackedVolume.Set(&v)
}
// SetUntrackedVolumeNil sets the value for UntrackedVolume to be an explicit nil
func (o *SushiswapHourDataDTO) SetUntrackedVolumeNil() {
	o.UntrackedVolume.Set(nil)
}

// UnsetUntrackedVolume ensures that no value is present for UntrackedVolume, not even an explicit nil
func (o *SushiswapHourDataDTO) UnsetUntrackedVolume() {
	o.UntrackedVolume.Unset()
}

// GetLiquidityEth returns the LiquidityEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapHourDataDTO) GetLiquidityEth() string {
	if o == nil || isNil(o.LiquidityEth.Get()) {
		var ret string
		return ret
	}
	return *o.LiquidityEth.Get()
}

// GetLiquidityEthOk returns a tuple with the LiquidityEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapHourDataDTO) GetLiquidityEthOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.LiquidityEth.Get(), o.LiquidityEth.IsSet()
}

// HasLiquidityEth returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasLiquidityEth() bool {
	if o != nil && o.LiquidityEth.IsSet() {
		return true
	}

	return false
}

// SetLiquidityEth gets a reference to the given NullableString and assigns it to the LiquidityEth field.
func (o *SushiswapHourDataDTO) SetLiquidityEth(v string) {
	o.LiquidityEth.Set(&v)
}
// SetLiquidityEthNil sets the value for LiquidityEth to be an explicit nil
func (o *SushiswapHourDataDTO) SetLiquidityEthNil() {
	o.LiquidityEth.Set(nil)
}

// UnsetLiquidityEth ensures that no value is present for LiquidityEth, not even an explicit nil
func (o *SushiswapHourDataDTO) UnsetLiquidityEth() {
	o.LiquidityEth.Unset()
}

// GetLiquidityUsd returns the LiquidityUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapHourDataDTO) GetLiquidityUsd() string {
	if o == nil || isNil(o.LiquidityUsd.Get()) {
		var ret string
		return ret
	}
	return *o.LiquidityUsd.Get()
}

// GetLiquidityUsdOk returns a tuple with the LiquidityUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapHourDataDTO) GetLiquidityUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.LiquidityUsd.Get(), o.LiquidityUsd.IsSet()
}

// HasLiquidityUsd returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasLiquidityUsd() bool {
	if o != nil && o.LiquidityUsd.IsSet() {
		return true
	}

	return false
}

// SetLiquidityUsd gets a reference to the given NullableString and assigns it to the LiquidityUsd field.
func (o *SushiswapHourDataDTO) SetLiquidityUsd(v string) {
	o.LiquidityUsd.Set(&v)
}
// SetLiquidityUsdNil sets the value for LiquidityUsd to be an explicit nil
func (o *SushiswapHourDataDTO) SetLiquidityUsdNil() {
	o.LiquidityUsd.Set(nil)
}

// UnsetLiquidityUsd ensures that no value is present for LiquidityUsd, not even an explicit nil
func (o *SushiswapHourDataDTO) UnsetLiquidityUsd() {
	o.LiquidityUsd.Unset()
}

// GetTxCount returns the TxCount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapHourDataDTO) GetTxCount() string {
	if o == nil || isNil(o.TxCount.Get()) {
		var ret string
		return ret
	}
	return *o.TxCount.Get()
}

// GetTxCountOk returns a tuple with the TxCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapHourDataDTO) GetTxCountOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TxCount.Get(), o.TxCount.IsSet()
}

// HasTxCount returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasTxCount() bool {
	if o != nil && o.TxCount.IsSet() {
		return true
	}

	return false
}

// SetTxCount gets a reference to the given NullableString and assigns it to the TxCount field.
func (o *SushiswapHourDataDTO) SetTxCount(v string) {
	o.TxCount.Set(&v)
}
// SetTxCountNil sets the value for TxCount to be an explicit nil
func (o *SushiswapHourDataDTO) SetTxCountNil() {
	o.TxCount.Set(nil)
}

// UnsetTxCount ensures that no value is present for TxCount, not even an explicit nil
func (o *SushiswapHourDataDTO) UnsetTxCount() {
	o.TxCount.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *SushiswapHourDataDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapHourDataDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *SushiswapHourDataDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *SushiswapHourDataDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o SushiswapHourDataDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SushiswapHourDataDTO) ToMap() (map[string]interface{}, error) {
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
	if !isNil(o.Date) {
		toSerialize["date"] = o.Date
	}
	if o.Factory.IsSet() {
		toSerialize["factory"] = o.Factory.Get()
	}
	if o.VolumeEth.IsSet() {
		toSerialize["volume_eth"] = o.VolumeEth.Get()
	}
	if o.VolumeUsd.IsSet() {
		toSerialize["volume_usd"] = o.VolumeUsd.Get()
	}
	if o.UntrackedVolume.IsSet() {
		toSerialize["untracked_volume"] = o.UntrackedVolume.Get()
	}
	if o.LiquidityEth.IsSet() {
		toSerialize["liquidity_eth"] = o.LiquidityEth.Get()
	}
	if o.LiquidityUsd.IsSet() {
		toSerialize["liquidity_usd"] = o.LiquidityUsd.Get()
	}
	if o.TxCount.IsSet() {
		toSerialize["tx_count"] = o.TxCount.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableSushiswapHourDataDTO struct {
	value *SushiswapHourDataDTO
	isSet bool
}

func (v NullableSushiswapHourDataDTO) Get() *SushiswapHourDataDTO {
	return v.value
}

func (v *NullableSushiswapHourDataDTO) Set(val *SushiswapHourDataDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableSushiswapHourDataDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableSushiswapHourDataDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSushiswapHourDataDTO(val *SushiswapHourDataDTO) *NullableSushiswapHourDataDTO {
	return &NullableSushiswapHourDataDTO{value: val, isSet: true}
}

func (v NullableSushiswapHourDataDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSushiswapHourDataDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


