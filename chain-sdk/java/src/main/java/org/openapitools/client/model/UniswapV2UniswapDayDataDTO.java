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
 * Tracks data across all pairs aggregated into a daily bucket.
 */
@ApiModel(description = "Tracks data across all pairs aggregated into a daily bucket.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T23:04:17.330588Z[Etc/UTC]")
public class UniswapV2UniswapDayDataDTO {
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

  public static final String SERIALIZED_NAME_DAILY_VOLUME_ETH = "daily_volume_eth";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_ETH)
  private String dailyVolumeEth;

  public static final String SERIALIZED_NAME_DAILY_VOLUME_USD = "daily_volume_usd";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_USD)
  private String dailyVolumeUsd;

  public static final String SERIALIZED_NAME_DAILY_VOLUME_UNTRACKED = "daily_volume_untracked";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_UNTRACKED)
  private String dailyVolumeUntracked;

  public static final String SERIALIZED_NAME_TOTAL_VOLUME_ETH = "total_volume_eth";
  @SerializedName(SERIALIZED_NAME_TOTAL_VOLUME_ETH)
  private String totalVolumeEth;

  public static final String SERIALIZED_NAME_TOTAL_LIQUIDITY_ETH = "total_liquidity_eth";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIQUIDITY_ETH)
  private String totalLiquidityEth;

  public static final String SERIALIZED_NAME_TOTAL_VOLUME_USD = "total_volume_usd";
  @SerializedName(SERIALIZED_NAME_TOTAL_VOLUME_USD)
  private String totalVolumeUsd;

  public static final String SERIALIZED_NAME_TOTAL_LIQUIDITY_USD = "total_liquidity_usd";
  @SerializedName(SERIALIZED_NAME_TOTAL_LIQUIDITY_USD)
  private String totalLiquidityUsd;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private String txCount;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public UniswapV2UniswapDayDataDTO() {
  }

  public UniswapV2UniswapDayDataDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV2UniswapDayDataDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV2UniswapDayDataDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV2UniswapDayDataDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unix timestamp for start of day / 86400 giving a unique day index.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp for start of day / 86400 giving a unique day index.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV2UniswapDayDataDTO date(Integer date) {
    
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


  public UniswapV2UniswapDayDataDTO dailyVolumeEth(String dailyVolumeEth) {
    
    this.dailyVolumeEth = dailyVolumeEth;
    return this;
  }

   /**
   * Total volume across all pairs on this day, stored as a derived amount of ETH.
   * @return dailyVolumeEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total volume across all pairs on this day, stored as a derived amount of ETH.")

  public String getDailyVolumeEth() {
    return dailyVolumeEth;
  }


  public void setDailyVolumeEth(String dailyVolumeEth) {
    this.dailyVolumeEth = dailyVolumeEth;
  }


  public UniswapV2UniswapDayDataDTO dailyVolumeUsd(String dailyVolumeUsd) {
    
    this.dailyVolumeUsd = dailyVolumeUsd;
    return this;
  }

   /**
   * Total volume across all pairs on this day, stored as a derived amount of USD.
   * @return dailyVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total volume across all pairs on this day, stored as a derived amount of USD.")

  public String getDailyVolumeUsd() {
    return dailyVolumeUsd;
  }


  public void setDailyVolumeUsd(String dailyVolumeUsd) {
    this.dailyVolumeUsd = dailyVolumeUsd;
  }


  public UniswapV2UniswapDayDataDTO dailyVolumeUntracked(String dailyVolumeUntracked) {
    
    this.dailyVolumeUntracked = dailyVolumeUntracked;
    return this;
  }

   /**
   * Total volume across all pairs on this day, untracked.
   * @return dailyVolumeUntracked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total volume across all pairs on this day, untracked.")

  public String getDailyVolumeUntracked() {
    return dailyVolumeUntracked;
  }


  public void setDailyVolumeUntracked(String dailyVolumeUntracked) {
    this.dailyVolumeUntracked = dailyVolumeUntracked;
  }


  public UniswapV2UniswapDayDataDTO totalVolumeEth(String totalVolumeEth) {
    
    this.totalVolumeEth = totalVolumeEth;
    return this;
  }

   /**
   * All time volume across all pairs in ETH up to and including this day.
   * @return totalVolumeEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time volume across all pairs in ETH up to and including this day.")

  public String getTotalVolumeEth() {
    return totalVolumeEth;
  }


  public void setTotalVolumeEth(String totalVolumeEth) {
    this.totalVolumeEth = totalVolumeEth;
  }


  public UniswapV2UniswapDayDataDTO totalLiquidityEth(String totalLiquidityEth) {
    
    this.totalLiquidityEth = totalLiquidityEth;
    return this;
  }

   /**
   * Total liquidity across all pairs in ETH up to and including this day.
   * @return totalLiquidityEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total liquidity across all pairs in ETH up to and including this day.")

  public String getTotalLiquidityEth() {
    return totalLiquidityEth;
  }


  public void setTotalLiquidityEth(String totalLiquidityEth) {
    this.totalLiquidityEth = totalLiquidityEth;
  }


  public UniswapV2UniswapDayDataDTO totalVolumeUsd(String totalVolumeUsd) {
    
    this.totalVolumeUsd = totalVolumeUsd;
    return this;
  }

   /**
   * All time volume across all pairs in USD up to and including this day.
   * @return totalVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time volume across all pairs in USD up to and including this day.")

  public String getTotalVolumeUsd() {
    return totalVolumeUsd;
  }


  public void setTotalVolumeUsd(String totalVolumeUsd) {
    this.totalVolumeUsd = totalVolumeUsd;
  }


  public UniswapV2UniswapDayDataDTO totalLiquidityUsd(String totalLiquidityUsd) {
    
    this.totalLiquidityUsd = totalLiquidityUsd;
    return this;
  }

   /**
   * Total liquidity across all pairs in USD up to and including this day.
   * @return totalLiquidityUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total liquidity across all pairs in USD up to and including this day.")

  public String getTotalLiquidityUsd() {
    return totalLiquidityUsd;
  }


  public void setTotalLiquidityUsd(String totalLiquidityUsd) {
    this.totalLiquidityUsd = totalLiquidityUsd;
  }


  public UniswapV2UniswapDayDataDTO txCount(String txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Number of transactions throughout this day.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of transactions throughout this day.")

  public String getTxCount() {
    return txCount;
  }


  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }


  public UniswapV2UniswapDayDataDTO vid(Long vid) {
    
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
    UniswapV2UniswapDayDataDTO uniswapV2UniswapDayDataDTO = (UniswapV2UniswapDayDataDTO) o;
    return Objects.equals(this.entryTime, uniswapV2UniswapDayDataDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV2UniswapDayDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV2UniswapDayDataDTO.blockNumber) &&
        Objects.equals(this.id, uniswapV2UniswapDayDataDTO.id) &&
        Objects.equals(this.date, uniswapV2UniswapDayDataDTO.date) &&
        Objects.equals(this.dailyVolumeEth, uniswapV2UniswapDayDataDTO.dailyVolumeEth) &&
        Objects.equals(this.dailyVolumeUsd, uniswapV2UniswapDayDataDTO.dailyVolumeUsd) &&
        Objects.equals(this.dailyVolumeUntracked, uniswapV2UniswapDayDataDTO.dailyVolumeUntracked) &&
        Objects.equals(this.totalVolumeEth, uniswapV2UniswapDayDataDTO.totalVolumeEth) &&
        Objects.equals(this.totalLiquidityEth, uniswapV2UniswapDayDataDTO.totalLiquidityEth) &&
        Objects.equals(this.totalVolumeUsd, uniswapV2UniswapDayDataDTO.totalVolumeUsd) &&
        Objects.equals(this.totalLiquidityUsd, uniswapV2UniswapDayDataDTO.totalLiquidityUsd) &&
        Objects.equals(this.txCount, uniswapV2UniswapDayDataDTO.txCount) &&
        Objects.equals(this.vid, uniswapV2UniswapDayDataDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, date, dailyVolumeEth, dailyVolumeUsd, dailyVolumeUntracked, totalVolumeEth, totalLiquidityEth, totalVolumeUsd, totalLiquidityUsd, txCount, vid);
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
    sb.append("class UniswapV2UniswapDayDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dailyVolumeEth: ").append(toIndentedString(dailyVolumeEth)).append("\n");
    sb.append("    dailyVolumeUsd: ").append(toIndentedString(dailyVolumeUsd)).append("\n");
    sb.append("    dailyVolumeUntracked: ").append(toIndentedString(dailyVolumeUntracked)).append("\n");
    sb.append("    totalVolumeEth: ").append(toIndentedString(totalVolumeEth)).append("\n");
    sb.append("    totalLiquidityEth: ").append(toIndentedString(totalLiquidityEth)).append("\n");
    sb.append("    totalVolumeUsd: ").append(toIndentedString(totalVolumeUsd)).append("\n");
    sb.append("    totalLiquidityUsd: ").append(toIndentedString(totalLiquidityUsd)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
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
    openapiFields.add("daily_volume_eth");
    openapiFields.add("daily_volume_usd");
    openapiFields.add("daily_volume_untracked");
    openapiFields.add("total_volume_eth");
    openapiFields.add("total_liquidity_eth");
    openapiFields.add("total_volume_usd");
    openapiFields.add("total_liquidity_usd");
    openapiFields.add("tx_count");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV2UniswapDayDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV2UniswapDayDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV2UniswapDayDataDTO is not found in the empty JSON string", UniswapV2UniswapDayDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV2UniswapDayDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV2UniswapDayDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("daily_volume_eth") != null && !jsonObj.get("daily_volume_eth").isJsonNull()) && !jsonObj.get("daily_volume_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_eth").toString()));
      }
      if ((jsonObj.get("daily_volume_usd") != null && !jsonObj.get("daily_volume_usd").isJsonNull()) && !jsonObj.get("daily_volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_usd").toString()));
      }
      if ((jsonObj.get("daily_volume_untracked") != null && !jsonObj.get("daily_volume_untracked").isJsonNull()) && !jsonObj.get("daily_volume_untracked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_untracked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_untracked").toString()));
      }
      if ((jsonObj.get("total_volume_eth") != null && !jsonObj.get("total_volume_eth").isJsonNull()) && !jsonObj.get("total_volume_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_volume_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_volume_eth").toString()));
      }
      if ((jsonObj.get("total_liquidity_eth") != null && !jsonObj.get("total_liquidity_eth").isJsonNull()) && !jsonObj.get("total_liquidity_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_liquidity_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_liquidity_eth").toString()));
      }
      if ((jsonObj.get("total_volume_usd") != null && !jsonObj.get("total_volume_usd").isJsonNull()) && !jsonObj.get("total_volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_volume_usd").toString()));
      }
      if ((jsonObj.get("total_liquidity_usd") != null && !jsonObj.get("total_liquidity_usd").isJsonNull()) && !jsonObj.get("total_liquidity_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_liquidity_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_liquidity_usd").toString()));
      }
      if ((jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) && !jsonObj.get("tx_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV2UniswapDayDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV2UniswapDayDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV2UniswapDayDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV2UniswapDayDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV2UniswapDayDataDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV2UniswapDayDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV2UniswapDayDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV2UniswapDayDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV2UniswapDayDataDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV2UniswapDayDataDTO
  */
  public static UniswapV2UniswapDayDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV2UniswapDayDataDTO.class);
  }

 /**
  * Convert an instance of UniswapV2UniswapDayDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

