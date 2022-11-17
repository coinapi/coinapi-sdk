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
 * Information about a pool. Includes references to each token within the pool, volume information, liquidity information, and more. The pool entity mirrors the pool smart contract, and also contains aggregated information about use.
 */
export interface UniswapV3PoolDTO {
    entry_time?: string;

    recv_time?: string;

    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;

    /**
     * 
     */
    vid?: number;

    /**
     * Pool address.
     */
    id?: string;

    /**
     * Creation time.
     */
    created_at_timestamp?: string;

    /**
     * Reference to token0 as stored in pool contract.
     */
    token_0?: string;

    /**
     * Reference to token1 as stored in pool contract.
     */
    token_1?: string;

    fee_tier?: models.NumericsBigInteger;

    liquidity?: models.NumericsBigInteger;

    sqrt_price?: models.NumericsBigInteger;

    fee_growth_global_0x128?: models.NumericsBigInteger;

    fee_growth_global_1x128?: models.NumericsBigInteger;

    /**
     * Token0 per token1.
     */
    token_0_price?: string;

    /**
     * Token1 per token0.
     */
    token_1_price?: string;

    tick?: models.NumericsBigInteger;

    observation_index?: models.NumericsBigInteger;

    /**
     * All time token0 swapped.
     */
    volume_token_0?: string;

    /**
     * All time token1 swapped.
     */
    volume_token_1?: string;

    /**
     * All time USD swapped.
     */
    volume_usd?: string;

    /**
     * All time USD swapped, unfiltered for unreliable USD pools.
     */
    untracked_volume_usd?: string;

    /**
     * Fees in USD.
     */
    fees_usd?: string;

    tx_count?: models.NumericsBigInteger;

    /**
     * All time fees collected token0.
     */
    collected_fees_token_0?: string;

    /**
     * All time fees collected token1.
     */
    collected_fees_token_1?: string;

    /**
     * All time fees collected derived USD.
     */
    collected_fees_usd?: string;

    /**
     * Total token 0 across all ticks.
     */
    total_value_locked_token_0?: string;

    /**
     * 
     */
    total_value_locked_token_1?: string;

    /**
     * Total token 1 across all ticks.
     */
    total_value_locked_eth?: string;

    /**
     * Total value locked USD.
     */
    total_value_locked_usd?: string;

    /**
     * Total value locked derived ETH.
     */
    total_value_locked_usd_untracked?: string;

    /**
     * Liquidity providers count, used to detect new exchanges.
     */
    liquidity_provider_count?: string;

    evaluated_ask?: number;

}
