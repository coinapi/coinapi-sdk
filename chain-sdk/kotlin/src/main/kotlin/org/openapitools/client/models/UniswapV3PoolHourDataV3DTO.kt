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
 * Hourly stats tracker for pool.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Identifier, format: <pool address>-<day id>
 * @param periodStartUnix Unix timestamp for start of hour.
 * @param pool Pointer to pool.
 * @param liquidity In range liquidity at end of period.
 * @param sqrtPrice Current price tracker at end of period.
 * @param token0Price Price of token0 - derived from sqrtPrice.
 * @param token1Price Price of token1 - derived from sqrtPrice.
 * @param tick Current tick at end of period.
 * @param feeGrowthGlobal0x128 Tracker for global fee growth.
 * @param feeGrowthGlobal1x128 Tracker for global fee growth.
 * @param tvlUsd Total value locked derived in USD at end of period.
 * @param volumeToken0 Volume in token0.
 * @param volumeToken1 Volume in token1.
 * @param volumeUsd Volume in USD.
 * @param feesUsd Fees in USD.
 * @param txCount Number of transactions during period.
 * @param `open` Opening price of token0.
 * @param high High price of token0.
 * @param low Low price of token0.
 * @param close Close price of token0.
 * @param vid 
 */


data class UniswapV3PoolHourDataV3DTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Identifier, format: <pool address>-<day id> */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Unix timestamp for start of hour. */
    @Json(name = "period_start_unix")
    val periodStartUnix: kotlin.Int? = null,

    /* Pointer to pool. */
    @Json(name = "pool")
    val pool: kotlin.String? = null,

    /* In range liquidity at end of period. */
    @Json(name = "liquidity")
    val liquidity: kotlin.String? = null,

    /* Current price tracker at end of period. */
    @Json(name = "sqrt_price")
    val sqrtPrice: kotlin.String? = null,

    /* Price of token0 - derived from sqrtPrice. */
    @Json(name = "token_0_price")
    val token0Price: kotlin.String? = null,

    /* Price of token1 - derived from sqrtPrice. */
    @Json(name = "token_1_price")
    val token1Price: kotlin.String? = null,

    /* Current tick at end of period. */
    @Json(name = "tick")
    val tick: kotlin.String? = null,

    /* Tracker for global fee growth. */
    @Json(name = "fee_growth_global_0x128")
    val feeGrowthGlobal0x128: kotlin.String? = null,

    /* Tracker for global fee growth. */
    @Json(name = "fee_growth_global_1x128")
    val feeGrowthGlobal1x128: kotlin.String? = null,

    /* Total value locked derived in USD at end of period. */
    @Json(name = "tvl_usd")
    val tvlUsd: kotlin.String? = null,

    /* Volume in token0. */
    @Json(name = "volume_token_0")
    val volumeToken0: kotlin.String? = null,

    /* Volume in token1. */
    @Json(name = "volume_token_1")
    val volumeToken1: kotlin.String? = null,

    /* Volume in USD. */
    @Json(name = "volume_usd")
    val volumeUsd: kotlin.String? = null,

    /* Fees in USD. */
    @Json(name = "fees_usd")
    val feesUsd: kotlin.String? = null,

    /* Number of transactions during period. */
    @Json(name = "tx_count")
    val txCount: kotlin.String? = null,

    /* Opening price of token0. */
    @Json(name = "open")
    val `open`: kotlin.String? = null,

    /* High price of token0. */
    @Json(name = "high")
    val high: kotlin.String? = null,

    /* Low price of token0. */
    @Json(name = "low")
    val low: kotlin.String? = null,

    /* Close price of token0. */
    @Json(name = "close")
    val close: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

