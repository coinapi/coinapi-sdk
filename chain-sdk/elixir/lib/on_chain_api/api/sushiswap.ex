# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Api.Sushiswap do
  @moduledoc """
  API calls for all endpoints tagged `Sushiswap`.
  """

  alias OnChainAPI.Connection
  import OnChainAPI.RequestBuilder

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_bundles_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_bundles_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/bundles/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:poolId` (String.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_burns_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_burns_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :poolId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/burns/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_day_data_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_day_data_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/dayData/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_factory_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_factory_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/factory/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_hour_data_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_hour_data_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/hourData/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:poolId` (String.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_liquidity_position_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_liquidity_position_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :poolId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/liquidityPosition/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:poolId` (String.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_liquidity_position_snapshots_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_liquidity_position_snapshots_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :poolId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/liquidityPositionSnapshots/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:poolId` (String.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_mints_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_mints_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :poolId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/mints/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:poolId` (String.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_pool_day_data_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_pool_day_data_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :poolId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/poolDayData/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:poolId` (String.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_pool_hour_data_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_pool_hour_data_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :poolId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/poolHourData/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """
  GetPools
  Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapPairDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_pools_current_get(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapPairDto.t)} | {:error, Tesla.Env.t}
  def dapps_sushiswap_pools_current_get(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/pools/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapPairDto{}]}
    ])
  end

  @doc """
  GetPools (historical)

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:poolId` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapPairDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_pools_historical_get(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapPairDto.t)} | {:error, Tesla.Env.t}
  def dapps_sushiswap_pools_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :poolId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/pools/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapPairDto{}]}
    ])
  end

  @doc """
  GetSwaps

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapSwapDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_swaps_current_get(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapSwapDto.t)} | {:error, Tesla.Env.t}
  def dapps_sushiswap_swaps_current_get(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/swaps/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapSwapDto{}]}
    ])
  end

  @doc """
  GetSwaps (historical)

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:poolId` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapSwapDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_swaps_historical_get(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapSwapDto.t)} | {:error, Tesla.Env.t}
  def dapps_sushiswap_swaps_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :poolId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/swaps/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapSwapDto{}]}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:tokenId` (String.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_token_day_data_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_token_day_data_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :tokenId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/tokenDayData/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """
  GetTokens

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapTokenDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_tokens_current_get(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapTokenDto.t)} | {:error, Tesla.Env.t}
  def dapps_sushiswap_tokens_current_get(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/tokens/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapTokenDto{}]}
    ])
  end

  @doc """
  GetTokens (historical)

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:tokenId` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapTokenDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_tokens_historical_get(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapTokenDto.t)} | {:error, Tesla.Env.t}
  def dapps_sushiswap_tokens_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :tokenId => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/tokens/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapTokenDto{}]}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_transactions_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_transactions_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/transactions/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end

  @doc """

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 

  ### Returns

  - `{:ok, nil}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec dapps_sushiswap_users_historical_get(Tesla.Env.client, keyword()) :: {:ok, nil} | {:error, Tesla.Env.t}
  def dapps_sushiswap_users_historical_get(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/users/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, false}
    ])
  end
end
