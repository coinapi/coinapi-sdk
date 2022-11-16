<?php
/**
 * CurvePoolDTO
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
 * CurvePoolDTO Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CurvePoolDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Curve.PoolDTO';

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
        'name' => 'string',
        'is_meta' => 'bool',
        'registry_address' => 'string',
        'swap_address' => 'string',
        'lp_token' => 'string',
        'coin_count' => 'string',
        'underlying_count' => 'string',
        'a' => 'string',
        'fee' => 'string',
        'admin_fee' => 'string',
        'owner' => 'string',
        'virtual_price' => 'string',
        'locked' => 'string',
        'added_at' => '\DateTime',
        'added_at_block' => 'string',
        'added_at_transaction' => 'string',
        'removed_at' => 'string',
        'removed_at_block' => 'string',
        'removed_at_transaction' => 'string',
        'exchange_count' => 'string',
        'gauge_count' => 'string',
        'vid' => 'int',
        'evaluated_ask' => 'float'
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
        'name' => null,
        'is_meta' => null,
        'registry_address' => null,
        'swap_address' => null,
        'lp_token' => null,
        'coin_count' => null,
        'underlying_count' => null,
        'a' => null,
        'fee' => null,
        'admin_fee' => null,
        'owner' => null,
        'virtual_price' => null,
        'locked' => null,
        'added_at' => 'date-time',
        'added_at_block' => null,
        'added_at_transaction' => null,
        'removed_at' => null,
        'removed_at_block' => null,
        'removed_at_transaction' => null,
        'exchange_count' => null,
        'gauge_count' => null,
        'vid' => 'int64',
        'evaluated_ask' => 'double'
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
		'name' => true,
		'is_meta' => false,
		'registry_address' => true,
		'swap_address' => true,
		'lp_token' => true,
		'coin_count' => true,
		'underlying_count' => true,
		'a' => true,
		'fee' => true,
		'admin_fee' => true,
		'owner' => true,
		'virtual_price' => true,
		'locked' => true,
		'added_at' => false,
		'added_at_block' => true,
		'added_at_transaction' => true,
		'removed_at' => true,
		'removed_at_block' => true,
		'removed_at_transaction' => true,
		'exchange_count' => true,
		'gauge_count' => true,
		'vid' => false,
		'evaluated_ask' => false
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
        'name' => 'name',
        'is_meta' => 'is_meta',
        'registry_address' => 'registry_address',
        'swap_address' => 'swap_address',
        'lp_token' => 'lp_token',
        'coin_count' => 'coin_count',
        'underlying_count' => 'underlying_count',
        'a' => 'a',
        'fee' => 'fee',
        'admin_fee' => 'admin_fee',
        'owner' => 'owner',
        'virtual_price' => 'virtual_price',
        'locked' => 'locked',
        'added_at' => 'added_at',
        'added_at_block' => 'added_at_block',
        'added_at_transaction' => 'added_at_transaction',
        'removed_at' => 'removed_at',
        'removed_at_block' => 'removed_at_block',
        'removed_at_transaction' => 'removed_at_transaction',
        'exchange_count' => 'exchange_count',
        'gauge_count' => 'gauge_count',
        'vid' => 'vid',
        'evaluated_ask' => 'evaluated_ask'
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
        'name' => 'setName',
        'is_meta' => 'setIsMeta',
        'registry_address' => 'setRegistryAddress',
        'swap_address' => 'setSwapAddress',
        'lp_token' => 'setLpToken',
        'coin_count' => 'setCoinCount',
        'underlying_count' => 'setUnderlyingCount',
        'a' => 'setA',
        'fee' => 'setFee',
        'admin_fee' => 'setAdminFee',
        'owner' => 'setOwner',
        'virtual_price' => 'setVirtualPrice',
        'locked' => 'setLocked',
        'added_at' => 'setAddedAt',
        'added_at_block' => 'setAddedAtBlock',
        'added_at_transaction' => 'setAddedAtTransaction',
        'removed_at' => 'setRemovedAt',
        'removed_at_block' => 'setRemovedAtBlock',
        'removed_at_transaction' => 'setRemovedAtTransaction',
        'exchange_count' => 'setExchangeCount',
        'gauge_count' => 'setGaugeCount',
        'vid' => 'setVid',
        'evaluated_ask' => 'setEvaluatedAsk'
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
        'name' => 'getName',
        'is_meta' => 'getIsMeta',
        'registry_address' => 'getRegistryAddress',
        'swap_address' => 'getSwapAddress',
        'lp_token' => 'getLpToken',
        'coin_count' => 'getCoinCount',
        'underlying_count' => 'getUnderlyingCount',
        'a' => 'getA',
        'fee' => 'getFee',
        'admin_fee' => 'getAdminFee',
        'owner' => 'getOwner',
        'virtual_price' => 'getVirtualPrice',
        'locked' => 'getLocked',
        'added_at' => 'getAddedAt',
        'added_at_block' => 'getAddedAtBlock',
        'added_at_transaction' => 'getAddedAtTransaction',
        'removed_at' => 'getRemovedAt',
        'removed_at_block' => 'getRemovedAtBlock',
        'removed_at_transaction' => 'getRemovedAtTransaction',
        'exchange_count' => 'getExchangeCount',
        'gauge_count' => 'getGaugeCount',
        'vid' => 'getVid',
        'evaluated_ask' => 'getEvaluatedAsk'
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
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('is_meta', $data ?? [], null);
        $this->setIfExists('registry_address', $data ?? [], null);
        $this->setIfExists('swap_address', $data ?? [], null);
        $this->setIfExists('lp_token', $data ?? [], null);
        $this->setIfExists('coin_count', $data ?? [], null);
        $this->setIfExists('underlying_count', $data ?? [], null);
        $this->setIfExists('a', $data ?? [], null);
        $this->setIfExists('fee', $data ?? [], null);
        $this->setIfExists('admin_fee', $data ?? [], null);
        $this->setIfExists('owner', $data ?? [], null);
        $this->setIfExists('virtual_price', $data ?? [], null);
        $this->setIfExists('locked', $data ?? [], null);
        $this->setIfExists('added_at', $data ?? [], null);
        $this->setIfExists('added_at_block', $data ?? [], null);
        $this->setIfExists('added_at_transaction', $data ?? [], null);
        $this->setIfExists('removed_at', $data ?? [], null);
        $this->setIfExists('removed_at_block', $data ?? [], null);
        $this->setIfExists('removed_at_transaction', $data ?? [], null);
        $this->setIfExists('exchange_count', $data ?? [], null);
        $this->setIfExists('gauge_count', $data ?? [], null);
        $this->setIfExists('vid', $data ?? [], null);
        $this->setIfExists('evaluated_ask', $data ?? [], null);
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
     * @param string|null $id Pool address.
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
     * Gets name
     *
     * @return string|null
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string|null $name Pool's human-readable name.
     *
     * @return self
     */
    public function setName($name)
    {

        if (is_null($name)) {
            array_push($this->openAPINullablesSetToNull, 'name');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('name', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets is_meta
     *
     * @return bool|null
     */
    public function getIsMeta()
    {
        return $this->container['is_meta'];
    }

    /**
     * Sets is_meta
     *
     * @param bool|null $is_meta Identify whether pool is a metapool.
     *
     * @return self
     */
    public function setIsMeta($is_meta)
    {

        if (is_null($is_meta)) {
            throw new \InvalidArgumentException('non-nullable is_meta cannot be null');
        }

        $this->container['is_meta'] = $is_meta;

        return $this;
    }

    /**
     * Gets registry_address
     *
     * @return string|null
     */
    public function getRegistryAddress()
    {
        return $this->container['registry_address'];
    }

    /**
     * Sets registry_address
     *
     * @param string|null $registry_address Registry contract address from where this pool was registered.
     *
     * @return self
     */
    public function setRegistryAddress($registry_address)
    {

        if (is_null($registry_address)) {
            array_push($this->openAPINullablesSetToNull, 'registry_address');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('registry_address', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['registry_address'] = $registry_address;

        return $this;
    }

    /**
     * Gets swap_address
     *
     * @return string|null
     */
    public function getSwapAddress()
    {
        return $this->container['swap_address'];
    }

    /**
     * Sets swap_address
     *
     * @param string|null $swap_address Swap contract address.
     *
     * @return self
     */
    public function setSwapAddress($swap_address)
    {

        if (is_null($swap_address)) {
            array_push($this->openAPINullablesSetToNull, 'swap_address');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('swap_address', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['swap_address'] = $swap_address;

        return $this;
    }

    /**
     * Gets lp_token
     *
     * @return string|null
     */
    public function getLpToken()
    {
        return $this->container['lp_token'];
    }

    /**
     * Sets lp_token
     *
     * @param string|null $lp_token Address of the token representing LP share.
     *
     * @return self
     */
    public function setLpToken($lp_token)
    {

        if (is_null($lp_token)) {
            array_push($this->openAPINullablesSetToNull, 'lp_token');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('lp_token', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['lp_token'] = $lp_token;

        return $this;
    }

    /**
     * Gets coin_count
     *
     * @return string|null
     */
    public function getCoinCount()
    {
        return $this->container['coin_count'];
    }

    /**
     * Sets coin_count
     *
     * @param string|null $coin_count Number of coins composing the pool.
     *
     * @return self
     */
    public function setCoinCount($coin_count)
    {

        if (is_null($coin_count)) {
            array_push($this->openAPINullablesSetToNull, 'coin_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('coin_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['coin_count'] = $coin_count;

        return $this;
    }

    /**
     * Gets underlying_count
     *
     * @return string|null
     */
    public function getUnderlyingCount()
    {
        return $this->container['underlying_count'];
    }

    /**
     * Sets underlying_count
     *
     * @param string|null $underlying_count Number of underlying coins composing the pool.
     *
     * @return self
     */
    public function setUnderlyingCount($underlying_count)
    {

        if (is_null($underlying_count)) {
            array_push($this->openAPINullablesSetToNull, 'underlying_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('underlying_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['underlying_count'] = $underlying_count;

        return $this;
    }

    /**
     * Gets a
     *
     * @return string|null
     */
    public function getA()
    {
        return $this->container['a'];
    }

    /**
     * Sets a
     *
     * @param string|null $a Amplification coefficient multiplied by n * (n - 1).
     *
     * @return self
     */
    public function setA($a)
    {

        if (is_null($a)) {
            array_push($this->openAPINullablesSetToNull, 'a');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('a', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['a'] = $a;

        return $this;
    }

    /**
     * Gets fee
     *
     * @return string|null
     */
    public function getFee()
    {
        return $this->container['fee'];
    }

    /**
     * Sets fee
     *
     * @param string|null $fee Fee to charge for exchanges.
     *
     * @return self
     */
    public function setFee($fee)
    {

        if (is_null($fee)) {
            array_push($this->openAPINullablesSetToNull, 'fee');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['fee'] = $fee;

        return $this;
    }

    /**
     * Gets admin_fee
     *
     * @return string|null
     */
    public function getAdminFee()
    {
        return $this->container['admin_fee'];
    }

    /**
     * Sets admin_fee
     *
     * @param string|null $admin_fee Admin fee is represented as a percentage of the total fee collected on a swap.
     *
     * @return self
     */
    public function setAdminFee($admin_fee)
    {

        if (is_null($admin_fee)) {
            array_push($this->openAPINullablesSetToNull, 'admin_fee');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('admin_fee', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['admin_fee'] = $admin_fee;

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
     * @param string|null $owner Admin address.
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
     * Gets virtual_price
     *
     * @return string|null
     */
    public function getVirtualPrice()
    {
        return $this->container['virtual_price'];
    }

    /**
     * Sets virtual_price
     *
     * @param string|null $virtual_price Average dollar value of pool token.
     *
     * @return self
     */
    public function setVirtualPrice($virtual_price)
    {

        if (is_null($virtual_price)) {
            array_push($this->openAPINullablesSetToNull, 'virtual_price');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('virtual_price', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['virtual_price'] = $virtual_price;

        return $this;
    }

    /**
     * Gets locked
     *
     * @return string|null
     */
    public function getLocked()
    {
        return $this->container['locked'];
    }

    /**
     * Sets locked
     *
     * @param string|null $locked 
     *
     * @return self
     */
    public function setLocked($locked)
    {

        if (is_null($locked)) {
            array_push($this->openAPINullablesSetToNull, 'locked');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('locked', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['locked'] = $locked;

        return $this;
    }

    /**
     * Gets added_at
     *
     * @return \DateTime|null
     */
    public function getAddedAt()
    {
        return $this->container['added_at'];
    }

    /**
     * Sets added_at
     *
     * @param \DateTime|null $added_at 
     *
     * @return self
     */
    public function setAddedAt($added_at)
    {

        if (is_null($added_at)) {
            throw new \InvalidArgumentException('non-nullable added_at cannot be null');
        }

        $this->container['added_at'] = $added_at;

        return $this;
    }

    /**
     * Gets added_at_block
     *
     * @return string|null
     */
    public function getAddedAtBlock()
    {
        return $this->container['added_at_block'];
    }

    /**
     * Sets added_at_block
     *
     * @param string|null $added_at_block 
     *
     * @return self
     */
    public function setAddedAtBlock($added_at_block)
    {

        if (is_null($added_at_block)) {
            array_push($this->openAPINullablesSetToNull, 'added_at_block');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('added_at_block', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['added_at_block'] = $added_at_block;

        return $this;
    }

    /**
     * Gets added_at_transaction
     *
     * @return string|null
     */
    public function getAddedAtTransaction()
    {
        return $this->container['added_at_transaction'];
    }

    /**
     * Sets added_at_transaction
     *
     * @param string|null $added_at_transaction 
     *
     * @return self
     */
    public function setAddedAtTransaction($added_at_transaction)
    {

        if (is_null($added_at_transaction)) {
            array_push($this->openAPINullablesSetToNull, 'added_at_transaction');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('added_at_transaction', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['added_at_transaction'] = $added_at_transaction;

        return $this;
    }

    /**
     * Gets removed_at
     *
     * @return string|null
     */
    public function getRemovedAt()
    {
        return $this->container['removed_at'];
    }

    /**
     * Sets removed_at
     *
     * @param string|null $removed_at 
     *
     * @return self
     */
    public function setRemovedAt($removed_at)
    {

        if (is_null($removed_at)) {
            array_push($this->openAPINullablesSetToNull, 'removed_at');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('removed_at', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['removed_at'] = $removed_at;

        return $this;
    }

    /**
     * Gets removed_at_block
     *
     * @return string|null
     */
    public function getRemovedAtBlock()
    {
        return $this->container['removed_at_block'];
    }

    /**
     * Sets removed_at_block
     *
     * @param string|null $removed_at_block 
     *
     * @return self
     */
    public function setRemovedAtBlock($removed_at_block)
    {

        if (is_null($removed_at_block)) {
            array_push($this->openAPINullablesSetToNull, 'removed_at_block');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('removed_at_block', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['removed_at_block'] = $removed_at_block;

        return $this;
    }

    /**
     * Gets removed_at_transaction
     *
     * @return string|null
     */
    public function getRemovedAtTransaction()
    {
        return $this->container['removed_at_transaction'];
    }

    /**
     * Sets removed_at_transaction
     *
     * @param string|null $removed_at_transaction 
     *
     * @return self
     */
    public function setRemovedAtTransaction($removed_at_transaction)
    {

        if (is_null($removed_at_transaction)) {
            array_push($this->openAPINullablesSetToNull, 'removed_at_transaction');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('removed_at_transaction', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['removed_at_transaction'] = $removed_at_transaction;

        return $this;
    }

    /**
     * Gets exchange_count
     *
     * @return string|null
     */
    public function getExchangeCount()
    {
        return $this->container['exchange_count'];
    }

    /**
     * Sets exchange_count
     *
     * @param string|null $exchange_count 
     *
     * @return self
     */
    public function setExchangeCount($exchange_count)
    {

        if (is_null($exchange_count)) {
            array_push($this->openAPINullablesSetToNull, 'exchange_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('exchange_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['exchange_count'] = $exchange_count;

        return $this;
    }

    /**
     * Gets gauge_count
     *
     * @return string|null
     */
    public function getGaugeCount()
    {
        return $this->container['gauge_count'];
    }

    /**
     * Sets gauge_count
     *
     * @param string|null $gauge_count 
     *
     * @return self
     */
    public function setGaugeCount($gauge_count)
    {

        if (is_null($gauge_count)) {
            array_push($this->openAPINullablesSetToNull, 'gauge_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gauge_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['gauge_count'] = $gauge_count;

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
     * Gets evaluated_ask
     *
     * @return float|null
     */
    public function getEvaluatedAsk()
    {
        return $this->container['evaluated_ask'];
    }

    /**
     * Sets evaluated_ask
     *
     * @param float|null $evaluated_ask evaluated_ask
     *
     * @return self
     */
    public function setEvaluatedAsk($evaluated_ask)
    {

        if (is_null($evaluated_ask)) {
            throw new \InvalidArgumentException('non-nullable evaluated_ask cannot be null');
        }

        $this->container['evaluated_ask'] = $evaluated_ask;

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


