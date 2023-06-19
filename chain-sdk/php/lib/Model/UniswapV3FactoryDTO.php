<?php
/**
 * UniswapV3FactoryDTO
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
 * UniswapV3FactoryDTO Class Doc Comment
 *
 * @category Class
 * @description The Uniswap Factory entity is responsible for storing aggregate information across all Uniswap pairs. It can be used to view stats about total liquidity, volume, amount of pairs and more.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UniswapV3FactoryDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UniswapV3.FactoryDTO';

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
        'pool_count' => 'string',
        'tx_count' => 'string',
        'total_volume_usd' => 'string',
        'total_volume_eth' => 'string',
        'total_fees_usd' => 'string',
        'total_fees_eth' => 'string',
        'untracked_volume_usd' => 'string',
        'total_value_locked_usd' => 'string',
        'total_value_locked_eth' => 'string',
        'total_value_locked_usd_untracked' => 'string',
        'total_value_locked_eth_untracked' => 'string',
        'owner' => 'string',
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
        'pool_count' => null,
        'tx_count' => null,
        'total_volume_usd' => null,
        'total_volume_eth' => null,
        'total_fees_usd' => null,
        'total_fees_eth' => null,
        'untracked_volume_usd' => null,
        'total_value_locked_usd' => null,
        'total_value_locked_eth' => null,
        'total_value_locked_usd_untracked' => null,
        'total_value_locked_eth_untracked' => null,
        'owner' => null,
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
		'pool_count' => true,
		'tx_count' => true,
		'total_volume_usd' => true,
		'total_volume_eth' => true,
		'total_fees_usd' => true,
		'total_fees_eth' => true,
		'untracked_volume_usd' => true,
		'total_value_locked_usd' => true,
		'total_value_locked_eth' => true,
		'total_value_locked_usd_untracked' => true,
		'total_value_locked_eth_untracked' => true,
		'owner' => true,
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
        'pool_count' => 'pool_count',
        'tx_count' => 'tx_count',
        'total_volume_usd' => 'total_volume_usd',
        'total_volume_eth' => 'total_volume_eth',
        'total_fees_usd' => 'total_fees_usd',
        'total_fees_eth' => 'total_fees_eth',
        'untracked_volume_usd' => 'untracked_volume_usd',
        'total_value_locked_usd' => 'total_value_locked_usd',
        'total_value_locked_eth' => 'total_value_locked_eth',
        'total_value_locked_usd_untracked' => 'total_value_locked_usd_untracked',
        'total_value_locked_eth_untracked' => 'total_value_locked_eth_untracked',
        'owner' => 'owner',
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
        'pool_count' => 'setPoolCount',
        'tx_count' => 'setTxCount',
        'total_volume_usd' => 'setTotalVolumeUsd',
        'total_volume_eth' => 'setTotalVolumeEth',
        'total_fees_usd' => 'setTotalFeesUsd',
        'total_fees_eth' => 'setTotalFeesEth',
        'untracked_volume_usd' => 'setUntrackedVolumeUsd',
        'total_value_locked_usd' => 'setTotalValueLockedUsd',
        'total_value_locked_eth' => 'setTotalValueLockedEth',
        'total_value_locked_usd_untracked' => 'setTotalValueLockedUsdUntracked',
        'total_value_locked_eth_untracked' => 'setTotalValueLockedEthUntracked',
        'owner' => 'setOwner',
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
        'pool_count' => 'getPoolCount',
        'tx_count' => 'getTxCount',
        'total_volume_usd' => 'getTotalVolumeUsd',
        'total_volume_eth' => 'getTotalVolumeEth',
        'total_fees_usd' => 'getTotalFeesUsd',
        'total_fees_eth' => 'getTotalFeesEth',
        'untracked_volume_usd' => 'getUntrackedVolumeUsd',
        'total_value_locked_usd' => 'getTotalValueLockedUsd',
        'total_value_locked_eth' => 'getTotalValueLockedEth',
        'total_value_locked_usd_untracked' => 'getTotalValueLockedUsdUntracked',
        'total_value_locked_eth_untracked' => 'getTotalValueLockedEthUntracked',
        'owner' => 'getOwner',
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
        $this->setIfExists('pool_count', $data ?? [], null);
        $this->setIfExists('tx_count', $data ?? [], null);
        $this->setIfExists('total_volume_usd', $data ?? [], null);
        $this->setIfExists('total_volume_eth', $data ?? [], null);
        $this->setIfExists('total_fees_usd', $data ?? [], null);
        $this->setIfExists('total_fees_eth', $data ?? [], null);
        $this->setIfExists('untracked_volume_usd', $data ?? [], null);
        $this->setIfExists('total_value_locked_usd', $data ?? [], null);
        $this->setIfExists('total_value_locked_eth', $data ?? [], null);
        $this->setIfExists('total_value_locked_usd_untracked', $data ?? [], null);
        $this->setIfExists('total_value_locked_eth_untracked', $data ?? [], null);
        $this->setIfExists('owner', $data ?? [], null);
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
     * @param string|null $id Factory address.
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
     * Gets pool_count
     *
     * @return string|null
     */
    public function getPoolCount()
    {
        return $this->container['pool_count'];
    }

    /**
     * Sets pool_count
     *
     * @param string|null $pool_count Amount of pools created.
     *
     * @return self
     */
    public function setPoolCount($pool_count)
    {
        if (is_null($pool_count)) {
            array_push($this->openAPINullablesSetToNull, 'pool_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('pool_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['pool_count'] = $pool_count;

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
     * @param string|null $tx_count Amount of transactions all time.
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
     * Gets total_volume_usd
     *
     * @return string|null
     */
    public function getTotalVolumeUsd()
    {
        return $this->container['total_volume_usd'];
    }

    /**
     * Sets total_volume_usd
     *
     * @param string|null $total_volume_usd Total volume all time in derived USD.
     *
     * @return self
     */
    public function setTotalVolumeUsd($total_volume_usd)
    {
        if (is_null($total_volume_usd)) {
            array_push($this->openAPINullablesSetToNull, 'total_volume_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_volume_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_volume_usd'] = $total_volume_usd;

        return $this;
    }

    /**
     * Gets total_volume_eth
     *
     * @return string|null
     */
    public function getTotalVolumeEth()
    {
        return $this->container['total_volume_eth'];
    }

    /**
     * Sets total_volume_eth
     *
     * @param string|null $total_volume_eth Total volume all time in derived ETH.
     *
     * @return self
     */
    public function setTotalVolumeEth($total_volume_eth)
    {
        if (is_null($total_volume_eth)) {
            array_push($this->openAPINullablesSetToNull, 'total_volume_eth');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_volume_eth', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_volume_eth'] = $total_volume_eth;

        return $this;
    }

    /**
     * Gets total_fees_usd
     *
     * @return string|null
     */
    public function getTotalFeesUsd()
    {
        return $this->container['total_fees_usd'];
    }

    /**
     * Sets total_fees_usd
     *
     * @param string|null $total_fees_usd Total swap fees all time in USD.
     *
     * @return self
     */
    public function setTotalFeesUsd($total_fees_usd)
    {
        if (is_null($total_fees_usd)) {
            array_push($this->openAPINullablesSetToNull, 'total_fees_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_fees_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_fees_usd'] = $total_fees_usd;

        return $this;
    }

    /**
     * Gets total_fees_eth
     *
     * @return string|null
     */
    public function getTotalFeesEth()
    {
        return $this->container['total_fees_eth'];
    }

    /**
     * Sets total_fees_eth
     *
     * @param string|null $total_fees_eth All volume even through less reliable USD values.
     *
     * @return self
     */
    public function setTotalFeesEth($total_fees_eth)
    {
        if (is_null($total_fees_eth)) {
            array_push($this->openAPINullablesSetToNull, 'total_fees_eth');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_fees_eth', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_fees_eth'] = $total_fees_eth;

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
     * @param string|null $untracked_volume_usd All volume even through less reliable USD values.
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
     * Gets total_value_locked_usd
     *
     * @return string|null
     */
    public function getTotalValueLockedUsd()
    {
        return $this->container['total_value_locked_usd'];
    }

    /**
     * Sets total_value_locked_usd
     *
     * @param string|null $total_value_locked_usd Total value locked derived in USD.
     *
     * @return self
     */
    public function setTotalValueLockedUsd($total_value_locked_usd)
    {
        if (is_null($total_value_locked_usd)) {
            array_push($this->openAPINullablesSetToNull, 'total_value_locked_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_value_locked_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_value_locked_usd'] = $total_value_locked_usd;

        return $this;
    }

    /**
     * Gets total_value_locked_eth
     *
     * @return string|null
     */
    public function getTotalValueLockedEth()
    {
        return $this->container['total_value_locked_eth'];
    }

    /**
     * Sets total_value_locked_eth
     *
     * @param string|null $total_value_locked_eth Total value locked derived in ETH.
     *
     * @return self
     */
    public function setTotalValueLockedEth($total_value_locked_eth)
    {
        if (is_null($total_value_locked_eth)) {
            array_push($this->openAPINullablesSetToNull, 'total_value_locked_eth');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_value_locked_eth', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_value_locked_eth'] = $total_value_locked_eth;

        return $this;
    }

    /**
     * Gets total_value_locked_usd_untracked
     *
     * @return string|null
     */
    public function getTotalValueLockedUsdUntracked()
    {
        return $this->container['total_value_locked_usd_untracked'];
    }

    /**
     * Sets total_value_locked_usd_untracked
     *
     * @param string|null $total_value_locked_usd_untracked Total value locked derived in USD untracked.
     *
     * @return self
     */
    public function setTotalValueLockedUsdUntracked($total_value_locked_usd_untracked)
    {
        if (is_null($total_value_locked_usd_untracked)) {
            array_push($this->openAPINullablesSetToNull, 'total_value_locked_usd_untracked');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_value_locked_usd_untracked', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_value_locked_usd_untracked'] = $total_value_locked_usd_untracked;

        return $this;
    }

    /**
     * Gets total_value_locked_eth_untracked
     *
     * @return string|null
     */
    public function getTotalValueLockedEthUntracked()
    {
        return $this->container['total_value_locked_eth_untracked'];
    }

    /**
     * Sets total_value_locked_eth_untracked
     *
     * @param string|null $total_value_locked_eth_untracked Total value locked derived in ETH untracked.
     *
     * @return self
     */
    public function setTotalValueLockedEthUntracked($total_value_locked_eth_untracked)
    {
        if (is_null($total_value_locked_eth_untracked)) {
            array_push($this->openAPINullablesSetToNull, 'total_value_locked_eth_untracked');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_value_locked_eth_untracked', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['total_value_locked_eth_untracked'] = $total_value_locked_eth_untracked;

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
     * @param string|null $owner Current owner of the factory.
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


