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

// checks if the SushiswapMintDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SushiswapMintDTO{}

// SushiswapMintDTO Mint entities are created for every emitted Mint event on the Sushiswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, who received the liquidity, and more. This entity can be used to track liquidity provisions on pairs.
type SushiswapMintDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Identifier, format: (transaction hash)-(index in the transaction mint array).
	Id NullableString `json:"id,omitempty"`
	// Reference to the transaction Mint was included in.
	Transaction NullableString `json:"transaction,omitempty"`
	// Timestamp of Mint, used to sort recent liquidity provisions.
	Timestamp NullableString `json:"timestamp,omitempty"`
	// Reference to pair.
	Pair NullableString `json:"pair,omitempty"`
	// Recipient of liquidity tokens.
	To NullableString `json:"to,omitempty"`
	// Amount of liquidity tokens minted.
	Liquidity NullableString `json:"liquidity,omitempty"`
	// Address that initiated the liquidity provision.
	Sender NullableString `json:"sender,omitempty"`
	// Amount of token0 provided.
	Amount0 NullableString `json:"amount_0,omitempty"`
	// Amount of token1 provided.
	Amount1 NullableString `json:"amount_1,omitempty"`
	// Index in the transaction event was emitted.
	LogIndex NullableString `json:"log_index,omitempty"`
	// Derived USD value of token0 amount plus token1 amount.
	AmountUsd NullableString `json:"amount_usd,omitempty"`
	// Address of fee recipient (if fee is on).
	FeeTo NullableString `json:"fee_to,omitempty"`
	// Amount of liquidity sent to fee recipient (if fee is on).
	FeeLiquidity NullableString `json:"fee_liquidity,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewSushiswapMintDTO instantiates a new SushiswapMintDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSushiswapMintDTO() *SushiswapMintDTO {
	this := SushiswapMintDTO{}
	return &this
}

// NewSushiswapMintDTOWithDefaults instantiates a new SushiswapMintDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSushiswapMintDTOWithDefaults() *SushiswapMintDTO {
	this := SushiswapMintDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *SushiswapMintDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapMintDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *SushiswapMintDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *SushiswapMintDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapMintDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *SushiswapMintDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *SushiswapMintDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapMintDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *SushiswapMintDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *SushiswapMintDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *SushiswapMintDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *SushiswapMintDTO) UnsetId() {
	o.Id.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetTransaction() string {
	if o == nil || IsNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *SushiswapMintDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *SushiswapMintDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *SushiswapMintDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetTimestamp() string {
	if o == nil || IsNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *SushiswapMintDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *SushiswapMintDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *SushiswapMintDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetPair returns the Pair field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetPair() string {
	if o == nil || IsNil(o.Pair.Get()) {
		var ret string
		return ret
	}
	return *o.Pair.Get()
}

// GetPairOk returns a tuple with the Pair field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetPairOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pair.Get(), o.Pair.IsSet()
}

// HasPair returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasPair() bool {
	if o != nil && o.Pair.IsSet() {
		return true
	}

	return false
}

// SetPair gets a reference to the given NullableString and assigns it to the Pair field.
func (o *SushiswapMintDTO) SetPair(v string) {
	o.Pair.Set(&v)
}
// SetPairNil sets the value for Pair to be an explicit nil
func (o *SushiswapMintDTO) SetPairNil() {
	o.Pair.Set(nil)
}

// UnsetPair ensures that no value is present for Pair, not even an explicit nil
func (o *SushiswapMintDTO) UnsetPair() {
	o.Pair.Unset()
}

// GetTo returns the To field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetTo() string {
	if o == nil || IsNil(o.To.Get()) {
		var ret string
		return ret
	}
	return *o.To.Get()
}

// GetToOk returns a tuple with the To field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetToOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.To.Get(), o.To.IsSet()
}

// HasTo returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasTo() bool {
	if o != nil && o.To.IsSet() {
		return true
	}

	return false
}

// SetTo gets a reference to the given NullableString and assigns it to the To field.
func (o *SushiswapMintDTO) SetTo(v string) {
	o.To.Set(&v)
}
// SetToNil sets the value for To to be an explicit nil
func (o *SushiswapMintDTO) SetToNil() {
	o.To.Set(nil)
}

// UnsetTo ensures that no value is present for To, not even an explicit nil
func (o *SushiswapMintDTO) UnsetTo() {
	o.To.Unset()
}

// GetLiquidity returns the Liquidity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetLiquidity() string {
	if o == nil || IsNil(o.Liquidity.Get()) {
		var ret string
		return ret
	}
	return *o.Liquidity.Get()
}

// GetLiquidityOk returns a tuple with the Liquidity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetLiquidityOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Liquidity.Get(), o.Liquidity.IsSet()
}

// HasLiquidity returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasLiquidity() bool {
	if o != nil && o.Liquidity.IsSet() {
		return true
	}

	return false
}

// SetLiquidity gets a reference to the given NullableString and assigns it to the Liquidity field.
func (o *SushiswapMintDTO) SetLiquidity(v string) {
	o.Liquidity.Set(&v)
}
// SetLiquidityNil sets the value for Liquidity to be an explicit nil
func (o *SushiswapMintDTO) SetLiquidityNil() {
	o.Liquidity.Set(nil)
}

// UnsetLiquidity ensures that no value is present for Liquidity, not even an explicit nil
func (o *SushiswapMintDTO) UnsetLiquidity() {
	o.Liquidity.Unset()
}

// GetSender returns the Sender field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetSender() string {
	if o == nil || IsNil(o.Sender.Get()) {
		var ret string
		return ret
	}
	return *o.Sender.Get()
}

// GetSenderOk returns a tuple with the Sender field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetSenderOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Sender.Get(), o.Sender.IsSet()
}

// HasSender returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasSender() bool {
	if o != nil && o.Sender.IsSet() {
		return true
	}

	return false
}

// SetSender gets a reference to the given NullableString and assigns it to the Sender field.
func (o *SushiswapMintDTO) SetSender(v string) {
	o.Sender.Set(&v)
}
// SetSenderNil sets the value for Sender to be an explicit nil
func (o *SushiswapMintDTO) SetSenderNil() {
	o.Sender.Set(nil)
}

// UnsetSender ensures that no value is present for Sender, not even an explicit nil
func (o *SushiswapMintDTO) UnsetSender() {
	o.Sender.Unset()
}

// GetAmount0 returns the Amount0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetAmount0() string {
	if o == nil || IsNil(o.Amount0.Get()) {
		var ret string
		return ret
	}
	return *o.Amount0.Get()
}

// GetAmount0Ok returns a tuple with the Amount0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetAmount0Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount0.Get(), o.Amount0.IsSet()
}

// HasAmount0 returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasAmount0() bool {
	if o != nil && o.Amount0.IsSet() {
		return true
	}

	return false
}

// SetAmount0 gets a reference to the given NullableString and assigns it to the Amount0 field.
func (o *SushiswapMintDTO) SetAmount0(v string) {
	o.Amount0.Set(&v)
}
// SetAmount0Nil sets the value for Amount0 to be an explicit nil
func (o *SushiswapMintDTO) SetAmount0Nil() {
	o.Amount0.Set(nil)
}

// UnsetAmount0 ensures that no value is present for Amount0, not even an explicit nil
func (o *SushiswapMintDTO) UnsetAmount0() {
	o.Amount0.Unset()
}

// GetAmount1 returns the Amount1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetAmount1() string {
	if o == nil || IsNil(o.Amount1.Get()) {
		var ret string
		return ret
	}
	return *o.Amount1.Get()
}

// GetAmount1Ok returns a tuple with the Amount1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetAmount1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount1.Get(), o.Amount1.IsSet()
}

// HasAmount1 returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasAmount1() bool {
	if o != nil && o.Amount1.IsSet() {
		return true
	}

	return false
}

// SetAmount1 gets a reference to the given NullableString and assigns it to the Amount1 field.
func (o *SushiswapMintDTO) SetAmount1(v string) {
	o.Amount1.Set(&v)
}
// SetAmount1Nil sets the value for Amount1 to be an explicit nil
func (o *SushiswapMintDTO) SetAmount1Nil() {
	o.Amount1.Set(nil)
}

// UnsetAmount1 ensures that no value is present for Amount1, not even an explicit nil
func (o *SushiswapMintDTO) UnsetAmount1() {
	o.Amount1.Unset()
}

// GetLogIndex returns the LogIndex field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetLogIndex() string {
	if o == nil || IsNil(o.LogIndex.Get()) {
		var ret string
		return ret
	}
	return *o.LogIndex.Get()
}

// GetLogIndexOk returns a tuple with the LogIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetLogIndexOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.LogIndex.Get(), o.LogIndex.IsSet()
}

// HasLogIndex returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasLogIndex() bool {
	if o != nil && o.LogIndex.IsSet() {
		return true
	}

	return false
}

// SetLogIndex gets a reference to the given NullableString and assigns it to the LogIndex field.
func (o *SushiswapMintDTO) SetLogIndex(v string) {
	o.LogIndex.Set(&v)
}
// SetLogIndexNil sets the value for LogIndex to be an explicit nil
func (o *SushiswapMintDTO) SetLogIndexNil() {
	o.LogIndex.Set(nil)
}

// UnsetLogIndex ensures that no value is present for LogIndex, not even an explicit nil
func (o *SushiswapMintDTO) UnsetLogIndex() {
	o.LogIndex.Unset()
}

// GetAmountUsd returns the AmountUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetAmountUsd() string {
	if o == nil || IsNil(o.AmountUsd.Get()) {
		var ret string
		return ret
	}
	return *o.AmountUsd.Get()
}

// GetAmountUsdOk returns a tuple with the AmountUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetAmountUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.AmountUsd.Get(), o.AmountUsd.IsSet()
}

// HasAmountUsd returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasAmountUsd() bool {
	if o != nil && o.AmountUsd.IsSet() {
		return true
	}

	return false
}

// SetAmountUsd gets a reference to the given NullableString and assigns it to the AmountUsd field.
func (o *SushiswapMintDTO) SetAmountUsd(v string) {
	o.AmountUsd.Set(&v)
}
// SetAmountUsdNil sets the value for AmountUsd to be an explicit nil
func (o *SushiswapMintDTO) SetAmountUsdNil() {
	o.AmountUsd.Set(nil)
}

// UnsetAmountUsd ensures that no value is present for AmountUsd, not even an explicit nil
func (o *SushiswapMintDTO) UnsetAmountUsd() {
	o.AmountUsd.Unset()
}

// GetFeeTo returns the FeeTo field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetFeeTo() string {
	if o == nil || IsNil(o.FeeTo.Get()) {
		var ret string
		return ret
	}
	return *o.FeeTo.Get()
}

// GetFeeToOk returns a tuple with the FeeTo field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetFeeToOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeeTo.Get(), o.FeeTo.IsSet()
}

// HasFeeTo returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasFeeTo() bool {
	if o != nil && o.FeeTo.IsSet() {
		return true
	}

	return false
}

// SetFeeTo gets a reference to the given NullableString and assigns it to the FeeTo field.
func (o *SushiswapMintDTO) SetFeeTo(v string) {
	o.FeeTo.Set(&v)
}
// SetFeeToNil sets the value for FeeTo to be an explicit nil
func (o *SushiswapMintDTO) SetFeeToNil() {
	o.FeeTo.Set(nil)
}

// UnsetFeeTo ensures that no value is present for FeeTo, not even an explicit nil
func (o *SushiswapMintDTO) UnsetFeeTo() {
	o.FeeTo.Unset()
}

// GetFeeLiquidity returns the FeeLiquidity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapMintDTO) GetFeeLiquidity() string {
	if o == nil || IsNil(o.FeeLiquidity.Get()) {
		var ret string
		return ret
	}
	return *o.FeeLiquidity.Get()
}

// GetFeeLiquidityOk returns a tuple with the FeeLiquidity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapMintDTO) GetFeeLiquidityOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeeLiquidity.Get(), o.FeeLiquidity.IsSet()
}

// HasFeeLiquidity returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasFeeLiquidity() bool {
	if o != nil && o.FeeLiquidity.IsSet() {
		return true
	}

	return false
}

// SetFeeLiquidity gets a reference to the given NullableString and assigns it to the FeeLiquidity field.
func (o *SushiswapMintDTO) SetFeeLiquidity(v string) {
	o.FeeLiquidity.Set(&v)
}
// SetFeeLiquidityNil sets the value for FeeLiquidity to be an explicit nil
func (o *SushiswapMintDTO) SetFeeLiquidityNil() {
	o.FeeLiquidity.Set(nil)
}

// UnsetFeeLiquidity ensures that no value is present for FeeLiquidity, not even an explicit nil
func (o *SushiswapMintDTO) UnsetFeeLiquidity() {
	o.FeeLiquidity.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *SushiswapMintDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapMintDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *SushiswapMintDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *SushiswapMintDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o SushiswapMintDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SushiswapMintDTO) ToMap() (map[string]interface{}, error) {
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
	if o.Transaction.IsSet() {
		toSerialize["transaction"] = o.Transaction.Get()
	}
	if o.Timestamp.IsSet() {
		toSerialize["timestamp"] = o.Timestamp.Get()
	}
	if o.Pair.IsSet() {
		toSerialize["pair"] = o.Pair.Get()
	}
	if o.To.IsSet() {
		toSerialize["to"] = o.To.Get()
	}
	if o.Liquidity.IsSet() {
		toSerialize["liquidity"] = o.Liquidity.Get()
	}
	if o.Sender.IsSet() {
		toSerialize["sender"] = o.Sender.Get()
	}
	if o.Amount0.IsSet() {
		toSerialize["amount_0"] = o.Amount0.Get()
	}
	if o.Amount1.IsSet() {
		toSerialize["amount_1"] = o.Amount1.Get()
	}
	if o.LogIndex.IsSet() {
		toSerialize["log_index"] = o.LogIndex.Get()
	}
	if o.AmountUsd.IsSet() {
		toSerialize["amount_usd"] = o.AmountUsd.Get()
	}
	if o.FeeTo.IsSet() {
		toSerialize["fee_to"] = o.FeeTo.Get()
	}
	if o.FeeLiquidity.IsSet() {
		toSerialize["fee_liquidity"] = o.FeeLiquidity.Get()
	}
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableSushiswapMintDTO struct {
	value *SushiswapMintDTO
	isSet bool
}

func (v NullableSushiswapMintDTO) Get() *SushiswapMintDTO {
	return v.value
}

func (v *NullableSushiswapMintDTO) Set(val *SushiswapMintDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableSushiswapMintDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableSushiswapMintDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSushiswapMintDTO(val *SushiswapMintDTO) *NullableSushiswapMintDTO {
	return &NullableSushiswapMintDTO{value: val, isSet: true}
}

func (v NullableSushiswapMintDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSushiswapMintDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


