/*
 * OEML - REST API
 *
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// OrderStatus Order statuses and the lifecycle are documented in the separate section: <a href=\"#oeml-order-lifecycle\">OEML / Starter Guide / Order Lifecycle</a> 
type OrderStatus string

// List of orderStatus
const (
	RECEIVED OrderStatus = "RECEIVED"
	ROUTING OrderStatus = "ROUTING"
	ROUTED OrderStatus = "ROUTED"
	NEW OrderStatus = "NEW"
	PENDING_CANCEL OrderStatus = "PENDING_CANCEL"
	PARTIALLY_FILLED OrderStatus = "PARTIALLY_FILLED"
	FILLED OrderStatus = "FILLED"
	CANCELED OrderStatus = "CANCELED"
	REJECTED OrderStatus = "REJECTED"
)
