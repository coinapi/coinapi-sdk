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
	"time"
)


// CowApiService CowApi service
type CowApiService service

type ApiDappsCowOrdersHistoricalGetRequest struct {
	ctx context.Context
	ApiService *CowApiService
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
}

func (r ApiDappsCowOrdersHistoricalGetRequest) StartBlock(startBlock int64) ApiDappsCowOrdersHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiDappsCowOrdersHistoricalGetRequest) EndBlock(endBlock int64) ApiDappsCowOrdersHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiDappsCowOrdersHistoricalGetRequest) StartDate(startDate time.Time) ApiDappsCowOrdersHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiDappsCowOrdersHistoricalGetRequest) EndDate(endDate time.Time) ApiDappsCowOrdersHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiDappsCowOrdersHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.DappsCowOrdersHistoricalGetExecute(r)
}

/*
DappsCowOrdersHistoricalGet Method for DappsCowOrdersHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiDappsCowOrdersHistoricalGetRequest
*/
func (a *CowApiService) DappsCowOrdersHistoricalGet(ctx context.Context) ApiDappsCowOrdersHistoricalGetRequest {
	return ApiDappsCowOrdersHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *CowApiService) DappsCowOrdersHistoricalGetExecute(r ApiDappsCowOrdersHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CowApiService.DappsCowOrdersHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/dapps/cow/orders/historical"

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

type ApiDappsCowPoiHistoricalGetRequest struct {
	ctx context.Context
	ApiService *CowApiService
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
}

func (r ApiDappsCowPoiHistoricalGetRequest) StartBlock(startBlock int64) ApiDappsCowPoiHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiDappsCowPoiHistoricalGetRequest) EndBlock(endBlock int64) ApiDappsCowPoiHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiDappsCowPoiHistoricalGetRequest) StartDate(startDate time.Time) ApiDappsCowPoiHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiDappsCowPoiHistoricalGetRequest) EndDate(endDate time.Time) ApiDappsCowPoiHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiDappsCowPoiHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.DappsCowPoiHistoricalGetExecute(r)
}

/*
DappsCowPoiHistoricalGet Method for DappsCowPoiHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiDappsCowPoiHistoricalGetRequest
*/
func (a *CowApiService) DappsCowPoiHistoricalGet(ctx context.Context) ApiDappsCowPoiHistoricalGetRequest {
	return ApiDappsCowPoiHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *CowApiService) DappsCowPoiHistoricalGetExecute(r ApiDappsCowPoiHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CowApiService.DappsCowPoiHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/dapps/cow/poi/historical"

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

type ApiDappsCowSettlementHistoricalGetRequest struct {
	ctx context.Context
	ApiService *CowApiService
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
}

func (r ApiDappsCowSettlementHistoricalGetRequest) StartBlock(startBlock int64) ApiDappsCowSettlementHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiDappsCowSettlementHistoricalGetRequest) EndBlock(endBlock int64) ApiDappsCowSettlementHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiDappsCowSettlementHistoricalGetRequest) StartDate(startDate time.Time) ApiDappsCowSettlementHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiDappsCowSettlementHistoricalGetRequest) EndDate(endDate time.Time) ApiDappsCowSettlementHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiDappsCowSettlementHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.DappsCowSettlementHistoricalGetExecute(r)
}

/*
DappsCowSettlementHistoricalGet Method for DappsCowSettlementHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiDappsCowSettlementHistoricalGetRequest
*/
func (a *CowApiService) DappsCowSettlementHistoricalGet(ctx context.Context) ApiDappsCowSettlementHistoricalGetRequest {
	return ApiDappsCowSettlementHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *CowApiService) DappsCowSettlementHistoricalGetExecute(r ApiDappsCowSettlementHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CowApiService.DappsCowSettlementHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/dapps/cow/settlement/historical"

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

type ApiDappsCowTokensHistoricalGetRequest struct {
	ctx context.Context
	ApiService *CowApiService
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
	tokenId *string
}

func (r ApiDappsCowTokensHistoricalGetRequest) StartBlock(startBlock int64) ApiDappsCowTokensHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiDappsCowTokensHistoricalGetRequest) EndBlock(endBlock int64) ApiDappsCowTokensHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiDappsCowTokensHistoricalGetRequest) StartDate(startDate time.Time) ApiDappsCowTokensHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiDappsCowTokensHistoricalGetRequest) EndDate(endDate time.Time) ApiDappsCowTokensHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiDappsCowTokensHistoricalGetRequest) TokenId(tokenId string) ApiDappsCowTokensHistoricalGetRequest {
	r.tokenId = &tokenId
	return r
}

func (r ApiDappsCowTokensHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.DappsCowTokensHistoricalGetExecute(r)
}

/*
DappsCowTokensHistoricalGet Method for DappsCowTokensHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiDappsCowTokensHistoricalGetRequest
*/
func (a *CowApiService) DappsCowTokensHistoricalGet(ctx context.Context) ApiDappsCowTokensHistoricalGetRequest {
	return ApiDappsCowTokensHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *CowApiService) DappsCowTokensHistoricalGetExecute(r ApiDappsCowTokensHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CowApiService.DappsCowTokensHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/dapps/cow/tokens/historical"

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
	if r.tokenId != nil {
		localVarQueryParams.Add("tokenId", parameterToString(*r.tokenId, ""))
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

type ApiDappsCowTradesHistoricalGetRequest struct {
	ctx context.Context
	ApiService *CowApiService
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
}

func (r ApiDappsCowTradesHistoricalGetRequest) StartBlock(startBlock int64) ApiDappsCowTradesHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiDappsCowTradesHistoricalGetRequest) EndBlock(endBlock int64) ApiDappsCowTradesHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiDappsCowTradesHistoricalGetRequest) StartDate(startDate time.Time) ApiDappsCowTradesHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiDappsCowTradesHistoricalGetRequest) EndDate(endDate time.Time) ApiDappsCowTradesHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiDappsCowTradesHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.DappsCowTradesHistoricalGetExecute(r)
}

/*
DappsCowTradesHistoricalGet Method for DappsCowTradesHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiDappsCowTradesHistoricalGetRequest
*/
func (a *CowApiService) DappsCowTradesHistoricalGet(ctx context.Context) ApiDappsCowTradesHistoricalGetRequest {
	return ApiDappsCowTradesHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *CowApiService) DappsCowTradesHistoricalGetExecute(r ApiDappsCowTradesHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CowApiService.DappsCowTradesHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/dapps/cow/trades/historical"

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

type ApiDappsCowUsersHistoricalGetRequest struct {
	ctx context.Context
	ApiService *CowApiService
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
}

func (r ApiDappsCowUsersHistoricalGetRequest) StartBlock(startBlock int64) ApiDappsCowUsersHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiDappsCowUsersHistoricalGetRequest) EndBlock(endBlock int64) ApiDappsCowUsersHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiDappsCowUsersHistoricalGetRequest) StartDate(startDate time.Time) ApiDappsCowUsersHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiDappsCowUsersHistoricalGetRequest) EndDate(endDate time.Time) ApiDappsCowUsersHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiDappsCowUsersHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.DappsCowUsersHistoricalGetExecute(r)
}

/*
DappsCowUsersHistoricalGet Method for DappsCowUsersHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @return ApiDappsCowUsersHistoricalGetRequest
*/
func (a *CowApiService) DappsCowUsersHistoricalGet(ctx context.Context) ApiDappsCowUsersHistoricalGetRequest {
	return ApiDappsCowUsersHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
	}
}

// Execute executes the request
func (a *CowApiService) DappsCowUsersHistoricalGetExecute(r ApiDappsCowUsersHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "CowApiService.DappsCowUsersHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/dapps/cow/users/historical"

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