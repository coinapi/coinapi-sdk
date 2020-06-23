/*
 * OMS - REST API .
 *
 * OMS Project
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// Position struct for Position
type Position struct {
	// Result type.
	Type string `json:"type,omitempty"`
	// Name of exchange.
	ExchangeName string `json:"exchange_name,omitempty"`
	Data []PositionData `json:"data,omitempty"`
}
