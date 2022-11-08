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
 * Transaction entities are created for each Ethereum transaction that contains an interaction within Uniswap contracts. Each transaction contains 3 arrays, and at least one of these arrays has a length of 1.
 */
export interface UniswapV2TransactionV2DTO {
    entry_time?: string;

    recv_time?: string;

    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;

    /**
     * Ethereum transaction hash.
     */
    id?: string;

    /**
     * Timestamp.
     */
    timestamp?: string;

    /**
     * Array of Mint events within the transaction, 0 or greater.
     */
    mints?: Array<string>;

    /**
     * Array of Burn events within transaction, 0 or greater.
     */
    burns?: Array<string>;

    /**
     * Array of Swap events within transaction, 0 or greater.
     */
    swaps?: Array<string>;

    /**
     * 
     */
    vid?: number;

}
