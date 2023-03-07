/*
EMS - REST API

This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 

API version: v1
Contact: support@coinapi.io
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the OrderNewSingleRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OrderNewSingleRequest{}

// OrderNewSingleRequest The new order message.
type OrderNewSingleRequest struct {
	// Exchange identifier used to identify the routing destination.
	ExchangeId string `json:"exchange_id"`
	// The unique identifier of the order assigned by the client.
	ClientOrderId string `json:"client_order_id"`
	// Exchange symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.
	SymbolIdExchange *string `json:"symbol_id_exchange,omitempty"`
	// CoinAPI symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.
	SymbolIdCoinapi *string `json:"symbol_id_coinapi,omitempty"`
	// Order quantity.
	AmountOrder float32 `json:"amount_order"`
	// Order price.
	Price float32 `json:"price"`
	Side OrdSide `json:"side"`
	OrderType OrdType `json:"order_type"`
	TimeInForce TimeInForce `json:"time_in_force"`
	// Expiration time. Conditionaly required for orders with time_in_force = `GOOD_TILL_TIME_EXCHANGE` or `GOOD_TILL_TIME_OEML`.
	ExpireTime *string `json:"expire_time,omitempty"`
	// Order execution instructions are documented in the separate section: <a href=\"#ems-order-params-exec\">EMS / Starter Guide / Order parameters / Execution instructions</a> 
	ExecInst []string `json:"exec_inst,omitempty"`
}

// NewOrderNewSingleRequest instantiates a new OrderNewSingleRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOrderNewSingleRequest(exchangeId string, clientOrderId string, amountOrder float32, price float32, side OrdSide, orderType OrdType, timeInForce TimeInForce) *OrderNewSingleRequest {
	this := OrderNewSingleRequest{}
	this.ExchangeId = exchangeId
	this.ClientOrderId = clientOrderId
	this.AmountOrder = amountOrder
	this.Price = price
	this.Side = side
	this.OrderType = orderType
	this.TimeInForce = timeInForce
	return &this
}

// NewOrderNewSingleRequestWithDefaults instantiates a new OrderNewSingleRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOrderNewSingleRequestWithDefaults() *OrderNewSingleRequest {
	this := OrderNewSingleRequest{}
	return &this
}

// GetExchangeId returns the ExchangeId field value
func (o *OrderNewSingleRequest) GetExchangeId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ExchangeId
}

// GetExchangeIdOk returns a tuple with the ExchangeId field value
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetExchangeIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ExchangeId, true
}

// SetExchangeId sets field value
func (o *OrderNewSingleRequest) SetExchangeId(v string) {
	o.ExchangeId = v
}

// GetClientOrderId returns the ClientOrderId field value
func (o *OrderNewSingleRequest) GetClientOrderId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ClientOrderId
}

// GetClientOrderIdOk returns a tuple with the ClientOrderId field value
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetClientOrderIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ClientOrderId, true
}

// SetClientOrderId sets field value
func (o *OrderNewSingleRequest) SetClientOrderId(v string) {
	o.ClientOrderId = v
}

// GetSymbolIdExchange returns the SymbolIdExchange field value if set, zero value otherwise.
func (o *OrderNewSingleRequest) GetSymbolIdExchange() string {
	if o == nil || IsNil(o.SymbolIdExchange) {
		var ret string
		return ret
	}
	return *o.SymbolIdExchange
}

// GetSymbolIdExchangeOk returns a tuple with the SymbolIdExchange field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetSymbolIdExchangeOk() (*string, bool) {
	if o == nil || IsNil(o.SymbolIdExchange) {
		return nil, false
	}
	return o.SymbolIdExchange, true
}

// HasSymbolIdExchange returns a boolean if a field has been set.
func (o *OrderNewSingleRequest) HasSymbolIdExchange() bool {
	if o != nil && !IsNil(o.SymbolIdExchange) {
		return true
	}

	return false
}

// SetSymbolIdExchange gets a reference to the given string and assigns it to the SymbolIdExchange field.
func (o *OrderNewSingleRequest) SetSymbolIdExchange(v string) {
	o.SymbolIdExchange = &v
}

// GetSymbolIdCoinapi returns the SymbolIdCoinapi field value if set, zero value otherwise.
func (o *OrderNewSingleRequest) GetSymbolIdCoinapi() string {
	if o == nil || IsNil(o.SymbolIdCoinapi) {
		var ret string
		return ret
	}
	return *o.SymbolIdCoinapi
}

// GetSymbolIdCoinapiOk returns a tuple with the SymbolIdCoinapi field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetSymbolIdCoinapiOk() (*string, bool) {
	if o == nil || IsNil(o.SymbolIdCoinapi) {
		return nil, false
	}
	return o.SymbolIdCoinapi, true
}

// HasSymbolIdCoinapi returns a boolean if a field has been set.
func (o *OrderNewSingleRequest) HasSymbolIdCoinapi() bool {
	if o != nil && !IsNil(o.SymbolIdCoinapi) {
		return true
	}

	return false
}

// SetSymbolIdCoinapi gets a reference to the given string and assigns it to the SymbolIdCoinapi field.
func (o *OrderNewSingleRequest) SetSymbolIdCoinapi(v string) {
	o.SymbolIdCoinapi = &v
}

// GetAmountOrder returns the AmountOrder field value
func (o *OrderNewSingleRequest) GetAmountOrder() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.AmountOrder
}

// GetAmountOrderOk returns a tuple with the AmountOrder field value
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetAmountOrderOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.AmountOrder, true
}

// SetAmountOrder sets field value
func (o *OrderNewSingleRequest) SetAmountOrder(v float32) {
	o.AmountOrder = v
}

// GetPrice returns the Price field value
func (o *OrderNewSingleRequest) GetPrice() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Price
}

// GetPriceOk returns a tuple with the Price field value
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetPriceOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Price, true
}

// SetPrice sets field value
func (o *OrderNewSingleRequest) SetPrice(v float32) {
	o.Price = v
}

// GetSide returns the Side field value
func (o *OrderNewSingleRequest) GetSide() OrdSide {
	if o == nil {
		var ret OrdSide
		return ret
	}

	return o.Side
}

// GetSideOk returns a tuple with the Side field value
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetSideOk() (*OrdSide, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Side, true
}

// SetSide sets field value
func (o *OrderNewSingleRequest) SetSide(v OrdSide) {
	o.Side = v
}

// GetOrderType returns the OrderType field value
func (o *OrderNewSingleRequest) GetOrderType() OrdType {
	if o == nil {
		var ret OrdType
		return ret
	}

	return o.OrderType
}

// GetOrderTypeOk returns a tuple with the OrderType field value
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetOrderTypeOk() (*OrdType, bool) {
	if o == nil {
		return nil, false
	}
	return &o.OrderType, true
}

// SetOrderType sets field value
func (o *OrderNewSingleRequest) SetOrderType(v OrdType) {
	o.OrderType = v
}

// GetTimeInForce returns the TimeInForce field value
func (o *OrderNewSingleRequest) GetTimeInForce() TimeInForce {
	if o == nil {
		var ret TimeInForce
		return ret
	}

	return o.TimeInForce
}

// GetTimeInForceOk returns a tuple with the TimeInForce field value
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetTimeInForceOk() (*TimeInForce, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TimeInForce, true
}

// SetTimeInForce sets field value
func (o *OrderNewSingleRequest) SetTimeInForce(v TimeInForce) {
	o.TimeInForce = v
}

// GetExpireTime returns the ExpireTime field value if set, zero value otherwise.
func (o *OrderNewSingleRequest) GetExpireTime() string {
	if o == nil || IsNil(o.ExpireTime) {
		var ret string
		return ret
	}
	return *o.ExpireTime
}

// GetExpireTimeOk returns a tuple with the ExpireTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetExpireTimeOk() (*string, bool) {
	if o == nil || IsNil(o.ExpireTime) {
		return nil, false
	}
	return o.ExpireTime, true
}

// HasExpireTime returns a boolean if a field has been set.
func (o *OrderNewSingleRequest) HasExpireTime() bool {
	if o != nil && !IsNil(o.ExpireTime) {
		return true
	}

	return false
}

// SetExpireTime gets a reference to the given string and assigns it to the ExpireTime field.
func (o *OrderNewSingleRequest) SetExpireTime(v string) {
	o.ExpireTime = &v
}

// GetExecInst returns the ExecInst field value if set, zero value otherwise.
func (o *OrderNewSingleRequest) GetExecInst() []string {
	if o == nil || IsNil(o.ExecInst) {
		var ret []string
		return ret
	}
	return o.ExecInst
}

// GetExecInstOk returns a tuple with the ExecInst field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OrderNewSingleRequest) GetExecInstOk() ([]string, bool) {
	if o == nil || IsNil(o.ExecInst) {
		return nil, false
	}
	return o.ExecInst, true
}

// HasExecInst returns a boolean if a field has been set.
func (o *OrderNewSingleRequest) HasExecInst() bool {
	if o != nil && !IsNil(o.ExecInst) {
		return true
	}

	return false
}

// SetExecInst gets a reference to the given []string and assigns it to the ExecInst field.
func (o *OrderNewSingleRequest) SetExecInst(v []string) {
	o.ExecInst = v
}

func (o OrderNewSingleRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OrderNewSingleRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["exchange_id"] = o.ExchangeId
	toSerialize["client_order_id"] = o.ClientOrderId
	if !IsNil(o.SymbolIdExchange) {
		toSerialize["symbol_id_exchange"] = o.SymbolIdExchange
	}
	if !IsNil(o.SymbolIdCoinapi) {
		toSerialize["symbol_id_coinapi"] = o.SymbolIdCoinapi
	}
	toSerialize["amount_order"] = o.AmountOrder
	toSerialize["price"] = o.Price
	toSerialize["side"] = o.Side
	toSerialize["order_type"] = o.OrderType
	toSerialize["time_in_force"] = o.TimeInForce
	if !IsNil(o.ExpireTime) {
		toSerialize["expire_time"] = o.ExpireTime
	}
	if !IsNil(o.ExecInst) {
		toSerialize["exec_inst"] = o.ExecInst
	}
	return toSerialize, nil
}

type NullableOrderNewSingleRequest struct {
	value *OrderNewSingleRequest
	isSet bool
}

func (v NullableOrderNewSingleRequest) Get() *OrderNewSingleRequest {
	return v.value
}

func (v *NullableOrderNewSingleRequest) Set(val *OrderNewSingleRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableOrderNewSingleRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableOrderNewSingleRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOrderNewSingleRequest(val *OrderNewSingleRequest) *NullableOrderNewSingleRequest {
	return &NullableOrderNewSingleRequest{value: val, isSet: true}
}

func (v NullableOrderNewSingleRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOrderNewSingleRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


