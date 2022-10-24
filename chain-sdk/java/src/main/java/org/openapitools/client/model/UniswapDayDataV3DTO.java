/*
 * OnChain API
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
import org.openapitools.client.model.BigInteger;
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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * UniswapDayDataV3DTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T09:49:47.658109Z[Etc/UTC]")
public class UniswapDayDataV3DTO {
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
  private BigInteger txCount;

  public static final String SERIALIZED_NAME_TVL_USD = "tvl_usd";
  @SerializedName(SERIALIZED_NAME_TVL_USD)
  private String tvlUsd;

  public UniswapDayDataV3DTO() {
  }

  public UniswapDayDataV3DTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapDayDataV3DTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapDayDataV3DTO blockNumber(Long blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Get blockNumber
   * @return blockNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBlockNumber() {
    return blockNumber;
  }


  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }


  public UniswapDayDataV3DTO vid(Long vid) {
    
    this.vid = vid;
    return this;
  }

   /**
   * Get vid
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


  public UniswapDayDataV3DTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public UniswapDayDataV3DTO date(Integer date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDate() {
    return date;
  }


  public void setDate(Integer date) {
    this.date = date;
  }


  public UniswapDayDataV3DTO volumeEth(String volumeEth) {
    
    this.volumeEth = volumeEth;
    return this;
  }

   /**
   * Get volumeEth
   * @return volumeEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVolumeEth() {
    return volumeEth;
  }


  public void setVolumeEth(String volumeEth) {
    this.volumeEth = volumeEth;
  }


  public UniswapDayDataV3DTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Get volumeUsd
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public UniswapDayDataV3DTO volumeUsdUntracked(String volumeUsdUntracked) {
    
    this.volumeUsdUntracked = volumeUsdUntracked;
    return this;
  }

   /**
   * Get volumeUsdUntracked
   * @return volumeUsdUntracked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVolumeUsdUntracked() {
    return volumeUsdUntracked;
  }


  public void setVolumeUsdUntracked(String volumeUsdUntracked) {
    this.volumeUsdUntracked = volumeUsdUntracked;
  }


  public UniswapDayDataV3DTO feesUsd(String feesUsd) {
    
    this.feesUsd = feesUsd;
    return this;
  }

   /**
   * Get feesUsd
   * @return feesUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeesUsd() {
    return feesUsd;
  }


  public void setFeesUsd(String feesUsd) {
    this.feesUsd = feesUsd;
  }


  public UniswapDayDataV3DTO txCount(BigInteger txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Get txCount
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigInteger getTxCount() {
    return txCount;
  }


  public void setTxCount(BigInteger txCount) {
    this.txCount = txCount;
  }


  public UniswapDayDataV3DTO tvlUsd(String tvlUsd) {
    
    this.tvlUsd = tvlUsd;
    return this;
  }

   /**
   * Get tvlUsd
   * @return tvlUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    UniswapDayDataV3DTO uniswapDayDataV3DTO = (UniswapDayDataV3DTO) o;
    return Objects.equals(this.entryTime, uniswapDayDataV3DTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapDayDataV3DTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapDayDataV3DTO.blockNumber) &&
        Objects.equals(this.vid, uniswapDayDataV3DTO.vid) &&
        Objects.equals(this.id, uniswapDayDataV3DTO.id) &&
        Objects.equals(this.date, uniswapDayDataV3DTO.date) &&
        Objects.equals(this.volumeEth, uniswapDayDataV3DTO.volumeEth) &&
        Objects.equals(this.volumeUsd, uniswapDayDataV3DTO.volumeUsd) &&
        Objects.equals(this.volumeUsdUntracked, uniswapDayDataV3DTO.volumeUsdUntracked) &&
        Objects.equals(this.feesUsd, uniswapDayDataV3DTO.feesUsd) &&
        Objects.equals(this.txCount, uniswapDayDataV3DTO.txCount) &&
        Objects.equals(this.tvlUsd, uniswapDayDataV3DTO.tvlUsd);
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
    sb.append("class UniswapDayDataV3DTO {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to UniswapDayDataV3DTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UniswapDayDataV3DTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapDayDataV3DTO is not found in the empty JSON string", UniswapDayDataV3DTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapDayDataV3DTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapDayDataV3DTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
        BigInteger.validateJsonObject(jsonObj.getAsJsonObject("tx_count"));
      }
      if ((jsonObj.get("tvl_usd") != null && !jsonObj.get("tvl_usd").isJsonNull()) && !jsonObj.get("tvl_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tvl_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tvl_usd").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapDayDataV3DTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapDayDataV3DTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapDayDataV3DTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapDayDataV3DTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapDayDataV3DTO>() {
           @Override
           public void write(JsonWriter out, UniswapDayDataV3DTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapDayDataV3DTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapDayDataV3DTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapDayDataV3DTO
  * @throws IOException if the JSON string is invalid with respect to UniswapDayDataV3DTO
  */
  public static UniswapDayDataV3DTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapDayDataV3DTO.class);
  }

 /**
  * Convert an instance of UniswapDayDataV3DTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

