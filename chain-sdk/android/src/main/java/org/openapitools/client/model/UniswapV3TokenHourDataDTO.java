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
 * Token data aggregated across all pairs that include token.
 **/
@ApiModel(description = "Token data aggregated across all pairs that include token.")
public class UniswapV3TokenHourDataDTO {
  
  @SerializedName("entry_time")
  private Date entryTime = null;
  @SerializedName("recv_time")
  private Date recvTime = null;
  @SerializedName("block_number")
  private Long blockNumber = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("period_start_unix")
  private Integer periodStartUnix = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("volume")
  private String volume = null;
  @SerializedName("volume_usd")
  private String volumeUsd = null;
  @SerializedName("untracked_volume_usd")
  private String untrackedVolumeUsd = null;
  @SerializedName("total_value_locked")
  private String totalValueLocked = null;
  @SerializedName("total_value_locked_usd")
  private String totalValueLockedUsd = null;
  @SerializedName("price_usd")
  private String priceUsd = null;
  @SerializedName("fees_usd")
  private String feesUsd = null;
  @SerializedName("open")
  private String open = null;
  @SerializedName("high")
  private String high = null;
  @SerializedName("low")
  private String low = null;
  @SerializedName("close")
  private String close = null;
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
   * Token address concatendated with date.
   **/
  @ApiModelProperty(value = "Token address concatendated with date.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Unix timestamp for start of hour.
   **/
  @ApiModelProperty(value = "Unix timestamp for start of hour.")
  public Integer getPeriodStartUnix() {
    return periodStartUnix;
  }
  public void setPeriodStartUnix(Integer periodStartUnix) {
    this.periodStartUnix = periodStartUnix;
  }

  /**
   * Pointer to token.
   **/
  @ApiModelProperty(value = "Pointer to token.")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   * Volume in token units.
   **/
  @ApiModelProperty(value = "Volume in token units.")
  public String getVolume() {
    return volume;
  }
  public void setVolume(String volume) {
    this.volume = volume;
  }

  /**
   * Volume in derived USD.
   **/
  @ApiModelProperty(value = "Volume in derived USD.")
  public String getVolumeUsd() {
    return volumeUsd;
  }
  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  /**
   * Volume in USD even on pools with less reliable USD values.
   **/
  @ApiModelProperty(value = "Volume in USD even on pools with less reliable USD values.")
  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }
  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }

  /**
   * Liquidity across all pools in token units.
   **/
  @ApiModelProperty(value = "Liquidity across all pools in token units.")
  public String getTotalValueLocked() {
    return totalValueLocked;
  }
  public void setTotalValueLocked(String totalValueLocked) {
    this.totalValueLocked = totalValueLocked;
  }

  /**
   * Liquidity across all pools in derived USD.
   **/
  @ApiModelProperty(value = "Liquidity across all pools in derived USD.")
  public String getTotalValueLockedUsd() {
    return totalValueLockedUsd;
  }
  public void setTotalValueLockedUsd(String totalValueLockedUsd) {
    this.totalValueLockedUsd = totalValueLockedUsd;
  }

  /**
   * Price at end of period in USD.
   **/
  @ApiModelProperty(value = "Price at end of period in USD.")
  public String getPriceUsd() {
    return priceUsd;
  }
  public void setPriceUsd(String priceUsd) {
    this.priceUsd = priceUsd;
  }

  /**
   * Fees in USD.
   **/
  @ApiModelProperty(value = "Fees in USD.")
  public String getFeesUsd() {
    return feesUsd;
  }
  public void setFeesUsd(String feesUsd) {
    this.feesUsd = feesUsd;
  }

  /**
   * Opening price USD.
   **/
  @ApiModelProperty(value = "Opening price USD.")
  public String getOpen() {
    return open;
  }
  public void setOpen(String open) {
    this.open = open;
  }

  /**
   * High price USD.
   **/
  @ApiModelProperty(value = "High price USD.")
  public String getHigh() {
    return high;
  }
  public void setHigh(String high) {
    this.high = high;
  }

  /**
   * Low price USD.
   **/
  @ApiModelProperty(value = "Low price USD.")
  public String getLow() {
    return low;
  }
  public void setLow(String low) {
    this.low = low;
  }

  /**
   * Close price USD.
   **/
  @ApiModelProperty(value = "Close price USD.")
  public String getClose() {
    return close;
  }
  public void setClose(String close) {
    this.close = close;
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
    UniswapV3TokenHourDataDTO uniswapV3TokenHourDataDTO = (UniswapV3TokenHourDataDTO) o;
    return (this.entryTime == null ? uniswapV3TokenHourDataDTO.entryTime == null : this.entryTime.equals(uniswapV3TokenHourDataDTO.entryTime)) &&
        (this.recvTime == null ? uniswapV3TokenHourDataDTO.recvTime == null : this.recvTime.equals(uniswapV3TokenHourDataDTO.recvTime)) &&
        (this.blockNumber == null ? uniswapV3TokenHourDataDTO.blockNumber == null : this.blockNumber.equals(uniswapV3TokenHourDataDTO.blockNumber)) &&
        (this.id == null ? uniswapV3TokenHourDataDTO.id == null : this.id.equals(uniswapV3TokenHourDataDTO.id)) &&
        (this.periodStartUnix == null ? uniswapV3TokenHourDataDTO.periodStartUnix == null : this.periodStartUnix.equals(uniswapV3TokenHourDataDTO.periodStartUnix)) &&
        (this.token == null ? uniswapV3TokenHourDataDTO.token == null : this.token.equals(uniswapV3TokenHourDataDTO.token)) &&
        (this.volume == null ? uniswapV3TokenHourDataDTO.volume == null : this.volume.equals(uniswapV3TokenHourDataDTO.volume)) &&
        (this.volumeUsd == null ? uniswapV3TokenHourDataDTO.volumeUsd == null : this.volumeUsd.equals(uniswapV3TokenHourDataDTO.volumeUsd)) &&
        (this.untrackedVolumeUsd == null ? uniswapV3TokenHourDataDTO.untrackedVolumeUsd == null : this.untrackedVolumeUsd.equals(uniswapV3TokenHourDataDTO.untrackedVolumeUsd)) &&
        (this.totalValueLocked == null ? uniswapV3TokenHourDataDTO.totalValueLocked == null : this.totalValueLocked.equals(uniswapV3TokenHourDataDTO.totalValueLocked)) &&
        (this.totalValueLockedUsd == null ? uniswapV3TokenHourDataDTO.totalValueLockedUsd == null : this.totalValueLockedUsd.equals(uniswapV3TokenHourDataDTO.totalValueLockedUsd)) &&
        (this.priceUsd == null ? uniswapV3TokenHourDataDTO.priceUsd == null : this.priceUsd.equals(uniswapV3TokenHourDataDTO.priceUsd)) &&
        (this.feesUsd == null ? uniswapV3TokenHourDataDTO.feesUsd == null : this.feesUsd.equals(uniswapV3TokenHourDataDTO.feesUsd)) &&
        (this.open == null ? uniswapV3TokenHourDataDTO.open == null : this.open.equals(uniswapV3TokenHourDataDTO.open)) &&
        (this.high == null ? uniswapV3TokenHourDataDTO.high == null : this.high.equals(uniswapV3TokenHourDataDTO.high)) &&
        (this.low == null ? uniswapV3TokenHourDataDTO.low == null : this.low.equals(uniswapV3TokenHourDataDTO.low)) &&
        (this.close == null ? uniswapV3TokenHourDataDTO.close == null : this.close.equals(uniswapV3TokenHourDataDTO.close)) &&
        (this.vid == null ? uniswapV3TokenHourDataDTO.vid == null : this.vid.equals(uniswapV3TokenHourDataDTO.vid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.entryTime == null ? 0: this.entryTime.hashCode());
    result = 31 * result + (this.recvTime == null ? 0: this.recvTime.hashCode());
    result = 31 * result + (this.blockNumber == null ? 0: this.blockNumber.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.periodStartUnix == null ? 0: this.periodStartUnix.hashCode());
    result = 31 * result + (this.token == null ? 0: this.token.hashCode());
    result = 31 * result + (this.volume == null ? 0: this.volume.hashCode());
    result = 31 * result + (this.volumeUsd == null ? 0: this.volumeUsd.hashCode());
    result = 31 * result + (this.untrackedVolumeUsd == null ? 0: this.untrackedVolumeUsd.hashCode());
    result = 31 * result + (this.totalValueLocked == null ? 0: this.totalValueLocked.hashCode());
    result = 31 * result + (this.totalValueLockedUsd == null ? 0: this.totalValueLockedUsd.hashCode());
    result = 31 * result + (this.priceUsd == null ? 0: this.priceUsd.hashCode());
    result = 31 * result + (this.feesUsd == null ? 0: this.feesUsd.hashCode());
    result = 31 * result + (this.open == null ? 0: this.open.hashCode());
    result = 31 * result + (this.high == null ? 0: this.high.hashCode());
    result = 31 * result + (this.low == null ? 0: this.low.hashCode());
    result = 31 * result + (this.close == null ? 0: this.close.hashCode());
    result = 31 * result + (this.vid == null ? 0: this.vid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniswapV3TokenHourDataDTO {\n");
    
    sb.append("  entryTime: ").append(entryTime).append("\n");
    sb.append("  recvTime: ").append(recvTime).append("\n");
    sb.append("  blockNumber: ").append(blockNumber).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  periodStartUnix: ").append(periodStartUnix).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  volumeUsd: ").append(volumeUsd).append("\n");
    sb.append("  untrackedVolumeUsd: ").append(untrackedVolumeUsd).append("\n");
    sb.append("  totalValueLocked: ").append(totalValueLocked).append("\n");
    sb.append("  totalValueLockedUsd: ").append(totalValueLockedUsd).append("\n");
    sb.append("  priceUsd: ").append(priceUsd).append("\n");
    sb.append("  feesUsd: ").append(feesUsd).append("\n");
    sb.append("  open: ").append(open).append("\n");
    sb.append("  high: ").append(high).append("\n");
    sb.append("  low: ").append(low).append("\n");
    sb.append("  close: ").append(close).append("\n");
    sb.append("  vid: ").append(vid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
