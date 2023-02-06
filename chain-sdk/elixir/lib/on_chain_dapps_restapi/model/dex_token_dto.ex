# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.DexTokenDto do
  @moduledoc """
  Registered token.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :address,
    :from_batch_id,
    :symbol,
    :decimals,
    :name,
    :sell_volume,
    :create_epoch,
    :tx_hash,
    :vid,
    :token_symbol
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :address => String.t | nil,
    :from_batch_id => String.t | nil,
    :symbol => String.t | nil,
    :decimals => String.t | nil,
    :name => String.t | nil,
    :sell_volume => String.t | nil,
    :create_epoch => String.t | nil,
    :tx_hash => String.t | nil,
    :vid => integer() | nil,
    :token_symbol => String.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.DexTokenDto do
  def decode(value, _options) do
    value
  end
end

