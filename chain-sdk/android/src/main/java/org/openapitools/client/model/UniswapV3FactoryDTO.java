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
 * The Uniswap Factory entity is responsible for storing aggregate information across all Uniswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
 **/
@ApiModel(description = "The Uniswap Factory entity is responsible for storing aggregate information across all Uniswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.")
public class UniswapV3FactoryDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("pool_count")
  private String poolCount = null;
  @SerializedName("tx_count")
  private String txCount = null;
  @SerializedName("total_volume_usd")
  private String totalVolumeUsd = null;
  @SerializedName("total_volume_eth")
  private String totalVolumeEth = null;
  @SerializedName("total_fees_usd")
  private String totalFeesUsd = null;
  @SerializedName("total_fees_eth")
  private String totalFeesEth = null;
  @SerializedName("untracked_volume_usd")
  private String untrackedVolumeUsd = null;
  @SerializedName("total_value_locked_usd")
  private String totalValueLockedUsd = null;
  @SerializedName("total_value_locked_eth")
  private String totalValueLockedEth = null;
  @SerializedName("total_value_locked_usd_untracked")
  private String totalValueLockedUsdUntracked = null;
  @SerializedName("total_value_locked_eth_untracked")
  private String totalValueLockedEthUntracked = null;
  @SerializedName("owner")
  private String owner = null;
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
   * Amount of pools created.
   **/
  @ApiModelProperty(value = "Amount of pools created.")
  public String getPoolCount() {
    return poolCount;
  }
  public void setPoolCount(String poolCount) {
    this.poolCount = poolCount;
  }

  /**
   * Amount of transactions all time.
   **/
  @ApiModelProperty(value = "Amount of transactions all time.")
  public String getTxCount() {
    return txCount;
  }
  public void setTxCount(String txCount) {
    this.txCount = txCount;
  }

  /**
   * Total volume all time in derived USD.
   **/
  @ApiModelProperty(value = "Total volume all time in derived USD.")
  public String getTotalVolumeUsd() {
    return totalVolumeUsd;
  }
  public void setTotalVolumeUsd(String totalVolumeUsd) {
    this.totalVolumeUsd = totalVolumeUsd;
  }

  /**
   * Total volume all time in derived ETH.
   **/
  @ApiModelProperty(value = "Total volume all time in derived ETH.")
  public String getTotalVolumeEth() {
    return totalVolumeEth;
  }
  public void setTotalVolumeEth(String totalVolumeEth) {
    this.totalVolumeEth = totalVolumeEth;
  }

  /**
   * Total swap fees all time in USD.
   **/
  @ApiModelProperty(value = "Total swap fees all time in USD.")
  public String getTotalFeesUsd() {
    return totalFeesUsd;
  }
  public void setTotalFeesUsd(String totalFeesUsd) {
    this.totalFeesUsd = totalFeesUsd;
  }

  /**
   * All volume even through less reliable USD values.
   **/
  @ApiModelProperty(value = "All volume even through less reliable USD values.")
  public String getTotalFeesEth() {
    return totalFeesEth;
  }
  public void setTotalFeesEth(String totalFeesEth) {
    this.totalFeesEth = totalFeesEth;
  }

  /**
   * All volume even through less reliable USD values.
   **/
  @ApiModelProperty(value = "All volume even through less reliable USD values.")
  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }
  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }

  /**
   * Total value locked derived in USD.
   **/
  @ApiModelProperty(value = "Total value locked derived in USD.")
  public String getTotalValueLockedUsd() {
    return totalValueLockedUsd;
  }
  public void setTotalValueLockedUsd(String totalValueLockedUsd) {
    this.totalValueLockedUsd = totalValueLockedUsd;
  }

  /**
   * Total value locked derived in ETH.
   **/
  @ApiModelProperty(value = "Total value locked derived in ETH.")
  public String getTotalValueLockedEth() {
    return totalValueLockedEth;
  }
  public void setTotalValueLockedEth(String totalValueLockedEth) {
    this.totalValueLockedEth = totalValueLockedEth;
  }

  /**
   * Total value locked derived in USD untracked.
   **/
  @ApiModelProperty(value = "Total value locked derived in USD untracked.")
  public String getTotalValueLockedUsdUntracked() {
    return totalValueLockedUsdUntracked;
  }
  public void setTotalValueLockedUsdUntracked(String totalValueLockedUsdUntracked) {
    this.totalValueLockedUsdUntracked = totalValueLockedUsdUntracked;
  }

  /**
   * Total value locked derived in ETH untracked.
   **/
  @ApiModelProperty(value = "Total value locked derived in ETH untracked.")
  public String getTotalValueLockedEthUntracked() {
    return totalValueLockedEthUntracked;
  }
  public void setTotalValueLockedEthUntracked(String totalValueLockedEthUntracked) {
    this.totalValueLockedEthUntracked = totalValueLockedEthUntracked;
  }

  /**
   * Current owner of the factory.
   **/
  @ApiModelProperty(value = "Current owner of the factory.")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
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
    UniswapV3FactoryDTO uniswapV3FactoryDTO = (UniswapV3FactoryDTO) o;
    return (this.entryTime == null ? uniswapV3FactoryDTO.entryTime == null : this.entryTime.equals(uniswapV3FactoryDTO.entryTime)) &&
        (this.recvTime == null ? uniswapV3FactoryDTO.recvTime == null : this.recvTime.equals(uniswapV3FactoryDTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV3FactoryDTO.blockNumber == null : this.blockNumber.equals(uniswapV3FactoryDTO.blockNumber)) &&
        (this.id == null ? uniswapV3FactoryDTO.id == null : this.id.equals(uniswapV3FactoryDTO.id)) &&
        (this.poolCount == null ? uniswapV3FactoryDTO.poolCount == null : this.poolCount.equals(uniswapV3FactoryDTO.poolCount)) &&
        (this.txCount == null ? uniswapV3FactoryDTO.txCount == null : this.txCount.equals(uniswapV3FactoryDTO.txCount)) &&
        (this.totalVolumeUsd == null ? uniswapV3FactoryDTO.totalVolumeUsd == null : this.totalVolumeUsd.equals(uniswapV3FactoryDTO.totalVolumeUsd)) &&
        (this.totalVolumeEth == null ? uniswapV3FactoryDTO.totalVolumeEth == null : this.totalVolumeEth.equals(uniswapV3FactoryDTO.totalVolumeEth)) &&
        (this.totalFeesUsd == null ? uniswapV3FactoryDTO.totalFeesUsd == null : this.totalFeesUsd.equals(uniswapV3FactoryDTO.totalFeesUsd)) &&
        (this.totalFeesEth == null ? uniswapV3FactoryDTO.totalFeesEth == null : this.totalFeesEth.equals(uniswapV3FactoryDTO.totalFeesEth)) &&
        (this.untrackedVolumeUsd == null ? uniswapV3FactoryDTO.untrackedVolumeUsd == null : this.untrackedVolumeUsd.equals(uniswapV3FactoryDTO.untrackedVolumeUsd)) &&
        (this.totalValueLockedUsd == null ? uniswapV3FactoryDTO.totalValueLockedUsd == null : this.totalValueLockedUsd.equals(uniswapV3FactoryDTO.totalValueLockedUsd)) &&
        (this.totalValueLockedEth == null ? uniswapV3FactoryDTO.totalValueLockedEth == null : this.totalValueLockedEth.equals(uniswapV3FactoryDTO.totalValueLockedEth)) &&
        (this.totalValueLockedUsdUntracked == null ? uniswapV3FactoryDTO.totalValueLockedUsdUntracked == null : this.totalValueLockedUsdUntracked.equals(uniswapV3FactoryDTO.totalValueLockedUsdUntracked)) &&
        (this.totalValueLockedEthUntracked == null ? uniswapV3FactoryDTO.totalValueLockedEthUntracked == null : this.totalValueLockedEthUntracked.equals(uniswapV3FactoryDTO.totalValueLockedEthUntracked)) &&
        (this.owner == null ? uniswapV3FactoryDTO.owner == null : this.owner.equals(uniswapV3FactoryDTO.owner)) &&
        (this.vid == null ? uniswapV3FactoryDTO.vid == null : this.vid.equals(uniswapV3FactoryDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.poolCount == null ? 0: this.poolCount.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.totalVolumeUsd == null ? 0: this.totalVolumeUsd.hashCode());
    result = 31 * result + (this.totalVolumeEth == null ? 0: this.totalVolumeEth.hashCode());
    result = 31 * result + (this.totalFeesUsd == null ? 0: this.totalFeesUsd.hashCode());
    result = 31 * result + (this.totalFeesEth == null ? 0: this.totalFeesEth.hashCode());
    result = 31 * result + (this.untrackedVolumeUsd == null ? 0: this.untrackedVolumeUsd.hashCode());
    result = 31 * result + (this.totalValueLockedUsd == null ? 0: this.totalValueLockedUsd.hashCode());
    result = 31 * result + (this.totalValueLockedEth == null ? 0: this.totalValueLockedEth.hashCode());
    result = 31 * result + (this.totalValueLockedUsdUntracked == null ? 0: this.totalValueLockedUsdUntracked.hashCode());
    result = 31 * result + (this.totalValueLockedEthUntracked == null ? 0: this.totalValueLockedEthUntracked.hashCode());
    result = 31 * result + (this.owner == null ? 0: this.owner.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV3FactoryDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  poolCount: ").append(poolCount).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  totalVolumeUsd: ").append(totalVolumeUsd).append("\n");
    sb.append("  totalVolumeEth: ").append(totalVolumeEth).append("\n");
    sb.append("  totalFeesUsd: ").append(totalFeesUsd).append("\n");
    sb.append("  totalFeesEth: ").append(totalFeesEth).append("\n");
    sb.append("  untrackedVolumeUsd: ").append(untrackedVolumeUsd).append("\n");
    sb.append("  totalValueLockedUsd: ").append(totalValueLockedUsd).append("\n");
    sb.append("  totalValueLockedEth: ").append(totalValueLockedEth).append("\n");
    sb.append("  totalValueLockedUsdUntracked: ").append(totalValueLockedUsdUntracked).append("\n");
    sb.append("  totalValueLockedEthUntracked: ").append(totalValueLockedEthUntracked).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}