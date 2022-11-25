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
  # Swap are created for each token swap within a pair.
  class SushiswapSwapDTO
    attr_accessor :entry_time

    attr_accessor :recv_time

    # Number of block in which entity was recorded.
    attr_accessor :block_number

    # Transaction hash plus index in Transaction swap array.
    attr_accessor :id

    # Reference to transaction swap was included in.
    attr_accessor :transaction

    # Timestamp of swap, used for sorted lookups.
    attr_accessor :timestamp

    # Reference to pair.
    attr_accessor :pair

    # Address that initiated the swap.
    attr_accessor :sender

    # Amount of token0 sold.
    attr_accessor :amount_0_in

    # Amount of token1 sold.
    attr_accessor :amount_1_in

    # Amount of token0 received.
    attr_accessor :amount_0_out

    # Amount of token1 received.
    attr_accessor :amount_1_out

    # Recipient of output tokens.
    attr_accessor :to

    # Event index within transaction.
    attr_accessor :log_index

    # Derived amount of tokens sold in USD.
    attr_accessor :amount_usd

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
        :'transaction' => :'transaction',
        :'timestamp' => :'timestamp',
        :'pair' => :'pair',
        :'sender' => :'sender',
        :'amount_0_in' => :'amount_0_in',
        :'amount_1_in' => :'amount_1_in',
        :'amount_0_out' => :'amount_0_out',
        :'amount_1_out' => :'amount_1_out',
        :'to' => :'to',
        :'log_index' => :'log_index',
        :'amount_usd' => :'amount_usd',
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
        :'transaction' => :'String',
        :'timestamp' => :'String',
        :'pair' => :'String',
        :'sender' => :'String',
        :'amount_0_in' => :'String',
        :'amount_1_in' => :'String',
        :'amount_0_out' => :'String',
        :'amount_1_out' => :'String',
        :'to' => :'String',
        :'log_index' => :'String',
        :'amount_usd' => :'String',
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
        :'transaction',
        :'timestamp',
        :'pair',
        :'sender',
        :'amount_0_in',
        :'amount_1_in',
        :'amount_0_out',
        :'amount_1_out',
        :'to',
        :'log_index',
        :'amount_usd',
        :'pool_id',
        :'transaction_id',
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::SushiswapSwapDTO` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::SushiswapSwapDTO`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
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

      if attributes.key?(:'transaction')
        self.transaction = attributes[:'transaction']
      end

      if attributes.key?(:'timestamp')
        self.timestamp = attributes[:'timestamp']
      end

      if attributes.key?(:'pair')
        self.pair = attributes[:'pair']
      end

      if attributes.key?(:'sender')
        self.sender = attributes[:'sender']
      end

      if attributes.key?(:'amount_0_in')
        self.amount_0_in = attributes[:'amount_0_in']
      end

      if attributes.key?(:'amount_1_in')
        self.amount_1_in = attributes[:'amount_1_in']
      end

      if attributes.key?(:'amount_0_out')
        self.amount_0_out = attributes[:'amount_0_out']
      end

      if attributes.key?(:'amount_1_out')
        self.amount_1_out = attributes[:'amount_1_out']
      end

      if attributes.key?(:'to')
        self.to = attributes[:'to']
      end

      if attributes.key?(:'log_index')
        self.log_index = attributes[:'log_index']
      end

      if attributes.key?(:'amount_usd')
        self.amount_usd = attributes[:'amount_usd']
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
          transaction == o.transaction &&
          timestamp == o.timestamp &&
          pair == o.pair &&
          sender == o.sender &&
          amount_0_in == o.amount_0_in &&
          amount_1_in == o.amount_1_in &&
          amount_0_out == o.amount_0_out &&
          amount_1_out == o.amount_1_out &&
          to == o.to &&
          log_index == o.log_index &&
          amount_usd == o.amount_usd &&
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
      [entry_time, recv_time, block_number, id, transaction, timestamp, pair, sender, amount_0_in, amount_1_in, amount_0_out, amount_1_out, to, log_index, amount_usd, vid, pool_id, transaction_id, evaluated_price, evaluated_amount, evaluated_aggressor].hash
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
