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

// DexPriceDTO Token price in conjuction with batch id.
type DexPriceDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Identifier, format: (token id)-(batch id).
	Id NullableString `json:"id,omitempty"`
	// Token identifier.
	Token NullableString `json:"token,omitempty"`
	// Batch identifier.
	BatchId NullableString `json:"batch_id,omitempty"`
	// Price enumerator in OWL (derivative of the GNO token).
	PriceInOwlNumerator NullableString `json:"price_in_owl_numerator,omitempty"`
	// Price denominator in OWL (derivative of the GNO token).
	PriceInOwlDenominator NullableString `json:"price_in_owl_denominator,omitempty"`
	// Volume.
	Volume NullableString `json:"volume,omitempty"`
	// Create epoch.
	CreateEpoch NullableString `json:"create_epoch,omitempty"`
	// Transaction hash.
	TxHash NullableString `json:"tx_hash,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewDexPriceDTO instantiates a new DexPriceDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDexPriceDTO() *DexPriceDTO {
	this := DexPriceDTO{}
	return &this
}

// NewDexPriceDTOWithDefaults instantiates a new DexPriceDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDexPriceDTOWithDefaults() *DexPriceDTO {
	this := DexPriceDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *DexPriceDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexPriceDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *DexPriceDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *DexPriceDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *DexPriceDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexPriceDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *DexPriceDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *DexPriceDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *DexPriceDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexPriceDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *DexPriceDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *DexPriceDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexPriceDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexPriceDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *DexPriceDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *DexPriceDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *DexPriceDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *DexPriceDTO) UnsetId() {
	o.Id.Unset()
}

// GetToken returns the Token field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexPriceDTO) GetToken() string {
	if o == nil || isNil(o.Token.Get()) {
		var ret string
		return ret
	}
	return *o.Token.Get()
}

// GetTokenOk returns a tuple with the Token field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexPriceDTO) GetTokenOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Token.Get(), o.Token.IsSet()
}

// HasToken returns a boolean if a field has been set.
func (o *DexPriceDTO) HasToken() bool {
	if o != nil && o.Token.IsSet() {
		return true
	}

	return false
}

// SetToken gets a reference to the given NullableString and assigns it to the Token field.
func (o *DexPriceDTO) SetToken(v string) {
	o.Token.Set(&v)
}
// SetTokenNil sets the value for Token to be an explicit nil
func (o *DexPriceDTO) SetTokenNil() {
	o.Token.Set(nil)
}

// UnsetToken ensures that no value is present for Token, not even an explicit nil
func (o *DexPriceDTO) UnsetToken() {
	o.Token.Unset()
}

// GetBatchId returns the BatchId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexPriceDTO) GetBatchId() string {
	if o == nil || isNil(o.BatchId.Get()) {
		var ret string
		return ret
	}
	return *o.BatchId.Get()
}

// GetBatchIdOk returns a tuple with the BatchId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexPriceDTO) GetBatchIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.BatchId.Get(), o.BatchId.IsSet()
}

// HasBatchId returns a boolean if a field has been set.
func (o *DexPriceDTO) HasBatchId() bool {
	if o != nil && o.BatchId.IsSet() {
		return true
	}

	return false
}

// SetBatchId gets a reference to the given NullableString and assigns it to the BatchId field.
func (o *DexPriceDTO) SetBatchId(v string) {
	o.BatchId.Set(&v)
}
// SetBatchIdNil sets the value for BatchId to be an explicit nil
func (o *DexPriceDTO) SetBatchIdNil() {
	o.BatchId.Set(nil)
}

// UnsetBatchId ensures that no value is present for BatchId, not even an explicit nil
func (o *DexPriceDTO) UnsetBatchId() {
	o.BatchId.Unset()
}

// GetPriceInOwlNumerator returns the PriceInOwlNumerator field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexPriceDTO) GetPriceInOwlNumerator() string {
	if o == nil || isNil(o.PriceInOwlNumerator.Get()) {
		var ret string
		return ret
	}
	return *o.PriceInOwlNumerator.Get()
}

// GetPriceInOwlNumeratorOk returns a tuple with the PriceInOwlNumerator field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexPriceDTO) GetPriceInOwlNumeratorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.PriceInOwlNumerator.Get(), o.PriceInOwlNumerator.IsSet()
}

// HasPriceInOwlNumerator returns a boolean if a field has been set.
func (o *DexPriceDTO) HasPriceInOwlNumerator() bool {
	if o != nil && o.PriceInOwlNumerator.IsSet() {
		return true
	}

	return false
}

// SetPriceInOwlNumerator gets a reference to the given NullableString and assigns it to the PriceInOwlNumerator field.
func (o *DexPriceDTO) SetPriceInOwlNumerator(v string) {
	o.PriceInOwlNumerator.Set(&v)
}
// SetPriceInOwlNumeratorNil sets the value for PriceInOwlNumerator to be an explicit nil
func (o *DexPriceDTO) SetPriceInOwlNumeratorNil() {
	o.PriceInOwlNumerator.Set(nil)
}

// UnsetPriceInOwlNumerator ensures that no value is present for PriceInOwlNumerator, not even an explicit nil
func (o *DexPriceDTO) UnsetPriceInOwlNumerator() {
	o.PriceInOwlNumerator.Unset()
}

// GetPriceInOwlDenominator returns the PriceInOwlDenominator field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexPriceDTO) GetPriceInOwlDenominator() string {
	if o == nil || isNil(o.PriceInOwlDenominator.Get()) {
		var ret string
		return ret
	}
	return *o.PriceInOwlDenominator.Get()
}

// GetPriceInOwlDenominatorOk returns a tuple with the PriceInOwlDenominator field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexPriceDTO) GetPriceInOwlDenominatorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.PriceInOwlDenominator.Get(), o.PriceInOwlDenominator.IsSet()
}

// HasPriceInOwlDenominator returns a boolean if a field has been set.
func (o *DexPriceDTO) HasPriceInOwlDenominator() bool {
	if o != nil && o.PriceInOwlDenominator.IsSet() {
		return true
	}

	return false
}

// SetPriceInOwlDenominator gets a reference to the given NullableString and assigns it to the PriceInOwlDenominator field.
func (o *DexPriceDTO) SetPriceInOwlDenominator(v string) {
	o.PriceInOwlDenominator.Set(&v)
}
// SetPriceInOwlDenominatorNil sets the value for PriceInOwlDenominator to be an explicit nil
func (o *DexPriceDTO) SetPriceInOwlDenominatorNil() {
	o.PriceInOwlDenominator.Set(nil)
}

// UnsetPriceInOwlDenominator ensures that no value is present for PriceInOwlDenominator, not even an explicit nil
func (o *DexPriceDTO) UnsetPriceInOwlDenominator() {
	o.PriceInOwlDenominator.Unset()
}

// GetVolume returns the Volume field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexPriceDTO) GetVolume() string {
	if o == nil || isNil(o.Volume.Get()) {
		var ret string
		return ret
	}
	return *o.Volume.Get()
}

// GetVolumeOk returns a tuple with the Volume field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexPriceDTO) GetVolumeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Volume.Get(), o.Volume.IsSet()
}

// HasVolume returns a boolean if a field has been set.
func (o *DexPriceDTO) HasVolume() bool {
	if o != nil && o.Volume.IsSet() {
		return true
	}

	return false
}

// SetVolume gets a reference to the given NullableString and assigns it to the Volume field.
func (o *DexPriceDTO) SetVolume(v string) {
	o.Volume.Set(&v)
}
// SetVolumeNil sets the value for Volume to be an explicit nil
func (o *DexPriceDTO) SetVolumeNil() {
	o.Volume.Set(nil)
}

// UnsetVolume ensures that no value is present for Volume, not even an explicit nil
func (o *DexPriceDTO) UnsetVolume() {
	o.Volume.Unset()
}

// GetCreateEpoch returns the CreateEpoch field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexPriceDTO) GetCreateEpoch() string {
	if o == nil || isNil(o.CreateEpoch.Get()) {
		var ret string
		return ret
	}
	return *o.CreateEpoch.Get()
}

// GetCreateEpochOk returns a tuple with the CreateEpoch field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexPriceDTO) GetCreateEpochOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.CreateEpoch.Get(), o.CreateEpoch.IsSet()
}

// HasCreateEpoch returns a boolean if a field has been set.
func (o *DexPriceDTO) HasCreateEpoch() bool {
	if o != nil && o.CreateEpoch.IsSet() {
		return true
	}

	return false
}

// SetCreateEpoch gets a reference to the given NullableString and assigns it to the CreateEpoch field.
func (o *DexPriceDTO) SetCreateEpoch(v string) {
	o.CreateEpoch.Set(&v)
}
// SetCreateEpochNil sets the value for CreateEpoch to be an explicit nil
func (o *DexPriceDTO) SetCreateEpochNil() {
	o.CreateEpoch.Set(nil)
}

// UnsetCreateEpoch ensures that no value is present for CreateEpoch, not even an explicit nil
func (o *DexPriceDTO) UnsetCreateEpoch() {
	o.CreateEpoch.Unset()
}

// GetTxHash returns the TxHash field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexPriceDTO) GetTxHash() string {
	if o == nil || isNil(o.TxHash.Get()) {
		var ret string
		return ret
	}
	return *o.TxHash.Get()
}

// GetTxHashOk returns a tuple with the TxHash field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexPriceDTO) GetTxHashOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TxHash.Get(), o.TxHash.IsSet()
}

// HasTxHash returns a boolean if a field has been set.
func (o *DexPriceDTO) HasTxHash() bool {
	if o != nil && o.TxHash.IsSet() {
		return true
	}

	return false
}

// SetTxHash gets a reference to the given NullableString and assigns it to the TxHash field.
func (o *DexPriceDTO) SetTxHash(v string) {
	o.TxHash.Set(&v)
}
// SetTxHashNil sets the value for TxHash to be an explicit nil
func (o *DexPriceDTO) SetTxHashNil() {
	o.TxHash.Set(nil)
}

// UnsetTxHash ensures that no value is present for TxHash, not even an explicit nil
func (o *DexPriceDTO) UnsetTxHash() {
	o.TxHash.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *DexPriceDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexPriceDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *DexPriceDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *DexPriceDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o DexPriceDTO) MarshalJSON() ([]byte, error) {
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
	if o.Token.IsSet() {
		toSerialize["token"] = o.Token.Get()
	}
	if o.BatchId.IsSet() {
		toSerialize["batch_id"] = o.BatchId.Get()
	}
	if o.PriceInOwlNumerator.IsSet() {
		toSerialize["price_in_owl_numerator"] = o.PriceInOwlNumerator.Get()
	}
	if o.PriceInOwlDenominator.IsSet() {
		toSerialize["price_in_owl_denominator"] = o.PriceInOwlDenominator.Get()
	}
	if o.Volume.IsSet() {
		toSerialize["volume"] = o.Volume.Get()
	}
	if o.CreateEpoch.IsSet() {
		toSerialize["create_epoch"] = o.CreateEpoch.Get()
	}
	if o.TxHash.IsSet() {
		toSerialize["tx_hash"] = o.TxHash.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableDexPriceDTO struct {
	value *DexPriceDTO
	isSet bool
}

func (v NullableDexPriceDTO) Get() *DexPriceDTO {
	return v.value
}

func (v *NullableDexPriceDTO) Set(val *DexPriceDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableDexPriceDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableDexPriceDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDexPriceDTO(val *DexPriceDTO) *NullableDexPriceDTO {
	return &NullableDexPriceDTO{value: val, isSet: true}
}

func (v NullableDexPriceDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDexPriceDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


