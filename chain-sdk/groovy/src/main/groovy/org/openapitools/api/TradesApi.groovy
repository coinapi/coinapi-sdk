package org.openapitools.api;

import org.openapitools.api.ApiUtils

class TradesApi {
    String basePath = "https://onchain.coinapi.io"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def chainsChainIdDappsCowTradesHistoricalGet ( String chainId, Long startBlock, Long endBlock, Date startDate, Date endDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/chains/${chain_id}/dapps/cow/trades/historical"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (chainId == null) {
            throw new RuntimeException("missing required params chainId")
        }

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
                    "GET", "",
                    null )

    }

    def chainsChainIdDappsDexTradesHistoricalGet ( String chainId, Long startBlock, Long endBlock, Date startDate, Date endDate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/chains/${chain_id}/dapps/dex/trades/historical"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (chainId == null) {
            throw new RuntimeException("missing required params chainId")
        }

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
                    "GET", "",
                    null )

    }

}