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

// checks if the DexSolutionDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DexSolutionDTO{}

// DexSolutionDTO struct for DexSolutionDTO
type DexSolutionDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	Batch NullableString `json:"batch,omitempty"`
	// 
	Solver NullableString `json:"solver,omitempty"`
	// 
	FeeReward NullableString `json:"fee_reward,omitempty"`
	// 
	ObjectiveValue NullableString `json:"objective_value,omitempty"`
	// 
	Utility NullableString `json:"utility,omitempty"`
	// 
	Trades []string `json:"trades,omitempty"`
	// 
	CreateEpoch NullableString `json:"create_epoch,omitempty"`
	// 
	RevertEpoch NullableString `json:"revert_epoch,omitempty"`
	// 
	TxHash NullableString `json:"tx_hash,omitempty"`
	// 
	TxLogIndex NullableString `json:"tx_log_index,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewDexSolutionDTO instantiates a new DexSolutionDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDexSolutionDTO() *DexSolutionDTO {
	this := DexSolutionDTO{}
	return &this
}

// NewDexSolutionDTOWithDefaults instantiates a new DexSolutionDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDexSolutionDTOWithDefaults() *DexSolutionDTO {
	this := DexSolutionDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *DexSolutionDTO) GetEntryTime() time.Time {
	if o == nil || IsNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexSolutionDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasEntryTime() bool {
	if o != nil && !IsNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *DexSolutionDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *DexSolutionDTO) GetRecvTime() time.Time {
	if o == nil || IsNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexSolutionDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasRecvTime() bool {
	if o != nil && !IsNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *DexSolutionDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *DexSolutionDTO) GetBlockNumber() int64 {
	if o == nil || IsNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexSolutionDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || IsNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasBlockNumber() bool {
	if o != nil && !IsNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *DexSolutionDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetId() string {
	if o == nil || IsNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *DexSolutionDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *DexSolutionDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *DexSolutionDTO) UnsetId() {
	o.Id.Unset()
}

// GetBatch returns the Batch field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetBatch() string {
	if o == nil || IsNil(o.Batch.Get()) {
		var ret string
		return ret
	}
	return *o.Batch.Get()
}

// GetBatchOk returns a tuple with the Batch field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetBatchOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Batch.Get(), o.Batch.IsSet()
}

// HasBatch returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasBatch() bool {
	if o != nil && o.Batch.IsSet() {
		return true
	}

	return false
}

// SetBatch gets a reference to the given NullableString and assigns it to the Batch field.
func (o *DexSolutionDTO) SetBatch(v string) {
	o.Batch.Set(&v)
}
// SetBatchNil sets the value for Batch to be an explicit nil
func (o *DexSolutionDTO) SetBatchNil() {
	o.Batch.Set(nil)
}

// UnsetBatch ensures that no value is present for Batch, not even an explicit nil
func (o *DexSolutionDTO) UnsetBatch() {
	o.Batch.Unset()
}

// GetSolver returns the Solver field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetSolver() string {
	if o == nil || IsNil(o.Solver.Get()) {
		var ret string
		return ret
	}
	return *o.Solver.Get()
}

// GetSolverOk returns a tuple with the Solver field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetSolverOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Solver.Get(), o.Solver.IsSet()
}

// HasSolver returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasSolver() bool {
	if o != nil && o.Solver.IsSet() {
		return true
	}

	return false
}

// SetSolver gets a reference to the given NullableString and assigns it to the Solver field.
func (o *DexSolutionDTO) SetSolver(v string) {
	o.Solver.Set(&v)
}
// SetSolverNil sets the value for Solver to be an explicit nil
func (o *DexSolutionDTO) SetSolverNil() {
	o.Solver.Set(nil)
}

// UnsetSolver ensures that no value is present for Solver, not even an explicit nil
func (o *DexSolutionDTO) UnsetSolver() {
	o.Solver.Unset()
}

// GetFeeReward returns the FeeReward field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetFeeReward() string {
	if o == nil || IsNil(o.FeeReward.Get()) {
		var ret string
		return ret
	}
	return *o.FeeReward.Get()
}

// GetFeeRewardOk returns a tuple with the FeeReward field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetFeeRewardOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.FeeReward.Get(), o.FeeReward.IsSet()
}

// HasFeeReward returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasFeeReward() bool {
	if o != nil && o.FeeReward.IsSet() {
		return true
	}

	return false
}

// SetFeeReward gets a reference to the given NullableString and assigns it to the FeeReward field.
func (o *DexSolutionDTO) SetFeeReward(v string) {
	o.FeeReward.Set(&v)
}
// SetFeeRewardNil sets the value for FeeReward to be an explicit nil
func (o *DexSolutionDTO) SetFeeRewardNil() {
	o.FeeReward.Set(nil)
}

// UnsetFeeReward ensures that no value is present for FeeReward, not even an explicit nil
func (o *DexSolutionDTO) UnsetFeeReward() {
	o.FeeReward.Unset()
}

// GetObjectiveValue returns the ObjectiveValue field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetObjectiveValue() string {
	if o == nil || IsNil(o.ObjectiveValue.Get()) {
		var ret string
		return ret
	}
	return *o.ObjectiveValue.Get()
}

// GetObjectiveValueOk returns a tuple with the ObjectiveValue field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetObjectiveValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ObjectiveValue.Get(), o.ObjectiveValue.IsSet()
}

// HasObjectiveValue returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasObjectiveValue() bool {
	if o != nil && o.ObjectiveValue.IsSet() {
		return true
	}

	return false
}

// SetObjectiveValue gets a reference to the given NullableString and assigns it to the ObjectiveValue field.
func (o *DexSolutionDTO) SetObjectiveValue(v string) {
	o.ObjectiveValue.Set(&v)
}
// SetObjectiveValueNil sets the value for ObjectiveValue to be an explicit nil
func (o *DexSolutionDTO) SetObjectiveValueNil() {
	o.ObjectiveValue.Set(nil)
}

// UnsetObjectiveValue ensures that no value is present for ObjectiveValue, not even an explicit nil
func (o *DexSolutionDTO) UnsetObjectiveValue() {
	o.ObjectiveValue.Unset()
}

// GetUtility returns the Utility field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetUtility() string {
	if o == nil || IsNil(o.Utility.Get()) {
		var ret string
		return ret
	}
	return *o.Utility.Get()
}

// GetUtilityOk returns a tuple with the Utility field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetUtilityOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Utility.Get(), o.Utility.IsSet()
}

// HasUtility returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasUtility() bool {
	if o != nil && o.Utility.IsSet() {
		return true
	}

	return false
}

// SetUtility gets a reference to the given NullableString and assigns it to the Utility field.
func (o *DexSolutionDTO) SetUtility(v string) {
	o.Utility.Set(&v)
}
// SetUtilityNil sets the value for Utility to be an explicit nil
func (o *DexSolutionDTO) SetUtilityNil() {
	o.Utility.Set(nil)
}

// UnsetUtility ensures that no value is present for Utility, not even an explicit nil
func (o *DexSolutionDTO) UnsetUtility() {
	o.Utility.Unset()
}

// GetTrades returns the Trades field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetTrades() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Trades
}

// GetTradesOk returns a tuple with the Trades field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetTradesOk() ([]string, bool) {
	if o == nil || IsNil(o.Trades) {
		return nil, false
	}
	return o.Trades, true
}

// HasTrades returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasTrades() bool {
	if o != nil && IsNil(o.Trades) {
		return true
	}

	return false
}

// SetTrades gets a reference to the given []string and assigns it to the Trades field.
func (o *DexSolutionDTO) SetTrades(v []string) {
	o.Trades = v
}

// GetCreateEpoch returns the CreateEpoch field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetCreateEpoch() string {
	if o == nil || IsNil(o.CreateEpoch.Get()) {
		var ret string
		return ret
	}
	return *o.CreateEpoch.Get()
}

// GetCreateEpochOk returns a tuple with the CreateEpoch field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetCreateEpochOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CreateEpoch.Get(), o.CreateEpoch.IsSet()
}

// HasCreateEpoch returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasCreateEpoch() bool {
	if o != nil && o.CreateEpoch.IsSet() {
		return true
	}

	return false
}

// SetCreateEpoch gets a reference to the given NullableString and assigns it to the CreateEpoch field.
func (o *DexSolutionDTO) SetCreateEpoch(v string) {
	o.CreateEpoch.Set(&v)
}
// SetCreateEpochNil sets the value for CreateEpoch to be an explicit nil
func (o *DexSolutionDTO) SetCreateEpochNil() {
	o.CreateEpoch.Set(nil)
}

// UnsetCreateEpoch ensures that no value is present for CreateEpoch, not even an explicit nil
func (o *DexSolutionDTO) UnsetCreateEpoch() {
	o.CreateEpoch.Unset()
}

// GetRevertEpoch returns the RevertEpoch field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetRevertEpoch() string {
	if o == nil || IsNil(o.RevertEpoch.Get()) {
		var ret string
		return ret
	}
	return *o.RevertEpoch.Get()
}

// GetRevertEpochOk returns a tuple with the RevertEpoch field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetRevertEpochOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.RevertEpoch.Get(), o.RevertEpoch.IsSet()
}

// HasRevertEpoch returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasRevertEpoch() bool {
	if o != nil && o.RevertEpoch.IsSet() {
		return true
	}

	return false
}

// SetRevertEpoch gets a reference to the given NullableString and assigns it to the RevertEpoch field.
func (o *DexSolutionDTO) SetRevertEpoch(v string) {
	o.RevertEpoch.Set(&v)
}
// SetRevertEpochNil sets the value for RevertEpoch to be an explicit nil
func (o *DexSolutionDTO) SetRevertEpochNil() {
	o.RevertEpoch.Set(nil)
}

// UnsetRevertEpoch ensures that no value is present for RevertEpoch, not even an explicit nil
func (o *DexSolutionDTO) UnsetRevertEpoch() {
	o.RevertEpoch.Unset()
}

// GetTxHash returns the TxHash field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetTxHash() string {
	if o == nil || IsNil(o.TxHash.Get()) {
		var ret string
		return ret
	}
	return *o.TxHash.Get()
}

// GetTxHashOk returns a tuple with the TxHash field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetTxHashOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TxHash.Get(), o.TxHash.IsSet()
}

// HasTxHash returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasTxHash() bool {
	if o != nil && o.TxHash.IsSet() {
		return true
	}

	return false
}

// SetTxHash gets a reference to the given NullableString and assigns it to the TxHash field.
func (o *DexSolutionDTO) SetTxHash(v string) {
	o.TxHash.Set(&v)
}
// SetTxHashNil sets the value for TxHash to be an explicit nil
func (o *DexSolutionDTO) SetTxHashNil() {
	o.TxHash.Set(nil)
}

// UnsetTxHash ensures that no value is present for TxHash, not even an explicit nil
func (o *DexSolutionDTO) UnsetTxHash() {
	o.TxHash.Unset()
}

// GetTxLogIndex returns the TxLogIndex field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DexSolutionDTO) GetTxLogIndex() string {
	if o == nil || IsNil(o.TxLogIndex.Get()) {
		var ret string
		return ret
	}
	return *o.TxLogIndex.Get()
}

// GetTxLogIndexOk returns a tuple with the TxLogIndex field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DexSolutionDTO) GetTxLogIndexOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TxLogIndex.Get(), o.TxLogIndex.IsSet()
}

// HasTxLogIndex returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasTxLogIndex() bool {
	if o != nil && o.TxLogIndex.IsSet() {
		return true
	}

	return false
}

// SetTxLogIndex gets a reference to the given NullableString and assigns it to the TxLogIndex field.
func (o *DexSolutionDTO) SetTxLogIndex(v string) {
	o.TxLogIndex.Set(&v)
}
// SetTxLogIndexNil sets the value for TxLogIndex to be an explicit nil
func (o *DexSolutionDTO) SetTxLogIndexNil() {
	o.TxLogIndex.Set(nil)
}

// UnsetTxLogIndex ensures that no value is present for TxLogIndex, not even an explicit nil
func (o *DexSolutionDTO) UnsetTxLogIndex() {
	o.TxLogIndex.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *DexSolutionDTO) GetVid() int64 {
	if o == nil || IsNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DexSolutionDTO) GetVidOk() (*int64, bool) {
	if o == nil || IsNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *DexSolutionDTO) HasVid() bool {
	if o != nil && !IsNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *DexSolutionDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o DexSolutionDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DexSolutionDTO) ToMap() (map[string]interface{}, error) {
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
	if o.Batch.IsSet() {
		toSerialize["batch"] = o.Batch.Get()
	}
	if o.Solver.IsSet() {
		toSerialize["solver"] = o.Solver.Get()
	}
	if o.FeeReward.IsSet() {
		toSerialize["fee_reward"] = o.FeeReward.Get()
	}
	if o.ObjectiveValue.IsSet() {
		toSerialize["objective_value"] = o.ObjectiveValue.Get()
	}
	if o.Utility.IsSet() {
		toSerialize["utility"] = o.Utility.Get()
	}
	if o.Trades != nil {
		toSerialize["trades"] = o.Trades
	}
	if o.CreateEpoch.IsSet() {
		toSerialize["create_epoch"] = o.CreateEpoch.Get()
	}
	if o.RevertEpoch.IsSet() {
		toSerialize["revert_epoch"] = o.RevertEpoch.Get()
	}
	if o.TxHash.IsSet() {
		toSerialize["tx_hash"] = o.TxHash.Get()
	}
	if o.TxLogIndex.IsSet() {
		toSerialize["tx_log_index"] = o.TxLogIndex.Get()
	}
	if !IsNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableDexSolutionDTO struct {
	value *DexSolutionDTO
	isSet bool
}

func (v NullableDexSolutionDTO) Get() *DexSolutionDTO {
	return v.value
}

func (v *NullableDexSolutionDTO) Set(val *DexSolutionDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableDexSolutionDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableDexSolutionDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDexSolutionDTO(val *DexSolutionDTO) *NullableDexSolutionDTO {
	return &NullableDexSolutionDTO{value: val, isSet: true}
}

func (v NullableDexSolutionDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDexSolutionDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


