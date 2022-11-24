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
import java.util.ArrayList;
import java.util.List;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-24T08:57:11.990286Z[Etc/UTC]")
public class UniswapV3TokenDTO {
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

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private Integer decimals;

  public static final String SERIALIZED_NAME_TOTAL_SUPPLY = "total_supply";
  @SerializedName(SERIALIZED_NAME_TOTAL_SUPPLY)
  private NumericsBigInteger totalSupply;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_UNTRACKED_VOLUME_USD = "untracked_volume_usd";
  @SerializedName(SERIALIZED_NAME_UNTRACKED_VOLUME_USD)
  private String untrackedVolumeUsd;

  public static final String SERIALIZED_NAME_FEES_USD = "fees_usd";
  @SerializedName(SERIALIZED_NAME_FEES_USD)
  private String feesUsd;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private NumericsBigInteger txCount;

  public static final String SERIALIZED_NAME_POOL_COUNT = "pool_count";
  @SerializedName(SERIALIZED_NAME_POOL_COUNT)
  private NumericsBigInteger poolCount;

  public static final String SERIALIZED_NAME_TOTAL_VALUE_LOCKED = "total_value_locked";
  @SerializedName(SERIALIZED_NAME_TOTAL_VALUE_LOCKED)
  private String totalValueLocked;

  public static final String SERIALIZED_NAME_TOTAL_VALUE_LOCKED_USD = "total_value_locked_usd";
  @SerializedName(SERIALIZED_NAME_TOTAL_VALUE_LOCKED_USD)
  private String totalValueLockedUsd;

  public static final String SERIALIZED_NAME_TOTAL_VALUE_LOCKED_USD_UNTRACKED = "total_value_locked_usd_untracked";
  @SerializedName(SERIALIZED_NAME_TOTAL_VALUE_LOCKED_USD_UNTRACKED)
  private String totalValueLockedUsdUntracked;

  public static final String SERIALIZED_NAME_DERIVED_ETH = "derived_eth";
  @SerializedName(SERIALIZED_NAME_DERIVED_ETH)
  private String derivedEth;

  public static final String SERIALIZED_NAME_WHITELIST_POOLS = "whitelist_pools";
  @SerializedName(SERIALIZED_NAME_WHITELIST_POOLS)
  private List<String> whitelistPools = null;

  public static final String SERIALIZED_NAME_TOKEN_SYMBOL = "token_symbol";
  @SerializedName(SERIALIZED_NAME_TOKEN_SYMBOL)
  private String tokenSymbol;

  public UniswapV3TokenDTO() {
  }

  
  public UniswapV3TokenDTO(
     String tokenSymbol
  ) {
    this();
    this.tokenSymbol = tokenSymbol;
  }

  public UniswapV3TokenDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV3TokenDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV3TokenDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV3TokenDTO vid(Long vid) {
    
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


  public UniswapV3TokenDTO id(String id) {
    
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


  public UniswapV3TokenDTO symbol(String symbol) {
    
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


  public UniswapV3TokenDTO name(String name) {
    
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


  public UniswapV3TokenDTO decimals(Integer decimals) {
    
    this.decimals = decimals;
    return this;
  }

   /**
   * Token decimals.
   * @return decimals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token decimals.")

  public Integer getDecimals() {
    return decimals;
  }


  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }


  public UniswapV3TokenDTO totalSupply(NumericsBigInteger totalSupply) {
    
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Get totalSupply
   * @return totalSupply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getTotalSupply() {
    return totalSupply;
  }


  public void setTotalSupply(NumericsBigInteger totalSupply) {
    this.totalSupply = totalSupply;
  }


  public UniswapV3TokenDTO volume(String volume) {
    
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


  public UniswapV3TokenDTO volumeUsd(String volumeUsd) {
    
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


  public UniswapV3TokenDTO untrackedVolumeUsd(String untrackedVolumeUsd) {
    
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


  public UniswapV3TokenDTO feesUsd(String feesUsd) {
    
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


  public UniswapV3TokenDTO txCount(NumericsBigInteger txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Get txCount
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getTxCount() {
    return txCount;
  }


  public void setTxCount(NumericsBigInteger txCount) {
    this.txCount = txCount;
  }


  public UniswapV3TokenDTO poolCount(NumericsBigInteger poolCount) {
    
    this.poolCount = poolCount;
    return this;
  }

   /**
   * Get poolCount
   * @return poolCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getPoolCount() {
    return poolCount;
  }


  public void setPoolCount(NumericsBigInteger poolCount) {
    this.poolCount = poolCount;
  }


  public UniswapV3TokenDTO totalValueLocked(String totalValueLocked) {
    
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


  public UniswapV3TokenDTO totalValueLockedUsd(String totalValueLockedUsd) {
    
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


  public UniswapV3TokenDTO totalValueLockedUsdUntracked(String totalValueLockedUsdUntracked) {
    
    this.totalValueLockedUsdUntracked = totalValueLockedUsdUntracked;
    return this;
  }

   /**
   * TVL derived in USD untracked.
   * @return totalValueLockedUsdUntracked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TVL derived in USD untracked.")

  public String getTotalValueLockedUsdUntracked() {
    return totalValueLockedUsdUntracked;
  }


  public void setTotalValueLockedUsdUntracked(String totalValueLockedUsdUntracked) {
    this.totalValueLockedUsdUntracked = totalValueLockedUsdUntracked;
  }


  public UniswapV3TokenDTO derivedEth(String derivedEth) {
    
    this.derivedEth = derivedEth;
    return this;
  }

   /**
   * Derived price in ETH.
   * @return derivedEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Derived price in ETH.")

  public String getDerivedEth() {
    return derivedEth;
  }


  public void setDerivedEth(String derivedEth) {
    this.derivedEth = derivedEth;
  }


  public UniswapV3TokenDTO whitelistPools(List<String> whitelistPools) {
    
    this.whitelistPools = whitelistPools;
    return this;
  }

  public UniswapV3TokenDTO addWhitelistPoolsItem(String whitelistPoolsItem) {
    if (this.whitelistPools == null) {
      this.whitelistPools = new ArrayList<>();
    }
    this.whitelistPools.add(whitelistPoolsItem);
    return this;
  }

   /**
   * Pools token is in that are white listed for USD pricing.
   * @return whitelistPools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pools token is in that are white listed for USD pricing.")

  public List<String> getWhitelistPools() {
    return whitelistPools;
  }


  public void setWhitelistPools(List<String> whitelistPools) {
    this.whitelistPools = whitelistPools;
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
    UniswapV3TokenDTO uniswapV3TokenDTO = (UniswapV3TokenDTO) o;
    return Objects.equals(this.entryTime, uniswapV3TokenDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV3TokenDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV3TokenDTO.blockNumber) &&
        Objects.equals(this.vid, uniswapV3TokenDTO.vid) &&
        Objects.equals(this.id, uniswapV3TokenDTO.id) &&
        Objects.equals(this.symbol, uniswapV3TokenDTO.symbol) &&
        Objects.equals(this.name, uniswapV3TokenDTO.name) &&
        Objects.equals(this.decimals, uniswapV3TokenDTO.decimals) &&
        Objects.equals(this.totalSupply, uniswapV3TokenDTO.totalSupply) &&
        Objects.equals(this.volume, uniswapV3TokenDTO.volume) &&
        Objects.equals(this.volumeUsd, uniswapV3TokenDTO.volumeUsd) &&
        Objects.equals(this.untrackedVolumeUsd, uniswapV3TokenDTO.untrackedVolumeUsd) &&
        Objects.equals(this.feesUsd, uniswapV3TokenDTO.feesUsd) &&
        Objects.equals(this.txCount, uniswapV3TokenDTO.txCount) &&
        Objects.equals(this.poolCount, uniswapV3TokenDTO.poolCount) &&
        Objects.equals(this.totalValueLocked, uniswapV3TokenDTO.totalValueLocked) &&
        Objects.equals(this.totalValueLockedUsd, uniswapV3TokenDTO.totalValueLockedUsd) &&
        Objects.equals(this.totalValueLockedUsdUntracked, uniswapV3TokenDTO.totalValueLockedUsdUntracked) &&
        Objects.equals(this.derivedEth, uniswapV3TokenDTO.derivedEth) &&
        Objects.equals(this.whitelistPools, uniswapV3TokenDTO.whitelistPools) &&
        Objects.equals(this.tokenSymbol, uniswapV3TokenDTO.tokenSymbol);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, id, symbol, name, decimals, totalSupply, volume, volumeUsd, untrackedVolumeUsd, feesUsd, txCount, poolCount, totalValueLocked, totalValueLockedUsd, totalValueLockedUsdUntracked, derivedEth, whitelistPools, tokenSymbol);
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
    sb.append("class UniswapV3TokenDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    untrackedVolumeUsd: ").append(toIndentedString(untrackedVolumeUsd)).append("\n");
    sb.append("    feesUsd: ").append(toIndentedString(feesUsd)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    poolCount: ").append(toIndentedString(poolCount)).append("\n");
    sb.append("    totalValueLocked: ").append(toIndentedString(totalValueLocked)).append("\n");
    sb.append("    totalValueLockedUsd: ").append(toIndentedString(totalValueLockedUsd)).append("\n");
    sb.append("    totalValueLockedUsdUntracked: ").append(toIndentedString(totalValueLockedUsdUntracked)).append("\n");
    sb.append("    derivedEth: ").append(toIndentedString(derivedEth)).append("\n");
    sb.append("    whitelistPools: ").append(toIndentedString(whitelistPools)).append("\n");
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
    openapiFields.add("vid");
    openapiFields.add("id");
    openapiFields.add("symbol");
    openapiFields.add("name");
    openapiFields.add("decimals");
    openapiFields.add("total_supply");
    openapiFields.add("volume");
    openapiFields.add("volume_usd");
    openapiFields.add("untracked_volume_usd");
    openapiFields.add("fees_usd");
    openapiFields.add("tx_count");
    openapiFields.add("pool_count");
    openapiFields.add("total_value_locked");
    openapiFields.add("total_value_locked_usd");
    openapiFields.add("total_value_locked_usd_untracked");
    openapiFields.add("derived_eth");
    openapiFields.add("whitelist_pools");
    openapiFields.add("token_symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV3TokenDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV3TokenDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV3TokenDTO is not found in the empty JSON string", UniswapV3TokenDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV3TokenDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV3TokenDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `total_supply`
      if (jsonObj.get("total_supply") != null && !jsonObj.get("total_supply").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("total_supply"));
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
      if ((jsonObj.get("fees_usd") != null && !jsonObj.get("fees_usd").isJsonNull()) && !jsonObj.get("fees_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fees_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fees_usd").toString()));
      }
      // validate the optional field `tx_count`
      if (jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("tx_count"));
      }
      // validate the optional field `pool_count`
      if (jsonObj.get("pool_count") != null && !jsonObj.get("pool_count").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("pool_count"));
      }
      if ((jsonObj.get("total_value_locked") != null && !jsonObj.get("total_value_locked").isJsonNull()) && !jsonObj.get("total_value_locked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_value_locked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_value_locked").toString()));
      }
      if ((jsonObj.get("total_value_locked_usd") != null && !jsonObj.get("total_value_locked_usd").isJsonNull()) && !jsonObj.get("total_value_locked_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_value_locked_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_value_locked_usd").toString()));
      }
      if ((jsonObj.get("total_value_locked_usd_untracked") != null && !jsonObj.get("total_value_locked_usd_untracked").isJsonNull()) && !jsonObj.get("total_value_locked_usd_untracked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_value_locked_usd_untracked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_value_locked_usd_untracked").toString()));
      }
      if ((jsonObj.get("derived_eth") != null && !jsonObj.get("derived_eth").isJsonNull()) && !jsonObj.get("derived_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `derived_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("derived_eth").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("whitelist_pools") != null && !jsonObj.get("whitelist_pools").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `whitelist_pools` to be an array in the JSON string but got `%s`", jsonObj.get("whitelist_pools").toString()));
      }
      if ((jsonObj.get("token_symbol") != null && !jsonObj.get("token_symbol").isJsonNull()) && !jsonObj.get("token_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV3TokenDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV3TokenDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV3TokenDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV3TokenDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV3TokenDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV3TokenDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV3TokenDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV3TokenDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV3TokenDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV3TokenDTO
  */
  public static UniswapV3TokenDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV3TokenDTO.class);
  }

 /**
  * Convert an instance of UniswapV3TokenDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

