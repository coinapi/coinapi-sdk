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
 * The UniswapV3BurnV3DTO model module.
 * @module model/UniswapV3BurnV3DTO
 * @version v1
 */
class UniswapV3BurnV3DTO {
    /**
     * Constructs a new <code>UniswapV3BurnV3DTO</code>.
     * Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
     * @alias module:model/UniswapV3BurnV3DTO
     */
    constructor() { 
        
        UniswapV3BurnV3DTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniswapV3BurnV3DTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniswapV3BurnV3DTO} obj Optional instance to populate.
     * @return {module:model/UniswapV3BurnV3DTO} The populated <code>UniswapV3BurnV3DTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniswapV3BurnV3DTO();

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
            if (data.hasOwnProperty('transaction')) {
                obj['transaction'] = ApiClient.convertToType(data['transaction'], 'String');
            }
            if (data.hasOwnProperty('pool')) {
                obj['pool'] = ApiClient.convertToType(data['pool'], 'String');
            }
            if (data.hasOwnProperty('token_0')) {
                obj['token_0'] = ApiClient.convertToType(data['token_0'], 'String');
            }
            if (data.hasOwnProperty('token_1')) {
                obj['token_1'] = ApiClient.convertToType(data['token_1'], 'String');
            }
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'String');
            }
            if (data.hasOwnProperty('owner')) {
                obj['owner'] = ApiClient.convertToType(data['owner'], 'String');
            }
            if (data.hasOwnProperty('origin')) {
                obj['origin'] = ApiClient.convertToType(data['origin'], 'String');
            }
            if (data.hasOwnProperty('amount')) {
                obj['amount'] = ApiClient.convertToType(data['amount'], 'String');
            }
            if (data.hasOwnProperty('amount_0')) {
                obj['amount_0'] = ApiClient.convertToType(data['amount_0'], 'String');
            }
            if (data.hasOwnProperty('amount_1')) {
                obj['amount_1'] = ApiClient.convertToType(data['amount_1'], 'String');
            }
            if (data.hasOwnProperty('amount_usd')) {
                obj['amount_usd'] = ApiClient.convertToType(data['amount_usd'], 'String');
            }
            if (data.hasOwnProperty('tick_lower')) {
                obj['tick_lower'] = ApiClient.convertToType(data['tick_lower'], 'String');
            }
            if (data.hasOwnProperty('tick_upper')) {
                obj['tick_upper'] = ApiClient.convertToType(data['tick_upper'], 'String');
            }
            if (data.hasOwnProperty('log_index')) {
                obj['log_index'] = ApiClient.convertToType(data['log_index'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UniswapV3BurnV3DTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UniswapV3BurnV3DTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['transaction'] && !(typeof data['transaction'] === 'string' || data['transaction'] instanceof String)) {
            throw new Error("Expected the field `transaction` to be a primitive type in the JSON string but got " + data['transaction']);
        }
        // ensure the json data is a string
        if (data['pool'] && !(typeof data['pool'] === 'string' || data['pool'] instanceof String)) {
            throw new Error("Expected the field `pool` to be a primitive type in the JSON string but got " + data['pool']);
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
        if (data['timestamp'] && !(typeof data['timestamp'] === 'string' || data['timestamp'] instanceof String)) {
            throw new Error("Expected the field `timestamp` to be a primitive type in the JSON string but got " + data['timestamp']);
        }
        // ensure the json data is a string
        if (data['owner'] && !(typeof data['owner'] === 'string' || data['owner'] instanceof String)) {
            throw new Error("Expected the field `owner` to be a primitive type in the JSON string but got " + data['owner']);
        }
        // ensure the json data is a string
        if (data['origin'] && !(typeof data['origin'] === 'string' || data['origin'] instanceof String)) {
            throw new Error("Expected the field `origin` to be a primitive type in the JSON string but got " + data['origin']);
        }
        // ensure the json data is a string
        if (data['amount'] && !(typeof data['amount'] === 'string' || data['amount'] instanceof String)) {
            throw new Error("Expected the field `amount` to be a primitive type in the JSON string but got " + data['amount']);
        }
        // ensure the json data is a string
        if (data['amount_0'] && !(typeof data['amount_0'] === 'string' || data['amount_0'] instanceof String)) {
            throw new Error("Expected the field `amount_0` to be a primitive type in the JSON string but got " + data['amount_0']);
        }
        // ensure the json data is a string
        if (data['amount_1'] && !(typeof data['amount_1'] === 'string' || data['amount_1'] instanceof String)) {
            throw new Error("Expected the field `amount_1` to be a primitive type in the JSON string but got " + data['amount_1']);
        }
        // ensure the json data is a string
        if (data['amount_usd'] && !(typeof data['amount_usd'] === 'string' || data['amount_usd'] instanceof String)) {
            throw new Error("Expected the field `amount_usd` to be a primitive type in the JSON string but got " + data['amount_usd']);
        }
        // ensure the json data is a string
        if (data['tick_lower'] && !(typeof data['tick_lower'] === 'string' || data['tick_lower'] instanceof String)) {
            throw new Error("Expected the field `tick_lower` to be a primitive type in the JSON string but got " + data['tick_lower']);
        }
        // ensure the json data is a string
        if (data['tick_upper'] && !(typeof data['tick_upper'] === 'string' || data['tick_upper'] instanceof String)) {
            throw new Error("Expected the field `tick_upper` to be a primitive type in the JSON string but got " + data['tick_upper']);
        }
        // ensure the json data is a string
        if (data['log_index'] && !(typeof data['log_index'] === 'string' || data['log_index'] instanceof String)) {
            throw new Error("Expected the field `log_index` to be a primitive type in the JSON string but got " + data['log_index']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
UniswapV3BurnV3DTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
UniswapV3BurnV3DTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
UniswapV3BurnV3DTO.prototype['block_number'] = undefined;

/**
 * Transaction hash + '#' + index in mints Transaction array.
 * @member {String} id
 */
UniswapV3BurnV3DTO.prototype['id'] = undefined;

/**
 * Transaction burn was included in.
 * @member {String} transaction
 */
UniswapV3BurnV3DTO.prototype['transaction'] = undefined;

/**
 * Pool position is within.
 * @member {String} pool
 */
UniswapV3BurnV3DTO.prototype['pool'] = undefined;

/**
 * Reference to token0 as stored in pool contract.
 * @member {String} token_0
 */
UniswapV3BurnV3DTO.prototype['token_0'] = undefined;

/**
 * Reference to token1 as stored in pool contract.
 * @member {String} token_1
 */
UniswapV3BurnV3DTO.prototype['token_1'] = undefined;

/**
 * Timestamp.
 * @member {String} timestamp
 */
UniswapV3BurnV3DTO.prototype['timestamp'] = undefined;

/**
 * Owner of position where liquidity was burned.
 * @member {String} owner
 */
UniswapV3BurnV3DTO.prototype['owner'] = undefined;

/**
 * Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
 * @member {String} origin
 */
UniswapV3BurnV3DTO.prototype['origin'] = undefined;

/**
 * Amount of liquidity burned.
 * @member {String} amount
 */
UniswapV3BurnV3DTO.prototype['amount'] = undefined;

/**
 * Amount of token 0 burned.
 * @member {String} amount_0
 */
UniswapV3BurnV3DTO.prototype['amount_0'] = undefined;

/**
 * Amount of token 1 burned.
 * @member {String} amount_1
 */
UniswapV3BurnV3DTO.prototype['amount_1'] = undefined;

/**
 * Derived amount based on available prices of tokens.
 * @member {String} amount_usd
 */
UniswapV3BurnV3DTO.prototype['amount_usd'] = undefined;

/**
 * Lower tick of position.
 * @member {String} tick_lower
 */
UniswapV3BurnV3DTO.prototype['tick_lower'] = undefined;

/**
 * Upper tick of position.
 * @member {String} tick_upper
 */
UniswapV3BurnV3DTO.prototype['tick_upper'] = undefined;

/**
 * Position within the transactions.
 * @member {String} log_index
 */
UniswapV3BurnV3DTO.prototype['log_index'] = undefined;

/**
 * 
 * @member {Number} vid
 */
UniswapV3BurnV3DTO.prototype['vid'] = undefined;






export default UniswapV3BurnV3DTO;

