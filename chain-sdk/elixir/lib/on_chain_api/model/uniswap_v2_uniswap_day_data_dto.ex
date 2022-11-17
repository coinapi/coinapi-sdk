# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Model.UniswapV2UniswapDayDataDto do
  @moduledoc """
  Tracks data across all pairs aggregated into a daily bucket.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :date,
    :daily_volume_eth,
    :daily_volume_usd,
    :daily_volume_untracked,
    :total_volume_eth,
    :total_liquidity_eth,
    :total_volume_usd,
    :total_liquidity_usd,
    :tx_count,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :date => integer() | nil,
    :daily_volume_eth => String.t | nil,
    :daily_volume_usd => String.t | nil,
    :daily_volume_untracked => String.t | nil,
    :total_volume_eth => String.t | nil,
    :total_liquidity_eth => String.t | nil,
    :total_volume_usd => String.t | nil,
    :total_liquidity_usd => String.t | nil,
    :tx_count => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainAPI.Model.UniswapV2UniswapDayDataDto do
  def decode(value, _options) do
    value
  end
end

