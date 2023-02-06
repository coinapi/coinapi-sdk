# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.SushiswapSwapDto do
  @moduledoc """
  Swap are created for each token swap within a pair.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :transaction,
    :timestamp,
    :pair,
    :sender,
    :amount_0_in,
    :amount_1_in,
    :amount_0_out,
    :amount_1_out,
    :to,
    :log_index,
    :amount_usd,
    :vid,
    :pool_id,
    :transaction_id,
    :evaluated_price,
    :evaluated_amount,
    :evaluated_aggressor
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :transaction => String.t | nil,
    :timestamp => String.t | nil,
    :pair => String.t | nil,
    :sender => String.t | nil,
    :amount_0_in => String.t | nil,
    :amount_1_in => String.t | nil,
    :amount_0_out => String.t | nil,
    :amount_1_out => String.t | nil,
    :to => String.t | nil,
    :log_index => String.t | nil,
    :amount_usd => String.t | nil,
    :vid => integer() | nil,
    :pool_id => String.t | nil,
    :transaction_id => String.t | nil,
    :evaluated_price => float() | nil,
    :evaluated_amount => float() | nil,
    :evaluated_aggressor => OnChainDapps-RESTAPI.Model.TransactionsETradeAggressiveSide.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.SushiswapSwapDto do
  import OnChainDapps-RESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:evaluated_aggressor, :struct, OnChainDapps-RESTAPI.Model.TransactionsETradeAggressiveSide, options)
  end
end

