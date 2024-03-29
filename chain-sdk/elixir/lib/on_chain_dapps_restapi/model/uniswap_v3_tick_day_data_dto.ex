# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.UniswapV3TickDayDataDto do
  @moduledoc """
  Data accumulated and condensed into day stats for each exchange. Entity gets saved only if there is a change during the day
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :date,
    :pool,
    :tick,
    :liquidity_gross,
    :liquidity_net,
    :volume_token_0,
    :volume_token_1,
    :volume_usd,
    :fees_usd,
    :fee_growth_outside_0x128,
    :fee_growth_outside_1x128,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :date => integer() | nil,
    :pool => String.t | nil,
    :tick => String.t | nil,
    :liquidity_gross => String.t | nil,
    :liquidity_net => String.t | nil,
    :volume_token_0 => String.t | nil,
    :volume_token_1 => String.t | nil,
    :volume_usd => String.t | nil,
    :fees_usd => String.t | nil,
    :fee_growth_outside_0x128 => String.t | nil,
    :fee_growth_outside_1x128 => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.UniswapV3TickDayDataDto do
  def decode(value, _options) do
    value
  end
end

