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


// VotingAppApiService VotingAppApi service
type VotingAppApiService service

type ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest struct {
	ctx context.Context
	ApiService *VotingAppApiService
	chainId string
	startBlock *int64
	endBlock *int64
	startDate *time.Time
	endDate *time.Time
}

func (r ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest) StartBlock(startBlock int64) ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest {
	r.startBlock = &startBlock
	return r
}

func (r ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest) EndBlock(endBlock int64) ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest {
	r.endBlock = &endBlock
	return r
}

func (r ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest) StartDate(startDate time.Time) ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest {
	r.startDate = &startDate
	return r
}

func (r ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest) EndDate(endDate time.Time) ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest {
	r.endDate = &endDate
	return r
}

func (r ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest) Execute() (*http.Response, error) {
	return r.ApiService.ChainsChainIdDappsCurveVotingAppHistoricalGetExecute(r)
}

/*
ChainsChainIdDappsCurveVotingAppHistoricalGet Method for ChainsChainIdDappsCurveVotingAppHistoricalGet

 @param ctx context.Context - for authentication, logging, cancellation, deadlines, tracing, etc. Passed from http.Request or context.Background().
 @param chainId
 @return ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest
*/
func (a *VotingAppApiService) ChainsChainIdDappsCurveVotingAppHistoricalGet(ctx context.Context, chainId string) ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest {
	return ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest{
		ApiService: a,
		ctx: ctx,
		chainId: chainId,
	}
}

// Execute executes the request
func (a *VotingAppApiService) ChainsChainIdDappsCurveVotingAppHistoricalGetExecute(r ApiChainsChainIdDappsCurveVotingAppHistoricalGetRequest) (*http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "VotingAppApiService.ChainsChainIdDappsCurveVotingAppHistoricalGet")
	if err != nil {
		return nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/chains/{chain_id}/dapps/curve/votingApp/historical"
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
