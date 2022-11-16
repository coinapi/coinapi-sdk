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
 * 
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id 
 * @param pool 
 * @param `value` 
 * @param block 
 * @param timestamp 
 * @param transaction 
 * @param vid 
 */


data class CurveFeeChangeLogDTO (

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
    @Json(name = "value")
    val `value`: kotlin.String? = null,

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

