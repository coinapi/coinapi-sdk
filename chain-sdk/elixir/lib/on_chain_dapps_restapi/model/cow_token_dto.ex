# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.CowTokenDto do
  @moduledoc """
  Stores information for a specific token across all pairs that token is included in.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :address,
    :first_trade_timestamp,
    :name,
    :symbol,
    :decimals,
    :total_volume,
    :vid,
    :token_symbol
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :address => String.t | nil,
    :first_trade_timestamp => String.t | nil,
    :name => String.t | nil,
    :symbol => String.t | nil,
    :decimals => integer() | nil,
    :total_volume => String.t | nil,
    :vid => integer() | nil,
    :token_symbol => String.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.CowTokenDto do
  def decode(value, _options) do
    value
  end
end

