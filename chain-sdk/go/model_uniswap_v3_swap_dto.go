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

// UniswapV3SwapDTO Swap are created for each token swap within a pair.
type UniswapV3SwapDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	// Identifier, format: transaction hash + \"#\" + index in swaps Transaction array.
	Id NullableString `json:"id,omitempty"`
	// Pointer to transaction.
	Transaction NullableString `json:"transaction,omitempty"`
	// Timestamp of transaction.
	Timestamp *time.Time `json:"timestamp,omitempty"`
	// Pool swap occured within.
	Pool NullableString `json:"pool,omitempty"`
	// Reference to token0 as stored in pair contract.
	Token0 NullableString `json:"token_0,omitempty"`
	// Reference to token1 as stored in pair contract.
	Token1 NullableString `json:"token_1,omitempty"`
	// Sender of the swap.
	Sender NullableString `json:"sender,omitempty"`
	// Recipient of the swap.
	Recipient NullableString `json:"recipient,omitempty"`
	// Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
	Origin NullableString `json:"origin,omitempty"`
	// Delta of token0 swapped.
	Amount0 NullableString `json:"amount_0,omitempty"`
	// Delta of token1 swapped.
	Amount1 NullableString `json:"amount_1,omitempty"`
	// Derived amount of tokens sold in USD.
	AmountUsd NullableString `json:"amount_usd,omitempty"`
	SqrtPriceX96 *NumericsBigInteger `json:"sqrt_price_x96,omitempty"`
	Tick *NumericsBigInteger `json:"tick,omitempty"`
	LogIndex *NumericsBigInteger `json:"log_index,omitempty"`
	EvaluatedPrice *float64 `json:"evaluated_price,omitempty"`
	EvaluatedAmount *float64 `json:"evaluated_amount,omitempty"`
	EvaluatedAggressor *TransactionsETradeAggressiveSide `json:"evaluated_aggressor,omitempty"`
	PoolId NullableString `json:"pool_id,omitempty"`
	TransactionId NullableString `json:"transaction_id,omitempty"`
}

// NewUniswapV3SwapDTO instantiates a new UniswapV3SwapDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV3SwapDTO() *UniswapV3SwapDTO {
	this := UniswapV3SwapDTO{}
	return &this
}

// NewUniswapV3SwapDTOWithDefaults instantiates a new UniswapV3SwapDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV3SwapDTOWithDefaults() *UniswapV3SwapDTO {
	this := UniswapV3SwapDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV3SwapDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV3SwapDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV3SwapDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV3SwapDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV3SwapDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV3SwapDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetId() {
	o.Id.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetTransaction() string {
	if o == nil || isNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *UniswapV3SwapDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *UniswapV3SwapDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetTimestamp() time.Time {
	if o == nil || isNil(o.Timestamp) {
		var ret time.Time
		return ret
	}
	return *o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetTimestampOk() (*time.Time, bool) {
	if o == nil || isNil(o.Timestamp) {
    return nil, false
	}
	return o.Timestamp, true
}

// HasTimestamp returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasTimestamp() bool {
	if o != nil && !isNil(o.Timestamp) {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given time.Time and assigns it to the Timestamp field.
func (o *UniswapV3SwapDTO) SetTimestamp(v time.Time) {
	o.Timestamp = &v
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetPool() string {
	if o == nil || isNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetPoolOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *UniswapV3SwapDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *UniswapV3SwapDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetToken0 returns the Token0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetToken0() string {
	if o == nil || isNil(o.Token0.Get()) {
		var ret string
		return ret
	}
	return *o.Token0.Get()
}

// GetToken0Ok returns a tuple with the Token0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetToken0Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Token0.Get(), o.Token0.IsSet()
}

// HasToken0 returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasToken0() bool {
	if o != nil && o.Token0.IsSet() {
		return true
	}

	return false
}

// SetToken0 gets a reference to the given NullableString and assigns it to the Token0 field.
func (o *UniswapV3SwapDTO) SetToken0(v string) {
	o.Token0.Set(&v)
}
// SetToken0Nil sets the value for Token0 to be an explicit nil
func (o *UniswapV3SwapDTO) SetToken0Nil() {
	o.Token0.Set(nil)
}

// UnsetToken0 ensures that no value is present for Token0, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetToken0() {
	o.Token0.Unset()
}

// GetToken1 returns the Token1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetToken1() string {
	if o == nil || isNil(o.Token1.Get()) {
		var ret string
		return ret
	}
	return *o.Token1.Get()
}

// GetToken1Ok returns a tuple with the Token1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetToken1Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Token1.Get(), o.Token1.IsSet()
}

// HasToken1 returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasToken1() bool {
	if o != nil && o.Token1.IsSet() {
		return true
	}

	return false
}

// SetToken1 gets a reference to the given NullableString and assigns it to the Token1 field.
func (o *UniswapV3SwapDTO) SetToken1(v string) {
	o.Token1.Set(&v)
}
// SetToken1Nil sets the value for Token1 to be an explicit nil
func (o *UniswapV3SwapDTO) SetToken1Nil() {
	o.Token1.Set(nil)
}

// UnsetToken1 ensures that no value is present for Token1, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetToken1() {
	o.Token1.Unset()
}

// GetSender returns the Sender field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetSender() string {
	if o == nil || isNil(o.Sender.Get()) {
		var ret string
		return ret
	}
	return *o.Sender.Get()
}

// GetSenderOk returns a tuple with the Sender field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetSenderOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Sender.Get(), o.Sender.IsSet()
}

// HasSender returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasSender() bool {
	if o != nil && o.Sender.IsSet() {
		return true
	}

	return false
}

// SetSender gets a reference to the given NullableString and assigns it to the Sender field.
func (o *UniswapV3SwapDTO) SetSender(v string) {
	o.Sender.Set(&v)
}
// SetSenderNil sets the value for Sender to be an explicit nil
func (o *UniswapV3SwapDTO) SetSenderNil() {
	o.Sender.Set(nil)
}

// UnsetSender ensures that no value is present for Sender, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetSender() {
	o.Sender.Unset()
}

// GetRecipient returns the Recipient field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetRecipient() string {
	if o == nil || isNil(o.Recipient.Get()) {
		var ret string
		return ret
	}
	return *o.Recipient.Get()
}

// GetRecipientOk returns a tuple with the Recipient field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetRecipientOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Recipient.Get(), o.Recipient.IsSet()
}

// HasRecipient returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasRecipient() bool {
	if o != nil && o.Recipient.IsSet() {
		return true
	}

	return false
}

// SetRecipient gets a reference to the given NullableString and assigns it to the Recipient field.
func (o *UniswapV3SwapDTO) SetRecipient(v string) {
	o.Recipient.Set(&v)
}
// SetRecipientNil sets the value for Recipient to be an explicit nil
func (o *UniswapV3SwapDTO) SetRecipientNil() {
	o.Recipient.Set(nil)
}

// UnsetRecipient ensures that no value is present for Recipient, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetRecipient() {
	o.Recipient.Unset()
}

// GetOrigin returns the Origin field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetOrigin() string {
	if o == nil || isNil(o.Origin.Get()) {
		var ret string
		return ret
	}
	return *o.Origin.Get()
}

// GetOriginOk returns a tuple with the Origin field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetOriginOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Origin.Get(), o.Origin.IsSet()
}

// HasOrigin returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasOrigin() bool {
	if o != nil && o.Origin.IsSet() {
		return true
	}

	return false
}

// SetOrigin gets a reference to the given NullableString and assigns it to the Origin field.
func (o *UniswapV3SwapDTO) SetOrigin(v string) {
	o.Origin.Set(&v)
}
// SetOriginNil sets the value for Origin to be an explicit nil
func (o *UniswapV3SwapDTO) SetOriginNil() {
	o.Origin.Set(nil)
}

// UnsetOrigin ensures that no value is present for Origin, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetOrigin() {
	o.Origin.Unset()
}

// GetAmount0 returns the Amount0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetAmount0() string {
	if o == nil || isNil(o.Amount0.Get()) {
		var ret string
		return ret
	}
	return *o.Amount0.Get()
}

// GetAmount0Ok returns a tuple with the Amount0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetAmount0Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Amount0.Get(), o.Amount0.IsSet()
}

// HasAmount0 returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasAmount0() bool {
	if o != nil && o.Amount0.IsSet() {
		return true
	}

	return false
}

// SetAmount0 gets a reference to the given NullableString and assigns it to the Amount0 field.
func (o *UniswapV3SwapDTO) SetAmount0(v string) {
	o.Amount0.Set(&v)
}
// SetAmount0Nil sets the value for Amount0 to be an explicit nil
func (o *UniswapV3SwapDTO) SetAmount0Nil() {
	o.Amount0.Set(nil)
}

// UnsetAmount0 ensures that no value is present for Amount0, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetAmount0() {
	o.Amount0.Unset()
}

// GetAmount1 returns the Amount1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetAmount1() string {
	if o == nil || isNil(o.Amount1.Get()) {
		var ret string
		return ret
	}
	return *o.Amount1.Get()
}

// GetAmount1Ok returns a tuple with the Amount1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetAmount1Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Amount1.Get(), o.Amount1.IsSet()
}

// HasAmount1 returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasAmount1() bool {
	if o != nil && o.Amount1.IsSet() {
		return true
	}

	return false
}

// SetAmount1 gets a reference to the given NullableString and assigns it to the Amount1 field.
func (o *UniswapV3SwapDTO) SetAmount1(v string) {
	o.Amount1.Set(&v)
}
// SetAmount1Nil sets the value for Amount1 to be an explicit nil
func (o *UniswapV3SwapDTO) SetAmount1Nil() {
	o.Amount1.Set(nil)
}

// UnsetAmount1 ensures that no value is present for Amount1, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetAmount1() {
	o.Amount1.Unset()
}

// GetAmountUsd returns the AmountUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetAmountUsd() string {
	if o == nil || isNil(o.AmountUsd.Get()) {
		var ret string
		return ret
	}
	return *o.AmountUsd.Get()
}

// GetAmountUsdOk returns a tuple with the AmountUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetAmountUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.AmountUsd.Get(), o.AmountUsd.IsSet()
}

// HasAmountUsd returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasAmountUsd() bool {
	if o != nil && o.AmountUsd.IsSet() {
		return true
	}

	return false
}

// SetAmountUsd gets a reference to the given NullableString and assigns it to the AmountUsd field.
func (o *UniswapV3SwapDTO) SetAmountUsd(v string) {
	o.AmountUsd.Set(&v)
}
// SetAmountUsdNil sets the value for AmountUsd to be an explicit nil
func (o *UniswapV3SwapDTO) SetAmountUsdNil() {
	o.AmountUsd.Set(nil)
}

// UnsetAmountUsd ensures that no value is present for AmountUsd, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetAmountUsd() {
	o.AmountUsd.Unset()
}

// GetSqrtPriceX96 returns the SqrtPriceX96 field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetSqrtPriceX96() NumericsBigInteger {
	if o == nil || isNil(o.SqrtPriceX96) {
		var ret NumericsBigInteger
		return ret
	}
	return *o.SqrtPriceX96
}

// GetSqrtPriceX96Ok returns a tuple with the SqrtPriceX96 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetSqrtPriceX96Ok() (*NumericsBigInteger, bool) {
	if o == nil || isNil(o.SqrtPriceX96) {
    return nil, false
	}
	return o.SqrtPriceX96, true
}

// HasSqrtPriceX96 returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasSqrtPriceX96() bool {
	if o != nil && !isNil(o.SqrtPriceX96) {
		return true
	}

	return false
}

// SetSqrtPriceX96 gets a reference to the given NumericsBigInteger and assigns it to the SqrtPriceX96 field.
func (o *UniswapV3SwapDTO) SetSqrtPriceX96(v NumericsBigInteger) {
	o.SqrtPriceX96 = &v
}

// GetTick returns the Tick field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetTick() NumericsBigInteger {
	if o == nil || isNil(o.Tick) {
		var ret NumericsBigInteger
		return ret
	}
	return *o.Tick
}

// GetTickOk returns a tuple with the Tick field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetTickOk() (*NumericsBigInteger, bool) {
	if o == nil || isNil(o.Tick) {
    return nil, false
	}
	return o.Tick, true
}

// HasTick returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasTick() bool {
	if o != nil && !isNil(o.Tick) {
		return true
	}

	return false
}

// SetTick gets a reference to the given NumericsBigInteger and assigns it to the Tick field.
func (o *UniswapV3SwapDTO) SetTick(v NumericsBigInteger) {
	o.Tick = &v
}

// GetLogIndex returns the LogIndex field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetLogIndex() NumericsBigInteger {
	if o == nil || isNil(o.LogIndex) {
		var ret NumericsBigInteger
		return ret
	}
	return *o.LogIndex
}

// GetLogIndexOk returns a tuple with the LogIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetLogIndexOk() (*NumericsBigInteger, bool) {
	if o == nil || isNil(o.LogIndex) {
    return nil, false
	}
	return o.LogIndex, true
}

// HasLogIndex returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasLogIndex() bool {
	if o != nil && !isNil(o.LogIndex) {
		return true
	}

	return false
}

// SetLogIndex gets a reference to the given NumericsBigInteger and assigns it to the LogIndex field.
func (o *UniswapV3SwapDTO) SetLogIndex(v NumericsBigInteger) {
	o.LogIndex = &v
}

// GetEvaluatedPrice returns the EvaluatedPrice field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetEvaluatedPrice() float64 {
	if o == nil || isNil(o.EvaluatedPrice) {
		var ret float64
		return ret
	}
	return *o.EvaluatedPrice
}

// GetEvaluatedPriceOk returns a tuple with the EvaluatedPrice field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetEvaluatedPriceOk() (*float64, bool) {
	if o == nil || isNil(o.EvaluatedPrice) {
    return nil, false
	}
	return o.EvaluatedPrice, true
}

// HasEvaluatedPrice returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasEvaluatedPrice() bool {
	if o != nil && !isNil(o.EvaluatedPrice) {
		return true
	}

	return false
}

// SetEvaluatedPrice gets a reference to the given float64 and assigns it to the EvaluatedPrice field.
func (o *UniswapV3SwapDTO) SetEvaluatedPrice(v float64) {
	o.EvaluatedPrice = &v
}

// GetEvaluatedAmount returns the EvaluatedAmount field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetEvaluatedAmount() float64 {
	if o == nil || isNil(o.EvaluatedAmount) {
		var ret float64
		return ret
	}
	return *o.EvaluatedAmount
}

// GetEvaluatedAmountOk returns a tuple with the EvaluatedAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetEvaluatedAmountOk() (*float64, bool) {
	if o == nil || isNil(o.EvaluatedAmount) {
    return nil, false
	}
	return o.EvaluatedAmount, true
}

// HasEvaluatedAmount returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasEvaluatedAmount() bool {
	if o != nil && !isNil(o.EvaluatedAmount) {
		return true
	}

	return false
}

// SetEvaluatedAmount gets a reference to the given float64 and assigns it to the EvaluatedAmount field.
func (o *UniswapV3SwapDTO) SetEvaluatedAmount(v float64) {
	o.EvaluatedAmount = &v
}

// GetEvaluatedAggressor returns the EvaluatedAggressor field value if set, zero value otherwise.
func (o *UniswapV3SwapDTO) GetEvaluatedAggressor() TransactionsETradeAggressiveSide {
	if o == nil || isNil(o.EvaluatedAggressor) {
		var ret TransactionsETradeAggressiveSide
		return ret
	}
	return *o.EvaluatedAggressor
}

// GetEvaluatedAggressorOk returns a tuple with the EvaluatedAggressor field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3SwapDTO) GetEvaluatedAggressorOk() (*TransactionsETradeAggressiveSide, bool) {
	if o == nil || isNil(o.EvaluatedAggressor) {
    return nil, false
	}
	return o.EvaluatedAggressor, true
}

// HasEvaluatedAggressor returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasEvaluatedAggressor() bool {
	if o != nil && !isNil(o.EvaluatedAggressor) {
		return true
	}

	return false
}

// SetEvaluatedAggressor gets a reference to the given TransactionsETradeAggressiveSide and assigns it to the EvaluatedAggressor field.
func (o *UniswapV3SwapDTO) SetEvaluatedAggressor(v TransactionsETradeAggressiveSide) {
	o.EvaluatedAggressor = &v
}

// GetPoolId returns the PoolId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetPoolId() string {
	if o == nil || isNil(o.PoolId.Get()) {
		var ret string
		return ret
	}
	return *o.PoolId.Get()
}

// GetPoolIdOk returns a tuple with the PoolId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetPoolIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.PoolId.Get(), o.PoolId.IsSet()
}

// HasPoolId returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasPoolId() bool {
	if o != nil && o.PoolId.IsSet() {
		return true
	}

	return false
}

// SetPoolId gets a reference to the given NullableString and assigns it to the PoolId field.
func (o *UniswapV3SwapDTO) SetPoolId(v string) {
	o.PoolId.Set(&v)
}
// SetPoolIdNil sets the value for PoolId to be an explicit nil
func (o *UniswapV3SwapDTO) SetPoolIdNil() {
	o.PoolId.Set(nil)
}

// UnsetPoolId ensures that no value is present for PoolId, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetPoolId() {
	o.PoolId.Unset()
}

// GetTransactionId returns the TransactionId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3SwapDTO) GetTransactionId() string {
	if o == nil || isNil(o.TransactionId.Get()) {
		var ret string
		return ret
	}
	return *o.TransactionId.Get()
}

// GetTransactionIdOk returns a tuple with the TransactionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3SwapDTO) GetTransactionIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TransactionId.Get(), o.TransactionId.IsSet()
}

// HasTransactionId returns a boolean if a field has been set.
func (o *UniswapV3SwapDTO) HasTransactionId() bool {
	if o != nil && o.TransactionId.IsSet() {
		return true
	}

	return false
}

// SetTransactionId gets a reference to the given NullableString and assigns it to the TransactionId field.
func (o *UniswapV3SwapDTO) SetTransactionId(v string) {
	o.TransactionId.Set(&v)
}
// SetTransactionIdNil sets the value for TransactionId to be an explicit nil
func (o *UniswapV3SwapDTO) SetTransactionIdNil() {
	o.TransactionId.Set(nil)
}

// UnsetTransactionId ensures that no value is present for TransactionId, not even an explicit nil
func (o *UniswapV3SwapDTO) UnsetTransactionId() {
	o.TransactionId.Unset()
}

func (o UniswapV3SwapDTO) MarshalJSON() ([]byte, error) {
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
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if o.Transaction.IsSet() {
		toSerialize["transaction"] = o.Transaction.Get()
	}
	if !isNil(o.Timestamp) {
		toSerialize["timestamp"] = o.Timestamp
	}
	if o.Pool.IsSet() {
		toSerialize["pool"] = o.Pool.Get()
	}
	if o.Token0.IsSet() {
		toSerialize["token_0"] = o.Token0.Get()
	}
	if o.Token1.IsSet() {
		toSerialize["token_1"] = o.Token1.Get()
	}
	if o.Sender.IsSet() {
		toSerialize["sender"] = o.Sender.Get()
	}
	if o.Recipient.IsSet() {
		toSerialize["recipient"] = o.Recipient.Get()
	}
	if o.Origin.IsSet() {
		toSerialize["origin"] = o.Origin.Get()
	}
	if o.Amount0.IsSet() {
		toSerialize["amount_0"] = o.Amount0.Get()
	}
	if o.Amount1.IsSet() {
		toSerialize["amount_1"] = o.Amount1.Get()
	}
	if o.AmountUsd.IsSet() {
		toSerialize["amount_usd"] = o.AmountUsd.Get()
	}
	if !isNil(o.SqrtPriceX96) {
		toSerialize["sqrt_price_x96"] = o.SqrtPriceX96
	}
	if !isNil(o.Tick) {
		toSerialize["tick"] = o.Tick
	}
	if !isNil(o.LogIndex) {
		toSerialize["log_index"] = o.LogIndex
	}
	if !isNil(o.EvaluatedPrice) {
		toSerialize["evaluated_price"] = o.EvaluatedPrice
	}
	if !isNil(o.EvaluatedAmount) {
		toSerialize["evaluated_amount"] = o.EvaluatedAmount
	}
	if !isNil(o.EvaluatedAggressor) {
		toSerialize["evaluated_aggressor"] = o.EvaluatedAggressor
	}
	if o.PoolId.IsSet() {
		toSerialize["pool_id"] = o.PoolId.Get()
	}
	if o.TransactionId.IsSet() {
		toSerialize["transaction_id"] = o.TransactionId.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableUniswapV3SwapDTO struct {
	value *UniswapV3SwapDTO
	isSet bool
}

func (v NullableUniswapV3SwapDTO) Get() *UniswapV3SwapDTO {
	return v.value
}

func (v *NullableUniswapV3SwapDTO) Set(val *UniswapV3SwapDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV3SwapDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV3SwapDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV3SwapDTO(val *UniswapV3SwapDTO) *NullableUniswapV3SwapDTO {
	return &NullableUniswapV3SwapDTO{value: val, isSet: true}
}

func (v NullableUniswapV3SwapDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV3SwapDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


