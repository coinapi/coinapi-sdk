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
package org.openapitools.client.api

import java.time.OffsetDateTime
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object BundlesApi {

  def apply(baseUrl: String = "https://onchain.coinapi.io") = new BundlesApi(baseUrl)
}

class BundlesApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 :  (Success)
   * 
   * @param chainId 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def chainsChainIdDappsSushiswapBundlesHistoricalGet(chainId: String, startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, baseUrl, "/chains/{chain_id}/dapps/sushiswap/bundles/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withPathParam("chain_id", chainId)
      .withSuccessResponse[Unit](200)
      

  /**
   * Expected answers:
   *   code 200 :  (Success)
   * 
   * @param chainId 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def chainsChainIdDappsUniswapv2BundlesHistoricalGet(chainId: String, startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, baseUrl, "/chains/{chain_id}/dapps/uniswapv2/bundles/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withPathParam("chain_id", chainId)
      .withSuccessResponse[Unit](200)
      

  /**
   * Expected answers:
   *   code 200 :  (Success)
   * 
   * @param chainId 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def chainsChainIdDappsUniswapv3BundlesHistoricalGet(chainId: String, startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, baseUrl, "/chains/{chain_id}/dapps/uniswapv3/bundles/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withPathParam("chain_id", chainId)
      .withSuccessResponse[Unit](200)
      



}

