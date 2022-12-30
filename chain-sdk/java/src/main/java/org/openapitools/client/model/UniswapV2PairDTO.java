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
 * Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.
 */
@ApiModel(description = "Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-30T09:47:49.441837Z[Etc/UTC]")
public class UniswapV2PairDTO {
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

  public static final String SERIALIZED_NAME_RESERVE_ETH = "reserve_eth";
  @SerializedName(SERIALIZED_NAME_RESERVE_ETH)
  private String reserveEth;

  public static final String SERIALIZED_NAME_RESERVE_USD = "reserve_usd";
  @SerializedName(SERIALIZED_NAME_RESERVE_USD)
  private String reserveUsd;

  public static final String SERIALIZED_NAME_TRACKED_RESERVE_ETH = "tracked_reserve_eth";
  @SerializedName(SERIALIZED_NAME_TRACKED_RESERVE_ETH)
  private String trackedReserveEth;

  public static final String SERIALIZED_NAME_TOKEN0_PRICE = "token_0_price";
  @SerializedName(SERIALIZED_NAME_TOKEN0_PRICE)
  private String token0Price;

  public static final String SERIALIZED_NAME_TOKEN1_PRICE = "token_1_price";
  @SerializedName(SERIALIZED_NAME_TOKEN1_PRICE)
  private String token1Price;

  public static final String SERIALIZED_NAME_VOLUME_TOKEN0 = "volume_token_0";
  @SerializedName(SERIALIZED_NAME_VOLUME_TOKEN0)
  private String volumeToken0;

  public static final String SERIALIZED_NAME_VOLUME_TOKEN1 = "volume_token_1";
  @SerializedName(SERIALIZED_NAME_VOLUME_TOKEN1)
  private String volumeToken1;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_UNTRACKED_VOLUME_USD = "untracked_volume_usd";
  @SerializedName(SERIALIZED_NAME_UNTRACKED_VOLUME_USD)
  private String untrackedVolumeUsd;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private NumericsBigInteger txCount;

  public static final String SERIALIZED_NAME_CREATED_AT_TIMESTAMP = "created_at_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_TIMESTAMP)
  private OffsetDateTime createdAtTimestamp;

  public static final String SERIALIZED_NAME_LIQUIDITY_PROVIDER_COUNT = "liquidity_provider_count";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_PROVIDER_COUNT)
  private String liquidityProviderCount;

  public static final String SERIALIZED_NAME_EVALUATED_ASK = "evaluated_ask";
  @SerializedName(SERIALIZED_NAME_EVALUATED_ASK)
  private Double evaluatedAsk;

  public UniswapV2PairDTO() {
  }

  
  public UniswapV2PairDTO(
     Double evaluatedAsk
  ) {
    this();
    this.evaluatedAsk = evaluatedAsk;
  }

  public UniswapV2PairDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV2PairDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV2PairDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV2PairDTO vid(Long vid) {
    
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


  public UniswapV2PairDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Pair contract address.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pair contract address.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV2PairDTO token0(String token0) {
    
    this.token0 = token0;
    return this;
  }

   /**
   * Reference to token0 as stored in pair contract.
   * @return token0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token0 as stored in pair contract.")

  public String getToken0() {
    return token0;
  }


  public void setToken0(String token0) {
    this.token0 = token0;
  }


  public UniswapV2PairDTO token1(String token1) {
    
    this.token1 = token1;
    return this;
  }

   /**
   * Reference to token1 as stored in pair contract.
   * @return token1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token1 as stored in pair contract.")

  public String getToken1() {
    return token1;
  }


  public void setToken1(String token1) {
    this.token1 = token1;
  }


  public UniswapV2PairDTO reserve0(String reserve0) {
    
    this.reserve0 = reserve0;
    return this;
  }

   /**
   * Reserve of token0.
   * @return reserve0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reserve of token0.")

  public String getReserve0() {
    return reserve0;
  }


  public void setReserve0(String reserve0) {
    this.reserve0 = reserve0;
  }


  public UniswapV2PairDTO reserve1(String reserve1) {
    
    this.reserve1 = reserve1;
    return this;
  }

   /**
   * Reserve of token1.
   * @return reserve1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reserve of token1.")

  public String getReserve1() {
    return reserve1;
  }


  public void setReserve1(String reserve1) {
    this.reserve1 = reserve1;
  }


  public UniswapV2PairDTO totalSupply(String totalSupply) {
    
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


  public UniswapV2PairDTO reserveEth(String reserveEth) {
    
    this.reserveEth = reserveEth;
    return this;
  }

   /**
   * Total liquidity in pair stored as an amount of ETH.
   * @return reserveEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total liquidity in pair stored as an amount of ETH.")

  public String getReserveEth() {
    return reserveEth;
  }


  public void setReserveEth(String reserveEth) {
    this.reserveEth = reserveEth;
  }


  public UniswapV2PairDTO reserveUsd(String reserveUsd) {
    
    this.reserveUsd = reserveUsd;
    return this;
  }

   /**
   * Total liquidity amount in pair stored as an amount of USD.
   * @return reserveUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total liquidity amount in pair stored as an amount of USD.")

  public String getReserveUsd() {
    return reserveUsd;
  }


  public void setReserveUsd(String reserveUsd) {
    this.reserveUsd = reserveUsd;
  }


  public UniswapV2PairDTO trackedReserveEth(String trackedReserveEth) {
    
    this.trackedReserveEth = trackedReserveEth;
    return this;
  }

   /**
   * Total liquidity with only tracked amount.
   * @return trackedReserveEth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total liquidity with only tracked amount.")

  public String getTrackedReserveEth() {
    return trackedReserveEth;
  }


  public void setTrackedReserveEth(String trackedReserveEth) {
    this.trackedReserveEth = trackedReserveEth;
  }


  public UniswapV2PairDTO token0Price(String token0Price) {
    
    this.token0Price = token0Price;
    return this;
  }

   /**
   * Token0 per token1.
   * @return token0Price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token0 per token1.")

  public String getToken0Price() {
    return token0Price;
  }


  public void setToken0Price(String token0Price) {
    this.token0Price = token0Price;
  }


  public UniswapV2PairDTO token1Price(String token1Price) {
    
    this.token1Price = token1Price;
    return this;
  }

   /**
   * Token1 per token0.
   * @return token1Price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Token1 per token0.")

  public String getToken1Price() {
    return token1Price;
  }


  public void setToken1Price(String token1Price) {
    this.token1Price = token1Price;
  }


  public UniswapV2PairDTO volumeToken0(String volumeToken0) {
    
    this.volumeToken0 = volumeToken0;
    return this;
  }

   /**
   * Amount of token0 swapped on this pair.
   * @return volumeToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token0 swapped on this pair.")

  public String getVolumeToken0() {
    return volumeToken0;
  }


  public void setVolumeToken0(String volumeToken0) {
    this.volumeToken0 = volumeToken0;
  }


  public UniswapV2PairDTO volumeToken1(String volumeToken1) {
    
    this.volumeToken1 = volumeToken1;
    return this;
  }

   /**
   * Amount of token1 swapped on this pair.
   * @return volumeToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of token1 swapped on this pair.")

  public String getVolumeToken1() {
    return volumeToken1;
  }


  public void setVolumeToken1(String volumeToken1) {
    this.volumeToken1 = volumeToken1;
  }


  public UniswapV2PairDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold).
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold).")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public UniswapV2PairDTO untrackedVolumeUsd(String untrackedVolumeUsd) {
    
    this.untrackedVolumeUsd = untrackedVolumeUsd;
    return this;
  }

   /**
   * Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold.
   * @return untrackedVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold.")

  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }


  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }


  public UniswapV2PairDTO txCount(NumericsBigInteger txCount) {
    
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


  public UniswapV2PairDTO createdAtTimestamp(OffsetDateTime createdAtTimestamp) {
    
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

   /**
   * Timestamp contract was created.
   * @return createdAtTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp contract was created.")

  public OffsetDateTime getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }


  public void setCreatedAtTimestamp(OffsetDateTime createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }


  public UniswapV2PairDTO liquidityProviderCount(String liquidityProviderCount) {
    
    this.liquidityProviderCount = liquidityProviderCount;
    return this;
  }

   /**
   * Total number of LPs.
   * @return liquidityProviderCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of LPs.")

  public String getLiquidityProviderCount() {
    return liquidityProviderCount;
  }


  public void setLiquidityProviderCount(String liquidityProviderCount) {
    this.liquidityProviderCount = liquidityProviderCount;
  }


   /**
   * Get evaluatedAsk
   * @return evaluatedAsk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getEvaluatedAsk() {
    return evaluatedAsk;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniswapV2PairDTO uniswapV2PairDTO = (UniswapV2PairDTO) o;
    return Objects.equals(this.entryTime, uniswapV2PairDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV2PairDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV2PairDTO.blockNumber) &&
        Objects.equals(this.vid, uniswapV2PairDTO.vid) &&
        Objects.equals(this.id, uniswapV2PairDTO.id) &&
        Objects.equals(this.token0, uniswapV2PairDTO.token0) &&
        Objects.equals(this.token1, uniswapV2PairDTO.token1) &&
        Objects.equals(this.reserve0, uniswapV2PairDTO.reserve0) &&
        Objects.equals(this.reserve1, uniswapV2PairDTO.reserve1) &&
        Objects.equals(this.totalSupply, uniswapV2PairDTO.totalSupply) &&
        Objects.equals(this.reserveEth, uniswapV2PairDTO.reserveEth) &&
        Objects.equals(this.reserveUsd, uniswapV2PairDTO.reserveUsd) &&
        Objects.equals(this.trackedReserveEth, uniswapV2PairDTO.trackedReserveEth) &&
        Objects.equals(this.token0Price, uniswapV2PairDTO.token0Price) &&
        Objects.equals(this.token1Price, uniswapV2PairDTO.token1Price) &&
        Objects.equals(this.volumeToken0, uniswapV2PairDTO.volumeToken0) &&
        Objects.equals(this.volumeToken1, uniswapV2PairDTO.volumeToken1) &&
        Objects.equals(this.volumeUsd, uniswapV2PairDTO.volumeUsd) &&
        Objects.equals(this.untrackedVolumeUsd, uniswapV2PairDTO.untrackedVolumeUsd) &&
        Objects.equals(this.txCount, uniswapV2PairDTO.txCount) &&
        Objects.equals(this.createdAtTimestamp, uniswapV2PairDTO.createdAtTimestamp) &&
        Objects.equals(this.liquidityProviderCount, uniswapV2PairDTO.liquidityProviderCount) &&
        Objects.equals(this.evaluatedAsk, uniswapV2PairDTO.evaluatedAsk);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, id, token0, token1, reserve0, reserve1, totalSupply, reserveEth, reserveUsd, trackedReserveEth, token0Price, token1Price, volumeToken0, volumeToken1, volumeUsd, untrackedVolumeUsd, txCount, createdAtTimestamp, liquidityProviderCount, evaluatedAsk);
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
    sb.append("class UniswapV2PairDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token0: ").append(toIndentedString(token0)).append("\n");
    sb.append("    token1: ").append(toIndentedString(token1)).append("\n");
    sb.append("    reserve0: ").append(toIndentedString(reserve0)).append("\n");
    sb.append("    reserve1: ").append(toIndentedString(reserve1)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    reserveEth: ").append(toIndentedString(reserveEth)).append("\n");
    sb.append("    reserveUsd: ").append(toIndentedString(reserveUsd)).append("\n");
    sb.append("    trackedReserveEth: ").append(toIndentedString(trackedReserveEth)).append("\n");
    sb.append("    token0Price: ").append(toIndentedString(token0Price)).append("\n");
    sb.append("    token1Price: ").append(toIndentedString(token1Price)).append("\n");
    sb.append("    volumeToken0: ").append(toIndentedString(volumeToken0)).append("\n");
    sb.append("    volumeToken1: ").append(toIndentedString(volumeToken1)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    untrackedVolumeUsd: ").append(toIndentedString(untrackedVolumeUsd)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    createdAtTimestamp: ").append(toIndentedString(createdAtTimestamp)).append("\n");
    sb.append("    liquidityProviderCount: ").append(toIndentedString(liquidityProviderCount)).append("\n");
    sb.append("    evaluatedAsk: ").append(toIndentedString(evaluatedAsk)).append("\n");
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
    openapiFields.add("token_0");
    openapiFields.add("token_1");
    openapiFields.add("reserve_0");
    openapiFields.add("reserve_1");
    openapiFields.add("total_supply");
    openapiFields.add("reserve_eth");
    openapiFields.add("reserve_usd");
    openapiFields.add("tracked_reserve_eth");
    openapiFields.add("token_0_price");
    openapiFields.add("token_1_price");
    openapiFields.add("volume_token_0");
    openapiFields.add("volume_token_1");
    openapiFields.add("volume_usd");
    openapiFields.add("untracked_volume_usd");
    openapiFields.add("tx_count");
    openapiFields.add("created_at_timestamp");
    openapiFields.add("liquidity_provider_count");
    openapiFields.add("evaluated_ask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV2PairDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV2PairDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV2PairDTO is not found in the empty JSON string", UniswapV2PairDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV2PairDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV2PairDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
      if ((jsonObj.get("reserve_eth") != null && !jsonObj.get("reserve_eth").isJsonNull()) && !jsonObj.get("reserve_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reserve_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reserve_eth").toString()));
      }
      if ((jsonObj.get("reserve_usd") != null && !jsonObj.get("reserve_usd").isJsonNull()) && !jsonObj.get("reserve_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reserve_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reserve_usd").toString()));
      }
      if ((jsonObj.get("tracked_reserve_eth") != null && !jsonObj.get("tracked_reserve_eth").isJsonNull()) && !jsonObj.get("tracked_reserve_eth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracked_reserve_eth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracked_reserve_eth").toString()));
      }
      if ((jsonObj.get("token_0_price") != null && !jsonObj.get("token_0_price").isJsonNull()) && !jsonObj.get("token_0_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_0_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_0_price").toString()));
      }
      if ((jsonObj.get("token_1_price") != null && !jsonObj.get("token_1_price").isJsonNull()) && !jsonObj.get("token_1_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_1_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_1_price").toString()));
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
      if ((jsonObj.get("untracked_volume_usd") != null && !jsonObj.get("untracked_volume_usd").isJsonNull()) && !jsonObj.get("untracked_volume_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `untracked_volume_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("untracked_volume_usd").toString()));
      }
      // validate the optional field `tx_count`
      if (jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("tx_count"));
      }
      if ((jsonObj.get("liquidity_provider_count") != null && !jsonObj.get("liquidity_provider_count").isJsonNull()) && !jsonObj.get("liquidity_provider_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity_provider_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity_provider_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV2PairDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV2PairDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV2PairDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV2PairDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV2PairDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV2PairDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV2PairDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV2PairDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV2PairDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV2PairDTO
  */
  public static UniswapV2PairDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV2PairDTO.class);
  }

 /**
  * Convert an instance of UniswapV2PairDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

