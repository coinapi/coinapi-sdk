# NOTE: This file is auto generated by OpenAPI Generator 6.4.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.CowOrderDto do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :owner,
    :trades_timestamp,
    :invalidate_timestamp,
    :presign_timestamp,
    :is_signed,
    :is_valid,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :owner => String.t | nil,
    :trades_timestamp => String.t | nil,
    :invalidate_timestamp => String.t | nil,
    :presign_timestamp => String.t | nil,
    :is_signed => boolean() | nil,
    :is_valid => boolean() | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.CowOrderDto do
  def decode(value, _options) do
    value
  end
end

