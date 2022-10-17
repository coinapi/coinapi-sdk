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
import org.openapitools.client.model.BigInteger;
import org.openapitools.client.model.ETradeAggressiveSide;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SwapV2DTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("vid")
  private Long vid = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("transaction")
  private String transaction = null;
  @SerializedName("timestamp")
  private Date timestamp = null;
  @SerializedName("pair")
  private String pair = null;
  @SerializedName("sender")
  private String sender = null;
  @SerializedName("from")
  private String from = null;
  @SerializedName("amount_0_in")
  private String amount0In = null;
  @SerializedName("amount_1_in")
  private String amount1In = null;
  @SerializedName("amount_0_out")
  private String amount0Out = null;
  @SerializedName("amount_1_out")
  private String amount1Out = null;
  @SerializedName("to")
  private String to = null;
  @SerializedName("log_index")
  private BigInteger logIndex = null;
  @SerializedName("amount_usd")
  private String amountUsd = null;
  @SerializedName("evaluated_price")
  private Double evaluatedPrice = null;
  @SerializedName("evaluated_amount")
  private Double evaluatedAmount = null;
  @SerializedName("evaluated_aggressor")
  private ETradeAggressiveSide evaluatedAggressor = null;
  @SerializedName("pool_id")
  private String poolId = null;
  @SerializedName("transaction_id")
  private String transactionId = null;

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
   **/
  @ApiModelProperty(value = "")
  public Long getBlockNumber() {
    return blockNumber;
  }
  public void setBlockNumber(Long blockNumber) {
    this.blockNumber = blockNumber;
  }

  /**
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
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransaction() {
    return transaction;
  }
  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPair() {
    return pair;
  }
  public void setPair(String pair) {
    this.pair = pair;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSender() {
    return sender;
  }
  public void setSender(String sender) {
    this.sender = sender;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAmount0In() {
    return amount0In;
  }
  public void setAmount0In(String amount0In) {
    this.amount0In = amount0In;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAmount1In() {
    return amount1In;
  }
  public void setAmount1In(String amount1In) {
    this.amount1In = amount1In;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAmount0Out() {
    return amount0Out;
  }
  public void setAmount0Out(String amount0Out) {
    this.amount0Out = amount0Out;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAmount1Out() {
    return amount1Out;
  }
  public void setAmount1Out(String amount1Out) {
    this.amount1Out = amount1Out;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigInteger getLogIndex() {
    return logIndex;
  }
  public void setLogIndex(BigInteger logIndex) {
    this.logIndex = logIndex;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAmountUsd() {
    return amountUsd;
  }
  public void setAmountUsd(String amountUsd) {
    this.amountUsd = amountUsd;
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
  public ETradeAggressiveSide getEvaluatedAggressor() {
    return evaluatedAggressor;
  }
  public void setEvaluatedAggressor(ETradeAggressiveSide evaluatedAggressor) {
    this.evaluatedAggressor = evaluatedAggressor;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwapV2DTO swapV2DTO = (SwapV2DTO) o;
    return (this.entryTime == null ? swapV2DTO.entryTime == null : this.entryTime.equals(swapV2DTO.entryTime)) &&
        (this.recvTime == null ? swapV2DTO.recvTime == null : this.recvTime.equals(swapV2DTO.recvTime)) &&
        (this.blockNumber == null ? swapV2DTO.blockNumber == null : this.blockNumber.equals(swapV2DTO.blockNumber)) &&
        (this.vid == null ? swapV2DTO.vid == null : this.vid.equals(swapV2DTO.vid)) &&
        (this.id == null ? swapV2DTO.id == null : this.id.equals(swapV2DTO.id)) &&
        (this.transaction == null ? swapV2DTO.transaction == null : this.transaction.equals(swapV2DTO.transaction)) &&
        (this.timestamp == null ? swapV2DTO.timestamp == null : this.timestamp.equals(swapV2DTO.timestamp)) &&
        (this.pair == null ? swapV2DTO.pair == null : this.pair.equals(swapV2DTO.pair)) &&
        (this.sender == null ? swapV2DTO.sender == null : this.sender.equals(swapV2DTO.sender)) &&
        (this.from == null ? swapV2DTO.from == null : this.from.equals(swapV2DTO.from)) &&
        (this.amount0In == null ? swapV2DTO.amount0In == null : this.amount0In.equals(swapV2DTO.amount0In)) &&
        (this.amount1In == null ? swapV2DTO.amount1In == null : this.amount1In.equals(swapV2DTO.amount1In)) &&
        (this.amount0Out == null ? swapV2DTO.amount0Out == null : this.amount0Out.equals(swapV2DTO.amount0Out)) &&
        (this.amount1Out == null ? swapV2DTO.amount1Out == null : this.amount1Out.equals(swapV2DTO.amount1Out)) &&
        (this.to == null ? swapV2DTO.to == null : this.to.equals(swapV2DTO.to)) &&
        (this.logIndex == null ? swapV2DTO.logIndex == null : this.logIndex.equals(swapV2DTO.logIndex)) &&
        (this.amountUsd == null ? swapV2DTO.amountUsd == null : this.amountUsd.equals(swapV2DTO.amountUsd)) &&
        (this.evaluatedPrice == null ? swapV2DTO.evaluatedPrice == null : this.evaluatedPrice.equals(swapV2DTO.evaluatedPrice)) &&
        (this.evaluatedAmount == null ? swapV2DTO.evaluatedAmount == null : this.evaluatedAmount.equals(swapV2DTO.evaluatedAmount)) &&
        (this.evaluatedAggressor == null ? swapV2DTO.evaluatedAggressor == null : this.evaluatedAggressor.equals(swapV2DTO.evaluatedAggressor)) &&
        (this.poolId == null ? swapV2DTO.poolId == null : this.poolId.equals(swapV2DTO.poolId)) &&
        (this.transactionId == null ? swapV2DTO.transactionId == null : this.transactionId.equals(swapV2DTO.transactionId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.transaction == null ? 0: this.transaction.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.pair == null ? 0: this.pair.hashCode());
    result = 31 * result + (this.sender == null ? 0: this.sender.hashCode());
    result = 31 * result + (this.from == null ? 0: this.from.hashCode());
    result = 31 * result + (this.amount0In == null ? 0: this.amount0In.hashCode());
    result = 31 * result + (this.amount1In == null ? 0: this.amount1In.hashCode());
    result = 31 * result + (this.amount0Out == null ? 0: this.amount0Out.hashCode());
    result = 31 * result + (this.amount1Out == null ? 0: this.amount1Out.hashCode());
    result = 31 * result + (this.to == null ? 0: this.to.hashCode());
    result = 31 * result + (this.logIndex == null ? 0: this.logIndex.hashCode());
    result = 31 * result + (this.amountUsd == null ? 0: this.amountUsd.hashCode());
    result = 31 * result + (this.evaluatedPrice == null ? 0: this.evaluatedPrice.hashCode());
    result = 31 * result + (this.evaluatedAmount == null ? 0: this.evaluatedAmount.hashCode());
    result = 31 * result + (this.evaluatedAggressor == null ? 0: this.evaluatedAggressor.hashCode());
    result = 31 * result + (this.poolId == null ? 0: this.poolId.hashCode());
    result = 31 * result + (this.transactionId == null ? 0: this.transactionId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwapV2DTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  transaction: ").append(transaction).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  pair: ").append(pair).append("\n");
    sb.append("  sender: ").append(sender).append("\n");
    sb.append("  from: ").append(from).append("\n");
    sb.append("  amount0In: ").append(amount0In).append("\n");
    sb.append("  amount1In: ").append(amount1In).append("\n");
    sb.append("  amount0Out: ").append(amount0Out).append("\n");
    sb.append("  amount1Out: ").append(amount1Out).append("\n");
    sb.append("  to: ").append(to).append("\n");
    sb.append("  logIndex: ").append(logIndex).append("\n");
    sb.append("  amountUsd: ").append(amountUsd).append("\n");
    sb.append("  evaluatedPrice: ").append(evaluatedPrice).append("\n");
    sb.append("  evaluatedAmount: ").append(evaluatedAmount).append("\n");
    sb.append("  evaluatedAggressor: ").append(evaluatedAggressor).append("\n");
    sb.append("  poolId: ").append(poolId).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}