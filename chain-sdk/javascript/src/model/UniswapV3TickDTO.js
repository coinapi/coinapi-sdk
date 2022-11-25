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
import NumericsBigInteger from './NumericsBigInteger';

/**
 * The UniswapV3TickDTO model module.
 * @module model/UniswapV3TickDTO
 * @version v1
 */
class UniswapV3TickDTO {
    /**
     * Constructs a new <code>UniswapV3TickDTO</code>.
     * Ticks are the boundaries between discrete areas in price space.
     * @alias module:model/UniswapV3TickDTO
     */
    constructor() { 
        
        UniswapV3TickDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniswapV3TickDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniswapV3TickDTO} obj Optional instance to populate.
     * @return {module:model/UniswapV3TickDTO} The populated <code>UniswapV3TickDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniswapV3TickDTO();

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
            if (data.hasOwnProperty('pool_address')) {
                obj['pool_address'] = ApiClient.convertToType(data['pool_address'], 'String');
            }
            if (data.hasOwnProperty('tick_idx')) {
                obj['tick_idx'] = NumericsBigInteger.constructFromObject(data['tick_idx']);
            }
            if (data.hasOwnProperty('pool')) {
                obj['pool'] = ApiClient.convertToType(data['pool'], 'String');
            }
            if (data.hasOwnProperty('liquidity_gross')) {
                obj['liquidity_gross'] = NumericsBigInteger.constructFromObject(data['liquidity_gross']);
            }
            if (data.hasOwnProperty('liquidity_net')) {
                obj['liquidity_net'] = NumericsBigInteger.constructFromObject(data['liquidity_net']);
            }
            if (data.hasOwnProperty('price_0')) {
                obj['price_0'] = ApiClient.convertToType(data['price_0'], 'String');
            }
            if (data.hasOwnProperty('price_1')) {
                obj['price_1'] = ApiClient.convertToType(data['price_1'], 'String');
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
            if (data.hasOwnProperty('fees_usd')) {
                obj['fees_usd'] = ApiClient.convertToType(data['fees_usd'], 'String');
            }
            if (data.hasOwnProperty('collected_fees_token_0')) {
                obj['collected_fees_token_0'] = ApiClient.convertToType(data['collected_fees_token_0'], 'String');
            }
            if (data.hasOwnProperty('collected_fees_token_1')) {
                obj['collected_fees_token_1'] = ApiClient.convertToType(data['collected_fees_token_1'], 'String');
            }
            if (data.hasOwnProperty('collected_fees_usd')) {
                obj['collected_fees_usd'] = ApiClient.convertToType(data['collected_fees_usd'], 'String');
            }
            if (data.hasOwnProperty('created_at_timestamp')) {
                obj['created_at_timestamp'] = ApiClient.convertToType(data['created_at_timestamp'], 'Date');
            }
            if (data.hasOwnProperty('liquidity_provider_count')) {
                obj['liquidity_provider_count'] = NumericsBigInteger.constructFromObject(data['liquidity_provider_count']);
            }
            if (data.hasOwnProperty('fee_growth_outside_0x128')) {
                obj['fee_growth_outside_0x128'] = NumericsBigInteger.constructFromObject(data['fee_growth_outside_0x128']);
            }
            if (data.hasOwnProperty('fee_growth_outside_1x128')) {
                obj['fee_growth_outside_1x128'] = NumericsBigInteger.constructFromObject(data['fee_growth_outside_1x128']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UniswapV3TickDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UniswapV3TickDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['pool_address'] && !(typeof data['pool_address'] === 'string' || data['pool_address'] instanceof String)) {
            throw new Error("Expected the field `pool_address` to be a primitive type in the JSON string but got " + data['pool_address']);
        }
        // validate the optional field `tick_idx`
        if (data['tick_idx']) { // data not null
          NumericsBigInteger.validateJSON(data['tick_idx']);
        }
        // ensure the json data is a string
        if (data['pool'] && !(typeof data['pool'] === 'string' || data['pool'] instanceof String)) {
            throw new Error("Expected the field `pool` to be a primitive type in the JSON string but got " + data['pool']);
        }
        // validate the optional field `liquidity_gross`
        if (data['liquidity_gross']) { // data not null
          NumericsBigInteger.validateJSON(data['liquidity_gross']);
        }
        // validate the optional field `liquidity_net`
        if (data['liquidity_net']) { // data not null
          NumericsBigInteger.validateJSON(data['liquidity_net']);
        }
        // ensure the json data is a string
        if (data['price_0'] && !(typeof data['price_0'] === 'string' || data['price_0'] instanceof String)) {
            throw new Error("Expected the field `price_0` to be a primitive type in the JSON string but got " + data['price_0']);
        }
        // ensure the json data is a string
        if (data['price_1'] && !(typeof data['price_1'] === 'string' || data['price_1'] instanceof String)) {
            throw new Error("Expected the field `price_1` to be a primitive type in the JSON string but got " + data['price_1']);
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
        // ensure the json data is a string
        if (data['fees_usd'] && !(typeof data['fees_usd'] === 'string' || data['fees_usd'] instanceof String)) {
            throw new Error("Expected the field `fees_usd` to be a primitive type in the JSON string but got " + data['fees_usd']);
        }
        // ensure the json data is a string
        if (data['collected_fees_token_0'] && !(typeof data['collected_fees_token_0'] === 'string' || data['collected_fees_token_0'] instanceof String)) {
            throw new Error("Expected the field `collected_fees_token_0` to be a primitive type in the JSON string but got " + data['collected_fees_token_0']);
        }
        // ensure the json data is a string
        if (data['collected_fees_token_1'] && !(typeof data['collected_fees_token_1'] === 'string' || data['collected_fees_token_1'] instanceof String)) {
            throw new Error("Expected the field `collected_fees_token_1` to be a primitive type in the JSON string but got " + data['collected_fees_token_1']);
        }
        // ensure the json data is a string
        if (data['collected_fees_usd'] && !(typeof data['collected_fees_usd'] === 'string' || data['collected_fees_usd'] instanceof String)) {
            throw new Error("Expected the field `collected_fees_usd` to be a primitive type in the JSON string but got " + data['collected_fees_usd']);
        }
        // validate the optional field `liquidity_provider_count`
        if (data['liquidity_provider_count']) { // data not null
          NumericsBigInteger.validateJSON(data['liquidity_provider_count']);
        }
        // validate the optional field `fee_growth_outside_0x128`
        if (data['fee_growth_outside_0x128']) { // data not null
          NumericsBigInteger.validateJSON(data['fee_growth_outside_0x128']);
        }
        // validate the optional field `fee_growth_outside_1x128`
        if (data['fee_growth_outside_1x128']) { // data not null
          NumericsBigInteger.validateJSON(data['fee_growth_outside_1x128']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
UniswapV3TickDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
UniswapV3TickDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
UniswapV3TickDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {Number} vid
 */
UniswapV3TickDTO.prototype['vid'] = undefined;

/**
 * Identifier, format: <pool address>#<tick index>
 * @member {String} id
 */
UniswapV3TickDTO.prototype['id'] = undefined;

/**
 * Pool address.
 * @member {String} pool_address
 */
UniswapV3TickDTO.prototype['pool_address'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} tick_idx
 */
UniswapV3TickDTO.prototype['tick_idx'] = undefined;

/**
 * Pool address.
 * @member {String} pool
 */
UniswapV3TickDTO.prototype['pool'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} liquidity_gross
 */
UniswapV3TickDTO.prototype['liquidity_gross'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} liquidity_net
 */
UniswapV3TickDTO.prototype['liquidity_net'] = undefined;

/**
 * Calculated price of token0 of tick within this pool - constant.
 * @member {String} price_0
 */
UniswapV3TickDTO.prototype['price_0'] = undefined;

/**
 * Calculated price of token1 of tick within this pool - constant.
 * @member {String} price_1
 */
UniswapV3TickDTO.prototype['price_1'] = undefined;

/**
 * Lifetime volume of token0 with this tick in range.
 * @member {String} volume_token_0
 */
UniswapV3TickDTO.prototype['volume_token_0'] = undefined;

/**
 * Lifetime volume of token1 with this tick in range.
 * @member {String} volume_token_1
 */
UniswapV3TickDTO.prototype['volume_token_1'] = undefined;

/**
 * Lifetime volume in derived USD with this tick in range.
 * @member {String} volume_usd
 */
UniswapV3TickDTO.prototype['volume_usd'] = undefined;

/**
 * Lifetime volume in untracked USD with this tick in range.
 * @member {String} untracked_volume_usd
 */
UniswapV3TickDTO.prototype['untracked_volume_usd'] = undefined;

/**
 * Fees in USD.
 * @member {String} fees_usd
 */
UniswapV3TickDTO.prototype['fees_usd'] = undefined;

/**
 * All time collected fees in token0.
 * @member {String} collected_fees_token_0
 */
UniswapV3TickDTO.prototype['collected_fees_token_0'] = undefined;

/**
 * All time collected fees in token1.
 * @member {String} collected_fees_token_1
 */
UniswapV3TickDTO.prototype['collected_fees_token_1'] = undefined;

/**
 * All time collected fees in USD.
 * @member {String} collected_fees_usd
 */
UniswapV3TickDTO.prototype['collected_fees_usd'] = undefined;

/**
 * Created time.
 * @member {Date} created_at_timestamp
 */
UniswapV3TickDTO.prototype['created_at_timestamp'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} liquidity_provider_count
 */
UniswapV3TickDTO.prototype['liquidity_provider_count'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} fee_growth_outside_0x128
 */
UniswapV3TickDTO.prototype['fee_growth_outside_0x128'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} fee_growth_outside_1x128
 */
UniswapV3TickDTO.prototype['fee_growth_outside_1x128'] = undefined;






export default UniswapV3TickDTO;

