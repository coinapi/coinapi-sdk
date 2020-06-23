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
import { PositionData } from './positionData';

export class Position {
    /**
    * Result type.
    */
    'type'?: string;
    /**
    * Name of exchange.
    */
    'exchangeName'?: string;
    'data'?: Array<PositionData>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "exchangeName",
            "baseName": "exchange_name",
            "type": "string"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<PositionData>"
        }    ];

    static getAttributeTypeMap() {
        return Position.attributeTypeMap;
    }
}

