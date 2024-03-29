# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.CowSettlementDto do
  @moduledoc """
  A settlement comprises a list of traded tokens with their corresponding price in the batch.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :solver,
    :tx_hash,
    :first_trade_timestamp,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :solver => String.t | nil,
    :tx_hash => String.t | nil,
    :first_trade_timestamp => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.CowSettlementDto do
  def decode(value, _options) do
    value
  end
end

