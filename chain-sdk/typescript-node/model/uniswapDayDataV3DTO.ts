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
import { BigInteger } from './bigInteger';

export class UniswapDayDataV3DTO {
    'entryTime'?: Date;
    'recvTime'?: Date;
    'blockNumber'?: number;
    'vid'?: number;
    'id'?: string | null;
    'date'?: number;
    'volumeEth'?: string | null;
    'volumeUsd'?: string | null;
    'volumeUsdUntracked'?: string | null;
    'feesUsd'?: string | null;
    'txCount'?: BigInteger;
    'tvlUsd'?: string | null;

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
            "name": "date",
            "baseName": "date",
            "type": "number"
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
            "name": "volumeUsdUntracked",
            "baseName": "volume_usd_untracked",
            "type": "string"
        },
        {
            "name": "feesUsd",
            "baseName": "fees_usd",
            "type": "string"
        },
        {
            "name": "txCount",
            "baseName": "tx_count",
            "type": "BigInteger"
        },
        {
            "name": "tvlUsd",
            "baseName": "tvl_usd",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return UniswapDayDataV3DTO.attributeTypeMap;
    }
}
