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

// checks if the CurveAmplificationCoeffChangeLogDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CurveAmplificationCoeffChangeLogDTO{}

// CurveAmplificationCoeffChangeLogDTO struct for CurveAmplificationCoeffChangeLogDTO
type CurveAmplificationCoeffChangeLogDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	Pool NullableString `json:"pool,omitempty"`
	// 
	Value NullableString `json:"value,omitempty"`
	// 
	Block NullableString `json:"block,omitempty"`
	// 
	Timestamp NullableString `json:"timestamp,omitempty"`
	// 
	Transaction NullableString `json:"transaction,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewCurveAmplificationCoeffChangeLogDTO instantiates a new CurveAmplificationCoeffChangeLogDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveAmplificationCoeffChangeLogDTO() *CurveAmplificationCoeffChangeLogDTO {
	this := CurveAmplificationCoeffChangeLogDTO{}
	return &this
}

// NewCurveAmplificationCoeffChangeLogDTOWithDefaults instantiates a new CurveAmplificationCoeffChangeLogDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveAmplificationCoeffChangeLogDTOWithDefaults() *CurveAmplificationCoeffChangeLogDTO {
	this := CurveAmplificationCoeffChangeLogDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveAmplificationCoeffChangeLogDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveAmplificationCoeffChangeLogDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveAmplificationCoeffChangeLogDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveAmplificationCoeffChangeLogDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveAmplificationCoeffChangeLogDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) UnsetId() {
	o.Id.Unset()
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveAmplificationCoeffChangeLogDTO) GetPool() string {
	if o == nil || IsNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveAmplificationCoeffChangeLogDTO) GetPoolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetValue returns the Value field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveAmplificationCoeffChangeLogDTO) GetValue() string {
	if o == nil || IsNil(o.Value.Get()) {
		var ret string
		return ret
	}
	return *o.Value.Get()
}

// GetValueOk returns a tuple with the Value field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveAmplificationCoeffChangeLogDTO) GetValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Value.Get(), o.Value.IsSet()
}

// HasValue returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasValue() bool {
	if o != nil && o.Value.IsSet() {
		return true
	}

	return false
}

// SetValue gets a reference to the given NullableString and assigns it to the Value field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetValue(v string) {
	o.Value.Set(&v)
}
// SetValueNil sets the value for Value to be an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) SetValueNil() {
	o.Value.Set(nil)
}

// UnsetValue ensures that no value is present for Value, not even an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) UnsetValue() {
	o.Value.Unset()
}

// GetBlock returns the Block field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveAmplificationCoeffChangeLogDTO) GetBlock() string {
	if o == nil || IsNil(o.Block.Get()) {
		var ret string
		return ret
	}
	return *o.Block.Get()
}

// GetBlockOk returns a tuple with the Block field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveAmplificationCoeffChangeLogDTO) GetBlockOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Block.Get(), o.Block.IsSet()
}

// HasBlock returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasBlock() bool {
	if o != nil && o.Block.IsSet() {
		return true
	}

	return false
}

// SetBlock gets a reference to the given NullableString and assigns it to the Block field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetBlock(v string) {
	o.Block.Set(&v)
}
// SetBlockNil sets the value for Block to be an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) SetBlockNil() {
	o.Block.Set(nil)
}

// UnsetBlock ensures that no value is present for Block, not even an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) UnsetBlock() {
	o.Block.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveAmplificationCoeffChangeLogDTO) GetTimestamp() string {
	if o == nil || IsNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveAmplificationCoeffChangeLogDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveAmplificationCoeffChangeLogDTO) GetTransaction() string {
	if o == nil || IsNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveAmplificationCoeffChangeLogDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *CurveAmplificationCoeffChangeLogDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveAmplificationCoeffChangeLogDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveAmplificationCoeffChangeLogDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveAmplificationCoeffChangeLogDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o CurveAmplificationCoeffChangeLogDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CurveAmplificationCoeffChangeLogDTO) ToMap() (map[string]interface{}, error) {
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
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if o.Pool.IsSet() {
		toSerialize["pool"] = o.Pool.Get()
	}
	if o.Value.IsSet() {
		toSerialize["value"] = o.Value.Get()
	}
	if o.Block.IsSet() {
		toSerialize["block"] = o.Block.Get()
	}
	if o.Timestamp.IsSet() {
		toSerialize["timestamp"] = o.Timestamp.Get()
	}
	if o.Transaction.IsSet() {
		toSerialize["transaction"] = o.Transaction.Get()
	}
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableCurveAmplificationCoeffChangeLogDTO struct {
	value *CurveAmplificationCoeffChangeLogDTO
	isSet bool
}

func (v NullableCurveAmplificationCoeffChangeLogDTO) Get() *CurveAmplificationCoeffChangeLogDTO {
	return v.value
}

func (v *NullableCurveAmplificationCoeffChangeLogDTO) Set(val *CurveAmplificationCoeffChangeLogDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveAmplificationCoeffChangeLogDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveAmplificationCoeffChangeLogDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveAmplificationCoeffChangeLogDTO(val *CurveAmplificationCoeffChangeLogDTO) *NullableCurveAmplificationCoeffChangeLogDTO {
	return &NullableCurveAmplificationCoeffChangeLogDTO{value: val, isSet: true}
}

func (v NullableCurveAmplificationCoeffChangeLogDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveAmplificationCoeffChangeLogDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


