# NOTE: This file is auto generated by OpenAPI Generator 6.4.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.DexDepositDto do
  @moduledoc """
  Deposit of an user.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :user,
    :token_address,
    :amount,
    :batch_id,
    :create_epoch,
    :tx_hash,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :user => String.t | nil,
    :token_address => String.t | nil,
    :amount => String.t | nil,
    :batch_id => String.t | nil,
    :create_epoch => String.t | nil,
    :tx_hash => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.DexDepositDto do
  def decode(value, _options) do
    value
  end
end

