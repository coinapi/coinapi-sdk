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

import java.util.*;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CurveRemoveLiquidityEventDTO {
  
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
  @SerializedName("token_amounts")
  private List<String> tokenAmounts = null;
  @SerializedName("fees")
  private List<String> fees = null;
  @SerializedName("token_supply")
  private String tokenSupply = null;
  @SerializedName("invariant")
  private String invariant = null;
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
  public List<String> getTokenAmounts() {
    return tokenAmounts;
  }
  public void setTokenAmounts(List<String> tokenAmounts) {
    this.tokenAmounts = tokenAmounts;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public List<String> getFees() {
    return fees;
  }
  public void setFees(List<String> fees) {
    this.fees = fees;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getTokenSupply() {
    return tokenSupply;
  }
  public void setTokenSupply(String tokenSupply) {
    this.tokenSupply = tokenSupply;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getInvariant() {
    return invariant;
  }
  public void setInvariant(String invariant) {
    this.invariant = invariant;
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
    CurveRemoveLiquidityEventDTO curveRemoveLiquidityEventDTO = (CurveRemoveLiquidityEventDTO) o;
    return (this.entryTime == null ? curveRemoveLiquidityEventDTO.entryTime == null : this.entryTime.equals(curveRemoveLiquidityEventDTO.entryTime)) &&
        (this.recvTime == null ? curveRemoveLiquidityEventDTO.recvTime == null : this.recvTime.equals(curveRemoveLiquidityEventDTO.recvTime)) &&
        (this.blockNumber == null ? curveRemoveLiquidityEventDTO.blockNumber == null : this.blockNumber.equals(curveRemoveLiquidityEventDTO.blockNumber)) &&
        (this.id == null ? curveRemoveLiquidityEventDTO.id == null : this.id.equals(curveRemoveLiquidityEventDTO.id)) &&
        (this.pool == null ? curveRemoveLiquidityEventDTO.pool == null : this.pool.equals(curveRemoveLiquidityEventDTO.pool)) &&
        (this.provider == null ? curveRemoveLiquidityEventDTO.provider == null : this.provider.equals(curveRemoveLiquidityEventDTO.provider)) &&
        (this.tokenAmounts == null ? curveRemoveLiquidityEventDTO.tokenAmounts == null : this.tokenAmounts.equals(curveRemoveLiquidityEventDTO.tokenAmounts)) &&
        (this.fees == null ? curveRemoveLiquidityEventDTO.fees == null : this.fees.equals(curveRemoveLiquidityEventDTO.fees)) &&
        (this.tokenSupply == null ? curveRemoveLiquidityEventDTO.tokenSupply == null : this.tokenSupply.equals(curveRemoveLiquidityEventDTO.tokenSupply)) &&
        (this.invariant == null ? curveRemoveLiquidityEventDTO.invariant == null : this.invariant.equals(curveRemoveLiquidityEventDTO.invariant)) &&
        (this.block == null ? curveRemoveLiquidityEventDTO.block == null : this.block.equals(curveRemoveLiquidityEventDTO.block)) &&
        (this.timestamp == null ? curveRemoveLiquidityEventDTO.timestamp == null : this.timestamp.equals(curveRemoveLiquidityEventDTO.timestamp)) &&
        (this.transaction == null ? curveRemoveLiquidityEventDTO.transaction == null : this.transaction.equals(curveRemoveLiquidityEventDTO.transaction)) &&
        (this.vid == null ? curveRemoveLiquidityEventDTO.vid == null : this.vid.equals(curveRemoveLiquidityEventDTO.vid));
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
    result = 31 * result + (this.tokenAmounts == null ? 0: this.tokenAmounts.hashCode());
    result = 31 * result + (this.fees == null ? 0: this.fees.hashCode());
    result = 31 * result + (this.tokenSupply == null ? 0: this.tokenSupply.hashCode());
    result = 31 * result + (this.invariant == null ? 0: this.invariant.hashCode());
    result = 31 * result + (this.block == null ? 0: this.block.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.transaction == null ? 0: this.transaction.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurveRemoveLiquidityEventDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  pool: ").append(pool).append("\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("  tokenAmounts: ").append(tokenAmounts).append("\n");
    sb.append("  fees: ").append(fees).append("\n");
    sb.append("  tokenSupply: ").append(tokenSupply).append("\n");
    sb.append("  invariant: ").append(invariant).append("\n");
    sb.append("  block: ").append(block).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  transaction: ").append(transaction).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
