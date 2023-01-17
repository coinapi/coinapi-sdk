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

// UniswapV3PositionSnapshotDTO struct for UniswapV3PositionSnapshotDTO
type UniswapV3PositionSnapshotDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// NFT token identifier, format: (NFT token id)#(block number).
	Id NullableString `json:"id,omitempty"`
	// Owner of the NFT.
	Owner NullableString `json:"owner,omitempty"`
	// Pool the position is within.
	Pool NullableString `json:"pool,omitempty"`
	// Position of which the snap was taken of.
	Position NullableString `json:"position,omitempty"`
	// Timestamp of block in which the snap was created.
	Timestamp NullableString `json:"timestamp,omitempty"`
	// Total position liquidity.
	Liquidity NullableString `json:"liquidity,omitempty"`
	// Amount of token 0 ever deposited to position.
	DepositedToken0 NullableString `json:"deposited_token_0,omitempty"`
	// Amount of token 1 ever deposited to position.
	DepositedToken1 NullableString `json:"deposited_token_1,omitempty"`
	// Amount of token 0 ever withdrawn from position (without fees).
	WithdrawnToken0 NullableString `json:"withdrawn_token_0,omitempty"`
	// Amount of token 1 ever withdrawn from position (without fees).
	WithdrawnToken1 NullableString `json:"withdrawn_token_1,omitempty"`
	// All time collected fees in token0.
	CollectedFeesToken0 NullableString `json:"collected_fees_token_0,omitempty"`
	// All time collected fees in token1.
	CollectedFeesToken1 NullableString `json:"collected_fees_token_1,omitempty"`
	// Transaction in which the snapshot was initialized.
	Transaction NullableString `json:"transaction,omitempty"`
	// Variable needed for fee computation.
	FeeGrowthInside0LastX128 NullableString `json:"fee_growth_inside_0_last_x128,omitempty"`
	// Variable needed for fee computation.
	FeeGrowthInside1LastX128 NullableString `json:"fee_growth_inside_1_last_x128,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewUniswapV3PositionSnapshotDTO instantiates a new UniswapV3PositionSnapshotDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV3PositionSnapshotDTO() *UniswapV3PositionSnapshotDTO {
	this := UniswapV3PositionSnapshotDTO{}
	return &this
}

// NewUniswapV3PositionSnapshotDTOWithDefaults instantiates a new UniswapV3PositionSnapshotDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV3PositionSnapshotDTOWithDefaults() *UniswapV3PositionSnapshotDTO {
	this := UniswapV3PositionSnapshotDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV3PositionSnapshotDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PositionSnapshotDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV3PositionSnapshotDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV3PositionSnapshotDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PositionSnapshotDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV3PositionSnapshotDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV3PositionSnapshotDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PositionSnapshotDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV3PositionSnapshotDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV3PositionSnapshotDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetId() {
	o.Id.Unset()
}

// GetOwner returns the Owner field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetOwner() string {
	if o == nil || isNil(o.Owner.Get()) {
		var ret string
		return ret
	}
	return *o.Owner.Get()
}

// GetOwnerOk returns a tuple with the Owner field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetOwnerOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Owner.Get(), o.Owner.IsSet()
}

// HasOwner returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasOwner() bool {
	if o != nil && o.Owner.IsSet() {
		return true
	}

	return false
}

// SetOwner gets a reference to the given NullableString and assigns it to the Owner field.
func (o *UniswapV3PositionSnapshotDTO) SetOwner(v string) {
	o.Owner.Set(&v)
}
// SetOwnerNil sets the value for Owner to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetOwnerNil() {
	o.Owner.Set(nil)
}

// UnsetOwner ensures that no value is present for Owner, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetOwner() {
	o.Owner.Unset()
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetPool() string {
	if o == nil || isNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetPoolOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *UniswapV3PositionSnapshotDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetPosition returns the Position field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetPosition() string {
	if o == nil || isNil(o.Position.Get()) {
		var ret string
		return ret
	}
	return *o.Position.Get()
}

// GetPositionOk returns a tuple with the Position field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetPositionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Position.Get(), o.Position.IsSet()
}

// HasPosition returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasPosition() bool {
	if o != nil && o.Position.IsSet() {
		return true
	}

	return false
}

// SetPosition gets a reference to the given NullableString and assigns it to the Position field.
func (o *UniswapV3PositionSnapshotDTO) SetPosition(v string) {
	o.Position.Set(&v)
}
// SetPositionNil sets the value for Position to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetPositionNil() {
	o.Position.Set(nil)
}

// UnsetPosition ensures that no value is present for Position, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetPosition() {
	o.Position.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetTimestamp() string {
	if o == nil || isNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *UniswapV3PositionSnapshotDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetLiquidity returns the Liquidity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetLiquidity() string {
	if o == nil || isNil(o.Liquidity.Get()) {
		var ret string
		return ret
	}
	return *o.Liquidity.Get()
}

// GetLiquidityOk returns a tuple with the Liquidity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetLiquidityOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Liquidity.Get(), o.Liquidity.IsSet()
}

// HasLiquidity returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasLiquidity() bool {
	if o != nil && o.Liquidity.IsSet() {
		return true
	}

	return false
}

// SetLiquidity gets a reference to the given NullableString and assigns it to the Liquidity field.
func (o *UniswapV3PositionSnapshotDTO) SetLiquidity(v string) {
	o.Liquidity.Set(&v)
}
// SetLiquidityNil sets the value for Liquidity to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetLiquidityNil() {
	o.Liquidity.Set(nil)
}

// UnsetLiquidity ensures that no value is present for Liquidity, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetLiquidity() {
	o.Liquidity.Unset()
}

// GetDepositedToken0 returns the DepositedToken0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetDepositedToken0() string {
	if o == nil || isNil(o.DepositedToken0.Get()) {
		var ret string
		return ret
	}
	return *o.DepositedToken0.Get()
}

// GetDepositedToken0Ok returns a tuple with the DepositedToken0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetDepositedToken0Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.DepositedToken0.Get(), o.DepositedToken0.IsSet()
}

// HasDepositedToken0 returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasDepositedToken0() bool {
	if o != nil && o.DepositedToken0.IsSet() {
		return true
	}

	return false
}

// SetDepositedToken0 gets a reference to the given NullableString and assigns it to the DepositedToken0 field.
func (o *UniswapV3PositionSnapshotDTO) SetDepositedToken0(v string) {
	o.DepositedToken0.Set(&v)
}
// SetDepositedToken0Nil sets the value for DepositedToken0 to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetDepositedToken0Nil() {
	o.DepositedToken0.Set(nil)
}

// UnsetDepositedToken0 ensures that no value is present for DepositedToken0, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetDepositedToken0() {
	o.DepositedToken0.Unset()
}

// GetDepositedToken1 returns the DepositedToken1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetDepositedToken1() string {
	if o == nil || isNil(o.DepositedToken1.Get()) {
		var ret string
		return ret
	}
	return *o.DepositedToken1.Get()
}

// GetDepositedToken1Ok returns a tuple with the DepositedToken1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetDepositedToken1Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.DepositedToken1.Get(), o.DepositedToken1.IsSet()
}

// HasDepositedToken1 returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasDepositedToken1() bool {
	if o != nil && o.DepositedToken1.IsSet() {
		return true
	}

	return false
}

// SetDepositedToken1 gets a reference to the given NullableString and assigns it to the DepositedToken1 field.
func (o *UniswapV3PositionSnapshotDTO) SetDepositedToken1(v string) {
	o.DepositedToken1.Set(&v)
}
// SetDepositedToken1Nil sets the value for DepositedToken1 to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetDepositedToken1Nil() {
	o.DepositedToken1.Set(nil)
}

// UnsetDepositedToken1 ensures that no value is present for DepositedToken1, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetDepositedToken1() {
	o.DepositedToken1.Unset()
}

// GetWithdrawnToken0 returns the WithdrawnToken0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetWithdrawnToken0() string {
	if o == nil || isNil(o.WithdrawnToken0.Get()) {
		var ret string
		return ret
	}
	return *o.WithdrawnToken0.Get()
}

// GetWithdrawnToken0Ok returns a tuple with the WithdrawnToken0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetWithdrawnToken0Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.WithdrawnToken0.Get(), o.WithdrawnToken0.IsSet()
}

// HasWithdrawnToken0 returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasWithdrawnToken0() bool {
	if o != nil && o.WithdrawnToken0.IsSet() {
		return true
	}

	return false
}

// SetWithdrawnToken0 gets a reference to the given NullableString and assigns it to the WithdrawnToken0 field.
func (o *UniswapV3PositionSnapshotDTO) SetWithdrawnToken0(v string) {
	o.WithdrawnToken0.Set(&v)
}
// SetWithdrawnToken0Nil sets the value for WithdrawnToken0 to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetWithdrawnToken0Nil() {
	o.WithdrawnToken0.Set(nil)
}

// UnsetWithdrawnToken0 ensures that no value is present for WithdrawnToken0, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetWithdrawnToken0() {
	o.WithdrawnToken0.Unset()
}

// GetWithdrawnToken1 returns the WithdrawnToken1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetWithdrawnToken1() string {
	if o == nil || isNil(o.WithdrawnToken1.Get()) {
		var ret string
		return ret
	}
	return *o.WithdrawnToken1.Get()
}

// GetWithdrawnToken1Ok returns a tuple with the WithdrawnToken1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetWithdrawnToken1Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.WithdrawnToken1.Get(), o.WithdrawnToken1.IsSet()
}

// HasWithdrawnToken1 returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasWithdrawnToken1() bool {
	if o != nil && o.WithdrawnToken1.IsSet() {
		return true
	}

	return false
}

// SetWithdrawnToken1 gets a reference to the given NullableString and assigns it to the WithdrawnToken1 field.
func (o *UniswapV3PositionSnapshotDTO) SetWithdrawnToken1(v string) {
	o.WithdrawnToken1.Set(&v)
}
// SetWithdrawnToken1Nil sets the value for WithdrawnToken1 to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetWithdrawnToken1Nil() {
	o.WithdrawnToken1.Set(nil)
}

// UnsetWithdrawnToken1 ensures that no value is present for WithdrawnToken1, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetWithdrawnToken1() {
	o.WithdrawnToken1.Unset()
}

// GetCollectedFeesToken0 returns the CollectedFeesToken0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetCollectedFeesToken0() string {
	if o == nil || isNil(o.CollectedFeesToken0.Get()) {
		var ret string
		return ret
	}
	return *o.CollectedFeesToken0.Get()
}

// GetCollectedFeesToken0Ok returns a tuple with the CollectedFeesToken0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetCollectedFeesToken0Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.CollectedFeesToken0.Get(), o.CollectedFeesToken0.IsSet()
}

// HasCollectedFeesToken0 returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasCollectedFeesToken0() bool {
	if o != nil && o.CollectedFeesToken0.IsSet() {
		return true
	}

	return false
}

// SetCollectedFeesToken0 gets a reference to the given NullableString and assigns it to the CollectedFeesToken0 field.
func (o *UniswapV3PositionSnapshotDTO) SetCollectedFeesToken0(v string) {
	o.CollectedFeesToken0.Set(&v)
}
// SetCollectedFeesToken0Nil sets the value for CollectedFeesToken0 to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetCollectedFeesToken0Nil() {
	o.CollectedFeesToken0.Set(nil)
}

// UnsetCollectedFeesToken0 ensures that no value is present for CollectedFeesToken0, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetCollectedFeesToken0() {
	o.CollectedFeesToken0.Unset()
}

// GetCollectedFeesToken1 returns the CollectedFeesToken1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetCollectedFeesToken1() string {
	if o == nil || isNil(o.CollectedFeesToken1.Get()) {
		var ret string
		return ret
	}
	return *o.CollectedFeesToken1.Get()
}

// GetCollectedFeesToken1Ok returns a tuple with the CollectedFeesToken1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetCollectedFeesToken1Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.CollectedFeesToken1.Get(), o.CollectedFeesToken1.IsSet()
}

// HasCollectedFeesToken1 returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasCollectedFeesToken1() bool {
	if o != nil && o.CollectedFeesToken1.IsSet() {
		return true
	}

	return false
}

// SetCollectedFeesToken1 gets a reference to the given NullableString and assigns it to the CollectedFeesToken1 field.
func (o *UniswapV3PositionSnapshotDTO) SetCollectedFeesToken1(v string) {
	o.CollectedFeesToken1.Set(&v)
}
// SetCollectedFeesToken1Nil sets the value for CollectedFeesToken1 to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetCollectedFeesToken1Nil() {
	o.CollectedFeesToken1.Set(nil)
}

// UnsetCollectedFeesToken1 ensures that no value is present for CollectedFeesToken1, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetCollectedFeesToken1() {
	o.CollectedFeesToken1.Unset()
}

// GetTransaction returns the Transaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetTransaction() string {
	if o == nil || isNil(o.Transaction.Get()) {
		var ret string
		return ret
	}
	return *o.Transaction.Get()
}

// GetTransactionOk returns a tuple with the Transaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetTransactionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Transaction.Get(), o.Transaction.IsSet()
}

// HasTransaction returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasTransaction() bool {
	if o != nil && o.Transaction.IsSet() {
		return true
	}

	return false
}

// SetTransaction gets a reference to the given NullableString and assigns it to the Transaction field.
func (o *UniswapV3PositionSnapshotDTO) SetTransaction(v string) {
	o.Transaction.Set(&v)
}
// SetTransactionNil sets the value for Transaction to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetTransactionNil() {
	o.Transaction.Set(nil)
}

// UnsetTransaction ensures that no value is present for Transaction, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetTransaction() {
	o.Transaction.Unset()
}

// GetFeeGrowthInside0LastX128 returns the FeeGrowthInside0LastX128 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetFeeGrowthInside0LastX128() string {
	if o == nil || isNil(o.FeeGrowthInside0LastX128.Get()) {
		var ret string
		return ret
	}
	return *o.FeeGrowthInside0LastX128.Get()
}

// GetFeeGrowthInside0LastX128Ok returns a tuple with the FeeGrowthInside0LastX128 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetFeeGrowthInside0LastX128Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.FeeGrowthInside0LastX128.Get(), o.FeeGrowthInside0LastX128.IsSet()
}

// HasFeeGrowthInside0LastX128 returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasFeeGrowthInside0LastX128() bool {
	if o != nil && o.FeeGrowthInside0LastX128.IsSet() {
		return true
	}

	return false
}

// SetFeeGrowthInside0LastX128 gets a reference to the given NullableString and assigns it to the FeeGrowthInside0LastX128 field.
func (o *UniswapV3PositionSnapshotDTO) SetFeeGrowthInside0LastX128(v string) {
	o.FeeGrowthInside0LastX128.Set(&v)
}
// SetFeeGrowthInside0LastX128Nil sets the value for FeeGrowthInside0LastX128 to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetFeeGrowthInside0LastX128Nil() {
	o.FeeGrowthInside0LastX128.Set(nil)
}

// UnsetFeeGrowthInside0LastX128 ensures that no value is present for FeeGrowthInside0LastX128, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetFeeGrowthInside0LastX128() {
	o.FeeGrowthInside0LastX128.Unset()
}

// GetFeeGrowthInside1LastX128 returns the FeeGrowthInside1LastX128 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PositionSnapshotDTO) GetFeeGrowthInside1LastX128() string {
	if o == nil || isNil(o.FeeGrowthInside1LastX128.Get()) {
		var ret string
		return ret
	}
	return *o.FeeGrowthInside1LastX128.Get()
}

// GetFeeGrowthInside1LastX128Ok returns a tuple with the FeeGrowthInside1LastX128 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PositionSnapshotDTO) GetFeeGrowthInside1LastX128Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.FeeGrowthInside1LastX128.Get(), o.FeeGrowthInside1LastX128.IsSet()
}

// HasFeeGrowthInside1LastX128 returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasFeeGrowthInside1LastX128() bool {
	if o != nil && o.FeeGrowthInside1LastX128.IsSet() {
		return true
	}

	return false
}

// SetFeeGrowthInside1LastX128 gets a reference to the given NullableString and assigns it to the FeeGrowthInside1LastX128 field.
func (o *UniswapV3PositionSnapshotDTO) SetFeeGrowthInside1LastX128(v string) {
	o.FeeGrowthInside1LastX128.Set(&v)
}
// SetFeeGrowthInside1LastX128Nil sets the value for FeeGrowthInside1LastX128 to be an explicit nil
func (o *UniswapV3PositionSnapshotDTO) SetFeeGrowthInside1LastX128Nil() {
	o.FeeGrowthInside1LastX128.Set(nil)
}

// UnsetFeeGrowthInside1LastX128 ensures that no value is present for FeeGrowthInside1LastX128, not even an explicit nil
func (o *UniswapV3PositionSnapshotDTO) UnsetFeeGrowthInside1LastX128() {
	o.FeeGrowthInside1LastX128.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV3PositionSnapshotDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PositionSnapshotDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV3PositionSnapshotDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV3PositionSnapshotDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o UniswapV3PositionSnapshotDTO) MarshalJSON() ([]byte, error) {
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
	if o.Owner.IsSet() {
		toSerialize["owner"] = o.Owner.Get()
	}
	if o.Pool.IsSet() {
		toSerialize["pool"] = o.Pool.Get()
	}
	if o.Position.IsSet() {
		toSerialize["position"] = o.Position.Get()
	}
	if o.Timestamp.IsSet() {
		toSerialize["timestamp"] = o.Timestamp.Get()
	}
	if o.Liquidity.IsSet() {
		toSerialize["liquidity"] = o.Liquidity.Get()
	}
	if o.DepositedToken0.IsSet() {
		toSerialize["deposited_token_0"] = o.DepositedToken0.Get()
	}
	if o.DepositedToken1.IsSet() {
		toSerialize["deposited_token_1"] = o.DepositedToken1.Get()
	}
	if o.WithdrawnToken0.IsSet() {
		toSerialize["withdrawn_token_0"] = o.WithdrawnToken0.Get()
	}
	if o.WithdrawnToken1.IsSet() {
		toSerialize["withdrawn_token_1"] = o.WithdrawnToken1.Get()
	}
	if o.CollectedFeesToken0.IsSet() {
		toSerialize["collected_fees_token_0"] = o.CollectedFeesToken0.Get()
	}
	if o.CollectedFeesToken1.IsSet() {
		toSerialize["collected_fees_token_1"] = o.CollectedFeesToken1.Get()
	}
	if o.Transaction.IsSet() {
		toSerialize["transaction"] = o.Transaction.Get()
	}
	if o.FeeGrowthInside0LastX128.IsSet() {
		toSerialize["fee_growth_inside_0_last_x128"] = o.FeeGrowthInside0LastX128.Get()
	}
	if o.FeeGrowthInside1LastX128.IsSet() {
		toSerialize["fee_growth_inside_1_last_x128"] = o.FeeGrowthInside1LastX128.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableUniswapV3PositionSnapshotDTO struct {
	value *UniswapV3PositionSnapshotDTO
	isSet bool
}

func (v NullableUniswapV3PositionSnapshotDTO) Get() *UniswapV3PositionSnapshotDTO {
	return v.value
}

func (v *NullableUniswapV3PositionSnapshotDTO) Set(val *UniswapV3PositionSnapshotDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV3PositionSnapshotDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV3PositionSnapshotDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV3PositionSnapshotDTO(val *UniswapV3PositionSnapshotDTO) *NullableUniswapV3PositionSnapshotDTO {
	return &NullableUniswapV3PositionSnapshotDTO{value: val, isSet: true}
}

func (v NullableUniswapV3PositionSnapshotDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV3PositionSnapshotDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


