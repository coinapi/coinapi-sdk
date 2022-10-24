/*
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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BurnsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BurnsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BurnsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for chainsChainIdDappsSushiswapBurnsHistoricalGet
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call chainsChainIdDappsSushiswapBurnsHistoricalGetCall(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/chains/{chain_id}/dapps/sushiswap/burns/historical"
            .replaceAll("\\{" + "chain_id" + "\\}", localVarApiClient.escapeString(chainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startBlock != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startBlock", startBlock));
        }

        if (endBlock != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endBlock", endBlock));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDate", endDate));
        }

        if (poolId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("poolId", poolId));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call chainsChainIdDappsSushiswapBurnsHistoricalGetValidateBeforeCall(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'chainId' is set
        if (chainId == null) {
            throw new ApiException("Missing the required parameter 'chainId' when calling chainsChainIdDappsSushiswapBurnsHistoricalGet(Async)");
        }
        

        okhttp3.Call localVarCall = chainsChainIdDappsSushiswapBurnsHistoricalGetCall(chainId, startBlock, endBlock, startDate, endDate, poolId, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void chainsChainIdDappsSushiswapBurnsHistoricalGet(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId) throws ApiException {
        chainsChainIdDappsSushiswapBurnsHistoricalGetWithHttpInfo(chainId, startBlock, endBlock, startDate, endDate, poolId);
    }

    /**
     * 
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> chainsChainIdDappsSushiswapBurnsHistoricalGetWithHttpInfo(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId) throws ApiException {
        okhttp3.Call localVarCall = chainsChainIdDappsSushiswapBurnsHistoricalGetValidateBeforeCall(chainId, startBlock, endBlock, startDate, endDate, poolId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call chainsChainIdDappsSushiswapBurnsHistoricalGetAsync(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = chainsChainIdDappsSushiswapBurnsHistoricalGetValidateBeforeCall(chainId, startBlock, endBlock, startDate, endDate, poolId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for chainsChainIdDappsUniswapv2BurnsHistoricalGet
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call chainsChainIdDappsUniswapv2BurnsHistoricalGetCall(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/chains/{chain_id}/dapps/uniswapv2/burns/historical"
            .replaceAll("\\{" + "chain_id" + "\\}", localVarApiClient.escapeString(chainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startBlock != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startBlock", startBlock));
        }

        if (endBlock != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endBlock", endBlock));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDate", endDate));
        }

        if (poolId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("poolId", poolId));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call chainsChainIdDappsUniswapv2BurnsHistoricalGetValidateBeforeCall(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'chainId' is set
        if (chainId == null) {
            throw new ApiException("Missing the required parameter 'chainId' when calling chainsChainIdDappsUniswapv2BurnsHistoricalGet(Async)");
        }
        

        okhttp3.Call localVarCall = chainsChainIdDappsUniswapv2BurnsHistoricalGetCall(chainId, startBlock, endBlock, startDate, endDate, poolId, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void chainsChainIdDappsUniswapv2BurnsHistoricalGet(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId) throws ApiException {
        chainsChainIdDappsUniswapv2BurnsHistoricalGetWithHttpInfo(chainId, startBlock, endBlock, startDate, endDate, poolId);
    }

    /**
     * 
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> chainsChainIdDappsUniswapv2BurnsHistoricalGetWithHttpInfo(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId) throws ApiException {
        okhttp3.Call localVarCall = chainsChainIdDappsUniswapv2BurnsHistoricalGetValidateBeforeCall(chainId, startBlock, endBlock, startDate, endDate, poolId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call chainsChainIdDappsUniswapv2BurnsHistoricalGetAsync(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = chainsChainIdDappsUniswapv2BurnsHistoricalGetValidateBeforeCall(chainId, startBlock, endBlock, startDate, endDate, poolId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for chainsChainIdDappsUniswapv3BurnsHistoricalGet
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call chainsChainIdDappsUniswapv3BurnsHistoricalGetCall(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/chains/{chain_id}/dapps/uniswapv3/burns/historical"
            .replaceAll("\\{" + "chain_id" + "\\}", localVarApiClient.escapeString(chainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startBlock != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startBlock", startBlock));
        }

        if (endBlock != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endBlock", endBlock));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDate", endDate));
        }

        if (poolId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("poolId", poolId));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call chainsChainIdDappsUniswapv3BurnsHistoricalGetValidateBeforeCall(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'chainId' is set
        if (chainId == null) {
            throw new ApiException("Missing the required parameter 'chainId' when calling chainsChainIdDappsUniswapv3BurnsHistoricalGet(Async)");
        }
        

        okhttp3.Call localVarCall = chainsChainIdDappsUniswapv3BurnsHistoricalGetCall(chainId, startBlock, endBlock, startDate, endDate, poolId, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public void chainsChainIdDappsUniswapv3BurnsHistoricalGet(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId) throws ApiException {
        chainsChainIdDappsUniswapv3BurnsHistoricalGetWithHttpInfo(chainId, startBlock, endBlock, startDate, endDate, poolId);
    }

    /**
     * 
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> chainsChainIdDappsUniswapv3BurnsHistoricalGetWithHttpInfo(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId) throws ApiException {
        okhttp3.Call localVarCall = chainsChainIdDappsUniswapv3BurnsHistoricalGetValidateBeforeCall(chainId, startBlock, endBlock, startDate, endDate, poolId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * 
     * @param chainId  (required)
     * @param startBlock  (optional)
     * @param endBlock  (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param poolId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call chainsChainIdDappsUniswapv3BurnsHistoricalGetAsync(String chainId, Long startBlock, Long endBlock, OffsetDateTime startDate, OffsetDateTime endDate, String poolId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = chainsChainIdDappsUniswapv3BurnsHistoricalGetValidateBeforeCall(chainId, startBlock, endBlock, startDate, endDate, poolId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
