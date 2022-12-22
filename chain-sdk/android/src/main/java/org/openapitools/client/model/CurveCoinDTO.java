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
public class CurveCoinDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("index")
  private Integer index = null;
  @SerializedName("pool")
  private String pool = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("underlying")
  private String underlying = null;
  @SerializedName("balance")
  private String balance = null;
  @SerializedName("rate")
  private String rate = null;
  @SerializedName("updated")
  private String updated = null;
  @SerializedName("updated_at_block")
  private String updatedAtBlock = null;
  @SerializedName("updated_at_transaction")
  private String updatedAtTransaction = null;
  @SerializedName("vid")
  private Long vid = null;
  @SerializedName("block_range")
  private String blockRange = null;

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
   * Identifier, format: <pool_id>-<coin_index>.
   **/
  @ApiModelProperty(value = "Identifier, format: <pool_id>-<coin_index>.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Coin index.
   **/
  @ApiModelProperty(value = "Coin index.")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
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
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUnderlying() {
    return underlying;
  }
  public void setUnderlying(String underlying) {
    this.underlying = underlying;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBalance() {
    return balance;
  }
  public void setBalance(String balance) {
    this.balance = balance;
  }

  /**
   * Exchange rate between this coin and the associated underlying coin within the pool.
   **/
  @ApiModelProperty(value = "Exchange rate between this coin and the associated underlying coin within the pool.")
  public String getRate() {
    return rate;
  }
  public void setRate(String rate) {
    this.rate = rate;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUpdated() {
    return updated;
  }
  public void setUpdated(String updated) {
    this.updated = updated;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAtBlock() {
    return updatedAtBlock;
  }
  public void setUpdatedAtBlock(String updatedAtBlock) {
    this.updatedAtBlock = updatedAtBlock;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAtTransaction() {
    return updatedAtTransaction;
  }
  public void setUpdatedAtTransaction(String updatedAtTransaction) {
    this.updatedAtTransaction = updatedAtTransaction;
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

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBlockRange() {
    return blockRange;
  }
  public void setBlockRange(String blockRange) {
    this.blockRange = blockRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurveCoinDTO curveCoinDTO = (CurveCoinDTO) o;
    return (this.entryTime == null ? curveCoinDTO.entryTime == null : this.entryTime.equals(curveCoinDTO.entryTime)) &&
        (this.recvTime == null ? curveCoinDTO.recvTime == null : this.recvTime.equals(curveCoinDTO.recvTime)) &&
        (this.blockNumber == null ? curveCoinDTO.blockNumber == null : this.blockNumber.equals(curveCoinDTO.blockNumber)) &&
        (this.id == null ? curveCoinDTO.id == null : this.id.equals(curveCoinDTO.id)) &&
        (this.index == null ? curveCoinDTO.index == null : this.index.equals(curveCoinDTO.index)) &&
        (this.pool == null ? curveCoinDTO.pool == null : this.pool.equals(curveCoinDTO.pool)) &&
        (this.token == null ? curveCoinDTO.token == null : this.token.equals(curveCoinDTO.token)) &&
        (this.underlying == null ? curveCoinDTO.underlying == null : this.underlying.equals(curveCoinDTO.underlying)) &&
        (this.balance == null ? curveCoinDTO.balance == null : this.balance.equals(curveCoinDTO.balance)) &&
        (this.rate == null ? curveCoinDTO.rate == null : this.rate.equals(curveCoinDTO.rate)) &&
        (this.updated == null ? curveCoinDTO.updated == null : this.updated.equals(curveCoinDTO.updated)) &&
        (this.updatedAtBlock == null ? curveCoinDTO.updatedAtBlock == null : this.updatedAtBlock.equals(curveCoinDTO.updatedAtBlock)) &&
        (this.updatedAtTransaction == null ? curveCoinDTO.updatedAtTransaction == null : this.updatedAtTransaction.equals(curveCoinDTO.updatedAtTransaction)) &&
        (this.vid == null ? curveCoinDTO.vid == null : this.vid.equals(curveCoinDTO.vid)) &&
        (this.blockRange == null ? curveCoinDTO.blockRange == null : this.blockRange.equals(curveCoinDTO.blockRange));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    result = 31 * result + (this.pool == null ? 0: this.pool.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.underlying == null ? 0: this.underlying.hashCode());
    result = 31 * result + (this.balance == null ? 0: this.balance.hashCode());
    result = 31 * result + (this.rate == null ? 0: this.rate.hashCode());
    result = 31 * result + (this.updated == null ? 0: this.updated.hashCode());
    result = 31 * result + (this.updatedAtBlock == null ? 0: this.updatedAtBlock.hashCode());
    result = 31 * result + (this.updatedAtTransaction == null ? 0: this.updatedAtTransaction.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.blockRange == null ? 0: this.blockRange.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurveCoinDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  index: ").append(index).append("\n");
    sb.append("  pool: ").append(pool).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  underlying: ").append(underlying).append("\n");
    sb.append("  balance: ").append(balance).append("\n");
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  updatedAtBlock: ").append(updatedAtBlock).append("\n");
    sb.append("  updatedAtTransaction: ").append(updatedAtTransaction).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  blockRange: ").append(blockRange).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}