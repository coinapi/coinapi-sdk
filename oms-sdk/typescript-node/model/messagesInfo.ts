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

import { RequestFile } from '../api';

export class MessagesInfo {
    /**
    * Type of message
    */
    'type'?: string;
    /**
    * Exchange name
    */
    'exchangeId'?: string;
    /**
    * Error message
    */
    'errorMessage'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "exchangeId",
            "baseName": "exchange_id",
            "type": "string"
        },
        {
            "name": "errorMessage",
            "baseName": "error_message",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return MessagesInfo.attributeTypeMap;
    }
}

