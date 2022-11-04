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
 * Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, and more.
 */
export interface UniswapV3MintV3DTO { 
    entry_time?: string;
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;
    /**
     * Transaction hash + \'#\' + index in mints Transaction array.
     */
    id?: string | null;
    /**
     * Which txn the mint was included in.
     */
    transaction?: string | null;
    /**
     * Time of transaction.
     */
    timestamp?: string | null;
    /**
     * Pool address.
     */
    pool?: string | null;
    /**
     * Reference to token0 as stored in pool contract.
     */
    token_0?: string | null;
    /**
     * Reference to token1 as stored in pool contract.
     */
    token_1?: string | null;
    /**
     * Owner of position where liquidity minted to.
     */
    owner?: string | null;
    /**
     * The address that minted the liquidity.
     */
    sender?: string | null;
    /**
     * Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
     */
    origin?: string | null;
    /**
     * Amount of liquidity minted.
     */
    amount?: string | null;
    /**
     * Amount of token 0 minted.
     */
    amount_0?: string | null;
    /**
     * Amount of token 1 minted.
     */
    amount_1?: string | null;
    /**
     * Derived amount based on available prices of tokens.
     */
    amount_usd?: string | null;
    /**
     * Lower tick of the position.
     */
    tick_lower?: string | null;
    /**
     * Upper tick of the position.
     */
    tick_upper?: string | null;
    /**
     * Order within the transaction.
     */
    log_index?: string | null;
    /**
     * 
     */
    vid?: number;
}

