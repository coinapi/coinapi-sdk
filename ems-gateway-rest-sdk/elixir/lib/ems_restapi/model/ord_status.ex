# NOTE: This file is auto generated by OpenAPI Generator 6.2.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule EMS-RESTAPI.Model.OrdStatus do
  @moduledoc """
  Order statuses and the lifecycle are documented in the separate section: <a href=\"#ems-order-lifecycle\">EMS / Starter Guide / Order Lifecycle</a> 
  """

  @derive [Poison.Encoder]
  defstruct [
    
  ]

  @type t :: %__MODULE__{
    
  }
end

defimpl Poison.Decoder, for: EMS-RESTAPI.Model.OrdStatus do
  def decode(value, _options) do
    value
  end
end

