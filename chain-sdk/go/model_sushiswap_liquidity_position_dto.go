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

// SushiswapLiquidityPositionDTO struct for SushiswapLiquidityPositionDTO
type SushiswapLiquidityPositionDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Identifier, format: <pair address>-<user address>
	Id NullableString `json:"id,omitempty"`
	// User address.
	User NullableString `json:"user,omitempty"`
	// Pair address.
	Pair NullableString `json:"pair,omitempty"`
	// Amount of LP tokens minted for this position.
	LiquidityTokenBalance NullableString `json:"liquidity_token_balance,omitempty"`
	// Block number at which position was created.
	Block *int32 `json:"block,omitempty"`
	// Creation time.
	Timestamp *int32 `json:"timestamp,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewSushiswapLiquidityPositionDTO instantiates a new SushiswapLiquidityPositionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSushiswapLiquidityPositionDTO() *SushiswapLiquidityPositionDTO {
	this := SushiswapLiquidityPositionDTO{}
	return &this
}

// NewSushiswapLiquidityPositionDTOWithDefaults instantiates a new SushiswapLiquidityPositionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSushiswapLiquidityPositionDTOWithDefaults() *SushiswapLiquidityPositionDTO {
	this := SushiswapLiquidityPositionDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *SushiswapLiquidityPositionDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapLiquidityPositionDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *SushiswapLiquidityPositionDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *SushiswapLiquidityPositionDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapLiquidityPositionDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *SushiswapLiquidityPositionDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *SushiswapLiquidityPositionDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapLiquidityPositionDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *SushiswapLiquidityPositionDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapLiquidityPositionDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapLiquidityPositionDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *SushiswapLiquidityPositionDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *SushiswapLiquidityPositionDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *SushiswapLiquidityPositionDTO) UnsetId() {
	o.Id.Unset()
}

// GetUser returns the User field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapLiquidityPositionDTO) GetUser() string {
	if o == nil || isNil(o.User.Get()) {
		var ret string
		return ret
	}
	return *o.User.Get()
}

// GetUserOk returns a tuple with the User field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapLiquidityPositionDTO) GetUserOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.User.Get(), o.User.IsSet()
}

// HasUser returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasUser() bool {
	if o != nil && o.User.IsSet() {
		return true
	}

	return false
}

// SetUser gets a reference to the given NullableString and assigns it to the User field.
func (o *SushiswapLiquidityPositionDTO) SetUser(v string) {
	o.User.Set(&v)
}
// SetUserNil sets the value for User to be an explicit nil
func (o *SushiswapLiquidityPositionDTO) SetUserNil() {
	o.User.Set(nil)
}

// UnsetUser ensures that no value is present for User, not even an explicit nil
func (o *SushiswapLiquidityPositionDTO) UnsetUser() {
	o.User.Unset()
}

// GetPair returns the Pair field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapLiquidityPositionDTO) GetPair() string {
	if o == nil || isNil(o.Pair.Get()) {
		var ret string
		return ret
	}
	return *o.Pair.Get()
}

// GetPairOk returns a tuple with the Pair field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapLiquidityPositionDTO) GetPairOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Pair.Get(), o.Pair.IsSet()
}

// HasPair returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasPair() bool {
	if o != nil && o.Pair.IsSet() {
		return true
	}

	return false
}

// SetPair gets a reference to the given NullableString and assigns it to the Pair field.
func (o *SushiswapLiquidityPositionDTO) SetPair(v string) {
	o.Pair.Set(&v)
}
// SetPairNil sets the value for Pair to be an explicit nil
func (o *SushiswapLiquidityPositionDTO) SetPairNil() {
	o.Pair.Set(nil)
}

// UnsetPair ensures that no value is present for Pair, not even an explicit nil
func (o *SushiswapLiquidityPositionDTO) UnsetPair() {
	o.Pair.Unset()
}

// GetLiquidityTokenBalance returns the LiquidityTokenBalance field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapLiquidityPositionDTO) GetLiquidityTokenBalance() string {
	if o == nil || isNil(o.LiquidityTokenBalance.Get()) {
		var ret string
		return ret
	}
	return *o.LiquidityTokenBalance.Get()
}

// GetLiquidityTokenBalanceOk returns a tuple with the LiquidityTokenBalance field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapLiquidityPositionDTO) GetLiquidityTokenBalanceOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.LiquidityTokenBalance.Get(), o.LiquidityTokenBalance.IsSet()
}

// HasLiquidityTokenBalance returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasLiquidityTokenBalance() bool {
	if o != nil && o.LiquidityTokenBalance.IsSet() {
		return true
	}

	return false
}

// SetLiquidityTokenBalance gets a reference to the given NullableString and assigns it to the LiquidityTokenBalance field.
func (o *SushiswapLiquidityPositionDTO) SetLiquidityTokenBalance(v string) {
	o.LiquidityTokenBalance.Set(&v)
}
// SetLiquidityTokenBalanceNil sets the value for LiquidityTokenBalance to be an explicit nil
func (o *SushiswapLiquidityPositionDTO) SetLiquidityTokenBalanceNil() {
	o.LiquidityTokenBalance.Set(nil)
}

// UnsetLiquidityTokenBalance ensures that no value is present for LiquidityTokenBalance, not even an explicit nil
func (o *SushiswapLiquidityPositionDTO) UnsetLiquidityTokenBalance() {
	o.LiquidityTokenBalance.Unset()
}

// GetBlock returns the Block field value if set, zero value otherwise.
func (o *SushiswapLiquidityPositionDTO) GetBlock() int32 {
	if o == nil || isNil(o.Block) {
		var ret int32
		return ret
	}
	return *o.Block
}

// GetBlockOk returns a tuple with the Block field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapLiquidityPositionDTO) GetBlockOk() (*int32, bool) {
	if o == nil || isNil(o.Block) {
    return nil, false
	}
	return o.Block, true
}

// HasBlock returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasBlock() bool {
	if o != nil && !isNil(o.Block) {
		return true
	}

	return false
}

// SetBlock gets a reference to the given int32 and assigns it to the Block field.
func (o *SushiswapLiquidityPositionDTO) SetBlock(v int32) {
	o.Block = &v
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise.
func (o *SushiswapLiquidityPositionDTO) GetTimestamp() int32 {
	if o == nil || isNil(o.Timestamp) {
		var ret int32
		return ret
	}
	return *o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapLiquidityPositionDTO) GetTimestampOk() (*int32, bool) {
	if o == nil || isNil(o.Timestamp) {
    return nil, false
	}
	return o.Timestamp, true
}

// HasTimestamp returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasTimestamp() bool {
	if o != nil && !isNil(o.Timestamp) {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given int32 and assigns it to the Timestamp field.
func (o *SushiswapLiquidityPositionDTO) SetTimestamp(v int32) {
	o.Timestamp = &v
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *SushiswapLiquidityPositionDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapLiquidityPositionDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *SushiswapLiquidityPositionDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *SushiswapLiquidityPositionDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o SushiswapLiquidityPositionDTO) MarshalJSON() ([]byte, error) {
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
	if o.Pair.IsSet() {
		toSerialize["pair"] = o.Pair.Get()
	}
	if o.LiquidityTokenBalance.IsSet() {
		toSerialize["liquidity_token_balance"] = o.LiquidityTokenBalance.Get()
	}
	if !isNil(o.Block) {
		toSerialize["block"] = o.Block
	}
	if !isNil(o.Timestamp) {
		toSerialize["timestamp"] = o.Timestamp
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableSushiswapLiquidityPositionDTO struct {
	value *SushiswapLiquidityPositionDTO
	isSet bool
}

func (v NullableSushiswapLiquidityPositionDTO) Get() *SushiswapLiquidityPositionDTO {
	return v.value
}

func (v *NullableSushiswapLiquidityPositionDTO) Set(val *SushiswapLiquidityPositionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableSushiswapLiquidityPositionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableSushiswapLiquidityPositionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSushiswapLiquidityPositionDTO(val *SushiswapLiquidityPositionDTO) *NullableSushiswapLiquidityPositionDTO {
	return &NullableSushiswapLiquidityPositionDTO{value: val, isSet: true}
}

func (v NullableSushiswapLiquidityPositionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSushiswapLiquidityPositionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


