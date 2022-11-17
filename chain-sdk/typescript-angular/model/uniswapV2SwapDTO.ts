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
import { TransactionsETradeAggressiveSide } from './transactionsETradeAggressiveSide';
import { NumericsBigInteger } from './numericsBigInteger';


/**
 * Swap are created for each token swap within a pair.
 */
export interface UniswapV2SwapDTO { 
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
     * Transaction hash plus index in Transaction swap array.
     */
    id?: string | null;
    /**
     * Reference to transaction swap was included in.
     */
    transaction?: string | null;
    /**
     * Timestamp of swap, used for sorted lookups.
     */
    timestamp?: string;
    /**
     * Reference to pair.
     */
    pair?: string | null;
    /**
     * Address that initiated the swap.
     */
    sender?: string | null;
    /**
     * The EOA (Externally Owned Account) that initiated the transaction.
     */
    from?: string | null;
    /**
     * Amount of token0 sold.
     */
    amount_0_in?: string | null;
    /**
     * Amount of token1 sold.
     */
    amount_1_in?: string | null;
    /**
     * Amount of token0 received.
     */
    amount_0_out?: string | null;
    /**
     * Amount of token1 received.
     */
    amount_1_out?: string | null;
    /**
     * Recipient of output tokens.
     */
    to?: string | null;
    log_index?: NumericsBigInteger;
    /**
     * Derived amount of tokens sold in USD.
     */
    amount_usd?: string | null;
    readonly evaluated_price?: number;
    readonly evaluated_amount?: number;
    evaluated_aggressor?: TransactionsETradeAggressiveSide;
    readonly pool_id?: string | null;
    readonly transaction_id?: string | null;
}

