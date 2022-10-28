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
import ETradeAggressiveSide from './ETradeAggressiveSide';

/**
 * The SwapDTO model module.
 * @module model/SwapDTO
 * @version v1
 */
class SwapDTO {
    /**
     * Constructs a new <code>SwapDTO</code>.
     * @alias module:model/SwapDTO
     */
    constructor() { 
        
        SwapDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SwapDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SwapDTO} obj Optional instance to populate.
     * @return {module:model/SwapDTO} The populated <code>SwapDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SwapDTO();

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
            if (data.hasOwnProperty('sender')) {
                obj['sender'] = ApiClient.convertToType(data['sender'], 'String');
            }
            if (data.hasOwnProperty('amount_0_in')) {
                obj['amount_0_in'] = ApiClient.convertToType(data['amount_0_in'], 'String');
            }
            if (data.hasOwnProperty('amount_1_in')) {
                obj['amount_1_in'] = ApiClient.convertToType(data['amount_1_in'], 'String');
            }
            if (data.hasOwnProperty('amount_0_out')) {
                obj['amount_0_out'] = ApiClient.convertToType(data['amount_0_out'], 'String');
            }
            if (data.hasOwnProperty('amount_1_out')) {
                obj['amount_1_out'] = ApiClient.convertToType(data['amount_1_out'], 'String');
            }
            if (data.hasOwnProperty('to')) {
                obj['to'] = ApiClient.convertToType(data['to'], 'String');
            }
            if (data.hasOwnProperty('log_index')) {
                obj['log_index'] = ApiClient.convertToType(data['log_index'], 'String');
            }
            if (data.hasOwnProperty('amount_usd')) {
                obj['amount_usd'] = ApiClient.convertToType(data['amount_usd'], 'String');
            }
            if (data.hasOwnProperty('vid')) {
                obj['vid'] = ApiClient.convertToType(data['vid'], 'Number');
            }
            if (data.hasOwnProperty('pool_id')) {
                obj['pool_id'] = ApiClient.convertToType(data['pool_id'], 'String');
            }
            if (data.hasOwnProperty('transaction_id')) {
                obj['transaction_id'] = ApiClient.convertToType(data['transaction_id'], 'String');
            }
            if (data.hasOwnProperty('evaluated_price')) {
                obj['evaluated_price'] = ApiClient.convertToType(data['evaluated_price'], 'Number');
            }
            if (data.hasOwnProperty('evaluated_amount')) {
                obj['evaluated_amount'] = ApiClient.convertToType(data['evaluated_amount'], 'Number');
            }
            if (data.hasOwnProperty('evaluated_aggressor')) {
                obj['evaluated_aggressor'] = ETradeAggressiveSide.constructFromObject(data['evaluated_aggressor']);
            }
        }
        return obj;
    }


}

/**
 * @member {Date} entry_time
 */
SwapDTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
SwapDTO.prototype['recv_time'] = undefined;

/**
 * 
 * @member {Number} block_number
 */
SwapDTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {String} id
 */
SwapDTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} transaction
 */
SwapDTO.prototype['transaction'] = undefined;

/**
 * 
 * @member {String} timestamp
 */
SwapDTO.prototype['timestamp'] = undefined;

/**
 * 
 * @member {String} pair
 */
SwapDTO.prototype['pair'] = undefined;

/**
 * 
 * @member {String} sender
 */
SwapDTO.prototype['sender'] = undefined;

/**
 * 
 * @member {String} amount_0_in
 */
SwapDTO.prototype['amount_0_in'] = undefined;

/**
 * 
 * @member {String} amount_1_in
 */
SwapDTO.prototype['amount_1_in'] = undefined;

/**
 * 
 * @member {String} amount_0_out
 */
SwapDTO.prototype['amount_0_out'] = undefined;

/**
 * 
 * @member {String} amount_1_out
 */
SwapDTO.prototype['amount_1_out'] = undefined;

/**
 * 
 * @member {String} to
 */
SwapDTO.prototype['to'] = undefined;

/**
 * 
 * @member {String} log_index
 */
SwapDTO.prototype['log_index'] = undefined;

/**
 * 
 * @member {String} amount_usd
 */
SwapDTO.prototype['amount_usd'] = undefined;

/**
 * 
 * @member {Number} vid
 */
SwapDTO.prototype['vid'] = undefined;

/**
 * @member {String} pool_id
 */
SwapDTO.prototype['pool_id'] = undefined;

/**
 * @member {String} transaction_id
 */
SwapDTO.prototype['transaction_id'] = undefined;

/**
 * @member {Number} evaluated_price
 */
SwapDTO.prototype['evaluated_price'] = undefined;

/**
 * @member {Number} evaluated_amount
 */
SwapDTO.prototype['evaluated_amount'] = undefined;

/**
 * @member {module:model/ETradeAggressiveSide} evaluated_aggressor
 */
SwapDTO.prototype['evaluated_aggressor'] = undefined;






export default SwapDTO;

