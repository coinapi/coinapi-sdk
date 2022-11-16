/**
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import DexBatchDTO from '../model/DexBatchDTO';
import DexDepositDTO from '../model/DexDepositDTO';
import DexOrderDTO from '../model/DexOrderDTO';
import DexPriceDTO from '../model/DexPriceDTO';
import DexSolutionDTO from '../model/DexSolutionDTO';
import DexStatsDTO from '../model/DexStatsDTO';
import DexTokenDTO from '../model/DexTokenDTO';
import DexTradeDTO from '../model/DexTradeDTO';
import DexUserDTO from '../model/DexUserDTO';
import DexWithdrawDTO from '../model/DexWithdrawDTO';
import DexWithdrawRequestDTO from '../model/DexWithdrawRequestDTO';

/**
* Dex service.
* @module api/DexApi
* @version v1
*/
export default class DexApi {

    /**
    * Constructs a new DexApi. 
    * @alias module:api/DexApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the dexGetBatchsHistorical operation.
     * @callback module:api/DexApi~dexGetBatchsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexBatchDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Batchs (historical) 🔥
     * Gets batchs.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe.
     * @param {String} opts.id Identifier.
     * @param {module:api/DexApi~dexGetBatchsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexBatchDTO>}
     */
    dexGetBatchsHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexBatchDTO];
      return this.apiClient.callApi(
        '/dapps/dex/batchs/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetDepositsHistorical operation.
     * @callback module:api/DexApi~dexGetDepositsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexDepositDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deposits (historical) 🔥
     * Gets deposits.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.id 
     * @param {String} opts.user 
     * @param {module:api/DexApi~dexGetDepositsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexDepositDTO>}
     */
    dexGetDepositsHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id'],
        'user': opts['user']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexDepositDTO];
      return this.apiClient.callApi(
        '/dapps/dex/deposits/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetOrdersHistorical operation.
     * @callback module:api/DexApi~dexGetOrdersHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexOrderDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Orders (historical) 🔥
     * Gets orders.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.id 
     * @param {String} opts.buyToken 
     * @param {String} opts.sellToken 
     * @param {module:api/DexApi~dexGetOrdersHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexOrderDTO>}
     */
    dexGetOrdersHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id'],
        'buy_token': opts['buyToken'],
        'sell_token': opts['sellToken']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexOrderDTO];
      return this.apiClient.callApi(
        '/dapps/dex/orders/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetPricesHistorical operation.
     * @callback module:api/DexApi~dexGetPricesHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexPriceDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Prices (historical) 🔥
     * Gets prices.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.id 
     * @param {module:api/DexApi~dexGetPricesHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexPriceDTO>}
     */
    dexGetPricesHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexPriceDTO];
      return this.apiClient.callApi(
        '/dapps/dex/prices/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetSolutionsHistorical operation.
     * @callback module:api/DexApi~dexGetSolutionsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexSolutionDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Solutions (historical) 🔥
     * Gets solutions.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe.
     * @param {String} opts.id 
     * @param {module:api/DexApi~dexGetSolutionsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexSolutionDTO>}
     */
    dexGetSolutionsHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexSolutionDTO];
      return this.apiClient.callApi(
        '/dapps/dex/solutions/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetStatssHistorical operation.
     * @callback module:api/DexApi~dexGetStatssHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexStatsDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Statss (historical) 🔥
     * Gets statss.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe.
     * @param {String} opts.id 
     * @param {module:api/DexApi~dexGetStatssHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexStatsDTO>}
     */
    dexGetStatssHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexStatsDTO];
      return this.apiClient.callApi(
        '/dapps/dex/statss/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetTokensHistorical operation.
     * @callback module:api/DexApi~dexGetTokensHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexTokenDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Tokens (historical) 🔥
     * Gets tokens.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe.
     * @param {String} opts.id 
     * @param {String} opts.address 
     * @param {String} opts.symbol 
     * @param {String} opts.name 
     * @param {module:api/DexApi~dexGetTokensHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexTokenDTO>}
     */
    dexGetTokensHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id'],
        'address': opts['address'],
        'symbol': opts['symbol'],
        'name': opts['name']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexTokenDTO];
      return this.apiClient.callApi(
        '/dapps/dex/tokens/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetTradesHistorical operation.
     * @callback module:api/DexApi~dexGetTradesHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexTradeDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Trades (historical) 🔥
     * Gets trades.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe.
     * @param {String} opts.id 
     * @param {String} opts.buyToken 
     * @param {String} opts.sellToken 
     * @param {module:api/DexApi~dexGetTradesHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexTradeDTO>}
     */
    dexGetTradesHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id'],
        'buy_token': opts['buyToken'],
        'sell_token': opts['sellToken']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexTradeDTO];
      return this.apiClient.callApi(
        '/dapps/dex/trades/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetUsersHistorical operation.
     * @callback module:api/DexApi~dexGetUsersHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexUserDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Users (historical) 🔥
     * Gets users.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe.
     * @param {String} opts.id 
     * @param {module:api/DexApi~dexGetUsersHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexUserDTO>}
     */
    dexGetUsersHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexUserDTO];
      return this.apiClient.callApi(
        '/dapps/dex/users/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetWithdrawRequestsHistorical operation.
     * @callback module:api/DexApi~dexGetWithdrawRequestsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexWithdrawRequestDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * WithdrawRequests (historical) 🔥
     * Gets withdrawrequests.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.id 
     * @param {String} opts.user 
     * @param {module:api/DexApi~dexGetWithdrawRequestsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexWithdrawRequestDTO>}
     */
    dexGetWithdrawRequestsHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id'],
        'user': opts['user']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexWithdrawRequestDTO];
      return this.apiClient.callApi(
        '/dapps/dex/withdrawrequests/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetWithdrawsHistorical operation.
     * @callback module:api/DexApi~dexGetWithdrawsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexWithdrawDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Withdraws (historical) 🔥
     * Gets withdraws.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.id 
     * @param {String} opts.user 
     * @param {module:api/DexApi~dexGetWithdrawsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexWithdrawDTO>}
     */
    dexGetWithdrawsHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'id': opts['id'],
        'user': opts['user']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [DexWithdrawDTO];
      return this.apiClient.callApi(
        '/dapps/dex/withdraws/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
