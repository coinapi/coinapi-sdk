/**
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

import java.util.Date;
import org.openapitools.client.model.NumericsBigInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Ticks are the boundaries between discrete areas in price space.
 **/
@ApiModel(description = "Ticks are the boundaries between discrete areas in price space.")
public class UniswapV3TickDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("vid")
  private Long vid = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("pool_address")
  private String poolAddress = null;
  @SerializedName("tick_idx")
  private NumericsBigInteger tickIdx = null;
  @SerializedName("pool")
  private String pool = null;
  @SerializedName("liquidity_gross")
  private NumericsBigInteger liquidityGross = null;
  @SerializedName("liquidity_net")
  private NumericsBigInteger liquidityNet = null;
  @SerializedName("price_0")
  private String price0 = null;
  @SerializedName("price_1")
  private String price1 = null;
  @SerializedName("volume_token_0")
  private String volumeToken0 = null;
  @SerializedName("volume_token_1")
  private String volumeToken1 = null;
  @SerializedName("volume_usd")
  private String volumeUsd = null;
  @SerializedName("untracked_volume_usd")
  private String untrackedVolumeUsd = null;
  @SerializedName("fees_usd")
  private String feesUsd = null;
  @SerializedName("collected_fees_token_0")
  private String collectedFeesToken0 = null;
  @SerializedName("collected_fees_token_1")
  private String collectedFeesToken1 = null;
  @SerializedName("collected_fees_usd")
  private String collectedFeesUsd = null;
  @SerializedName("created_at_timestamp")
  private Date createdAtTimestamp = null;
  @SerializedName("liquidity_provider_count")
  private NumericsBigInteger liquidityProviderCount = null;
  @SerializedName("fee_growth_outside_0x128")
  private NumericsBigInteger feeGrowthOutside0x128 = null;
  @SerializedName("fee_growth_outside_1x128")
  private NumericsBigInteger feeGrowthOutside1x128 = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEntryTime() {
    return entryTime;
  }
  public void setEntryTime(Date entryTime) {
    this.entryTime = entryTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getRecvTime() {
    return recvTime;
  }
  public void setRecvTime(Date recvTime) {
    this.recvTime = recvTime;
  }

  /**
   * Number of block in which entity was recorded.
   **/
  @ApiModelProperty(value = "Number of block in which entity was recorded.")
  public Long getBlockNumber() {
    return blockNumber;
  }
  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Long getVid() {
    return vid;
  }
  public void setVid(Long vid) {
    this.vid = vid;
  }

  /**
   * Identifier, format: (pool address)#(tick index)
   **/
  @ApiModelProperty(value = "Identifier, format: (pool address)#(tick index)")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Pool address.
   **/
  @ApiModelProperty(value = "Pool address.")
  public String getPoolAddress() {
    return poolAddress;
  }
  public void setPoolAddress(String poolAddress) {
    this.poolAddress = poolAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getTickIdx() {
    return tickIdx;
  }
  public void setTickIdx(NumericsBigInteger tickIdx) {
    this.tickIdx = tickIdx;
  }

  /**
   * Pool address.
   **/
  @ApiModelProperty(value = "Pool address.")
  public String getPool() {
    return pool;
  }
  public void setPool(String pool) {
    this.pool = pool;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getLiquidityGross() {
    return liquidityGross;
  }
  public void setLiquidityGross(NumericsBigInteger liquidityGross) {
    this.liquidityGross = liquidityGross;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getLiquidityNet() {
    return liquidityNet;
  }
  public void setLiquidityNet(NumericsBigInteger liquidityNet) {
    this.liquidityNet = liquidityNet;
  }

  /**
   * Calculated price of token0 of tick within this pool - constant.
   **/
  @ApiModelProperty(value = "Calculated price of token0 of tick within this pool - constant.")
  public String getPrice0() {
    return price0;
  }
  public void setPrice0(String price0) {
    this.price0 = price0;
  }

  /**
   * Calculated price of token1 of tick within this pool - constant.
   **/
  @ApiModelProperty(value = "Calculated price of token1 of tick within this pool - constant.")
  public String getPrice1() {
    return price1;
  }
  public void setPrice1(String price1) {
    this.price1 = price1;
  }

  /**
   * Lifetime volume of token0 with this tick in range.
   **/
  @ApiModelProperty(value = "Lifetime volume of token0 with this tick in range.")
  public String getVolumeToken0() {
    return volumeToken0;
  }
  public void setVolumeToken0(String volumeToken0) {
    this.volumeToken0 = volumeToken0;
  }

  /**
   * Lifetime volume of token1 with this tick in range.
   **/
  @ApiModelProperty(value = "Lifetime volume of token1 with this tick in range.")
  public String getVolumeToken1() {
    return volumeToken1;
  }
  public void setVolumeToken1(String volumeToken1) {
    this.volumeToken1 = volumeToken1;
  }

  /**
   * Lifetime volume in derived USD with this tick in range.
   **/
  @ApiModelProperty(value = "Lifetime volume in derived USD with this tick in range.")
  public String getVolumeUsd() {
    return volumeUsd;
  }
  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  /**
   * Lifetime volume in untracked USD with this tick in range.
   **/
  @ApiModelProperty(value = "Lifetime volume in untracked USD with this tick in range.")
  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }
  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }

  /**
   * Fees in USD.
   **/
  @ApiModelProperty(value = "Fees in USD.")
  public String getFeesUsd() {
    return feesUsd;
  }
  public void setFeesUsd(String feesUsd) {
    this.feesUsd = feesUsd;
  }

  /**
   * All time collected fees in token0.
   **/
  @ApiModelProperty(value = "All time collected fees in token0.")
  public String getCollectedFeesToken0() {
    return collectedFeesToken0;
  }
  public void setCollectedFeesToken0(String collectedFeesToken0) {
    this.collectedFeesToken0 = collectedFeesToken0;
  }

  /**
   * All time collected fees in token1.
   **/
  @ApiModelProperty(value = "All time collected fees in token1.")
  public String getCollectedFeesToken1() {
    return collectedFeesToken1;
  }
  public void setCollectedFeesToken1(String collectedFeesToken1) {
    this.collectedFeesToken1 = collectedFeesToken1;
  }

  /**
   * All time collected fees in USD.
   **/
  @ApiModelProperty(value = "All time collected fees in USD.")
  public String getCollectedFeesUsd() {
    return collectedFeesUsd;
  }
  public void setCollectedFeesUsd(String collectedFeesUsd) {
    this.collectedFeesUsd = collectedFeesUsd;
  }

  /**
   * Created time.
   **/
  @ApiModelProperty(value = "Created time.")
  public Date getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }
  public void setCreatedAtTimestamp(Date createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getLiquidityProviderCount() {
    return liquidityProviderCount;
  }
  public void setLiquidityProviderCount(NumericsBigInteger liquidityProviderCount) {
    this.liquidityProviderCount = liquidityProviderCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getFeeGrowthOutside0x128() {
    return feeGrowthOutside0x128;
  }
  public void setFeeGrowthOutside0x128(NumericsBigInteger feeGrowthOutside0x128) {
    this.feeGrowthOutside0x128 = feeGrowthOutside0x128;
  }

  /**
   **/
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
    return (this.entryTime == null ? uniswapV3TickDTO.entryTime == null : this.entryTime.equals(uniswapV3TickDTO.entryTime)) &&
        (this.recvTime == null ? uniswapV3TickDTO.recvTime == null : this.recvTime.equals(uniswapV3TickDTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV3TickDTO.blockNumber == null : this.blockNumber.equals(uniswapV3TickDTO.blockNumber)) &&
        (this.vid == null ? uniswapV3TickDTO.vid == null : this.vid.equals(uniswapV3TickDTO.vid)) &&
        (this.id == null ? uniswapV3TickDTO.id == null : this.id.equals(uniswapV3TickDTO.id)) &&
        (this.poolAddress == null ? uniswapV3TickDTO.poolAddress == null : this.poolAddress.equals(uniswapV3TickDTO.poolAddress)) &&
        (this.tickIdx == null ? uniswapV3TickDTO.tickIdx == null : this.tickIdx.equals(uniswapV3TickDTO.tickIdx)) &&
        (this.pool == null ? uniswapV3TickDTO.pool == null : this.pool.equals(uniswapV3TickDTO.pool)) &&
        (this.liquidityGross == null ? uniswapV3TickDTO.liquidityGross == null : this.liquidityGross.equals(uniswapV3TickDTO.liquidityGross)) &&
        (this.liquidityNet == null ? uniswapV3TickDTO.liquidityNet == null : this.liquidityNet.equals(uniswapV3TickDTO.liquidityNet)) &&
        (this.price0 == null ? uniswapV3TickDTO.price0 == null : this.price0.equals(uniswapV3TickDTO.price0)) &&
        (this.price1 == null ? uniswapV3TickDTO.price1 == null : this.price1.equals(uniswapV3TickDTO.price1)) &&
        (this.volumeToken0 == null ? uniswapV3TickDTO.volumeToken0 == null : this.volumeToken0.equals(uniswapV3TickDTO.volumeToken0)) &&
        (this.volumeToken1 == null ? uniswapV3TickDTO.volumeToken1 == null : this.volumeToken1.equals(uniswapV3TickDTO.volumeToken1)) &&
        (this.volumeUsd == null ? uniswapV3TickDTO.volumeUsd == null : this.volumeUsd.equals(uniswapV3TickDTO.volumeUsd)) &&
        (this.untrackedVolumeUsd == null ? uniswapV3TickDTO.untrackedVolumeUsd == null : this.untrackedVolumeUsd.equals(uniswapV3TickDTO.untrackedVolumeUsd)) &&
        (this.feesUsd == null ? uniswapV3TickDTO.feesUsd == null : this.feesUsd.equals(uniswapV3TickDTO.feesUsd)) &&
        (this.collectedFeesToken0 == null ? uniswapV3TickDTO.collectedFeesToken0 == null : this.collectedFeesToken0.equals(uniswapV3TickDTO.collectedFeesToken0)) &&
        (this.collectedFeesToken1 == null ? uniswapV3TickDTO.collectedFeesToken1 == null : this.collectedFeesToken1.equals(uniswapV3TickDTO.collectedFeesToken1)) &&
        (this.collectedFeesUsd == null ? uniswapV3TickDTO.collectedFeesUsd == null : this.collectedFeesUsd.equals(uniswapV3TickDTO.collectedFeesUsd)) &&
        (this.createdAtTimestamp == null ? uniswapV3TickDTO.createdAtTimestamp == null : this.createdAtTimestamp.equals(uniswapV3TickDTO.createdAtTimestamp)) &&
        (this.liquidityProviderCount == null ? uniswapV3TickDTO.liquidityProviderCount == null : this.liquidityProviderCount.equals(uniswapV3TickDTO.liquidityProviderCount)) &&
        (this.feeGrowthOutside0x128 == null ? uniswapV3TickDTO.feeGrowthOutside0x128 == null : this.feeGrowthOutside0x128.equals(uniswapV3TickDTO.feeGrowthOutside0x128)) &&
        (this.feeGrowthOutside1x128 == null ? uniswapV3TickDTO.feeGrowthOutside1x128 == null : this.feeGrowthOutside1x128.equals(uniswapV3TickDTO.feeGrowthOutside1x128));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.poolAddress == null ? 0: this.poolAddress.hashCode());
    result = 31 * result + (this.tickIdx == null ? 0: this.tickIdx.hashCode());
    result = 31 * result + (this.pool == null ? 0: this.pool.hashCode());
    result = 31 * result + (this.liquidityGross == null ? 0: this.liquidityGross.hashCode());
    result = 31 * result + (this.liquidityNet == null ? 0: this.liquidityNet.hashCode());
    result = 31 * result + (this.price0 == null ? 0: this.price0.hashCode());
    result = 31 * result + (this.price1 == null ? 0: this.price1.hashCode());
    result = 31 * result + (this.volumeToken0 == null ? 0: this.volumeToken0.hashCode());
    result = 31 * result + (this.volumeToken1 == null ? 0: this.volumeToken1.hashCode());
    result = 31 * result + (this.volumeUsd == null ? 0: this.volumeUsd.hashCode());
    result = 31 * result + (this.untrackedVolumeUsd == null ? 0: this.untrackedVolumeUsd.hashCode());
    result = 31 * result + (this.feesUsd == null ? 0: this.feesUsd.hashCode());
    result = 31 * result + (this.collectedFeesToken0 == null ? 0: this.collectedFeesToken0.hashCode());
    result = 31 * result + (this.collectedFeesToken1 == null ? 0: this.collectedFeesToken1.hashCode());
    result = 31 * result + (this.collectedFeesUsd == null ? 0: this.collectedFeesUsd.hashCode());
    result = 31 * result + (this.createdAtTimestamp == null ? 0: this.createdAtTimestamp.hashCode());
    result = 31 * result + (this.liquidityProviderCount == null ? 0: this.liquidityProviderCount.hashCode());
    result = 31 * result + (this.feeGrowthOutside0x128 == null ? 0: this.feeGrowthOutside0x128.hashCode());
    result = 31 * result + (this.feeGrowthOutside1x128 == null ? 0: this.feeGrowthOutside1x128.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV3TickDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  poolAddress: ").append(poolAddress).append("\n");
    sb.append("  tickIdx: ").append(tickIdx).append("\n");
    sb.append("  pool: ").append(pool).append("\n");
    sb.append("  liquidityGross: ").append(liquidityGross).append("\n");
    sb.append("  liquidityNet: ").append(liquidityNet).append("\n");
    sb.append("  price0: ").append(price0).append("\n");
    sb.append("  price1: ").append(price1).append("\n");
    sb.append("  volumeToken0: ").append(volumeToken0).append("\n");
    sb.append("  volumeToken1: ").append(volumeToken1).append("\n");
    sb.append("  volumeUsd: ").append(volumeUsd).append("\n");
    sb.append("  untrackedVolumeUsd: ").append(untrackedVolumeUsd).append("\n");
    sb.append("  feesUsd: ").append(feesUsd).append("\n");
    sb.append("  collectedFeesToken0: ").append(collectedFeesToken0).append("\n");
    sb.append("  collectedFeesToken1: ").append(collectedFeesToken1).append("\n");
    sb.append("  collectedFeesUsd: ").append(collectedFeesUsd).append("\n");
    sb.append("  createdAtTimestamp: ").append(createdAtTimestamp).append("\n");
    sb.append("  liquidityProviderCount: ").append(liquidityProviderCount).append("\n");
    sb.append("  feeGrowthOutside0x128: ").append(feeGrowthOutside0x128).append("\n");
    sb.append("  feeGrowthOutside1x128: ").append(feeGrowthOutside1x128).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
