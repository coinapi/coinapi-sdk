/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class BalanceData {
  
  @SerializedName("asset_id_exchange")
  private String assetIdExchange = null;
  @SerializedName("asset_id_coinapi")
  private String assetIdCoinapi = null;
  @SerializedName("balance")
  private Double balance = null;
  @SerializedName("available")
  private Double available = null;
  @SerializedName("locked")
  private Double locked = null;
  public enum LastUpdatedByEnum {
     INITIALIZATION,  BALANCE_MANAGER,  EXCHANGE, 
  };
  @SerializedName("last_updated_by")
  private LastUpdatedByEnum lastUpdatedBy = null;
  @SerializedName("rate_usd")
  private Double rateUsd = null;
  @SerializedName("traded")
  private Double traded = null;

  /**
   * Exchange currency code.
   **/
  @ApiModelProperty(value = "Exchange currency code.")
  public String getAssetIdExchange() {
    return assetIdExchange;
  }
  public void setAssetIdExchange(String assetIdExchange) {
    this.assetIdExchange = assetIdExchange;
  }

  /**
   * CoinAPI currency code.
   **/
  @ApiModelProperty(value = "CoinAPI currency code.")
  public String getAssetIdCoinapi() {
    return assetIdCoinapi;
  }
  public void setAssetIdCoinapi(String assetIdCoinapi) {
    this.assetIdCoinapi = assetIdCoinapi;
  }

  /**
   * Value of the current total currency balance on the exchange.
   **/
  @ApiModelProperty(value = "Value of the current total currency balance on the exchange.")
  public Double getBalance() {
    return balance;
  }
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  /**
   * Value of the current available currency balance on the exchange that can be used as collateral.
   **/
  @ApiModelProperty(value = "Value of the current available currency balance on the exchange that can be used as collateral.")
  public Double getAvailable() {
    return available;
  }
  public void setAvailable(Double available) {
    this.available = available;
  }

  /**
   * Value of the current locked currency balance by the exchange.
   **/
  @ApiModelProperty(value = "Value of the current locked currency balance by the exchange.")
  public Double getLocked() {
    return locked;
  }
  public void setLocked(Double locked) {
    this.locked = locked;
  }

  /**
   * Source of the last modification. 
   **/
  @ApiModelProperty(value = "Source of the last modification. ")
  public LastUpdatedByEnum getLastUpdatedBy() {
    return lastUpdatedBy;
  }
  public void setLastUpdatedBy(LastUpdatedByEnum lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  /**
   * Current exchange rate to the USD for the single unit of the currency. 
   **/
  @ApiModelProperty(value = "Current exchange rate to the USD for the single unit of the currency. ")
  public Double getRateUsd() {
    return rateUsd;
  }
  public void setRateUsd(Double rateUsd) {
    this.rateUsd = rateUsd;
  }

  /**
   * Value of the current total traded.
   **/
  @ApiModelProperty(value = "Value of the current total traded.")
  public Double getTraded() {
    return traded;
  }
  public void setTraded(Double traded) {
    this.traded = traded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceData balanceData = (BalanceData) o;
    return (this.assetIdExchange == null ? balanceData.assetIdExchange == null : this.assetIdExchange.equals(balanceData.assetIdExchange)) &&
        (this.assetIdCoinapi == null ? balanceData.assetIdCoinapi == null : this.assetIdCoinapi.equals(balanceData.assetIdCoinapi)) &&
        (this.balance == null ? balanceData.balance == null : this.balance.equals(balanceData.balance)) &&
        (this.available == null ? balanceData.available == null : this.available.equals(balanceData.available)) &&
        (this.locked == null ? balanceData.locked == null : this.locked.equals(balanceData.locked)) &&
        (this.lastUpdatedBy == null ? balanceData.lastUpdatedBy == null : this.lastUpdatedBy.equals(balanceData.lastUpdatedBy)) &&
        (this.rateUsd == null ? balanceData.rateUsd == null : this.rateUsd.equals(balanceData.rateUsd)) &&
        (this.traded == null ? balanceData.traded == null : this.traded.equals(balanceData.traded));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.assetIdExchange == null ? 0: this.assetIdExchange.hashCode());
    result = 31 * result + (this.assetIdCoinapi == null ? 0: this.assetIdCoinapi.hashCode());
    result = 31 * result + (this.balance == null ? 0: this.balance.hashCode());
    result = 31 * result + (this.available == null ? 0: this.available.hashCode());
    result = 31 * result + (this.locked == null ? 0: this.locked.hashCode());
    result = 31 * result + (this.lastUpdatedBy == null ? 0: this.lastUpdatedBy.hashCode());
    result = 31 * result + (this.rateUsd == null ? 0: this.rateUsd.hashCode());
    result = 31 * result + (this.traded == null ? 0: this.traded.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceData {\n");
    
    sb.append("  assetIdExchange: ").append(assetIdExchange).append("\n");
    sb.append("  assetIdCoinapi: ").append(assetIdCoinapi).append("\n");
    sb.append("  balance: ").append(balance).append("\n");
    sb.append("  available: ").append(available).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  lastUpdatedBy: ").append(lastUpdatedBy).append("\n");
    sb.append("  rateUsd: ").append(rateUsd).append("\n");
    sb.append("  traded: ").append(traded).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
