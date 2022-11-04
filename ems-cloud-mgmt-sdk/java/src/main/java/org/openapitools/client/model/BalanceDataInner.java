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
 * BalanceDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-04T09:38:09.020089Z[Etc/UTC]")
public class BalanceDataInner {
  public static final String SERIALIZED_NAME_ASSET_ID_EXCHANGE = "asset_id_exchange";
  @SerializedName(SERIALIZED_NAME_ASSET_ID_EXCHANGE)
  private String assetIdExchange;

  public static final String SERIALIZED_NAME_ASSET_ID_COINAPI = "asset_id_coinapi";
  @SerializedName(SERIALIZED_NAME_ASSET_ID_COINAPI)
  private String assetIdCoinapi;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Double balance;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Double available;

  public static final String SERIALIZED_NAME_LOCKED = "locked";
  @SerializedName(SERIALIZED_NAME_LOCKED)
  private Double locked;

  /**
   * Source of the last modification. 
   */
  @JsonAdapter(LastUpdatedByEnum.Adapter.class)
  public enum LastUpdatedByEnum {
    INITIALIZATION("INITIALIZATION"),
    
    BALANCE_MANAGER("BALANCE_MANAGER"),
    
    EXCHANGE("EXCHANGE");

    private String value;

    LastUpdatedByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LastUpdatedByEnum fromValue(String value) {
      for (LastUpdatedByEnum b : LastUpdatedByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LastUpdatedByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LastUpdatedByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LastUpdatedByEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LastUpdatedByEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LAST_UPDATED_BY = "last_updated_by";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_BY)
  private LastUpdatedByEnum lastUpdatedBy;

  public static final String SERIALIZED_NAME_RATE_USD = "rate_usd";
  @SerializedName(SERIALIZED_NAME_RATE_USD)
  private Double rateUsd;

  public static final String SERIALIZED_NAME_TRADED = "traded";
  @SerializedName(SERIALIZED_NAME_TRADED)
  private Double traded;

  public BalanceDataInner() {
  }

  public BalanceDataInner assetIdExchange(String assetIdExchange) {
    
    this.assetIdExchange = assetIdExchange;
    return this;
  }

   /**
   * Exchange currency code.
   * @return assetIdExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XBT", value = "Exchange currency code.")

  public String getAssetIdExchange() {
    return assetIdExchange;
  }


  public void setAssetIdExchange(String assetIdExchange) {
    this.assetIdExchange = assetIdExchange;
  }


  public BalanceDataInner assetIdCoinapi(String assetIdCoinapi) {
    
    this.assetIdCoinapi = assetIdCoinapi;
    return this;
  }

   /**
   * CoinAPI currency code.
   * @return assetIdCoinapi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BTC", value = "CoinAPI currency code.")

  public String getAssetIdCoinapi() {
    return assetIdCoinapi;
  }


  public void setAssetIdCoinapi(String assetIdCoinapi) {
    this.assetIdCoinapi = assetIdCoinapi;
  }


  public BalanceDataInner balance(Double balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Value of the current total currency balance on the exchange.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.00134444", value = "Value of the current total currency balance on the exchange.")

  public Double getBalance() {
    return balance;
  }


  public void setBalance(Double balance) {
    this.balance = balance;
  }


  public BalanceDataInner available(Double available) {
    
    this.available = available;
    return this;
  }

   /**
   * Value of the current available currency balance on the exchange that can be used as collateral.
   * @return available
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.00134444", value = "Value of the current available currency balance on the exchange that can be used as collateral.")

  public Double getAvailable() {
    return available;
  }


  public void setAvailable(Double available) {
    this.available = available;
  }


  public BalanceDataInner locked(Double locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Value of the current locked currency balance by the exchange.
   * @return locked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0", value = "Value of the current locked currency balance by the exchange.")

  public Double getLocked() {
    return locked;
  }


  public void setLocked(Double locked) {
    this.locked = locked;
  }


  public BalanceDataInner lastUpdatedBy(LastUpdatedByEnum lastUpdatedBy) {
    
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Source of the last modification. 
   * @return lastUpdatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXCHANGE", value = "Source of the last modification. ")

  public LastUpdatedByEnum getLastUpdatedBy() {
    return lastUpdatedBy;
  }


  public void setLastUpdatedBy(LastUpdatedByEnum lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  public BalanceDataInner rateUsd(Double rateUsd) {
    
    this.rateUsd = rateUsd;
    return this;
  }

   /**
   * Current exchange rate to the USD for the single unit of the currency. 
   * @return rateUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1355.12", value = "Current exchange rate to the USD for the single unit of the currency. ")

  public Double getRateUsd() {
    return rateUsd;
  }


  public void setRateUsd(Double rateUsd) {
    this.rateUsd = rateUsd;
  }


  public BalanceDataInner traded(Double traded) {
    
    this.traded = traded;
    return this;
  }

   /**
   * Value of the current total traded.
   * @return traded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.007", value = "Value of the current total traded.")

  public Double getTraded() {
    return traded;
  }


  public void setTraded(Double traded) {
    this.traded = traded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceDataInner balanceDataInner = (BalanceDataInner) o;
    return Objects.equals(this.assetIdExchange, balanceDataInner.assetIdExchange) &&
        Objects.equals(this.assetIdCoinapi, balanceDataInner.assetIdCoinapi) &&
        Objects.equals(this.balance, balanceDataInner.balance) &&
        Objects.equals(this.available, balanceDataInner.available) &&
        Objects.equals(this.locked, balanceDataInner.locked) &&
        Objects.equals(this.lastUpdatedBy, balanceDataInner.lastUpdatedBy) &&
        Objects.equals(this.rateUsd, balanceDataInner.rateUsd) &&
        Objects.equals(this.traded, balanceDataInner.traded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIdExchange, assetIdCoinapi, balance, available, locked, lastUpdatedBy, rateUsd, traded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceDataInner {\n");
    sb.append("    assetIdExchange: ").append(toIndentedString(assetIdExchange)).append("\n");
    sb.append("    assetIdCoinapi: ").append(toIndentedString(assetIdCoinapi)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    rateUsd: ").append(toIndentedString(rateUsd)).append("\n");
    sb.append("    traded: ").append(toIndentedString(traded)).append("\n");
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
    openapiFields.add("asset_id_exchange");
    openapiFields.add("asset_id_coinapi");
    openapiFields.add("balance");
    openapiFields.add("available");
    openapiFields.add("locked");
    openapiFields.add("last_updated_by");
    openapiFields.add("rate_usd");
    openapiFields.add("traded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BalanceDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BalanceDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceDataInner is not found in the empty JSON string", BalanceDataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BalanceDataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BalanceDataInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("asset_id_exchange") != null && !jsonObj.get("asset_id_exchange").isJsonNull()) && !jsonObj.get("asset_id_exchange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_id_exchange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_id_exchange").toString()));
      }
      if ((jsonObj.get("asset_id_coinapi") != null && !jsonObj.get("asset_id_coinapi").isJsonNull()) && !jsonObj.get("asset_id_coinapi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset_id_coinapi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset_id_coinapi").toString()));
      }
      if ((jsonObj.get("last_updated_by") != null && !jsonObj.get("last_updated_by").isJsonNull()) && !jsonObj.get("last_updated_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated_by").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceDataInner>() {
           @Override
           public void write(JsonWriter out, BalanceDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BalanceDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BalanceDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalanceDataInner
  * @throws IOException if the JSON string is invalid with respect to BalanceDataInner
  */
  public static BalanceDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceDataInner.class);
  }

 /**
  * Convert an instance of BalanceDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

