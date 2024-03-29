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
 * Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned LP tokens, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Identifier, format: (transaction id):(transaction.burns.length).
 * @param transaction Reference to the transaction Burn was included in.
 * @param timestamp Timestamp of Burn, used to sort recent liquidity removals.
 * @param pair Reference to pair.
 * @param liquidity Amount of liquidity tokens burned.
 * @param sender Address that initiated the liquidity removal.
 * @param amount0 Amount of token0 removed.
 * @param amount1 Amount of token1 removed.
 * @param to Recipient of tokens.
 * @param logIndex Index in the transaction event was emitted.
 * @param amountUsd Derived amount based on available prices of tokens.
 * @param complete 
 * @param feeTo Address of fee recipient (if fee is on).
 * @param feeLiquidity Amount of tokens sent to fee recipient (if fee is on).
 * @param vid 
 */


data class SushiswapBurnDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Identifier, format: (transaction id):(transaction.burns.length). */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Reference to the transaction Burn was included in. */
    @Json(name = "transaction")
    val transaction: kotlin.String? = null,

    /* Timestamp of Burn, used to sort recent liquidity removals. */
    @Json(name = "timestamp")
    val timestamp: kotlin.String? = null,

    /* Reference to pair. */
    @Json(name = "pair")
    val pair: kotlin.String? = null,

    /* Amount of liquidity tokens burned. */
    @Json(name = "liquidity")
    val liquidity: kotlin.String? = null,

    /* Address that initiated the liquidity removal. */
    @Json(name = "sender")
    val sender: kotlin.String? = null,

    /* Amount of token0 removed. */
    @Json(name = "amount_0")
    val amount0: kotlin.String? = null,

    /* Amount of token1 removed. */
    @Json(name = "amount_1")
    val amount1: kotlin.String? = null,

    /* Recipient of tokens. */
    @Json(name = "to")
    val to: kotlin.String? = null,

    /* Index in the transaction event was emitted. */
    @Json(name = "log_index")
    val logIndex: kotlin.String? = null,

    /* Derived amount based on available prices of tokens. */
    @Json(name = "amount_usd")
    val amountUsd: kotlin.String? = null,

    /*  */
    @Json(name = "complete")
    val complete: kotlin.Boolean? = null,

    /* Address of fee recipient (if fee is on). */
    @Json(name = "fee_to")
    val feeTo: kotlin.String? = null,

    /* Amount of tokens sent to fee recipient (if fee is on). */
    @Json(name = "fee_liquidity")
    val feeLiquidity: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

