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
   */
  def sushiswapBundlesCurrent(): ApiRequest[Seq[BundleDTO]] =
    ApiRequest[Seq[BundleDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/bundles/current", "application/json")
      .withSuccessResponse[Seq[BundleDTO]](200)
      

  /**
   * Gets burns.
   * 
   * Expected answers:
   *   code 200 : Seq[BurnDTO] (successful operation)
   */
  def sushiswapBurnsCurrent(): ApiRequest[Seq[BurnDTO]] =
    ApiRequest[Seq[BurnDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/burns/current", "application/json")
      .withSuccessResponse[Seq[BurnDTO]](200)
      

  /**
   * Gets dayDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[DayDataDTO] (successful operation)
   */
  def sushiswapDayDatasCurrent(): ApiRequest[Seq[DayDataDTO]] =
    ApiRequest[Seq[DayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/dayDatas/current", "application/json")
      .withSuccessResponse[Seq[DayDataDTO]](200)
      

  /**
   * Gets factorys.
   * 
   * Expected answers:
   *   code 200 : Seq[FactoryDTO] (successful operation)
   */
  def sushiswapFactorysCurrent(): ApiRequest[Seq[FactoryDTO]] =
    ApiRequest[Seq[FactoryDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/factorys/current", "application/json")
      .withSuccessResponse[Seq[FactoryDTO]](200)
      

  /**
   * Gets bundles.
   * 
   * Expected answers:
   *   code 200 : Seq[BundleDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Hardcoded to '1'.
   */
  def sushiswapGetBundlesHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[BundleDTO]] =
    ApiRequest[Seq[BundleDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/bundles/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
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
   * @param id 
   * @param pair 
   */
  def sushiswapGetBurnsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pair: Option[String] = None): ApiRequest[Seq[BurnDTO]] =
    ApiRequest[Seq[BurnDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/burns/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pair", pair)
      .withSuccessResponse[Seq[BurnDTO]](200)
      

  /**
   * Gets dayDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[DayDataDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Unix timestamp for start of day / 86400 giving a unique day index.
   */
  def sushiswapGetDayDatasHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[DayDataDTO]] =
    ApiRequest[Seq[DayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/dayDatas/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[DayDataDTO]](200)
      

  /**
   * Gets factorys.
   * 
   * Expected answers:
   *   code 200 : Seq[FactoryDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Factory address.
   */
  def sushiswapGetFactorysHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[FactoryDTO]] =
    ApiRequest[Seq[FactoryDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/factorys/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[FactoryDTO]](200)
      

  /**
   * Gets hourDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[HourDataDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Start of hour timestamp.
   */
  def sushiswapGetHourDatasHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[HourDataDTO]] =
    ApiRequest[Seq[HourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/hourDatas/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[HourDataDTO]](200)
      

  /**
   * Gets liquidityPositionSnapshots.
   * 
   * Expected answers:
   *   code 200 : Seq[LiquidityPositionSnapshotDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param user 
   * @param pair 
   */
  def sushiswapGetLiquidityPositionSnapshotsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, user: Option[String] = None, pair: Option[String] = None): ApiRequest[Seq[LiquidityPositionSnapshotDTO]] =
    ApiRequest[Seq[LiquidityPositionSnapshotDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/liquidityPositionSnapshots/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("user", user)
      .withQueryParam("pair", pair)
      .withSuccessResponse[Seq[LiquidityPositionSnapshotDTO]](200)
      

  /**
   * Gets liquidityPositions.
   * 
   * Expected answers:
   *   code 200 : Seq[LiquidityPositionDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param user 
   * @param pair 
   */
  def sushiswapGetLiquidityPositionsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, user: Option[String] = None, pair: Option[String] = None): ApiRequest[Seq[LiquidityPositionDTO]] =
    ApiRequest[Seq[LiquidityPositionDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/liquidityPositions/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("user", user)
      .withQueryParam("pair", pair)
      .withSuccessResponse[Seq[LiquidityPositionDTO]](200)
      

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
   * @param id 
   * @param pair 
   */
  def sushiswapGetMintsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pair: Option[String] = None): ApiRequest[Seq[MintDTO]] =
    ApiRequest[Seq[MintDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/mints/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pair", pair)
      .withSuccessResponse[Seq[MintDTO]](200)
      

  /**
   * Gets pairDayDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[PairDayDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param pair 
   * @param token0 
   * @param token1 
   */
  def sushiswapGetPairDayDatasHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pair: Option[String] = None, token0: Option[String] = None, token1: Option[String] = None): ApiRequest[Seq[PairDayDataDTO]] =
    ApiRequest[Seq[PairDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/pairDayDatas/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pair", pair)
      .withQueryParam("token_0", token0)
      .withQueryParam("token_1", token1)
      .withSuccessResponse[Seq[PairDayDataDTO]](200)
      

  /**
   * Gets pairHourDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[PairHourDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param pair 
   */
  def sushiswapGetPairHourDatasHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pair: Option[String] = None): ApiRequest[Seq[PairHourDataDTO]] =
    ApiRequest[Seq[PairHourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/pairHourDatas/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pair", pair)
      .withSuccessResponse[Seq[PairHourDataDTO]](200)
      

  /**
   * Gets pairs.
   * 
   * Expected answers:
   *   code 200 : Seq[PairDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param name 
   * @param token0 
   * @param token1 
   */
  def sushiswapGetPairsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, name: Option[String] = None, token0: Option[String] = None, token1: Option[String] = None): ApiRequest[Seq[PairDTO]] =
    ApiRequest[Seq[PairDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/pairs/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("name", name)
      .withQueryParam("token_0", token0)
      .withQueryParam("token_1", token1)
      .withSuccessResponse[Seq[PairDTO]](200)
      

  /**
   * Gets swaps.
   * 
   * Expected answers:
   *   code 200 : Seq[SwapDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Transaction hash plus index in Transaction swap array.
   * @param pair Reference to pair.
   */
  def sushiswapGetSwapsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pair: Option[String] = None): ApiRequest[Seq[SwapDTO]] =
    ApiRequest[Seq[SwapDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/swaps/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pair", pair)
      .withSuccessResponse[Seq[SwapDTO]](200)
      

  /**
   * Gets tokenDayDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDayDataDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Identifier, day start timestamp in unix / 86400.
   */
  def sushiswapGetTokenDayDatasHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[TokenDayDataDTO]] =
    ApiRequest[Seq[TokenDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/tokenDayDatas/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[TokenDayDataDTO]](200)
      

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
   * @param id Token address.
   * @param symbol Token symbol.
   * @param name Token name.
   */
  def sushiswapGetTokensHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, symbol: Option[String] = None, name: Option[String] = None): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/tokens/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("symbol", symbol)
      .withQueryParam("name", name)
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets transactions.
   * 
   * Expected answers:
   *   code 200 : Seq[TransactionDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Ethereum transaction hash.
   */
  def sushiswapGetTransactionsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[TransactionDTO]] =
    ApiRequest[Seq[TransactionDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/transactions/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[TransactionDTO]](200)
      

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
   * @param id User address.
   */
  def sushiswapGetUsersHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[UserDTO]] =
    ApiRequest[Seq[UserDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/users/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[UserDTO]](200)
      

  /**
   * Gets hourDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[HourDataDTO] (successful operation)
   */
  def sushiswapHourDatasCurrent(): ApiRequest[Seq[HourDataDTO]] =
    ApiRequest[Seq[HourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/hourDatas/current", "application/json")
      .withSuccessResponse[Seq[HourDataDTO]](200)
      

  /**
   * Gets liquidityPositionSnapshots.
   * 
   * Expected answers:
   *   code 200 : Seq[LiquidityPositionSnapshotDTO] (successful operation)
   */
  def sushiswapLiquidityPositionSnapshotsCurrent(): ApiRequest[Seq[LiquidityPositionSnapshotDTO]] =
    ApiRequest[Seq[LiquidityPositionSnapshotDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/liquidityPositionSnapshots/current", "application/json")
      .withSuccessResponse[Seq[LiquidityPositionSnapshotDTO]](200)
      

  /**
   * Gets liquidityPositions.
   * 
   * Expected answers:
   *   code 200 : Seq[LiquidityPositionDTO] (successful operation)
   */
  def sushiswapLiquidityPositionsCurrent(): ApiRequest[Seq[LiquidityPositionDTO]] =
    ApiRequest[Seq[LiquidityPositionDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/liquidityPositions/current", "application/json")
      .withSuccessResponse[Seq[LiquidityPositionDTO]](200)
      

  /**
   * Gets mints.
   * 
   * Expected answers:
   *   code 200 : Seq[MintDTO] (successful operation)
   */
  def sushiswapMintsCurrent(): ApiRequest[Seq[MintDTO]] =
    ApiRequest[Seq[MintDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/mints/current", "application/json")
      .withSuccessResponse[Seq[MintDTO]](200)
      

  /**
   * Gets pairDayDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[PairDayDataDTO] (successful operation)
   */
  def sushiswapPairDayDatasCurrent(): ApiRequest[Seq[PairDayDataDTO]] =
    ApiRequest[Seq[PairDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/pairDayDatas/current", "application/json")
      .withSuccessResponse[Seq[PairDayDataDTO]](200)
      

  /**
   * Gets pairHourDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[PairHourDataDTO] (successful operation)
   */
  def sushiswapPairHourDatasCurrent(): ApiRequest[Seq[PairHourDataDTO]] =
    ApiRequest[Seq[PairHourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/pairHourDatas/current", "application/json")
      .withSuccessResponse[Seq[PairHourDataDTO]](200)
      

  /**
   * Gets pairs.
   * 
   * Expected answers:
   *   code 200 : Seq[PairDTO] (successful operation)
   * 
   * @param id Pair contract address.
   */
  def sushiswapPairsCurrent(id: Option[String] = None): ApiRequest[Seq[PairDTO]] =
    ApiRequest[Seq[PairDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/pairs/current", "application/json")
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[PairDTO]](200)
      

  /**
   * Gets swaps.
   * 
   * Expected answers:
   *   code 200 : Seq[SwapDTO] (successful operation)
   * 
   * @param pair Reference to pair.
   */
  def sushiswapSwapsCurrent(pair: Option[String] = None): ApiRequest[Seq[SwapDTO]] =
    ApiRequest[Seq[SwapDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/swaps/current", "application/json")
      .withQueryParam("pair", pair)
      .withSuccessResponse[Seq[SwapDTO]](200)
      

  /**
   * Gets tokenDayDatas.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDayDataDTO] (successful operation)
   */
  def sushiswapTokenDayDatasCurrent(): ApiRequest[Seq[TokenDayDataDTO]] =
    ApiRequest[Seq[TokenDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/tokenDayDatas/current", "application/json")
      .withSuccessResponse[Seq[TokenDayDataDTO]](200)
      

  /**
   * Gets tokens.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDTO] (successful operation)
   */
  def sushiswapTokensCurrent(): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/tokens/current", "application/json")
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets transactions.
   * 
   * Expected answers:
   *   code 200 : Seq[TransactionDTO] (successful operation)
   */
  def sushiswapTransactionsCurrent(): ApiRequest[Seq[TransactionDTO]] =
    ApiRequest[Seq[TransactionDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/transactions/current", "application/json")
      .withSuccessResponse[Seq[TransactionDTO]](200)
      

  /**
   * Gets users.
   * 
   * Expected answers:
   *   code 200 : Seq[UserDTO] (successful operation)
   */
  def sushiswapUsersCurrent(): ApiRequest[Seq[UserDTO]] =
    ApiRequest[Seq[UserDTO]](ApiMethods.GET, baseUrl, "/dapps/sushiswap/users/current", "application/json")
      .withSuccessResponse[Seq[UserDTO]](200)
      



}

