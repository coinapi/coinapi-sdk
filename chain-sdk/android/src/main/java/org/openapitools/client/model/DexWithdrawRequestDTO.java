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
 * Withdraw request of an user
 **/
@ApiModel(description = "Withdraw request of an user")
public class DexWithdrawRequestDTO {
  
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
  @SerializedName("token_address")
  private String tokenAddress = null;
  @SerializedName("amount")
  private String amount = null;
  @SerializedName("withdrawable_from_batch_id")
  private String withdrawableFromBatchId = null;
  @SerializedName("create_epoch")
  private String createEpoch = null;
  @SerializedName("create_batch_id")
  private String createBatchId = null;
  @SerializedName("tx_hash")
  private String txHash = null;
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
   * Identifier, format: <transaction hash>-<id>.
   **/
  @ApiModelProperty(value = "Identifier, format: <transaction hash>-<id>.")
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
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getTokenAddress() {
    return tokenAddress;
  }
  public void setTokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getWithdrawableFromBatchId() {
    return withdrawableFromBatchId;
  }
  public void setWithdrawableFromBatchId(String withdrawableFromBatchId) {
    this.withdrawableFromBatchId = withdrawableFromBatchId;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCreateEpoch() {
    return createEpoch;
  }
  public void setCreateEpoch(String createEpoch) {
    this.createEpoch = createEpoch;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCreateBatchId() {
    return createBatchId;
  }
  public void setCreateBatchId(String createBatchId) {
    this.createBatchId = createBatchId;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getTxHash() {
    return txHash;
  }
  public void setTxHash(String txHash) {
    this.txHash = txHash;
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
    DexWithdrawRequestDTO dexWithdrawRequestDTO = (DexWithdrawRequestDTO) o;
    return (this.entryTime == null ? dexWithdrawRequestDTO.entryTime == null : this.entryTime.equals(dexWithdrawRequestDTO.entryTime)) &&
        (this.recvTime == null ? dexWithdrawRequestDTO.recvTime == null : this.recvTime.equals(dexWithdrawRequestDTO.recvTime)) &&
        (this.blockNumber == null ? dexWithdrawRequestDTO.blockNumber == null : this.blockNumber.equals(dexWithdrawRequestDTO.blockNumber)) &&
        (this.id == null ? dexWithdrawRequestDTO.id == null : this.id.equals(dexWithdrawRequestDTO.id)) &&
        (this.user == null ? dexWithdrawRequestDTO.user == null : this.user.equals(dexWithdrawRequestDTO.user)) &&
        (this.tokenAddress == null ? dexWithdrawRequestDTO.tokenAddress == null : this.tokenAddress.equals(dexWithdrawRequestDTO.tokenAddress)) &&
        (this.amount == null ? dexWithdrawRequestDTO.amount == null : this.amount.equals(dexWithdrawRequestDTO.amount)) &&
        (this.withdrawableFromBatchId == null ? dexWithdrawRequestDTO.withdrawableFromBatchId == null : this.withdrawableFromBatchId.equals(dexWithdrawRequestDTO.withdrawableFromBatchId)) &&
        (this.createEpoch == null ? dexWithdrawRequestDTO.createEpoch == null : this.createEpoch.equals(dexWithdrawRequestDTO.createEpoch)) &&
        (this.createBatchId == null ? dexWithdrawRequestDTO.createBatchId == null : this.createBatchId.equals(dexWithdrawRequestDTO.createBatchId)) &&
        (this.txHash == null ? dexWithdrawRequestDTO.txHash == null : this.txHash.equals(dexWithdrawRequestDTO.txHash)) &&
        (this.vid == null ? dexWithdrawRequestDTO.vid == null : this.vid.equals(dexWithdrawRequestDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.tokenAddress == null ? 0: this.tokenAddress.hashCode());
    result = 31 * result + (this.amount == null ? 0: this.amount.hashCode());
    result = 31 * result + (this.withdrawableFromBatchId == null ? 0: this.withdrawableFromBatchId.hashCode());
    result = 31 * result + (this.createEpoch == null ? 0: this.createEpoch.hashCode());
    result = 31 * result + (this.createBatchId == null ? 0: this.createBatchId.hashCode());
    result = 31 * result + (this.txHash == null ? 0: this.txHash.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DexWithdrawRequestDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  tokenAddress: ").append(tokenAddress).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  withdrawableFromBatchId: ").append(withdrawableFromBatchId).append("\n");
    sb.append("  createEpoch: ").append(createEpoch).append("\n");
    sb.append("  createBatchId: ").append(createBatchId).append("\n");
    sb.append("  txHash: ").append(txHash).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
