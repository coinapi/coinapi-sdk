<?php
/**
 * UniswapV2PairHourDataDTO
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
 * OpenAPI Generator version: 6.3.0
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
 * UniswapV2PairHourDataDTO Class Doc Comment
 *
 * @category Class
 * @description Tracks pair data across each hour.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UniswapV2PairHourDataDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UniswapV2.PairHourDataDTO';

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
        'hour_start_unix' => 'int',
        'pair' => 'string',
        'reserve_0' => 'string',
        'reserve_1' => 'string',
        'total_supply' => 'string',
        'reserve_usd' => 'string',
        'hourly_volume_token_0' => 'string',
        'hourly_volume_token_1' => 'string',
        'hourly_volume_usd' => 'string',
        'hourly_txns' => 'string',
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
        'hour_start_unix' => 'int32',
        'pair' => null,
        'reserve_0' => null,
        'reserve_1' => null,
        'total_supply' => null,
        'reserve_usd' => null,
        'hourly_volume_token_0' => null,
        'hourly_volume_token_1' => null,
        'hourly_volume_usd' => null,
        'hourly_txns' => null,
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
		'hour_start_unix' => false,
		'pair' => true,
		'reserve_0' => true,
		'reserve_1' => true,
		'total_supply' => true,
		'reserve_usd' => true,
		'hourly_volume_token_0' => true,
		'hourly_volume_token_1' => true,
		'hourly_volume_usd' => true,
		'hourly_txns' => true,
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
        'hour_start_unix' => 'hour_start_unix',
        'pair' => 'pair',
        'reserve_0' => 'reserve_0',
        'reserve_1' => 'reserve_1',
        'total_supply' => 'total_supply',
        'reserve_usd' => 'reserve_usd',
        'hourly_volume_token_0' => 'hourly_volume_token_0',
        'hourly_volume_token_1' => 'hourly_volume_token_1',
        'hourly_volume_usd' => 'hourly_volume_usd',
        'hourly_txns' => 'hourly_txns',
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
        'hour_start_unix' => 'setHourStartUnix',
        'pair' => 'setPair',
        'reserve_0' => 'setReserve0',
        'reserve_1' => 'setReserve1',
        'total_supply' => 'setTotalSupply',
        'reserve_usd' => 'setReserveUsd',
        'hourly_volume_token_0' => 'setHourlyVolumeToken0',
        'hourly_volume_token_1' => 'setHourlyVolumeToken1',
        'hourly_volume_usd' => 'setHourlyVolumeUsd',
        'hourly_txns' => 'setHourlyTxns',
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
        'hour_start_unix' => 'getHourStartUnix',
        'pair' => 'getPair',
        'reserve_0' => 'getReserve0',
        'reserve_1' => 'getReserve1',
        'total_supply' => 'getTotalSupply',
        'reserve_usd' => 'getReserveUsd',
        'hourly_volume_token_0' => 'getHourlyVolumeToken0',
        'hourly_volume_token_1' => 'getHourlyVolumeToken1',
        'hourly_volume_usd' => 'getHourlyVolumeUsd',
        'hourly_txns' => 'getHourlyTxns',
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
        $this->setIfExists('hour_start_unix', $data ?? [], null);
        $this->setIfExists('pair', $data ?? [], null);
        $this->setIfExists('reserve_0', $data ?? [], null);
        $this->setIfExists('reserve_1', $data ?? [], null);
        $this->setIfExists('total_supply', $data ?? [], null);
        $this->setIfExists('reserve_usd', $data ?? [], null);
        $this->setIfExists('hourly_volume_token_0', $data ?? [], null);
        $this->setIfExists('hourly_volume_token_1', $data ?? [], null);
        $this->setIfExists('hourly_volume_usd', $data ?? [], null);
        $this->setIfExists('hourly_txns', $data ?? [], null);
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
     * Gets hour_start_unix
     *
     * @return int|null
     */
    public function getHourStartUnix()
    {
        return $this->container['hour_start_unix'];
    }

    /**
     * Sets hour_start_unix
     *
     * @param int|null $hour_start_unix Unix timestamp for start of hour.
     *
     * @return self
     */
    public function setHourStartUnix($hour_start_unix)
    {
        if (is_null($hour_start_unix)) {
            throw new \InvalidArgumentException('non-nullable hour_start_unix cannot be null');
        }
        $this->container['hour_start_unix'] = $hour_start_unix;

        return $this;
    }

    /**
     * Gets pair
     *
     * @return string|null
     */
    public function getPair()
    {
        return $this->container['pair'];
    }

    /**
     * Sets pair
     *
     * @param string|null $pair Address for pair contract.
     *
     * @return self
     */
    public function setPair($pair)
    {
        if (is_null($pair)) {
            array_push($this->openAPINullablesSetToNull, 'pair');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('pair', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['pair'] = $pair;

        return $this;
    }

    /**
     * Gets reserve_0
     *
     * @return string|null
     */
    public function getReserve0()
    {
        return $this->container['reserve_0'];
    }

    /**
     * Sets reserve_0
     *
     * @param string|null $reserve_0 Reserve of token0 (updated during each transaction on pair).
     *
     * @return self
     */
    public function setReserve0($reserve_0)
    {
        if (is_null($reserve_0)) {
            array_push($this->openAPINullablesSetToNull, 'reserve_0');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('reserve_0', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['reserve_0'] = $reserve_0;

        return $this;
    }

    /**
     * Gets reserve_1
     *
     * @return string|null
     */
    public function getReserve1()
    {
        return $this->container['reserve_1'];
    }

    /**
     * Sets reserve_1
     *
     * @param string|null $reserve_1 Reserve of token1 (updated during each transaction on pair).
     *
     * @return self
     */
    public function setReserve1($reserve_1)
    {
        if (is_null($reserve_1)) {
            array_push($this->openAPINullablesSetToNull, 'reserve_1');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('reserve_1', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['reserve_1'] = $reserve_1;

        return $this;
    }

    /**
     * Gets total_supply
     *
     * @return string|null
     */
    public function getTotalSupply()
    {
        return $this->container['total_supply'];
    }

    /**
     * Sets total_supply
     *
     * @param string|null $total_supply Total supply of liquidity token distributed to LPs.
     *
     * @return self
     */
    public function setTotalSupply($total_supply)
    {
        if (is_null($total_supply)) {
            array_push($this->openAPINullablesSetToNull, 'total_supply');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_supply', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_supply'] = $total_supply;

        return $this;
    }

    /**
     * Gets reserve_usd
     *
     * @return string|null
     */
    public function getReserveUsd()
    {
        return $this->container['reserve_usd'];
    }

    /**
     * Sets reserve_usd
     *
     * @param string|null $reserve_usd Reserve of token0 plus token1 stored as a derived USD amount.
     *
     * @return self
     */
    public function setReserveUsd($reserve_usd)
    {
        if (is_null($reserve_usd)) {
            array_push($this->openAPINullablesSetToNull, 'reserve_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('reserve_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['reserve_usd'] = $reserve_usd;

        return $this;
    }

    /**
     * Gets hourly_volume_token_0
     *
     * @return string|null
     */
    public function getHourlyVolumeToken0()
    {
        return $this->container['hourly_volume_token_0'];
    }

    /**
     * Sets hourly_volume_token_0
     *
     * @param string|null $hourly_volume_token_0 Total amount of token0 swapped throughout hour.
     *
     * @return self
     */
    public function setHourlyVolumeToken0($hourly_volume_token_0)
    {
        if (is_null($hourly_volume_token_0)) {
            array_push($this->openAPINullablesSetToNull, 'hourly_volume_token_0');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('hourly_volume_token_0', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['hourly_volume_token_0'] = $hourly_volume_token_0;

        return $this;
    }

    /**
     * Gets hourly_volume_token_1
     *
     * @return string|null
     */
    public function getHourlyVolumeToken1()
    {
        return $this->container['hourly_volume_token_1'];
    }

    /**
     * Sets hourly_volume_token_1
     *
     * @param string|null $hourly_volume_token_1 Total amount of token1 swapped throughout hour.
     *
     * @return self
     */
    public function setHourlyVolumeToken1($hourly_volume_token_1)
    {
        if (is_null($hourly_volume_token_1)) {
            array_push($this->openAPINullablesSetToNull, 'hourly_volume_token_1');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('hourly_volume_token_1', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['hourly_volume_token_1'] = $hourly_volume_token_1;

        return $this;
    }

    /**
     * Gets hourly_volume_usd
     *
     * @return string|null
     */
    public function getHourlyVolumeUsd()
    {
        return $this->container['hourly_volume_usd'];
    }

    /**
     * Sets hourly_volume_usd
     *
     * @param string|null $hourly_volume_usd Total volume within pair throughout hour.
     *
     * @return self
     */
    public function setHourlyVolumeUsd($hourly_volume_usd)
    {
        if (is_null($hourly_volume_usd)) {
            array_push($this->openAPINullablesSetToNull, 'hourly_volume_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('hourly_volume_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['hourly_volume_usd'] = $hourly_volume_usd;

        return $this;
    }

    /**
     * Gets hourly_txns
     *
     * @return string|null
     */
    public function getHourlyTxns()
    {
        return $this->container['hourly_txns'];
    }

    /**
     * Sets hourly_txns
     *
     * @param string|null $hourly_txns Amount of transactions on pair throughout hour.
     *
     * @return self
     */
    public function setHourlyTxns($hourly_txns)
    {
        if (is_null($hourly_txns)) {
            array_push($this->openAPINullablesSetToNull, 'hourly_txns');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('hourly_txns', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['hourly_txns'] = $hourly_txns;

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


