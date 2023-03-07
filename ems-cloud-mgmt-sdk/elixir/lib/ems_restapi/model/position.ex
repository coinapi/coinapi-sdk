# NOTE: This file is auto generated by OpenAPI Generator 6.4.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Model.Position do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :exchange_id,
    :data
  ]

  @type t :: %__MODULE__{
    :exchange_id => String.t | nil,
    :data => [EMS-RESTAPI.Model.PositionDataInner.t] | nil
  }
end

defimpl Poison.Decoder, for: EMS-RESTAPI.Model.Position do
  import EMS-RESTAPI.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:data, :list, EMS-RESTAPI.Model.PositionDataInner, options)
  end
end

