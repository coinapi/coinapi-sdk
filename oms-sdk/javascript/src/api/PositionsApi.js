/**
 * OMS - REST API .
 * OMS Project
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import Position from '../model/Position';

/**
* Positions service.
* @module api/PositionsApi
* @version v1
*/
export default class PositionsApi {

    /**
    * Constructs a new PositionsApi. 
    * @alias module:api/PositionsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the v1PositionsGet operation.
     * @callback module:api/PositionsApi~v1PositionsGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Position>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get positions
     * Returns all of your positions.
     * @param {Object} opts Optional parameters
     * @param {String} opts.exchangeId Exchange name
     * @param {module:api/PositionsApi~v1PositionsGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Position>}
     */
    v1PositionsGet(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'exchange_id': opts['exchangeId']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Position];
      return this.apiClient.callApi(
        '/v1/positions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
