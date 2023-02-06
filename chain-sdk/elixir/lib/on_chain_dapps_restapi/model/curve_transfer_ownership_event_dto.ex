# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.CurveTransferOwnershipEventDto do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :pool,
    :new_admin,
    :block,
    :timestamp,
    :transaction,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :pool => String.t | nil,
    :new_admin => String.t | nil,
    :block => String.t | nil,
    :timestamp => String.t | nil,
    :transaction => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.CurveTransferOwnershipEventDto do
  def decode(value, _options) do
    value
  end
end

