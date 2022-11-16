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

// CurveCoinDTO struct for CurveCoinDTO
type CurveCoinDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Identifier, format: <pool_id>-<coin_index>.
	Id NullableString `json:"id,omitempty"`
	// Coin index.
	Index *int32 `json:"index,omitempty"`
	// 
	Pool NullableString `json:"pool,omitempty"`
	// 
	Token NullableString `json:"token,omitempty"`
	// 
	Underlying NullableString `json:"underlying,omitempty"`
	// 
	Balance NullableString `json:"balance,omitempty"`
	// Exchange rate between this coin and the associated underlying coin within the pool.
	Rate NullableString `json:"rate,omitempty"`
	// 
	Updated NullableString `json:"updated,omitempty"`
	// 
	UpdatedAtBlock NullableString `json:"updated_at_block,omitempty"`
	// 
	UpdatedAtTransaction NullableString `json:"updated_at_transaction,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	// 
	BlockRange NullableString `json:"block_range,omitempty"`
}

// NewCurveCoinDTO instantiates a new CurveCoinDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveCoinDTO() *CurveCoinDTO {
	this := CurveCoinDTO{}
	return &this
}

// NewCurveCoinDTOWithDefaults instantiates a new CurveCoinDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveCoinDTOWithDefaults() *CurveCoinDTO {
	this := CurveCoinDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveCoinDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveCoinDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveCoinDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveCoinDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveCoinDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveCoinDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveCoinDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveCoinDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveCoinDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveCoinDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveCoinDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveCoinDTO) UnsetId() {
	o.Id.Unset()
}

// GetIndex returns the Index field value if set, zero value otherwise.
func (o *CurveCoinDTO) GetIndex() int32 {
	if o == nil || isNil(o.Index) {
		var ret int32
		return ret
	}
	return *o.Index
}

// GetIndexOk returns a tuple with the Index field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveCoinDTO) GetIndexOk() (*int32, bool) {
	if o == nil || isNil(o.Index) {
    return nil, false
	}
	return o.Index, true
}

// HasIndex returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasIndex() bool {
	if o != nil && !isNil(o.Index) {
		return true
	}

	return false
}

// SetIndex gets a reference to the given int32 and assigns it to the Index field.
func (o *CurveCoinDTO) SetIndex(v int32) {
	o.Index = &v
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetPool() string {
	if o == nil || isNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetPoolOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *CurveCoinDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *CurveCoinDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *CurveCoinDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetToken returns the Token field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetToken() string {
	if o == nil || isNil(o.Token.Get()) {
		var ret string
		return ret
	}
	return *o.Token.Get()
}

// GetTokenOk returns a tuple with the Token field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetTokenOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Token.Get(), o.Token.IsSet()
}

// HasToken returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasToken() bool {
	if o != nil && o.Token.IsSet() {
		return true
	}

	return false
}

// SetToken gets a reference to the given NullableString and assigns it to the Token field.
func (o *CurveCoinDTO) SetToken(v string) {
	o.Token.Set(&v)
}
// SetTokenNil sets the value for Token to be an explicit nil
func (o *CurveCoinDTO) SetTokenNil() {
	o.Token.Set(nil)
}

// UnsetToken ensures that no value is present for Token, not even an explicit nil
func (o *CurveCoinDTO) UnsetToken() {
	o.Token.Unset()
}

// GetUnderlying returns the Underlying field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetUnderlying() string {
	if o == nil || isNil(o.Underlying.Get()) {
		var ret string
		return ret
	}
	return *o.Underlying.Get()
}

// GetUnderlyingOk returns a tuple with the Underlying field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetUnderlyingOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Underlying.Get(), o.Underlying.IsSet()
}

// HasUnderlying returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasUnderlying() bool {
	if o != nil && o.Underlying.IsSet() {
		return true
	}

	return false
}

// SetUnderlying gets a reference to the given NullableString and assigns it to the Underlying field.
func (o *CurveCoinDTO) SetUnderlying(v string) {
	o.Underlying.Set(&v)
}
// SetUnderlyingNil sets the value for Underlying to be an explicit nil
func (o *CurveCoinDTO) SetUnderlyingNil() {
	o.Underlying.Set(nil)
}

// UnsetUnderlying ensures that no value is present for Underlying, not even an explicit nil
func (o *CurveCoinDTO) UnsetUnderlying() {
	o.Underlying.Unset()
}

// GetBalance returns the Balance field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetBalance() string {
	if o == nil || isNil(o.Balance.Get()) {
		var ret string
		return ret
	}
	return *o.Balance.Get()
}

// GetBalanceOk returns a tuple with the Balance field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetBalanceOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Balance.Get(), o.Balance.IsSet()
}

// HasBalance returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasBalance() bool {
	if o != nil && o.Balance.IsSet() {
		return true
	}

	return false
}

// SetBalance gets a reference to the given NullableString and assigns it to the Balance field.
func (o *CurveCoinDTO) SetBalance(v string) {
	o.Balance.Set(&v)
}
// SetBalanceNil sets the value for Balance to be an explicit nil
func (o *CurveCoinDTO) SetBalanceNil() {
	o.Balance.Set(nil)
}

// UnsetBalance ensures that no value is present for Balance, not even an explicit nil
func (o *CurveCoinDTO) UnsetBalance() {
	o.Balance.Unset()
}

// GetRate returns the Rate field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetRate() string {
	if o == nil || isNil(o.Rate.Get()) {
		var ret string
		return ret
	}
	return *o.Rate.Get()
}

// GetRateOk returns a tuple with the Rate field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetRateOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Rate.Get(), o.Rate.IsSet()
}

// HasRate returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasRate() bool {
	if o != nil && o.Rate.IsSet() {
		return true
	}

	return false
}

// SetRate gets a reference to the given NullableString and assigns it to the Rate field.
func (o *CurveCoinDTO) SetRate(v string) {
	o.Rate.Set(&v)
}
// SetRateNil sets the value for Rate to be an explicit nil
func (o *CurveCoinDTO) SetRateNil() {
	o.Rate.Set(nil)
}

// UnsetRate ensures that no value is present for Rate, not even an explicit nil
func (o *CurveCoinDTO) UnsetRate() {
	o.Rate.Unset()
}

// GetUpdated returns the Updated field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetUpdated() string {
	if o == nil || isNil(o.Updated.Get()) {
		var ret string
		return ret
	}
	return *o.Updated.Get()
}

// GetUpdatedOk returns a tuple with the Updated field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetUpdatedOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Updated.Get(), o.Updated.IsSet()
}

// HasUpdated returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasUpdated() bool {
	if o != nil && o.Updated.IsSet() {
		return true
	}

	return false
}

// SetUpdated gets a reference to the given NullableString and assigns it to the Updated field.
func (o *CurveCoinDTO) SetUpdated(v string) {
	o.Updated.Set(&v)
}
// SetUpdatedNil sets the value for Updated to be an explicit nil
func (o *CurveCoinDTO) SetUpdatedNil() {
	o.Updated.Set(nil)
}

// UnsetUpdated ensures that no value is present for Updated, not even an explicit nil
func (o *CurveCoinDTO) UnsetUpdated() {
	o.Updated.Unset()
}

// GetUpdatedAtBlock returns the UpdatedAtBlock field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetUpdatedAtBlock() string {
	if o == nil || isNil(o.UpdatedAtBlock.Get()) {
		var ret string
		return ret
	}
	return *o.UpdatedAtBlock.Get()
}

// GetUpdatedAtBlockOk returns a tuple with the UpdatedAtBlock field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetUpdatedAtBlockOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.UpdatedAtBlock.Get(), o.UpdatedAtBlock.IsSet()
}

// HasUpdatedAtBlock returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasUpdatedAtBlock() bool {
	if o != nil && o.UpdatedAtBlock.IsSet() {
		return true
	}

	return false
}

// SetUpdatedAtBlock gets a reference to the given NullableString and assigns it to the UpdatedAtBlock field.
func (o *CurveCoinDTO) SetUpdatedAtBlock(v string) {
	o.UpdatedAtBlock.Set(&v)
}
// SetUpdatedAtBlockNil sets the value for UpdatedAtBlock to be an explicit nil
func (o *CurveCoinDTO) SetUpdatedAtBlockNil() {
	o.UpdatedAtBlock.Set(nil)
}

// UnsetUpdatedAtBlock ensures that no value is present for UpdatedAtBlock, not even an explicit nil
func (o *CurveCoinDTO) UnsetUpdatedAtBlock() {
	o.UpdatedAtBlock.Unset()
}

// GetUpdatedAtTransaction returns the UpdatedAtTransaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetUpdatedAtTransaction() string {
	if o == nil || isNil(o.UpdatedAtTransaction.Get()) {
		var ret string
		return ret
	}
	return *o.UpdatedAtTransaction.Get()
}

// GetUpdatedAtTransactionOk returns a tuple with the UpdatedAtTransaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetUpdatedAtTransactionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.UpdatedAtTransaction.Get(), o.UpdatedAtTransaction.IsSet()
}

// HasUpdatedAtTransaction returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasUpdatedAtTransaction() bool {
	if o != nil && o.UpdatedAtTransaction.IsSet() {
		return true
	}

	return false
}

// SetUpdatedAtTransaction gets a reference to the given NullableString and assigns it to the UpdatedAtTransaction field.
func (o *CurveCoinDTO) SetUpdatedAtTransaction(v string) {
	o.UpdatedAtTransaction.Set(&v)
}
// SetUpdatedAtTransactionNil sets the value for UpdatedAtTransaction to be an explicit nil
func (o *CurveCoinDTO) SetUpdatedAtTransactionNil() {
	o.UpdatedAtTransaction.Set(nil)
}

// UnsetUpdatedAtTransaction ensures that no value is present for UpdatedAtTransaction, not even an explicit nil
func (o *CurveCoinDTO) UnsetUpdatedAtTransaction() {
	o.UpdatedAtTransaction.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveCoinDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveCoinDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveCoinDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetBlockRange returns the BlockRange field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveCoinDTO) GetBlockRange() string {
	if o == nil || isNil(o.BlockRange.Get()) {
		var ret string
		return ret
	}
	return *o.BlockRange.Get()
}

// GetBlockRangeOk returns a tuple with the BlockRange field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveCoinDTO) GetBlockRangeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.BlockRange.Get(), o.BlockRange.IsSet()
}

// HasBlockRange returns a boolean if a field has been set.
func (o *CurveCoinDTO) HasBlockRange() bool {
	if o != nil && o.BlockRange.IsSet() {
		return true
	}

	return false
}

// SetBlockRange gets a reference to the given NullableString and assigns it to the BlockRange field.
func (o *CurveCoinDTO) SetBlockRange(v string) {
	o.BlockRange.Set(&v)
}
// SetBlockRangeNil sets the value for BlockRange to be an explicit nil
func (o *CurveCoinDTO) SetBlockRangeNil() {
	o.BlockRange.Set(nil)
}

// UnsetBlockRange ensures that no value is present for BlockRange, not even an explicit nil
func (o *CurveCoinDTO) UnsetBlockRange() {
	o.BlockRange.Unset()
}

func (o CurveCoinDTO) MarshalJSON() ([]byte, error) {
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
	if o.Underlying.IsSet() {
		toSerialize["underlying"] = o.Underlying.Get()
	}
	if o.Balance.IsSet() {
		toSerialize["balance"] = o.Balance.Get()
	}
	if o.Rate.IsSet() {
		toSerialize["rate"] = o.Rate.Get()
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
	if o.BlockRange.IsSet() {
		toSerialize["block_range"] = o.BlockRange.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableCurveCoinDTO struct {
	value *CurveCoinDTO
	isSet bool
}

func (v NullableCurveCoinDTO) Get() *CurveCoinDTO {
	return v.value
}

func (v *NullableCurveCoinDTO) Set(val *CurveCoinDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveCoinDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveCoinDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveCoinDTO(val *CurveCoinDTO) *NullableCurveCoinDTO {
	return &NullableCurveCoinDTO{value: val, isSet: true}
}

func (v NullableCurveCoinDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveCoinDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


