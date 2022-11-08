<?php
/**
 * UniswapV2LiquidityPositionSnapshotV2DTO
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OnChain API
 *
 * This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 6.2.1
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
 * UniswapV2LiquidityPositionSnapshotV2DTO Class Doc Comment
 *
 * @category Class
 * @description This entity is used to store data about a user&#39;s liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UniswapV2LiquidityPositionSnapshotV2DTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UniswapV2.LiquidityPositionSnapshotV2DTO';

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
        'liquidity_position' => 'string',
        'timestamp' => 'int',
        'block' => 'int',
        'user' => 'string',
        'pair' => 'string',
        'token_0_price_usd' => 'string',
        'token_1_price_usd' => 'string',
        'reserve_0' => 'string',
        'reserve_1' => 'string',
        'reserve_usd' => 'string',
        'liquidity_token_total_supply' => 'string',
        'liquidity_token_balance' => 'string',
        'vid' => 'int',
        'block_range' => 'string'
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
        'liquidity_position' => null,
        'timestamp' => 'int32',
        'block' => 'int32',
        'user' => null,
        'pair' => null,
        'token_0_price_usd' => null,
        'token_1_price_usd' => null,
        'reserve_0' => null,
        'reserve_1' => null,
        'reserve_usd' => null,
        'liquidity_token_total_supply' => null,
        'liquidity_token_balance' => null,
        'vid' => 'int64',
        'block_range' => null
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
		'liquidity_position' => true,
		'timestamp' => false,
		'block' => false,
		'user' => true,
		'pair' => true,
		'token_0_price_usd' => true,
		'token_1_price_usd' => true,
		'reserve_0' => true,
		'reserve_1' => true,
		'reserve_usd' => true,
		'liquidity_token_total_supply' => true,
		'liquidity_token_balance' => true,
		'vid' => false,
		'block_range' => true
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
        'liquidity_position' => 'liquidity_position',
        'timestamp' => 'timestamp',
        'block' => 'block',
        'user' => 'user',
        'pair' => 'pair',
        'token_0_price_usd' => 'token_0_price_usd',
        'token_1_price_usd' => 'token_1_price_usd',
        'reserve_0' => 'reserve_0',
        'reserve_1' => 'reserve_1',
        'reserve_usd' => 'reserve_usd',
        'liquidity_token_total_supply' => 'liquidity_token_total_supply',
        'liquidity_token_balance' => 'liquidity_token_balance',
        'vid' => 'vid',
        'block_range' => 'block_range'
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
        'liquidity_position' => 'setLiquidityPosition',
        'timestamp' => 'setTimestamp',
        'block' => 'setBlock',
        'user' => 'setUser',
        'pair' => 'setPair',
        'token_0_price_usd' => 'setToken0PriceUsd',
        'token_1_price_usd' => 'setToken1PriceUsd',
        'reserve_0' => 'setReserve0',
        'reserve_1' => 'setReserve1',
        'reserve_usd' => 'setReserveUsd',
        'liquidity_token_total_supply' => 'setLiquidityTokenTotalSupply',
        'liquidity_token_balance' => 'setLiquidityTokenBalance',
        'vid' => 'setVid',
        'block_range' => 'setBlockRange'
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
        'liquidity_position' => 'getLiquidityPosition',
        'timestamp' => 'getTimestamp',
        'block' => 'getBlock',
        'user' => 'getUser',
        'pair' => 'getPair',
        'token_0_price_usd' => 'getToken0PriceUsd',
        'token_1_price_usd' => 'getToken1PriceUsd',
        'reserve_0' => 'getReserve0',
        'reserve_1' => 'getReserve1',
        'reserve_usd' => 'getReserveUsd',
        'liquidity_token_total_supply' => 'getLiquidityTokenTotalSupply',
        'liquidity_token_balance' => 'getLiquidityTokenBalance',
        'vid' => 'getVid',
        'block_range' => 'getBlockRange'
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
        $this->setIfExists('liquidity_position', $data ?? [], null);
        $this->setIfExists('timestamp', $data ?? [], null);
        $this->setIfExists('block', $data ?? [], null);
        $this->setIfExists('user', $data ?? [], null);
        $this->setIfExists('pair', $data ?? [], null);
        $this->setIfExists('token_0_price_usd', $data ?? [], null);
        $this->setIfExists('token_1_price_usd', $data ?? [], null);
        $this->setIfExists('reserve_0', $data ?? [], null);
        $this->setIfExists('reserve_1', $data ?? [], null);
        $this->setIfExists('reserve_usd', $data ?? [], null);
        $this->setIfExists('liquidity_token_total_supply', $data ?? [], null);
        $this->setIfExists('liquidity_token_balance', $data ?? [], null);
        $this->setIfExists('vid', $data ?? [], null);
        $this->setIfExists('block_range', $data ?? [], null);
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
     * @param string|null $id Identifier, format: <pair address>-<user address>
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
     * Gets liquidity_position
     *
     * @return string|null
     */
    public function getLiquidityPosition()
    {
        return $this->container['liquidity_position'];
    }

    /**
     * Sets liquidity_position
     *
     * @param string|null $liquidity_position Reference to LP identifier.
     *
     * @return self
     */
    public function setLiquidityPosition($liquidity_position)
    {

        if (is_null($liquidity_position)) {
            array_push($this->openAPINullablesSetToNull, 'liquidity_position');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('liquidity_position', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['liquidity_position'] = $liquidity_position;

        return $this;
    }

    /**
     * Gets timestamp
     *
     * @return int|null
     */
    public function getTimestamp()
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     *
     * @param int|null $timestamp Creation time.
     *
     * @return self
     */
    public function setTimestamp($timestamp)
    {

        if (is_null($timestamp)) {
            throw new \InvalidArgumentException('non-nullable timestamp cannot be null');
        }

        $this->container['timestamp'] = $timestamp;

        return $this;
    }

    /**
     * Gets block
     *
     * @return int|null
     */
    public function getBlock()
    {
        return $this->container['block'];
    }

    /**
     * Sets block
     *
     * @param int|null $block Number of block in which LP snapshot was recorded.
     *
     * @return self
     */
    public function setBlock($block)
    {

        if (is_null($block)) {
            throw new \InvalidArgumentException('non-nullable block cannot be null');
        }

        $this->container['block'] = $block;

        return $this;
    }

    /**
     * Gets user
     *
     * @return string|null
     */
    public function getUser()
    {
        return $this->container['user'];
    }

    /**
     * Sets user
     *
     * @param string|null $user Reference to user.
     *
     * @return self
     */
    public function setUser($user)
    {

        if (is_null($user)) {
            array_push($this->openAPINullablesSetToNull, 'user');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('user', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['user'] = $user;

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
     * @param string|null $pair Reference to the pair liquidity is being provided on.
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
     * Gets token_0_price_usd
     *
     * @return string|null
     */
    public function getToken0PriceUsd()
    {
        return $this->container['token_0_price_usd'];
    }

    /**
     * Sets token_0_price_usd
     *
     * @param string|null $token_0_price_usd Snapshot of token0 price.
     *
     * @return self
     */
    public function setToken0PriceUsd($token_0_price_usd)
    {

        if (is_null($token_0_price_usd)) {
            array_push($this->openAPINullablesSetToNull, 'token_0_price_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_0_price_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_0_price_usd'] = $token_0_price_usd;

        return $this;
    }

    /**
     * Gets token_1_price_usd
     *
     * @return string|null
     */
    public function getToken1PriceUsd()
    {
        return $this->container['token_1_price_usd'];
    }

    /**
     * Sets token_1_price_usd
     *
     * @param string|null $token_1_price_usd Snapshot of token0 price.
     *
     * @return self
     */
    public function setToken1PriceUsd($token_1_price_usd)
    {

        if (is_null($token_1_price_usd)) {
            array_push($this->openAPINullablesSetToNull, 'token_1_price_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_1_price_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_1_price_usd'] = $token_1_price_usd;

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
     * @param string|null $reserve_0 Snapshot of pair token0 reserves.
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
     * @param string|null $reserve_1 Snapshot of pair token1 reserves.
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
     * @param string|null $reserve_usd Snapshot of pair reserves in USD.
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
     * Gets liquidity_token_total_supply
     *
     * @return string|null
     */
    public function getLiquidityTokenTotalSupply()
    {
        return $this->container['liquidity_token_total_supply'];
    }

    /**
     * Sets liquidity_token_total_supply
     *
     * @param string|null $liquidity_token_total_supply Snapshot of pool token supply.
     *
     * @return self
     */
    public function setLiquidityTokenTotalSupply($liquidity_token_total_supply)
    {

        if (is_null($liquidity_token_total_supply)) {
            array_push($this->openAPINullablesSetToNull, 'liquidity_token_total_supply');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('liquidity_token_total_supply', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['liquidity_token_total_supply'] = $liquidity_token_total_supply;

        return $this;
    }

    /**
     * Gets liquidity_token_balance
     *
     * @return string|null
     */
    public function getLiquidityTokenBalance()
    {
        return $this->container['liquidity_token_balance'];
    }

    /**
     * Sets liquidity_token_balance
     *
     * @param string|null $liquidity_token_balance Snapshot of users pool token balance.
     *
     * @return self
     */
    public function setLiquidityTokenBalance($liquidity_token_balance)
    {

        if (is_null($liquidity_token_balance)) {
            array_push($this->openAPINullablesSetToNull, 'liquidity_token_balance');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('liquidity_token_balance', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['liquidity_token_balance'] = $liquidity_token_balance;

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
     * Gets block_range
     *
     * @return string|null
     */
    public function getBlockRange()
    {
        return $this->container['block_range'];
    }

    /**
     * Sets block_range
     *
     * @param string|null $block_range 
     *
     * @return self
     */
    public function setBlockRange($block_range)
    {

        if (is_null($block_range)) {
            array_push($this->openAPINullablesSetToNull, 'block_range');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('block_range', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['block_range'] = $block_range;

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


