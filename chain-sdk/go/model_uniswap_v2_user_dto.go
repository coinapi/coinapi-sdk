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

// UniswapV2UserDTO A user entity is created for any address that provides liquidity to a pool on Uniswap. This entity can be used to track open positions for users.
type UniswapV2UserDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// User address.
	Id NullableString `json:"id,omitempty"`
	// Total USD value swapped.
	UsdSwapped NullableString `json:"usd_swapped,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewUniswapV2UserDTO instantiates a new UniswapV2UserDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV2UserDTO() *UniswapV2UserDTO {
	this := UniswapV2UserDTO{}
	return &this
}

// NewUniswapV2UserDTOWithDefaults instantiates a new UniswapV2UserDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV2UserDTOWithDefaults() *UniswapV2UserDTO {
	this := UniswapV2UserDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV2UserDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2UserDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV2UserDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV2UserDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV2UserDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2UserDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV2UserDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV2UserDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV2UserDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2UserDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV2UserDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV2UserDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2UserDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2UserDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV2UserDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV2UserDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV2UserDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV2UserDTO) UnsetId() {
	o.Id.Unset()
}

// GetUsdSwapped returns the UsdSwapped field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2UserDTO) GetUsdSwapped() string {
	if o == nil || isNil(o.UsdSwapped.Get()) {
		var ret string
		return ret
	}
	return *o.UsdSwapped.Get()
}

// GetUsdSwappedOk returns a tuple with the UsdSwapped field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2UserDTO) GetUsdSwappedOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.UsdSwapped.Get(), o.UsdSwapped.IsSet()
}

// HasUsdSwapped returns a boolean if a field has been set.
func (o *UniswapV2UserDTO) HasUsdSwapped() bool {
	if o != nil && o.UsdSwapped.IsSet() {
		return true
	}

	return false
}

// SetUsdSwapped gets a reference to the given NullableString and assigns it to the UsdSwapped field.
func (o *UniswapV2UserDTO) SetUsdSwapped(v string) {
	o.UsdSwapped.Set(&v)
}
// SetUsdSwappedNil sets the value for UsdSwapped to be an explicit nil
func (o *UniswapV2UserDTO) SetUsdSwappedNil() {
	o.UsdSwapped.Set(nil)
}

// UnsetUsdSwapped ensures that no value is present for UsdSwapped, not even an explicit nil
func (o *UniswapV2UserDTO) UnsetUsdSwapped() {
	o.UsdSwapped.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV2UserDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2UserDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV2UserDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV2UserDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o UniswapV2UserDTO) MarshalJSON() ([]byte, error) {
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
	if o.UsdSwapped.IsSet() {
		toSerialize["usd_swapped"] = o.UsdSwapped.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableUniswapV2UserDTO struct {
	value *UniswapV2UserDTO
	isSet bool
}

func (v NullableUniswapV2UserDTO) Get() *UniswapV2UserDTO {
	return v.value
}

func (v *NullableUniswapV2UserDTO) Set(val *UniswapV2UserDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV2UserDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV2UserDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV2UserDTO(val *UniswapV2UserDTO) *NullableUniswapV2UserDTO {
	return &NullableUniswapV2UserDTO{value: val, isSet: true}
}

func (v NullableUniswapV2UserDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV2UserDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


