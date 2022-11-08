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
import { TransactionsETradeAggressiveSide } from './transactionsETradeAggressiveSide';

export class CurveExchangeDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * 
    */
    'id'?: string | null;
    /**
    * 
    */
    'pool'?: string | null;
    /**
    * 
    */
    'buyer'?: string | null;
    /**
    * 
    */
    'receiver'?: string | null;
    /**
    * 
    */
    'tokenSold'?: string | null;
    /**
    * 
    */
    'tokenBought'?: string | null;
    /**
    * 
    */
    'amountSold'?: string | null;
    /**
    * 
    */
    'amountBought'?: string | null;
    /**
    * 
    */
    'block'?: string | null;
    /**
    * 
    */
    'timestamp'?: string | null;
    /**
    * 
    */
    'transaction'?: string | null;
    /**
    * 
    */
    'vid'?: number;
    'evaluatedPrice'?: number;
    'evaluatedAmount'?: number;
    'evaluatedAggressor'?: TransactionsETradeAggressiveSide;
    'poolId'?: string | null;
    'transactionId'?: string | null;

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
            "name": "pool",
            "baseName": "pool",
            "type": "string"
        },
        {
            "name": "buyer",
            "baseName": "buyer",
            "type": "string"
        },
        {
            "name": "receiver",
            "baseName": "receiver",
            "type": "string"
        },
        {
            "name": "tokenSold",
            "baseName": "token_sold",
            "type": "string"
        },
        {
            "name": "tokenBought",
            "baseName": "token_bought",
            "type": "string"
        },
        {
            "name": "amountSold",
            "baseName": "amount_sold",
            "type": "string"
        },
        {
            "name": "amountBought",
            "baseName": "amount_bought",
            "type": "string"
        },
        {
            "name": "block",
            "baseName": "block",
            "type": "string"
        },
        {
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "string"
        },
        {
            "name": "transaction",
            "baseName": "transaction",
            "type": "string"
        },
        {
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        },
        {
            "name": "evaluatedPrice",
            "baseName": "evaluated_price",
            "type": "number"
        },
        {
            "name": "evaluatedAmount",
            "baseName": "evaluated_amount",
            "type": "number"
        },
        {
            "name": "evaluatedAggressor",
            "baseName": "evaluated_aggressor",
            "type": "TransactionsETradeAggressiveSide"
        },
        {
            "name": "poolId",
            "baseName": "pool_id",
            "type": "string"
        },
        {
            "name": "transactionId",
            "baseName": "transaction_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CurveExchangeDTO.attributeTypeMap;
    }
}

