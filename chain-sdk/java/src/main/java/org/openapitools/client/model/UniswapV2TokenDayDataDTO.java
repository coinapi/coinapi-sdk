/*
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Token data aggregated across all pairs that include token.
 */
@ApiModel(description = "Token data aggregated across all pairs that include token.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-02T15:08:36.076203Z[Etc/UTC]")
public class UniswapV2TokenDayDataDTO {
  public static final String SERIALIZED_NAME_ENTRY_TIME = "entry_time";
  @SerializedName(SERIALIZED_NAME_ENTRY_TIME)
  private OffsetDateTime entryTime;

  public static final String SERIALIZED_NAME_RECV_TIME = "recv_time";
  @SerializedName(SERIALIZED_NAME_RECV_TIME)
  private OffsetDateTime recvTime;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "block_number";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private Long blockNumber;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Integer date;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_DAILY_VOLUME_TOKEN = "daily_volume_token";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_TOKEN)
  private String dailyVolumeToken;

  public static final String SERIALIZED_NAME_DAILY_VOLUME_ETH = "daily_volume_eth";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_ETH)
  private String dailyVolumeEth;

  public static final String SERIALIZED_NAME_DAILY_VOLUME_USD = "daily_volume_usd";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_USD)
  private String dailyVolumeUsd;

  public static final String SERIALIZED_NAME_DAILY_TXNS = "daily_txns";
  @SerializedName(SERIALIZED_NAME_DAILY_TXNS)
  private String dailyTxns;

  public static final String SERIALIZED_NAME_TOTAL_LIQUIDITY_TOKEN = "total_liquidity_token";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIQUIDITY_TOKEN)
  private String totalLiquidityToken;

  public static final String SERIALIZED_NAME_TOTAL_LIQUIDITY_ETH = "total_liquidity_eth";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIQUIDITY_ETH)
  private String totalLiquidityEth;

  public static final String SERIALIZED_NAME_TOTAL_LIQUIDITY_USD = "total_liquidity_usd";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIQUIDITY_USD)
  private String totalLiquidityUsd;

  public static final String SERIALIZED_NAME_PRICE_USD = "price_usd";
  @SerializedName(SERIALIZED_NAME_PRICE_USD)
  private String priceUsd;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public UniswapV2TokenDayDataDTO() {
  }

  public UniswapV2TokenDayDataDTO entryTime(OffsetDateTime entryTime) {
    
    this.entryTime = entryTime;
    return this;
  }

   /**
   * Get entryTime
   * @return entryTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEntryTime() {
    return entryTime;
  }


  public void setEntryTime(OffsetDateTime entryTime) {
    this.entryTime = entryTime;
  }


  public UniswapV2TokenDayDataDTO recvTime(OffsetDateTime recvTime) {
    
    this.recvTime = recvTime;
    return this;
  }

   /**
   * Get recvTime
   * @return recvTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRecvTime() {
    return recvTime;
  }


  public void setRecvTime(OffsetDateTime recvTime) {
    this.recvTime = recvTime;
  }


  public UniswapV2TokenDayDataDTO blockNumber(Long blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Number of block in which entity was recorded.
   * @return blockNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of block in which entity was recorded.")

  public Long getBlockNumber() {
    return blockNumber;
  }


  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }


  public UniswapV2TokenDayDataDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV2TokenDayDataDTO date(Integer date) {
    
    this.date = date;
    return this;
  }

   /**
   * Unix timestamp for start of day.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp for start of day.")

  public Integer getDate() {
    return date;
  }


  public void setDate(Integer date) {
    this.date = date;
  }


  public UniswapV2TokenDayDataDTO token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Reference to token entity.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token entity.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public UniswapV2TokenDayDataDTO dailyVolumeToken(String dailyVolumeToken) {
    
    this.dailyVolumeToken = dailyVolumeToken;
    return this;
  }

   /**
   * Amount of token swapped across all pairs throughout day.
   * @return dailyVolumeToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token swapped across all pairs throughout day.")

  public String getDailyVolumeToken() {
    return dailyVolumeToken;
  }


  public void setDailyVolumeToken(String dailyVolumeToken) {
    this.dailyVolumeToken = dailyVolumeToken;
  }


  public UniswapV2TokenDayDataDTO dailyVolumeEth(String dailyVolumeEth) {
    
    this.dailyVolumeEth = dailyVolumeEth;
    return this;
  }

   /**
   * Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
   * @return dailyVolumeEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.")

  public String getDailyVolumeEth() {
    return dailyVolumeEth;
  }


  public void setDailyVolumeEth(String dailyVolumeEth) {
    this.dailyVolumeEth = dailyVolumeEth;
  }


  public UniswapV2TokenDayDataDTO dailyVolumeUsd(String dailyVolumeUsd) {
    
    this.dailyVolumeUsd = dailyVolumeUsd;
    return this;
  }

   /**
   * Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
   * @return dailyVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token swapped across all pairs throughout day stored as a derived amount of USD.")

  public String getDailyVolumeUsd() {
    return dailyVolumeUsd;
  }


  public void setDailyVolumeUsd(String dailyVolumeUsd) {
    this.dailyVolumeUsd = dailyVolumeUsd;
  }


  public UniswapV2TokenDayDataDTO dailyTxns(String dailyTxns) {
    
    this.dailyTxns = dailyTxns;
    return this;
  }

   /**
   * Amount of transactions with this token across all pairs.
   * @return dailyTxns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of transactions with this token across all pairs.")

  public String getDailyTxns() {
    return dailyTxns;
  }


  public void setDailyTxns(String dailyTxns) {
    this.dailyTxns = dailyTxns;
  }


  public UniswapV2TokenDayDataDTO totalLiquidityToken(String totalLiquidityToken) {
    
    this.totalLiquidityToken = totalLiquidityToken;
    return this;
  }

   /**
   * Token amount of token deposited across all pairs.
   * @return totalLiquidityToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token amount of token deposited across all pairs.")

  public String getTotalLiquidityToken() {
    return totalLiquidityToken;
  }


  public void setTotalLiquidityToken(String totalLiquidityToken) {
    this.totalLiquidityToken = totalLiquidityToken;
  }


  public UniswapV2TokenDayDataDTO totalLiquidityEth(String totalLiquidityEth) {
    
    this.totalLiquidityEth = totalLiquidityEth;
    return this;
  }

   /**
   * Token amount of token deposited across all pairs stored as amount of ETH.
   * @return totalLiquidityEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token amount of token deposited across all pairs stored as amount of ETH.")

  public String getTotalLiquidityEth() {
    return totalLiquidityEth;
  }


  public void setTotalLiquidityEth(String totalLiquidityEth) {
    this.totalLiquidityEth = totalLiquidityEth;
  }


  public UniswapV2TokenDayDataDTO totalLiquidityUsd(String totalLiquidityUsd) {
    
    this.totalLiquidityUsd = totalLiquidityUsd;
    return this;
  }

   /**
   * Token amount of token deposited across all pairs stored as amount of USD.
   * @return totalLiquidityUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token amount of token deposited across all pairs stored as amount of USD.")

  public String getTotalLiquidityUsd() {
    return totalLiquidityUsd;
  }


  public void setTotalLiquidityUsd(String totalLiquidityUsd) {
    this.totalLiquidityUsd = totalLiquidityUsd;
  }


  public UniswapV2TokenDayDataDTO priceUsd(String priceUsd) {
    
    this.priceUsd = priceUsd;
    return this;
  }

   /**
   * Price of token in derived USD.
   * @return priceUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price of token in derived USD.")

  public String getPriceUsd() {
    return priceUsd;
  }


  public void setPriceUsd(String priceUsd) {
    this.priceUsd = priceUsd;
  }


  public UniswapV2TokenDayDataDTO vid(Long vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * 
   * @return vid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getVid() {
    return vid;
  }


  public void setVid(Long vid) {
    this.vid = vid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniswapV2TokenDayDataDTO uniswapV2TokenDayDataDTO = (UniswapV2TokenDayDataDTO) o;
    return Objects.equals(this.entryTime, uniswapV2TokenDayDataDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV2TokenDayDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV2TokenDayDataDTO.blockNumber) &&
        Objects.equals(this.id, uniswapV2TokenDayDataDTO.id) &&
        Objects.equals(this.date, uniswapV2TokenDayDataDTO.date) &&
        Objects.equals(this.token, uniswapV2TokenDayDataDTO.token) &&
        Objects.equals(this.dailyVolumeToken, uniswapV2TokenDayDataDTO.dailyVolumeToken) &&
        Objects.equals(this.dailyVolumeEth, uniswapV2TokenDayDataDTO.dailyVolumeEth) &&
        Objects.equals(this.dailyVolumeUsd, uniswapV2TokenDayDataDTO.dailyVolumeUsd) &&
        Objects.equals(this.dailyTxns, uniswapV2TokenDayDataDTO.dailyTxns) &&
        Objects.equals(this.totalLiquidityToken, uniswapV2TokenDayDataDTO.totalLiquidityToken) &&
        Objects.equals(this.totalLiquidityEth, uniswapV2TokenDayDataDTO.totalLiquidityEth) &&
        Objects.equals(this.totalLiquidityUsd, uniswapV2TokenDayDataDTO.totalLiquidityUsd) &&
        Objects.equals(this.priceUsd, uniswapV2TokenDayDataDTO.priceUsd) &&
        Objects.equals(this.vid, uniswapV2TokenDayDataDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, date, token, dailyVolumeToken, dailyVolumeEth, dailyVolumeUsd, dailyTxns, totalLiquidityToken, totalLiquidityEth, totalLiquidityUsd, priceUsd, vid);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV2TokenDayDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    dailyVolumeToken: ").append(toIndentedString(dailyVolumeToken)).append("\n");
    sb.append("    dailyVolumeEth: ").append(toIndentedString(dailyVolumeEth)).append("\n");
    sb.append("    dailyVolumeUsd: ").append(toIndentedString(dailyVolumeUsd)).append("\n");
    sb.append("    dailyTxns: ").append(toIndentedString(dailyTxns)).append("\n");
    sb.append("    totalLiquidityToken: ").append(toIndentedString(totalLiquidityToken)).append("\n");
    sb.append("    totalLiquidityEth: ").append(toIndentedString(totalLiquidityEth)).append("\n");
    sb.append("    totalLiquidityUsd: ").append(toIndentedString(totalLiquidityUsd)).append("\n");
    sb.append("    priceUsd: ").append(toIndentedString(priceUsd)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
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
    openapiFields.add("entry_time");
    openapiFields.add("recv_time");
    openapiFields.add("block_number");
    openapiFields.add("id");
    openapiFields.add("date");
    openapiFields.add("token");
    openapiFields.add("daily_volume_token");
    openapiFields.add("daily_volume_eth");
    openapiFields.add("daily_volume_usd");
    openapiFields.add("daily_txns");
    openapiFields.add("total_liquidity_token");
    openapiFields.add("total_liquidity_eth");
    openapiFields.add("total_liquidity_usd");
    openapiFields.add("price_usd");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV2TokenDayDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV2TokenDayDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV2TokenDayDataDTO is not found in the empty JSON string", UniswapV2TokenDayDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV2TokenDayDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV2TokenDayDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("daily_volume_token") != null && !jsonObj.get("daily_volume_token").isJsonNull()) && !jsonObj.get("daily_volume_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_token").toString()));
      }
      if ((jsonObj.get("daily_volume_eth") != null && !jsonObj.get("daily_volume_eth").isJsonNull()) && !jsonObj.get("daily_volume_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_eth").toString()));
      }
      if ((jsonObj.get("daily_volume_usd") != null && !jsonObj.get("daily_volume_usd").isJsonNull()) && !jsonObj.get("daily_volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_usd").toString()));
      }
      if ((jsonObj.get("daily_txns") != null && !jsonObj.get("daily_txns").isJsonNull()) && !jsonObj.get("daily_txns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_txns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_txns").toString()));
      }
      if ((jsonObj.get("total_liquidity_token") != null && !jsonObj.get("total_liquidity_token").isJsonNull()) && !jsonObj.get("total_liquidity_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_liquidity_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_liquidity_token").toString()));
      }
      if ((jsonObj.get("total_liquidity_eth") != null && !jsonObj.get("total_liquidity_eth").isJsonNull()) && !jsonObj.get("total_liquidity_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_liquidity_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_liquidity_eth").toString()));
      }
      if ((jsonObj.get("total_liquidity_usd") != null && !jsonObj.get("total_liquidity_usd").isJsonNull()) && !jsonObj.get("total_liquidity_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_liquidity_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_liquidity_usd").toString()));
      }
      if ((jsonObj.get("price_usd") != null && !jsonObj.get("price_usd").isJsonNull()) && !jsonObj.get("price_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_usd").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV2TokenDayDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV2TokenDayDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV2TokenDayDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV2TokenDayDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV2TokenDayDataDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV2TokenDayDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV2TokenDayDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV2TokenDayDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV2TokenDayDataDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV2TokenDayDataDTO
  */
  public static UniswapV2TokenDayDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV2TokenDayDataDTO.class);
  }

 /**
  * Convert an instance of UniswapV2TokenDayDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

