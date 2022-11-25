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

// UniswapV2TokenDayDataDTO Token data aggregated across all pairs that include token.
type UniswapV2TokenDayDataDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
	Id NullableString `json:"id,omitempty"`
	// Unix timestamp for start of day.
	Date *int32 `json:"date,omitempty"`
	// Reference to token entity.
	Token NullableString `json:"token,omitempty"`
	// Amount of token swapped across all pairs throughout day.
	DailyVolumeToken NullableString `json:"daily_volume_token,omitempty"`
	// Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
	DailyVolumeEth NullableString `json:"daily_volume_eth,omitempty"`
	// Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
	DailyVolumeUsd NullableString `json:"daily_volume_usd,omitempty"`
	// Amount of transactions with this token across all pairs.
	DailyTxns NullableString `json:"daily_txns,omitempty"`
	// Token amount of token deposited across all pairs.
	TotalLiquidityToken NullableString `json:"total_liquidity_token,omitempty"`
	// Token amount of token deposited across all pairs stored as amount of ETH.
	TotalLiquidityEth NullableString `json:"total_liquidity_eth,omitempty"`
	// Token amount of token deposited across all pairs stored as amount of USD.
	TotalLiquidityUsd NullableString `json:"total_liquidity_usd,omitempty"`
	// Price of token in derived USD.
	PriceUsd NullableString `json:"price_usd,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewUniswapV2TokenDayDataDTO instantiates a new UniswapV2TokenDayDataDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV2TokenDayDataDTO() *UniswapV2TokenDayDataDTO {
	this := UniswapV2TokenDayDataDTO{}
	return &this
}

// NewUniswapV2TokenDayDataDTOWithDefaults instantiates a new UniswapV2TokenDayDataDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV2TokenDayDataDTOWithDefaults() *UniswapV2TokenDayDataDTO {
	this := UniswapV2TokenDayDataDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV2TokenDayDataDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDayDataDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV2TokenDayDataDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV2TokenDayDataDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDayDataDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV2TokenDayDataDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV2TokenDayDataDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDayDataDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV2TokenDayDataDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV2TokenDayDataDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetId() {
	o.Id.Unset()
}

// GetDate returns the Date field value if set, zero value otherwise.
func (o *UniswapV2TokenDayDataDTO) GetDate() int32 {
	if o == nil || isNil(o.Date) {
		var ret int32
		return ret
	}
	return *o.Date
}

// GetDateOk returns a tuple with the Date field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDayDataDTO) GetDateOk() (*int32, bool) {
	if o == nil || isNil(o.Date) {
    return nil, false
	}
	return o.Date, true
}

// HasDate returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasDate() bool {
	if o != nil && !isNil(o.Date) {
		return true
	}

	return false
}

// SetDate gets a reference to the given int32 and assigns it to the Date field.
func (o *UniswapV2TokenDayDataDTO) SetDate(v int32) {
	o.Date = &v
}

// GetToken returns the Token field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetToken() string {
	if o == nil || isNil(o.Token.Get()) {
		var ret string
		return ret
	}
	return *o.Token.Get()
}

// GetTokenOk returns a tuple with the Token field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetTokenOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Token.Get(), o.Token.IsSet()
}

// HasToken returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasToken() bool {
	if o != nil && o.Token.IsSet() {
		return true
	}

	return false
}

// SetToken gets a reference to the given NullableString and assigns it to the Token field.
func (o *UniswapV2TokenDayDataDTO) SetToken(v string) {
	o.Token.Set(&v)
}
// SetTokenNil sets the value for Token to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetTokenNil() {
	o.Token.Set(nil)
}

// UnsetToken ensures that no value is present for Token, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetToken() {
	o.Token.Unset()
}

// GetDailyVolumeToken returns the DailyVolumeToken field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetDailyVolumeToken() string {
	if o == nil || isNil(o.DailyVolumeToken.Get()) {
		var ret string
		return ret
	}
	return *o.DailyVolumeToken.Get()
}

// GetDailyVolumeTokenOk returns a tuple with the DailyVolumeToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetDailyVolumeTokenOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.DailyVolumeToken.Get(), o.DailyVolumeToken.IsSet()
}

// HasDailyVolumeToken returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasDailyVolumeToken() bool {
	if o != nil && o.DailyVolumeToken.IsSet() {
		return true
	}

	return false
}

// SetDailyVolumeToken gets a reference to the given NullableString and assigns it to the DailyVolumeToken field.
func (o *UniswapV2TokenDayDataDTO) SetDailyVolumeToken(v string) {
	o.DailyVolumeToken.Set(&v)
}
// SetDailyVolumeTokenNil sets the value for DailyVolumeToken to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetDailyVolumeTokenNil() {
	o.DailyVolumeToken.Set(nil)
}

// UnsetDailyVolumeToken ensures that no value is present for DailyVolumeToken, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetDailyVolumeToken() {
	o.DailyVolumeToken.Unset()
}

// GetDailyVolumeEth returns the DailyVolumeEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetDailyVolumeEth() string {
	if o == nil || isNil(o.DailyVolumeEth.Get()) {
		var ret string
		return ret
	}
	return *o.DailyVolumeEth.Get()
}

// GetDailyVolumeEthOk returns a tuple with the DailyVolumeEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetDailyVolumeEthOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.DailyVolumeEth.Get(), o.DailyVolumeEth.IsSet()
}

// HasDailyVolumeEth returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasDailyVolumeEth() bool {
	if o != nil && o.DailyVolumeEth.IsSet() {
		return true
	}

	return false
}

// SetDailyVolumeEth gets a reference to the given NullableString and assigns it to the DailyVolumeEth field.
func (o *UniswapV2TokenDayDataDTO) SetDailyVolumeEth(v string) {
	o.DailyVolumeEth.Set(&v)
}
// SetDailyVolumeEthNil sets the value for DailyVolumeEth to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetDailyVolumeEthNil() {
	o.DailyVolumeEth.Set(nil)
}

// UnsetDailyVolumeEth ensures that no value is present for DailyVolumeEth, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetDailyVolumeEth() {
	o.DailyVolumeEth.Unset()
}

// GetDailyVolumeUsd returns the DailyVolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetDailyVolumeUsd() string {
	if o == nil || isNil(o.DailyVolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.DailyVolumeUsd.Get()
}

// GetDailyVolumeUsdOk returns a tuple with the DailyVolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetDailyVolumeUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.DailyVolumeUsd.Get(), o.DailyVolumeUsd.IsSet()
}

// HasDailyVolumeUsd returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasDailyVolumeUsd() bool {
	if o != nil && o.DailyVolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetDailyVolumeUsd gets a reference to the given NullableString and assigns it to the DailyVolumeUsd field.
func (o *UniswapV2TokenDayDataDTO) SetDailyVolumeUsd(v string) {
	o.DailyVolumeUsd.Set(&v)
}
// SetDailyVolumeUsdNil sets the value for DailyVolumeUsd to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetDailyVolumeUsdNil() {
	o.DailyVolumeUsd.Set(nil)
}

// UnsetDailyVolumeUsd ensures that no value is present for DailyVolumeUsd, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetDailyVolumeUsd() {
	o.DailyVolumeUsd.Unset()
}

// GetDailyTxns returns the DailyTxns field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetDailyTxns() string {
	if o == nil || isNil(o.DailyTxns.Get()) {
		var ret string
		return ret
	}
	return *o.DailyTxns.Get()
}

// GetDailyTxnsOk returns a tuple with the DailyTxns field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetDailyTxnsOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.DailyTxns.Get(), o.DailyTxns.IsSet()
}

// HasDailyTxns returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasDailyTxns() bool {
	if o != nil && o.DailyTxns.IsSet() {
		return true
	}

	return false
}

// SetDailyTxns gets a reference to the given NullableString and assigns it to the DailyTxns field.
func (o *UniswapV2TokenDayDataDTO) SetDailyTxns(v string) {
	o.DailyTxns.Set(&v)
}
// SetDailyTxnsNil sets the value for DailyTxns to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetDailyTxnsNil() {
	o.DailyTxns.Set(nil)
}

// UnsetDailyTxns ensures that no value is present for DailyTxns, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetDailyTxns() {
	o.DailyTxns.Unset()
}

// GetTotalLiquidityToken returns the TotalLiquidityToken field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetTotalLiquidityToken() string {
	if o == nil || isNil(o.TotalLiquidityToken.Get()) {
		var ret string
		return ret
	}
	return *o.TotalLiquidityToken.Get()
}

// GetTotalLiquidityTokenOk returns a tuple with the TotalLiquidityToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetTotalLiquidityTokenOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TotalLiquidityToken.Get(), o.TotalLiquidityToken.IsSet()
}

// HasTotalLiquidityToken returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasTotalLiquidityToken() bool {
	if o != nil && o.TotalLiquidityToken.IsSet() {
		return true
	}

	return false
}

// SetTotalLiquidityToken gets a reference to the given NullableString and assigns it to the TotalLiquidityToken field.
func (o *UniswapV2TokenDayDataDTO) SetTotalLiquidityToken(v string) {
	o.TotalLiquidityToken.Set(&v)
}
// SetTotalLiquidityTokenNil sets the value for TotalLiquidityToken to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetTotalLiquidityTokenNil() {
	o.TotalLiquidityToken.Set(nil)
}

// UnsetTotalLiquidityToken ensures that no value is present for TotalLiquidityToken, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetTotalLiquidityToken() {
	o.TotalLiquidityToken.Unset()
}

// GetTotalLiquidityEth returns the TotalLiquidityEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetTotalLiquidityEth() string {
	if o == nil || isNil(o.TotalLiquidityEth.Get()) {
		var ret string
		return ret
	}
	return *o.TotalLiquidityEth.Get()
}

// GetTotalLiquidityEthOk returns a tuple with the TotalLiquidityEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetTotalLiquidityEthOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TotalLiquidityEth.Get(), o.TotalLiquidityEth.IsSet()
}

// HasTotalLiquidityEth returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasTotalLiquidityEth() bool {
	if o != nil && o.TotalLiquidityEth.IsSet() {
		return true
	}

	return false
}

// SetTotalLiquidityEth gets a reference to the given NullableString and assigns it to the TotalLiquidityEth field.
func (o *UniswapV2TokenDayDataDTO) SetTotalLiquidityEth(v string) {
	o.TotalLiquidityEth.Set(&v)
}
// SetTotalLiquidityEthNil sets the value for TotalLiquidityEth to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetTotalLiquidityEthNil() {
	o.TotalLiquidityEth.Set(nil)
}

// UnsetTotalLiquidityEth ensures that no value is present for TotalLiquidityEth, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetTotalLiquidityEth() {
	o.TotalLiquidityEth.Unset()
}

// GetTotalLiquidityUsd returns the TotalLiquidityUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetTotalLiquidityUsd() string {
	if o == nil || isNil(o.TotalLiquidityUsd.Get()) {
		var ret string
		return ret
	}
	return *o.TotalLiquidityUsd.Get()
}

// GetTotalLiquidityUsdOk returns a tuple with the TotalLiquidityUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetTotalLiquidityUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.TotalLiquidityUsd.Get(), o.TotalLiquidityUsd.IsSet()
}

// HasTotalLiquidityUsd returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasTotalLiquidityUsd() bool {
	if o != nil && o.TotalLiquidityUsd.IsSet() {
		return true
	}

	return false
}

// SetTotalLiquidityUsd gets a reference to the given NullableString and assigns it to the TotalLiquidityUsd field.
func (o *UniswapV2TokenDayDataDTO) SetTotalLiquidityUsd(v string) {
	o.TotalLiquidityUsd.Set(&v)
}
// SetTotalLiquidityUsdNil sets the value for TotalLiquidityUsd to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetTotalLiquidityUsdNil() {
	o.TotalLiquidityUsd.Set(nil)
}

// UnsetTotalLiquidityUsd ensures that no value is present for TotalLiquidityUsd, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetTotalLiquidityUsd() {
	o.TotalLiquidityUsd.Unset()
}

// GetPriceUsd returns the PriceUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV2TokenDayDataDTO) GetPriceUsd() string {
	if o == nil || isNil(o.PriceUsd.Get()) {
		var ret string
		return ret
	}
	return *o.PriceUsd.Get()
}

// GetPriceUsdOk returns a tuple with the PriceUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV2TokenDayDataDTO) GetPriceUsdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.PriceUsd.Get(), o.PriceUsd.IsSet()
}

// HasPriceUsd returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasPriceUsd() bool {
	if o != nil && o.PriceUsd.IsSet() {
		return true
	}

	return false
}

// SetPriceUsd gets a reference to the given NullableString and assigns it to the PriceUsd field.
func (o *UniswapV2TokenDayDataDTO) SetPriceUsd(v string) {
	o.PriceUsd.Set(&v)
}
// SetPriceUsdNil sets the value for PriceUsd to be an explicit nil
func (o *UniswapV2TokenDayDataDTO) SetPriceUsdNil() {
	o.PriceUsd.Set(nil)
}

// UnsetPriceUsd ensures that no value is present for PriceUsd, not even an explicit nil
func (o *UniswapV2TokenDayDataDTO) UnsetPriceUsd() {
	o.PriceUsd.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV2TokenDayDataDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV2TokenDayDataDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV2TokenDayDataDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV2TokenDayDataDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o UniswapV2TokenDayDataDTO) MarshalJSON() ([]byte, error) {
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
	if !isNil(o.Date) {
		toSerialize["date"] = o.Date
	}
	if o.Token.IsSet() {
		toSerialize["token"] = o.Token.Get()
	}
	if o.DailyVolumeToken.IsSet() {
		toSerialize["daily_volume_token"] = o.DailyVolumeToken.Get()
	}
	if o.DailyVolumeEth.IsSet() {
		toSerialize["daily_volume_eth"] = o.DailyVolumeEth.Get()
	}
	if o.DailyVolumeUsd.IsSet() {
		toSerialize["daily_volume_usd"] = o.DailyVolumeUsd.Get()
	}
	if o.DailyTxns.IsSet() {
		toSerialize["daily_txns"] = o.DailyTxns.Get()
	}
	if o.TotalLiquidityToken.IsSet() {
		toSerialize["total_liquidity_token"] = o.TotalLiquidityToken.Get()
	}
	if o.TotalLiquidityEth.IsSet() {
		toSerialize["total_liquidity_eth"] = o.TotalLiquidityEth.Get()
	}
	if o.TotalLiquidityUsd.IsSet() {
		toSerialize["total_liquidity_usd"] = o.TotalLiquidityUsd.Get()
	}
	if o.PriceUsd.IsSet() {
		toSerialize["price_usd"] = o.PriceUsd.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableUniswapV2TokenDayDataDTO struct {
	value *UniswapV2TokenDayDataDTO
	isSet bool
}

func (v NullableUniswapV2TokenDayDataDTO) Get() *UniswapV2TokenDayDataDTO {
	return v.value
}

func (v *NullableUniswapV2TokenDayDataDTO) Set(val *UniswapV2TokenDayDataDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV2TokenDayDataDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV2TokenDayDataDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV2TokenDayDataDTO(val *UniswapV2TokenDayDataDTO) *NullableUniswapV2TokenDayDataDTO {
	return &NullableUniswapV2TokenDayDataDTO{value: val, isSet: true}
}

func (v NullableUniswapV2TokenDayDataDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV2TokenDayDataDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


