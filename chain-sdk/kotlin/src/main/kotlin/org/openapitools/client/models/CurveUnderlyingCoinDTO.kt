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
 * @param id Equals to: <pool_id>-<coin_index>.
 * @param index Coin index.
 * @param pool 
 * @param token 
 * @param coin 
 * @param balance 
 * @param updated 
 * @param updatedAtBlock 
 * @param updatedAtTransaction 
 * @param vid 
 */


data class CurveUnderlyingCoinDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Equals to: <pool_id>-<coin_index>. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Coin index. */
    @Json(name = "index")
    val index: kotlin.Int? = null,

    /*  */
    @Json(name = "pool")
    val pool: kotlin.String? = null,

    /*  */
    @Json(name = "token")
    val token: kotlin.String? = null,

    /*  */
    @Json(name = "coin")
    val coin: kotlin.String? = null,

    /*  */
    @Json(name = "balance")
    val balance: kotlin.String? = null,

    /*  */
    @Json(name = "updated")
    val updated: kotlin.String? = null,

    /*  */
    @Json(name = "updated_at_block")
    val updatedAtBlock: kotlin.String? = null,

    /*  */
    @Json(name = "updated_at_transaction")
    val updatedAtTransaction: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

