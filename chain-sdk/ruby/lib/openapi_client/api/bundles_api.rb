=begin
#OnChain API

# This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.0

=end

require 'cgi'

module OpenapiClient
  class BundlesApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # @param chain_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :start_block 
    # @option opts [Integer] :end_block 
    # @option opts [Time] :start_date 
    # @option opts [Time] :end_date 
    # @return [nil]
    def chains_chain_id_dapps_uniswapv3_bundles_historical_get(chain_id, opts = {})
      chains_chain_id_dapps_uniswapv3_bundles_historical_get_with_http_info(chain_id, opts)
      nil
    end

    # @param chain_id [String] 
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :start_block 
    # @option opts [Integer] :end_block 
    # @option opts [Time] :start_date 
    # @option opts [Time] :end_date 
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def chains_chain_id_dapps_uniswapv3_bundles_historical_get_with_http_info(chain_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BundlesApi.chains_chain_id_dapps_uniswapv3_bundles_historical_get ...'
      end
      # verify the required parameter 'chain_id' is set
      if @api_client.config.client_side_validation && chain_id.nil?
        fail ArgumentError, "Missing the required parameter 'chain_id' when calling BundlesApi.chains_chain_id_dapps_uniswapv3_bundles_historical_get"
      end
      # resource path
      local_var_path = '/chains/{chain_id}/dapps/uniswapv3/bundles/historical'.sub('{' + 'chain_id' + '}', CGI.escape(chain_id.to_s))

      # query parameters
      query_params = opts[:query_params] || {}
      query_params[:'startBlock'] = opts[:'start_block'] if !opts[:'start_block'].nil?
      query_params[:'endBlock'] = opts[:'end_block'] if !opts[:'end_block'].nil?
      query_params[:'startDate'] = opts[:'start_date'] if !opts[:'start_date'].nil?
      query_params[:'endDate'] = opts[:'end_date'] if !opts[:'end_date'].nil?

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BundlesApi.chains_chain_id_dapps_uniswapv3_bundles_historical_get",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BundlesApi#chains_chain_id_dapps_uniswapv3_bundles_historical_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
