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
import { NumericsBigInteger } from './numericsBigInteger';


/**
 * Ticks are the boundaries between discrete areas in price space.
 */
export interface UniswapV3TickDTO { 
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
     * Identifier, format: <pool address>#<tick index>
     */
    id?: string | null;
    /**
     * Pool address.
     */
    pool_address?: string | null;
    tick_idx?: NumericsBigInteger;
    /**
     * Pool address.
     */
    pool?: string | null;
    liquidity_gross?: NumericsBigInteger;
    liquidity_net?: NumericsBigInteger;
    /**
     * Calculated price of token0 of tick within this pool - constant.
     */
    price_0?: string | null;
    /**
     * Calculated price of token1 of tick within this pool - constant.
     */
    price_1?: string | null;
    /**
     * Lifetime volume of token0 with this tick in range.
     */
    volume_token_0?: string | null;
    /**
     * Lifetime volume of token1 with this tick in range.
     */
    volume_token_1?: string | null;
    /**
     * Lifetime volume in derived USD with this tick in range.
     */
    volume_usd?: string | null;
    /**
     * Lifetime volume in untracked USD with this tick in range.
     */
    untracked_volume_usd?: string | null;
    /**
     * Fees in USD.
     */
    fees_usd?: string | null;
    /**
     * All time collected fees in token0.
     */
    collected_fees_token_0?: string | null;
    /**
     * All time collected fees in token1.
     */
    collected_fees_token_1?: string | null;
    /**
     * All time collected fees in USD.
     */
    collected_fees_usd?: string | null;
    /**
     * Created time.
     */
    created_at_timestamp?: string;
    liquidity_provider_count?: NumericsBigInteger;
    fee_growth_outside_0x128?: NumericsBigInteger;
    fee_growth_outside_1x128?: NumericsBigInteger;
}

