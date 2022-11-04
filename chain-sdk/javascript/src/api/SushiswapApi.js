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
import SushiswapPairDTO from '../model/SushiswapPairDTO';
import SushiswapSwapDTO from '../model/SushiswapSwapDTO';
import SushiswapTokenDTO from '../model/SushiswapTokenDTO';

/**
* Sushiswap service.
* @module api/SushiswapApi
* @version v1
*/
export default class SushiswapApi {

    /**
    * Constructs a new SushiswapApi. 
    * @alias module:api/SushiswapApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the dappsSushiswapBundlesHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapBundlesHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~dappsSushiswapBundlesHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapBundlesHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/bundles/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapBurnsHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapBurnsHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~dappsSushiswapBurnsHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapBurnsHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'poolId': opts['poolId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/burns/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapDayDataHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapDayDataHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~dappsSushiswapDayDataHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapDayDataHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/dayData/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapFactoryHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapFactoryHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~dappsSushiswapFactoryHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapFactoryHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/factory/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapHourDataHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapHourDataHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~dappsSushiswapHourDataHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapHourDataHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/hourData/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapLiquidityPositionHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapLiquidityPositionHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~dappsSushiswapLiquidityPositionHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapLiquidityPositionHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'poolId': opts['poolId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/liquidityPosition/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapLiquidityPositionSnapshotsHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapLiquidityPositionSnapshotsHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~dappsSushiswapLiquidityPositionSnapshotsHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapLiquidityPositionSnapshotsHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'poolId': opts['poolId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/liquidityPositionSnapshots/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapMintsHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapMintsHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~dappsSushiswapMintsHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapMintsHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'poolId': opts['poolId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/mints/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapPoolDayDataHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapPoolDayDataHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~dappsSushiswapPoolDayDataHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapPoolDayDataHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'poolId': opts['poolId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/poolDayData/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapPoolHourDataHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapPoolHourDataHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~dappsSushiswapPoolHourDataHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapPoolHourDataHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'poolId': opts['poolId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/poolHourData/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapTokenDayDataHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapTokenDayDataHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.tokenId 
     * @param {module:api/SushiswapApi~dappsSushiswapTokenDayDataHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapTokenDayDataHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'tokenId': opts['tokenId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/tokenDayData/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapTransactionsHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapTransactionsHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~dappsSushiswapTransactionsHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapTransactionsHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/transactions/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dappsSushiswapUsersHistoricalGet operation.
     * @callback module:api/SushiswapApi~dappsSushiswapUsersHistoricalGetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~dappsSushiswapUsersHistoricalGetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    dappsSushiswapUsersHistoricalGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/dapps/sushiswap/users/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetPoolsCurrent operation.
     * @callback module:api/SushiswapApi~sushiswapGetPoolsCurrentCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapPairDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets latest ETH.DeFi.DTO.Sushiswap.PairDTO.
     * @param {module:api/SushiswapApi~sushiswapGetPoolsCurrentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapPairDTO>}
     */
    sushiswapGetPoolsCurrent(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapPairDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/pools/current', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetPoolsHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetPoolsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapPairDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets list of ETH.DeFi.DTO.Sushiswap.PairDTO data for the given filters.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~sushiswapGetPoolsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapPairDTO>}
     */
    sushiswapGetPoolsHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'poolId': opts['poolId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapPairDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/pools/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetSwapsCurrent operation.
     * @callback module:api/SushiswapApi~sushiswapGetSwapsCurrentCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SushiswapSwapDTO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets latest ETH.DeFi.DTO.Sushiswap.SwapDTO.
     * @param {module:api/SushiswapApi~sushiswapGetSwapsCurrentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SushiswapSwapDTO}
     */
    sushiswapGetSwapsCurrent(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = SushiswapSwapDTO;
      return this.apiClient.callApi(
        '/dapps/sushiswap/swaps/current', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetSwapsHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetSwapsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapSwapDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets list of ETH.DeFi.DTO.Sushiswap.SwapDTO data for the given filters.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~sushiswapGetSwapsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapSwapDTO>}
     */
    sushiswapGetSwapsHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'poolId': opts['poolId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapSwapDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/swaps/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetTokensCurrent operation.
     * @callback module:api/SushiswapApi~sushiswapGetTokensCurrentCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SushiswapTokenDTO} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets latest ETH.DeFi.DTO.Sushiswap.TokenDTO.
     * @param {module:api/SushiswapApi~sushiswapGetTokensCurrentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SushiswapTokenDTO}
     */
    sushiswapGetTokensCurrent(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = SushiswapTokenDTO;
      return this.apiClient.callApi(
        '/dapps/sushiswap/tokens/current', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetTokensHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetTokensHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapTokenDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets list of ETH.DeFi.DTO.Sushiswap.TokenDTO for the given filters.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.tokenId 
     * @param {module:api/SushiswapApi~sushiswapGetTokensHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapTokenDTO>}
     */
    sushiswapGetTokensHistorical(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'startBlock': opts['startBlock'],
        'endBlock': opts['endBlock'],
        'startDate': opts['startDate'],
        'endDate': opts['endDate'],
        'tokenId': opts['tokenId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapTokenDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/tokens/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
