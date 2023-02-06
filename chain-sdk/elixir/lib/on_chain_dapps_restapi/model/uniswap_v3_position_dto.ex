# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OnChainDapps-RESTAPI.Model.UniswapV3PositionDto do
  @moduledoc """
  Positions created through NonfungiblePositionManager. Positions are represented as NFTs (ERC-721 tokens) as opposed to the fungible ERC-20 tokens on Uniswap V1 and V2.
  """

  @derive [Poison.Encoder]
  defstruct [
    :entry_time,
    :recv_time,
    :block_number,
    :id,
    :owner,
    :pool,
    :token_0,
    :token_1,
    :tick_lower,
    :tick_upper,
    :liquidity,
    :deposited_token_0,
    :deposited_token_1,
    :withdrawn_token_0,
    :withdrawn_token_1,
    :collected_fees_token_0,
    :collected_fees_token_1,
    :transaction,
    :fee_growth_inside_0_last_x128,
    :fee_growth_inside_1_last_x128,
    :vid
  ]

  @type t :: %__MODULE__{
    :entry_time => DateTime.t | nil,
    :recv_time => DateTime.t | nil,
    :block_number => integer() | nil,
    :id => String.t | nil,
    :owner => String.t | nil,
    :pool => String.t | nil,
    :token_0 => String.t | nil,
    :token_1 => String.t | nil,
    :tick_lower => String.t | nil,
    :tick_upper => String.t | nil,
    :liquidity => String.t | nil,
    :deposited_token_0 => String.t | nil,
    :deposited_token_1 => String.t | nil,
    :withdrawn_token_0 => String.t | nil,
    :withdrawn_token_1 => String.t | nil,
    :collected_fees_token_0 => String.t | nil,
    :collected_fees_token_1 => String.t | nil,
    :transaction => String.t | nil,
    :fee_growth_inside_0_last_x128 => String.t | nil,
    :fee_growth_inside_1_last_x128 => String.t | nil,
    :vid => integer() | nil
  }
end

defimpl Poison.Decoder, for: OnChainDapps-RESTAPI.Model.UniswapV3PositionDto do
  def decode(value, _options) do
    value
  end
end

