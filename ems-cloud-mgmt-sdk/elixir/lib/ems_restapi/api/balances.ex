# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Api.Balances do
  @moduledoc """
  API calls for all endpoints tagged `Balances`.
  """

  alias EMS-RESTAPI.Connection
  import EMS-RESTAPI.RequestBuilder

  @doc """
  Get balances
  Get current currency balance from all or single exchange.

  ### Parameters

  - `connection` (EMS-RESTAPI.Connection): Connection to server
  - `opts` (keyword): Optional parameters
    - `:exchange_id` (String.t): Filter the balances to the specific exchange.

  ### Returns

  - `{:ok, [%Balance{}, ...]}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec v1_balances_get(Tesla.Env.client, keyword()) :: {:ok, list(EMS-RESTAPI.Model.Balance.t)} | {:ok, EMS-RESTAPI.Model.MessageReject.t} | {:error, Tesla.Env.t}
  def v1_balances_get(connection, opts \\ []) do
    optional_params = %{
      :exchange_id => :query
    }

    request =
      %{}
      |> method(:get)
      |> url("/v1/balances")
      |> add_optional_params(optional_params, opts)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, [%EMS-RESTAPI.Model.Balance{}]},
      {490, %EMS-RESTAPI.Model.MessageReject{}}
    ])
  end
end
