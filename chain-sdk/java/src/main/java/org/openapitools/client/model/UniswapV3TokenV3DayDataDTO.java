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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-10T22:10:22.622203Z[Etc/UTC]")
public class UniswapV3TokenV3DayDataDTO {
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

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private String token;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_UNTRACKED_VOLUME_USD = "untracked_volume_usd";
  @SerializedName(SERIALIZED_NAME_UNTRACKED_VOLUME_USD)
  private String untrackedVolumeUsd;

  public static final String SERIALIZED_NAME_TOTAL_VALUE_LOCKED = "total_value_locked";
  @SerializedName(SERIALIZED_NAME_TOTAL_VALUE_LOCKED)
  private String totalValueLocked;

  public static final String SERIALIZED_NAME_TOTAL_VALUE_LOCKED_USD = "total_value_locked_usd";
  @SerializedName(SERIALIZED_NAME_TOTAL_VALUE_LOCKED_USD)
  private String totalValueLockedUsd;

  public static final String SERIALIZED_NAME_PRICE_USD = "price_usd";
  @SerializedName(SERIALIZED_NAME_PRICE_USD)
  private String priceUsd;

  public static final String SERIALIZED_NAME_FEES_USD = "fees_usd";
  @SerializedName(SERIALIZED_NAME_FEES_USD)
  private String feesUsd;

  public static final String SERIALIZED_NAME_OPEN = "open";
  @SerializedName(SERIALIZED_NAME_OPEN)
  private String open;

  public static final String SERIALIZED_NAME_HIGH = "high";
  @SerializedName(SERIALIZED_NAME_HIGH)
  private String high;

  public static final String SERIALIZED_NAME_LOW = "low";
  @SerializedName(SERIALIZED_NAME_LOW)
  private String low;

  public static final String SERIALIZED_NAME_CLOSE = "close";
  @SerializedName(SERIALIZED_NAME_CLOSE)
  private String close;

  public UniswapV3TokenV3DayDataDTO() {
  }

  public UniswapV3TokenV3DayDataDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV3TokenV3DayDataDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV3TokenV3DayDataDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV3TokenV3DayDataDTO vid(Long vid) {
    
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


  public UniswapV3TokenV3DayDataDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Token address concatendated with date.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token address concatendated with date.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV3TokenV3DayDataDTO date(Integer date) {
    
    this.date = date;
    return this;
  }

   /**
   * Timestamp rounded to current day by dividing by 86400.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp rounded to current day by dividing by 86400.")

  public Integer getDate() {
    return date;
  }


  public void setDate(Integer date) {
    this.date = date;
  }


  public UniswapV3TokenV3DayDataDTO token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Pointer to token.
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pointer to token.")

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


  public UniswapV3TokenV3DayDataDTO volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Volume in token units.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume in token units.")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public UniswapV3TokenV3DayDataDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Volume in derived USD.
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume in derived USD.")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public UniswapV3TokenV3DayDataDTO untrackedVolumeUsd(String untrackedVolumeUsd) {
    
    this.untrackedVolumeUsd = untrackedVolumeUsd;
    return this;
  }

   /**
   * Volume in USD even on pools with less reliable USD values.
   * @return untrackedVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume in USD even on pools with less reliable USD values.")

  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }


  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }


  public UniswapV3TokenV3DayDataDTO totalValueLocked(String totalValueLocked) {
    
    this.totalValueLocked = totalValueLocked;
    return this;
  }

   /**
   * Liquidity across all pools in token units.
   * @return totalValueLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Liquidity across all pools in token units.")

  public String getTotalValueLocked() {
    return totalValueLocked;
  }


  public void setTotalValueLocked(String totalValueLocked) {
    this.totalValueLocked = totalValueLocked;
  }


  public UniswapV3TokenV3DayDataDTO totalValueLockedUsd(String totalValueLockedUsd) {
    
    this.totalValueLockedUsd = totalValueLockedUsd;
    return this;
  }

   /**
   * Liquidity across all pools in derived USD.
   * @return totalValueLockedUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Liquidity across all pools in derived USD.")

  public String getTotalValueLockedUsd() {
    return totalValueLockedUsd;
  }


  public void setTotalValueLockedUsd(String totalValueLockedUsd) {
    this.totalValueLockedUsd = totalValueLockedUsd;
  }


  public UniswapV3TokenV3DayDataDTO priceUsd(String priceUsd) {
    
    this.priceUsd = priceUsd;
    return this;
  }

   /**
   * Price at end of period in USD.
   * @return priceUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price at end of period in USD.")

  public String getPriceUsd() {
    return priceUsd;
  }


  public void setPriceUsd(String priceUsd) {
    this.priceUsd = priceUsd;
  }


  public UniswapV3TokenV3DayDataDTO feesUsd(String feesUsd) {
    
    this.feesUsd = feesUsd;
    return this;
  }

   /**
   * Fees in USD.
   * @return feesUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fees in USD.")

  public String getFeesUsd() {
    return feesUsd;
  }


  public void setFeesUsd(String feesUsd) {
    this.feesUsd = feesUsd;
  }


  public UniswapV3TokenV3DayDataDTO open(String open) {
    
    this.open = open;
    return this;
  }

   /**
   * Opening price USD.
   * @return open
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Opening price USD.")

  public String getOpen() {
    return open;
  }


  public void setOpen(String open) {
    this.open = open;
  }


  public UniswapV3TokenV3DayDataDTO high(String high) {
    
    this.high = high;
    return this;
  }

   /**
   * High price USD.
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "High price USD.")

  public String getHigh() {
    return high;
  }


  public void setHigh(String high) {
    this.high = high;
  }


  public UniswapV3TokenV3DayDataDTO low(String low) {
    
    this.low = low;
    return this;
  }

   /**
   * Low price USD.
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Low price USD.")

  public String getLow() {
    return low;
  }


  public void setLow(String low) {
    this.low = low;
  }


  public UniswapV3TokenV3DayDataDTO close(String close) {
    
    this.close = close;
    return this;
  }

   /**
   * Close price USD.
   * @return close
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Close price USD.")

  public String getClose() {
    return close;
  }


  public void setClose(String close) {
    this.close = close;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniswapV3TokenV3DayDataDTO uniswapV3TokenV3DayDataDTO = (UniswapV3TokenV3DayDataDTO) o;
    return Objects.equals(this.entryTime, uniswapV3TokenV3DayDataDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV3TokenV3DayDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV3TokenV3DayDataDTO.blockNumber) &&
        Objects.equals(this.vid, uniswapV3TokenV3DayDataDTO.vid) &&
        Objects.equals(this.id, uniswapV3TokenV3DayDataDTO.id) &&
        Objects.equals(this.date, uniswapV3TokenV3DayDataDTO.date) &&
        Objects.equals(this.token, uniswapV3TokenV3DayDataDTO.token) &&
        Objects.equals(this.volume, uniswapV3TokenV3DayDataDTO.volume) &&
        Objects.equals(this.volumeUsd, uniswapV3TokenV3DayDataDTO.volumeUsd) &&
        Objects.equals(this.untrackedVolumeUsd, uniswapV3TokenV3DayDataDTO.untrackedVolumeUsd) &&
        Objects.equals(this.totalValueLocked, uniswapV3TokenV3DayDataDTO.totalValueLocked) &&
        Objects.equals(this.totalValueLockedUsd, uniswapV3TokenV3DayDataDTO.totalValueLockedUsd) &&
        Objects.equals(this.priceUsd, uniswapV3TokenV3DayDataDTO.priceUsd) &&
        Objects.equals(this.feesUsd, uniswapV3TokenV3DayDataDTO.feesUsd) &&
        Objects.equals(this.open, uniswapV3TokenV3DayDataDTO.open) &&
        Objects.equals(this.high, uniswapV3TokenV3DayDataDTO.high) &&
        Objects.equals(this.low, uniswapV3TokenV3DayDataDTO.low) &&
        Objects.equals(this.close, uniswapV3TokenV3DayDataDTO.close);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, id, date, token, volume, volumeUsd, untrackedVolumeUsd, totalValueLocked, totalValueLockedUsd, priceUsd, feesUsd, open, high, low, close);
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
    sb.append("class UniswapV3TokenV3DayDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    untrackedVolumeUsd: ").append(toIndentedString(untrackedVolumeUsd)).append("\n");
    sb.append("    totalValueLocked: ").append(toIndentedString(totalValueLocked)).append("\n");
    sb.append("    totalValueLockedUsd: ").append(toIndentedString(totalValueLockedUsd)).append("\n");
    sb.append("    priceUsd: ").append(toIndentedString(priceUsd)).append("\n");
    sb.append("    feesUsd: ").append(toIndentedString(feesUsd)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
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
    openapiFields.add("token");
    openapiFields.add("volume");
    openapiFields.add("volume_usd");
    openapiFields.add("untracked_volume_usd");
    openapiFields.add("total_value_locked");
    openapiFields.add("total_value_locked_usd");
    openapiFields.add("price_usd");
    openapiFields.add("fees_usd");
    openapiFields.add("open");
    openapiFields.add("high");
    openapiFields.add("low");
    openapiFields.add("close");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV3TokenV3DayDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV3TokenV3DayDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV3TokenV3DayDataDTO is not found in the empty JSON string", UniswapV3TokenV3DayDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV3TokenV3DayDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV3TokenV3DayDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("volume") != null && !jsonObj.get("volume").isJsonNull()) && !jsonObj.get("volume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume").toString()));
      }
      if ((jsonObj.get("volume_usd") != null && !jsonObj.get("volume_usd").isJsonNull()) && !jsonObj.get("volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_usd").toString()));
      }
      if ((jsonObj.get("untracked_volume_usd") != null && !jsonObj.get("untracked_volume_usd").isJsonNull()) && !jsonObj.get("untracked_volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `untracked_volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("untracked_volume_usd").toString()));
      }
      if ((jsonObj.get("total_value_locked") != null && !jsonObj.get("total_value_locked").isJsonNull()) && !jsonObj.get("total_value_locked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_value_locked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_value_locked").toString()));
      }
      if ((jsonObj.get("total_value_locked_usd") != null && !jsonObj.get("total_value_locked_usd").isJsonNull()) && !jsonObj.get("total_value_locked_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_value_locked_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_value_locked_usd").toString()));
      }
      if ((jsonObj.get("price_usd") != null && !jsonObj.get("price_usd").isJsonNull()) && !jsonObj.get("price_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_usd").toString()));
      }
      if ((jsonObj.get("fees_usd") != null && !jsonObj.get("fees_usd").isJsonNull()) && !jsonObj.get("fees_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fees_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fees_usd").toString()));
      }
      if ((jsonObj.get("open") != null && !jsonObj.get("open").isJsonNull()) && !jsonObj.get("open").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open").toString()));
      }
      if ((jsonObj.get("high") != null && !jsonObj.get("high").isJsonNull()) && !jsonObj.get("high").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `high` to be a primitive type in the JSON string but got `%s`", jsonObj.get("high").toString()));
      }
      if ((jsonObj.get("low") != null && !jsonObj.get("low").isJsonNull()) && !jsonObj.get("low").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `low` to be a primitive type in the JSON string but got `%s`", jsonObj.get("low").toString()));
      }
      if ((jsonObj.get("close") != null && !jsonObj.get("close").isJsonNull()) && !jsonObj.get("close").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `close` to be a primitive type in the JSON string but got `%s`", jsonObj.get("close").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV3TokenV3DayDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV3TokenV3DayDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV3TokenV3DayDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV3TokenV3DayDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV3TokenV3DayDataDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV3TokenV3DayDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV3TokenV3DayDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV3TokenV3DayDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV3TokenV3DayDataDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV3TokenV3DayDataDTO
  */
  public static UniswapV3TokenV3DayDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV3TokenV3DayDataDTO.class);
  }

 /**
  * Convert an instance of UniswapV3TokenV3DayDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

