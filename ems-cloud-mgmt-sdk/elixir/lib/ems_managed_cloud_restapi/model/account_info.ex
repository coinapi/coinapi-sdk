# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule EMS-ManagedCloudRESTAPI.Model.AccountInfo do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"exchange_id"
  ]

  @type t :: %__MODULE__{
    :"exchange_id" => String.t | nil
  }
end

defimpl Poison.Decoder, for: EMS-ManagedCloudRESTAPI.Model.AccountInfo do
  def decode(value, _options) do
    value
  end
end
