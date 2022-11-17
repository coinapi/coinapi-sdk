# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Api.Sushiswap do
  @moduledoc """
  API calls for all endpoints tagged `Sushiswap`.
  """

  alias OnChainAPI.Connection
  import OnChainAPI.RequestBuilder

  @doc """
  Bundles (current)
  Gets bundles.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapBundleDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_bundles__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapBundleDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_bundles__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/bundles/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapBundleDto{}]}
    ])
  end

  @doc """
  Burns (current)
  Gets burns.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapBurnDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_burns__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapBurnDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_burns__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/burns/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapBurnDto{}]}
    ])
  end

  @doc """
  DayDatas (current)
  Gets dayDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapDayDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_day_datas__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapDayDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_day_datas__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/dayDatas/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapDayDataDto{}]}
    ])
  end

  @doc """
  Factorys (current)
  Gets factorys.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapFactoryDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_factorys__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapFactoryDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_factorys__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/factorys/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapFactoryDto{}]}
    ])
  end

  @doc """
  Bundles (historical) 🔥
  Gets bundles.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Hardcoded to '1'.

  ### Returns

  - `{:ok, [%SushiswapBundleDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_bundles__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapBundleDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_bundles__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query
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
      {200, [%OnChainAPI.Model.SushiswapBundleDto{}]}
    ])
  end

  @doc """
  Burns (historical) 🔥
  Gets burns.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:id` (String.t): 
    - `:pair` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapBurnDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_burns__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapBurnDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_burns__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :pair => :query
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
      {200, [%OnChainAPI.Model.SushiswapBurnDto{}]}
    ])
  end

  @doc """
  DayDatas (historical) 🔥
  Gets dayDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Unix timestamp for start of day / 86400 giving a unique day index.

  ### Returns

  - `{:ok, [%SushiswapDayDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_day_datas__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapDayDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_day_datas__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/dayDatas/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapDayDataDto{}]}
    ])
  end

  @doc """
  Factorys (historical) 🔥
  Gets factorys.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Factory address.

  ### Returns

  - `{:ok, [%SushiswapFactoryDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_factorys__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapFactoryDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_factorys__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/factorys/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapFactoryDto{}]}
    ])
  end

  @doc """
  HourDatas (historical) 🔥
  Gets hourDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Start of hour timestamp.

  ### Returns

  - `{:ok, [%SushiswapHourDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_hour_datas__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapHourDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_hour_datas__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/hourDatas/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapHourDataDto{}]}
    ])
  end

  @doc """
  LiquidityPositionSnapshots (historical) 🔥
  Gets liquidityPositionSnapshots.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:id` (String.t): 
    - `:user` (String.t): 
    - `:pair` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapLiquidityPositionSnapshotDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_liquidity_position_snapshots__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapLiquidityPositionSnapshotDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_liquidity_position_snapshots__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :user => :query,
      :pair => :query
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
      {200, [%OnChainAPI.Model.SushiswapLiquidityPositionSnapshotDto{}]}
    ])
  end

  @doc """
  LiquidityPositions (historical) 🔥
  Gets liquidityPositions.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:id` (String.t): 
    - `:user` (String.t): 
    - `:pair` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapLiquidityPositionDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_liquidity_positions__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapLiquidityPositionDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_liquidity_positions__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :user => :query,
      :pair => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/liquidityPositions/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapLiquidityPositionDto{}]}
    ])
  end

  @doc """
  Mints (historical) 🔥
  Gets mints.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:id` (String.t): 
    - `:pair` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapMintDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_mints__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapMintDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_mints__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :pair => :query
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
      {200, [%OnChainAPI.Model.SushiswapMintDto{}]}
    ])
  end

  @doc """
  PairDayDatas (historical) 🔥
  Gets pairDayDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:id` (String.t): 
    - `:pair` (String.t): 
    - `:token_0` (String.t): 
    - `:token_1` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapPairDayDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_pair_day_datas__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapPairDayDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_pair_day_datas__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :pair => :query,
      :token_0 => :query,
      :token_1 => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/pairDayDatas/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapPairDayDataDto{}]}
    ])
  end

  @doc """
  PairHourDatas (historical) 🔥
  Gets pairHourDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:id` (String.t): 
    - `:pair` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapPairHourDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_pair_hour_datas__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapPairHourDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_pair_hour_datas__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :pair => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/pairHourDatas/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapPairHourDataDto{}]}
    ])
  end

  @doc """
  Pairs (historical) 🔥
  Gets pairs.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:id` (String.t): 
    - `:name` (String.t): 
    - `:token_0` (String.t): 
    - `:token_1` (String.t): 

  ### Returns

  - `{:ok, [%SushiswapPairDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_pairs__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapPairDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_pairs__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :name => :query,
      :token_0 => :query,
      :token_1 => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/pairs/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapPairDto{}]}
    ])
  end

  @doc """
  Swaps (historical) 🔥
  Gets swaps.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Transaction hash plus index in Transaction swap array.
    - `:pair` (String.t): Reference to pair.

  ### Returns

  - `{:ok, [%SushiswapSwapDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_swaps__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapSwapDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_swaps__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :pair => :query
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
  TokenDayDatas (historical) 🔥
  Gets tokenDayDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Identifier, day start timestamp in unix / 86400.

  ### Returns

  - `{:ok, [%SushiswapTokenDayDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_token_day_datas__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapTokenDayDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_token_day_datas__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/tokenDayDatas/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapTokenDayDataDto{}]}
    ])
  end

  @doc """
  Tokens (historical) 🔥
  Gets tokens.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Token address.
    - `:symbol` (String.t): Token symbol.
    - `:name` (String.t): Token name.

  ### Returns

  - `{:ok, [%SushiswapTokenDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_tokens__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapTokenDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_tokens__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :symbol => :query,
      :name => :query
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
  Transactions (historical) 🔥
  Gets transactions.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Ethereum transaction hash.

  ### Returns

  - `{:ok, [%SushiswapTransactionDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_transactions__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapTransactionDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_transactions__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query
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
      {200, [%OnChainAPI.Model.SushiswapTransactionDto{}]}
    ])
  end

  @doc """
  Users (historical) 🔥
  Gets users.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): User address.

  ### Returns

  - `{:ok, [%SushiswapUserDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_get_users__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapUserDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_get_users__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query
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
      {200, [%OnChainAPI.Model.SushiswapUserDto{}]}
    ])
  end

  @doc """
  HourDatas (current)
  Gets hourDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapHourDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_hour_datas__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapHourDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_hour_datas__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/hourDatas/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapHourDataDto{}]}
    ])
  end

  @doc """
  LiquidityPositionSnapshots (current)
  Gets liquidityPositionSnapshots.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapLiquidityPositionSnapshotDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_liquidity_position_snapshots__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapLiquidityPositionSnapshotDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_liquidity_position_snapshots__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/liquidityPositionSnapshots/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapLiquidityPositionSnapshotDto{}]}
    ])
  end

  @doc """
  LiquidityPositions (current)
  Gets liquidityPositions.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapLiquidityPositionDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_liquidity_positions__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapLiquidityPositionDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_liquidity_positions__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/liquidityPositions/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapLiquidityPositionDto{}]}
    ])
  end

  @doc """
  Mints (current)
  Gets mints.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapMintDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_mints__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapMintDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_mints__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/mints/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapMintDto{}]}
    ])
  end

  @doc """
  PairDayDatas (current)
  Gets pairDayDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapPairDayDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_pair_day_datas__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapPairDayDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_pair_day_datas__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/pairDayDatas/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapPairDayDataDto{}]}
    ])
  end

  @doc """
  PairHourDatas (current)
  Gets pairHourDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapPairHourDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_pair_hour_datas__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapPairHourDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_pair_hour_datas__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/pairHourDatas/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapPairHourDataDto{}]}
    ])
  end

  @doc """
  Pairs (current)
  Gets pairs.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:id` (String.t): Pair contract address.

  ### Returns

  - `{:ok, [%SushiswapPairDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_pairs__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapPairDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_pairs__current(connection, opts \\ []) do
    optional_params = %{
      :id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/pairs/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapPairDto{}]}
    ])
  end

  @doc """
  Swaps (current)
  Gets swaps.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:pair` (String.t): Reference to pair.

  ### Returns

  - `{:ok, [%SushiswapSwapDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_swaps__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapSwapDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_swaps__current(connection, opts \\ []) do
    optional_params = %{
      :pair => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/swaps/current")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapSwapDto{}]}
    ])
  end

  @doc """
  TokenDayDatas (current)
  Gets tokenDayDatas.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapTokenDayDataDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_token_day_datas__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapTokenDayDataDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_token_day_datas__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/tokenDayDatas/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapTokenDayDataDto{}]}
    ])
  end

  @doc """
  Tokens (current)
  Gets tokens.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapTokenDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_tokens__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapTokenDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_tokens__current(connection, _opts \\ []) do
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
  Transactions (current)
  Gets transactions.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapTransactionDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_transactions__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapTransactionDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_transactions__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/transactions/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapTransactionDto{}]}
    ])
  end

  @doc """
  Users (current)
  Gets users.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%SushiswapUserDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec sushiswap_users__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.SushiswapUserDto.t)} | {:error, Tesla.Env.t}
  def sushiswap_users__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/sushiswap/users/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.SushiswapUserDto{}]}
    ])
  end
end
