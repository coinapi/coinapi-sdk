<?php
/**
 * UniswapV3TickDTO
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
 * UniswapV3TickDTO Class Doc Comment
 *
 * @category Class
 * @description Ticks are the boundaries between discrete areas in price space.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UniswapV3TickDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UniswapV3.TickDTO';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'entry_time' => '\DateTime',
        'recv_time' => '\DateTime',
        'block_number' => 'int',
        'vid' => 'int',
        'id' => 'string',
        'pool_address' => 'string',
        'tick_idx' => '\OpenAPI\Client\Model\NumericsBigInteger',
        'pool' => 'string',
        'liquidity_gross' => '\OpenAPI\Client\Model\NumericsBigInteger',
        'liquidity_net' => '\OpenAPI\Client\Model\NumericsBigInteger',
        'price_0' => 'string',
        'price_1' => 'string',
        'volume_token_0' => 'string',
        'volume_token_1' => 'string',
        'volume_usd' => 'string',
        'untracked_volume_usd' => 'string',
        'fees_usd' => 'string',
        'collected_fees_token_0' => 'string',
        'collected_fees_token_1' => 'string',
        'collected_fees_usd' => 'string',
        'created_at_timestamp' => '\DateTime',
        'liquidity_provider_count' => '\OpenAPI\Client\Model\NumericsBigInteger',
        'fee_growth_outside_0x128' => '\OpenAPI\Client\Model\NumericsBigInteger',
        'fee_growth_outside_1x128' => '\OpenAPI\Client\Model\NumericsBigInteger'
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
        'vid' => 'int64',
        'id' => null,
        'pool_address' => null,
        'tick_idx' => null,
        'pool' => null,
        'liquidity_gross' => null,
        'liquidity_net' => null,
        'price_0' => null,
        'price_1' => null,
        'volume_token_0' => null,
        'volume_token_1' => null,
        'volume_usd' => null,
        'untracked_volume_usd' => null,
        'fees_usd' => null,
        'collected_fees_token_0' => null,
        'collected_fees_token_1' => null,
        'collected_fees_usd' => null,
        'created_at_timestamp' => 'date-time',
        'liquidity_provider_count' => null,
        'fee_growth_outside_0x128' => null,
        'fee_growth_outside_1x128' => null
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
		'vid' => false,
		'id' => true,
		'pool_address' => true,
		'tick_idx' => false,
		'pool' => true,
		'liquidity_gross' => false,
		'liquidity_net' => false,
		'price_0' => true,
		'price_1' => true,
		'volume_token_0' => true,
		'volume_token_1' => true,
		'volume_usd' => true,
		'untracked_volume_usd' => true,
		'fees_usd' => true,
		'collected_fees_token_0' => true,
		'collected_fees_token_1' => true,
		'collected_fees_usd' => true,
		'created_at_timestamp' => false,
		'liquidity_provider_count' => false,
		'fee_growth_outside_0x128' => false,
		'fee_growth_outside_1x128' => false
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
        'vid' => 'vid',
        'id' => 'id',
        'pool_address' => 'pool_address',
        'tick_idx' => 'tick_idx',
        'pool' => 'pool',
        'liquidity_gross' => 'liquidity_gross',
        'liquidity_net' => 'liquidity_net',
        'price_0' => 'price_0',
        'price_1' => 'price_1',
        'volume_token_0' => 'volume_token_0',
        'volume_token_1' => 'volume_token_1',
        'volume_usd' => 'volume_usd',
        'untracked_volume_usd' => 'untracked_volume_usd',
        'fees_usd' => 'fees_usd',
        'collected_fees_token_0' => 'collected_fees_token_0',
        'collected_fees_token_1' => 'collected_fees_token_1',
        'collected_fees_usd' => 'collected_fees_usd',
        'created_at_timestamp' => 'created_at_timestamp',
        'liquidity_provider_count' => 'liquidity_provider_count',
        'fee_growth_outside_0x128' => 'fee_growth_outside_0x128',
        'fee_growth_outside_1x128' => 'fee_growth_outside_1x128'
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
        'vid' => 'setVid',
        'id' => 'setId',
        'pool_address' => 'setPoolAddress',
        'tick_idx' => 'setTickIdx',
        'pool' => 'setPool',
        'liquidity_gross' => 'setLiquidityGross',
        'liquidity_net' => 'setLiquidityNet',
        'price_0' => 'setPrice0',
        'price_1' => 'setPrice1',
        'volume_token_0' => 'setVolumeToken0',
        'volume_token_1' => 'setVolumeToken1',
        'volume_usd' => 'setVolumeUsd',
        'untracked_volume_usd' => 'setUntrackedVolumeUsd',
        'fees_usd' => 'setFeesUsd',
        'collected_fees_token_0' => 'setCollectedFeesToken0',
        'collected_fees_token_1' => 'setCollectedFeesToken1',
        'collected_fees_usd' => 'setCollectedFeesUsd',
        'created_at_timestamp' => 'setCreatedAtTimestamp',
        'liquidity_provider_count' => 'setLiquidityProviderCount',
        'fee_growth_outside_0x128' => 'setFeeGrowthOutside0x128',
        'fee_growth_outside_1x128' => 'setFeeGrowthOutside1x128'
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
        'vid' => 'getVid',
        'id' => 'getId',
        'pool_address' => 'getPoolAddress',
        'tick_idx' => 'getTickIdx',
        'pool' => 'getPool',
        'liquidity_gross' => 'getLiquidityGross',
        'liquidity_net' => 'getLiquidityNet',
        'price_0' => 'getPrice0',
        'price_1' => 'getPrice1',
        'volume_token_0' => 'getVolumeToken0',
        'volume_token_1' => 'getVolumeToken1',
        'volume_usd' => 'getVolumeUsd',
        'untracked_volume_usd' => 'getUntrackedVolumeUsd',
        'fees_usd' => 'getFeesUsd',
        'collected_fees_token_0' => 'getCollectedFeesToken0',
        'collected_fees_token_1' => 'getCollectedFeesToken1',
        'collected_fees_usd' => 'getCollectedFeesUsd',
        'created_at_timestamp' => 'getCreatedAtTimestamp',
        'liquidity_provider_count' => 'getLiquidityProviderCount',
        'fee_growth_outside_0x128' => 'getFeeGrowthOutside0x128',
        'fee_growth_outside_1x128' => 'getFeeGrowthOutside1x128'
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
        $this->setIfExists('vid', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('pool_address', $data ?? [], null);
        $this->setIfExists('tick_idx', $data ?? [], null);
        $this->setIfExists('pool', $data ?? [], null);
        $this->setIfExists('liquidity_gross', $data ?? [], null);
        $this->setIfExists('liquidity_net', $data ?? [], null);
        $this->setIfExists('price_0', $data ?? [], null);
        $this->setIfExists('price_1', $data ?? [], null);
        $this->setIfExists('volume_token_0', $data ?? [], null);
        $this->setIfExists('volume_token_1', $data ?? [], null);
        $this->setIfExists('volume_usd', $data ?? [], null);
        $this->setIfExists('untracked_volume_usd', $data ?? [], null);
        $this->setIfExists('fees_usd', $data ?? [], null);
        $this->setIfExists('collected_fees_token_0', $data ?? [], null);
        $this->setIfExists('collected_fees_token_1', $data ?? [], null);
        $this->setIfExists('collected_fees_usd', $data ?? [], null);
        $this->setIfExists('created_at_timestamp', $data ?? [], null);
        $this->setIfExists('liquidity_provider_count', $data ?? [], null);
        $this->setIfExists('fee_growth_outside_0x128', $data ?? [], null);
        $this->setIfExists('fee_growth_outside_1x128', $data ?? [], null);
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
     * @param string|null $id Identifier, format: (pool address)#(tick index)
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
     * Gets pool_address
     *
     * @return string|null
     */
    public function getPoolAddress()
    {
        return $this->container['pool_address'];
    }

    /**
     * Sets pool_address
     *
     * @param string|null $pool_address Pool address.
     *
     * @return self
     */
    public function setPoolAddress($pool_address)
    {
        if (is_null($pool_address)) {
            array_push($this->openAPINullablesSetToNull, 'pool_address');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('pool_address', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['pool_address'] = $pool_address;

        return $this;
    }

    /**
     * Gets tick_idx
     *
     * @return \OpenAPI\Client\Model\NumericsBigInteger|null
     */
    public function getTickIdx()
    {
        return $this->container['tick_idx'];
    }

    /**
     * Sets tick_idx
     *
     * @param \OpenAPI\Client\Model\NumericsBigInteger|null $tick_idx tick_idx
     *
     * @return self
     */
    public function setTickIdx($tick_idx)
    {
        if (is_null($tick_idx)) {
            throw new \InvalidArgumentException('non-nullable tick_idx cannot be null');
        }
        $this->container['tick_idx'] = $tick_idx;

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
     * @param string|null $pool Pool address.
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
     * Gets liquidity_gross
     *
     * @return \OpenAPI\Client\Model\NumericsBigInteger|null
     */
    public function getLiquidityGross()
    {
        return $this->container['liquidity_gross'];
    }

    /**
     * Sets liquidity_gross
     *
     * @param \OpenAPI\Client\Model\NumericsBigInteger|null $liquidity_gross liquidity_gross
     *
     * @return self
     */
    public function setLiquidityGross($liquidity_gross)
    {
        if (is_null($liquidity_gross)) {
            throw new \InvalidArgumentException('non-nullable liquidity_gross cannot be null');
        }
        $this->container['liquidity_gross'] = $liquidity_gross;

        return $this;
    }

    /**
     * Gets liquidity_net
     *
     * @return \OpenAPI\Client\Model\NumericsBigInteger|null
     */
    public function getLiquidityNet()
    {
        return $this->container['liquidity_net'];
    }

    /**
     * Sets liquidity_net
     *
     * @param \OpenAPI\Client\Model\NumericsBigInteger|null $liquidity_net liquidity_net
     *
     * @return self
     */
    public function setLiquidityNet($liquidity_net)
    {
        if (is_null($liquidity_net)) {
            throw new \InvalidArgumentException('non-nullable liquidity_net cannot be null');
        }
        $this->container['liquidity_net'] = $liquidity_net;

        return $this;
    }

    /**
     * Gets price_0
     *
     * @return string|null
     */
    public function getPrice0()
    {
        return $this->container['price_0'];
    }

    /**
     * Sets price_0
     *
     * @param string|null $price_0 Calculated price of token0 of tick within this pool - constant.
     *
     * @return self
     */
    public function setPrice0($price_0)
    {
        if (is_null($price_0)) {
            array_push($this->openAPINullablesSetToNull, 'price_0');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('price_0', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['price_0'] = $price_0;

        return $this;
    }

    /**
     * Gets price_1
     *
     * @return string|null
     */
    public function getPrice1()
    {
        return $this->container['price_1'];
    }

    /**
     * Sets price_1
     *
     * @param string|null $price_1 Calculated price of token1 of tick within this pool - constant.
     *
     * @return self
     */
    public function setPrice1($price_1)
    {
        if (is_null($price_1)) {
            array_push($this->openAPINullablesSetToNull, 'price_1');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('price_1', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['price_1'] = $price_1;

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
     * @param string|null $volume_token_0 Lifetime volume of token0 with this tick in range.
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
     * @param string|null $volume_token_1 Lifetime volume of token1 with this tick in range.
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
     * @param string|null $volume_usd Lifetime volume in derived USD with this tick in range.
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
     * Gets untracked_volume_usd
     *
     * @return string|null
     */
    public function getUntrackedVolumeUsd()
    {
        return $this->container['untracked_volume_usd'];
    }

    /**
     * Sets untracked_volume_usd
     *
     * @param string|null $untracked_volume_usd Lifetime volume in untracked USD with this tick in range.
     *
     * @return self
     */
    public function setUntrackedVolumeUsd($untracked_volume_usd)
    {
        if (is_null($untracked_volume_usd)) {
            array_push($this->openAPINullablesSetToNull, 'untracked_volume_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('untracked_volume_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['untracked_volume_usd'] = $untracked_volume_usd;

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
     * Gets collected_fees_token_0
     *
     * @return string|null
     */
    public function getCollectedFeesToken0()
    {
        return $this->container['collected_fees_token_0'];
    }

    /**
     * Sets collected_fees_token_0
     *
     * @param string|null $collected_fees_token_0 All time collected fees in token0.
     *
     * @return self
     */
    public function setCollectedFeesToken0($collected_fees_token_0)
    {
        if (is_null($collected_fees_token_0)) {
            array_push($this->openAPINullablesSetToNull, 'collected_fees_token_0');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('collected_fees_token_0', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['collected_fees_token_0'] = $collected_fees_token_0;

        return $this;
    }

    /**
     * Gets collected_fees_token_1
     *
     * @return string|null
     */
    public function getCollectedFeesToken1()
    {
        return $this->container['collected_fees_token_1'];
    }

    /**
     * Sets collected_fees_token_1
     *
     * @param string|null $collected_fees_token_1 All time collected fees in token1.
     *
     * @return self
     */
    public function setCollectedFeesToken1($collected_fees_token_1)
    {
        if (is_null($collected_fees_token_1)) {
            array_push($this->openAPINullablesSetToNull, 'collected_fees_token_1');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('collected_fees_token_1', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['collected_fees_token_1'] = $collected_fees_token_1;

        return $this;
    }

    /**
     * Gets collected_fees_usd
     *
     * @return string|null
     */
    public function getCollectedFeesUsd()
    {
        return $this->container['collected_fees_usd'];
    }

    /**
     * Sets collected_fees_usd
     *
     * @param string|null $collected_fees_usd All time collected fees in USD.
     *
     * @return self
     */
    public function setCollectedFeesUsd($collected_fees_usd)
    {
        if (is_null($collected_fees_usd)) {
            array_push($this->openAPINullablesSetToNull, 'collected_fees_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('collected_fees_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['collected_fees_usd'] = $collected_fees_usd;

        return $this;
    }

    /**
     * Gets created_at_timestamp
     *
     * @return \DateTime|null
     */
    public function getCreatedAtTimestamp()
    {
        return $this->container['created_at_timestamp'];
    }

    /**
     * Sets created_at_timestamp
     *
     * @param \DateTime|null $created_at_timestamp Created time.
     *
     * @return self
     */
    public function setCreatedAtTimestamp($created_at_timestamp)
    {
        if (is_null($created_at_timestamp)) {
            throw new \InvalidArgumentException('non-nullable created_at_timestamp cannot be null');
        }
        $this->container['created_at_timestamp'] = $created_at_timestamp;

        return $this;
    }

    /**
     * Gets liquidity_provider_count
     *
     * @return \OpenAPI\Client\Model\NumericsBigInteger|null
     */
    public function getLiquidityProviderCount()
    {
        return $this->container['liquidity_provider_count'];
    }

    /**
     * Sets liquidity_provider_count
     *
     * @param \OpenAPI\Client\Model\NumericsBigInteger|null $liquidity_provider_count liquidity_provider_count
     *
     * @return self
     */
    public function setLiquidityProviderCount($liquidity_provider_count)
    {
        if (is_null($liquidity_provider_count)) {
            throw new \InvalidArgumentException('non-nullable liquidity_provider_count cannot be null');
        }
        $this->container['liquidity_provider_count'] = $liquidity_provider_count;

        return $this;
    }

    /**
     * Gets fee_growth_outside_0x128
     *
     * @return \OpenAPI\Client\Model\NumericsBigInteger|null
     */
    public function getFeeGrowthOutside0x128()
    {
        return $this->container['fee_growth_outside_0x128'];
    }

    /**
     * Sets fee_growth_outside_0x128
     *
     * @param \OpenAPI\Client\Model\NumericsBigInteger|null $fee_growth_outside_0x128 fee_growth_outside_0x128
     *
     * @return self
     */
    public function setFeeGrowthOutside0x128($fee_growth_outside_0x128)
    {
        if (is_null($fee_growth_outside_0x128)) {
            throw new \InvalidArgumentException('non-nullable fee_growth_outside_0x128 cannot be null');
        }
        $this->container['fee_growth_outside_0x128'] = $fee_growth_outside_0x128;

        return $this;
    }

    /**
     * Gets fee_growth_outside_1x128
     *
     * @return \OpenAPI\Client\Model\NumericsBigInteger|null
     */
    public function getFeeGrowthOutside1x128()
    {
        return $this->container['fee_growth_outside_1x128'];
    }

    /**
     * Sets fee_growth_outside_1x128
     *
     * @param \OpenAPI\Client\Model\NumericsBigInteger|null $fee_growth_outside_1x128 fee_growth_outside_1x128
     *
     * @return self
     */
    public function setFeeGrowthOutside1x128($fee_growth_outside_1x128)
    {
        if (is_null($fee_growth_outside_1x128)) {
            throw new \InvalidArgumentException('non-nullable fee_growth_outside_1x128 cannot be null');
        }
        $this->container['fee_growth_outside_1x128'] = $fee_growth_outside_1x128;

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


