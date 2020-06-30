# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule OEML-RESTAPI.Model.Messages do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"type",
    :"exchange_id",
    :"message"
  ]

  @type t :: %__MODULE__{
    :"type" => String.t | nil,
    :"exchange_id" => String.t | nil,
    :"message" => String.t | nil
  }
end

defimpl Poison.Decoder, for: OEML-RESTAPI.Model.Messages do
  def decode(value, _options) do
    value
  end
end

