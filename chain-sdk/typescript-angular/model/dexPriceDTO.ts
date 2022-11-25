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
 * Token price in conjuction with batch id.
 */
export interface DexPriceDTO { 
    entry_time?: string;
    recv_time?: string;
    /**
     * Number of block in which entity was recorded.
     */
    block_number?: number;
    /**
     * Identifier, format: <token id>-<batch id>.
     */
    id?: string | null;
    /**
     * Token identifier.
     */
    token?: string | null;
    /**
     * Batch identifier.
     */
    batch_id?: string | null;
    /**
     * Price enumerator in OWL (derivative of the GNO token).
     */
    price_in_owl_numerator?: string | null;
    /**
     * Price denominator in OWL (derivative of the GNO token).
     */
    price_in_owl_denominator?: string | null;
    /**
     * Volume.
     */
    volume?: string | null;
    /**
     * Create epoch.
     */
    create_epoch?: string | null;
    /**
     * Transaction hash.
     */
    tx_hash?: string | null;
    /**
     * 
     */
    vid?: number;
}

