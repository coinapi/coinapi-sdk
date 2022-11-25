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

// CurveExchangeDTO struct for CurveExchangeDTO
type CurveExchangeDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	Pool NullableString `json:"pool,omitempty"`
	// 
	Buyer NullableString `json:"buyer,omitempty"`
	// 
	Receiver NullableString `json:"receiver,omitempty"`
	// 
	TokenSold NullableString `json:"token_sold,omitempty"`
	// 
	TokenBought NullableString `json:"token_bought,omitempty"`
	// 
	AmountSold NullableString `json:"amount_sold,omitempty"`
	// 
	AmountBought NullableString `json:"amount_bought,omitempty"`
	// 
	Block NullableString `json:"block,omitempty"`
	// 
	Timestamp NullableString `json:"timestamp,omitempty"`
	// 
	Transaction NullableString `json:"transaction,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	EvaluatedPrice *float64 `json:"evaluated_price,omitempty"`
	EvaluatedAmount *float64 `json:"evaluated_amount,omitempty"`
	EvaluatedAggressor *TransactionsETradeAggressiveSide `json:"evaluated_aggressor,omitempty"`
	PoolId NullableString `json:"pool_id,omitempty"`
	TransactionId NullableString `json:"transaction_id,omitempty"`
}

// NewCurveExchangeDTO instantiates a new CurveExchangeDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveExchangeDTO() *CurveExchangeDTO {
	this := CurveExchangeDTO{}
	return &this
}

// NewCurveExchangeDTOWithDefaults instantiates a new CurveExchangeDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveExchangeDTOWithDefaults() *CurveExchangeDTO {
	this := CurveExchangeDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveExchangeDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveExchangeDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveExchangeDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveExchangeDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveExchangeDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveExchangeDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveExchangeDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveExchangeDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveExchangeDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveExchangeDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveExchangeDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveExchangeDTO) UnsetId() {
	o.Id.Unset()
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetPool() string {
	if o == nil || isNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetPoolOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *CurveExchangeDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *CurveExchangeDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *CurveExchangeDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetBuyer returns the Buyer field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetBuyer() string {
	if o == nil || isNil(o.Buyer.Get()) {
		var ret string
		return ret
	}
	return *o.Buyer.Get()
}

// GetBuyerOk returns a tuple with the Buyer field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetBuyerOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Buyer.Get(), o.Buyer.IsSet()
}

// HasBuyer returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasBuyer() bool {
	if o != nil && o.Buyer.IsSet() {
		return true
	}

	return false
}

// SetBuyer gets a reference to the given NullableString and assigns it to the Buyer field.
func (o *CurveExchangeDTO) SetBuyer(v string) {
	o.Buyer.Set(&v)
}
// SetBuyerNil sets the value for Buyer to be an explicit nil
func (o *CurveExchangeDTO) SetBuyerNil() {
	o.Buyer.Set(nil)
}

// UnsetBuyer ensures that no value is present for Buyer, not even an explicit nil
func (o *CurveExchangeDTO) UnsetBuyer() {
	o.Buyer.Unset()
}

// GetReceiver returns the Receiver field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetReceiver() string {
	if o == nil || isNil(o.Receiver.Get()) {
		var ret string
		return ret
	}
	return *o.Receiver.Get()
}

// GetReceiverOk returns a tuple with the Receiver field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetReceiverOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Receiver.Get(), o.Receiver.IsSet()
}

// HasReceiver returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasReceiver() bool {
	if o != nil && o.Receiver.IsSet() {
		return true
	}

	return false
}

// SetReceiver gets a reference to the given NullableString and assigns it to the Receiver field.
func (o *CurveExchangeDTO) SetReceiver(v string) {
	o.Receiver.Set(&v)
}
// SetReceiverNil sets the value for Receiver to be an explicit nil
func (o *CurveExchangeDTO) SetReceiverNil() {
	o.Receiver.Set(nil)
}

// UnsetReceiver ensures that no value is present for Receiver, not even an explicit nil
func (o *CurveExchangeDTO) UnsetReceiver() {
	o.Receiver.Unset()
}

// GetTokenSold returns the TokenSold field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetTokenSold() string {
	if o == nil || isNil(o.TokenSold.Get()) {
		var ret string
		return ret
	}
	return *o.TokenSold.Get()
}

// GetTokenSoldOk returns a tuple with the TokenSold field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetTokenSoldOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TokenSold.Get(), o.TokenSold.IsSet()
}

// HasTokenSold returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasTokenSold() bool {
	if o != nil && o.TokenSold.IsSet() {
		return true
	}

	return false
}

// SetTokenSold gets a reference to the given NullableString and assigns it to the TokenSold field.
func (o *CurveExchangeDTO) SetTokenSold(v string) {
	o.TokenSold.Set(&v)
}
// SetTokenSoldNil sets the value for TokenSold to be an explicit nil
func (o *CurveExchangeDTO) SetTokenSoldNil() {
	o.TokenSold.Set(nil)
}

// UnsetTokenSold ensures that no value is present for TokenSold, not even an explicit nil
func (o *CurveExchangeDTO) UnsetTokenSold() {
	o.TokenSold.Unset()
}

// GetTokenBought returns the TokenBought field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetTokenBought() string {
	if o == nil || isNil(o.TokenBought.Get()) {
		var ret string
		return ret
	}
	return *o.TokenBought.Get()
}

// GetTokenBoughtOk returns a tuple with the TokenBought field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetTokenBoughtOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TokenBought.Get(), o.TokenBought.IsSet()
}

// HasTokenBought returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasTokenBought() bool {
	if o != nil && o.TokenBought.IsSet() {
		return true
	}

	return false
}

// SetTokenBought gets a reference to the given NullableString and assigns it to the TokenBought field.
func (o *CurveExchangeDTO) SetTokenBought(v string) {
	o.TokenBought.Set(&v)
}
// SetTokenBoughtNil sets the value for TokenBought to be an explicit nil
func (o *CurveExchangeDTO) SetTokenBoughtNil() {
	o.TokenBought.Set(nil)
}

// UnsetTokenBought ensures that no value is present for TokenBought, not even an explicit nil
func (o *CurveExchangeDTO) UnsetTokenBought() {
	o.TokenBought.Unset()
}

// GetAmountSold returns the AmountSold field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetAmountSold() string {
	if o == nil || isNil(o.AmountSold.Get()) {
		var ret string
		return ret
	}
	return *o.AmountSold.Get()
}

// GetAmountSoldOk returns a tuple with the AmountSold field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetAmountSoldOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.AmountSold.Get(), o.AmountSold.IsSet()
}

// HasAmountSold returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasAmountSold() bool {
	if o != nil && o.AmountSold.IsSet() {
		return true
	}

	return false
}

// SetAmountSold gets a reference to the given NullableString and assigns it to the AmountSold field.
func (o *CurveExchangeDTO) SetAmountSold(v string) {
	o.AmountSold.Set(&v)
}
// SetAmountSoldNil sets the value for AmountSold to be an explicit nil
func (o *CurveExchangeDTO) SetAmountSoldNil() {
	o.AmountSold.Set(nil)
}

// UnsetAmountSold ensures that no value is present for AmountSold, not even an explicit nil
func (o *CurveExchangeDTO) UnsetAmountSold() {
	o.AmountSold.Unset()
}

// GetAmountBought returns the AmountBought field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetAmountBought() string {
	if o == nil || isNil(o.AmountBought.Get()) {
		var ret string
		return ret
	}
	return *o.AmountBought.Get()
}

// GetAmountBoughtOk returns a tuple with the AmountBought field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetAmountBoughtOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.AmountBought.Get(), o.AmountBought.IsSet()
}

// HasAmountBought returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasAmountBought() bool {
	if o != nil && o.AmountBought.IsSet() {
		return true
	}

	return false
}

// SetAmountBought gets a reference to the given NullableString and assigns it to the AmountBought field.
func (o *CurveExchangeDTO) SetAmountBought(v string) {
	o.AmountBought.Set(&v)
}
// SetAmountBoughtNil sets the value for AmountBought to be an explicit nil
func (o *CurveExchangeDTO) SetAmountBoughtNil() {
	o.AmountBought.Set(nil)
}

// UnsetAmountBought ensures that no value is present for AmountBought, not even an explicit nil
func (o *CurveExchangeDTO) UnsetAmountBought() {
	o.AmountBought.Unset()
}

// GetBlock returns the Block field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetBlock() string {
	if o == nil || isNil(o.Block.Get()) {
		var ret string
		return ret
	}
	return *o.Block.Get()
}

// GetBlockOk returns a tuple with the Block field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetBlockOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Block.Get(), o.Block.IsSet()
}

// HasBlock returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasBlock() bool {
	if o != nil && o.Block.IsSet() {
		return true
	}

	return false
}

// SetBlock gets a reference to the given NullableString and assigns it to the Block field.
func (o *CurveExchangeDTO) SetBlock(v string) {
	o.Block.Set(&v)
}
// SetBlockNil sets the value for Block to be an explicit nil
func (o *CurveExchangeDTO) SetBlockNil() {
	o.Block.Set(nil)
}

// UnsetBlock ensures that no value is present for Block, not even an explicit nil
func (o *CurveExchangeDTO) UnsetBlock() {
	o.Block.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetTimestamp() string {
	if o == nil || isNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *CurveExchangeDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *CurveExchangeDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *CurveExchangeDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetTransaction() string {
	if o == nil || isNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *CurveExchangeDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *CurveExchangeDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *CurveExchangeDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveExchangeDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveExchangeDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveExchangeDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetEvaluatedPrice returns the EvaluatedPrice field value if set, zero value otherwise.
func (o *CurveExchangeDTO) GetEvaluatedPrice() float64 {
	if o == nil || isNil(o.EvaluatedPrice) {
		var ret float64
		return ret
	}
	return *o.EvaluatedPrice
}

// GetEvaluatedPriceOk returns a tuple with the EvaluatedPrice field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveExchangeDTO) GetEvaluatedPriceOk() (*float64, bool) {
	if o == nil || isNil(o.EvaluatedPrice) {
    return nil, false
	}
	return o.EvaluatedPrice, true
}

// HasEvaluatedPrice returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasEvaluatedPrice() bool {
	if o != nil && !isNil(o.EvaluatedPrice) {
		return true
	}

	return false
}

// SetEvaluatedPrice gets a reference to the given float64 and assigns it to the EvaluatedPrice field.
func (o *CurveExchangeDTO) SetEvaluatedPrice(v float64) {
	o.EvaluatedPrice = &v
}

// GetEvaluatedAmount returns the EvaluatedAmount field value if set, zero value otherwise.
func (o *CurveExchangeDTO) GetEvaluatedAmount() float64 {
	if o == nil || isNil(o.EvaluatedAmount) {
		var ret float64
		return ret
	}
	return *o.EvaluatedAmount
}

// GetEvaluatedAmountOk returns a tuple with the EvaluatedAmount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveExchangeDTO) GetEvaluatedAmountOk() (*float64, bool) {
	if o == nil || isNil(o.EvaluatedAmount) {
    return nil, false
	}
	return o.EvaluatedAmount, true
}

// HasEvaluatedAmount returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasEvaluatedAmount() bool {
	if o != nil && !isNil(o.EvaluatedAmount) {
		return true
	}

	return false
}

// SetEvaluatedAmount gets a reference to the given float64 and assigns it to the EvaluatedAmount field.
func (o *CurveExchangeDTO) SetEvaluatedAmount(v float64) {
	o.EvaluatedAmount = &v
}

// GetEvaluatedAggressor returns the EvaluatedAggressor field value if set, zero value otherwise.
func (o *CurveExchangeDTO) GetEvaluatedAggressor() TransactionsETradeAggressiveSide {
	if o == nil || isNil(o.EvaluatedAggressor) {
		var ret TransactionsETradeAggressiveSide
		return ret
	}
	return *o.EvaluatedAggressor
}

// GetEvaluatedAggressorOk returns a tuple with the EvaluatedAggressor field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveExchangeDTO) GetEvaluatedAggressorOk() (*TransactionsETradeAggressiveSide, bool) {
	if o == nil || isNil(o.EvaluatedAggressor) {
    return nil, false
	}
	return o.EvaluatedAggressor, true
}

// HasEvaluatedAggressor returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasEvaluatedAggressor() bool {
	if o != nil && !isNil(o.EvaluatedAggressor) {
		return true
	}

	return false
}

// SetEvaluatedAggressor gets a reference to the given TransactionsETradeAggressiveSide and assigns it to the EvaluatedAggressor field.
func (o *CurveExchangeDTO) SetEvaluatedAggressor(v TransactionsETradeAggressiveSide) {
	o.EvaluatedAggressor = &v
}

// GetPoolId returns the PoolId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetPoolId() string {
	if o == nil || isNil(o.PoolId.Get()) {
		var ret string
		return ret
	}
	return *o.PoolId.Get()
}

// GetPoolIdOk returns a tuple with the PoolId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetPoolIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.PoolId.Get(), o.PoolId.IsSet()
}

// HasPoolId returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasPoolId() bool {
	if o != nil && o.PoolId.IsSet() {
		return true
	}

	return false
}

// SetPoolId gets a reference to the given NullableString and assigns it to the PoolId field.
func (o *CurveExchangeDTO) SetPoolId(v string) {
	o.PoolId.Set(&v)
}
// SetPoolIdNil sets the value for PoolId to be an explicit nil
func (o *CurveExchangeDTO) SetPoolIdNil() {
	o.PoolId.Set(nil)
}

// UnsetPoolId ensures that no value is present for PoolId, not even an explicit nil
func (o *CurveExchangeDTO) UnsetPoolId() {
	o.PoolId.Unset()
}

// GetTransactionId returns the TransactionId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveExchangeDTO) GetTransactionId() string {
	if o == nil || isNil(o.TransactionId.Get()) {
		var ret string
		return ret
	}
	return *o.TransactionId.Get()
}

// GetTransactionIdOk returns a tuple with the TransactionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveExchangeDTO) GetTransactionIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TransactionId.Get(), o.TransactionId.IsSet()
}

// HasTransactionId returns a boolean if a field has been set.
func (o *CurveExchangeDTO) HasTransactionId() bool {
	if o != nil && o.TransactionId.IsSet() {
		return true
	}

	return false
}

// SetTransactionId gets a reference to the given NullableString and assigns it to the TransactionId field.
func (o *CurveExchangeDTO) SetTransactionId(v string) {
	o.TransactionId.Set(&v)
}
// SetTransactionIdNil sets the value for TransactionId to be an explicit nil
func (o *CurveExchangeDTO) SetTransactionIdNil() {
	o.TransactionId.Set(nil)
}

// UnsetTransactionId ensures that no value is present for TransactionId, not even an explicit nil
func (o *CurveExchangeDTO) UnsetTransactionId() {
	o.TransactionId.Unset()
}

func (o CurveExchangeDTO) MarshalJSON() ([]byte, error) {
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
	if o.Buyer.IsSet() {
		toSerialize["buyer"] = o.Buyer.Get()
	}
	if o.Receiver.IsSet() {
		toSerialize["receiver"] = o.Receiver.Get()
	}
	if o.TokenSold.IsSet() {
		toSerialize["token_sold"] = o.TokenSold.Get()
	}
	if o.TokenBought.IsSet() {
		toSerialize["token_bought"] = o.TokenBought.Get()
	}
	if o.AmountSold.IsSet() {
		toSerialize["amount_sold"] = o.AmountSold.Get()
	}
	if o.AmountBought.IsSet() {
		toSerialize["amount_bought"] = o.AmountBought.Get()
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

type NullableCurveExchangeDTO struct {
	value *CurveExchangeDTO
	isSet bool
}

func (v NullableCurveExchangeDTO) Get() *CurveExchangeDTO {
	return v.value
}

func (v *NullableCurveExchangeDTO) Set(val *CurveExchangeDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveExchangeDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveExchangeDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveExchangeDTO(val *CurveExchangeDTO) *NullableCurveExchangeDTO {
	return &NullableCurveExchangeDTO{value: val, isSet: true}
}

func (v NullableCurveExchangeDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveExchangeDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


