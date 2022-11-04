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
import org.openapitools.client.model.NumericsBigInteger;
import org.openapitools.client.model.TransactionsETradeAggressiveSide;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Swap are created for each token swap within a pair.
 **/
@ApiModel(description = "Swap are created for each token swap within a pair.")
public class UniswapV3SwapV3DTO {
  
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
  @SerializedName("pool")
  private String pool = null;
  @SerializedName("token_0")
  private String token0 = null;
  @SerializedName("token_1")
  private String token1 = null;
  @SerializedName("sender")
  private String sender = null;
  @SerializedName("recipient")
  private String recipient = null;
  @SerializedName("origin")
  private String origin = null;
  @SerializedName("amount_0")
  private String amount0 = null;
  @SerializedName("amount_1")
  private String amount1 = null;
  @SerializedName("amount_usd")
  private String amountUsd = null;
  @SerializedName("sqrt_price_x96")
  private NumericsBigInteger sqrtPriceX96 = null;
  @SerializedName("tick")
  private NumericsBigInteger tick = null;
  @SerializedName("log_index")
  private NumericsBigInteger logIndex = null;
  @SerializedName("evaluated_price")
  private Double evaluatedPrice = null;
  @SerializedName("evaluated_amount")
  private Double evaluatedAmount = null;
  @SerializedName("evaluated_aggressor")
  private TransactionsETradeAggressiveSide evaluatedAggressor = null;
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
  public Long getVid() {
    return vid;
  }
  public void setVid(Long vid) {
    this.vid = vid;
  }

  /**
   * Identifier, format: transaction hash + \"#\" + index in swaps Transaction array.
   **/
  @ApiModelProperty(value = "Identifier, format: transaction hash + \"#\" + index in swaps Transaction array.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Pointer to transaction.
   **/
  @ApiModelProperty(value = "Pointer to transaction.")
  public String getTransaction() {
    return transaction;
  }
  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }

  /**
   * Timestamp of transaction.
   **/
  @ApiModelProperty(value = "Timestamp of transaction.")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Pool swap occured within.
   **/
  @ApiModelProperty(value = "Pool swap occured within.")
  public String getPool() {
    return pool;
  }
  public void setPool(String pool) {
    this.pool = pool;
  }

  /**
   * Reference to token0 as stored in pair contract.
   **/
  @ApiModelProperty(value = "Reference to token0 as stored in pair contract.")
  public String getToken0() {
    return token0;
  }
  public void setToken0(String token0) {
    this.token0 = token0;
  }

  /**
   * Reference to token1 as stored in pair contract.
   **/
  @ApiModelProperty(value = "Reference to token1 as stored in pair contract.")
  public String getToken1() {
    return token1;
  }
  public void setToken1(String token1) {
    this.token1 = token1;
  }

  /**
   * Sender of the swap.
   **/
  @ApiModelProperty(value = "Sender of the swap.")
  public String getSender() {
    return sender;
  }
  public void setSender(String sender) {
    this.sender = sender;
  }

  /**
   * Recipient of the swap.
   **/
  @ApiModelProperty(value = "Recipient of the swap.")
  public String getRecipient() {
    return recipient;
  }
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  /**
   * Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
   **/
  @ApiModelProperty(value = "Transaction origin: the EOA (Externally Owned Account) that initiated the transaction")
  public String getOrigin() {
    return origin;
  }
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * Delta of token0 swapped.
   **/
  @ApiModelProperty(value = "Delta of token0 swapped.")
  public String getAmount0() {
    return amount0;
  }
  public void setAmount0(String amount0) {
    this.amount0 = amount0;
  }

  /**
   * Delta of token1 swapped.
   **/
  @ApiModelProperty(value = "Delta of token1 swapped.")
  public String getAmount1() {
    return amount1;
  }
  public void setAmount1(String amount1) {
    this.amount1 = amount1;
  }

  /**
   * Derived amount of tokens sold in USD.
   **/
  @ApiModelProperty(value = "Derived amount of tokens sold in USD.")
  public String getAmountUsd() {
    return amountUsd;
  }
  public void setAmountUsd(String amountUsd) {
    this.amountUsd = amountUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getSqrtPriceX96() {
    return sqrtPriceX96;
  }
  public void setSqrtPriceX96(NumericsBigInteger sqrtPriceX96) {
    this.sqrtPriceX96 = sqrtPriceX96;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getTick() {
    return tick;
  }
  public void setTick(NumericsBigInteger tick) {
    this.tick = tick;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getLogIndex() {
    return logIndex;
  }
  public void setLogIndex(NumericsBigInteger logIndex) {
    this.logIndex = logIndex;
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
    UniswapV3SwapV3DTO uniswapV3SwapV3DTO = (UniswapV3SwapV3DTO) o;
    return (this.entryTime == null ? uniswapV3SwapV3DTO.entryTime == null : this.entryTime.equals(uniswapV3SwapV3DTO.entryTime)) &&
        (this.recvTime == null ? uniswapV3SwapV3DTO.recvTime == null : this.recvTime.equals(uniswapV3SwapV3DTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV3SwapV3DTO.blockNumber == null : this.blockNumber.equals(uniswapV3SwapV3DTO.blockNumber)) &&
        (this.vid == null ? uniswapV3SwapV3DTO.vid == null : this.vid.equals(uniswapV3SwapV3DTO.vid)) &&
        (this.id == null ? uniswapV3SwapV3DTO.id == null : this.id.equals(uniswapV3SwapV3DTO.id)) &&
        (this.transaction == null ? uniswapV3SwapV3DTO.transaction == null : this.transaction.equals(uniswapV3SwapV3DTO.transaction)) &&
        (this.timestamp == null ? uniswapV3SwapV3DTO.timestamp == null : this.timestamp.equals(uniswapV3SwapV3DTO.timestamp)) &&
        (this.pool == null ? uniswapV3SwapV3DTO.pool == null : this.pool.equals(uniswapV3SwapV3DTO.pool)) &&
        (this.token0 == null ? uniswapV3SwapV3DTO.token0 == null : this.token0.equals(uniswapV3SwapV3DTO.token0)) &&
        (this.token1 == null ? uniswapV3SwapV3DTO.token1 == null : this.token1.equals(uniswapV3SwapV3DTO.token1)) &&
        (this.sender == null ? uniswapV3SwapV3DTO.sender == null : this.sender.equals(uniswapV3SwapV3DTO.sender)) &&
        (this.recipient == null ? uniswapV3SwapV3DTO.recipient == null : this.recipient.equals(uniswapV3SwapV3DTO.recipient)) &&
        (this.origin == null ? uniswapV3SwapV3DTO.origin == null : this.origin.equals(uniswapV3SwapV3DTO.origin)) &&
        (this.amount0 == null ? uniswapV3SwapV3DTO.amount0 == null : this.amount0.equals(uniswapV3SwapV3DTO.amount0)) &&
        (this.amount1 == null ? uniswapV3SwapV3DTO.amount1 == null : this.amount1.equals(uniswapV3SwapV3DTO.amount1)) &&
        (this.amountUsd == null ? uniswapV3SwapV3DTO.amountUsd == null : this.amountUsd.equals(uniswapV3SwapV3DTO.amountUsd)) &&
        (this.sqrtPriceX96 == null ? uniswapV3SwapV3DTO.sqrtPriceX96 == null : this.sqrtPriceX96.equals(uniswapV3SwapV3DTO.sqrtPriceX96)) &&
        (this.tick == null ? uniswapV3SwapV3DTO.tick == null : this.tick.equals(uniswapV3SwapV3DTO.tick)) &&
        (this.logIndex == null ? uniswapV3SwapV3DTO.logIndex == null : this.logIndex.equals(uniswapV3SwapV3DTO.logIndex)) &&
        (this.evaluatedPrice == null ? uniswapV3SwapV3DTO.evaluatedPrice == null : this.evaluatedPrice.equals(uniswapV3SwapV3DTO.evaluatedPrice)) &&
        (this.evaluatedAmount == null ? uniswapV3SwapV3DTO.evaluatedAmount == null : this.evaluatedAmount.equals(uniswapV3SwapV3DTO.evaluatedAmount)) &&
        (this.evaluatedAggressor == null ? uniswapV3SwapV3DTO.evaluatedAggressor == null : this.evaluatedAggressor.equals(uniswapV3SwapV3DTO.evaluatedAggressor)) &&
        (this.poolId == null ? uniswapV3SwapV3DTO.poolId == null : this.poolId.equals(uniswapV3SwapV3DTO.poolId)) &&
        (this.transactionId == null ? uniswapV3SwapV3DTO.transactionId == null : this.transactionId.equals(uniswapV3SwapV3DTO.transactionId));
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
    result = 31 * result + (this.pool == null ? 0: this.pool.hashCode());
    result = 31 * result + (this.token0 == null ? 0: this.token0.hashCode());
    result = 31 * result + (this.token1 == null ? 0: this.token1.hashCode());
    result = 31 * result + (this.sender == null ? 0: this.sender.hashCode());
    result = 31 * result + (this.recipient == null ? 0: this.recipient.hashCode());
    result = 31 * result + (this.origin == null ? 0: this.origin.hashCode());
    result = 31 * result + (this.amount0 == null ? 0: this.amount0.hashCode());
    result = 31 * result + (this.amount1 == null ? 0: this.amount1.hashCode());
    result = 31 * result + (this.amountUsd == null ? 0: this.amountUsd.hashCode());
    result = 31 * result + (this.sqrtPriceX96 == null ? 0: this.sqrtPriceX96.hashCode());
    result = 31 * result + (this.tick == null ? 0: this.tick.hashCode());
    result = 31 * result + (this.logIndex == null ? 0: this.logIndex.hashCode());
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
    sb.append("class UniswapV3SwapV3DTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  transaction: ").append(transaction).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  pool: ").append(pool).append("\n");
    sb.append("  token0: ").append(token0).append("\n");
    sb.append("  token1: ").append(token1).append("\n");
    sb.append("  sender: ").append(sender).append("\n");
    sb.append("  recipient: ").append(recipient).append("\n");
    sb.append("  origin: ").append(origin).append("\n");
    sb.append("  amount0: ").append(amount0).append("\n");
    sb.append("  amount1: ").append(amount1).append("\n");
    sb.append("  amountUsd: ").append(amountUsd).append("\n");
    sb.append("  sqrtPriceX96: ").append(sqrtPriceX96).append("\n");
    sb.append("  tick: ").append(tick).append("\n");
    sb.append("  logIndex: ").append(logIndex).append("\n");
    sb.append("  evaluatedPrice: ").append(evaluatedPrice).append("\n");
    sb.append("  evaluatedAmount: ").append(evaluatedAmount).append("\n");
    sb.append("  evaluatedAggressor: ").append(evaluatedAggressor).append("\n");
    sb.append("  poolId: ").append(poolId).append("\n");
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
