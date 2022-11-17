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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Tracks pair data across each hour.
 **/
@ApiModel(description = "Tracks pair data across each hour.")
public class SushiswapPairHourDataDTO {
  
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
  @SerializedName("pair")
  private String pair = null;
  @SerializedName("reserve_0")
  private String reserve0 = null;
  @SerializedName("reserve_1")
  private String reserve1 = null;
  @SerializedName("reserve_usd")
  private String reserveUsd = null;
  @SerializedName("volume_token_0")
  private String volumeToken0 = null;
  @SerializedName("volume_token_1")
  private String volumeToken1 = null;
  @SerializedName("volume_usd")
  private String volumeUsd = null;
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
   * Identifier, format: <pair id>-<hour start timestamp>.
   **/
  @ApiModelProperty(value = "Identifier, format: <pair id>-<hour start timestamp>.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Hour start timestamp.
   **/
  @ApiModelProperty(value = "Hour start timestamp.")
  public Integer getDate() {
    return date;
  }
  public void setDate(Integer date) {
    this.date = date;
  }

  /**
   * Reference to pair.
   **/
  @ApiModelProperty(value = "Reference to pair.")
  public String getPair() {
    return pair;
  }
  public void setPair(String pair) {
    this.pair = pair;
  }

  /**
   * Reserve of token0 (updated during each transaction on pair).
   **/
  @ApiModelProperty(value = "Reserve of token0 (updated during each transaction on pair).")
  public String getReserve0() {
    return reserve0;
  }
  public void setReserve0(String reserve0) {
    this.reserve0 = reserve0;
  }

  /**
   * Reserve of token1 (updated during each transaction on pair).
   **/
  @ApiModelProperty(value = "Reserve of token1 (updated during each transaction on pair).")
  public String getReserve1() {
    return reserve1;
  }
  public void setReserve1(String reserve1) {
    this.reserve1 = reserve1;
  }

  /**
   * Reserve of token0 plus token1 stored as a derived USD amount.
   **/
  @ApiModelProperty(value = "Reserve of token0 plus token1 stored as a derived USD amount.")
  public String getReserveUsd() {
    return reserveUsd;
  }
  public void setReserveUsd(String reserveUsd) {
    this.reserveUsd = reserveUsd;
  }

  /**
   * Total amount of token0 swapped throughout hour.
   **/
  @ApiModelProperty(value = "Total amount of token0 swapped throughout hour.")
  public String getVolumeToken0() {
    return volumeToken0;
  }
  public void setVolumeToken0(String volumeToken0) {
    this.volumeToken0 = volumeToken0;
  }

  /**
   * Total amount of token1 swapped throughout hour.
   **/
  @ApiModelProperty(value = "Total amount of token1 swapped throughout hour.")
  public String getVolumeToken1() {
    return volumeToken1;
  }
  public void setVolumeToken1(String volumeToken1) {
    this.volumeToken1 = volumeToken1;
  }

  /**
   * Total volume within pair throughout hour.
   **/
  @ApiModelProperty(value = "Total volume within pair throughout hour.")
  public String getVolumeUsd() {
    return volumeUsd;
  }
  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  /**
   * Amount of transactions on pair throughout hour.
   **/
  @ApiModelProperty(value = "Amount of transactions on pair throughout hour.")
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
    SushiswapPairHourDataDTO sushiswapPairHourDataDTO = (SushiswapPairHourDataDTO) o;
    return (this.entryTime == null ? sushiswapPairHourDataDTO.entryTime == null : this.entryTime.equals(sushiswapPairHourDataDTO.entryTime)) &&
        (this.recvTime == null ? sushiswapPairHourDataDTO.recvTime == null : this.recvTime.equals(sushiswapPairHourDataDTO.recvTime)) &&
        (this.blockNumber == null ? sushiswapPairHourDataDTO.blockNumber == null : this.blockNumber.equals(sushiswapPairHourDataDTO.blockNumber)) &&
        (this.id == null ? sushiswapPairHourDataDTO.id == null : this.id.equals(sushiswapPairHourDataDTO.id)) &&
        (this.date == null ? sushiswapPairHourDataDTO.date == null : this.date.equals(sushiswapPairHourDataDTO.date)) &&
        (this.pair == null ? sushiswapPairHourDataDTO.pair == null : this.pair.equals(sushiswapPairHourDataDTO.pair)) &&
        (this.reserve0 == null ? sushiswapPairHourDataDTO.reserve0 == null : this.reserve0.equals(sushiswapPairHourDataDTO.reserve0)) &&
        (this.reserve1 == null ? sushiswapPairHourDataDTO.reserve1 == null : this.reserve1.equals(sushiswapPairHourDataDTO.reserve1)) &&
        (this.reserveUsd == null ? sushiswapPairHourDataDTO.reserveUsd == null : this.reserveUsd.equals(sushiswapPairHourDataDTO.reserveUsd)) &&
        (this.volumeToken0 == null ? sushiswapPairHourDataDTO.volumeToken0 == null : this.volumeToken0.equals(sushiswapPairHourDataDTO.volumeToken0)) &&
        (this.volumeToken1 == null ? sushiswapPairHourDataDTO.volumeToken1 == null : this.volumeToken1.equals(sushiswapPairHourDataDTO.volumeToken1)) &&
        (this.volumeUsd == null ? sushiswapPairHourDataDTO.volumeUsd == null : this.volumeUsd.equals(sushiswapPairHourDataDTO.volumeUsd)) &&
        (this.txCount == null ? sushiswapPairHourDataDTO.txCount == null : this.txCount.equals(sushiswapPairHourDataDTO.txCount)) &&
        (this.vid == null ? sushiswapPairHourDataDTO.vid == null : this.vid.equals(sushiswapPairHourDataDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.pair == null ? 0: this.pair.hashCode());
    result = 31 * result + (this.reserve0 == null ? 0: this.reserve0.hashCode());
    result = 31 * result + (this.reserve1 == null ? 0: this.reserve1.hashCode());
    result = 31 * result + (this.reserveUsd == null ? 0: this.reserveUsd.hashCode());
    result = 31 * result + (this.volumeToken0 == null ? 0: this.volumeToken0.hashCode());
    result = 31 * result + (this.volumeToken1 == null ? 0: this.volumeToken1.hashCode());
    result = 31 * result + (this.volumeUsd == null ? 0: this.volumeUsd.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SushiswapPairHourDataDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  pair: ").append(pair).append("\n");
    sb.append("  reserve0: ").append(reserve0).append("\n");
    sb.append("  reserve1: ").append(reserve1).append("\n");
    sb.append("  reserveUsd: ").append(reserveUsd).append("\n");
    sb.append("  volumeToken0: ").append(volumeToken0).append("\n");
    sb.append("  volumeToken1: ").append(volumeToken1).append("\n");
    sb.append("  volumeUsd: ").append(volumeUsd).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}