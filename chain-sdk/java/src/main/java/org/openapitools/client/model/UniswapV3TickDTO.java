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
 * Ticks are the boundaries between discrete areas in price space.
 */
@ApiModel(description = "Ticks are the boundaries between discrete areas in price space.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-23T22:14:16.118357Z[Etc/UTC]")
public class UniswapV3TickDTO {
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

  public static final String SERIALIZED_NAME_POOL_ADDRESS = "pool_address";
  @SerializedName(SERIALIZED_NAME_POOL_ADDRESS)
  private String poolAddress;

  public static final String SERIALIZED_NAME_TICK_IDX = "tick_idx";
  @SerializedName(SERIALIZED_NAME_TICK_IDX)
  private NumericsBigInteger tickIdx;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_LIQUIDITY_GROSS = "liquidity_gross";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_GROSS)
  private NumericsBigInteger liquidityGross;

  public static final String SERIALIZED_NAME_LIQUIDITY_NET = "liquidity_net";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_NET)
  private NumericsBigInteger liquidityNet;

  public static final String SERIALIZED_NAME_PRICE0 = "price_0";
  @SerializedName(SERIALIZED_NAME_PRICE0)
  private String price0;

  public static final String SERIALIZED_NAME_PRICE1 = "price_1";
  @SerializedName(SERIALIZED_NAME_PRICE1)
  private String price1;

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

  public static final String SERIALIZED_NAME_FEES_USD = "fees_usd";
  @SerializedName(SERIALIZED_NAME_FEES_USD)
  private String feesUsd;

  public static final String SERIALIZED_NAME_COLLECTED_FEES_TOKEN0 = "collected_fees_token_0";
  @SerializedName(SERIALIZED_NAME_COLLECTED_FEES_TOKEN0)
  private String collectedFeesToken0;

  public static final String SERIALIZED_NAME_COLLECTED_FEES_TOKEN1 = "collected_fees_token_1";
  @SerializedName(SERIALIZED_NAME_COLLECTED_FEES_TOKEN1)
  private String collectedFeesToken1;

  public static final String SERIALIZED_NAME_COLLECTED_FEES_USD = "collected_fees_usd";
  @SerializedName(SERIALIZED_NAME_COLLECTED_FEES_USD)
  private String collectedFeesUsd;

  public static final String SERIALIZED_NAME_CREATED_AT_TIMESTAMP = "created_at_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_AT_TIMESTAMP)
  private OffsetDateTime createdAtTimestamp;

  public static final String SERIALIZED_NAME_LIQUIDITY_PROVIDER_COUNT = "liquidity_provider_count";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_PROVIDER_COUNT)
  private NumericsBigInteger liquidityProviderCount;

  public static final String SERIALIZED_NAME_FEE_GROWTH_OUTSIDE0X128 = "fee_growth_outside_0x128";
  @SerializedName(SERIALIZED_NAME_FEE_GROWTH_OUTSIDE0X128)
  private NumericsBigInteger feeGrowthOutside0x128;

  public static final String SERIALIZED_NAME_FEE_GROWTH_OUTSIDE1X128 = "fee_growth_outside_1x128";
  @SerializedName(SERIALIZED_NAME_FEE_GROWTH_OUTSIDE1X128)
  private NumericsBigInteger feeGrowthOutside1x128;

  public UniswapV3TickDTO() {
  }

  public UniswapV3TickDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV3TickDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV3TickDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV3TickDTO vid(Long vid) {
    
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


  public UniswapV3TickDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier, format: &lt;pool address&gt;#&lt;tick index&gt;
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier, format: <pool address>#<tick index>")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV3TickDTO poolAddress(String poolAddress) {
    
    this.poolAddress = poolAddress;
    return this;
  }

   /**
   * Pool address.
   * @return poolAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pool address.")

  public String getPoolAddress() {
    return poolAddress;
  }


  public void setPoolAddress(String poolAddress) {
    this.poolAddress = poolAddress;
  }


  public UniswapV3TickDTO tickIdx(NumericsBigInteger tickIdx) {
    
    this.tickIdx = tickIdx;
    return this;
  }

   /**
   * Get tickIdx
   * @return tickIdx
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getTickIdx() {
    return tickIdx;
  }


  public void setTickIdx(NumericsBigInteger tickIdx) {
    this.tickIdx = tickIdx;
  }


  public UniswapV3TickDTO pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * Pool address.
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pool address.")

  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public UniswapV3TickDTO liquidityGross(NumericsBigInteger liquidityGross) {
    
    this.liquidityGross = liquidityGross;
    return this;
  }

   /**
   * Get liquidityGross
   * @return liquidityGross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getLiquidityGross() {
    return liquidityGross;
  }


  public void setLiquidityGross(NumericsBigInteger liquidityGross) {
    this.liquidityGross = liquidityGross;
  }


  public UniswapV3TickDTO liquidityNet(NumericsBigInteger liquidityNet) {
    
    this.liquidityNet = liquidityNet;
    return this;
  }

   /**
   * Get liquidityNet
   * @return liquidityNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getLiquidityNet() {
    return liquidityNet;
  }


  public void setLiquidityNet(NumericsBigInteger liquidityNet) {
    this.liquidityNet = liquidityNet;
  }


  public UniswapV3TickDTO price0(String price0) {
    
    this.price0 = price0;
    return this;
  }

   /**
   * Calculated price of token0 of tick within this pool - constant.
   * @return price0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Calculated price of token0 of tick within this pool - constant.")

  public String getPrice0() {
    return price0;
  }


  public void setPrice0(String price0) {
    this.price0 = price0;
  }


  public UniswapV3TickDTO price1(String price1) {
    
    this.price1 = price1;
    return this;
  }

   /**
   * Calculated price of token1 of tick within this pool - constant.
   * @return price1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Calculated price of token1 of tick within this pool - constant.")

  public String getPrice1() {
    return price1;
  }


  public void setPrice1(String price1) {
    this.price1 = price1;
  }


  public UniswapV3TickDTO volumeToken0(String volumeToken0) {
    
    this.volumeToken0 = volumeToken0;
    return this;
  }

   /**
   * Lifetime volume of token0 with this tick in range.
   * @return volumeToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lifetime volume of token0 with this tick in range.")

  public String getVolumeToken0() {
    return volumeToken0;
  }


  public void setVolumeToken0(String volumeToken0) {
    this.volumeToken0 = volumeToken0;
  }


  public UniswapV3TickDTO volumeToken1(String volumeToken1) {
    
    this.volumeToken1 = volumeToken1;
    return this;
  }

   /**
   * Lifetime volume of token1 with this tick in range.
   * @return volumeToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lifetime volume of token1 with this tick in range.")

  public String getVolumeToken1() {
    return volumeToken1;
  }


  public void setVolumeToken1(String volumeToken1) {
    this.volumeToken1 = volumeToken1;
  }


  public UniswapV3TickDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Lifetime volume in derived USD with this tick in range.
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lifetime volume in derived USD with this tick in range.")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public UniswapV3TickDTO untrackedVolumeUsd(String untrackedVolumeUsd) {
    
    this.untrackedVolumeUsd = untrackedVolumeUsd;
    return this;
  }

   /**
   * Lifetime volume in untracked USD with this tick in range.
   * @return untrackedVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lifetime volume in untracked USD with this tick in range.")

  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }


  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }


  public UniswapV3TickDTO feesUsd(String feesUsd) {
    
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


  public UniswapV3TickDTO collectedFeesToken0(String collectedFeesToken0) {
    
    this.collectedFeesToken0 = collectedFeesToken0;
    return this;
  }

   /**
   * All time collected fees in token0.
   * @return collectedFeesToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time collected fees in token0.")

  public String getCollectedFeesToken0() {
    return collectedFeesToken0;
  }


  public void setCollectedFeesToken0(String collectedFeesToken0) {
    this.collectedFeesToken0 = collectedFeesToken0;
  }


  public UniswapV3TickDTO collectedFeesToken1(String collectedFeesToken1) {
    
    this.collectedFeesToken1 = collectedFeesToken1;
    return this;
  }

   /**
   * All time collected fees in token1.
   * @return collectedFeesToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time collected fees in token1.")

  public String getCollectedFeesToken1() {
    return collectedFeesToken1;
  }


  public void setCollectedFeesToken1(String collectedFeesToken1) {
    this.collectedFeesToken1 = collectedFeesToken1;
  }


  public UniswapV3TickDTO collectedFeesUsd(String collectedFeesUsd) {
    
    this.collectedFeesUsd = collectedFeesUsd;
    return this;
  }

   /**
   * All time collected fees in USD.
   * @return collectedFeesUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All time collected fees in USD.")

  public String getCollectedFeesUsd() {
    return collectedFeesUsd;
  }


  public void setCollectedFeesUsd(String collectedFeesUsd) {
    this.collectedFeesUsd = collectedFeesUsd;
  }


  public UniswapV3TickDTO createdAtTimestamp(OffsetDateTime createdAtTimestamp) {
    
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

   /**
   * Created time.
   * @return createdAtTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Created time.")

  public OffsetDateTime getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }


  public void setCreatedAtTimestamp(OffsetDateTime createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }


  public UniswapV3TickDTO liquidityProviderCount(NumericsBigInteger liquidityProviderCount) {
    
    this.liquidityProviderCount = liquidityProviderCount;
    return this;
  }

   /**
   * Get liquidityProviderCount
   * @return liquidityProviderCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getLiquidityProviderCount() {
    return liquidityProviderCount;
  }


  public void setLiquidityProviderCount(NumericsBigInteger liquidityProviderCount) {
    this.liquidityProviderCount = liquidityProviderCount;
  }


  public UniswapV3TickDTO feeGrowthOutside0x128(NumericsBigInteger feeGrowthOutside0x128) {
    
    this.feeGrowthOutside0x128 = feeGrowthOutside0x128;
    return this;
  }

   /**
   * Get feeGrowthOutside0x128
   * @return feeGrowthOutside0x128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getFeeGrowthOutside0x128() {
    return feeGrowthOutside0x128;
  }


  public void setFeeGrowthOutside0x128(NumericsBigInteger feeGrowthOutside0x128) {
    this.feeGrowthOutside0x128 = feeGrowthOutside0x128;
  }


  public UniswapV3TickDTO feeGrowthOutside1x128(NumericsBigInteger feeGrowthOutside1x128) {
    
    this.feeGrowthOutside1x128 = feeGrowthOutside1x128;
    return this;
  }

   /**
   * Get feeGrowthOutside1x128
   * @return feeGrowthOutside1x128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumericsBigInteger getFeeGrowthOutside1x128() {
    return feeGrowthOutside1x128;
  }


  public void setFeeGrowthOutside1x128(NumericsBigInteger feeGrowthOutside1x128) {
    this.feeGrowthOutside1x128 = feeGrowthOutside1x128;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniswapV3TickDTO uniswapV3TickDTO = (UniswapV3TickDTO) o;
    return Objects.equals(this.entryTime, uniswapV3TickDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV3TickDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV3TickDTO.blockNumber) &&
        Objects.equals(this.vid, uniswapV3TickDTO.vid) &&
        Objects.equals(this.id, uniswapV3TickDTO.id) &&
        Objects.equals(this.poolAddress, uniswapV3TickDTO.poolAddress) &&
        Objects.equals(this.tickIdx, uniswapV3TickDTO.tickIdx) &&
        Objects.equals(this.pool, uniswapV3TickDTO.pool) &&
        Objects.equals(this.liquidityGross, uniswapV3TickDTO.liquidityGross) &&
        Objects.equals(this.liquidityNet, uniswapV3TickDTO.liquidityNet) &&
        Objects.equals(this.price0, uniswapV3TickDTO.price0) &&
        Objects.equals(this.price1, uniswapV3TickDTO.price1) &&
        Objects.equals(this.volumeToken0, uniswapV3TickDTO.volumeToken0) &&
        Objects.equals(this.volumeToken1, uniswapV3TickDTO.volumeToken1) &&
        Objects.equals(this.volumeUsd, uniswapV3TickDTO.volumeUsd) &&
        Objects.equals(this.untrackedVolumeUsd, uniswapV3TickDTO.untrackedVolumeUsd) &&
        Objects.equals(this.feesUsd, uniswapV3TickDTO.feesUsd) &&
        Objects.equals(this.collectedFeesToken0, uniswapV3TickDTO.collectedFeesToken0) &&
        Objects.equals(this.collectedFeesToken1, uniswapV3TickDTO.collectedFeesToken1) &&
        Objects.equals(this.collectedFeesUsd, uniswapV3TickDTO.collectedFeesUsd) &&
        Objects.equals(this.createdAtTimestamp, uniswapV3TickDTO.createdAtTimestamp) &&
        Objects.equals(this.liquidityProviderCount, uniswapV3TickDTO.liquidityProviderCount) &&
        Objects.equals(this.feeGrowthOutside0x128, uniswapV3TickDTO.feeGrowthOutside0x128) &&
        Objects.equals(this.feeGrowthOutside1x128, uniswapV3TickDTO.feeGrowthOutside1x128);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, vid, id, poolAddress, tickIdx, pool, liquidityGross, liquidityNet, price0, price1, volumeToken0, volumeToken1, volumeUsd, untrackedVolumeUsd, feesUsd, collectedFeesToken0, collectedFeesToken1, collectedFeesUsd, createdAtTimestamp, liquidityProviderCount, feeGrowthOutside0x128, feeGrowthOutside1x128);
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
    sb.append("class UniswapV3TickDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    vid: ").append(toIndentedString(vid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    poolAddress: ").append(toIndentedString(poolAddress)).append("\n");
    sb.append("    tickIdx: ").append(toIndentedString(tickIdx)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    liquidityGross: ").append(toIndentedString(liquidityGross)).append("\n");
    sb.append("    liquidityNet: ").append(toIndentedString(liquidityNet)).append("\n");
    sb.append("    price0: ").append(toIndentedString(price0)).append("\n");
    sb.append("    price1: ").append(toIndentedString(price1)).append("\n");
    sb.append("    volumeToken0: ").append(toIndentedString(volumeToken0)).append("\n");
    sb.append("    volumeToken1: ").append(toIndentedString(volumeToken1)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    untrackedVolumeUsd: ").append(toIndentedString(untrackedVolumeUsd)).append("\n");
    sb.append("    feesUsd: ").append(toIndentedString(feesUsd)).append("\n");
    sb.append("    collectedFeesToken0: ").append(toIndentedString(collectedFeesToken0)).append("\n");
    sb.append("    collectedFeesToken1: ").append(toIndentedString(collectedFeesToken1)).append("\n");
    sb.append("    collectedFeesUsd: ").append(toIndentedString(collectedFeesUsd)).append("\n");
    sb.append("    createdAtTimestamp: ").append(toIndentedString(createdAtTimestamp)).append("\n");
    sb.append("    liquidityProviderCount: ").append(toIndentedString(liquidityProviderCount)).append("\n");
    sb.append("    feeGrowthOutside0x128: ").append(toIndentedString(feeGrowthOutside0x128)).append("\n");
    sb.append("    feeGrowthOutside1x128: ").append(toIndentedString(feeGrowthOutside1x128)).append("\n");
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
    openapiFields.add("pool_address");
    openapiFields.add("tick_idx");
    openapiFields.add("pool");
    openapiFields.add("liquidity_gross");
    openapiFields.add("liquidity_net");
    openapiFields.add("price_0");
    openapiFields.add("price_1");
    openapiFields.add("volume_token_0");
    openapiFields.add("volume_token_1");
    openapiFields.add("volume_usd");
    openapiFields.add("untracked_volume_usd");
    openapiFields.add("fees_usd");
    openapiFields.add("collected_fees_token_0");
    openapiFields.add("collected_fees_token_1");
    openapiFields.add("collected_fees_usd");
    openapiFields.add("created_at_timestamp");
    openapiFields.add("liquidity_provider_count");
    openapiFields.add("fee_growth_outside_0x128");
    openapiFields.add("fee_growth_outside_1x128");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV3TickDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV3TickDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV3TickDTO is not found in the empty JSON string", UniswapV3TickDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV3TickDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV3TickDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("pool_address") != null && !jsonObj.get("pool_address").isJsonNull()) && !jsonObj.get("pool_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool_address").toString()));
      }
      // validate the optional field `tick_idx`
      if (jsonObj.get("tick_idx") != null && !jsonObj.get("tick_idx").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("tick_idx"));
      }
      if ((jsonObj.get("pool") != null && !jsonObj.get("pool").isJsonNull()) && !jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      // validate the optional field `liquidity_gross`
      if (jsonObj.get("liquidity_gross") != null && !jsonObj.get("liquidity_gross").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("liquidity_gross"));
      }
      // validate the optional field `liquidity_net`
      if (jsonObj.get("liquidity_net") != null && !jsonObj.get("liquidity_net").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("liquidity_net"));
      }
      if ((jsonObj.get("price_0") != null && !jsonObj.get("price_0").isJsonNull()) && !jsonObj.get("price_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_0").toString()));
      }
      if ((jsonObj.get("price_1") != null && !jsonObj.get("price_1").isJsonNull()) && !jsonObj.get("price_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price_1").toString()));
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
      if ((jsonObj.get("fees_usd") != null && !jsonObj.get("fees_usd").isJsonNull()) && !jsonObj.get("fees_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fees_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fees_usd").toString()));
      }
      if ((jsonObj.get("collected_fees_token_0") != null && !jsonObj.get("collected_fees_token_0").isJsonNull()) && !jsonObj.get("collected_fees_token_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collected_fees_token_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collected_fees_token_0").toString()));
      }
      if ((jsonObj.get("collected_fees_token_1") != null && !jsonObj.get("collected_fees_token_1").isJsonNull()) && !jsonObj.get("collected_fees_token_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collected_fees_token_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collected_fees_token_1").toString()));
      }
      if ((jsonObj.get("collected_fees_usd") != null && !jsonObj.get("collected_fees_usd").isJsonNull()) && !jsonObj.get("collected_fees_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collected_fees_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collected_fees_usd").toString()));
      }
      // validate the optional field `liquidity_provider_count`
      if (jsonObj.get("liquidity_provider_count") != null && !jsonObj.get("liquidity_provider_count").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("liquidity_provider_count"));
      }
      // validate the optional field `fee_growth_outside_0x128`
      if (jsonObj.get("fee_growth_outside_0x128") != null && !jsonObj.get("fee_growth_outside_0x128").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("fee_growth_outside_0x128"));
      }
      // validate the optional field `fee_growth_outside_1x128`
      if (jsonObj.get("fee_growth_outside_1x128") != null && !jsonObj.get("fee_growth_outside_1x128").isJsonNull()) {
        NumericsBigInteger.validateJsonObject(jsonObj.getAsJsonObject("fee_growth_outside_1x128"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniswapV3TickDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV3TickDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV3TickDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV3TickDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV3TickDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV3TickDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV3TickDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV3TickDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV3TickDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV3TickDTO
  */
  public static UniswapV3TickDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV3TickDTO.class);
  }

 /**
  * Convert an instance of UniswapV3TickDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

