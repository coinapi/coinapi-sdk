/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.OrdersApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This section will provide necessary information about the &#x60;CoinAPI EMS REST API&#x60; protocol. This API is also available in the Postman application: &lt;a href&#x3D;\&quot;https://postman.coinapi.io/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;https://postman.coinapi.io/&lt;/a&gt;        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  &lt;table&gt;   &lt;thead&gt;     &lt;tr&gt;       &lt;th&gt;Deployment method&lt;/th&gt;       &lt;th&gt;Environment&lt;/th&gt;       &lt;th&gt;Url&lt;/th&gt;     &lt;/tr&gt;   &lt;/thead&gt;   &lt;tbody&gt;     &lt;tr&gt;       &lt;td&gt;Managed Cloud&lt;/td&gt;       &lt;td&gt;Production&lt;/td&gt;       &lt;td&gt;Use &lt;a href&#x3D;\&quot;#ems-docs-sh\&quot;&gt;Managed Cloud REST API /v1/locations&lt;/a&gt; to get specific endpoints to each server site where your deployments span&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;Managed Cloud&lt;/td&gt;       &lt;td&gt;Sandbox&lt;/td&gt;       &lt;td&gt;&lt;code&gt;https://ems-gateway-aws-eu-central-1-dev.coinapi.io/&lt;/code&gt;&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;Self Hosted&lt;/td&gt;       &lt;td&gt;Production&lt;/td&gt;       &lt;td&gt;IP Address of the &lt;code&gt;ems-gateway&lt;/code&gt; container/excecutable in the closest server site to the caller location&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;Self Hosted&lt;/td&gt;       &lt;td&gt;Sandbox&lt;/td&gt;       &lt;td&gt;IP Address of the &lt;code&gt;ems-gateway&lt;/code&gt; container/excecutable in the closest server site to the caller location&lt;/td&gt;     &lt;/tr&gt;   &lt;/tbody&gt; &lt;/table&gt;  ### Authentication If the software is deployed as &#x60;Self-Hosted&#x60; then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our &#x60;Managed Cloud&#x60;, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named &#x60;X-CoinAPI-Key&#x60; with the API Key  2. Query string parameter named &#x60;apikey&#x60; with the API Key  3. &lt;a href&#x3D;\&quot;#certificate\&quot;&gt;TLS Client Certificate&lt;/a&gt; from the &#x60;Managed Cloud REST API&#x60; (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named &#x60;X-CoinAPI-Key&#x60; and API key as its value. Assuming that your API key is &#x60;73034021-THIS-IS-SAMPLE-KEY&#x60;, then the authorization header you should send to us will look like: &#x60;X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY&#x60; &lt;aside class&#x3D;\&quot;success\&quot;&gt;This method is recommended by us and you should use it in production environments.&lt;/aside&gt; #### Query string authorization parameter You can authorize by providing an additional parameter named &#x60;apikey&#x60; with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is &#x60;73034021-THIS-IS-SAMPLE-KEY&#x60; and that you want to request all balances, then your query string should look like this: &#x60;GET /v1/balances?apikey&#x3D;73034021-THIS-IS-SAMPLE-KEY&#x60; &lt;aside class&#x3D;\&quot;notice\&quot;&gt;Query string method may be more practical for development activities.&lt;/aside&gt; 
 * Version: v1
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license 28961
 * https://github.com/coinapi/coinapi-sdk/blob/master/LICENSE
 */

goog.provide('API.Client.OrdersApi');

goog.require('API.Client.MessageError');
goog.require('API.Client.MessageReject');
goog.require('API.Client.OrderCancelAllRequest');
goog.require('API.Client.OrderCancelSingleRequest');
goog.require('API.Client.OrderExecutionReport');
goog.require('API.Client.OrderHistory');
goog.require('API.Client.OrderNewSingleRequest');
goog.require('API.Client.ValidationError');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.OrdersApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('OrdersApiBasePath') ?
                   /** @type {!string} */ ($injector.get('OrdersApiBasePath')) :
                   'https://ems-gateway-aws-eu-central-1-dev.coinapi.io';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('OrdersApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('OrdersApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.OrdersApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Cancel all orders request
 * This request cancels all open orders on single specified exchange.
 * @param {!OrderCancelAllRequest} orderCancelAllRequest OrderCancelAllRequest object.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.MessageReject>}
 */
API.Client.OrdersApi.prototype.v1OrdersCancelAllPost = function(orderCancelAllRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/orders/cancel/all';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'orderCancelAllRequest' is set
  if (!orderCancelAllRequest) {
    throw new Error('Missing required parameter orderCancelAllRequest when calling v1OrdersCancelAllPost');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: orderCancelAllRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Cancel order request
 * Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
 * @param {!OrderCancelSingleRequest} orderCancelSingleRequest OrderCancelSingleRequest object.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.OrderExecutionReport>}
 */
API.Client.OrdersApi.prototype.v1OrdersCancelPost = function(orderCancelSingleRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/orders/cancel';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'orderCancelSingleRequest' is set
  if (!orderCancelSingleRequest) {
    throw new Error('Missing required parameter orderCancelSingleRequest when calling v1OrdersCancelPost');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: orderCancelSingleRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Get open orders
 * Get last execution reports for open orders across all or single exchange.
 * @param {!string=} opt_exchangeId Filter the open orders to the specific exchange.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.OrderExecutionReport>>}
 */
API.Client.OrdersApi.prototype.v1OrdersGet = function(opt_exchangeId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/orders';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  if (opt_exchangeId !== undefined) {
    queryParameters['exchange_id'] = opt_exchangeId;
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
 * History of order changes
 * Based on the date range, all changes registered in the orderbook.
 * @param {!string} timeStart Start date
 * @param {!string} timeEnd End date
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!Array<!API.Client.OrderHistory>>}
 */
API.Client.OrdersApi.prototype.v1OrdersHistoryGet = function(timeStart, timeEnd, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/orders/history';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'timeStart' is set
  if (!timeStart) {
    throw new Error('Missing required parameter timeStart when calling v1OrdersHistoryGet');
  }
  // verify required parameter 'timeEnd' is set
  if (!timeEnd) {
    throw new Error('Missing required parameter timeEnd when calling v1OrdersHistoryGet');
  }
  if (timeStart !== undefined) {
    queryParameters['time_start'] = timeStart;
  }

  if (timeEnd !== undefined) {
    queryParameters['time_end'] = timeEnd;
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
 * Send new order
 * This request creating new order for the specific exchange.
 * @param {!OrderNewSingleRequest} orderNewSingleRequest OrderNewSingleRequest object.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.OrderExecutionReport>}
 */
API.Client.OrdersApi.prototype.v1OrdersPost = function(orderNewSingleRequest, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/orders';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'orderNewSingleRequest' is set
  if (!orderNewSingleRequest) {
    throw new Error('Missing required parameter orderNewSingleRequest when calling v1OrdersPost');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'POST',
    url: path,
    json: true,
    data: orderNewSingleRequest,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}

/**
 * Get order execution report
 * Get the last order execution report for the specified order. The requested order does not need to be active or opened.
 * @param {!string} clientOrderId The unique identifier of the order assigned by the client.
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.OrderExecutionReport>}
 */
API.Client.OrdersApi.prototype.v1OrdersStatusClientOrderIdGet = function(clientOrderId, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/v1/orders/status/{client_order_id}'
      .replace('{' + 'client_order_id' + '}', String(clientOrderId));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'clientOrderId' is set
  if (!clientOrderId) {
    throw new Error('Missing required parameter clientOrderId when calling v1OrdersStatusClientOrderIdGet');
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
