/**
* OEML - REST API
* This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
*
* The version of the OpenAPI document: v1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Severity

import com.squareup.moshi.Json
/**
 * 
 * @param type Type of message.
 * @param severity 
 * @param exchangeId If message related exchange then identifier of this exchange.
 * @param message Message text.
 */

data class Message (
    /* Type of message. */
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "severity")
    val severity: Severity? = null,
    /* If message related exchange then identifier of this exchange. */
    @Json(name = "exchange_id")
    val exchangeId: kotlin.String? = null,
    /* Message text. */
    @Json(name = "message")
    val message: kotlin.String? = null
)
