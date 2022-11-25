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
package org.openapitools.client.api

import java.time.OffsetDateTime
import org.openapitools.client.model.OrderDTO
import org.openapitools.client.model.SettlementDTO
import org.openapitools.client.model.TokenDTO
import org.openapitools.client.model.TradeDTO
import org.openapitools.client.model.UserDTO
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object CowApi {

  def apply(baseUrl: String = "https://onchain.coinapi.io") = new CowApi(baseUrl)
}

class CowApi(baseUrl: String) {

  /**
   * Gets orders.
   * 
   * Expected answers:
   *   code 200 : Seq[OrderDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id User's address.
   */
  def cowGetOrdersHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[OrderDTO]] =
    ApiRequest[Seq[OrderDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/orders/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[OrderDTO]](200)
      

  /**
   * Gets settlements.
   * 
   * Expected answers:
   *   code 200 : Seq[SettlementDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Transaction hash.
   */
  def cowGetSettlementsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[SettlementDTO]] =
    ApiRequest[Seq[SettlementDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/settlements/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[SettlementDTO]](200)
      

  /**
   * Gets tokens.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Token's address.
   * @param address Token's address.
   * @param name Token name fetched by ERC20 contract call.
   * @param symbol Token symbol fetched by contract call.
   */
  def cowGetTokensHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, address: Option[String] = None, name: Option[String] = None, symbol: Option[String] = None): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/tokens/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("address", address)
      .withQueryParam("name", name)
      .withQueryParam("symbol", symbol)
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets trades.
   * 
   * Expected answers:
   *   code 200 : Seq[TradeDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param sellToken 
   * @param buyToken 
   */
  def cowGetTradesHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, sellToken: Option[String] = None, buyToken: Option[String] = None): ApiRequest[Seq[TradeDTO]] =
    ApiRequest[Seq[TradeDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/trades/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("sell_token", sellToken)
      .withQueryParam("buy_token", buyToken)
      .withSuccessResponse[Seq[TradeDTO]](200)
      

  /**
   * Gets users.
   * 
   * Expected answers:
   *   code 200 : Seq[UserDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id User's address.
   * @param address User's address.
   */
  def cowGetUsersHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, address: Option[String] = None): ApiRequest[Seq[UserDTO]] =
    ApiRequest[Seq[UserDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/users/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("address", address)
      .withSuccessResponse[Seq[UserDTO]](200)
      

  /**
   * Gets orders.
   * 
   * Expected answers:
   *   code 200 : Seq[OrderDTO] (successful operation)
   */
  def cowOrdersCurrent(): ApiRequest[Seq[OrderDTO]] =
    ApiRequest[Seq[OrderDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/orders/current", "application/json")
      .withSuccessResponse[Seq[OrderDTO]](200)
      

  /**
   * Gets settlements.
   * 
   * Expected answers:
   *   code 200 : Seq[SettlementDTO] (successful operation)
   */
  def cowSettlementsCurrent(): ApiRequest[Seq[SettlementDTO]] =
    ApiRequest[Seq[SettlementDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/settlements/current", "application/json")
      .withSuccessResponse[Seq[SettlementDTO]](200)
      

  /**
   * Gets tokens.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDTO] (successful operation)
   */
  def cowTokensCurrent(): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/tokens/current", "application/json")
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets trades.
   * 
   * Expected answers:
   *   code 200 : Seq[TradeDTO] (successful operation)
   */
  def cowTradesCurrent(): ApiRequest[Seq[TradeDTO]] =
    ApiRequest[Seq[TradeDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/trades/current", "application/json")
      .withSuccessResponse[Seq[TradeDTO]](200)
      

  /**
   * Gets users.
   * 
   * Expected answers:
   *   code 200 : Seq[UserDTO] (successful operation)
   */
  def cowUsersCurrent(): ApiRequest[Seq[UserDTO]] =
    ApiRequest[Seq[UserDTO]](ApiMethods.GET, baseUrl, "/dapps/cow/users/current", "application/json")
      .withSuccessResponse[Seq[UserDTO]](200)
      



}

