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
import org.openapitools.client.model.TransactionsETradeAggressiveSide;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Trade for a single user, as part of a ring trade. It&#39;s part of the solution submitted by a solver for a given batch.
 **/
@ApiModel(description = "Trade for a single user, as part of a ring trade. It's part of the solution submitted by a solver for a given batch.")
public class DexTradeDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("order")
  private String order = null;
  @SerializedName("owner")
  private String owner = null;
  @SerializedName("sell_volume")
  private String sellVolume = null;
  @SerializedName("buy_volume")
  private String buyVolume = null;
  @SerializedName("trade_batch_id")
  private String tradeBatchId = null;
  @SerializedName("trade_epoch")
  private String tradeEpoch = null;
  @SerializedName("buy_token")
  private String buyToken = null;
  @SerializedName("sell_token")
  private String sellToken = null;
  @SerializedName("create_epoch")
  private String createEpoch = null;
  @SerializedName("revert_epoch")
  private String revertEpoch = null;
  @SerializedName("tx_hash")
  private String txHash = null;
  @SerializedName("tx_log_index")
  private String txLogIndex = null;
  @SerializedName("vid")
  private Long vid = null;
  @SerializedName("pool_id")
  private String poolId = null;
  @SerializedName("transaction_id")
  private String transactionId = null;
  @SerializedName("evaluated_price")
  private Double evaluatedPrice = null;
  @SerializedName("evaluated_amount")
  private Double evaluatedAmount = null;
  @SerializedName("evaluated_aggressor")
  private TransactionsETradeAggressiveSide evaluatedAggressor = null;

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
  public String getOrder() {
    return order;
  }
  public void setOrder(String order) {
    this.order = order;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getSellVolume() {
    return sellVolume;
  }
  public void setSellVolume(String sellVolume) {
    this.sellVolume = sellVolume;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBuyVolume() {
    return buyVolume;
  }
  public void setBuyVolume(String buyVolume) {
    this.buyVolume = buyVolume;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getTradeBatchId() {
    return tradeBatchId;
  }
  public void setTradeBatchId(String tradeBatchId) {
    this.tradeBatchId = tradeBatchId;
  }

  /**
   * The date of the end of the batch.
   **/
  @ApiModelProperty(value = "The date of the end of the batch.")
  public String getTradeEpoch() {
    return tradeEpoch;
  }
  public void setTradeEpoch(String tradeEpoch) {
    this.tradeEpoch = tradeEpoch;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getBuyToken() {
    return buyToken;
  }
  public void setBuyToken(String buyToken) {
    this.buyToken = buyToken;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getSellToken() {
    return sellToken;
  }
  public void setSellToken(String sellToken) {
    this.sellToken = sellToken;
  }

  /**
   * The date where the transaction was mined.
   **/
  @ApiModelProperty(value = "The date where the transaction was mined.")
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
  public String getRevertEpoch() {
    return revertEpoch;
  }
  public void setRevertEpoch(String revertEpoch) {
    this.revertEpoch = revertEpoch;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPoolId() {
    return poolId;
  }
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getEvaluatedPrice() {
    return evaluatedPrice;
  }
  public void setEvaluatedPrice(Double evaluatedPrice) {
    this.evaluatedPrice = evaluatedPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getEvaluatedAmount() {
    return evaluatedAmount;
  }
  public void setEvaluatedAmount(Double evaluatedAmount) {
    this.evaluatedAmount = evaluatedAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TransactionsETradeAggressiveSide getEvaluatedAggressor() {
    return evaluatedAggressor;
  }
  public void setEvaluatedAggressor(TransactionsETradeAggressiveSide evaluatedAggressor) {
    this.evaluatedAggressor = evaluatedAggressor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DexTradeDTO dexTradeDTO = (DexTradeDTO) o;
    return (this.entryTime == null ? dexTradeDTO.entryTime == null : this.entryTime.equals(dexTradeDTO.entryTime)) &&
        (this.recvTime == null ? dexTradeDTO.recvTime == null : this.recvTime.equals(dexTradeDTO.recvTime)) &&
        (this.blockNumber == null ? dexTradeDTO.blockNumber == null : this.blockNumber.equals(dexTradeDTO.blockNumber)) &&
        (this.id == null ? dexTradeDTO.id == null : this.id.equals(dexTradeDTO.id)) &&
        (this.order == null ? dexTradeDTO.order == null : this.order.equals(dexTradeDTO.order)) &&
        (this.owner == null ? dexTradeDTO.owner == null : this.owner.equals(dexTradeDTO.owner)) &&
        (this.sellVolume == null ? dexTradeDTO.sellVolume == null : this.sellVolume.equals(dexTradeDTO.sellVolume)) &&
        (this.buyVolume == null ? dexTradeDTO.buyVolume == null : this.buyVolume.equals(dexTradeDTO.buyVolume)) &&
        (this.tradeBatchId == null ? dexTradeDTO.tradeBatchId == null : this.tradeBatchId.equals(dexTradeDTO.tradeBatchId)) &&
        (this.tradeEpoch == null ? dexTradeDTO.tradeEpoch == null : this.tradeEpoch.equals(dexTradeDTO.tradeEpoch)) &&
        (this.buyToken == null ? dexTradeDTO.buyToken == null : this.buyToken.equals(dexTradeDTO.buyToken)) &&
        (this.sellToken == null ? dexTradeDTO.sellToken == null : this.sellToken.equals(dexTradeDTO.sellToken)) &&
        (this.createEpoch == null ? dexTradeDTO.createEpoch == null : this.createEpoch.equals(dexTradeDTO.createEpoch)) &&
        (this.revertEpoch == null ? dexTradeDTO.revertEpoch == null : this.revertEpoch.equals(dexTradeDTO.revertEpoch)) &&
        (this.txHash == null ? dexTradeDTO.txHash == null : this.txHash.equals(dexTradeDTO.txHash)) &&
        (this.txLogIndex == null ? dexTradeDTO.txLogIndex == null : this.txLogIndex.equals(dexTradeDTO.txLogIndex)) &&
        (this.vid == null ? dexTradeDTO.vid == null : this.vid.equals(dexTradeDTO.vid)) &&
        (this.poolId == null ? dexTradeDTO.poolId == null : this.poolId.equals(dexTradeDTO.poolId)) &&
        (this.transactionId == null ? dexTradeDTO.transactionId == null : this.transactionId.equals(dexTradeDTO.transactionId)) &&
        (this.evaluatedPrice == null ? dexTradeDTO.evaluatedPrice == null : this.evaluatedPrice.equals(dexTradeDTO.evaluatedPrice)) &&
        (this.evaluatedAmount == null ? dexTradeDTO.evaluatedAmount == null : this.evaluatedAmount.equals(dexTradeDTO.evaluatedAmount)) &&
        (this.evaluatedAggressor == null ? dexTradeDTO.evaluatedAggressor == null : this.evaluatedAggressor.equals(dexTradeDTO.evaluatedAggressor));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.order == null ? 0: this.order.hashCode());
    result = 31 * result + (this.owner == null ? 0: this.owner.hashCode());
    result = 31 * result + (this.sellVolume == null ? 0: this.sellVolume.hashCode());
    result = 31 * result + (this.buyVolume == null ? 0: this.buyVolume.hashCode());
    result = 31 * result + (this.tradeBatchId == null ? 0: this.tradeBatchId.hashCode());
    result = 31 * result + (this.tradeEpoch == null ? 0: this.tradeEpoch.hashCode());
    result = 31 * result + (this.buyToken == null ? 0: this.buyToken.hashCode());
    result = 31 * result + (this.sellToken == null ? 0: this.sellToken.hashCode());
    result = 31 * result + (this.createEpoch == null ? 0: this.createEpoch.hashCode());
    result = 31 * result + (this.revertEpoch == null ? 0: this.revertEpoch.hashCode());
    result = 31 * result + (this.txHash == null ? 0: this.txHash.hashCode());
    result = 31 * result + (this.txLogIndex == null ? 0: this.txLogIndex.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.poolId == null ? 0: this.poolId.hashCode());
    result = 31 * result + (this.transactionId == null ? 0: this.transactionId.hashCode());
    result = 31 * result + (this.evaluatedPrice == null ? 0: this.evaluatedPrice.hashCode());
    result = 31 * result + (this.evaluatedAmount == null ? 0: this.evaluatedAmount.hashCode());
    result = 31 * result + (this.evaluatedAggressor == null ? 0: this.evaluatedAggressor.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DexTradeDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  order: ").append(order).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  sellVolume: ").append(sellVolume).append("\n");
    sb.append("  buyVolume: ").append(buyVolume).append("\n");
    sb.append("  tradeBatchId: ").append(tradeBatchId).append("\n");
    sb.append("  tradeEpoch: ").append(tradeEpoch).append("\n");
    sb.append("  buyToken: ").append(buyToken).append("\n");
    sb.append("  sellToken: ").append(sellToken).append("\n");
    sb.append("  createEpoch: ").append(createEpoch).append("\n");
    sb.append("  revertEpoch: ").append(revertEpoch).append("\n");
    sb.append("  txHash: ").append(txHash).append("\n");
    sb.append("  txLogIndex: ").append(txLogIndex).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  poolId: ").append(poolId).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("  evaluatedPrice: ").append(evaluatedPrice).append("\n");
    sb.append("  evaluatedAmount: ").append(evaluatedAmount).append("\n");
    sb.append("  evaluatedAggressor: ").append(evaluatedAggressor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
