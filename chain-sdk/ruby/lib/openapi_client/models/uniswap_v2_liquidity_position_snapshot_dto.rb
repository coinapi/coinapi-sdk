=begin
#On Chain Dapps - REST API

# This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.6.0

=end

require 'date'
require 'time'

module OpenapiClient
  # This entity is used to store data about a user's liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
  class UniswapV2LiquidityPositionSnapshotDTO
    attr_accessor :entry_time

    attr_accessor :recv_time

    # Number of block in which entity was recorded.
    attr_accessor :block_number

    # Identifier, format: (pair address)-(user address)
    attr_accessor :id

    # Reference to LP identifier.
    attr_accessor :liquidity_position

    # Creation time.
    attr_accessor :timestamp

    # Number of block in which LP snapshot was recorded.
    attr_accessor :block

    # Reference to user.
    attr_accessor :user

    # Reference to the pair liquidity is being provided on.
    attr_accessor :pair

    # Snapshot of token0 price.
    attr_accessor :token_0_price_usd

    # Snapshot of token0 price.
    attr_accessor :token_1_price_usd

    # Snapshot of pair token0 reserves.
    attr_accessor :reserve_0

    # Snapshot of pair token1 reserves.
    attr_accessor :reserve_1

    # Snapshot of pair reserves in USD.
    attr_accessor :reserve_usd

    # Snapshot of pool token supply.
    attr_accessor :liquidity_token_total_supply

    # Snapshot of users pool token balance.
    attr_accessor :liquidity_token_balance

    # 
    attr_accessor :vid

    # 
    attr_accessor :block_range

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'entry_time' => :'entry_time',
        :'recv_time' => :'recv_time',
        :'block_number' => :'block_number',
        :'id' => :'id',
        :'liquidity_position' => :'liquidity_position',
        :'timestamp' => :'timestamp',
        :'block' => :'block',
        :'user' => :'user',
        :'pair' => :'pair',
        :'token_0_price_usd' => :'token_0_price_usd',
        :'token_1_price_usd' => :'token_1_price_usd',
        :'reserve_0' => :'reserve_0',
        :'reserve_1' => :'reserve_1',
        :'reserve_usd' => :'reserve_usd',
        :'liquidity_token_total_supply' => :'liquidity_token_total_supply',
        :'liquidity_token_balance' => :'liquidity_token_balance',
        :'vid' => :'vid',
        :'block_range' => :'block_range'
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
        :'liquidity_position' => :'String',
        :'timestamp' => :'Integer',
        :'block' => :'Integer',
        :'user' => :'String',
        :'pair' => :'String',
        :'token_0_price_usd' => :'String',
        :'token_1_price_usd' => :'String',
        :'reserve_0' => :'String',
        :'reserve_1' => :'String',
        :'reserve_usd' => :'String',
        :'liquidity_token_total_supply' => :'String',
        :'liquidity_token_balance' => :'String',
        :'vid' => :'Integer',
        :'block_range' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'id',
        :'liquidity_position',
        :'user',
        :'pair',
        :'token_0_price_usd',
        :'token_1_price_usd',
        :'reserve_0',
        :'reserve_1',
        :'reserve_usd',
        :'liquidity_token_total_supply',
        :'liquidity_token_balance',
        :'block_range'
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::UniswapV2LiquidityPositionSnapshotDTO` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::UniswapV2LiquidityPositionSnapshotDTO`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
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

      if attributes.key?(:'liquidity_position')
        self.liquidity_position = attributes[:'liquidity_position']
      end

      if attributes.key?(:'timestamp')
        self.timestamp = attributes[:'timestamp']
      end

      if attributes.key?(:'block')
        self.block = attributes[:'block']
      end

      if attributes.key?(:'user')
        self.user = attributes[:'user']
      end

      if attributes.key?(:'pair')
        self.pair = attributes[:'pair']
      end

      if attributes.key?(:'token_0_price_usd')
        self.token_0_price_usd = attributes[:'token_0_price_usd']
      end

      if attributes.key?(:'token_1_price_usd')
        self.token_1_price_usd = attributes[:'token_1_price_usd']
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

      if attributes.key?(:'liquidity_token_total_supply')
        self.liquidity_token_total_supply = attributes[:'liquidity_token_total_supply']
      end

      if attributes.key?(:'liquidity_token_balance')
        self.liquidity_token_balance = attributes[:'liquidity_token_balance']
      end

      if attributes.key?(:'vid')
        self.vid = attributes[:'vid']
      end

      if attributes.key?(:'block_range')
        self.block_range = attributes[:'block_range']
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
          liquidity_position == o.liquidity_position &&
          timestamp == o.timestamp &&
          block == o.block &&
          user == o.user &&
          pair == o.pair &&
          token_0_price_usd == o.token_0_price_usd &&
          token_1_price_usd == o.token_1_price_usd &&
          reserve_0 == o.reserve_0 &&
          reserve_1 == o.reserve_1 &&
          reserve_usd == o.reserve_usd &&
          liquidity_token_total_supply == o.liquidity_token_total_supply &&
          liquidity_token_balance == o.liquidity_token_balance &&
          vid == o.vid &&
          block_range == o.block_range
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [entry_time, recv_time, block_number, id, liquidity_position, timestamp, block, user, pair, token_0_price_usd, token_1_price_usd, reserve_0, reserve_1, reserve_usd, liquidity_token_total_supply, liquidity_token_balance, vid, block_range].hash
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
