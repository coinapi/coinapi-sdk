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

import org.openapitools.client.models.NumericsBigInteger

import com.squareup.moshi.Json

/**
 * Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param vid 
 * @param id Pair contract address.
 * @param token0 Reference to token0 as stored in pair contract.
 * @param token1 Reference to token1 as stored in pair contract.
 * @param reserve0 Reserve of token0.
 * @param reserve1 Reserve of token1.
 * @param totalSupply Total supply of liquidity token distributed to LPs.
 * @param reserveEth Total liquidity in pair stored as an amount of ETH.
 * @param reserveUsd Total liquidity amount in pair stored as an amount of USD.
 * @param trackedReserveEth Total liquidity with only tracked amount.
 * @param token0Price Token0 per token1.
 * @param token1Price Token1 per token0.
 * @param volumeToken0 Amount of token0 swapped on this pair.
 * @param volumeToken1 Amount of token1 swapped on this pair.
 * @param volumeUsd Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold).
 * @param untrackedVolumeUsd Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold.
 * @param txCount 
 * @param createdAtTimestamp Timestamp contract was created.
 * @param liquidityProviderCount Total number of LPs.
 * @param evaluatedAsk 
 */


data class UniswapV2PairDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null,

    /* Pair contract address. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Reference to token0 as stored in pair contract. */
    @Json(name = "token_0")
    val token0: kotlin.String? = null,

    /* Reference to token1 as stored in pair contract. */
    @Json(name = "token_1")
    val token1: kotlin.String? = null,

    /* Reserve of token0. */
    @Json(name = "reserve_0")
    val reserve0: kotlin.String? = null,

    /* Reserve of token1. */
    @Json(name = "reserve_1")
    val reserve1: kotlin.String? = null,

    /* Total supply of liquidity token distributed to LPs. */
    @Json(name = "total_supply")
    val totalSupply: kotlin.String? = null,

    /* Total liquidity in pair stored as an amount of ETH. */
    @Json(name = "reserve_eth")
    val reserveEth: kotlin.String? = null,

    /* Total liquidity amount in pair stored as an amount of USD. */
    @Json(name = "reserve_usd")
    val reserveUsd: kotlin.String? = null,

    /* Total liquidity with only tracked amount. */
    @Json(name = "tracked_reserve_eth")
    val trackedReserveEth: kotlin.String? = null,

    /* Token0 per token1. */
    @Json(name = "token_0_price")
    val token0Price: kotlin.String? = null,

    /* Token1 per token0. */
    @Json(name = "token_1_price")
    val token1Price: kotlin.String? = null,

    /* Amount of token0 swapped on this pair. */
    @Json(name = "volume_token_0")
    val volumeToken0: kotlin.String? = null,

    /* Amount of token1 swapped on this pair. */
    @Json(name = "volume_token_1")
    val volumeToken1: kotlin.String? = null,

    /* Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold). */
    @Json(name = "volume_usd")
    val volumeUsd: kotlin.String? = null,

    /* Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold. */
    @Json(name = "untracked_volume_usd")
    val untrackedVolumeUsd: kotlin.String? = null,

    @Json(name = "tx_count")
    val txCount: NumericsBigInteger? = null,

    /* Timestamp contract was created. */
    @Json(name = "created_at_timestamp")
    val createdAtTimestamp: java.time.OffsetDateTime? = null,

    /* Total number of LPs. */
    @Json(name = "liquidity_provider_count")
    val liquidityProviderCount: kotlin.String? = null,

    @Json(name = "evaluated_ask")
    val evaluatedAsk: kotlin.Double? = null

)

