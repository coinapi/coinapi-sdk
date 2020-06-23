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
 */

import * as models from './models';

export interface Balance {
    /**
     * Result type.
     */
    type?: string;

    /**
     * Exchange name.
     */
    exchange_name?: string;

    data?: Array<models.BalanceData>;

}
