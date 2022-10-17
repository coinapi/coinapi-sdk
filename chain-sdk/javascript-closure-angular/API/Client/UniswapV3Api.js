/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.UniswapV3Api.
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

goog.provide('API.Client.UniswapV3Api');

goog.require('API.Client.BundleV3DTO');
goog.require('API.Client.BurnV3DTO');
goog.require('API.Client.FactoryV3DTO');
goog.require('API.Client.MintV3DTO');
goog.require('API.Client.PoolDayDataV3DTO');
goog.require('API.Client.PoolHourDataV3DTO');
goog.require('API.Client.PoolV3DTO');
goog.require('API.Client.PositionSnapshotV3DTO');
goog.require('API.Client.PositionV3DTO');
goog.require('API.Client.SwapV3DTO');
goog.require('API.Client.TickDayDataV3DTO');
goog.require('API.Client.TickV3DTO');
goog.require('API.Client.TokenHourDataV3DTO');
goog.require('API.Client.TokenV3DTO');
goog.require('API.Client.TokenV3DayDataDTO');
goog.require('API.Client.UniswapDayDataV3DTO');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.UniswapV3Api = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('UniswapV3ApiBasePath') ?
                   /** @type {!string} */ ($injector.get('UniswapV3ApiBasePath')) :
                   'https://onchain.coinapi.io';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('UniswapV3ApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('UniswapV3ApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.UniswapV3Api.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * GetBundles
 * 
 * @param {!string} chainId Chain id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.BundleV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3BundleCurrentGet = function(chainId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/bundle/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3BundleCurrentGet');
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

/**
 * GetBurns
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.BurnV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3BurnsCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/burns/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3BurnsCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetFactory
 * 
 * @param {!string} chainId Chain id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.FactoryV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3FactoryCurrentGet = function(chainId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/factory/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3FactoryCurrentGet');
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

/**
 * GetMints
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.MintV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3MintsCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/mints/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3MintsCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetPools
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.PoolV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3PoolsCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/pools/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3PoolsCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetPoolsDayData
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.PoolDayDataV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3PoolsDayDataCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/poolsDayData/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3PoolsDayDataCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetPoolsHourData
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.PoolHourDataV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3PoolsHourDataCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/poolsHourData/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3PoolsHourDataCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetPositionSnapshot
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.PositionSnapshotV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3PositionSnapshotsCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/positionSnapshots/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3PositionSnapshotsCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetPositions
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.PositionV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3PositionsCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/positions/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3PositionsCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetSwaps
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.SwapV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3SwapsCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/swaps/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3SwapsCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetTicks
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.TickV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3TicksCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/ticks/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3TicksCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetTicksDayData
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterPoolId Filter pool id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.TickDayDataV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3TicksDayDataCurrentGet = function(chainId, opt_filterPoolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/ticksDayData/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3TicksDayDataCurrentGet');
  }
  if (opt_filterPoolId !== undefined) {
    queryParameters['filter_pool_id'] = opt_filterPoolId;
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

/**
 * GetTokens
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterTokenId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.TokenV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3TokensCurrentGet = function(chainId, opt_filterTokenId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/tokens/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3TokensCurrentGet');
  }
  if (opt_filterTokenId !== undefined) {
    queryParameters['filter_token_id'] = opt_filterTokenId;
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

/**
 * GetTokensDayData
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterTokenId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.TokenV3DayDataDTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3TokensDayDataCurrentGet = function(chainId, opt_filterTokenId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/tokensDayData/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3TokensDayDataCurrentGet');
  }
  if (opt_filterTokenId !== undefined) {
    queryParameters['filter_token_id'] = opt_filterTokenId;
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

/**
 * GetTokensHourData
 * 
 * @param {!string} chainId Chain id
 * @param {!string=} opt_filterTokenId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.TokenHourDataV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3TokensHourDataCurrentGet = function(chainId, opt_filterTokenId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/tokensHourData/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3TokensHourDataCurrentGet');
  }
  if (opt_filterTokenId !== undefined) {
    queryParameters['filter_token_id'] = opt_filterTokenId;
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

/**
 * GetUniswapDayData
 * 
 * @param {!string} chainId Chain id
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.UniswapDayDataV3DTO>>}
 */
API.Client.UniswapV3Api.prototype.chainsChainIdDappsUniswapv3UniswapDayDataCurrentGet = function(chainId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/chains/{chain_id}/dapps/uniswapv3/uniswapDayData/current'
      .replace('{' + 'chain_id' + '}', String(chainId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'chainId' is set
  if (!chainId) {
    throw new Error('Missing required parameter chainId when calling chainsChainIdDappsUniswapv3UniswapDayDataCurrentGet');
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