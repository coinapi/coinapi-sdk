package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CurveExchangeDTO
import org.openapitools.model.DexTradeDTO
import org.openapitools.model.SushiswapBundleDTO
import org.openapitools.model.SushiswapBurnDTO
import org.openapitools.model.SushiswapDayDataDTO
import org.openapitools.model.SushiswapFactoryDTO
import org.openapitools.model.SushiswapHourDataDTO
import org.openapitools.model.SushiswapLiquidityPositionDTO
import org.openapitools.model.SushiswapLiquidityPositionSnapshotDTO
import org.openapitools.model.SushiswapMintDTO
import org.openapitools.model.SushiswapPairDTO
import org.openapitools.model.SushiswapPairDayDataDTO
import org.openapitools.model.SushiswapPairHourDataDTO
import org.openapitools.model.SushiswapSwapDTO
import org.openapitools.model.SushiswapTokenDTO
import org.openapitools.model.SushiswapTokenDayDataDTO
import org.openapitools.model.SushiswapTransactionDTO
import org.openapitools.model.SushiswapUserDTO

class SushiswapApi {
    String basePath = "https://onchain.coinapi.io"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def curveGetExchangesCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/exchanges/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    CurveExchangeDTO.class )

    }

    def dexGetTradesCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/trades/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    DexTradeDTO.class )

    }

    def sushiswapGetBundlesHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/bundles/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapBundleDTO.class )

    }

    def sushiswapGetBurnsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String poolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/burns/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (poolId != null) {
            queryParams.put("poolId", poolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapBurnDTO.class )

    }

    def sushiswapGetDayDataHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/dayData/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapDayDataDTO.class )

    }

    def sushiswapGetFactoryHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/factory/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapFactoryDTO.class )

    }

    def sushiswapGetHourDataHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/hourData/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapHourDataDTO.class )

    }

    def sushiswapGetLiquidityPositionHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String poolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/liquidityPosition/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (poolId != null) {
            queryParams.put("poolId", poolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapLiquidityPositionDTO.class )

    }

    def sushiswapGetLiquidityPositionSnapshotHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String poolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/liquidityPositionSnapshots/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (poolId != null) {
            queryParams.put("poolId", poolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapLiquidityPositionSnapshotDTO.class )

    }

    def sushiswapGetMintsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String poolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/mints/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (poolId != null) {
            queryParams.put("poolId", poolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapMintDTO.class )

    }

    def sushiswapGetPoolsCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/pools/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapPairDTO.class )

    }

    def sushiswapGetPoolsDayDataHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String poolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/poolsDayData/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (poolId != null) {
            queryParams.put("poolId", poolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapPairDayDataDTO.class )

    }

    def sushiswapGetPoolsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String poolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/pools/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (poolId != null) {
            queryParams.put("poolId", poolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapPairDTO.class )

    }

    def sushiswapGetPoolsHourDataHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String poolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/poolsHourData/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (poolId != null) {
            queryParams.put("poolId", poolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapPairHourDataDTO.class )

    }

    def sushiswapGetSwapsCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/swaps/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapSwapDTO.class )

    }

    def sushiswapGetSwapsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String poolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/swaps/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (poolId != null) {
            queryParams.put("poolId", poolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapSwapDTO.class )

    }

    def sushiswapGetTokensCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/tokens/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapTokenDTO.class )

    }

    def sushiswapGetTokensDayDataHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String tokenId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/tokensDayData/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (tokenId != null) {
            queryParams.put("tokenId", tokenId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapTokenDayDataDTO.class )

    }

    def sushiswapGetTokensHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String tokenId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/tokens/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }
        if (tokenId != null) {
            queryParams.put("tokenId", tokenId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapTokenDTO.class )

    }

    def sushiswapGetTransactionsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/transactions/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapTransactionDTO.class )

    }

    def sushiswapGetUsersHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/sushiswap/users/historical-manual"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (startBlock != null) {
            queryParams.put("startBlock", startBlock)
        }
        if (endBlock != null) {
            queryParams.put("endBlock", endBlock)
        }
        if (startDate != null) {
            queryParams.put("startDate", startDate)
        }
        if (endDate != null) {
            queryParams.put("endDate", endDate)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    SushiswapUserDTO.class )

    }

}
