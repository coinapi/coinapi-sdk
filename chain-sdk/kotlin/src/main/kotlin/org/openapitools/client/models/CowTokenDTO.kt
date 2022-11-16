/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * Stores information for a specific token across all pairs that token is included in.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Token's address.
 * @param address Token's address.
 * @param firstTradeTimestamp First token trade block timestamp.
 * @param name Token name fetched by ERC20 contract call.
 * @param symbol Token symbol fetched by contract call.
 * @param decimals Token decimals fetched by contract call.
 * @param totalVolume Sum of total amount traded for this token.
 * @param vid 
 * @param tokenSymbol 
 */


data class CowTokenDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Token's address. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Token's address. */
    @Json(name = "address")
    val address: kotlin.String? = null,

    /* First token trade block timestamp. */
    @Json(name = "first_trade_timestamp")
    val firstTradeTimestamp: kotlin.String? = null,

    /* Token name fetched by ERC20 contract call. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Token symbol fetched by contract call. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    /* Token decimals fetched by contract call. */
    @Json(name = "decimals")
    val decimals: kotlin.Int? = null,

    /* Sum of total amount traded for this token. */
    @Json(name = "total_volume")
    val totalVolume: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null,

    @Json(name = "token_symbol")
    val tokenSymbol: kotlin.String? = null

)

