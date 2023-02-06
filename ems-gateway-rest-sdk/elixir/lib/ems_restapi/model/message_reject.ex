# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Model.MessageReject do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :type,
    :reject_reason,
    :exchange_id,
    :message,
    :rejected_message
  ]

  @type t :: %__MODULE__{
    :type => String.t | nil,
    :reject_reason => EMS-RESTAPI.Model.RejectReason.t | nil,
    :exchange_id => String.t | nil,
    :message => String.t | nil,
    :rejected_message => String.t | nil
  }
end

defimpl Poison.Decoder, for: EMS-RESTAPI.Model.MessageReject do
  import EMS-RESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:reject_reason, :struct, EMS-RESTAPI.Model.RejectReason, options)
  end
end

