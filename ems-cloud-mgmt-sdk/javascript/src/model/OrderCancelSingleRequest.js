/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The OrderCancelSingleRequest model module.
 * @module model/OrderCancelSingleRequest
 * @version v1
 */
class OrderCancelSingleRequest {
    /**
     * Constructs a new <code>OrderCancelSingleRequest</code>.
     * Cancel single order request object.
     * @alias module:model/OrderCancelSingleRequest
     * @param exchangeId {String} Exchange identifier used to identify the routing destination.
     */
    constructor(exchangeId) { 
        
        OrderCancelSingleRequest.initialize(this, exchangeId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, exchangeId) { 
        obj['exchange_id'] = exchangeId;
    }

    /**
     * Constructs a <code>OrderCancelSingleRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderCancelSingleRequest} obj Optional instance to populate.
     * @return {module:model/OrderCancelSingleRequest} The populated <code>OrderCancelSingleRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderCancelSingleRequest();

            if (data.hasOwnProperty('exchange_id')) {
                obj['exchange_id'] = ApiClient.convertToType(data['exchange_id'], 'String');
            }
            if (data.hasOwnProperty('exchange_order_id')) {
                obj['exchange_order_id'] = ApiClient.convertToType(data['exchange_order_id'], 'String');
            }
            if (data.hasOwnProperty('client_order_id')) {
                obj['client_order_id'] = ApiClient.convertToType(data['client_order_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OrderCancelSingleRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OrderCancelSingleRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OrderCancelSingleRequest.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['exchange_id'] && !(typeof data['exchange_id'] === 'string' || data['exchange_id'] instanceof String)) {
            throw new Error("Expected the field `exchange_id` to be a primitive type in the JSON string but got " + data['exchange_id']);
        }
        // ensure the json data is a string
        if (data['exchange_order_id'] && !(typeof data['exchange_order_id'] === 'string' || data['exchange_order_id'] instanceof String)) {
            throw new Error("Expected the field `exchange_order_id` to be a primitive type in the JSON string but got " + data['exchange_order_id']);
        }
        // ensure the json data is a string
        if (data['client_order_id'] && !(typeof data['client_order_id'] === 'string' || data['client_order_id'] instanceof String)) {
            throw new Error("Expected the field `client_order_id` to be a primitive type in the JSON string but got " + data['client_order_id']);
        }

        return true;
    }


}

OrderCancelSingleRequest.RequiredProperties = ["exchange_id"];

/**
 * Exchange identifier used to identify the routing destination.
 * @member {String} exchange_id
 */
OrderCancelSingleRequest.prototype['exchange_id'] = undefined;

/**
 * Unique identifier of the order assigned by the exchange or executing system. One of the properties (`exchange_order_id`, `client_order_id`) is required to identify the new order.
 * @member {String} exchange_order_id
 */
OrderCancelSingleRequest.prototype['exchange_order_id'] = undefined;

/**
 * The unique identifier of the order assigned by the client. One of the properties (`exchange_order_id`, `client_order_id`) is required to identify the new order.
 * @member {String} client_order_id
 */
OrderCancelSingleRequest.prototype['client_order_id'] = undefined;






export default OrderCancelSingleRequest;

