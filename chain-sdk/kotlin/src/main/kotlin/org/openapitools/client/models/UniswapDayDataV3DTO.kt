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

import org.openapitools.client.models.BigInteger

import com.squareup.moshi.Json

/**
 * Data accumulated and condensed into day stats for all of Uniswap
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber 
 * @param vid 
 * @param id timestamp rounded to current day by dividing by 86400
 * @param date timestamp rounded to current day by dividing by 86400
 * @param volumeEth total volume across all pairs on this day, stored as a derived amount of ETH
 * @param volumeUsd total volume across all pairs on this day, stored as a derived amount of USD
 * @param volumeUsdUntracked total daily volume in Uniswap derived in terms of USD untracked
 * @param feesUsd fees in USD
 * @param txCount 
 * @param tvlUsd tvl in terms of USD
 */

data class UniswapDayDataV3DTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /*  */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null,

    /* timestamp rounded to current day by dividing by 86400 */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* timestamp rounded to current day by dividing by 86400 */
    @Json(name = "date")
    val date: kotlin.Int? = null,

    /* total volume across all pairs on this day, stored as a derived amount of ETH */
    @Json(name = "volume_eth")
    val volumeEth: kotlin.String? = null,

    /* total volume across all pairs on this day, stored as a derived amount of USD */
    @Json(name = "volume_usd")
    val volumeUsd: kotlin.String? = null,

    /* total daily volume in Uniswap derived in terms of USD untracked */
    @Json(name = "volume_usd_untracked")
    val volumeUsdUntracked: kotlin.String? = null,

    /* fees in USD */
    @Json(name = "fees_usd")
    val feesUsd: kotlin.String? = null,

    @Json(name = "tx_count")
    val txCount: BigInteger? = null,

    /* tvl in terms of USD */
    @Json(name = "tvl_usd")
    val tvlUsd: kotlin.String? = null

)

