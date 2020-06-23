/**
 * OMS - REST API .
 * OMS Project
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CancelAllOrder {
  
  @SerializedName("exchange_id")
  private String exchangeId = null;

  /**
   * Exchange name
   **/
  @ApiModelProperty(value = "Exchange name")
  public String getExchangeId() {
    return exchangeId;
  }
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelAllOrder cancelAllOrder = (CancelAllOrder) o;
    return (this.exchangeId == null ? cancelAllOrder.exchangeId == null : this.exchangeId.equals(cancelAllOrder.exchangeId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.exchangeId == null ? 0: this.exchangeId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelAllOrder {\n");
    
    sb.append("  exchangeId: ").append(exchangeId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
