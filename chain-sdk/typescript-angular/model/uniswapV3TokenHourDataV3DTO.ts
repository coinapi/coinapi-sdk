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


/**
 * Token data aggregated across all pairs that include token.
 */
export interface UniswapV3TokenHourDataV3DTO { 
    entry_time?: string;
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;
    /**
     * Token address concatendated with date.
     */
    id?: string | null;
    /**
     * Unix timestamp for start of hour.
     */
    period_start_unix?: number;
    /**
     * Pointer to token.
     */
    token?: string | null;
    /**
     * Volume in token units.
     */
    volume?: string | null;
    /**
     * Volume in derived USD.
     */
    volume_usd?: string | null;
    /**
     * Volume in USD even on pools with less reliable USD values.
     */
    untracked_volume_usd?: string | null;
    /**
     * Liquidity across all pools in token units.
     */
    total_value_locked?: string | null;
    /**
     * Liquidity across all pools in derived USD.
     */
    total_value_locked_usd?: string | null;
    /**
     * Price at end of period in USD.
     */
    price_usd?: string | null;
    /**
     * Fees in USD.
     */
    fees_usd?: string | null;
    /**
     * Opening price USD.
     */
    open?: string | null;
    /**
     * High price USD.
     */
    high?: string | null;
    /**
     * Low price USD.
     */
    low?: string | null;
    /**
     * Close price USD.
     */
    close?: string | null;
    /**
     * 
     */
    vid?: number;
}

