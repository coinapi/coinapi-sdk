=begin
#On Chain Dapps - REST API

# This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.4.0

=end

require 'date'
require 'time'

module OpenapiClient
  # Tracks pair data across each hour.
  class SushiswapPairHourDataDTO
    attr_accessor :entry_time

    attr_accessor :recv_time

    # Number of block in which entity was recorded.
    attr_accessor :block_number

    # Identifier, format: (pair id)-(hour start timestamp).
    attr_accessor :id

    # Hour start timestamp.
    attr_accessor :date

    # Reference to pair.
    attr_accessor :pair

    # Reserve of token0 (updated during each transaction on pair).
    attr_accessor :reserve_0

    # Reserve of token1 (updated during each transaction on pair).
    attr_accessor :reserve_1

    # Reserve of token0 plus token1 stored as a derived USD amount.
    attr_accessor :reserve_usd

    # Total amount of token0 swapped throughout hour.
    attr_accessor :volume_token_0

    # Total amount of token1 swapped throughout hour.
    attr_accessor :volume_token_1

    # Total volume within pair throughout hour.
    attr_accessor :volume_usd

    # Amount of transactions on pair throughout hour.
    attr_accessor :tx_count

    # 
    attr_accessor :vid

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'entry_time' => :'entry_time',
        :'recv_time' => :'recv_time',
        :'block_number' => :'block_number',
        :'id' => :'id',
        :'date' => :'date',
        :'pair' => :'pair',
        :'reserve_0' => :'reserve_0',
        :'reserve_1' => :'reserve_1',
        :'reserve_usd' => :'reserve_usd',
        :'volume_token_0' => :'volume_token_0',
        :'volume_token_1' => :'volume_token_1',
        :'volume_usd' => :'volume_usd',
        :'tx_count' => :'tx_count',
        :'vid' => :'vid'
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
        :'date' => :'Integer',
        :'pair' => :'String',
        :'reserve_0' => :'String',
        :'reserve_1' => :'String',
        :'reserve_usd' => :'String',
        :'volume_token_0' => :'String',
        :'volume_token_1' => :'String',
        :'volume_usd' => :'String',
        :'tx_count' => :'String',
        :'vid' => :'Integer'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'id',
        :'pair',
        :'reserve_0',
        :'reserve_1',
        :'reserve_usd',
        :'volume_token_0',
        :'volume_token_1',
        :'volume_usd',
        :'tx_count',
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::SushiswapPairHourDataDTO` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::SushiswapPairHourDataDTO`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
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

      if attributes.key?(:'date')
        self.date = attributes[:'date']
      end

      if attributes.key?(:'pair')
        self.pair = attributes[:'pair']
      end

      if attributes.key?(:'reserve_0')
        self.reserve_0 = attributes[:'reserve_0']
      end

      if attributes.key?(:'reserve_1')
        self.reserve_1 = attributes[:'reserve_1']
      end

      if attributes.key?(:'reserve_usd')
        self.reserve_usd = attributes[:'reserve_usd']
      end

      if attributes.key?(:'volume_token_0')
        self.volume_token_0 = attributes[:'volume_token_0']
      end

      if attributes.key?(:'volume_token_1')
        self.volume_token_1 = attributes[:'volume_token_1']
      end

      if attributes.key?(:'volume_usd')
        self.volume_usd = attributes[:'volume_usd']
      end

      if attributes.key?(:'tx_count')
        self.tx_count = attributes[:'tx_count']
      end

      if attributes.key?(:'vid')
        self.vid = attributes[:'vid']
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
          date == o.date &&
          pair == o.pair &&
          reserve_0 == o.reserve_0 &&
          reserve_1 == o.reserve_1 &&
          reserve_usd == o.reserve_usd &&
          volume_token_0 == o.volume_token_0 &&
          volume_token_1 == o.volume_token_1 &&
          volume_usd == o.volume_usd &&
          tx_count == o.tx_count &&
          vid == o.vid
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [entry_time, recv_time, block_number, id, date, pair, reserve_0, reserve_1, reserve_usd, volume_token_0, volume_token_1, volume_usd, tx_count, vid].hash
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
