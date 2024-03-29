<?php
/**
 * UniswapV2TokenDayDataDTO
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
 * UniswapV2TokenDayDataDTO Class Doc Comment
 *
 * @category Class
 * @description Token data aggregated across all pairs that include token.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UniswapV2TokenDayDataDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UniswapV2.TokenDayDataDTO';

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
        'date' => 'int',
        'token' => 'string',
        'daily_volume_token' => 'string',
        'daily_volume_eth' => 'string',
        'daily_volume_usd' => 'string',
        'daily_txns' => 'string',
        'total_liquidity_token' => 'string',
        'total_liquidity_eth' => 'string',
        'total_liquidity_usd' => 'string',
        'price_usd' => 'string',
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
        'date' => 'int32',
        'token' => null,
        'daily_volume_token' => null,
        'daily_volume_eth' => null,
        'daily_volume_usd' => null,
        'daily_txns' => null,
        'total_liquidity_token' => null,
        'total_liquidity_eth' => null,
        'total_liquidity_usd' => null,
        'price_usd' => null,
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
		'date' => false,
		'token' => true,
		'daily_volume_token' => true,
		'daily_volume_eth' => true,
		'daily_volume_usd' => true,
		'daily_txns' => true,
		'total_liquidity_token' => true,
		'total_liquidity_eth' => true,
		'total_liquidity_usd' => true,
		'price_usd' => true,
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
        'date' => 'date',
        'token' => 'token',
        'daily_volume_token' => 'daily_volume_token',
        'daily_volume_eth' => 'daily_volume_eth',
        'daily_volume_usd' => 'daily_volume_usd',
        'daily_txns' => 'daily_txns',
        'total_liquidity_token' => 'total_liquidity_token',
        'total_liquidity_eth' => 'total_liquidity_eth',
        'total_liquidity_usd' => 'total_liquidity_usd',
        'price_usd' => 'price_usd',
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
        'date' => 'setDate',
        'token' => 'setToken',
        'daily_volume_token' => 'setDailyVolumeToken',
        'daily_volume_eth' => 'setDailyVolumeEth',
        'daily_volume_usd' => 'setDailyVolumeUsd',
        'daily_txns' => 'setDailyTxns',
        'total_liquidity_token' => 'setTotalLiquidityToken',
        'total_liquidity_eth' => 'setTotalLiquidityEth',
        'total_liquidity_usd' => 'setTotalLiquidityUsd',
        'price_usd' => 'setPriceUsd',
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
        'date' => 'getDate',
        'token' => 'getToken',
        'daily_volume_token' => 'getDailyVolumeToken',
        'daily_volume_eth' => 'getDailyVolumeEth',
        'daily_volume_usd' => 'getDailyVolumeUsd',
        'daily_txns' => 'getDailyTxns',
        'total_liquidity_token' => 'getTotalLiquidityToken',
        'total_liquidity_eth' => 'getTotalLiquidityEth',
        'total_liquidity_usd' => 'getTotalLiquidityUsd',
        'price_usd' => 'getPriceUsd',
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
        $this->setIfExists('date', $data ?? [], null);
        $this->setIfExists('token', $data ?? [], null);
        $this->setIfExists('daily_volume_token', $data ?? [], null);
        $this->setIfExists('daily_volume_eth', $data ?? [], null);
        $this->setIfExists('daily_volume_usd', $data ?? [], null);
        $this->setIfExists('daily_txns', $data ?? [], null);
        $this->setIfExists('total_liquidity_token', $data ?? [], null);
        $this->setIfExists('total_liquidity_eth', $data ?? [], null);
        $this->setIfExists('total_liquidity_usd', $data ?? [], null);
        $this->setIfExists('price_usd', $data ?? [], null);
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
     * @param string|null $id Token address and day id (day start timestamp in unix / 86400) concatenated with a dash.
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
     * Gets date
     *
     * @return int|null
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param int|null $date Unix timestamp for start of day.
     *
     * @return self
     */
    public function setDate($date)
    {
        if (is_null($date)) {
            throw new \InvalidArgumentException('non-nullable date cannot be null');
        }
        $this->container['date'] = $date;

        return $this;
    }

    /**
     * Gets token
     *
     * @return string|null
     */
    public function getToken()
    {
        return $this->container['token'];
    }

    /**
     * Sets token
     *
     * @param string|null $token Reference to token entity.
     *
     * @return self
     */
    public function setToken($token)
    {
        if (is_null($token)) {
            array_push($this->openAPINullablesSetToNull, 'token');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['token'] = $token;

        return $this;
    }

    /**
     * Gets daily_volume_token
     *
     * @return string|null
     */
    public function getDailyVolumeToken()
    {
        return $this->container['daily_volume_token'];
    }

    /**
     * Sets daily_volume_token
     *
     * @param string|null $daily_volume_token Amount of token swapped across all pairs throughout day.
     *
     * @return self
     */
    public function setDailyVolumeToken($daily_volume_token)
    {
        if (is_null($daily_volume_token)) {
            array_push($this->openAPINullablesSetToNull, 'daily_volume_token');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('daily_volume_token', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['daily_volume_token'] = $daily_volume_token;

        return $this;
    }

    /**
     * Gets daily_volume_eth
     *
     * @return string|null
     */
    public function getDailyVolumeEth()
    {
        return $this->container['daily_volume_eth'];
    }

    /**
     * Sets daily_volume_eth
     *
     * @param string|null $daily_volume_eth Amount of token swapped across all pairs throughout day stored as a derived amount of ETH.
     *
     * @return self
     */
    public function setDailyVolumeEth($daily_volume_eth)
    {
        if (is_null($daily_volume_eth)) {
            array_push($this->openAPINullablesSetToNull, 'daily_volume_eth');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('daily_volume_eth', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['daily_volume_eth'] = $daily_volume_eth;

        return $this;
    }

    /**
     * Gets daily_volume_usd
     *
     * @return string|null
     */
    public function getDailyVolumeUsd()
    {
        return $this->container['daily_volume_usd'];
    }

    /**
     * Sets daily_volume_usd
     *
     * @param string|null $daily_volume_usd Amount of token swapped across all pairs throughout day stored as a derived amount of USD.
     *
     * @return self
     */
    public function setDailyVolumeUsd($daily_volume_usd)
    {
        if (is_null($daily_volume_usd)) {
            array_push($this->openAPINullablesSetToNull, 'daily_volume_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('daily_volume_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['daily_volume_usd'] = $daily_volume_usd;

        return $this;
    }

    /**
     * Gets daily_txns
     *
     * @return string|null
     */
    public function getDailyTxns()
    {
        return $this->container['daily_txns'];
    }

    /**
     * Sets daily_txns
     *
     * @param string|null $daily_txns Amount of transactions with this token across all pairs.
     *
     * @return self
     */
    public function setDailyTxns($daily_txns)
    {
        if (is_null($daily_txns)) {
            array_push($this->openAPINullablesSetToNull, 'daily_txns');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('daily_txns', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['daily_txns'] = $daily_txns;

        return $this;
    }

    /**
     * Gets total_liquidity_token
     *
     * @return string|null
     */
    public function getTotalLiquidityToken()
    {
        return $this->container['total_liquidity_token'];
    }

    /**
     * Sets total_liquidity_token
     *
     * @param string|null $total_liquidity_token Token amount of token deposited across all pairs.
     *
     * @return self
     */
    public function setTotalLiquidityToken($total_liquidity_token)
    {
        if (is_null($total_liquidity_token)) {
            array_push($this->openAPINullablesSetToNull, 'total_liquidity_token');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_liquidity_token', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_liquidity_token'] = $total_liquidity_token;

        return $this;
    }

    /**
     * Gets total_liquidity_eth
     *
     * @return string|null
     */
    public function getTotalLiquidityEth()
    {
        return $this->container['total_liquidity_eth'];
    }

    /**
     * Sets total_liquidity_eth
     *
     * @param string|null $total_liquidity_eth Token amount of token deposited across all pairs stored as amount of ETH.
     *
     * @return self
     */
    public function setTotalLiquidityEth($total_liquidity_eth)
    {
        if (is_null($total_liquidity_eth)) {
            array_push($this->openAPINullablesSetToNull, 'total_liquidity_eth');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_liquidity_eth', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_liquidity_eth'] = $total_liquidity_eth;

        return $this;
    }

    /**
     * Gets total_liquidity_usd
     *
     * @return string|null
     */
    public function getTotalLiquidityUsd()
    {
        return $this->container['total_liquidity_usd'];
    }

    /**
     * Sets total_liquidity_usd
     *
     * @param string|null $total_liquidity_usd Token amount of token deposited across all pairs stored as amount of USD.
     *
     * @return self
     */
    public function setTotalLiquidityUsd($total_liquidity_usd)
    {
        if (is_null($total_liquidity_usd)) {
            array_push($this->openAPINullablesSetToNull, 'total_liquidity_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_liquidity_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_liquidity_usd'] = $total_liquidity_usd;

        return $this;
    }

    /**
     * Gets price_usd
     *
     * @return string|null
     */
    public function getPriceUsd()
    {
        return $this->container['price_usd'];
    }

    /**
     * Sets price_usd
     *
     * @param string|null $price_usd Price of token in derived USD.
     *
     * @return self
     */
    public function setPriceUsd($price_usd)
    {
        if (is_null($price_usd)) {
            array_push($this->openAPINullablesSetToNull, 'price_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('price_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['price_usd'] = $price_usd;

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


