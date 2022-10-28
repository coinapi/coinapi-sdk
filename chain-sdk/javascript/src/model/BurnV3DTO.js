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
 * The BurnV3DTO model module.
 * @module model/BurnV3DTO
 * @version v1
 */
class BurnV3DTO {
    /**
     * Constructs a new <code>BurnV3DTO</code>.
     * @alias module:model/BurnV3DTO
     */
    constructor() { 
        
        BurnV3DTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BurnV3DTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BurnV3DTO} obj Optional instance to populate.
     * @return {module:model/BurnV3DTO} The populated <code>BurnV3DTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BurnV3DTO();

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


}

/**
 * @member {Date} entry_time
 */
BurnV3DTO.prototype['entry_time'] = undefined;

/**
 * @member {Date} recv_time
 */
BurnV3DTO.prototype['recv_time'] = undefined;

/**
 * 
 * @member {Number} block_number
 */
BurnV3DTO.prototype['block_number'] = undefined;

/**
 * 
 * @member {String} id
 */
BurnV3DTO.prototype['id'] = undefined;

/**
 * 
 * @member {String} transaction
 */
BurnV3DTO.prototype['transaction'] = undefined;

/**
 * 
 * @member {String} pool
 */
BurnV3DTO.prototype['pool'] = undefined;

/**
 * 
 * @member {String} token_0
 */
BurnV3DTO.prototype['token_0'] = undefined;

/**
 * 
 * @member {String} token_1
 */
BurnV3DTO.prototype['token_1'] = undefined;

/**
 * 
 * @member {String} timestamp
 */
BurnV3DTO.prototype['timestamp'] = undefined;

/**
 * 
 * @member {String} owner
 */
BurnV3DTO.prototype['owner'] = undefined;

/**
 * 
 * @member {String} origin
 */
BurnV3DTO.prototype['origin'] = undefined;

/**
 * 
 * @member {String} amount
 */
BurnV3DTO.prototype['amount'] = undefined;

/**
 * 
 * @member {String} amount_0
 */
BurnV3DTO.prototype['amount_0'] = undefined;

/**
 * 
 * @member {String} amount_1
 */
BurnV3DTO.prototype['amount_1'] = undefined;

/**
 * 
 * @member {String} amount_usd
 */
BurnV3DTO.prototype['amount_usd'] = undefined;

/**
 * 
 * @member {String} tick_lower
 */
BurnV3DTO.prototype['tick_lower'] = undefined;

/**
 * 
 * @member {String} tick_upper
 */
BurnV3DTO.prototype['tick_upper'] = undefined;

/**
 * 
 * @member {String} log_index
 */
BurnV3DTO.prototype['log_index'] = undefined;

/**
 * 
 * @member {Number} vid
 */
BurnV3DTO.prototype['vid'] = undefined;






export default BurnV3DTO;

