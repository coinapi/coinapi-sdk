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

import ApiClient from '../ApiClient';

/**
 * The UniswapV2TokenDayDataDTO model module.
 * @module model/UniswapV2TokenDayDataDTO
 * @version v1
 */
class UniswapV2TokenDayDataDTO {
    /**
     * Constructs a new <code>UniswapV2TokenDayDataDTO</code>.
     * Token data aggregated across all pairs that include token.
     * @alias module:model/UniswapV2TokenDayDataDTO
     */
    constructor() { 
        
        UniswapV2TokenDayDataDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniswapV2TokenDayDataDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniswapV2TokenDayDataDTO} obj Optional instance to populate.
     * @return {module:model/UniswapV2TokenDayDataDTO} The populated <code>UniswapV2TokenDayDataDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniswapV2TokenDayDataDTO();

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
            if (data.hasOwnProperty('daily_volume_token')) {
                obj['daily_volume_token'] = ApiClient.convertToType(data['daily_volume_token'], 'String');
            }
            if (data.hasOwnProperty('daily_volume_eth')) {
                obj['daily_volume_eth'] = ApiClient.convertToType(data['daily_volume_eth'], 'String');
            }
            if (data.hasOwnProperty('daily_volume_usd')) {
                obj['daily_volume_usd'] = ApiClient.convertToType(data['daily_volume_usd'], 'String');
            }
            if (data.hasOwnProperty('daily_txns')) {
                obj['daily_txns'] = ApiClient.convertToType(data['daily_txns'], 'String');
            }
            if (data.hasOwnProperty('total_liquidity_token')) {
                obj['total_liquidity_token'] = ApiClient.convertToType(data['total_liquidity_token'], 'String');
            }
            if (data.hasOwnProperty('total_liquidity_eth')) {
                obj['total_liquidity_eth'] = ApiClient.convertToType(data['total_liquidity_eth'], 'String');
            }
            if (data.hasOwnProperty('total_liquidity_usd')) {
                obj['total_liquidity_usd'] = ApiClient.convertToType(data['total_liquidity_usd'], 'String');
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
     * Validates the JSON data with respect to <code>UniswapV2TokenDayDataDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UniswapV2TokenDayDataDTO</code>.
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
        if (data['daily_volume_token'] && !(typeof data['daily_volume_token'] === 'string' || data['daily_volume_token'] instanceof String)) {
            throw new Error("Expected the field `daily_volume_token` to be a primitive type in the JSON string but got " + data['daily_volume_token']);
        }
        // ensure the json data is a string
        if (data['daily_volume_eth'] && !(typeof data['daily_volume_eth'] === 'string' || data['daily_volume_eth'] instanceof String)) {
            throw new Error("Expected the field `daily_volume_eth` to be a primitive type in the JSON string but got " + data['daily_volume_eth']);
        }
        // ensure the json data is a string
        if (data['daily_volume_usd'] && !(typeof data['daily_volume_usd'] === 'string' || data['daily_volume_usd'] instanceof String)) {
            throw new Error("Expected the field `daily_volume_usd` to be a primitive type in the JSON string but got " + data['daily_volume_usd']);
        }
        // ensure the json data is a string
        if (data['daily_txns'] && !(typeof data['daily_txns'] === 'string' || data['daily_txns'] instanceof String)) {
            throw new Error("Expected the field `daily_txns` to be a primitive type in the JSON string but got " + data['daily_txns']);
        }
        // ensure the json data is a string
        if (data['total_liquidity_token'] && !(typeof data['total_liquidity_token'] === 'string' || data['total_liquidity_token'] instanceof String)) {
            throw new Error("Expected the field `total_liquidity_token` to be a primitive type in the JSON string but got " + data['total_liquidity_token']);
        }
        // ensure the json data is a string
        if (data['total_liquidity_eth'] && !(typeof data['total_liquidity_eth'] === 'string' || data['total_liquidity_eth'] instanceof String)) {
            throw new Error("Expected the field `total_liquidity_eth` to be a primitive type in the JSON string but got " + data['total_liquidity_eth']);
        }
        // ensure the json data is a string
        if (data['total_liquidity_usd'] && !(typeof data['total_liquidity_usd'] === 'string' || data['total_liquidity_usd'] instanceof String)) {
            throw new Error("Expected the field `total_liquidity_usd` to be a primitive type in the JSON string but got " + data['total_liquidity_usd']);
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
UniswapV2TokenDayDataDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
UniswapV2TokenDayDataDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
UniswapV2TokenDayDataDTO.prototype['block_number'] = undefined;

/**
 * Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
 * @member {String} id
 */
UniswapV2TokenDayDataDTO.prototype['id'] = undefined;

/**
 * Unix timestamp for start of day.
 * @member {Number} date
 */
UniswapV2TokenDayDataDTO.prototype['date'] = undefined;

/**
 * Reference to token entity.
 * @member {String} token
 */
UniswapV2TokenDayDataDTO.prototype['token'] = undefined;

/**
 * Amount of token swapped across all pairs throughout day.
 * @member {String} daily_volume_token
 */
UniswapV2TokenDayDataDTO.prototype['daily_volume_token'] = undefined;

/**
 * Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
 * @member {String} daily_volume_eth
 */
UniswapV2TokenDayDataDTO.prototype['daily_volume_eth'] = undefined;

/**
 * Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
 * @member {String} daily_volume_usd
 */
UniswapV2TokenDayDataDTO.prototype['daily_volume_usd'] = undefined;

/**
 * Amount of transactions with this token across all pairs.
 * @member {String} daily_txns
 */
UniswapV2TokenDayDataDTO.prototype['daily_txns'] = undefined;

/**
 * Token amount of token deposited across all pairs.
 * @member {String} total_liquidity_token
 */
UniswapV2TokenDayDataDTO.prototype['total_liquidity_token'] = undefined;

/**
 * Token amount of token deposited across all pairs stored as amount of ETH.
 * @member {String} total_liquidity_eth
 */
UniswapV2TokenDayDataDTO.prototype['total_liquidity_eth'] = undefined;

/**
 * Token amount of token deposited across all pairs stored as amount of USD.
 * @member {String} total_liquidity_usd
 */
UniswapV2TokenDayDataDTO.prototype['total_liquidity_usd'] = undefined;

/**
 * Price of token in derived USD.
 * @member {String} price_usd
 */
UniswapV2TokenDayDataDTO.prototype['price_usd'] = undefined;

/**
 * 
 * @member {Number} vid
 */
UniswapV2TokenDayDataDTO.prototype['vid'] = undefined;






export default UniswapV2TokenDayDataDTO;

