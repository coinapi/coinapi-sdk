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

// checks if the UniswapV3MintDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UniswapV3MintDTO{}

// UniswapV3MintDTO Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, and more.
type UniswapV3MintDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Transaction hash + '#' + index in mints Transaction array.
	Id NullableString `json:"id,omitempty"`
	// Which txn the mint was included in.
	Transaction NullableString `json:"transaction,omitempty"`
	// Time of transaction.
	Timestamp NullableString `json:"timestamp,omitempty"`
	// Pool address.
	Pool NullableString `json:"pool,omitempty"`
	// Reference to token0 as stored in pool contract.
	Token0 NullableString `json:"token_0,omitempty"`
	// Reference to token1 as stored in pool contract.
	Token1 NullableString `json:"token_1,omitempty"`
	// Owner of position where liquidity minted to.
	Owner NullableString `json:"owner,omitempty"`
	// The address that minted the liquidity.
	Sender NullableString `json:"sender,omitempty"`
	// Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
	Origin NullableString `json:"origin,omitempty"`
	// Amount of liquidity minted.
	Amount NullableString `json:"amount,omitempty"`
	// Amount of token 0 minted.
	Amount0 NullableString `json:"amount_0,omitempty"`
	// Amount of token 1 minted.
	Amount1 NullableString `json:"amount_1,omitempty"`
	// Derived amount based on available prices of tokens.
	AmountUsd NullableString `json:"amount_usd,omitempty"`
	// Lower tick of the position.
	TickLower NullableString `json:"tick_lower,omitempty"`
	// Upper tick of the position.
	TickUpper NullableString `json:"tick_upper,omitempty"`
	// Order within the transaction.
	LogIndex NullableString `json:"log_index,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewUniswapV3MintDTO instantiates a new UniswapV3MintDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV3MintDTO() *UniswapV3MintDTO {
	this := UniswapV3MintDTO{}
	return &this
}

// NewUniswapV3MintDTOWithDefaults instantiates a new UniswapV3MintDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV3MintDTOWithDefaults() *UniswapV3MintDTO {
	this := UniswapV3MintDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV3MintDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3MintDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV3MintDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV3MintDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3MintDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV3MintDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV3MintDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3MintDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV3MintDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV3MintDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV3MintDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetId() {
	o.Id.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetTransaction() string {
	if o == nil || IsNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *UniswapV3MintDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *UniswapV3MintDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetTimestamp() string {
	if o == nil || IsNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *UniswapV3MintDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *UniswapV3MintDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetPool() string {
	if o == nil || IsNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetPoolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *UniswapV3MintDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *UniswapV3MintDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetToken0 returns the Token0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetToken0() string {
	if o == nil || IsNil(o.Token0.Get()) {
		var ret string
		return ret
	}
	return *o.Token0.Get()
}

// GetToken0Ok returns a tuple with the Token0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetToken0Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Token0.Get(), o.Token0.IsSet()
}

// HasToken0 returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasToken0() bool {
	if o != nil && o.Token0.IsSet() {
		return true
	}

	return false
}

// SetToken0 gets a reference to the given NullableString and assigns it to the Token0 field.
func (o *UniswapV3MintDTO) SetToken0(v string) {
	o.Token0.Set(&v)
}
// SetToken0Nil sets the value for Token0 to be an explicit nil
func (o *UniswapV3MintDTO) SetToken0Nil() {
	o.Token0.Set(nil)
}

// UnsetToken0 ensures that no value is present for Token0, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetToken0() {
	o.Token0.Unset()
}

// GetToken1 returns the Token1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetToken1() string {
	if o == nil || IsNil(o.Token1.Get()) {
		var ret string
		return ret
	}
	return *o.Token1.Get()
}

// GetToken1Ok returns a tuple with the Token1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetToken1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Token1.Get(), o.Token1.IsSet()
}

// HasToken1 returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasToken1() bool {
	if o != nil && o.Token1.IsSet() {
		return true
	}

	return false
}

// SetToken1 gets a reference to the given NullableString and assigns it to the Token1 field.
func (o *UniswapV3MintDTO) SetToken1(v string) {
	o.Token1.Set(&v)
}
// SetToken1Nil sets the value for Token1 to be an explicit nil
func (o *UniswapV3MintDTO) SetToken1Nil() {
	o.Token1.Set(nil)
}

// UnsetToken1 ensures that no value is present for Token1, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetToken1() {
	o.Token1.Unset()
}

// GetOwner returns the Owner field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetOwner() string {
	if o == nil || IsNil(o.Owner.Get()) {
		var ret string
		return ret
	}
	return *o.Owner.Get()
}

// GetOwnerOk returns a tuple with the Owner field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetOwnerOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Owner.Get(), o.Owner.IsSet()
}

// HasOwner returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasOwner() bool {
	if o != nil && o.Owner.IsSet() {
		return true
	}

	return false
}

// SetOwner gets a reference to the given NullableString and assigns it to the Owner field.
func (o *UniswapV3MintDTO) SetOwner(v string) {
	o.Owner.Set(&v)
}
// SetOwnerNil sets the value for Owner to be an explicit nil
func (o *UniswapV3MintDTO) SetOwnerNil() {
	o.Owner.Set(nil)
}

// UnsetOwner ensures that no value is present for Owner, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetOwner() {
	o.Owner.Unset()
}

// GetSender returns the Sender field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetSender() string {
	if o == nil || IsNil(o.Sender.Get()) {
		var ret string
		return ret
	}
	return *o.Sender.Get()
}

// GetSenderOk returns a tuple with the Sender field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetSenderOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Sender.Get(), o.Sender.IsSet()
}

// HasSender returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasSender() bool {
	if o != nil && o.Sender.IsSet() {
		return true
	}

	return false
}

// SetSender gets a reference to the given NullableString and assigns it to the Sender field.
func (o *UniswapV3MintDTO) SetSender(v string) {
	o.Sender.Set(&v)
}
// SetSenderNil sets the value for Sender to be an explicit nil
func (o *UniswapV3MintDTO) SetSenderNil() {
	o.Sender.Set(nil)
}

// UnsetSender ensures that no value is present for Sender, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetSender() {
	o.Sender.Unset()
}

// GetOrigin returns the Origin field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetOrigin() string {
	if o == nil || IsNil(o.Origin.Get()) {
		var ret string
		return ret
	}
	return *o.Origin.Get()
}

// GetOriginOk returns a tuple with the Origin field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetOriginOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Origin.Get(), o.Origin.IsSet()
}

// HasOrigin returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasOrigin() bool {
	if o != nil && o.Origin.IsSet() {
		return true
	}

	return false
}

// SetOrigin gets a reference to the given NullableString and assigns it to the Origin field.
func (o *UniswapV3MintDTO) SetOrigin(v string) {
	o.Origin.Set(&v)
}
// SetOriginNil sets the value for Origin to be an explicit nil
func (o *UniswapV3MintDTO) SetOriginNil() {
	o.Origin.Set(nil)
}

// UnsetOrigin ensures that no value is present for Origin, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetOrigin() {
	o.Origin.Unset()
}

// GetAmount returns the Amount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetAmount() string {
	if o == nil || IsNil(o.Amount.Get()) {
		var ret string
		return ret
	}
	return *o.Amount.Get()
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetAmountOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount.Get(), o.Amount.IsSet()
}

// HasAmount returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasAmount() bool {
	if o != nil && o.Amount.IsSet() {
		return true
	}

	return false
}

// SetAmount gets a reference to the given NullableString and assigns it to the Amount field.
func (o *UniswapV3MintDTO) SetAmount(v string) {
	o.Amount.Set(&v)
}
// SetAmountNil sets the value for Amount to be an explicit nil
func (o *UniswapV3MintDTO) SetAmountNil() {
	o.Amount.Set(nil)
}

// UnsetAmount ensures that no value is present for Amount, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetAmount() {
	o.Amount.Unset()
}

// GetAmount0 returns the Amount0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetAmount0() string {
	if o == nil || IsNil(o.Amount0.Get()) {
		var ret string
		return ret
	}
	return *o.Amount0.Get()
}

// GetAmount0Ok returns a tuple with the Amount0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetAmount0Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount0.Get(), o.Amount0.IsSet()
}

// HasAmount0 returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasAmount0() bool {
	if o != nil && o.Amount0.IsSet() {
		return true
	}

	return false
}

// SetAmount0 gets a reference to the given NullableString and assigns it to the Amount0 field.
func (o *UniswapV3MintDTO) SetAmount0(v string) {
	o.Amount0.Set(&v)
}
// SetAmount0Nil sets the value for Amount0 to be an explicit nil
func (o *UniswapV3MintDTO) SetAmount0Nil() {
	o.Amount0.Set(nil)
}

// UnsetAmount0 ensures that no value is present for Amount0, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetAmount0() {
	o.Amount0.Unset()
}

// GetAmount1 returns the Amount1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetAmount1() string {
	if o == nil || IsNil(o.Amount1.Get()) {
		var ret string
		return ret
	}
	return *o.Amount1.Get()
}

// GetAmount1Ok returns a tuple with the Amount1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetAmount1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Amount1.Get(), o.Amount1.IsSet()
}

// HasAmount1 returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasAmount1() bool {
	if o != nil && o.Amount1.IsSet() {
		return true
	}

	return false
}

// SetAmount1 gets a reference to the given NullableString and assigns it to the Amount1 field.
func (o *UniswapV3MintDTO) SetAmount1(v string) {
	o.Amount1.Set(&v)
}
// SetAmount1Nil sets the value for Amount1 to be an explicit nil
func (o *UniswapV3MintDTO) SetAmount1Nil() {
	o.Amount1.Set(nil)
}

// UnsetAmount1 ensures that no value is present for Amount1, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetAmount1() {
	o.Amount1.Unset()
}

// GetAmountUsd returns the AmountUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetAmountUsd() string {
	if o == nil || IsNil(o.AmountUsd.Get()) {
		var ret string
		return ret
	}
	return *o.AmountUsd.Get()
}

// GetAmountUsdOk returns a tuple with the AmountUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetAmountUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.AmountUsd.Get(), o.AmountUsd.IsSet()
}

// HasAmountUsd returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasAmountUsd() bool {
	if o != nil && o.AmountUsd.IsSet() {
		return true
	}

	return false
}

// SetAmountUsd gets a reference to the given NullableString and assigns it to the AmountUsd field.
func (o *UniswapV3MintDTO) SetAmountUsd(v string) {
	o.AmountUsd.Set(&v)
}
// SetAmountUsdNil sets the value for AmountUsd to be an explicit nil
func (o *UniswapV3MintDTO) SetAmountUsdNil() {
	o.AmountUsd.Set(nil)
}

// UnsetAmountUsd ensures that no value is present for AmountUsd, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetAmountUsd() {
	o.AmountUsd.Unset()
}

// GetTickLower returns the TickLower field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetTickLower() string {
	if o == nil || IsNil(o.TickLower.Get()) {
		var ret string
		return ret
	}
	return *o.TickLower.Get()
}

// GetTickLowerOk returns a tuple with the TickLower field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetTickLowerOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TickLower.Get(), o.TickLower.IsSet()
}

// HasTickLower returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasTickLower() bool {
	if o != nil && o.TickLower.IsSet() {
		return true
	}

	return false
}

// SetTickLower gets a reference to the given NullableString and assigns it to the TickLower field.
func (o *UniswapV3MintDTO) SetTickLower(v string) {
	o.TickLower.Set(&v)
}
// SetTickLowerNil sets the value for TickLower to be an explicit nil
func (o *UniswapV3MintDTO) SetTickLowerNil() {
	o.TickLower.Set(nil)
}

// UnsetTickLower ensures that no value is present for TickLower, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetTickLower() {
	o.TickLower.Unset()
}

// GetTickUpper returns the TickUpper field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetTickUpper() string {
	if o == nil || IsNil(o.TickUpper.Get()) {
		var ret string
		return ret
	}
	return *o.TickUpper.Get()
}

// GetTickUpperOk returns a tuple with the TickUpper field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetTickUpperOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TickUpper.Get(), o.TickUpper.IsSet()
}

// HasTickUpper returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasTickUpper() bool {
	if o != nil && o.TickUpper.IsSet() {
		return true
	}

	return false
}

// SetTickUpper gets a reference to the given NullableString and assigns it to the TickUpper field.
func (o *UniswapV3MintDTO) SetTickUpper(v string) {
	o.TickUpper.Set(&v)
}
// SetTickUpperNil sets the value for TickUpper to be an explicit nil
func (o *UniswapV3MintDTO) SetTickUpperNil() {
	o.TickUpper.Set(nil)
}

// UnsetTickUpper ensures that no value is present for TickUpper, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetTickUpper() {
	o.TickUpper.Unset()
}

// GetLogIndex returns the LogIndex field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3MintDTO) GetLogIndex() string {
	if o == nil || IsNil(o.LogIndex.Get()) {
		var ret string
		return ret
	}
	return *o.LogIndex.Get()
}

// GetLogIndexOk returns a tuple with the LogIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3MintDTO) GetLogIndexOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.LogIndex.Get(), o.LogIndex.IsSet()
}

// HasLogIndex returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasLogIndex() bool {
	if o != nil && o.LogIndex.IsSet() {
		return true
	}

	return false
}

// SetLogIndex gets a reference to the given NullableString and assigns it to the LogIndex field.
func (o *UniswapV3MintDTO) SetLogIndex(v string) {
	o.LogIndex.Set(&v)
}
// SetLogIndexNil sets the value for LogIndex to be an explicit nil
func (o *UniswapV3MintDTO) SetLogIndexNil() {
	o.LogIndex.Set(nil)
}

// UnsetLogIndex ensures that no value is present for LogIndex, not even an explicit nil
func (o *UniswapV3MintDTO) UnsetLogIndex() {
	o.LogIndex.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV3MintDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3MintDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV3MintDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV3MintDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o UniswapV3MintDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UniswapV3MintDTO) ToMap() (map[string]interface{}, error) {
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
	if o.Pool.IsSet() {
		toSerialize["pool"] = o.Pool.Get()
	}
	if o.Token0.IsSet() {
		toSerialize["token_0"] = o.Token0.Get()
	}
	if o.Token1.IsSet() {
		toSerialize["token_1"] = o.Token1.Get()
	}
	if o.Owner.IsSet() {
		toSerialize["owner"] = o.Owner.Get()
	}
	if o.Sender.IsSet() {
		toSerialize["sender"] = o.Sender.Get()
	}
	if o.Origin.IsSet() {
		toSerialize["origin"] = o.Origin.Get()
	}
	if o.Amount.IsSet() {
		toSerialize["amount"] = o.Amount.Get()
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
	if o.TickLower.IsSet() {
		toSerialize["tick_lower"] = o.TickLower.Get()
	}
	if o.TickUpper.IsSet() {
		toSerialize["tick_upper"] = o.TickUpper.Get()
	}
	if o.LogIndex.IsSet() {
		toSerialize["log_index"] = o.LogIndex.Get()
	}
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableUniswapV3MintDTO struct {
	value *UniswapV3MintDTO
	isSet bool
}

func (v NullableUniswapV3MintDTO) Get() *UniswapV3MintDTO {
	return v.value
}

func (v *NullableUniswapV3MintDTO) Set(val *UniswapV3MintDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV3MintDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV3MintDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV3MintDTO(val *UniswapV3MintDTO) *NullableUniswapV3MintDTO {
	return &NullableUniswapV3MintDTO{value: val, isSet: true}
}

func (v NullableUniswapV3MintDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV3MintDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


