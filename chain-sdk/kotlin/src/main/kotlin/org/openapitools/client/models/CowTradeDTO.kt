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

import org.openapitools.client.models.TransactionsETradeAggressiveSide

import com.squareup.moshi.Json

/**
 * Trade entity.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Identifier, format: <order id>|<transaction hash>|<event index>.
 * @param timestamp Block's timestamp.
 * @param gasPrice Transaction's gas price.
 * @param gasLimit Transaction's gas limit.
 * @param feeAmount Trade's fee amount.
 * @param txHash Trade event transaction hash.
 * @param settlement Reference to settlement.
 * @param buyAmount Buy amount.
 * @param sellAmount Sell amount.
 * @param sellToken Address of token that is sold.
 * @param buyToken Address of token that is bought.
 * @param order Reference to order.
 * @param vid 
 * @param poolId 
 * @param transactionId 
 * @param evaluatedPrice 
 * @param evaluatedAmount 
 * @param evaluatedAggressor 
 */


data class CowTradeDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Identifier, format: <order id>|<transaction hash>|<event index>. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Block's timestamp. */
    @Json(name = "timestamp")
    val timestamp: kotlin.String? = null,

    /* Transaction's gas price. */
    @Json(name = "gas_price")
    val gasPrice: kotlin.String? = null,

    /* Transaction's gas limit. */
    @Json(name = "gas_limit")
    val gasLimit: kotlin.String? = null,

    /* Trade's fee amount. */
    @Json(name = "fee_amount")
    val feeAmount: kotlin.String? = null,

    /* Trade event transaction hash. */
    @Json(name = "tx_hash")
    val txHash: kotlin.String? = null,

    /* Reference to settlement. */
    @Json(name = "settlement")
    val settlement: kotlin.String? = null,

    /* Buy amount. */
    @Json(name = "buy_amount")
    val buyAmount: kotlin.String? = null,

    /* Sell amount. */
    @Json(name = "sell_amount")
    val sellAmount: kotlin.String? = null,

    /* Address of token that is sold. */
    @Json(name = "sell_token")
    val sellToken: kotlin.String? = null,

    /* Address of token that is bought. */
    @Json(name = "buy_token")
    val buyToken: kotlin.String? = null,

    /* Reference to order. */
    @Json(name = "order")
    val order: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null,

    @Json(name = "pool_id")
    val poolId: kotlin.String? = null,

    @Json(name = "transaction_id")
    val transactionId: kotlin.String? = null,

    @Json(name = "evaluated_price")
    val evaluatedPrice: kotlin.Double? = null,

    @Json(name = "evaluated_amount")
    val evaluatedAmount: kotlin.Double? = null,

    @Json(name = "evaluated_aggressor")
    val evaluatedAggressor: TransactionsETradeAggressiveSide? = null

)

