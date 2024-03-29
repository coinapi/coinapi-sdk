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
public class UniswapV3TransactionDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("timestamp")
  private String timestamp = null;
  @SerializedName("gas_used")
  private String gasUsed = null;
  @SerializedName("gas_price")
  private String gasPrice = null;
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
   * Timestamp txn was confirmed.
   **/
  @ApiModelProperty(value = "Timestamp txn was confirmed.")
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Gas used during txn execution.
   **/
  @ApiModelProperty(value = "Gas used during txn execution.")
  public String getGasUsed() {
    return gasUsed;
  }
  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getGasPrice() {
    return gasPrice;
  }
  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
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
    UniswapV3TransactionDTO uniswapV3TransactionDTO = (UniswapV3TransactionDTO) o;
    return (this.entryTime == null ? uniswapV3TransactionDTO.entryTime == null : this.entryTime.equals(uniswapV3TransactionDTO.entryTime)) &&
        (this.recvTime == null ? uniswapV3TransactionDTO.recvTime == null : this.recvTime.equals(uniswapV3TransactionDTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV3TransactionDTO.blockNumber == null : this.blockNumber.equals(uniswapV3TransactionDTO.blockNumber)) &&
        (this.id == null ? uniswapV3TransactionDTO.id == null : this.id.equals(uniswapV3TransactionDTO.id)) &&
        (this.timestamp == null ? uniswapV3TransactionDTO.timestamp == null : this.timestamp.equals(uniswapV3TransactionDTO.timestamp)) &&
        (this.gasUsed == null ? uniswapV3TransactionDTO.gasUsed == null : this.gasUsed.equals(uniswapV3TransactionDTO.gasUsed)) &&
        (this.gasPrice == null ? uniswapV3TransactionDTO.gasPrice == null : this.gasPrice.equals(uniswapV3TransactionDTO.gasPrice)) &&
        (this.vid == null ? uniswapV3TransactionDTO.vid == null : this.vid.equals(uniswapV3TransactionDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.gasUsed == null ? 0: this.gasUsed.hashCode());
    result = 31 * result + (this.gasPrice == null ? 0: this.gasPrice.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV3TransactionDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  gasUsed: ").append(gasUsed).append("\n");
    sb.append("  gasPrice: ").append(gasPrice).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
