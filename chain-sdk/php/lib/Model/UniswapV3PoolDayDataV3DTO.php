<?php
/**
 * UniswapV3PoolDayDataV3DTO
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
 * UniswapV3PoolDayDataV3DTO Class Doc Comment
 *
 * @category Class
 * @description Data accumulated and condensed into day stats for each pool.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UniswapV3PoolDayDataV3DTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UniswapV3PoolDayDataV3DTO';

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
        'pool' => 'string',
        'liquidity' => 'string',
        'sqrt_price' => 'string',
        'token_0_price' => 'string',
        'token_1_price' => 'string',
        'tick' => 'string',
        'fee_growth_global_0x128' => 'string',
        'fee_growth_global_1x128' => 'string',
        'tvl_usd' => 'string',
        'volume_token_0' => 'string',
        'volume_token_1' => 'string',
        'volume_usd' => 'string',
        'fees_usd' => 'string',
        'tx_count' => 'string',
        'open' => 'string',
        'high' => 'string',
        'low' => 'string',
        'close' => 'string',
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
        'pool' => null,
        'liquidity' => null,
        'sqrt_price' => null,
        'token_0_price' => null,
        'token_1_price' => null,
        'tick' => null,
        'fee_growth_global_0x128' => null,
        'fee_growth_global_1x128' => null,
        'tvl_usd' => null,
        'volume_token_0' => null,
        'volume_token_1' => null,
        'volume_usd' => null,
        'fees_usd' => null,
        'tx_count' => null,
        'open' => null,
        'high' => null,
        'low' => null,
        'close' => null,
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
		'pool' => true,
		'liquidity' => true,
		'sqrt_price' => true,
		'token_0_price' => true,
		'token_1_price' => true,
		'tick' => true,
		'fee_growth_global_0x128' => true,
		'fee_growth_global_1x128' => true,
		'tvl_usd' => true,
		'volume_token_0' => true,
		'volume_token_1' => true,
		'volume_usd' => true,
		'fees_usd' => true,
		'tx_count' => true,
		'open' => true,
		'high' => true,
		'low' => true,
		'close' => true,
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
        'pool' => 'pool',
        'liquidity' => 'liquidity',
        'sqrt_price' => 'sqrt_price',
        'token_0_price' => 'token_0_price',
        'token_1_price' => 'token_1_price',
        'tick' => 'tick',
        'fee_growth_global_0x128' => 'fee_growth_global_0x128',
        'fee_growth_global_1x128' => 'fee_growth_global_1x128',
        'tvl_usd' => 'tvl_usd',
        'volume_token_0' => 'volume_token_0',
        'volume_token_1' => 'volume_token_1',
        'volume_usd' => 'volume_usd',
        'fees_usd' => 'fees_usd',
        'tx_count' => 'tx_count',
        'open' => 'open',
        'high' => 'high',
        'low' => 'low',
        'close' => 'close',
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
        'pool' => 'setPool',
        'liquidity' => 'setLiquidity',
        'sqrt_price' => 'setSqrtPrice',
        'token_0_price' => 'setToken0Price',
        'token_1_price' => 'setToken1Price',
        'tick' => 'setTick',
        'fee_growth_global_0x128' => 'setFeeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'setFeeGrowthGlobal1x128',
        'tvl_usd' => 'setTvlUsd',
        'volume_token_0' => 'setVolumeToken0',
        'volume_token_1' => 'setVolumeToken1',
        'volume_usd' => 'setVolumeUsd',
        'fees_usd' => 'setFeesUsd',
        'tx_count' => 'setTxCount',
        'open' => 'setOpen',
        'high' => 'setHigh',
        'low' => 'setLow',
        'close' => 'setClose',
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
        'pool' => 'getPool',
        'liquidity' => 'getLiquidity',
        'sqrt_price' => 'getSqrtPrice',
        'token_0_price' => 'getToken0Price',
        'token_1_price' => 'getToken1Price',
        'tick' => 'getTick',
        'fee_growth_global_0x128' => 'getFeeGrowthGlobal0x128',
        'fee_growth_global_1x128' => 'getFeeGrowthGlobal1x128',
        'tvl_usd' => 'getTvlUsd',
        'volume_token_0' => 'getVolumeToken0',
        'volume_token_1' => 'getVolumeToken1',
        'volume_usd' => 'getVolumeUsd',
        'fees_usd' => 'getFeesUsd',
        'tx_count' => 'getTxCount',
        'open' => 'getOpen',
        'high' => 'getHigh',
        'low' => 'getLow',
        'close' => 'getClose',
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
        $this->setIfExists('pool', $data ?? [], null);
        $this->setIfExists('liquidity', $data ?? [], null);
        $this->setIfExists('sqrt_price', $data ?? [], null);
        $this->setIfExists('token_0_price', $data ?? [], null);
        $this->setIfExists('token_1_price', $data ?? [], null);
        $this->setIfExists('tick', $data ?? [], null);
        $this->setIfExists('fee_growth_global_0x128', $data ?? [], null);
        $this->setIfExists('fee_growth_global_1x128', $data ?? [], null);
        $this->setIfExists('tvl_usd', $data ?? [], null);
        $this->setIfExists('volume_token_0', $data ?? [], null);
        $this->setIfExists('volume_token_1', $data ?? [], null);
        $this->setIfExists('volume_usd', $data ?? [], null);
        $this->setIfExists('fees_usd', $data ?? [], null);
        $this->setIfExists('tx_count', $data ?? [], null);
        $this->setIfExists('open', $data ?? [], null);
        $this->setIfExists('high', $data ?? [], null);
        $this->setIfExists('low', $data ?? [], null);
        $this->setIfExists('close', $data ?? [], null);
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
     * @param string|null $id Identifier, format: <pool address>-<day id>.
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
     * @param int|null $date Timestamp rounded to current day by dividing by 86400
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
     * Gets pool
     *
     * @return string|null
     */
    public function getPool()
    {
        return $this->container['pool'];
    }

    /**
     * Sets pool
     *
     * @param string|null $pool Pointer to pool.
     *
     * @return self
     */
    public function setPool($pool)
    {

        if (is_null($pool)) {
            array_push($this->openAPINullablesSetToNull, 'pool');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('pool', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['pool'] = $pool;

        return $this;
    }

    /**
     * Gets liquidity
     *
     * @return string|null
     */
    public function getLiquidity()
    {
        return $this->container['liquidity'];
    }

    /**
     * Sets liquidity
     *
     * @param string|null $liquidity In range liquidity at end of period.
     *
     * @return self
     */
    public function setLiquidity($liquidity)
    {

        if (is_null($liquidity)) {
            array_push($this->openAPINullablesSetToNull, 'liquidity');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('liquidity', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['liquidity'] = $liquidity;

        return $this;
    }

    /**
     * Gets sqrt_price
     *
     * @return string|null
     */
    public function getSqrtPrice()
    {
        return $this->container['sqrt_price'];
    }

    /**
     * Sets sqrt_price
     *
     * @param string|null $sqrt_price Current price tracker at end of period.
     *
     * @return self
     */
    public function setSqrtPrice($sqrt_price)
    {

        if (is_null($sqrt_price)) {
            array_push($this->openAPINullablesSetToNull, 'sqrt_price');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('sqrt_price', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['sqrt_price'] = $sqrt_price;

        return $this;
    }

    /**
     * Gets token_0_price
     *
     * @return string|null
     */
    public function getToken0Price()
    {
        return $this->container['token_0_price'];
    }

    /**
     * Sets token_0_price
     *
     * @param string|null $token_0_price Price of token0 - derived from sqrtPrice.
     *
     * @return self
     */
    public function setToken0Price($token_0_price)
    {

        if (is_null($token_0_price)) {
            array_push($this->openAPINullablesSetToNull, 'token_0_price');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_0_price', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_0_price'] = $token_0_price;

        return $this;
    }

    /**
     * Gets token_1_price
     *
     * @return string|null
     */
    public function getToken1Price()
    {
        return $this->container['token_1_price'];
    }

    /**
     * Sets token_1_price
     *
     * @param string|null $token_1_price Price of token1 - derived from sqrtPrice.
     *
     * @return self
     */
    public function setToken1Price($token_1_price)
    {

        if (is_null($token_1_price)) {
            array_push($this->openAPINullablesSetToNull, 'token_1_price');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_1_price', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_1_price'] = $token_1_price;

        return $this;
    }

    /**
     * Gets tick
     *
     * @return string|null
     */
    public function getTick()
    {
        return $this->container['tick'];
    }

    /**
     * Sets tick
     *
     * @param string|null $tick Current tick at end of period.
     *
     * @return self
     */
    public function setTick($tick)
    {

        if (is_null($tick)) {
            array_push($this->openAPINullablesSetToNull, 'tick');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tick', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['tick'] = $tick;

        return $this;
    }

    /**
     * Gets fee_growth_global_0x128
     *
     * @return string|null
     */
    public function getFeeGrowthGlobal0x128()
    {
        return $this->container['fee_growth_global_0x128'];
    }

    /**
     * Sets fee_growth_global_0x128
     *
     * @param string|null $fee_growth_global_0x128 Tracker for global fee growth.
     *
     * @return self
     */
    public function setFeeGrowthGlobal0x128($fee_growth_global_0x128)
    {

        if (is_null($fee_growth_global_0x128)) {
            array_push($this->openAPINullablesSetToNull, 'fee_growth_global_0x128');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee_growth_global_0x128', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['fee_growth_global_0x128'] = $fee_growth_global_0x128;

        return $this;
    }

    /**
     * Gets fee_growth_global_1x128
     *
     * @return string|null
     */
    public function getFeeGrowthGlobal1x128()
    {
        return $this->container['fee_growth_global_1x128'];
    }

    /**
     * Sets fee_growth_global_1x128
     *
     * @param string|null $fee_growth_global_1x128 Tracker for global fee growth.
     *
     * @return self
     */
    public function setFeeGrowthGlobal1x128($fee_growth_global_1x128)
    {

        if (is_null($fee_growth_global_1x128)) {
            array_push($this->openAPINullablesSetToNull, 'fee_growth_global_1x128');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee_growth_global_1x128', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['fee_growth_global_1x128'] = $fee_growth_global_1x128;

        return $this;
    }

    /**
     * Gets tvl_usd
     *
     * @return string|null
     */
    public function getTvlUsd()
    {
        return $this->container['tvl_usd'];
    }

    /**
     * Sets tvl_usd
     *
     * @param string|null $tvl_usd Total value locked derived in USD at end of period.
     *
     * @return self
     */
    public function setTvlUsd($tvl_usd)
    {

        if (is_null($tvl_usd)) {
            array_push($this->openAPINullablesSetToNull, 'tvl_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tvl_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['tvl_usd'] = $tvl_usd;

        return $this;
    }

    /**
     * Gets volume_token_0
     *
     * @return string|null
     */
    public function getVolumeToken0()
    {
        return $this->container['volume_token_0'];
    }

    /**
     * Sets volume_token_0
     *
     * @param string|null $volume_token_0 Volume in token0.
     *
     * @return self
     */
    public function setVolumeToken0($volume_token_0)
    {

        if (is_null($volume_token_0)) {
            array_push($this->openAPINullablesSetToNull, 'volume_token_0');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('volume_token_0', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['volume_token_0'] = $volume_token_0;

        return $this;
    }

    /**
     * Gets volume_token_1
     *
     * @return string|null
     */
    public function getVolumeToken1()
    {
        return $this->container['volume_token_1'];
    }

    /**
     * Sets volume_token_1
     *
     * @param string|null $volume_token_1 Volume in token1.
     *
     * @return self
     */
    public function setVolumeToken1($volume_token_1)
    {

        if (is_null($volume_token_1)) {
            array_push($this->openAPINullablesSetToNull, 'volume_token_1');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('volume_token_1', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['volume_token_1'] = $volume_token_1;

        return $this;
    }

    /**
     * Gets volume_usd
     *
     * @return string|null
     */
    public function getVolumeUsd()
    {
        return $this->container['volume_usd'];
    }

    /**
     * Sets volume_usd
     *
     * @param string|null $volume_usd Volume in USD.
     *
     * @return self
     */
    public function setVolumeUsd($volume_usd)
    {

        if (is_null($volume_usd)) {
            array_push($this->openAPINullablesSetToNull, 'volume_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('volume_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['volume_usd'] = $volume_usd;

        return $this;
    }

    /**
     * Gets fees_usd
     *
     * @return string|null
     */
    public function getFeesUsd()
    {
        return $this->container['fees_usd'];
    }

    /**
     * Sets fees_usd
     *
     * @param string|null $fees_usd Fees in USD.
     *
     * @return self
     */
    public function setFeesUsd($fees_usd)
    {

        if (is_null($fees_usd)) {
            array_push($this->openAPINullablesSetToNull, 'fees_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fees_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['fees_usd'] = $fees_usd;

        return $this;
    }

    /**
     * Gets tx_count
     *
     * @return string|null
     */
    public function getTxCount()
    {
        return $this->container['tx_count'];
    }

    /**
     * Sets tx_count
     *
     * @param string|null $tx_count Number of transactions during period.
     *
     * @return self
     */
    public function setTxCount($tx_count)
    {

        if (is_null($tx_count)) {
            array_push($this->openAPINullablesSetToNull, 'tx_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tx_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['tx_count'] = $tx_count;

        return $this;
    }

    /**
     * Gets open
     *
     * @return string|null
     */
    public function getOpen()
    {
        return $this->container['open'];
    }

    /**
     * Sets open
     *
     * @param string|null $open Opening price of token0.
     *
     * @return self
     */
    public function setOpen($open)
    {

        if (is_null($open)) {
            array_push($this->openAPINullablesSetToNull, 'open');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('open', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['open'] = $open;

        return $this;
    }

    /**
     * Gets high
     *
     * @return string|null
     */
    public function getHigh()
    {
        return $this->container['high'];
    }

    /**
     * Sets high
     *
     * @param string|null $high High price of token0.
     *
     * @return self
     */
    public function setHigh($high)
    {

        if (is_null($high)) {
            array_push($this->openAPINullablesSetToNull, 'high');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('high', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['high'] = $high;

        return $this;
    }

    /**
     * Gets low
     *
     * @return string|null
     */
    public function getLow()
    {
        return $this->container['low'];
    }

    /**
     * Sets low
     *
     * @param string|null $low Low price of token0.
     *
     * @return self
     */
    public function setLow($low)
    {

        if (is_null($low)) {
            array_push($this->openAPINullablesSetToNull, 'low');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('low', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['low'] = $low;

        return $this;
    }

    /**
     * Gets close
     *
     * @return string|null
     */
    public function getClose()
    {
        return $this->container['close'];
    }

    /**
     * Sets close
     *
     * @param string|null $close Close price of token0.
     *
     * @return self
     */
    public function setClose($close)
    {

        if (is_null($close)) {
            array_push($this->openAPINullablesSetToNull, 'close');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('close', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['close'] = $close;

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


