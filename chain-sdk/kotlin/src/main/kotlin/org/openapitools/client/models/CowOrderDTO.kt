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
 * @param id User's address.
 * @param owner User's address.
 * @param tradesTimestamp Block's timestamp on trade event.
 * @param invalidateTimestamp Block's timestamp on invalidate event.
 * @param presignTimestamp Block's timestamp on presign event.
 * @param isSigned Determines whether order is signed.
 * @param isValid Determines whether order is valid.
 * @param vid 
 */


data class CowOrderDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* User's address. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* User's address. */
    @Json(name = "owner")
    val owner: kotlin.String? = null,

    /* Block's timestamp on trade event. */
    @Json(name = "trades_timestamp")
    val tradesTimestamp: kotlin.String? = null,

    /* Block's timestamp on invalidate event. */
    @Json(name = "invalidate_timestamp")
    val invalidateTimestamp: kotlin.String? = null,

    /* Block's timestamp on presign event. */
    @Json(name = "presign_timestamp")
    val presignTimestamp: kotlin.String? = null,

    /* Determines whether order is signed. */
    @Json(name = "is_signed")
    val isSigned: kotlin.Boolean? = null,

    /* Determines whether order is valid. */
    @Json(name = "is_valid")
    val isValid: kotlin.Boolean? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

