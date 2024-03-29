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

import * as models from './models';

/**
 * A type collecting global stats about this instance of Gnosis Protocol.
 */
export interface DexStatsDTO {
    entry_time?: string;

    recv_time?: string;

    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;

    /**
     * 
     */
    id?: string;

    /**
     * The total volume denominated in OWL (all sell amounts combined).
     */
    volume_in_owl?: string;

    /**
     * The total trader surplus in OWL.
     */
    utility_in_owl?: string;

    /**
     * The total amount of OWL burnt (equivalent to fees rewarded to solvers).
     */
    owl_burnt?: string;

    /**
     * The total number of settled batches.
     */
    settled_batch_count?: number;

    /**
     * The total number of settled trades.
     */
    settled_trade_count?: number;

    /**
     * The number of listed tokens.
     */
    listed_tokens?: number;

    /**
     * 
     */
    vid?: number;

}
