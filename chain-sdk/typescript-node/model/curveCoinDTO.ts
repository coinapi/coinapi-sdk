/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

export class CurveCoinDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * Identifier, format: <pool_id>-<coin_index>.
    */
    'id'?: string | null;
    /**
    * Coin index.
    */
    'index'?: number;
    /**
    * 
    */
    'pool'?: string | null;
    /**
    * 
    */
    'token'?: string | null;
    /**
    * 
    */
    'underlying'?: string | null;
    /**
    * 
    */
    'balance'?: string | null;
    /**
    * Exchange rate between this coin and the associated underlying coin within the pool.
    */
    'rate'?: string | null;
    /**
    * 
    */
    'updated'?: string | null;
    /**
    * 
    */
    'updatedAtBlock'?: string | null;
    /**
    * 
    */
    'updatedAtTransaction'?: string | null;
    /**
    * 
    */
    'vid'?: number;
    /**
    * 
    */
    'blockRange'?: string | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "entryTime",
            "baseName": "entry_time",
            "type": "Date"
        },
        {
            "name": "recvTime",
            "baseName": "recv_time",
            "type": "Date"
        },
        {
            "name": "blockNumber",
            "baseName": "block_number",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        },
        {
            "name": "pool",
            "baseName": "pool",
            "type": "string"
        },
        {
            "name": "token",
            "baseName": "token",
            "type": "string"
        },
        {
            "name": "underlying",
            "baseName": "underlying",
            "type": "string"
        },
        {
            "name": "balance",
            "baseName": "balance",
            "type": "string"
        },
        {
            "name": "rate",
            "baseName": "rate",
            "type": "string"
        },
        {
            "name": "updated",
            "baseName": "updated",
            "type": "string"
        },
        {
            "name": "updatedAtBlock",
            "baseName": "updated_at_block",
            "type": "string"
        },
        {
            "name": "updatedAtTransaction",
            "baseName": "updated_at_transaction",
            "type": "string"
        },
        {
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        },
        {
            "name": "blockRange",
            "baseName": "block_range",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CurveCoinDTO.attributeTypeMap;
    }
}

