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

// checks if the UniswapV3TokenV3DayDataDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UniswapV3TokenV3DayDataDTO{}

// UniswapV3TokenV3DayDataDTO Token data aggregated across all pairs that include token.
type UniswapV3TokenV3DayDataDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	// Token address concatendated with date.
	Id NullableString `json:"id,omitempty"`
	// Timestamp rounded to current day by dividing by 86400.
	Date *int32 `json:"date,omitempty"`
	// Pointer to token.
	Token NullableString `json:"token,omitempty"`
	// Volume in token units.
	Volume NullableString `json:"volume,omitempty"`
	// Volume in derived USD.
	VolumeUsd NullableString `json:"volume_usd,omitempty"`
	// Volume in USD even on pools with less reliable USD values.
	UntrackedVolumeUsd NullableString `json:"untracked_volume_usd,omitempty"`
	// Liquidity across all pools in token units.
	TotalValueLocked NullableString `json:"total_value_locked,omitempty"`
	// Liquidity across all pools in derived USD.
	TotalValueLockedUsd NullableString `json:"total_value_locked_usd,omitempty"`
	// Price at end of period in USD.
	PriceUsd NullableString `json:"price_usd,omitempty"`
	// Fees in USD.
	FeesUsd NullableString `json:"fees_usd,omitempty"`
	// Opening price USD.
	Open NullableString `json:"open,omitempty"`
	// High price USD.
	High NullableString `json:"high,omitempty"`
	// Low price USD.
	Low NullableString `json:"low,omitempty"`
	// Close price USD.
	Close NullableString `json:"close,omitempty"`
}

// NewUniswapV3TokenV3DayDataDTO instantiates a new UniswapV3TokenV3DayDataDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniswapV3TokenV3DayDataDTO() *UniswapV3TokenV3DayDataDTO {
	this := UniswapV3TokenV3DayDataDTO{}
	return &this
}

// NewUniswapV3TokenV3DayDataDTOWithDefaults instantiates a new UniswapV3TokenV3DayDataDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniswapV3TokenV3DayDataDTOWithDefaults() *UniswapV3TokenV3DayDataDTO {
	this := UniswapV3TokenV3DayDataDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *UniswapV3TokenV3DayDataDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3TokenV3DayDataDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *UniswapV3TokenV3DayDataDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *UniswapV3TokenV3DayDataDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3TokenV3DayDataDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *UniswapV3TokenV3DayDataDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *UniswapV3TokenV3DayDataDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3TokenV3DayDataDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *UniswapV3TokenV3DayDataDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *UniswapV3TokenV3DayDataDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3TokenV3DayDataDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *UniswapV3TokenV3DayDataDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *UniswapV3TokenV3DayDataDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetId() {
	o.Id.Unset()
}

// GetDate returns the Date field value if set, zero value otherwise.
func (o *UniswapV3TokenV3DayDataDTO) GetDate() int32 {
	if o == nil || isNil(o.Date) {
		var ret int32
		return ret
	}
	return *o.Date
}

// GetDateOk returns a tuple with the Date field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniswapV3TokenV3DayDataDTO) GetDateOk() (*int32, bool) {
	if o == nil || isNil(o.Date) {
		return nil, false
	}
	return o.Date, true
}

// HasDate returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasDate() bool {
	if o != nil && !isNil(o.Date) {
		return true
	}

	return false
}

// SetDate gets a reference to the given int32 and assigns it to the Date field.
func (o *UniswapV3TokenV3DayDataDTO) SetDate(v int32) {
	o.Date = &v
}

// GetToken returns the Token field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetToken() string {
	if o == nil || isNil(o.Token.Get()) {
		var ret string
		return ret
	}
	return *o.Token.Get()
}

// GetTokenOk returns a tuple with the Token field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetTokenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Token.Get(), o.Token.IsSet()
}

// HasToken returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasToken() bool {
	if o != nil && o.Token.IsSet() {
		return true
	}

	return false
}

// SetToken gets a reference to the given NullableString and assigns it to the Token field.
func (o *UniswapV3TokenV3DayDataDTO) SetToken(v string) {
	o.Token.Set(&v)
}
// SetTokenNil sets the value for Token to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetTokenNil() {
	o.Token.Set(nil)
}

// UnsetToken ensures that no value is present for Token, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetToken() {
	o.Token.Unset()
}

// GetVolume returns the Volume field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetVolume() string {
	if o == nil || isNil(o.Volume.Get()) {
		var ret string
		return ret
	}
	return *o.Volume.Get()
}

// GetVolumeOk returns a tuple with the Volume field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetVolumeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Volume.Get(), o.Volume.IsSet()
}

// HasVolume returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasVolume() bool {
	if o != nil && o.Volume.IsSet() {
		return true
	}

	return false
}

// SetVolume gets a reference to the given NullableString and assigns it to the Volume field.
func (o *UniswapV3TokenV3DayDataDTO) SetVolume(v string) {
	o.Volume.Set(&v)
}
// SetVolumeNil sets the value for Volume to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetVolumeNil() {
	o.Volume.Set(nil)
}

// UnsetVolume ensures that no value is present for Volume, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetVolume() {
	o.Volume.Unset()
}

// GetVolumeUsd returns the VolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetVolumeUsd() string {
	if o == nil || isNil(o.VolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.VolumeUsd.Get()
}

// GetVolumeUsdOk returns a tuple with the VolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetVolumeUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.VolumeUsd.Get(), o.VolumeUsd.IsSet()
}

// HasVolumeUsd returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasVolumeUsd() bool {
	if o != nil && o.VolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetVolumeUsd gets a reference to the given NullableString and assigns it to the VolumeUsd field.
func (o *UniswapV3TokenV3DayDataDTO) SetVolumeUsd(v string) {
	o.VolumeUsd.Set(&v)
}
// SetVolumeUsdNil sets the value for VolumeUsd to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetVolumeUsdNil() {
	o.VolumeUsd.Set(nil)
}

// UnsetVolumeUsd ensures that no value is present for VolumeUsd, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetVolumeUsd() {
	o.VolumeUsd.Unset()
}

// GetUntrackedVolumeUsd returns the UntrackedVolumeUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetUntrackedVolumeUsd() string {
	if o == nil || isNil(o.UntrackedVolumeUsd.Get()) {
		var ret string
		return ret
	}
	return *o.UntrackedVolumeUsd.Get()
}

// GetUntrackedVolumeUsdOk returns a tuple with the UntrackedVolumeUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetUntrackedVolumeUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.UntrackedVolumeUsd.Get(), o.UntrackedVolumeUsd.IsSet()
}

// HasUntrackedVolumeUsd returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasUntrackedVolumeUsd() bool {
	if o != nil && o.UntrackedVolumeUsd.IsSet() {
		return true
	}

	return false
}

// SetUntrackedVolumeUsd gets a reference to the given NullableString and assigns it to the UntrackedVolumeUsd field.
func (o *UniswapV3TokenV3DayDataDTO) SetUntrackedVolumeUsd(v string) {
	o.UntrackedVolumeUsd.Set(&v)
}
// SetUntrackedVolumeUsdNil sets the value for UntrackedVolumeUsd to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetUntrackedVolumeUsdNil() {
	o.UntrackedVolumeUsd.Set(nil)
}

// UnsetUntrackedVolumeUsd ensures that no value is present for UntrackedVolumeUsd, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetUntrackedVolumeUsd() {
	o.UntrackedVolumeUsd.Unset()
}

// GetTotalValueLocked returns the TotalValueLocked field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetTotalValueLocked() string {
	if o == nil || isNil(o.TotalValueLocked.Get()) {
		var ret string
		return ret
	}
	return *o.TotalValueLocked.Get()
}

// GetTotalValueLockedOk returns a tuple with the TotalValueLocked field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetTotalValueLockedOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TotalValueLocked.Get(), o.TotalValueLocked.IsSet()
}

// HasTotalValueLocked returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasTotalValueLocked() bool {
	if o != nil && o.TotalValueLocked.IsSet() {
		return true
	}

	return false
}

// SetTotalValueLocked gets a reference to the given NullableString and assigns it to the TotalValueLocked field.
func (o *UniswapV3TokenV3DayDataDTO) SetTotalValueLocked(v string) {
	o.TotalValueLocked.Set(&v)
}
// SetTotalValueLockedNil sets the value for TotalValueLocked to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetTotalValueLockedNil() {
	o.TotalValueLocked.Set(nil)
}

// UnsetTotalValueLocked ensures that no value is present for TotalValueLocked, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetTotalValueLocked() {
	o.TotalValueLocked.Unset()
}

// GetTotalValueLockedUsd returns the TotalValueLockedUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetTotalValueLockedUsd() string {
	if o == nil || isNil(o.TotalValueLockedUsd.Get()) {
		var ret string
		return ret
	}
	return *o.TotalValueLockedUsd.Get()
}

// GetTotalValueLockedUsdOk returns a tuple with the TotalValueLockedUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetTotalValueLockedUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TotalValueLockedUsd.Get(), o.TotalValueLockedUsd.IsSet()
}

// HasTotalValueLockedUsd returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasTotalValueLockedUsd() bool {
	if o != nil && o.TotalValueLockedUsd.IsSet() {
		return true
	}

	return false
}

// SetTotalValueLockedUsd gets a reference to the given NullableString and assigns it to the TotalValueLockedUsd field.
func (o *UniswapV3TokenV3DayDataDTO) SetTotalValueLockedUsd(v string) {
	o.TotalValueLockedUsd.Set(&v)
}
// SetTotalValueLockedUsdNil sets the value for TotalValueLockedUsd to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetTotalValueLockedUsdNil() {
	o.TotalValueLockedUsd.Set(nil)
}

// UnsetTotalValueLockedUsd ensures that no value is present for TotalValueLockedUsd, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetTotalValueLockedUsd() {
	o.TotalValueLockedUsd.Unset()
}

// GetPriceUsd returns the PriceUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetPriceUsd() string {
	if o == nil || isNil(o.PriceUsd.Get()) {
		var ret string
		return ret
	}
	return *o.PriceUsd.Get()
}

// GetPriceUsdOk returns a tuple with the PriceUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetPriceUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PriceUsd.Get(), o.PriceUsd.IsSet()
}

// HasPriceUsd returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasPriceUsd() bool {
	if o != nil && o.PriceUsd.IsSet() {
		return true
	}

	return false
}

// SetPriceUsd gets a reference to the given NullableString and assigns it to the PriceUsd field.
func (o *UniswapV3TokenV3DayDataDTO) SetPriceUsd(v string) {
	o.PriceUsd.Set(&v)
}
// SetPriceUsdNil sets the value for PriceUsd to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetPriceUsdNil() {
	o.PriceUsd.Set(nil)
}

// UnsetPriceUsd ensures that no value is present for PriceUsd, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetPriceUsd() {
	o.PriceUsd.Unset()
}

// GetFeesUsd returns the FeesUsd field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetFeesUsd() string {
	if o == nil || isNil(o.FeesUsd.Get()) {
		var ret string
		return ret
	}
	return *o.FeesUsd.Get()
}

// GetFeesUsdOk returns a tuple with the FeesUsd field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetFeesUsdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeesUsd.Get(), o.FeesUsd.IsSet()
}

// HasFeesUsd returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasFeesUsd() bool {
	if o != nil && o.FeesUsd.IsSet() {
		return true
	}

	return false
}

// SetFeesUsd gets a reference to the given NullableString and assigns it to the FeesUsd field.
func (o *UniswapV3TokenV3DayDataDTO) SetFeesUsd(v string) {
	o.FeesUsd.Set(&v)
}
// SetFeesUsdNil sets the value for FeesUsd to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetFeesUsdNil() {
	o.FeesUsd.Set(nil)
}

// UnsetFeesUsd ensures that no value is present for FeesUsd, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetFeesUsd() {
	o.FeesUsd.Unset()
}

// GetOpen returns the Open field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetOpen() string {
	if o == nil || isNil(o.Open.Get()) {
		var ret string
		return ret
	}
	return *o.Open.Get()
}

// GetOpenOk returns a tuple with the Open field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetOpenOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Open.Get(), o.Open.IsSet()
}

// HasOpen returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasOpen() bool {
	if o != nil && o.Open.IsSet() {
		return true
	}

	return false
}

// SetOpen gets a reference to the given NullableString and assigns it to the Open field.
func (o *UniswapV3TokenV3DayDataDTO) SetOpen(v string) {
	o.Open.Set(&v)
}
// SetOpenNil sets the value for Open to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetOpenNil() {
	o.Open.Set(nil)
}

// UnsetOpen ensures that no value is present for Open, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetOpen() {
	o.Open.Unset()
}

// GetHigh returns the High field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetHigh() string {
	if o == nil || isNil(o.High.Get()) {
		var ret string
		return ret
	}
	return *o.High.Get()
}

// GetHighOk returns a tuple with the High field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetHighOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.High.Get(), o.High.IsSet()
}

// HasHigh returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasHigh() bool {
	if o != nil && o.High.IsSet() {
		return true
	}

	return false
}

// SetHigh gets a reference to the given NullableString and assigns it to the High field.
func (o *UniswapV3TokenV3DayDataDTO) SetHigh(v string) {
	o.High.Set(&v)
}
// SetHighNil sets the value for High to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetHighNil() {
	o.High.Set(nil)
}

// UnsetHigh ensures that no value is present for High, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetHigh() {
	o.High.Unset()
}

// GetLow returns the Low field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetLow() string {
	if o == nil || isNil(o.Low.Get()) {
		var ret string
		return ret
	}
	return *o.Low.Get()
}

// GetLowOk returns a tuple with the Low field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetLowOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Low.Get(), o.Low.IsSet()
}

// HasLow returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasLow() bool {
	if o != nil && o.Low.IsSet() {
		return true
	}

	return false
}

// SetLow gets a reference to the given NullableString and assigns it to the Low field.
func (o *UniswapV3TokenV3DayDataDTO) SetLow(v string) {
	o.Low.Set(&v)
}
// SetLowNil sets the value for Low to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetLowNil() {
	o.Low.Set(nil)
}

// UnsetLow ensures that no value is present for Low, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetLow() {
	o.Low.Unset()
}

// GetClose returns the Close field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniswapV3TokenV3DayDataDTO) GetClose() string {
	if o == nil || isNil(o.Close.Get()) {
		var ret string
		return ret
	}
	return *o.Close.Get()
}

// GetCloseOk returns a tuple with the Close field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniswapV3TokenV3DayDataDTO) GetCloseOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Close.Get(), o.Close.IsSet()
}

// HasClose returns a boolean if a field has been set.
func (o *UniswapV3TokenV3DayDataDTO) HasClose() bool {
	if o != nil && o.Close.IsSet() {
		return true
	}

	return false
}

// SetClose gets a reference to the given NullableString and assigns it to the Close field.
func (o *UniswapV3TokenV3DayDataDTO) SetClose(v string) {
	o.Close.Set(&v)
}
// SetCloseNil sets the value for Close to be an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) SetCloseNil() {
	o.Close.Set(nil)
}

// UnsetClose ensures that no value is present for Close, not even an explicit nil
func (o *UniswapV3TokenV3DayDataDTO) UnsetClose() {
	o.Close.Unset()
}

func (o UniswapV3TokenV3DayDataDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UniswapV3TokenV3DayDataDTO) ToMap() (map[string]interface{}, error) {
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
	if !isNil(o.Date) {
		toSerialize["date"] = o.Date
	}
	if o.Token.IsSet() {
		toSerialize["token"] = o.Token.Get()
	}
	if o.Volume.IsSet() {
		toSerialize["volume"] = o.Volume.Get()
	}
	if o.VolumeUsd.IsSet() {
		toSerialize["volume_usd"] = o.VolumeUsd.Get()
	}
	if o.UntrackedVolumeUsd.IsSet() {
		toSerialize["untracked_volume_usd"] = o.UntrackedVolumeUsd.Get()
	}
	if o.TotalValueLocked.IsSet() {
		toSerialize["total_value_locked"] = o.TotalValueLocked.Get()
	}
	if o.TotalValueLockedUsd.IsSet() {
		toSerialize["total_value_locked_usd"] = o.TotalValueLockedUsd.Get()
	}
	if o.PriceUsd.IsSet() {
		toSerialize["price_usd"] = o.PriceUsd.Get()
	}
	if o.FeesUsd.IsSet() {
		toSerialize["fees_usd"] = o.FeesUsd.Get()
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
	return toSerialize, nil
}

type NullableUniswapV3TokenV3DayDataDTO struct {
	value *UniswapV3TokenV3DayDataDTO
	isSet bool
}

func (v NullableUniswapV3TokenV3DayDataDTO) Get() *UniswapV3TokenV3DayDataDTO {
	return v.value
}

func (v *NullableUniswapV3TokenV3DayDataDTO) Set(val *UniswapV3TokenV3DayDataDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableUniswapV3TokenV3DayDataDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableUniswapV3TokenV3DayDataDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniswapV3TokenV3DayDataDTO(val *UniswapV3TokenV3DayDataDTO) *NullableUniswapV3TokenV3DayDataDTO {
	return &NullableUniswapV3TokenV3DayDataDTO{value: val, isSet: true}
}

func (v NullableUniswapV3TokenV3DayDataDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniswapV3TokenV3DayDataDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


