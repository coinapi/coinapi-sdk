=begin
#OEML - REST API

#This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

require 'date'
require 'time'

module OpenapiClient
  class OrdStatus
    RECEIVED = "RECEIVED".freeze
    ROUTING = "ROUTING".freeze
    ROUTED = "ROUTED".freeze
    NEW = "NEW".freeze
    PENDING_CANCEL = "PENDING_CANCEL".freeze
    PARTIALLY_FILLED = "PARTIALLY_FILLED".freeze
    FILLED = "FILLED".freeze
    CANCELED = "CANCELED".freeze
    REJECTED = "REJECTED".freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def self.build_from_hash(value)
      new.build_from_hash(value)
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = OrdStatus.constants.select { |c| OrdStatus::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #OrdStatus" if constantValues.empty?
      value
    end
  end
end
