# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Model.UniswapV2LiquidityPositionSnapshotV2Dto do
  @moduledoc """
  This entity is used to store data about a user's liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :liquidity_position,
    :timestamp,
    :block,
    :user,
    :pair,
    :token_0_price_usd,
    :token_1_price_usd,
    :reserve_0,
    :reserve_1,
    :reserve_usd,
    :liquidity_token_total_supply,
    :liquidity_token_balance,
    :vid,
    :block_range
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :liquidity_position => String.t | nil,
    :timestamp => integer() | nil,
    :block => integer() | nil,
    :user => String.t | nil,
    :pair => String.t | nil,
    :token_0_price_usd => String.t | nil,
    :token_1_price_usd => String.t | nil,
    :reserve_0 => String.t | nil,
    :reserve_1 => String.t | nil,
    :reserve_usd => String.t | nil,
    :liquidity_token_total_supply => String.t | nil,
    :liquidity_token_balance => String.t | nil,
    :vid => integer() | nil,
    :block_range => String.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainAPI.Model.UniswapV2LiquidityPositionSnapshotV2Dto do
  def decode(value, _options) do
    value
  end
end

