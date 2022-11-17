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

# Unit tests for OpenapiClient::UniswapV3Api
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'UniswapV3Api' do
  before do
    # run before each test
    @api_instance = OpenapiClient::UniswapV3Api.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of UniswapV3Api' do
    it 'should create an instance of UniswapV3Api' do
      expect(@api_instance).to be_instance_of(OpenapiClient::UniswapV3Api)
    end
  end

  # unit tests for uniswap_v3_bundles__current
  # Bundles (current)
  # Gets bundles.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3BundleDTO>]
  describe 'uniswap_v3_bundles__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_burns__current
  # Burns (current)
  # Gets burns.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3BurnDTO>]
  describe 'uniswap_v3_burns__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_factories__current
  # Factories (current)
  # Gets factories.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3FactoryDTO>]
  describe 'uniswap_v3_factories__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_bundles__historical
  # Bundles (historical)
  # Gets bundles.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id 
  # @return [Array<UniswapV3BundleDTO>]
  describe 'uniswap_v3_get_bundles__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_burns__historical
  # Burns (historical)
  # Gets burns.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Transaction hash + &#39;#&#39; + index in mints Transaction array.
  # @option opts [String] :pool Pool position is within.
  # @option opts [String] :token_0 Reference to token0 as stored in pool contract.
  # @option opts [String] :token_1 Reference to token1 as stored in pool contract.
  # @return [Array<UniswapV3BurnDTO>]
  describe 'uniswap_v3_get_burns__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_factories__historical
  # Factories (historical)
  # Gets factories.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Factory address.
  # @return [Array<UniswapV3FactoryDTO>]
  describe 'uniswap_v3_get_factories__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_mints__historical
  # Mints (historical)
  # Gets mints.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Transaction hash + &#39;#&#39; + index in mints Transaction array.
  # @option opts [String] :pool Pool address.
  # @option opts [String] :token_0 Reference to token0 as stored in pool contract.
  # @option opts [String] :token_1 Reference to token1 as stored in pool contract.
  # @return [Array<UniswapV3MintDTO>]
  describe 'uniswap_v3_get_mints__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_pool_day_data__historical
  # PoolDayData (historical)
  # Gets poolDayData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pool 
  # @return [Array<UniswapV3PoolDayDataDTO>]
  describe 'uniswap_v3_get_pool_day_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_pool_hour_data__historical
  # PoolHourData (historical)
  # Gets poolHourData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pool 
  # @return [Array<UniswapV3PoolHourDataDTO>]
  describe 'uniswap_v3_get_pool_hour_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_pools__historical
  # Pools (historical)
  # Gets pools.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Pool address.
  # @option opts [String] :token_0 Reference to token0 as stored in pool contract.
  # @option opts [String] :token_1 Reference to token1 as stored in pool contract.
  # @return [Array<UniswapV3PoolDTO>]
  describe 'uniswap_v3_get_pools__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_position_snapshots__historical
  # PositionSnapshots (historical)
  # Gets positionSnapshots.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pool 
  # @return [Array<UniswapV3PositionSnapshotDTO>]
  describe 'uniswap_v3_get_position_snapshots__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_positions__historical
  # Positions (historical)
  # Gets positions.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id NFT token identifier.
  # @option opts [String] :pool Pool position is within.
  # @option opts [String] :token_0 Reference to token0 as stored in pair contract.
  # @option opts [String] :token_1 Reference to token1 as stored in pair contract.
  # @return [Array<UniswapV3PositionDTO>]
  describe 'uniswap_v3_get_positions__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_swaps__historical
  # Swaps (historical)
  # Gets swaps.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Identifier, format: transaction hash + \&quot;#\&quot; + index in swaps Transaction array.
  # @option opts [String] :pool Pool swap occured within.
  # @option opts [String] :token_0 Reference to token0 as stored in pair contract.
  # @option opts [String] :token_1 Reference to token1 as stored in pair contract.
  # @return [Array<UniswapV3SwapDTO>]
  describe 'uniswap_v3_get_swaps__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_tick_day_data__historical
  # TickDayData (historical)
  # Gets tickDayData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pool 
  # @return [Array<UniswapV3TickDayDataDTO>]
  describe 'uniswap_v3_get_tick_day_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_ticks__historical
  # Ticks (historical)
  # Gets ticks.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block 
  # @option opts [Integer] :end_block 
  # @option opts [Time] :start_date 
  # @option opts [Time] :end_date 
  # @option opts [String] :id 
  # @option opts [String] :pool 
  # @return [Array<UniswapV3TickDTO>]
  describe 'uniswap_v3_get_ticks__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_token_hour_data__historical
  # TokenHourData (historical)
  # Gets tokenHourData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Token address concatendated with date.
  # @return [Array<UniswapV3TokenHourDataDTO>]
  describe 'uniswap_v3_get_token_hour_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_token_v3_day_data__historical
  # TokenV3DayData (historical)
  # Gets tokenV3DayData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Token address concatendated with date.
  # @return [Array<UniswapV3TokenV3DayDataDTO>]
  describe 'uniswap_v3_get_token_v3_day_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_tokens__historical
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
  # @return [Array<UniswapV3TokenDTO>]
  describe 'uniswap_v3_get_tokens__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_transactions__historical
  # Transactions (historical)
  # Gets transactions.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Transaction hash.
  # @return [Array<UniswapV3TransactionDTO>]
  describe 'uniswap_v3_get_transactions__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_get_uniswap_day_data__historical
  # UniswapDayData (historical)
  # Gets uniswapDayData.
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :start_block The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
  # @option opts [Integer] :end_block The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
  # @option opts [Time] :start_date The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
  # @option opts [Time] :end_date The end date of timeframe.
  # @option opts [String] :id Timestamp rounded to current day by dividing by 86400.
  # @return [Array<UniswapV3UniswapDayDataDTO>]
  describe 'uniswap_v3_get_uniswap_day_data__historical test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_mints__current
  # Mints (current)
  # Gets mints.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3MintDTO>]
  describe 'uniswap_v3_mints__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_pool_day_data__current
  # PoolDayData (current)
  # Gets poolDayData.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3PoolDayDataDTO>]
  describe 'uniswap_v3_pool_day_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_pool_hour_data__current
  # PoolHourData (current)
  # Gets poolHourData.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3PoolHourDataDTO>]
  describe 'uniswap_v3_pool_hour_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_pools__current
  # Pools (current)
  # Gets pools.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :id Pool address.
  # @return [Array<UniswapV3PoolDTO>]
  describe 'uniswap_v3_pools__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_position_snapshots__current
  # PositionSnapshots (current)
  # Gets positionSnapshots.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3PositionSnapshotDTO>]
  describe 'uniswap_v3_position_snapshots__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_positions__current
  # Positions (current)
  # Gets positions.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3PositionDTO>]
  describe 'uniswap_v3_positions__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_swaps__current
  # Swaps (current)
  # Gets swaps.
  # @param [Hash] opts the optional parameters
  # @option opts [String] :pool Pool swap occured within.
  # @return [Array<UniswapV3SwapDTO>]
  describe 'uniswap_v3_swaps__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_tick_day_data__current
  # TickDayData (current)
  # Gets tickDayData.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3TickDayDataDTO>]
  describe 'uniswap_v3_tick_day_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_ticks__current
  # Ticks (current)
  # Gets ticks.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3TickDTO>]
  describe 'uniswap_v3_ticks__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_token_hour_data__current
  # TokenHourData (current)
  # Gets tokenHourData.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3TokenHourDataDTO>]
  describe 'uniswap_v3_token_hour_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_token_v3_day_data__current
  # TokenV3DayData (current)
  # Gets tokenV3DayData.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3TokenV3DayDataDTO>]
  describe 'uniswap_v3_token_v3_day_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_tokens__current
  # Tokens (current)
  # Gets tokens.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3TokenDTO>]
  describe 'uniswap_v3_tokens__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_transactions__current
  # Transactions (current)
  # Gets transactions.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3TransactionDTO>]
  describe 'uniswap_v3_transactions__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for uniswap_v3_uniswap_day_data__current
  # UniswapDayData (current)
  # Gets uniswapDayData.
  # @param [Hash] opts the optional parameters
  # @return [Array<UniswapV3UniswapDayDataDTO>]
  describe 'uniswap_v3_uniswap_day_data__current test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
