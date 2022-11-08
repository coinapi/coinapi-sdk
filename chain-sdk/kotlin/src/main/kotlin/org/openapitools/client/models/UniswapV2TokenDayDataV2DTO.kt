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
 * Token data aggregated across all pairs that include token.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
 * @param date Unix timestamp for start of day.
 * @param token Reference to token entity.
 * @param dailyVolumeToken Amount of token swapped across all pairs throughout day.
 * @param dailyVolumeEth Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
 * @param dailyVolumeUsd Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
 * @param dailyTxns Amount of transactions with this token across all pairs.
 * @param totalLiquidityToken Token amount of token deposited across all pairs.
 * @param totalLiquidityEth Token amount of token deposited across all pairs stored as amount of ETH.
 * @param totalLiquidityUsd Token amount of token deposited across all pairs stored as amount of USD.
 * @param priceUsd Price of token in derived USD.
 * @param vid 
 */


data class UniswapV2TokenDayDataV2DTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Token address and day id (day start timestamp in unix / 86400) concatenated with a dash. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Unix timestamp for start of day. */
    @Json(name = "date")
    val date: kotlin.Int? = null,

    /* Reference to token entity. */
    @Json(name = "token")
    val token: kotlin.String? = null,

    /* Amount of token swapped across all pairs throughout day. */
    @Json(name = "daily_volume_token")
    val dailyVolumeToken: kotlin.String? = null,

    /* Amount of token swapped across all pairs throughout day stored as a derived amount of ETH. */
    @Json(name = "daily_volume_eth")
    val dailyVolumeEth: kotlin.String? = null,

    /* Amount of token swapped across all pairs throughout day stored as a derived amount of USD. */
    @Json(name = "daily_volume_usd")
    val dailyVolumeUsd: kotlin.String? = null,

    /* Amount of transactions with this token across all pairs. */
    @Json(name = "daily_txns")
    val dailyTxns: kotlin.String? = null,

    /* Token amount of token deposited across all pairs. */
    @Json(name = "total_liquidity_token")
    val totalLiquidityToken: kotlin.String? = null,

    /* Token amount of token deposited across all pairs stored as amount of ETH. */
    @Json(name = "total_liquidity_eth")
    val totalLiquidityEth: kotlin.String? = null,

    /* Token amount of token deposited across all pairs stored as amount of USD. */
    @Json(name = "total_liquidity_usd")
    val totalLiquidityUsd: kotlin.String? = null,

    /* Price of token in derived USD. */
    @Json(name = "price_usd")
    val priceUsd: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

