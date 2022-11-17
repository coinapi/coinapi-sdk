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

/**
* Tracks data across all pairs aggregated into a daily bucket.
*/
export class SushiswapDayDataDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * Unix timestamp for start of day / 86400 giving a unique day index.
    */
    'id'?: string | null;
    /**
    * Unix timestamp for start of day.
    */
    'date'?: number;
    /**
    * Factory address.
    */
    'factory'?: string | null;
    /**
    * Total volume across all pairs on this day, stored as a derived amount of ETH.
    */
    'volumeEth'?: string | null;
    /**
    * Total volume across all pairs on this day, stored as a derived amount of USD.
    */
    'volumeUsd'?: string | null;
    /**
    * Total volume across all pairs on this day, untracked
    */
    'untrackedVolume'?: string | null;
    /**
    * Total liquidity across all pairs in ETH up to and including this day.
    */
    'liquidityEth'?: string | null;
    /**
    * Total liquidity across all pairs in USD up to and including this day.
    */
    'liquidityUsd'?: string | null;
    /**
    * Number of transactions throughout this day.
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
            "name": "factory",
            "baseName": "factory",
            "type": "string"
        },
        {
            "name": "volumeEth",
            "baseName": "volume_eth",
            "type": "string"
        },
        {
            "name": "volumeUsd",
            "baseName": "volume_usd",
            "type": "string"
        },
        {
            "name": "untrackedVolume",
            "baseName": "untracked_volume",
            "type": "string"
        },
        {
            "name": "liquidityEth",
            "baseName": "liquidity_eth",
            "type": "string"
        },
        {
            "name": "liquidityUsd",
            "baseName": "liquidity_usd",
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
        return SushiswapDayDataDTO.attributeTypeMap;
    }
}
