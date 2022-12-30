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
 * Tracks pair data across each hour.
 */
@ApiModel(description = "Tracks pair data across each hour.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-30T09:47:49.441837Z[Etc/UTC]")
public class SushiswapPairHourDataDTO {
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

  public static final String SERIALIZED_NAME_PAIR = "pair";
  @SerializedName(SERIALIZED_NAME_PAIR)
  private String pair;

  public static final String SERIALIZED_NAME_RESERVE0 = "reserve_0";
  @SerializedName(SERIALIZED_NAME_RESERVE0)
  private String reserve0;

  public static final String SERIALIZED_NAME_RESERVE1 = "reserve_1";
  @SerializedName(SERIALIZED_NAME_RESERVE1)
  private String reserve1;

  public static final String SERIALIZED_NAME_RESERVE_USD = "reserve_usd";
  @SerializedName(SERIALIZED_NAME_RESERVE_USD)
  private String reserveUsd;

  public static final String SERIALIZED_NAME_VOLUME_TOKEN0 = "volume_token_0";
  @SerializedName(SERIALIZED_NAME_VOLUME_TOKEN0)
  private String volumeToken0;

  public static final String SERIALIZED_NAME_VOLUME_TOKEN1 = "volume_token_1";
  @SerializedName(SERIALIZED_NAME_VOLUME_TOKEN1)
  private String volumeToken1;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private String txCount;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public SushiswapPairHourDataDTO() {
  }

  public SushiswapPairHourDataDTO entryTime(OffsetDateTime entryTime) {
    
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


  public SushiswapPairHourDataDTO recvTime(OffsetDateTime recvTime) {
    
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


  public SushiswapPairHourDataDTO blockNumber(Long blockNumber) {
    
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


  public SushiswapPairHourDataDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier, format: &lt;pair id&gt;-&lt;hour start timestamp&gt;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier, format: <pair id>-<hour start timestamp>.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SushiswapPairHourDataDTO date(Integer date) {
    
    this.date = date;
    return this;
  }

   /**
   * Hour start timestamp.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hour start timestamp.")

  public Integer getDate() {
    return date;
  }


  public void setDate(Integer date) {
    this.date = date;
  }


  public SushiswapPairHourDataDTO pair(String pair) {
    
    this.pair = pair;
    return this;
  }

   /**
   * Reference to pair.
   * @return pair
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to pair.")

  public String getPair() {
    return pair;
  }


  public void setPair(String pair) {
    this.pair = pair;
  }


  public SushiswapPairHourDataDTO reserve0(String reserve0) {
    
    this.reserve0 = reserve0;
    return this;
  }

   /**
   * Reserve of token0 (updated during each transaction on pair).
   * @return reserve0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reserve of token0 (updated during each transaction on pair).")

  public String getReserve0() {
    return reserve0;
  }


  public void setReserve0(String reserve0) {
    this.reserve0 = reserve0;
  }


  public SushiswapPairHourDataDTO reserve1(String reserve1) {
    
    this.reserve1 = reserve1;
    return this;
  }

   /**
   * Reserve of token1 (updated during each transaction on pair).
   * @return reserve1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reserve of token1 (updated during each transaction on pair).")

  public String getReserve1() {
    return reserve1;
  }


  public void setReserve1(String reserve1) {
    this.reserve1 = reserve1;
  }


  public SushiswapPairHourDataDTO reserveUsd(String reserveUsd) {
    
    this.reserveUsd = reserveUsd;
    return this;
  }

   /**
   * Reserve of token0 plus token1 stored as a derived USD amount.
   * @return reserveUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reserve of token0 plus token1 stored as a derived USD amount.")

  public String getReserveUsd() {
    return reserveUsd;
  }


  public void setReserveUsd(String reserveUsd) {
    this.reserveUsd = reserveUsd;
  }


  public SushiswapPairHourDataDTO volumeToken0(String volumeToken0) {
    
    this.volumeToken0 = volumeToken0;
    return this;
  }

   /**
   * Total amount of token0 swapped throughout hour.
   * @return volumeToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of token0 swapped throughout hour.")

  public String getVolumeToken0() {
    return volumeToken0;
  }


  public void setVolumeToken0(String volumeToken0) {
    this.volumeToken0 = volumeToken0;
  }


  public SushiswapPairHourDataDTO volumeToken1(String volumeToken1) {
    
    this.volumeToken1 = volumeToken1;
    return this;
  }

   /**
   * Total amount of token1 swapped throughout hour.
   * @return volumeToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of token1 swapped throughout hour.")

  public String getVolumeToken1() {
    return volumeToken1;
  }


  public void setVolumeToken1(String volumeToken1) {
    this.volumeToken1 = volumeToken1;
  }


  public SushiswapPairHourDataDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Total volume within pair throughout hour.
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total volume within pair throughout hour.")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public SushiswapPairHourDataDTO txCount(String txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Amount of transactions on pair throughout hour.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of transactions on pair throughout hour.")

  public String getTxCount() {
    return txCount;
  }


  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }


  public SushiswapPairHourDataDTO vid(Long vid) {
    
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
    SushiswapPairHourDataDTO sushiswapPairHourDataDTO = (SushiswapPairHourDataDTO) o;
    return Objects.equals(this.entryTime, sushiswapPairHourDataDTO.entryTime) &&
        Objects.equals(this.recvTime, sushiswapPairHourDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, sushiswapPairHourDataDTO.blockNumber) &&
        Objects.equals(this.id, sushiswapPairHourDataDTO.id) &&
        Objects.equals(this.date, sushiswapPairHourDataDTO.date) &&
        Objects.equals(this.pair, sushiswapPairHourDataDTO.pair) &&
        Objects.equals(this.reserve0, sushiswapPairHourDataDTO.reserve0) &&
        Objects.equals(this.reserve1, sushiswapPairHourDataDTO.reserve1) &&
        Objects.equals(this.reserveUsd, sushiswapPairHourDataDTO.reserveUsd) &&
        Objects.equals(this.volumeToken0, sushiswapPairHourDataDTO.volumeToken0) &&
        Objects.equals(this.volumeToken1, sushiswapPairHourDataDTO.volumeToken1) &&
        Objects.equals(this.volumeUsd, sushiswapPairHourDataDTO.volumeUsd) &&
        Objects.equals(this.txCount, sushiswapPairHourDataDTO.txCount) &&
        Objects.equals(this.vid, sushiswapPairHourDataDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, date, pair, reserve0, reserve1, reserveUsd, volumeToken0, volumeToken1, volumeUsd, txCount, vid);
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
    sb.append("class SushiswapPairHourDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
    sb.append("    reserve0: ").append(toIndentedString(reserve0)).append("\n");
    sb.append("    reserve1: ").append(toIndentedString(reserve1)).append("\n");
    sb.append("    reserveUsd: ").append(toIndentedString(reserveUsd)).append("\n");
    sb.append("    volumeToken0: ").append(toIndentedString(volumeToken0)).append("\n");
    sb.append("    volumeToken1: ").append(toIndentedString(volumeToken1)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
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
    openapiFields.add("pair");
    openapiFields.add("reserve_0");
    openapiFields.add("reserve_1");
    openapiFields.add("reserve_usd");
    openapiFields.add("volume_token_0");
    openapiFields.add("volume_token_1");
    openapiFields.add("volume_usd");
    openapiFields.add("tx_count");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SushiswapPairHourDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SushiswapPairHourDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SushiswapPairHourDataDTO is not found in the empty JSON string", SushiswapPairHourDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SushiswapPairHourDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SushiswapPairHourDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("pair") != null && !jsonObj.get("pair").isJsonNull()) && !jsonObj.get("pair").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pair` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pair").toString()));
      }
      if ((jsonObj.get("reserve_0") != null && !jsonObj.get("reserve_0").isJsonNull()) && !jsonObj.get("reserve_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reserve_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reserve_0").toString()));
      }
      if ((jsonObj.get("reserve_1") != null && !jsonObj.get("reserve_1").isJsonNull()) && !jsonObj.get("reserve_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reserve_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reserve_1").toString()));
      }
      if ((jsonObj.get("reserve_usd") != null && !jsonObj.get("reserve_usd").isJsonNull()) && !jsonObj.get("reserve_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reserve_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reserve_usd").toString()));
      }
      if ((jsonObj.get("volume_token_0") != null && !jsonObj.get("volume_token_0").isJsonNull()) && !jsonObj.get("volume_token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_token_0").toString()));
      }
      if ((jsonObj.get("volume_token_1") != null && !jsonObj.get("volume_token_1").isJsonNull()) && !jsonObj.get("volume_token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_token_1").toString()));
      }
      if ((jsonObj.get("volume_usd") != null && !jsonObj.get("volume_usd").isJsonNull()) && !jsonObj.get("volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_usd").toString()));
      }
      if ((jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) && !jsonObj.get("tx_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SushiswapPairHourDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SushiswapPairHourDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SushiswapPairHourDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SushiswapPairHourDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SushiswapPairHourDataDTO>() {
           @Override
           public void write(JsonWriter out, SushiswapPairHourDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SushiswapPairHourDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SushiswapPairHourDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SushiswapPairHourDataDTO
  * @throws IOException if the JSON string is invalid with respect to SushiswapPairHourDataDTO
  */
  public static SushiswapPairHourDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SushiswapPairHourDataDTO.class);
  }

 /**
  * Convert an instance of SushiswapPairHourDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

