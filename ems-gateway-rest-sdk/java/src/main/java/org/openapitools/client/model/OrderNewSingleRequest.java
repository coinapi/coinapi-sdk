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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OrdSide;
import org.openapitools.client.model.OrdType;
import org.openapitools.client.model.TimeInForce;

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
 * The new order message.
 */
@ApiModel(description = "The new order message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-09T16:28:53.833440Z[Etc/UTC]")
public class OrderNewSingleRequest {
  public static final String SERIALIZED_NAME_EXCHANGE_ID = "exchange_id";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_ID)
  private String exchangeId;

  public static final String SERIALIZED_NAME_CLIENT_ORDER_ID = "client_order_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ORDER_ID)
  private String clientOrderId;

  public static final String SERIALIZED_NAME_SYMBOL_ID_EXCHANGE = "symbol_id_exchange";
  @SerializedName(SERIALIZED_NAME_SYMBOL_ID_EXCHANGE)
  private String symbolIdExchange;

  public static final String SERIALIZED_NAME_SYMBOL_ID_COINAPI = "symbol_id_coinapi";
  @SerializedName(SERIALIZED_NAME_SYMBOL_ID_COINAPI)
  private String symbolIdCoinapi;

  public static final String SERIALIZED_NAME_AMOUNT_ORDER = "amount_order";
  @SerializedName(SERIALIZED_NAME_AMOUNT_ORDER)
  private BigDecimal amountOrder;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_SIDE = "side";
  @SerializedName(SERIALIZED_NAME_SIDE)
  private OrdSide side;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private OrdType orderType;

  public static final String SERIALIZED_NAME_TIME_IN_FORCE = "time_in_force";
  @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
  private TimeInForce timeInForce;

  public static final String SERIALIZED_NAME_EXPIRE_TIME = "expire_time";
  @SerializedName(SERIALIZED_NAME_EXPIRE_TIME)
  private LocalDate expireTime = null;

  /**
   * Gets or Sets execInst
   */
  @JsonAdapter(ExecInstEnum.Adapter.class)
  public enum ExecInstEnum {
    MAKER_OR_CANCEL("MAKER_OR_CANCEL"),
    
    AUCTION_ONLY("AUCTION_ONLY"),
    
    INDICATION_OF_INTEREST("INDICATION_OF_INTEREST");

    private String value;

    ExecInstEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExecInstEnum fromValue(String value) {
      for (ExecInstEnum b : ExecInstEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ExecInstEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExecInstEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExecInstEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ExecInstEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EXEC_INST = "exec_inst";
  @SerializedName(SERIALIZED_NAME_EXEC_INST)
  private List<ExecInstEnum> execInst = null;

  public OrderNewSingleRequest() {
  }

  public OrderNewSingleRequest exchangeId(String exchangeId) {
    
    this.exchangeId = exchangeId;
    return this;
  }

   /**
   * Exchange identifier used to identify the routing destination.
   * @return exchangeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "KRAKEN", required = true, value = "Exchange identifier used to identify the routing destination.")

  public String getExchangeId() {
    return exchangeId;
  }


  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }


  public OrderNewSingleRequest clientOrderId(String clientOrderId) {
    
    this.clientOrderId = clientOrderId;
    return this;
  }

   /**
   * The unique identifier of the order assigned by the client.
   * @return clientOrderId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6ab36bc1-344d-432e-ac6d-0bf44ee64c2b", required = true, value = "The unique identifier of the order assigned by the client.")

  public String getClientOrderId() {
    return clientOrderId;
  }


  public void setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
  }


  public OrderNewSingleRequest symbolIdExchange(String symbolIdExchange) {
    
    this.symbolIdExchange = symbolIdExchange;
    return this;
  }

   /**
   * Exchange symbol. One of the properties (&#x60;symbol_id_exchange&#x60;, &#x60;symbol_id_coinapi&#x60;) is required to identify the market for the new order.
   * @return symbolIdExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XBT/USDT", value = "Exchange symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.")

  public String getSymbolIdExchange() {
    return symbolIdExchange;
  }


  public void setSymbolIdExchange(String symbolIdExchange) {
    this.symbolIdExchange = symbolIdExchange;
  }


  public OrderNewSingleRequest symbolIdCoinapi(String symbolIdCoinapi) {
    
    this.symbolIdCoinapi = symbolIdCoinapi;
    return this;
  }

   /**
   * CoinAPI symbol. One of the properties (&#x60;symbol_id_exchange&#x60;, &#x60;symbol_id_coinapi&#x60;) is required to identify the market for the new order.
   * @return symbolIdCoinapi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "KRAKEN_SPOT_BTC_USDT", value = "CoinAPI symbol. One of the properties (`symbol_id_exchange`, `symbol_id_coinapi`) is required to identify the market for the new order.")

  public String getSymbolIdCoinapi() {
    return symbolIdCoinapi;
  }


  public void setSymbolIdCoinapi(String symbolIdCoinapi) {
    this.symbolIdCoinapi = symbolIdCoinapi;
  }


  public OrderNewSingleRequest amountOrder(BigDecimal amountOrder) {
    
    this.amountOrder = amountOrder;
    return this;
  }

   /**
   * Order quantity.
   * @return amountOrder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.045", required = true, value = "Order quantity.")

  public BigDecimal getAmountOrder() {
    return amountOrder;
  }


  public void setAmountOrder(BigDecimal amountOrder) {
    this.amountOrder = amountOrder;
  }


  public OrderNewSingleRequest price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Order price.
   * @return price
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.0783", required = true, value = "Order price.")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public OrderNewSingleRequest side(OrdSide side) {
    
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OrdSide getSide() {
    return side;
  }


  public void setSide(OrdSide side) {
    this.side = side;
  }


  public OrderNewSingleRequest orderType(OrdType orderType) {
    
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OrdType getOrderType() {
    return orderType;
  }


  public void setOrderType(OrdType orderType) {
    this.orderType = orderType;
  }


  public OrderNewSingleRequest timeInForce(TimeInForce timeInForce) {
    
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TimeInForce getTimeInForce() {
    return timeInForce;
  }


  public void setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
  }


  public OrderNewSingleRequest expireTime(LocalDate expireTime) {
    
    this.expireTime = expireTime;
    return this;
  }

   /**
   * Expiration time. Conditionaly required for orders with time_in_force &#x3D; &#x60;GOOD_TILL_TIME_EXCHANGE&#x60; or &#x60;GOOD_TILL_TIME_OEML&#x60;.
   * @return expireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T10:45:20.1677709Z", value = "Expiration time. Conditionaly required for orders with time_in_force = `GOOD_TILL_TIME_EXCHANGE` or `GOOD_TILL_TIME_OEML`.")

  public LocalDate getExpireTime() {
    return expireTime;
  }


  public void setExpireTime(LocalDate expireTime) {
    this.expireTime = expireTime;
  }


  public OrderNewSingleRequest execInst(List<ExecInstEnum> execInst) {
    
    this.execInst = execInst;
    return this;
  }

  public OrderNewSingleRequest addExecInstItem(ExecInstEnum execInstItem) {
    if (this.execInst == null) {
      this.execInst = new ArrayList<>();
    }
    this.execInst.add(execInstItem);
    return this;
  }

   /**
   * Order execution instructions are documented in the separate section: &lt;a href&#x3D;\&quot;#ems-order-params-exec\&quot;&gt;EMS / Starter Guide / Order parameters / Execution instructions&lt;/a&gt; 
   * @return execInst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"MAKER_OR_CANCEL\"]", value = "Order execution instructions are documented in the separate section: <a href=\"#ems-order-params-exec\">EMS / Starter Guide / Order parameters / Execution instructions</a> ")

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
    OrderNewSingleRequest orderNewSingleRequest = (OrderNewSingleRequest) o;
    return Objects.equals(this.exchangeId, orderNewSingleRequest.exchangeId) &&
        Objects.equals(this.clientOrderId, orderNewSingleRequest.clientOrderId) &&
        Objects.equals(this.symbolIdExchange, orderNewSingleRequest.symbolIdExchange) &&
        Objects.equals(this.symbolIdCoinapi, orderNewSingleRequest.symbolIdCoinapi) &&
        Objects.equals(this.amountOrder, orderNewSingleRequest.amountOrder) &&
        Objects.equals(this.price, orderNewSingleRequest.price) &&
        Objects.equals(this.side, orderNewSingleRequest.side) &&
        Objects.equals(this.orderType, orderNewSingleRequest.orderType) &&
        Objects.equals(this.timeInForce, orderNewSingleRequest.timeInForce) &&
        Objects.equals(this.expireTime, orderNewSingleRequest.expireTime) &&
        Objects.equals(this.execInst, orderNewSingleRequest.execInst);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeId, clientOrderId, symbolIdExchange, symbolIdCoinapi, amountOrder, price, side, orderType, timeInForce, expireTime, execInst);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderNewSingleRequest {\n");
    sb.append("    exchangeId: ").append(toIndentedString(exchangeId)).append("\n");
    sb.append("    clientOrderId: ").append(toIndentedString(clientOrderId)).append("\n");
    sb.append("    symbolIdExchange: ").append(toIndentedString(symbolIdExchange)).append("\n");
    sb.append("    symbolIdCoinapi: ").append(toIndentedString(symbolIdCoinapi)).append("\n");
    sb.append("    amountOrder: ").append(toIndentedString(amountOrder)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    execInst: ").append(toIndentedString(execInst)).append("\n");
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
    openapiFields.add("exchange_id");
    openapiFields.add("client_order_id");
    openapiFields.add("symbol_id_exchange");
    openapiFields.add("symbol_id_coinapi");
    openapiFields.add("amount_order");
    openapiFields.add("price");
    openapiFields.add("side");
    openapiFields.add("order_type");
    openapiFields.add("time_in_force");
    openapiFields.add("expire_time");
    openapiFields.add("exec_inst");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("exchange_id");
    openapiRequiredFields.add("client_order_id");
    openapiRequiredFields.add("amount_order");
    openapiRequiredFields.add("price");
    openapiRequiredFields.add("side");
    openapiRequiredFields.add("order_type");
    openapiRequiredFields.add("time_in_force");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderNewSingleRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderNewSingleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderNewSingleRequest is not found in the empty JSON string", OrderNewSingleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderNewSingleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderNewSingleRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderNewSingleRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("exchange_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchange_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchange_id").toString()));
      }
      if (!jsonObj.get("client_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_order_id").toString()));
      }
      if ((jsonObj.get("symbol_id_exchange") != null && !jsonObj.get("symbol_id_exchange").isJsonNull()) && !jsonObj.get("symbol_id_exchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol_id_exchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol_id_exchange").toString()));
      }
      if ((jsonObj.get("symbol_id_coinapi") != null && !jsonObj.get("symbol_id_coinapi").isJsonNull()) && !jsonObj.get("symbol_id_coinapi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol_id_coinapi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol_id_coinapi").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("exec_inst") != null && !jsonObj.get("exec_inst").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exec_inst` to be an array in the JSON string but got `%s`", jsonObj.get("exec_inst").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderNewSingleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderNewSingleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderNewSingleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderNewSingleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderNewSingleRequest>() {
           @Override
           public void write(JsonWriter out, OrderNewSingleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderNewSingleRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderNewSingleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderNewSingleRequest
  * @throws IOException if the JSON string is invalid with respect to OrderNewSingleRequest
  */
  public static OrderNewSingleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderNewSingleRequest.class);
  }

 /**
  * Convert an instance of OrderNewSingleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

