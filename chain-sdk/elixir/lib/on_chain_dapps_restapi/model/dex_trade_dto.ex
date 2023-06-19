# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.DexTradeDto do
  @moduledoc """
  Trade for a single user, as part of a ring trade. It's part of the solution submitted by a solver for a given batch.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :order,
    :owner,
    :sell_volume,
    :buy_volume,
    :trade_batch_id,
    :trade_epoch,
    :buy_token,
    :sell_token,
    :create_epoch,
    :revert_epoch,
    :tx_hash,
    :tx_log_index,
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
    :order => String.t | nil,
    :owner => String.t | nil,
    :sell_volume => String.t | nil,
    :buy_volume => String.t | nil,
    :trade_batch_id => String.t | nil,
    :trade_epoch => String.t | nil,
    :buy_token => String.t | nil,
    :sell_token => String.t | nil,
    :create_epoch => String.t | nil,
    :revert_epoch => String.t | nil,
    :tx_hash => String.t | nil,
    :tx_log_index => String.t | nil,
    :vid => integer() | nil,
    :pool_id => String.t | nil,
    :transaction_id => String.t | nil,
    :evaluated_price => float() | nil,
    :evaluated_amount => float() | nil,
    :evaluated_aggressor => OnChainDapps-RESTAPI.Model.TransactionsETradeAggressiveSide.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.DexTradeDto do
  import OnChainDapps-RESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:evaluated_aggressor, :struct, OnChainDapps-RESTAPI.Model.TransactionsETradeAggressiveSide, options)
  end
end

