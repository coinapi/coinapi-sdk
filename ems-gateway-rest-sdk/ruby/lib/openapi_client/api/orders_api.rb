=begin
#EMS - REST API

#This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'cgi'

module OpenapiClient
  class OrdersApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Cancel all orders request
    # This request cancels all open orders on single specified exchange.
    # @param order_cancel_all_request [OrderCancelAllRequest] OrderCancelAllRequest object.
    # @param [Hash] opts the optional parameters
    # @return [MessageReject]
    def v1_orders_cancel_all_post(order_cancel_all_request, opts = {})
      data, _status_code, _headers = v1_orders_cancel_all_post_with_http_info(order_cancel_all_request, opts)
      data
    end

    # Cancel all orders request
    # This request cancels all open orders on single specified exchange.
    # @param order_cancel_all_request [OrderCancelAllRequest] OrderCancelAllRequest object.
    # @param [Hash] opts the optional parameters
    # @return [Array<(MessageReject, Integer, Hash)>] MessageReject data, response status code and response headers
    def v1_orders_cancel_all_post_with_http_info(order_cancel_all_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrdersApi.v1_orders_cancel_all_post ...'
      end
      # verify the required parameter 'order_cancel_all_request' is set
      if @api_client.config.client_side_validation && order_cancel_all_request.nil?
        fail ArgumentError, "Missing the required parameter 'order_cancel_all_request' when calling OrdersApi.v1_orders_cancel_all_post"
      end
      # resource path
      local_var_path = '/v1/orders/cancel/all'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'appliction/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(order_cancel_all_request)

      # return_type
      return_type = opts[:debug_return_type] || 'MessageReject'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"OrdersApi.v1_orders_cancel_all_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrdersApi#v1_orders_cancel_all_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Cancel order request
    # Request cancel for an existing order. The order can be canceled using the `client_order_id` or `exchange_order_id`.
    # @param order_cancel_single_request [OrderCancelSingleRequest] OrderCancelSingleRequest object.
    # @param [Hash] opts the optional parameters
    # @return [OrderExecutionReport]
    def v1_orders_cancel_post(order_cancel_single_request, opts = {})
      data, _status_code, _headers = v1_orders_cancel_post_with_http_info(order_cancel_single_request, opts)
      data
    end

    # Cancel order request
    # Request cancel for an existing order. The order can be canceled using the &#x60;client_order_id&#x60; or &#x60;exchange_order_id&#x60;.
    # @param order_cancel_single_request [OrderCancelSingleRequest] OrderCancelSingleRequest object.
    # @param [Hash] opts the optional parameters
    # @return [Array<(OrderExecutionReport, Integer, Hash)>] OrderExecutionReport data, response status code and response headers
    def v1_orders_cancel_post_with_http_info(order_cancel_single_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrdersApi.v1_orders_cancel_post ...'
      end
      # verify the required parameter 'order_cancel_single_request' is set
      if @api_client.config.client_side_validation && order_cancel_single_request.nil?
        fail ArgumentError, "Missing the required parameter 'order_cancel_single_request' when calling OrdersApi.v1_orders_cancel_post"
      end
      # resource path
      local_var_path = '/v1/orders/cancel'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'appliction/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(order_cancel_single_request)

      # return_type
      return_type = opts[:debug_return_type] || 'OrderExecutionReport'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"OrdersApi.v1_orders_cancel_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrdersApi#v1_orders_cancel_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get open orders
    # Get last execution reports for open orders across all or single exchange.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :exchange_id Filter the open orders to the specific exchange.
    # @return [Array<OrderExecutionReport>]
    def v1_orders_get(opts = {})
      data, _status_code, _headers = v1_orders_get_with_http_info(opts)
      data
    end

    # Get open orders
    # Get last execution reports for open orders across all or single exchange.
    # @param [Hash] opts the optional parameters
    # @option opts [String] :exchange_id Filter the open orders to the specific exchange.
    # @return [Array<(Array<OrderExecutionReport>, Integer, Hash)>] Array<OrderExecutionReport> data, response status code and response headers
    def v1_orders_get_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrdersApi.v1_orders_get ...'
      end
      # resource path
      local_var_path = '/v1/orders'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'exchange_id'] = opts[:'exchange_id'] if !opts[:'exchange_id'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'appliction/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Array<OrderExecutionReport>'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"OrdersApi.v1_orders_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrdersApi#v1_orders_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # History of order changes
    # Based on the date range, all changes registered in the orderbook.
    # @param time_start [String] Start date
    # @param time_end [String] End date
    # @param [Hash] opts the optional parameters
    # @return [Array<OrderHistory>]
    def v1_orders_history_get(time_start, time_end, opts = {})
      data, _status_code, _headers = v1_orders_history_get_with_http_info(time_start, time_end, opts)
      data
    end

    # History of order changes
    # Based on the date range, all changes registered in the orderbook.
    # @param time_start [String] Start date
    # @param time_end [String] End date
    # @param [Hash] opts the optional parameters
    # @return [Array<(Array<OrderHistory>, Integer, Hash)>] Array<OrderHistory> data, response status code and response headers
    def v1_orders_history_get_with_http_info(time_start, time_end, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrdersApi.v1_orders_history_get ...'
      end
      # verify the required parameter 'time_start' is set
      if @api_client.config.client_side_validation && time_start.nil?
        fail ArgumentError, "Missing the required parameter 'time_start' when calling OrdersApi.v1_orders_history_get"
      end
      # verify the required parameter 'time_end' is set
      if @api_client.config.client_side_validation && time_end.nil?
        fail ArgumentError, "Missing the required parameter 'time_end' when calling OrdersApi.v1_orders_history_get"
      end
      # resource path
      local_var_path = '/v1/orders/history'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'time_start'] = time_start
      query_params[:'time_end'] = time_end

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Array<OrderHistory>'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"OrdersApi.v1_orders_history_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrdersApi#v1_orders_history_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Send new order
    # This request creating new order for the specific exchange.
    # @param order_new_single_request [OrderNewSingleRequest] OrderNewSingleRequest object.
    # @param [Hash] opts the optional parameters
    # @return [OrderExecutionReport]
    def v1_orders_post(order_new_single_request, opts = {})
      data, _status_code, _headers = v1_orders_post_with_http_info(order_new_single_request, opts)
      data
    end

    # Send new order
    # This request creating new order for the specific exchange.
    # @param order_new_single_request [OrderNewSingleRequest] OrderNewSingleRequest object.
    # @param [Hash] opts the optional parameters
    # @return [Array<(OrderExecutionReport, Integer, Hash)>] OrderExecutionReport data, response status code and response headers
    def v1_orders_post_with_http_info(order_new_single_request, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrdersApi.v1_orders_post ...'
      end
      # verify the required parameter 'order_new_single_request' is set
      if @api_client.config.client_side_validation && order_new_single_request.nil?
        fail ArgumentError, "Missing the required parameter 'order_new_single_request' when calling OrdersApi.v1_orders_post"
      end
      # resource path
      local_var_path = '/v1/orders'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json', 'appliction/json'])
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(order_new_single_request)

      # return_type
      return_type = opts[:debug_return_type] || 'OrderExecutionReport'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"OrdersApi.v1_orders_post",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrdersApi#v1_orders_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get order execution report
    # Get the last order execution report for the specified order. The requested order does not need to be active or opened.
    # @param client_order_id [String] The unique identifier of the order assigned by the client.
    # @param [Hash] opts the optional parameters
    # @return [OrderExecutionReport]
    def v1_orders_status_client_order_id_get(client_order_id, opts = {})
      data, _status_code, _headers = v1_orders_status_client_order_id_get_with_http_info(client_order_id, opts)
      data
    end

    # Get order execution report
    # Get the last order execution report for the specified order. The requested order does not need to be active or opened.
    # @param client_order_id [String] The unique identifier of the order assigned by the client.
    # @param [Hash] opts the optional parameters
    # @return [Array<(OrderExecutionReport, Integer, Hash)>] OrderExecutionReport data, response status code and response headers
    def v1_orders_status_client_order_id_get_with_http_info(client_order_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: OrdersApi.v1_orders_status_client_order_id_get ...'
      end
      # verify the required parameter 'client_order_id' is set
      if @api_client.config.client_side_validation && client_order_id.nil?
        fail ArgumentError, "Missing the required parameter 'client_order_id' when calling OrdersApi.v1_orders_status_client_order_id_get"
      end
      # resource path
      local_var_path = '/v1/orders/status/{client_order_id}'.sub('{' + 'client_order_id' + '}', CGI.escape(client_order_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'OrderExecutionReport'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"OrdersApi.v1_orders_status_client_order_id_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: OrdersApi#v1_orders_status_client_order_id_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
