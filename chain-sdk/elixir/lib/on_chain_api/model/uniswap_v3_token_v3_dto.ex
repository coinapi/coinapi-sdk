# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainAPI.Model.UniswapV3TokenV3Dto do
  @moduledoc """
  Stores aggregated information for a specific token across all pairs that token is included in.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :vid,
    :id,
    :symbol,
    :name,
    :decimals,
    :total_supply,
    :volume,
    :volume_usd,
    :untracked_volume_usd,
    :fees_usd,
    :tx_count,
    :pool_count,
    :total_value_locked,
    :total_value_locked_usd,
    :total_value_locked_usd_untracked,
    :derived_eth,
    :whitelist_pools,
    :token_symbol
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :vid => integer() | nil,
    :id => String.t | nil,
    :symbol => String.t | nil,
    :name => String.t | nil,
    :decimals => integer() | nil,
    :total_supply => OnChainAPI.Model.NumericsBigInteger.t | nil,
    :volume => String.t | nil,
    :volume_usd => String.t | nil,
    :untracked_volume_usd => String.t | nil,
    :fees_usd => String.t | nil,
    :tx_count => OnChainAPI.Model.NumericsBigInteger.t | nil,
    :pool_count => OnChainAPI.Model.NumericsBigInteger.t | nil,
    :total_value_locked => String.t | nil,
    :total_value_locked_usd => String.t | nil,
    :total_value_locked_usd_untracked => String.t | nil,
    :derived_eth => String.t | nil,
    :whitelist_pools => [String.t] | nil,
    :token_symbol => String.t | nil
  }
end

defimpl Poison.Decoder, for: OnChainAPI.Model.UniswapV3TokenV3Dto do
  import OnChainAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:total_supply, :struct, OnChainAPI.Model.NumericsBigInteger, options)
    |> deserialize(:tx_count, :struct, OnChainAPI.Model.NumericsBigInteger, options)
    |> deserialize(:pool_count, :struct, OnChainAPI.Model.NumericsBigInteger, options)
  end
end

