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
import org.openapitools.client.models.TransactionsETradeAggressiveSide

import com.squareup.moshi.Json

/**
 * Swap are created for each token swap within a pair.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param vid 
 * @param id Identifier, format: transaction hash + \"#\" + index in swaps Transaction array.
 * @param transaction Pointer to transaction.
 * @param timestamp Timestamp of transaction.
 * @param pool Pool swap occured within.
 * @param token0 Reference to token0 as stored in pair contract.
 * @param token1 Reference to token1 as stored in pair contract.
 * @param sender Sender of the swap.
 * @param recipient Recipient of the swap.
 * @param origin Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
 * @param amount0 Delta of token0 swapped.
 * @param amount1 Delta of token1 swapped.
 * @param amountUsd Derived amount of tokens sold in USD.
 * @param sqrtPriceX96 
 * @param tick 
 * @param logIndex 
 * @param evaluatedPrice 
 * @param evaluatedAmount 
 * @param evaluatedAggressor 
 * @param poolId 
 * @param transactionId 
 */


data class UniswapV3SwapDTO (

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

    /* Identifier, format: transaction hash + \"#\" + index in swaps Transaction array. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Pointer to transaction. */
    @Json(name = "transaction")
    val transaction: kotlin.String? = null,

    /* Timestamp of transaction. */
    @Json(name = "timestamp")
    val timestamp: java.time.OffsetDateTime? = null,

    /* Pool swap occured within. */
    @Json(name = "pool")
    val pool: kotlin.String? = null,

    /* Reference to token0 as stored in pair contract. */
    @Json(name = "token_0")
    val token0: kotlin.String? = null,

    /* Reference to token1 as stored in pair contract. */
    @Json(name = "token_1")
    val token1: kotlin.String? = null,

    /* Sender of the swap. */
    @Json(name = "sender")
    val sender: kotlin.String? = null,

    /* Recipient of the swap. */
    @Json(name = "recipient")
    val recipient: kotlin.String? = null,

    /* Transaction origin: the EOA (Externally Owned Account) that initiated the transaction */
    @Json(name = "origin")
    val origin: kotlin.String? = null,

    /* Delta of token0 swapped. */
    @Json(name = "amount_0")
    val amount0: kotlin.String? = null,

    /* Delta of token1 swapped. */
    @Json(name = "amount_1")
    val amount1: kotlin.String? = null,

    /* Derived amount of tokens sold in USD. */
    @Json(name = "amount_usd")
    val amountUsd: kotlin.String? = null,

    @Json(name = "sqrt_price_x96")
    val sqrtPriceX96: NumericsBigInteger? = null,

    @Json(name = "tick")
    val tick: NumericsBigInteger? = null,

    @Json(name = "log_index")
    val logIndex: NumericsBigInteger? = null,

    @Json(name = "evaluated_price")
    val evaluatedPrice: kotlin.Double? = null,

    @Json(name = "evaluated_amount")
    val evaluatedAmount: kotlin.Double? = null,

    @Json(name = "evaluated_aggressor")
    val evaluatedAggressor: TransactionsETradeAggressiveSide? = null,

    @Json(name = "pool_id")
    val poolId: kotlin.String? = null,

    @Json(name = "transaction_id")
    val transactionId: kotlin.String? = null

)

