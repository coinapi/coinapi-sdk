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
import BigInteger from './BigInteger';

/**
 * The TokenV2DTO model module.
 * @module model/TokenV2DTO
 * @version v1
 */
class TokenV2DTO {
    /**
     * Constructs a new <code>TokenV2DTO</code>.
     * @alias module:model/TokenV2DTO
     */
    constructor() { 
        
        TokenV2DTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TokenV2DTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TokenV2DTO} obj Optional instance to populate.
     * @return {module:model/TokenV2DTO} The populated <code>TokenV2DTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TokenV2DTO();

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
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('decimals')) {
                obj['decimals'] = ApiClient.convertToType(data['decimals'], 'Number');
            }
            if (data.hasOwnProperty('total_supply')) {
                obj['total_supply'] = BigInteger.constructFromObject(data['total_supply']);
            }
            if (data.hasOwnProperty('trade_volume')) {
                obj['trade_volume'] = ApiClient.convertToType(data['trade_volume'], 'String');
            }
            if (data.hasOwnProperty('trade_volume_usd')) {
                obj['trade_volume_usd'] = ApiClient.convertToType(data['trade_volume_usd'], 'String');
            }
            if (data.hasOwnProperty('untracked_volume_usd')) {
                obj['untracked_volume_usd'] = ApiClient.convertToType(data['untracked_volume_usd'], 'String');
            }
            if (data.hasOwnProperty('tx_count')) {
                obj['tx_count'] = BigInteger.constructFromObject(data['tx_count']);
            }
            if (data.hasOwnProperty('total_liquidity')) {
                obj['total_liquidity'] = ApiClient.convertToType(data['total_liquidity'], 'String');
            }
            if (data.hasOwnProperty('derived_eth')) {
                obj['derived_eth'] = ApiClient.convertToType(data['derived_eth'], 'String');
            }
            if (data.hasOwnProperty('token_symbol')) {
                obj['token_symbol'] = ApiClient.convertToType(data['token_symbol'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Date} entry_time
 */
TokenV2DTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
TokenV2DTO.prototype['recv_time'] = undefined;

/**
 * @member {Number} block_number
 */
TokenV2DTO.prototype['block_number'] = undefined;

/**
 * @member {Number} vid
 */
TokenV2DTO.prototype['vid'] = undefined;

/**
 * @member {String} id
 */
TokenV2DTO.prototype['id'] = undefined;

/**
 * @member {String} symbol
 */
TokenV2DTO.prototype['symbol'] = undefined;

/**
 * @member {String} name
 */
TokenV2DTO.prototype['name'] = undefined;

/**
 * @member {Number} decimals
 */
TokenV2DTO.prototype['decimals'] = undefined;

/**
 * @member {module:model/BigInteger} total_supply
 */
TokenV2DTO.prototype['total_supply'] = undefined;

/**
 * @member {String} trade_volume
 */
TokenV2DTO.prototype['trade_volume'] = undefined;

/**
 * @member {String} trade_volume_usd
 */
TokenV2DTO.prototype['trade_volume_usd'] = undefined;

/**
 * @member {String} untracked_volume_usd
 */
TokenV2DTO.prototype['untracked_volume_usd'] = undefined;

/**
 * @member {module:model/BigInteger} tx_count
 */
TokenV2DTO.prototype['tx_count'] = undefined;

/**
 * @member {String} total_liquidity
 */
TokenV2DTO.prototype['total_liquidity'] = undefined;

/**
 * @member {String} derived_eth
 */
TokenV2DTO.prototype['derived_eth'] = undefined;

/**
 * @member {String} token_symbol
 */
TokenV2DTO.prototype['token_symbol'] = undefined;






export default TokenV2DTO;
