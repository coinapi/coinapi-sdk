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

# Unit tests for OpenapiClient::UniswapV2Api
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'UniswapV2Api' do
  before do
    # run before each test
    @api_instance = OpenapiClient::UniswapV2Api.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UniswapV2Api' do
    it 'should create an instance of UniswapV2Api' do
      expect(@api_instance).to be_instance_of(OpenapiClient::UniswapV2Api)
    end
  end

  # unit tests for uniswap_v2_bundles__current
  # Bundles (current)
  # Gets bundles.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2BundleDTO>]
  describe 'uniswap_v2_bundles__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_burns__current
  # Burns (current)
  # Gets burns.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2BurnDTO>]
  describe 'uniswap_v2_burns__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_bundles__historical
  # Bundles (historical) 🔥
  # Gets bundles.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Constant 1.
  # @return [Array<UniswapV2BundleDTO>]
  describe 'uniswap_v2_get_bundles__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_burns__historical
  # Burns (historical) 🔥
  # Gets burns.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Transaction hash plus index in the transaction burn array
  # @option opts [String] :pair Reference to pair.
  # @return [Array<UniswapV2BurnDTO>]
  describe 'uniswap_v2_get_burns__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_liquidity_position_snapshots__historical
  # LiquidityPositionSnapshots (historical) 🔥
  # Gets liquidityPositionSnapshots.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :user 
  # @option opts [String] :pair 
  # @return [Array<UniswapV2LiquidityPositionSnapshotDTO>]
  describe 'uniswap_v2_get_liquidity_position_snapshots__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_liquidity_positions__historical
  # LiquidityPositions (historical) 🔥
  # Gets liquidityPositions.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id User address and pair address concatenated with a dash.
  # @option opts [String] :user Reference to user.
  # @option opts [String] :pair Reference to the pair liquidity is being provided on.
  # @return [Array<UniswapV2LiquidityPositionDTO>]
  describe 'uniswap_v2_get_liquidity_positions__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_mints__historical
  # Mints (historical) 🔥
  # Gets mints.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Transaction hash plus index in the transaction mint array.
  # @option opts [String] :pair Reference to pair.
  # @return [Array<UniswapV2MintDTO>]
  describe 'uniswap_v2_get_mints__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_pair_day_datas__historical
  # PairDayDatas (historical) 🔥
  # Gets pairDayDatas.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id 
  # @option opts [String] :token_0 Reference to token0.
  # @option opts [String] :token_1 Reference to token1.
  # @return [Array<UniswapV2PairDayDataDTO>]
  describe 'uniswap_v2_get_pair_day_datas__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_pair_hour_datas__historical
  # PairHourDatas (historical) 🔥
  # Gets pairHourDatas.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id 
  # @option opts [String] :pair Address for pair contract.
  # @return [Array<UniswapV2PairHourDataDTO>]
  describe 'uniswap_v2_get_pair_hour_datas__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_pairs__historical
  # Pairs (historical) 🔥
  # Gets pairs.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Pair contract address.
  # @option opts [String] :token_0 Reference to token0 as stored in pair contract.
  # @option opts [String] :token_1 Reference to token1 as stored in pair contract.
  # @return [Array<UniswapV2PairDTO>]
  describe 'uniswap_v2_get_pairs__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_pools__current
  # Pools (current) 🔥
  # Gets pools.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :filter_pool_id 
  # @return [Array<UniswapV2PairDTO>]
  describe 'uniswap_v2_get_pools__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_swaps__current
  # Swaps (current) 🔥
  # Gets swaps.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2SwapDTO>]
  describe 'uniswap_v2_get_swaps__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_swaps__historical
  # Swaps (historical) 🔥
  # Gets swaps.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Transaction hash plus index in Transaction swap array.
  # @option opts [String] :pair Reference to pair.
  # @return [Array<UniswapV2SwapDTO>]
  describe 'uniswap_v2_get_swaps__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_token_day_datas__historical
  # TokenDayDatas (historical) 🔥
  # Gets tokenDayDatas.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
  # @return [Array<UniswapV2TokenDayDataDTO>]
  describe 'uniswap_v2_get_token_day_datas__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_tokens__current
  # Tokens (current) 🔥
  # Gets tokens.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2TokenDTO>]
  describe 'uniswap_v2_get_tokens__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_tokens__historical
  # Tokens (historical) 🔥
  # Gets tokens.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Token address.
  # @option opts [String] :symbol Token symbol.
  # @option opts [String] :name Token name.
  # @return [Array<UniswapV2TokenDTO>]
  describe 'uniswap_v2_get_tokens__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_transactions__historical
  # Transactions (historical) 🔥
  # Gets transactions.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Ethereum transaction hash.
  # @return [Array<UniswapV2TransactionDTO>]
  describe 'uniswap_v2_get_transactions__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_uniswap_day_datas__historical
  # UniswapDayDatas (historical) 🔥
  # Gets uniswapDayDatas.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Unix timestamp for start of day / 86400 giving a unique day index.
  # @return [Array<UniswapV2UniswapDayDataDTO>]
  describe 'uniswap_v2_get_uniswap_day_datas__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_uniswap_factorys__historical
  # UniswapFactorys (historical) 🔥
  # Gets uniswapFactorys.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Factory address.
  # @return [Array<UniswapV2UniswapFactoryDTO>]
  describe 'uniswap_v2_get_uniswap_factorys__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_get_users__historical
  # Users (historical) 🔥
  # Gets users.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id User address.
  # @return [Array<UniswapV2UserDTO>]
  describe 'uniswap_v2_get_users__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_liquidity_position_snapshots__current
  # LiquidityPositionSnapshots (current)
  # Gets liquidityPositionSnapshots.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2LiquidityPositionSnapshotDTO>]
  describe 'uniswap_v2_liquidity_position_snapshots__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_liquidity_positions__current
  # LiquidityPositions (current)
  # Gets liquidityPositions.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2LiquidityPositionDTO>]
  describe 'uniswap_v2_liquidity_positions__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_mints__current
  # Mints (current)
  # Gets mints.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2MintDTO>]
  describe 'uniswap_v2_mints__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_pair_day_datas__current
  # PairDayDatas (current)
  # Gets pairDayDatas.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2PairDayDataDTO>]
  describe 'uniswap_v2_pair_day_datas__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_pair_hour_datas__current
  # PairHourDatas (current)
  # Gets pairHourDatas.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2PairHourDataDTO>]
  describe 'uniswap_v2_pair_hour_datas__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_pairs__current
  # Pairs (current)
  # Gets pairs.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :id Pair contract address.
  # @return [Array<UniswapV2PairDTO>]
  describe 'uniswap_v2_pairs__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_token_day_datas__current
  # TokenDayDatas (current)
  # Gets tokenDayDatas.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2TokenDayDataDTO>]
  describe 'uniswap_v2_token_day_datas__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_transactions__current
  # Transactions (current)
  # Gets transactions.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2TransactionDTO>]
  describe 'uniswap_v2_transactions__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_uniswap_day_datas__current
  # UniswapDayDatas (current)
  # Gets uniswapDayDatas.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2UniswapDayDataDTO>]
  describe 'uniswap_v2_uniswap_day_datas__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_uniswap_factorys__current
  # UniswapFactorys (current)
  # Gets uniswapFactorys.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2UniswapFactoryDTO>]
  describe 'uniswap_v2_uniswap_factorys__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v2_users__current
  # Users (current)
  # Gets users.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV2UserDTO>]
  describe 'uniswap_v2_users__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
