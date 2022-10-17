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

@ApiModel(description = "")
public class TokenHourDataV3DTO {
  
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
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPeriodStartUnix() {
    return periodStartUnix;
  }
  public void setPeriodStartUnix(Integer periodStartUnix) {
    this.periodStartUnix = periodStartUnix;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVolume() {
    return volume;
  }
  public void setVolume(String volume) {
    this.volume = volume;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getVolumeUsd() {
    return volumeUsd;
  }
  public void setVolumeUsd(String volumeUsd) {
    this.volumeUsd = volumeUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUntrackedVolumeUsd() {
    return untrackedVolumeUsd;
  }
  public void setUntrackedVolumeUsd(String untrackedVolumeUsd) {
    this.untrackedVolumeUsd = untrackedVolumeUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTotalValueLocked() {
    return totalValueLocked;
  }
  public void setTotalValueLocked(String totalValueLocked) {
    this.totalValueLocked = totalValueLocked;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTotalValueLockedUsd() {
    return totalValueLockedUsd;
  }
  public void setTotalValueLockedUsd(String totalValueLockedUsd) {
    this.totalValueLockedUsd = totalValueLockedUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPriceUsd() {
    return priceUsd;
  }
  public void setPriceUsd(String priceUsd) {
    this.priceUsd = priceUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFeesUsd() {
    return feesUsd;
  }
  public void setFeesUsd(String feesUsd) {
    this.feesUsd = feesUsd;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOpen() {
    return open;
  }
  public void setOpen(String open) {
    this.open = open;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHigh() {
    return high;
  }
  public void setHigh(String high) {
    this.high = high;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLow() {
    return low;
  }
  public void setLow(String low) {
    this.low = low;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClose() {
    return close;
  }
  public void setClose(String close) {
    this.close = close;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenHourDataV3DTO tokenHourDataV3DTO = (TokenHourDataV3DTO) o;
    return (this.entryTime == null ? tokenHourDataV3DTO.entryTime == null : this.entryTime.equals(tokenHourDataV3DTO.entryTime)) &&
        (this.recvTime == null ? tokenHourDataV3DTO.recvTime == null : this.recvTime.equals(tokenHourDataV3DTO.recvTime)) &&
        (this.blockNumber == null ? tokenHourDataV3DTO.blockNumber == null : this.blockNumber.equals(tokenHourDataV3DTO.blockNumber)) &&
        (this.id == null ? tokenHourDataV3DTO.id == null : this.id.equals(tokenHourDataV3DTO.id)) &&
        (this.periodStartUnix == null ? tokenHourDataV3DTO.periodStartUnix == null : this.periodStartUnix.equals(tokenHourDataV3DTO.periodStartUnix)) &&
        (this.token == null ? tokenHourDataV3DTO.token == null : this.token.equals(tokenHourDataV3DTO.token)) &&
        (this.volume == null ? tokenHourDataV3DTO.volume == null : this.volume.equals(tokenHourDataV3DTO.volume)) &&
        (this.volumeUsd == null ? tokenHourDataV3DTO.volumeUsd == null : this.volumeUsd.equals(tokenHourDataV3DTO.volumeUsd)) &&
        (this.untrackedVolumeUsd == null ? tokenHourDataV3DTO.untrackedVolumeUsd == null : this.untrackedVolumeUsd.equals(tokenHourDataV3DTO.untrackedVolumeUsd)) &&
        (this.totalValueLocked == null ? tokenHourDataV3DTO.totalValueLocked == null : this.totalValueLocked.equals(tokenHourDataV3DTO.totalValueLocked)) &&
        (this.totalValueLockedUsd == null ? tokenHourDataV3DTO.totalValueLockedUsd == null : this.totalValueLockedUsd.equals(tokenHourDataV3DTO.totalValueLockedUsd)) &&
        (this.priceUsd == null ? tokenHourDataV3DTO.priceUsd == null : this.priceUsd.equals(tokenHourDataV3DTO.priceUsd)) &&
        (this.feesUsd == null ? tokenHourDataV3DTO.feesUsd == null : this.feesUsd.equals(tokenHourDataV3DTO.feesUsd)) &&
        (this.open == null ? tokenHourDataV3DTO.open == null : this.open.equals(tokenHourDataV3DTO.open)) &&
        (this.high == null ? tokenHourDataV3DTO.high == null : this.high.equals(tokenHourDataV3DTO.high)) &&
        (this.low == null ? tokenHourDataV3DTO.low == null : this.low.equals(tokenHourDataV3DTO.low)) &&
        (this.close == null ? tokenHourDataV3DTO.close == null : this.close.equals(tokenHourDataV3DTO.close)) &&
        (this.vid == null ? tokenHourDataV3DTO.vid == null : this.vid.equals(tokenHourDataV3DTO.vid));
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
    sb.append("class TokenHourDataV3DTO {\n");
    
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