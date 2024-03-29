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
* Token data aggregated across all pairs that include token.
*/
export class UniswapV2TokenDayDataDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
    */
    'id'?: string | null;
    /**
    * Unix timestamp for start of day.
    */
    'date'?: number;
    /**
    * Reference to token entity.
    */
    'token'?: string | null;
    /**
    * Amount of token swapped across all pairs throughout day.
    */
    'dailyVolumeToken'?: string | null;
    /**
    * Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
    */
    'dailyVolumeEth'?: string | null;
    /**
    * Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
    */
    'dailyVolumeUsd'?: string | null;
    /**
    * Amount of transactions with this token across all pairs.
    */
    'dailyTxns'?: string | null;
    /**
    * Token amount of token deposited across all pairs.
    */
    'totalLiquidityToken'?: string | null;
    /**
    * Token amount of token deposited across all pairs stored as amount of ETH.
    */
    'totalLiquidityEth'?: string | null;
    /**
    * Token amount of token deposited across all pairs stored as amount of USD.
    */
    'totalLiquidityUsd'?: string | null;
    /**
    * Price of token in derived USD.
    */
    'priceUsd'?: string | null;
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
            "name": "token",
            "baseName": "token",
            "type": "string"
        },
        {
            "name": "dailyVolumeToken",
            "baseName": "daily_volume_token",
            "type": "string"
        },
        {
            "name": "dailyVolumeEth",
            "baseName": "daily_volume_eth",
            "type": "string"
        },
        {
            "name": "dailyVolumeUsd",
            "baseName": "daily_volume_usd",
            "type": "string"
        },
        {
            "name": "dailyTxns",
            "baseName": "daily_txns",
            "type": "string"
        },
        {
            "name": "totalLiquidityToken",
            "baseName": "total_liquidity_token",
            "type": "string"
        },
        {
            "name": "totalLiquidityEth",
            "baseName": "total_liquidity_eth",
            "type": "string"
        },
        {
            "name": "totalLiquidityUsd",
            "baseName": "total_liquidity_usd",
            "type": "string"
        },
        {
            "name": "priceUsd",
            "baseName": "price_usd",
            "type": "string"
        },
        {
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return UniswapV2TokenDayDataDTO.attributeTypeMap;
    }
}

