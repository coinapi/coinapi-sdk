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

import { RequestFile } from './models';

/**
* Cause of rejection.
*/
export enum RejectReason {
    Other = <any> 'OTHER',
    ExchangeUnreachable = <any> 'EXCHANGE_UNREACHABLE',
    ExchangeResponseTimeout = <any> 'EXCHANGE_RESPONSE_TIMEOUT',
    OrderIdNotFound = <any> 'ORDER_ID_NOT_FOUND',
    InvalidType = <any> 'INVALID_TYPE',
    MethodNotSupported = <any> 'METHOD_NOT_SUPPORTED',
    JsonError = <any> 'JSON_ERROR'
}