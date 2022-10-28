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
     * 
     */
    id?: string | null;
    /**
     * 
     */
    date?: number;
    /**
     * 
     */
    token?: string | null;
    /**
     * 
     */
    volume?: string | null;
    /**
     * 
     */
    volume_usd?: string | null;
    /**
     * 
     */
    untracked_volume_usd?: string | null;
    /**
     * 
     */
    total_value_locked?: string | null;
    /**
     * 
     */
    total_value_locked_usd?: string | null;
    /**
     * 
     */
    price_usd?: string | null;
    /**
     * 
     */
    fees_usd?: string | null;
    /**
     * 
     */
    open?: string | null;
    /**
     * 
     */
    high?: string | null;
    /**
     * 
     */
    low?: string | null;
    /**
     * 
     */
    close?: string | null;
}

