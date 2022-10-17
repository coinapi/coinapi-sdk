// tslint:disable
/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    MessageError,
    MessageReject,
    OrderCancelAllRequest,
    OrderCancelSingleRequest,
    OrderExecutionReport,
    OrderHistory,
    OrderNewSingleRequest,
    ValidationError,
} from '../models';

export interface V1OrdersCancelAllPostRequest {
    orderCancelAllRequest: OrderCancelAllRequest;
}

export interface V1OrdersCancelPostRequest {
    orderCancelSingleRequest: OrderCancelSingleRequest;
}

export interface V1OrdersGetRequest {
    exchangeId?: string;
}

export interface V1OrdersHistoryGetRequest {
    timeStart: string;
    timeEnd: string;
}

export interface V1OrdersPostRequest {
    orderNewSingleRequest: OrderNewSingleRequest;
}

export interface V1OrdersStatusClientOrderIdGetRequest {
    clientOrderId: string;
}

/**
 * no description
 */
export class OrdersApi extends BaseAPI {

    /**
     * This request cancels all open orders on single specified exchange.
     * Cancel all orders request
     */
    v1OrdersCancelAllPost({ orderCancelAllRequest }: V1OrdersCancelAllPostRequest): Observable<MessageReject>
    v1OrdersCancelAllPost({ orderCancelAllRequest }: V1OrdersCancelAllPostRequest, opts?: OperationOpts): Observable<AjaxResponse<MessageReject>>
    v1OrdersCancelAllPost({ orderCancelAllRequest }: V1OrdersCancelAllPostRequest, opts?: OperationOpts): Observable<MessageReject | AjaxResponse<MessageReject>> {
        throwIfNullOrUndefined(orderCancelAllRequest, 'orderCancelAllRequest', 'v1OrdersCancelAllPost');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<MessageReject>({
            url: '/v1/orders/cancel/all',
            method: 'POST',
            headers,
            body: orderCancelAllRequest,
        }, opts?.responseOpts);
    };

    /**
     * Request cancel for an existing order. The order can be canceled using the `client_order_id` or `exchange_order_id`.
     * Cancel order request
     */
    v1OrdersCancelPost({ orderCancelSingleRequest }: V1OrdersCancelPostRequest): Observable<OrderExecutionReport>
    v1OrdersCancelPost({ orderCancelSingleRequest }: V1OrdersCancelPostRequest, opts?: OperationOpts): Observable<AjaxResponse<OrderExecutionReport>>
    v1OrdersCancelPost({ orderCancelSingleRequest }: V1OrdersCancelPostRequest, opts?: OperationOpts): Observable<OrderExecutionReport | AjaxResponse<OrderExecutionReport>> {
        throwIfNullOrUndefined(orderCancelSingleRequest, 'orderCancelSingleRequest', 'v1OrdersCancelPost');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<OrderExecutionReport>({
            url: '/v1/orders/cancel',
            method: 'POST',
            headers,
            body: orderCancelSingleRequest,
        }, opts?.responseOpts);
    };

    /**
     * Get last execution reports for open orders across all or single exchange.
     * Get open orders
     */
    v1OrdersGet({ exchangeId }: V1OrdersGetRequest): Observable<Array<OrderExecutionReport>>
    v1OrdersGet({ exchangeId }: V1OrdersGetRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<OrderExecutionReport>>>
    v1OrdersGet({ exchangeId }: V1OrdersGetRequest, opts?: OperationOpts): Observable<Array<OrderExecutionReport> | AjaxResponse<Array<OrderExecutionReport>>> {

        const query: HttpQuery = {};

        if (exchangeId != null) { query['exchange_id'] = exchangeId; }

        return this.request<Array<OrderExecutionReport>>({
            url: '/v1/orders',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * Based on the date range, all changes registered in the orderbook.
     * History of order changes
     */
    v1OrdersHistoryGet({ timeStart, timeEnd }: V1OrdersHistoryGetRequest): Observable<Array<OrderHistory>>
    v1OrdersHistoryGet({ timeStart, timeEnd }: V1OrdersHistoryGetRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<OrderHistory>>>
    v1OrdersHistoryGet({ timeStart, timeEnd }: V1OrdersHistoryGetRequest, opts?: OperationOpts): Observable<Array<OrderHistory> | AjaxResponse<Array<OrderHistory>>> {
        throwIfNullOrUndefined(timeStart, 'timeStart', 'v1OrdersHistoryGet');
        throwIfNullOrUndefined(timeEnd, 'timeEnd', 'v1OrdersHistoryGet');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'time_start': timeStart,
            'time_end': timeEnd,
        };

        return this.request<Array<OrderHistory>>({
            url: '/v1/orders/history',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * This request creating new order for the specific exchange.
     * Send new order
     */
    v1OrdersPost({ orderNewSingleRequest }: V1OrdersPostRequest): Observable<OrderExecutionReport>
    v1OrdersPost({ orderNewSingleRequest }: V1OrdersPostRequest, opts?: OperationOpts): Observable<AjaxResponse<OrderExecutionReport>>
    v1OrdersPost({ orderNewSingleRequest }: V1OrdersPostRequest, opts?: OperationOpts): Observable<OrderExecutionReport | AjaxResponse<OrderExecutionReport>> {
        throwIfNullOrUndefined(orderNewSingleRequest, 'orderNewSingleRequest', 'v1OrdersPost');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<OrderExecutionReport>({
            url: '/v1/orders',
            method: 'POST',
            headers,
            body: orderNewSingleRequest,
        }, opts?.responseOpts);
    };

    /**
     * Get the last order execution report for the specified order. The requested order does not need to be active or opened.
     * Get order execution report
     */
    v1OrdersStatusClientOrderIdGet({ clientOrderId }: V1OrdersStatusClientOrderIdGetRequest): Observable<OrderExecutionReport>
    v1OrdersStatusClientOrderIdGet({ clientOrderId }: V1OrdersStatusClientOrderIdGetRequest, opts?: OperationOpts): Observable<AjaxResponse<OrderExecutionReport>>
    v1OrdersStatusClientOrderIdGet({ clientOrderId }: V1OrdersStatusClientOrderIdGetRequest, opts?: OperationOpts): Observable<OrderExecutionReport | AjaxResponse<OrderExecutionReport>> {
        throwIfNullOrUndefined(clientOrderId, 'clientOrderId', 'v1OrdersStatusClientOrderIdGet');

        return this.request<OrderExecutionReport>({
            url: '/v1/orders/status/{client_order_id}'.replace('{client_order_id}', encodeURI(clientOrderId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}