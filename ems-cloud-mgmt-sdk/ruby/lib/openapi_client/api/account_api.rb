=begin
#EMS - Managed Cloud REST API

#This section will provide necessary information about the `CoinAPI EMS Managed Cloud REST API` protocol.  <br/><br/> This API is used to manage the overall deployment of **Execution Management System API** (`EMS API`) software,  which means that in this API, you define the accounts, credentials, and configurations for the order destinations or identify the CoinAPI endpoints where you need to connect to access the `EMS API`.  <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)   ### Endpoints <table>   <thead>     <tr>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Production</td>       <td><code>https://ems-mgmt.coinapi.io/</code></td>     </tr>     <tr>       <td>Sandbox</td>       <td><code>https://ems-mgmt-sandbox.coinapi.io/</code></td>     </tr>   </tbody> </table>  ### Authentication  To use resources that require authorized access, you will need to provide an API key to us when making HTTP requests.  There are 2 methods for passing the API key to us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key`  2. Query string parameter named `apikey`  #### Custom authorization header  You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside>  #### Query string authorization parameter  You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all accounts, then your query string should look like this:  <br/><br/> `GET /v1/accounts?apikey=73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"notice\"> Query string method may be more practical for development activities. </aside> 

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'cgi'

module OpenapiClient
  class AccountApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Delete account
    # Delete specific exchange account maintained by the EMS API for your subscription.
    # @param exchange_id [Array<String>] Exchange identifier of the account to delete
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_account(exchange_id, opts = {})
      delete_account_with_http_info(exchange_id, opts)
      nil
    end

    # Delete account
    # Delete specific exchange account maintained by the EMS API for your subscription.
    # @param exchange_id [Array<String>] Exchange identifier of the account to delete
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_account_with_http_info(exchange_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AccountApi.delete_account ...'
      end
      # verify the required parameter 'exchange_id' is set
      if @api_client.config.client_side_validation && exchange_id.nil?
        fail ArgumentError, "Missing the required parameter 'exchange_id' when calling AccountApi.delete_account"
      end
      # resource path
      local_var_path = '/v1/accounts'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'exchange_id'] = @api_client.build_collection_param(exchange_id, :multi)

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || ['APIKeyHeader', 'APIKeyQueryParam']

      new_options = opts.merge(
        :operation => :"AccountApi.delete_account",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AccountApi#delete_account\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Delete all accounts
    # Delete all exchange accounts maintained by the EMS API for your subscription.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_account_all(opts = {})
      delete_account_all_with_http_info(opts)
      nil
    end

    # Delete all accounts
    # Delete all exchange accounts maintained by the EMS API for your subscription.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_account_all_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AccountApi.delete_account_all ...'
      end
      # resource path
      local_var_path = '/v1/accounts/all'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || ['APIKeyHeader', 'APIKeyQueryParam']

      new_options = opts.merge(
        :operation => :"AccountApi.delete_account_all",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AccountApi#delete_account_all\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get accounts
    # Get all accounts maintained for your subscription in the EMS API.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :filter_exchange_id Exchange id of the specific account to provide single account instead of the list of all accounts
    # @return [Array<GetAccount>]
    def get_account(opts = {})
      data, _status_code, _headers = get_account_with_http_info(opts)
      data
    end

    # Get accounts
    # Get all accounts maintained for your subscription in the EMS API.
    # @param [Hash] opts the optional parameters
    # @option opts [Array<String>] :filter_exchange_id Exchange id of the specific account to provide single account instead of the list of all accounts
    # @return [Array<(Array<GetAccount>, Integer, Hash)>] Array<GetAccount> data, response status code and response headers
    def get_account_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AccountApi.get_account ...'
      end
      # resource path
      local_var_path = '/v1/accounts'

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'filter_exchange_id'] = @api_client.build_collection_param(opts[:'filter_exchange_id'], :multi) if !opts[:'filter_exchange_id'].nil?

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Array<GetAccount>'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['APIKeyHeader', 'APIKeyQueryParam']

      new_options = opts.merge(
        :operation => :"AccountApi.get_account",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AccountApi#get_account\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Add or update account
    # Add new or update existing exchange account for your subscription in the EMS API.
    # @param body [AccountData] Exchange account object that needs to be add/update to the EMS
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def persist_account(body, opts = {})
      persist_account_with_http_info(body, opts)
      nil
    end

    # Add or update account
    # Add new or update existing exchange account for your subscription in the EMS API.
    # @param body [AccountData] Exchange account object that needs to be add/update to the EMS
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def persist_account_with_http_info(body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AccountApi.persist_account ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling AccountApi.persist_account"
      end
      # resource path
      local_var_path = '/v1/accounts'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      content_type = @api_client.select_header_content_type(['application/json'])
      if !content_type.nil?
          header_params['Content-Type'] = content_type
      end

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(body)

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || ['APIKeyHeader', 'APIKeyQueryParam']

      new_options = opts.merge(
        :operation => :"AccountApi.persist_account",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AccountApi#persist_account\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end