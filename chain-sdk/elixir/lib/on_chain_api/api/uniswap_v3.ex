# NOTE: This file is auto generated by OpenAPI Generator 6.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Api.UniswapV3 do
  @moduledoc """
  API calls for all endpoints tagged `UniswapV3`.
  """

  alias OnChainAPI.Connection
  import OnChainAPI.RequestBuilder

  @doc """
  GetBundles

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%BundleV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_bundle_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.BundleV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_bundle_current_get(connection, chain_id, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/bundle/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.BundleV3Dto{}]}
    ])
  end

  @doc """
  GetBurns

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%BurnV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_burns_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.BurnV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_burns_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/burns/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.BurnV3Dto{}]}
    ])
  end

  @doc """
  GetFactory

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%FactoryV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_factory_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.FactoryV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_factory_current_get(connection, chain_id, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/factory/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.FactoryV3Dto{}]}
    ])
  end

  @doc """
  GetMints

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%MintV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_mints_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.MintV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_mints_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/mints/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.MintV3Dto{}]}
    ])
  end

  @doc """
  GetPools

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%PoolV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_pools_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.PoolV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_pools_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/pools/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.PoolV3Dto{}]}
    ])
  end

  @doc """
  GetPoolsDayData

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%PoolDayDataV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_pools_day_data_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.PoolDayDataV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_pools_day_data_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/poolsDayData/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.PoolDayDataV3Dto{}]}
    ])
  end

  @doc """
  GetPoolsHourData

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%PoolHourDataV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_pools_hour_data_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.PoolHourDataV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_pools_hour_data_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/poolsHourData/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.PoolHourDataV3Dto{}]}
    ])
  end

  @doc """
  GetPositionSnapshot

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%PositionSnapshotV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_position_snapshots_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.PositionSnapshotV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_position_snapshots_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/positionSnapshots/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.PositionSnapshotV3Dto{}]}
    ])
  end

  @doc """
  GetPositions

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%PositionV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_positions_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.PositionV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_positions_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/positions/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.PositionV3Dto{}]}
    ])
  end

  @doc """
  GetSwaps

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%SwapV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_swaps_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.SwapV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_swaps_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/swaps/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SwapV3Dto{}]}
    ])
  end

  @doc """
  GetTicks

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%TickV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_ticks_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.TickV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_ticks_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/ticks/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.TickV3Dto{}]}
    ])
  end

  @doc """
  GetTicksDayData

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_pool_id` (String.t): Filter pool id

  ### Returns

  - `{:ok, [%TickDayDataV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_ticks_day_data_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.TickDayDataV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_ticks_day_data_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_pool_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/ticksDayData/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.TickDayDataV3Dto{}]}
    ])
  end

  @doc """
  GetTokens

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_token_id` (String.t): 

  ### Returns

  - `{:ok, [%TokenV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_tokens_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.TokenV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_tokens_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_token_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/tokens/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.TokenV3Dto{}]}
    ])
  end

  @doc """
  GetTokensDayData

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_token_id` (String.t): 

  ### Returns

  - `{:ok, [%TokenV3DayDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_tokens_day_data_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.TokenV3DayDataDto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_tokens_day_data_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_token_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/tokensDayData/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.TokenV3DayDataDto{}]}
    ])
  end

  @doc """
  GetTokensHourData

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters
    - `:filter_token_id` (String.t): 

  ### Returns

  - `{:ok, [%TokenHourDataV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_tokens_hour_data_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.TokenHourDataV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_tokens_hour_data_current_get(connection, chain_id, opts \\ []) do
    optional_params = %{
      :filter_token_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/tokensHourData/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.TokenHourDataV3Dto{}]}
    ])
  end

  @doc """
  GetUniswapDayData

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `chain_id` (String.t): Chain id
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%UniswapDayDataV3Dto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec chains_chain_id_dapps_uniswapv3_uniswap_day_data_current_get(Tesla.Env.client, String.t, keyword()) :: {:ok, list(OnChainAPI.Model.UniswapDayDataV3Dto.t)} | {:error, Tesla.Env.t}
  def chains_chain_id_dapps_uniswapv3_uniswap_day_data_current_get(connection, chain_id, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/chains/#{chain_id}/dapps/uniswapv3/uniswapDayData/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.UniswapDayDataV3Dto{}]}
    ])
  end
end