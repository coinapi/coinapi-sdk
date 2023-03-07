# NOTE: This file is auto generated by OpenAPI Generator 6.4.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.CurveGaugeDto do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :address,
    :type,
    :pool,
    :created,
    :created_at_block,
    :created_at_transaction,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :address => String.t | nil,
    :type => String.t | nil,
    :pool => String.t | nil,
    :created => String.t | nil,
    :created_at_block => String.t | nil,
    :created_at_transaction => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.CurveGaugeDto do
  def decode(value, _options) do
    value
  end
end

