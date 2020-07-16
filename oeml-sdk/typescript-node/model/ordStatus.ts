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

import { RequestFile } from '../api';

/**
* Order statuses and the lifecycle are documented in the separate section: <a href=\"#oeml-order-lifecycle\">OEML / Starter Guide / Order Lifecycle</a> 
*/
export enum OrdStatus {
    RECEIVED = <any> 'RECEIVED',
    ROUTING = <any> 'ROUTING',
    ROUTED = <any> 'ROUTED',
    NEW = <any> 'NEW',
    PENDINGCANCEL = <any> 'PENDING_CANCEL',
    PARTIALLYFILLED = <any> 'PARTIALLY_FILLED',
    FILLED = <any> 'FILLED',
    CANCELED = <any> 'CANCELED',
    REJECTED = <any> 'REJECTED'
}
