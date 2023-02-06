# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Model.OrderExecutionReportAllOf do
  @moduledoc """
  The order execution report message.
  """

  @derive [Poison.Encoder]
  defstruct [
    :client_order_id_format_exchange,
    :exchange_order_id,
    :amount_open,
    :amount_filled,
    :avg_px,
    :status,
    :status_history,
    :error_message,
    :fills
  ]

  @type t :: %__MODULE__{
    :client_order_id_format_exchange => String.t,
    :exchange_order_id => String.t | nil,
    :amount_open => float(),
    :amount_filled => float(),
    :avg_px => float() | nil,
    :status => EMS-RESTAPI.Model.OrdStatus.t,
    :status_history => [[String.t]] | nil,
    :error_message => String.t | nil,
    :fills => [EMS-RESTAPI.Model.Fills.t] | nil
  }
end

defimpl Poison.Decoder, for: EMS-RESTAPI.Model.OrderExecutionReportAllOf do
  import EMS-RESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:status, :struct, EMS-RESTAPI.Model.OrdStatus, options)
    |> deserialize(:fills, :list, EMS-RESTAPI.Model.Fills, options)
  end
end

