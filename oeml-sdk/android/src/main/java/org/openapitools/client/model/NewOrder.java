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

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import java.util.Date;
import org.openapitools.client.model.TimeInForce;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class NewOrder {
  
  @SerializedName("exchange_id")
  private String exchangeId = null;
  @SerializedName("client_order_id")
  private String clientOrderId = null;
  @SerializedName("symbol_exchange")
  private String symbolExchange = null;
  @SerializedName("symbol_coinapi")
  private String symbolCoinapi = null;
  @SerializedName("amount_order")
  private BigDecimal amountOrder = null;
  @SerializedName("price")
  private BigDecimal price = null;
  public enum SideEnum {
     BUY,  SELL, 
  };
  @SerializedName("side")
  private SideEnum side = null;
  public enum OrderTypeEnum {
     LIMIT, 
  };
  @SerializedName("order_type")
  private OrderTypeEnum orderType = null;
  @SerializedName("time_in_force")
  private TimeInForce timeInForce = null;
  @SerializedName("expire_time")
  private Date expireTime = null;
  public enum List&lt;ExecInstEnum&gt; {
     MAKER_OR_CANCEL, 
  };
  @SerializedName("exec_inst")
  private List<ExecInstEnum> execInst = null;

  /**
   * Exchange name
   **/
  @ApiModelProperty(value = "Exchange name")
  public String getExchangeId() {
    return exchangeId;
  }
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  /**
   * Client unique identifier for the trade.
   **/
  @ApiModelProperty(value = "Client unique identifier for the trade.")
  public String getClientOrderId() {
    return clientOrderId;
  }
  public void setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
  }

  /**
   * The symbol of the order.
   **/
  @ApiModelProperty(value = "The symbol of the order.")
  public String getSymbolExchange() {
    return symbolExchange;
  }
  public void setSymbolExchange(String symbolExchange) {
    this.symbolExchange = symbolExchange;
  }

  /**
   * The CoinAPI symbol of the order.
   **/
  @ApiModelProperty(value = "The CoinAPI symbol of the order.")
  public String getSymbolCoinapi() {
    return symbolCoinapi;
  }
  public void setSymbolCoinapi(String symbolCoinapi) {
    this.symbolCoinapi = symbolCoinapi;
  }

  /**
   * Quoted decimal amount to purchase.
   **/
  @ApiModelProperty(value = "Quoted decimal amount to purchase.")
  public BigDecimal getAmountOrder() {
    return amountOrder;
  }
  public void setAmountOrder(BigDecimal amountOrder) {
    this.amountOrder = amountOrder;
  }

  /**
   * Quoted decimal amount to spend per unit.
   **/
  @ApiModelProperty(value = "Quoted decimal amount to spend per unit.")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * Buy or Sell
   **/
  @ApiModelProperty(value = "Buy or Sell")
  public SideEnum getSide() {
    return side;
  }
  public void setSide(SideEnum side) {
    this.side = side;
  }

  /**
   * The order type.
   **/
  @ApiModelProperty(value = "The order type.")
  public OrderTypeEnum getOrderType() {
    return orderType;
  }
  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TimeInForce getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
  }

  /**
   * Required for orders with time_in_force = GOOD_TILL_TIME_EXCHANGE, GOOD_TILL_TIME_OMS
   **/
  @ApiModelProperty(value = "Required for orders with time_in_force = GOOD_TILL_TIME_EXCHANGE, GOOD_TILL_TIME_OMS")
  public Date getExpireTime() {
    return expireTime;
  }
  public void setExpireTime(Date expireTime) {
    this.expireTime = expireTime;
  }

  /**
   * TODO: description exec inst  | Parameter | Description | |-----------|--------| | `MAKER_OR_CANCEL` | Rests on the continuous order book at a specified price. If any quantity can be filled immediately, the entire order is canceled. | ##### Exec inst options  | Exchange | MAKER_OR_CANCEL | | --- | --- | | BINANCE | X | | BITFINEX | X | | BITMEX | X | | BLOCKCHAINEXCHANGE | X | | BITSTAMP |  | | COINBASE | X | | GEMINI | X | | KRAKEN | X | | POLONIEX | X | | HITBTC |  | | KRAKENFTS | X | 
   **/
  @ApiModelProperty(value = "TODO: description exec inst  | Parameter | Description | |-----------|--------| | `MAKER_OR_CANCEL` | Rests on the continuous order book at a specified price. If any quantity can be filled immediately, the entire order is canceled. | ##### Exec inst options  | Exchange | MAKER_OR_CANCEL | | --- | --- | | BINANCE | X | | BITFINEX | X | | BITMEX | X | | BLOCKCHAINEXCHANGE | X | | BITSTAMP |  | | COINBASE | X | | GEMINI | X | | KRAKEN | X | | POLONIEX | X | | HITBTC |  | | KRAKENFTS | X | ")
  public List<ExecInstEnum> getExecInst() {
    return execInst;
  }
  public void setExecInst(List<ExecInstEnum> execInst) {
    this.execInst = execInst;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewOrder newOrder = (NewOrder) o;
    return (this.exchangeId == null ? newOrder.exchangeId == null : this.exchangeId.equals(newOrder.exchangeId)) &&
        (this.clientOrderId == null ? newOrder.clientOrderId == null : this.clientOrderId.equals(newOrder.clientOrderId)) &&
        (this.symbolExchange == null ? newOrder.symbolExchange == null : this.symbolExchange.equals(newOrder.symbolExchange)) &&
        (this.symbolCoinapi == null ? newOrder.symbolCoinapi == null : this.symbolCoinapi.equals(newOrder.symbolCoinapi)) &&
        (this.amountOrder == null ? newOrder.amountOrder == null : this.amountOrder.equals(newOrder.amountOrder)) &&
        (this.price == null ? newOrder.price == null : this.price.equals(newOrder.price)) &&
        (this.side == null ? newOrder.side == null : this.side.equals(newOrder.side)) &&
        (this.orderType == null ? newOrder.orderType == null : this.orderType.equals(newOrder.orderType)) &&
        (this.timeInForce == null ? newOrder.timeInForce == null : this.timeInForce.equals(newOrder.timeInForce)) &&
        (this.expireTime == null ? newOrder.expireTime == null : this.expireTime.equals(newOrder.expireTime)) &&
        (this.execInst == null ? newOrder.execInst == null : this.execInst.equals(newOrder.execInst));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.exchangeId == null ? 0: this.exchangeId.hashCode());
    result = 31 * result + (this.clientOrderId == null ? 0: this.clientOrderId.hashCode());
    result = 31 * result + (this.symbolExchange == null ? 0: this.symbolExchange.hashCode());
    result = 31 * result + (this.symbolCoinapi == null ? 0: this.symbolCoinapi.hashCode());
    result = 31 * result + (this.amountOrder == null ? 0: this.amountOrder.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.orderType == null ? 0: this.orderType.hashCode());
    result = 31 * result + (this.timeInForce == null ? 0: this.timeInForce.hashCode());
    result = 31 * result + (this.expireTime == null ? 0: this.expireTime.hashCode());
    result = 31 * result + (this.execInst == null ? 0: this.execInst.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOrder {\n");
    
    sb.append("  exchangeId: ").append(exchangeId).append("\n");
    sb.append("  clientOrderId: ").append(clientOrderId).append("\n");
    sb.append("  symbolExchange: ").append(symbolExchange).append("\n");
    sb.append("  symbolCoinapi: ").append(symbolCoinapi).append("\n");
    sb.append("  amountOrder: ").append(amountOrder).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  orderType: ").append(orderType).append("\n");
    sb.append("  timeInForce: ").append(timeInForce).append("\n");
    sb.append("  expireTime: ").append(expireTime).append("\n");
    sb.append("  execInst: ").append(execInst).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
