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
import com.squareup.moshi.JsonClass

/**
 * Stores aggregated information for a specific token across all pairs that token is included in.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param vid 
 * @param id Token address.
 * @param symbol Token symbol.
 * @param name Token name.
 * @param decimals Token decimals.
 * @param totalSupply 
 * @param tradeVolume Amount of token traded all time across all pairs.
 * @param tradeVolumeUsd Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).
 * @param untrackedVolumeUsd Amount of token in USD traded all time across pairs (no minimum liquidity threshold).
 * @param txCount 
 * @param totalLiquidity Total amount of token provided as liquidity across all pairs.
 * @param derivedEth ETH per token.
 * @param tokenSymbol 
 */


data class UniswapV2TokenDTO (

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

    /* Token address. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Token symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    /* Token name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Token decimals. */
    @Json(name = "decimals")
    val decimals: kotlin.Int? = null,

    @Json(name = "total_supply")
    val totalSupply: NumericsBigInteger? = null,

    /* Amount of token traded all time across all pairs. */
    @Json(name = "trade_volume")
    val tradeVolume: kotlin.String? = null,

    /* Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold). */
    @Json(name = "trade_volume_usd")
    val tradeVolumeUsd: kotlin.String? = null,

    /* Amount of token in USD traded all time across pairs (no minimum liquidity threshold). */
    @Json(name = "untracked_volume_usd")
    val untrackedVolumeUsd: kotlin.String? = null,

    @Json(name = "tx_count")
    val txCount: NumericsBigInteger? = null,

    /* Total amount of token provided as liquidity across all pairs. */
    @Json(name = "total_liquidity")
    val totalLiquidity: kotlin.String? = null,

    /* ETH per token. */
    @Json(name = "derived_eth")
    val derivedEth: kotlin.String? = null,

    @Json(name = "token_symbol")
    val tokenSymbol: kotlin.String? = null

)

