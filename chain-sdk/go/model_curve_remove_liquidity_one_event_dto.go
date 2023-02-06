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

// checks if the CurveRemoveLiquidityOneEventDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CurveRemoveLiquidityOneEventDTO{}

// CurveRemoveLiquidityOneEventDTO struct for CurveRemoveLiquidityOneEventDTO
type CurveRemoveLiquidityOneEventDTO struct {
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
	TokenAmount NullableString `json:"token_amount,omitempty"`
	// 
	CoinAmount NullableString `json:"coin_amount,omitempty"`
	// 
	Block NullableString `json:"block,omitempty"`
	// 
	Timestamp NullableString `json:"timestamp,omitempty"`
	// 
	Transaction NullableString `json:"transaction,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewCurveRemoveLiquidityOneEventDTO instantiates a new CurveRemoveLiquidityOneEventDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveRemoveLiquidityOneEventDTO() *CurveRemoveLiquidityOneEventDTO {
	this := CurveRemoveLiquidityOneEventDTO{}
	return &this
}

// NewCurveRemoveLiquidityOneEventDTOWithDefaults instantiates a new CurveRemoveLiquidityOneEventDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveRemoveLiquidityOneEventDTOWithDefaults() *CurveRemoveLiquidityOneEventDTO {
	this := CurveRemoveLiquidityOneEventDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveRemoveLiquidityOneEventDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveRemoveLiquidityOneEventDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveRemoveLiquidityOneEventDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveRemoveLiquidityOneEventDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveRemoveLiquidityOneEventDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveRemoveLiquidityOneEventDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveRemoveLiquidityOneEventDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveRemoveLiquidityOneEventDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveRemoveLiquidityOneEventDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityOneEventDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityOneEventDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveRemoveLiquidityOneEventDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) UnsetId() {
	o.Id.Unset()
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityOneEventDTO) GetPool() string {
	if o == nil || isNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityOneEventDTO) GetPoolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *CurveRemoveLiquidityOneEventDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetProvider returns the Provider field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityOneEventDTO) GetProvider() string {
	if o == nil || isNil(o.Provider.Get()) {
		var ret string
		return ret
	}
	return *o.Provider.Get()
}

// GetProviderOk returns a tuple with the Provider field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityOneEventDTO) GetProviderOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Provider.Get(), o.Provider.IsSet()
}

// HasProvider returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasProvider() bool {
	if o != nil && o.Provider.IsSet() {
		return true
	}

	return false
}

// SetProvider gets a reference to the given NullableString and assigns it to the Provider field.
func (o *CurveRemoveLiquidityOneEventDTO) SetProvider(v string) {
	o.Provider.Set(&v)
}
// SetProviderNil sets the value for Provider to be an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) SetProviderNil() {
	o.Provider.Set(nil)
}

// UnsetProvider ensures that no value is present for Provider, not even an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) UnsetProvider() {
	o.Provider.Unset()
}

// GetTokenAmount returns the TokenAmount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityOneEventDTO) GetTokenAmount() string {
	if o == nil || isNil(o.TokenAmount.Get()) {
		var ret string
		return ret
	}
	return *o.TokenAmount.Get()
}

// GetTokenAmountOk returns a tuple with the TokenAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityOneEventDTO) GetTokenAmountOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TokenAmount.Get(), o.TokenAmount.IsSet()
}

// HasTokenAmount returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasTokenAmount() bool {
	if o != nil && o.TokenAmount.IsSet() {
		return true
	}

	return false
}

// SetTokenAmount gets a reference to the given NullableString and assigns it to the TokenAmount field.
func (o *CurveRemoveLiquidityOneEventDTO) SetTokenAmount(v string) {
	o.TokenAmount.Set(&v)
}
// SetTokenAmountNil sets the value for TokenAmount to be an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) SetTokenAmountNil() {
	o.TokenAmount.Set(nil)
}

// UnsetTokenAmount ensures that no value is present for TokenAmount, not even an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) UnsetTokenAmount() {
	o.TokenAmount.Unset()
}

// GetCoinAmount returns the CoinAmount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityOneEventDTO) GetCoinAmount() string {
	if o == nil || isNil(o.CoinAmount.Get()) {
		var ret string
		return ret
	}
	return *o.CoinAmount.Get()
}

// GetCoinAmountOk returns a tuple with the CoinAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityOneEventDTO) GetCoinAmountOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CoinAmount.Get(), o.CoinAmount.IsSet()
}

// HasCoinAmount returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasCoinAmount() bool {
	if o != nil && o.CoinAmount.IsSet() {
		return true
	}

	return false
}

// SetCoinAmount gets a reference to the given NullableString and assigns it to the CoinAmount field.
func (o *CurveRemoveLiquidityOneEventDTO) SetCoinAmount(v string) {
	o.CoinAmount.Set(&v)
}
// SetCoinAmountNil sets the value for CoinAmount to be an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) SetCoinAmountNil() {
	o.CoinAmount.Set(nil)
}

// UnsetCoinAmount ensures that no value is present for CoinAmount, not even an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) UnsetCoinAmount() {
	o.CoinAmount.Unset()
}

// GetBlock returns the Block field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityOneEventDTO) GetBlock() string {
	if o == nil || isNil(o.Block.Get()) {
		var ret string
		return ret
	}
	return *o.Block.Get()
}

// GetBlockOk returns a tuple with the Block field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityOneEventDTO) GetBlockOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Block.Get(), o.Block.IsSet()
}

// HasBlock returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasBlock() bool {
	if o != nil && o.Block.IsSet() {
		return true
	}

	return false
}

// SetBlock gets a reference to the given NullableString and assigns it to the Block field.
func (o *CurveRemoveLiquidityOneEventDTO) SetBlock(v string) {
	o.Block.Set(&v)
}
// SetBlockNil sets the value for Block to be an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) SetBlockNil() {
	o.Block.Set(nil)
}

// UnsetBlock ensures that no value is present for Block, not even an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) UnsetBlock() {
	o.Block.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityOneEventDTO) GetTimestamp() string {
	if o == nil || isNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityOneEventDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *CurveRemoveLiquidityOneEventDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveRemoveLiquidityOneEventDTO) GetTransaction() string {
	if o == nil || isNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveRemoveLiquidityOneEventDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *CurveRemoveLiquidityOneEventDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *CurveRemoveLiquidityOneEventDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveRemoveLiquidityOneEventDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveRemoveLiquidityOneEventDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveRemoveLiquidityOneEventDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveRemoveLiquidityOneEventDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o CurveRemoveLiquidityOneEventDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CurveRemoveLiquidityOneEventDTO) ToMap() (map[string]interface{}, error) {
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
	if o.TokenAmount.IsSet() {
		toSerialize["token_amount"] = o.TokenAmount.Get()
	}
	if o.CoinAmount.IsSet() {
		toSerialize["coin_amount"] = o.CoinAmount.Get()
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

type NullableCurveRemoveLiquidityOneEventDTO struct {
	value *CurveRemoveLiquidityOneEventDTO
	isSet bool
}

func (v NullableCurveRemoveLiquidityOneEventDTO) Get() *CurveRemoveLiquidityOneEventDTO {
	return v.value
}

func (v *NullableCurveRemoveLiquidityOneEventDTO) Set(val *CurveRemoveLiquidityOneEventDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveRemoveLiquidityOneEventDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveRemoveLiquidityOneEventDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveRemoveLiquidityOneEventDTO(val *CurveRemoveLiquidityOneEventDTO) *NullableCurveRemoveLiquidityOneEventDTO {
	return &NullableCurveRemoveLiquidityOneEventDTO{value: val, isSet: true}
}

func (v NullableCurveRemoveLiquidityOneEventDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveRemoveLiquidityOneEventDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


