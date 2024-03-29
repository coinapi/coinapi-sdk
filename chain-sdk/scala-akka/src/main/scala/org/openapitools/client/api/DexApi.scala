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

import org.openapitools.client.model.BatchDTO
import org.openapitools.client.model.DepositDTO
import java.time.OffsetDateTime
import org.openapitools.client.model.OrderDTO
import org.openapitools.client.model.PriceDTO
import org.openapitools.client.model.SolutionDTO
import org.openapitools.client.model.StatsDTO
import org.openapitools.client.model.TokenDTO
import org.openapitools.client.model.TradeDTO
import org.openapitools.client.model.UserDTO
import org.openapitools.client.model.WithdrawDTO
import org.openapitools.client.model.WithdrawRequestDTO
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object DexApi {

  def apply(baseUrl: String = "https://onchain.coinapi.io") = new DexApi(baseUrl)
}

class DexApi(baseUrl: String) {

  /**
   * Gets batches.
   * 
   * Expected answers:
   *   code 200 : Seq[BatchDTO] (successful operation)
   */
  def dexBatchesCurrent(): ApiRequest[Seq[BatchDTO]] =
    ApiRequest[Seq[BatchDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/batches/current", "application/json")
      .withSuccessResponse[Seq[BatchDTO]](200)
      

  /**
   * Gets deposits.
   * 
   * Expected answers:
   *   code 200 : Seq[DepositDTO] (successful operation)
   */
  def dexDepositsCurrent(): ApiRequest[Seq[DepositDTO]] =
    ApiRequest[Seq[DepositDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/deposits/current", "application/json")
      .withSuccessResponse[Seq[DepositDTO]](200)
      

  /**
   * Gets batches.
   * 
   * Expected answers:
   *   code 200 : Seq[BatchDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Identifier.
   */
  def dexGetBatchesHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[BatchDTO]] =
    ApiRequest[Seq[BatchDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/batches/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[BatchDTO]](200)
      

  /**
   * Gets deposits.
   * 
   * Expected answers:
   *   code 200 : Seq[DepositDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Identifier, format: (transaction hash)-(token id).
   * @param user User address.
   */
  def dexGetDepositsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, user: Option[String] = None): ApiRequest[Seq[DepositDTO]] =
    ApiRequest[Seq[DepositDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/deposits/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("user", user)
      .withSuccessResponse[Seq[DepositDTO]](200)
      

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
   * @param id Identifier, format: (owner address)-(order id)
   * @param buyToken Identifier of token that was bought.
   * @param sellToken Identifier of token that was sold.
   */
  def dexGetOrdersHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, buyToken: Option[String] = None, sellToken: Option[String] = None): ApiRequest[Seq[OrderDTO]] =
    ApiRequest[Seq[OrderDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/orders/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("buy_token", buyToken)
      .withQueryParam("sell_token", sellToken)
      .withSuccessResponse[Seq[OrderDTO]](200)
      

  /**
   * Gets prices.
   * 
   * Expected answers:
   *   code 200 : Seq[PriceDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Identifier, format: (token id)-(batch id).
   */
  def dexGetPricesHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[PriceDTO]] =
    ApiRequest[Seq[PriceDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/prices/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[PriceDTO]](200)
      

  /**
   * Gets solutions.
   * 
   * Expected answers:
   *   code 200 : Seq[SolutionDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id 
   */
  def dexGetSolutionsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[SolutionDTO]] =
    ApiRequest[Seq[SolutionDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/solutions/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[SolutionDTO]](200)
      

  /**
   * Gets stats.
   * 
   * Expected answers:
   *   code 200 : Seq[StatsDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id 
   */
  def dexGetStatsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[StatsDTO]] =
    ApiRequest[Seq[StatsDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/stats/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[StatsDTO]](200)
      

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
   * @param id 
   * @param address 
   * @param symbol 
   * @param name 
   */
  def dexGetTokensHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, address: Option[String] = None, symbol: Option[String] = None, name: Option[String] = None): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/tokens/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("address", address)
      .withQueryParam("symbol", symbol)
      .withQueryParam("name", name)
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets trades.
   * 
   * Expected answers:
   *   code 200 : Seq[TradeDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id 
   * @param buyToken 
   * @param sellToken 
   */
  def dexGetTradesHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, buyToken: Option[String] = None, sellToken: Option[String] = None): ApiRequest[Seq[TradeDTO]] =
    ApiRequest[Seq[TradeDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/trades/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("buy_token", buyToken)
      .withQueryParam("sell_token", sellToken)
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
   * @param id 
   */
  def dexGetUsersHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[UserDTO]] =
    ApiRequest[Seq[UserDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/users/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[UserDTO]](200)
      

  /**
   * Gets withdrawRequests.
   * 
   * Expected answers:
   *   code 200 : Seq[WithdrawRequestDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Identifier, format: (transaction hash)-(id).
   * @param user 
   */
  def dexGetWithdrawRequestsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, user: Option[String] = None): ApiRequest[Seq[WithdrawRequestDTO]] =
    ApiRequest[Seq[WithdrawRequestDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/withdrawRequests/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("user", user)
      .withSuccessResponse[Seq[WithdrawRequestDTO]](200)
      

  /**
   * Gets withdraws.
   * 
   * Expected answers:
   *   code 200 : Seq[WithdrawDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Identifier, format: (transaction hash)-(id).
   * @param user 
   */
  def dexGetWithdrawsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, user: Option[String] = None): ApiRequest[Seq[WithdrawDTO]] =
    ApiRequest[Seq[WithdrawDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/withdraws/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("user", user)
      .withSuccessResponse[Seq[WithdrawDTO]](200)
      

  /**
   * Gets orders.
   * 
   * Expected answers:
   *   code 200 : Seq[OrderDTO] (successful operation)
   */
  def dexOrdersCurrent(): ApiRequest[Seq[OrderDTO]] =
    ApiRequest[Seq[OrderDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/orders/current", "application/json")
      .withSuccessResponse[Seq[OrderDTO]](200)
      

  /**
   * Gets prices.
   * 
   * Expected answers:
   *   code 200 : Seq[PriceDTO] (successful operation)
   */
  def dexPricesCurrent(): ApiRequest[Seq[PriceDTO]] =
    ApiRequest[Seq[PriceDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/prices/current", "application/json")
      .withSuccessResponse[Seq[PriceDTO]](200)
      

  /**
   * Gets solutions.
   * 
   * Expected answers:
   *   code 200 : Seq[SolutionDTO] (successful operation)
   */
  def dexSolutionsCurrent(): ApiRequest[Seq[SolutionDTO]] =
    ApiRequest[Seq[SolutionDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/solutions/current", "application/json")
      .withSuccessResponse[Seq[SolutionDTO]](200)
      

  /**
   * Gets stats.
   * 
   * Expected answers:
   *   code 200 : Seq[StatsDTO] (successful operation)
   */
  def dexStatsCurrent(): ApiRequest[Seq[StatsDTO]] =
    ApiRequest[Seq[StatsDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/stats/current", "application/json")
      .withSuccessResponse[Seq[StatsDTO]](200)
      

  /**
   * Gets tokens.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDTO] (successful operation)
   */
  def dexTokensCurrent(): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/tokens/current", "application/json")
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets trades.
   * 
   * Expected answers:
   *   code 200 : Seq[TradeDTO] (successful operation)
   */
  def dexTradesCurrent(): ApiRequest[Seq[TradeDTO]] =
    ApiRequest[Seq[TradeDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/trades/current", "application/json")
      .withSuccessResponse[Seq[TradeDTO]](200)
      

  /**
   * Gets users.
   * 
   * Expected answers:
   *   code 200 : Seq[UserDTO] (successful operation)
   */
  def dexUsersCurrent(): ApiRequest[Seq[UserDTO]] =
    ApiRequest[Seq[UserDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/users/current", "application/json")
      .withSuccessResponse[Seq[UserDTO]](200)
      

  /**
   * Gets withdrawRequests.
   * 
   * Expected answers:
   *   code 200 : Seq[WithdrawRequestDTO] (successful operation)
   */
  def dexWithdrawRequestsCurrent(): ApiRequest[Seq[WithdrawRequestDTO]] =
    ApiRequest[Seq[WithdrawRequestDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/withdrawRequests/current", "application/json")
      .withSuccessResponse[Seq[WithdrawRequestDTO]](200)
      

  /**
   * Gets withdraws.
   * 
   * Expected answers:
   *   code 200 : Seq[WithdrawDTO] (successful operation)
   */
  def dexWithdrawsCurrent(): ApiRequest[Seq[WithdrawDTO]] =
    ApiRequest[Seq[WithdrawDTO]](ApiMethods.GET, baseUrl, "/dapps/dex/withdraws/current", "application/json")
      .withSuccessResponse[Seq[WithdrawDTO]](200)
      



}

