// tslint:disable
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

/**
 * Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned LP tokens, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
 * @export
 * @interface SushiswapBurnDTO
 */
export interface SushiswapBurnDTO {
    /**
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    entry_time?: string;
    /**
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     * @type {number}
     * @memberof SushiswapBurnDTO
     */
    block_number?: number;
    /**
     * Identifier, format: <transaction id>:<transaction.burns.length>.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    id?: string | null;
    /**
     * Reference to the transaction Burn was included in.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    transaction?: string | null;
    /**
     * Timestamp of Burn, used to sort recent liquidity removals.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    timestamp?: string | null;
    /**
     * Reference to pair.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    pair?: string | null;
    /**
     * Amount of liquidity tokens burned.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    liquidity?: string | null;
    /**
     * Address that initiated the liquidity removal.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    sender?: string | null;
    /**
     * Amount of token0 removed.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    amount_0?: string | null;
    /**
     * Amount of token1 removed.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    amount_1?: string | null;
    /**
     * Recipient of tokens.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    to?: string | null;
    /**
     * Index in the transaction event was emitted.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    log_index?: string | null;
    /**
     * Derived amount based on available prices of tokens.
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    amount_usd?: string | null;
    /**
     * 
     * @type {boolean}
     * @memberof SushiswapBurnDTO
     */
    complete?: boolean;
    /**
     * Address of fee recipient (if fee is on).
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    fee_to?: string | null;
    /**
     * Amount of tokens sent to fee recipient (if fee is on).
     * @type {string}
     * @memberof SushiswapBurnDTO
     */
    fee_liquidity?: string | null;
    /**
     * 
     * @type {number}
     * @memberof SushiswapBurnDTO
     */
    vid?: number;
}
