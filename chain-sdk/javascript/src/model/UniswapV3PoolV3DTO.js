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
 * The UniswapV3PoolV3DTO model module.
 * @module model/UniswapV3PoolV3DTO
 * @version v1
 */
class UniswapV3PoolV3DTO {
    /**
     * Constructs a new <code>UniswapV3PoolV3DTO</code>.
     * Information about a pool. Includes references to each token within the pool, volume information, liquidity information, and more. The pool entity mirrors the pool smart contract, and also contains aggregated information about use.
     * @alias module:model/UniswapV3PoolV3DTO
     */
    constructor() { 
        
        UniswapV3PoolV3DTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniswapV3PoolV3DTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniswapV3PoolV3DTO} obj Optional instance to populate.
     * @return {module:model/UniswapV3PoolV3DTO} The populated <code>UniswapV3PoolV3DTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniswapV3PoolV3DTO();

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
            if (data.hasOwnProperty('created_at_timestamp')) {
                obj['created_at_timestamp'] = ApiClient.convertToType(data['created_at_timestamp'], 'Date');
            }
            if (data.hasOwnProperty('token_0')) {
                obj['token_0'] = ApiClient.convertToType(data['token_0'], 'String');
            }
            if (data.hasOwnProperty('token_1')) {
                obj['token_1'] = ApiClient.convertToType(data['token_1'], 'String');
            }
            if (data.hasOwnProperty('fee_tier')) {
                obj['fee_tier'] = NumericsBigInteger.constructFromObject(data['fee_tier']);
            }
            if (data.hasOwnProperty('liquidity')) {
                obj['liquidity'] = NumericsBigInteger.constructFromObject(data['liquidity']);
            }
            if (data.hasOwnProperty('sqrt_price')) {
                obj['sqrt_price'] = NumericsBigInteger.constructFromObject(data['sqrt_price']);
            }
            if (data.hasOwnProperty('fee_growth_global_0x128')) {
                obj['fee_growth_global_0x128'] = NumericsBigInteger.constructFromObject(data['fee_growth_global_0x128']);
            }
            if (data.hasOwnProperty('fee_growth_global_1x128')) {
                obj['fee_growth_global_1x128'] = NumericsBigInteger.constructFromObject(data['fee_growth_global_1x128']);
            }
            if (data.hasOwnProperty('token_0_price')) {
                obj['token_0_price'] = ApiClient.convertToType(data['token_0_price'], 'String');
            }
            if (data.hasOwnProperty('token_1_price')) {
                obj['token_1_price'] = ApiClient.convertToType(data['token_1_price'], 'String');
            }
            if (data.hasOwnProperty('tick')) {
                obj['tick'] = NumericsBigInteger.constructFromObject(data['tick']);
            }
            if (data.hasOwnProperty('observation_index')) {
                obj['observation_index'] = NumericsBigInteger.constructFromObject(data['observation_index']);
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
            if (data.hasOwnProperty('tx_count')) {
                obj['tx_count'] = NumericsBigInteger.constructFromObject(data['tx_count']);
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
            if (data.hasOwnProperty('total_value_locked_token_0')) {
                obj['total_value_locked_token_0'] = ApiClient.convertToType(data['total_value_locked_token_0'], 'String');
            }
            if (data.hasOwnProperty('total_value_locked_token_1')) {
                obj['total_value_locked_token_1'] = ApiClient.convertToType(data['total_value_locked_token_1'], 'String');
            }
            if (data.hasOwnProperty('total_value_locked_eth')) {
                obj['total_value_locked_eth'] = ApiClient.convertToType(data['total_value_locked_eth'], 'String');
            }
            if (data.hasOwnProperty('total_value_locked_usd')) {
                obj['total_value_locked_usd'] = ApiClient.convertToType(data['total_value_locked_usd'], 'String');
            }
            if (data.hasOwnProperty('total_value_locked_usd_untracked')) {
                obj['total_value_locked_usd_untracked'] = ApiClient.convertToType(data['total_value_locked_usd_untracked'], 'String');
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
     * Validates the JSON data with respect to <code>UniswapV3PoolV3DTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UniswapV3PoolV3DTO</code>.
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
        // validate the optional field `fee_tier`
        if (data['fee_tier']) { // data not null
          NumericsBigInteger.validateJSON(data['fee_tier']);
        }
        // validate the optional field `liquidity`
        if (data['liquidity']) { // data not null
          NumericsBigInteger.validateJSON(data['liquidity']);
        }
        // validate the optional field `sqrt_price`
        if (data['sqrt_price']) { // data not null
          NumericsBigInteger.validateJSON(data['sqrt_price']);
        }
        // validate the optional field `fee_growth_global_0x128`
        if (data['fee_growth_global_0x128']) { // data not null
          NumericsBigInteger.validateJSON(data['fee_growth_global_0x128']);
        }
        // validate the optional field `fee_growth_global_1x128`
        if (data['fee_growth_global_1x128']) { // data not null
          NumericsBigInteger.validateJSON(data['fee_growth_global_1x128']);
        }
        // ensure the json data is a string
        if (data['token_0_price'] && !(typeof data['token_0_price'] === 'string' || data['token_0_price'] instanceof String)) {
            throw new Error("Expected the field `token_0_price` to be a primitive type in the JSON string but got " + data['token_0_price']);
        }
        // ensure the json data is a string
        if (data['token_1_price'] && !(typeof data['token_1_price'] === 'string' || data['token_1_price'] instanceof String)) {
            throw new Error("Expected the field `token_1_price` to be a primitive type in the JSON string but got " + data['token_1_price']);
        }
        // validate the optional field `tick`
        if (data['tick']) { // data not null
          NumericsBigInteger.validateJSON(data['tick']);
        }
        // validate the optional field `observation_index`
        if (data['observation_index']) { // data not null
          NumericsBigInteger.validateJSON(data['observation_index']);
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
        // validate the optional field `tx_count`
        if (data['tx_count']) { // data not null
          NumericsBigInteger.validateJSON(data['tx_count']);
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
        // ensure the json data is a string
        if (data['total_value_locked_token_0'] && !(typeof data['total_value_locked_token_0'] === 'string' || data['total_value_locked_token_0'] instanceof String)) {
            throw new Error("Expected the field `total_value_locked_token_0` to be a primitive type in the JSON string but got " + data['total_value_locked_token_0']);
        }
        // ensure the json data is a string
        if (data['total_value_locked_token_1'] && !(typeof data['total_value_locked_token_1'] === 'string' || data['total_value_locked_token_1'] instanceof String)) {
            throw new Error("Expected the field `total_value_locked_token_1` to be a primitive type in the JSON string but got " + data['total_value_locked_token_1']);
        }
        // ensure the json data is a string
        if (data['total_value_locked_eth'] && !(typeof data['total_value_locked_eth'] === 'string' || data['total_value_locked_eth'] instanceof String)) {
            throw new Error("Expected the field `total_value_locked_eth` to be a primitive type in the JSON string but got " + data['total_value_locked_eth']);
        }
        // ensure the json data is a string
        if (data['total_value_locked_usd'] && !(typeof data['total_value_locked_usd'] === 'string' || data['total_value_locked_usd'] instanceof String)) {
            throw new Error("Expected the field `total_value_locked_usd` to be a primitive type in the JSON string but got " + data['total_value_locked_usd']);
        }
        // ensure the json data is a string
        if (data['total_value_locked_usd_untracked'] && !(typeof data['total_value_locked_usd_untracked'] === 'string' || data['total_value_locked_usd_untracked'] instanceof String)) {
            throw new Error("Expected the field `total_value_locked_usd_untracked` to be a primitive type in the JSON string but got " + data['total_value_locked_usd_untracked']);
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
UniswapV3PoolV3DTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
UniswapV3PoolV3DTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
UniswapV3PoolV3DTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {Number} vid
 */
UniswapV3PoolV3DTO.prototype['vid'] = undefined;

/**
 * Pool address.
 * @member {String} id
 */
UniswapV3PoolV3DTO.prototype['id'] = undefined;

/**
 * Creation time.
 * @member {Date} created_at_timestamp
 */
UniswapV3PoolV3DTO.prototype['created_at_timestamp'] = undefined;

/**
 * Reference to token0 as stored in pool contract.
 * @member {String} token_0
 */
UniswapV3PoolV3DTO.prototype['token_0'] = undefined;

/**
 * Reference to token1 as stored in pool contract.
 * @member {String} token_1
 */
UniswapV3PoolV3DTO.prototype['token_1'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} fee_tier
 */
UniswapV3PoolV3DTO.prototype['fee_tier'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} liquidity
 */
UniswapV3PoolV3DTO.prototype['liquidity'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} sqrt_price
 */
UniswapV3PoolV3DTO.prototype['sqrt_price'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} fee_growth_global_0x128
 */
UniswapV3PoolV3DTO.prototype['fee_growth_global_0x128'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} fee_growth_global_1x128
 */
UniswapV3PoolV3DTO.prototype['fee_growth_global_1x128'] = undefined;

/**
 * Token0 per token1.
 * @member {String} token_0_price
 */
UniswapV3PoolV3DTO.prototype['token_0_price'] = undefined;

/**
 * Token1 per token0.
 * @member {String} token_1_price
 */
UniswapV3PoolV3DTO.prototype['token_1_price'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} tick
 */
UniswapV3PoolV3DTO.prototype['tick'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} observation_index
 */
UniswapV3PoolV3DTO.prototype['observation_index'] = undefined;

/**
 * All time token0 swapped.
 * @member {String} volume_token_0
 */
UniswapV3PoolV3DTO.prototype['volume_token_0'] = undefined;

/**
 * All time token1 swapped.
 * @member {String} volume_token_1
 */
UniswapV3PoolV3DTO.prototype['volume_token_1'] = undefined;

/**
 * All time USD swapped.
 * @member {String} volume_usd
 */
UniswapV3PoolV3DTO.prototype['volume_usd'] = undefined;

/**
 * All time USD swapped, unfiltered for unreliable USD pools.
 * @member {String} untracked_volume_usd
 */
UniswapV3PoolV3DTO.prototype['untracked_volume_usd'] = undefined;

/**
 * Fees in USD.
 * @member {String} fees_usd
 */
UniswapV3PoolV3DTO.prototype['fees_usd'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} tx_count
 */
UniswapV3PoolV3DTO.prototype['tx_count'] = undefined;

/**
 * All time fees collected token0.
 * @member {String} collected_fees_token_0
 */
UniswapV3PoolV3DTO.prototype['collected_fees_token_0'] = undefined;

/**
 * All time fees collected token1.
 * @member {String} collected_fees_token_1
 */
UniswapV3PoolV3DTO.prototype['collected_fees_token_1'] = undefined;

/**
 * All time fees collected derived USD.
 * @member {String} collected_fees_usd
 */
UniswapV3PoolV3DTO.prototype['collected_fees_usd'] = undefined;

/**
 * Total token 0 across all ticks.
 * @member {String} total_value_locked_token_0
 */
UniswapV3PoolV3DTO.prototype['total_value_locked_token_0'] = undefined;

/**
 * 
 * @member {String} total_value_locked_token_1
 */
UniswapV3PoolV3DTO.prototype['total_value_locked_token_1'] = undefined;

/**
 * Total token 1 across all ticks.
 * @member {String} total_value_locked_eth
 */
UniswapV3PoolV3DTO.prototype['total_value_locked_eth'] = undefined;

/**
 * Total value locked USD.
 * @member {String} total_value_locked_usd
 */
UniswapV3PoolV3DTO.prototype['total_value_locked_usd'] = undefined;

/**
 * Total value locked derived ETH.
 * @member {String} total_value_locked_usd_untracked
 */
UniswapV3PoolV3DTO.prototype['total_value_locked_usd_untracked'] = undefined;

/**
 * Liquidity providers count, used to detect new exchanges.
 * @member {String} liquidity_provider_count
 */
UniswapV3PoolV3DTO.prototype['liquidity_provider_count'] = undefined;

/**
 * @member {Number} evaluated_ask
 */
UniswapV3PoolV3DTO.prototype['evaluated_ask'] = undefined;






export default UniswapV3PoolV3DTO;

