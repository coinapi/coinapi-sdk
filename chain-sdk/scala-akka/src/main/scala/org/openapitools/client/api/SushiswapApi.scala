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

import org.openapitools.client.model.BundleDTO
import org.openapitools.client.model.BurnDTO
import org.openapitools.client.model.DayDataDTO
import org.openapitools.client.model.FactoryDTO
import org.openapitools.client.model.HourDataDTO
import org.openapitools.client.model.LiquidityPositionDTO
import org.openapitools.client.model.LiquidityPositionSnapshotDTO
import org.openapitools.client.model.MintDTO
import java.time.OffsetDateTime
import org.openapitools.client.model.PairDTO
import org.openapitools.client.model.PairDayDataDTO
import org.openapitools.client.model.PairHourDataDTO
import org.openapitools.client.model.SwapDTO
import org.openapitools.client.model.TokenDTO
import org.openapitools.client.model.TokenDayDataDTO
import org.openapitools.client.model.TransactionDTO
import org.openapitools.client.model.UserDTO
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object SushiswapApi {

  def apply(baseUrl: String = "https://onchain.coinapi.io") = new SushiswapApi(baseUrl)
}

class SushiswapApi(baseUrl: String) {

  /**
   * Gets bundles.
   * 
   * Expected answers:
   *   code 200 : Seq[BundleDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def sushiswapGetBundlesHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Seq[BundleDTO]] =
    ApiRequest[Seq[BundleDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/bundles/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withSuccessResponse[Seq[BundleDTO]](200)
      

  /**
   * Gets burns.
   * 
   * Expected answers:
   *   code 200 : Seq[BurnDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param poolId 
   */
  def sushiswapGetBurnsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, poolId: Option[String] = None): ApiRequest[Seq[BurnDTO]] =
    ApiRequest[Seq[BurnDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/burns/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("poolId", poolId)
      .withSuccessResponse[Seq[BurnDTO]](200)
      

  /**
   * Gets day data.
   * 
   * Expected answers:
   *   code 200 : Seq[DayDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def sushiswapGetDayDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Seq[DayDataDTO]] =
    ApiRequest[Seq[DayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/dayData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withSuccessResponse[Seq[DayDataDTO]](200)
      

  /**
   * Gets factory.
   * 
   * Expected answers:
   *   code 200 : Seq[FactoryDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def sushiswapGetFactoryHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Seq[FactoryDTO]] =
    ApiRequest[Seq[FactoryDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/factory/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withSuccessResponse[Seq[FactoryDTO]](200)
      

  /**
   * Gets hour data.
   * 
   * Expected answers:
   *   code 200 : Seq[HourDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def sushiswapGetHourDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Seq[HourDataDTO]] =
    ApiRequest[Seq[HourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/hourData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withSuccessResponse[Seq[HourDataDTO]](200)
      

  /**
   * Gets liquidity position.
   * 
   * Expected answers:
   *   code 200 : Seq[LiquidityPositionDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param poolId 
   */
  def sushiswapGetLiquidityPositionHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, poolId: Option[String] = None): ApiRequest[Seq[LiquidityPositionDTO]] =
    ApiRequest[Seq[LiquidityPositionDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/liquidityPosition/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("poolId", poolId)
      .withSuccessResponse[Seq[LiquidityPositionDTO]](200)
      

  /**
   * Gets liquidity position snapshot.
   * 
   * Expected answers:
   *   code 200 : Seq[LiquidityPositionSnapshotDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param poolId 
   */
  def sushiswapGetLiquidityPositionSnapshotHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, poolId: Option[String] = None): ApiRequest[Seq[LiquidityPositionSnapshotDTO]] =
    ApiRequest[Seq[LiquidityPositionSnapshotDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/liquidityPositionSnapshots/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("poolId", poolId)
      .withSuccessResponse[Seq[LiquidityPositionSnapshotDTO]](200)
      

  /**
   * Gets mints.
   * 
   * Expected answers:
   *   code 200 : Seq[MintDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param poolId 
   */
  def sushiswapGetMintsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, poolId: Option[String] = None): ApiRequest[Seq[MintDTO]] =
    ApiRequest[Seq[MintDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/mints/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("poolId", poolId)
      .withSuccessResponse[Seq[MintDTO]](200)
      

  /**
   * Gets pools.
   * 
   * Expected answers:
   *   code 200 : Seq[PairDTO] (successful operation)
   */
  def sushiswapGetPoolsCurrent(): ApiRequest[Seq[PairDTO]] =
    ApiRequest[Seq[PairDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/pools/current", "application/json")
      .withSuccessResponse[Seq[PairDTO]](200)
      

  /**
   * Gets pools day data.
   * 
   * Expected answers:
   *   code 200 : Seq[PairDayDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param poolId 
   */
  def sushiswapGetPoolsDayDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, poolId: Option[String] = None): ApiRequest[Seq[PairDayDataDTO]] =
    ApiRequest[Seq[PairDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/poolsDayData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("poolId", poolId)
      .withSuccessResponse[Seq[PairDayDataDTO]](200)
      

  /**
   * Gets list of pools for given filters.
   * 
   * Expected answers:
   *   code 200 : Seq[PairDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param poolId 
   */
  def sushiswapGetPoolsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, poolId: Option[String] = None): ApiRequest[Seq[PairDTO]] =
    ApiRequest[Seq[PairDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/pools/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("poolId", poolId)
      .withSuccessResponse[Seq[PairDTO]](200)
      

  /**
   * Gets pools tracked each our.
   * 
   * Expected answers:
   *   code 200 : Seq[PairHourDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param poolId 
   */
  def sushiswapGetPoolsHourDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, poolId: Option[String] = None): ApiRequest[Seq[PairHourDataDTO]] =
    ApiRequest[Seq[PairHourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/poolsHourData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("poolId", poolId)
      .withSuccessResponse[Seq[PairHourDataDTO]](200)
      

  /**
   * Gets swaps.
   * 
   * Expected answers:
   *   code 200 : Seq[SwapDTO] (successful operation)
   */
  def sushiswapGetSwapsCurrent(): ApiRequest[Seq[SwapDTO]] =
    ApiRequest[Seq[SwapDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/swaps/current", "application/json")
      .withSuccessResponse[Seq[SwapDTO]](200)
      

  /**
   * Gets list of swaps for given filters.
   * 
   * Expected answers:
   *   code 200 : Seq[SwapDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param poolId 
   */
  def sushiswapGetSwapsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, poolId: Option[String] = None): ApiRequest[Seq[SwapDTO]] =
    ApiRequest[Seq[SwapDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/swaps/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("poolId", poolId)
      .withSuccessResponse[Seq[SwapDTO]](200)
      

  /**
   * Gets tokens.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDTO] (successful operation)
   */
  def sushiswapGetTokensCurrent(): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/tokens/current", "application/json")
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets tokens day data.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDayDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param tokenId 
   */
  def sushiswapGetTokensDayDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, tokenId: Option[String] = None): ApiRequest[Seq[TokenDayDataDTO]] =
    ApiRequest[Seq[TokenDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/tokensDayData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("tokenId", tokenId)
      .withSuccessResponse[Seq[TokenDayDataDTO]](200)
      

  /**
   * Gets list of tokens for given filters.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param tokenId 
   */
  def sushiswapGetTokensHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, tokenId: Option[String] = None): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/tokens/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("tokenId", tokenId)
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets transactions.
   * 
   * Expected answers:
   *   code 200 : Seq[TransactionDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def sushiswapGetTransactionsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Seq[TransactionDTO]] =
    ApiRequest[Seq[TransactionDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/transactions/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withSuccessResponse[Seq[TransactionDTO]](200)
      

  /**
   * Gets users.
   * 
   * Expected answers:
   *   code 200 : Seq[UserDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   */
  def sushiswapGetUsersHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None): ApiRequest[Seq[UserDTO]] =
    ApiRequest[Seq[UserDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/users/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withSuccessResponse[Seq[UserDTO]](200)
      



}

