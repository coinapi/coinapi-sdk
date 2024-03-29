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
 * @param volume Volume in token units.
 * @param volumeUsd Volume in derived USD.
 * @param untrackedVolumeUsd Volume in USD even on pools with less reliable USD values.
 * @param feesUsd Fees in USD.
 * @param txCount 
 * @param poolCount 
 * @param totalValueLocked Liquidity across all pools in token units.
 * @param totalValueLockedUsd Liquidity across all pools in derived USD.
 * @param totalValueLockedUsdUntracked TVL derived in USD untracked.
 * @param derivedEth Derived price in ETH.
 * @param whitelistPools Pools token is in that are white listed for USD pricing.
 * @param tokenSymbol 
 */


data class UniswapV3TokenDTO (

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

    /* Volume in token units. */
    @Json(name = "volume")
    val volume: kotlin.String? = null,

    /* Volume in derived USD. */
    @Json(name = "volume_usd")
    val volumeUsd: kotlin.String? = null,

    /* Volume in USD even on pools with less reliable USD values. */
    @Json(name = "untracked_volume_usd")
    val untrackedVolumeUsd: kotlin.String? = null,

    /* Fees in USD. */
    @Json(name = "fees_usd")
    val feesUsd: kotlin.String? = null,

    @Json(name = "tx_count")
    val txCount: NumericsBigInteger? = null,

    @Json(name = "pool_count")
    val poolCount: NumericsBigInteger? = null,

    /* Liquidity across all pools in token units. */
    @Json(name = "total_value_locked")
    val totalValueLocked: kotlin.String? = null,

    /* Liquidity across all pools in derived USD. */
    @Json(name = "total_value_locked_usd")
    val totalValueLockedUsd: kotlin.String? = null,

    /* TVL derived in USD untracked. */
    @Json(name = "total_value_locked_usd_untracked")
    val totalValueLockedUsdUntracked: kotlin.String? = null,

    /* Derived price in ETH. */
    @Json(name = "derived_eth")
    val derivedEth: kotlin.String? = null,

    /* Pools token is in that are white listed for USD pricing. */
    @Json(name = "whitelist_pools")
    val whitelistPools: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "token_symbol")
    val tokenSymbol: kotlin.String? = null

)

