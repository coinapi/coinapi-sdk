/*
 * On Chain - REST API
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
 * Tracks pair data across each day.
 */
@ApiModel(description = "Tracks pair data across each day.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-24T08:57:11.990286Z[Etc/UTC]")
public class UniswapV2PairDayDataDTO {
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

  public static final String SERIALIZED_NAME_PAIR_ADDRESS = "pair_address";
  @SerializedName(SERIALIZED_NAME_PAIR_ADDRESS)
  private String pairAddress;

  public static final String SERIALIZED_NAME_TOKEN0 = "token_0";
  @SerializedName(SERIALIZED_NAME_TOKEN0)
  private String token0;

  public static final String SERIALIZED_NAME_TOKEN1 = "token_1";
  @SerializedName(SERIALIZED_NAME_TOKEN1)
  private String token1;

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

  public static final String SERIALIZED_NAME_DAILY_VOLUME_TOKEN0 = "daily_volume_token_0";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_TOKEN0)
  private String dailyVolumeToken0;

  public static final String SERIALIZED_NAME_DAILY_VOLUME_TOKEN1 = "daily_volume_token_1";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_TOKEN1)
  private String dailyVolumeToken1;

  public static final String SERIALIZED_NAME_DAILY_VOLUME_USD = "daily_volume_usd";
  @SerializedName(SERIALIZED_NAME_DAILY_VOLUME_USD)
  private String dailyVolumeUsd;

  public static final String SERIALIZED_NAME_DAILY_TXNS = "daily_txns";
  @SerializedName(SERIALIZED_NAME_DAILY_TXNS)
  private String dailyTxns;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public UniswapV2PairDayDataDTO() {
  }

  public UniswapV2PairDayDataDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV2PairDayDataDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV2PairDayDataDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV2PairDayDataDTO id(String id) {
    
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


  public UniswapV2PairDayDataDTO date(Integer date) {
    
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


  public UniswapV2PairDayDataDTO pairAddress(String pairAddress) {
    
    this.pairAddress = pairAddress;
    return this;
  }

   /**
   * Address for pair contract.
   * @return pairAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address for pair contract.")

  public String getPairAddress() {
    return pairAddress;
  }


  public void setPairAddress(String pairAddress) {
    this.pairAddress = pairAddress;
  }


  public UniswapV2PairDayDataDTO token0(String token0) {
    
    this.token0 = token0;
    return this;
  }

   /**
   * Reference to token0.
   * @return token0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token0.")

  public String getToken0() {
    return token0;
  }


  public void setToken0(String token0) {
    this.token0 = token0;
  }


  public UniswapV2PairDayDataDTO token1(String token1) {
    
    this.token1 = token1;
    return this;
  }

   /**
   * Reference to token1.
   * @return token1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token1.")

  public String getToken1() {
    return token1;
  }


  public void setToken1(String token1) {
    this.token1 = token1;
  }


  public UniswapV2PairDayDataDTO reserve0(String reserve0) {
    
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


  public UniswapV2PairDayDataDTO reserve1(String reserve1) {
    
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


  public UniswapV2PairDayDataDTO totalSupply(String totalSupply) {
    
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


  public UniswapV2PairDayDataDTO reserveUsd(String reserveUsd) {
    
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


  public UniswapV2PairDayDataDTO dailyVolumeToken0(String dailyVolumeToken0) {
    
    this.dailyVolumeToken0 = dailyVolumeToken0;
    return this;
  }

   /**
   * Total amount of token0 swapped throughout day.
   * @return dailyVolumeToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of token0 swapped throughout day.")

  public String getDailyVolumeToken0() {
    return dailyVolumeToken0;
  }


  public void setDailyVolumeToken0(String dailyVolumeToken0) {
    this.dailyVolumeToken0 = dailyVolumeToken0;
  }


  public UniswapV2PairDayDataDTO dailyVolumeToken1(String dailyVolumeToken1) {
    
    this.dailyVolumeToken1 = dailyVolumeToken1;
    return this;
  }

   /**
   * Total amount of token1 swapped throughout day.
   * @return dailyVolumeToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of token1 swapped throughout day.")

  public String getDailyVolumeToken1() {
    return dailyVolumeToken1;
  }


  public void setDailyVolumeToken1(String dailyVolumeToken1) {
    this.dailyVolumeToken1 = dailyVolumeToken1;
  }


  public UniswapV2PairDayDataDTO dailyVolumeUsd(String dailyVolumeUsd) {
    
    this.dailyVolumeUsd = dailyVolumeUsd;
    return this;
  }

   /**
   * Total volume within pair throughout day.
   * @return dailyVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total volume within pair throughout day.")

  public String getDailyVolumeUsd() {
    return dailyVolumeUsd;
  }


  public void setDailyVolumeUsd(String dailyVolumeUsd) {
    this.dailyVolumeUsd = dailyVolumeUsd;
  }


  public UniswapV2PairDayDataDTO dailyTxns(String dailyTxns) {
    
    this.dailyTxns = dailyTxns;
    return this;
  }

   /**
   * Amount of transactions on pair throughout day.
   * @return dailyTxns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of transactions on pair throughout day.")

  public String getDailyTxns() {
    return dailyTxns;
  }


  public void setDailyTxns(String dailyTxns) {
    this.dailyTxns = dailyTxns;
  }


  public UniswapV2PairDayDataDTO vid(Long vid) {
    
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
    UniswapV2PairDayDataDTO uniswapV2PairDayDataDTO = (UniswapV2PairDayDataDTO) o;
    return Objects.equals(this.entryTime, uniswapV2PairDayDataDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV2PairDayDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV2PairDayDataDTO.blockNumber) &&
        Objects.equals(this.id, uniswapV2PairDayDataDTO.id) &&
        Objects.equals(this.date, uniswapV2PairDayDataDTO.date) &&
        Objects.equals(this.pairAddress, uniswapV2PairDayDataDTO.pairAddress) &&
        Objects.equals(this.token0, uniswapV2PairDayDataDTO.token0) &&
        Objects.equals(this.token1, uniswapV2PairDayDataDTO.token1) &&
        Objects.equals(this.reserve0, uniswapV2PairDayDataDTO.reserve0) &&
        Objects.equals(this.reserve1, uniswapV2PairDayDataDTO.reserve1) &&
        Objects.equals(this.totalSupply, uniswapV2PairDayDataDTO.totalSupply) &&
        Objects.equals(this.reserveUsd, uniswapV2PairDayDataDTO.reserveUsd) &&
        Objects.equals(this.dailyVolumeToken0, uniswapV2PairDayDataDTO.dailyVolumeToken0) &&
        Objects.equals(this.dailyVolumeToken1, uniswapV2PairDayDataDTO.dailyVolumeToken1) &&
        Objects.equals(this.dailyVolumeUsd, uniswapV2PairDayDataDTO.dailyVolumeUsd) &&
        Objects.equals(this.dailyTxns, uniswapV2PairDayDataDTO.dailyTxns) &&
        Objects.equals(this.vid, uniswapV2PairDayDataDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, date, pairAddress, token0, token1, reserve0, reserve1, totalSupply, reserveUsd, dailyVolumeToken0, dailyVolumeToken1, dailyVolumeUsd, dailyTxns, vid);
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
    sb.append("class UniswapV2PairDayDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    pairAddress: ").append(toIndentedString(pairAddress)).append("\n");
    sb.append("    token0: ").append(toIndentedString(token0)).append("\n");
    sb.append("    token1: ").append(toIndentedString(token1)).append("\n");
    sb.append("    reserve0: ").append(toIndentedString(reserve0)).append("\n");
    sb.append("    reserve1: ").append(toIndentedString(reserve1)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    reserveUsd: ").append(toIndentedString(reserveUsd)).append("\n");
    sb.append("    dailyVolumeToken0: ").append(toIndentedString(dailyVolumeToken0)).append("\n");
    sb.append("    dailyVolumeToken1: ").append(toIndentedString(dailyVolumeToken1)).append("\n");
    sb.append("    dailyVolumeUsd: ").append(toIndentedString(dailyVolumeUsd)).append("\n");
    sb.append("    dailyTxns: ").append(toIndentedString(dailyTxns)).append("\n");
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
    openapiFields.add("pair_address");
    openapiFields.add("token_0");
    openapiFields.add("token_1");
    openapiFields.add("reserve_0");
    openapiFields.add("reserve_1");
    openapiFields.add("total_supply");
    openapiFields.add("reserve_usd");
    openapiFields.add("daily_volume_token_0");
    openapiFields.add("daily_volume_token_1");
    openapiFields.add("daily_volume_usd");
    openapiFields.add("daily_txns");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV2PairDayDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV2PairDayDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV2PairDayDataDTO is not found in the empty JSON string", UniswapV2PairDayDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV2PairDayDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV2PairDayDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("pair_address") != null && !jsonObj.get("pair_address").isJsonNull()) && !jsonObj.get("pair_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pair_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pair_address").toString()));
      }
      if ((jsonObj.get("token_0") != null && !jsonObj.get("token_0").isJsonNull()) && !jsonObj.get("token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_0").toString()));
      }
      if ((jsonObj.get("token_1") != null && !jsonObj.get("token_1").isJsonNull()) && !jsonObj.get("token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_1").toString()));
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
      if ((jsonObj.get("daily_volume_token_0") != null && !jsonObj.get("daily_volume_token_0").isJsonNull()) && !jsonObj.get("daily_volume_token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_token_0").toString()));
      }
      if ((jsonObj.get("daily_volume_token_1") != null && !jsonObj.get("daily_volume_token_1").isJsonNull()) && !jsonObj.get("daily_volume_token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_token_1").toString()));
      }
      if ((jsonObj.get("daily_volume_usd") != null && !jsonObj.get("daily_volume_usd").isJsonNull()) && !jsonObj.get("daily_volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_volume_usd").toString()));
      }
      if ((jsonObj.get("daily_txns") != null && !jsonObj.get("daily_txns").isJsonNull()) && !jsonObj.get("daily_txns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `daily_txns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("daily_txns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV2PairDayDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV2PairDayDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV2PairDayDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV2PairDayDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV2PairDayDataDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV2PairDayDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV2PairDayDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV2PairDayDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV2PairDayDataDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV2PairDayDataDTO
  */
  public static UniswapV2PairDayDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV2PairDayDataDTO.class);
  }

 /**
  * Convert an instance of UniswapV2PairDayDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

