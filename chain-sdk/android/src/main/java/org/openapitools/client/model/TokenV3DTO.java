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

import java.util.*;
import java.util.Date;
import org.openapitools.client.model.BigInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class TokenV3DTO {
  
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
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("decimals")
  private Integer decimals = null;
  @SerializedName("total_supply")
  private BigInteger totalSupply = null;
  @SerializedName("volume")
  private String volume = null;
  @SerializedName("volume_usd")
  private String volumeUsd = null;
  @SerializedName("untracked_volume_usd")
  private String untrackedVolumeUsd = null;
  @SerializedName("fees_usd")
  private String feesUsd = null;
  @SerializedName("tx_count")
  private BigInteger txCount = null;
  @SerializedName("pool_count")
  private BigInteger poolCount = null;
  @SerializedName("total_value_locked")
  private String totalValueLocked = null;
  @SerializedName("total_value_locked_usd")
  private String totalValueLockedUsd = null;
  @SerializedName("total_value_locked_usd_untracked")
  private String totalValueLockedUsdUntracked = null;
  @SerializedName("derived_eth")
  private String derivedEth = null;
  @SerializedName("whitelist_pools")
  private List<String> whitelistPools = null;
  @SerializedName("token_symbol")
  private String tokenSymbol = null;

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
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDecimals() {
    return decimals;
  }
  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigInteger getTotalSupply() {
    return totalSupply;
  }
  public void setTotalSupply(BigInteger totalSupply) {
    this.totalSupply = totalSupply;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVolume() {
    return volume;
  }
  public void setVolume(String volume) {
    this.volume = volume;
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
  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }
  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
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
  public BigInteger getPoolCount() {
    return poolCount;
  }
  public void setPoolCount(BigInteger poolCount) {
    this.poolCount = poolCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTotalValueLocked() {
    return totalValueLocked;
  }
  public void setTotalValueLocked(String totalValueLocked) {
    this.totalValueLocked = totalValueLocked;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTotalValueLockedUsd() {
    return totalValueLockedUsd;
  }
  public void setTotalValueLockedUsd(String totalValueLockedUsd) {
    this.totalValueLockedUsd = totalValueLockedUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTotalValueLockedUsdUntracked() {
    return totalValueLockedUsdUntracked;
  }
  public void setTotalValueLockedUsdUntracked(String totalValueLockedUsdUntracked) {
    this.totalValueLockedUsdUntracked = totalValueLockedUsdUntracked;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDerivedEth() {
    return derivedEth;
  }
  public void setDerivedEth(String derivedEth) {
    this.derivedEth = derivedEth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getWhitelistPools() {
    return whitelistPools;
  }
  public void setWhitelistPools(List<String> whitelistPools) {
    this.whitelistPools = whitelistPools;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTokenSymbol() {
    return tokenSymbol;
  }
  public void setTokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenV3DTO tokenV3DTO = (TokenV3DTO) o;
    return (this.entryTime == null ? tokenV3DTO.entryTime == null : this.entryTime.equals(tokenV3DTO.entryTime)) &&
        (this.recvTime == null ? tokenV3DTO.recvTime == null : this.recvTime.equals(tokenV3DTO.recvTime)) &&
        (this.blockNumber == null ? tokenV3DTO.blockNumber == null : this.blockNumber.equals(tokenV3DTO.blockNumber)) &&
        (this.vid == null ? tokenV3DTO.vid == null : this.vid.equals(tokenV3DTO.vid)) &&
        (this.id == null ? tokenV3DTO.id == null : this.id.equals(tokenV3DTO.id)) &&
        (this.symbol == null ? tokenV3DTO.symbol == null : this.symbol.equals(tokenV3DTO.symbol)) &&
        (this.name == null ? tokenV3DTO.name == null : this.name.equals(tokenV3DTO.name)) &&
        (this.decimals == null ? tokenV3DTO.decimals == null : this.decimals.equals(tokenV3DTO.decimals)) &&
        (this.totalSupply == null ? tokenV3DTO.totalSupply == null : this.totalSupply.equals(tokenV3DTO.totalSupply)) &&
        (this.volume == null ? tokenV3DTO.volume == null : this.volume.equals(tokenV3DTO.volume)) &&
        (this.volumeUsd == null ? tokenV3DTO.volumeUsd == null : this.volumeUsd.equals(tokenV3DTO.volumeUsd)) &&
        (this.untrackedVolumeUsd == null ? tokenV3DTO.untrackedVolumeUsd == null : this.untrackedVolumeUsd.equals(tokenV3DTO.untrackedVolumeUsd)) &&
        (this.feesUsd == null ? tokenV3DTO.feesUsd == null : this.feesUsd.equals(tokenV3DTO.feesUsd)) &&
        (this.txCount == null ? tokenV3DTO.txCount == null : this.txCount.equals(tokenV3DTO.txCount)) &&
        (this.poolCount == null ? tokenV3DTO.poolCount == null : this.poolCount.equals(tokenV3DTO.poolCount)) &&
        (this.totalValueLocked == null ? tokenV3DTO.totalValueLocked == null : this.totalValueLocked.equals(tokenV3DTO.totalValueLocked)) &&
        (this.totalValueLockedUsd == null ? tokenV3DTO.totalValueLockedUsd == null : this.totalValueLockedUsd.equals(tokenV3DTO.totalValueLockedUsd)) &&
        (this.totalValueLockedUsdUntracked == null ? tokenV3DTO.totalValueLockedUsdUntracked == null : this.totalValueLockedUsdUntracked.equals(tokenV3DTO.totalValueLockedUsdUntracked)) &&
        (this.derivedEth == null ? tokenV3DTO.derivedEth == null : this.derivedEth.equals(tokenV3DTO.derivedEth)) &&
        (this.whitelistPools == null ? tokenV3DTO.whitelistPools == null : this.whitelistPools.equals(tokenV3DTO.whitelistPools)) &&
        (this.tokenSymbol == null ? tokenV3DTO.tokenSymbol == null : this.tokenSymbol.equals(tokenV3DTO.tokenSymbol));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.decimals == null ? 0: this.decimals.hashCode());
    result = 31 * result + (this.totalSupply == null ? 0: this.totalSupply.hashCode());
    result = 31 * result + (this.volume == null ? 0: this.volume.hashCode());
    result = 31 * result + (this.volumeUsd == null ? 0: this.volumeUsd.hashCode());
    result = 31 * result + (this.untrackedVolumeUsd == null ? 0: this.untrackedVolumeUsd.hashCode());
    result = 31 * result + (this.feesUsd == null ? 0: this.feesUsd.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.poolCount == null ? 0: this.poolCount.hashCode());
    result = 31 * result + (this.totalValueLocked == null ? 0: this.totalValueLocked.hashCode());
    result = 31 * result + (this.totalValueLockedUsd == null ? 0: this.totalValueLockedUsd.hashCode());
    result = 31 * result + (this.totalValueLockedUsdUntracked == null ? 0: this.totalValueLockedUsdUntracked.hashCode());
    result = 31 * result + (this.derivedEth == null ? 0: this.derivedEth.hashCode());
    result = 31 * result + (this.whitelistPools == null ? 0: this.whitelistPools.hashCode());
    result = 31 * result + (this.tokenSymbol == null ? 0: this.tokenSymbol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenV3DTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  decimals: ").append(decimals).append("\n");
    sb.append("  totalSupply: ").append(totalSupply).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  volumeUsd: ").append(volumeUsd).append("\n");
    sb.append("  untrackedVolumeUsd: ").append(untrackedVolumeUsd).append("\n");
    sb.append("  feesUsd: ").append(feesUsd).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  poolCount: ").append(poolCount).append("\n");
    sb.append("  totalValueLocked: ").append(totalValueLocked).append("\n");
    sb.append("  totalValueLockedUsd: ").append(totalValueLockedUsd).append("\n");
    sb.append("  totalValueLockedUsdUntracked: ").append(totalValueLockedUsdUntracked).append("\n");
    sb.append("  derivedEth: ").append(derivedEth).append("\n");
    sb.append("  whitelistPools: ").append(whitelistPools).append("\n");
    sb.append("  tokenSymbol: ").append(tokenSymbol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}