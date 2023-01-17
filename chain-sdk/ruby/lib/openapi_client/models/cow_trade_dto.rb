=begin
#On Chain Dapps - REST API

# This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.2.1

=end

require 'date'
require 'time'

module OpenapiClient
  # Trade entity.
  class CowTradeDTO
    attr_accessor :entry_time

    attr_accessor :recv_time

    # Number of block in which entity was recorded.
    attr_accessor :block_number

    # Identifier, format: (order id)|(transaction hash)|(event index).
    attr_accessor :id

    # Block's timestamp.
    attr_accessor :timestamp

    # Transaction's gas price.
    attr_accessor :gas_price

    # Transaction's gas limit.
    attr_accessor :gas_limit

    # Trade's fee amount.
    attr_accessor :fee_amount

    # Trade event transaction hash.
    attr_accessor :tx_hash

    # Reference to settlement.
    attr_accessor :settlement

    # Buy amount.
    attr_accessor :buy_amount

    # Sell amount.
    attr_accessor :sell_amount

    # Address of token that is sold.
    attr_accessor :sell_token

    # Address of token that is bought.
    attr_accessor :buy_token

    # Reference to order.
    attr_accessor :order

    # 
    attr_accessor :vid

    attr_accessor :pool_id

    attr_accessor :transaction_id

    attr_accessor :evaluated_price

    attr_accessor :evaluated_amount

    attr_accessor :evaluated_aggressor

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'entry_time' => :'entry_time',
        :'recv_time' => :'recv_time',
        :'block_number' => :'block_number',
        :'id' => :'id',
        :'timestamp' => :'timestamp',
        :'gas_price' => :'gas_price',
        :'gas_limit' => :'gas_limit',
        :'fee_amount' => :'fee_amount',
        :'tx_hash' => :'tx_hash',
        :'settlement' => :'settlement',
        :'buy_amount' => :'buy_amount',
        :'sell_amount' => :'sell_amount',
        :'sell_token' => :'sell_token',
        :'buy_token' => :'buy_token',
        :'order' => :'order',
        :'vid' => :'vid',
        :'pool_id' => :'pool_id',
        :'transaction_id' => :'transaction_id',
        :'evaluated_price' => :'evaluated_price',
        :'evaluated_amount' => :'evaluated_amount',
        :'evaluated_aggressor' => :'evaluated_aggressor'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'entry_time' => :'Time',
        :'recv_time' => :'Time',
        :'block_number' => :'Integer',
        :'id' => :'String',
        :'timestamp' => :'String',
        :'gas_price' => :'String',
        :'gas_limit' => :'String',
        :'fee_amount' => :'String',
        :'tx_hash' => :'String',
        :'settlement' => :'String',
        :'buy_amount' => :'String',
        :'sell_amount' => :'String',
        :'sell_token' => :'String',
        :'buy_token' => :'String',
        :'order' => :'String',
        :'vid' => :'Integer',
        :'pool_id' => :'String',
        :'transaction_id' => :'String',
        :'evaluated_price' => :'Float',
        :'evaluated_amount' => :'Float',
        :'evaluated_aggressor' => :'TransactionsETradeAggressiveSide'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'id',
        :'timestamp',
        :'gas_price',
        :'gas_limit',
        :'fee_amount',
        :'tx_hash',
        :'settlement',
        :'buy_amount',
        :'sell_amount',
        :'sell_token',
        :'buy_token',
        :'order',
        :'pool_id',
        :'transaction_id',
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::CowTradeDTO` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::CowTradeDTO`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'entry_time')
        self.entry_time = attributes[:'entry_time']
      end

      if attributes.key?(:'recv_time')
        self.recv_time = attributes[:'recv_time']
      end

      if attributes.key?(:'block_number')
        self.block_number = attributes[:'block_number']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'timestamp')
        self.timestamp = attributes[:'timestamp']
      end

      if attributes.key?(:'gas_price')
        self.gas_price = attributes[:'gas_price']
      end

      if attributes.key?(:'gas_limit')
        self.gas_limit = attributes[:'gas_limit']
      end

      if attributes.key?(:'fee_amount')
        self.fee_amount = attributes[:'fee_amount']
      end

      if attributes.key?(:'tx_hash')
        self.tx_hash = attributes[:'tx_hash']
      end

      if attributes.key?(:'settlement')
        self.settlement = attributes[:'settlement']
      end

      if attributes.key?(:'buy_amount')
        self.buy_amount = attributes[:'buy_amount']
      end

      if attributes.key?(:'sell_amount')
        self.sell_amount = attributes[:'sell_amount']
      end

      if attributes.key?(:'sell_token')
        self.sell_token = attributes[:'sell_token']
      end

      if attributes.key?(:'buy_token')
        self.buy_token = attributes[:'buy_token']
      end

      if attributes.key?(:'order')
        self.order = attributes[:'order']
      end

      if attributes.key?(:'vid')
        self.vid = attributes[:'vid']
      end

      if attributes.key?(:'pool_id')
        self.pool_id = attributes[:'pool_id']
      end

      if attributes.key?(:'transaction_id')
        self.transaction_id = attributes[:'transaction_id']
      end

      if attributes.key?(:'evaluated_price')
        self.evaluated_price = attributes[:'evaluated_price']
      end

      if attributes.key?(:'evaluated_amount')
        self.evaluated_amount = attributes[:'evaluated_amount']
      end

      if attributes.key?(:'evaluated_aggressor')
        self.evaluated_aggressor = attributes[:'evaluated_aggressor']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          entry_time == o.entry_time &&
          recv_time == o.recv_time &&
          block_number == o.block_number &&
          id == o.id &&
          timestamp == o.timestamp &&
          gas_price == o.gas_price &&
          gas_limit == o.gas_limit &&
          fee_amount == o.fee_amount &&
          tx_hash == o.tx_hash &&
          settlement == o.settlement &&
          buy_amount == o.buy_amount &&
          sell_amount == o.sell_amount &&
          sell_token == o.sell_token &&
          buy_token == o.buy_token &&
          order == o.order &&
          vid == o.vid &&
          pool_id == o.pool_id &&
          transaction_id == o.transaction_id &&
          evaluated_price == o.evaluated_price &&
          evaluated_amount == o.evaluated_amount &&
          evaluated_aggressor == o.evaluated_aggressor
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [entry_time, recv_time, block_number, id, timestamp, gas_price, gas_limit, fee_amount, tx_hash, settlement, buy_amount, sell_amount, sell_token, buy_token, order, vid, pool_id, transaction_id, evaluated_price, evaluated_amount, evaluated_aggressor].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenapiClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
