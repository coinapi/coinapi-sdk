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
import NumericsBigInteger from './NumericsBigInteger';

/**
 * The UniswapV2PairDTO model module.
 * @module model/UniswapV2PairDTO
 * @version v1
 */
class UniswapV2PairDTO {
    /**
     * Constructs a new <code>UniswapV2PairDTO</code>.
     * Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.
     * @alias module:model/UniswapV2PairDTO
     */
    constructor() { 
        
        UniswapV2PairDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniswapV2PairDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniswapV2PairDTO} obj Optional instance to populate.
     * @return {module:model/UniswapV2PairDTO} The populated <code>UniswapV2PairDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniswapV2PairDTO();

            if (data.hasOwnProperty('entry_time')) {
                obj['entry_time'] = ApiClient.convertToType(data['entry_time'], 'Date');
            }
            if (data.hasOwnProperty('recv_time')) {
                obj['recv_time'] = ApiClient.convertToType(data['recv_time'], 'Date');
            }
            if (data.hasOwnProperty('block_number')) {
                obj['block_number'] = ApiClient.convertToType(data['block_number'], 'Number');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('token_0')) {
                obj['token_0'] = ApiClient.convertToType(data['token_0'], 'String');
            }
            if (data.hasOwnProperty('token_1')) {
                obj['token_1'] = ApiClient.convertToType(data['token_1'], 'String');
            }
            if (data.hasOwnProperty('reserve_0')) {
                obj['reserve_0'] = ApiClient.convertToType(data['reserve_0'], 'String');
            }
            if (data.hasOwnProperty('reserve_1')) {
                obj['reserve_1'] = ApiClient.convertToType(data['reserve_1'], 'String');
            }
            if (data.hasOwnProperty('total_supply')) {
                obj['total_supply'] = ApiClient.convertToType(data['total_supply'], 'String');
            }
            if (data.hasOwnProperty('reserve_eth')) {
                obj['reserve_eth'] = ApiClient.convertToType(data['reserve_eth'], 'String');
            }
            if (data.hasOwnProperty('reserve_usd')) {
                obj['reserve_usd'] = ApiClient.convertToType(data['reserve_usd'], 'String');
            }
            if (data.hasOwnProperty('tracked_reserve_eth')) {
                obj['tracked_reserve_eth'] = ApiClient.convertToType(data['tracked_reserve_eth'], 'String');
            }
            if (data.hasOwnProperty('token_0_price')) {
                obj['token_0_price'] = ApiClient.convertToType(data['token_0_price'], 'String');
            }
            if (data.hasOwnProperty('token_1_price')) {
                obj['token_1_price'] = ApiClient.convertToType(data['token_1_price'], 'String');
            }
            if (data.hasOwnProperty('volume_token_0')) {
                obj['volume_token_0'] = ApiClient.convertToType(data['volume_token_0'], 'String');
            }
            if (data.hasOwnProperty('volume_token_1')) {
                obj['volume_token_1'] = ApiClient.convertToType(data['volume_token_1'], 'String');
            }
            if (data.hasOwnProperty('volume_usd')) {
                obj['volume_usd'] = ApiClient.convertToType(data['volume_usd'], 'String');
            }
            if (data.hasOwnProperty('untracked_volume_usd')) {
                obj['untracked_volume_usd'] = ApiClient.convertToType(data['untracked_volume_usd'], 'String');
            }
            if (data.hasOwnProperty('tx_count')) {
                obj['tx_count'] = NumericsBigInteger.constructFromObject(data['tx_count']);
            }
            if (data.hasOwnProperty('created_at_timestamp')) {
                obj['created_at_timestamp'] = ApiClient.convertToType(data['created_at_timestamp'], 'Date');
            }
            if (data.hasOwnProperty('liquidity_provider_count')) {
                obj['liquidity_provider_count'] = ApiClient.convertToType(data['liquidity_provider_count'], 'String');
            }
            if (data.hasOwnProperty('evaluated_ask')) {
                obj['evaluated_ask'] = ApiClient.convertToType(data['evaluated_ask'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UniswapV2PairDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UniswapV2PairDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['token_0'] && !(typeof data['token_0'] === 'string' || data['token_0'] instanceof String)) {
            throw new Error("Expected the field `token_0` to be a primitive type in the JSON string but got " + data['token_0']);
        }
        // ensure the json data is a string
        if (data['token_1'] && !(typeof data['token_1'] === 'string' || data['token_1'] instanceof String)) {
            throw new Error("Expected the field `token_1` to be a primitive type in the JSON string but got " + data['token_1']);
        }
        // ensure the json data is a string
        if (data['reserve_0'] && !(typeof data['reserve_0'] === 'string' || data['reserve_0'] instanceof String)) {
            throw new Error("Expected the field `reserve_0` to be a primitive type in the JSON string but got " + data['reserve_0']);
        }
        // ensure the json data is a string
        if (data['reserve_1'] && !(typeof data['reserve_1'] === 'string' || data['reserve_1'] instanceof String)) {
            throw new Error("Expected the field `reserve_1` to be a primitive type in the JSON string but got " + data['reserve_1']);
        }
        // ensure the json data is a string
        if (data['total_supply'] && !(typeof data['total_supply'] === 'string' || data['total_supply'] instanceof String)) {
            throw new Error("Expected the field `total_supply` to be a primitive type in the JSON string but got " + data['total_supply']);
        }
        // ensure the json data is a string
        if (data['reserve_eth'] && !(typeof data['reserve_eth'] === 'string' || data['reserve_eth'] instanceof String)) {
            throw new Error("Expected the field `reserve_eth` to be a primitive type in the JSON string but got " + data['reserve_eth']);
        }
        // ensure the json data is a string
        if (data['reserve_usd'] && !(typeof data['reserve_usd'] === 'string' || data['reserve_usd'] instanceof String)) {
            throw new Error("Expected the field `reserve_usd` to be a primitive type in the JSON string but got " + data['reserve_usd']);
        }
        // ensure the json data is a string
        if (data['tracked_reserve_eth'] && !(typeof data['tracked_reserve_eth'] === 'string' || data['tracked_reserve_eth'] instanceof String)) {
            throw new Error("Expected the field `tracked_reserve_eth` to be a primitive type in the JSON string but got " + data['tracked_reserve_eth']);
        }
        // ensure the json data is a string
        if (data['token_0_price'] && !(typeof data['token_0_price'] === 'string' || data['token_0_price'] instanceof String)) {
            throw new Error("Expected the field `token_0_price` to be a primitive type in the JSON string but got " + data['token_0_price']);
        }
        // ensure the json data is a string
        if (data['token_1_price'] && !(typeof data['token_1_price'] === 'string' || data['token_1_price'] instanceof String)) {
            throw new Error("Expected the field `token_1_price` to be a primitive type in the JSON string but got " + data['token_1_price']);
        }
        // ensure the json data is a string
        if (data['volume_token_0'] && !(typeof data['volume_token_0'] === 'string' || data['volume_token_0'] instanceof String)) {
            throw new Error("Expected the field `volume_token_0` to be a primitive type in the JSON string but got " + data['volume_token_0']);
        }
        // ensure the json data is a string
        if (data['volume_token_1'] && !(typeof data['volume_token_1'] === 'string' || data['volume_token_1'] instanceof String)) {
            throw new Error("Expected the field `volume_token_1` to be a primitive type in the JSON string but got " + data['volume_token_1']);
        }
        // ensure the json data is a string
        if (data['volume_usd'] && !(typeof data['volume_usd'] === 'string' || data['volume_usd'] instanceof String)) {
            throw new Error("Expected the field `volume_usd` to be a primitive type in the JSON string but got " + data['volume_usd']);
        }
        // ensure the json data is a string
        if (data['untracked_volume_usd'] && !(typeof data['untracked_volume_usd'] === 'string' || data['untracked_volume_usd'] instanceof String)) {
            throw new Error("Expected the field `untracked_volume_usd` to be a primitive type in the JSON string but got " + data['untracked_volume_usd']);
        }
        // validate the optional field `tx_count`
        if (data['tx_count']) { // data not null
          NumericsBigInteger.validateJSON(data['tx_count']);
        }
        // ensure the json data is a string
        if (data['liquidity_provider_count'] && !(typeof data['liquidity_provider_count'] === 'string' || data['liquidity_provider_count'] instanceof String)) {
            throw new Error("Expected the field `liquidity_provider_count` to be a primitive type in the JSON string but got " + data['liquidity_provider_count']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
UniswapV2PairDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
UniswapV2PairDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
UniswapV2PairDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {Number} vid
 */
UniswapV2PairDTO.prototype['vid'] = undefined;

/**
 * Pair contract address.
 * @member {String} id
 */
UniswapV2PairDTO.prototype['id'] = undefined;

/**
 * Reference to token0 as stored in pair contract.
 * @member {String} token_0
 */
UniswapV2PairDTO.prototype['token_0'] = undefined;

/**
 * Reference to token1 as stored in pair contract.
 * @member {String} token_1
 */
UniswapV2PairDTO.prototype['token_1'] = undefined;

/**
 * Reserve of token0.
 * @member {String} reserve_0
 */
UniswapV2PairDTO.prototype['reserve_0'] = undefined;

/**
 * Reserve of token1.
 * @member {String} reserve_1
 */
UniswapV2PairDTO.prototype['reserve_1'] = undefined;

/**
 * Total supply of liquidity token distributed to LPs.
 * @member {String} total_supply
 */
UniswapV2PairDTO.prototype['total_supply'] = undefined;

/**
 * Total liquidity in pair stored as an amount of ETH.
 * @member {String} reserve_eth
 */
UniswapV2PairDTO.prototype['reserve_eth'] = undefined;

/**
 * Total liquidity amount in pair stored as an amount of USD.
 * @member {String} reserve_usd
 */
UniswapV2PairDTO.prototype['reserve_usd'] = undefined;

/**
 * Total liquidity with only tracked amount.
 * @member {String} tracked_reserve_eth
 */
UniswapV2PairDTO.prototype['tracked_reserve_eth'] = undefined;

/**
 * Token0 per token1.
 * @member {String} token_0_price
 */
UniswapV2PairDTO.prototype['token_0_price'] = undefined;

/**
 * Token1 per token0.
 * @member {String} token_1_price
 */
UniswapV2PairDTO.prototype['token_1_price'] = undefined;

/**
 * Amount of token0 swapped on this pair.
 * @member {String} volume_token_0
 */
UniswapV2PairDTO.prototype['volume_token_0'] = undefined;

/**
 * Amount of token1 swapped on this pair.
 * @member {String} volume_token_1
 */
UniswapV2PairDTO.prototype['volume_token_1'] = undefined;

/**
 * Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold).
 * @member {String} volume_usd
 */
UniswapV2PairDTO.prototype['volume_usd'] = undefined;

/**
 * Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold.
 * @member {String} untracked_volume_usd
 */
UniswapV2PairDTO.prototype['untracked_volume_usd'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} tx_count
 */
UniswapV2PairDTO.prototype['tx_count'] = undefined;

/**
 * Timestamp contract was created.
 * @member {Date} created_at_timestamp
 */
UniswapV2PairDTO.prototype['created_at_timestamp'] = undefined;

/**
 * Total number of LPs.
 * @member {String} liquidity_provider_count
 */
UniswapV2PairDTO.prototype['liquidity_provider_count'] = undefined;

/**
 * @member {Number} evaluated_ask
 */
UniswapV2PairDTO.prototype['evaluated_ask'] = undefined;






export default UniswapV2PairDTO;
