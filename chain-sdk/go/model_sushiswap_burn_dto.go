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

// SushiswapBurnDTO Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned LP tokens, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
type SushiswapBurnDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Identifier, format: (transaction id):(transaction.burns.length).
	Id NullableString `json:"id,omitempty"`
	// Reference to the transaction Burn was included in.
	Transaction NullableString `json:"transaction,omitempty"`
	// Timestamp of Burn, used to sort recent liquidity removals.
	Timestamp NullableString `json:"timestamp,omitempty"`
	// Reference to pair.
	Pair NullableString `json:"pair,omitempty"`
	// Amount of liquidity tokens burned.
	Liquidity NullableString `json:"liquidity,omitempty"`
	// Address that initiated the liquidity removal.
	Sender NullableString `json:"sender,omitempty"`
	// Amount of token0 removed.
	Amount0 NullableString `json:"amount_0,omitempty"`
	// Amount of token1 removed.
	Amount1 NullableString `json:"amount_1,omitempty"`
	// Recipient of tokens.
	To NullableString `json:"to,omitempty"`
	// Index in the transaction event was emitted.
	LogIndex NullableString `json:"log_index,omitempty"`
	// Derived amount based on available prices of tokens.
	AmountUsd NullableString `json:"amount_usd,omitempty"`
	// 
	Complete *bool `json:"complete,omitempty"`
	// Address of fee recipient (if fee is on).
	FeeTo NullableString `json:"fee_to,omitempty"`
	// Amount of tokens sent to fee recipient (if fee is on).
	FeeLiquidity NullableString `json:"fee_liquidity,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewSushiswapBurnDTO instantiates a new SushiswapBurnDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSushiswapBurnDTO() *SushiswapBurnDTO {
	this := SushiswapBurnDTO{}
	return &this
}

// NewSushiswapBurnDTOWithDefaults instantiates a new SushiswapBurnDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSushiswapBurnDTOWithDefaults() *SushiswapBurnDTO {
	this := SushiswapBurnDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *SushiswapBurnDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapBurnDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *SushiswapBurnDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *SushiswapBurnDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapBurnDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *SushiswapBurnDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *SushiswapBurnDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapBurnDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *SushiswapBurnDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *SushiswapBurnDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *SushiswapBurnDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetId() {
	o.Id.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetTransaction() string {
	if o == nil || isNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *SushiswapBurnDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *SushiswapBurnDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetTimestamp() string {
	if o == nil || isNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *SushiswapBurnDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *SushiswapBurnDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetPair returns the Pair field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetPair() string {
	if o == nil || isNil(o.Pair.Get()) {
		var ret string
		return ret
	}
	return *o.Pair.Get()
}

// GetPairOk returns a tuple with the Pair field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetPairOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Pair.Get(), o.Pair.IsSet()
}

// HasPair returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasPair() bool {
	if o != nil && o.Pair.IsSet() {
		return true
	}

	return false
}

// SetPair gets a reference to the given NullableString and assigns it to the Pair field.
func (o *SushiswapBurnDTO) SetPair(v string) {
	o.Pair.Set(&v)
}
// SetPairNil sets the value for Pair to be an explicit nil
func (o *SushiswapBurnDTO) SetPairNil() {
	o.Pair.Set(nil)
}

// UnsetPair ensures that no value is present for Pair, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetPair() {
	o.Pair.Unset()
}

// GetLiquidity returns the Liquidity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetLiquidity() string {
	if o == nil || isNil(o.Liquidity.Get()) {
		var ret string
		return ret
	}
	return *o.Liquidity.Get()
}

// GetLiquidityOk returns a tuple with the Liquidity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetLiquidityOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Liquidity.Get(), o.Liquidity.IsSet()
}

// HasLiquidity returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasLiquidity() bool {
	if o != nil && o.Liquidity.IsSet() {
		return true
	}

	return false
}

// SetLiquidity gets a reference to the given NullableString and assigns it to the Liquidity field.
func (o *SushiswapBurnDTO) SetLiquidity(v string) {
	o.Liquidity.Set(&v)
}
// SetLiquidityNil sets the value for Liquidity to be an explicit nil
func (o *SushiswapBurnDTO) SetLiquidityNil() {
	o.Liquidity.Set(nil)
}

// UnsetLiquidity ensures that no value is present for Liquidity, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetLiquidity() {
	o.Liquidity.Unset()
}

// GetSender returns the Sender field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetSender() string {
	if o == nil || isNil(o.Sender.Get()) {
		var ret string
		return ret
	}
	return *o.Sender.Get()
}

// GetSenderOk returns a tuple with the Sender field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetSenderOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Sender.Get(), o.Sender.IsSet()
}

// HasSender returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasSender() bool {
	if o != nil && o.Sender.IsSet() {
		return true
	}

	return false
}

// SetSender gets a reference to the given NullableString and assigns it to the Sender field.
func (o *SushiswapBurnDTO) SetSender(v string) {
	o.Sender.Set(&v)
}
// SetSenderNil sets the value for Sender to be an explicit nil
func (o *SushiswapBurnDTO) SetSenderNil() {
	o.Sender.Set(nil)
}

// UnsetSender ensures that no value is present for Sender, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetSender() {
	o.Sender.Unset()
}

// GetAmount0 returns the Amount0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetAmount0() string {
	if o == nil || isNil(o.Amount0.Get()) {
		var ret string
		return ret
	}
	return *o.Amount0.Get()
}

// GetAmount0Ok returns a tuple with the Amount0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetAmount0Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Amount0.Get(), o.Amount0.IsSet()
}

// HasAmount0 returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasAmount0() bool {
	if o != nil && o.Amount0.IsSet() {
		return true
	}

	return false
}

// SetAmount0 gets a reference to the given NullableString and assigns it to the Amount0 field.
func (o *SushiswapBurnDTO) SetAmount0(v string) {
	o.Amount0.Set(&v)
}
// SetAmount0Nil sets the value for Amount0 to be an explicit nil
func (o *SushiswapBurnDTO) SetAmount0Nil() {
	o.Amount0.Set(nil)
}

// UnsetAmount0 ensures that no value is present for Amount0, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetAmount0() {
	o.Amount0.Unset()
}

// GetAmount1 returns the Amount1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetAmount1() string {
	if o == nil || isNil(o.Amount1.Get()) {
		var ret string
		return ret
	}
	return *o.Amount1.Get()
}

// GetAmount1Ok returns a tuple with the Amount1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetAmount1Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Amount1.Get(), o.Amount1.IsSet()
}

// HasAmount1 returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasAmount1() bool {
	if o != nil && o.Amount1.IsSet() {
		return true
	}

	return false
}

// SetAmount1 gets a reference to the given NullableString and assigns it to the Amount1 field.
func (o *SushiswapBurnDTO) SetAmount1(v string) {
	o.Amount1.Set(&v)
}
// SetAmount1Nil sets the value for Amount1 to be an explicit nil
func (o *SushiswapBurnDTO) SetAmount1Nil() {
	o.Amount1.Set(nil)
}

// UnsetAmount1 ensures that no value is present for Amount1, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetAmount1() {
	o.Amount1.Unset()
}

// GetTo returns the To field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetTo() string {
	if o == nil || isNil(o.To.Get()) {
		var ret string
		return ret
	}
	return *o.To.Get()
}

// GetToOk returns a tuple with the To field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetToOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.To.Get(), o.To.IsSet()
}

// HasTo returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasTo() bool {
	if o != nil && o.To.IsSet() {
		return true
	}

	return false
}

// SetTo gets a reference to the given NullableString and assigns it to the To field.
func (o *SushiswapBurnDTO) SetTo(v string) {
	o.To.Set(&v)
}
// SetToNil sets the value for To to be an explicit nil
func (o *SushiswapBurnDTO) SetToNil() {
	o.To.Set(nil)
}

// UnsetTo ensures that no value is present for To, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetTo() {
	o.To.Unset()
}

// GetLogIndex returns the LogIndex field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetLogIndex() string {
	if o == nil || isNil(o.LogIndex.Get()) {
		var ret string
		return ret
	}
	return *o.LogIndex.Get()
}

// GetLogIndexOk returns a tuple with the LogIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetLogIndexOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.LogIndex.Get(), o.LogIndex.IsSet()
}

// HasLogIndex returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasLogIndex() bool {
	if o != nil && o.LogIndex.IsSet() {
		return true
	}

	return false
}

// SetLogIndex gets a reference to the given NullableString and assigns it to the LogIndex field.
func (o *SushiswapBurnDTO) SetLogIndex(v string) {
	o.LogIndex.Set(&v)
}
// SetLogIndexNil sets the value for LogIndex to be an explicit nil
func (o *SushiswapBurnDTO) SetLogIndexNil() {
	o.LogIndex.Set(nil)
}

// UnsetLogIndex ensures that no value is present for LogIndex, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetLogIndex() {
	o.LogIndex.Unset()
}

// GetAmountUsd returns the AmountUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetAmountUsd() string {
	if o == nil || isNil(o.AmountUsd.Get()) {
		var ret string
		return ret
	}
	return *o.AmountUsd.Get()
}

// GetAmountUsdOk returns a tuple with the AmountUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetAmountUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.AmountUsd.Get(), o.AmountUsd.IsSet()
}

// HasAmountUsd returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasAmountUsd() bool {
	if o != nil && o.AmountUsd.IsSet() {
		return true
	}

	return false
}

// SetAmountUsd gets a reference to the given NullableString and assigns it to the AmountUsd field.
func (o *SushiswapBurnDTO) SetAmountUsd(v string) {
	o.AmountUsd.Set(&v)
}
// SetAmountUsdNil sets the value for AmountUsd to be an explicit nil
func (o *SushiswapBurnDTO) SetAmountUsdNil() {
	o.AmountUsd.Set(nil)
}

// UnsetAmountUsd ensures that no value is present for AmountUsd, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetAmountUsd() {
	o.AmountUsd.Unset()
}

// GetComplete returns the Complete field value if set, zero value otherwise.
func (o *SushiswapBurnDTO) GetComplete() bool {
	if o == nil || isNil(o.Complete) {
		var ret bool
		return ret
	}
	return *o.Complete
}

// GetCompleteOk returns a tuple with the Complete field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapBurnDTO) GetCompleteOk() (*bool, bool) {
	if o == nil || isNil(o.Complete) {
    return nil, false
	}
	return o.Complete, true
}

// HasComplete returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasComplete() bool {
	if o != nil && !isNil(o.Complete) {
		return true
	}

	return false
}

// SetComplete gets a reference to the given bool and assigns it to the Complete field.
func (o *SushiswapBurnDTO) SetComplete(v bool) {
	o.Complete = &v
}

// GetFeeTo returns the FeeTo field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetFeeTo() string {
	if o == nil || isNil(o.FeeTo.Get()) {
		var ret string
		return ret
	}
	return *o.FeeTo.Get()
}

// GetFeeToOk returns a tuple with the FeeTo field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetFeeToOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.FeeTo.Get(), o.FeeTo.IsSet()
}

// HasFeeTo returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasFeeTo() bool {
	if o != nil && o.FeeTo.IsSet() {
		return true
	}

	return false
}

// SetFeeTo gets a reference to the given NullableString and assigns it to the FeeTo field.
func (o *SushiswapBurnDTO) SetFeeTo(v string) {
	o.FeeTo.Set(&v)
}
// SetFeeToNil sets the value for FeeTo to be an explicit nil
func (o *SushiswapBurnDTO) SetFeeToNil() {
	o.FeeTo.Set(nil)
}

// UnsetFeeTo ensures that no value is present for FeeTo, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetFeeTo() {
	o.FeeTo.Unset()
}

// GetFeeLiquidity returns the FeeLiquidity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SushiswapBurnDTO) GetFeeLiquidity() string {
	if o == nil || isNil(o.FeeLiquidity.Get()) {
		var ret string
		return ret
	}
	return *o.FeeLiquidity.Get()
}

// GetFeeLiquidityOk returns a tuple with the FeeLiquidity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SushiswapBurnDTO) GetFeeLiquidityOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.FeeLiquidity.Get(), o.FeeLiquidity.IsSet()
}

// HasFeeLiquidity returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasFeeLiquidity() bool {
	if o != nil && o.FeeLiquidity.IsSet() {
		return true
	}

	return false
}

// SetFeeLiquidity gets a reference to the given NullableString and assigns it to the FeeLiquidity field.
func (o *SushiswapBurnDTO) SetFeeLiquidity(v string) {
	o.FeeLiquidity.Set(&v)
}
// SetFeeLiquidityNil sets the value for FeeLiquidity to be an explicit nil
func (o *SushiswapBurnDTO) SetFeeLiquidityNil() {
	o.FeeLiquidity.Set(nil)
}

// UnsetFeeLiquidity ensures that no value is present for FeeLiquidity, not even an explicit nil
func (o *SushiswapBurnDTO) UnsetFeeLiquidity() {
	o.FeeLiquidity.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *SushiswapBurnDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SushiswapBurnDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *SushiswapBurnDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *SushiswapBurnDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o SushiswapBurnDTO) MarshalJSON() ([]byte, error) {
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
	if o.Transaction.IsSet() {
		toSerialize["transaction"] = o.Transaction.Get()
	}
	if o.Timestamp.IsSet() {
		toSerialize["timestamp"] = o.Timestamp.Get()
	}
	if o.Pair.IsSet() {
		toSerialize["pair"] = o.Pair.Get()
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
	if o.To.IsSet() {
		toSerialize["to"] = o.To.Get()
	}
	if o.LogIndex.IsSet() {
		toSerialize["log_index"] = o.LogIndex.Get()
	}
	if o.AmountUsd.IsSet() {
		toSerialize["amount_usd"] = o.AmountUsd.Get()
	}
	if !isNil(o.Complete) {
		toSerialize["complete"] = o.Complete
	}
	if o.FeeTo.IsSet() {
		toSerialize["fee_to"] = o.FeeTo.Get()
	}
	if o.FeeLiquidity.IsSet() {
		toSerialize["fee_liquidity"] = o.FeeLiquidity.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableSushiswapBurnDTO struct {
	value *SushiswapBurnDTO
	isSet bool
}

func (v NullableSushiswapBurnDTO) Get() *SushiswapBurnDTO {
	return v.value
}

func (v *NullableSushiswapBurnDTO) Set(val *SushiswapBurnDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableSushiswapBurnDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableSushiswapBurnDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSushiswapBurnDTO(val *SushiswapBurnDTO) *NullableSushiswapBurnDTO {
	return &NullableSushiswapBurnDTO{value: val, isSet: true}
}

func (v NullableSushiswapBurnDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSushiswapBurnDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


