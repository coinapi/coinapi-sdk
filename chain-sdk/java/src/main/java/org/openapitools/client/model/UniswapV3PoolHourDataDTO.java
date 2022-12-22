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
 * Hourly stats tracker for pool.
 */
@ApiModel(description = "Hourly stats tracker for pool.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-22T14:57:39.885630Z[Etc/UTC]")
public class UniswapV3PoolHourDataDTO {
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

  public static final String SERIALIZED_NAME_PERIOD_START_UNIX = "period_start_unix";
  @SerializedName(SERIALIZED_NAME_PERIOD_START_UNIX)
  private Integer periodStartUnix;

  public static final String SERIALIZED_NAME_POOL = "pool";
  @SerializedName(SERIALIZED_NAME_POOL)
  private String pool;

  public static final String SERIALIZED_NAME_LIQUIDITY = "liquidity";
  @SerializedName(SERIALIZED_NAME_LIQUIDITY)
  private String liquidity;

  public static final String SERIALIZED_NAME_SQRT_PRICE = "sqrt_price";
  @SerializedName(SERIALIZED_NAME_SQRT_PRICE)
  private String sqrtPrice;

  public static final String SERIALIZED_NAME_TOKEN0_PRICE = "token_0_price";
  @SerializedName(SERIALIZED_NAME_TOKEN0_PRICE)
  private String token0Price;

  public static final String SERIALIZED_NAME_TOKEN1_PRICE = "token_1_price";
  @SerializedName(SERIALIZED_NAME_TOKEN1_PRICE)
  private String token1Price;

  public static final String SERIALIZED_NAME_TICK = "tick";
  @SerializedName(SERIALIZED_NAME_TICK)
  private String tick;

  public static final String SERIALIZED_NAME_FEE_GROWTH_GLOBAL0X128 = "fee_growth_global_0x128";
  @SerializedName(SERIALIZED_NAME_FEE_GROWTH_GLOBAL0X128)
  private String feeGrowthGlobal0x128;

  public static final String SERIALIZED_NAME_FEE_GROWTH_GLOBAL1X128 = "fee_growth_global_1x128";
  @SerializedName(SERIALIZED_NAME_FEE_GROWTH_GLOBAL1X128)
  private String feeGrowthGlobal1x128;

  public static final String SERIALIZED_NAME_TVL_USD = "tvl_usd";
  @SerializedName(SERIALIZED_NAME_TVL_USD)
  private String tvlUsd;

  public static final String SERIALIZED_NAME_VOLUME_TOKEN0 = "volume_token_0";
  @SerializedName(SERIALIZED_NAME_VOLUME_TOKEN0)
  private String volumeToken0;

  public static final String SERIALIZED_NAME_VOLUME_TOKEN1 = "volume_token_1";
  @SerializedName(SERIALIZED_NAME_VOLUME_TOKEN1)
  private String volumeToken1;

  public static final String SERIALIZED_NAME_VOLUME_USD = "volume_usd";
  @SerializedName(SERIALIZED_NAME_VOLUME_USD)
  private String volumeUsd;

  public static final String SERIALIZED_NAME_FEES_USD = "fees_usd";
  @SerializedName(SERIALIZED_NAME_FEES_USD)
  private String feesUsd;

  public static final String SERIALIZED_NAME_TX_COUNT = "tx_count";
  @SerializedName(SERIALIZED_NAME_TX_COUNT)
  private String txCount;

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

  public static final String SERIALIZED_NAME_VID = "vid";
  @SerializedName(SERIALIZED_NAME_VID)
  private Long vid;

  public UniswapV3PoolHourDataDTO() {
  }

  public UniswapV3PoolHourDataDTO entryTime(OffsetDateTime entryTime) {
    
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


  public UniswapV3PoolHourDataDTO recvTime(OffsetDateTime recvTime) {
    
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


  public UniswapV3PoolHourDataDTO blockNumber(Long blockNumber) {
    
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


  public UniswapV3PoolHourDataDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier, format: &lt;pool address&gt;-&lt;day id&gt;
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier, format: <pool address>-<day id>")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UniswapV3PoolHourDataDTO periodStartUnix(Integer periodStartUnix) {
    
    this.periodStartUnix = periodStartUnix;
    return this;
  }

   /**
   * Unix timestamp for start of hour.
   * @return periodStartUnix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp for start of hour.")

  public Integer getPeriodStartUnix() {
    return periodStartUnix;
  }


  public void setPeriodStartUnix(Integer periodStartUnix) {
    this.periodStartUnix = periodStartUnix;
  }


  public UniswapV3PoolHourDataDTO pool(String pool) {
    
    this.pool = pool;
    return this;
  }

   /**
   * Pointer to pool.
   * @return pool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pointer to pool.")

  public String getPool() {
    return pool;
  }


  public void setPool(String pool) {
    this.pool = pool;
  }


  public UniswapV3PoolHourDataDTO liquidity(String liquidity) {
    
    this.liquidity = liquidity;
    return this;
  }

   /**
   * In range liquidity at end of period.
   * @return liquidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In range liquidity at end of period.")

  public String getLiquidity() {
    return liquidity;
  }


  public void setLiquidity(String liquidity) {
    this.liquidity = liquidity;
  }


  public UniswapV3PoolHourDataDTO sqrtPrice(String sqrtPrice) {
    
    this.sqrtPrice = sqrtPrice;
    return this;
  }

   /**
   * Current price tracker at end of period.
   * @return sqrtPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current price tracker at end of period.")

  public String getSqrtPrice() {
    return sqrtPrice;
  }


  public void setSqrtPrice(String sqrtPrice) {
    this.sqrtPrice = sqrtPrice;
  }


  public UniswapV3PoolHourDataDTO token0Price(String token0Price) {
    
    this.token0Price = token0Price;
    return this;
  }

   /**
   * Price of token0 - derived from sqrtPrice.
   * @return token0Price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price of token0 - derived from sqrtPrice.")

  public String getToken0Price() {
    return token0Price;
  }


  public void setToken0Price(String token0Price) {
    this.token0Price = token0Price;
  }


  public UniswapV3PoolHourDataDTO token1Price(String token1Price) {
    
    this.token1Price = token1Price;
    return this;
  }

   /**
   * Price of token1 - derived from sqrtPrice.
   * @return token1Price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price of token1 - derived from sqrtPrice.")

  public String getToken1Price() {
    return token1Price;
  }


  public void setToken1Price(String token1Price) {
    this.token1Price = token1Price;
  }


  public UniswapV3PoolHourDataDTO tick(String tick) {
    
    this.tick = tick;
    return this;
  }

   /**
   * Current tick at end of period.
   * @return tick
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current tick at end of period.")

  public String getTick() {
    return tick;
  }


  public void setTick(String tick) {
    this.tick = tick;
  }


  public UniswapV3PoolHourDataDTO feeGrowthGlobal0x128(String feeGrowthGlobal0x128) {
    
    this.feeGrowthGlobal0x128 = feeGrowthGlobal0x128;
    return this;
  }

   /**
   * Tracker for global fee growth.
   * @return feeGrowthGlobal0x128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tracker for global fee growth.")

  public String getFeeGrowthGlobal0x128() {
    return feeGrowthGlobal0x128;
  }


  public void setFeeGrowthGlobal0x128(String feeGrowthGlobal0x128) {
    this.feeGrowthGlobal0x128 = feeGrowthGlobal0x128;
  }


  public UniswapV3PoolHourDataDTO feeGrowthGlobal1x128(String feeGrowthGlobal1x128) {
    
    this.feeGrowthGlobal1x128 = feeGrowthGlobal1x128;
    return this;
  }

   /**
   * Tracker for global fee growth.
   * @return feeGrowthGlobal1x128
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tracker for global fee growth.")

  public String getFeeGrowthGlobal1x128() {
    return feeGrowthGlobal1x128;
  }


  public void setFeeGrowthGlobal1x128(String feeGrowthGlobal1x128) {
    this.feeGrowthGlobal1x128 = feeGrowthGlobal1x128;
  }


  public UniswapV3PoolHourDataDTO tvlUsd(String tvlUsd) {
    
    this.tvlUsd = tvlUsd;
    return this;
  }

   /**
   * Total value locked derived in USD at end of period.
   * @return tvlUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total value locked derived in USD at end of period.")

  public String getTvlUsd() {
    return tvlUsd;
  }


  public void setTvlUsd(String tvlUsd) {
    this.tvlUsd = tvlUsd;
  }


  public UniswapV3PoolHourDataDTO volumeToken0(String volumeToken0) {
    
    this.volumeToken0 = volumeToken0;
    return this;
  }

   /**
   * Volume in token0.
   * @return volumeToken0
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume in token0.")

  public String getVolumeToken0() {
    return volumeToken0;
  }


  public void setVolumeToken0(String volumeToken0) {
    this.volumeToken0 = volumeToken0;
  }


  public UniswapV3PoolHourDataDTO volumeToken1(String volumeToken1) {
    
    this.volumeToken1 = volumeToken1;
    return this;
  }

   /**
   * Volume in token1.
   * @return volumeToken1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume in token1.")

  public String getVolumeToken1() {
    return volumeToken1;
  }


  public void setVolumeToken1(String volumeToken1) {
    this.volumeToken1 = volumeToken1;
  }


  public UniswapV3PoolHourDataDTO volumeUsd(String volumeUsd) {
    
    this.volumeUsd = volumeUsd;
    return this;
  }

   /**
   * Volume in USD.
   * @return volumeUsd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume in USD.")

  public String getVolumeUsd() {
    return volumeUsd;
  }


  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }


  public UniswapV3PoolHourDataDTO feesUsd(String feesUsd) {
    
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


  public UniswapV3PoolHourDataDTO txCount(String txCount) {
    
    this.txCount = txCount;
    return this;
  }

   /**
   * Number of transactions during period.
   * @return txCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of transactions during period.")

  public String getTxCount() {
    return txCount;
  }


  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }


  public UniswapV3PoolHourDataDTO open(String open) {
    
    this.open = open;
    return this;
  }

   /**
   * Opening price of token0.
   * @return open
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Opening price of token0.")

  public String getOpen() {
    return open;
  }


  public void setOpen(String open) {
    this.open = open;
  }


  public UniswapV3PoolHourDataDTO high(String high) {
    
    this.high = high;
    return this;
  }

   /**
   * High price of token0.
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "High price of token0.")

  public String getHigh() {
    return high;
  }


  public void setHigh(String high) {
    this.high = high;
  }


  public UniswapV3PoolHourDataDTO low(String low) {
    
    this.low = low;
    return this;
  }

   /**
   * Low price of token0.
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Low price of token0.")

  public String getLow() {
    return low;
  }


  public void setLow(String low) {
    this.low = low;
  }


  public UniswapV3PoolHourDataDTO close(String close) {
    
    this.close = close;
    return this;
  }

   /**
   * Close price of token0.
   * @return close
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Close price of token0.")

  public String getClose() {
    return close;
  }


  public void setClose(String close) {
    this.close = close;
  }


  public UniswapV3PoolHourDataDTO vid(Long vid) {
    
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
    UniswapV3PoolHourDataDTO uniswapV3PoolHourDataDTO = (UniswapV3PoolHourDataDTO) o;
    return Objects.equals(this.entryTime, uniswapV3PoolHourDataDTO.entryTime) &&
        Objects.equals(this.recvTime, uniswapV3PoolHourDataDTO.recvTime) &&
        Objects.equals(this.blockNumber, uniswapV3PoolHourDataDTO.blockNumber) &&
        Objects.equals(this.id, uniswapV3PoolHourDataDTO.id) &&
        Objects.equals(this.periodStartUnix, uniswapV3PoolHourDataDTO.periodStartUnix) &&
        Objects.equals(this.pool, uniswapV3PoolHourDataDTO.pool) &&
        Objects.equals(this.liquidity, uniswapV3PoolHourDataDTO.liquidity) &&
        Objects.equals(this.sqrtPrice, uniswapV3PoolHourDataDTO.sqrtPrice) &&
        Objects.equals(this.token0Price, uniswapV3PoolHourDataDTO.token0Price) &&
        Objects.equals(this.token1Price, uniswapV3PoolHourDataDTO.token1Price) &&
        Objects.equals(this.tick, uniswapV3PoolHourDataDTO.tick) &&
        Objects.equals(this.feeGrowthGlobal0x128, uniswapV3PoolHourDataDTO.feeGrowthGlobal0x128) &&
        Objects.equals(this.feeGrowthGlobal1x128, uniswapV3PoolHourDataDTO.feeGrowthGlobal1x128) &&
        Objects.equals(this.tvlUsd, uniswapV3PoolHourDataDTO.tvlUsd) &&
        Objects.equals(this.volumeToken0, uniswapV3PoolHourDataDTO.volumeToken0) &&
        Objects.equals(this.volumeToken1, uniswapV3PoolHourDataDTO.volumeToken1) &&
        Objects.equals(this.volumeUsd, uniswapV3PoolHourDataDTO.volumeUsd) &&
        Objects.equals(this.feesUsd, uniswapV3PoolHourDataDTO.feesUsd) &&
        Objects.equals(this.txCount, uniswapV3PoolHourDataDTO.txCount) &&
        Objects.equals(this.open, uniswapV3PoolHourDataDTO.open) &&
        Objects.equals(this.high, uniswapV3PoolHourDataDTO.high) &&
        Objects.equals(this.low, uniswapV3PoolHourDataDTO.low) &&
        Objects.equals(this.close, uniswapV3PoolHourDataDTO.close) &&
        Objects.equals(this.vid, uniswapV3PoolHourDataDTO.vid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryTime, recvTime, blockNumber, id, periodStartUnix, pool, liquidity, sqrtPrice, token0Price, token1Price, tick, feeGrowthGlobal0x128, feeGrowthGlobal1x128, tvlUsd, volumeToken0, volumeToken1, volumeUsd, feesUsd, txCount, open, high, low, close, vid);
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
    sb.append("class UniswapV3PoolHourDataDTO {\n");
    sb.append("    entryTime: ").append(toIndentedString(entryTime)).append("\n");
    sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    periodStartUnix: ").append(toIndentedString(periodStartUnix)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    liquidity: ").append(toIndentedString(liquidity)).append("\n");
    sb.append("    sqrtPrice: ").append(toIndentedString(sqrtPrice)).append("\n");
    sb.append("    token0Price: ").append(toIndentedString(token0Price)).append("\n");
    sb.append("    token1Price: ").append(toIndentedString(token1Price)).append("\n");
    sb.append("    tick: ").append(toIndentedString(tick)).append("\n");
    sb.append("    feeGrowthGlobal0x128: ").append(toIndentedString(feeGrowthGlobal0x128)).append("\n");
    sb.append("    feeGrowthGlobal1x128: ").append(toIndentedString(feeGrowthGlobal1x128)).append("\n");
    sb.append("    tvlUsd: ").append(toIndentedString(tvlUsd)).append("\n");
    sb.append("    volumeToken0: ").append(toIndentedString(volumeToken0)).append("\n");
    sb.append("    volumeToken1: ").append(toIndentedString(volumeToken1)).append("\n");
    sb.append("    volumeUsd: ").append(toIndentedString(volumeUsd)).append("\n");
    sb.append("    feesUsd: ").append(toIndentedString(feesUsd)).append("\n");
    sb.append("    txCount: ").append(toIndentedString(txCount)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
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
    openapiFields.add("period_start_unix");
    openapiFields.add("pool");
    openapiFields.add("liquidity");
    openapiFields.add("sqrt_price");
    openapiFields.add("token_0_price");
    openapiFields.add("token_1_price");
    openapiFields.add("tick");
    openapiFields.add("fee_growth_global_0x128");
    openapiFields.add("fee_growth_global_1x128");
    openapiFields.add("tvl_usd");
    openapiFields.add("volume_token_0");
    openapiFields.add("volume_token_1");
    openapiFields.add("volume_usd");
    openapiFields.add("fees_usd");
    openapiFields.add("tx_count");
    openapiFields.add("open");
    openapiFields.add("high");
    openapiFields.add("low");
    openapiFields.add("close");
    openapiFields.add("vid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniswapV3PoolHourDataDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniswapV3PoolHourDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniswapV3PoolHourDataDTO is not found in the empty JSON string", UniswapV3PoolHourDataDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UniswapV3PoolHourDataDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UniswapV3PoolHourDataDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("pool") != null && !jsonObj.get("pool").isJsonNull()) && !jsonObj.get("pool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool").toString()));
      }
      if ((jsonObj.get("liquidity") != null && !jsonObj.get("liquidity").isJsonNull()) && !jsonObj.get("liquidity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `liquidity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("liquidity").toString()));
      }
      if ((jsonObj.get("sqrt_price") != null && !jsonObj.get("sqrt_price").isJsonNull()) && !jsonObj.get("sqrt_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sqrt_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sqrt_price").toString()));
      }
      if ((jsonObj.get("token_0_price") != null && !jsonObj.get("token_0_price").isJsonNull()) && !jsonObj.get("token_0_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_0_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_0_price").toString()));
      }
      if ((jsonObj.get("token_1_price") != null && !jsonObj.get("token_1_price").isJsonNull()) && !jsonObj.get("token_1_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_1_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_1_price").toString()));
      }
      if ((jsonObj.get("tick") != null && !jsonObj.get("tick").isJsonNull()) && !jsonObj.get("tick").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tick` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tick").toString()));
      }
      if ((jsonObj.get("fee_growth_global_0x128") != null && !jsonObj.get("fee_growth_global_0x128").isJsonNull()) && !jsonObj.get("fee_growth_global_0x128").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_growth_global_0x128` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_growth_global_0x128").toString()));
      }
      if ((jsonObj.get("fee_growth_global_1x128") != null && !jsonObj.get("fee_growth_global_1x128").isJsonNull()) && !jsonObj.get("fee_growth_global_1x128").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_growth_global_1x128` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_growth_global_1x128").toString()));
      }
      if ((jsonObj.get("tvl_usd") != null && !jsonObj.get("tvl_usd").isJsonNull()) && !jsonObj.get("tvl_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tvl_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tvl_usd").toString()));
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
      if ((jsonObj.get("fees_usd") != null && !jsonObj.get("fees_usd").isJsonNull()) && !jsonObj.get("fees_usd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fees_usd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fees_usd").toString()));
      }
      if ((jsonObj.get("tx_count") != null && !jsonObj.get("tx_count").isJsonNull()) && !jsonObj.get("tx_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_count").toString()));
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
       if (!UniswapV3PoolHourDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniswapV3PoolHourDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniswapV3PoolHourDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniswapV3PoolHourDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<UniswapV3PoolHourDataDTO>() {
           @Override
           public void write(JsonWriter out, UniswapV3PoolHourDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UniswapV3PoolHourDataDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UniswapV3PoolHourDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniswapV3PoolHourDataDTO
  * @throws IOException if the JSON string is invalid with respect to UniswapV3PoolHourDataDTO
  */
  public static UniswapV3PoolHourDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniswapV3PoolHourDataDTO.class);
  }

 /**
  * Convert an instance of UniswapV3PoolHourDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

