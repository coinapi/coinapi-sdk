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
 * The Sushiswap Factory entity is responsible for storing aggregate information across all Sushiswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
 **/
@ApiModel(description = "The Sushiswap Factory entity is responsible for storing aggregate information across all Sushiswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.")
public class SushiswapFactoryDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("pair_count")
  private String pairCount = null;
  @SerializedName("volume_usd")
  private String volumeUsd = null;
  @SerializedName("volume_eth")
  private String volumeEth = null;
  @SerializedName("untracked_volume_usd")
  private String untrackedVolumeUsd = null;
  @SerializedName("liquidity_usd")
  private String liquidityUsd = null;
  @SerializedName("liquidity_eth")
  private String liquidityEth = null;
  @SerializedName("tx_count")
  private String txCount = null;
  @SerializedName("token_count")
  private String tokenCount = null;
  @SerializedName("user_count")
  private String userCount = null;
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
   * Factory address.
   **/
  @ApiModelProperty(value = "Factory address.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Amount of pairs created by the Sushiswap factory.
   **/
  @ApiModelProperty(value = "Amount of pairs created by the Sushiswap factory.")
  public String getPairCount() {
    return pairCount;
  }
  public void setPairCount(String pairCount) {
    this.pairCount = pairCount;
  }

  /**
   * All time USD volume across all pairs (USD is derived).
   **/
  @ApiModelProperty(value = "All time USD volume across all pairs (USD is derived).")
  public String getVolumeUsd() {
    return volumeUsd;
  }
  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  /**
   * All time volume in ETH across all pairs (ETH is derived).
   **/
  @ApiModelProperty(value = "All time volume in ETH across all pairs (ETH is derived).")
  public String getVolumeEth() {
    return volumeEth;
  }
  public void setVolumeEth(String volumeEth) {
    this.volumeEth = volumeEth;
  }

  /**
   * Untracked volume USD.
   **/
  @ApiModelProperty(value = "Untracked volume USD.")
  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }
  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }

  /**
   * Total liquidity across all pairs stored as a derived USD amount.
   **/
  @ApiModelProperty(value = "Total liquidity across all pairs stored as a derived USD amount.")
  public String getLiquidityUsd() {
    return liquidityUsd;
  }
  public void setLiquidityUsd(String liquidityUsd) {
    this.liquidityUsd = liquidityUsd;
  }

  /**
   * Total liquidity across all pairs stored as a derived ETH amount.
   **/
  @ApiModelProperty(value = "Total liquidity across all pairs stored as a derived ETH amount.")
  public String getLiquidityEth() {
    return liquidityEth;
  }
  public void setLiquidityEth(String liquidityEth) {
    this.liquidityEth = liquidityEth;
  }

  /**
   * All time amount of transactions across all pairs.
   **/
  @ApiModelProperty(value = "All time amount of transactions across all pairs.")
  public String getTxCount() {
    return txCount;
  }
  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }

  /**
   * Total count of tokens.
   **/
  @ApiModelProperty(value = "Total count of tokens.")
  public String getTokenCount() {
    return tokenCount;
  }
  public void setTokenCount(String tokenCount) {
    this.tokenCount = tokenCount;
  }

  /**
   * Users count.
   **/
  @ApiModelProperty(value = "Users count.")
  public String getUserCount() {
    return userCount;
  }
  public void setUserCount(String userCount) {
    this.userCount = userCount;
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
    SushiswapFactoryDTO sushiswapFactoryDTO = (SushiswapFactoryDTO) o;
    return (this.entryTime == null ? sushiswapFactoryDTO.entryTime == null : this.entryTime.equals(sushiswapFactoryDTO.entryTime)) &&
        (this.recvTime == null ? sushiswapFactoryDTO.recvTime == null : this.recvTime.equals(sushiswapFactoryDTO.recvTime)) &&
        (this.blockNumber == null ? sushiswapFactoryDTO.blockNumber == null : this.blockNumber.equals(sushiswapFactoryDTO.blockNumber)) &&
        (this.id == null ? sushiswapFactoryDTO.id == null : this.id.equals(sushiswapFactoryDTO.id)) &&
        (this.pairCount == null ? sushiswapFactoryDTO.pairCount == null : this.pairCount.equals(sushiswapFactoryDTO.pairCount)) &&
        (this.volumeUsd == null ? sushiswapFactoryDTO.volumeUsd == null : this.volumeUsd.equals(sushiswapFactoryDTO.volumeUsd)) &&
        (this.volumeEth == null ? sushiswapFactoryDTO.volumeEth == null : this.volumeEth.equals(sushiswapFactoryDTO.volumeEth)) &&
        (this.untrackedVolumeUsd == null ? sushiswapFactoryDTO.untrackedVolumeUsd == null : this.untrackedVolumeUsd.equals(sushiswapFactoryDTO.untrackedVolumeUsd)) &&
        (this.liquidityUsd == null ? sushiswapFactoryDTO.liquidityUsd == null : this.liquidityUsd.equals(sushiswapFactoryDTO.liquidityUsd)) &&
        (this.liquidityEth == null ? sushiswapFactoryDTO.liquidityEth == null : this.liquidityEth.equals(sushiswapFactoryDTO.liquidityEth)) &&
        (this.txCount == null ? sushiswapFactoryDTO.txCount == null : this.txCount.equals(sushiswapFactoryDTO.txCount)) &&
        (this.tokenCount == null ? sushiswapFactoryDTO.tokenCount == null : this.tokenCount.equals(sushiswapFactoryDTO.tokenCount)) &&
        (this.userCount == null ? sushiswapFactoryDTO.userCount == null : this.userCount.equals(sushiswapFactoryDTO.userCount)) &&
        (this.vid == null ? sushiswapFactoryDTO.vid == null : this.vid.equals(sushiswapFactoryDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.pairCount == null ? 0: this.pairCount.hashCode());
    result = 31 * result + (this.volumeUsd == null ? 0: this.volumeUsd.hashCode());
    result = 31 * result + (this.volumeEth == null ? 0: this.volumeEth.hashCode());
    result = 31 * result + (this.untrackedVolumeUsd == null ? 0: this.untrackedVolumeUsd.hashCode());
    result = 31 * result + (this.liquidityUsd == null ? 0: this.liquidityUsd.hashCode());
    result = 31 * result + (this.liquidityEth == null ? 0: this.liquidityEth.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.tokenCount == null ? 0: this.tokenCount.hashCode());
    result = 31 * result + (this.userCount == null ? 0: this.userCount.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SushiswapFactoryDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  pairCount: ").append(pairCount).append("\n");
    sb.append("  volumeUsd: ").append(volumeUsd).append("\n");
    sb.append("  volumeEth: ").append(volumeEth).append("\n");
    sb.append("  untrackedVolumeUsd: ").append(untrackedVolumeUsd).append("\n");
    sb.append("  liquidityUsd: ").append(liquidityUsd).append("\n");
    sb.append("  liquidityEth: ").append(liquidityEth).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  tokenCount: ").append(tokenCount).append("\n");
    sb.append("  userCount: ").append(userCount).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
