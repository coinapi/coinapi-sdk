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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Stores aggregated information for a specific token across all pairs that token is included in.
 **/
@ApiModel(description = "Stores aggregated information for a specific token across all pairs that token is included in.")
public class UniswapV2TokenDTO {
  
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
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("decimals")
  private Integer decimals = null;
  @SerializedName("total_supply")
  private NumericsBigInteger totalSupply = null;
  @SerializedName("trade_volume")
  private String tradeVolume = null;
  @SerializedName("trade_volume_usd")
  private String tradeVolumeUsd = null;
  @SerializedName("untracked_volume_usd")
  private String untrackedVolumeUsd = null;
  @SerializedName("tx_count")
  private NumericsBigInteger txCount = null;
  @SerializedName("total_liquidity")
  private String totalLiquidity = null;
  @SerializedName("derived_eth")
  private String derivedEth = null;
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
   * Token address.
   **/
  @ApiModelProperty(value = "Token address.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Token symbol.
   **/
  @ApiModelProperty(value = "Token symbol.")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * Token name.
   **/
  @ApiModelProperty(value = "Token name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Token decimals.
   **/
  @ApiModelProperty(value = "Token decimals.")
  public Integer getDecimals() {
    return decimals;
  }
  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getTotalSupply() {
    return totalSupply;
  }
  public void setTotalSupply(NumericsBigInteger totalSupply) {
    this.totalSupply = totalSupply;
  }

  /**
   * Amount of token traded all time across all pairs.
   **/
  @ApiModelProperty(value = "Amount of token traded all time across all pairs.")
  public String getTradeVolume() {
    return tradeVolume;
  }
  public void setTradeVolume(String tradeVolume) {
    this.tradeVolume = tradeVolume;
  }

  /**
   * Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).
   **/
  @ApiModelProperty(value = "Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).")
  public String getTradeVolumeUsd() {
    return tradeVolumeUsd;
  }
  public void setTradeVolumeUsd(String tradeVolumeUsd) {
    this.tradeVolumeUsd = tradeVolumeUsd;
  }

  /**
   * Amount of token in USD traded all time across pairs (no minimum liquidity threshold).
   **/
  @ApiModelProperty(value = "Amount of token in USD traded all time across pairs (no minimum liquidity threshold).")
  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }
  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NumericsBigInteger getTxCount() {
    return txCount;
  }
  public void setTxCount(NumericsBigInteger txCount) {
    this.txCount = txCount;
  }

  /**
   * Total amount of token provided as liquidity across all pairs.
   **/
  @ApiModelProperty(value = "Total amount of token provided as liquidity across all pairs.")
  public String getTotalLiquidity() {
    return totalLiquidity;
  }
  public void setTotalLiquidity(String totalLiquidity) {
    this.totalLiquidity = totalLiquidity;
  }

  /**
   * ETH per token.
   **/
  @ApiModelProperty(value = "ETH per token.")
  public String getDerivedEth() {
    return derivedEth;
  }
  public void setDerivedEth(String derivedEth) {
    this.derivedEth = derivedEth;
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
    UniswapV2TokenDTO uniswapV2TokenDTO = (UniswapV2TokenDTO) o;
    return (this.entryTime == null ? uniswapV2TokenDTO.entryTime == null : this.entryTime.equals(uniswapV2TokenDTO.entryTime)) &&
        (this.recvTime == null ? uniswapV2TokenDTO.recvTime == null : this.recvTime.equals(uniswapV2TokenDTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV2TokenDTO.blockNumber == null : this.blockNumber.equals(uniswapV2TokenDTO.blockNumber)) &&
        (this.vid == null ? uniswapV2TokenDTO.vid == null : this.vid.equals(uniswapV2TokenDTO.vid)) &&
        (this.id == null ? uniswapV2TokenDTO.id == null : this.id.equals(uniswapV2TokenDTO.id)) &&
        (this.symbol == null ? uniswapV2TokenDTO.symbol == null : this.symbol.equals(uniswapV2TokenDTO.symbol)) &&
        (this.name == null ? uniswapV2TokenDTO.name == null : this.name.equals(uniswapV2TokenDTO.name)) &&
        (this.decimals == null ? uniswapV2TokenDTO.decimals == null : this.decimals.equals(uniswapV2TokenDTO.decimals)) &&
        (this.totalSupply == null ? uniswapV2TokenDTO.totalSupply == null : this.totalSupply.equals(uniswapV2TokenDTO.totalSupply)) &&
        (this.tradeVolume == null ? uniswapV2TokenDTO.tradeVolume == null : this.tradeVolume.equals(uniswapV2TokenDTO.tradeVolume)) &&
        (this.tradeVolumeUsd == null ? uniswapV2TokenDTO.tradeVolumeUsd == null : this.tradeVolumeUsd.equals(uniswapV2TokenDTO.tradeVolumeUsd)) &&
        (this.untrackedVolumeUsd == null ? uniswapV2TokenDTO.untrackedVolumeUsd == null : this.untrackedVolumeUsd.equals(uniswapV2TokenDTO.untrackedVolumeUsd)) &&
        (this.txCount == null ? uniswapV2TokenDTO.txCount == null : this.txCount.equals(uniswapV2TokenDTO.txCount)) &&
        (this.totalLiquidity == null ? uniswapV2TokenDTO.totalLiquidity == null : this.totalLiquidity.equals(uniswapV2TokenDTO.totalLiquidity)) &&
        (this.derivedEth == null ? uniswapV2TokenDTO.derivedEth == null : this.derivedEth.equals(uniswapV2TokenDTO.derivedEth)) &&
        (this.tokenSymbol == null ? uniswapV2TokenDTO.tokenSymbol == null : this.tokenSymbol.equals(uniswapV2TokenDTO.tokenSymbol));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.decimals == null ? 0: this.decimals.hashCode());
    result = 31 * result + (this.totalSupply == null ? 0: this.totalSupply.hashCode());
    result = 31 * result + (this.tradeVolume == null ? 0: this.tradeVolume.hashCode());
    result = 31 * result + (this.tradeVolumeUsd == null ? 0: this.tradeVolumeUsd.hashCode());
    result = 31 * result + (this.untrackedVolumeUsd == null ? 0: this.untrackedVolumeUsd.hashCode());
    result = 31 * result + (this.txCount == null ? 0: this.txCount.hashCode());
    result = 31 * result + (this.totalLiquidity == null ? 0: this.totalLiquidity.hashCode());
    result = 31 * result + (this.derivedEth == null ? 0: this.derivedEth.hashCode());
    result = 31 * result + (this.tokenSymbol == null ? 0: this.tokenSymbol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV2TokenDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  decimals: ").append(decimals).append("\n");
    sb.append("  totalSupply: ").append(totalSupply).append("\n");
    sb.append("  tradeVolume: ").append(tradeVolume).append("\n");
    sb.append("  tradeVolumeUsd: ").append(tradeVolumeUsd).append("\n");
    sb.append("  untrackedVolumeUsd: ").append(untrackedVolumeUsd).append("\n");
    sb.append("  txCount: ").append(txCount).append("\n");
    sb.append("  totalLiquidity: ").append(totalLiquidity).append("\n");
    sb.append("  derivedEth: ").append(derivedEth).append("\n");
    sb.append("  tokenSymbol: ").append(tokenSymbol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
