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

// checks if the CurveHourlyVolumeDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CurveHourlyVolumeDTO{}

// CurveHourlyVolumeDTO struct for CurveHourlyVolumeDTO
type CurveHourlyVolumeDTO struct {
	EntryTime *time.Time `json:"entry_time,omitempty"`
	RecvTime *time.Time `json:"recv_time,omitempty"`
	// Number of block in which entity was recorded.
	BlockNumber *int64 `json:"block_number,omitempty"`
	// 
	Id NullableString `json:"id,omitempty"`
	// 
	Pool NullableString `json:"pool,omitempty"`
	// 
	Timestamp NullableString `json:"timestamp,omitempty"`
	// 
	Volume NullableString `json:"volume,omitempty"`
	// 
	Vid *int64 `json:"vid,omitempty"`
}

// NewCurveHourlyVolumeDTO instantiates a new CurveHourlyVolumeDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCurveHourlyVolumeDTO() *CurveHourlyVolumeDTO {
	this := CurveHourlyVolumeDTO{}
	return &this
}

// NewCurveHourlyVolumeDTOWithDefaults instantiates a new CurveHourlyVolumeDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCurveHourlyVolumeDTOWithDefaults() *CurveHourlyVolumeDTO {
	this := CurveHourlyVolumeDTO{}
	return &this
}

// GetEntryTime returns the EntryTime field value if set, zero value otherwise.
func (o *CurveHourlyVolumeDTO) GetEntryTime() time.Time {
	if o == nil || isNil(o.EntryTime) {
		var ret time.Time
		return ret
	}
	return *o.EntryTime
}

// GetEntryTimeOk returns a tuple with the EntryTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveHourlyVolumeDTO) GetEntryTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.EntryTime) {
		return nil, false
	}
	return o.EntryTime, true
}

// HasEntryTime returns a boolean if a field has been set.
func (o *CurveHourlyVolumeDTO) HasEntryTime() bool {
	if o != nil && !isNil(o.EntryTime) {
		return true
	}

	return false
}

// SetEntryTime gets a reference to the given time.Time and assigns it to the EntryTime field.
func (o *CurveHourlyVolumeDTO) SetEntryTime(v time.Time) {
	o.EntryTime = &v
}

// GetRecvTime returns the RecvTime field value if set, zero value otherwise.
func (o *CurveHourlyVolumeDTO) GetRecvTime() time.Time {
	if o == nil || isNil(o.RecvTime) {
		var ret time.Time
		return ret
	}
	return *o.RecvTime
}

// GetRecvTimeOk returns a tuple with the RecvTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveHourlyVolumeDTO) GetRecvTimeOk() (*time.Time, bool) {
	if o == nil || isNil(o.RecvTime) {
		return nil, false
	}
	return o.RecvTime, true
}

// HasRecvTime returns a boolean if a field has been set.
func (o *CurveHourlyVolumeDTO) HasRecvTime() bool {
	if o != nil && !isNil(o.RecvTime) {
		return true
	}

	return false
}

// SetRecvTime gets a reference to the given time.Time and assigns it to the RecvTime field.
func (o *CurveHourlyVolumeDTO) SetRecvTime(v time.Time) {
	o.RecvTime = &v
}

// GetBlockNumber returns the BlockNumber field value if set, zero value otherwise.
func (o *CurveHourlyVolumeDTO) GetBlockNumber() int64 {
	if o == nil || isNil(o.BlockNumber) {
		var ret int64
		return ret
	}
	return *o.BlockNumber
}

// GetBlockNumberOk returns a tuple with the BlockNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveHourlyVolumeDTO) GetBlockNumberOk() (*int64, bool) {
	if o == nil || isNil(o.BlockNumber) {
		return nil, false
	}
	return o.BlockNumber, true
}

// HasBlockNumber returns a boolean if a field has been set.
func (o *CurveHourlyVolumeDTO) HasBlockNumber() bool {
	if o != nil && !isNil(o.BlockNumber) {
		return true
	}

	return false
}

// SetBlockNumber gets a reference to the given int64 and assigns it to the BlockNumber field.
func (o *CurveHourlyVolumeDTO) SetBlockNumber(v int64) {
	o.BlockNumber = &v
}

// GetId returns the Id field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveHourlyVolumeDTO) GetId() string {
	if o == nil || isNil(o.Id.Get()) {
		var ret string
		return ret
	}
	return *o.Id.Get()
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveHourlyVolumeDTO) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Id.Get(), o.Id.IsSet()
}

// HasId returns a boolean if a field has been set.
func (o *CurveHourlyVolumeDTO) HasId() bool {
	if o != nil && o.Id.IsSet() {
		return true
	}

	return false
}

// SetId gets a reference to the given NullableString and assigns it to the Id field.
func (o *CurveHourlyVolumeDTO) SetId(v string) {
	o.Id.Set(&v)
}
// SetIdNil sets the value for Id to be an explicit nil
func (o *CurveHourlyVolumeDTO) SetIdNil() {
	o.Id.Set(nil)
}

// UnsetId ensures that no value is present for Id, not even an explicit nil
func (o *CurveHourlyVolumeDTO) UnsetId() {
	o.Id.Unset()
}

// GetPool returns the Pool field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveHourlyVolumeDTO) GetPool() string {
	if o == nil || isNil(o.Pool.Get()) {
		var ret string
		return ret
	}
	return *o.Pool.Get()
}

// GetPoolOk returns a tuple with the Pool field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveHourlyVolumeDTO) GetPoolOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Pool.Get(), o.Pool.IsSet()
}

// HasPool returns a boolean if a field has been set.
func (o *CurveHourlyVolumeDTO) HasPool() bool {
	if o != nil && o.Pool.IsSet() {
		return true
	}

	return false
}

// SetPool gets a reference to the given NullableString and assigns it to the Pool field.
func (o *CurveHourlyVolumeDTO) SetPool(v string) {
	o.Pool.Set(&v)
}
// SetPoolNil sets the value for Pool to be an explicit nil
func (o *CurveHourlyVolumeDTO) SetPoolNil() {
	o.Pool.Set(nil)
}

// UnsetPool ensures that no value is present for Pool, not even an explicit nil
func (o *CurveHourlyVolumeDTO) UnsetPool() {
	o.Pool.Unset()
}

// GetTimestamp returns the Timestamp field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveHourlyVolumeDTO) GetTimestamp() string {
	if o == nil || isNil(o.Timestamp.Get()) {
		var ret string
		return ret
	}
	return *o.Timestamp.Get()
}

// GetTimestampOk returns a tuple with the Timestamp field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveHourlyVolumeDTO) GetTimestampOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Timestamp.Get(), o.Timestamp.IsSet()
}

// HasTimestamp returns a boolean if a field has been set.
func (o *CurveHourlyVolumeDTO) HasTimestamp() bool {
	if o != nil && o.Timestamp.IsSet() {
		return true
	}

	return false
}

// SetTimestamp gets a reference to the given NullableString and assigns it to the Timestamp field.
func (o *CurveHourlyVolumeDTO) SetTimestamp(v string) {
	o.Timestamp.Set(&v)
}
// SetTimestampNil sets the value for Timestamp to be an explicit nil
func (o *CurveHourlyVolumeDTO) SetTimestampNil() {
	o.Timestamp.Set(nil)
}

// UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
func (o *CurveHourlyVolumeDTO) UnsetTimestamp() {
	o.Timestamp.Unset()
}

// GetVolume returns the Volume field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CurveHourlyVolumeDTO) GetVolume() string {
	if o == nil || isNil(o.Volume.Get()) {
		var ret string
		return ret
	}
	return *o.Volume.Get()
}

// GetVolumeOk returns a tuple with the Volume field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CurveHourlyVolumeDTO) GetVolumeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Volume.Get(), o.Volume.IsSet()
}

// HasVolume returns a boolean if a field has been set.
func (o *CurveHourlyVolumeDTO) HasVolume() bool {
	if o != nil && o.Volume.IsSet() {
		return true
	}

	return false
}

// SetVolume gets a reference to the given NullableString and assigns it to the Volume field.
func (o *CurveHourlyVolumeDTO) SetVolume(v string) {
	o.Volume.Set(&v)
}
// SetVolumeNil sets the value for Volume to be an explicit nil
func (o *CurveHourlyVolumeDTO) SetVolumeNil() {
	o.Volume.Set(nil)
}

// UnsetVolume ensures that no value is present for Volume, not even an explicit nil
func (o *CurveHourlyVolumeDTO) UnsetVolume() {
	o.Volume.Unset()
}

// GetVid returns the Vid field value if set, zero value otherwise.
func (o *CurveHourlyVolumeDTO) GetVid() int64 {
	if o == nil || isNil(o.Vid) {
		var ret int64
		return ret
	}
	return *o.Vid
}

// GetVidOk returns a tuple with the Vid field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CurveHourlyVolumeDTO) GetVidOk() (*int64, bool) {
	if o == nil || isNil(o.Vid) {
		return nil, false
	}
	return o.Vid, true
}

// HasVid returns a boolean if a field has been set.
func (o *CurveHourlyVolumeDTO) HasVid() bool {
	if o != nil && !isNil(o.Vid) {
		return true
	}

	return false
}

// SetVid gets a reference to the given int64 and assigns it to the Vid field.
func (o *CurveHourlyVolumeDTO) SetVid(v int64) {
	o.Vid = &v
}

func (o CurveHourlyVolumeDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CurveHourlyVolumeDTO) ToMap() (map[string]interface{}, error) {
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
	if o.Timestamp.IsSet() {
		toSerialize["timestamp"] = o.Timestamp.Get()
	}
	if o.Volume.IsSet() {
		toSerialize["volume"] = o.Volume.Get()
	}
	if !isNil(o.Vid) {
		toSerialize["vid"] = o.Vid
	}
	return toSerialize, nil
}

type NullableCurveHourlyVolumeDTO struct {
	value *CurveHourlyVolumeDTO
	isSet bool
}

func (v NullableCurveHourlyVolumeDTO) Get() *CurveHourlyVolumeDTO {
	return v.value
}

func (v *NullableCurveHourlyVolumeDTO) Set(val *CurveHourlyVolumeDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCurveHourlyVolumeDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCurveHourlyVolumeDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCurveHourlyVolumeDTO(val *CurveHourlyVolumeDTO) *NullableCurveHourlyVolumeDTO {
	return &NullableCurveHourlyVolumeDTO{value: val, isSet: true}
}

func (v NullableCurveHourlyVolumeDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCurveHourlyVolumeDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


