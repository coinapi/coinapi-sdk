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
  class CRYPTOPUNKSTradeDTO
    attr_accessor :entry_time

    attr_accessor :recv_time

    # 
    attr_accessor :block_number

    # 
    attr_accessor :vid

    # 
    attr_accessor :block_range

    # 
    attr_accessor :id

    # 
    attr_accessor :transaction_hash

    # 
    attr_accessor :log_index

    # 
    attr_accessor :timestamp

    # 
    attr_accessor :is_bundle

    # 
    attr_accessor :collection

    # 
    attr_accessor :token_id

    # 
    attr_accessor :amount

    # 
    attr_accessor :price_eth

    # 
    attr_accessor :buyer

    # 
    attr_accessor :seller

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'entry_time' => :'entry_time',
        :'recv_time' => :'recv_time',
        :'block_number' => :'block_number',
        :'vid' => :'vid',
        :'block_range' => :'block_range',
        :'id' => :'id',
        :'transaction_hash' => :'transaction_hash',
        :'log_index' => :'log_index',
        :'timestamp' => :'timestamp',
        :'is_bundle' => :'is_bundle',
        :'collection' => :'collection',
        :'token_id' => :'token_id',
        :'amount' => :'amount',
        :'price_eth' => :'price_eth',
        :'buyer' => :'buyer',
        :'seller' => :'seller'
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
        :'block_number' => :'String',
        :'vid' => :'Integer',
        :'block_range' => :'String',
        :'id' => :'String',
        :'transaction_hash' => :'String',
        :'log_index' => :'Integer',
        :'timestamp' => :'String',
        :'is_bundle' => :'Boolean',
        :'collection' => :'String',
        :'token_id' => :'String',
        :'amount' => :'String',
        :'price_eth' => :'String',
        :'buyer' => :'String',
        :'seller' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'block_number',
        :'block_range',
        :'id',
        :'transaction_hash',
        :'timestamp',
        :'collection',
        :'token_id',
        :'amount',
        :'price_eth',
        :'buyer',
        :'seller'
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::CRYPTOPUNKSTradeDTO` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::CRYPTOPUNKSTradeDTO`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
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

      if attributes.key?(:'vid')
        self.vid = attributes[:'vid']
      end

      if attributes.key?(:'block_range')
        self.block_range = attributes[:'block_range']
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      end

      if attributes.key?(:'transaction_hash')
        self.transaction_hash = attributes[:'transaction_hash']
      end

      if attributes.key?(:'log_index')
        self.log_index = attributes[:'log_index']
      end

      if attributes.key?(:'timestamp')
        self.timestamp = attributes[:'timestamp']
      end

      if attributes.key?(:'is_bundle')
        self.is_bundle = attributes[:'is_bundle']
      end

      if attributes.key?(:'collection')
        self.collection = attributes[:'collection']
      end

      if attributes.key?(:'token_id')
        self.token_id = attributes[:'token_id']
      end

      if attributes.key?(:'amount')
        self.amount = attributes[:'amount']
      end

      if attributes.key?(:'price_eth')
        self.price_eth = attributes[:'price_eth']
      end

      if attributes.key?(:'buyer')
        self.buyer = attributes[:'buyer']
      end

      if attributes.key?(:'seller')
        self.seller = attributes[:'seller']
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
          vid == o.vid &&
          block_range == o.block_range &&
          id == o.id &&
          transaction_hash == o.transaction_hash &&
          log_index == o.log_index &&
          timestamp == o.timestamp &&
          is_bundle == o.is_bundle &&
          collection == o.collection &&
          token_id == o.token_id &&
          amount == o.amount &&
          price_eth == o.price_eth &&
          buyer == o.buyer &&
          seller == o.seller
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [entry_time, recv_time, block_number, vid, block_range, id, transaction_hash, log_index, timestamp, is_bundle, collection, token_id, amount, price_eth, buyer, seller].hash
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
