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
public class CurveRemoveLiquidityOneEventDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("pool")
  private String pool = null;
  @SerializedName("provider")
  private String provider = null;
  @SerializedName("token_amount")
  private String tokenAmount = null;
  @SerializedName("coin_amount")
  private String coinAmount = null;
  @SerializedName("block")
  private String block = null;
  @SerializedName("timestamp")
  private String timestamp = null;
  @SerializedName("transaction")
  private String transaction = null;
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
   * 
   **/
  @ApiModelProperty(value = "")
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
  public String getPool() {
    return pool;
  }
  public void setPool(String pool) {
    this.pool = pool;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getTokenAmount() {
    return tokenAmount;
  }
  public void setTokenAmount(String tokenAmount) {
    this.tokenAmount = tokenAmount;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCoinAmount() {
    return coinAmount;
  }
  public void setCoinAmount(String coinAmount) {
    this.coinAmount = coinAmount;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBlock() {
    return block;
  }
  public void setBlock(String block) {
    this.block = block;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getTransaction() {
    return transaction;
  }
  public void setTransaction(String transaction) {
    this.transaction = transaction;
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
    CurveRemoveLiquidityOneEventDTO curveRemoveLiquidityOneEventDTO = (CurveRemoveLiquidityOneEventDTO) o;
    return (this.entryTime == null ? curveRemoveLiquidityOneEventDTO.entryTime == null : this.entryTime.equals(curveRemoveLiquidityOneEventDTO.entryTime)) &&
        (this.recvTime == null ? curveRemoveLiquidityOneEventDTO.recvTime == null : this.recvTime.equals(curveRemoveLiquidityOneEventDTO.recvTime)) &&
        (this.blockNumber == null ? curveRemoveLiquidityOneEventDTO.blockNumber == null : this.blockNumber.equals(curveRemoveLiquidityOneEventDTO.blockNumber)) &&
        (this.id == null ? curveRemoveLiquidityOneEventDTO.id == null : this.id.equals(curveRemoveLiquidityOneEventDTO.id)) &&
        (this.pool == null ? curveRemoveLiquidityOneEventDTO.pool == null : this.pool.equals(curveRemoveLiquidityOneEventDTO.pool)) &&
        (this.provider == null ? curveRemoveLiquidityOneEventDTO.provider == null : this.provider.equals(curveRemoveLiquidityOneEventDTO.provider)) &&
        (this.tokenAmount == null ? curveRemoveLiquidityOneEventDTO.tokenAmount == null : this.tokenAmount.equals(curveRemoveLiquidityOneEventDTO.tokenAmount)) &&
        (this.coinAmount == null ? curveRemoveLiquidityOneEventDTO.coinAmount == null : this.coinAmount.equals(curveRemoveLiquidityOneEventDTO.coinAmount)) &&
        (this.block == null ? curveRemoveLiquidityOneEventDTO.block == null : this.block.equals(curveRemoveLiquidityOneEventDTO.block)) &&
        (this.timestamp == null ? curveRemoveLiquidityOneEventDTO.timestamp == null : this.timestamp.equals(curveRemoveLiquidityOneEventDTO.timestamp)) &&
        (this.transaction == null ? curveRemoveLiquidityOneEventDTO.transaction == null : this.transaction.equals(curveRemoveLiquidityOneEventDTO.transaction)) &&
        (this.vid == null ? curveRemoveLiquidityOneEventDTO.vid == null : this.vid.equals(curveRemoveLiquidityOneEventDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.pool == null ? 0: this.pool.hashCode());
    result = 31 * result + (this.provider == null ? 0: this.provider.hashCode());
    result = 31 * result + (this.tokenAmount == null ? 0: this.tokenAmount.hashCode());
    result = 31 * result + (this.coinAmount == null ? 0: this.coinAmount.hashCode());
    result = 31 * result + (this.block == null ? 0: this.block.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.transaction == null ? 0: this.transaction.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurveRemoveLiquidityOneEventDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  pool: ").append(pool).append("\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("  tokenAmount: ").append(tokenAmount).append("\n");
    sb.append("  coinAmount: ").append(coinAmount).append("\n");
    sb.append("  block: ").append(block).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  transaction: ").append(transaction).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
