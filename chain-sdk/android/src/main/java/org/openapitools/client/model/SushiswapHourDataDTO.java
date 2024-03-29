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

@ApiModel(description = "")
public class SushiswapHourDataDTO {
  
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
  @SerializedName("factory")
  private String factory = null;
  @SerializedName("volume_eth")
  private String volumeEth = null;
  @SerializedName("volume_usd")
  private String volumeUsd = null;
  @SerializedName("untracked_volume")
  private String untrackedVolume = null;
  @SerializedName("liquidity_eth")
  private String liquidityEth = null;
  @SerializedName("liquidity_usd")
  private String liquidityUsd = null;
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
   * Start of hour timestamp.
   **/
  @ApiModelProperty(value = "Start of hour timestamp.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getDate() {
    return date;
  }
  public void setDate(Integer date) {
    this.date = date;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getFactory() {
    return factory;
  }
  public void setFactory(String factory) {
    this.factory = factory;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getVolumeEth() {
    return volumeEth;
  }
  public void setVolumeEth(String volumeEth) {
    this.volumeEth = volumeEth;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getVolumeUsd() {
    return volumeUsd;
  }
  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUntrackedVolume() {
    return untrackedVolume;
  }
  public void setUntrackedVolume(String untrackedVolume) {
    this.untrackedVolume = untrackedVolume;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getLiquidityEth() {
    return liquidityEth;
  }
  public void setLiquidityEth(String liquidityEth) {
    this.liquidityEth = liquidityEth;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getLiquidityUsd() {
    return liquidityUsd;
  }
  public void setLiquidityUsd(String liquidityUsd) {
    this.liquidityUsd = liquidityUsd;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
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
    SushiswapHourDataDTO sushiswapHourDataDTO = (SushiswapHourDataDTO) o;
    return (this.entryTime == null ? sushiswapHourDataDTO.entryTime == null : this.entryTime.equals(sushiswapHourDataDTO.entryTime)) &&
        (this.recvTime == null ? sushiswapHourDataDTO.recvTime == null : this.recvTime.equals(sushiswapHourDataDTO.recvTime)) &&
        (this.blockNumber == null ? sushiswapHourDataDTO.blockNumber == null : this.blockNumber.equals(sushiswapHourDataDTO.blockNumber)) &&
        (this.id == null ? sushiswapHourDataDTO.id == null : this.id.equals(sushiswapHourDataDTO.id)) &&
        (this.date == null ? sushiswapHourDataDTO.date == null : this.date.equals(sushiswapHourDataDTO.date)) &&
        (this.factory == null ? sushiswapHourDataDTO.factory == null : this.factory.equals(sushiswapHourDataDTO.factory)) &&
        (this.volumeEth == null ? sushiswapHourDataDTO.volumeEth == null : this.volumeEth.equals(sushiswapHourDataDTO.volumeEth)) &&
        (this.volumeUsd == null ? sushiswapHourDataDTO.volumeUsd == null : this.volumeUsd.equals(sushiswapHourDataDTO.volumeUsd)) &&
        (this.untrackedVolume == null ? sushiswapHourDataDTO.untrackedVolume == null : this.untrackedVolume.equals(sushiswapHourDataDTO.untrackedVolume)) &&
        (this.liquidityEth == null ? sushiswapHourDataDTO.liquidityEth == null : this.liquidityEth.equals(sushiswapHourDataDTO.liquidityEth)) &&
        (this.liquidityUsd == null ? sushiswapHourDataDTO.liquidityUsd == null : this.liquidityUsd.equals(sushiswapHourDataDTO.liquidityUsd)) &&
        (this.txCount == null ? sushiswapHourDataDTO.txCount == null : this.txCount.equals(sushiswapHourDataDTO.txCount)) &&
        (this.vid == null ? sushiswapHourDataDTO.vid == null : this.vid.equals(sushiswapHourDataDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.factory == null ? 0: this.factory.hashCode());
    result = 31 * result + (this.volumeEth == null ? 0: this.volumeEth.hashCode());
    result = 31 * result + (this.volumeUsd == null ? 0: this.volumeUsd.hashCode());
    result = 31 * result + (this.untrackedVolume == null ? 0: this.untrackedVolume.hashCode());
    result = 31 * result + (this.liquidityEth == null ? 0: this.liquidityEth.hashCode());
    result = 31 * result + (this.liquidityUsd == null ? 0: this.liquidityUsd.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SushiswapHourDataDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  factory: ").append(factory).append("\n");
    sb.append("  volumeEth: ").append(volumeEth).append("\n");
    sb.append("  volumeUsd: ").append(volumeUsd).append("\n");
    sb.append("  untrackedVolume: ").append(untrackedVolume).append("\n");
    sb.append("  liquidityEth: ").append(liquidityEth).append("\n");
    sb.append("  liquidityUsd: ").append(liquidityUsd).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
