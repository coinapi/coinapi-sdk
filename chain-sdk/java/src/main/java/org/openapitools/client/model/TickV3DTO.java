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
 * TickV3DTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-25T09:43:41.619929Z[Etc/UTC]")
public class TickV3DTO {
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
  private BigInteger tickIdx;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_LIQUIDITY_GROSS = "liquidity_gross";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_GROSS)
  private BigInteger liquidityGross;

  public static final String SERIALIZED_NAME_LIQUIDITY_NET = "liquidity_net";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY_NET)
  private BigInteger liquidityNet;

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
  private BigInteger liquidityProviderCount;

  public static final String SERIALIZED_NAME_FEE_GROWTH_OUTSIDE0X128 = "fee_growth_outside_0x128";
  @SerializedName(SERIALIZED_NAME_FEE_GROWTH_OUTSIDE0X128)
  private BigInteger feeGrowthOutside0x128;

  public static final String SERIALIZED_NAME_FEE_GROWTH_OUTSIDE1X128 = "fee_growth_outside_1x128";
  @SerializedName(SERIALIZED_NAME_FEE_GROWTH_OUTSIDE1X128)
  private BigInteger feeGrowthOutside1x128;

  public TickV3DTO() {
  }

  public TickV3DTO entryTime(OffsetDateTime entryTime) {
    
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


  public TickV3DTO recvTime(OffsetDateTime recvTime) {
    
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


  public TickV3DTO blockNumber(Long blockNumber) {
    
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


  public TickV3DTO vid(Long vid) {
    
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


  public TickV3DTO id(String id) {
    
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


  public TickV3DTO poolAddress(String poolAddress) {
    
    this.poolAddress = poolAddress;
    return this;
  }

   /**
   * Get poolAddress
   * @return poolAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPoolAddress() {
    return poolAddress;
  }


  public void setPoolAddress(String poolAddress) {
    this.poolAddress = poolAddress;
  }


  public TickV3DTO tickIdx(BigInteger tickIdx) {
    
    this.tickIdx = tickIdx;
    return this;
  }

   /**
   * Get tickIdx
   * @return tickIdx
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigInteger getTickIdx() {
    return tickIdx;
  }


  public void setTickIdx(BigInteger tickIdx) {
    this.tickIdx = tickIdx;
  }


  public TickV3DTO pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public TickV3DTO liquidityGross(BigInteger liquidityGross) {
    
    this.liquidityGross = liquidityGross;
    return this;
  }

   /**
   * Get liquidityGross
   * @return liquidityGross
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigInteger getLiquidityGross() {
    return liquidityGross;
  }


  public void setLiquidityGross(BigInteger liquidityGross) {
    this.liquidityGross = liquidityGross;
  }


  public TickV3DTO liquidityNet(BigInteger liquidityNet) {
    
    this.liquidityNet = liquidityNet;
    return this;
  }

   /**
   * Get liquidityNet
   * @return liquidityNet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigInteger getLiquidityNet() {
    return liquidityNet;
  }


  public void setLiquidityNet(BigInteger liquidityNet) {
    this.liquidityNet = liquidityNet;
  }


  public TickV3DTO price0(String price0) {
    
    this.price0 = price0;
    return this;
  }

   /**
   * Get price0
   * @return price0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrice0() {
    return price0;
  }


  public void setPrice0(String price0) {
    this.price0 = price0;
  }


  public TickV3DTO price1(String price1) {
    
    this.price1 = price1;
    return this;
  }

   /**
   * Get price1
   * @return price1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrice1() {
    return price1;
  }


  public void setPrice1(String price1) {
    this.price1 = price1;
  }


  public TickV3DTO volumeToken0(String volumeToken0) {
    
    this.volumeToken0 = volumeToken0;
    return this;
  }

   /**
   * Get volumeToken0
   * @return volumeToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVolumeToken0() {
    return volumeToken0;
  }


  public void setVolumeToken0(String volumeToken0) {
    this.volumeToken0 = volumeToken0;
  }


  public TickV3DTO volumeToken1(String volumeToken1) {
    
    this.volumeToken1 = volumeToken1;
    return this;
  }

   /**
   * Get volumeToken1
   * @return volumeToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVolumeToken1() {
    return volumeToken1;
  }


  public void setVolumeToken1(String volumeToken1) {
    this.volumeToken1 = volumeToken1;
  }


  public TickV3DTO volumeUsd(String volumeUsd) {
    
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


  public TickV3DTO untrackedVolumeUsd(String untrackedVolumeUsd) {
    
    this.untrackedVolumeUsd = untrackedVolumeUsd;
    return this;
  }

   /**
   * Get untrackedVolumeUsd
   * @return untrackedVolumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }


  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }


  public TickV3DTO feesUsd(String feesUsd) {
    
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


  public TickV3DTO collectedFeesToken0(String collectedFeesToken0) {
    
    this.collectedFeesToken0 = collectedFeesToken0;
    return this;
  }

   /**
   * Get collectedFeesToken0
   * @return collectedFeesToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCollectedFeesToken0() {
    return collectedFeesToken0;
  }


  public void setCollectedFeesToken0(String collectedFeesToken0) {
    this.collectedFeesToken0 = collectedFeesToken0;
  }


  public TickV3DTO collectedFeesToken1(String collectedFeesToken1) {
    
    this.collectedFeesToken1 = collectedFeesToken1;
    return this;
  }

   /**
   * Get collectedFeesToken1
   * @return collectedFeesToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCollectedFeesToken1() {
    return collectedFeesToken1;
  }


  public void setCollectedFeesToken1(String collectedFeesToken1) {
    this.collectedFeesToken1 = collectedFeesToken1;
  }


  public TickV3DTO collectedFeesUsd(String collectedFeesUsd) {
    
    this.collectedFeesUsd = collectedFeesUsd;
    return this;
  }

   /**
   * Get collectedFeesUsd
   * @return collectedFeesUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCollectedFeesUsd() {
    return collectedFeesUsd;
  }


  public void setCollectedFeesUsd(String collectedFeesUsd) {
    this.collectedFeesUsd = collectedFeesUsd;
  }


  public TickV3DTO createdAtTimestamp(OffsetDateTime createdAtTimestamp) {
    
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

   /**
   * Get createdAtTimestamp
   * @return createdAtTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }


  public void setCreatedAtTimestamp(OffsetDateTime createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }


  public TickV3DTO liquidityProviderCount(BigInteger liquidityProviderCount) {
    
    this.liquidityProviderCount = liquidityProviderCount;
    return this;
  }

   /**
   * Get liquidityProviderCount
   * @return liquidityProviderCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigInteger getLiquidityProviderCount() {
    return liquidityProviderCount;
  }


  public void setLiquidityProviderCount(BigInteger liquidityProviderCount) {
    this.liquidityProviderCount = liquidityProviderCount;
  }


  public TickV3DTO feeGrowthOutside0x128(BigInteger feeGrowthOutside0x128) {
    
    this.feeGrowthOutside0x128 = feeGrowthOutside0x128;
    return this;
  }

   /**
   * Get feeGrowthOutside0x128
   * @return feeGrowthOutside0x128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigInteger getFeeGrowthOutside0x128() {
    return feeGrowthOutside0x128;
  }


  public void setFeeGrowthOutside0x128(BigInteger feeGrowthOutside0x128) {
    this.feeGrowthOutside0x128 = feeGrowthOutside0x128;
  }


  public TickV3DTO feeGrowthOutside1x128(BigInteger feeGrowthOutside1x128) {
    
    this.feeGrowthOutside1x128 = feeGrowthOutside1x128;
    return this;
  }

   /**
   * Get feeGrowthOutside1x128
   * @return feeGrowthOutside1x128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigInteger getFeeGrowthOutside1x128() {
    return feeGrowthOutside1x128;
  }


  public void setFeeGrowthOutside1x128(BigInteger feeGrowthOutside1x128) {
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
    TickV3DTO tickV3DTO = (TickV3DTO) o;
    return Objects.equals(this.entryTime, tickV3DTO.entryTime) &&
        Objects.equals(this.recvTime, tickV3DTO.recvTime) &&
        Objects.equals(this.blockNumber, tickV3DTO.blockNumber) &&
        Objects.equals(this.vid, tickV3DTO.vid) &&
        Objects.equals(this.id, tickV3DTO.id) &&
        Objects.equals(this.poolAddress, tickV3DTO.poolAddress) &&
        Objects.equals(this.tickIdx, tickV3DTO.tickIdx) &&
        Objects.equals(this.pool, tickV3DTO.pool) &&
        Objects.equals(this.liquidityGross, tickV3DTO.liquidityGross) &&
        Objects.equals(this.liquidityNet, tickV3DTO.liquidityNet) &&
        Objects.equals(this.price0, tickV3DTO.price0) &&
        Objects.equals(this.price1, tickV3DTO.price1) &&
        Objects.equals(this.volumeToken0, tickV3DTO.volumeToken0) &&
        Objects.equals(this.volumeToken1, tickV3DTO.volumeToken1) &&
        Objects.equals(this.volumeUsd, tickV3DTO.volumeUsd) &&
        Objects.equals(this.untrackedVolumeUsd, tickV3DTO.untrackedVolumeUsd) &&
        Objects.equals(this.feesUsd, tickV3DTO.feesUsd) &&
        Objects.equals(this.collectedFeesToken0, tickV3DTO.collectedFeesToken0) &&
        Objects.equals(this.collectedFeesToken1, tickV3DTO.collectedFeesToken1) &&
        Objects.equals(this.collectedFeesUsd, tickV3DTO.collectedFeesUsd) &&
        Objects.equals(this.createdAtTimestamp, tickV3DTO.createdAtTimestamp) &&
        Objects.equals(this.liquidityProviderCount, tickV3DTO.liquidityProviderCount) &&
        Objects.equals(this.feeGrowthOutside0x128, tickV3DTO.feeGrowthOutside0x128) &&
        Objects.equals(this.feeGrowthOutside1x128, tickV3DTO.feeGrowthOutside1x128);
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
    sb.append("class TickV3DTO {\n");
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
  * @throws IOException if the JSON Object is invalid with respect to TickV3DTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TickV3DTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TickV3DTO is not found in the empty JSON string", TickV3DTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TickV3DTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TickV3DTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
        BigInteger.validateJsonObject(jsonObj.getAsJsonObject("tick_idx"));
      }
      if ((jsonObj.get("pool") != null && !jsonObj.get("pool").isJsonNull()) && !jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      // validate the optional field `liquidity_gross`
      if (jsonObj.get("liquidity_gross") != null && !jsonObj.get("liquidity_gross").isJsonNull()) {
        BigInteger.validateJsonObject(jsonObj.getAsJsonObject("liquidity_gross"));
      }
      // validate the optional field `liquidity_net`
      if (jsonObj.get("liquidity_net") != null && !jsonObj.get("liquidity_net").isJsonNull()) {
        BigInteger.validateJsonObject(jsonObj.getAsJsonObject("liquidity_net"));
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
        BigInteger.validateJsonObject(jsonObj.getAsJsonObject("liquidity_provider_count"));
      }
      // validate the optional field `fee_growth_outside_0x128`
      if (jsonObj.get("fee_growth_outside_0x128") != null && !jsonObj.get("fee_growth_outside_0x128").isJsonNull()) {
        BigInteger.validateJsonObject(jsonObj.getAsJsonObject("fee_growth_outside_0x128"));
      }
      // validate the optional field `fee_growth_outside_1x128`
      if (jsonObj.get("fee_growth_outside_1x128") != null && !jsonObj.get("fee_growth_outside_1x128").isJsonNull()) {
        BigInteger.validateJsonObject(jsonObj.getAsJsonObject("fee_growth_outside_1x128"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TickV3DTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TickV3DTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TickV3DTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TickV3DTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TickV3DTO>() {
           @Override
           public void write(JsonWriter out, TickV3DTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TickV3DTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TickV3DTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TickV3DTO
  * @throws IOException if the JSON string is invalid with respect to TickV3DTO
  */
  public static TickV3DTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TickV3DTO.class);
  }

 /**
  * Convert an instance of TickV3DTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

