# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Model.MessageError do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :message
  ]

  @type t :: %__MODULE__{
    :message => String.t | nil
  }
end

defimpl Poison.Decoder, for: EMS-RESTAPI.Model.MessageError do
  def decode(value, _options) do
    value
  end
end

