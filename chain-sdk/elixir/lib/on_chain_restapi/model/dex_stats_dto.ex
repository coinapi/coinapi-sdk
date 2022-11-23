# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChain-RESTAPI.Model.DexStatsDto do
  @moduledoc """
  A type collecting global stats about this instance of Gnosis Protocol.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :volume_in_owl,
    :utility_in_owl,
    :owl_burnt,
    :settled_batch_count,
    :settled_trade_count,
    :listed_tokens,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :volume_in_owl => String.t | nil,
    :utility_in_owl => String.t | nil,
    :owl_burnt => String.t | nil,
    :settled_batch_count => integer() | nil,
    :settled_trade_count => integer() | nil,
    :listed_tokens => integer() | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChain-RESTAPI.Model.DexStatsDto do
  def decode(value, _options) do
    value
  end
end
