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
 * The Uniswap Factory entity is responsible for storing aggregate information across all Uniswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Factory address.
 * @param pairCount Amount of pairs created by the Uniswap factory.
 * @param totalVolumeUsd All time USD volume across all pairs (USD is derived).
 * @param totalVolumeEth All time volume in ETH across all pairs (ETH is derived).
 * @param untrackedVolumeUsd Untracked volume USD.
 * @param totalLiquidityUsd Total liquidity across all pairs stored as a derived USD amount.
 * @param totalLiquidityEth Total liquidity across all pairs stored as a derived ETH amount.
 * @param txCount All time amount of transactions across all pairs.
 * @param vid .
 */


data class UniswapV2UniswapFactoryV2DTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Factory address. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Amount of pairs created by the Uniswap factory. */
    @Json(name = "pair_count")
    val pairCount: kotlin.Int? = null,

    /* All time USD volume across all pairs (USD is derived). */
    @Json(name = "total_volume_usd")
    val totalVolumeUsd: kotlin.String? = null,

    /* All time volume in ETH across all pairs (ETH is derived). */
    @Json(name = "total_volume_eth")
    val totalVolumeEth: kotlin.String? = null,

    /* Untracked volume USD. */
    @Json(name = "untracked_volume_usd")
    val untrackedVolumeUsd: kotlin.String? = null,

    /* Total liquidity across all pairs stored as a derived USD amount. */
    @Json(name = "total_liquidity_usd")
    val totalLiquidityUsd: kotlin.String? = null,

    /* Total liquidity across all pairs stored as a derived ETH amount. */
    @Json(name = "total_liquidity_eth")
    val totalLiquidityEth: kotlin.String? = null,

    /* All time amount of transactions across all pairs. */
    @Json(name = "tx_count")
    val txCount: kotlin.String? = null,

    /* . */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

