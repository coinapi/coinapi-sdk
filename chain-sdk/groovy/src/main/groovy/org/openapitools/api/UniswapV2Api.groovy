package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.UniswapV2BundleDTO
import org.openapitools.model.UniswapV2BurnDTO
import org.openapitools.model.UniswapV2LiquidityPositionDTO
import org.openapitools.model.UniswapV2LiquidityPositionSnapshotDTO
import org.openapitools.model.UniswapV2MintDTO
import org.openapitools.model.UniswapV2PairDTO
import org.openapitools.model.UniswapV2PairDayDataDTO
import org.openapitools.model.UniswapV2PairHourDataDTO
import org.openapitools.model.UniswapV2SwapDTO
import org.openapitools.model.UniswapV2TokenDTO
import org.openapitools.model.UniswapV2TokenDayDataDTO
import org.openapitools.model.UniswapV2TransactionDTO
import org.openapitools.model.UniswapV2UniswapDayDataDTO
import org.openapitools.model.UniswapV2UniswapFactoryDTO
import org.openapitools.model.UniswapV2UserDTO

class UniswapV2Api {
    String basePath = "https://onchain.coinapi.io"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def uniswapV2BundlesCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/bundles/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2BundleDTO.class )

    }

    def uniswapV2BurnsCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/burns/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2BurnDTO.class )

    }

    def uniswapV2GetBundlesHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/bundles/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2BundleDTO.class )

    }

    def uniswapV2GetBurnsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String pair, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/burns/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (pair != null) {
            queryParams.put("pair", pair)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2BurnDTO.class )

    }

    def uniswapV2GetLiquidityPositionSnapshotsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String user, String pair, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/liquidityPositionSnapshots/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (user != null) {
            queryParams.put("user", user)
        }
        if (pair != null) {
            queryParams.put("pair", pair)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2LiquidityPositionSnapshotDTO.class )

    }

    def uniswapV2GetLiquidityPositionsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String user, String pair, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/liquidityPositions/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (user != null) {
            queryParams.put("user", user)
        }
        if (pair != null) {
            queryParams.put("pair", pair)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2LiquidityPositionDTO.class )

    }

    def uniswapV2GetMintsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String pair, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/mints/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (pair != null) {
            queryParams.put("pair", pair)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2MintDTO.class )

    }

    def uniswapV2GetPairDayDatasHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String token0, String token1, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/pairDayDatas/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (token0 != null) {
            queryParams.put("token_0", token0)
        }
        if (token1 != null) {
            queryParams.put("token_1", token1)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2PairDayDataDTO.class )

    }

    def uniswapV2GetPairHourDatasHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String pair, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/pairHourDatas/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (pair != null) {
            queryParams.put("pair", pair)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2PairHourDataDTO.class )

    }

    def uniswapV2GetPairsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String token0, String token1, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/pairs/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (token0 != null) {
            queryParams.put("token_0", token0)
        }
        if (token1 != null) {
            queryParams.put("token_1", token1)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2PairDTO.class )

    }

    def uniswapV2GetPoolsCurrent ( String filterPoolId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/pools/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (filterPoolId != null) {
            queryParams.put("filter_pool_id", filterPoolId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2PairDTO.class )

    }

    def uniswapV2GetSwapsCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/swaps/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2SwapDTO.class )

    }

    def uniswapV2GetSwapsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String pair, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/swaps/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (pair != null) {
            queryParams.put("pair", pair)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2SwapDTO.class )

    }

    def uniswapV2GetTokenDayDatasHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/tokenDayDatas/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2TokenDayDataDTO.class )

    }

    def uniswapV2GetTokensCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/tokens/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2TokenDTO.class )

    }

    def uniswapV2GetTokensHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, String symbol, String name, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/tokens/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }
        if (symbol != null) {
            queryParams.put("symbol", symbol)
        }
        if (name != null) {
            queryParams.put("name", name)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2TokenDTO.class )

    }

    def uniswapV2GetTransactionsHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/transactions/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2TransactionDTO.class )

    }

    def uniswapV2GetUniswapDayDatasHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/uniswapDayDatas/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2UniswapDayDataDTO.class )

    }

    def uniswapV2GetUniswapFactorysHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/uniswapFactorys/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2UniswapFactoryDTO.class )

    }

    def uniswapV2GetUsersHistorical ( Long startBlock, Long endBlock, Date startDate, Date endDate, String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/users/historical"

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
        if (id != null) {
            queryParams.put("id", id)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2UserDTO.class )

    }

    def uniswapV2LiquidityPositionSnapshotsCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/liquidityPositionSnapshots/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2LiquidityPositionSnapshotDTO.class )

    }

    def uniswapV2LiquidityPositionsCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/liquidityPositions/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2LiquidityPositionDTO.class )

    }

    def uniswapV2MintsCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/mints/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2MintDTO.class )

    }

    def uniswapV2PairDayDatasCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/pairDayDatas/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2PairDayDataDTO.class )

    }

    def uniswapV2PairHourDatasCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/pairHourDatas/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2PairHourDataDTO.class )

    }

    def uniswapV2PairsCurrent ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/pairs/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (id != null) {
            queryParams.put("id", id)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2PairDTO.class )

    }

    def uniswapV2TokenDayDatasCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/tokenDayDatas/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2TokenDayDataDTO.class )

    }

    def uniswapV2TransactionsCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/transactions/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2TransactionDTO.class )

    }

    def uniswapV2UniswapDayDatasCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/uniswapDayDatas/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2UniswapDayDataDTO.class )

    }

    def uniswapV2UniswapFactorysCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/uniswapFactorys/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2UniswapFactoryDTO.class )

    }

    def uniswapV2UsersCurrent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/dapps/uniswapv2/users/current"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    UniswapV2UserDTO.class )

    }

}
