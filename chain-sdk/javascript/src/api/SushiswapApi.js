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
import CurveExchangeDTO from '../model/CurveExchangeDTO';
import DexTradeDTO from '../model/DexTradeDTO';
import SushiswapBundleDTO from '../model/SushiswapBundleDTO';
import SushiswapBurnDTO from '../model/SushiswapBurnDTO';
import SushiswapDayDataDTO from '../model/SushiswapDayDataDTO';
import SushiswapFactoryDTO from '../model/SushiswapFactoryDTO';
import SushiswapHourDataDTO from '../model/SushiswapHourDataDTO';
import SushiswapLiquidityPositionDTO from '../model/SushiswapLiquidityPositionDTO';
import SushiswapLiquidityPositionSnapshotDTO from '../model/SushiswapLiquidityPositionSnapshotDTO';
import SushiswapMintDTO from '../model/SushiswapMintDTO';
import SushiswapPairDTO from '../model/SushiswapPairDTO';
import SushiswapPairDayDataDTO from '../model/SushiswapPairDayDataDTO';
import SushiswapPairHourDataDTO from '../model/SushiswapPairHourDataDTO';
import SushiswapSwapDTO from '../model/SushiswapSwapDTO';
import SushiswapTokenDTO from '../model/SushiswapTokenDTO';
import SushiswapTokenDayDataDTO from '../model/SushiswapTokenDayDataDTO';
import SushiswapTransactionDTO from '../model/SushiswapTransactionDTO';
import SushiswapUserDTO from '../model/SushiswapUserDTO';

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
     * Callback function to receive the result of the curveGetExchangesCurrent operation.
     * @callback module:api/SushiswapApi~curveGetExchangesCurrentCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/CurveExchangeDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetExchanges (current) 🔥
     * Gets exchanges.
     * @param {module:api/SushiswapApi~curveGetExchangesCurrentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/CurveExchangeDTO>}
     */
    curveGetExchangesCurrent(callback) {
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
      let returnType = [CurveExchangeDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/exchanges/current', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dexGetTradesCurrent operation.
     * @callback module:api/SushiswapApi~dexGetTradesCurrentCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/DexTradeDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetTrades (current) 🔥
     * Gets trades.
     * @param {module:api/SushiswapApi~dexGetTradesCurrentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/DexTradeDTO>}
     */
    dexGetTradesCurrent(callback) {
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
      let returnType = [DexTradeDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/trades/current', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetBundlesHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetBundlesHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapBundleDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetBundles (historical)
     * Gets bundles.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock AAAAAAAAAA
     * @param {Number} opts.endBlock BBBBBBBBBBBB
     * @param {Date} opts.startDate CCCCCCCCC
     * @param {Date} opts.endDate DDDDDDDDDDD
     * @param {module:api/SushiswapApi~sushiswapGetBundlesHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapBundleDTO>}
     */
    sushiswapGetBundlesHistorical(opts, callback) {
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
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapBundleDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/bundles/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetBurnsHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetBurnsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapBurnDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetBurns (historical)
     * Gets burns.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~sushiswapGetBurnsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapBurnDTO>}
     */
    sushiswapGetBurnsHistorical(opts, callback) {
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
      let returnType = [SushiswapBurnDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/burns/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetDayDataHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetDayDataHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapDayDataDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetDayData (historical)
     * Gets day data.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~sushiswapGetDayDataHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapDayDataDTO>}
     */
    sushiswapGetDayDataHistorical(opts, callback) {
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
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapDayDataDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/dayData/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetFactoryHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetFactoryHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapFactoryDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetFactory (historical)
     * Gets factory.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~sushiswapGetFactoryHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapFactoryDTO>}
     */
    sushiswapGetFactoryHistorical(opts, callback) {
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
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapFactoryDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/factory/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetHourDataHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetHourDataHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapHourDataDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetHourData (historical)
     * Gets hour data.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~sushiswapGetHourDataHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapHourDataDTO>}
     */
    sushiswapGetHourDataHistorical(opts, callback) {
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
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapHourDataDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/hourData/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetLiquidityPositionHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetLiquidityPositionHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapLiquidityPositionDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetLiquidityPosition (historical)
     * Gets liquidity position.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~sushiswapGetLiquidityPositionHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapLiquidityPositionDTO>}
     */
    sushiswapGetLiquidityPositionHistorical(opts, callback) {
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
      let returnType = [SushiswapLiquidityPositionDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/liquidityPosition/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetLiquidityPositionSnapshotHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetLiquidityPositionSnapshotHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapLiquidityPositionSnapshotDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetLiquidityPositionSnapshot (historical)
     * Gets liquidity position snapshot.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~sushiswapGetLiquidityPositionSnapshotHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapLiquidityPositionSnapshotDTO>}
     */
    sushiswapGetLiquidityPositionSnapshotHistorical(opts, callback) {
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
      let returnType = [SushiswapLiquidityPositionSnapshotDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/liquidityPositionSnapshots/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetMintsHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetMintsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapMintDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetMints (historical)
     * Gets mints.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~sushiswapGetMintsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapMintDTO>}
     */
    sushiswapGetMintsHistorical(opts, callback) {
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
      let returnType = [SushiswapMintDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/mints/historical', 'GET',
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
     * GetPools (current) 🔥
     * Gets pools.
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
     * Callback function to receive the result of the sushiswapGetPoolsDayDataHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetPoolsDayDataHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapPairDayDataDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetPoolsDayData (historical)
     * Gets pools day data.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~sushiswapGetPoolsDayDataHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapPairDayDataDTO>}
     */
    sushiswapGetPoolsDayDataHistorical(opts, callback) {
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
      let returnType = [SushiswapPairDayDataDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/poolsDayData/historical', 'GET',
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
     * GetPools (historical) 🔥
     * Gets list of pools for given filters.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe
     * @param {String} opts.poolId The pool address.
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
     * Callback function to receive the result of the sushiswapGetPoolsHourDataHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetPoolsHourDataHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapPairHourDataDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetPoolsHourData (historical)
     * Gets pools tracked each our.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.poolId 
     * @param {module:api/SushiswapApi~sushiswapGetPoolsHourDataHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapPairHourDataDTO>}
     */
    sushiswapGetPoolsHourDataHistorical(opts, callback) {
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
      let returnType = [SushiswapPairHourDataDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/poolsHourData/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetSwapsCurrent operation.
     * @callback module:api/SushiswapApi~sushiswapGetSwapsCurrentCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapSwapDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetSwaps (current) 🔥
     * Gets swaps.
     * @param {module:api/SushiswapApi~sushiswapGetSwapsCurrentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapSwapDTO>}
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
      let returnType = [SushiswapSwapDTO];
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
     * GetSwaps (historical) 🔥
     * Gets list of swaps for given filters.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe
     * @param {String} opts.poolId The pool address.
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
     * @param {Array.<module:model/SushiswapTokenDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetTokens (current) 🔥
     * Gets tokens.
     * @param {module:api/SushiswapApi~sushiswapGetTokensCurrentCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapTokenDTO>}
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
      let returnType = [SushiswapTokenDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/tokens/current', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetTokensDayDataHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetTokensDayDataHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapTokenDayDataDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetTokensDayData (historical)
     * Gets tokens day data.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {String} opts.tokenId 
     * @param {module:api/SushiswapApi~sushiswapGetTokensDayDataHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapTokenDayDataDTO>}
     */
    sushiswapGetTokensDayDataHistorical(opts, callback) {
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
      let returnType = [SushiswapTokenDayDataDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/tokensDayData/historical', 'GET',
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
     * GetTokens (historical) 🔥
     * Gets list of tokens for given filters.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
     * @param {Number} opts.endBlock The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
     * @param {Date} opts.startDate The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
     * @param {Date} opts.endDate The end date of timeframe
     * @param {String} opts.tokenId The token address.
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

    /**
     * Callback function to receive the result of the sushiswapGetTransactionsHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetTransactionsHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapTransactionDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetTransactions (historical)
     * Gets transactions.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~sushiswapGetTransactionsHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapTransactionDTO>}
     */
    sushiswapGetTransactionsHistorical(opts, callback) {
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
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapTransactionDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/transactions/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the sushiswapGetUsersHistorical operation.
     * @callback module:api/SushiswapApi~sushiswapGetUsersHistoricalCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/SushiswapUserDTO>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetUsers (historical)
     * Gets users.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.startBlock 
     * @param {Number} opts.endBlock 
     * @param {Date} opts.startDate 
     * @param {Date} opts.endDate 
     * @param {module:api/SushiswapApi~sushiswapGetUsersHistoricalCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/SushiswapUserDTO>}
     */
    sushiswapGetUsersHistorical(opts, callback) {
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
      let accepts = ['text/plain', 'application/json', 'text/json'];
      let returnType = [SushiswapUserDTO];
      return this.apiClient.callApi(
        '/dapps/sushiswap/users/historical', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
