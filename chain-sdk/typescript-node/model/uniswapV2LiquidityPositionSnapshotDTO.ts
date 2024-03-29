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
* This entity is used to store data about a user\'s liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
*/
export class UniswapV2LiquidityPositionSnapshotDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * Identifier, format: (pair address)-(user address)
    */
    'id'?: string | null;
    /**
    * Reference to LP identifier.
    */
    'liquidityPosition'?: string | null;
    /**
    * Creation time.
    */
    'timestamp'?: number;
    /**
    * Number of block in which LP snapshot was recorded.
    */
    'block'?: number;
    /**
    * Reference to user.
    */
    'user'?: string | null;
    /**
    * Reference to the pair liquidity is being provided on.
    */
    'pair'?: string | null;
    /**
    * Snapshot of token0 price.
    */
    'token0PriceUsd'?: string | null;
    /**
    * Snapshot of token0 price.
    */
    'token1PriceUsd'?: string | null;
    /**
    * Snapshot of pair token0 reserves.
    */
    'reserve0'?: string | null;
    /**
    * Snapshot of pair token1 reserves.
    */
    'reserve1'?: string | null;
    /**
    * Snapshot of pair reserves in USD.
    */
    'reserveUsd'?: string | null;
    /**
    * Snapshot of pool token supply.
    */
    'liquidityTokenTotalSupply'?: string | null;
    /**
    * Snapshot of users pool token balance.
    */
    'liquidityTokenBalance'?: string | null;
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
            "name": "liquidityPosition",
            "baseName": "liquidity_position",
            "type": "string"
        },
        {
            "name": "timestamp",
            "baseName": "timestamp",
            "type": "number"
        },
        {
            "name": "block",
            "baseName": "block",
            "type": "number"
        },
        {
            "name": "user",
            "baseName": "user",
            "type": "string"
        },
        {
            "name": "pair",
            "baseName": "pair",
            "type": "string"
        },
        {
            "name": "token0PriceUsd",
            "baseName": "token_0_price_usd",
            "type": "string"
        },
        {
            "name": "token1PriceUsd",
            "baseName": "token_1_price_usd",
            "type": "string"
        },
        {
            "name": "reserve0",
            "baseName": "reserve_0",
            "type": "string"
        },
        {
            "name": "reserve1",
            "baseName": "reserve_1",
            "type": "string"
        },
        {
            "name": "reserveUsd",
            "baseName": "reserve_usd",
            "type": "string"
        },
        {
            "name": "liquidityTokenTotalSupply",
            "baseName": "liquidity_token_total_supply",
            "type": "string"
        },
        {
            "name": "liquidityTokenBalance",
            "baseName": "liquidity_token_balance",
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
        return UniswapV2LiquidityPositionSnapshotDTO.attributeTypeMap;
    }
}

