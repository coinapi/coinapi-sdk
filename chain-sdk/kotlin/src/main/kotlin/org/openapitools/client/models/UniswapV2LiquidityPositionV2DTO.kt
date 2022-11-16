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
 * This entity is used to store data about a user's liquidity position. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more.
 *
 * @param entryTime 
 * @param recvTime 
 * @param blockNumber Number of block in which entity was recorded.
 * @param id User address and pair address concatenated with a dash.
 * @param user Reference to user.
 * @param pair Reference to the pair liquidity is being provided on.
 * @param liquidityTokenBalance Amount of LP tokens minted for this position.
 * @param vid 
 */


data class UniswapV2LiquidityPositionV2DTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* User address and pair address concatenated with a dash. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Reference to user. */
    @Json(name = "user")
    val user: kotlin.String? = null,

    /* Reference to the pair liquidity is being provided on. */
    @Json(name = "pair")
    val pair: kotlin.String? = null,

    /* Amount of LP tokens minted for this position. */
    @Json(name = "liquidity_token_balance")
    val liquidityTokenBalance: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

