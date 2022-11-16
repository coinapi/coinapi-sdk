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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CurveContractVersionDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("contract")
  private String contract = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("version")
  private String version = null;
  @SerializedName("added")
  private String added = null;
  @SerializedName("added_at_block")
  private String addedAtBlock = null;
  @SerializedName("added_at_transaction")
  private String addedAtTransaction = null;
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
  public String getContract() {
    return contract;
  }
  public void setContract(String contract) {
    this.contract = contract;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getAdded() {
    return added;
  }
  public void setAdded(String added) {
    this.added = added;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getAddedAtBlock() {
    return addedAtBlock;
  }
  public void setAddedAtBlock(String addedAtBlock) {
    this.addedAtBlock = addedAtBlock;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getAddedAtTransaction() {
    return addedAtTransaction;
  }
  public void setAddedAtTransaction(String addedAtTransaction) {
    this.addedAtTransaction = addedAtTransaction;
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
    CurveContractVersionDTO curveContractVersionDTO = (CurveContractVersionDTO) o;
    return (this.entryTime == null ? curveContractVersionDTO.entryTime == null : this.entryTime.equals(curveContractVersionDTO.entryTime)) &&
        (this.recvTime == null ? curveContractVersionDTO.recvTime == null : this.recvTime.equals(curveContractVersionDTO.recvTime)) &&
        (this.blockNumber == null ? curveContractVersionDTO.blockNumber == null : this.blockNumber.equals(curveContractVersionDTO.blockNumber)) &&
        (this.id == null ? curveContractVersionDTO.id == null : this.id.equals(curveContractVersionDTO.id)) &&
        (this.contract == null ? curveContractVersionDTO.contract == null : this.contract.equals(curveContractVersionDTO.contract)) &&
        (this.address == null ? curveContractVersionDTO.address == null : this.address.equals(curveContractVersionDTO.address)) &&
        (this.version == null ? curveContractVersionDTO.version == null : this.version.equals(curveContractVersionDTO.version)) &&
        (this.added == null ? curveContractVersionDTO.added == null : this.added.equals(curveContractVersionDTO.added)) &&
        (this.addedAtBlock == null ? curveContractVersionDTO.addedAtBlock == null : this.addedAtBlock.equals(curveContractVersionDTO.addedAtBlock)) &&
        (this.addedAtTransaction == null ? curveContractVersionDTO.addedAtTransaction == null : this.addedAtTransaction.equals(curveContractVersionDTO.addedAtTransaction)) &&
        (this.vid == null ? curveContractVersionDTO.vid == null : this.vid.equals(curveContractVersionDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.contract == null ? 0: this.contract.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.version == null ? 0: this.version.hashCode());
    result = 31 * result + (this.added == null ? 0: this.added.hashCode());
    result = 31 * result + (this.addedAtBlock == null ? 0: this.addedAtBlock.hashCode());
    result = 31 * result + (this.addedAtTransaction == null ? 0: this.addedAtTransaction.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurveContractVersionDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  contract: ").append(contract).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  added: ").append(added).append("\n");
    sb.append("  addedAtBlock: ").append(addedAtBlock).append("\n");
    sb.append("  addedAtTransaction: ").append(addedAtTransaction).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
