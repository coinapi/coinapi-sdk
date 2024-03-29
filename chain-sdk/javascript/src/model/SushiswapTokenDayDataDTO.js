/**
 * On Chain Dapps - REST API
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

import ApiClient from '../ApiClient';

/**
 * The SushiswapTokenDayDataDTO model module.
 * @module model/SushiswapTokenDayDataDTO
 * @version v1
 */
class SushiswapTokenDayDataDTO {
    /**
     * Constructs a new <code>SushiswapTokenDayDataDTO</code>.
     * Token data aggregated across all pairs that include token.
     * @alias module:model/SushiswapTokenDayDataDTO
     */
    constructor() { 
        
        SushiswapTokenDayDataDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SushiswapTokenDayDataDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SushiswapTokenDayDataDTO} obj Optional instance to populate.
     * @return {module:model/SushiswapTokenDayDataDTO} The populated <code>SushiswapTokenDayDataDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SushiswapTokenDayDataDTO();

            if (data.hasOwnProperty('entry_time')) {
                obj['entry_time'] = ApiClient.convertToType(data['entry_time'], 'Date');
            }
            if (data.hasOwnProperty('recv_time')) {
                obj['recv_time'] = ApiClient.convertToType(data['recv_time'], 'Date');
            }
            if (data.hasOwnProperty('block_number')) {
                obj['block_number'] = ApiClient.convertToType(data['block_number'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Number');
            }
            if (data.hasOwnProperty('token')) {
                obj['token'] = ApiClient.convertToType(data['token'], 'String');
            }
            if (data.hasOwnProperty('volume')) {
                obj['volume'] = ApiClient.convertToType(data['volume'], 'String');
            }
            if (data.hasOwnProperty('volume_eth')) {
                obj['volume_eth'] = ApiClient.convertToType(data['volume_eth'], 'String');
            }
            if (data.hasOwnProperty('volume_usd')) {
                obj['volume_usd'] = ApiClient.convertToType(data['volume_usd'], 'String');
            }
            if (data.hasOwnProperty('tx_count')) {
                obj['tx_count'] = ApiClient.convertToType(data['tx_count'], 'String');
            }
            if (data.hasOwnProperty('liquidity')) {
                obj['liquidity'] = ApiClient.convertToType(data['liquidity'], 'String');
            }
            if (data.hasOwnProperty('liquidity_eth')) {
                obj['liquidity_eth'] = ApiClient.convertToType(data['liquidity_eth'], 'String');
            }
            if (data.hasOwnProperty('liquidity_usd')) {
                obj['liquidity_usd'] = ApiClient.convertToType(data['liquidity_usd'], 'String');
            }
            if (data.hasOwnProperty('price_usd')) {
                obj['price_usd'] = ApiClient.convertToType(data['price_usd'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SushiswapTokenDayDataDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SushiswapTokenDayDataDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['token'] && !(typeof data['token'] === 'string' || data['token'] instanceof String)) {
            throw new Error("Expected the field `token` to be a primitive type in the JSON string but got " + data['token']);
        }
        // ensure the json data is a string
        if (data['volume'] && !(typeof data['volume'] === 'string' || data['volume'] instanceof String)) {
            throw new Error("Expected the field `volume` to be a primitive type in the JSON string but got " + data['volume']);
        }
        // ensure the json data is a string
        if (data['volume_eth'] && !(typeof data['volume_eth'] === 'string' || data['volume_eth'] instanceof String)) {
            throw new Error("Expected the field `volume_eth` to be a primitive type in the JSON string but got " + data['volume_eth']);
        }
        // ensure the json data is a string
        if (data['volume_usd'] && !(typeof data['volume_usd'] === 'string' || data['volume_usd'] instanceof String)) {
            throw new Error("Expected the field `volume_usd` to be a primitive type in the JSON string but got " + data['volume_usd']);
        }
        // ensure the json data is a string
        if (data['tx_count'] && !(typeof data['tx_count'] === 'string' || data['tx_count'] instanceof String)) {
            throw new Error("Expected the field `tx_count` to be a primitive type in the JSON string but got " + data['tx_count']);
        }
        // ensure the json data is a string
        if (data['liquidity'] && !(typeof data['liquidity'] === 'string' || data['liquidity'] instanceof String)) {
            throw new Error("Expected the field `liquidity` to be a primitive type in the JSON string but got " + data['liquidity']);
        }
        // ensure the json data is a string
        if (data['liquidity_eth'] && !(typeof data['liquidity_eth'] === 'string' || data['liquidity_eth'] instanceof String)) {
            throw new Error("Expected the field `liquidity_eth` to be a primitive type in the JSON string but got " + data['liquidity_eth']);
        }
        // ensure the json data is a string
        if (data['liquidity_usd'] && !(typeof data['liquidity_usd'] === 'string' || data['liquidity_usd'] instanceof String)) {
            throw new Error("Expected the field `liquidity_usd` to be a primitive type in the JSON string but got " + data['liquidity_usd']);
        }
        // ensure the json data is a string
        if (data['price_usd'] && !(typeof data['price_usd'] === 'string' || data['price_usd'] instanceof String)) {
            throw new Error("Expected the field `price_usd` to be a primitive type in the JSON string but got " + data['price_usd']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
SushiswapTokenDayDataDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
SushiswapTokenDayDataDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
SushiswapTokenDayDataDTO.prototype['block_number'] = undefined;

/**
 * Identifier, day start timestamp in unix / 86400.
 * @member {String} id
 */
SushiswapTokenDayDataDTO.prototype['id'] = undefined;

/**
 * Unix timestamp for start of day.
 * @member {Number} date
 */
SushiswapTokenDayDataDTO.prototype['date'] = undefined;

/**
 * Reference to token entity.
 * @member {String} token
 */
SushiswapTokenDayDataDTO.prototype['token'] = undefined;

/**
 * Amount of token swapped across all pairs throughout day.
 * @member {String} volume
 */
SushiswapTokenDayDataDTO.prototype['volume'] = undefined;

/**
 * Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
 * @member {String} volume_eth
 */
SushiswapTokenDayDataDTO.prototype['volume_eth'] = undefined;

/**
 * Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
 * @member {String} volume_usd
 */
SushiswapTokenDayDataDTO.prototype['volume_usd'] = undefined;

/**
 * Amount of transactions with this token across all pairs.
 * @member {String} tx_count
 */
SushiswapTokenDayDataDTO.prototype['tx_count'] = undefined;

/**
 * Token amount of token deposited across all pairs.
 * @member {String} liquidity
 */
SushiswapTokenDayDataDTO.prototype['liquidity'] = undefined;

/**
 * Token amount of token deposited across all pairs stored as amount of ETH.
 * @member {String} liquidity_eth
 */
SushiswapTokenDayDataDTO.prototype['liquidity_eth'] = undefined;

/**
 * Token amount of token deposited across all pairs stored as amount of USD.
 * @member {String} liquidity_usd
 */
SushiswapTokenDayDataDTO.prototype['liquidity_usd'] = undefined;

/**
 * Price of token in derived USD.
 * @member {String} price_usd
 */
SushiswapTokenDayDataDTO.prototype['price_usd'] = undefined;

/**
 * 
 * @member {Number} vid
 */
SushiswapTokenDayDataDTO.prototype['vid'] = undefined;






export default SushiswapTokenDayDataDTO;

