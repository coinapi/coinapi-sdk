# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.DexSolutionDto do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :batch,
    :solver,
    :fee_reward,
    :objective_value,
    :utility,
    :trades,
    :create_epoch,
    :revert_epoch,
    :tx_hash,
    :tx_log_index,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :batch => String.t | nil,
    :solver => String.t | nil,
    :fee_reward => String.t | nil,
    :objective_value => String.t | nil,
    :utility => String.t | nil,
    :trades => [String.t] | nil,
    :create_epoch => String.t | nil,
    :revert_epoch => String.t | nil,
    :tx_hash => String.t | nil,
    :tx_log_index => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.DexSolutionDto do
  def decode(value, _options) do
    value
  end
end

