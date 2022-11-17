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

  # unit tests for sushiswap_bundles__current
  # Bundles (current)
  # Gets bundles.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapBundleDTO>]
  describe 'sushiswap_bundles__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_burns__current
  # Burns (current)
  # Gets burns.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapBurnDTO>]
  describe 'sushiswap_burns__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_day_data__current
  # DayData (current)
  # Gets dayData.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapDayDataDTO>]
  describe 'sushiswap_day_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_factories__current
  # Factories (current)
  # Gets factories.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapFactoryDTO>]
  describe 'sushiswap_factories__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_bundles__historical
  # Bundles (historical)
  # Gets bundles.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Hardcoded to &#39;1&#39;.
  # @return [Array<SushiswapBundleDTO>]
  describe 'sushiswap_get_bundles__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_burns__historical
  # Burns (historical)
  # Gets burns.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pair 
  # @return [Array<SushiswapBurnDTO>]
  describe 'sushiswap_get_burns__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_day_data__historical
  # DayData (historical)
  # Gets dayData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Unix timestamp for start of day / 86400 giving a unique day index.
  # @return [Array<SushiswapDayDataDTO>]
  describe 'sushiswap_get_day_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_factories__historical
  # Factories (historical)
  # Gets factories.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Factory address.
  # @return [Array<SushiswapFactoryDTO>]
  describe 'sushiswap_get_factories__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_hour_data__historical
  # HourData (historical)
  # Gets hourData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Start of hour timestamp.
  # @return [Array<SushiswapHourDataDTO>]
  describe 'sushiswap_get_hour_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_liquidity_position_snapshots__historical
  # LiquidityPositionSnapshots (historical)
  # Gets liquidityPositionSnapshots.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :user 
  # @option opts [String] :pair 
  # @return [Array<SushiswapLiquidityPositionSnapshotDTO>]
  describe 'sushiswap_get_liquidity_position_snapshots__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_liquidity_positions__historical
  # LiquidityPositions (historical)
  # Gets liquidityPositions.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :user 
  # @option opts [String] :pair 
  # @return [Array<SushiswapLiquidityPositionDTO>]
  describe 'sushiswap_get_liquidity_positions__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_mints__historical
  # Mints (historical)
  # Gets mints.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pair 
  # @return [Array<SushiswapMintDTO>]
  describe 'sushiswap_get_mints__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_pair_day_data__historical
  # PairDayData (historical)
  # Gets pairDayData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pair 
  # @option opts [String] :token_0 
  # @option opts [String] :token_1 
  # @return [Array<SushiswapPairDayDataDTO>]
  describe 'sushiswap_get_pair_day_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_pair_hour_data__historical
  # PairHourData (historical)
  # Gets pairHourData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pair 
  # @return [Array<SushiswapPairHourDataDTO>]
  describe 'sushiswap_get_pair_hour_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_pairs__historical
  # Pairs (historical)
  # Gets pairs.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :name 
  # @option opts [String] :token_0 
  # @option opts [String] :token_1 
  # @return [Array<SushiswapPairDTO>]
  describe 'sushiswap_get_pairs__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_swaps__historical
  # Swaps (historical)
  # Gets swaps.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Transaction hash plus index in Transaction swap array.
  # @option opts [String] :pair Reference to pair.
  # @return [Array<SushiswapSwapDTO>]
  describe 'sushiswap_get_swaps__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_token_day_data__historical
  # TokenDayData (historical)
  # Gets tokenDayData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Identifier, day start timestamp in unix / 86400.
  # @return [Array<SushiswapTokenDayDataDTO>]
  describe 'sushiswap_get_token_day_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_tokens__historical
  # Tokens (historical)
  # Gets tokens.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Token address.
  # @option opts [String] :symbol Token symbol.
  # @option opts [String] :name Token name.
  # @return [Array<SushiswapTokenDTO>]
  describe 'sushiswap_get_tokens__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_transactions__historical
  # Transactions (historical)
  # Gets transactions.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Ethereum transaction hash.
  # @return [Array<SushiswapTransactionDTO>]
  describe 'sushiswap_get_transactions__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_get_users__historical
  # Users (historical)
  # Gets users.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id User address.
  # @return [Array<SushiswapUserDTO>]
  describe 'sushiswap_get_users__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_hour_data__current
  # HourData (current)
  # Gets hourData.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapHourDataDTO>]
  describe 'sushiswap_hour_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_liquidity_position_snapshots__current
  # LiquidityPositionSnapshots (current)
  # Gets liquidityPositionSnapshots.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapLiquidityPositionSnapshotDTO>]
  describe 'sushiswap_liquidity_position_snapshots__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_liquidity_positions__current
  # LiquidityPositions (current)
  # Gets liquidityPositions.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapLiquidityPositionDTO>]
  describe 'sushiswap_liquidity_positions__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_mints__current
  # Mints (current)
  # Gets mints.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapMintDTO>]
  describe 'sushiswap_mints__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_pair_day_data__current
  # PairDayData (current)
  # Gets pairDayData.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapPairDayDataDTO>]
  describe 'sushiswap_pair_day_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_pair_hour_data__current
  # PairHourData (current)
  # Gets pairHourData.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapPairHourDataDTO>]
  describe 'sushiswap_pair_hour_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_pairs__current
  # Pairs (current)
  # Gets pairs.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :id Pair contract address.
  # @return [Array<SushiswapPairDTO>]
  describe 'sushiswap_pairs__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_swaps__current
  # Swaps (current)
  # Gets swaps.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :pair Reference to pair.
  # @return [Array<SushiswapSwapDTO>]
  describe 'sushiswap_swaps__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_token_day_data__current
  # TokenDayData (current)
  # Gets tokenDayData.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapTokenDayDataDTO>]
  describe 'sushiswap_token_day_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_tokens__current
  # Tokens (current)
  # Gets tokens.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapTokenDTO>]
  describe 'sushiswap_tokens__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_transactions__current
  # Transactions (current)
  # Gets transactions.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapTransactionDTO>]
  describe 'sushiswap_transactions__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for sushiswap_users__current
  # Users (current)
  # Gets users.
  # @param [Hash] opts the optional parameters
  # @return [Array<SushiswapUserDTO>]
  describe 'sushiswap_users__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
