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
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.NumericsBigInteger;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Data accumulated and condensed into day stats for all of Uniswap.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T09:56:11.979115Z[Etc/UTC]")
public class UniswapV3UniswapDayDataDTO {
  public static final String SERIALIZED_NAME_ENTRY_TIME = "entry_time";
  @SerializedName(SERIALIZED_NAME_ENTRY_TIME)
  private OffsetDateTime entryTime;

  public static final String SERIALIZED_NAME_RECV_TIME = "recv_time";
  @SerializedName(SERIALIZED_NAME_RECV_TIME)
  private OffsetDateTime recvTime;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "block_number";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private Long blockNumber;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Integer date;

  public static final String SERIALIZED_NAME_VOLUME_ETH = "volume_eth";
  @SerializedName(SERIALIZED_NAME_VOLUME_ETH)
  private String volumeEth;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_VOLUME_USD_UNTRACKED = "volume_usd_untracked";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD_UNTRACKED)
  private String volumeUsdUntracked;

  public static final String SERIALIZED_NAME_FEES_USD = "fees_usd";
  @SerializedName(SERIALIZED_NAME_FEES_USD)
  private String feesUsd;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private NumericsBigInteger txCount;

  public static final String SERIALIZED_NAME_TVL_USD = "tvl_usd";
  @SerializedName(SERIALIZED_NAME_TVL_USD)
  private String tvlUsd;

  public UniswapV3UniswapDayDataDTO() {
  }

  public UniswapV3UniswapDayDataDTO entryTime(OffsetDateTime entryTime) {
    
    this.entryTime = entryTime;
    return this;
  }

   /**
   * Get entryTime
   * @return entryTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEntryTime() {
    return entryTime;
  }


  public void setEntryTime(OffsetDateTime entryTime) {
    this.entryTime = entryTime;
  }


  public UniswapV3UniswapDayDataDTO recvTime(OffsetDateTime recvTime) {
    
    this.recvTime = recvTime;
    return this;
  }

   /**
   * Get recvTime
   * @return recvTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getRecvTime() {
    return recvTime;
  }


  public void setRecvTime(OffsetDateTime recvTime) {
    this.recvTime = recvTime;
  }


  public UniswapV3UniswapDayDataDTO blockNumber(Long blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Number of block in which entity was recorded.
   * @return blockNumber
  **/
  @javax.annotation.Nullable
  public Long getBlockNumber() {
    return blockNumber;
  }


  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }


  public UniswapV3UniswapDayDataDTO vid(Long vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * 
   * @return vid
  **/
  @javax.annotation.Nullable
  public Long getVid() {
    return vid;
  }


  public void setVid(Long vid) {
    this.vid = vid;
  }


  public UniswapV3UniswapDayDataDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Timestamp rounded to current day by dividing by 86400.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV3UniswapDayDataDTO date(Integer date) {
    
    this.date = date;
    return this;
  }

   /**
   * Timestamp rounded to current day by dividing by 86400.
   * @return date
  **/
  @javax.annotation.Nullable
  public Integer getDate() {
    return date;
  }


  public void setDate(Integer date) {
    this.date = date;
  }


  public UniswapV3UniswapDayDataDTO volumeEth(String volumeEth) {
    
    this.volumeEth = volumeEth;
    return this;
  }

   /**
   * Total volume across all pairs on this day, stored as a derived amount of ETH.
   * @return volumeEth
  **/
  @javax.annotation.Nullable
  public String getVolumeEth() {
    return volumeEth;
  }


  public void setVolumeEth(String volumeEth) {
    this.volumeEth = volumeEth;
  }


  public UniswapV3UniswapDayDataDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Total volume across all pairs on this day, stored as a derived amount of USD.
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public UniswapV3UniswapDayDataDTO volumeUsdUntracked(String volumeUsdUntracked) {
    
    this.volumeUsdUntracked = volumeUsdUntracked;
    return this;
  }

   /**
   * Total daily volume in Uniswap derived in terms of USD untracked.
   * @return volumeUsdUntracked
  **/
  @javax.annotation.Nullable
  public String getVolumeUsdUntracked() {
    return volumeUsdUntracked;
  }


  public void setVolumeUsdUntracked(String volumeUsdUntracked) {
    this.volumeUsdUntracked = volumeUsdUntracked;
  }


  public UniswapV3UniswapDayDataDTO feesUsd(String feesUsd) {
    
    this.feesUsd = feesUsd;
    return this;
  }

   /**
   * Fees in USD
   * @return feesUsd
  **/
  @javax.annotation.Nullable
  public String getFeesUsd() {
    return feesUsd;
  }


  public void setFeesUsd(String feesUsd) {
    this.feesUsd = feesUsd;
  }


  public UniswapV3UniswapDayDataDTO txCount(NumericsBigInteger txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Get txCount
   * @return txCount
  **/
  @javax.annotation.Nullable
  public NumericsBigInteger getTxCount() {
    return txCount;
  }


  public void setTxCount(NumericsBigInteger txCount) {
    this.txCount = txCount;
  }


  public UniswapV3UniswapDayDataDTO tvlUsd(String tvlUsd) {
    
    this.tvlUsd = tvlUsd;
    return this;
  }

   /**
   * Tvl in terms of USD.
   * @return tvlUsd
  **/
  @javax.annotation.Nullable
  public String getTvlUsd() {
    return tvlUsd;
  }


  public void setTvlUsd(String tvlUsd) {
    this.tvlUsd = tvlUsd;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniswapV3UniswapDayDataDTO uniswapV3UniswapDayDataDTO = (UniswapV3UniswapDayDataDTO) o;
    return Objects.equals(this.entryTime, uniswapV3UniswapDayDataDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV3UniswapDayDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV3UniswapDayDataDTO.blockNumber) &&
        Objects.equals(this.vid, uniswapV3UniswapDayDataDTO.vid) &&
        Objects.equals(this.id, uniswapV3UniswapDayDataDTO.id) &&
        Objects.equals(this.date, uniswapV3UniswapDayDataDTO.date) &&
        Objects.equals(this.volumeEth, uniswapV3UniswapDayDataDTO.volumeEth) &&
        Objects.equals(this.volumeUsd, uniswapV3UniswapDayDataDTO.volumeUsd) &&
        Objects.equals(this.volumeUsdUntracked, uniswapV3UniswapDayDataDTO.volumeUsdUntracked) &&
        Objects.equals(this.feesUsd, uniswapV3UniswapDayDataDTO.feesUsd) &&
        Objects.equals(this.txCount, uniswapV3UniswapDayDataDTO.txCount) &&
        Objects.equals(this.tvlUsd, uniswapV3UniswapDayDataDTO.tvlUsd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, id, date, volumeEth, volumeUsd, volumeUsdUntracked, feesUsd, txCount, tvlUsd);
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
    sb.append("class UniswapV3UniswapDayDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    volumeEth: ").append(toIndentedString(volumeEth)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    volumeUsdUntracked: ").append(toIndentedString(volumeUsdUntracked)).append("\n");
    sb.append("    feesUsd: ").append(toIndentedString(feesUsd)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    tvlUsd: ").append(toIndentedString(tvlUsd)).append("\n");
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
    openapiFields.add("vid");
    openapiFields.add("id");
    openapiFields.add("date");
    openapiFields.add("volume_eth");
    openapiFields.add("volume_usd");
    openapiFields.add("volume_usd_untracked");
    openapiFields.add("fees_usd");
    openapiFields.add("tx_count");
    openapiFields.add("tvl_usd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV3UniswapDayDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV3UniswapDayDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV3UniswapDayDataDTO is not found in the empty JSON string", UniswapV3UniswapDayDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV3UniswapDayDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV3UniswapDayDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("volume_eth") != null && !jsonObj.get("volume_eth").isJsonNull()) && !jsonObj.get("volume_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_eth").toString()));
      }
      if ((jsonObj.get("volume_usd") != null && !jsonObj.get("volume_usd").isJsonNull()) && !jsonObj.get("volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_usd").toString()));
      }
      if ((jsonObj.get("volume_usd_untracked") != null && !jsonObj.get("volume_usd_untracked").isJsonNull()) && !jsonObj.get("volume_usd_untracked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_usd_untracked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_usd_untracked").toString()));
      }
      if ((jsonObj.get("fees_usd") != null && !jsonObj.get("fees_usd").isJsonNull()) && !jsonObj.get("fees_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fees_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fees_usd").toString()));
      }
      // validate the optional field `tx_count`
      if (jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("tx_count"));
      }
      if ((jsonObj.get("tvl_usd") != null && !jsonObj.get("tvl_usd").isJsonNull()) && !jsonObj.get("tvl_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tvl_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tvl_usd").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV3UniswapDayDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV3UniswapDayDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV3UniswapDayDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV3UniswapDayDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV3UniswapDayDataDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV3UniswapDayDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV3UniswapDayDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV3UniswapDayDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV3UniswapDayDataDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV3UniswapDayDataDTO
  */
  public static UniswapV3UniswapDayDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV3UniswapDayDataDTO.class);
  }

 /**
  * Convert an instance of UniswapV3UniswapDayDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

