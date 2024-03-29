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
 * 
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber 
 * @param vid 
 * @param blockRange 
 * @param id 
 * @param transactionHash 
 * @param logIndex 
 * @param timestamp 
 * @param isBundle 
 * @param collection 
 * @param tokenId 
 * @param amount 
 * @param priceEth 
 * @param buyer 
 * @param seller 
 */


data class CRYPTOPUNKSTradeDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /*  */
    @Json(name = "block_number")
    val blockNumber: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null,

    /*  */
    @Json(name = "block_range")
    val blockRange: kotlin.String? = null,

    /*  */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /*  */
    @Json(name = "transaction_hash")
    val transactionHash: kotlin.String? = null,

    /*  */
    @Json(name = "log_index")
    val logIndex: kotlin.Int? = null,

    /*  */
    @Json(name = "timestamp")
    val timestamp: kotlin.String? = null,

    /*  */
    @Json(name = "is_bundle")
    val isBundle: kotlin.Boolean? = null,

    /*  */
    @Json(name = "collection")
    val collection: kotlin.String? = null,

    /*  */
    @Json(name = "token_id")
    val tokenId: kotlin.String? = null,

    /*  */
    @Json(name = "amount")
    val amount: kotlin.String? = null,

    /*  */
    @Json(name = "price_eth")
    val priceEth: kotlin.String? = null,

    /*  */
    @Json(name = "buyer")
    val buyer: kotlin.String? = null,

    /*  */
    @Json(name = "seller")
    val seller: kotlin.String? = null

)

