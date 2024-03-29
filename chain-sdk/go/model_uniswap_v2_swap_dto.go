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

// checks if the UniswapV2SwapDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UniswapV2SwapDTO{}

// UniswapV2SwapDTO Swap are created for each token swap within a pair.
type UniswapV2SwapDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	// Transaction hash plus index in Transaction swap array.
	Id NullableString `json:"id,omitempty"`
	// Reference to transaction swap was included in.
	Transaction NullableString `json:"transaction,omitempty"`
	// Timestamp of swap, used for sorted lookups.
	Timestamp *time.Time `json:"timestamp,omitempty"`
	// Reference to pair.
	Pair NullableString `json:"pair,omitempty"`
	// Address that initiated the swap.
	Sender NullableString `json:"sender,omitempty"`
	// The EOA (Externally Owned Account) that initiated the transaction.
	From NullableString `json:"from,omitempty"`
	// Amount of token0 sold.
	Amount0In NullableString `json:"amount_0_in,omitempty"`
	// Amount of token1 sold.
	Amount1In NullableString `json:"amount_1_in,omitempty"`
	// Amount of token0 received.
	Amount0Out NullableString `json:"amount_0_out,omitempty"`
	// Amount of token1 received.
	Amount1Out NullableString `json:"amount_1_out,omitempty"`
	// Recipient of output tokens.
	To NullableString `json:"to,omitempty"`
	LogIndex *NumericsBigInteger `json:"log_index,omitempty"`
	// Derived amount of tokens sold in USD.
	AmountUsd NullableString `json:"amount_usd,omitempty"`
	EvaluatedPrice *float64 `json:"evaluated_price,omitempty"`
	EvaluatedAmount *float64 `json:"evaluated_amount,omitempty"`
	EvaluatedAggressor *TransactionsETradeAggressiveSide `json:"evaluated_aggressor,omitempty"`
	PoolId NullableString `json:"pool_id,omitempty"`
	TransactionId NullableString `json:"transaction_id,omitempty"`
}

// NewUniswapV2SwapDTO instantiates a new UniswapV2SwapDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV2SwapDTO() *UniswapV2SwapDTO {
	this := UniswapV2SwapDTO{}
	return &this
}

// NewUniswapV2SwapDTOWithDefaults instantiates a new UniswapV2SwapDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV2SwapDTOWithDefaults() *UniswapV2SwapDTO {
	this := UniswapV2SwapDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV2SwapDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV2SwapDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV2SwapDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV2SwapDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV2SwapDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV2SwapDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetId() {
	o.Id.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetTransaction() string {
	if o == nil || IsNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *UniswapV2SwapDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *UniswapV2SwapDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetTimestamp() time.Time {
	if o == nil || IsNil(o.Timestamp) {
		var ret time.Time
		return ret
	}
	return *o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetTimestampOk() (*time.Time, bool) {
	if o == nil || IsNil(o.Timestamp) {
		return nil, false
	}
	return o.Timestamp, true
}

// HasTimestamp returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasTimestamp() bool {
	if o != nil && !IsNil(o.Timestamp) {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given time.Time and assigns it to the Timestamp field.
func (o *UniswapV2SwapDTO) SetTimestamp(v time.Time) {
	o.Timestamp = &v
}

// GetPair returns the Pair field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetPair() string {
	if o == nil || IsNil(o.Pair.Get()) {
		var ret string
		return ret
	}
	return *o.Pair.Get()
}

// GetPairOk returns a tuple with the Pair field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetPairOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pair.Get(), o.Pair.IsSet()
}

// HasPair returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasPair() bool {
	if o != nil && o.Pair.IsSet() {
		return true
	}

	return false
}

// SetPair gets a reference to the given NullableString and assigns it to the Pair field.
func (o *UniswapV2SwapDTO) SetPair(v string) {
	o.Pair.Set(&v)
}
// SetPairNil sets the value for Pair to be an explicit nil
func (o *UniswapV2SwapDTO) SetPairNil() {
	o.Pair.Set(nil)
}

// UnsetPair ensures that no value is present for Pair, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetPair() {
	o.Pair.Unset()
}

// GetSender returns the Sender field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetSender() string {
	if o == nil || IsNil(o.Sender.Get()) {
		var ret string
		return ret
	}
	return *o.Sender.Get()
}

// GetSenderOk returns a tuple with the Sender field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetSenderOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Sender.Get(), o.Sender.IsSet()
}

// HasSender returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasSender() bool {
	if o != nil && o.Sender.IsSet() {
		return true
	}

	return false
}

// SetSender gets a reference to the given NullableString and assigns it to the Sender field.
func (o *UniswapV2SwapDTO) SetSender(v string) {
	o.Sender.Set(&v)
}
// SetSenderNil sets the value for Sender to be an explicit nil
func (o *UniswapV2SwapDTO) SetSenderNil() {
	o.Sender.Set(nil)
}

// UnsetSender ensures that no value is present for Sender, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetSender() {
	o.Sender.Unset()
}

// GetFrom returns the From field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetFrom() string {
	if o == nil || IsNil(o.From.Get()) {
		var ret string
		return ret
	}
	return *o.From.Get()
}

// GetFromOk returns a tuple with the From field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetFromOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.From.Get(), o.From.IsSet()
}

// HasFrom returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasFrom() bool {
	if o != nil && o.From.IsSet() {
		return true
	}

	return false
}

// SetFrom gets a reference to the given NullableString and assigns it to the From field.
func (o *UniswapV2SwapDTO) SetFrom(v string) {
	o.From.Set(&v)
}
// SetFromNil sets the value for From to be an explicit nil
func (o *UniswapV2SwapDTO) SetFromNil() {
	o.From.Set(nil)
}

// UnsetFrom ensures that no value is present for From, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetFrom() {
	o.From.Unset()
}

// GetAmount0In returns the Amount0In field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetAmount0In() string {
	if o == nil || IsNil(o.Amount0In.Get()) {
		var ret string
		return ret
	}
	return *o.Amount0In.Get()
}

// GetAmount0InOk returns a tuple with the Amount0In field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetAmount0InOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount0In.Get(), o.Amount0In.IsSet()
}

// HasAmount0In returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasAmount0In() bool {
	if o != nil && o.Amount0In.IsSet() {
		return true
	}

	return false
}

// SetAmount0In gets a reference to the given NullableString and assigns it to the Amount0In field.
func (o *UniswapV2SwapDTO) SetAmount0In(v string) {
	o.Amount0In.Set(&v)
}
// SetAmount0InNil sets the value for Amount0In to be an explicit nil
func (o *UniswapV2SwapDTO) SetAmount0InNil() {
	o.Amount0In.Set(nil)
}

// UnsetAmount0In ensures that no value is present for Amount0In, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetAmount0In() {
	o.Amount0In.Unset()
}

// GetAmount1In returns the Amount1In field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetAmount1In() string {
	if o == nil || IsNil(o.Amount1In.Get()) {
		var ret string
		return ret
	}
	return *o.Amount1In.Get()
}

// GetAmount1InOk returns a tuple with the Amount1In field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetAmount1InOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount1In.Get(), o.Amount1In.IsSet()
}

// HasAmount1In returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasAmount1In() bool {
	if o != nil && o.Amount1In.IsSet() {
		return true
	}

	return false
}

// SetAmount1In gets a reference to the given NullableString and assigns it to the Amount1In field.
func (o *UniswapV2SwapDTO) SetAmount1In(v string) {
	o.Amount1In.Set(&v)
}
// SetAmount1InNil sets the value for Amount1In to be an explicit nil
func (o *UniswapV2SwapDTO) SetAmount1InNil() {
	o.Amount1In.Set(nil)
}

// UnsetAmount1In ensures that no value is present for Amount1In, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetAmount1In() {
	o.Amount1In.Unset()
}

// GetAmount0Out returns the Amount0Out field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetAmount0Out() string {
	if o == nil || IsNil(o.Amount0Out.Get()) {
		var ret string
		return ret
	}
	return *o.Amount0Out.Get()
}

// GetAmount0OutOk returns a tuple with the Amount0Out field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetAmount0OutOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount0Out.Get(), o.Amount0Out.IsSet()
}

// HasAmount0Out returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasAmount0Out() bool {
	if o != nil && o.Amount0Out.IsSet() {
		return true
	}

	return false
}

// SetAmount0Out gets a reference to the given NullableString and assigns it to the Amount0Out field.
func (o *UniswapV2SwapDTO) SetAmount0Out(v string) {
	o.Amount0Out.Set(&v)
}
// SetAmount0OutNil sets the value for Amount0Out to be an explicit nil
func (o *UniswapV2SwapDTO) SetAmount0OutNil() {
	o.Amount0Out.Set(nil)
}

// UnsetAmount0Out ensures that no value is present for Amount0Out, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetAmount0Out() {
	o.Amount0Out.Unset()
}

// GetAmount1Out returns the Amount1Out field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetAmount1Out() string {
	if o == nil || IsNil(o.Amount1Out.Get()) {
		var ret string
		return ret
	}
	return *o.Amount1Out.Get()
}

// GetAmount1OutOk returns a tuple with the Amount1Out field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetAmount1OutOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount1Out.Get(), o.Amount1Out.IsSet()
}

// HasAmount1Out returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasAmount1Out() bool {
	if o != nil && o.Amount1Out.IsSet() {
		return true
	}

	return false
}

// SetAmount1Out gets a reference to the given NullableString and assigns it to the Amount1Out field.
func (o *UniswapV2SwapDTO) SetAmount1Out(v string) {
	o.Amount1Out.Set(&v)
}
// SetAmount1OutNil sets the value for Amount1Out to be an explicit nil
func (o *UniswapV2SwapDTO) SetAmount1OutNil() {
	o.Amount1Out.Set(nil)
}

// UnsetAmount1Out ensures that no value is present for Amount1Out, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetAmount1Out() {
	o.Amount1Out.Unset()
}

// GetTo returns the To field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetTo() string {
	if o == nil || IsNil(o.To.Get()) {
		var ret string
		return ret
	}
	return *o.To.Get()
}

// GetToOk returns a tuple with the To field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetToOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.To.Get(), o.To.IsSet()
}

// HasTo returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasTo() bool {
	if o != nil && o.To.IsSet() {
		return true
	}

	return false
}

// SetTo gets a reference to the given NullableString and assigns it to the To field.
func (o *UniswapV2SwapDTO) SetTo(v string) {
	o.To.Set(&v)
}
// SetToNil sets the value for To to be an explicit nil
func (o *UniswapV2SwapDTO) SetToNil() {
	o.To.Set(nil)
}

// UnsetTo ensures that no value is present for To, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetTo() {
	o.To.Unset()
}

// GetLogIndex returns the LogIndex field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetLogIndex() NumericsBigInteger {
	if o == nil || IsNil(o.LogIndex) {
		var ret NumericsBigInteger
		return ret
	}
	return *o.LogIndex
}

// GetLogIndexOk returns a tuple with the LogIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetLogIndexOk() (*NumericsBigInteger, bool) {
	if o == nil || IsNil(o.LogIndex) {
		return nil, false
	}
	return o.LogIndex, true
}

// HasLogIndex returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasLogIndex() bool {
	if o != nil && !IsNil(o.LogIndex) {
		return true
	}

	return false
}

// SetLogIndex gets a reference to the given NumericsBigInteger and assigns it to the LogIndex field.
func (o *UniswapV2SwapDTO) SetLogIndex(v NumericsBigInteger) {
	o.LogIndex = &v
}

// GetAmountUsd returns the AmountUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetAmountUsd() string {
	if o == nil || IsNil(o.AmountUsd.Get()) {
		var ret string
		return ret
	}
	return *o.AmountUsd.Get()
}

// GetAmountUsdOk returns a tuple with the AmountUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetAmountUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.AmountUsd.Get(), o.AmountUsd.IsSet()
}

// HasAmountUsd returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasAmountUsd() bool {
	if o != nil && o.AmountUsd.IsSet() {
		return true
	}

	return false
}

// SetAmountUsd gets a reference to the given NullableString and assigns it to the AmountUsd field.
func (o *UniswapV2SwapDTO) SetAmountUsd(v string) {
	o.AmountUsd.Set(&v)
}
// SetAmountUsdNil sets the value for AmountUsd to be an explicit nil
func (o *UniswapV2SwapDTO) SetAmountUsdNil() {
	o.AmountUsd.Set(nil)
}

// UnsetAmountUsd ensures that no value is present for AmountUsd, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetAmountUsd() {
	o.AmountUsd.Unset()
}

// GetEvaluatedPrice returns the EvaluatedPrice field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetEvaluatedPrice() float64 {
	if o == nil || IsNil(o.EvaluatedPrice) {
		var ret float64
		return ret
	}
	return *o.EvaluatedPrice
}

// GetEvaluatedPriceOk returns a tuple with the EvaluatedPrice field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetEvaluatedPriceOk() (*float64, bool) {
	if o == nil || IsNil(o.EvaluatedPrice) {
		return nil, false
	}
	return o.EvaluatedPrice, true
}

// HasEvaluatedPrice returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasEvaluatedPrice() bool {
	if o != nil && !IsNil(o.EvaluatedPrice) {
		return true
	}

	return false
}

// SetEvaluatedPrice gets a reference to the given float64 and assigns it to the EvaluatedPrice field.
func (o *UniswapV2SwapDTO) SetEvaluatedPrice(v float64) {
	o.EvaluatedPrice = &v
}

// GetEvaluatedAmount returns the EvaluatedAmount field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetEvaluatedAmount() float64 {
	if o == nil || IsNil(o.EvaluatedAmount) {
		var ret float64
		return ret
	}
	return *o.EvaluatedAmount
}

// GetEvaluatedAmountOk returns a tuple with the EvaluatedAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetEvaluatedAmountOk() (*float64, bool) {
	if o == nil || IsNil(o.EvaluatedAmount) {
		return nil, false
	}
	return o.EvaluatedAmount, true
}

// HasEvaluatedAmount returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasEvaluatedAmount() bool {
	if o != nil && !IsNil(o.EvaluatedAmount) {
		return true
	}

	return false
}

// SetEvaluatedAmount gets a reference to the given float64 and assigns it to the EvaluatedAmount field.
func (o *UniswapV2SwapDTO) SetEvaluatedAmount(v float64) {
	o.EvaluatedAmount = &v
}

// GetEvaluatedAggressor returns the EvaluatedAggressor field value if set, zero value otherwise.
func (o *UniswapV2SwapDTO) GetEvaluatedAggressor() TransactionsETradeAggressiveSide {
	if o == nil || IsNil(o.EvaluatedAggressor) {
		var ret TransactionsETradeAggressiveSide
		return ret
	}
	return *o.EvaluatedAggressor
}

// GetEvaluatedAggressorOk returns a tuple with the EvaluatedAggressor field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2SwapDTO) GetEvaluatedAggressorOk() (*TransactionsETradeAggressiveSide, bool) {
	if o == nil || IsNil(o.EvaluatedAggressor) {
		return nil, false
	}
	return o.EvaluatedAggressor, true
}

// HasEvaluatedAggressor returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasEvaluatedAggressor() bool {
	if o != nil && !IsNil(o.EvaluatedAggressor) {
		return true
	}

	return false
}

// SetEvaluatedAggressor gets a reference to the given TransactionsETradeAggressiveSide and assigns it to the EvaluatedAggressor field.
func (o *UniswapV2SwapDTO) SetEvaluatedAggressor(v TransactionsETradeAggressiveSide) {
	o.EvaluatedAggressor = &v
}

// GetPoolId returns the PoolId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetPoolId() string {
	if o == nil || IsNil(o.PoolId.Get()) {
		var ret string
		return ret
	}
	return *o.PoolId.Get()
}

// GetPoolIdOk returns a tuple with the PoolId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetPoolIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PoolId.Get(), o.PoolId.IsSet()
}

// HasPoolId returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasPoolId() bool {
	if o != nil && o.PoolId.IsSet() {
		return true
	}

	return false
}

// SetPoolId gets a reference to the given NullableString and assigns it to the PoolId field.
func (o *UniswapV2SwapDTO) SetPoolId(v string) {
	o.PoolId.Set(&v)
}
// SetPoolIdNil sets the value for PoolId to be an explicit nil
func (o *UniswapV2SwapDTO) SetPoolIdNil() {
	o.PoolId.Set(nil)
}

// UnsetPoolId ensures that no value is present for PoolId, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetPoolId() {
	o.PoolId.Unset()
}

// GetTransactionId returns the TransactionId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2SwapDTO) GetTransactionId() string {
	if o == nil || IsNil(o.TransactionId.Get()) {
		var ret string
		return ret
	}
	return *o.TransactionId.Get()
}

// GetTransactionIdOk returns a tuple with the TransactionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2SwapDTO) GetTransactionIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TransactionId.Get(), o.TransactionId.IsSet()
}

// HasTransactionId returns a boolean if a field has been set.
func (o *UniswapV2SwapDTO) HasTransactionId() bool {
	if o != nil && o.TransactionId.IsSet() {
		return true
	}

	return false
}

// SetTransactionId gets a reference to the given NullableString and assigns it to the TransactionId field.
func (o *UniswapV2SwapDTO) SetTransactionId(v string) {
	o.TransactionId.Set(&v)
}
// SetTransactionIdNil sets the value for TransactionId to be an explicit nil
func (o *UniswapV2SwapDTO) SetTransactionIdNil() {
	o.TransactionId.Set(nil)
}

// UnsetTransactionId ensures that no value is present for TransactionId, not even an explicit nil
func (o *UniswapV2SwapDTO) UnsetTransactionId() {
	o.TransactionId.Unset()
}

func (o UniswapV2SwapDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UniswapV2SwapDTO) ToMap() (map[string]interface{}, error) {
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
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if o.Transaction.IsSet() {
		toSerialize["transaction"] = o.Transaction.Get()
	}
	if !IsNil(o.Timestamp) {
		toSerialize["timestamp"] = o.Timestamp
	}
	if o.Pair.IsSet() {
		toSerialize["pair"] = o.Pair.Get()
	}
	if o.Sender.IsSet() {
		toSerialize["sender"] = o.Sender.Get()
	}
	if o.From.IsSet() {
		toSerialize["from"] = o.From.Get()
	}
	if o.Amount0In.IsSet() {
		toSerialize["amount_0_in"] = o.Amount0In.Get()
	}
	if o.Amount1In.IsSet() {
		toSerialize["amount_1_in"] = o.Amount1In.Get()
	}
	if o.Amount0Out.IsSet() {
		toSerialize["amount_0_out"] = o.Amount0Out.Get()
	}
	if o.Amount1Out.IsSet() {
		toSerialize["amount_1_out"] = o.Amount1Out.Get()
	}
	if o.To.IsSet() {
		toSerialize["to"] = o.To.Get()
	}
	if !IsNil(o.LogIndex) {
		toSerialize["log_index"] = o.LogIndex
	}
	if o.AmountUsd.IsSet() {
		toSerialize["amount_usd"] = o.AmountUsd.Get()
	}
	// skip: evaluated_price is readOnly
	// skip: evaluated_amount is readOnly
	if !IsNil(o.EvaluatedAggressor) {
		toSerialize["evaluated_aggressor"] = o.EvaluatedAggressor
	}
	if o.PoolId.IsSet() {
		toSerialize["pool_id"] = o.PoolId.Get()
	}
	if o.TransactionId.IsSet() {
		toSerialize["transaction_id"] = o.TransactionId.Get()
	}
	return toSerialize, nil
}

type NullableUniswapV2SwapDTO struct {
	value *UniswapV2SwapDTO
	isSet bool
}

func (v NullableUniswapV2SwapDTO) Get() *UniswapV2SwapDTO {
	return v.value
}

func (v *NullableUniswapV2SwapDTO) Set(val *UniswapV2SwapDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV2SwapDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV2SwapDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV2SwapDTO(val *UniswapV2SwapDTO) *NullableUniswapV2SwapDTO {
	return &NullableUniswapV2SwapDTO{value: val, isSet: true}
}

func (v NullableUniswapV2SwapDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV2SwapDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


