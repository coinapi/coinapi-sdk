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

// CurveProposalVoteDTO struct for CurveProposalVoteDTO
type CurveProposalVoteDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	Proposal NullableString `json:"proposal,omitempty"`
	// 
	Supports *bool `json:"supports,omitempty"`
	// 
	Stake NullableString `json:"stake,omitempty"`
	// 
	Voter NullableString `json:"voter,omitempty"`
	// 
	Created NullableString `json:"created,omitempty"`
	// 
	CreatedAtBlock NullableString `json:"created_at_block,omitempty"`
	// 
	CreatedAtTransaction NullableString `json:"created_at_transaction,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewCurveProposalVoteDTO instantiates a new CurveProposalVoteDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveProposalVoteDTO() *CurveProposalVoteDTO {
	this := CurveProposalVoteDTO{}
	return &this
}

// NewCurveProposalVoteDTOWithDefaults instantiates a new CurveProposalVoteDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveProposalVoteDTOWithDefaults() *CurveProposalVoteDTO {
	this := CurveProposalVoteDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveProposalVoteDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveProposalVoteDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
    return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveProposalVoteDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveProposalVoteDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveProposalVoteDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
    return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveProposalVoteDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveProposalVoteDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveProposalVoteDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
    return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveProposalVoteDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveProposalVoteDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveProposalVoteDTO) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveProposalVoteDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveProposalVoteDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveProposalVoteDTO) UnsetId() {
	o.Id.Unset()
}

// GetProposal returns the Proposal field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveProposalVoteDTO) GetProposal() string {
	if o == nil || isNil(o.Proposal.Get()) {
		var ret string
		return ret
	}
	return *o.Proposal.Get()
}

// GetProposalOk returns a tuple with the Proposal field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveProposalVoteDTO) GetProposalOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Proposal.Get(), o.Proposal.IsSet()
}

// HasProposal returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasProposal() bool {
	if o != nil && o.Proposal.IsSet() {
		return true
	}

	return false
}

// SetProposal gets a reference to the given NullableString and assigns it to the Proposal field.
func (o *CurveProposalVoteDTO) SetProposal(v string) {
	o.Proposal.Set(&v)
}
// SetProposalNil sets the value for Proposal to be an explicit nil
func (o *CurveProposalVoteDTO) SetProposalNil() {
	o.Proposal.Set(nil)
}

// UnsetProposal ensures that no value is present for Proposal, not even an explicit nil
func (o *CurveProposalVoteDTO) UnsetProposal() {
	o.Proposal.Unset()
}

// GetSupports returns the Supports field value if set, zero value otherwise.
func (o *CurveProposalVoteDTO) GetSupports() bool {
	if o == nil || isNil(o.Supports) {
		var ret bool
		return ret
	}
	return *o.Supports
}

// GetSupportsOk returns a tuple with the Supports field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveProposalVoteDTO) GetSupportsOk() (*bool, bool) {
	if o == nil || isNil(o.Supports) {
    return nil, false
	}
	return o.Supports, true
}

// HasSupports returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasSupports() bool {
	if o != nil && !isNil(o.Supports) {
		return true
	}

	return false
}

// SetSupports gets a reference to the given bool and assigns it to the Supports field.
func (o *CurveProposalVoteDTO) SetSupports(v bool) {
	o.Supports = &v
}

// GetStake returns the Stake field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveProposalVoteDTO) GetStake() string {
	if o == nil || isNil(o.Stake.Get()) {
		var ret string
		return ret
	}
	return *o.Stake.Get()
}

// GetStakeOk returns a tuple with the Stake field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveProposalVoteDTO) GetStakeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Stake.Get(), o.Stake.IsSet()
}

// HasStake returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasStake() bool {
	if o != nil && o.Stake.IsSet() {
		return true
	}

	return false
}

// SetStake gets a reference to the given NullableString and assigns it to the Stake field.
func (o *CurveProposalVoteDTO) SetStake(v string) {
	o.Stake.Set(&v)
}
// SetStakeNil sets the value for Stake to be an explicit nil
func (o *CurveProposalVoteDTO) SetStakeNil() {
	o.Stake.Set(nil)
}

// UnsetStake ensures that no value is present for Stake, not even an explicit nil
func (o *CurveProposalVoteDTO) UnsetStake() {
	o.Stake.Unset()
}

// GetVoter returns the Voter field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveProposalVoteDTO) GetVoter() string {
	if o == nil || isNil(o.Voter.Get()) {
		var ret string
		return ret
	}
	return *o.Voter.Get()
}

// GetVoterOk returns a tuple with the Voter field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveProposalVoteDTO) GetVoterOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Voter.Get(), o.Voter.IsSet()
}

// HasVoter returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasVoter() bool {
	if o != nil && o.Voter.IsSet() {
		return true
	}

	return false
}

// SetVoter gets a reference to the given NullableString and assigns it to the Voter field.
func (o *CurveProposalVoteDTO) SetVoter(v string) {
	o.Voter.Set(&v)
}
// SetVoterNil sets the value for Voter to be an explicit nil
func (o *CurveProposalVoteDTO) SetVoterNil() {
	o.Voter.Set(nil)
}

// UnsetVoter ensures that no value is present for Voter, not even an explicit nil
func (o *CurveProposalVoteDTO) UnsetVoter() {
	o.Voter.Unset()
}

// GetCreated returns the Created field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveProposalVoteDTO) GetCreated() string {
	if o == nil || isNil(o.Created.Get()) {
		var ret string
		return ret
	}
	return *o.Created.Get()
}

// GetCreatedOk returns a tuple with the Created field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveProposalVoteDTO) GetCreatedOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Created.Get(), o.Created.IsSet()
}

// HasCreated returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasCreated() bool {
	if o != nil && o.Created.IsSet() {
		return true
	}

	return false
}

// SetCreated gets a reference to the given NullableString and assigns it to the Created field.
func (o *CurveProposalVoteDTO) SetCreated(v string) {
	o.Created.Set(&v)
}
// SetCreatedNil sets the value for Created to be an explicit nil
func (o *CurveProposalVoteDTO) SetCreatedNil() {
	o.Created.Set(nil)
}

// UnsetCreated ensures that no value is present for Created, not even an explicit nil
func (o *CurveProposalVoteDTO) UnsetCreated() {
	o.Created.Unset()
}

// GetCreatedAtBlock returns the CreatedAtBlock field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveProposalVoteDTO) GetCreatedAtBlock() string {
	if o == nil || isNil(o.CreatedAtBlock.Get()) {
		var ret string
		return ret
	}
	return *o.CreatedAtBlock.Get()
}

// GetCreatedAtBlockOk returns a tuple with the CreatedAtBlock field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveProposalVoteDTO) GetCreatedAtBlockOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.CreatedAtBlock.Get(), o.CreatedAtBlock.IsSet()
}

// HasCreatedAtBlock returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasCreatedAtBlock() bool {
	if o != nil && o.CreatedAtBlock.IsSet() {
		return true
	}

	return false
}

// SetCreatedAtBlock gets a reference to the given NullableString and assigns it to the CreatedAtBlock field.
func (o *CurveProposalVoteDTO) SetCreatedAtBlock(v string) {
	o.CreatedAtBlock.Set(&v)
}
// SetCreatedAtBlockNil sets the value for CreatedAtBlock to be an explicit nil
func (o *CurveProposalVoteDTO) SetCreatedAtBlockNil() {
	o.CreatedAtBlock.Set(nil)
}

// UnsetCreatedAtBlock ensures that no value is present for CreatedAtBlock, not even an explicit nil
func (o *CurveProposalVoteDTO) UnsetCreatedAtBlock() {
	o.CreatedAtBlock.Unset()
}

// GetCreatedAtTransaction returns the CreatedAtTransaction field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveProposalVoteDTO) GetCreatedAtTransaction() string {
	if o == nil || isNil(o.CreatedAtTransaction.Get()) {
		var ret string
		return ret
	}
	return *o.CreatedAtTransaction.Get()
}

// GetCreatedAtTransactionOk returns a tuple with the CreatedAtTransaction field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveProposalVoteDTO) GetCreatedAtTransactionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.CreatedAtTransaction.Get(), o.CreatedAtTransaction.IsSet()
}

// HasCreatedAtTransaction returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasCreatedAtTransaction() bool {
	if o != nil && o.CreatedAtTransaction.IsSet() {
		return true
	}

	return false
}

// SetCreatedAtTransaction gets a reference to the given NullableString and assigns it to the CreatedAtTransaction field.
func (o *CurveProposalVoteDTO) SetCreatedAtTransaction(v string) {
	o.CreatedAtTransaction.Set(&v)
}
// SetCreatedAtTransactionNil sets the value for CreatedAtTransaction to be an explicit nil
func (o *CurveProposalVoteDTO) SetCreatedAtTransactionNil() {
	o.CreatedAtTransaction.Set(nil)
}

// UnsetCreatedAtTransaction ensures that no value is present for CreatedAtTransaction, not even an explicit nil
func (o *CurveProposalVoteDTO) UnsetCreatedAtTransaction() {
	o.CreatedAtTransaction.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveProposalVoteDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveProposalVoteDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
    return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveProposalVoteDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveProposalVoteDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o CurveProposalVoteDTO) MarshalJSON() ([]byte, error) {
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
	if o.Proposal.IsSet() {
		toSerialize["proposal"] = o.Proposal.Get()
	}
	if !isNil(o.Supports) {
		toSerialize["supports"] = o.Supports
	}
	if o.Stake.IsSet() {
		toSerialize["stake"] = o.Stake.Get()
	}
	if o.Voter.IsSet() {
		toSerialize["voter"] = o.Voter.Get()
	}
	if o.Created.IsSet() {
		toSerialize["created"] = o.Created.Get()
	}
	if o.CreatedAtBlock.IsSet() {
		toSerialize["created_at_block"] = o.CreatedAtBlock.Get()
	}
	if o.CreatedAtTransaction.IsSet() {
		toSerialize["created_at_transaction"] = o.CreatedAtTransaction.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return json.Marshal(toSerialize)
}

type NullableCurveProposalVoteDTO struct {
	value *CurveProposalVoteDTO
	isSet bool
}

func (v NullableCurveProposalVoteDTO) Get() *CurveProposalVoteDTO {
	return v.value
}

func (v *NullableCurveProposalVoteDTO) Set(val *CurveProposalVoteDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveProposalVoteDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveProposalVoteDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveProposalVoteDTO(val *CurveProposalVoteDTO) *NullableCurveProposalVoteDTO {
	return &NullableCurveProposalVoteDTO{value: val, isSet: true}
}

func (v NullableCurveProposalVoteDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveProposalVoteDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


