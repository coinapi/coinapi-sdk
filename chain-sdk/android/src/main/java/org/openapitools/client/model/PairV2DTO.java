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
public class PairV2DTO {
  
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
  @SerializedName("token_0")
  private String token0 = null;
  @SerializedName("token_1")
  private String token1 = null;
  @SerializedName("reserve_0")
  private String reserve0 = null;
  @SerializedName("reserve_1")
  private String reserve1 = null;
  @SerializedName("total_supply")
  private String totalSupply = null;
  @SerializedName("reserve_eth")
  private String reserveEth = null;
  @SerializedName("reserve_usd")
  private String reserveUsd = null;
  @SerializedName("tracked_reserve_eth")
  private String trackedReserveEth = null;
  @SerializedName("token_0_price")
  private String token0Price = null;
  @SerializedName("token_1_price")
  private String token1Price = null;
  @SerializedName("volume_token_0")
  private String volumeToken0 = null;
  @SerializedName("volume_token_1")
  private String volumeToken1 = null;
  @SerializedName("volume_usd")
  private String volumeUsd = null;
  @SerializedName("untracked_volume_usd")
  private String untrackedVolumeUsd = null;
  @SerializedName("tx_count")
  private BigInteger txCount = null;
  @SerializedName("created_at_timestamp")
  private Date createdAtTimestamp = null;
  @SerializedName("liquidity_provider_count")
  private String liquidityProviderCount = null;
  @SerializedName("evaluated_ask")
  private Double evaluatedAsk = null;

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
  public String getToken0() {
    return token0;
  }
  public void setToken0(String token0) {
    this.token0 = token0;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken1() {
    return token1;
  }
  public void setToken1(String token1) {
    this.token1 = token1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReserve0() {
    return reserve0;
  }
  public void setReserve0(String reserve0) {
    this.reserve0 = reserve0;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReserve1() {
    return reserve1;
  }
  public void setReserve1(String reserve1) {
    this.reserve1 = reserve1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTotalSupply() {
    return totalSupply;
  }
  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReserveEth() {
    return reserveEth;
  }
  public void setReserveEth(String reserveEth) {
    this.reserveEth = reserveEth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReserveUsd() {
    return reserveUsd;
  }
  public void setReserveUsd(String reserveUsd) {
    this.reserveUsd = reserveUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTrackedReserveEth() {
    return trackedReserveEth;
  }
  public void setTrackedReserveEth(String trackedReserveEth) {
    this.trackedReserveEth = trackedReserveEth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken0Price() {
    return token0Price;
  }
  public void setToken0Price(String token0Price) {
    this.token0Price = token0Price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken1Price() {
    return token1Price;
  }
  public void setToken1Price(String token1Price) {
    this.token1Price = token1Price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVolumeToken0() {
    return volumeToken0;
  }
  public void setVolumeToken0(String volumeToken0) {
    this.volumeToken0 = volumeToken0;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVolumeToken1() {
    return volumeToken1;
  }
  public void setVolumeToken1(String volumeToken1) {
    this.volumeToken1 = volumeToken1;
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
  public BigInteger getTxCount() {
    return txCount;
  }
  public void setTxCount(BigInteger txCount) {
    this.txCount = txCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }
  public void setCreatedAtTimestamp(Date createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLiquidityProviderCount() {
    return liquidityProviderCount;
  }
  public void setLiquidityProviderCount(String liquidityProviderCount) {
    this.liquidityProviderCount = liquidityProviderCount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getEvaluatedAsk() {
    return evaluatedAsk;
  }
  public void setEvaluatedAsk(Double evaluatedAsk) {
    this.evaluatedAsk = evaluatedAsk;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PairV2DTO pairV2DTO = (PairV2DTO) o;
    return (this.entryTime == null ? pairV2DTO.entryTime == null : this.entryTime.equals(pairV2DTO.entryTime)) &&
        (this.recvTime == null ? pairV2DTO.recvTime == null : this.recvTime.equals(pairV2DTO.recvTime)) &&
        (this.blockNumber == null ? pairV2DTO.blockNumber == null : this.blockNumber.equals(pairV2DTO.blockNumber)) &&
        (this.vid == null ? pairV2DTO.vid == null : this.vid.equals(pairV2DTO.vid)) &&
        (this.id == null ? pairV2DTO.id == null : this.id.equals(pairV2DTO.id)) &&
        (this.token0 == null ? pairV2DTO.token0 == null : this.token0.equals(pairV2DTO.token0)) &&
        (this.token1 == null ? pairV2DTO.token1 == null : this.token1.equals(pairV2DTO.token1)) &&
        (this.reserve0 == null ? pairV2DTO.reserve0 == null : this.reserve0.equals(pairV2DTO.reserve0)) &&
        (this.reserve1 == null ? pairV2DTO.reserve1 == null : this.reserve1.equals(pairV2DTO.reserve1)) &&
        (this.totalSupply == null ? pairV2DTO.totalSupply == null : this.totalSupply.equals(pairV2DTO.totalSupply)) &&
        (this.reserveEth == null ? pairV2DTO.reserveEth == null : this.reserveEth.equals(pairV2DTO.reserveEth)) &&
        (this.reserveUsd == null ? pairV2DTO.reserveUsd == null : this.reserveUsd.equals(pairV2DTO.reserveUsd)) &&
        (this.trackedReserveEth == null ? pairV2DTO.trackedReserveEth == null : this.trackedReserveEth.equals(pairV2DTO.trackedReserveEth)) &&
        (this.token0Price == null ? pairV2DTO.token0Price == null : this.token0Price.equals(pairV2DTO.token0Price)) &&
        (this.token1Price == null ? pairV2DTO.token1Price == null : this.token1Price.equals(pairV2DTO.token1Price)) &&
        (this.volumeToken0 == null ? pairV2DTO.volumeToken0 == null : this.volumeToken0.equals(pairV2DTO.volumeToken0)) &&
        (this.volumeToken1 == null ? pairV2DTO.volumeToken1 == null : this.volumeToken1.equals(pairV2DTO.volumeToken1)) &&
        (this.volumeUsd == null ? pairV2DTO.volumeUsd == null : this.volumeUsd.equals(pairV2DTO.volumeUsd)) &&
        (this.untrackedVolumeUsd == null ? pairV2DTO.untrackedVolumeUsd == null : this.untrackedVolumeUsd.equals(pairV2DTO.untrackedVolumeUsd)) &&
        (this.txCount == null ? pairV2DTO.txCount == null : this.txCount.equals(pairV2DTO.txCount)) &&
        (this.createdAtTimestamp == null ? pairV2DTO.createdAtTimestamp == null : this.createdAtTimestamp.equals(pairV2DTO.createdAtTimestamp)) &&
        (this.liquidityProviderCount == null ? pairV2DTO.liquidityProviderCount == null : this.liquidityProviderCount.equals(pairV2DTO.liquidityProviderCount)) &&
        (this.evaluatedAsk == null ? pairV2DTO.evaluatedAsk == null : this.evaluatedAsk.equals(pairV2DTO.evaluatedAsk));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.token0 == null ? 0: this.token0.hashCode());
    result = 31 * result + (this.token1 == null ? 0: this.token1.hashCode());
    result = 31 * result + (this.reserve0 == null ? 0: this.reserve0.hashCode());
    result = 31 * result + (this.reserve1 == null ? 0: this.reserve1.hashCode());
    result = 31 * result + (this.totalSupply == null ? 0: this.totalSupply.hashCode());
    result = 31 * result + (this.reserveEth == null ? 0: this.reserveEth.hashCode());
    result = 31 * result + (this.reserveUsd == null ? 0: this.reserveUsd.hashCode());
    result = 31 * result + (this.trackedReserveEth == null ? 0: this.trackedReserveEth.hashCode());
    result = 31 * result + (this.token0Price == null ? 0: this.token0Price.hashCode());
    result = 31 * result + (this.token1Price == null ? 0: this.token1Price.hashCode());
    result = 31 * result + (this.volumeToken0 == null ? 0: this.volumeToken0.hashCode());
    result = 31 * result + (this.volumeToken1 == null ? 0: this.volumeToken1.hashCode());
    result = 31 * result + (this.volumeUsd == null ? 0: this.volumeUsd.hashCode());
    result = 31 * result + (this.untrackedVolumeUsd == null ? 0: this.untrackedVolumeUsd.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.createdAtTimestamp == null ? 0: this.createdAtTimestamp.hashCode());
    result = 31 * result + (this.liquidityProviderCount == null ? 0: this.liquidityProviderCount.hashCode());
    result = 31 * result + (this.evaluatedAsk == null ? 0: this.evaluatedAsk.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PairV2DTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  token0: ").append(token0).append("\n");
    sb.append("  token1: ").append(token1).append("\n");
    sb.append("  reserve0: ").append(reserve0).append("\n");
    sb.append("  reserve1: ").append(reserve1).append("\n");
    sb.append("  totalSupply: ").append(totalSupply).append("\n");
    sb.append("  reserveEth: ").append(reserveEth).append("\n");
    sb.append("  reserveUsd: ").append(reserveUsd).append("\n");
    sb.append("  trackedReserveEth: ").append(trackedReserveEth).append("\n");
    sb.append("  token0Price: ").append(token0Price).append("\n");
    sb.append("  token1Price: ").append(token1Price).append("\n");
    sb.append("  volumeToken0: ").append(volumeToken0).append("\n");
    sb.append("  volumeToken1: ").append(volumeToken1).append("\n");
    sb.append("  volumeUsd: ").append(volumeUsd).append("\n");
    sb.append("  untrackedVolumeUsd: ").append(untrackedVolumeUsd).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  createdAtTimestamp: ").append(createdAtTimestamp).append("\n");
    sb.append("  liquidityProviderCount: ").append(liquidityProviderCount).append("\n");
    sb.append("  evaluatedAsk: ").append(evaluatedAsk).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}