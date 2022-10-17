/**
 * OnChain API
 *
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
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
 * @param blockNumber 
 * @param vid 
 * @param id 
 * @param date 
 * @param token 
 * @param volume 
 * @param volumeUsd 
 * @param untrackedVolumeUsd 
 * @param totalValueLocked 
 * @param totalValueLockedUsd 
 * @param priceUsd 
 * @param feesUsd 
 * @param `open` 
 * @param high 
 * @param low 
 * @param close 
 */

data class TokenV3DayDataDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    @Json(name = "vid")
    val vid: kotlin.Long? = null,

    @Json(name = "id")
    val id: kotlin.String? = null,

    @Json(name = "date")
    val date: kotlin.Int? = null,

    @Json(name = "token")
    val token: kotlin.String? = null,

    @Json(name = "volume")
    val volume: kotlin.String? = null,

    @Json(name = "volume_usd")
    val volumeUsd: kotlin.String? = null,

    @Json(name = "untracked_volume_usd")
    val untrackedVolumeUsd: kotlin.String? = null,

    @Json(name = "total_value_locked")
    val totalValueLocked: kotlin.String? = null,

    @Json(name = "total_value_locked_usd")
    val totalValueLockedUsd: kotlin.String? = null,

    @Json(name = "price_usd")
    val priceUsd: kotlin.String? = null,

    @Json(name = "fees_usd")
    val feesUsd: kotlin.String? = null,

    @Json(name = "open")
    val `open`: kotlin.String? = null,

    @Json(name = "high")
    val high: kotlin.String? = null,

    @Json(name = "low")
    val low: kotlin.String? = null,

    @Json(name = "close")
    val close: kotlin.String? = null

)
