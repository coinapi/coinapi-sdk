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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-30T12:36:36.826525Z[Etc/UTC]")
public class UniswapV2PairHourDataDTO {
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

  public static final String SERIALIZED_NAME_HOUR_START_UNIX = "hour_start_unix";
  @SerializedName(SERIALIZED_NAME_HOUR_START_UNIX)
  private Integer hourStartUnix;

  public static final String SERIALIZED_NAME_PAIR = "pair";
  @SerializedName(SERIALIZED_NAME_PAIR)
  private String pair;

  public static final String SERIALIZED_NAME_RESERVE0 = "reserve_0";
  @SerializedName(SERIALIZED_NAME_RESERVE0)
  private String reserve0;

  public static final String SERIALIZED_NAME_RESERVE1 = "reserve_1";
  @SerializedName(SERIALIZED_NAME_RESERVE1)
  private String reserve1;

  public static final String SERIALIZED_NAME_TOTAL_SUPPLY = "total_supply";
  @SerializedName(SERIALIZED_NAME_TOTAL_SUPPLY)
  private String totalSupply;

  public static final String SERIALIZED_NAME_RESERVE_USD = "reserve_usd";
  @SerializedName(SERIALIZED_NAME_RESERVE_USD)
  private String reserveUsd;

  public static final String SERIALIZED_NAME_HOURLY_VOLUME_TOKEN0 = "hourly_volume_token_0";
  @SerializedName(SERIALIZED_NAME_HOURLY_VOLUME_TOKEN0)
  private String hourlyVolumeToken0;

  public static final String SERIALIZED_NAME_HOURLY_VOLUME_TOKEN1 = "hourly_volume_token_1";
  @SerializedName(SERIALIZED_NAME_HOURLY_VOLUME_TOKEN1)
  private String hourlyVolumeToken1;

  public static final String SERIALIZED_NAME_HOURLY_VOLUME_USD = "hourly_volume_usd";
  @SerializedName(SERIALIZED_NAME_HOURLY_VOLUME_USD)
  private String hourlyVolumeUsd;

  public static final String SERIALIZED_NAME_HOURLY_TXNS = "hourly_txns";
  @SerializedName(SERIALIZED_NAME_HOURLY_TXNS)
  private String hourlyTxns;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public UniswapV2PairHourDataDTO() {
  }

  public UniswapV2PairHourDataDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV2PairHourDataDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV2PairHourDataDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV2PairHourDataDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV2PairHourDataDTO hourStartUnix(Integer hourStartUnix) {
    
    this.hourStartUnix = hourStartUnix;
    return this;
  }

   /**
   * Unix timestamp for start of hour.
   * @return hourStartUnix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp for start of hour.")

  public Integer getHourStartUnix() {
    return hourStartUnix;
  }


  public void setHourStartUnix(Integer hourStartUnix) {
    this.hourStartUnix = hourStartUnix;
  }


  public UniswapV2PairHourDataDTO pair(String pair) {
    
    this.pair = pair;
    return this;
  }

   /**
   * Address for pair contract.
   * @return pair
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address for pair contract.")

  public String getPair() {
    return pair;
  }


  public void setPair(String pair) {
    this.pair = pair;
  }


  public UniswapV2PairHourDataDTO reserve0(String reserve0) {
    
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


  public UniswapV2PairHourDataDTO reserve1(String reserve1) {
    
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


  public UniswapV2PairHourDataDTO totalSupply(String totalSupply) {
    
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Total supply of liquidity token distributed to LPs.
   * @return totalSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total supply of liquidity token distributed to LPs.")

  public String getTotalSupply() {
    return totalSupply;
  }


  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }


  public UniswapV2PairHourDataDTO reserveUsd(String reserveUsd) {
    
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


  public UniswapV2PairHourDataDTO hourlyVolumeToken0(String hourlyVolumeToken0) {
    
    this.hourlyVolumeToken0 = hourlyVolumeToken0;
    return this;
  }

   /**
   * Total amount of token0 swapped throughout hour.
   * @return hourlyVolumeToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of token0 swapped throughout hour.")

  public String getHourlyVolumeToken0() {
    return hourlyVolumeToken0;
  }


  public void setHourlyVolumeToken0(String hourlyVolumeToken0) {
    this.hourlyVolumeToken0 = hourlyVolumeToken0;
  }


  public UniswapV2PairHourDataDTO hourlyVolumeToken1(String hourlyVolumeToken1) {
    
    this.hourlyVolumeToken1 = hourlyVolumeToken1;
    return this;
  }

   /**
   * Total amount of token1 swapped throughout hour.
   * @return hourlyVolumeToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of token1 swapped throughout hour.")

  public String getHourlyVolumeToken1() {
    return hourlyVolumeToken1;
  }


  public void setHourlyVolumeToken1(String hourlyVolumeToken1) {
    this.hourlyVolumeToken1 = hourlyVolumeToken1;
  }


  public UniswapV2PairHourDataDTO hourlyVolumeUsd(String hourlyVolumeUsd) {
    
    this.hourlyVolumeUsd = hourlyVolumeUsd;
    return this;
  }

   /**
   * Total volume within pair throughout hour.
   * @return hourlyVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total volume within pair throughout hour.")

  public String getHourlyVolumeUsd() {
    return hourlyVolumeUsd;
  }


  public void setHourlyVolumeUsd(String hourlyVolumeUsd) {
    this.hourlyVolumeUsd = hourlyVolumeUsd;
  }


  public UniswapV2PairHourDataDTO hourlyTxns(String hourlyTxns) {
    
    this.hourlyTxns = hourlyTxns;
    return this;
  }

   /**
   * Amount of transactions on pair throughout hour.
   * @return hourlyTxns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of transactions on pair throughout hour.")

  public String getHourlyTxns() {
    return hourlyTxns;
  }


  public void setHourlyTxns(String hourlyTxns) {
    this.hourlyTxns = hourlyTxns;
  }


  public UniswapV2PairHourDataDTO vid(Long vid) {
    
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
    UniswapV2PairHourDataDTO uniswapV2PairHourDataDTO = (UniswapV2PairHourDataDTO) o;
    return Objects.equals(this.entryTime, uniswapV2PairHourDataDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV2PairHourDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV2PairHourDataDTO.blockNumber) &&
        Objects.equals(this.id, uniswapV2PairHourDataDTO.id) &&
        Objects.equals(this.hourStartUnix, uniswapV2PairHourDataDTO.hourStartUnix) &&
        Objects.equals(this.pair, uniswapV2PairHourDataDTO.pair) &&
        Objects.equals(this.reserve0, uniswapV2PairHourDataDTO.reserve0) &&
        Objects.equals(this.reserve1, uniswapV2PairHourDataDTO.reserve1) &&
        Objects.equals(this.totalSupply, uniswapV2PairHourDataDTO.totalSupply) &&
        Objects.equals(this.reserveUsd, uniswapV2PairHourDataDTO.reserveUsd) &&
        Objects.equals(this.hourlyVolumeToken0, uniswapV2PairHourDataDTO.hourlyVolumeToken0) &&
        Objects.equals(this.hourlyVolumeToken1, uniswapV2PairHourDataDTO.hourlyVolumeToken1) &&
        Objects.equals(this.hourlyVolumeUsd, uniswapV2PairHourDataDTO.hourlyVolumeUsd) &&
        Objects.equals(this.hourlyTxns, uniswapV2PairHourDataDTO.hourlyTxns) &&
        Objects.equals(this.vid, uniswapV2PairHourDataDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, hourStartUnix, pair, reserve0, reserve1, totalSupply, reserveUsd, hourlyVolumeToken0, hourlyVolumeToken1, hourlyVolumeUsd, hourlyTxns, vid);
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
    sb.append("class UniswapV2PairHourDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    hourStartUnix: ").append(toIndentedString(hourStartUnix)).append("\n");
    sb.append("    pair: ").append(toIndentedString(pair)).append("\n");
    sb.append("    reserve0: ").append(toIndentedString(reserve0)).append("\n");
    sb.append("    reserve1: ").append(toIndentedString(reserve1)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    reserveUsd: ").append(toIndentedString(reserveUsd)).append("\n");
    sb.append("    hourlyVolumeToken0: ").append(toIndentedString(hourlyVolumeToken0)).append("\n");
    sb.append("    hourlyVolumeToken1: ").append(toIndentedString(hourlyVolumeToken1)).append("\n");
    sb.append("    hourlyVolumeUsd: ").append(toIndentedString(hourlyVolumeUsd)).append("\n");
    sb.append("    hourlyTxns: ").append(toIndentedString(hourlyTxns)).append("\n");
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
    openapiFields.add("hour_start_unix");
    openapiFields.add("pair");
    openapiFields.add("reserve_0");
    openapiFields.add("reserve_1");
    openapiFields.add("total_supply");
    openapiFields.add("reserve_usd");
    openapiFields.add("hourly_volume_token_0");
    openapiFields.add("hourly_volume_token_1");
    openapiFields.add("hourly_volume_usd");
    openapiFields.add("hourly_txns");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV2PairHourDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV2PairHourDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV2PairHourDataDTO is not found in the empty JSON string", UniswapV2PairHourDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV2PairHourDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV2PairHourDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("total_supply") != null && !jsonObj.get("total_supply").isJsonNull()) && !jsonObj.get("total_supply").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_supply` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_supply").toString()));
      }
      if ((jsonObj.get("reserve_usd") != null && !jsonObj.get("reserve_usd").isJsonNull()) && !jsonObj.get("reserve_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reserve_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reserve_usd").toString()));
      }
      if ((jsonObj.get("hourly_volume_token_0") != null && !jsonObj.get("hourly_volume_token_0").isJsonNull()) && !jsonObj.get("hourly_volume_token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourly_volume_token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourly_volume_token_0").toString()));
      }
      if ((jsonObj.get("hourly_volume_token_1") != null && !jsonObj.get("hourly_volume_token_1").isJsonNull()) && !jsonObj.get("hourly_volume_token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourly_volume_token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourly_volume_token_1").toString()));
      }
      if ((jsonObj.get("hourly_volume_usd") != null && !jsonObj.get("hourly_volume_usd").isJsonNull()) && !jsonObj.get("hourly_volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourly_volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourly_volume_usd").toString()));
      }
      if ((jsonObj.get("hourly_txns") != null && !jsonObj.get("hourly_txns").isJsonNull()) && !jsonObj.get("hourly_txns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hourly_txns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hourly_txns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV2PairHourDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV2PairHourDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV2PairHourDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV2PairHourDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV2PairHourDataDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV2PairHourDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV2PairHourDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV2PairHourDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV2PairHourDataDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV2PairHourDataDTO
  */
  public static UniswapV2PairHourDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV2PairHourDataDTO.class);
  }

 /**
  * Convert an instance of UniswapV2PairHourDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

