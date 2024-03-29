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

// checks if the CurveTransferOwnershipEventDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CurveTransferOwnershipEventDTO{}

// CurveTransferOwnershipEventDTO struct for CurveTransferOwnershipEventDTO
type CurveTransferOwnershipEventDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	Pool NullableString `json:"pool,omitempty"`
	// 
	NewAdmin NullableString `json:"new_admin,omitempty"`
	// 
	Block NullableString `json:"block,omitempty"`
	// 
	Timestamp NullableString `json:"timestamp,omitempty"`
	// 
	Transaction NullableString `json:"transaction,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewCurveTransferOwnershipEventDTO instantiates a new CurveTransferOwnershipEventDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveTransferOwnershipEventDTO() *CurveTransferOwnershipEventDTO {
	this := CurveTransferOwnershipEventDTO{}
	return &this
}

// NewCurveTransferOwnershipEventDTOWithDefaults instantiates a new CurveTransferOwnershipEventDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveTransferOwnershipEventDTOWithDefaults() *CurveTransferOwnershipEventDTO {
	this := CurveTransferOwnershipEventDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveTransferOwnershipEventDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveTransferOwnershipEventDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveTransferOwnershipEventDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveTransferOwnershipEventDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveTransferOwnershipEventDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveTransferOwnershipEventDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveTransferOwnershipEventDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveTransferOwnershipEventDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveTransferOwnershipEventDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveTransferOwnershipEventDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveTransferOwnershipEventDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveTransferOwnershipEventDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveTransferOwnershipEventDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveTransferOwnershipEventDTO) UnsetId() {
	o.Id.Unset()
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveTransferOwnershipEventDTO) GetPool() string {
	if o == nil || IsNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveTransferOwnershipEventDTO) GetPoolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *CurveTransferOwnershipEventDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *CurveTransferOwnershipEventDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *CurveTransferOwnershipEventDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetNewAdmin returns the NewAdmin field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveTransferOwnershipEventDTO) GetNewAdmin() string {
	if o == nil || IsNil(o.NewAdmin.Get()) {
		var ret string
		return ret
	}
	return *o.NewAdmin.Get()
}

// GetNewAdminOk returns a tuple with the NewAdmin field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveTransferOwnershipEventDTO) GetNewAdminOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.NewAdmin.Get(), o.NewAdmin.IsSet()
}

// HasNewAdmin returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasNewAdmin() bool {
	if o != nil && o.NewAdmin.IsSet() {
		return true
	}

	return false
}

// SetNewAdmin gets a reference to the given NullableString and assigns it to the NewAdmin field.
func (o *CurveTransferOwnershipEventDTO) SetNewAdmin(v string) {
	o.NewAdmin.Set(&v)
}
// SetNewAdminNil sets the value for NewAdmin to be an explicit nil
func (o *CurveTransferOwnershipEventDTO) SetNewAdminNil() {
	o.NewAdmin.Set(nil)
}

// UnsetNewAdmin ensures that no value is present for NewAdmin, not even an explicit nil
func (o *CurveTransferOwnershipEventDTO) UnsetNewAdmin() {
	o.NewAdmin.Unset()
}

// GetBlock returns the Block field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveTransferOwnershipEventDTO) GetBlock() string {
	if o == nil || IsNil(o.Block.Get()) {
		var ret string
		return ret
	}
	return *o.Block.Get()
}

// GetBlockOk returns a tuple with the Block field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveTransferOwnershipEventDTO) GetBlockOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Block.Get(), o.Block.IsSet()
}

// HasBlock returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasBlock() bool {
	if o != nil && o.Block.IsSet() {
		return true
	}

	return false
}

// SetBlock gets a reference to the given NullableString and assigns it to the Block field.
func (o *CurveTransferOwnershipEventDTO) SetBlock(v string) {
	o.Block.Set(&v)
}
// SetBlockNil sets the value for Block to be an explicit nil
func (o *CurveTransferOwnershipEventDTO) SetBlockNil() {
	o.Block.Set(nil)
}

// UnsetBlock ensures that no value is present for Block, not even an explicit nil
func (o *CurveTransferOwnershipEventDTO) UnsetBlock() {
	o.Block.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveTransferOwnershipEventDTO) GetTimestamp() string {
	if o == nil || IsNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveTransferOwnershipEventDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *CurveTransferOwnershipEventDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *CurveTransferOwnershipEventDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *CurveTransferOwnershipEventDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveTransferOwnershipEventDTO) GetTransaction() string {
	if o == nil || IsNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveTransferOwnershipEventDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *CurveTransferOwnershipEventDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *CurveTransferOwnershipEventDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *CurveTransferOwnershipEventDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveTransferOwnershipEventDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveTransferOwnershipEventDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveTransferOwnershipEventDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveTransferOwnershipEventDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o CurveTransferOwnershipEventDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CurveTransferOwnershipEventDTO) ToMap() (map[string]interface{}, error) {
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
	if o.NewAdmin.IsSet() {
		toSerialize["new_admin"] = o.NewAdmin.Get()
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

type NullableCurveTransferOwnershipEventDTO struct {
	value *CurveTransferOwnershipEventDTO
	isSet bool
}

func (v NullableCurveTransferOwnershipEventDTO) Get() *CurveTransferOwnershipEventDTO {
	return v.value
}

func (v *NullableCurveTransferOwnershipEventDTO) Set(val *CurveTransferOwnershipEventDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveTransferOwnershipEventDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveTransferOwnershipEventDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveTransferOwnershipEventDTO(val *CurveTransferOwnershipEventDTO) *NullableCurveTransferOwnershipEventDTO {
	return &NullableCurveTransferOwnershipEventDTO{value: val, isSet: true}
}

func (v NullableCurveTransferOwnershipEventDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveTransferOwnershipEventDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


