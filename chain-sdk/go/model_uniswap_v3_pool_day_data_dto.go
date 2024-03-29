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

// checks if the UniswapV3PoolDayDataDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UniswapV3PoolDayDataDTO{}

// UniswapV3PoolDayDataDTO Data accumulated and condensed into day stats for each pool.
type UniswapV3PoolDayDataDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Identifier, format: (pool address)-(day id).
	Id NullableString `json:"id,omitempty"`
	// Timestamp rounded to current day by dividing by 86400
	Date *int32 `json:"date,omitempty"`
	// Pointer to pool.
	Pool NullableString `json:"pool,omitempty"`
	// In range liquidity at end of period.
	Liquidity NullableString `json:"liquidity,omitempty"`
	// Current price tracker at end of period.
	SqrtPrice NullableString `json:"sqrt_price,omitempty"`
	// Price of token0 - derived from sqrtPrice.
	Token0Price NullableString `json:"token_0_price,omitempty"`
	// Price of token1 - derived from sqrtPrice.
	Token1Price NullableString `json:"token_1_price,omitempty"`
	// Current tick at end of period.
	Tick NullableString `json:"tick,omitempty"`
	// Tracker for global fee growth.
	FeeGrowthGlobal0x128 NullableString `json:"fee_growth_global_0x128,omitempty"`
	// Tracker for global fee growth.
	FeeGrowthGlobal1x128 NullableString `json:"fee_growth_global_1x128,omitempty"`
	// Total value locked derived in USD at end of period.
	TvlUsd NullableString `json:"tvl_usd,omitempty"`
	// Volume in token0.
	VolumeToken0 NullableString `json:"volume_token_0,omitempty"`
	// Volume in token1.
	VolumeToken1 NullableString `json:"volume_token_1,omitempty"`
	// Volume in USD.
	VolumeUsd NullableString `json:"volume_usd,omitempty"`
	// Fees in USD.
	FeesUsd NullableString `json:"fees_usd,omitempty"`
	// Number of transactions during period.
	TxCount NullableString `json:"tx_count,omitempty"`
	// Opening price of token0.
	Open NullableString `json:"open,omitempty"`
	// High price of token0.
	High NullableString `json:"high,omitempty"`
	// Low price of token0.
	Low NullableString `json:"low,omitempty"`
	// Close price of token0.
	Close NullableString `json:"close,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewUniswapV3PoolDayDataDTO instantiates a new UniswapV3PoolDayDataDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV3PoolDayDataDTO() *UniswapV3PoolDayDataDTO {
	this := UniswapV3PoolDayDataDTO{}
	return &this
}

// NewUniswapV3PoolDayDataDTOWithDefaults instantiates a new UniswapV3PoolDayDataDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV3PoolDayDataDTOWithDefaults() *UniswapV3PoolDayDataDTO {
	this := UniswapV3PoolDayDataDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV3PoolDayDataDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PoolDayDataDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV3PoolDayDataDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV3PoolDayDataDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PoolDayDataDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV3PoolDayDataDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV3PoolDayDataDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PoolDayDataDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV3PoolDayDataDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV3PoolDayDataDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetId() {
	o.Id.Unset()
}

// GetDate returns the Date field value if set, zero value otherwise.
func (o *UniswapV3PoolDayDataDTO) GetDate() int32 {
	if o == nil || IsNil(o.Date) {
		var ret int32
		return ret
	}
	return *o.Date
}

// GetDateOk returns a tuple with the Date field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PoolDayDataDTO) GetDateOk() (*int32, bool) {
	if o == nil || IsNil(o.Date) {
		return nil, false
	}
	return o.Date, true
}

// HasDate returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasDate() bool {
	if o != nil && !IsNil(o.Date) {
		return true
	}

	return false
}

// SetDate gets a reference to the given int32 and assigns it to the Date field.
func (o *UniswapV3PoolDayDataDTO) SetDate(v int32) {
	o.Date = &v
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetPool() string {
	if o == nil || IsNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetPoolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *UniswapV3PoolDayDataDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetLiquidity returns the Liquidity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetLiquidity() string {
	if o == nil || IsNil(o.Liquidity.Get()) {
		var ret string
		return ret
	}
	return *o.Liquidity.Get()
}

// GetLiquidityOk returns a tuple with the Liquidity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetLiquidityOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Liquidity.Get(), o.Liquidity.IsSet()
}

// HasLiquidity returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasLiquidity() bool {
	if o != nil && o.Liquidity.IsSet() {
		return true
	}

	return false
}

// SetLiquidity gets a reference to the given NullableString and assigns it to the Liquidity field.
func (o *UniswapV3PoolDayDataDTO) SetLiquidity(v string) {
	o.Liquidity.Set(&v)
}
// SetLiquidityNil sets the value for Liquidity to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetLiquidityNil() {
	o.Liquidity.Set(nil)
}

// UnsetLiquidity ensures that no value is present for Liquidity, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetLiquidity() {
	o.Liquidity.Unset()
}

// GetSqrtPrice returns the SqrtPrice field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetSqrtPrice() string {
	if o == nil || IsNil(o.SqrtPrice.Get()) {
		var ret string
		return ret
	}
	return *o.SqrtPrice.Get()
}

// GetSqrtPriceOk returns a tuple with the SqrtPrice field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetSqrtPriceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.SqrtPrice.Get(), o.SqrtPrice.IsSet()
}

// HasSqrtPrice returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasSqrtPrice() bool {
	if o != nil && o.SqrtPrice.IsSet() {
		return true
	}

	return false
}

// SetSqrtPrice gets a reference to the given NullableString and assigns it to the SqrtPrice field.
func (o *UniswapV3PoolDayDataDTO) SetSqrtPrice(v string) {
	o.SqrtPrice.Set(&v)
}
// SetSqrtPriceNil sets the value for SqrtPrice to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetSqrtPriceNil() {
	o.SqrtPrice.Set(nil)
}

// UnsetSqrtPrice ensures that no value is present for SqrtPrice, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetSqrtPrice() {
	o.SqrtPrice.Unset()
}

// GetToken0Price returns the Token0Price field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetToken0Price() string {
	if o == nil || IsNil(o.Token0Price.Get()) {
		var ret string
		return ret
	}
	return *o.Token0Price.Get()
}

// GetToken0PriceOk returns a tuple with the Token0Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetToken0PriceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Token0Price.Get(), o.Token0Price.IsSet()
}

// HasToken0Price returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasToken0Price() bool {
	if o != nil && o.Token0Price.IsSet() {
		return true
	}

	return false
}

// SetToken0Price gets a reference to the given NullableString and assigns it to the Token0Price field.
func (o *UniswapV3PoolDayDataDTO) SetToken0Price(v string) {
	o.Token0Price.Set(&v)
}
// SetToken0PriceNil sets the value for Token0Price to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetToken0PriceNil() {
	o.Token0Price.Set(nil)
}

// UnsetToken0Price ensures that no value is present for Token0Price, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetToken0Price() {
	o.Token0Price.Unset()
}

// GetToken1Price returns the Token1Price field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetToken1Price() string {
	if o == nil || IsNil(o.Token1Price.Get()) {
		var ret string
		return ret
	}
	return *o.Token1Price.Get()
}

// GetToken1PriceOk returns a tuple with the Token1Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetToken1PriceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Token1Price.Get(), o.Token1Price.IsSet()
}

// HasToken1Price returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasToken1Price() bool {
	if o != nil && o.Token1Price.IsSet() {
		return true
	}

	return false
}

// SetToken1Price gets a reference to the given NullableString and assigns it to the Token1Price field.
func (o *UniswapV3PoolDayDataDTO) SetToken1Price(v string) {
	o.Token1Price.Set(&v)
}
// SetToken1PriceNil sets the value for Token1Price to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetToken1PriceNil() {
	o.Token1Price.Set(nil)
}

// UnsetToken1Price ensures that no value is present for Token1Price, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetToken1Price() {
	o.Token1Price.Unset()
}

// GetTick returns the Tick field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetTick() string {
	if o == nil || IsNil(o.Tick.Get()) {
		var ret string
		return ret
	}
	return *o.Tick.Get()
}

// GetTickOk returns a tuple with the Tick field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetTickOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Tick.Get(), o.Tick.IsSet()
}

// HasTick returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasTick() bool {
	if o != nil && o.Tick.IsSet() {
		return true
	}

	return false
}

// SetTick gets a reference to the given NullableString and assigns it to the Tick field.
func (o *UniswapV3PoolDayDataDTO) SetTick(v string) {
	o.Tick.Set(&v)
}
// SetTickNil sets the value for Tick to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetTickNil() {
	o.Tick.Set(nil)
}

// UnsetTick ensures that no value is present for Tick, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetTick() {
	o.Tick.Unset()
}

// GetFeeGrowthGlobal0x128 returns the FeeGrowthGlobal0x128 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetFeeGrowthGlobal0x128() string {
	if o == nil || IsNil(o.FeeGrowthGlobal0x128.Get()) {
		var ret string
		return ret
	}
	return *o.FeeGrowthGlobal0x128.Get()
}

// GetFeeGrowthGlobal0x128Ok returns a tuple with the FeeGrowthGlobal0x128 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetFeeGrowthGlobal0x128Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeeGrowthGlobal0x128.Get(), o.FeeGrowthGlobal0x128.IsSet()
}

// HasFeeGrowthGlobal0x128 returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasFeeGrowthGlobal0x128() bool {
	if o != nil && o.FeeGrowthGlobal0x128.IsSet() {
		return true
	}

	return false
}

// SetFeeGrowthGlobal0x128 gets a reference to the given NullableString and assigns it to the FeeGrowthGlobal0x128 field.
func (o *UniswapV3PoolDayDataDTO) SetFeeGrowthGlobal0x128(v string) {
	o.FeeGrowthGlobal0x128.Set(&v)
}
// SetFeeGrowthGlobal0x128Nil sets the value for FeeGrowthGlobal0x128 to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetFeeGrowthGlobal0x128Nil() {
	o.FeeGrowthGlobal0x128.Set(nil)
}

// UnsetFeeGrowthGlobal0x128 ensures that no value is present for FeeGrowthGlobal0x128, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetFeeGrowthGlobal0x128() {
	o.FeeGrowthGlobal0x128.Unset()
}

// GetFeeGrowthGlobal1x128 returns the FeeGrowthGlobal1x128 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetFeeGrowthGlobal1x128() string {
	if o == nil || IsNil(o.FeeGrowthGlobal1x128.Get()) {
		var ret string
		return ret
	}
	return *o.FeeGrowthGlobal1x128.Get()
}

// GetFeeGrowthGlobal1x128Ok returns a tuple with the FeeGrowthGlobal1x128 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetFeeGrowthGlobal1x128Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeeGrowthGlobal1x128.Get(), o.FeeGrowthGlobal1x128.IsSet()
}

// HasFeeGrowthGlobal1x128 returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasFeeGrowthGlobal1x128() bool {
	if o != nil && o.FeeGrowthGlobal1x128.IsSet() {
		return true
	}

	return false
}

// SetFeeGrowthGlobal1x128 gets a reference to the given NullableString and assigns it to the FeeGrowthGlobal1x128 field.
func (o *UniswapV3PoolDayDataDTO) SetFeeGrowthGlobal1x128(v string) {
	o.FeeGrowthGlobal1x128.Set(&v)
}
// SetFeeGrowthGlobal1x128Nil sets the value for FeeGrowthGlobal1x128 to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetFeeGrowthGlobal1x128Nil() {
	o.FeeGrowthGlobal1x128.Set(nil)
}

// UnsetFeeGrowthGlobal1x128 ensures that no value is present for FeeGrowthGlobal1x128, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetFeeGrowthGlobal1x128() {
	o.FeeGrowthGlobal1x128.Unset()
}

// GetTvlUsd returns the TvlUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetTvlUsd() string {
	if o == nil || IsNil(o.TvlUsd.Get()) {
		var ret string
		return ret
	}
	return *o.TvlUsd.Get()
}

// GetTvlUsdOk returns a tuple with the TvlUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetTvlUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TvlUsd.Get(), o.TvlUsd.IsSet()
}

// HasTvlUsd returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasTvlUsd() bool {
	if o != nil && o.TvlUsd.IsSet() {
		return true
	}

	return false
}

// SetTvlUsd gets a reference to the given NullableString and assigns it to the TvlUsd field.
func (o *UniswapV3PoolDayDataDTO) SetTvlUsd(v string) {
	o.TvlUsd.Set(&v)
}
// SetTvlUsdNil sets the value for TvlUsd to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetTvlUsdNil() {
	o.TvlUsd.Set(nil)
}

// UnsetTvlUsd ensures that no value is present for TvlUsd, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetTvlUsd() {
	o.TvlUsd.Unset()
}

// GetVolumeToken0 returns the VolumeToken0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetVolumeToken0() string {
	if o == nil || IsNil(o.VolumeToken0.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeToken0.Get()
}

// GetVolumeToken0Ok returns a tuple with the VolumeToken0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetVolumeToken0Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeToken0.Get(), o.VolumeToken0.IsSet()
}

// HasVolumeToken0 returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasVolumeToken0() bool {
	if o != nil && o.VolumeToken0.IsSet() {
		return true
	}

	return false
}

// SetVolumeToken0 gets a reference to the given NullableString and assigns it to the VolumeToken0 field.
func (o *UniswapV3PoolDayDataDTO) SetVolumeToken0(v string) {
	o.VolumeToken0.Set(&v)
}
// SetVolumeToken0Nil sets the value for VolumeToken0 to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetVolumeToken0Nil() {
	o.VolumeToken0.Set(nil)
}

// UnsetVolumeToken0 ensures that no value is present for VolumeToken0, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetVolumeToken0() {
	o.VolumeToken0.Unset()
}

// GetVolumeToken1 returns the VolumeToken1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetVolumeToken1() string {
	if o == nil || IsNil(o.VolumeToken1.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeToken1.Get()
}

// GetVolumeToken1Ok returns a tuple with the VolumeToken1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetVolumeToken1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeToken1.Get(), o.VolumeToken1.IsSet()
}

// HasVolumeToken1 returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasVolumeToken1() bool {
	if o != nil && o.VolumeToken1.IsSet() {
		return true
	}

	return false
}

// SetVolumeToken1 gets a reference to the given NullableString and assigns it to the VolumeToken1 field.
func (o *UniswapV3PoolDayDataDTO) SetVolumeToken1(v string) {
	o.VolumeToken1.Set(&v)
}
// SetVolumeToken1Nil sets the value for VolumeToken1 to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetVolumeToken1Nil() {
	o.VolumeToken1.Set(nil)
}

// UnsetVolumeToken1 ensures that no value is present for VolumeToken1, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetVolumeToken1() {
	o.VolumeToken1.Unset()
}

// GetVolumeUsd returns the VolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetVolumeUsd() string {
	if o == nil || IsNil(o.VolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeUsd.Get()
}

// GetVolumeUsdOk returns a tuple with the VolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetVolumeUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeUsd.Get(), o.VolumeUsd.IsSet()
}

// HasVolumeUsd returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasVolumeUsd() bool {
	if o != nil && o.VolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetVolumeUsd gets a reference to the given NullableString and assigns it to the VolumeUsd field.
func (o *UniswapV3PoolDayDataDTO) SetVolumeUsd(v string) {
	o.VolumeUsd.Set(&v)
}
// SetVolumeUsdNil sets the value for VolumeUsd to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetVolumeUsdNil() {
	o.VolumeUsd.Set(nil)
}

// UnsetVolumeUsd ensures that no value is present for VolumeUsd, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetVolumeUsd() {
	o.VolumeUsd.Unset()
}

// GetFeesUsd returns the FeesUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetFeesUsd() string {
	if o == nil || IsNil(o.FeesUsd.Get()) {
		var ret string
		return ret
	}
	return *o.FeesUsd.Get()
}

// GetFeesUsdOk returns a tuple with the FeesUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetFeesUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeesUsd.Get(), o.FeesUsd.IsSet()
}

// HasFeesUsd returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasFeesUsd() bool {
	if o != nil && o.FeesUsd.IsSet() {
		return true
	}

	return false
}

// SetFeesUsd gets a reference to the given NullableString and assigns it to the FeesUsd field.
func (o *UniswapV3PoolDayDataDTO) SetFeesUsd(v string) {
	o.FeesUsd.Set(&v)
}
// SetFeesUsdNil sets the value for FeesUsd to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetFeesUsdNil() {
	o.FeesUsd.Set(nil)
}

// UnsetFeesUsd ensures that no value is present for FeesUsd, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetFeesUsd() {
	o.FeesUsd.Unset()
}

// GetTxCount returns the TxCount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetTxCount() string {
	if o == nil || IsNil(o.TxCount.Get()) {
		var ret string
		return ret
	}
	return *o.TxCount.Get()
}

// GetTxCountOk returns a tuple with the TxCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetTxCountOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TxCount.Get(), o.TxCount.IsSet()
}

// HasTxCount returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasTxCount() bool {
	if o != nil && o.TxCount.IsSet() {
		return true
	}

	return false
}

// SetTxCount gets a reference to the given NullableString and assigns it to the TxCount field.
func (o *UniswapV3PoolDayDataDTO) SetTxCount(v string) {
	o.TxCount.Set(&v)
}
// SetTxCountNil sets the value for TxCount to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetTxCountNil() {
	o.TxCount.Set(nil)
}

// UnsetTxCount ensures that no value is present for TxCount, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetTxCount() {
	o.TxCount.Unset()
}

// GetOpen returns the Open field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetOpen() string {
	if o == nil || IsNil(o.Open.Get()) {
		var ret string
		return ret
	}
	return *o.Open.Get()
}

// GetOpenOk returns a tuple with the Open field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetOpenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Open.Get(), o.Open.IsSet()
}

// HasOpen returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasOpen() bool {
	if o != nil && o.Open.IsSet() {
		return true
	}

	return false
}

// SetOpen gets a reference to the given NullableString and assigns it to the Open field.
func (o *UniswapV3PoolDayDataDTO) SetOpen(v string) {
	o.Open.Set(&v)
}
// SetOpenNil sets the value for Open to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetOpenNil() {
	o.Open.Set(nil)
}

// UnsetOpen ensures that no value is present for Open, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetOpen() {
	o.Open.Unset()
}

// GetHigh returns the High field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetHigh() string {
	if o == nil || IsNil(o.High.Get()) {
		var ret string
		return ret
	}
	return *o.High.Get()
}

// GetHighOk returns a tuple with the High field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetHighOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.High.Get(), o.High.IsSet()
}

// HasHigh returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasHigh() bool {
	if o != nil && o.High.IsSet() {
		return true
	}

	return false
}

// SetHigh gets a reference to the given NullableString and assigns it to the High field.
func (o *UniswapV3PoolDayDataDTO) SetHigh(v string) {
	o.High.Set(&v)
}
// SetHighNil sets the value for High to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetHighNil() {
	o.High.Set(nil)
}

// UnsetHigh ensures that no value is present for High, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetHigh() {
	o.High.Unset()
}

// GetLow returns the Low field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetLow() string {
	if o == nil || IsNil(o.Low.Get()) {
		var ret string
		return ret
	}
	return *o.Low.Get()
}

// GetLowOk returns a tuple with the Low field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetLowOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Low.Get(), o.Low.IsSet()
}

// HasLow returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasLow() bool {
	if o != nil && o.Low.IsSet() {
		return true
	}

	return false
}

// SetLow gets a reference to the given NullableString and assigns it to the Low field.
func (o *UniswapV3PoolDayDataDTO) SetLow(v string) {
	o.Low.Set(&v)
}
// SetLowNil sets the value for Low to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetLowNil() {
	o.Low.Set(nil)
}

// UnsetLow ensures that no value is present for Low, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetLow() {
	o.Low.Unset()
}

// GetClose returns the Close field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3PoolDayDataDTO) GetClose() string {
	if o == nil || IsNil(o.Close.Get()) {
		var ret string
		return ret
	}
	return *o.Close.Get()
}

// GetCloseOk returns a tuple with the Close field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3PoolDayDataDTO) GetCloseOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Close.Get(), o.Close.IsSet()
}

// HasClose returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasClose() bool {
	if o != nil && o.Close.IsSet() {
		return true
	}

	return false
}

// SetClose gets a reference to the given NullableString and assigns it to the Close field.
func (o *UniswapV3PoolDayDataDTO) SetClose(v string) {
	o.Close.Set(&v)
}
// SetCloseNil sets the value for Close to be an explicit nil
func (o *UniswapV3PoolDayDataDTO) SetCloseNil() {
	o.Close.Set(nil)
}

// UnsetClose ensures that no value is present for Close, not even an explicit nil
func (o *UniswapV3PoolDayDataDTO) UnsetClose() {
	o.Close.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV3PoolDayDataDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3PoolDayDataDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV3PoolDayDataDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV3PoolDayDataDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o UniswapV3PoolDayDataDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UniswapV3PoolDayDataDTO) ToMap() (map[string]interface{}, error) {
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
	if !IsNil(o.Date) {
		toSerialize["date"] = o.Date
	}
	if o.Pool.IsSet() {
		toSerialize["pool"] = o.Pool.Get()
	}
	if o.Liquidity.IsSet() {
		toSerialize["liquidity"] = o.Liquidity.Get()
	}
	if o.SqrtPrice.IsSet() {
		toSerialize["sqrt_price"] = o.SqrtPrice.Get()
	}
	if o.Token0Price.IsSet() {
		toSerialize["token_0_price"] = o.Token0Price.Get()
	}
	if o.Token1Price.IsSet() {
		toSerialize["token_1_price"] = o.Token1Price.Get()
	}
	if o.Tick.IsSet() {
		toSerialize["tick"] = o.Tick.Get()
	}
	if o.FeeGrowthGlobal0x128.IsSet() {
		toSerialize["fee_growth_global_0x128"] = o.FeeGrowthGlobal0x128.Get()
	}
	if o.FeeGrowthGlobal1x128.IsSet() {
		toSerialize["fee_growth_global_1x128"] = o.FeeGrowthGlobal1x128.Get()
	}
	if o.TvlUsd.IsSet() {
		toSerialize["tvl_usd"] = o.TvlUsd.Get()
	}
	if o.VolumeToken0.IsSet() {
		toSerialize["volume_token_0"] = o.VolumeToken0.Get()
	}
	if o.VolumeToken1.IsSet() {
		toSerialize["volume_token_1"] = o.VolumeToken1.Get()
	}
	if o.VolumeUsd.IsSet() {
		toSerialize["volume_usd"] = o.VolumeUsd.Get()
	}
	if o.FeesUsd.IsSet() {
		toSerialize["fees_usd"] = o.FeesUsd.Get()
	}
	if o.TxCount.IsSet() {
		toSerialize["tx_count"] = o.TxCount.Get()
	}
	if o.Open.IsSet() {
		toSerialize["open"] = o.Open.Get()
	}
	if o.High.IsSet() {
		toSerialize["high"] = o.High.Get()
	}
	if o.Low.IsSet() {
		toSerialize["low"] = o.Low.Get()
	}
	if o.Close.IsSet() {
		toSerialize["close"] = o.Close.Get()
	}
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableUniswapV3PoolDayDataDTO struct {
	value *UniswapV3PoolDayDataDTO
	isSet bool
}

func (v NullableUniswapV3PoolDayDataDTO) Get() *UniswapV3PoolDayDataDTO {
	return v.value
}

func (v *NullableUniswapV3PoolDayDataDTO) Set(val *UniswapV3PoolDayDataDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV3PoolDayDataDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV3PoolDayDataDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV3PoolDayDataDTO(val *UniswapV3PoolDayDataDTO) *NullableUniswapV3PoolDayDataDTO {
	return &NullableUniswapV3PoolDayDataDTO{value: val, isSet: true}
}

func (v NullableUniswapV3PoolDayDataDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV3PoolDayDataDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


