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
* The Uniswap Factory entity is responsible for storing aggregate information across all Uniswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
*/
export class UniswapV3FactoryDTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    /**
    * Number of block in which entity was recorded.
    */
    'blockNumber'?: number;
    /**
    * Factory address.
    */
    'id'?: string | null;
    /**
    * Amount of pools created.
    */
    'poolCount'?: string | null;
    /**
    * Amount of transactions all time.
    */
    'txCount'?: string | null;
    /**
    * Total volume all time in derived USD.
    */
    'totalVolumeUsd'?: string | null;
    /**
    * Total volume all time in derived ETH.
    */
    'totalVolumeEth'?: string | null;
    /**
    * Total swap fees all time in USD.
    */
    'totalFeesUsd'?: string | null;
    /**
    * All volume even through less reliable USD values.
    */
    'totalFeesEth'?: string | null;
    /**
    * All volume even through less reliable USD values.
    */
    'untrackedVolumeUsd'?: string | null;
    /**
    * Total value locked derived in USD.
    */
    'totalValueLockedUsd'?: string | null;
    /**
    * Total value locked derived in ETH.
    */
    'totalValueLockedEth'?: string | null;
    /**
    * Total value locked derived in USD untracked.
    */
    'totalValueLockedUsdUntracked'?: string | null;
    /**
    * Total value locked derived in ETH untracked.
    */
    'totalValueLockedEthUntracked'?: string | null;
    /**
    * Current owner of the factory.
    */
    'owner'?: string | null;
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
            "name": "poolCount",
            "baseName": "pool_count",
            "type": "string"
        },
        {
            "name": "txCount",
            "baseName": "tx_count",
            "type": "string"
        },
        {
            "name": "totalVolumeUsd",
            "baseName": "total_volume_usd",
            "type": "string"
        },
        {
            "name": "totalVolumeEth",
            "baseName": "total_volume_eth",
            "type": "string"
        },
        {
            "name": "totalFeesUsd",
            "baseName": "total_fees_usd",
            "type": "string"
        },
        {
            "name": "totalFeesEth",
            "baseName": "total_fees_eth",
            "type": "string"
        },
        {
            "name": "untrackedVolumeUsd",
            "baseName": "untracked_volume_usd",
            "type": "string"
        },
        {
            "name": "totalValueLockedUsd",
            "baseName": "total_value_locked_usd",
            "type": "string"
        },
        {
            "name": "totalValueLockedEth",
            "baseName": "total_value_locked_eth",
            "type": "string"
        },
        {
            "name": "totalValueLockedUsdUntracked",
            "baseName": "total_value_locked_usd_untracked",
            "type": "string"
        },
        {
            "name": "totalValueLockedEthUntracked",
            "baseName": "total_value_locked_eth_untracked",
            "type": "string"
        },
        {
            "name": "owner",
            "baseName": "owner",
            "type": "string"
        },
        {
            "name": "vid",
            "baseName": "vid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return UniswapV3FactoryDTO.attributeTypeMap;
    }
}

