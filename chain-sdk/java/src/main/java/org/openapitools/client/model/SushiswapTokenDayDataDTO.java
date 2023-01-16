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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:13:26.555571Z[Etc/UTC]")
public class SushiswapTokenDayDataDTO {
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

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_VOLUME_ETH = "volume_eth";
  @SerializedName(SERIALIZED_NAME_VOLUME_ETH)
  private String volumeEth;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private String txCount;

  public static final String SERIALIZED_NAME_LIQUIDITY = "liquidity";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY)
  private String liquidity;

  public static final String SERIALIZED_NAME_LIQUIDITY_ETH = "liquidity_eth";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_ETH)
  private String liquidityEth;

  public static final String SERIALIZED_NAME_LIQUIDITY_USD = "liquidity_usd";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_USD)
  private String liquidityUsd;

  public static final String SERIALIZED_NAME_PRICE_USD = "price_usd";
  @SerializedName(SERIALIZED_NAME_PRICE_USD)
  private String priceUsd;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public SushiswapTokenDayDataDTO() {
  }

  public SushiswapTokenDayDataDTO entryTime(OffsetDateTime entryTime) {
    
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


  public SushiswapTokenDayDataDTO recvTime(OffsetDateTime recvTime) {
    
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


  public SushiswapTokenDayDataDTO blockNumber(Long blockNumber) {
    
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


  public SushiswapTokenDayDataDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier, day start timestamp in unix / 86400.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier, day start timestamp in unix / 86400.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SushiswapTokenDayDataDTO date(Integer date) {
    
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


  public SushiswapTokenDayDataDTO token(String token) {
    
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


  public SushiswapTokenDayDataDTO volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Amount of token swapped across all pairs throughout day.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token swapped across all pairs throughout day.")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public SushiswapTokenDayDataDTO volumeEth(String volumeEth) {
    
    this.volumeEth = volumeEth;
    return this;
  }

   /**
   * Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
   * @return volumeEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.")

  public String getVolumeEth() {
    return volumeEth;
  }


  public void setVolumeEth(String volumeEth) {
    this.volumeEth = volumeEth;
  }


  public SushiswapTokenDayDataDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token swapped across all pairs throughout day stored as a derived amount of USD.")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public SushiswapTokenDayDataDTO txCount(String txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Amount of transactions with this token across all pairs.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of transactions with this token across all pairs.")

  public String getTxCount() {
    return txCount;
  }


  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }


  public SushiswapTokenDayDataDTO liquidity(String liquidity) {
    
    this.liquidity = liquidity;
    return this;
  }

   /**
   * Token amount of token deposited across all pairs.
   * @return liquidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token amount of token deposited across all pairs.")

  public String getLiquidity() {
    return liquidity;
  }


  public void setLiquidity(String liquidity) {
    this.liquidity = liquidity;
  }


  public SushiswapTokenDayDataDTO liquidityEth(String liquidityEth) {
    
    this.liquidityEth = liquidityEth;
    return this;
  }

   /**
   * Token amount of token deposited across all pairs stored as amount of ETH.
   * @return liquidityEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token amount of token deposited across all pairs stored as amount of ETH.")

  public String getLiquidityEth() {
    return liquidityEth;
  }


  public void setLiquidityEth(String liquidityEth) {
    this.liquidityEth = liquidityEth;
  }


  public SushiswapTokenDayDataDTO liquidityUsd(String liquidityUsd) {
    
    this.liquidityUsd = liquidityUsd;
    return this;
  }

   /**
   * Token amount of token deposited across all pairs stored as amount of USD.
   * @return liquidityUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token amount of token deposited across all pairs stored as amount of USD.")

  public String getLiquidityUsd() {
    return liquidityUsd;
  }


  public void setLiquidityUsd(String liquidityUsd) {
    this.liquidityUsd = liquidityUsd;
  }


  public SushiswapTokenDayDataDTO priceUsd(String priceUsd) {
    
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


  public SushiswapTokenDayDataDTO vid(Long vid) {
    
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
    SushiswapTokenDayDataDTO sushiswapTokenDayDataDTO = (SushiswapTokenDayDataDTO) o;
    return Objects.equals(this.entryTime, sushiswapTokenDayDataDTO.entryTime) &&
        Objects.equals(this.recvTime, sushiswapTokenDayDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, sushiswapTokenDayDataDTO.blockNumber) &&
        Objects.equals(this.id, sushiswapTokenDayDataDTO.id) &&
        Objects.equals(this.date, sushiswapTokenDayDataDTO.date) &&
        Objects.equals(this.token, sushiswapTokenDayDataDTO.token) &&
        Objects.equals(this.volume, sushiswapTokenDayDataDTO.volume) &&
        Objects.equals(this.volumeEth, sushiswapTokenDayDataDTO.volumeEth) &&
        Objects.equals(this.volumeUsd, sushiswapTokenDayDataDTO.volumeUsd) &&
        Objects.equals(this.txCount, sushiswapTokenDayDataDTO.txCount) &&
        Objects.equals(this.liquidity, sushiswapTokenDayDataDTO.liquidity) &&
        Objects.equals(this.liquidityEth, sushiswapTokenDayDataDTO.liquidityEth) &&
        Objects.equals(this.liquidityUsd, sushiswapTokenDayDataDTO.liquidityUsd) &&
        Objects.equals(this.priceUsd, sushiswapTokenDayDataDTO.priceUsd) &&
        Objects.equals(this.vid, sushiswapTokenDayDataDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, date, token, volume, volumeEth, volumeUsd, txCount, liquidity, liquidityEth, liquidityUsd, priceUsd, vid);
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
    sb.append("class SushiswapTokenDayDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    volumeEth: ").append(toIndentedString(volumeEth)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    liquidity: ").append(toIndentedString(liquidity)).append("\n");
    sb.append("    liquidityEth: ").append(toIndentedString(liquidityEth)).append("\n");
    sb.append("    liquidityUsd: ").append(toIndentedString(liquidityUsd)).append("\n");
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
    openapiFields.add("volume");
    openapiFields.add("volume_eth");
    openapiFields.add("volume_usd");
    openapiFields.add("tx_count");
    openapiFields.add("liquidity");
    openapiFields.add("liquidity_eth");
    openapiFields.add("liquidity_usd");
    openapiFields.add("price_usd");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SushiswapTokenDayDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SushiswapTokenDayDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SushiswapTokenDayDataDTO is not found in the empty JSON string", SushiswapTokenDayDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SushiswapTokenDayDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SushiswapTokenDayDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("volume_eth") != null && !jsonObj.get("volume_eth").isJsonNull()) && !jsonObj.get("volume_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_eth").toString()));
      }
      if ((jsonObj.get("volume_usd") != null && !jsonObj.get("volume_usd").isJsonNull()) && !jsonObj.get("volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volume_usd").toString()));
      }
      if ((jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) && !jsonObj.get("tx_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_count").toString()));
      }
      if ((jsonObj.get("liquidity") != null && !jsonObj.get("liquidity").isJsonNull()) && !jsonObj.get("liquidity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity").toString()));
      }
      if ((jsonObj.get("liquidity_eth") != null && !jsonObj.get("liquidity_eth").isJsonNull()) && !jsonObj.get("liquidity_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity_eth").toString()));
      }
      if ((jsonObj.get("liquidity_usd") != null && !jsonObj.get("liquidity_usd").isJsonNull()) && !jsonObj.get("liquidity_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity_usd").toString()));
      }
      if ((jsonObj.get("price_usd") != null && !jsonObj.get("price_usd").isJsonNull()) && !jsonObj.get("price_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_usd").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SushiswapTokenDayDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SushiswapTokenDayDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SushiswapTokenDayDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SushiswapTokenDayDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SushiswapTokenDayDataDTO>() {
           @Override
           public void write(JsonWriter out, SushiswapTokenDayDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SushiswapTokenDayDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SushiswapTokenDayDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SushiswapTokenDayDataDTO
  * @throws IOException if the JSON string is invalid with respect to SushiswapTokenDayDataDTO
  */
  public static SushiswapTokenDayDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SushiswapTokenDayDataDTO.class);
  }

 /**
  * Convert an instance of SushiswapTokenDayDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

