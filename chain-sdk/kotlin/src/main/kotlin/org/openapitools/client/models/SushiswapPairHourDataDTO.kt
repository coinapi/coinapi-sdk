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
 * Tracks pair data across each hour.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Identifier, format: <pair id>-<hour start timestamp>.
 * @param date Hour start timestamp.
 * @param pair Reference to pair.
 * @param reserve0 Reserve of token0 (updated during each transaction on pair).
 * @param reserve1 Reserve of token1 (updated during each transaction on pair).
 * @param reserveUsd Reserve of token0 plus token1 stored as a derived USD amount.
 * @param volumeToken0 Total amount of token0 swapped throughout hour.
 * @param volumeToken1 Total amount of token1 swapped throughout hour.
 * @param volumeUsd Total volume within pair throughout hour.
 * @param txCount Amount of transactions on pair throughout hour.
 * @param vid 
 */


data class SushiswapPairHourDataDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Identifier, format: <pair id>-<hour start timestamp>. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Hour start timestamp. */
    @Json(name = "date")
    val date: kotlin.Int? = null,

    /* Reference to pair. */
    @Json(name = "pair")
    val pair: kotlin.String? = null,

    /* Reserve of token0 (updated during each transaction on pair). */
    @Json(name = "reserve_0")
    val reserve0: kotlin.String? = null,

    /* Reserve of token1 (updated during each transaction on pair). */
    @Json(name = "reserve_1")
    val reserve1: kotlin.String? = null,

    /* Reserve of token0 plus token1 stored as a derived USD amount. */
    @Json(name = "reserve_usd")
    val reserveUsd: kotlin.String? = null,

    /* Total amount of token0 swapped throughout hour. */
    @Json(name = "volume_token_0")
    val volumeToken0: kotlin.String? = null,

    /* Total amount of token1 swapped throughout hour. */
    @Json(name = "volume_token_1")
    val volumeToken1: kotlin.String? = null,

    /* Total volume within pair throughout hour. */
    @Json(name = "volume_usd")
    val volumeUsd: kotlin.String? = null,

    /* Amount of transactions on pair throughout hour. */
    @Json(name = "tx_count")
    val txCount: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

