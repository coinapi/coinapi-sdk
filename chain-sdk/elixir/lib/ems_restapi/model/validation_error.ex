# NOTE: This file is auto generated by OpenAPI Generator 6.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Model.ValidationError do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :type,
    :title,
    :status,
    :traceId,
    :errors
  ]

  @type t :: %__MODULE__{
    :type => String.t | nil,
    :title => String.t | nil,
    :status => float() | nil,
    :traceId => String.t | nil,
    :errors => String.t | nil
  }
end

defimpl Poison.Decoder, for: EMS-RESTAPI.Model.ValidationError do
  def decode(value, _options) do
    value
  end
end
