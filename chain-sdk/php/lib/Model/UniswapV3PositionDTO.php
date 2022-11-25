<?php
/**
 * UniswapV3PositionDTO
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
 * UniswapV3PositionDTO Class Doc Comment
 *
 * @category Class
 * @description Positions created through NonfungiblePositionManager. Positions are represented as NFTs (ERC-721 tokens) as opposed to the fungible ERC-20 tokens on Uniswap V1 and V2.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UniswapV3PositionDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UniswapV3.PositionDTO';

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
        'owner' => 'string',
        'pool' => 'string',
        'token_0' => 'string',
        'token_1' => 'string',
        'tick_lower' => 'string',
        'tick_upper' => 'string',
        'liquidity' => 'string',
        'deposited_token_0' => 'string',
        'deposited_token_1' => 'string',
        'withdrawn_token_0' => 'string',
        'withdrawn_token_1' => 'string',
        'collected_fees_token_0' => 'string',
        'collected_fees_token_1' => 'string',
        'transaction' => 'string',
        'fee_growth_inside_0_last_x128' => 'string',
        'fee_growth_inside_1_last_x128' => 'string',
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
        'owner' => null,
        'pool' => null,
        'token_0' => null,
        'token_1' => null,
        'tick_lower' => null,
        'tick_upper' => null,
        'liquidity' => null,
        'deposited_token_0' => null,
        'deposited_token_1' => null,
        'withdrawn_token_0' => null,
        'withdrawn_token_1' => null,
        'collected_fees_token_0' => null,
        'collected_fees_token_1' => null,
        'transaction' => null,
        'fee_growth_inside_0_last_x128' => null,
        'fee_growth_inside_1_last_x128' => null,
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
		'owner' => true,
		'pool' => true,
		'token_0' => true,
		'token_1' => true,
		'tick_lower' => true,
		'tick_upper' => true,
		'liquidity' => true,
		'deposited_token_0' => true,
		'deposited_token_1' => true,
		'withdrawn_token_0' => true,
		'withdrawn_token_1' => true,
		'collected_fees_token_0' => true,
		'collected_fees_token_1' => true,
		'transaction' => true,
		'fee_growth_inside_0_last_x128' => true,
		'fee_growth_inside_1_last_x128' => true,
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
        'owner' => 'owner',
        'pool' => 'pool',
        'token_0' => 'token_0',
        'token_1' => 'token_1',
        'tick_lower' => 'tick_lower',
        'tick_upper' => 'tick_upper',
        'liquidity' => 'liquidity',
        'deposited_token_0' => 'deposited_token_0',
        'deposited_token_1' => 'deposited_token_1',
        'withdrawn_token_0' => 'withdrawn_token_0',
        'withdrawn_token_1' => 'withdrawn_token_1',
        'collected_fees_token_0' => 'collected_fees_token_0',
        'collected_fees_token_1' => 'collected_fees_token_1',
        'transaction' => 'transaction',
        'fee_growth_inside_0_last_x128' => 'fee_growth_inside_0_last_x128',
        'fee_growth_inside_1_last_x128' => 'fee_growth_inside_1_last_x128',
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
        'owner' => 'setOwner',
        'pool' => 'setPool',
        'token_0' => 'setToken0',
        'token_1' => 'setToken1',
        'tick_lower' => 'setTickLower',
        'tick_upper' => 'setTickUpper',
        'liquidity' => 'setLiquidity',
        'deposited_token_0' => 'setDepositedToken0',
        'deposited_token_1' => 'setDepositedToken1',
        'withdrawn_token_0' => 'setWithdrawnToken0',
        'withdrawn_token_1' => 'setWithdrawnToken1',
        'collected_fees_token_0' => 'setCollectedFeesToken0',
        'collected_fees_token_1' => 'setCollectedFeesToken1',
        'transaction' => 'setTransaction',
        'fee_growth_inside_0_last_x128' => 'setFeeGrowthInside0LastX128',
        'fee_growth_inside_1_last_x128' => 'setFeeGrowthInside1LastX128',
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
        'owner' => 'getOwner',
        'pool' => 'getPool',
        'token_0' => 'getToken0',
        'token_1' => 'getToken1',
        'tick_lower' => 'getTickLower',
        'tick_upper' => 'getTickUpper',
        'liquidity' => 'getLiquidity',
        'deposited_token_0' => 'getDepositedToken0',
        'deposited_token_1' => 'getDepositedToken1',
        'withdrawn_token_0' => 'getWithdrawnToken0',
        'withdrawn_token_1' => 'getWithdrawnToken1',
        'collected_fees_token_0' => 'getCollectedFeesToken0',
        'collected_fees_token_1' => 'getCollectedFeesToken1',
        'transaction' => 'getTransaction',
        'fee_growth_inside_0_last_x128' => 'getFeeGrowthInside0LastX128',
        'fee_growth_inside_1_last_x128' => 'getFeeGrowthInside1LastX128',
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
        $this->setIfExists('owner', $data ?? [], null);
        $this->setIfExists('pool', $data ?? [], null);
        $this->setIfExists('token_0', $data ?? [], null);
        $this->setIfExists('token_1', $data ?? [], null);
        $this->setIfExists('tick_lower', $data ?? [], null);
        $this->setIfExists('tick_upper', $data ?? [], null);
        $this->setIfExists('liquidity', $data ?? [], null);
        $this->setIfExists('deposited_token_0', $data ?? [], null);
        $this->setIfExists('deposited_token_1', $data ?? [], null);
        $this->setIfExists('withdrawn_token_0', $data ?? [], null);
        $this->setIfExists('withdrawn_token_1', $data ?? [], null);
        $this->setIfExists('collected_fees_token_0', $data ?? [], null);
        $this->setIfExists('collected_fees_token_1', $data ?? [], null);
        $this->setIfExists('transaction', $data ?? [], null);
        $this->setIfExists('fee_growth_inside_0_last_x128', $data ?? [], null);
        $this->setIfExists('fee_growth_inside_1_last_x128', $data ?? [], null);
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
     * @param string|null $id NFT token identifier.
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
     * Gets owner
     *
     * @return string|null
     */
    public function getOwner()
    {
        return $this->container['owner'];
    }

    /**
     * Sets owner
     *
     * @param string|null $owner Owner of the NFT.
     *
     * @return self
     */
    public function setOwner($owner)
    {

        if (is_null($owner)) {
            array_push($this->openAPINullablesSetToNull, 'owner');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('owner', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['owner'] = $owner;

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
     * @param string|null $pool Pool position is within.
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
     * Gets token_0
     *
     * @return string|null
     */
    public function getToken0()
    {
        return $this->container['token_0'];
    }

    /**
     * Sets token_0
     *
     * @param string|null $token_0 Reference to token0 as stored in pair contract.
     *
     * @return self
     */
    public function setToken0($token_0)
    {

        if (is_null($token_0)) {
            array_push($this->openAPINullablesSetToNull, 'token_0');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_0', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_0'] = $token_0;

        return $this;
    }

    /**
     * Gets token_1
     *
     * @return string|null
     */
    public function getToken1()
    {
        return $this->container['token_1'];
    }

    /**
     * Sets token_1
     *
     * @param string|null $token_1 Reference to token1 as stored in pair contract.
     *
     * @return self
     */
    public function setToken1($token_1)
    {

        if (is_null($token_1)) {
            array_push($this->openAPINullablesSetToNull, 'token_1');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_1', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_1'] = $token_1;

        return $this;
    }

    /**
     * Gets tick_lower
     *
     * @return string|null
     */
    public function getTickLower()
    {
        return $this->container['tick_lower'];
    }

    /**
     * Sets tick_lower
     *
     * @param string|null $tick_lower Lower tick of the position.
     *
     * @return self
     */
    public function setTickLower($tick_lower)
    {

        if (is_null($tick_lower)) {
            array_push($this->openAPINullablesSetToNull, 'tick_lower');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tick_lower', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['tick_lower'] = $tick_lower;

        return $this;
    }

    /**
     * Gets tick_upper
     *
     * @return string|null
     */
    public function getTickUpper()
    {
        return $this->container['tick_upper'];
    }

    /**
     * Sets tick_upper
     *
     * @param string|null $tick_upper Upper tick of the position.
     *
     * @return self
     */
    public function setTickUpper($tick_upper)
    {

        if (is_null($tick_upper)) {
            array_push($this->openAPINullablesSetToNull, 'tick_upper');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tick_upper', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['tick_upper'] = $tick_upper;

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
     * @param string|null $liquidity Total position liquidity.
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
     * Gets deposited_token_0
     *
     * @return string|null
     */
    public function getDepositedToken0()
    {
        return $this->container['deposited_token_0'];
    }

    /**
     * Sets deposited_token_0
     *
     * @param string|null $deposited_token_0 Amount of token 0 ever deposited to position.
     *
     * @return self
     */
    public function setDepositedToken0($deposited_token_0)
    {

        if (is_null($deposited_token_0)) {
            array_push($this->openAPINullablesSetToNull, 'deposited_token_0');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('deposited_token_0', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['deposited_token_0'] = $deposited_token_0;

        return $this;
    }

    /**
     * Gets deposited_token_1
     *
     * @return string|null
     */
    public function getDepositedToken1()
    {
        return $this->container['deposited_token_1'];
    }

    /**
     * Sets deposited_token_1
     *
     * @param string|null $deposited_token_1 Amount of token 1 ever deposited to position.
     *
     * @return self
     */
    public function setDepositedToken1($deposited_token_1)
    {

        if (is_null($deposited_token_1)) {
            array_push($this->openAPINullablesSetToNull, 'deposited_token_1');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('deposited_token_1', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['deposited_token_1'] = $deposited_token_1;

        return $this;
    }

    /**
     * Gets withdrawn_token_0
     *
     * @return string|null
     */
    public function getWithdrawnToken0()
    {
        return $this->container['withdrawn_token_0'];
    }

    /**
     * Sets withdrawn_token_0
     *
     * @param string|null $withdrawn_token_0 Amount of token 0 ever withdrawn from position (without fees).
     *
     * @return self
     */
    public function setWithdrawnToken0($withdrawn_token_0)
    {

        if (is_null($withdrawn_token_0)) {
            array_push($this->openAPINullablesSetToNull, 'withdrawn_token_0');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('withdrawn_token_0', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['withdrawn_token_0'] = $withdrawn_token_0;

        return $this;
    }

    /**
     * Gets withdrawn_token_1
     *
     * @return string|null
     */
    public function getWithdrawnToken1()
    {
        return $this->container['withdrawn_token_1'];
    }

    /**
     * Sets withdrawn_token_1
     *
     * @param string|null $withdrawn_token_1 Amount of token 1 ever withdrawn from position (without fees).
     *
     * @return self
     */
    public function setWithdrawnToken1($withdrawn_token_1)
    {

        if (is_null($withdrawn_token_1)) {
            array_push($this->openAPINullablesSetToNull, 'withdrawn_token_1');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('withdrawn_token_1', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['withdrawn_token_1'] = $withdrawn_token_1;

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
     * Gets transaction
     *
     * @return string|null
     */
    public function getTransaction()
    {
        return $this->container['transaction'];
    }

    /**
     * Sets transaction
     *
     * @param string|null $transaction Transaction in which the position was initialized.
     *
     * @return self
     */
    public function setTransaction($transaction)
    {

        if (is_null($transaction)) {
            array_push($this->openAPINullablesSetToNull, 'transaction');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('transaction', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['transaction'] = $transaction;

        return $this;
    }

    /**
     * Gets fee_growth_inside_0_last_x128
     *
     * @return string|null
     */
    public function getFeeGrowthInside0LastX128()
    {
        return $this->container['fee_growth_inside_0_last_x128'];
    }

    /**
     * Sets fee_growth_inside_0_last_x128
     *
     * @param string|null $fee_growth_inside_0_last_x128 Variable needed for fee computation.
     *
     * @return self
     */
    public function setFeeGrowthInside0LastX128($fee_growth_inside_0_last_x128)
    {

        if (is_null($fee_growth_inside_0_last_x128)) {
            array_push($this->openAPINullablesSetToNull, 'fee_growth_inside_0_last_x128');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee_growth_inside_0_last_x128', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['fee_growth_inside_0_last_x128'] = $fee_growth_inside_0_last_x128;

        return $this;
    }

    /**
     * Gets fee_growth_inside_1_last_x128
     *
     * @return string|null
     */
    public function getFeeGrowthInside1LastX128()
    {
        return $this->container['fee_growth_inside_1_last_x128'];
    }

    /**
     * Sets fee_growth_inside_1_last_x128
     *
     * @param string|null $fee_growth_inside_1_last_x128 Variable needed for fee computation.
     *
     * @return self
     */
    public function setFeeGrowthInside1LastX128($fee_growth_inside_1_last_x128)
    {

        if (is_null($fee_growth_inside_1_last_x128)) {
            array_push($this->openAPINullablesSetToNull, 'fee_growth_inside_1_last_x128');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee_growth_inside_1_last_x128', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['fee_growth_inside_1_last_x128'] = $fee_growth_inside_1_last_x128;

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


