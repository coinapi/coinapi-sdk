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
 * Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.
 **/
@ApiModel(description = "Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.")
public class DexOrderDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("owner")
  private String owner = null;
  @SerializedName("order_id")
  private Integer orderId = null;
  @SerializedName("from_batch_id")
  private String fromBatchId = null;
  @SerializedName("from_epoch")
  private String fromEpoch = null;
  @SerializedName("until_batch_id")
  private String untilBatchId = null;
  @SerializedName("until_epoch")
  private String untilEpoch = null;
  @SerializedName("buy_token")
  private String buyToken = null;
  @SerializedName("sell_token")
  private String sellToken = null;
  @SerializedName("price_numerator")
  private String priceNumerator = null;
  @SerializedName("price_denominator")
  private String priceDenominator = null;
  @SerializedName("max_sell_amount")
  private String maxSellAmount = null;
  @SerializedName("min_receive_amount")
  private String minReceiveAmount = null;
  @SerializedName("sold_volume")
  private String soldVolume = null;
  @SerializedName("bought_volume")
  private String boughtVolume = null;
  @SerializedName("create_epoch")
  private String createEpoch = null;
  @SerializedName("cancel_epoch")
  private String cancelEpoch = null;
  @SerializedName("delete_epoch")
  private String deleteEpoch = null;
  @SerializedName("tx_hash")
  private String txHash = null;
  @SerializedName("tx_log_index")
  private String txLogIndex = null;
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
   * Identifier, format: <owner address>-<order id>
   **/
  @ApiModelProperty(value = "Identifier, format: <owner address>-<order id>")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Reference to owner.
   **/
  @ApiModelProperty(value = "Reference to owner.")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * Order id.
   **/
  @ApiModelProperty(value = "Order id.")
  public Integer getOrderId() {
    return orderId;
  }
  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  /**
   * Batch id from which order became valid.
   **/
  @ApiModelProperty(value = "Batch id from which order became valid.")
  public String getFromBatchId() {
    return fromBatchId;
  }
  public void setFromBatchId(String fromBatchId) {
    this.fromBatchId = fromBatchId;
  }

  /**
   * Start of epoch in which order was placed and became valid.
   **/
  @ApiModelProperty(value = "Start of epoch in which order was placed and became valid.")
  public String getFromEpoch() {
    return fromEpoch;
  }
  public void setFromEpoch(String fromEpoch) {
    this.fromEpoch = fromEpoch;
  }

  /**
   * Batch id until which trade was still valid.
   **/
  @ApiModelProperty(value = "Batch id until which trade was still valid.")
  public String getUntilBatchId() {
    return untilBatchId;
  }
  public void setUntilBatchId(String untilBatchId) {
    this.untilBatchId = untilBatchId;
  }

  /**
   * End of epoch in which order was placed.
   **/
  @ApiModelProperty(value = "End of epoch in which order was placed.")
  public String getUntilEpoch() {
    return untilEpoch;
  }
  public void setUntilEpoch(String untilEpoch) {
    this.untilEpoch = untilEpoch;
  }

  /**
   * Identifier of token that was bought.
   **/
  @ApiModelProperty(value = "Identifier of token that was bought.")
  public String getBuyToken() {
    return buyToken;
  }
  public void setBuyToken(String buyToken) {
    this.buyToken = buyToken;
  }

  /**
   * Identifier of token that was sold.
   **/
  @ApiModelProperty(value = "Identifier of token that was sold.")
  public String getSellToken() {
    return sellToken;
  }
  public void setSellToken(String sellToken) {
    this.sellToken = sellToken;
  }

  /**
   * Price enumerator.
   **/
  @ApiModelProperty(value = "Price enumerator.")
  public String getPriceNumerator() {
    return priceNumerator;
  }
  public void setPriceNumerator(String priceNumerator) {
    this.priceNumerator = priceNumerator;
  }

  /**
   * Price denominator.
   **/
  @ApiModelProperty(value = "Price denominator.")
  public String getPriceDenominator() {
    return priceDenominator;
  }
  public void setPriceDenominator(String priceDenominator) {
    this.priceDenominator = priceDenominator;
  }

  /**
   * Maximum sell amount.
   **/
  @ApiModelProperty(value = "Maximum sell amount.")
  public String getMaxSellAmount() {
    return maxSellAmount;
  }
  public void setMaxSellAmount(String maxSellAmount) {
    this.maxSellAmount = maxSellAmount;
  }

  /**
   * Minimum receive amount.
   **/
  @ApiModelProperty(value = "Minimum receive amount.")
  public String getMinReceiveAmount() {
    return minReceiveAmount;
  }
  public void setMinReceiveAmount(String minReceiveAmount) {
    this.minReceiveAmount = minReceiveAmount;
  }

  /**
   * Sold volume.
   **/
  @ApiModelProperty(value = "Sold volume.")
  public String getSoldVolume() {
    return soldVolume;
  }
  public void setSoldVolume(String soldVolume) {
    this.soldVolume = soldVolume;
  }

  /**
   * Bought volume.
   **/
  @ApiModelProperty(value = "Bought volume.")
  public String getBoughtVolume() {
    return boughtVolume;
  }
  public void setBoughtVolume(String boughtVolume) {
    this.boughtVolume = boughtVolume;
  }

  /**
   * Epoch in which order was created.
   **/
  @ApiModelProperty(value = "Epoch in which order was created.")
  public String getCreateEpoch() {
    return createEpoch;
  }
  public void setCreateEpoch(String createEpoch) {
    this.createEpoch = createEpoch;
  }

  /**
   * Epoch in which order was cancelled.
   **/
  @ApiModelProperty(value = "Epoch in which order was cancelled.")
  public String getCancelEpoch() {
    return cancelEpoch;
  }
  public void setCancelEpoch(String cancelEpoch) {
    this.cancelEpoch = cancelEpoch;
  }

  /**
   * Epoch in which order was deleted.
   **/
  @ApiModelProperty(value = "Epoch in which order was deleted.")
  public String getDeleteEpoch() {
    return deleteEpoch;
  }
  public void setDeleteEpoch(String deleteEpoch) {
    this.deleteEpoch = deleteEpoch;
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
   * Event index within transaction.
   **/
  @ApiModelProperty(value = "Event index within transaction.")
  public String getTxLogIndex() {
    return txLogIndex;
  }
  public void setTxLogIndex(String txLogIndex) {
    this.txLogIndex = txLogIndex;
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
    DexOrderDTO dexOrderDTO = (DexOrderDTO) o;
    return (this.entryTime == null ? dexOrderDTO.entryTime == null : this.entryTime.equals(dexOrderDTO.entryTime)) &&
        (this.recvTime == null ? dexOrderDTO.recvTime == null : this.recvTime.equals(dexOrderDTO.recvTime)) &&
        (this.blockNumber == null ? dexOrderDTO.blockNumber == null : this.blockNumber.equals(dexOrderDTO.blockNumber)) &&
        (this.id == null ? dexOrderDTO.id == null : this.id.equals(dexOrderDTO.id)) &&
        (this.owner == null ? dexOrderDTO.owner == null : this.owner.equals(dexOrderDTO.owner)) &&
        (this.orderId == null ? dexOrderDTO.orderId == null : this.orderId.equals(dexOrderDTO.orderId)) &&
        (this.fromBatchId == null ? dexOrderDTO.fromBatchId == null : this.fromBatchId.equals(dexOrderDTO.fromBatchId)) &&
        (this.fromEpoch == null ? dexOrderDTO.fromEpoch == null : this.fromEpoch.equals(dexOrderDTO.fromEpoch)) &&
        (this.untilBatchId == null ? dexOrderDTO.untilBatchId == null : this.untilBatchId.equals(dexOrderDTO.untilBatchId)) &&
        (this.untilEpoch == null ? dexOrderDTO.untilEpoch == null : this.untilEpoch.equals(dexOrderDTO.untilEpoch)) &&
        (this.buyToken == null ? dexOrderDTO.buyToken == null : this.buyToken.equals(dexOrderDTO.buyToken)) &&
        (this.sellToken == null ? dexOrderDTO.sellToken == null : this.sellToken.equals(dexOrderDTO.sellToken)) &&
        (this.priceNumerator == null ? dexOrderDTO.priceNumerator == null : this.priceNumerator.equals(dexOrderDTO.priceNumerator)) &&
        (this.priceDenominator == null ? dexOrderDTO.priceDenominator == null : this.priceDenominator.equals(dexOrderDTO.priceDenominator)) &&
        (this.maxSellAmount == null ? dexOrderDTO.maxSellAmount == null : this.maxSellAmount.equals(dexOrderDTO.maxSellAmount)) &&
        (this.minReceiveAmount == null ? dexOrderDTO.minReceiveAmount == null : this.minReceiveAmount.equals(dexOrderDTO.minReceiveAmount)) &&
        (this.soldVolume == null ? dexOrderDTO.soldVolume == null : this.soldVolume.equals(dexOrderDTO.soldVolume)) &&
        (this.boughtVolume == null ? dexOrderDTO.boughtVolume == null : this.boughtVolume.equals(dexOrderDTO.boughtVolume)) &&
        (this.createEpoch == null ? dexOrderDTO.createEpoch == null : this.createEpoch.equals(dexOrderDTO.createEpoch)) &&
        (this.cancelEpoch == null ? dexOrderDTO.cancelEpoch == null : this.cancelEpoch.equals(dexOrderDTO.cancelEpoch)) &&
        (this.deleteEpoch == null ? dexOrderDTO.deleteEpoch == null : this.deleteEpoch.equals(dexOrderDTO.deleteEpoch)) &&
        (this.txHash == null ? dexOrderDTO.txHash == null : this.txHash.equals(dexOrderDTO.txHash)) &&
        (this.txLogIndex == null ? dexOrderDTO.txLogIndex == null : this.txLogIndex.equals(dexOrderDTO.txLogIndex)) &&
        (this.vid == null ? dexOrderDTO.vid == null : this.vid.equals(dexOrderDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.owner == null ? 0: this.owner.hashCode());
    result = 31 * result + (this.orderId == null ? 0: this.orderId.hashCode());
    result = 31 * result + (this.fromBatchId == null ? 0: this.fromBatchId.hashCode());
    result = 31 * result + (this.fromEpoch == null ? 0: this.fromEpoch.hashCode());
    result = 31 * result + (this.untilBatchId == null ? 0: this.untilBatchId.hashCode());
    result = 31 * result + (this.untilEpoch == null ? 0: this.untilEpoch.hashCode());
    result = 31 * result + (this.buyToken == null ? 0: this.buyToken.hashCode());
    result = 31 * result + (this.sellToken == null ? 0: this.sellToken.hashCode());
    result = 31 * result + (this.priceNumerator == null ? 0: this.priceNumerator.hashCode());
    result = 31 * result + (this.priceDenominator == null ? 0: this.priceDenominator.hashCode());
    result = 31 * result + (this.maxSellAmount == null ? 0: this.maxSellAmount.hashCode());
    result = 31 * result + (this.minReceiveAmount == null ? 0: this.minReceiveAmount.hashCode());
    result = 31 * result + (this.soldVolume == null ? 0: this.soldVolume.hashCode());
    result = 31 * result + (this.boughtVolume == null ? 0: this.boughtVolume.hashCode());
    result = 31 * result + (this.createEpoch == null ? 0: this.createEpoch.hashCode());
    result = 31 * result + (this.cancelEpoch == null ? 0: this.cancelEpoch.hashCode());
    result = 31 * result + (this.deleteEpoch == null ? 0: this.deleteEpoch.hashCode());
    result = 31 * result + (this.txHash == null ? 0: this.txHash.hashCode());
    result = 31 * result + (this.txLogIndex == null ? 0: this.txLogIndex.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DexOrderDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  fromBatchId: ").append(fromBatchId).append("\n");
    sb.append("  fromEpoch: ").append(fromEpoch).append("\n");
    sb.append("  untilBatchId: ").append(untilBatchId).append("\n");
    sb.append("  untilEpoch: ").append(untilEpoch).append("\n");
    sb.append("  buyToken: ").append(buyToken).append("\n");
    sb.append("  sellToken: ").append(sellToken).append("\n");
    sb.append("  priceNumerator: ").append(priceNumerator).append("\n");
    sb.append("  priceDenominator: ").append(priceDenominator).append("\n");
    sb.append("  maxSellAmount: ").append(maxSellAmount).append("\n");
    sb.append("  minReceiveAmount: ").append(minReceiveAmount).append("\n");
    sb.append("  soldVolume: ").append(soldVolume).append("\n");
    sb.append("  boughtVolume: ").append(boughtVolume).append("\n");
    sb.append("  createEpoch: ").append(createEpoch).append("\n");
    sb.append("  cancelEpoch: ").append(cancelEpoch).append("\n");
    sb.append("  deleteEpoch: ").append(deleteEpoch).append("\n");
    sb.append("  txHash: ").append(txHash).append("\n");
    sb.append("  txLogIndex: ").append(txLogIndex).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
