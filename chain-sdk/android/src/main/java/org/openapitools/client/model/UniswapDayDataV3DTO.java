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
import org.openapitools.client.model.BigInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UniswapDayDataV3DTO {
  
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
  private BigInteger txCount = null;
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
   **/
  @ApiModelProperty(value = "")
  public Long getBlockNumber() {
    return blockNumber;
  }
  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getVid() {
    return vid;
  }
  public void setVid(Long vid) {
    this.vid = vid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDate() {
    return date;
  }
  public void setDate(Integer date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVolumeEth() {
    return volumeEth;
  }
  public void setVolumeEth(String volumeEth) {
    this.volumeEth = volumeEth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVolumeUsd() {
    return volumeUsd;
  }
  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVolumeUsdUntracked() {
    return volumeUsdUntracked;
  }
  public void setVolumeUsdUntracked(String volumeUsdUntracked) {
    this.volumeUsdUntracked = volumeUsdUntracked;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFeesUsd() {
    return feesUsd;
  }
  public void setFeesUsd(String feesUsd) {
    this.feesUsd = feesUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigInteger getTxCount() {
    return txCount;
  }
  public void setTxCount(BigInteger txCount) {
    this.txCount = txCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    UniswapDayDataV3DTO uniswapDayDataV3DTO = (UniswapDayDataV3DTO) o;
    return (this.entryTime == null ? uniswapDayDataV3DTO.entryTime == null : this.entryTime.equals(uniswapDayDataV3DTO.entryTime)) &&
        (this.recvTime == null ? uniswapDayDataV3DTO.recvTime == null : this.recvTime.equals(uniswapDayDataV3DTO.recvTime)) &&
        (this.blockNumber == null ? uniswapDayDataV3DTO.blockNumber == null : this.blockNumber.equals(uniswapDayDataV3DTO.blockNumber)) &&
        (this.vid == null ? uniswapDayDataV3DTO.vid == null : this.vid.equals(uniswapDayDataV3DTO.vid)) &&
        (this.id == null ? uniswapDayDataV3DTO.id == null : this.id.equals(uniswapDayDataV3DTO.id)) &&
        (this.date == null ? uniswapDayDataV3DTO.date == null : this.date.equals(uniswapDayDataV3DTO.date)) &&
        (this.volumeEth == null ? uniswapDayDataV3DTO.volumeEth == null : this.volumeEth.equals(uniswapDayDataV3DTO.volumeEth)) &&
        (this.volumeUsd == null ? uniswapDayDataV3DTO.volumeUsd == null : this.volumeUsd.equals(uniswapDayDataV3DTO.volumeUsd)) &&
        (this.volumeUsdUntracked == null ? uniswapDayDataV3DTO.volumeUsdUntracked == null : this.volumeUsdUntracked.equals(uniswapDayDataV3DTO.volumeUsdUntracked)) &&
        (this.feesUsd == null ? uniswapDayDataV3DTO.feesUsd == null : this.feesUsd.equals(uniswapDayDataV3DTO.feesUsd)) &&
        (this.txCount == null ? uniswapDayDataV3DTO.txCount == null : this.txCount.equals(uniswapDayDataV3DTO.txCount)) &&
        (this.tvlUsd == null ? uniswapDayDataV3DTO.tvlUsd == null : this.tvlUsd.equals(uniswapDayDataV3DTO.tvlUsd));
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
    sb.append("class UniswapDayDataV3DTO {\n");
    
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