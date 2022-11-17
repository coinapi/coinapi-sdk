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
 * The UniswapV3PoolHourDataDTO model module.
 * @module model/UniswapV3PoolHourDataDTO
 * @version v1
 */
class UniswapV3PoolHourDataDTO {
    /**
     * Constructs a new <code>UniswapV3PoolHourDataDTO</code>.
     * Hourly stats tracker for pool.
     * @alias module:model/UniswapV3PoolHourDataDTO
     */
    constructor() { 
        
        UniswapV3PoolHourDataDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniswapV3PoolHourDataDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniswapV3PoolHourDataDTO} obj Optional instance to populate.
     * @return {module:model/UniswapV3PoolHourDataDTO} The populated <code>UniswapV3PoolHourDataDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniswapV3PoolHourDataDTO();

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
            if (data.hasOwnProperty('period_start_unix')) {
                obj['period_start_unix'] = ApiClient.convertToType(data['period_start_unix'], 'Number');
            }
            if (data.hasOwnProperty('pool')) {
                obj['pool'] = ApiClient.convertToType(data['pool'], 'String');
            }
            if (data.hasOwnProperty('liquidity')) {
                obj['liquidity'] = ApiClient.convertToType(data['liquidity'], 'String');
            }
            if (data.hasOwnProperty('sqrt_price')) {
                obj['sqrt_price'] = ApiClient.convertToType(data['sqrt_price'], 'String');
            }
            if (data.hasOwnProperty('token_0_price')) {
                obj['token_0_price'] = ApiClient.convertToType(data['token_0_price'], 'String');
            }
            if (data.hasOwnProperty('token_1_price')) {
                obj['token_1_price'] = ApiClient.convertToType(data['token_1_price'], 'String');
            }
            if (data.hasOwnProperty('tick')) {
                obj['tick'] = ApiClient.convertToType(data['tick'], 'String');
            }
            if (data.hasOwnProperty('fee_growth_global_0x128')) {
                obj['fee_growth_global_0x128'] = ApiClient.convertToType(data['fee_growth_global_0x128'], 'String');
            }
            if (data.hasOwnProperty('fee_growth_global_1x128')) {
                obj['fee_growth_global_1x128'] = ApiClient.convertToType(data['fee_growth_global_1x128'], 'String');
            }
            if (data.hasOwnProperty('tvl_usd')) {
                obj['tvl_usd'] = ApiClient.convertToType(data['tvl_usd'], 'String');
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
            if (data.hasOwnProperty('fees_usd')) {
                obj['fees_usd'] = ApiClient.convertToType(data['fees_usd'], 'String');
            }
            if (data.hasOwnProperty('tx_count')) {
                obj['tx_count'] = ApiClient.convertToType(data['tx_count'], 'String');
            }
            if (data.hasOwnProperty('open')) {
                obj['open'] = ApiClient.convertToType(data['open'], 'String');
            }
            if (data.hasOwnProperty('high')) {
                obj['high'] = ApiClient.convertToType(data['high'], 'String');
            }
            if (data.hasOwnProperty('low')) {
                obj['low'] = ApiClient.convertToType(data['low'], 'String');
            }
            if (data.hasOwnProperty('close')) {
                obj['close'] = ApiClient.convertToType(data['close'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UniswapV3PoolHourDataDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UniswapV3PoolHourDataDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['pool'] && !(typeof data['pool'] === 'string' || data['pool'] instanceof String)) {
            throw new Error("Expected the field `pool` to be a primitive type in the JSON string but got " + data['pool']);
        }
        // ensure the json data is a string
        if (data['liquidity'] && !(typeof data['liquidity'] === 'string' || data['liquidity'] instanceof String)) {
            throw new Error("Expected the field `liquidity` to be a primitive type in the JSON string but got " + data['liquidity']);
        }
        // ensure the json data is a string
        if (data['sqrt_price'] && !(typeof data['sqrt_price'] === 'string' || data['sqrt_price'] instanceof String)) {
            throw new Error("Expected the field `sqrt_price` to be a primitive type in the JSON string but got " + data['sqrt_price']);
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
        if (data['tick'] && !(typeof data['tick'] === 'string' || data['tick'] instanceof String)) {
            throw new Error("Expected the field `tick` to be a primitive type in the JSON string but got " + data['tick']);
        }
        // ensure the json data is a string
        if (data['fee_growth_global_0x128'] && !(typeof data['fee_growth_global_0x128'] === 'string' || data['fee_growth_global_0x128'] instanceof String)) {
            throw new Error("Expected the field `fee_growth_global_0x128` to be a primitive type in the JSON string but got " + data['fee_growth_global_0x128']);
        }
        // ensure the json data is a string
        if (data['fee_growth_global_1x128'] && !(typeof data['fee_growth_global_1x128'] === 'string' || data['fee_growth_global_1x128'] instanceof String)) {
            throw new Error("Expected the field `fee_growth_global_1x128` to be a primitive type in the JSON string but got " + data['fee_growth_global_1x128']);
        }
        // ensure the json data is a string
        if (data['tvl_usd'] && !(typeof data['tvl_usd'] === 'string' || data['tvl_usd'] instanceof String)) {
            throw new Error("Expected the field `tvl_usd` to be a primitive type in the JSON string but got " + data['tvl_usd']);
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
        if (data['fees_usd'] && !(typeof data['fees_usd'] === 'string' || data['fees_usd'] instanceof String)) {
            throw new Error("Expected the field `fees_usd` to be a primitive type in the JSON string but got " + data['fees_usd']);
        }
        // ensure the json data is a string
        if (data['tx_count'] && !(typeof data['tx_count'] === 'string' || data['tx_count'] instanceof String)) {
            throw new Error("Expected the field `tx_count` to be a primitive type in the JSON string but got " + data['tx_count']);
        }
        // ensure the json data is a string
        if (data['open'] && !(typeof data['open'] === 'string' || data['open'] instanceof String)) {
            throw new Error("Expected the field `open` to be a primitive type in the JSON string but got " + data['open']);
        }
        // ensure the json data is a string
        if (data['high'] && !(typeof data['high'] === 'string' || data['high'] instanceof String)) {
            throw new Error("Expected the field `high` to be a primitive type in the JSON string but got " + data['high']);
        }
        // ensure the json data is a string
        if (data['low'] && !(typeof data['low'] === 'string' || data['low'] instanceof String)) {
            throw new Error("Expected the field `low` to be a primitive type in the JSON string but got " + data['low']);
        }
        // ensure the json data is a string
        if (data['close'] && !(typeof data['close'] === 'string' || data['close'] instanceof String)) {
            throw new Error("Expected the field `close` to be a primitive type in the JSON string but got " + data['close']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
UniswapV3PoolHourDataDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
UniswapV3PoolHourDataDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
UniswapV3PoolHourDataDTO.prototype['block_number'] = undefined;

/**
 * Identifier, format: <pool address>-<day id>
 * @member {String} id
 */
UniswapV3PoolHourDataDTO.prototype['id'] = undefined;

/**
 * Unix timestamp for start of hour.
 * @member {Number} period_start_unix
 */
UniswapV3PoolHourDataDTO.prototype['period_start_unix'] = undefined;

/**
 * Pointer to pool.
 * @member {String} pool
 */
UniswapV3PoolHourDataDTO.prototype['pool'] = undefined;

/**
 * In range liquidity at end of period.
 * @member {String} liquidity
 */
UniswapV3PoolHourDataDTO.prototype['liquidity'] = undefined;

/**
 * Current price tracker at end of period.
 * @member {String} sqrt_price
 */
UniswapV3PoolHourDataDTO.prototype['sqrt_price'] = undefined;

/**
 * Price of token0 - derived from sqrtPrice.
 * @member {String} token_0_price
 */
UniswapV3PoolHourDataDTO.prototype['token_0_price'] = undefined;

/**
 * Price of token1 - derived from sqrtPrice.
 * @member {String} token_1_price
 */
UniswapV3PoolHourDataDTO.prototype['token_1_price'] = undefined;

/**
 * Current tick at end of period.
 * @member {String} tick
 */
UniswapV3PoolHourDataDTO.prototype['tick'] = undefined;

/**
 * Tracker for global fee growth.
 * @member {String} fee_growth_global_0x128
 */
UniswapV3PoolHourDataDTO.prototype['fee_growth_global_0x128'] = undefined;

/**
 * Tracker for global fee growth.
 * @member {String} fee_growth_global_1x128
 */
UniswapV3PoolHourDataDTO.prototype['fee_growth_global_1x128'] = undefined;

/**
 * Total value locked derived in USD at end of period.
 * @member {String} tvl_usd
 */
UniswapV3PoolHourDataDTO.prototype['tvl_usd'] = undefined;

/**
 * Volume in token0.
 * @member {String} volume_token_0
 */
UniswapV3PoolHourDataDTO.prototype['volume_token_0'] = undefined;

/**
 * Volume in token1.
 * @member {String} volume_token_1
 */
UniswapV3PoolHourDataDTO.prototype['volume_token_1'] = undefined;

/**
 * Volume in USD.
 * @member {String} volume_usd
 */
UniswapV3PoolHourDataDTO.prototype['volume_usd'] = undefined;

/**
 * Fees in USD.
 * @member {String} fees_usd
 */
UniswapV3PoolHourDataDTO.prototype['fees_usd'] = undefined;

/**
 * Number of transactions during period.
 * @member {String} tx_count
 */
UniswapV3PoolHourDataDTO.prototype['tx_count'] = undefined;

/**
 * Opening price of token0.
 * @member {String} open
 */
UniswapV3PoolHourDataDTO.prototype['open'] = undefined;

/**
 * High price of token0.
 * @member {String} high
 */
UniswapV3PoolHourDataDTO.prototype['high'] = undefined;

/**
 * Low price of token0.
 * @member {String} low
 */
UniswapV3PoolHourDataDTO.prototype['low'] = undefined;

/**
 * Close price of token0.
 * @member {String} close
 */
UniswapV3PoolHourDataDTO.prototype['close'] = undefined;

/**
 * 
 * @member {Number} vid
 */
UniswapV3PoolHourDataDTO.prototype['vid'] = undefined;






export default UniswapV3PoolHourDataDTO;

