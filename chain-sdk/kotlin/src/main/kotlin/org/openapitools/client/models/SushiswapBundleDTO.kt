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
 * The Bundle is used as a global store of derived ETH price in USD.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Hardcoded to '1'.
 * @param ethPrice Price of native.
 * @param vid 
 */


data class SushiswapBundleDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Hardcoded to '1'. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Price of native. */
    @Json(name = "eth_price")
    val ethPrice: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

