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

// BundleV3DTO struct for BundleV3DTO
type BundleV3DTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// 
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	EthPriceUsd NullableString `json:"eth_price_usd,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewBundleV3DTO instantiates a new BundleV3DTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBundleV3DTO() *BundleV3DTO {
	this := BundleV3DTO{}
	return &this
}

// NewBundleV3DTOWithDefaults instantiates a new BundleV3DTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBundleV3DTOWithDefaults() *BundleV3DTO {
	this := BundleV3DTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *BundleV3DTO) GetEntryTime() time.Time {
	if o == nil || o.EntryTime == nil {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleV3DTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || o.EntryTime == nil {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *BundleV3DTO) HasEntryTime() bool {
	if o != nil && o.EntryTime != nil {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *BundleV3DTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *BundleV3DTO) GetRecvTime() time.Time {
	if o == nil || o.RecvTime == nil {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleV3DTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || o.RecvTime == nil {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *BundleV3DTO) HasRecvTime() bool {
	if o != nil && o.RecvTime != nil {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *BundleV3DTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *BundleV3DTO) GetBlockNumber() int64 {
	if o == nil || o.BlockNumber == nil {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleV3DTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || o.BlockNumber == nil {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *BundleV3DTO) HasBlockNumber() bool {
	if o != nil && o.BlockNumber != nil {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *BundleV3DTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BundleV3DTO) GetId() string {
	if o == nil || o.Id.Get() == nil {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BundleV3DTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *BundleV3DTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *BundleV3DTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *BundleV3DTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *BundleV3DTO) UnsetId() {
	o.Id.Unset()
}

// GetEthPriceUsd returns the EthPriceUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *BundleV3DTO) GetEthPriceUsd() string {
	if o == nil || o.EthPriceUsd.Get() == nil {
		var ret string
		return ret
	}
	return *o.EthPriceUsd.Get()
}

// GetEthPriceUsdOk returns a tuple with the EthPriceUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *BundleV3DTO) GetEthPriceUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.EthPriceUsd.Get(), o.EthPriceUsd.IsSet()
}

// HasEthPriceUsd returns a boolean if a field has been set.
func (o *BundleV3DTO) HasEthPriceUsd() bool {
	if o != nil && o.EthPriceUsd.IsSet() {
		return true
	}

	return false
}

// SetEthPriceUsd gets a reference to the given NullableString and assigns it to the EthPriceUsd field.
func (o *BundleV3DTO) SetEthPriceUsd(v string) {
	o.EthPriceUsd.Set(&v)
}
// SetEthPriceUsdNil sets the value for EthPriceUsd to be an explicit nil
func (o *BundleV3DTO) SetEthPriceUsdNil() {
	o.EthPriceUsd.Set(nil)
}

// UnsetEthPriceUsd ensures that no value is present for EthPriceUsd, not even an explicit nil
func (o *BundleV3DTO) UnsetEthPriceUsd() {
	o.EthPriceUsd.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *BundleV3DTO) GetVid() int64 {
	if o == nil || o.Vid == nil {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BundleV3DTO) GetVidOk() (*int64, bool) {
	if o == nil || o.Vid == nil {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *BundleV3DTO) HasVid() bool {
	if o != nil && o.Vid != nil {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *BundleV3DTO) SetVid(v int64) {
	o.Vid = &v
}

func (o BundleV3DTO) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.EntryTime != nil {
		toSerialize["entry_time"] = o.EntryTime
	}
	if o.RecvTime != nil {
		toSerialize["recv_time"] = o.RecvTime
	}
	if o.BlockNumber != nil {
		toSerialize["block_number"] = o.BlockNumber
	}
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if o.EthPriceUsd.IsSet() {
		toSerialize["eth_price_usd"] = o.EthPriceUsd.Get()
	}
	if o.Vid != nil {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableBundleV3DTO struct {
	value *BundleV3DTO
	isSet bool
}

func (v NullableBundleV3DTO) Get() *BundleV3DTO {
	return v.value
}

func (v *NullableBundleV3DTO) Set(val *BundleV3DTO) {
	v.value = val
	v.isSet = true
}

func (v NullableBundleV3DTO) IsSet() bool {
	return v.isSet
}

func (v *NullableBundleV3DTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBundleV3DTO(val *BundleV3DTO) *NullableBundleV3DTO {
	return &NullableBundleV3DTO{value: val, isSet: true}
}

func (v NullableBundleV3DTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBundleV3DTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


