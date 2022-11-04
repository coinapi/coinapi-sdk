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
 * @param id NFT token identifier, format: <NFT token id>#<block number>
 * @param owner Owner of the NFT.
 * @param pool Pool the position is within.
 * @param position Position of which the snap was taken of.
 * @param timestamp Timestamp of block in which the snap was created.
 * @param liquidity Total position liquidity.
 * @param depositedToken0 Amount of token 0 ever deposited to position.
 * @param depositedToken1 Amount of token 1 ever deposited to position.
 * @param withdrawnToken0 Amount of token 0 ever withdrawn from position (without fees).
 * @param withdrawnToken1 Amount of token 1 ever withdrawn from position (without fees).
 * @param collectedFeesToken0 All time collected fees in token0.
 * @param collectedFeesToken1 All time collected fees in token1.
 * @param transaction Transaction in which the snapshot was initialized.
 * @param feeGrowthInside0LastX128 Variable needed for fee computation.
 * @param feeGrowthInside1LastX128 Variable needed for fee computation.
 * @param vid 
 */


data class UniswapV3PositionSnapshotV3DTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* NFT token identifier, format: <NFT token id>#<block number> */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Owner of the NFT. */
    @Json(name = "owner")
    val owner: kotlin.String? = null,

    /* Pool the position is within. */
    @Json(name = "pool")
    val pool: kotlin.String? = null,

    /* Position of which the snap was taken of. */
    @Json(name = "position")
    val position: kotlin.String? = null,

    /* Timestamp of block in which the snap was created. */
    @Json(name = "timestamp")
    val timestamp: kotlin.String? = null,

    /* Total position liquidity. */
    @Json(name = "liquidity")
    val liquidity: kotlin.String? = null,

    /* Amount of token 0 ever deposited to position. */
    @Json(name = "deposited_token_0")
    val depositedToken0: kotlin.String? = null,

    /* Amount of token 1 ever deposited to position. */
    @Json(name = "deposited_token_1")
    val depositedToken1: kotlin.String? = null,

    /* Amount of token 0 ever withdrawn from position (without fees). */
    @Json(name = "withdrawn_token_0")
    val withdrawnToken0: kotlin.String? = null,

    /* Amount of token 1 ever withdrawn from position (without fees). */
    @Json(name = "withdrawn_token_1")
    val withdrawnToken1: kotlin.String? = null,

    /* All time collected fees in token0. */
    @Json(name = "collected_fees_token_0")
    val collectedFeesToken0: kotlin.String? = null,

    /* All time collected fees in token1. */
    @Json(name = "collected_fees_token_1")
    val collectedFeesToken1: kotlin.String? = null,

    /* Transaction in which the snapshot was initialized. */
    @Json(name = "transaction")
    val transaction: kotlin.String? = null,

    /* Variable needed for fee computation. */
    @Json(name = "fee_growth_inside_0_last_x128")
    val feeGrowthInside0LastX128: kotlin.String? = null,

    /* Variable needed for fee computation. */
    @Json(name = "fee_growth_inside_1_last_x128")
    val feeGrowthInside1LastX128: kotlin.String? = null,

    /*  */
    @Json(name = "vid")
    val vid: kotlin.Long? = null

)

