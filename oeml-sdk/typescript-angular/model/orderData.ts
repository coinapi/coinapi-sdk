/**
 * OEML - REST API
 * Lorem2 Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { OrderStatus } from './orderStatus';
import { TimeInForce } from './timeInForce';


export interface OrderData { 
    /**
     * Exchange name
     */
    exchange_id?: string;
    /**
     * Client unique identifier for the trade.
     */
    id?: string;
    /**
     * Hash client id
     */
    client_order_id_format_exchange?: string;
    /**
     * Exchange order id
     */
    exchange_order_id?: string;
    /**
     * Amount open
     */
    amount_open?: number;
    /**
     * Amount filled
     */
    amount_filled?: number;
    status?: OrderStatus;
    /**
     * History of order status changes
     */
    time_order?: Array<Array<string>>;
    /**
     * Error message
     */
    error_message?: string;
    /**
     * Client unique identifier for the trade.
     */
    client_order_id?: string;
    /**
     * The symbol of the order.
     */
    symbol_exchange?: string;
    /**
     * The CoinAPI symbol of the order.
     */
    symbol_coinapi?: string;
    /**
     * Quoted decimal amount to purchase.
     */
    amount_order?: number;
    /**
     * Quoted decimal amount to spend per unit.
     */
    price?: number;
    /**
     * Buy or Sell
     */
    side?: OrderData.SideEnum;
    /**
     * The order type.
     */
    order_type?: OrderData.OrderTypeEnum;
    time_in_force?: TimeInForce;
    /**
     * Required for orders with time_in_force = GOOD_TILL_TIME_EXCHANGE, GOOD_TILL_TIME_OMS
     */
    expire_time?: string;
    /**
     * TODO: description exec inst  | Parameter | Description | |-----------|--------| | `MAKER_OR_CANCEL` | Rests on the continuous order book at a specified price. If any quantity can be filled immediately, the entire order is canceled. | ##### Exec inst options  | Exchange | MAKER_OR_CANCEL | | --- | --- | | BINANCE | X | | BITFINEX | X | | BITMEX | X | | BLOCKCHAINEXCHANGE | X | | BITSTAMP |  | | COINBASE | X | | GEMINI | X | | KRAKEN | X | | POLONIEX | X | | HITBTC |  | | KRAKENFTS | X | 
     */
    exec_inst?: Array<OrderData.ExecInstEnum>;
}
export namespace OrderData {
    export type SideEnum = 'BUY' | 'SELL';
    export const SideEnum = {
        BUY: 'BUY' as SideEnum,
        SELL: 'SELL' as SideEnum
    };
    export type OrderTypeEnum = 'LIMIT';
    export const OrderTypeEnum = {
        LIMIT: 'LIMIT' as OrderTypeEnum
    };
    export type ExecInstEnum = 'MAKER_OR_CANCEL';
    export const ExecInstEnum = {
        MAKERORCANCEL: 'MAKER_OR_CANCEL' as ExecInstEnum
    };
}


