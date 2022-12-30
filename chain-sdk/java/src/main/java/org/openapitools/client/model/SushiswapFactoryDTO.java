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
 * The Sushiswap Factory entity is responsible for storing aggregate information across all Sushiswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
 */
@ApiModel(description = "The Sushiswap Factory entity is responsible for storing aggregate information across all Sushiswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-30T09:47:49.441837Z[Etc/UTC]")
public class SushiswapFactoryDTO {
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

  public static final String SERIALIZED_NAME_PAIR_COUNT = "pair_count";
  @SerializedName(SERIALIZED_NAME_PAIR_COUNT)
  private String pairCount;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_VOLUME_ETH = "volume_eth";
  @SerializedName(SERIALIZED_NAME_VOLUME_ETH)
  private String volumeEth;

  public static final String SERIALIZED_NAME_UNTRACKED_VOLUME_USD = "untracked_volume_usd";
  @SerializedName(SERIALIZED_NAME_UNTRACKED_VOLUME_USD)
  private String untrackedVolumeUsd;

  public static final String SERIALIZED_NAME_LIQUIDITY_USD = "liquidity_usd";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_USD)
  private String liquidityUsd;

  public static final String SERIALIZED_NAME_LIQUIDITY_ETH = "liquidity_eth";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_ETH)
  private String liquidityEth;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private String txCount;

  public static final String SERIALIZED_NAME_TOKEN_COUNT = "token_count";
  @SerializedName(SERIALIZED_NAME_TOKEN_COUNT)
  private String tokenCount;

  public static final String SERIALIZED_NAME_USER_COUNT = "user_count";
  @SerializedName(SERIALIZED_NAME_USER_COUNT)
  private String userCount;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public SushiswapFactoryDTO() {
  }

  public SushiswapFactoryDTO entryTime(OffsetDateTime entryTime) {
    
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


  public SushiswapFactoryDTO recvTime(OffsetDateTime recvTime) {
    
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


  public SushiswapFactoryDTO blockNumber(Long blockNumber) {
    
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


  public SushiswapFactoryDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Factory address.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Factory address.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SushiswapFactoryDTO pairCount(String pairCount) {
    
    this.pairCount = pairCount;
    return this;
  }

   /**
   * Amount of pairs created by the Sushiswap factory.
   * @return pairCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of pairs created by the Sushiswap factory.")

  public String getPairCount() {
    return pairCount;
  }


  public void setPairCount(String pairCount) {
    this.pairCount = pairCount;
  }


  public SushiswapFactoryDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * All time USD volume across all pairs (USD is derived).
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time USD volume across all pairs (USD is derived).")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public SushiswapFactoryDTO volumeEth(String volumeEth) {
    
    this.volumeEth = volumeEth;
    return this;
  }

   /**
   * All time volume in ETH across all pairs (ETH is derived).
   * @return volumeEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time volume in ETH across all pairs (ETH is derived).")

  public String getVolumeEth() {
    return volumeEth;
  }


  public void setVolumeEth(String volumeEth) {
    this.volumeEth = volumeEth;
  }


  public SushiswapFactoryDTO untrackedVolumeUsd(String untrackedVolumeUsd) {
    
    this.untrackedVolumeUsd = untrackedVolumeUsd;
    return this;
  }

   /**
   * Untracked volume USD.
   * @return untrackedVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Untracked volume USD.")

  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }


  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }


  public SushiswapFactoryDTO liquidityUsd(String liquidityUsd) {
    
    this.liquidityUsd = liquidityUsd;
    return this;
  }

   /**
   * Total liquidity across all pairs stored as a derived USD amount.
   * @return liquidityUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total liquidity across all pairs stored as a derived USD amount.")

  public String getLiquidityUsd() {
    return liquidityUsd;
  }


  public void setLiquidityUsd(String liquidityUsd) {
    this.liquidityUsd = liquidityUsd;
  }


  public SushiswapFactoryDTO liquidityEth(String liquidityEth) {
    
    this.liquidityEth = liquidityEth;
    return this;
  }

   /**
   * Total liquidity across all pairs stored as a derived ETH amount.
   * @return liquidityEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total liquidity across all pairs stored as a derived ETH amount.")

  public String getLiquidityEth() {
    return liquidityEth;
  }


  public void setLiquidityEth(String liquidityEth) {
    this.liquidityEth = liquidityEth;
  }


  public SushiswapFactoryDTO txCount(String txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * All time amount of transactions across all pairs.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time amount of transactions across all pairs.")

  public String getTxCount() {
    return txCount;
  }


  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }


  public SushiswapFactoryDTO tokenCount(String tokenCount) {
    
    this.tokenCount = tokenCount;
    return this;
  }

   /**
   * Total count of tokens.
   * @return tokenCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total count of tokens.")

  public String getTokenCount() {
    return tokenCount;
  }


  public void setTokenCount(String tokenCount) {
    this.tokenCount = tokenCount;
  }


  public SushiswapFactoryDTO userCount(String userCount) {
    
    this.userCount = userCount;
    return this;
  }

   /**
   * Users count.
   * @return userCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Users count.")

  public String getUserCount() {
    return userCount;
  }


  public void setUserCount(String userCount) {
    this.userCount = userCount;
  }


  public SushiswapFactoryDTO vid(Long vid) {
    
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
    SushiswapFactoryDTO sushiswapFactoryDTO = (SushiswapFactoryDTO) o;
    return Objects.equals(this.entryTime, sushiswapFactoryDTO.entryTime) &&
        Objects.equals(this.recvTime, sushiswapFactoryDTO.recvTime) &&
        Objects.equals(this.blockNumber, sushiswapFactoryDTO.blockNumber) &&
        Objects.equals(this.id, sushiswapFactoryDTO.id) &&
        Objects.equals(this.pairCount, sushiswapFactoryDTO.pairCount) &&
        Objects.equals(this.volumeUsd, sushiswapFactoryDTO.volumeUsd) &&
        Objects.equals(this.volumeEth, sushiswapFactoryDTO.volumeEth) &&
        Objects.equals(this.untrackedVolumeUsd, sushiswapFactoryDTO.untrackedVolumeUsd) &&
        Objects.equals(this.liquidityUsd, sushiswapFactoryDTO.liquidityUsd) &&
        Objects.equals(this.liquidityEth, sushiswapFactoryDTO.liquidityEth) &&
        Objects.equals(this.txCount, sushiswapFactoryDTO.txCount) &&
        Objects.equals(this.tokenCount, sushiswapFactoryDTO.tokenCount) &&
        Objects.equals(this.userCount, sushiswapFactoryDTO.userCount) &&
        Objects.equals(this.vid, sushiswapFactoryDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, pairCount, volumeUsd, volumeEth, untrackedVolumeUsd, liquidityUsd, liquidityEth, txCount, tokenCount, userCount, vid);
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
    sb.append("class SushiswapFactoryDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pairCount: ").append(toIndentedString(pairCount)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    volumeEth: ").append(toIndentedString(volumeEth)).append("\n");
    sb.append("    untrackedVolumeUsd: ").append(toIndentedString(untrackedVolumeUsd)).append("\n");
    sb.append("    liquidityUsd: ").append(toIndentedString(liquidityUsd)).append("\n");
    sb.append("    liquidityEth: ").append(toIndentedString(liquidityEth)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    tokenCount: ").append(toIndentedString(tokenCount)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
    openapiFields.add("pair_count");
    openapiFields.add("volume_usd");
    openapiFields.add("volume_eth");
    openapiFields.add("untracked_volume_usd");
    openapiFields.add("liquidity_usd");
    openapiFields.add("liquidity_eth");
    openapiFields.add("tx_count");
    openapiFields.add("token_count");
    openapiFields.add("user_count");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SushiswapFactoryDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SushiswapFactoryDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SushiswapFactoryDTO is not found in the empty JSON string", SushiswapFactoryDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SushiswapFactoryDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SushiswapFactoryDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("pair_count") != null && !jsonObj.get("pair_count").isJsonNull()) && !jsonObj.get("pair_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pair_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pair_count").toString()));
      }
      if ((jsonObj.get("volume_usd") != null && !jsonObj.get("volume_usd").isJsonNull()) && !jsonObj.get("volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_usd").toString()));
      }
      if ((jsonObj.get("volume_eth") != null && !jsonObj.get("volume_eth").isJsonNull()) && !jsonObj.get("volume_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_eth").toString()));
      }
      if ((jsonObj.get("untracked_volume_usd") != null && !jsonObj.get("untracked_volume_usd").isJsonNull()) && !jsonObj.get("untracked_volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `untracked_volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("untracked_volume_usd").toString()));
      }
      if ((jsonObj.get("liquidity_usd") != null && !jsonObj.get("liquidity_usd").isJsonNull()) && !jsonObj.get("liquidity_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity_usd").toString()));
      }
      if ((jsonObj.get("liquidity_eth") != null && !jsonObj.get("liquidity_eth").isJsonNull()) && !jsonObj.get("liquidity_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity_eth").toString()));
      }
      if ((jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) && !jsonObj.get("tx_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_count").toString()));
      }
      if ((jsonObj.get("token_count") != null && !jsonObj.get("token_count").isJsonNull()) && !jsonObj.get("token_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_count").toString()));
      }
      if ((jsonObj.get("user_count") != null && !jsonObj.get("user_count").isJsonNull()) && !jsonObj.get("user_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SushiswapFactoryDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SushiswapFactoryDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SushiswapFactoryDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SushiswapFactoryDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SushiswapFactoryDTO>() {
           @Override
           public void write(JsonWriter out, SushiswapFactoryDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SushiswapFactoryDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SushiswapFactoryDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SushiswapFactoryDTO
  * @throws IOException if the JSON string is invalid with respect to SushiswapFactoryDTO
  */
  public static SushiswapFactoryDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SushiswapFactoryDTO.class);
  }

 /**
  * Convert an instance of SushiswapFactoryDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

