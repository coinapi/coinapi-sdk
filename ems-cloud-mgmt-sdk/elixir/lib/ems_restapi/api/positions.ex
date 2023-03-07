# NOTE: This file is auto generated by OpenAPI Generator 6.4.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Api.Positions do
  @moduledoc """
  API calls for all endpoints tagged `Positions`.
  """

  alias EMS-RESTAPI.Connection
  import EMS-RESTAPI.RequestBuilder

  @doc """
  Get open positions
  Get current open positions across all or single exchange.

  ### Parameters

  - `connection` (EMS-RESTAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:exchange_id` (String.t): Filter the balances to the specific exchange.

  ### Returns

  - `{:ok, [%Position{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec v1_positions_get(Tesla.Env.client, keyword()) :: {:ok, list(EMS-RESTAPI.Model.Position.t)} | {:ok, EMS-RESTAPI.Model.MessageReject.t} | {:error, Tesla.Env.t}
  def v1_positions_get(connection, opts \\ []) do
    optional_params = %{
      :exchange_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/v1/positions")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%EMS-RESTAPI.Model.Position{}]},
      {490, %EMS-RESTAPI.Model.MessageReject{}}
    ])
  end
end
