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
 * The SushiswapMintDTO model module.
 * @module model/SushiswapMintDTO
 * @version v1
 */
class SushiswapMintDTO {
    /**
     * Constructs a new <code>SushiswapMintDTO</code>.
     * Mint entities are created for every emitted Mint event on the Sushiswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, who received the liquidity, and more. This entity can be used to track liquidity provisions on pairs.
     * @alias module:model/SushiswapMintDTO
     */
    constructor() { 
        
        SushiswapMintDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SushiswapMintDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SushiswapMintDTO} obj Optional instance to populate.
     * @return {module:model/SushiswapMintDTO} The populated <code>SushiswapMintDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SushiswapMintDTO();

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
            if (data.hasOwnProperty('timestamp')) {
                obj['timestamp'] = ApiClient.convertToType(data['timestamp'], 'String');
            }
            if (data.hasOwnProperty('pair')) {
                obj['pair'] = ApiClient.convertToType(data['pair'], 'String');
            }
            if (data.hasOwnProperty('to')) {
                obj['to'] = ApiClient.convertToType(data['to'], 'String');
            }
            if (data.hasOwnProperty('liquidity')) {
                obj['liquidity'] = ApiClient.convertToType(data['liquidity'], 'String');
            }
            if (data.hasOwnProperty('sender')) {
                obj['sender'] = ApiClient.convertToType(data['sender'], 'String');
            }
            if (data.hasOwnProperty('amount_0')) {
                obj['amount_0'] = ApiClient.convertToType(data['amount_0'], 'String');
            }
            if (data.hasOwnProperty('amount_1')) {
                obj['amount_1'] = ApiClient.convertToType(data['amount_1'], 'String');
            }
            if (data.hasOwnProperty('log_index')) {
                obj['log_index'] = ApiClient.convertToType(data['log_index'], 'String');
            }
            if (data.hasOwnProperty('amount_usd')) {
                obj['amount_usd'] = ApiClient.convertToType(data['amount_usd'], 'String');
            }
            if (data.hasOwnProperty('fee_to')) {
                obj['fee_to'] = ApiClient.convertToType(data['fee_to'], 'String');
            }
            if (data.hasOwnProperty('fee_liquidity')) {
                obj['fee_liquidity'] = ApiClient.convertToType(data['fee_liquidity'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SushiswapMintDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SushiswapMintDTO</code>.
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
        if (data['timestamp'] && !(typeof data['timestamp'] === 'string' || data['timestamp'] instanceof String)) {
            throw new Error("Expected the field `timestamp` to be a primitive type in the JSON string but got " + data['timestamp']);
        }
        // ensure the json data is a string
        if (data['pair'] && !(typeof data['pair'] === 'string' || data['pair'] instanceof String)) {
            throw new Error("Expected the field `pair` to be a primitive type in the JSON string but got " + data['pair']);
        }
        // ensure the json data is a string
        if (data['to'] && !(typeof data['to'] === 'string' || data['to'] instanceof String)) {
            throw new Error("Expected the field `to` to be a primitive type in the JSON string but got " + data['to']);
        }
        // ensure the json data is a string
        if (data['liquidity'] && !(typeof data['liquidity'] === 'string' || data['liquidity'] instanceof String)) {
            throw new Error("Expected the field `liquidity` to be a primitive type in the JSON string but got " + data['liquidity']);
        }
        // ensure the json data is a string
        if (data['sender'] && !(typeof data['sender'] === 'string' || data['sender'] instanceof String)) {
            throw new Error("Expected the field `sender` to be a primitive type in the JSON string but got " + data['sender']);
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
        if (data['log_index'] && !(typeof data['log_index'] === 'string' || data['log_index'] instanceof String)) {
            throw new Error("Expected the field `log_index` to be a primitive type in the JSON string but got " + data['log_index']);
        }
        // ensure the json data is a string
        if (data['amount_usd'] && !(typeof data['amount_usd'] === 'string' || data['amount_usd'] instanceof String)) {
            throw new Error("Expected the field `amount_usd` to be a primitive type in the JSON string but got " + data['amount_usd']);
        }
        // ensure the json data is a string
        if (data['fee_to'] && !(typeof data['fee_to'] === 'string' || data['fee_to'] instanceof String)) {
            throw new Error("Expected the field `fee_to` to be a primitive type in the JSON string but got " + data['fee_to']);
        }
        // ensure the json data is a string
        if (data['fee_liquidity'] && !(typeof data['fee_liquidity'] === 'string' || data['fee_liquidity'] instanceof String)) {
            throw new Error("Expected the field `fee_liquidity` to be a primitive type in the JSON string but got " + data['fee_liquidity']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
SushiswapMintDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
SushiswapMintDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
SushiswapMintDTO.prototype['block_number'] = undefined;

/**
 * Identifier, format: (transaction hash)-(index in the transaction mint array).
 * @member {String} id
 */
SushiswapMintDTO.prototype['id'] = undefined;

/**
 * Reference to the transaction Mint was included in.
 * @member {String} transaction
 */
SushiswapMintDTO.prototype['transaction'] = undefined;

/**
 * Timestamp of Mint, used to sort recent liquidity provisions.
 * @member {String} timestamp
 */
SushiswapMintDTO.prototype['timestamp'] = undefined;

/**
 * Reference to pair.
 * @member {String} pair
 */
SushiswapMintDTO.prototype['pair'] = undefined;

/**
 * Recipient of liquidity tokens.
 * @member {String} to
 */
SushiswapMintDTO.prototype['to'] = undefined;

/**
 * Amount of liquidity tokens minted.
 * @member {String} liquidity
 */
SushiswapMintDTO.prototype['liquidity'] = undefined;

/**
 * Address that initiated the liquidity provision.
 * @member {String} sender
 */
SushiswapMintDTO.prototype['sender'] = undefined;

/**
 * Amount of token0 provided.
 * @member {String} amount_0
 */
SushiswapMintDTO.prototype['amount_0'] = undefined;

/**
 * Amount of token1 provided.
 * @member {String} amount_1
 */
SushiswapMintDTO.prototype['amount_1'] = undefined;

/**
 * Index in the transaction event was emitted.
 * @member {String} log_index
 */
SushiswapMintDTO.prototype['log_index'] = undefined;

/**
 * Derived USD value of token0 amount plus token1 amount.
 * @member {String} amount_usd
 */
SushiswapMintDTO.prototype['amount_usd'] = undefined;

/**
 * Address of fee recipient (if fee is on).
 * @member {String} fee_to
 */
SushiswapMintDTO.prototype['fee_to'] = undefined;

/**
 * Amount of liquidity sent to fee recipient (if fee is on).
 * @member {String} fee_liquidity
 */
SushiswapMintDTO.prototype['fee_liquidity'] = undefined;

/**
 * 
 * @member {Number} vid
 */
SushiswapMintDTO.prototype['vid'] = undefined;






export default SushiswapMintDTO;

