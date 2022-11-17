# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Api.Cow do
  @moduledoc """
  API calls for all endpoints tagged `Cow`.
  """

  alias OnChainAPI.Connection
  import OnChainAPI.RequestBuilder

  @doc """
  Orders (historical) 🔥
  Gets orders.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): User's address.

  ### Returns

  - `{:ok, [%CowOrderDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_get_orders__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowOrderDto.t)} | {:error, Tesla.Env.t}
  def cow_get_orders__historical(connection, opts \\ []) do
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
      |> url("/dapps/cow/orders/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowOrderDto{}]}
    ])
  end

  @doc """
  Settlements (historical) 🔥
  Gets settlements.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): The start block. If endblock is not given, only those entities will be included that were exactly created in startBlock.
    - `:endBlock` (integer()): The end block. Useful to filter data in range of blocks (FROM startBlock TO endBlock).
    - `:startDate` (DateTime.t): The start date of timeframe. If endDate is not given, entities created FROM startDate TO startDate plus 24 hours will be included.
    - `:endDate` (DateTime.t): The end date of timeframe.
    - `:id` (String.t): Transaction hash.

  ### Returns

  - `{:ok, [%CowSettlementDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_get_settlements__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowSettlementDto.t)} | {:error, Tesla.Env.t}
  def cow_get_settlements__historical(connection, opts \\ []) do
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
      |> url("/dapps/cow/settlements/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowSettlementDto{}]}
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
    - `:id` (String.t): Token's address.
    - `:address` (String.t): Token's address.
    - `:name` (String.t): Token name fetched by ERC20 contract call.
    - `:symbol` (String.t): Token symbol fetched by contract call.

  ### Returns

  - `{:ok, [%CowTokenDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_get_tokens__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowTokenDto.t)} | {:error, Tesla.Env.t}
  def cow_get_tokens__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :address => :query,
      :name => :query,
      :symbol => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/cow/tokens/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowTokenDto{}]}
    ])
  end

  @doc """
  Trades (historical) 🔥
  Gets trades.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:startBlock` (integer()): 
    - `:endBlock` (integer()): 
    - `:startDate` (DateTime.t): 
    - `:endDate` (DateTime.t): 
    - `:id` (String.t): 
    - `:sell_token` (String.t): 
    - `:buy_token` (String.t): 

  ### Returns

  - `{:ok, [%CowTradeDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_get_trades__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowTradeDto.t)} | {:error, Tesla.Env.t}
  def cow_get_trades__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :sell_token => :query,
      :buy_token => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/cow/trades/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowTradeDto{}]}
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
    - `:id` (String.t): User's address.
    - `:address` (String.t): User's address.

  ### Returns

  - `{:ok, [%CowUserDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_get_users__historical(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowUserDto.t)} | {:error, Tesla.Env.t}
  def cow_get_users__historical(connection, opts \\ []) do
    optional_params = %{
      :startBlock => :query,
      :endBlock => :query,
      :startDate => :query,
      :endDate => :query,
      :id => :query,
      :address => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/dapps/cow/users/historical")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowUserDto{}]}
    ])
  end

  @doc """
  Orders (current)
  Gets orders.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%CowOrderDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_orders__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowOrderDto.t)} | {:error, Tesla.Env.t}
  def cow_orders__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/cow/orders/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowOrderDto{}]}
    ])
  end

  @doc """
  Settlements (current)
  Gets settlements.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%CowSettlementDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_settlements__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowSettlementDto.t)} | {:error, Tesla.Env.t}
  def cow_settlements__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/cow/settlements/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowSettlementDto{}]}
    ])
  end

  @doc """
  Tokens (current)
  Gets tokens.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%CowTokenDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_tokens__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowTokenDto.t)} | {:error, Tesla.Env.t}
  def cow_tokens__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/cow/tokens/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowTokenDto{}]}
    ])
  end

  @doc """
  Trades (current)
  Gets trades.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%CowTradeDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_trades__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowTradeDto.t)} | {:error, Tesla.Env.t}
  def cow_trades__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/cow/trades/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowTradeDto{}]}
    ])
  end

  @doc """
  Users (current)
  Gets users.

  ### Parameters

  - `connection` (OnChainAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, [%CowUserDto{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec cow_users__current(Tesla.Env.client, keyword()) :: {:ok, list(OnChainAPI.Model.CowUserDto.t)} | {:error, Tesla.Env.t}
  def cow_users__current(connection, _opts \\ []) do
    request =
      %{}
      |> method(:get)
      |> url("/dapps/cow/users/current")
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%OnChainAPI.Model.CowUserDto{}]}
    ])
  end
end
