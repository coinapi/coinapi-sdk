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
 * Batch executed. Every batch will contain at least solution with the a set of trades that are executed in it
 **/
@ApiModel(description = "Batch executed. Every batch will contain at least solution with the a set of trades that are executed in it")
public class DexBatchDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("start_epoch")
  private String startEpoch = null;
  @SerializedName("end_epoch")
  private String endEpoch = null;
  @SerializedName("solution")
  private String solution = null;
  @SerializedName("first_solution_epoch")
  private String firstSolutionEpoch = null;
  @SerializedName("last_revert_epoch")
  private String lastRevertEpoch = null;
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
   * Identifier.
   **/
  @ApiModelProperty(value = "Identifier.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Start epoch.
   **/
  @ApiModelProperty(value = "Start epoch.")
  public String getStartEpoch() {
    return startEpoch;
  }
  public void setStartEpoch(String startEpoch) {
    this.startEpoch = startEpoch;
  }

  /**
   * End epoch.
   **/
  @ApiModelProperty(value = "End epoch.")
  public String getEndEpoch() {
    return endEpoch;
  }
  public void setEndEpoch(String endEpoch) {
    this.endEpoch = endEpoch;
  }

  /**
   * Reference to solution.
   **/
  @ApiModelProperty(value = "Reference to solution.")
  public String getSolution() {
    return solution;
  }
  public void setSolution(String solution) {
    this.solution = solution;
  }

  /**
   * First solution epoch.
   **/
  @ApiModelProperty(value = "First solution epoch.")
  public String getFirstSolutionEpoch() {
    return firstSolutionEpoch;
  }
  public void setFirstSolutionEpoch(String firstSolutionEpoch) {
    this.firstSolutionEpoch = firstSolutionEpoch;
  }

  /**
   * Last revert epoch.
   **/
  @ApiModelProperty(value = "Last revert epoch.")
  public String getLastRevertEpoch() {
    return lastRevertEpoch;
  }
  public void setLastRevertEpoch(String lastRevertEpoch) {
    this.lastRevertEpoch = lastRevertEpoch;
  }

  /**
   * Transaction hash.
   **/
  @ApiModelProperty(value = "Transaction hash.")
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
    DexBatchDTO dexBatchDTO = (DexBatchDTO) o;
    return (this.entryTime == null ? dexBatchDTO.entryTime == null : this.entryTime.equals(dexBatchDTO.entryTime)) &&
        (this.recvTime == null ? dexBatchDTO.recvTime == null : this.recvTime.equals(dexBatchDTO.recvTime)) &&
        (this.blockNumber == null ? dexBatchDTO.blockNumber == null : this.blockNumber.equals(dexBatchDTO.blockNumber)) &&
        (this.id == null ? dexBatchDTO.id == null : this.id.equals(dexBatchDTO.id)) &&
        (this.startEpoch == null ? dexBatchDTO.startEpoch == null : this.startEpoch.equals(dexBatchDTO.startEpoch)) &&
        (this.endEpoch == null ? dexBatchDTO.endEpoch == null : this.endEpoch.equals(dexBatchDTO.endEpoch)) &&
        (this.solution == null ? dexBatchDTO.solution == null : this.solution.equals(dexBatchDTO.solution)) &&
        (this.firstSolutionEpoch == null ? dexBatchDTO.firstSolutionEpoch == null : this.firstSolutionEpoch.equals(dexBatchDTO.firstSolutionEpoch)) &&
        (this.lastRevertEpoch == null ? dexBatchDTO.lastRevertEpoch == null : this.lastRevertEpoch.equals(dexBatchDTO.lastRevertEpoch)) &&
        (this.txHash == null ? dexBatchDTO.txHash == null : this.txHash.equals(dexBatchDTO.txHash)) &&
        (this.vid == null ? dexBatchDTO.vid == null : this.vid.equals(dexBatchDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.startEpoch == null ? 0: this.startEpoch.hashCode());
    result = 31 * result + (this.endEpoch == null ? 0: this.endEpoch.hashCode());
    result = 31 * result + (this.solution == null ? 0: this.solution.hashCode());
    result = 31 * result + (this.firstSolutionEpoch == null ? 0: this.firstSolutionEpoch.hashCode());
    result = 31 * result + (this.lastRevertEpoch == null ? 0: this.lastRevertEpoch.hashCode());
    result = 31 * result + (this.txHash == null ? 0: this.txHash.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DexBatchDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  startEpoch: ").append(startEpoch).append("\n");
    sb.append("  endEpoch: ").append(endEpoch).append("\n");
    sb.append("  solution: ").append(solution).append("\n");
    sb.append("  firstSolutionEpoch: ").append(firstSolutionEpoch).append("\n");
    sb.append("  lastRevertEpoch: ").append(lastRevertEpoch).append("\n");
    sb.append("  txHash: ").append(txHash).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}