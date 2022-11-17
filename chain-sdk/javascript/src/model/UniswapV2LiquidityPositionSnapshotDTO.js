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
 * The UniswapV2LiquidityPositionSnapshotDTO model module.
 * @module model/UniswapV2LiquidityPositionSnapshotDTO
 * @version v1
 */
class UniswapV2LiquidityPositionSnapshotDTO {
    /**
     * Constructs a new <code>UniswapV2LiquidityPositionSnapshotDTO</code>.
     * This entity is used to store data about a user&#39;s liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
     * @alias module:model/UniswapV2LiquidityPositionSnapshotDTO
     */
    constructor() { 
        
        UniswapV2LiquidityPositionSnapshotDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniswapV2LiquidityPositionSnapshotDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniswapV2LiquidityPositionSnapshotDTO} obj Optional instance to populate.
     * @return {module:model/UniswapV2LiquidityPositionSnapshotDTO} The populated <code>UniswapV2LiquidityPositionSnapshotDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniswapV2LiquidityPositionSnapshotDTO();

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
            if (data.hasOwnProperty('liquidity_position')) {
                obj['liquidity_position'] = ApiClient.convertToType(data['liquidity_position'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'Number');
            }
            if (data.hasOwnProperty('block')) {
                obj['block'] = ApiClient.convertToType(data['block'], 'Number');
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = ApiClient.convertToType(data['user'], 'String');
            }
            if (data.hasOwnProperty('pair')) {
                obj['pair'] = ApiClient.convertToType(data['pair'], 'String');
            }
            if (data.hasOwnProperty('token_0_price_usd')) {
                obj['token_0_price_usd'] = ApiClient.convertToType(data['token_0_price_usd'], 'String');
            }
            if (data.hasOwnProperty('token_1_price_usd')) {
                obj['token_1_price_usd'] = ApiClient.convertToType(data['token_1_price_usd'], 'String');
            }
            if (data.hasOwnProperty('reserve_0')) {
                obj['reserve_0'] = ApiClient.convertToType(data['reserve_0'], 'String');
            }
            if (data.hasOwnProperty('reserve_1')) {
                obj['reserve_1'] = ApiClient.convertToType(data['reserve_1'], 'String');
            }
            if (data.hasOwnProperty('reserve_usd')) {
                obj['reserve_usd'] = ApiClient.convertToType(data['reserve_usd'], 'String');
            }
            if (data.hasOwnProperty('liquidity_token_total_supply')) {
                obj['liquidity_token_total_supply'] = ApiClient.convertToType(data['liquidity_token_total_supply'], 'String');
            }
            if (data.hasOwnProperty('liquidity_token_balance')) {
                obj['liquidity_token_balance'] = ApiClient.convertToType(data['liquidity_token_balance'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
            if (data.hasOwnProperty('block_range')) {
                obj['block_range'] = ApiClient.convertToType(data['block_range'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UniswapV2LiquidityPositionSnapshotDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UniswapV2LiquidityPositionSnapshotDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['liquidity_position'] && !(typeof data['liquidity_position'] === 'string' || data['liquidity_position'] instanceof String)) {
            throw new Error("Expected the field `liquidity_position` to be a primitive type in the JSON string but got " + data['liquidity_position']);
        }
        // ensure the json data is a string
        if (data['user'] && !(typeof data['user'] === 'string' || data['user'] instanceof String)) {
            throw new Error("Expected the field `user` to be a primitive type in the JSON string but got " + data['user']);
        }
        // ensure the json data is a string
        if (data['pair'] && !(typeof data['pair'] === 'string' || data['pair'] instanceof String)) {
            throw new Error("Expected the field `pair` to be a primitive type in the JSON string but got " + data['pair']);
        }
        // ensure the json data is a string
        if (data['token_0_price_usd'] && !(typeof data['token_0_price_usd'] === 'string' || data['token_0_price_usd'] instanceof String)) {
            throw new Error("Expected the field `token_0_price_usd` to be a primitive type in the JSON string but got " + data['token_0_price_usd']);
        }
        // ensure the json data is a string
        if (data['token_1_price_usd'] && !(typeof data['token_1_price_usd'] === 'string' || data['token_1_price_usd'] instanceof String)) {
            throw new Error("Expected the field `token_1_price_usd` to be a primitive type in the JSON string but got " + data['token_1_price_usd']);
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
        if (data['reserve_usd'] && !(typeof data['reserve_usd'] === 'string' || data['reserve_usd'] instanceof String)) {
            throw new Error("Expected the field `reserve_usd` to be a primitive type in the JSON string but got " + data['reserve_usd']);
        }
        // ensure the json data is a string
        if (data['liquidity_token_total_supply'] && !(typeof data['liquidity_token_total_supply'] === 'string' || data['liquidity_token_total_supply'] instanceof String)) {
            throw new Error("Expected the field `liquidity_token_total_supply` to be a primitive type in the JSON string but got " + data['liquidity_token_total_supply']);
        }
        // ensure the json data is a string
        if (data['liquidity_token_balance'] && !(typeof data['liquidity_token_balance'] === 'string' || data['liquidity_token_balance'] instanceof String)) {
            throw new Error("Expected the field `liquidity_token_balance` to be a primitive type in the JSON string but got " + data['liquidity_token_balance']);
        }
        // ensure the json data is a string
        if (data['block_range'] && !(typeof data['block_range'] === 'string' || data['block_range'] instanceof String)) {
            throw new Error("Expected the field `block_range` to be a primitive type in the JSON string but got " + data['block_range']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['block_number'] = undefined;

/**
 * Identifier, format: <pair address>-<user address>
 * @member {String} id
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['id'] = undefined;

/**
 * Reference to LP identifier.
 * @member {String} liquidity_position
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['liquidity_position'] = undefined;

/**
 * Creation time.
 * @member {Number} timestamp
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['timestamp'] = undefined;

/**
 * Number of block in which LP snapshot was recorded.
 * @member {Number} block
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['block'] = undefined;

/**
 * Reference to user.
 * @member {String} user
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['user'] = undefined;

/**
 * Reference to the pair liquidity is being provided on.
 * @member {String} pair
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['pair'] = undefined;

/**
 * Snapshot of token0 price.
 * @member {String} token_0_price_usd
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['token_0_price_usd'] = undefined;

/**
 * Snapshot of token0 price.
 * @member {String} token_1_price_usd
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['token_1_price_usd'] = undefined;

/**
 * Snapshot of pair token0 reserves.
 * @member {String} reserve_0
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['reserve_0'] = undefined;

/**
 * Snapshot of pair token1 reserves.
 * @member {String} reserve_1
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['reserve_1'] = undefined;

/**
 * Snapshot of pair reserves in USD.
 * @member {String} reserve_usd
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['reserve_usd'] = undefined;

/**
 * Snapshot of pool token supply.
 * @member {String} liquidity_token_total_supply
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['liquidity_token_total_supply'] = undefined;

/**
 * Snapshot of users pool token balance.
 * @member {String} liquidity_token_balance
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['liquidity_token_balance'] = undefined;

/**
 * 
 * @member {Number} vid
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['vid'] = undefined;

/**
 * 
 * @member {String} block_range
 */
UniswapV2LiquidityPositionSnapshotDTO.prototype['block_range'] = undefined;






export default UniswapV2LiquidityPositionSnapshotDTO;

