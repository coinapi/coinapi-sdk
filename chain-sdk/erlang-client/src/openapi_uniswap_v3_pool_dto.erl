-module(openapi_uniswap_v3_pool_dto).

-export([encode/1]).

-export_type([openapi_uniswap_v3_pool_dto/0]).

-type openapi_uniswap_v3_pool_dto() ::
    #{ 'entry_time' => openapi_date_time:openapi_date_time(),
       'recv_time' => openapi_date_time:openapi_date_time(),
       'block_number' => integer(),
       'vid' => integer(),
       'id' => binary(),
       'created_at_timestamp' => openapi_date_time:openapi_date_time(),
       'token_0' => binary(),
       'token_1' => binary(),
       'fee_tier' => openapi_numerics_big_integer:openapi_numerics_big_integer(),
       'liquidity' => openapi_numerics_big_integer:openapi_numerics_big_integer(),
       'sqrt_price' => openapi_numerics_big_integer:openapi_numerics_big_integer(),
       'fee_growth_global_0x128' => openapi_numerics_big_integer:openapi_numerics_big_integer(),
       'fee_growth_global_1x128' => openapi_numerics_big_integer:openapi_numerics_big_integer(),
       'token_0_price' => binary(),
       'token_1_price' => binary(),
       'tick' => openapi_numerics_big_integer:openapi_numerics_big_integer(),
       'observation_index' => openapi_numerics_big_integer:openapi_numerics_big_integer(),
       'volume_token_0' => binary(),
       'volume_token_1' => binary(),
       'volume_usd' => binary(),
       'untracked_volume_usd' => binary(),
       'fees_usd' => binary(),
       'tx_count' => openapi_numerics_big_integer:openapi_numerics_big_integer(),
       'collected_fees_token_0' => binary(),
       'collected_fees_token_1' => binary(),
       'collected_fees_usd' => binary(),
       'total_value_locked_token_0' => binary(),
       'total_value_locked_token_1' => binary(),
       'total_value_locked_eth' => binary(),
       'total_value_locked_usd' => binary(),
       'total_value_locked_usd_untracked' => binary(),
       'liquidity_provider_count' => binary(),
       'evaluated_ask' => float()
     }.

encode(#{ 'entry_time' := EntryTime,
          'recv_time' := RecvTime,
          'block_number' := BlockNumber,
          'vid' := Vid,
          'id' := Id,
          'created_at_timestamp' := CreatedAtTimestamp,
          'token_0' := Token0,
          'token_1' := Token1,
          'fee_tier' := FeeTier,
          'liquidity' := Liquidity,
          'sqrt_price' := SqrtPrice,
          'fee_growth_global_0x128' := FeeGrowthGlobal0x128,
          'fee_growth_global_1x128' := FeeGrowthGlobal1x128,
          'token_0_price' := Token0Price,
          'token_1_price' := Token1Price,
          'tick' := Tick,
          'observation_index' := ObservationIndex,
          'volume_token_0' := VolumeToken0,
          'volume_token_1' := VolumeToken1,
          'volume_usd' := VolumeUsd,
          'untracked_volume_usd' := UntrackedVolumeUsd,
          'fees_usd' := FeesUsd,
          'tx_count' := TxCount,
          'collected_fees_token_0' := CollectedFeesToken0,
          'collected_fees_token_1' := CollectedFeesToken1,
          'collected_fees_usd' := CollectedFeesUsd,
          'total_value_locked_token_0' := TotalValueLockedToken0,
          'total_value_locked_token_1' := TotalValueLockedToken1,
          'total_value_locked_eth' := TotalValueLockedEth,
          'total_value_locked_usd' := TotalValueLockedUsd,
          'total_value_locked_usd_untracked' := TotalValueLockedUsdUntracked,
          'liquidity_provider_count' := LiquidityProviderCount,
          'evaluated_ask' := EvaluatedAsk
        }) ->
    #{ 'entry_time' => EntryTime,
       'recv_time' => RecvTime,
       'block_number' => BlockNumber,
       'vid' => Vid,
       'id' => Id,
       'created_at_timestamp' => CreatedAtTimestamp,
       'token_0' => Token0,
       'token_1' => Token1,
       'fee_tier' => FeeTier,
       'liquidity' => Liquidity,
       'sqrt_price' => SqrtPrice,
       'fee_growth_global_0x128' => FeeGrowthGlobal0x128,
       'fee_growth_global_1x128' => FeeGrowthGlobal1x128,
       'token_0_price' => Token0Price,
       'token_1_price' => Token1Price,
       'tick' => Tick,
       'observation_index' => ObservationIndex,
       'volume_token_0' => VolumeToken0,
       'volume_token_1' => VolumeToken1,
       'volume_usd' => VolumeUsd,
       'untracked_volume_usd' => UntrackedVolumeUsd,
       'fees_usd' => FeesUsd,
       'tx_count' => TxCount,
       'collected_fees_token_0' => CollectedFeesToken0,
       'collected_fees_token_1' => CollectedFeesToken1,
       'collected_fees_usd' => CollectedFeesUsd,
       'total_value_locked_token_0' => TotalValueLockedToken0,
       'total_value_locked_token_1' => TotalValueLockedToken1,
       'total_value_locked_eth' => TotalValueLockedEth,
       'total_value_locked_usd' => TotalValueLockedUsd,
       'total_value_locked_usd_untracked' => TotalValueLockedUsdUntracked,
       'liquidity_provider_count' => LiquidityProviderCount,
       'evaluated_ask' => EvaluatedAsk
     }.
