# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Model.CurveRemoveLiquidityOneEventDto do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :pool,
    :provider,
    :token_amount,
    :coin_amount,
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
    :provider => String.t | nil,
    :token_amount => String.t | nil,
    :coin_amount => String.t | nil,
    :block => String.t | nil,
    :timestamp => String.t | nil,
    :transaction => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainAPI.Model.CurveRemoveLiquidityOneEventDto do
  def decode(value, _options) do
    value
  end
end

