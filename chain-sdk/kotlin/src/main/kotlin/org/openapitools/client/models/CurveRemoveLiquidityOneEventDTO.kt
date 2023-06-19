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
 * @param pool 
 * @param provider 
 * @param tokenAmount 
 * @param coinAmount 
 * @param block 
 * @param timestamp 
 * @param transaction 
 * @param vid 
 */


data class CurveRemoveLiquidityOneEventDTO (

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
    @Json(name = "pool")
    val pool: kotlin.String? = null,

    /*  */
    @Json(name = "provider")
    val provider: kotlin.String? = null,

    /*  */
    @Json(name = "token_amount")
    val tokenAmount: kotlin.String? = null,

    /*  */
    @Json(name = "coin_amount")
    val coinAmount: kotlin.String? = null,

    /*  */
    @Json(name = "block")
    val block: kotlin.String? = null,

    /*  */
    @Json(name = "timestamp")
    val timestamp: kotlin.String? = null,

    /*  */
    @Json(name = "transaction")
    val transaction: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

