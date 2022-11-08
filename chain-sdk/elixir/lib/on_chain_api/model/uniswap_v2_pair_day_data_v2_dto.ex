# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Model.UniswapV2PairDayDataV2Dto do
  @moduledoc """
  Tracks pair data across each day.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :date,
    :pair_address,
    :token_0,
    :token_1,
    :reserve_0,
    :reserve_1,
    :total_supply,
    :reserve_usd,
    :daily_volume_token_0,
    :daily_volume_token_1,
    :daily_volume_usd,
    :daily_txns,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :date => integer() | nil,
    :pair_address => String.t | nil,
    :token_0 => String.t | nil,
    :token_1 => String.t | nil,
    :reserve_0 => String.t | nil,
    :reserve_1 => String.t | nil,
    :total_supply => String.t | nil,
    :reserve_usd => String.t | nil,
    :daily_volume_token_0 => String.t | nil,
    :daily_volume_token_1 => String.t | nil,
    :daily_volume_usd => String.t | nil,
    :daily_txns => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainAPI.Model.UniswapV2PairDayDataV2Dto do
  def decode(value, _options) do
    value
  end
end

