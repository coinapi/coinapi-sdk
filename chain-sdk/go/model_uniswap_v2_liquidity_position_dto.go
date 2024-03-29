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

// checks if the UniswapV2LiquidityPositionDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UniswapV2LiquidityPositionDTO{}

// UniswapV2LiquidityPositionDTO This entity is used to store data about a user's liquidity position. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more.
type UniswapV2LiquidityPositionDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// User address and pair address concatenated with a dash.
	Id NullableString `json:"id,omitempty"`
	// Reference to user.
	User NullableString `json:"user,omitempty"`
	// Reference to the pair liquidity is being provided on.
	Pair NullableString `json:"pair,omitempty"`
	// Amount of LP tokens minted for this position.
	LiquidityTokenBalance NullableString `json:"liquidity_token_balance,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewUniswapV2LiquidityPositionDTO instantiates a new UniswapV2LiquidityPositionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV2LiquidityPositionDTO() *UniswapV2LiquidityPositionDTO {
	this := UniswapV2LiquidityPositionDTO{}
	return &this
}

// NewUniswapV2LiquidityPositionDTOWithDefaults instantiates a new UniswapV2LiquidityPositionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV2LiquidityPositionDTOWithDefaults() *UniswapV2LiquidityPositionDTO {
	this := UniswapV2LiquidityPositionDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV2LiquidityPositionDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2LiquidityPositionDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV2LiquidityPositionDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV2LiquidityPositionDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV2LiquidityPositionDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2LiquidityPositionDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV2LiquidityPositionDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV2LiquidityPositionDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV2LiquidityPositionDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2LiquidityPositionDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV2LiquidityPositionDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV2LiquidityPositionDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2LiquidityPositionDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2LiquidityPositionDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV2LiquidityPositionDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV2LiquidityPositionDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV2LiquidityPositionDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV2LiquidityPositionDTO) UnsetId() {
	o.Id.Unset()
}

// GetUser returns the User field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2LiquidityPositionDTO) GetUser() string {
	if o == nil || IsNil(o.User.Get()) {
		var ret string
		return ret
	}
	return *o.User.Get()
}

// GetUserOk returns a tuple with the User field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2LiquidityPositionDTO) GetUserOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.User.Get(), o.User.IsSet()
}

// HasUser returns a boolean if a field has been set.
func (o *UniswapV2LiquidityPositionDTO) HasUser() bool {
	if o != nil && o.User.IsSet() {
		return true
	}

	return false
}

// SetUser gets a reference to the given NullableString and assigns it to the User field.
func (o *UniswapV2LiquidityPositionDTO) SetUser(v string) {
	o.User.Set(&v)
}
// SetUserNil sets the value for User to be an explicit nil
func (o *UniswapV2LiquidityPositionDTO) SetUserNil() {
	o.User.Set(nil)
}

// UnsetUser ensures that no value is present for User, not even an explicit nil
func (o *UniswapV2LiquidityPositionDTO) UnsetUser() {
	o.User.Unset()
}

// GetPair returns the Pair field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2LiquidityPositionDTO) GetPair() string {
	if o == nil || IsNil(o.Pair.Get()) {
		var ret string
		return ret
	}
	return *o.Pair.Get()
}

// GetPairOk returns a tuple with the Pair field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2LiquidityPositionDTO) GetPairOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pair.Get(), o.Pair.IsSet()
}

// HasPair returns a boolean if a field has been set.
func (o *UniswapV2LiquidityPositionDTO) HasPair() bool {
	if o != nil && o.Pair.IsSet() {
		return true
	}

	return false
}

// SetPair gets a reference to the given NullableString and assigns it to the Pair field.
func (o *UniswapV2LiquidityPositionDTO) SetPair(v string) {
	o.Pair.Set(&v)
}
// SetPairNil sets the value for Pair to be an explicit nil
func (o *UniswapV2LiquidityPositionDTO) SetPairNil() {
	o.Pair.Set(nil)
}

// UnsetPair ensures that no value is present for Pair, not even an explicit nil
func (o *UniswapV2LiquidityPositionDTO) UnsetPair() {
	o.Pair.Unset()
}

// GetLiquidityTokenBalance returns the LiquidityTokenBalance field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2LiquidityPositionDTO) GetLiquidityTokenBalance() string {
	if o == nil || IsNil(o.LiquidityTokenBalance.Get()) {
		var ret string
		return ret
	}
	return *o.LiquidityTokenBalance.Get()
}

// GetLiquidityTokenBalanceOk returns a tuple with the LiquidityTokenBalance field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2LiquidityPositionDTO) GetLiquidityTokenBalanceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.LiquidityTokenBalance.Get(), o.LiquidityTokenBalance.IsSet()
}

// HasLiquidityTokenBalance returns a boolean if a field has been set.
func (o *UniswapV2LiquidityPositionDTO) HasLiquidityTokenBalance() bool {
	if o != nil && o.LiquidityTokenBalance.IsSet() {
		return true
	}

	return false
}

// SetLiquidityTokenBalance gets a reference to the given NullableString and assigns it to the LiquidityTokenBalance field.
func (o *UniswapV2LiquidityPositionDTO) SetLiquidityTokenBalance(v string) {
	o.LiquidityTokenBalance.Set(&v)
}
// SetLiquidityTokenBalanceNil sets the value for LiquidityTokenBalance to be an explicit nil
func (o *UniswapV2LiquidityPositionDTO) SetLiquidityTokenBalanceNil() {
	o.LiquidityTokenBalance.Set(nil)
}

// UnsetLiquidityTokenBalance ensures that no value is present for LiquidityTokenBalance, not even an explicit nil
func (o *UniswapV2LiquidityPositionDTO) UnsetLiquidityTokenBalance() {
	o.LiquidityTokenBalance.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV2LiquidityPositionDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2LiquidityPositionDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV2LiquidityPositionDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV2LiquidityPositionDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o UniswapV2LiquidityPositionDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UniswapV2LiquidityPositionDTO) ToMap() (map[string]interface{}, error) {
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
	if o.User.IsSet() {
		toSerialize["user"] = o.User.Get()
	}
	if o.Pair.IsSet() {
		toSerialize["pair"] = o.Pair.Get()
	}
	if o.LiquidityTokenBalance.IsSet() {
		toSerialize["liquidity_token_balance"] = o.LiquidityTokenBalance.Get()
	}
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableUniswapV2LiquidityPositionDTO struct {
	value *UniswapV2LiquidityPositionDTO
	isSet bool
}

func (v NullableUniswapV2LiquidityPositionDTO) Get() *UniswapV2LiquidityPositionDTO {
	return v.value
}

func (v *NullableUniswapV2LiquidityPositionDTO) Set(val *UniswapV2LiquidityPositionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV2LiquidityPositionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV2LiquidityPositionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV2LiquidityPositionDTO(val *UniswapV2LiquidityPositionDTO) *NullableUniswapV2LiquidityPositionDTO {
	return &NullableUniswapV2LiquidityPositionDTO{value: val, isSet: true}
}

func (v NullableUniswapV2LiquidityPositionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV2LiquidityPositionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


