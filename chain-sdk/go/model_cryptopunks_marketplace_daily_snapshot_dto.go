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

// checks if the CRYPTOPUNKSMarketplaceDailySnapshotDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CRYPTOPUNKSMarketplaceDailySnapshotDTO{}

// CRYPTOPUNKSMarketplaceDailySnapshotDTO struct for CRYPTOPUNKSMarketplaceDailySnapshotDTO
type CRYPTOPUNKSMarketplaceDailySnapshotDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// 
	BlockNumber NullableString `json:"block_number,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
	// 
	BlockRange NullableString `json:"block_range,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	Marketplace NullableString `json:"marketplace,omitempty"`
	// 
	Timestamp NullableString `json:"timestamp,omitempty"`
	// 
	CollectionCount *int32 `json:"collection_count,omitempty"`
	// 
	CumulativeTradeVolumeEth NullableString `json:"cumulative_trade_volume_eth,omitempty"`
	// 
	MarketplaceRevenueEth NullableString `json:"marketplace_revenue_eth,omitempty"`
	// 
	CreatorRevenueEth NullableString `json:"creator_revenue_eth,omitempty"`
	// 
	TotalRevenueEth NullableString `json:"total_revenue_eth,omitempty"`
	// 
	TradeCount *int32 `json:"trade_count,omitempty"`
	// 
	CumulativeUniqueTraders *int32 `json:"cumulative_unique_traders,omitempty"`
	// 
	DailyActiveTraders *int32 `json:"daily_active_traders,omitempty"`
	// 
	DailyTradedCollectionCount *int32 `json:"daily_traded_collection_count,omitempty"`
	// 
	DailyTradedItemCount *int32 `json:"daily_traded_item_count,omitempty"`
}

// NewCRYPTOPUNKSMarketplaceDailySnapshotDTO instantiates a new CRYPTOPUNKSMarketplaceDailySnapshotDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCRYPTOPUNKSMarketplaceDailySnapshotDTO() *CRYPTOPUNKSMarketplaceDailySnapshotDTO {
	this := CRYPTOPUNKSMarketplaceDailySnapshotDTO{}
	return &this
}

// NewCRYPTOPUNKSMarketplaceDailySnapshotDTOWithDefaults instantiates a new CRYPTOPUNKSMarketplaceDailySnapshotDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCRYPTOPUNKSMarketplaceDailySnapshotDTOWithDefaults() *CRYPTOPUNKSMarketplaceDailySnapshotDTO {
	this := CRYPTOPUNKSMarketplaceDailySnapshotDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetBlockNumber() string {
	if o == nil || IsNil(o.BlockNumber.Get()) {
		var ret string
		return ret
	}
	return *o.BlockNumber.Get()
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetBlockNumberOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.BlockNumber.Get(), o.BlockNumber.IsSet()
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasBlockNumber() bool {
	if o != nil && o.BlockNumber.IsSet() {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given NullableString and assigns it to the BlockNumber field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetBlockNumber(v string) {
	o.BlockNumber.Set(&v)
}
// SetBlockNumberNil sets the value for BlockNumber to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetBlockNumberNil() {
	o.BlockNumber.Set(nil)
}

// UnsetBlockNumber ensures that no value is present for BlockNumber, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetBlockNumber() {
	o.BlockNumber.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetVid(v int64) {
	o.Vid = &v
}

// GetBlockRange returns the BlockRange field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetBlockRange() string {
	if o == nil || IsNil(o.BlockRange.Get()) {
		var ret string
		return ret
	}
	return *o.BlockRange.Get()
}

// GetBlockRangeOk returns a tuple with the BlockRange field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetBlockRangeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.BlockRange.Get(), o.BlockRange.IsSet()
}

// HasBlockRange returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasBlockRange() bool {
	if o != nil && o.BlockRange.IsSet() {
		return true
	}

	return false
}

// SetBlockRange gets a reference to the given NullableString and assigns it to the BlockRange field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetBlockRange(v string) {
	o.BlockRange.Set(&v)
}
// SetBlockRangeNil sets the value for BlockRange to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetBlockRangeNil() {
	o.BlockRange.Set(nil)
}

// UnsetBlockRange ensures that no value is present for BlockRange, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetBlockRange() {
	o.BlockRange.Unset()
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetId() {
	o.Id.Unset()
}

// GetMarketplace returns the Marketplace field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetMarketplace() string {
	if o == nil || IsNil(o.Marketplace.Get()) {
		var ret string
		return ret
	}
	return *o.Marketplace.Get()
}

// GetMarketplaceOk returns a tuple with the Marketplace field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetMarketplaceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Marketplace.Get(), o.Marketplace.IsSet()
}

// HasMarketplace returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasMarketplace() bool {
	if o != nil && o.Marketplace.IsSet() {
		return true
	}

	return false
}

// SetMarketplace gets a reference to the given NullableString and assigns it to the Marketplace field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetMarketplace(v string) {
	o.Marketplace.Set(&v)
}
// SetMarketplaceNil sets the value for Marketplace to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetMarketplaceNil() {
	o.Marketplace.Set(nil)
}

// UnsetMarketplace ensures that no value is present for Marketplace, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetMarketplace() {
	o.Marketplace.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetTimestamp() string {
	if o == nil || IsNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetCollectionCount returns the CollectionCount field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetCollectionCount() int32 {
	if o == nil || IsNil(o.CollectionCount) {
		var ret int32
		return ret
	}
	return *o.CollectionCount
}

// GetCollectionCountOk returns a tuple with the CollectionCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetCollectionCountOk() (*int32, bool) {
	if o == nil || IsNil(o.CollectionCount) {
		return nil, false
	}
	return o.CollectionCount, true
}

// HasCollectionCount returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasCollectionCount() bool {
	if o != nil && !IsNil(o.CollectionCount) {
		return true
	}

	return false
}

// SetCollectionCount gets a reference to the given int32 and assigns it to the CollectionCount field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetCollectionCount(v int32) {
	o.CollectionCount = &v
}

// GetCumulativeTradeVolumeEth returns the CumulativeTradeVolumeEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetCumulativeTradeVolumeEth() string {
	if o == nil || IsNil(o.CumulativeTradeVolumeEth.Get()) {
		var ret string
		return ret
	}
	return *o.CumulativeTradeVolumeEth.Get()
}

// GetCumulativeTradeVolumeEthOk returns a tuple with the CumulativeTradeVolumeEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetCumulativeTradeVolumeEthOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CumulativeTradeVolumeEth.Get(), o.CumulativeTradeVolumeEth.IsSet()
}

// HasCumulativeTradeVolumeEth returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasCumulativeTradeVolumeEth() bool {
	if o != nil && o.CumulativeTradeVolumeEth.IsSet() {
		return true
	}

	return false
}

// SetCumulativeTradeVolumeEth gets a reference to the given NullableString and assigns it to the CumulativeTradeVolumeEth field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetCumulativeTradeVolumeEth(v string) {
	o.CumulativeTradeVolumeEth.Set(&v)
}
// SetCumulativeTradeVolumeEthNil sets the value for CumulativeTradeVolumeEth to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetCumulativeTradeVolumeEthNil() {
	o.CumulativeTradeVolumeEth.Set(nil)
}

// UnsetCumulativeTradeVolumeEth ensures that no value is present for CumulativeTradeVolumeEth, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetCumulativeTradeVolumeEth() {
	o.CumulativeTradeVolumeEth.Unset()
}

// GetMarketplaceRevenueEth returns the MarketplaceRevenueEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetMarketplaceRevenueEth() string {
	if o == nil || IsNil(o.MarketplaceRevenueEth.Get()) {
		var ret string
		return ret
	}
	return *o.MarketplaceRevenueEth.Get()
}

// GetMarketplaceRevenueEthOk returns a tuple with the MarketplaceRevenueEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetMarketplaceRevenueEthOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.MarketplaceRevenueEth.Get(), o.MarketplaceRevenueEth.IsSet()
}

// HasMarketplaceRevenueEth returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasMarketplaceRevenueEth() bool {
	if o != nil && o.MarketplaceRevenueEth.IsSet() {
		return true
	}

	return false
}

// SetMarketplaceRevenueEth gets a reference to the given NullableString and assigns it to the MarketplaceRevenueEth field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetMarketplaceRevenueEth(v string) {
	o.MarketplaceRevenueEth.Set(&v)
}
// SetMarketplaceRevenueEthNil sets the value for MarketplaceRevenueEth to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetMarketplaceRevenueEthNil() {
	o.MarketplaceRevenueEth.Set(nil)
}

// UnsetMarketplaceRevenueEth ensures that no value is present for MarketplaceRevenueEth, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetMarketplaceRevenueEth() {
	o.MarketplaceRevenueEth.Unset()
}

// GetCreatorRevenueEth returns the CreatorRevenueEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetCreatorRevenueEth() string {
	if o == nil || IsNil(o.CreatorRevenueEth.Get()) {
		var ret string
		return ret
	}
	return *o.CreatorRevenueEth.Get()
}

// GetCreatorRevenueEthOk returns a tuple with the CreatorRevenueEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetCreatorRevenueEthOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CreatorRevenueEth.Get(), o.CreatorRevenueEth.IsSet()
}

// HasCreatorRevenueEth returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasCreatorRevenueEth() bool {
	if o != nil && o.CreatorRevenueEth.IsSet() {
		return true
	}

	return false
}

// SetCreatorRevenueEth gets a reference to the given NullableString and assigns it to the CreatorRevenueEth field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetCreatorRevenueEth(v string) {
	o.CreatorRevenueEth.Set(&v)
}
// SetCreatorRevenueEthNil sets the value for CreatorRevenueEth to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetCreatorRevenueEthNil() {
	o.CreatorRevenueEth.Set(nil)
}

// UnsetCreatorRevenueEth ensures that no value is present for CreatorRevenueEth, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetCreatorRevenueEth() {
	o.CreatorRevenueEth.Unset()
}

// GetTotalRevenueEth returns the TotalRevenueEth field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetTotalRevenueEth() string {
	if o == nil || IsNil(o.TotalRevenueEth.Get()) {
		var ret string
		return ret
	}
	return *o.TotalRevenueEth.Get()
}

// GetTotalRevenueEthOk returns a tuple with the TotalRevenueEth field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetTotalRevenueEthOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TotalRevenueEth.Get(), o.TotalRevenueEth.IsSet()
}

// HasTotalRevenueEth returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasTotalRevenueEth() bool {
	if o != nil && o.TotalRevenueEth.IsSet() {
		return true
	}

	return false
}

// SetTotalRevenueEth gets a reference to the given NullableString and assigns it to the TotalRevenueEth field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetTotalRevenueEth(v string) {
	o.TotalRevenueEth.Set(&v)
}
// SetTotalRevenueEthNil sets the value for TotalRevenueEth to be an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetTotalRevenueEthNil() {
	o.TotalRevenueEth.Set(nil)
}

// UnsetTotalRevenueEth ensures that no value is present for TotalRevenueEth, not even an explicit nil
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) UnsetTotalRevenueEth() {
	o.TotalRevenueEth.Unset()
}

// GetTradeCount returns the TradeCount field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetTradeCount() int32 {
	if o == nil || IsNil(o.TradeCount) {
		var ret int32
		return ret
	}
	return *o.TradeCount
}

// GetTradeCountOk returns a tuple with the TradeCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetTradeCountOk() (*int32, bool) {
	if o == nil || IsNil(o.TradeCount) {
		return nil, false
	}
	return o.TradeCount, true
}

// HasTradeCount returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasTradeCount() bool {
	if o != nil && !IsNil(o.TradeCount) {
		return true
	}

	return false
}

// SetTradeCount gets a reference to the given int32 and assigns it to the TradeCount field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetTradeCount(v int32) {
	o.TradeCount = &v
}

// GetCumulativeUniqueTraders returns the CumulativeUniqueTraders field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetCumulativeUniqueTraders() int32 {
	if o == nil || IsNil(o.CumulativeUniqueTraders) {
		var ret int32
		return ret
	}
	return *o.CumulativeUniqueTraders
}

// GetCumulativeUniqueTradersOk returns a tuple with the CumulativeUniqueTraders field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetCumulativeUniqueTradersOk() (*int32, bool) {
	if o == nil || IsNil(o.CumulativeUniqueTraders) {
		return nil, false
	}
	return o.CumulativeUniqueTraders, true
}

// HasCumulativeUniqueTraders returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasCumulativeUniqueTraders() bool {
	if o != nil && !IsNil(o.CumulativeUniqueTraders) {
		return true
	}

	return false
}

// SetCumulativeUniqueTraders gets a reference to the given int32 and assigns it to the CumulativeUniqueTraders field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetCumulativeUniqueTraders(v int32) {
	o.CumulativeUniqueTraders = &v
}

// GetDailyActiveTraders returns the DailyActiveTraders field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetDailyActiveTraders() int32 {
	if o == nil || IsNil(o.DailyActiveTraders) {
		var ret int32
		return ret
	}
	return *o.DailyActiveTraders
}

// GetDailyActiveTradersOk returns a tuple with the DailyActiveTraders field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetDailyActiveTradersOk() (*int32, bool) {
	if o == nil || IsNil(o.DailyActiveTraders) {
		return nil, false
	}
	return o.DailyActiveTraders, true
}

// HasDailyActiveTraders returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasDailyActiveTraders() bool {
	if o != nil && !IsNil(o.DailyActiveTraders) {
		return true
	}

	return false
}

// SetDailyActiveTraders gets a reference to the given int32 and assigns it to the DailyActiveTraders field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetDailyActiveTraders(v int32) {
	o.DailyActiveTraders = &v
}

// GetDailyTradedCollectionCount returns the DailyTradedCollectionCount field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetDailyTradedCollectionCount() int32 {
	if o == nil || IsNil(o.DailyTradedCollectionCount) {
		var ret int32
		return ret
	}
	return *o.DailyTradedCollectionCount
}

// GetDailyTradedCollectionCountOk returns a tuple with the DailyTradedCollectionCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetDailyTradedCollectionCountOk() (*int32, bool) {
	if o == nil || IsNil(o.DailyTradedCollectionCount) {
		return nil, false
	}
	return o.DailyTradedCollectionCount, true
}

// HasDailyTradedCollectionCount returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasDailyTradedCollectionCount() bool {
	if o != nil && !IsNil(o.DailyTradedCollectionCount) {
		return true
	}

	return false
}

// SetDailyTradedCollectionCount gets a reference to the given int32 and assigns it to the DailyTradedCollectionCount field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetDailyTradedCollectionCount(v int32) {
	o.DailyTradedCollectionCount = &v
}

// GetDailyTradedItemCount returns the DailyTradedItemCount field value if set, zero value otherwise.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetDailyTradedItemCount() int32 {
	if o == nil || IsNil(o.DailyTradedItemCount) {
		var ret int32
		return ret
	}
	return *o.DailyTradedItemCount
}

// GetDailyTradedItemCountOk returns a tuple with the DailyTradedItemCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) GetDailyTradedItemCountOk() (*int32, bool) {
	if o == nil || IsNil(o.DailyTradedItemCount) {
		return nil, false
	}
	return o.DailyTradedItemCount, true
}

// HasDailyTradedItemCount returns a boolean if a field has been set.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) HasDailyTradedItemCount() bool {
	if o != nil && !IsNil(o.DailyTradedItemCount) {
		return true
	}

	return false
}

// SetDailyTradedItemCount gets a reference to the given int32 and assigns it to the DailyTradedItemCount field.
func (o *CRYPTOPUNKSMarketplaceDailySnapshotDTO) SetDailyTradedItemCount(v int32) {
	o.DailyTradedItemCount = &v
}

func (o CRYPTOPUNKSMarketplaceDailySnapshotDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CRYPTOPUNKSMarketplaceDailySnapshotDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.EntryTime) {
		toSerialize["entry_time"] = o.EntryTime
	}
	if !IsNil(o.RecvTime) {
		toSerialize["recv_time"] = o.RecvTime
	}
	if o.BlockNumber.IsSet() {
		toSerialize["block_number"] = o.BlockNumber.Get()
	}
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	if o.BlockRange.IsSet() {
		toSerialize["block_range"] = o.BlockRange.Get()
	}
	if o.Id.IsSet() {
		toSerialize["id"] = o.Id.Get()
	}
	if o.Marketplace.IsSet() {
		toSerialize["marketplace"] = o.Marketplace.Get()
	}
	if o.Timestamp.IsSet() {
		toSerialize["timestamp"] = o.Timestamp.Get()
	}
	if !IsNil(o.CollectionCount) {
		toSerialize["collection_count"] = o.CollectionCount
	}
	if o.CumulativeTradeVolumeEth.IsSet() {
		toSerialize["cumulative_trade_volume_eth"] = o.CumulativeTradeVolumeEth.Get()
	}
	if o.MarketplaceRevenueEth.IsSet() {
		toSerialize["marketplace_revenue_eth"] = o.MarketplaceRevenueEth.Get()
	}
	if o.CreatorRevenueEth.IsSet() {
		toSerialize["creator_revenue_eth"] = o.CreatorRevenueEth.Get()
	}
	if o.TotalRevenueEth.IsSet() {
		toSerialize["total_revenue_eth"] = o.TotalRevenueEth.Get()
	}
	if !IsNil(o.TradeCount) {
		toSerialize["trade_count"] = o.TradeCount
	}
	if !IsNil(o.CumulativeUniqueTraders) {
		toSerialize["cumulative_unique_traders"] = o.CumulativeUniqueTraders
	}
	if !IsNil(o.DailyActiveTraders) {
		toSerialize["daily_active_traders"] = o.DailyActiveTraders
	}
	if !IsNil(o.DailyTradedCollectionCount) {
		toSerialize["daily_traded_collection_count"] = o.DailyTradedCollectionCount
	}
	if !IsNil(o.DailyTradedItemCount) {
		toSerialize["daily_traded_item_count"] = o.DailyTradedItemCount
	}
	return toSerialize, nil
}

type NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO struct {
	value *CRYPTOPUNKSMarketplaceDailySnapshotDTO
	isSet bool
}

func (v NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO) Get() *CRYPTOPUNKSMarketplaceDailySnapshotDTO {
	return v.value
}

func (v *NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO) Set(val *CRYPTOPUNKSMarketplaceDailySnapshotDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCRYPTOPUNKSMarketplaceDailySnapshotDTO(val *CRYPTOPUNKSMarketplaceDailySnapshotDTO) *NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO {
	return &NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO{value: val, isSet: true}
}

func (v NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCRYPTOPUNKSMarketplaceDailySnapshotDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

