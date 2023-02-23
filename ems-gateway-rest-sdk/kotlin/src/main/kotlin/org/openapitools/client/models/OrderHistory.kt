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
 * @param apikey Apikey
 * @param exchangeId Exchange id
 * @param clientOrderId Client order id
 * @param symbolIdExchange Symbol id exchange
 * @param symbolIdCoinapi Symbol id in coinapi
 * @param amountOrder Amount
 * @param price Price
 * @param side 1-buy, 2-sell
 * @param orderType Order type
 * @param timeInForce Time in force
 * @param expireTime Expire time
 * @param execInst Exec inst
 * @param clientOrderIdFormatExchange Client order id format
 * @param exchangeOrderId Exchange order id
 * @param amountOpen Amount open
 * @param amountFilled Amount filled
 * @param avgPx Average price
 * @param status Status
 * @param statusHistoryStatus History status
 * @param statusHistoryTime History status time
 * @param errorMessageResult Error message
 * @param errorMessageReason Error message reason
 * @param errorMessageMessage Error message
 * @param fillsTime Fills time
 * @param fillsPrice Fills price
 * @param fillsAmount Fills amount
 * @param createdTime Created time
 */


data class OrderHistory (

    /* Apikey */
    @Json(name = "apikey")
    val apikey: kotlin.String? = null,

    /* Exchange id */
    @Json(name = "exchangeId")
    val exchangeId: kotlin.String? = null,

    /* Client order id */
    @Json(name = "clientOrderId")
    val clientOrderId: kotlin.String? = null,

    /* Symbol id exchange */
    @Json(name = "symbolIdExchange")
    val symbolIdExchange: kotlin.String? = null,

    /* Symbol id in coinapi */
    @Json(name = "symbolIdCoinapi")
    val symbolIdCoinapi: kotlin.String? = null,

    /* Amount */
    @Json(name = "amountOrder")
    val amountOrder: java.math.BigDecimal? = null,

    /* Price */
    @Json(name = "price")
    val price: java.math.BigDecimal? = null,

    /* 1-buy, 2-sell */
    @Json(name = "side")
    val side: java.math.BigDecimal? = null,

    /* Order type */
    @Json(name = "orderType")
    val orderType: kotlin.String? = null,

    /* Time in force */
    @Json(name = "timeInForce")
    val timeInForce: kotlin.String? = null,

    /* Expire time */
    @Json(name = "expireTime")
    val expireTime: java.time.LocalDate? = null,

    /* Exec inst */
    @Json(name = "execInst")
    val execInst: kotlin.collections.List<kotlin.String>? = null,

    /* Client order id format */
    @Json(name = "clientOrderIdFormatExchange")
    val clientOrderIdFormatExchange: kotlin.String? = null,

    /* Exchange order id */
    @Json(name = "exchangeOrderId")
    val exchangeOrderId: kotlin.String? = null,

    /* Amount open */
    @Json(name = "amountOpen")
    val amountOpen: java.math.BigDecimal? = null,

    /* Amount filled */
    @Json(name = "amountFilled")
    val amountFilled: java.math.BigDecimal? = null,

    /* Average price */
    @Json(name = "avgPx")
    val avgPx: java.math.BigDecimal? = null,

    /* Status */
    @Json(name = "status")
    val status: kotlin.String? = null,

    /* History status */
    @Json(name = "statusHistoryStatus")
    val statusHistoryStatus: kotlin.collections.List<kotlin.String>? = null,

    /* History status time */
    @Json(name = "statusHistoryTime")
    val statusHistoryTime: kotlin.collections.List<java.time.LocalDate>? = null,

    /* Error message */
    @Json(name = "errorMessageResult")
    val errorMessageResult: kotlin.String? = null,

    /* Error message reason */
    @Json(name = "errorMessageReason")
    val errorMessageReason: kotlin.String? = null,

    /* Error message */
    @Json(name = "errorMessageMessage")
    val errorMessageMessage: kotlin.String? = null,

    /* Fills time */
    @Json(name = "fillsTime")
    val fillsTime: kotlin.collections.List<java.time.LocalDate>? = null,

    /* Fills price */
    @Json(name = "fillsPrice")
    val fillsPrice: kotlin.collections.List<java.math.BigDecimal>? = null,

    /* Fills amount */
    @Json(name = "fillsAmount")
    val fillsAmount: kotlin.collections.List<java.math.BigDecimal>? = null,

    /* Created time */
    @Json(name = "createdTime")
    val createdTime: java.time.LocalDate? = null

)

