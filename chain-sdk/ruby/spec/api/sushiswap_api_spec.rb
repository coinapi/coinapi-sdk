=begin
#OnChain API

# This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'spec_helper'
require 'json'

# Unit tests for OpenapiClient::SushiswapApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'SushiswapApi' do
  before do
    # run before each test
    @api_instance = OpenapiClient::SushiswapApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of SushiswapApi' do
    it 'should create an instance of SushiswapApi' do
      expect(@api_instance).to be_instance_of(OpenapiClient::SushiswapApi)
    end
  end

  # unit tests for dapps_sushiswap_bundles_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @return [nil]
  describe 'dapps_sushiswap_bundles_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_burns_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :pool_id 
  # @return [nil]
  describe 'dapps_sushiswap_burns_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_day_data_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @return [nil]
  describe 'dapps_sushiswap_day_data_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_factory_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @return [nil]
  describe 'dapps_sushiswap_factory_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_hour_data_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @return [nil]
  describe 'dapps_sushiswap_hour_data_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_liquidity_position_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :pool_id 
  # @return [nil]
  describe 'dapps_sushiswap_liquidity_position_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_liquidity_position_snapshots_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :pool_id 
  # @return [nil]
  describe 'dapps_sushiswap_liquidity_position_snapshots_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_mints_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :pool_id 
  # @return [nil]
  describe 'dapps_sushiswap_mints_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_pool_day_data_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :pool_id 
  # @return [nil]
  describe 'dapps_sushiswap_pool_day_data_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_pool_hour_data_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :pool_id 
  # @return [nil]
  describe 'dapps_sushiswap_pool_hour_data_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_token_day_data_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :token_id 
  # @return [nil]
  describe 'dapps_sushiswap_token_day_data_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_transactions_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @return [nil]
  describe 'dapps_sushiswap_transactions_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for dapps_sushiswap_users_historical_get
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @return [nil]
  describe 'dapps_sushiswap_users_historical_get test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_pools__current
  # GetPools (current)
  # Gets pools.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapPairDTO>]
  describe 'sushiswap_get_pools__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_pools__historical
  # GetPools (historical)
  # Gets list of pools for given filters.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :pool_id 
  # @return [Array<SushiswapPairDTO>]
  describe 'sushiswap_get_pools__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_swaps__current
  # GetSwaps (current)
  # Gets swaps.
  # @param [Hash] opts the optional parameters
  # @return [SushiswapSwapDTO]
  describe 'sushiswap_get_swaps__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_swaps__historical
  # GetSwaps (historical)
  # Gets list of swaps for given filters.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :pool_id 
  # @return [Array<SushiswapSwapDTO>]
  describe 'sushiswap_get_swaps__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_tokens__current
  # GetTokens (current)
  # Gets tokens.
  # @param [Hash] opts the optional parameters
  # @return [SushiswapTokenDTO]
  describe 'sushiswap_get_tokens__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_tokens__historical
  # GetTokens (historical)
  # Gets list of tokens for given filters.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :token_id 
  # @return [Array<SushiswapTokenDTO>]
  describe 'sushiswap_get_tokens__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
