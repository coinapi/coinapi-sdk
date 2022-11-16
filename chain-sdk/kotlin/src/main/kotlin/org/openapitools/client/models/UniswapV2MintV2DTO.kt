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
 * Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, who received the liquidity, and more. This entity can be used to track liquidity provisions on pairs.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Transaction hash plus index in the transaction mint array.
 * @param transaction Reference to the transaction Mint was included in.
 * @param timestamp Timestamp of Mint, used to sort recent liquidity provisions.
 * @param pair Reference to pair.
 * @param to Recipient of liquidity tokens.
 * @param liquidity Amount of liquidity tokens minted.
 * @param sender Address that initiated the liquidity provision.
 * @param amount0 Amount of token0 provided.
 * @param amount1 Amount of token1 provided.
 * @param logIndex Index in the transaction event was emitted.
 * @param amountUsd Derived USD value of token0 amount plus token1 amount.
 * @param feeTo Address of fee recipient (if fee is on).
 * @param feeLiquidity Amount of liquidity sent to fee recipient (if fee is on).
 * @param vid 
 * @param blockRange 
 */


data class UniswapV2MintV2DTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Transaction hash plus index in the transaction mint array. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Reference to the transaction Mint was included in. */
    @Json(name = "transaction")
    val transaction: kotlin.String? = null,

    /* Timestamp of Mint, used to sort recent liquidity provisions. */
    @Json(name = "timestamp")
    val timestamp: kotlin.String? = null,

    /* Reference to pair. */
    @Json(name = "pair")
    val pair: kotlin.String? = null,

    /* Recipient of liquidity tokens. */
    @Json(name = "to")
    val to: kotlin.String? = null,

    /* Amount of liquidity tokens minted. */
    @Json(name = "liquidity")
    val liquidity: kotlin.String? = null,

    /* Address that initiated the liquidity provision. */
    @Json(name = "sender")
    val sender: kotlin.String? = null,

    /* Amount of token0 provided. */
    @Json(name = "amount_0")
    val amount0: kotlin.String? = null,

    /* Amount of token1 provided. */
    @Json(name = "amount_1")
    val amount1: kotlin.String? = null,

    /* Index in the transaction event was emitted. */
    @Json(name = "log_index")
    val logIndex: kotlin.String? = null,

    /* Derived USD value of token0 amount plus token1 amount. */
    @Json(name = "amount_usd")
    val amountUsd: kotlin.String? = null,

    /* Address of fee recipient (if fee is on). */
    @Json(name = "fee_to")
    val feeTo: kotlin.String? = null,

    /* Amount of liquidity sent to fee recipient (if fee is on). */
    @Json(name = "fee_liquidity")
    val feeLiquidity: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null,

    /*  */
    @Json(name = "block_range")
    val blockRange: kotlin.String? = null

)

