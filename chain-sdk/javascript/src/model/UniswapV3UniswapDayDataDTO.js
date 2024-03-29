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
 * The UniswapV3UniswapDayDataDTO model module.
 * @module model/UniswapV3UniswapDayDataDTO
 * @version v1
 */
class UniswapV3UniswapDayDataDTO {
    /**
     * Constructs a new <code>UniswapV3UniswapDayDataDTO</code>.
     * Data accumulated and condensed into day stats for all of Uniswap.
     * @alias module:model/UniswapV3UniswapDayDataDTO
     */
    constructor() { 
        
        UniswapV3UniswapDayDataDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UniswapV3UniswapDayDataDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UniswapV3UniswapDayDataDTO} obj Optional instance to populate.
     * @return {module:model/UniswapV3UniswapDayDataDTO} The populated <code>UniswapV3UniswapDayDataDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UniswapV3UniswapDayDataDTO();

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
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Number');
            }
            if (data.hasOwnProperty('volume_eth')) {
                obj['volume_eth'] = ApiClient.convertToType(data['volume_eth'], 'String');
            }
            if (data.hasOwnProperty('volume_usd')) {
                obj['volume_usd'] = ApiClient.convertToType(data['volume_usd'], 'String');
            }
            if (data.hasOwnProperty('volume_usd_untracked')) {
                obj['volume_usd_untracked'] = ApiClient.convertToType(data['volume_usd_untracked'], 'String');
            }
            if (data.hasOwnProperty('fees_usd')) {
                obj['fees_usd'] = ApiClient.convertToType(data['fees_usd'], 'String');
            }
            if (data.hasOwnProperty('tx_count')) {
                obj['tx_count'] = NumericsBigInteger.constructFromObject(data['tx_count']);
            }
            if (data.hasOwnProperty('tvl_usd')) {
                obj['tvl_usd'] = ApiClient.convertToType(data['tvl_usd'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UniswapV3UniswapDayDataDTO</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UniswapV3UniswapDayDataDTO</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
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
        if (data['volume_usd_untracked'] && !(typeof data['volume_usd_untracked'] === 'string' || data['volume_usd_untracked'] instanceof String)) {
            throw new Error("Expected the field `volume_usd_untracked` to be a primitive type in the JSON string but got " + data['volume_usd_untracked']);
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
        if (data['tvl_usd'] && !(typeof data['tvl_usd'] === 'string' || data['tvl_usd'] instanceof String)) {
            throw new Error("Expected the field `tvl_usd` to be a primitive type in the JSON string but got " + data['tvl_usd']);
        }

        return true;
    }


}



/**
 * @member {Date} entry_time
 */
UniswapV3UniswapDayDataDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
UniswapV3UniswapDayDataDTO.prototype['recv_time'] = undefined;

/**
 * Number of block in which entity was recorded.
 * @member {Number} block_number
 */
UniswapV3UniswapDayDataDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {Number} vid
 */
UniswapV3UniswapDayDataDTO.prototype['vid'] = undefined;

/**
 * Timestamp rounded to current day by dividing by 86400.
 * @member {String} id
 */
UniswapV3UniswapDayDataDTO.prototype['id'] = undefined;

/**
 * Timestamp rounded to current day by dividing by 86400.
 * @member {Number} date
 */
UniswapV3UniswapDayDataDTO.prototype['date'] = undefined;

/**
 * Total volume across all pairs on this day, stored as a derived amount of ETH.
 * @member {String} volume_eth
 */
UniswapV3UniswapDayDataDTO.prototype['volume_eth'] = undefined;

/**
 * Total volume across all pairs on this day, stored as a derived amount of USD.
 * @member {String} volume_usd
 */
UniswapV3UniswapDayDataDTO.prototype['volume_usd'] = undefined;

/**
 * Total daily volume in Uniswap derived in terms of USD untracked.
 * @member {String} volume_usd_untracked
 */
UniswapV3UniswapDayDataDTO.prototype['volume_usd_untracked'] = undefined;

/**
 * Fees in USD
 * @member {String} fees_usd
 */
UniswapV3UniswapDayDataDTO.prototype['fees_usd'] = undefined;

/**
 * @member {module:model/NumericsBigInteger} tx_count
 */
UniswapV3UniswapDayDataDTO.prototype['tx_count'] = undefined;

/**
 * Tvl in terms of USD.
 * @member {String} tvl_usd
 */
UniswapV3UniswapDayDataDTO.prototype['tvl_usd'] = undefined;






export default UniswapV3UniswapDayDataDTO;

