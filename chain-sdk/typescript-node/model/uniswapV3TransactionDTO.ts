/**
 * OnChain API
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

export class UniswapV3TransactionDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * Transaction hash.
    */
    'id'?: string | null;
    /**
    * Timestamp txn was confirmed.
    */
    'timestamp'?: string | null;
    /**
    * Gas used during txn execution.
    */
    'gasUsed'?: string | null;
    /**
    * 
    */
    'gasPrice'?: string | null;
    /**
    * 
    */
    'vid'?: number;

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
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "string"
        },
        {
            "name": "gasUsed",
            "baseName": "gas_used",
            "type": "string"
        },
        {
            "name": "gasPrice",
            "baseName": "gas_price",
            "type": "string"
        },
        {
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return UniswapV3TransactionDTO.attributeTypeMap;
    }
}

