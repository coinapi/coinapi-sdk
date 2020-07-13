/**
* OEML - REST API
* Lorem2 Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
*
* The version of the OpenAPI document: v1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.TimeInForce

import com.squareup.moshi.Json
/**
 * 
 * @param exchangeId Exchange name
 * @param clientOrderId Client unique identifier for the trade.
 * @param symbolExchange The symbol of the order.
 * @param symbolCoinapi The CoinAPI symbol of the order.
 * @param amountOrder Quoted decimal amount to purchase.
 * @param price Quoted decimal amount to spend per unit.
 * @param side Buy or Sell
 * @param orderType The order type.
 * @param timeInForce 
 * @param expireTime Required for orders with time_in_force = GOOD_TILL_TIME_EXCHANGE, GOOD_TILL_TIME_OMS
 * @param execInst TODO: description exec inst  | Parameter | Description | |-----------|--------| | `MAKER_OR_CANCEL` | Rests on the continuous order book at a specified price. If any quantity can be filled immediately, the entire order is canceled. | ##### Exec inst options  | Exchange | MAKER_OR_CANCEL | | --- | --- | | BINANCE | X | | BITFINEX | X | | BITMEX | X | | BLOCKCHAINEXCHANGE | X | | BITSTAMP |  | | COINBASE | X | | GEMINI | X | | KRAKEN | X | | POLONIEX | X | | HITBTC |  | | KRAKENFTS | X | 
 */

data class NewOrder (
    /* Exchange name */
    @Json(name = "exchange_id")
    val exchangeId: kotlin.String? = null,
    /* Client unique identifier for the trade. */
    @Json(name = "client_order_id")
    val clientOrderId: kotlin.String? = null,
    /* The symbol of the order. */
    @Json(name = "symbol_exchange")
    val symbolExchange: kotlin.String? = null,
    /* The CoinAPI symbol of the order. */
    @Json(name = "symbol_coinapi")
    val symbolCoinapi: kotlin.String? = null,
    /* Quoted decimal amount to purchase. */
    @Json(name = "amount_order")
    val amountOrder: java.math.BigDecimal? = null,
    /* Quoted decimal amount to spend per unit. */
    @Json(name = "price")
    val price: java.math.BigDecimal? = null,
    /* Buy or Sell */
    @Json(name = "side")
    val side: NewOrder.Side? = null,
    /* The order type. */
    @Json(name = "order_type")
    val orderType: NewOrder.OrderType? = null,
    @Json(name = "time_in_force")
    val timeInForce: TimeInForce? = null,
    /* Required for orders with time_in_force = GOOD_TILL_TIME_EXCHANGE, GOOD_TILL_TIME_OMS */
    @Json(name = "expire_time")
    val expireTime: java.time.LocalDate? = null,
    /* TODO: description exec inst  | Parameter | Description | |-----------|--------| | `MAKER_OR_CANCEL` | Rests on the continuous order book at a specified price. If any quantity can be filled immediately, the entire order is canceled. | ##### Exec inst options  | Exchange | MAKER_OR_CANCEL | | --- | --- | | BINANCE | X | | BITFINEX | X | | BITMEX | X | | BLOCKCHAINEXCHANGE | X | | BITSTAMP |  | | COINBASE | X | | GEMINI | X | | KRAKEN | X | | POLONIEX | X | | HITBTC |  | | KRAKENFTS | X |  */
    @Json(name = "exec_inst")
    val execInst: kotlin.Array<NewOrder.ExecInst>? = null
) {

    /**
    * Buy or Sell
    * Values: bUY,sELL
    */
    
    enum class Side(val value: kotlin.String){
        @Json(name = "BUY") bUY("BUY"),
        @Json(name = "SELL") sELL("SELL");
    }
    /**
    * The order type.
    * Values: lIMIT
    */
    
    enum class OrderType(val value: kotlin.String){
        @Json(name = "LIMIT") lIMIT("LIMIT");
    }
    /**
    * TODO: description exec inst  | Parameter | Description | |-----------|--------| | `MAKER_OR_CANCEL` | Rests on the continuous order book at a specified price. If any quantity can be filled immediately, the entire order is canceled. | ##### Exec inst options  | Exchange | MAKER_OR_CANCEL | | --- | --- | | BINANCE | X | | BITFINEX | X | | BITMEX | X | | BLOCKCHAINEXCHANGE | X | | BITSTAMP |  | | COINBASE | X | | GEMINI | X | | KRAKEN | X | | POLONIEX | X | | HITBTC |  | | KRAKENFTS | X | 
    * Values: mAKERORCANCEL
    */
    
    enum class ExecInst(val value: kotlin.String){
        @Json(name = "MAKER_OR_CANCEL") mAKERORCANCEL("MAKER_OR_CANCEL");
    }
}
