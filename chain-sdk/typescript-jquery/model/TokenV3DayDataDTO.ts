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

import * as models from './models';

/**
 * Token data aggregated across all pairs that include token.
 */
export interface TokenV3DayDataDTO {
    entry_time?: string;

    recv_time?: string;

    /**
     * 
     */
    block_number?: number;

    /**
     * 
     */
    vid?: number;

    /**
     * token address concatendated with date
     */
    id?: string;

    /**
     * timestamp rounded to current day by dividing by 86400
     */
    date?: number;

    /**
     * pointer to token
     */
    token?: string;

    /**
     * volume in token units
     */
    volume?: string;

    /**
     * volume in derived USD
     */
    volume_usd?: string;

    /**
     * volume in USD even on pools with less reliable USD values
     */
    untracked_volume_usd?: string;

    /**
     * liquidity across all pools in token units
     */
    total_value_locked?: string;

    /**
     * liquidity across all pools in derived USD
     */
    total_value_locked_usd?: string;

    /**
     * price at end of period in USD
     */
    price_usd?: string;

    /**
     * fees in USD
     */
    fees_usd?: string;

    /**
     * opening price USD
     */
    open?: string;

    /**
     * high price USD
     */
    high?: string;

    /**
     * low price USD
     */
    low?: string;

    /**
     * close price USD
     */
    close?: string;

}
