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

// PoolHourDataV3DTO struct for PoolHourDataV3DTO
type PoolHourDataV3DTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// 
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	PeriodStartUnix *int32 `json:"period_start_unix,omitempty"`
	// 
	Pool NullableString `json:"pool,omitempty"`
	// 
	Liquidity NullableString `json:"liquidity,omitempty"`
	// 
	SqrtPrice NullableString `json:"sqrt_price,omitempty"`
	// 
	Token0Price NullableString `json:"token_0_price,omitempty"`
	// 
	Token1Price NullableString `json:"token_1_price,omitempty"`
	// 
	Tick NullableString `json:"tick,omitempty"`
	// 
	FeeGrowthGlobal0x128 NullableString `json:"fee_growth_global_0x128,omitempty"`
	// 
	FeeGrowthGlobal1x128 NullableString `json:"fee_growth_global_1x128,omitempty"`
	// 
	TvlUsd NullableString `json:"tvl_usd,omitempty"`
	// 
	VolumeToken0 NullableString `json:"volume_token_0,omitempty"`
	// 
	VolumeToken1 NullableString `json:"volume_token_1,omitempty"`
	// 
	VolumeUsd NullableString `json:"volume_usd,omitempty"`
	// 
	FeesUsd NullableString `json:"fees_usd,omitempty"`
	// 
	TxCount NullableString `json:"tx_count,omitempty"`
	// 
	Open NullableString `json:"open,omitempty"`
	// 
	High NullableString `json:"high,omitempty"`
	// 
	Low NullableString `json:"low,omitempty"`
	// 
	Close NullableString `json:"close,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewPoolHourDataV3DTO instantiates a new PoolHourDataV3DTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPoolHourDataV3DTO() *PoolHourDataV3DTO {
	this := PoolHourDataV3DTO{}
	return &this
}

// NewPoolHourDataV3DTOWithDefaults instantiates a new PoolHourDataV3DTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPoolHourDataV3DTOWithDefaults() *PoolHourDataV3DTO {
	this := PoolHourDataV3DTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *PoolHourDataV3DTO) GetEntryTime() time.Time {
	if o == nil || o.EntryTime == nil {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PoolHourDataV3DTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || o.EntryTime == nil {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasEntryTime() bool {
	if o != nil && o.EntryTime != nil {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *PoolHourDataV3DTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *PoolHourDataV3DTO) GetRecvTime() time.Time {
	if o == nil || o.RecvTime == nil {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PoolHourDataV3DTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || o.RecvTime == nil {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasRecvTime() bool {
	if o != nil && o.RecvTime != nil {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *PoolHourDataV3DTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *PoolHourDataV3DTO) GetBlockNumber() int64 {
	if o == nil || o.BlockNumber == nil {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PoolHourDataV3DTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || o.BlockNumber == nil {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasBlockNumber() bool {
	if o != nil && o.BlockNumber != nil {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *PoolHourDataV3DTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetId() string {
	if o == nil || o.Id.Get() == nil {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *PoolHourDataV3DTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *PoolHourDataV3DTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetId() {
	o.Id.Unset()
}

// GetPeriodStartUnix returns the PeriodStartUnix field value if set, zero value otherwise.
func (o *PoolHourDataV3DTO) GetPeriodStartUnix() int32 {
	if o == nil || o.PeriodStartUnix == nil {
		var ret int32
		return ret
	}
	return *o.PeriodStartUnix
}

// GetPeriodStartUnixOk returns a tuple with the PeriodStartUnix field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PoolHourDataV3DTO) GetPeriodStartUnixOk() (*int32, bool) {
	if o == nil || o.PeriodStartUnix == nil {
		return nil, false
	}
	return o.PeriodStartUnix, true
}

// HasPeriodStartUnix returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasPeriodStartUnix() bool {
	if o != nil && o.PeriodStartUnix != nil {
		return true
	}

	return false
}

// SetPeriodStartUnix gets a reference to the given int32 and assigns it to the PeriodStartUnix field.
func (o *PoolHourDataV3DTO) SetPeriodStartUnix(v int32) {
	o.PeriodStartUnix = &v
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetPool() string {
	if o == nil || o.Pool.Get() == nil {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetPoolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *PoolHourDataV3DTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *PoolHourDataV3DTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetPool() {
	o.Pool.Unset()
}

// GetLiquidity returns the Liquidity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetLiquidity() string {
	if o == nil || o.Liquidity.Get() == nil {
		var ret string
		return ret
	}
	return *o.Liquidity.Get()
}

// GetLiquidityOk returns a tuple with the Liquidity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetLiquidityOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Liquidity.Get(), o.Liquidity.IsSet()
}

// HasLiquidity returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasLiquidity() bool {
	if o != nil && o.Liquidity.IsSet() {
		return true
	}

	return false
}

// SetLiquidity gets a reference to the given NullableString and assigns it to the Liquidity field.
func (o *PoolHourDataV3DTO) SetLiquidity(v string) {
	o.Liquidity.Set(&v)
}
// SetLiquidityNil sets the value for Liquidity to be an explicit nil
func (o *PoolHourDataV3DTO) SetLiquidityNil() {
	o.Liquidity.Set(nil)
}

// UnsetLiquidity ensures that no value is present for Liquidity, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetLiquidity() {
	o.Liquidity.Unset()
}

// GetSqrtPrice returns the SqrtPrice field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetSqrtPrice() string {
	if o == nil || o.SqrtPrice.Get() == nil {
		var ret string
		return ret
	}
	return *o.SqrtPrice.Get()
}

// GetSqrtPriceOk returns a tuple with the SqrtPrice field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetSqrtPriceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.SqrtPrice.Get(), o.SqrtPrice.IsSet()
}

// HasSqrtPrice returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasSqrtPrice() bool {
	if o != nil && o.SqrtPrice.IsSet() {
		return true
	}

	return false
}

// SetSqrtPrice gets a reference to the given NullableString and assigns it to the SqrtPrice field.
func (o *PoolHourDataV3DTO) SetSqrtPrice(v string) {
	o.SqrtPrice.Set(&v)
}
// SetSqrtPriceNil sets the value for SqrtPrice to be an explicit nil
func (o *PoolHourDataV3DTO) SetSqrtPriceNil() {
	o.SqrtPrice.Set(nil)
}

// UnsetSqrtPrice ensures that no value is present for SqrtPrice, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetSqrtPrice() {
	o.SqrtPrice.Unset()
}

// GetToken0Price returns the Token0Price field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetToken0Price() string {
	if o == nil || o.Token0Price.Get() == nil {
		var ret string
		return ret
	}
	return *o.Token0Price.Get()
}

// GetToken0PriceOk returns a tuple with the Token0Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetToken0PriceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Token0Price.Get(), o.Token0Price.IsSet()
}

// HasToken0Price returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasToken0Price() bool {
	if o != nil && o.Token0Price.IsSet() {
		return true
	}

	return false
}

// SetToken0Price gets a reference to the given NullableString and assigns it to the Token0Price field.
func (o *PoolHourDataV3DTO) SetToken0Price(v string) {
	o.Token0Price.Set(&v)
}
// SetToken0PriceNil sets the value for Token0Price to be an explicit nil
func (o *PoolHourDataV3DTO) SetToken0PriceNil() {
	o.Token0Price.Set(nil)
}

// UnsetToken0Price ensures that no value is present for Token0Price, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetToken0Price() {
	o.Token0Price.Unset()
}

// GetToken1Price returns the Token1Price field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetToken1Price() string {
	if o == nil || o.Token1Price.Get() == nil {
		var ret string
		return ret
	}
	return *o.Token1Price.Get()
}

// GetToken1PriceOk returns a tuple with the Token1Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetToken1PriceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Token1Price.Get(), o.Token1Price.IsSet()
}

// HasToken1Price returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasToken1Price() bool {
	if o != nil && o.Token1Price.IsSet() {
		return true
	}

	return false
}

// SetToken1Price gets a reference to the given NullableString and assigns it to the Token1Price field.
func (o *PoolHourDataV3DTO) SetToken1Price(v string) {
	o.Token1Price.Set(&v)
}
// SetToken1PriceNil sets the value for Token1Price to be an explicit nil
func (o *PoolHourDataV3DTO) SetToken1PriceNil() {
	o.Token1Price.Set(nil)
}

// UnsetToken1Price ensures that no value is present for Token1Price, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetToken1Price() {
	o.Token1Price.Unset()
}

// GetTick returns the Tick field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetTick() string {
	if o == nil || o.Tick.Get() == nil {
		var ret string
		return ret
	}
	return *o.Tick.Get()
}

// GetTickOk returns a tuple with the Tick field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetTickOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Tick.Get(), o.Tick.IsSet()
}

// HasTick returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasTick() bool {
	if o != nil && o.Tick.IsSet() {
		return true
	}

	return false
}

// SetTick gets a reference to the given NullableString and assigns it to the Tick field.
func (o *PoolHourDataV3DTO) SetTick(v string) {
	o.Tick.Set(&v)
}
// SetTickNil sets the value for Tick to be an explicit nil
func (o *PoolHourDataV3DTO) SetTickNil() {
	o.Tick.Set(nil)
}

// UnsetTick ensures that no value is present for Tick, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetTick() {
	o.Tick.Unset()
}

// GetFeeGrowthGlobal0x128 returns the FeeGrowthGlobal0x128 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetFeeGrowthGlobal0x128() string {
	if o == nil || o.FeeGrowthGlobal0x128.Get() == nil {
		var ret string
		return ret
	}
	return *o.FeeGrowthGlobal0x128.Get()
}

// GetFeeGrowthGlobal0x128Ok returns a tuple with the FeeGrowthGlobal0x128 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetFeeGrowthGlobal0x128Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeeGrowthGlobal0x128.Get(), o.FeeGrowthGlobal0x128.IsSet()
}

// HasFeeGrowthGlobal0x128 returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasFeeGrowthGlobal0x128() bool {
	if o != nil && o.FeeGrowthGlobal0x128.IsSet() {
		return true
	}

	return false
}

// SetFeeGrowthGlobal0x128 gets a reference to the given NullableString and assigns it to the FeeGrowthGlobal0x128 field.
func (o *PoolHourDataV3DTO) SetFeeGrowthGlobal0x128(v string) {
	o.FeeGrowthGlobal0x128.Set(&v)
}
// SetFeeGrowthGlobal0x128Nil sets the value for FeeGrowthGlobal0x128 to be an explicit nil
func (o *PoolHourDataV3DTO) SetFeeGrowthGlobal0x128Nil() {
	o.FeeGrowthGlobal0x128.Set(nil)
}

// UnsetFeeGrowthGlobal0x128 ensures that no value is present for FeeGrowthGlobal0x128, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetFeeGrowthGlobal0x128() {
	o.FeeGrowthGlobal0x128.Unset()
}

// GetFeeGrowthGlobal1x128 returns the FeeGrowthGlobal1x128 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetFeeGrowthGlobal1x128() string {
	if o == nil || o.FeeGrowthGlobal1x128.Get() == nil {
		var ret string
		return ret
	}
	return *o.FeeGrowthGlobal1x128.Get()
}

// GetFeeGrowthGlobal1x128Ok returns a tuple with the FeeGrowthGlobal1x128 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetFeeGrowthGlobal1x128Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeeGrowthGlobal1x128.Get(), o.FeeGrowthGlobal1x128.IsSet()
}

// HasFeeGrowthGlobal1x128 returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasFeeGrowthGlobal1x128() bool {
	if o != nil && o.FeeGrowthGlobal1x128.IsSet() {
		return true
	}

	return false
}

// SetFeeGrowthGlobal1x128 gets a reference to the given NullableString and assigns it to the FeeGrowthGlobal1x128 field.
func (o *PoolHourDataV3DTO) SetFeeGrowthGlobal1x128(v string) {
	o.FeeGrowthGlobal1x128.Set(&v)
}
// SetFeeGrowthGlobal1x128Nil sets the value for FeeGrowthGlobal1x128 to be an explicit nil
func (o *PoolHourDataV3DTO) SetFeeGrowthGlobal1x128Nil() {
	o.FeeGrowthGlobal1x128.Set(nil)
}

// UnsetFeeGrowthGlobal1x128 ensures that no value is present for FeeGrowthGlobal1x128, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetFeeGrowthGlobal1x128() {
	o.FeeGrowthGlobal1x128.Unset()
}

// GetTvlUsd returns the TvlUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetTvlUsd() string {
	if o == nil || o.TvlUsd.Get() == nil {
		var ret string
		return ret
	}
	return *o.TvlUsd.Get()
}

// GetTvlUsdOk returns a tuple with the TvlUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetTvlUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TvlUsd.Get(), o.TvlUsd.IsSet()
}

// HasTvlUsd returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasTvlUsd() bool {
	if o != nil && o.TvlUsd.IsSet() {
		return true
	}

	return false
}

// SetTvlUsd gets a reference to the given NullableString and assigns it to the TvlUsd field.
func (o *PoolHourDataV3DTO) SetTvlUsd(v string) {
	o.TvlUsd.Set(&v)
}
// SetTvlUsdNil sets the value for TvlUsd to be an explicit nil
func (o *PoolHourDataV3DTO) SetTvlUsdNil() {
	o.TvlUsd.Set(nil)
}

// UnsetTvlUsd ensures that no value is present for TvlUsd, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetTvlUsd() {
	o.TvlUsd.Unset()
}

// GetVolumeToken0 returns the VolumeToken0 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetVolumeToken0() string {
	if o == nil || o.VolumeToken0.Get() == nil {
		var ret string
		return ret
	}
	return *o.VolumeToken0.Get()
}

// GetVolumeToken0Ok returns a tuple with the VolumeToken0 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetVolumeToken0Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeToken0.Get(), o.VolumeToken0.IsSet()
}

// HasVolumeToken0 returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasVolumeToken0() bool {
	if o != nil && o.VolumeToken0.IsSet() {
		return true
	}

	return false
}

// SetVolumeToken0 gets a reference to the given NullableString and assigns it to the VolumeToken0 field.
func (o *PoolHourDataV3DTO) SetVolumeToken0(v string) {
	o.VolumeToken0.Set(&v)
}
// SetVolumeToken0Nil sets the value for VolumeToken0 to be an explicit nil
func (o *PoolHourDataV3DTO) SetVolumeToken0Nil() {
	o.VolumeToken0.Set(nil)
}

// UnsetVolumeToken0 ensures that no value is present for VolumeToken0, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetVolumeToken0() {
	o.VolumeToken0.Unset()
}

// GetVolumeToken1 returns the VolumeToken1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetVolumeToken1() string {
	if o == nil || o.VolumeToken1.Get() == nil {
		var ret string
		return ret
	}
	return *o.VolumeToken1.Get()
}

// GetVolumeToken1Ok returns a tuple with the VolumeToken1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetVolumeToken1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeToken1.Get(), o.VolumeToken1.IsSet()
}

// HasVolumeToken1 returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasVolumeToken1() bool {
	if o != nil && o.VolumeToken1.IsSet() {
		return true
	}

	return false
}

// SetVolumeToken1 gets a reference to the given NullableString and assigns it to the VolumeToken1 field.
func (o *PoolHourDataV3DTO) SetVolumeToken1(v string) {
	o.VolumeToken1.Set(&v)
}
// SetVolumeToken1Nil sets the value for VolumeToken1 to be an explicit nil
func (o *PoolHourDataV3DTO) SetVolumeToken1Nil() {
	o.VolumeToken1.Set(nil)
}

// UnsetVolumeToken1 ensures that no value is present for VolumeToken1, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetVolumeToken1() {
	o.VolumeToken1.Unset()
}

// GetVolumeUsd returns the VolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetVolumeUsd() string {
	if o == nil || o.VolumeUsd.Get() == nil {
		var ret string
		return ret
	}
	return *o.VolumeUsd.Get()
}

// GetVolumeUsdOk returns a tuple with the VolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetVolumeUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeUsd.Get(), o.VolumeUsd.IsSet()
}

// HasVolumeUsd returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasVolumeUsd() bool {
	if o != nil && o.VolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetVolumeUsd gets a reference to the given NullableString and assigns it to the VolumeUsd field.
func (o *PoolHourDataV3DTO) SetVolumeUsd(v string) {
	o.VolumeUsd.Set(&v)
}
// SetVolumeUsdNil sets the value for VolumeUsd to be an explicit nil
func (o *PoolHourDataV3DTO) SetVolumeUsdNil() {
	o.VolumeUsd.Set(nil)
}

// UnsetVolumeUsd ensures that no value is present for VolumeUsd, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetVolumeUsd() {
	o.VolumeUsd.Unset()
}

// GetFeesUsd returns the FeesUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetFeesUsd() string {
	if o == nil || o.FeesUsd.Get() == nil {
		var ret string
		return ret
	}
	return *o.FeesUsd.Get()
}

// GetFeesUsdOk returns a tuple with the FeesUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetFeesUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeesUsd.Get(), o.FeesUsd.IsSet()
}

// HasFeesUsd returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasFeesUsd() bool {
	if o != nil && o.FeesUsd.IsSet() {
		return true
	}

	return false
}

// SetFeesUsd gets a reference to the given NullableString and assigns it to the FeesUsd field.
func (o *PoolHourDataV3DTO) SetFeesUsd(v string) {
	o.FeesUsd.Set(&v)
}
// SetFeesUsdNil sets the value for FeesUsd to be an explicit nil
func (o *PoolHourDataV3DTO) SetFeesUsdNil() {
	o.FeesUsd.Set(nil)
}

// UnsetFeesUsd ensures that no value is present for FeesUsd, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetFeesUsd() {
	o.FeesUsd.Unset()
}

// GetTxCount returns the TxCount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetTxCount() string {
	if o == nil || o.TxCount.Get() == nil {
		var ret string
		return ret
	}
	return *o.TxCount.Get()
}

// GetTxCountOk returns a tuple with the TxCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetTxCountOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TxCount.Get(), o.TxCount.IsSet()
}

// HasTxCount returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasTxCount() bool {
	if o != nil && o.TxCount.IsSet() {
		return true
	}

	return false
}

// SetTxCount gets a reference to the given NullableString and assigns it to the TxCount field.
func (o *PoolHourDataV3DTO) SetTxCount(v string) {
	o.TxCount.Set(&v)
}
// SetTxCountNil sets the value for TxCount to be an explicit nil
func (o *PoolHourDataV3DTO) SetTxCountNil() {
	o.TxCount.Set(nil)
}

// UnsetTxCount ensures that no value is present for TxCount, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetTxCount() {
	o.TxCount.Unset()
}

// GetOpen returns the Open field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetOpen() string {
	if o == nil || o.Open.Get() == nil {
		var ret string
		return ret
	}
	return *o.Open.Get()
}

// GetOpenOk returns a tuple with the Open field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetOpenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Open.Get(), o.Open.IsSet()
}

// HasOpen returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasOpen() bool {
	if o != nil && o.Open.IsSet() {
		return true
	}

	return false
}

// SetOpen gets a reference to the given NullableString and assigns it to the Open field.
func (o *PoolHourDataV3DTO) SetOpen(v string) {
	o.Open.Set(&v)
}
// SetOpenNil sets the value for Open to be an explicit nil
func (o *PoolHourDataV3DTO) SetOpenNil() {
	o.Open.Set(nil)
}

// UnsetOpen ensures that no value is present for Open, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetOpen() {
	o.Open.Unset()
}

// GetHigh returns the High field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetHigh() string {
	if o == nil || o.High.Get() == nil {
		var ret string
		return ret
	}
	return *o.High.Get()
}

// GetHighOk returns a tuple with the High field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetHighOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.High.Get(), o.High.IsSet()
}

// HasHigh returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasHigh() bool {
	if o != nil && o.High.IsSet() {
		return true
	}

	return false
}

// SetHigh gets a reference to the given NullableString and assigns it to the High field.
func (o *PoolHourDataV3DTO) SetHigh(v string) {
	o.High.Set(&v)
}
// SetHighNil sets the value for High to be an explicit nil
func (o *PoolHourDataV3DTO) SetHighNil() {
	o.High.Set(nil)
}

// UnsetHigh ensures that no value is present for High, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetHigh() {
	o.High.Unset()
}

// GetLow returns the Low field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetLow() string {
	if o == nil || o.Low.Get() == nil {
		var ret string
		return ret
	}
	return *o.Low.Get()
}

// GetLowOk returns a tuple with the Low field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetLowOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Low.Get(), o.Low.IsSet()
}

// HasLow returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasLow() bool {
	if o != nil && o.Low.IsSet() {
		return true
	}

	return false
}

// SetLow gets a reference to the given NullableString and assigns it to the Low field.
func (o *PoolHourDataV3DTO) SetLow(v string) {
	o.Low.Set(&v)
}
// SetLowNil sets the value for Low to be an explicit nil
func (o *PoolHourDataV3DTO) SetLowNil() {
	o.Low.Set(nil)
}

// UnsetLow ensures that no value is present for Low, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetLow() {
	o.Low.Unset()
}

// GetClose returns the Close field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *PoolHourDataV3DTO) GetClose() string {
	if o == nil || o.Close.Get() == nil {
		var ret string
		return ret
	}
	return *o.Close.Get()
}

// GetCloseOk returns a tuple with the Close field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *PoolHourDataV3DTO) GetCloseOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Close.Get(), o.Close.IsSet()
}

// HasClose returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasClose() bool {
	if o != nil && o.Close.IsSet() {
		return true
	}

	return false
}

// SetClose gets a reference to the given NullableString and assigns it to the Close field.
func (o *PoolHourDataV3DTO) SetClose(v string) {
	o.Close.Set(&v)
}
// SetCloseNil sets the value for Close to be an explicit nil
func (o *PoolHourDataV3DTO) SetCloseNil() {
	o.Close.Set(nil)
}

// UnsetClose ensures that no value is present for Close, not even an explicit nil
func (o *PoolHourDataV3DTO) UnsetClose() {
	o.Close.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *PoolHourDataV3DTO) GetVid() int64 {
	if o == nil || o.Vid == nil {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PoolHourDataV3DTO) GetVidOk() (*int64, bool) {
	if o == nil || o.Vid == nil {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *PoolHourDataV3DTO) HasVid() bool {
	if o != nil && o.Vid != nil {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *PoolHourDataV3DTO) SetVid(v int64) {
	o.Vid = &v
}

func (o PoolHourDataV3DTO) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.EntryTime != nil {
		toSerialize["entry_time"] = o.EntryTime
	}
	if o.RecvTime != nil {
		toSerialize["recv_time"] = o.RecvTime
	}
	if o.BlockNumber != nil {
		toSerialize["block_number"] = o.BlockNumber
	}
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if o.PeriodStartUnix != nil {
		toSerialize["period_start_unix"] = o.PeriodStartUnix
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
	if o.Vid != nil {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullablePoolHourDataV3DTO struct {
	value *PoolHourDataV3DTO
	isSet bool
}

func (v NullablePoolHourDataV3DTO) Get() *PoolHourDataV3DTO {
	return v.value
}

func (v *NullablePoolHourDataV3DTO) Set(val *PoolHourDataV3DTO) {
	v.value = val
	v.isSet = true
}

func (v NullablePoolHourDataV3DTO) IsSet() bool {
	return v.isSet
}

func (v *NullablePoolHourDataV3DTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePoolHourDataV3DTO(val *PoolHourDataV3DTO) *NullablePoolHourDataV3DTO {
	return &NullablePoolHourDataV3DTO{value: val, isSet: true}
}

func (v NullablePoolHourDataV3DTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePoolHourDataV3DTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


