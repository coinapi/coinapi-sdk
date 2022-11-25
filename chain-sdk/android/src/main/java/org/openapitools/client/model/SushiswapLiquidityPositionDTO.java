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
public class SushiswapLiquidityPositionDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("user")
  private String user = null;
  @SerializedName("pair")
  private String pair = null;
  @SerializedName("liquidity_token_balance")
  private String liquidityTokenBalance = null;
  @SerializedName("block")
  private Integer block = null;
  @SerializedName("timestamp")
  private Integer timestamp = null;
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
   * Identifier, format: <pair address>-<user address>
   **/
  @ApiModelProperty(value = "Identifier, format: <pair address>-<user address>")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * User address.
   **/
  @ApiModelProperty(value = "User address.")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Pair address.
   **/
  @ApiModelProperty(value = "Pair address.")
  public String getPair() {
    return pair;
  }
  public void setPair(String pair) {
    this.pair = pair;
  }

  /**
   * Amount of LP tokens minted for this position.
   **/
  @ApiModelProperty(value = "Amount of LP tokens minted for this position.")
  public String getLiquidityTokenBalance() {
    return liquidityTokenBalance;
  }
  public void setLiquidityTokenBalance(String liquidityTokenBalance) {
    this.liquidityTokenBalance = liquidityTokenBalance;
  }

  /**
   * Block number at which position was created.
   **/
  @ApiModelProperty(value = "Block number at which position was created.")
  public Integer getBlock() {
    return block;
  }
  public void setBlock(Integer block) {
    this.block = block;
  }

  /**
   * Creation time.
   **/
  @ApiModelProperty(value = "Creation time.")
  public Integer getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
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
    SushiswapLiquidityPositionDTO sushiswapLiquidityPositionDTO = (SushiswapLiquidityPositionDTO) o;
    return (this.entryTime == null ? sushiswapLiquidityPositionDTO.entryTime == null : this.entryTime.equals(sushiswapLiquidityPositionDTO.entryTime)) &&
        (this.recvTime == null ? sushiswapLiquidityPositionDTO.recvTime == null : this.recvTime.equals(sushiswapLiquidityPositionDTO.recvTime)) &&
        (this.blockNumber == null ? sushiswapLiquidityPositionDTO.blockNumber == null : this.blockNumber.equals(sushiswapLiquidityPositionDTO.blockNumber)) &&
        (this.id == null ? sushiswapLiquidityPositionDTO.id == null : this.id.equals(sushiswapLiquidityPositionDTO.id)) &&
        (this.user == null ? sushiswapLiquidityPositionDTO.user == null : this.user.equals(sushiswapLiquidityPositionDTO.user)) &&
        (this.pair == null ? sushiswapLiquidityPositionDTO.pair == null : this.pair.equals(sushiswapLiquidityPositionDTO.pair)) &&
        (this.liquidityTokenBalance == null ? sushiswapLiquidityPositionDTO.liquidityTokenBalance == null : this.liquidityTokenBalance.equals(sushiswapLiquidityPositionDTO.liquidityTokenBalance)) &&
        (this.block == null ? sushiswapLiquidityPositionDTO.block == null : this.block.equals(sushiswapLiquidityPositionDTO.block)) &&
        (this.timestamp == null ? sushiswapLiquidityPositionDTO.timestamp == null : this.timestamp.equals(sushiswapLiquidityPositionDTO.timestamp)) &&
        (this.vid == null ? sushiswapLiquidityPositionDTO.vid == null : this.vid.equals(sushiswapLiquidityPositionDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.pair == null ? 0: this.pair.hashCode());
    result = 31 * result + (this.liquidityTokenBalance == null ? 0: this.liquidityTokenBalance.hashCode());
    result = 31 * result + (this.block == null ? 0: this.block.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SushiswapLiquidityPositionDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  pair: ").append(pair).append("\n");
    sb.append("  liquidityTokenBalance: ").append(liquidityTokenBalance).append("\n");
    sb.append("  block: ").append(block).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
