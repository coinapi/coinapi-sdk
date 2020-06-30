# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OEML-RESTAPI.Api.Positions do
  @moduledoc """
  API calls for all endpoints tagged `Positions`.
  """

  alias OEML-RESTAPI.Connection
  import OEML-RESTAPI.RequestBuilder


  @doc """
  Get positions
  Returns all of your positions.

  ## Parameters

  - connection (OEML-RESTAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :exchange_id (String.t): Exchange name
  ## Returns

  {:ok, [%Position{}, ...]} on success
  {:error, info} on failure
  """
  @spec v1_positions_get(Tesla.Env.client, keyword()) :: {:ok, list(OEML-RESTAPI.Model.Position.t)} | {:error, Tesla.Env.t}
  def v1_positions_get(connection, opts \\ []) do
    optional_params = %{
      :"exchange_id" => :query
    }
    %{}
    |> method(:get)
    |> url("/v1/positions")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, [%OEML-RESTAPI.Model.Position{}]}
    ])
  end
end
