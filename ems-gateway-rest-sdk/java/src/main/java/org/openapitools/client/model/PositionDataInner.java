/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.openapitools.client.model.OrdSide;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * The Position object.
 */
@ApiModel(description = "The Position object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-29T09:46:34.942680Z[Etc/UTC]")
public class PositionDataInner {
  public static final String SERIALIZED_NAME_SYMBOL_ID_EXCHANGE = "symbol_id_exchange";
  @SerializedName(SERIALIZED_NAME_SYMBOL_ID_EXCHANGE)
  private String symbolIdExchange;

  public static final String SERIALIZED_NAME_SYMBOL_ID_COINAPI = "symbol_id_coinapi";
  @SerializedName(SERIALIZED_NAME_SYMBOL_ID_COINAPI)
  private String symbolIdCoinapi;

  public static final String SERIALIZED_NAME_AVG_ENTRY_PRICE = "avg_entry_price";
  @SerializedName(SERIALIZED_NAME_AVG_ENTRY_PRICE)
  private BigDecimal avgEntryPrice;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private OrdSide side;

  public static final String SERIALIZED_NAME_UNREALIZED_PNL = "unrealized_pnl";
  @SerializedName(SERIALIZED_NAME_UNREALIZED_PNL)
  private BigDecimal unrealizedPnl;

  public static final String SERIALIZED_NAME_LEVERAGE = "leverage";
  @SerializedName(SERIALIZED_NAME_LEVERAGE)
  private BigDecimal leverage;

  public static final String SERIALIZED_NAME_CROSS_MARGIN = "cross_margin";
  @SerializedName(SERIALIZED_NAME_CROSS_MARGIN)
  private Boolean crossMargin;

  public static final String SERIALIZED_NAME_LIQUIDATION_PRICE = "liquidation_price";
  @SerializedName(SERIALIZED_NAME_LIQUIDATION_PRICE)
  private BigDecimal liquidationPrice;

  public static final String SERIALIZED_NAME_RAW_DATA = "raw_data";
  @SerializedName(SERIALIZED_NAME_RAW_DATA)
  private Object rawData;

  public PositionDataInner() {
  }

  public PositionDataInner symbolIdExchange(String symbolIdExchange) {
    
    this.symbolIdExchange = symbolIdExchange;
    return this;
  }

   /**
   * Exchange symbol.
   * @return symbolIdExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XBTUSD", value = "Exchange symbol.")

  public String getSymbolIdExchange() {
    return symbolIdExchange;
  }


  public void setSymbolIdExchange(String symbolIdExchange) {
    this.symbolIdExchange = symbolIdExchange;
  }


  public PositionDataInner symbolIdCoinapi(String symbolIdCoinapi) {
    
    this.symbolIdCoinapi = symbolIdCoinapi;
    return this;
  }

   /**
   * CoinAPI symbol.
   * @return symbolIdCoinapi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BITMEX_PERP_BTC_USD", value = "CoinAPI symbol.")

  public String getSymbolIdCoinapi() {
    return symbolIdCoinapi;
  }


  public void setSymbolIdCoinapi(String symbolIdCoinapi) {
    this.symbolIdCoinapi = symbolIdCoinapi;
  }


  public PositionDataInner avgEntryPrice(BigDecimal avgEntryPrice) {
    
    this.avgEntryPrice = avgEntryPrice;
    return this;
  }

   /**
   * Calculated average price of all fills on this position.
   * @return avgEntryPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.00134444", value = "Calculated average price of all fills on this position.")

  public BigDecimal getAvgEntryPrice() {
    return avgEntryPrice;
  }


  public void setAvgEntryPrice(BigDecimal avgEntryPrice) {
    this.avgEntryPrice = avgEntryPrice;
  }


  public PositionDataInner quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The current position quantity.
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "The current position quantity.")

  public BigDecimal getQuantity() {
    return quantity;
  }


  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public PositionDataInner side(OrdSide side) {
    
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrdSide getSide() {
    return side;
  }


  public void setSide(OrdSide side) {
    this.side = side;
  }


  public PositionDataInner unrealizedPnl(BigDecimal unrealizedPnl) {
    
    this.unrealizedPnl = unrealizedPnl;
    return this;
  }

   /**
   * Unrealised profit or loss (PNL) of this position.
   * @return unrealizedPnl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0", value = "Unrealised profit or loss (PNL) of this position.")

  public BigDecimal getUnrealizedPnl() {
    return unrealizedPnl;
  }


  public void setUnrealizedPnl(BigDecimal unrealizedPnl) {
    this.unrealizedPnl = unrealizedPnl;
  }


  public PositionDataInner leverage(BigDecimal leverage) {
    
    this.leverage = leverage;
    return this;
  }

   /**
   * Leverage for this position reported by the exchange.
   * @return leverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0", value = "Leverage for this position reported by the exchange.")

  public BigDecimal getLeverage() {
    return leverage;
  }


  public void setLeverage(BigDecimal leverage) {
    this.leverage = leverage;
  }


  public PositionDataInner crossMargin(Boolean crossMargin) {
    
    this.crossMargin = crossMargin;
    return this;
  }

   /**
   * Is cross margin mode enable for this position?
   * @return crossMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is cross margin mode enable for this position?")

  public Boolean getCrossMargin() {
    return crossMargin;
  }


  public void setCrossMargin(Boolean crossMargin) {
    this.crossMargin = crossMargin;
  }


  public PositionDataInner liquidationPrice(BigDecimal liquidationPrice) {
    
    this.liquidationPrice = liquidationPrice;
    return this;
  }

   /**
   * Liquidation price. If mark price will reach this value, the position will be liquidated.
   * @return liquidationPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.072323", value = "Liquidation price. If mark price will reach this value, the position will be liquidated.")

  public BigDecimal getLiquidationPrice() {
    return liquidationPrice;
  }


  public void setLiquidationPrice(BigDecimal liquidationPrice) {
    this.liquidationPrice = liquidationPrice;
  }


  public PositionDataInner rawData(Object rawData) {
    
    this.rawData = rawData;
    return this;
  }

   /**
   * Get rawData
   * @return rawData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Other information provided by the exchange on this position.", value = "")

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
    return Objects.equals(this.symbolIdExchange, positionDataInner.symbolIdExchange) &&
        Objects.equals(this.symbolIdCoinapi, positionDataInner.symbolIdCoinapi) &&
        Objects.equals(this.avgEntryPrice, positionDataInner.avgEntryPrice) &&
        Objects.equals(this.quantity, positionDataInner.quantity) &&
        Objects.equals(this.side, positionDataInner.side) &&
        Objects.equals(this.unrealizedPnl, positionDataInner.unrealizedPnl) &&
        Objects.equals(this.leverage, positionDataInner.leverage) &&
        Objects.equals(this.crossMargin, positionDataInner.crossMargin) &&
        Objects.equals(this.liquidationPrice, positionDataInner.liquidationPrice) &&
        Objects.equals(this.rawData, positionDataInner.rawData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbolIdExchange, symbolIdCoinapi, avgEntryPrice, quantity, side, unrealizedPnl, leverage, crossMargin, liquidationPrice, rawData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionDataInner {\n");
    sb.append("    symbolIdExchange: ").append(toIndentedString(symbolIdExchange)).append("\n");
    sb.append("    symbolIdCoinapi: ").append(toIndentedString(symbolIdCoinapi)).append("\n");
    sb.append("    avgEntryPrice: ").append(toIndentedString(avgEntryPrice)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    unrealizedPnl: ").append(toIndentedString(unrealizedPnl)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    crossMargin: ").append(toIndentedString(crossMargin)).append("\n");
    sb.append("    liquidationPrice: ").append(toIndentedString(liquidationPrice)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("symbol_id_exchange");
    openapiFields.add("symbol_id_coinapi");
    openapiFields.add("avg_entry_price");
    openapiFields.add("quantity");
    openapiFields.add("side");
    openapiFields.add("unrealized_pnl");
    openapiFields.add("leverage");
    openapiFields.add("cross_margin");
    openapiFields.add("liquidation_price");
    openapiFields.add("raw_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PositionDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PositionDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PositionDataInner is not found in the empty JSON string", PositionDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PositionDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PositionDataInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("symbol_id_exchange") != null && !jsonObj.get("symbol_id_exchange").isJsonNull()) && !jsonObj.get("symbol_id_exchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol_id_exchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol_id_exchange").toString()));
      }
      if ((jsonObj.get("symbol_id_coinapi") != null && !jsonObj.get("symbol_id_coinapi").isJsonNull()) && !jsonObj.get("symbol_id_coinapi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol_id_coinapi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol_id_coinapi").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PositionDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PositionDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PositionDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PositionDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PositionDataInner>() {
           @Override
           public void write(JsonWriter out, PositionDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PositionDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PositionDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PositionDataInner
  * @throws IOException if the JSON string is invalid with respect to PositionDataInner
  */
  public static PositionDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PositionDataInner.class);
  }

 /**
  * Convert an instance of PositionDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

