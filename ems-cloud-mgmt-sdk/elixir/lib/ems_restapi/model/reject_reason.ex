# NOTE: This file is auto generated by OpenAPI Generator 6.3.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Model.RejectReason do
  @moduledoc """
  Cause of rejection.
  """

  @derive [Poison.Encoder]
  defstruct [
    
  ]

  @type t :: %__MODULE__{
    
  }
end

defimpl Poison.Decoder, for: EMS-RESTAPI.Model.RejectReason do
  def decode(value, _options) do
    value
  end
end

