/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.SushiswapApi.
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

goog.provide('API.Client.SushiswapApi');

goog.require('API.Client.PairDTO');
goog.require('API.Client.SwapDTO');
goog.require('API.Client.TokenDTO');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.SushiswapApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('SushiswapApiBasePath') ?
                   /** @type {!string} */ ($injector.get('SushiswapApiBasePath')) :
                   'https://onchain.coinapi.io';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('SushiswapApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('SushiswapApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.SushiswapApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapBundlesHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/bundles/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

/**
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_poolId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapBurnsHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_poolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/burns/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_poolId !== undefined) {
    queryParameters['poolId'] = opt_poolId;
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
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapDayDataHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/dayData/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

/**
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapFactoryHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/factory/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

/**
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapHourDataHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/hourData/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

/**
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_poolId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapLiquidityPositionHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_poolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/liquidityPosition/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_poolId !== undefined) {
    queryParameters['poolId'] = opt_poolId;
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
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_poolId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapLiquidityPositionSnapshotsHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_poolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/liquidityPositionSnapshots/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_poolId !== undefined) {
    queryParameters['poolId'] = opt_poolId;
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
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_poolId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapMintsHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_poolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/mints/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_poolId !== undefined) {
    queryParameters['poolId'] = opt_poolId;
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
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_poolId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapPoolDayDataHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_poolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/poolDayData/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_poolId !== undefined) {
    queryParameters['poolId'] = opt_poolId;
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
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_poolId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapPoolHourDataHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_poolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/poolHourData/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_poolId !== undefined) {
    queryParameters['poolId'] = opt_poolId;
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
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.PairDTO>>}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapPoolsCurrentGet = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/pools/current';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_poolId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.PairDTO>>}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapPoolsHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_poolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/pools/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_poolId !== undefined) {
    queryParameters['poolId'] = opt_poolId;
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
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.SwapDTO>>}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapSwapsCurrentGet = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/swaps/current';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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
 * GetSwaps (historical)
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_poolId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.SwapDTO>>}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapSwapsHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_poolId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/swaps/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_poolId !== undefined) {
    queryParameters['poolId'] = opt_poolId;
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
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_tokenId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapTokenDayDataHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_tokenId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/tokenDayData/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_tokenId !== undefined) {
    queryParameters['tokenId'] = opt_tokenId;
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
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.TokenDTO>>}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapTokensCurrentGet = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/tokens/current';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!string=} opt_tokenId 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.TokenDTO>>}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapTokensHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_tokenId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/tokens/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

  if (opt_tokenId !== undefined) {
    queryParameters['tokenId'] = opt_tokenId;
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
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapTransactionsHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/transactions/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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

/**
 * 
 * 
 * @param {!number=} opt_startBlock 
 * @param {!number=} opt_endBlock 
 * @param {!Date=} opt_startDate 
 * @param {!Date=} opt_endDate 
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise}
 */
API.Client.SushiswapApi.prototype.dappsSushiswapUsersHistoricalGet = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/sushiswap/users/historical';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
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
