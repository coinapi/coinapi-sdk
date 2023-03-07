# NOTE: This file is auto generated by OpenAPI Generator 6.4.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.UniswapV3SwapDto do
  @moduledoc """
  Swap are created for each token swap within a pair.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :vid,
    :id,
    :transaction,
    :timestamp,
    :pool,
    :token_0,
    :token_1,
    :sender,
    :recipient,
    :origin,
    :amount_0,
    :amount_1,
    :amount_usd,
    :sqrt_price_x96,
    :tick,
    :log_index,
    :evaluated_price,
    :evaluated_amount,
    :evaluated_aggressor,
    :pool_id,
    :transaction_id
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :vid => integer() | nil,
    :id => String.t | nil,
    :transaction => String.t | nil,
    :timestamp => DateTime.t | nil,
    :pool => String.t | nil,
    :token_0 => String.t | nil,
    :token_1 => String.t | nil,
    :sender => String.t | nil,
    :recipient => String.t | nil,
    :origin => String.t | nil,
    :amount_0 => String.t | nil,
    :amount_1 => String.t | nil,
    :amount_usd => String.t | nil,
    :sqrt_price_x96 => OnChainDapps-RESTAPI.Model.NumericsBigInteger.t | nil,
    :tick => OnChainDapps-RESTAPI.Model.NumericsBigInteger.t | nil,
    :log_index => OnChainDapps-RESTAPI.Model.NumericsBigInteger.t | nil,
    :evaluated_price => float() | nil,
    :evaluated_amount => float() | nil,
    :evaluated_aggressor => OnChainDapps-RESTAPI.Model.TransactionsETradeAggressiveSide.t | nil,
    :pool_id => String.t | nil,
    :transaction_id => String.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.UniswapV3SwapDto do
  import OnChainDapps-RESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:sqrt_price_x96, :struct, OnChainDapps-RESTAPI.Model.NumericsBigInteger, options)
    |> deserialize(:tick, :struct, OnChainDapps-RESTAPI.Model.NumericsBigInteger, options)
    |> deserialize(:log_index, :struct, OnChainDapps-RESTAPI.Model.NumericsBigInteger, options)
    |> deserialize(:evaluated_aggressor, :struct, OnChainDapps-RESTAPI.Model.TransactionsETradeAggressiveSide, options)
  end
end

