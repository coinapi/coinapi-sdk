/**
 * OMS - REST API .
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from '../api';

export class PositionData {
    /**
    * Unique position ID
    */
    'id'?: string;
    /**
    * The contract for this position.
    */
    'symbolExchange'?: string;
    /**
    * The coinapi contract for this position.
    */
    'symbolCoinapi'?: string;
    'avgEntryPrice'?: number;
    /**
    * The current position amount in contracts.
    */
    'quantity'?: number;
    'isBuy'?: boolean;
    /**
    * Unrealised PNL is all the unrealised profit or loss coming from your portfolio\'s open positions.
    */
    'unrealisedPnL'?: number;
    /**
    * 1 / initMarginReq.
    */
    'leverage'?: number;
    /**
    * True/false depending on whether you set cross margin on this position.
    */
    'crossMargin'?: boolean;
    /**
    * Once markPrice reaches this price, this position will be liquidated.
    */
    'liquidationPrice'?: number;
    'rawData'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "symbolExchange",
            "baseName": "symbol_exchange",
            "type": "string"
        },
        {
            "name": "symbolCoinapi",
            "baseName": "symbol_coinapi",
            "type": "string"
        },
        {
            "name": "avgEntryPrice",
            "baseName": "avg_entry_price",
            "type": "number"
        },
        {
            "name": "quantity",
            "baseName": "quantity",
            "type": "number"
        },
        {
            "name": "isBuy",
            "baseName": "is_buy",
            "type": "boolean"
        },
        {
            "name": "unrealisedPnL",
            "baseName": "unrealised_pn_l",
            "type": "number"
        },
        {
            "name": "leverage",
            "baseName": "leverage",
            "type": "number"
        },
        {
            "name": "crossMargin",
            "baseName": "cross_margin",
            "type": "boolean"
        },
        {
            "name": "liquidationPrice",
            "baseName": "liquidation_price",
            "type": "number"
        },
        {
            "name": "rawData",
            "baseName": "raw_data",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return PositionData.attributeTypeMap;
    }
}

