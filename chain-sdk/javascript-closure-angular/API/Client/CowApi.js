/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.CowApi.
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

goog.provide('API.Client.CowApi');

goog.require('API.Client.Cow.OrderDTO');
goog.require('API.Client.Cow.SettlementDTO');
goog.require('API.Client.Cow.TokenDTO');
goog.require('API.Client.Cow.TradeDTO');
goog.require('API.Client.Cow.UserDTO');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.CowApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('CowApiBasePath') ?
                   /** @type {!string} */ ($injector.get('CowApiBasePath')) :
                   'https://onchain.coinapi.io';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('CowApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('CowApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.CowApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Orders (historical)
 * Gets orders.
 * @param {!number=} opt_startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
 * @param {!number=} opt_endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
 * @param {!Date=} opt_startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
 * @param {!Date=} opt_endDate The end date of timeframe.
 * @param {!string=} opt_id User&#39;s address.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.OrderDTO>>}
 */
API.Client.CowApi.prototype.cowGetOrdersHistorical = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_id, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/orders/historical';

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

  if (opt_id !== undefined) {
    queryParameters['id'] = opt_id;
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
 * Settlements (historical)
 * Gets settlements.
 * @param {!number=} opt_startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
 * @param {!number=} opt_endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
 * @param {!Date=} opt_startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
 * @param {!Date=} opt_endDate The end date of timeframe.
 * @param {!string=} opt_id Transaction hash.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.SettlementDTO>>}
 */
API.Client.CowApi.prototype.cowGetSettlementsHistorical = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_id, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/settlements/historical';

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

  if (opt_id !== undefined) {
    queryParameters['id'] = opt_id;
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
 * Tokens (historical)
 * Gets tokens.
 * @param {!number=} opt_startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
 * @param {!number=} opt_endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
 * @param {!Date=} opt_startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
 * @param {!Date=} opt_endDate The end date of timeframe.
 * @param {!string=} opt_id Token&#39;s address.
 * @param {!string=} opt_address Token&#39;s address.
 * @param {!string=} opt_name Token name fetched by ERC20 contract call.
 * @param {!string=} opt_symbol Token symbol fetched by contract call.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.TokenDTO>>}
 */
API.Client.CowApi.prototype.cowGetTokensHistorical = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_id, opt_address, opt_name, opt_symbol, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/tokens/historical';

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

  if (opt_id !== undefined) {
    queryParameters['id'] = opt_id;
  }

  if (opt_address !== undefined) {
    queryParameters['address'] = opt_address;
  }

  if (opt_name !== undefined) {
    queryParameters['name'] = opt_name;
  }

  if (opt_symbol !== undefined) {
    queryParameters['symbol'] = opt_symbol;
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
 * Trades (historical)
 * Gets trades.
 * @param {!number=} opt_startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
 * @param {!number=} opt_endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
 * @param {!Date=} opt_startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
 * @param {!Date=} opt_endDate The end date of timeframe.
 * @param {!string=} opt_id Identifier, format: (order id)|(transaction hash)|(event index).
 * @param {!string=} opt_sellToken Address of token that is sold.
 * @param {!string=} opt_buyToken Address of token that is bought.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.TradeDTO>>}
 */
API.Client.CowApi.prototype.cowGetTradesHistorical = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_id, opt_sellToken, opt_buyToken, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/trades/historical';

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

  if (opt_id !== undefined) {
    queryParameters['id'] = opt_id;
  }

  if (opt_sellToken !== undefined) {
    queryParameters['sell_token'] = opt_sellToken;
  }

  if (opt_buyToken !== undefined) {
    queryParameters['buy_token'] = opt_buyToken;
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
 * Users (historical)
 * Gets users.
 * @param {!number=} opt_startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
 * @param {!number=} opt_endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
 * @param {!Date=} opt_startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
 * @param {!Date=} opt_endDate The end date of timeframe.
 * @param {!string=} opt_id User&#39;s address.
 * @param {!string=} opt_address User&#39;s address.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.UserDTO>>}
 */
API.Client.CowApi.prototype.cowGetUsersHistorical = function(opt_startBlock, opt_endBlock, opt_startDate, opt_endDate, opt_id, opt_address, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/users/historical';

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

  if (opt_id !== undefined) {
    queryParameters['id'] = opt_id;
  }

  if (opt_address !== undefined) {
    queryParameters['address'] = opt_address;
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
 * Orders (current)
 * Gets orders.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.OrderDTO>>}
 */
API.Client.CowApi.prototype.cowOrdersCurrent = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/orders/current';

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
 * Settlements (current)
 * Gets settlements.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.SettlementDTO>>}
 */
API.Client.CowApi.prototype.cowSettlementsCurrent = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/settlements/current';

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
 * Tokens (current)
 * Gets tokens.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.TokenDTO>>}
 */
API.Client.CowApi.prototype.cowTokensCurrent = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/tokens/current';

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
 * Trades (current)
 * Gets trades.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.TradeDTO>>}
 */
API.Client.CowApi.prototype.cowTradesCurrent = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/trades/current';

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
 * Users (current)
 * Gets users.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.Cow.UserDTO>>}
 */
API.Client.CowApi.prototype.cowUsersCurrent = function(opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/dapps/cow/users/current';

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
