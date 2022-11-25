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
public class UniswapV3PositionSnapshotDTO {
  
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
  @SerializedName("pool")
  private String pool = null;
  @SerializedName("position")
  private String position = null;
  @SerializedName("timestamp")
  private String timestamp = null;
  @SerializedName("liquidity")
  private String liquidity = null;
  @SerializedName("deposited_token_0")
  private String depositedToken0 = null;
  @SerializedName("deposited_token_1")
  private String depositedToken1 = null;
  @SerializedName("withdrawn_token_0")
  private String withdrawnToken0 = null;
  @SerializedName("withdrawn_token_1")
  private String withdrawnToken1 = null;
  @SerializedName("collected_fees_token_0")
  private String collectedFeesToken0 = null;
  @SerializedName("collected_fees_token_1")
  private String collectedFeesToken1 = null;
  @SerializedName("transaction")
  private String transaction = null;
  @SerializedName("fee_growth_inside_0_last_x128")
  private String feeGrowthInside0LastX128 = null;
  @SerializedName("fee_growth_inside_1_last_x128")
  private String feeGrowthInside1LastX128 = null;
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
   * NFT token identifier, format: <NFT token id>#<block number>
   **/
  @ApiModelProperty(value = "NFT token identifier, format: <NFT token id>#<block number>")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Owner of the NFT.
   **/
  @ApiModelProperty(value = "Owner of the NFT.")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * Pool the position is within.
   **/
  @ApiModelProperty(value = "Pool the position is within.")
  public String getPool() {
    return pool;
  }
  public void setPool(String pool) {
    this.pool = pool;
  }

  /**
   * Position of which the snap was taken of.
   **/
  @ApiModelProperty(value = "Position of which the snap was taken of.")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }

  /**
   * Timestamp of block in which the snap was created.
   **/
  @ApiModelProperty(value = "Timestamp of block in which the snap was created.")
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Total position liquidity.
   **/
  @ApiModelProperty(value = "Total position liquidity.")
  public String getLiquidity() {
    return liquidity;
  }
  public void setLiquidity(String liquidity) {
    this.liquidity = liquidity;
  }

  /**
   * Amount of token 0 ever deposited to position.
   **/
  @ApiModelProperty(value = "Amount of token 0 ever deposited to position.")
  public String getDepositedToken0() {
    return depositedToken0;
  }
  public void setDepositedToken0(String depositedToken0) {
    this.depositedToken0 = depositedToken0;
  }

  /**
   * Amount of token 1 ever deposited to position.
   **/
  @ApiModelProperty(value = "Amount of token 1 ever deposited to position.")
  public String getDepositedToken1() {
    return depositedToken1;
  }
  public void setDepositedToken1(String depositedToken1) {
    this.depositedToken1 = depositedToken1;
  }

  /**
   * Amount of token 0 ever withdrawn from position (without fees).
   **/
  @ApiModelProperty(value = "Amount of token 0 ever withdrawn from position (without fees).")
  public String getWithdrawnToken0() {
    return withdrawnToken0;
  }
  public void setWithdrawnToken0(String withdrawnToken0) {
    this.withdrawnToken0 = withdrawnToken0;
  }

  /**
   * Amount of token 1 ever withdrawn from position (without fees).
   **/
  @ApiModelProperty(value = "Amount of token 1 ever withdrawn from position (without fees).")
  public String getWithdrawnToken1() {
    return withdrawnToken1;
  }
  public void setWithdrawnToken1(String withdrawnToken1) {
    this.withdrawnToken1 = withdrawnToken1;
  }

  /**
   * All time collected fees in token0.
   **/
  @ApiModelProperty(value = "All time collected fees in token0.")
  public String getCollectedFeesToken0() {
    return collectedFeesToken0;
  }
  public void setCollectedFeesToken0(String collectedFeesToken0) {
    this.collectedFeesToken0 = collectedFeesToken0;
  }

  /**
   * All time collected fees in token1.
   **/
  @ApiModelProperty(value = "All time collected fees in token1.")
  public String getCollectedFeesToken1() {
    return collectedFeesToken1;
  }
  public void setCollectedFeesToken1(String collectedFeesToken1) {
    this.collectedFeesToken1 = collectedFeesToken1;
  }

  /**
   * Transaction in which the snapshot was initialized.
   **/
  @ApiModelProperty(value = "Transaction in which the snapshot was initialized.")
  public String getTransaction() {
    return transaction;
  }
  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }

  /**
   * Variable needed for fee computation.
   **/
  @ApiModelProperty(value = "Variable needed for fee computation.")
  public String getFeeGrowthInside0LastX128() {
    return feeGrowthInside0LastX128;
  }
  public void setFeeGrowthInside0LastX128(String feeGrowthInside0LastX128) {
    this.feeGrowthInside0LastX128 = feeGrowthInside0LastX128;
  }

  /**
   * Variable needed for fee computation.
   **/
  @ApiModelProperty(value = "Variable needed for fee computation.")
  public String getFeeGrowthInside1LastX128() {
    return feeGrowthInside1LastX128;
  }
  public void setFeeGrowthInside1LastX128(String feeGrowthInside1LastX128) {
    this.feeGrowthInside1LastX128 = feeGrowthInside1LastX128;
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
    UniswapV3PositionSnapshotDTO uniswapV3PositionSnapshotDTO = (UniswapV3PositionSnapshotDTO) o;
    return (this.entryTime == null ? uniswapV3PositionSnapshotDTO.entryTime == null : this.entryTime.equals(uniswapV3PositionSnapshotDTO.entryTime)) &&
        (this.recvTime == null ? uniswapV3PositionSnapshotDTO.recvTime == null : this.recvTime.equals(uniswapV3PositionSnapshotDTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV3PositionSnapshotDTO.blockNumber == null : this.blockNumber.equals(uniswapV3PositionSnapshotDTO.blockNumber)) &&
        (this.id == null ? uniswapV3PositionSnapshotDTO.id == null : this.id.equals(uniswapV3PositionSnapshotDTO.id)) &&
        (this.owner == null ? uniswapV3PositionSnapshotDTO.owner == null : this.owner.equals(uniswapV3PositionSnapshotDTO.owner)) &&
        (this.pool == null ? uniswapV3PositionSnapshotDTO.pool == null : this.pool.equals(uniswapV3PositionSnapshotDTO.pool)) &&
        (this.position == null ? uniswapV3PositionSnapshotDTO.position == null : this.position.equals(uniswapV3PositionSnapshotDTO.position)) &&
        (this.timestamp == null ? uniswapV3PositionSnapshotDTO.timestamp == null : this.timestamp.equals(uniswapV3PositionSnapshotDTO.timestamp)) &&
        (this.liquidity == null ? uniswapV3PositionSnapshotDTO.liquidity == null : this.liquidity.equals(uniswapV3PositionSnapshotDTO.liquidity)) &&
        (this.depositedToken0 == null ? uniswapV3PositionSnapshotDTO.depositedToken0 == null : this.depositedToken0.equals(uniswapV3PositionSnapshotDTO.depositedToken0)) &&
        (this.depositedToken1 == null ? uniswapV3PositionSnapshotDTO.depositedToken1 == null : this.depositedToken1.equals(uniswapV3PositionSnapshotDTO.depositedToken1)) &&
        (this.withdrawnToken0 == null ? uniswapV3PositionSnapshotDTO.withdrawnToken0 == null : this.withdrawnToken0.equals(uniswapV3PositionSnapshotDTO.withdrawnToken0)) &&
        (this.withdrawnToken1 == null ? uniswapV3PositionSnapshotDTO.withdrawnToken1 == null : this.withdrawnToken1.equals(uniswapV3PositionSnapshotDTO.withdrawnToken1)) &&
        (this.collectedFeesToken0 == null ? uniswapV3PositionSnapshotDTO.collectedFeesToken0 == null : this.collectedFeesToken0.equals(uniswapV3PositionSnapshotDTO.collectedFeesToken0)) &&
        (this.collectedFeesToken1 == null ? uniswapV3PositionSnapshotDTO.collectedFeesToken1 == null : this.collectedFeesToken1.equals(uniswapV3PositionSnapshotDTO.collectedFeesToken1)) &&
        (this.transaction == null ? uniswapV3PositionSnapshotDTO.transaction == null : this.transaction.equals(uniswapV3PositionSnapshotDTO.transaction)) &&
        (this.feeGrowthInside0LastX128 == null ? uniswapV3PositionSnapshotDTO.feeGrowthInside0LastX128 == null : this.feeGrowthInside0LastX128.equals(uniswapV3PositionSnapshotDTO.feeGrowthInside0LastX128)) &&
        (this.feeGrowthInside1LastX128 == null ? uniswapV3PositionSnapshotDTO.feeGrowthInside1LastX128 == null : this.feeGrowthInside1LastX128.equals(uniswapV3PositionSnapshotDTO.feeGrowthInside1LastX128)) &&
        (this.vid == null ? uniswapV3PositionSnapshotDTO.vid == null : this.vid.equals(uniswapV3PositionSnapshotDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.owner == null ? 0: this.owner.hashCode());
    result = 31 * result + (this.pool == null ? 0: this.pool.hashCode());
    result = 31 * result + (this.position == null ? 0: this.position.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.liquidity == null ? 0: this.liquidity.hashCode());
    result = 31 * result + (this.depositedToken0 == null ? 0: this.depositedToken0.hashCode());
    result = 31 * result + (this.depositedToken1 == null ? 0: this.depositedToken1.hashCode());
    result = 31 * result + (this.withdrawnToken0 == null ? 0: this.withdrawnToken0.hashCode());
    result = 31 * result + (this.withdrawnToken1 == null ? 0: this.withdrawnToken1.hashCode());
    result = 31 * result + (this.collectedFeesToken0 == null ? 0: this.collectedFeesToken0.hashCode());
    result = 31 * result + (this.collectedFeesToken1 == null ? 0: this.collectedFeesToken1.hashCode());
    result = 31 * result + (this.transaction == null ? 0: this.transaction.hashCode());
    result = 31 * result + (this.feeGrowthInside0LastX128 == null ? 0: this.feeGrowthInside0LastX128.hashCode());
    result = 31 * result + (this.feeGrowthInside1LastX128 == null ? 0: this.feeGrowthInside1LastX128.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV3PositionSnapshotDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  pool: ").append(pool).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  liquidity: ").append(liquidity).append("\n");
    sb.append("  depositedToken0: ").append(depositedToken0).append("\n");
    sb.append("  depositedToken1: ").append(depositedToken1).append("\n");
    sb.append("  withdrawnToken0: ").append(withdrawnToken0).append("\n");
    sb.append("  withdrawnToken1: ").append(withdrawnToken1).append("\n");
    sb.append("  collectedFeesToken0: ").append(collectedFeesToken0).append("\n");
    sb.append("  collectedFeesToken1: ").append(collectedFeesToken1).append("\n");
    sb.append("  transaction: ").append(transaction).append("\n");
    sb.append("  feeGrowthInside0LastX128: ").append(feeGrowthInside0LastX128).append("\n");
    sb.append("  feeGrowthInside1LastX128: ").append(feeGrowthInside1LastX128).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
