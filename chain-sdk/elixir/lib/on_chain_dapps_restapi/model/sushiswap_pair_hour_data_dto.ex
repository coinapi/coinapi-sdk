# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.SushiswapPairHourDataDto do
  @moduledoc """
  Tracks pair data across each hour.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :date,
    :pair,
    :reserve_0,
    :reserve_1,
    :reserve_usd,
    :volume_token_0,
    :volume_token_1,
    :volume_usd,
    :tx_count,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :date => integer() | nil,
    :pair => String.t | nil,
    :reserve_0 => String.t | nil,
    :reserve_1 => String.t | nil,
    :reserve_usd => String.t | nil,
    :volume_token_0 => String.t | nil,
    :volume_token_1 => String.t | nil,
    :volume_usd => String.t | nil,
    :tx_count => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.SushiswapPairHourDataDto do
  def decode(value, _options) do
    value
  end
end

