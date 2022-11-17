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
 * The Bundle is used as a global store of derived ETH price in USD. Because there is no guaranteed common base token across pairs, a global reference of USD price is useful for deriving other USD values. The Bundle entity stores an updated weighted average of ETH<->Stablecoin pair prices. This provides a strong estimate for the USD price of ETH.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id Constant 1.
 * @param ethPrice Derived price of ETH in USD based on stablecoin pairs.
 * @param vid 
 * @param blockRange 
 */


data class UniswapV2BundleDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Constant 1. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Derived price of ETH in USD based on stablecoin pairs. */
    @Json(name = "eth_price")
    val ethPrice: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null,

    /*  */
    @Json(name = "block_range")
    val blockRange: kotlin.String? = null

)

