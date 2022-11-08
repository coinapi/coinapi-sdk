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
 * @param id Singleton ID, equals to 'current'.
 * @param registryContract Current pool registry address.
 * @param contractCount Number of contracts in the AddressProvider registry.
 * @param gaugeCount Number of gauges registered.
 * @param gaugeTypeCount Number of gauge types registered.
 * @param poolCount Number of active pools.
 * @param tokenCount Number of tokens registered.
 * @param totalPoolCount Total number of pools (including removed ones).
 * @param updated 
 * @param updatedAtBlock 
 * @param updatedAtTransaction 
 * @param vid 
 */


data class CurveSystemStateDTO (

    @Json(name = "entry_time")
    val entryTime: java.time.OffsetDateTime? = null,

    @Json(name = "recv_time")
    val recvTime: java.time.OffsetDateTime? = null,

    /* Number of block in which entity was recorded. */
    @Json(name = "block_number")
    val blockNumber: kotlin.Long? = null,

    /* Singleton ID, equals to 'current'. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Current pool registry address. */
    @Json(name = "registry_contract")
    val registryContract: kotlin.String? = null,

    /* Number of contracts in the AddressProvider registry. */
    @Json(name = "contract_count")
    val contractCount: kotlin.String? = null,

    /* Number of gauges registered. */
    @Json(name = "gauge_count")
    val gaugeCount: kotlin.String? = null,

    /* Number of gauge types registered. */
    @Json(name = "gauge_type_count")
    val gaugeTypeCount: kotlin.String? = null,

    /* Number of active pools. */
    @Json(name = "pool_count")
    val poolCount: kotlin.String? = null,

    /* Number of tokens registered. */
    @Json(name = "token_count")
    val tokenCount: kotlin.String? = null,

    /* Total number of pools (including removed ones). */
    @Json(name = "total_pool_count")
    val totalPoolCount: kotlin.String? = null,

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

