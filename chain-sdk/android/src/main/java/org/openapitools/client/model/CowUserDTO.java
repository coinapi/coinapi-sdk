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
public class CowUserDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("first_trade_timestamp")
  private String firstTradeTimestamp = null;
  @SerializedName("is_solver")
  private Boolean isSolver = null;
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
   * User's address.
   **/
  @ApiModelProperty(value = "User's address.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * User's address.
   **/
  @ApiModelProperty(value = "User's address.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * First trade block timestamp.
   **/
  @ApiModelProperty(value = "First trade block timestamp.")
  public String getFirstTradeTimestamp() {
    return firstTradeTimestamp;
  }
  public void setFirstTradeTimestamp(String firstTradeTimestamp) {
    this.firstTradeTimestamp = firstTradeTimestamp;
  }

  /**
   * Determines if user has solved a settlement.
   **/
  @ApiModelProperty(value = "Determines if user has solved a settlement.")
  public Boolean getIsSolver() {
    return isSolver;
  }
  public void setIsSolver(Boolean isSolver) {
    this.isSolver = isSolver;
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
    CowUserDTO cowUserDTO = (CowUserDTO) o;
    return (this.entryTime == null ? cowUserDTO.entryTime == null : this.entryTime.equals(cowUserDTO.entryTime)) &&
        (this.recvTime == null ? cowUserDTO.recvTime == null : this.recvTime.equals(cowUserDTO.recvTime)) &&
        (this.blockNumber == null ? cowUserDTO.blockNumber == null : this.blockNumber.equals(cowUserDTO.blockNumber)) &&
        (this.id == null ? cowUserDTO.id == null : this.id.equals(cowUserDTO.id)) &&
        (this.address == null ? cowUserDTO.address == null : this.address.equals(cowUserDTO.address)) &&
        (this.firstTradeTimestamp == null ? cowUserDTO.firstTradeTimestamp == null : this.firstTradeTimestamp.equals(cowUserDTO.firstTradeTimestamp)) &&
        (this.isSolver == null ? cowUserDTO.isSolver == null : this.isSolver.equals(cowUserDTO.isSolver)) &&
        (this.vid == null ? cowUserDTO.vid == null : this.vid.equals(cowUserDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.firstTradeTimestamp == null ? 0: this.firstTradeTimestamp.hashCode());
    result = 31 * result + (this.isSolver == null ? 0: this.isSolver.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CowUserDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  firstTradeTimestamp: ").append(firstTradeTimestamp).append("\n");
    sb.append("  isSolver: ").append(isSolver).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}