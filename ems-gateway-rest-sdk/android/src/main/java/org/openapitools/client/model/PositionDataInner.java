/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import org.openapitools.client.model.OrdSide;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The Position object.
 **/
@ApiModel(description = "The Position object.")
public class PositionDataInner {
  
  @SerializedName("symbol_id_exchange")
  private String symbolIdExchange = null;
  @SerializedName("symbol_id_coinapi")
  private String symbolIdCoinapi = null;
  @SerializedName("avg_entry_price")
  private BigDecimal avgEntryPrice = null;
  @SerializedName("quantity")
  private BigDecimal quantity = null;
  @SerializedName("side")
  private OrdSide side = null;
  @SerializedName("unrealized_pnl")
  private BigDecimal unrealizedPnl = null;
  @SerializedName("leverage")
  private BigDecimal leverage = null;
  @SerializedName("cross_margin")
  private Boolean crossMargin = null;
  @SerializedName("liquidation_price")
  private BigDecimal liquidationPrice = null;
  @SerializedName("raw_data")
  private Object rawData = null;

  /**
   * Exchange symbol.
   **/
  @ApiModelProperty(value = "Exchange symbol.")
  public String getSymbolIdExchange() {
    return symbolIdExchange;
  }
  public void setSymbolIdExchange(String symbolIdExchange) {
    this.symbolIdExchange = symbolIdExchange;
  }

  /**
   * CoinAPI symbol.
   **/
  @ApiModelProperty(value = "CoinAPI symbol.")
  public String getSymbolIdCoinapi() {
    return symbolIdCoinapi;
  }
  public void setSymbolIdCoinapi(String symbolIdCoinapi) {
    this.symbolIdCoinapi = symbolIdCoinapi;
  }

  /**
   * Calculated average price of all fills on this position.
   **/
  @ApiModelProperty(value = "Calculated average price of all fills on this position.")
  public BigDecimal getAvgEntryPrice() {
    return avgEntryPrice;
  }
  public void setAvgEntryPrice(BigDecimal avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
  }

  /**
   * The current position quantity.
   **/
  @ApiModelProperty(value = "The current position quantity.")
  public BigDecimal getQuantity() {
    return quantity;
  }
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public OrdSide getSide() {
    return side;
  }
  public void setSide(OrdSide side) {
    this.side = side;
  }

  /**
   * Unrealised profit or loss (PNL) of this position.
   **/
  @ApiModelProperty(value = "Unrealised profit or loss (PNL) of this position.")
  public BigDecimal getUnrealizedPnl() {
    return unrealizedPnl;
  }
  public void setUnrealizedPnl(BigDecimal unrealizedPnl) {
    this.unrealizedPnl = unrealizedPnl;
  }

  /**
   * Leverage for this position reported by the exchange.
   **/
  @ApiModelProperty(value = "Leverage for this position reported by the exchange.")
  public BigDecimal getLeverage() {
    return leverage;
  }
  public void setLeverage(BigDecimal leverage) {
    this.leverage = leverage;
  }

  /**
   * Is cross margin mode enable for this position?
   **/
  @ApiModelProperty(value = "Is cross margin mode enable for this position?")
  public Boolean getCrossMargin() {
    return crossMargin;
  }
  public void setCrossMargin(Boolean crossMargin) {
    this.crossMargin = crossMargin;
  }

  /**
   * Liquidation price. If mark price will reach this value, the position will be liquidated.
   **/
  @ApiModelProperty(value = "Liquidation price. If mark price will reach this value, the position will be liquidated.")
  public BigDecimal getLiquidationPrice() {
    return liquidationPrice;
  }
  public void setLiquidationPrice(BigDecimal liquidationPrice) {
    this.liquidationPrice = liquidationPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getRawData() {
    return rawData;
  }
  public void setRawData(Object rawData) {
    this.rawData = rawData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionDataInner positionDataInner = (PositionDataInner) o;
    return (this.symbolIdExchange == null ? positionDataInner.symbolIdExchange == null : this.symbolIdExchange.equals(positionDataInner.symbolIdExchange)) &&
        (this.symbolIdCoinapi == null ? positionDataInner.symbolIdCoinapi == null : this.symbolIdCoinapi.equals(positionDataInner.symbolIdCoinapi)) &&
        (this.avgEntryPrice == null ? positionDataInner.avgEntryPrice == null : this.avgEntryPrice.equals(positionDataInner.avgEntryPrice)) &&
        (this.quantity == null ? positionDataInner.quantity == null : this.quantity.equals(positionDataInner.quantity)) &&
        (this.side == null ? positionDataInner.side == null : this.side.equals(positionDataInner.side)) &&
        (this.unrealizedPnl == null ? positionDataInner.unrealizedPnl == null : this.unrealizedPnl.equals(positionDataInner.unrealizedPnl)) &&
        (this.leverage == null ? positionDataInner.leverage == null : this.leverage.equals(positionDataInner.leverage)) &&
        (this.crossMargin == null ? positionDataInner.crossMargin == null : this.crossMargin.equals(positionDataInner.crossMargin)) &&
        (this.liquidationPrice == null ? positionDataInner.liquidationPrice == null : this.liquidationPrice.equals(positionDataInner.liquidationPrice)) &&
        (this.rawData == null ? positionDataInner.rawData == null : this.rawData.equals(positionDataInner.rawData));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.symbolIdExchange == null ? 0: this.symbolIdExchange.hashCode());
    result = 31 * result + (this.symbolIdCoinapi == null ? 0: this.symbolIdCoinapi.hashCode());
    result = 31 * result + (this.avgEntryPrice == null ? 0: this.avgEntryPrice.hashCode());
    result = 31 * result + (this.quantity == null ? 0: this.quantity.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.unrealizedPnl == null ? 0: this.unrealizedPnl.hashCode());
    result = 31 * result + (this.leverage == null ? 0: this.leverage.hashCode());
    result = 31 * result + (this.crossMargin == null ? 0: this.crossMargin.hashCode());
    result = 31 * result + (this.liquidationPrice == null ? 0: this.liquidationPrice.hashCode());
    result = 31 * result + (this.rawData == null ? 0: this.rawData.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionDataInner {\n");
    
    sb.append("  symbolIdExchange: ").append(symbolIdExchange).append("\n");
    sb.append("  symbolIdCoinapi: ").append(symbolIdCoinapi).append("\n");
    sb.append("  avgEntryPrice: ").append(avgEntryPrice).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  unrealizedPnl: ").append(unrealizedPnl).append("\n");
    sb.append("  leverage: ").append(leverage).append("\n");
    sb.append("  crossMargin: ").append(crossMargin).append("\n");
    sb.append("  liquidationPrice: ").append(liquidationPrice).append("\n");
    sb.append("  rawData: ").append(rawData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
