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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Tracks data across all pairs aggregated into a daily bucket.
 **/
@ApiModel(description = "Tracks data across all pairs aggregated into a daily bucket.")
public class UniswapV2UniswapDayDataDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("date")
  private Integer date = null;
  @SerializedName("daily_volume_eth")
  private String dailyVolumeEth = null;
  @SerializedName("daily_volume_usd")
  private String dailyVolumeUsd = null;
  @SerializedName("daily_volume_untracked")
  private String dailyVolumeUntracked = null;
  @SerializedName("total_volume_eth")
  private String totalVolumeEth = null;
  @SerializedName("total_liquidity_eth")
  private String totalLiquidityEth = null;
  @SerializedName("total_volume_usd")
  private String totalVolumeUsd = null;
  @SerializedName("total_liquidity_usd")
  private String totalLiquidityUsd = null;
  @SerializedName("tx_count")
  private String txCount = null;
  @SerializedName("vid")
  private Long vid = null;

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
   * Unix timestamp for start of day / 86400 giving a unique day index.
   **/
  @ApiModelProperty(value = "Unix timestamp for start of day / 86400 giving a unique day index.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unix timestamp for start of day.
   **/
  @ApiModelProperty(value = "Unix timestamp for start of day.")
  public Integer getDate() {
    return date;
  }
  public void setDate(Integer date) {
    this.date = date;
  }

  /**
   * Total volume across all pairs on this day, stored as a derived amount of ETH.
   **/
  @ApiModelProperty(value = "Total volume across all pairs on this day, stored as a derived amount of ETH.")
  public String getDailyVolumeEth() {
    return dailyVolumeEth;
  }
  public void setDailyVolumeEth(String dailyVolumeEth) {
    this.dailyVolumeEth = dailyVolumeEth;
  }

  /**
   * Total volume across all pairs on this day, stored as a derived amount of USD.
   **/
  @ApiModelProperty(value = "Total volume across all pairs on this day, stored as a derived amount of USD.")
  public String getDailyVolumeUsd() {
    return dailyVolumeUsd;
  }
  public void setDailyVolumeUsd(String dailyVolumeUsd) {
    this.dailyVolumeUsd = dailyVolumeUsd;
  }

  /**
   * Total volume across all pairs on this day, untracked.
   **/
  @ApiModelProperty(value = "Total volume across all pairs on this day, untracked.")
  public String getDailyVolumeUntracked() {
    return dailyVolumeUntracked;
  }
  public void setDailyVolumeUntracked(String dailyVolumeUntracked) {
    this.dailyVolumeUntracked = dailyVolumeUntracked;
  }

  /**
   * All time volume across all pairs in ETH up to and including this day.
   **/
  @ApiModelProperty(value = "All time volume across all pairs in ETH up to and including this day.")
  public String getTotalVolumeEth() {
    return totalVolumeEth;
  }
  public void setTotalVolumeEth(String totalVolumeEth) {
    this.totalVolumeEth = totalVolumeEth;
  }

  /**
   * Total liquidity across all pairs in ETH up to and including this day.
   **/
  @ApiModelProperty(value = "Total liquidity across all pairs in ETH up to and including this day.")
  public String getTotalLiquidityEth() {
    return totalLiquidityEth;
  }
  public void setTotalLiquidityEth(String totalLiquidityEth) {
    this.totalLiquidityEth = totalLiquidityEth;
  }

  /**
   * All time volume across all pairs in USD up to and including this day.
   **/
  @ApiModelProperty(value = "All time volume across all pairs in USD up to and including this day.")
  public String getTotalVolumeUsd() {
    return totalVolumeUsd;
  }
  public void setTotalVolumeUsd(String totalVolumeUsd) {
    this.totalVolumeUsd = totalVolumeUsd;
  }

  /**
   * Total liquidity across all pairs in USD up to and including this day.
   **/
  @ApiModelProperty(value = "Total liquidity across all pairs in USD up to and including this day.")
  public String getTotalLiquidityUsd() {
    return totalLiquidityUsd;
  }
  public void setTotalLiquidityUsd(String totalLiquidityUsd) {
    this.totalLiquidityUsd = totalLiquidityUsd;
  }

  /**
   * Number of transactions throughout this day.
   **/
  @ApiModelProperty(value = "Number of transactions throughout this day.")
  public String getTxCount() {
    return txCount;
  }
  public void setTxCount(String txCount) {
    this.txCount = txCount;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniswapV2UniswapDayDataDTO uniswapV2UniswapDayDataDTO = (UniswapV2UniswapDayDataDTO) o;
    return (this.entryTime == null ? uniswapV2UniswapDayDataDTO.entryTime == null : this.entryTime.equals(uniswapV2UniswapDayDataDTO.entryTime)) &&
        (this.recvTime == null ? uniswapV2UniswapDayDataDTO.recvTime == null : this.recvTime.equals(uniswapV2UniswapDayDataDTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV2UniswapDayDataDTO.blockNumber == null : this.blockNumber.equals(uniswapV2UniswapDayDataDTO.blockNumber)) &&
        (this.id == null ? uniswapV2UniswapDayDataDTO.id == null : this.id.equals(uniswapV2UniswapDayDataDTO.id)) &&
        (this.date == null ? uniswapV2UniswapDayDataDTO.date == null : this.date.equals(uniswapV2UniswapDayDataDTO.date)) &&
        (this.dailyVolumeEth == null ? uniswapV2UniswapDayDataDTO.dailyVolumeEth == null : this.dailyVolumeEth.equals(uniswapV2UniswapDayDataDTO.dailyVolumeEth)) &&
        (this.dailyVolumeUsd == null ? uniswapV2UniswapDayDataDTO.dailyVolumeUsd == null : this.dailyVolumeUsd.equals(uniswapV2UniswapDayDataDTO.dailyVolumeUsd)) &&
        (this.dailyVolumeUntracked == null ? uniswapV2UniswapDayDataDTO.dailyVolumeUntracked == null : this.dailyVolumeUntracked.equals(uniswapV2UniswapDayDataDTO.dailyVolumeUntracked)) &&
        (this.totalVolumeEth == null ? uniswapV2UniswapDayDataDTO.totalVolumeEth == null : this.totalVolumeEth.equals(uniswapV2UniswapDayDataDTO.totalVolumeEth)) &&
        (this.totalLiquidityEth == null ? uniswapV2UniswapDayDataDTO.totalLiquidityEth == null : this.totalLiquidityEth.equals(uniswapV2UniswapDayDataDTO.totalLiquidityEth)) &&
        (this.totalVolumeUsd == null ? uniswapV2UniswapDayDataDTO.totalVolumeUsd == null : this.totalVolumeUsd.equals(uniswapV2UniswapDayDataDTO.totalVolumeUsd)) &&
        (this.totalLiquidityUsd == null ? uniswapV2UniswapDayDataDTO.totalLiquidityUsd == null : this.totalLiquidityUsd.equals(uniswapV2UniswapDayDataDTO.totalLiquidityUsd)) &&
        (this.txCount == null ? uniswapV2UniswapDayDataDTO.txCount == null : this.txCount.equals(uniswapV2UniswapDayDataDTO.txCount)) &&
        (this.vid == null ? uniswapV2UniswapDayDataDTO.vid == null : this.vid.equals(uniswapV2UniswapDayDataDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.dailyVolumeEth == null ? 0: this.dailyVolumeEth.hashCode());
    result = 31 * result + (this.dailyVolumeUsd == null ? 0: this.dailyVolumeUsd.hashCode());
    result = 31 * result + (this.dailyVolumeUntracked == null ? 0: this.dailyVolumeUntracked.hashCode());
    result = 31 * result + (this.totalVolumeEth == null ? 0: this.totalVolumeEth.hashCode());
    result = 31 * result + (this.totalLiquidityEth == null ? 0: this.totalLiquidityEth.hashCode());
    result = 31 * result + (this.totalVolumeUsd == null ? 0: this.totalVolumeUsd.hashCode());
    result = 31 * result + (this.totalLiquidityUsd == null ? 0: this.totalLiquidityUsd.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV2UniswapDayDataDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  dailyVolumeEth: ").append(dailyVolumeEth).append("\n");
    sb.append("  dailyVolumeUsd: ").append(dailyVolumeUsd).append("\n");
    sb.append("  dailyVolumeUntracked: ").append(dailyVolumeUntracked).append("\n");
    sb.append("  totalVolumeEth: ").append(totalVolumeEth).append("\n");
    sb.append("  totalLiquidityEth: ").append(totalLiquidityEth).append("\n");
    sb.append("  totalVolumeUsd: ").append(totalVolumeUsd).append("\n");
    sb.append("  totalLiquidityUsd: ").append(totalLiquidityUsd).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
