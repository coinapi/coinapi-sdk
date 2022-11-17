# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Model.UniswapV2SwapDto do
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
    :pair,
    :sender,
    :from,
    :amount_0_in,
    :amount_1_in,
    :amount_0_out,
    :amount_1_out,
    :to,
    :log_index,
    :amount_usd,
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
    :pair => String.t | nil,
    :sender => String.t | nil,
    :from => String.t | nil,
    :amount_0_in => String.t | nil,
    :amount_1_in => String.t | nil,
    :amount_0_out => String.t | nil,
    :amount_1_out => String.t | nil,
    :to => String.t | nil,
    :log_index => OnChainAPI.Model.NumericsBigInteger.t | nil,
    :amount_usd => String.t | nil,
    :evaluated_price => float() | nil,
    :evaluated_amount => float() | nil,
    :evaluated_aggressor => OnChainAPI.Model.TransactionsETradeAggressiveSide.t | nil,
    :pool_id => String.t | nil,
    :transaction_id => String.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainAPI.Model.UniswapV2SwapDto do
  import OnChainAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:log_index, :struct, OnChainAPI.Model.NumericsBigInteger, options)
    |> deserialize(:evaluated_aggressor, :struct, OnChainAPI.Model.TransactionsETradeAggressiveSide, options)
  end
end

