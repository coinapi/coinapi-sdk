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
 * Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Identifier, format: (owner address)-(order id)
 * @param owner Reference to owner.
 * @param orderId Order id.
 * @param fromBatchId Batch id from which order became valid.
 * @param fromEpoch Start of epoch in which order was placed and became valid.
 * @param untilBatchId Batch id until which trade was still valid.
 * @param untilEpoch End of epoch in which order was placed.
 * @param buyToken Identifier of token that was bought.
 * @param sellToken Identifier of token that was sold.
 * @param priceNumerator Price enumerator.
 * @param priceDenominator Price denominator.
 * @param maxSellAmount Maximum sell amount.
 * @param minReceiveAmount Minimum receive amount.
 * @param soldVolume Sold volume.
 * @param boughtVolume Bought volume.
 * @param createEpoch Epoch in which order was created.
 * @param cancelEpoch Epoch in which order was cancelled.
 * @param deleteEpoch Epoch in which order was deleted.
 * @param txHash Transaction hash.
 * @param txLogIndex Event index within transaction.
 * @param vid 
 */


data class DexOrderDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Identifier, format: (owner address)-(order id) */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Reference to owner. */
    @Json(name = "owner")
    val owner: kotlin.String? = null,

    /* Order id. */
    @Json(name = "order_id")
    val orderId: kotlin.Int? = null,

    /* Batch id from which order became valid. */
    @Json(name = "from_batch_id")
    val fromBatchId: kotlin.String? = null,

    /* Start of epoch in which order was placed and became valid. */
    @Json(name = "from_epoch")
    val fromEpoch: kotlin.String? = null,

    /* Batch id until which trade was still valid. */
    @Json(name = "until_batch_id")
    val untilBatchId: kotlin.String? = null,

    /* End of epoch in which order was placed. */
    @Json(name = "until_epoch")
    val untilEpoch: kotlin.String? = null,

    /* Identifier of token that was bought. */
    @Json(name = "buy_token")
    val buyToken: kotlin.String? = null,

    /* Identifier of token that was sold. */
    @Json(name = "sell_token")
    val sellToken: kotlin.String? = null,

    /* Price enumerator. */
    @Json(name = "price_numerator")
    val priceNumerator: kotlin.String? = null,

    /* Price denominator. */
    @Json(name = "price_denominator")
    val priceDenominator: kotlin.String? = null,

    /* Maximum sell amount. */
    @Json(name = "max_sell_amount")
    val maxSellAmount: kotlin.String? = null,

    /* Minimum receive amount. */
    @Json(name = "min_receive_amount")
    val minReceiveAmount: kotlin.String? = null,

    /* Sold volume. */
    @Json(name = "sold_volume")
    val soldVolume: kotlin.String? = null,

    /* Bought volume. */
    @Json(name = "bought_volume")
    val boughtVolume: kotlin.String? = null,

    /* Epoch in which order was created. */
    @Json(name = "create_epoch")
    val createEpoch: kotlin.String? = null,

    /* Epoch in which order was cancelled. */
    @Json(name = "cancel_epoch")
    val cancelEpoch: kotlin.String? = null,

    /* Epoch in which order was deleted. */
    @Json(name = "delete_epoch")
    val deleteEpoch: kotlin.String? = null,

    /* Transaction hash. */
    @Json(name = "tx_hash")
    val txHash: kotlin.String? = null,

    /* Event index within transaction. */
    @Json(name = "tx_log_index")
    val txLogIndex: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

