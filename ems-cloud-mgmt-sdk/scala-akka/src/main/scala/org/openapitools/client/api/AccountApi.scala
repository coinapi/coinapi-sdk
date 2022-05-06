/**
 * EMS - Managed Cloud REST API
 * This section will provide necessary information about the `CoinAPI EMS Managed Cloud REST API` protocol.  <br/><br/> This API is used to manage the overall deployment of **Execution Management System API** (`EMS API`) software,  which means that in this API, you define the accounts, credentials, and configurations for the order destinations or identify the CoinAPI endpoints where you need to connect to access the `EMS API`.  <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)   ### Endpoints <table>   <thead>     <tr>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Production</td>       <td><code>https://ems-mgmt.coinapi.io/</code></td>     </tr>     <tr>       <td>Sandbox</td>       <td><code>https://ems-mgmt-sandbox.coinapi.io/</code></td>     </tr>   </tbody> </table>  ### Authentication  To use resources that require authorized access, you will need to provide an API key to us when making HTTP requests.  There are 2 methods for passing the API key to us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key`  2. Query string parameter named `apikey`  #### Custom authorization header  You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside>  #### Query string authorization parameter  You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all accounts, then your query string should look like this:  <br/><br/> `GET /v1/accounts?apikey=73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"notice\"> Query string method may be more practical for development activities. </aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.AccountData
import org.openapitools.client.model.GetAccount
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object AccountApi {

  def apply(baseUrl: String = "https://ems-mgmt-sandbox.coinapi.io") = new AccountApi(baseUrl)
}

class AccountApi(baseUrl: String) {

  /**
   * Delete specific exchange account maintained by the EMS API for your subscription.
   * 
   * Expected answers:
   *   code 404 :  (Exchange account not found)
   * 
   * Available security schemes:
   *   APIKeyHeader (apiKey)
   *   APIKeyQueryParam (apiKey)
   * 
   * @param exchangeId Exchange identifier of the account to delete
   */
  def deleteAccount(exchangeId: Seq[String])(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/v1/accounts", "application/json")
      .withApiKey(apiKey, "X-CoinAPI-Key", HEADER)
      .withApiKey(apiKey, "apikey", QUERY)
      .withQueryParam("exchange_id", ArrayValues(exchangeId, MULTI))
      .withErrorResponse[Unit](404)
      

  /**
   * Delete all exchange accounts maintained by the EMS API for your subscription.
   * 
   * Expected answers:
   *   code 200 :  (OK)
   * 
   * Available security schemes:
   *   APIKeyHeader (apiKey)
   *   APIKeyQueryParam (apiKey)
   */
  def deleteAccountAll()(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, baseUrl, "/v1/accounts/all", "application/json")
      .withApiKey(apiKey, "X-CoinAPI-Key", HEADER)
      .withApiKey(apiKey, "apikey", QUERY)
      .withSuccessResponse[Unit](200)
      

  /**
   * Get all accounts maintained for your subscription in the EMS API.
   * 
   * Expected answers:
   *   code 200 : Seq[GetAccount] (OK)
   * 
   * Available security schemes:
   *   APIKeyHeader (apiKey)
   *   APIKeyQueryParam (apiKey)
   * 
   * @param filterExchangeId Exchange id of the specific account to provide single account instead of the list of all accounts
   */
  def getAccount(filterExchangeId: Seq[String])(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[Seq[GetAccount]] =
    ApiRequest[Seq[GetAccount]](ApiMethods.GET, baseUrl, "/v1/accounts", "application/json")
      .withApiKey(apiKey, "X-CoinAPI-Key", HEADER)
      .withApiKey(apiKey, "apikey", QUERY)
      .withQueryParam("filter_exchange_id", ArrayValues(filterExchangeId, MULTI))
      .withSuccessResponse[Seq[GetAccount]](200)
      

  /**
   * Add new or update existing exchange account for your subscription in the EMS API.
   * 
   * Expected answers:
   *   code 400 :  (Invalid exchange id)
   *   code 405 :  (Validation exception)
   * 
   * Available security schemes:
   *   APIKeyHeader (apiKey)
   *   APIKeyQueryParam (apiKey)
   * 
   * @param body Exchange account object that needs to be add/update to the EMS
   */
  def persistAccount(body: AccountData)(implicit apiKey: ApiKeyValue, apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, baseUrl, "/v1/accounts", "application/json")
      .withApiKey(apiKey, "X-CoinAPI-Key", HEADER)
      .withApiKey(apiKey, "apikey", QUERY)
      .withBody(body)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](405)
      



}

