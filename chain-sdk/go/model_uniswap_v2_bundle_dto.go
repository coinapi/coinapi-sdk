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

// UniswapV2BundleDTO The Bundle is used as a global store of derived ETH price in USD. Because there is no guaranteed common base token across pairs, a global reference of USD price is useful for deriving other USD values. The Bundle entity stores an updated weighted average of ETH<->Stablecoin pair prices. This provides a strong estimate for the USD price of ETH.
type UniswapV2BundleDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Constant 1.
	Id NullableString `json:"id,omitempty"`
	// Derived price of ETH in USD based on stablecoin pairs.
	EthPrice NullableString `json:"eth_price,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	// 
	BlockRange NullableString `json:"block_range,omitempty"`
}

// NewUniswapV2BundleDTO instantiates a new UniswapV2BundleDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV2BundleDTO() *UniswapV2BundleDTO {
	this := UniswapV2BundleDTO{}
	return &this
}

// NewUniswapV2BundleDTOWithDefaults instantiates a new UniswapV2BundleDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV2BundleDTOWithDefaults() *UniswapV2BundleDTO {
	this := UniswapV2BundleDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV2BundleDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2BundleDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV2BundleDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV2BundleDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV2BundleDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2BundleDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV2BundleDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV2BundleDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV2BundleDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2BundleDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV2BundleDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV2BundleDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2BundleDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2BundleDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV2BundleDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV2BundleDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV2BundleDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV2BundleDTO) UnsetId() {
	o.Id.Unset()
}

// GetEthPrice returns the EthPrice field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2BundleDTO) GetEthPrice() string {
	if o == nil || isNil(o.EthPrice.Get()) {
		var ret string
		return ret
	}
	return *o.EthPrice.Get()
}

// GetEthPriceOk returns a tuple with the EthPrice field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2BundleDTO) GetEthPriceOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.EthPrice.Get(), o.EthPrice.IsSet()
}

// HasEthPrice returns a boolean if a field has been set.
func (o *UniswapV2BundleDTO) HasEthPrice() bool {
	if o != nil && o.EthPrice.IsSet() {
		return true
	}

	return false
}

// SetEthPrice gets a reference to the given NullableString and assigns it to the EthPrice field.
func (o *UniswapV2BundleDTO) SetEthPrice(v string) {
	o.EthPrice.Set(&v)
}
// SetEthPriceNil sets the value for EthPrice to be an explicit nil
func (o *UniswapV2BundleDTO) SetEthPriceNil() {
	o.EthPrice.Set(nil)
}

// UnsetEthPrice ensures that no value is present for EthPrice, not even an explicit nil
func (o *UniswapV2BundleDTO) UnsetEthPrice() {
	o.EthPrice.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV2BundleDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2BundleDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV2BundleDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV2BundleDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetBlockRange returns the BlockRange field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2BundleDTO) GetBlockRange() string {
	if o == nil || isNil(o.BlockRange.Get()) {
		var ret string
		return ret
	}
	return *o.BlockRange.Get()
}

// GetBlockRangeOk returns a tuple with the BlockRange field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2BundleDTO) GetBlockRangeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.BlockRange.Get(), o.BlockRange.IsSet()
}

// HasBlockRange returns a boolean if a field has been set.
func (o *UniswapV2BundleDTO) HasBlockRange() bool {
	if o != nil && o.BlockRange.IsSet() {
		return true
	}

	return false
}

// SetBlockRange gets a reference to the given NullableString and assigns it to the BlockRange field.
func (o *UniswapV2BundleDTO) SetBlockRange(v string) {
	o.BlockRange.Set(&v)
}
// SetBlockRangeNil sets the value for BlockRange to be an explicit nil
func (o *UniswapV2BundleDTO) SetBlockRangeNil() {
	o.BlockRange.Set(nil)
}

// UnsetBlockRange ensures that no value is present for BlockRange, not even an explicit nil
func (o *UniswapV2BundleDTO) UnsetBlockRange() {
	o.BlockRange.Unset()
}

func (o UniswapV2BundleDTO) MarshalJSON() ([]byte, error) {
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
	if o.EthPrice.IsSet() {
		toSerialize["eth_price"] = o.EthPrice.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	if o.BlockRange.IsSet() {
		toSerialize["block_range"] = o.BlockRange.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableUniswapV2BundleDTO struct {
	value *UniswapV2BundleDTO
	isSet bool
}

func (v NullableUniswapV2BundleDTO) Get() *UniswapV2BundleDTO {
	return v.value
}

func (v *NullableUniswapV2BundleDTO) Set(val *UniswapV2BundleDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV2BundleDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV2BundleDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV2BundleDTO(val *UniswapV2BundleDTO) *NullableUniswapV2BundleDTO {
	return &NullableUniswapV2BundleDTO{value: val, isSet: true}
}

func (v NullableUniswapV2BundleDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV2BundleDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


