/**
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

import java.util.Date;
import org.openapitools.client.model.NumericsBigInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Data accumulated and condensed into day stats for all of Uniswap.
 **/
@ApiModel(description = "Data accumulated and condensed into day stats for all of Uniswap.")
public class UniswapV3UniswapDayDataDTO {
  
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
  @SerializedName("date")
  private Integer date = null;
  @SerializedName("volume_eth")
  private String volumeEth = null;
  @SerializedName("volume_usd")
  private String volumeUsd = null;
  @SerializedName("volume_usd_untracked")
  private String volumeUsdUntracked = null;
  @SerializedName("fees_usd")
  private String feesUsd = null;
  @SerializedName("tx_count")
  private NumericsBigInteger txCount = null;
  @SerializedName("tvl_usd")
  private String tvlUsd = null;

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
   * Timestamp rounded to current day by dividing by 86400.
   **/
  @ApiModelProperty(value = "Timestamp rounded to current day by dividing by 86400.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Timestamp rounded to current day by dividing by 86400.
   **/
  @ApiModelProperty(value = "Timestamp rounded to current day by dividing by 86400.")
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
  public String getVolumeEth() {
    return volumeEth;
  }
  public void setVolumeEth(String volumeEth) {
    this.volumeEth = volumeEth;
  }

  /**
   * Total volume across all pairs on this day, stored as a derived amount of USD.
   **/
  @ApiModelProperty(value = "Total volume across all pairs on this day, stored as a derived amount of USD.")
  public String getVolumeUsd() {
    return volumeUsd;
  }
  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  /**
   * Total daily volume in Uniswap derived in terms of USD untracked.
   **/
  @ApiModelProperty(value = "Total daily volume in Uniswap derived in terms of USD untracked.")
  public String getVolumeUsdUntracked() {
    return volumeUsdUntracked;
  }
  public void setVolumeUsdUntracked(String volumeUsdUntracked) {
    this.volumeUsdUntracked = volumeUsdUntracked;
  }

  /**
   * Fees in USD
   **/
  @ApiModelProperty(value = "Fees in USD")
  public String getFeesUsd() {
    return feesUsd;
  }
  public void setFeesUsd(String feesUsd) {
    this.feesUsd = feesUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getTxCount() {
    return txCount;
  }
  public void setTxCount(NumericsBigInteger txCount) {
    this.txCount = txCount;
  }

  /**
   * Tvl in terms of USD.
   **/
  @ApiModelProperty(value = "Tvl in terms of USD.")
  public String getTvlUsd() {
    return tvlUsd;
  }
  public void setTvlUsd(String tvlUsd) {
    this.tvlUsd = tvlUsd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniswapV3UniswapDayDataDTO uniswapV3UniswapDayDataDTO = (UniswapV3UniswapDayDataDTO) o;
    return (this.entryTime == null ? uniswapV3UniswapDayDataDTO.entryTime == null : this.entryTime.equals(uniswapV3UniswapDayDataDTO.entryTime)) &&
        (this.recvTime == null ? uniswapV3UniswapDayDataDTO.recvTime == null : this.recvTime.equals(uniswapV3UniswapDayDataDTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV3UniswapDayDataDTO.blockNumber == null : this.blockNumber.equals(uniswapV3UniswapDayDataDTO.blockNumber)) &&
        (this.vid == null ? uniswapV3UniswapDayDataDTO.vid == null : this.vid.equals(uniswapV3UniswapDayDataDTO.vid)) &&
        (this.id == null ? uniswapV3UniswapDayDataDTO.id == null : this.id.equals(uniswapV3UniswapDayDataDTO.id)) &&
        (this.date == null ? uniswapV3UniswapDayDataDTO.date == null : this.date.equals(uniswapV3UniswapDayDataDTO.date)) &&
        (this.volumeEth == null ? uniswapV3UniswapDayDataDTO.volumeEth == null : this.volumeEth.equals(uniswapV3UniswapDayDataDTO.volumeEth)) &&
        (this.volumeUsd == null ? uniswapV3UniswapDayDataDTO.volumeUsd == null : this.volumeUsd.equals(uniswapV3UniswapDayDataDTO.volumeUsd)) &&
        (this.volumeUsdUntracked == null ? uniswapV3UniswapDayDataDTO.volumeUsdUntracked == null : this.volumeUsdUntracked.equals(uniswapV3UniswapDayDataDTO.volumeUsdUntracked)) &&
        (this.feesUsd == null ? uniswapV3UniswapDayDataDTO.feesUsd == null : this.feesUsd.equals(uniswapV3UniswapDayDataDTO.feesUsd)) &&
        (this.txCount == null ? uniswapV3UniswapDayDataDTO.txCount == null : this.txCount.equals(uniswapV3UniswapDayDataDTO.txCount)) &&
        (this.tvlUsd == null ? uniswapV3UniswapDayDataDTO.tvlUsd == null : this.tvlUsd.equals(uniswapV3UniswapDayDataDTO.tvlUsd));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.volumeEth == null ? 0: this.volumeEth.hashCode());
    result = 31 * result + (this.volumeUsd == null ? 0: this.volumeUsd.hashCode());
    result = 31 * result + (this.volumeUsdUntracked == null ? 0: this.volumeUsdUntracked.hashCode());
    result = 31 * result + (this.feesUsd == null ? 0: this.feesUsd.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.tvlUsd == null ? 0: this.tvlUsd.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV3UniswapDayDataDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  volumeEth: ").append(volumeEth).append("\n");
    sb.append("  volumeUsd: ").append(volumeUsd).append("\n");
    sb.append("  volumeUsdUntracked: ").append(volumeUsdUntracked).append("\n");
    sb.append("  feesUsd: ").append(feesUsd).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  tvlUsd: ").append(tvlUsd).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}