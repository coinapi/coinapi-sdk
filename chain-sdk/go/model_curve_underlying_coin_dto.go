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

// CurveUnderlyingCoinDTO struct for CurveUnderlyingCoinDTO
type CurveUnderlyingCoinDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Equals to: (pool_id)-(coin_index).
	Id NullableString `json:"id,omitempty"`
	// Coin index.
	Index *int32 `json:"index,omitempty"`
	// 
	Pool NullableString `json:"pool,omitempty"`
	// 
	Token NullableString `json:"token,omitempty"`
	// 
	Coin NullableString `json:"coin,omitempty"`
	// 
	Balance NullableString `json:"balance,omitempty"`
	// 
	Updated NullableString `json:"updated,omitempty"`
	// 
	UpdatedAtBlock NullableString `json:"updated_at_block,omitempty"`
	// 
	UpdatedAtTransaction NullableString `json:"updated_at_transaction,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewCurveUnderlyingCoinDTO instantiates a new CurveUnderlyingCoinDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveUnderlyingCoinDTO() *CurveUnderlyingCoinDTO {
	this := CurveUnderlyingCoinDTO{}
	return &this
}

// NewCurveUnderlyingCoinDTOWithDefaults instantiates a new CurveUnderlyingCoinDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveUnderlyingCoinDTOWithDefaults() *CurveUnderlyingCoinDTO {
	this := CurveUnderlyingCoinDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveUnderlyingCoinDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveUnderlyingCoinDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveUnderlyingCoinDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveUnderlyingCoinDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveUnderlyingCoinDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveUnderlyingCoinDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveUnderlyingCoinDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveUnderlyingCoinDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveUnderlyingCoinDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveUnderlyingCoinDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveUnderlyingCoinDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveUnderlyingCoinDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveUnderlyingCoinDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveUnderlyingCoinDTO) UnsetId() {
	o.Id.Unset()
}

// GetIndex returns the Index field value if set, zero value otherwise.
func (o *CurveUnderlyingCoinDTO) GetIndex() int32 {
	if o == nil || isNil(o.Index) {
		var ret int32
		return ret
	}
	return *o.Index
}

// GetIndexOk returns a tuple with the Index field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveUnderlyingCoinDTO) GetIndexOk() (*int32, bool) {
	if o == nil || isNil(o.Index) {
    return nil, false
	}
	return o.Index, true
}

// HasIndex returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasIndex() bool {
	if o != nil && !isNil(o.Index) {
		return true
	}

	return false
}

// SetIndex gets a reference to the given int32 and assigns it to the Index field.
func (o *CurveUnderlyingCoinDTO) SetIndex(v int32) {
	o.Index = &v
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveUnderlyingCoinDTO) GetPool() string {
	if o == nil || isNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveUnderlyingCoinDTO) GetPoolOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *CurveUnderlyingCoinDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *CurveUnderlyingCoinDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *CurveUnderlyingCoinDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetToken returns the Token field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveUnderlyingCoinDTO) GetToken() string {
	if o == nil || isNil(o.Token.Get()) {
		var ret string
		return ret
	}
	return *o.Token.Get()
}

// GetTokenOk returns a tuple with the Token field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveUnderlyingCoinDTO) GetTokenOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Token.Get(), o.Token.IsSet()
}

// HasToken returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasToken() bool {
	if o != nil && o.Token.IsSet() {
		return true
	}

	return false
}

// SetToken gets a reference to the given NullableString and assigns it to the Token field.
func (o *CurveUnderlyingCoinDTO) SetToken(v string) {
	o.Token.Set(&v)
}
// SetTokenNil sets the value for Token to be an explicit nil
func (o *CurveUnderlyingCoinDTO) SetTokenNil() {
	o.Token.Set(nil)
}

// UnsetToken ensures that no value is present for Token, not even an explicit nil
func (o *CurveUnderlyingCoinDTO) UnsetToken() {
	o.Token.Unset()
}

// GetCoin returns the Coin field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveUnderlyingCoinDTO) GetCoin() string {
	if o == nil || isNil(o.Coin.Get()) {
		var ret string
		return ret
	}
	return *o.Coin.Get()
}

// GetCoinOk returns a tuple with the Coin field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveUnderlyingCoinDTO) GetCoinOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Coin.Get(), o.Coin.IsSet()
}

// HasCoin returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasCoin() bool {
	if o != nil && o.Coin.IsSet() {
		return true
	}

	return false
}

// SetCoin gets a reference to the given NullableString and assigns it to the Coin field.
func (o *CurveUnderlyingCoinDTO) SetCoin(v string) {
	o.Coin.Set(&v)
}
// SetCoinNil sets the value for Coin to be an explicit nil
func (o *CurveUnderlyingCoinDTO) SetCoinNil() {
	o.Coin.Set(nil)
}

// UnsetCoin ensures that no value is present for Coin, not even an explicit nil
func (o *CurveUnderlyingCoinDTO) UnsetCoin() {
	o.Coin.Unset()
}

// GetBalance returns the Balance field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveUnderlyingCoinDTO) GetBalance() string {
	if o == nil || isNil(o.Balance.Get()) {
		var ret string
		return ret
	}
	return *o.Balance.Get()
}

// GetBalanceOk returns a tuple with the Balance field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveUnderlyingCoinDTO) GetBalanceOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Balance.Get(), o.Balance.IsSet()
}

// HasBalance returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasBalance() bool {
	if o != nil && o.Balance.IsSet() {
		return true
	}

	return false
}

// SetBalance gets a reference to the given NullableString and assigns it to the Balance field.
func (o *CurveUnderlyingCoinDTO) SetBalance(v string) {
	o.Balance.Set(&v)
}
// SetBalanceNil sets the value for Balance to be an explicit nil
func (o *CurveUnderlyingCoinDTO) SetBalanceNil() {
	o.Balance.Set(nil)
}

// UnsetBalance ensures that no value is present for Balance, not even an explicit nil
func (o *CurveUnderlyingCoinDTO) UnsetBalance() {
	o.Balance.Unset()
}

// GetUpdated returns the Updated field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveUnderlyingCoinDTO) GetUpdated() string {
	if o == nil || isNil(o.Updated.Get()) {
		var ret string
		return ret
	}
	return *o.Updated.Get()
}

// GetUpdatedOk returns a tuple with the Updated field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveUnderlyingCoinDTO) GetUpdatedOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Updated.Get(), o.Updated.IsSet()
}

// HasUpdated returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasUpdated() bool {
	if o != nil && o.Updated.IsSet() {
		return true
	}

	return false
}

// SetUpdated gets a reference to the given NullableString and assigns it to the Updated field.
func (o *CurveUnderlyingCoinDTO) SetUpdated(v string) {
	o.Updated.Set(&v)
}
// SetUpdatedNil sets the value for Updated to be an explicit nil
func (o *CurveUnderlyingCoinDTO) SetUpdatedNil() {
	o.Updated.Set(nil)
}

// UnsetUpdated ensures that no value is present for Updated, not even an explicit nil
func (o *CurveUnderlyingCoinDTO) UnsetUpdated() {
	o.Updated.Unset()
}

// GetUpdatedAtBlock returns the UpdatedAtBlock field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveUnderlyingCoinDTO) GetUpdatedAtBlock() string {
	if o == nil || isNil(o.UpdatedAtBlock.Get()) {
		var ret string
		return ret
	}
	return *o.UpdatedAtBlock.Get()
}

// GetUpdatedAtBlockOk returns a tuple with the UpdatedAtBlock field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveUnderlyingCoinDTO) GetUpdatedAtBlockOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.UpdatedAtBlock.Get(), o.UpdatedAtBlock.IsSet()
}

// HasUpdatedAtBlock returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasUpdatedAtBlock() bool {
	if o != nil && o.UpdatedAtBlock.IsSet() {
		return true
	}

	return false
}

// SetUpdatedAtBlock gets a reference to the given NullableString and assigns it to the UpdatedAtBlock field.
func (o *CurveUnderlyingCoinDTO) SetUpdatedAtBlock(v string) {
	o.UpdatedAtBlock.Set(&v)
}
// SetUpdatedAtBlockNil sets the value for UpdatedAtBlock to be an explicit nil
func (o *CurveUnderlyingCoinDTO) SetUpdatedAtBlockNil() {
	o.UpdatedAtBlock.Set(nil)
}

// UnsetUpdatedAtBlock ensures that no value is present for UpdatedAtBlock, not even an explicit nil
func (o *CurveUnderlyingCoinDTO) UnsetUpdatedAtBlock() {
	o.UpdatedAtBlock.Unset()
}

// GetUpdatedAtTransaction returns the UpdatedAtTransaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveUnderlyingCoinDTO) GetUpdatedAtTransaction() string {
	if o == nil || isNil(o.UpdatedAtTransaction.Get()) {
		var ret string
		return ret
	}
	return *o.UpdatedAtTransaction.Get()
}

// GetUpdatedAtTransactionOk returns a tuple with the UpdatedAtTransaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveUnderlyingCoinDTO) GetUpdatedAtTransactionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.UpdatedAtTransaction.Get(), o.UpdatedAtTransaction.IsSet()
}

// HasUpdatedAtTransaction returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasUpdatedAtTransaction() bool {
	if o != nil && o.UpdatedAtTransaction.IsSet() {
		return true
	}

	return false
}

// SetUpdatedAtTransaction gets a reference to the given NullableString and assigns it to the UpdatedAtTransaction field.
func (o *CurveUnderlyingCoinDTO) SetUpdatedAtTransaction(v string) {
	o.UpdatedAtTransaction.Set(&v)
}
// SetUpdatedAtTransactionNil sets the value for UpdatedAtTransaction to be an explicit nil
func (o *CurveUnderlyingCoinDTO) SetUpdatedAtTransactionNil() {
	o.UpdatedAtTransaction.Set(nil)
}

// UnsetUpdatedAtTransaction ensures that no value is present for UpdatedAtTransaction, not even an explicit nil
func (o *CurveUnderlyingCoinDTO) UnsetUpdatedAtTransaction() {
	o.UpdatedAtTransaction.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveUnderlyingCoinDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveUnderlyingCoinDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveUnderlyingCoinDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveUnderlyingCoinDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o CurveUnderlyingCoinDTO) MarshalJSON() ([]byte, error) {
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
	if !isNil(o.Index) {
		toSerialize["index"] = o.Index
	}
	if o.Pool.IsSet() {
		toSerialize["pool"] = o.Pool.Get()
	}
	if o.Token.IsSet() {
		toSerialize["token"] = o.Token.Get()
	}
	if o.Coin.IsSet() {
		toSerialize["coin"] = o.Coin.Get()
	}
	if o.Balance.IsSet() {
		toSerialize["balance"] = o.Balance.Get()
	}
	if o.Updated.IsSet() {
		toSerialize["updated"] = o.Updated.Get()
	}
	if o.UpdatedAtBlock.IsSet() {
		toSerialize["updated_at_block"] = o.UpdatedAtBlock.Get()
	}
	if o.UpdatedAtTransaction.IsSet() {
		toSerialize["updated_at_transaction"] = o.UpdatedAtTransaction.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableCurveUnderlyingCoinDTO struct {
	value *CurveUnderlyingCoinDTO
	isSet bool
}

func (v NullableCurveUnderlyingCoinDTO) Get() *CurveUnderlyingCoinDTO {
	return v.value
}

func (v *NullableCurveUnderlyingCoinDTO) Set(val *CurveUnderlyingCoinDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveUnderlyingCoinDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveUnderlyingCoinDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveUnderlyingCoinDTO(val *CurveUnderlyingCoinDTO) *NullableCurveUnderlyingCoinDTO {
	return &NullableCurveUnderlyingCoinDTO{value: val, isSet: true}
}

func (v NullableCurveUnderlyingCoinDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveUnderlyingCoinDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


