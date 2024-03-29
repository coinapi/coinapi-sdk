# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.UniswapV2MintDto do
  @moduledoc """
  Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, who received the liquidity, and more. This entity can be used to track liquidity provisions on pairs.
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
    :to,
    :liquidity,
    :sender,
    :amount_0,
    :amount_1,
    :log_index,
    :amount_usd,
    :fee_to,
    :fee_liquidity,
    :vid,
    :block_range
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :transaction => String.t | nil,
    :timestamp => String.t | nil,
    :pair => String.t | nil,
    :to => String.t | nil,
    :liquidity => String.t | nil,
    :sender => String.t | nil,
    :amount_0 => String.t | nil,
    :amount_1 => String.t | nil,
    :log_index => String.t | nil,
    :amount_usd => String.t | nil,
    :fee_to => String.t | nil,
    :fee_liquidity => String.t | nil,
    :vid => integer() | nil,
    :block_range => String.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.UniswapV2MintDto do
  def decode(value, _options) do
    value
  end
end

