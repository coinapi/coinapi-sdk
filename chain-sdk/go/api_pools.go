/*
OnChain API

 This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

API version: v1
Contact: support@coinapi.io
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"bytes"
	"context"
	"io/ioutil"
	"net/http"
	"net/url"
	"strings"
	"time"
)


// PoolsApiService PoolsApi service
type PoolsApiService service

type ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest struct {
	ctx context.Context
	ApiService *PoolsApiService
	chainId string
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
	poolId *string
}

func (r ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest) StartBlock(startBlock int64) ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest) EndBlock(endBlock int64) ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest) StartDate(startDate time.Time) ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest) EndDate(endDate time.Time) ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest) PoolId(poolId string) ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest {
	r.poolId = &poolId
	return r
}

func (r ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.ChainsChainIdDappsCurvePoolsHistoricalGetExecute(r)
}

/*
ChainsChainIdDappsCurvePoolsHistoricalGet Method for ChainsChainIdDappsCurvePoolsHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param chainId
 @return ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest
*/
func (a *PoolsApiService) ChainsChainIdDappsCurvePoolsHistoricalGet(ctx context.Context, chainId string) ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest {
	return ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
		chainId: chainId,
	}
}

// Execute executes the request
func (a *PoolsApiService) ChainsChainIdDappsCurvePoolsHistoricalGetExecute(r ApiChainsChainIdDappsCurvePoolsHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PoolsApiService.ChainsChainIdDappsCurvePoolsHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/chains/{chain_id}/dapps/curve/pools/historical"
	localVarPath = strings.Replace(localVarPath, "{"+"chain_id"+"}", url.PathEscape(parameterToString(r.chainId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.startBlock != nil {
		localVarQueryParams.Add("startBlock", parameterToString(*r.startBlock, ""))
	}
	if r.endBlock != nil {
		localVarQueryParams.Add("endBlock", parameterToString(*r.endBlock, ""))
	}
	if r.startDate != nil {
		localVarQueryParams.Add("startDate", parameterToString(*r.startDate, ""))
	}
	if r.endDate != nil {
		localVarQueryParams.Add("endDate", parameterToString(*r.endDate, ""))
	}
	if r.poolId != nil {
		localVarQueryParams.Add("poolId", parameterToString(*r.poolId, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest struct {
	ctx context.Context
	ApiService *PoolsApiService
	chainId string
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
	poolId *string
}

func (r ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest) StartBlock(startBlock int64) ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest) EndBlock(endBlock int64) ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest) StartDate(startDate time.Time) ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest) EndDate(endDate time.Time) ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest) PoolId(poolId string) ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest {
	r.poolId = &poolId
	return r
}

func (r ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.ChainsChainIdDappsSushiswapPoolsHistoricalGetExecute(r)
}

/*
ChainsChainIdDappsSushiswapPoolsHistoricalGet Method for ChainsChainIdDappsSushiswapPoolsHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param chainId
 @return ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest
*/
func (a *PoolsApiService) ChainsChainIdDappsSushiswapPoolsHistoricalGet(ctx context.Context, chainId string) ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest {
	return ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
		chainId: chainId,
	}
}

// Execute executes the request
func (a *PoolsApiService) ChainsChainIdDappsSushiswapPoolsHistoricalGetExecute(r ApiChainsChainIdDappsSushiswapPoolsHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PoolsApiService.ChainsChainIdDappsSushiswapPoolsHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/chains/{chain_id}/dapps/sushiswap/pools/historical"
	localVarPath = strings.Replace(localVarPath, "{"+"chain_id"+"}", url.PathEscape(parameterToString(r.chainId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.startBlock != nil {
		localVarQueryParams.Add("startBlock", parameterToString(*r.startBlock, ""))
	}
	if r.endBlock != nil {
		localVarQueryParams.Add("endBlock", parameterToString(*r.endBlock, ""))
	}
	if r.startDate != nil {
		localVarQueryParams.Add("startDate", parameterToString(*r.startDate, ""))
	}
	if r.endDate != nil {
		localVarQueryParams.Add("endDate", parameterToString(*r.endDate, ""))
	}
	if r.poolId != nil {
		localVarQueryParams.Add("poolId", parameterToString(*r.poolId, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest struct {
	ctx context.Context
	ApiService *PoolsApiService
	chainId string
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
	poolId *string
}

func (r ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest) StartBlock(startBlock int64) ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest) EndBlock(endBlock int64) ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest) StartDate(startDate time.Time) ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest) EndDate(endDate time.Time) ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest) PoolId(poolId string) ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest {
	r.poolId = &poolId
	return r
}

func (r ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.ChainsChainIdDappsUniswapv2PoolsHistoricalGetExecute(r)
}

/*
ChainsChainIdDappsUniswapv2PoolsHistoricalGet Method for ChainsChainIdDappsUniswapv2PoolsHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param chainId
 @return ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest
*/
func (a *PoolsApiService) ChainsChainIdDappsUniswapv2PoolsHistoricalGet(ctx context.Context, chainId string) ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest {
	return ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
		chainId: chainId,
	}
}

// Execute executes the request
func (a *PoolsApiService) ChainsChainIdDappsUniswapv2PoolsHistoricalGetExecute(r ApiChainsChainIdDappsUniswapv2PoolsHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PoolsApiService.ChainsChainIdDappsUniswapv2PoolsHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/chains/{chain_id}/dapps/uniswapv2/pools/historical"
	localVarPath = strings.Replace(localVarPath, "{"+"chain_id"+"}", url.PathEscape(parameterToString(r.chainId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.startBlock != nil {
		localVarQueryParams.Add("startBlock", parameterToString(*r.startBlock, ""))
	}
	if r.endBlock != nil {
		localVarQueryParams.Add("endBlock", parameterToString(*r.endBlock, ""))
	}
	if r.startDate != nil {
		localVarQueryParams.Add("startDate", parameterToString(*r.startDate, ""))
	}
	if r.endDate != nil {
		localVarQueryParams.Add("endDate", parameterToString(*r.endDate, ""))
	}
	if r.poolId != nil {
		localVarQueryParams.Add("poolId", parameterToString(*r.poolId, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}

type ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest struct {
	ctx context.Context
	ApiService *PoolsApiService
	chainId string
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
	poolId *string
}

func (r ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest) StartBlock(startBlock int64) ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest) EndBlock(endBlock int64) ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest) StartDate(startDate time.Time) ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest) EndDate(endDate time.Time) ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest) PoolId(poolId string) ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest {
	r.poolId = &poolId
	return r
}

func (r ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.ChainsChainIdDappsUniswapv3PoolsHistoricalGetExecute(r)
}

/*
ChainsChainIdDappsUniswapv3PoolsHistoricalGet Method for ChainsChainIdDappsUniswapv3PoolsHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param chainId
 @return ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest
*/
func (a *PoolsApiService) ChainsChainIdDappsUniswapv3PoolsHistoricalGet(ctx context.Context, chainId string) ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest {
	return ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
		chainId: chainId,
	}
}

// Execute executes the request
func (a *PoolsApiService) ChainsChainIdDappsUniswapv3PoolsHistoricalGetExecute(r ApiChainsChainIdDappsUniswapv3PoolsHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "PoolsApiService.ChainsChainIdDappsUniswapv3PoolsHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/chains/{chain_id}/dapps/uniswapv3/pools/historical"
	localVarPath = strings.Replace(localVarPath, "{"+"chain_id"+"}", url.PathEscape(parameterToString(r.chainId, "")), -1)

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.startBlock != nil {
		localVarQueryParams.Add("startBlock", parameterToString(*r.startBlock, ""))
	}
	if r.endBlock != nil {
		localVarQueryParams.Add("endBlock", parameterToString(*r.endBlock, ""))
	}
	if r.startDate != nil {
		localVarQueryParams.Add("startDate", parameterToString(*r.startDate, ""))
	}
	if r.endDate != nil {
		localVarQueryParams.Add("endDate", parameterToString(*r.endDate, ""))
	}
	if r.poolId != nil {
		localVarQueryParams.Add("poolId", parameterToString(*r.poolId, ""))
	}
	// to determine the Content-Type header
	localVarHTTPContentTypes := []string{}

	// set Content-Type header
	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	// to determine the Accept header
	localVarHTTPHeaderAccepts := []string{}

	// set Accept header
	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarHTTPResponse, err
	}

	localVarBody, err := ioutil.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = ioutil.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		return localVarHTTPResponse, newErr
	}

	return localVarHTTPResponse, nil
}