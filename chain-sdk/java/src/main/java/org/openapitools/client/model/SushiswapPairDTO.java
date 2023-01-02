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
 * Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.
 */
@ApiModel(description = "Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-02T16:03:11.414151Z[Etc/UTC]")
public class SushiswapPairDTO {
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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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
  private String txCount;

  public static final String SERIALIZED_NAME_LIQUIDITY_PROVIDER_COUNT = "liquidity_provider_count";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_PROVIDER_COUNT)
  private String liquidityProviderCount;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_BLOCK = "block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private String block;

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public static final String SERIALIZED_NAME_EVALUATED_ASK = "evaluated_ask";
  @SerializedName(SERIALIZED_NAME_EVALUATED_ASK)
  private Double evaluatedAsk;

  public SushiswapPairDTO() {
  }

  
  public SushiswapPairDTO(
     Double evaluatedAsk
  ) {
    this();
    this.evaluatedAsk = evaluatedAsk;
  }

  public SushiswapPairDTO entryTime(OffsetDateTime entryTime) {
    
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


  public SushiswapPairDTO recvTime(OffsetDateTime recvTime) {
    
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


  public SushiswapPairDTO blockNumber(Long blockNumber) {
    
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


  public SushiswapPairDTO id(String id) {
    
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


  public SushiswapPairDTO factory(String factory) {
    
    this.factory = factory;
    return this;
  }

   /**
   * Factory contract address.
   * @return factory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Factory contract address.")

  public String getFactory() {
    return factory;
  }


  public void setFactory(String factory) {
    this.factory = factory;
  }


  public SushiswapPairDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Friendly name, format: &lt;token0 name&gt;-&lt;token1 name&gt;
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Friendly name, format: <token0 name>-<token1 name>")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SushiswapPairDTO token0(String token0) {
    
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


  public SushiswapPairDTO token1(String token1) {
    
    this.token1 = token1;
    return this;
  }

   /**
   * Reference to token0 as stored in pair contract.
   * @return token1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference to token0 as stored in pair contract.")

  public String getToken1() {
    return token1;
  }


  public void setToken1(String token1) {
    this.token1 = token1;
  }


  public SushiswapPairDTO reserve0(String reserve0) {
    
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


  public SushiswapPairDTO reserve1(String reserve1) {
    
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


  public SushiswapPairDTO totalSupply(String totalSupply) {
    
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


  public SushiswapPairDTO reserveEth(String reserveEth) {
    
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


  public SushiswapPairDTO reserveUsd(String reserveUsd) {
    
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


  public SushiswapPairDTO trackedReserveEth(String trackedReserveEth) {
    
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


  public SushiswapPairDTO token0Price(String token0Price) {
    
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


  public SushiswapPairDTO token1Price(String token1Price) {
    
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


  public SushiswapPairDTO volumeToken0(String volumeToken0) {
    
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


  public SushiswapPairDTO volumeToken1(String volumeToken1) {
    
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


  public SushiswapPairDTO volumeUsd(String volumeUsd) {
    
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


  public SushiswapPairDTO untrackedVolumeUsd(String untrackedVolumeUsd) {
    
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


  public SushiswapPairDTO txCount(String txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * All time amount of transactions on this pair.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time amount of transactions on this pair.")

  public String getTxCount() {
    return txCount;
  }


  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }


  public SushiswapPairDTO liquidityProviderCount(String liquidityProviderCount) {
    
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


  public SushiswapPairDTO timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public SushiswapPairDTO block(String block) {
    
    this.block = block;
    return this;
  }

   /**
   * Block number in which pair information was created in.
   * @return block
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Block number in which pair information was created in.")

  public String getBlock() {
    return block;
  }


  public void setBlock(String block) {
    this.block = block;
  }


  public SushiswapPairDTO vid(Long vid) {
    
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
    SushiswapPairDTO sushiswapPairDTO = (SushiswapPairDTO) o;
    return Objects.equals(this.entryTime, sushiswapPairDTO.entryTime) &&
        Objects.equals(this.recvTime, sushiswapPairDTO.recvTime) &&
        Objects.equals(this.blockNumber, sushiswapPairDTO.blockNumber) &&
        Objects.equals(this.id, sushiswapPairDTO.id) &&
        Objects.equals(this.factory, sushiswapPairDTO.factory) &&
        Objects.equals(this.name, sushiswapPairDTO.name) &&
        Objects.equals(this.token0, sushiswapPairDTO.token0) &&
        Objects.equals(this.token1, sushiswapPairDTO.token1) &&
        Objects.equals(this.reserve0, sushiswapPairDTO.reserve0) &&
        Objects.equals(this.reserve1, sushiswapPairDTO.reserve1) &&
        Objects.equals(this.totalSupply, sushiswapPairDTO.totalSupply) &&
        Objects.equals(this.reserveEth, sushiswapPairDTO.reserveEth) &&
        Objects.equals(this.reserveUsd, sushiswapPairDTO.reserveUsd) &&
        Objects.equals(this.trackedReserveEth, sushiswapPairDTO.trackedReserveEth) &&
        Objects.equals(this.token0Price, sushiswapPairDTO.token0Price) &&
        Objects.equals(this.token1Price, sushiswapPairDTO.token1Price) &&
        Objects.equals(this.volumeToken0, sushiswapPairDTO.volumeToken0) &&
        Objects.equals(this.volumeToken1, sushiswapPairDTO.volumeToken1) &&
        Objects.equals(this.volumeUsd, sushiswapPairDTO.volumeUsd) &&
        Objects.equals(this.untrackedVolumeUsd, sushiswapPairDTO.untrackedVolumeUsd) &&
        Objects.equals(this.txCount, sushiswapPairDTO.txCount) &&
        Objects.equals(this.liquidityProviderCount, sushiswapPairDTO.liquidityProviderCount) &&
        Objects.equals(this.timestamp, sushiswapPairDTO.timestamp) &&
        Objects.equals(this.block, sushiswapPairDTO.block) &&
        Objects.equals(this.vid, sushiswapPairDTO.vid) &&
        Objects.equals(this.evaluatedAsk, sushiswapPairDTO.evaluatedAsk);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, factory, name, token0, token1, reserve0, reserve1, totalSupply, reserveEth, reserveUsd, trackedReserveEth, token0Price, token1Price, volumeToken0, volumeToken1, volumeUsd, untrackedVolumeUsd, txCount, liquidityProviderCount, timestamp, block, vid, evaluatedAsk);
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
    sb.append("class SushiswapPairDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    factory: ").append(toIndentedString(factory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    sb.append("    liquidityProviderCount: ").append(toIndentedString(liquidityProviderCount)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("factory");
    openapiFields.add("name");
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
    openapiFields.add("liquidity_provider_count");
    openapiFields.add("timestamp");
    openapiFields.add("block");
    openapiFields.add("vid");
    openapiFields.add("evaluated_ask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SushiswapPairDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SushiswapPairDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SushiswapPairDTO is not found in the empty JSON string", SushiswapPairDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SushiswapPairDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SushiswapPairDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("factory") != null && !jsonObj.get("factory").isJsonNull()) && !jsonObj.get("factory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `factory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("factory").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
      if ((jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) && !jsonObj.get("tx_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_count").toString()));
      }
      if ((jsonObj.get("liquidity_provider_count") != null && !jsonObj.get("liquidity_provider_count").isJsonNull()) && !jsonObj.get("liquidity_provider_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity_provider_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity_provider_count").toString()));
      }
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
      if ((jsonObj.get("block") != null && !jsonObj.get("block").isJsonNull()) && !jsonObj.get("block").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `block` to be a primitive type in the JSON string but got `%s`", jsonObj.get("block").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SushiswapPairDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SushiswapPairDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SushiswapPairDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SushiswapPairDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<SushiswapPairDTO>() {
           @Override
           public void write(JsonWriter out, SushiswapPairDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SushiswapPairDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SushiswapPairDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SushiswapPairDTO
  * @throws IOException if the JSON string is invalid with respect to SushiswapPairDTO
  */
  public static SushiswapPairDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SushiswapPairDTO.class);
  }

 /**
  * Convert an instance of SushiswapPairDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

