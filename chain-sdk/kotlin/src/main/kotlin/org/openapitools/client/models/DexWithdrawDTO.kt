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
 * Withdraw of an user.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Identifier, format: (transaction hash)-(id).
 * @param user 
 * @param tokenAddress 
 * @param amount 
 * @param createEpoch 
 * @param createBatchId 
 * @param txHash 
 * @param vid 
 */


data class DexWithdrawDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Identifier, format: (transaction hash)-(id). */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /*  */
    @Json(name = "user")
    val user: kotlin.String? = null,

    /*  */
    @Json(name = "token_address")
    val tokenAddress: kotlin.String? = null,

    /*  */
    @Json(name = "amount")
    val amount: kotlin.String? = null,

    /*  */
    @Json(name = "create_epoch")
    val createEpoch: kotlin.String? = null,

    /*  */
    @Json(name = "create_batch_id")
    val createBatchId: kotlin.String? = null,

    /*  */
    @Json(name = "tx_hash")
    val txHash: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

