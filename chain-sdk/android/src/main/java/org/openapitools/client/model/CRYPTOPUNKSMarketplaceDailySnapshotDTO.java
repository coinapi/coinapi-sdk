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
public class CRYPTOPUNKSMarketplaceDailySnapshotDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private String blockNumber = null;
  @SerializedName("vid")
  private Long vid = null;
  @SerializedName("block_range")
  private String blockRange = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("marketplace")
  private String marketplace = null;
  @SerializedName("timestamp")
  private String timestamp = null;
  @SerializedName("collection_count")
  private Integer collectionCount = null;
  @SerializedName("cumulative_trade_volume_eth")
  private String cumulativeTradeVolumeEth = null;
  @SerializedName("marketplace_revenue_eth")
  private String marketplaceRevenueEth = null;
  @SerializedName("creator_revenue_eth")
  private String creatorRevenueEth = null;
  @SerializedName("total_revenue_eth")
  private String totalRevenueEth = null;
  @SerializedName("trade_count")
  private Integer tradeCount = null;
  @SerializedName("cumulative_unique_traders")
  private Integer cumulativeUniqueTraders = null;
  @SerializedName("daily_active_traders")
  private Integer dailyActiveTraders = null;
  @SerializedName("daily_traded_collection_count")
  private Integer dailyTradedCollectionCount = null;
  @SerializedName("daily_traded_item_count")
  private Integer dailyTradedItemCount = null;

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
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBlockNumber() {
    return blockNumber;
  }
  public void setBlockNumber(String blockNumber) {
    this.blockNumber = blockNumber;
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
  public String getMarketplace() {
    return marketplace;
  }
  public void setMarketplace(String marketplace) {
    this.marketplace = marketplace;
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
  public Integer getCollectionCount() {
    return collectionCount;
  }
  public void setCollectionCount(Integer collectionCount) {
    this.collectionCount = collectionCount;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCumulativeTradeVolumeEth() {
    return cumulativeTradeVolumeEth;
  }
  public void setCumulativeTradeVolumeEth(String cumulativeTradeVolumeEth) {
    this.cumulativeTradeVolumeEth = cumulativeTradeVolumeEth;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getMarketplaceRevenueEth() {
    return marketplaceRevenueEth;
  }
  public void setMarketplaceRevenueEth(String marketplaceRevenueEth) {
    this.marketplaceRevenueEth = marketplaceRevenueEth;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getCreatorRevenueEth() {
    return creatorRevenueEth;
  }
  public void setCreatorRevenueEth(String creatorRevenueEth) {
    this.creatorRevenueEth = creatorRevenueEth;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getTotalRevenueEth() {
    return totalRevenueEth;
  }
  public void setTotalRevenueEth(String totalRevenueEth) {
    this.totalRevenueEth = totalRevenueEth;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getTradeCount() {
    return tradeCount;
  }
  public void setTradeCount(Integer tradeCount) {
    this.tradeCount = tradeCount;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getCumulativeUniqueTraders() {
    return cumulativeUniqueTraders;
  }
  public void setCumulativeUniqueTraders(Integer cumulativeUniqueTraders) {
    this.cumulativeUniqueTraders = cumulativeUniqueTraders;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getDailyActiveTraders() {
    return dailyActiveTraders;
  }
  public void setDailyActiveTraders(Integer dailyActiveTraders) {
    this.dailyActiveTraders = dailyActiveTraders;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getDailyTradedCollectionCount() {
    return dailyTradedCollectionCount;
  }
  public void setDailyTradedCollectionCount(Integer dailyTradedCollectionCount) {
    this.dailyTradedCollectionCount = dailyTradedCollectionCount;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public Integer getDailyTradedItemCount() {
    return dailyTradedItemCount;
  }
  public void setDailyTradedItemCount(Integer dailyTradedItemCount) {
    this.dailyTradedItemCount = dailyTradedItemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CRYPTOPUNKSMarketplaceDailySnapshotDTO cRYPTOPUNKSMarketplaceDailySnapshotDTO = (CRYPTOPUNKSMarketplaceDailySnapshotDTO) o;
    return (this.entryTime == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.entryTime == null : this.entryTime.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.entryTime)) &&
        (this.recvTime == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.recvTime == null : this.recvTime.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.recvTime)) &&
        (this.blockNumber == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.blockNumber == null : this.blockNumber.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.blockNumber)) &&
        (this.vid == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.vid == null : this.vid.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.vid)) &&
        (this.blockRange == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.blockRange == null : this.blockRange.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.blockRange)) &&
        (this.id == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.id == null : this.id.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.id)) &&
        (this.marketplace == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.marketplace == null : this.marketplace.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.marketplace)) &&
        (this.timestamp == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.timestamp == null : this.timestamp.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.timestamp)) &&
        (this.collectionCount == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.collectionCount == null : this.collectionCount.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.collectionCount)) &&
        (this.cumulativeTradeVolumeEth == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.cumulativeTradeVolumeEth == null : this.cumulativeTradeVolumeEth.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.cumulativeTradeVolumeEth)) &&
        (this.marketplaceRevenueEth == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.marketplaceRevenueEth == null : this.marketplaceRevenueEth.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.marketplaceRevenueEth)) &&
        (this.creatorRevenueEth == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.creatorRevenueEth == null : this.creatorRevenueEth.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.creatorRevenueEth)) &&
        (this.totalRevenueEth == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.totalRevenueEth == null : this.totalRevenueEth.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.totalRevenueEth)) &&
        (this.tradeCount == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.tradeCount == null : this.tradeCount.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.tradeCount)) &&
        (this.cumulativeUniqueTraders == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.cumulativeUniqueTraders == null : this.cumulativeUniqueTraders.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.cumulativeUniqueTraders)) &&
        (this.dailyActiveTraders == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.dailyActiveTraders == null : this.dailyActiveTraders.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.dailyActiveTraders)) &&
        (this.dailyTradedCollectionCount == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.dailyTradedCollectionCount == null : this.dailyTradedCollectionCount.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.dailyTradedCollectionCount)) &&
        (this.dailyTradedItemCount == null ? cRYPTOPUNKSMarketplaceDailySnapshotDTO.dailyTradedItemCount == null : this.dailyTradedItemCount.equals(cRYPTOPUNKSMarketplaceDailySnapshotDTO.dailyTradedItemCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.blockRange == null ? 0: this.blockRange.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.marketplace == null ? 0: this.marketplace.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.collectionCount == null ? 0: this.collectionCount.hashCode());
    result = 31 * result + (this.cumulativeTradeVolumeEth == null ? 0: this.cumulativeTradeVolumeEth.hashCode());
    result = 31 * result + (this.marketplaceRevenueEth == null ? 0: this.marketplaceRevenueEth.hashCode());
    result = 31 * result + (this.creatorRevenueEth == null ? 0: this.creatorRevenueEth.hashCode());
    result = 31 * result + (this.totalRevenueEth == null ? 0: this.totalRevenueEth.hashCode());
    result = 31 * result + (this.tradeCount == null ? 0: this.tradeCount.hashCode());
    result = 31 * result + (this.cumulativeUniqueTraders == null ? 0: this.cumulativeUniqueTraders.hashCode());
    result = 31 * result + (this.dailyActiveTraders == null ? 0: this.dailyActiveTraders.hashCode());
    result = 31 * result + (this.dailyTradedCollectionCount == null ? 0: this.dailyTradedCollectionCount.hashCode());
    result = 31 * result + (this.dailyTradedItemCount == null ? 0: this.dailyTradedItemCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CRYPTOPUNKSMarketplaceDailySnapshotDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  blockRange: ").append(blockRange).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  marketplace: ").append(marketplace).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  collectionCount: ").append(collectionCount).append("\n");
    sb.append("  cumulativeTradeVolumeEth: ").append(cumulativeTradeVolumeEth).append("\n");
    sb.append("  marketplaceRevenueEth: ").append(marketplaceRevenueEth).append("\n");
    sb.append("  creatorRevenueEth: ").append(creatorRevenueEth).append("\n");
    sb.append("  totalRevenueEth: ").append(totalRevenueEth).append("\n");
    sb.append("  tradeCount: ").append(tradeCount).append("\n");
    sb.append("  cumulativeUniqueTraders: ").append(cumulativeUniqueTraders).append("\n");
    sb.append("  dailyActiveTraders: ").append(dailyActiveTraders).append("\n");
    sb.append("  dailyTradedCollectionCount: ").append(dailyTradedCollectionCount).append("\n");
    sb.append("  dailyTradedItemCount: ").append(dailyTradedItemCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
