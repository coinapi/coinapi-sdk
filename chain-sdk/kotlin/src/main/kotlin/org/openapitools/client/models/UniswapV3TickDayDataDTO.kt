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
import com.squareup.moshi.JsonClass

/**
 * Data accumulated and condensed into day stats for each exchange. Entity gets saved only if there is a change during the day
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Identifier, format: (pool address)-(tick index)-(timestamp).
 * @param date Timestamp rounded to current day by dividing by 86400.
 * @param pool Pointer to pool.
 * @param tick Pointer to tick.
 * @param liquidityGross Total liquidity pool has as tick lower or upper at end of period.
 * @param liquidityNet How much liquidity changes when tick crossed at end of period.
 * @param volumeToken0 Hourly volume of token0 with this tick in range.
 * @param volumeToken1 Hourly volume of token1 with this tick in range.
 * @param volumeUsd Hourly volume in derived USD with this tick in range.
 * @param feesUsd Fees in USD.
 * @param feeGrowthOutside0x128 Variable needed for fee computation.
 * @param feeGrowthOutside1x128 Variable needed for fee computation.
 * @param vid 
 */


data class UniswapV3TickDayDataDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Identifier, format: (pool address)-(tick index)-(timestamp). */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Timestamp rounded to current day by dividing by 86400. */
    @Json(name = "date")
    val date: kotlin.Int? = null,

    /* Pointer to pool. */
    @Json(name = "pool")
    val pool: kotlin.String? = null,

    /* Pointer to tick. */
    @Json(name = "tick")
    val tick: kotlin.String? = null,

    /* Total liquidity pool has as tick lower or upper at end of period. */
    @Json(name = "liquidity_gross")
    val liquidityGross: kotlin.String? = null,

    /* How much liquidity changes when tick crossed at end of period. */
    @Json(name = "liquidity_net")
    val liquidityNet: kotlin.String? = null,

    /* Hourly volume of token0 with this tick in range. */
    @Json(name = "volume_token_0")
    val volumeToken0: kotlin.String? = null,

    /* Hourly volume of token1 with this tick in range. */
    @Json(name = "volume_token_1")
    val volumeToken1: kotlin.String? = null,

    /* Hourly volume in derived USD with this tick in range. */
    @Json(name = "volume_usd")
    val volumeUsd: kotlin.String? = null,

    /* Fees in USD. */
    @Json(name = "fees_usd")
    val feesUsd: kotlin.String? = null,

    /* Variable needed for fee computation. */
    @Json(name = "fee_growth_outside_0x128")
    val feeGrowthOutside0x128: kotlin.String? = null,

    /* Variable needed for fee computation. */
    @Json(name = "fee_growth_outside_1x128")
    val feeGrowthOutside1x128: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

