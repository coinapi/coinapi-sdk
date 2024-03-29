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
 * @param blockNumber Number of block in which entity was recorded.
 * @param id 
 * @param batch 
 * @param solver 
 * @param feeReward 
 * @param objectiveValue 
 * @param utility 
 * @param trades 
 * @param createEpoch 
 * @param revertEpoch 
 * @param txHash 
 * @param txLogIndex 
 * @param vid 
 */


data class DexSolutionDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /*  */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /*  */
    @Json(name = "batch")
    val batch: kotlin.String? = null,

    /*  */
    @Json(name = "solver")
    val solver: kotlin.String? = null,

    /*  */
    @Json(name = "fee_reward")
    val feeReward: kotlin.String? = null,

    /*  */
    @Json(name = "objective_value")
    val objectiveValue: kotlin.String? = null,

    /*  */
    @Json(name = "utility")
    val utility: kotlin.String? = null,

    /*  */
    @Json(name = "trades")
    val trades: kotlin.collections.List<kotlin.String>? = null,

    /*  */
    @Json(name = "create_epoch")
    val createEpoch: kotlin.String? = null,

    /*  */
    @Json(name = "revert_epoch")
    val revertEpoch: kotlin.String? = null,

    /*  */
    @Json(name = "tx_hash")
    val txHash: kotlin.String? = null,

    /*  */
    @Json(name = "tx_log_index")
    val txLogIndex: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

