/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
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
 * The Position object.
 */
export interface PositionData {
    /**
     * Exchange symbol.
     */
    "symbol_id_exchange"?: string;
    /**
     * CoinAPI symbol.
     */
    "symbol_id_coinapi"?: string;
    /**
     * Calculated average price of all fills on this position.
     */
    "avg_entry_price"?: number;
    /**
     * The current position quantity.
     */
    "quantity"?: number;
    "side"?: models.OrdSide;
    /**
     * Unrealised profit or loss (PNL) of this position.
     */
    "unrealized_pnl"?: number;
    /**
     * Leverage for this position reported by the exchange.
     */
    "leverage"?: number;
    /**
     * Is cross margin mode enable for this position?
     */
    "cross_margin"?: boolean;
    /**
     * Liquidation price. If mark price will reach this value, the position will be liquidated.
     */
    "liquidation_price"?: number;
    "raw_data"?: object;
}

