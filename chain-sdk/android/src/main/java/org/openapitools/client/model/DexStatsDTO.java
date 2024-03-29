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
 * A type collecting global stats about this instance of Gnosis Protocol.
 **/
@ApiModel(description = "A type collecting global stats about this instance of Gnosis Protocol.")
public class DexStatsDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("volume_in_owl")
  private String volumeInOwl = null;
  @SerializedName("utility_in_owl")
  private String utilityInOwl = null;
  @SerializedName("owl_burnt")
  private String owlBurnt = null;
  @SerializedName("settled_batch_count")
  private Integer settledBatchCount = null;
  @SerializedName("settled_trade_count")
  private Integer settledTradeCount = null;
  @SerializedName("listed_tokens")
  private Integer listedTokens = null;
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
   * The total volume denominated in OWL (all sell amounts combined).
   **/
  @ApiModelProperty(value = "The total volume denominated in OWL (all sell amounts combined).")
  public String getVolumeInOwl() {
    return volumeInOwl;
  }
  public void setVolumeInOwl(String volumeInOwl) {
    this.volumeInOwl = volumeInOwl;
  }

  /**
   * The total trader surplus in OWL.
   **/
  @ApiModelProperty(value = "The total trader surplus in OWL.")
  public String getUtilityInOwl() {
    return utilityInOwl;
  }
  public void setUtilityInOwl(String utilityInOwl) {
    this.utilityInOwl = utilityInOwl;
  }

  /**
   * The total amount of OWL burnt (equivalent to fees rewarded to solvers).
   **/
  @ApiModelProperty(value = "The total amount of OWL burnt (equivalent to fees rewarded to solvers).")
  public String getOwlBurnt() {
    return owlBurnt;
  }
  public void setOwlBurnt(String owlBurnt) {
    this.owlBurnt = owlBurnt;
  }

  /**
   * The total number of settled batches.
   **/
  @ApiModelProperty(value = "The total number of settled batches.")
  public Integer getSettledBatchCount() {
    return settledBatchCount;
  }
  public void setSettledBatchCount(Integer settledBatchCount) {
    this.settledBatchCount = settledBatchCount;
  }

  /**
   * The total number of settled trades.
   **/
  @ApiModelProperty(value = "The total number of settled trades.")
  public Integer getSettledTradeCount() {
    return settledTradeCount;
  }
  public void setSettledTradeCount(Integer settledTradeCount) {
    this.settledTradeCount = settledTradeCount;
  }

  /**
   * The number of listed tokens.
   **/
  @ApiModelProperty(value = "The number of listed tokens.")
  public Integer getListedTokens() {
    return listedTokens;
  }
  public void setListedTokens(Integer listedTokens) {
    this.listedTokens = listedTokens;
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
    DexStatsDTO dexStatsDTO = (DexStatsDTO) o;
    return (this.entryTime == null ? dexStatsDTO.entryTime == null : this.entryTime.equals(dexStatsDTO.entryTime)) &&
        (this.recvTime == null ? dexStatsDTO.recvTime == null : this.recvTime.equals(dexStatsDTO.recvTime)) &&
        (this.blockNumber == null ? dexStatsDTO.blockNumber == null : this.blockNumber.equals(dexStatsDTO.blockNumber)) &&
        (this.id == null ? dexStatsDTO.id == null : this.id.equals(dexStatsDTO.id)) &&
        (this.volumeInOwl == null ? dexStatsDTO.volumeInOwl == null : this.volumeInOwl.equals(dexStatsDTO.volumeInOwl)) &&
        (this.utilityInOwl == null ? dexStatsDTO.utilityInOwl == null : this.utilityInOwl.equals(dexStatsDTO.utilityInOwl)) &&
        (this.owlBurnt == null ? dexStatsDTO.owlBurnt == null : this.owlBurnt.equals(dexStatsDTO.owlBurnt)) &&
        (this.settledBatchCount == null ? dexStatsDTO.settledBatchCount == null : this.settledBatchCount.equals(dexStatsDTO.settledBatchCount)) &&
        (this.settledTradeCount == null ? dexStatsDTO.settledTradeCount == null : this.settledTradeCount.equals(dexStatsDTO.settledTradeCount)) &&
        (this.listedTokens == null ? dexStatsDTO.listedTokens == null : this.listedTokens.equals(dexStatsDTO.listedTokens)) &&
        (this.vid == null ? dexStatsDTO.vid == null : this.vid.equals(dexStatsDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.volumeInOwl == null ? 0: this.volumeInOwl.hashCode());
    result = 31 * result + (this.utilityInOwl == null ? 0: this.utilityInOwl.hashCode());
    result = 31 * result + (this.owlBurnt == null ? 0: this.owlBurnt.hashCode());
    result = 31 * result + (this.settledBatchCount == null ? 0: this.settledBatchCount.hashCode());
    result = 31 * result + (this.settledTradeCount == null ? 0: this.settledTradeCount.hashCode());
    result = 31 * result + (this.listedTokens == null ? 0: this.listedTokens.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DexStatsDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  volumeInOwl: ").append(volumeInOwl).append("\n");
    sb.append("  utilityInOwl: ").append(utilityInOwl).append("\n");
    sb.append("  owlBurnt: ").append(owlBurnt).append("\n");
    sb.append("  settledBatchCount: ").append(settledBatchCount).append("\n");
    sb.append("  settledTradeCount: ").append(settledTradeCount).append("\n");
    sb.append("  listedTokens: ").append(listedTokens).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
