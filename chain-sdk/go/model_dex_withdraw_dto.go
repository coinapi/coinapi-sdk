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

// DexWithdrawDTO Withdraw of an user.
type DexWithdrawDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Identifier, format: <transaction hash>-<id>.
	Id NullableString `json:"id,omitempty"`
	// 
	User NullableString `json:"user,omitempty"`
	// 
	TokenAddress NullableString `json:"token_address,omitempty"`
	// 
	Amount NullableString `json:"amount,omitempty"`
	// 
	CreateEpoch NullableString `json:"create_epoch,omitempty"`
	// 
	CreateBatchId NullableString `json:"create_batch_id,omitempty"`
	// 
	TxHash NullableString `json:"tx_hash,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewDexWithdrawDTO instantiates a new DexWithdrawDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDexWithdrawDTO() *DexWithdrawDTO {
	this := DexWithdrawDTO{}
	return &this
}

// NewDexWithdrawDTOWithDefaults instantiates a new DexWithdrawDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDexWithdrawDTOWithDefaults() *DexWithdrawDTO {
	this := DexWithdrawDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *DexWithdrawDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexWithdrawDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *DexWithdrawDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *DexWithdrawDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexWithdrawDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *DexWithdrawDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *DexWithdrawDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexWithdrawDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *DexWithdrawDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexWithdrawDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexWithdrawDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *DexWithdrawDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *DexWithdrawDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *DexWithdrawDTO) UnsetId() {
	o.Id.Unset()
}

// GetUser returns the User field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexWithdrawDTO) GetUser() string {
	if o == nil || isNil(o.User.Get()) {
		var ret string
		return ret
	}
	return *o.User.Get()
}

// GetUserOk returns a tuple with the User field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexWithdrawDTO) GetUserOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.User.Get(), o.User.IsSet()
}

// HasUser returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasUser() bool {
	if o != nil && o.User.IsSet() {
		return true
	}

	return false
}

// SetUser gets a reference to the given NullableString and assigns it to the User field.
func (o *DexWithdrawDTO) SetUser(v string) {
	o.User.Set(&v)
}
// SetUserNil sets the value for User to be an explicit nil
func (o *DexWithdrawDTO) SetUserNil() {
	o.User.Set(nil)
}

// UnsetUser ensures that no value is present for User, not even an explicit nil
func (o *DexWithdrawDTO) UnsetUser() {
	o.User.Unset()
}

// GetTokenAddress returns the TokenAddress field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexWithdrawDTO) GetTokenAddress() string {
	if o == nil || isNil(o.TokenAddress.Get()) {
		var ret string
		return ret
	}
	return *o.TokenAddress.Get()
}

// GetTokenAddressOk returns a tuple with the TokenAddress field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexWithdrawDTO) GetTokenAddressOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TokenAddress.Get(), o.TokenAddress.IsSet()
}

// HasTokenAddress returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasTokenAddress() bool {
	if o != nil && o.TokenAddress.IsSet() {
		return true
	}

	return false
}

// SetTokenAddress gets a reference to the given NullableString and assigns it to the TokenAddress field.
func (o *DexWithdrawDTO) SetTokenAddress(v string) {
	o.TokenAddress.Set(&v)
}
// SetTokenAddressNil sets the value for TokenAddress to be an explicit nil
func (o *DexWithdrawDTO) SetTokenAddressNil() {
	o.TokenAddress.Set(nil)
}

// UnsetTokenAddress ensures that no value is present for TokenAddress, not even an explicit nil
func (o *DexWithdrawDTO) UnsetTokenAddress() {
	o.TokenAddress.Unset()
}

// GetAmount returns the Amount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexWithdrawDTO) GetAmount() string {
	if o == nil || isNil(o.Amount.Get()) {
		var ret string
		return ret
	}
	return *o.Amount.Get()
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexWithdrawDTO) GetAmountOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Amount.Get(), o.Amount.IsSet()
}

// HasAmount returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasAmount() bool {
	if o != nil && o.Amount.IsSet() {
		return true
	}

	return false
}

// SetAmount gets a reference to the given NullableString and assigns it to the Amount field.
func (o *DexWithdrawDTO) SetAmount(v string) {
	o.Amount.Set(&v)
}
// SetAmountNil sets the value for Amount to be an explicit nil
func (o *DexWithdrawDTO) SetAmountNil() {
	o.Amount.Set(nil)
}

// UnsetAmount ensures that no value is present for Amount, not even an explicit nil
func (o *DexWithdrawDTO) UnsetAmount() {
	o.Amount.Unset()
}

// GetCreateEpoch returns the CreateEpoch field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexWithdrawDTO) GetCreateEpoch() string {
	if o == nil || isNil(o.CreateEpoch.Get()) {
		var ret string
		return ret
	}
	return *o.CreateEpoch.Get()
}

// GetCreateEpochOk returns a tuple with the CreateEpoch field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexWithdrawDTO) GetCreateEpochOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.CreateEpoch.Get(), o.CreateEpoch.IsSet()
}

// HasCreateEpoch returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasCreateEpoch() bool {
	if o != nil && o.CreateEpoch.IsSet() {
		return true
	}

	return false
}

// SetCreateEpoch gets a reference to the given NullableString and assigns it to the CreateEpoch field.
func (o *DexWithdrawDTO) SetCreateEpoch(v string) {
	o.CreateEpoch.Set(&v)
}
// SetCreateEpochNil sets the value for CreateEpoch to be an explicit nil
func (o *DexWithdrawDTO) SetCreateEpochNil() {
	o.CreateEpoch.Set(nil)
}

// UnsetCreateEpoch ensures that no value is present for CreateEpoch, not even an explicit nil
func (o *DexWithdrawDTO) UnsetCreateEpoch() {
	o.CreateEpoch.Unset()
}

// GetCreateBatchId returns the CreateBatchId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexWithdrawDTO) GetCreateBatchId() string {
	if o == nil || isNil(o.CreateBatchId.Get()) {
		var ret string
		return ret
	}
	return *o.CreateBatchId.Get()
}

// GetCreateBatchIdOk returns a tuple with the CreateBatchId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexWithdrawDTO) GetCreateBatchIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.CreateBatchId.Get(), o.CreateBatchId.IsSet()
}

// HasCreateBatchId returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasCreateBatchId() bool {
	if o != nil && o.CreateBatchId.IsSet() {
		return true
	}

	return false
}

// SetCreateBatchId gets a reference to the given NullableString and assigns it to the CreateBatchId field.
func (o *DexWithdrawDTO) SetCreateBatchId(v string) {
	o.CreateBatchId.Set(&v)
}
// SetCreateBatchIdNil sets the value for CreateBatchId to be an explicit nil
func (o *DexWithdrawDTO) SetCreateBatchIdNil() {
	o.CreateBatchId.Set(nil)
}

// UnsetCreateBatchId ensures that no value is present for CreateBatchId, not even an explicit nil
func (o *DexWithdrawDTO) UnsetCreateBatchId() {
	o.CreateBatchId.Unset()
}

// GetTxHash returns the TxHash field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexWithdrawDTO) GetTxHash() string {
	if o == nil || isNil(o.TxHash.Get()) {
		var ret string
		return ret
	}
	return *o.TxHash.Get()
}

// GetTxHashOk returns a tuple with the TxHash field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexWithdrawDTO) GetTxHashOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TxHash.Get(), o.TxHash.IsSet()
}

// HasTxHash returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasTxHash() bool {
	if o != nil && o.TxHash.IsSet() {
		return true
	}

	return false
}

// SetTxHash gets a reference to the given NullableString and assigns it to the TxHash field.
func (o *DexWithdrawDTO) SetTxHash(v string) {
	o.TxHash.Set(&v)
}
// SetTxHashNil sets the value for TxHash to be an explicit nil
func (o *DexWithdrawDTO) SetTxHashNil() {
	o.TxHash.Set(nil)
}

// UnsetTxHash ensures that no value is present for TxHash, not even an explicit nil
func (o *DexWithdrawDTO) UnsetTxHash() {
	o.TxHash.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *DexWithdrawDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexWithdrawDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *DexWithdrawDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *DexWithdrawDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o DexWithdrawDTO) MarshalJSON() ([]byte, error) {
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
	if o.User.IsSet() {
		toSerialize["user"] = o.User.Get()
	}
	if o.TokenAddress.IsSet() {
		toSerialize["token_address"] = o.TokenAddress.Get()
	}
	if o.Amount.IsSet() {
		toSerialize["amount"] = o.Amount.Get()
	}
	if o.CreateEpoch.IsSet() {
		toSerialize["create_epoch"] = o.CreateEpoch.Get()
	}
	if o.CreateBatchId.IsSet() {
		toSerialize["create_batch_id"] = o.CreateBatchId.Get()
	}
	if o.TxHash.IsSet() {
		toSerialize["tx_hash"] = o.TxHash.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableDexWithdrawDTO struct {
	value *DexWithdrawDTO
	isSet bool
}

func (v NullableDexWithdrawDTO) Get() *DexWithdrawDTO {
	return v.value
}

func (v *NullableDexWithdrawDTO) Set(val *DexWithdrawDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableDexWithdrawDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableDexWithdrawDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDexWithdrawDTO(val *DexWithdrawDTO) *NullableDexWithdrawDTO {
	return &NullableDexWithdrawDTO{value: val, isSet: true}
}

func (v NullableDexWithdrawDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDexWithdrawDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


