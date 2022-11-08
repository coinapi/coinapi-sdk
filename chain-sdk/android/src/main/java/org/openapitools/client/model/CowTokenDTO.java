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

/**
 * Stores information for a specific token across all pairs that token is included in.
 **/
@ApiModel(description = "Stores information for a specific token across all pairs that token is included in.")
public class CowTokenDTO {
  
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
  @SerializedName("name")
  private String name = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("decimals")
  private Integer decimals = null;
  @SerializedName("total_volume")
  private String totalVolume = null;
  @SerializedName("vid")
  private Long vid = null;
  @SerializedName("token_symbol")
  private String tokenSymbol = null;

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
   * Token's address.
   **/
  @ApiModelProperty(value = "Token's address.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Token's address.
   **/
  @ApiModelProperty(value = "Token's address.")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * First token trade block timestamp.
   **/
  @ApiModelProperty(value = "First token trade block timestamp.")
  public String getFirstTradeTimestamp() {
    return firstTradeTimestamp;
  }
  public void setFirstTradeTimestamp(String firstTradeTimestamp) {
    this.firstTradeTimestamp = firstTradeTimestamp;
  }

  /**
   * Token name fetched by ERC20 contract call.
   **/
  @ApiModelProperty(value = "Token name fetched by ERC20 contract call.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Token symbol fetched by contract call.
   **/
  @ApiModelProperty(value = "Token symbol fetched by contract call.")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * Token decimals fetched by contract call.
   **/
  @ApiModelProperty(value = "Token decimals fetched by contract call.")
  public Integer getDecimals() {
    return decimals;
  }
  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }

  /**
   * Sum of total amount traded for this token.
   **/
  @ApiModelProperty(value = "Sum of total amount traded for this token.")
  public String getTotalVolume() {
    return totalVolume;
  }
  public void setTotalVolume(String totalVolume) {
    this.totalVolume = totalVolume;
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
   **/
  @ApiModelProperty(value = "")
  public String getTokenSymbol() {
    return tokenSymbol;
  }
  public void setTokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CowTokenDTO cowTokenDTO = (CowTokenDTO) o;
    return (this.entryTime == null ? cowTokenDTO.entryTime == null : this.entryTime.equals(cowTokenDTO.entryTime)) &&
        (this.recvTime == null ? cowTokenDTO.recvTime == null : this.recvTime.equals(cowTokenDTO.recvTime)) &&
        (this.blockNumber == null ? cowTokenDTO.blockNumber == null : this.blockNumber.equals(cowTokenDTO.blockNumber)) &&
        (this.id == null ? cowTokenDTO.id == null : this.id.equals(cowTokenDTO.id)) &&
        (this.address == null ? cowTokenDTO.address == null : this.address.equals(cowTokenDTO.address)) &&
        (this.firstTradeTimestamp == null ? cowTokenDTO.firstTradeTimestamp == null : this.firstTradeTimestamp.equals(cowTokenDTO.firstTradeTimestamp)) &&
        (this.name == null ? cowTokenDTO.name == null : this.name.equals(cowTokenDTO.name)) &&
        (this.symbol == null ? cowTokenDTO.symbol == null : this.symbol.equals(cowTokenDTO.symbol)) &&
        (this.decimals == null ? cowTokenDTO.decimals == null : this.decimals.equals(cowTokenDTO.decimals)) &&
        (this.totalVolume == null ? cowTokenDTO.totalVolume == null : this.totalVolume.equals(cowTokenDTO.totalVolume)) &&
        (this.vid == null ? cowTokenDTO.vid == null : this.vid.equals(cowTokenDTO.vid)) &&
        (this.tokenSymbol == null ? cowTokenDTO.tokenSymbol == null : this.tokenSymbol.equals(cowTokenDTO.tokenSymbol));
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
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.decimals == null ? 0: this.decimals.hashCode());
    result = 31 * result + (this.totalVolume == null ? 0: this.totalVolume.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.tokenSymbol == null ? 0: this.tokenSymbol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CowTokenDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  firstTradeTimestamp: ").append(firstTradeTimestamp).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  decimals: ").append(decimals).append("\n");
    sb.append("  totalVolume: ").append(totalVolume).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  tokenSymbol: ").append(tokenSymbol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
