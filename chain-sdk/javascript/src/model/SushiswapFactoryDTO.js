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
 * The SushiswapFactoryDTO model module.
 * @module model/SushiswapFactoryDTO
 * @version v1
 */
class SushiswapFactoryDTO {
    /**
     * Constructs a new <code>SushiswapFactoryDTO</code>.
     * The Sushiswap Factory entity is responsible for storing aggregate information across all Sushiswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
     * @alias module:model/SushiswapFactoryDTO
     */
    constructor() { 
        
        SushiswapFactoryDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SushiswapFactoryDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SushiswapFactoryDTO} obj Optional instance to populate.
     * @return {module:model/SushiswapFactoryDTO} The populated <code>SushiswapFactoryDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SushiswapFactoryDTO();

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
            if (data.hasOwnProperty('pair_count')) {
                obj['pair_count'] = ApiClient.convertToType(data['pair_count'], 'String');
            }
            if (data.hasOwnProperty('volume_usd')) {
                obj['volume_usd'] = ApiClient.convertToType(data['volume_usd'], 'String');
            }
            if (data.hasOwnProperty('volume_eth')) {
                obj['volume_eth'] = ApiClient.convertToType(data['volume_eth'], 'String');
            }
            if (data.hasOwnProperty('untracked_volume_usd')) {
                obj['untracked_volume_usd'] = ApiClient.convertToType(data['untracked_volume_usd'], 'String');
            }
            if (data.hasOwnProperty('liquidity_usd')) {
                obj['liquidity_usd'] = ApiClient.convertToType(data['liquidity_usd'], 'String');
            }
            if (data.hasOwnProperty('liquidity_eth')) {
                obj['liquidity_eth'] = ApiClient.convertToType(data['liquidity_eth'], 'String');
            }
            if (data.hasOwnProperty('tx_count')) {
                obj['tx_count'] = ApiClient.convertToType(data['tx_count'], 'String');
            }
            if (data.hasOwnProperty('token_count')) {
                obj['token_count'] = ApiClient.convertToType(data['token_count'], 'String');
            }
            if (data.hasOwnProperty('user_count')) {
                obj['user_count'] = ApiClient.convertToType(data['user_count'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SushiswapFactoryDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SushiswapFactoryDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['pair_count'] && !(typeof data['pair_count'] === 'string' || data['pair_count'] instanceof String)) {
            throw new Error("Expected the field `pair_count` to be a primitive type in the JSON string but got " + data['pair_count']);
        }
        // ensure the json data is a string
        if (data['volume_usd'] && !(typeof data['volume_usd'] === 'string' || data['volume_usd'] instanceof String)) {
            throw new Error("Expected the field `volume_usd` to be a primitive type in the JSON string but got " + data['volume_usd']);
        }
        // ensure the json data is a string
        if (data['volume_eth'] && !(typeof data['volume_eth'] === 'string' || data['volume_eth'] instanceof String)) {
            throw new Error("Expected the field `volume_eth` to be a primitive type in the JSON string but got " + data['volume_eth']);
        }
        // ensure the json data is a string
        if (data['untracked_volume_usd'] && !(typeof data['untracked_volume_usd'] === 'string' || data['untracked_volume_usd'] instanceof String)) {
            throw new Error("Expected the field `untracked_volume_usd` to be a primitive type in the JSON string but got " + data['untracked_volume_usd']);
        }
        // ensure the json data is a string
        if (data['liquidity_usd'] && !(typeof data['liquidity_usd'] === 'string' || data['liquidity_usd'] instanceof String)) {
            throw new Error("Expected the field `liquidity_usd` to be a primitive type in the JSON string but got " + data['liquidity_usd']);
        }
        // ensure the json data is a string
        if (data['liquidity_eth'] && !(typeof data['liquidity_eth'] === 'string' || data['liquidity_eth'] instanceof String)) {
            throw new Error("Expected the field `liquidity_eth` to be a primitive type in the JSON string but got " + data['liquidity_eth']);
        }
        // ensure the json data is a string
        if (data['tx_count'] && !(typeof data['tx_count'] === 'string' || data['tx_count'] instanceof String)) {
            throw new Error("Expected the field `tx_count` to be a primitive type in the JSON string but got " + data['tx_count']);
        }
        // ensure the json data is a string
        if (data['token_count'] && !(typeof data['token_count'] === 'string' || data['token_count'] instanceof String)) {
            throw new Error("Expected the field `token_count` to be a primitive type in the JSON string but got " + data['token_count']);
        }
        // ensure the json data is a string
        if (data['user_count'] && !(typeof data['user_count'] === 'string' || data['user_count'] instanceof String)) {
            throw new Error("Expected the field `user_count` to be a primitive type in the JSON string but got " + data['user_count']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
SushiswapFactoryDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
SushiswapFactoryDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
SushiswapFactoryDTO.prototype['block_number'] = undefined;

/**
 * Factory address.
 * @member {String} id
 */
SushiswapFactoryDTO.prototype['id'] = undefined;

/**
 * Amount of pairs created by the Sushiswap factory.
 * @member {String} pair_count
 */
SushiswapFactoryDTO.prototype['pair_count'] = undefined;

/**
 * All time USD volume across all pairs (USD is derived).
 * @member {String} volume_usd
 */
SushiswapFactoryDTO.prototype['volume_usd'] = undefined;

/**
 * All time volume in ETH across all pairs (ETH is derived).
 * @member {String} volume_eth
 */
SushiswapFactoryDTO.prototype['volume_eth'] = undefined;

/**
 * Untracked volume USD.
 * @member {String} untracked_volume_usd
 */
SushiswapFactoryDTO.prototype['untracked_volume_usd'] = undefined;

/**
 * Total liquidity across all pairs stored as a derived USD amount.
 * @member {String} liquidity_usd
 */
SushiswapFactoryDTO.prototype['liquidity_usd'] = undefined;

/**
 * Total liquidity across all pairs stored as a derived ETH amount.
 * @member {String} liquidity_eth
 */
SushiswapFactoryDTO.prototype['liquidity_eth'] = undefined;

/**
 * All time amount of transactions across all pairs.
 * @member {String} tx_count
 */
SushiswapFactoryDTO.prototype['tx_count'] = undefined;

/**
 * Total count of tokens.
 * @member {String} token_count
 */
SushiswapFactoryDTO.prototype['token_count'] = undefined;

/**
 * Users count.
 * @member {String} user_count
 */
SushiswapFactoryDTO.prototype['user_count'] = undefined;

/**
 * 
 * @member {Number} vid
 */
SushiswapFactoryDTO.prototype['vid'] = undefined;






export default SushiswapFactoryDTO;

