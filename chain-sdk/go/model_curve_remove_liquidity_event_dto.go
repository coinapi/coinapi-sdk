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

// checks if the CurveRemoveLiquidityEventDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CurveRemoveLiquidityEventDTO{}

// CurveRemoveLiquidityEventDTO struct for CurveRemoveLiquidityEventDTO
type CurveRemoveLiquidityEventDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	Pool NullableString `json:"pool,omitempty"`
	// 
	Provider NullableString `json:"provider,omitempty"`
	// 
	TokenAmounts []string `json:"token_amounts,omitempty"`
	// 
	Fees []string `json:"fees,omitempty"`
	// 
	TokenSupply NullableString `json:"token_supply,omitempty"`
	// 
	Invariant NullableString `json:"invariant,omitempty"`
	// 
	Block NullableString `json:"block,omitempty"`
	// 
	Timestamp NullableString `json:"timestamp,omitempty"`
	// 
	Transaction NullableString `json:"transaction,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewCurveRemoveLiquidityEventDTO instantiates a new CurveRemoveLiquidityEventDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveRemoveLiquidityEventDTO() *CurveRemoveLiquidityEventDTO {
	this := CurveRemoveLiquidityEventDTO{}
	return &this
}

// NewCurveRemoveLiquidityEventDTOWithDefaults instantiates a new CurveRemoveLiquidityEventDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveRemoveLiquidityEventDTOWithDefaults() *CurveRemoveLiquidityEventDTO {
	this := CurveRemoveLiquidityEventDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveRemoveLiquidityEventDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveRemoveLiquidityEventDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveRemoveLiquidityEventDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveRemoveLiquidityEventDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveRemoveLiquidityEventDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveRemoveLiquidityEventDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveRemoveLiquidityEventDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveRemoveLiquidityEventDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveRemoveLiquidityEventDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveRemoveLiquidityEventDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveRemoveLiquidityEventDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveRemoveLiquidityEventDTO) UnsetId() {
	o.Id.Unset()
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetPool() string {
	if o == nil || isNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetPoolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *CurveRemoveLiquidityEventDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *CurveRemoveLiquidityEventDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *CurveRemoveLiquidityEventDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetProvider returns the Provider field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetProvider() string {
	if o == nil || isNil(o.Provider.Get()) {
		var ret string
		return ret
	}
	return *o.Provider.Get()
}

// GetProviderOk returns a tuple with the Provider field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetProviderOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Provider.Get(), o.Provider.IsSet()
}

// HasProvider returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasProvider() bool {
	if o != nil && o.Provider.IsSet() {
		return true
	}

	return false
}

// SetProvider gets a reference to the given NullableString and assigns it to the Provider field.
func (o *CurveRemoveLiquidityEventDTO) SetProvider(v string) {
	o.Provider.Set(&v)
}
// SetProviderNil sets the value for Provider to be an explicit nil
func (o *CurveRemoveLiquidityEventDTO) SetProviderNil() {
	o.Provider.Set(nil)
}

// UnsetProvider ensures that no value is present for Provider, not even an explicit nil
func (o *CurveRemoveLiquidityEventDTO) UnsetProvider() {
	o.Provider.Unset()
}

// GetTokenAmounts returns the TokenAmounts field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetTokenAmounts() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.TokenAmounts
}

// GetTokenAmountsOk returns a tuple with the TokenAmounts field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetTokenAmountsOk() ([]string, bool) {
	if o == nil || isNil(o.TokenAmounts) {
		return nil, false
	}
	return o.TokenAmounts, true
}

// HasTokenAmounts returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasTokenAmounts() bool {
	if o != nil && isNil(o.TokenAmounts) {
		return true
	}

	return false
}

// SetTokenAmounts gets a reference to the given []string and assigns it to the TokenAmounts field.
func (o *CurveRemoveLiquidityEventDTO) SetTokenAmounts(v []string) {
	o.TokenAmounts = v
}

// GetFees returns the Fees field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetFees() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Fees
}

// GetFeesOk returns a tuple with the Fees field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetFeesOk() ([]string, bool) {
	if o == nil || isNil(o.Fees) {
		return nil, false
	}
	return o.Fees, true
}

// HasFees returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasFees() bool {
	if o != nil && isNil(o.Fees) {
		return true
	}

	return false
}

// SetFees gets a reference to the given []string and assigns it to the Fees field.
func (o *CurveRemoveLiquidityEventDTO) SetFees(v []string) {
	o.Fees = v
}

// GetTokenSupply returns the TokenSupply field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetTokenSupply() string {
	if o == nil || isNil(o.TokenSupply.Get()) {
		var ret string
		return ret
	}
	return *o.TokenSupply.Get()
}

// GetTokenSupplyOk returns a tuple with the TokenSupply field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetTokenSupplyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TokenSupply.Get(), o.TokenSupply.IsSet()
}

// HasTokenSupply returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasTokenSupply() bool {
	if o != nil && o.TokenSupply.IsSet() {
		return true
	}

	return false
}

// SetTokenSupply gets a reference to the given NullableString and assigns it to the TokenSupply field.
func (o *CurveRemoveLiquidityEventDTO) SetTokenSupply(v string) {
	o.TokenSupply.Set(&v)
}
// SetTokenSupplyNil sets the value for TokenSupply to be an explicit nil
func (o *CurveRemoveLiquidityEventDTO) SetTokenSupplyNil() {
	o.TokenSupply.Set(nil)
}

// UnsetTokenSupply ensures that no value is present for TokenSupply, not even an explicit nil
func (o *CurveRemoveLiquidityEventDTO) UnsetTokenSupply() {
	o.TokenSupply.Unset()
}

// GetInvariant returns the Invariant field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetInvariant() string {
	if o == nil || isNil(o.Invariant.Get()) {
		var ret string
		return ret
	}
	return *o.Invariant.Get()
}

// GetInvariantOk returns a tuple with the Invariant field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetInvariantOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Invariant.Get(), o.Invariant.IsSet()
}

// HasInvariant returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasInvariant() bool {
	if o != nil && o.Invariant.IsSet() {
		return true
	}

	return false
}

// SetInvariant gets a reference to the given NullableString and assigns it to the Invariant field.
func (o *CurveRemoveLiquidityEventDTO) SetInvariant(v string) {
	o.Invariant.Set(&v)
}
// SetInvariantNil sets the value for Invariant to be an explicit nil
func (o *CurveRemoveLiquidityEventDTO) SetInvariantNil() {
	o.Invariant.Set(nil)
}

// UnsetInvariant ensures that no value is present for Invariant, not even an explicit nil
func (o *CurveRemoveLiquidityEventDTO) UnsetInvariant() {
	o.Invariant.Unset()
}

// GetBlock returns the Block field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetBlock() string {
	if o == nil || isNil(o.Block.Get()) {
		var ret string
		return ret
	}
	return *o.Block.Get()
}

// GetBlockOk returns a tuple with the Block field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetBlockOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Block.Get(), o.Block.IsSet()
}

// HasBlock returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasBlock() bool {
	if o != nil && o.Block.IsSet() {
		return true
	}

	return false
}

// SetBlock gets a reference to the given NullableString and assigns it to the Block field.
func (o *CurveRemoveLiquidityEventDTO) SetBlock(v string) {
	o.Block.Set(&v)
}
// SetBlockNil sets the value for Block to be an explicit nil
func (o *CurveRemoveLiquidityEventDTO) SetBlockNil() {
	o.Block.Set(nil)
}

// UnsetBlock ensures that no value is present for Block, not even an explicit nil
func (o *CurveRemoveLiquidityEventDTO) UnsetBlock() {
	o.Block.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetTimestamp() string {
	if o == nil || isNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *CurveRemoveLiquidityEventDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *CurveRemoveLiquidityEventDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *CurveRemoveLiquidityEventDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityEventDTO) GetTransaction() string {
	if o == nil || isNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityEventDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *CurveRemoveLiquidityEventDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *CurveRemoveLiquidityEventDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *CurveRemoveLiquidityEventDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveRemoveLiquidityEventDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveRemoveLiquidityEventDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityEventDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveRemoveLiquidityEventDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o CurveRemoveLiquidityEventDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CurveRemoveLiquidityEventDTO) ToMap() (map[string]interface{}, error) {
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
	if o.Pool.IsSet() {
		toSerialize["pool"] = o.Pool.Get()
	}
	if o.Provider.IsSet() {
		toSerialize["provider"] = o.Provider.Get()
	}
	if o.TokenAmounts != nil {
		toSerialize["token_amounts"] = o.TokenAmounts
	}
	if o.Fees != nil {
		toSerialize["fees"] = o.Fees
	}
	if o.TokenSupply.IsSet() {
		toSerialize["token_supply"] = o.TokenSupply.Get()
	}
	if o.Invariant.IsSet() {
		toSerialize["invariant"] = o.Invariant.Get()
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
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableCurveRemoveLiquidityEventDTO struct {
	value *CurveRemoveLiquidityEventDTO
	isSet bool
}

func (v NullableCurveRemoveLiquidityEventDTO) Get() *CurveRemoveLiquidityEventDTO {
	return v.value
}

func (v *NullableCurveRemoveLiquidityEventDTO) Set(val *CurveRemoveLiquidityEventDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveRemoveLiquidityEventDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveRemoveLiquidityEventDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveRemoveLiquidityEventDTO(val *CurveRemoveLiquidityEventDTO) *NullableCurveRemoveLiquidityEventDTO {
	return &NullableCurveRemoveLiquidityEventDTO{value: val, isSet: true}
}

func (v NullableCurveRemoveLiquidityEventDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveRemoveLiquidityEventDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


