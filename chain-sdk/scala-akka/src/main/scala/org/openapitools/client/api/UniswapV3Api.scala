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

import org.openapitools.client.model.BundleDTO
import org.openapitools.client.model.BurnDTO
import org.openapitools.client.model.FactoryDTO
import org.openapitools.client.model.MintDTO
import java.time.OffsetDateTime
import org.openapitools.client.model.PoolDTO
import org.openapitools.client.model.PoolDayDataDTO
import org.openapitools.client.model.PoolHourDataDTO
import org.openapitools.client.model.PositionDTO
import org.openapitools.client.model.PositionSnapshotDTO
import org.openapitools.client.model.SwapDTO
import org.openapitools.client.model.TickDTO
import org.openapitools.client.model.TickDayDataDTO
import org.openapitools.client.model.TokenDTO
import org.openapitools.client.model.TokenHourDataDTO
import org.openapitools.client.model.TokenV3DayDataDTO
import org.openapitools.client.model.TransactionDTO
import org.openapitools.client.model.UniswapDayDataDTO
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object UniswapV3Api {

  def apply(baseUrl: String = "https://onchain.coinapi.io") = new UniswapV3Api(baseUrl)
}

class UniswapV3Api(baseUrl: String) {

  /**
   * Gets bundles.
   * 
   * Expected answers:
   *   code 200 : Seq[BundleDTO] (successful operation)
   */
  def uniswapV3BundlesCurrent(): ApiRequest[Seq[BundleDTO]] =
    ApiRequest[Seq[BundleDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/bundles/current", "application/json")
      .withSuccessResponse[Seq[BundleDTO]](200)
      

  /**
   * Gets burns.
   * 
   * Expected answers:
   *   code 200 : Seq[BurnDTO] (successful operation)
   */
  def uniswapV3BurnsCurrent(): ApiRequest[Seq[BurnDTO]] =
    ApiRequest[Seq[BurnDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/burns/current", "application/json")
      .withSuccessResponse[Seq[BurnDTO]](200)
      

  /**
   * Gets factories.
   * 
   * Expected answers:
   *   code 200 : Seq[FactoryDTO] (successful operation)
   */
  def uniswapV3FactoriesCurrent(): ApiRequest[Seq[FactoryDTO]] =
    ApiRequest[Seq[FactoryDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/factories/current", "application/json")
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
   * @param id 
   */
  def uniswapV3GetBundlesHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[BundleDTO]] =
    ApiRequest[Seq[BundleDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/bundles/historical", "application/json")
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
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Transaction hash + '#' + index in mints Transaction array.
   * @param pool Pool position is within.
   * @param token0 Reference to token0 as stored in pool contract.
   * @param token1 Reference to token1 as stored in pool contract.
   */
  def uniswapV3GetBurnsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None, token0: Option[String] = None, token1: Option[String] = None): ApiRequest[Seq[BurnDTO]] =
    ApiRequest[Seq[BurnDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/burns/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withQueryParam("token_0", token0)
      .withQueryParam("token_1", token1)
      .withSuccessResponse[Seq[BurnDTO]](200)
      

  /**
   * Gets factories.
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
  def uniswapV3GetFactoriesHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[FactoryDTO]] =
    ApiRequest[Seq[FactoryDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/factories/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[FactoryDTO]](200)
      

  /**
   * Gets mints.
   * 
   * Expected answers:
   *   code 200 : Seq[MintDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Transaction hash + '#' + index in mints Transaction array.
   * @param pool Pool address.
   * @param token0 Reference to token0 as stored in pool contract.
   * @param token1 Reference to token1 as stored in pool contract.
   */
  def uniswapV3GetMintsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None, token0: Option[String] = None, token1: Option[String] = None): ApiRequest[Seq[MintDTO]] =
    ApiRequest[Seq[MintDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/mints/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withQueryParam("token_0", token0)
      .withQueryParam("token_1", token1)
      .withSuccessResponse[Seq[MintDTO]](200)
      

  /**
   * Gets poolDayData.
   * 
   * Expected answers:
   *   code 200 : Seq[PoolDayDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param pool 
   */
  def uniswapV3GetPoolDayDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None): ApiRequest[Seq[PoolDayDataDTO]] =
    ApiRequest[Seq[PoolDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/poolDayData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withSuccessResponse[Seq[PoolDayDataDTO]](200)
      

  /**
   * Gets poolHourData.
   * 
   * Expected answers:
   *   code 200 : Seq[PoolHourDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param pool 
   */
  def uniswapV3GetPoolHourDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None): ApiRequest[Seq[PoolHourDataDTO]] =
    ApiRequest[Seq[PoolHourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/poolHourData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withSuccessResponse[Seq[PoolHourDataDTO]](200)
      

  /**
   * Gets pools.
   * 
   * Expected answers:
   *   code 200 : Seq[PoolDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Pool address.
   * @param token0 Reference to token0 as stored in pool contract.
   * @param token1 Reference to token1 as stored in pool contract.
   */
  def uniswapV3GetPoolsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, token0: Option[String] = None, token1: Option[String] = None): ApiRequest[Seq[PoolDTO]] =
    ApiRequest[Seq[PoolDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/pools/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("token_0", token0)
      .withQueryParam("token_1", token1)
      .withSuccessResponse[Seq[PoolDTO]](200)
      

  /**
   * Gets positionSnapshots.
   * 
   * Expected answers:
   *   code 200 : Seq[PositionSnapshotDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param pool 
   */
  def uniswapV3GetPositionSnapshotsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None): ApiRequest[Seq[PositionSnapshotDTO]] =
    ApiRequest[Seq[PositionSnapshotDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/positionSnapshots/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withSuccessResponse[Seq[PositionSnapshotDTO]](200)
      

  /**
   * Gets positions.
   * 
   * Expected answers:
   *   code 200 : Seq[PositionDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id NFT token identifier.
   * @param pool Pool position is within.
   * @param token0 Reference to token0 as stored in pair contract.
   * @param token1 Reference to token1 as stored in pair contract.
   */
  def uniswapV3GetPositionsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None, token0: Option[String] = None, token1: Option[String] = None): ApiRequest[Seq[PositionDTO]] =
    ApiRequest[Seq[PositionDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/positions/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withQueryParam("token_0", token0)
      .withQueryParam("token_1", token1)
      .withSuccessResponse[Seq[PositionDTO]](200)
      

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
   * @param id Identifier, format: transaction hash + \"#\" + index in swaps Transaction array.
   * @param pool Pool swap occured within.
   * @param token0 Reference to token0 as stored in pair contract.
   * @param token1 Reference to token1 as stored in pair contract.
   */
  def uniswapV3GetSwapsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None, token0: Option[String] = None, token1: Option[String] = None): ApiRequest[Seq[SwapDTO]] =
    ApiRequest[Seq[SwapDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/swaps/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withQueryParam("token_0", token0)
      .withQueryParam("token_1", token1)
      .withSuccessResponse[Seq[SwapDTO]](200)
      

  /**
   * Gets tickDayData.
   * 
   * Expected answers:
   *   code 200 : Seq[TickDayDataDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param pool 
   */
  def uniswapV3GetTickDayDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None): ApiRequest[Seq[TickDayDataDTO]] =
    ApiRequest[Seq[TickDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/tickDayData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withSuccessResponse[Seq[TickDayDataDTO]](200)
      

  /**
   * Gets ticks.
   * 
   * Expected answers:
   *   code 200 : Seq[TickDTO] (successful operation)
   * 
   * @param startBlock 
   * @param endBlock 
   * @param startDate 
   * @param endDate 
   * @param id 
   * @param pool 
   */
  def uniswapV3GetTicksHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, pool: Option[String] = None): ApiRequest[Seq[TickDTO]] =
    ApiRequest[Seq[TickDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/ticks/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withQueryParam("pool", pool)
      .withSuccessResponse[Seq[TickDTO]](200)
      

  /**
   * Gets tokenHourData.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenHourDataDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Token address concatendated with date.
   */
  def uniswapV3GetTokenHourDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[TokenHourDataDTO]] =
    ApiRequest[Seq[TokenHourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/tokenHourData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[TokenHourDataDTO]](200)
      

  /**
   * Gets tokenV3DayData.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenV3DayDataDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Token address concatendated with date.
   */
  def uniswapV3GetTokenV3DayDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[TokenV3DayDataDTO]] =
    ApiRequest[Seq[TokenV3DayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/tokenV3DayData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[TokenV3DayDataDTO]](200)
      

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
  def uniswapV3GetTokensHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None, symbol: Option[String] = None, name: Option[String] = None): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/tokens/historical", "application/json")
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
   * @param id Transaction hash.
   */
  def uniswapV3GetTransactionsHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[TransactionDTO]] =
    ApiRequest[Seq[TransactionDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/transactions/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[TransactionDTO]](200)
      

  /**
   * Gets uniswapDayData.
   * 
   * Expected answers:
   *   code 200 : Seq[UniswapDayDataDTO] (successful operation)
   * 
   * @param startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
   * @param endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
   * @param startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
   * @param endDate The end date of timeframe.
   * @param id Timestamp rounded to current day by dividing by 86400.
   */
  def uniswapV3GetUniswapDayDataHistorical(startBlock: Option[Long] = None, endBlock: Option[Long] = None, startDate: Option[OffsetDateTime] = None, endDate: Option[OffsetDateTime] = None, id: Option[String] = None): ApiRequest[Seq[UniswapDayDataDTO]] =
    ApiRequest[Seq[UniswapDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/uniswapDayData/historical", "application/json")
      .withQueryParam("startBlock", startBlock)
      .withQueryParam("endBlock", endBlock)
      .withQueryParam("startDate", startDate)
      .withQueryParam("endDate", endDate)
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[UniswapDayDataDTO]](200)
      

  /**
   * Gets mints.
   * 
   * Expected answers:
   *   code 200 : Seq[MintDTO] (successful operation)
   */
  def uniswapV3MintsCurrent(): ApiRequest[Seq[MintDTO]] =
    ApiRequest[Seq[MintDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/mints/current", "application/json")
      .withSuccessResponse[Seq[MintDTO]](200)
      

  /**
   * Gets poolDayData.
   * 
   * Expected answers:
   *   code 200 : Seq[PoolDayDataDTO] (successful operation)
   */
  def uniswapV3PoolDayDataCurrent(): ApiRequest[Seq[PoolDayDataDTO]] =
    ApiRequest[Seq[PoolDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/poolDayData/current", "application/json")
      .withSuccessResponse[Seq[PoolDayDataDTO]](200)
      

  /**
   * Gets poolHourData.
   * 
   * Expected answers:
   *   code 200 : Seq[PoolHourDataDTO] (successful operation)
   */
  def uniswapV3PoolHourDataCurrent(): ApiRequest[Seq[PoolHourDataDTO]] =
    ApiRequest[Seq[PoolHourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/poolHourData/current", "application/json")
      .withSuccessResponse[Seq[PoolHourDataDTO]](200)
      

  /**
   * Gets pools.
   * 
   * Expected answers:
   *   code 200 : Seq[PoolDTO] (successful operation)
   * 
   * @param id Pool address.
   */
  def uniswapV3PoolsCurrent(id: Option[String] = None): ApiRequest[Seq[PoolDTO]] =
    ApiRequest[Seq[PoolDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/pools/current", "application/json")
      .withQueryParam("id", id)
      .withSuccessResponse[Seq[PoolDTO]](200)
      

  /**
   * Gets positionSnapshots.
   * 
   * Expected answers:
   *   code 200 : Seq[PositionSnapshotDTO] (successful operation)
   */
  def uniswapV3PositionSnapshotsCurrent(): ApiRequest[Seq[PositionSnapshotDTO]] =
    ApiRequest[Seq[PositionSnapshotDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/positionSnapshots/current", "application/json")
      .withSuccessResponse[Seq[PositionSnapshotDTO]](200)
      

  /**
   * Gets positions.
   * 
   * Expected answers:
   *   code 200 : Seq[PositionDTO] (successful operation)
   */
  def uniswapV3PositionsCurrent(): ApiRequest[Seq[PositionDTO]] =
    ApiRequest[Seq[PositionDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/positions/current", "application/json")
      .withSuccessResponse[Seq[PositionDTO]](200)
      

  /**
   * Gets swaps.
   * 
   * Expected answers:
   *   code 200 : Seq[SwapDTO] (successful operation)
   * 
   * @param pool Pool swap occured within.
   */
  def uniswapV3SwapsCurrent(pool: Option[String] = None): ApiRequest[Seq[SwapDTO]] =
    ApiRequest[Seq[SwapDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/swaps/current", "application/json")
      .withQueryParam("pool", pool)
      .withSuccessResponse[Seq[SwapDTO]](200)
      

  /**
   * Gets tickDayData.
   * 
   * Expected answers:
   *   code 200 : Seq[TickDayDataDTO] (successful operation)
   */
  def uniswapV3TickDayDataCurrent(): ApiRequest[Seq[TickDayDataDTO]] =
    ApiRequest[Seq[TickDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/tickDayData/current", "application/json")
      .withSuccessResponse[Seq[TickDayDataDTO]](200)
      

  /**
   * Gets ticks.
   * 
   * Expected answers:
   *   code 200 : Seq[TickDTO] (successful operation)
   */
  def uniswapV3TicksCurrent(): ApiRequest[Seq[TickDTO]] =
    ApiRequest[Seq[TickDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/ticks/current", "application/json")
      .withSuccessResponse[Seq[TickDTO]](200)
      

  /**
   * Gets tokenHourData.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenHourDataDTO] (successful operation)
   */
  def uniswapV3TokenHourDataCurrent(): ApiRequest[Seq[TokenHourDataDTO]] =
    ApiRequest[Seq[TokenHourDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/tokenHourData/current", "application/json")
      .withSuccessResponse[Seq[TokenHourDataDTO]](200)
      

  /**
   * Gets tokenV3DayData.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenV3DayDataDTO] (successful operation)
   */
  def uniswapV3TokenV3DayDataCurrent(): ApiRequest[Seq[TokenV3DayDataDTO]] =
    ApiRequest[Seq[TokenV3DayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/tokenV3DayData/current", "application/json")
      .withSuccessResponse[Seq[TokenV3DayDataDTO]](200)
      

  /**
   * Gets tokens.
   * 
   * Expected answers:
   *   code 200 : Seq[TokenDTO] (successful operation)
   */
  def uniswapV3TokensCurrent(): ApiRequest[Seq[TokenDTO]] =
    ApiRequest[Seq[TokenDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/tokens/current", "application/json")
      .withSuccessResponse[Seq[TokenDTO]](200)
      

  /**
   * Gets transactions.
   * 
   * Expected answers:
   *   code 200 : Seq[TransactionDTO] (successful operation)
   */
  def uniswapV3TransactionsCurrent(): ApiRequest[Seq[TransactionDTO]] =
    ApiRequest[Seq[TransactionDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/transactions/current", "application/json")
      .withSuccessResponse[Seq[TransactionDTO]](200)
      

  /**
   * Gets uniswapDayData.
   * 
   * Expected answers:
   *   code 200 : Seq[UniswapDayDataDTO] (successful operation)
   */
  def uniswapV3UniswapDayDataCurrent(): ApiRequest[Seq[UniswapDayDataDTO]] =
    ApiRequest[Seq[UniswapDayDataDTO]](ApiMethods.GET, baseUrl, "/dapps/uniswapv3/uniswapDayData/current", "application/json")
      .withSuccessResponse[Seq[UniswapDayDataDTO]](200)
      



}

