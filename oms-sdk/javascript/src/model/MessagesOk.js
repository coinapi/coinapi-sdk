/**
 * OMS - REST API .
 * OMS Project
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The MessagesOk model module.
 * @module model/MessagesOk
 * @version v1
 */
class MessagesOk {
    /**
     * Constructs a new <code>MessagesOk</code>.
     * @alias module:model/MessagesOk
     */
    constructor() { 
        
        MessagesOk.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MessagesOk</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessagesOk} obj Optional instance to populate.
     * @return {module:model/MessagesOk} The populated <code>MessagesOk</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessagesOk();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('exchange_id')) {
                obj['exchange_id'] = ApiClient.convertToType(data['exchange_id'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Type of message
 * @member {String} type
 */
MessagesOk.prototype['type'] = undefined;

/**
 * Exchange name
 * @member {String} exchange_id
 */
MessagesOk.prototype['exchange_id'] = undefined;

/**
 * Message
 * @member {String} message
 */
MessagesOk.prototype['message'] = undefined;






export default MessagesOk;

