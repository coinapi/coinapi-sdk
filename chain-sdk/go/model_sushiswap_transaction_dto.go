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

// SushiswapTransactionDTO Transaction entities are created for each Ethereum transaction that contains an interaction within Sushiswap contracts. Each transaction contains 3 arrays, and at least one of these arrays has a length of 1.
type SushiswapTransactionDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Ethereum transaction hash.
	Id NullableString `json:"id,omitempty"`
	// Timestamp.
	Timestamp NullableString `json:"timestamp,omitempty"`
	// Array of Mint events within the transaction, 0 or greater.
	Mints []string `json:"mints,omitempty"`
	// Array of Burn events within transaction, 0 or greater.
	Burns []string `json:"burns,omitempty"`
	// Array of Swap events within transaction, 0 or greater.
	Swaps []string `json:"swaps,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewSushiswapTransactionDTO instantiates a new SushiswapTransactionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSushiswapTransactionDTO() *SushiswapTransactionDTO {
	this := SushiswapTransactionDTO{}
	return &this
}

// NewSushiswapTransactionDTOWithDefaults instantiates a new SushiswapTransactionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSushiswapTransactionDTOWithDefaults() *SushiswapTransactionDTO {
	this := SushiswapTransactionDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *SushiswapTransactionDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapTransactionDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *SushiswapTransactionDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *SushiswapTransactionDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapTransactionDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *SushiswapTransactionDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *SushiswapTransactionDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapTransactionDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *SushiswapTransactionDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapTransactionDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapTransactionDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *SushiswapTransactionDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *SushiswapTransactionDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *SushiswapTransactionDTO) UnsetId() {
	o.Id.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapTransactionDTO) GetTimestamp() string {
	if o == nil || isNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapTransactionDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *SushiswapTransactionDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *SushiswapTransactionDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *SushiswapTransactionDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetMints returns the Mints field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapTransactionDTO) GetMints() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Mints
}

// GetMintsOk returns a tuple with the Mints field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapTransactionDTO) GetMintsOk() ([]string, bool) {
	if o == nil || isNil(o.Mints) {
    return nil, false
	}
	return o.Mints, true
}

// HasMints returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasMints() bool {
	if o != nil && isNil(o.Mints) {
		return true
	}

	return false
}

// SetMints gets a reference to the given []string and assigns it to the Mints field.
func (o *SushiswapTransactionDTO) SetMints(v []string) {
	o.Mints = v
}

// GetBurns returns the Burns field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapTransactionDTO) GetBurns() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Burns
}

// GetBurnsOk returns a tuple with the Burns field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapTransactionDTO) GetBurnsOk() ([]string, bool) {
	if o == nil || isNil(o.Burns) {
    return nil, false
	}
	return o.Burns, true
}

// HasBurns returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasBurns() bool {
	if o != nil && isNil(o.Burns) {
		return true
	}

	return false
}

// SetBurns gets a reference to the given []string and assigns it to the Burns field.
func (o *SushiswapTransactionDTO) SetBurns(v []string) {
	o.Burns = v
}

// GetSwaps returns the Swaps field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapTransactionDTO) GetSwaps() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Swaps
}

// GetSwapsOk returns a tuple with the Swaps field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapTransactionDTO) GetSwapsOk() ([]string, bool) {
	if o == nil || isNil(o.Swaps) {
    return nil, false
	}
	return o.Swaps, true
}

// HasSwaps returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasSwaps() bool {
	if o != nil && isNil(o.Swaps) {
		return true
	}

	return false
}

// SetSwaps gets a reference to the given []string and assigns it to the Swaps field.
func (o *SushiswapTransactionDTO) SetSwaps(v []string) {
	o.Swaps = v
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *SushiswapTransactionDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapTransactionDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *SushiswapTransactionDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *SushiswapTransactionDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o SushiswapTransactionDTO) MarshalJSON() ([]byte, error) {
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
	if o.Timestamp.IsSet() {
		toSerialize["timestamp"] = o.Timestamp.Get()
	}
	if o.Mints != nil {
		toSerialize["mints"] = o.Mints
	}
	if o.Burns != nil {
		toSerialize["burns"] = o.Burns
	}
	if o.Swaps != nil {
		toSerialize["swaps"] = o.Swaps
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableSushiswapTransactionDTO struct {
	value *SushiswapTransactionDTO
	isSet bool
}

func (v NullableSushiswapTransactionDTO) Get() *SushiswapTransactionDTO {
	return v.value
}

func (v *NullableSushiswapTransactionDTO) Set(val *SushiswapTransactionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableSushiswapTransactionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableSushiswapTransactionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSushiswapTransactionDTO(val *SushiswapTransactionDTO) *NullableSushiswapTransactionDTO {
	return &NullableSushiswapTransactionDTO{value: val, isSet: true}
}

func (v NullableSushiswapTransactionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSushiswapTransactionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


