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
import { NumericsBigInteger } from './numericsBigInteger';
import { TransactionsETradeAggressiveSide } from './transactionsETradeAggressiveSide';

/**
* Swap are created for each token swap within a pair.
*/
export class UniswapV3SwapDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * 
    */
    'vid'?: number;
    /**
    * Identifier, format: (transaction hash) + # + (index in swaps Transaction array).
    */
    'id'?: string | null;
    /**
    * Pointer to transaction.
    */
    'transaction'?: string | null;
    /**
    * Timestamp of transaction.
    */
    'timestamp'?: Date;
    /**
    * Pool swap occured within.
    */
    'pool'?: string | null;
    /**
    * Reference to token0 as stored in pair contract.
    */
    'token0'?: string | null;
    /**
    * Reference to token1 as stored in pair contract.
    */
    'token1'?: string | null;
    /**
    * Sender of the swap.
    */
    'sender'?: string | null;
    /**
    * Recipient of the swap.
    */
    'recipient'?: string | null;
    /**
    * Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
    */
    'origin'?: string | null;
    /**
    * Delta of token0 swapped.
    */
    'amount0'?: string | null;
    /**
    * Delta of token1 swapped.
    */
    'amount1'?: string | null;
    /**
    * Derived amount of tokens sold in USD.
    */
    'amountUsd'?: string | null;
    'sqrtPriceX96'?: NumericsBigInteger;
    'tick'?: NumericsBigInteger;
    'logIndex'?: NumericsBigInteger;
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
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "transaction",
            "baseName": "transaction",
            "type": "string"
        },
        {
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "Date"
        },
        {
            "name": "pool",
            "baseName": "pool",
            "type": "string"
        },
        {
            "name": "token0",
            "baseName": "token_0",
            "type": "string"
        },
        {
            "name": "token1",
            "baseName": "token_1",
            "type": "string"
        },
        {
            "name": "sender",
            "baseName": "sender",
            "type": "string"
        },
        {
            "name": "recipient",
            "baseName": "recipient",
            "type": "string"
        },
        {
            "name": "origin",
            "baseName": "origin",
            "type": "string"
        },
        {
            "name": "amount0",
            "baseName": "amount_0",
            "type": "string"
        },
        {
            "name": "amount1",
            "baseName": "amount_1",
            "type": "string"
        },
        {
            "name": "amountUsd",
            "baseName": "amount_usd",
            "type": "string"
        },
        {
            "name": "sqrtPriceX96",
            "baseName": "sqrt_price_x96",
            "type": "NumericsBigInteger"
        },
        {
            "name": "tick",
            "baseName": "tick",
            "type": "NumericsBigInteger"
        },
        {
            "name": "logIndex",
            "baseName": "log_index",
            "type": "NumericsBigInteger"
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
        return UniswapV3SwapDTO.attributeTypeMap;
    }
}

