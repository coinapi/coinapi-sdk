/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.SystemStateApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 *  This section will provide necessary information about the &#x60;OnChain API&#x60; protocol.  &lt;br/&gt;&lt;br/&gt; Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 * Version: v1
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license MIT License
 * https://github.com/coinapi/coinapi-sdk/blob/master/LICENSE
 */

goog.provide('API.Client.SystemStateApi');


/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.SystemStateApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('SystemStateApiBasePath') ?
                   /** @type {!string} */ ($injector.get('SystemStateApiBasePath')) :
                   'https://onchain.coinapi.io';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('SystemStateApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('SystemStateApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.SystemStateApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * 
 * @param {!string} chainId 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SystemStateApi.prototype.chainsChainIdDappsCurveSystemStateHistoricalGet = function(chainId, opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/curve/systemState/historical'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsCurveSystemStateHistoricalGet');
  }
  if (opt_startBlock !== undefined) {
    queryParameters['startBlock'] = opt_startBlock;
  }

  if (opt_endBlock !== undefined) {
    queryParameters['endBlock'] = opt_endBlock;
  }

  if (opt_startDate !== undefined) {
    queryParameters['startDate'] = opt_startDate;
  }

  if (opt_endDate !== undefined) {
    queryParameters['endDate'] = opt_endDate;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
