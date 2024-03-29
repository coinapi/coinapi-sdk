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

export interface UniswapV3PositionSnapshotDTO {
    entry_time?: string;

    recv_time?: string;

    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;

    /**
     * NFT token identifier, format: (NFT token id)#(block number).
     */
    id?: string;

    /**
     * Owner of the NFT.
     */
    owner?: string;

    /**
     * Pool the position is within.
     */
    pool?: string;

    /**
     * Position of which the snap was taken of.
     */
    position?: string;

    /**
     * Timestamp of block in which the snap was created.
     */
    timestamp?: string;

    /**
     * Total position liquidity.
     */
    liquidity?: string;

    /**
     * Amount of token 0 ever deposited to position.
     */
    deposited_token_0?: string;

    /**
     * Amount of token 1 ever deposited to position.
     */
    deposited_token_1?: string;

    /**
     * Amount of token 0 ever withdrawn from position (without fees).
     */
    withdrawn_token_0?: string;

    /**
     * Amount of token 1 ever withdrawn from position (without fees).
     */
    withdrawn_token_1?: string;

    /**
     * All time collected fees in token0.
     */
    collected_fees_token_0?: string;

    /**
     * All time collected fees in token1.
     */
    collected_fees_token_1?: string;

    /**
     * Transaction in which the snapshot was initialized.
     */
    transaction?: string;

    /**
     * Variable needed for fee computation.
     */
    fee_growth_inside_0_last_x128?: string;

    /**
     * Variable needed for fee computation.
     */
    fee_growth_inside_1_last_x128?: string;

    /**
     * 
     */
    vid?: number;

}
