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
import java.util.ArrayList;
import java.util.List;
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
 * Stores aggregated information for a specific token across all pairs that token is included in.
 */
@ApiModel(description = "Stores aggregated information for a specific token across all pairs that token is included in.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:09:34.738210Z[Etc/UTC]")
public class SushiswapTokenDTO {
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

  public static final String SERIALIZED_NAME_FACTORY = "factory";
  @SerializedName(SERIALIZED_NAME_FACTORY)
  private String factory;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private String decimals;

  public static final String SERIALIZED_NAME_TOTAL_SUPPLY = "total_supply";
  @SerializedName(SERIALIZED_NAME_TOTAL_SUPPLY)
  private String totalSupply;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_UNTRACKED_VOLUME_USD = "untracked_volume_usd";
  @SerializedName(SERIALIZED_NAME_UNTRACKED_VOLUME_USD)
  private String untrackedVolumeUsd;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private String txCount;

  public static final String SERIALIZED_NAME_LIQUIDITY = "liquidity";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY)
  private String liquidity;

  public static final String SERIALIZED_NAME_DERIVED_ETH = "derived_eth";
  @SerializedName(SERIALIZED_NAME_DERIVED_ETH)
  private String derivedEth;

  public static final String SERIALIZED_NAME_WHITELIST_PAIRS = "whitelist_pairs";
  @SerializedName(SERIALIZED_NAME_WHITELIST_PAIRS)
  private List<String> whitelistPairs = null;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public static final String SERIALIZED_NAME_TOKEN_SYMBOL = "token_symbol";
  @SerializedName(SERIALIZED_NAME_TOKEN_SYMBOL)
  private String tokenSymbol;

  public SushiswapTokenDTO() {
  }

  
  public SushiswapTokenDTO(
     String tokenSymbol
  ) {
    this();
    this.tokenSymbol = tokenSymbol;
  }

  public SushiswapTokenDTO entryTime(OffsetDateTime entryTime) {
    
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


  public SushiswapTokenDTO recvTime(OffsetDateTime recvTime) {
    
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


  public SushiswapTokenDTO blockNumber(Long blockNumber) {
    
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


  public SushiswapTokenDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Token address.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token address.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SushiswapTokenDTO factory(String factory) {
    
    this.factory = factory;
    return this;
  }

   /**
   * Factory address.
   * @return factory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Factory address.")

  public String getFactory() {
    return factory;
  }


  public void setFactory(String factory) {
    this.factory = factory;
  }


  public SushiswapTokenDTO symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Token symbol.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token symbol.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public SushiswapTokenDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Token name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SushiswapTokenDTO decimals(String decimals) {
    
    this.decimals = decimals;
    return this;
  }

   /**
   * Token decimals.
   * @return decimals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token decimals.")

  public String getDecimals() {
    return decimals;
  }


  public void setDecimals(String decimals) {
    this.decimals = decimals;
  }


  public SushiswapTokenDTO totalSupply(String totalSupply) {
    
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Total supply of liquidity token.
   * @return totalSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total supply of liquidity token.")

  public String getTotalSupply() {
    return totalSupply;
  }


  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }


  public SushiswapTokenDTO volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Amount of token traded all time across all pairs.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token traded all time across all pairs.")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  public SushiswapTokenDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public SushiswapTokenDTO untrackedVolumeUsd(String untrackedVolumeUsd) {
    
    this.untrackedVolumeUsd = untrackedVolumeUsd;
    return this;
  }

   /**
   * Amount of token in USD traded all time across pairs (no minimum liquidity threshold).
   * @return untrackedVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token in USD traded all time across pairs (no minimum liquidity threshold).")

  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }


  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }


  public SushiswapTokenDTO txCount(String txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Amount of transactions all time in pairs including token.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of transactions all time in pairs including token.")

  public String getTxCount() {
    return txCount;
  }


  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }


  public SushiswapTokenDTO liquidity(String liquidity) {
    
    this.liquidity = liquidity;
    return this;
  }

   /**
   * Total amount of token provided as liquidity across all pairs.
   * @return liquidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount of token provided as liquidity across all pairs.")

  public String getLiquidity() {
    return liquidity;
  }


  public void setLiquidity(String liquidity) {
    this.liquidity = liquidity;
  }


  public SushiswapTokenDTO derivedEth(String derivedEth) {
    
    this.derivedEth = derivedEth;
    return this;
  }

   /**
   * ETH per token.
   * @return derivedEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ETH per token.")

  public String getDerivedEth() {
    return derivedEth;
  }


  public void setDerivedEth(String derivedEth) {
    this.derivedEth = derivedEth;
  }


  public SushiswapTokenDTO whitelistPairs(List<String> whitelistPairs) {
    
    this.whitelistPairs = whitelistPairs;
    return this;
  }

  public SushiswapTokenDTO addWhitelistPairsItem(String whitelistPairsItem) {
    if (this.whitelistPairs == null) {
      this.whitelistPairs = new ArrayList<>();
    }
    this.whitelistPairs.add(whitelistPairsItem);
    return this;
  }

   /**
   * Array of whitelisted pairs.
   * @return whitelistPairs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of whitelisted pairs.")

  public List<String> getWhitelistPairs() {
    return whitelistPairs;
  }


  public void setWhitelistPairs(List<String> whitelistPairs) {
    this.whitelistPairs = whitelistPairs;
  }


  public SushiswapTokenDTO vid(Long vid) {
    
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


   /**
   * Get tokenSymbol
   * @return tokenSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTokenSymbol() {
    return tokenSymbol;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SushiswapTokenDTO sushiswapTokenDTO = (SushiswapTokenDTO) o;
    return Objects.equals(this.entryTime, sushiswapTokenDTO.entryTime) &&
        Objects.equals(this.recvTime, sushiswapTokenDTO.recvTime) &&
        Objects.equals(this.blockNumber, sushiswapTokenDTO.blockNumber) &&
        Objects.equals(this.id, sushiswapTokenDTO.id) &&
        Objects.equals(this.factory, sushiswapTokenDTO.factory) &&
        Objects.equals(this.symbol, sushiswapTokenDTO.symbol) &&
        Objects.equals(this.name, sushiswapTokenDTO.name) &&
        Objects.equals(this.decimals, sushiswapTokenDTO.decimals) &&
        Objects.equals(this.totalSupply, sushiswapTokenDTO.totalSupply) &&
        Objects.equals(this.volume, sushiswapTokenDTO.volume) &&
        Objects.equals(this.volumeUsd, sushiswapTokenDTO.volumeUsd) &&
        Objects.equals(this.untrackedVolumeUsd, sushiswapTokenDTO.untrackedVolumeUsd) &&
        Objects.equals(this.txCount, sushiswapTokenDTO.txCount) &&
        Objects.equals(this.liquidity, sushiswapTokenDTO.liquidity) &&
        Objects.equals(this.derivedEth, sushiswapTokenDTO.derivedEth) &&
        Objects.equals(this.whitelistPairs, sushiswapTokenDTO.whitelistPairs) &&
        Objects.equals(this.vid, sushiswapTokenDTO.vid) &&
        Objects.equals(this.tokenSymbol, sushiswapTokenDTO.tokenSymbol);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, factory, symbol, name, decimals, totalSupply, volume, volumeUsd, untrackedVolumeUsd, txCount, liquidity, derivedEth, whitelistPairs, vid, tokenSymbol);
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
    sb.append("class SushiswapTokenDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    factory: ").append(toIndentedString(factory)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    untrackedVolumeUsd: ").append(toIndentedString(untrackedVolumeUsd)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    liquidity: ").append(toIndentedString(liquidity)).append("\n");
    sb.append("    derivedEth: ").append(toIndentedString(derivedEth)).append("\n");
    sb.append("    whitelistPairs: ").append(toIndentedString(whitelistPairs)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
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
    openapiFields.add("factory");
    openapiFields.add("symbol");
    openapiFields.add("name");
    openapiFields.add("decimals");
    openapiFields.add("total_supply");
    openapiFields.add("volume");
    openapiFields.add("volume_usd");
    openapiFields.add("untracked_volume_usd");
    openapiFields.add("tx_count");
    openapiFields.add("liquidity");
    openapiFields.add("derived_eth");
    openapiFields.add("whitelist_pairs");
    openapiFields.add("vid");
    openapiFields.add("token_symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SushiswapTokenDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SushiswapTokenDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SushiswapTokenDTO is not found in the empty JSON string", SushiswapTokenDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SushiswapTokenDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SushiswapTokenDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("factory") != null && !jsonObj.get("factory").isJsonNull()) && !jsonObj.get("factory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `factory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("factory").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("decimals") != null && !jsonObj.get("decimals").isJsonNull()) && !jsonObj.get("decimals").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decimals` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decimals").toString()));
      }
      if ((jsonObj.get("total_supply") != null && !jsonObj.get("total_supply").isJsonNull()) && !jsonObj.get("total_supply").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_supply` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_supply").toString()));
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
      if ((jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) && !jsonObj.get("tx_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_count").toString()));
      }
      if ((jsonObj.get("liquidity") != null && !jsonObj.get("liquidity").isJsonNull()) && !jsonObj.get("liquidity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity").toString()));
      }
      if ((jsonObj.get("derived_eth") != null && !jsonObj.get("derived_eth").isJsonNull()) && !jsonObj.get("derived_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `derived_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("derived_eth").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("whitelist_pairs") != null && !jsonObj.get("whitelist_pairs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `whitelist_pairs` to be an array in the JSON string but got `%s`", jsonObj.get("whitelist_pairs").toString()));
      }
      if ((jsonObj.get("token_symbol") != null && !jsonObj.get("token_symbol").isJsonNull()) && !jsonObj.get("token_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SushiswapTokenDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SushiswapTokenDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SushiswapTokenDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SushiswapTokenDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SushiswapTokenDTO>() {
           @Override
           public void write(JsonWriter out, SushiswapTokenDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SushiswapTokenDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SushiswapTokenDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SushiswapTokenDTO
  * @throws IOException if the JSON string is invalid with respect to SushiswapTokenDTO
  */
  public static SushiswapTokenDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SushiswapTokenDTO.class);
  }

 /**
  * Convert an instance of SushiswapTokenDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

