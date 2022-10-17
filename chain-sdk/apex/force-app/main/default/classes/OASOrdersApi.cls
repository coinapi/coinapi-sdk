/*
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol.\n<br/>\nThis API is also available in the Postman application: <a href="https://postman.coinapi.io/" target="_blank">https://postman.coinapi.io/</a>      \n<br/><br/>\nImplemented Standards:\n\n  * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)\n  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)\n  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)\n   \n### Endpoints\n<table>\n  <thead>\n    <tr>\n      <th>Deployment method</th>\n      <th>Environment</th>\n      <th>Url</th>\n    </tr>\n  </thead>\n  <tbody>\n    <tr>\n      <td>Managed Cloud</td>\n      <td>Production</td>\n      <td>Use <a href="#ems-docs-sh">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>\n    </tr>\n    <tr>\n      <td>Managed Cloud</td>\n      <td>Sandbox</td>\n      <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>\n    </tr>\n    <tr>\n      <td>Self Hosted</td>\n      <td>Production</td>\n      <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>\n    </tr>\n    <tr>\n      <td>Self Hosted</td>\n      <td>Sandbox</td>\n      <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>\n    </tr>\n  </tbody>\n</table>\n\n### Authentication\nIf the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls. \n<br/><br/>\nIf the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:\n\n 1. Custom authorization header named `X-CoinAPI-Key` with the API Key\n 2. Query string parameter named `apikey` with the API Key\n 3. <a href="#certificate">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.\n\n#### Custom authorization header\nYou can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.\nAssuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like:\n<br/><br/>\n`X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`\n<aside class="success">This method is recommended by us and you should use it in production environments.</aside>\n#### Query string authorization parameter\nYou can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.\nAssuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: \n<br/><br/>\n`GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY`\n<aside class="notice">Query string method may be more practical for development activities.</aside>\n
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

public class OASOrdersApi {
    OASClient client;

    public OASOrdersApi(OASClient client) {
        this.client = client;
    }

    public OASOrdersApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * Cancel all orders request
     * This request cancels all open orders on single specified exchange.
     * @param oaSOrderCancelAllRequest OrderCancelAllRequest object. (required)
     * @return OASMessageReject
     * @throws OAS.ApiException if fails to make API call
     */
    public OASMessageReject v1OrdersCancelAllPost(Map<String, Object> params) {
        client.assertNotNull(params.get('oaSOrderCancelAllRequest'), 'oaSOrderCancelAllRequest');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASMessageReject) client.invoke(
            'POST', '/v1/orders/cancel/all',
            (OASOrderCancelAllRequest) params.get('oaSOrderCancelAllRequest'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json', 'appliction/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASMessageReject.class
        );
    }
    /**
     * Cancel order request
     * Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
     * @param oaSOrderCancelSingleRequest OrderCancelSingleRequest object. (required)
     * @return OASOrderExecutionReport
     * @throws OAS.ApiException if fails to make API call
     */
    public OASOrderExecutionReport v1OrdersCancelPost(Map<String, Object> params) {
        client.assertNotNull(params.get('oaSOrderCancelSingleRequest'), 'oaSOrderCancelSingleRequest');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASOrderExecutionReport) client.invoke(
            'POST', '/v1/orders/cancel',
            (OASOrderCancelSingleRequest) params.get('oaSOrderCancelSingleRequest'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json', 'appliction/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASOrderExecutionReport.class
        );
    }
    /**
     * Get open orders
     * Get last execution reports for open orders across all or single exchange.
     * @param exchangeId Filter the open orders to the specific exchange. (optional)
     * @return List<OASOrderExecutionReport>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASOrderExecutionReport> v1OrdersGet(Map<String, Object> params) {
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('exchange_id', (String) params.get('exchangeId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASOrderExecutionReport>) client.invoke(
            'GET', '/v1/orders', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json', 'appliction/json' },
            new List<String>(),
            new List<String>(),
            List<OASOrderExecutionReport>.class
        );
    }
    /**
     * History of order changes
     * Based on the date range, all changes registered in the orderbook.
     * @param timeStart Start date (required)
     * @param timeEnd End date (required)
     * @return List<OASOrderHistory>
     * @throws OAS.ApiException if fails to make API call
     */
    public List<OASOrderHistory> v1OrdersHistoryGet(Map<String, Object> params) {
        client.assertNotNull(params.get('timeStart'), 'timeStart');
        client.assertNotNull(params.get('timeEnd'), 'timeEnd');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('time_start', (String) params.get('timeStart')));
        query.addAll(client.makeParam('time_end', (String) params.get('timeEnd')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (List<OASOrderHistory>) client.invoke(
            'GET', '/v1/orders/history', '',
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            List<OASOrderHistory>.class
        );
    }
    /**
     * Send new order
     * This request creating new order for the specific exchange.
     * @param oaSOrderNewSingleRequest OrderNewSingleRequest object. (required)
     * @return OASOrderExecutionReport
     * @throws OAS.ApiException if fails to make API call
     */
    public OASOrderExecutionReport v1OrdersPost(Map<String, Object> params) {
        client.assertNotNull(params.get('oaSOrderNewSingleRequest'), 'oaSOrderNewSingleRequest');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASOrderExecutionReport) client.invoke(
            'POST', '/v1/orders',
            (OASOrderNewSingleRequest) params.get('oaSOrderNewSingleRequest'),
            query, form,
            new Map<String, Object>(),
            new Map<String, Object>(),
            new List<String>{ 'application/json', 'appliction/json' },
            new List<String>{ 'application/json' },
            new List<String>(),
            OASOrderExecutionReport.class
        );
    }
    /**
     * Get order execution report
     * Get the last order execution report for the specified order. The requested order does not need to be active or opened.
     * @param clientOrderId The unique identifier of the order assigned by the client. (required)
     * @return OASOrderExecutionReport
     * @throws OAS.ApiException if fails to make API call
     */
    public OASOrderExecutionReport v1OrdersStatusClientOrderIdGet(Map<String, Object> params) {
        client.assertNotNull(params.get('clientOrderId'), 'clientOrderId');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASOrderExecutionReport) client.invoke(
            'GET', '/v1/orders/status/{client_order_id}', '',
            query, form,
            new Map<String, Object>{
                'client_order_id' => (String) params.get('clientOrderId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String>(),
            OASOrderExecutionReport.class
        );
    }
}