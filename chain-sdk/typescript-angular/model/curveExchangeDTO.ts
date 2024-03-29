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
import { TransactionsETradeAggressiveSide } from './transactionsETradeAggressiveSide';


export interface CurveExchangeDTO { 
    entry_time?: string;
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;
    /**
     * 
     */
    id?: string | null;
    /**
     * 
     */
    pool?: string | null;
    /**
     * 
     */
    buyer?: string | null;
    /**
     * 
     */
    receiver?: string | null;
    /**
     * 
     */
    token_sold?: string | null;
    /**
     * 
     */
    token_bought?: string | null;
    /**
     * 
     */
    amount_sold?: string | null;
    /**
     * 
     */
    amount_bought?: string | null;
    /**
     * 
     */
    block?: string | null;
    /**
     * 
     */
    timestamp?: string | null;
    /**
     * 
     */
    transaction?: string | null;
    /**
     * 
     */
    vid?: number;
    readonly evaluated_price?: number;
    readonly evaluated_amount?: number;
    evaluated_aggressor?: TransactionsETradeAggressiveSide;
    readonly pool_id?: string | null;
    readonly transaction_id?: string | null;
}
export namespace CurveExchangeDTO {
}


