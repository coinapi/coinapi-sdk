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
 * A settlement comprises a list of traded tokens with their corresponding price in the batch.
 **/
@ApiModel(description = "A settlement comprises a list of traded tokens with their corresponding price in the batch.")
public class CowSettlementDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("solver")
  private String solver = null;
  @SerializedName("tx_hash")
  private String txHash = null;
  @SerializedName("first_trade_timestamp")
  private String firstTradeTimestamp = null;
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
   * Transaction hash.
   **/
  @ApiModelProperty(value = "Transaction hash.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Solver's address.
   **/
  @ApiModelProperty(value = "Solver's address.")
  public String getSolver() {
    return solver;
  }
  public void setSolver(String solver) {
    this.solver = solver;
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
   * First trade timestamp.
   **/
  @ApiModelProperty(value = "First trade timestamp.")
  public String getFirstTradeTimestamp() {
    return firstTradeTimestamp;
  }
  public void setFirstTradeTimestamp(String firstTradeTimestamp) {
    this.firstTradeTimestamp = firstTradeTimestamp;
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
    CowSettlementDTO cowSettlementDTO = (CowSettlementDTO) o;
    return (this.entryTime == null ? cowSettlementDTO.entryTime == null : this.entryTime.equals(cowSettlementDTO.entryTime)) &&
        (this.recvTime == null ? cowSettlementDTO.recvTime == null : this.recvTime.equals(cowSettlementDTO.recvTime)) &&
        (this.blockNumber == null ? cowSettlementDTO.blockNumber == null : this.blockNumber.equals(cowSettlementDTO.blockNumber)) &&
        (this.id == null ? cowSettlementDTO.id == null : this.id.equals(cowSettlementDTO.id)) &&
        (this.solver == null ? cowSettlementDTO.solver == null : this.solver.equals(cowSettlementDTO.solver)) &&
        (this.txHash == null ? cowSettlementDTO.txHash == null : this.txHash.equals(cowSettlementDTO.txHash)) &&
        (this.firstTradeTimestamp == null ? cowSettlementDTO.firstTradeTimestamp == null : this.firstTradeTimestamp.equals(cowSettlementDTO.firstTradeTimestamp)) &&
        (this.vid == null ? cowSettlementDTO.vid == null : this.vid.equals(cowSettlementDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.solver == null ? 0: this.solver.hashCode());
    result = 31 * result + (this.txHash == null ? 0: this.txHash.hashCode());
    result = 31 * result + (this.firstTradeTimestamp == null ? 0: this.firstTradeTimestamp.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CowSettlementDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  solver: ").append(solver).append("\n");
    sb.append("  txHash: ").append(txHash).append("\n");
    sb.append("  firstTradeTimestamp: ").append(firstTradeTimestamp).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
