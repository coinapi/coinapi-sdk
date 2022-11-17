# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Model.UniswapV2BurnDto do
  @moduledoc """
  Burn entities are created for every emitted Burn event on the Uniswap core contracts. The Burn entity stores key data about the event like token amounts, who burned LP tokens, who received tokens, and more. This entity can be used to track liquidity removals on pairs.
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
    :liquidity,
    :sender,
    :amount_0,
    :amount_1,
    :to,
    :log_index,
    :amount_usd,
    :needs_complete,
    :fee_to,
    :fee_liquidity,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :transaction => String.t | nil,
    :timestamp => String.t | nil,
    :pair => String.t | nil,
    :liquidity => String.t | nil,
    :sender => String.t | nil,
    :amount_0 => String.t | nil,
    :amount_1 => String.t | nil,
    :to => String.t | nil,
    :log_index => String.t | nil,
    :amount_usd => String.t | nil,
    :needs_complete => boolean() | nil,
    :fee_to => String.t | nil,
    :fee_liquidity => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainAPI.Model.UniswapV2BurnDto do
  def decode(value, _options) do
    value
  end
end

