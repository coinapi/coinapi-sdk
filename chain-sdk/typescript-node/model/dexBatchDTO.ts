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

/**
* Batch executed. Every batch will contain at least solution with the a set of trades that are executed in it
*/
export class DexBatchDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * Identifier.
    */
    'id'?: string | null;
    /**
    * Start epoch.
    */
    'startEpoch'?: string | null;
    /**
    * End epoch.
    */
    'endEpoch'?: string | null;
    /**
    * Reference to solution.
    */
    'solution'?: string | null;
    /**
    * First solution epoch.
    */
    'firstSolutionEpoch'?: string | null;
    /**
    * Last revert epoch.
    */
    'lastRevertEpoch'?: string | null;
    /**
    * Transaction hash.
    */
    'txHash'?: string | null;
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
            "name": "startEpoch",
            "baseName": "start_epoch",
            "type": "string"
        },
        {
            "name": "endEpoch",
            "baseName": "end_epoch",
            "type": "string"
        },
        {
            "name": "solution",
            "baseName": "solution",
            "type": "string"
        },
        {
            "name": "firstSolutionEpoch",
            "baseName": "first_solution_epoch",
            "type": "string"
        },
        {
            "name": "lastRevertEpoch",
            "baseName": "last_revert_epoch",
            "type": "string"
        },
        {
            "name": "txHash",
            "baseName": "tx_hash",
            "type": "string"
        },
        {
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return DexBatchDTO.attributeTypeMap;
    }
}

