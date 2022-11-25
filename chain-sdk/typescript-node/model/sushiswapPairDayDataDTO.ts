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
* Tracks pair data across each day.
*/
export class SushiswapPairDayDataDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * Identifier, format: <pair id>-<day start timestamp>.
    */
    'id'?: string | null;
    /**
    * Unix timestamp for start of day.
    */
    'date'?: number;
    /**
    * Reference to pair.
    */
    'pair'?: string | null;
    /**
    * Reference to token0.
    */
    'token0'?: string | null;
    /**
    * Reference to token1.
    */
    'token1'?: string | null;
    /**
    * Reserve of token0 (updated during each transaction on pair).
    */
    'reserve0'?: string | null;
    /**
    * Reserve of token1 (updated during each transaction on pair).
    */
    'reserve1'?: string | null;
    /**
    * Total supply of liquidity token distributed to LPs.
    */
    'totalSupply'?: string | null;
    /**
    * Reserve of token0 plus token1 stored as a derived USD amount.
    */
    'reserveUsd'?: string | null;
    /**
    * Total amount of token0 swapped throughout day.
    */
    'volumeToken0'?: string | null;
    /**
    * Total amount of token1 swapped throughout day.
    */
    'volumeToken1'?: string | null;
    /**
    * Total volume within pair throughout day.
    */
    'volumeUsd'?: string | null;
    /**
    * Amount of transactions on pair throughout day.
    */
    'txCount'?: string | null;
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
            "name": "date",
            "baseName": "date",
            "type": "number"
        },
        {
            "name": "pair",
            "baseName": "pair",
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
            "name": "totalSupply",
            "baseName": "total_supply",
            "type": "string"
        },
        {
            "name": "reserveUsd",
            "baseName": "reserve_usd",
            "type": "string"
        },
        {
            "name": "volumeToken0",
            "baseName": "volume_token_0",
            "type": "string"
        },
        {
            "name": "volumeToken1",
            "baseName": "volume_token_1",
            "type": "string"
        },
        {
            "name": "volumeUsd",
            "baseName": "volume_usd",
            "type": "string"
        },
        {
            "name": "txCount",
            "baseName": "tx_count",
            "type": "string"
        },
        {
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return SushiswapPairDayDataDTO.attributeTypeMap;
    }
}

