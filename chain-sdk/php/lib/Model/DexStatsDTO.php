<?php
/**
 * DexStatsDTO
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * On Chain Dapps - REST API
 *
 * This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 6.6.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * DexStatsDTO Class Doc Comment
 *
 * @category Class
 * @description A type collecting global stats about this instance of Gnosis Protocol.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class DexStatsDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Dex.StatsDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'entry_time' => '\DateTime',
        'recv_time' => '\DateTime',
        'block_number' => 'int',
        'id' => 'string',
        'volume_in_owl' => 'string',
        'utility_in_owl' => 'string',
        'owl_burnt' => 'string',
        'settled_batch_count' => 'int',
        'settled_trade_count' => 'int',
        'listed_tokens' => 'int',
        'vid' => 'int'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'entry_time' => 'date-time',
        'recv_time' => 'date-time',
        'block_number' => 'int64',
        'id' => null,
        'volume_in_owl' => null,
        'utility_in_owl' => null,
        'owl_burnt' => null,
        'settled_batch_count' => 'int32',
        'settled_trade_count' => 'int32',
        'listed_tokens' => 'int32',
        'vid' => 'int64'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'entry_time' => false,
		'recv_time' => false,
		'block_number' => false,
		'id' => true,
		'volume_in_owl' => true,
		'utility_in_owl' => true,
		'owl_burnt' => true,
		'settled_batch_count' => false,
		'settled_trade_count' => false,
		'listed_tokens' => false,
		'vid' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'entry_time' => 'entry_time',
        'recv_time' => 'recv_time',
        'block_number' => 'block_number',
        'id' => 'id',
        'volume_in_owl' => 'volume_in_owl',
        'utility_in_owl' => 'utility_in_owl',
        'owl_burnt' => 'owl_burnt',
        'settled_batch_count' => 'settled_batch_count',
        'settled_trade_count' => 'settled_trade_count',
        'listed_tokens' => 'listed_tokens',
        'vid' => 'vid'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'entry_time' => 'setEntryTime',
        'recv_time' => 'setRecvTime',
        'block_number' => 'setBlockNumber',
        'id' => 'setId',
        'volume_in_owl' => 'setVolumeInOwl',
        'utility_in_owl' => 'setUtilityInOwl',
        'owl_burnt' => 'setOwlBurnt',
        'settled_batch_count' => 'setSettledBatchCount',
        'settled_trade_count' => 'setSettledTradeCount',
        'listed_tokens' => 'setListedTokens',
        'vid' => 'setVid'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'entry_time' => 'getEntryTime',
        'recv_time' => 'getRecvTime',
        'block_number' => 'getBlockNumber',
        'id' => 'getId',
        'volume_in_owl' => 'getVolumeInOwl',
        'utility_in_owl' => 'getUtilityInOwl',
        'owl_burnt' => 'getOwlBurnt',
        'settled_batch_count' => 'getSettledBatchCount',
        'settled_trade_count' => 'getSettledTradeCount',
        'listed_tokens' => 'getListedTokens',
        'vid' => 'getVid'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('entry_time', $data ?? [], null);
        $this->setIfExists('recv_time', $data ?? [], null);
        $this->setIfExists('block_number', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('volume_in_owl', $data ?? [], null);
        $this->setIfExists('utility_in_owl', $data ?? [], null);
        $this->setIfExists('owl_burnt', $data ?? [], null);
        $this->setIfExists('settled_batch_count', $data ?? [], null);
        $this->setIfExists('settled_trade_count', $data ?? [], null);
        $this->setIfExists('listed_tokens', $data ?? [], null);
        $this->setIfExists('vid', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets entry_time
     *
     * @return \DateTime|null
     */
    public function getEntryTime()
    {
        return $this->container['entry_time'];
    }

    /**
     * Sets entry_time
     *
     * @param \DateTime|null $entry_time entry_time
     *
     * @return self
     */
    public function setEntryTime($entry_time)
    {
        if (is_null($entry_time)) {
            throw new \InvalidArgumentException('non-nullable entry_time cannot be null');
        }
        $this->container['entry_time'] = $entry_time;

        return $this;
    }

    /**
     * Gets recv_time
     *
     * @return \DateTime|null
     */
    public function getRecvTime()
    {
        return $this->container['recv_time'];
    }

    /**
     * Sets recv_time
     *
     * @param \DateTime|null $recv_time recv_time
     *
     * @return self
     */
    public function setRecvTime($recv_time)
    {
        if (is_null($recv_time)) {
            throw new \InvalidArgumentException('non-nullable recv_time cannot be null');
        }
        $this->container['recv_time'] = $recv_time;

        return $this;
    }

    /**
     * Gets block_number
     *
     * @return int|null
     */
    public function getBlockNumber()
    {
        return $this->container['block_number'];
    }

    /**
     * Sets block_number
     *
     * @param int|null $block_number Number of block in which entity was recorded.
     *
     * @return self
     */
    public function setBlockNumber($block_number)
    {
        if (is_null($block_number)) {
            throw new \InvalidArgumentException('non-nullable block_number cannot be null');
        }
        $this->container['block_number'] = $block_number;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string|null $id 
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            array_push($this->openAPINullablesSetToNull, 'id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('id', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets volume_in_owl
     *
     * @return string|null
     */
    public function getVolumeInOwl()
    {
        return $this->container['volume_in_owl'];
    }

    /**
     * Sets volume_in_owl
     *
     * @param string|null $volume_in_owl The total volume denominated in OWL (all sell amounts combined).
     *
     * @return self
     */
    public function setVolumeInOwl($volume_in_owl)
    {
        if (is_null($volume_in_owl)) {
            array_push($this->openAPINullablesSetToNull, 'volume_in_owl');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('volume_in_owl', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['volume_in_owl'] = $volume_in_owl;

        return $this;
    }

    /**
     * Gets utility_in_owl
     *
     * @return string|null
     */
    public function getUtilityInOwl()
    {
        return $this->container['utility_in_owl'];
    }

    /**
     * Sets utility_in_owl
     *
     * @param string|null $utility_in_owl The total trader surplus in OWL.
     *
     * @return self
     */
    public function setUtilityInOwl($utility_in_owl)
    {
        if (is_null($utility_in_owl)) {
            array_push($this->openAPINullablesSetToNull, 'utility_in_owl');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('utility_in_owl', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['utility_in_owl'] = $utility_in_owl;

        return $this;
    }

    /**
     * Gets owl_burnt
     *
     * @return string|null
     */
    public function getOwlBurnt()
    {
        return $this->container['owl_burnt'];
    }

    /**
     * Sets owl_burnt
     *
     * @param string|null $owl_burnt The total amount of OWL burnt (equivalent to fees rewarded to solvers).
     *
     * @return self
     */
    public function setOwlBurnt($owl_burnt)
    {
        if (is_null($owl_burnt)) {
            array_push($this->openAPINullablesSetToNull, 'owl_burnt');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('owl_burnt', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['owl_burnt'] = $owl_burnt;

        return $this;
    }

    /**
     * Gets settled_batch_count
     *
     * @return int|null
     */
    public function getSettledBatchCount()
    {
        return $this->container['settled_batch_count'];
    }

    /**
     * Sets settled_batch_count
     *
     * @param int|null $settled_batch_count The total number of settled batches.
     *
     * @return self
     */
    public function setSettledBatchCount($settled_batch_count)
    {
        if (is_null($settled_batch_count)) {
            throw new \InvalidArgumentException('non-nullable settled_batch_count cannot be null');
        }
        $this->container['settled_batch_count'] = $settled_batch_count;

        return $this;
    }

    /**
     * Gets settled_trade_count
     *
     * @return int|null
     */
    public function getSettledTradeCount()
    {
        return $this->container['settled_trade_count'];
    }

    /**
     * Sets settled_trade_count
     *
     * @param int|null $settled_trade_count The total number of settled trades.
     *
     * @return self
     */
    public function setSettledTradeCount($settled_trade_count)
    {
        if (is_null($settled_trade_count)) {
            throw new \InvalidArgumentException('non-nullable settled_trade_count cannot be null');
        }
        $this->container['settled_trade_count'] = $settled_trade_count;

        return $this;
    }

    /**
     * Gets listed_tokens
     *
     * @return int|null
     */
    public function getListedTokens()
    {
        return $this->container['listed_tokens'];
    }

    /**
     * Sets listed_tokens
     *
     * @param int|null $listed_tokens The number of listed tokens.
     *
     * @return self
     */
    public function setListedTokens($listed_tokens)
    {
        if (is_null($listed_tokens)) {
            throw new \InvalidArgumentException('non-nullable listed_tokens cannot be null');
        }
        $this->container['listed_tokens'] = $listed_tokens;

        return $this;
    }

    /**
     * Gets vid
     *
     * @return int|null
     */
    public function getVid()
    {
        return $this->container['vid'];
    }

    /**
     * Sets vid
     *
     * @param int|null $vid 
     *
     * @return self
     */
    public function setVid($vid)
    {
        if (is_null($vid)) {
            throw new \InvalidArgumentException('non-nullable vid cannot be null');
        }
        $this->container['vid'] = $vid;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


