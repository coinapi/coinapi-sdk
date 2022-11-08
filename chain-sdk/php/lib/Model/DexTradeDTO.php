<?php
/**
 * DexTradeDTO
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
 * DexTradeDTO Class Doc Comment
 *
 * @category Class
 * @description Trade for a single user, as part of a ring trade. It&#39;s part of the solution submitted by a solver for a given batch.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class DexTradeDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Dex.TradeDTO';

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
        'order' => 'string',
        'owner' => 'string',
        'sell_volume' => 'string',
        'buy_volume' => 'string',
        'trade_batch_id' => 'string',
        'trade_epoch' => 'string',
        'buy_token' => 'string',
        'sell_token' => 'string',
        'create_epoch' => 'string',
        'revert_epoch' => 'string',
        'tx_hash' => 'string',
        'tx_log_index' => 'string',
        'vid' => 'int',
        'pool_id' => 'string',
        'transaction_id' => 'string',
        'evaluated_price' => 'float',
        'evaluated_amount' => 'float',
        'evaluated_aggressor' => '\OpenAPI\Client\Model\TransactionsETradeAggressiveSide'
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
        'order' => null,
        'owner' => null,
        'sell_volume' => null,
        'buy_volume' => null,
        'trade_batch_id' => null,
        'trade_epoch' => null,
        'buy_token' => null,
        'sell_token' => null,
        'create_epoch' => null,
        'revert_epoch' => null,
        'tx_hash' => null,
        'tx_log_index' => null,
        'vid' => 'int64',
        'pool_id' => null,
        'transaction_id' => null,
        'evaluated_price' => 'double',
        'evaluated_amount' => 'double',
        'evaluated_aggressor' => null
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
		'order' => true,
		'owner' => true,
		'sell_volume' => true,
		'buy_volume' => true,
		'trade_batch_id' => true,
		'trade_epoch' => true,
		'buy_token' => true,
		'sell_token' => true,
		'create_epoch' => true,
		'revert_epoch' => true,
		'tx_hash' => true,
		'tx_log_index' => true,
		'vid' => false,
		'pool_id' => true,
		'transaction_id' => true,
		'evaluated_price' => false,
		'evaluated_amount' => false,
		'evaluated_aggressor' => false
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
        'order' => 'order',
        'owner' => 'owner',
        'sell_volume' => 'sell_volume',
        'buy_volume' => 'buy_volume',
        'trade_batch_id' => 'trade_batch_id',
        'trade_epoch' => 'trade_epoch',
        'buy_token' => 'buy_token',
        'sell_token' => 'sell_token',
        'create_epoch' => 'create_epoch',
        'revert_epoch' => 'revert_epoch',
        'tx_hash' => 'tx_hash',
        'tx_log_index' => 'tx_log_index',
        'vid' => 'vid',
        'pool_id' => 'pool_id',
        'transaction_id' => 'transaction_id',
        'evaluated_price' => 'evaluated_price',
        'evaluated_amount' => 'evaluated_amount',
        'evaluated_aggressor' => 'evaluated_aggressor'
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
        'order' => 'setOrder',
        'owner' => 'setOwner',
        'sell_volume' => 'setSellVolume',
        'buy_volume' => 'setBuyVolume',
        'trade_batch_id' => 'setTradeBatchId',
        'trade_epoch' => 'setTradeEpoch',
        'buy_token' => 'setBuyToken',
        'sell_token' => 'setSellToken',
        'create_epoch' => 'setCreateEpoch',
        'revert_epoch' => 'setRevertEpoch',
        'tx_hash' => 'setTxHash',
        'tx_log_index' => 'setTxLogIndex',
        'vid' => 'setVid',
        'pool_id' => 'setPoolId',
        'transaction_id' => 'setTransactionId',
        'evaluated_price' => 'setEvaluatedPrice',
        'evaluated_amount' => 'setEvaluatedAmount',
        'evaluated_aggressor' => 'setEvaluatedAggressor'
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
        'order' => 'getOrder',
        'owner' => 'getOwner',
        'sell_volume' => 'getSellVolume',
        'buy_volume' => 'getBuyVolume',
        'trade_batch_id' => 'getTradeBatchId',
        'trade_epoch' => 'getTradeEpoch',
        'buy_token' => 'getBuyToken',
        'sell_token' => 'getSellToken',
        'create_epoch' => 'getCreateEpoch',
        'revert_epoch' => 'getRevertEpoch',
        'tx_hash' => 'getTxHash',
        'tx_log_index' => 'getTxLogIndex',
        'vid' => 'getVid',
        'pool_id' => 'getPoolId',
        'transaction_id' => 'getTransactionId',
        'evaluated_price' => 'getEvaluatedPrice',
        'evaluated_amount' => 'getEvaluatedAmount',
        'evaluated_aggressor' => 'getEvaluatedAggressor'
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
        $this->setIfExists('order', $data ?? [], null);
        $this->setIfExists('owner', $data ?? [], null);
        $this->setIfExists('sell_volume', $data ?? [], null);
        $this->setIfExists('buy_volume', $data ?? [], null);
        $this->setIfExists('trade_batch_id', $data ?? [], null);
        $this->setIfExists('trade_epoch', $data ?? [], null);
        $this->setIfExists('buy_token', $data ?? [], null);
        $this->setIfExists('sell_token', $data ?? [], null);
        $this->setIfExists('create_epoch', $data ?? [], null);
        $this->setIfExists('revert_epoch', $data ?? [], null);
        $this->setIfExists('tx_hash', $data ?? [], null);
        $this->setIfExists('tx_log_index', $data ?? [], null);
        $this->setIfExists('vid', $data ?? [], null);
        $this->setIfExists('pool_id', $data ?? [], null);
        $this->setIfExists('transaction_id', $data ?? [], null);
        $this->setIfExists('evaluated_price', $data ?? [], null);
        $this->setIfExists('evaluated_amount', $data ?? [], null);
        $this->setIfExists('evaluated_aggressor', $data ?? [], null);
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
     * Gets order
     *
     * @return string|null
     */
    public function getOrder()
    {
        return $this->container['order'];
    }

    /**
     * Sets order
     *
     * @param string|null $order 
     *
     * @return self
     */
    public function setOrder($order)
    {

        if (is_null($order)) {
            array_push($this->openAPINullablesSetToNull, 'order');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('order', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['order'] = $order;

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
     * @param string|null $owner 
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
     * Gets sell_volume
     *
     * @return string|null
     */
    public function getSellVolume()
    {
        return $this->container['sell_volume'];
    }

    /**
     * Sets sell_volume
     *
     * @param string|null $sell_volume 
     *
     * @return self
     */
    public function setSellVolume($sell_volume)
    {

        if (is_null($sell_volume)) {
            array_push($this->openAPINullablesSetToNull, 'sell_volume');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('sell_volume', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['sell_volume'] = $sell_volume;

        return $this;
    }

    /**
     * Gets buy_volume
     *
     * @return string|null
     */
    public function getBuyVolume()
    {
        return $this->container['buy_volume'];
    }

    /**
     * Sets buy_volume
     *
     * @param string|null $buy_volume 
     *
     * @return self
     */
    public function setBuyVolume($buy_volume)
    {

        if (is_null($buy_volume)) {
            array_push($this->openAPINullablesSetToNull, 'buy_volume');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('buy_volume', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['buy_volume'] = $buy_volume;

        return $this;
    }

    /**
     * Gets trade_batch_id
     *
     * @return string|null
     */
    public function getTradeBatchId()
    {
        return $this->container['trade_batch_id'];
    }

    /**
     * Sets trade_batch_id
     *
     * @param string|null $trade_batch_id 
     *
     * @return self
     */
    public function setTradeBatchId($trade_batch_id)
    {

        if (is_null($trade_batch_id)) {
            array_push($this->openAPINullablesSetToNull, 'trade_batch_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('trade_batch_id', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['trade_batch_id'] = $trade_batch_id;

        return $this;
    }

    /**
     * Gets trade_epoch
     *
     * @return string|null
     */
    public function getTradeEpoch()
    {
        return $this->container['trade_epoch'];
    }

    /**
     * Sets trade_epoch
     *
     * @param string|null $trade_epoch The date of the end of the batch.
     *
     * @return self
     */
    public function setTradeEpoch($trade_epoch)
    {

        if (is_null($trade_epoch)) {
            array_push($this->openAPINullablesSetToNull, 'trade_epoch');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('trade_epoch', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['trade_epoch'] = $trade_epoch;

        return $this;
    }

    /**
     * Gets buy_token
     *
     * @return string|null
     */
    public function getBuyToken()
    {
        return $this->container['buy_token'];
    }

    /**
     * Sets buy_token
     *
     * @param string|null $buy_token 
     *
     * @return self
     */
    public function setBuyToken($buy_token)
    {

        if (is_null($buy_token)) {
            array_push($this->openAPINullablesSetToNull, 'buy_token');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('buy_token', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['buy_token'] = $buy_token;

        return $this;
    }

    /**
     * Gets sell_token
     *
     * @return string|null
     */
    public function getSellToken()
    {
        return $this->container['sell_token'];
    }

    /**
     * Sets sell_token
     *
     * @param string|null $sell_token 
     *
     * @return self
     */
    public function setSellToken($sell_token)
    {

        if (is_null($sell_token)) {
            array_push($this->openAPINullablesSetToNull, 'sell_token');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('sell_token', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['sell_token'] = $sell_token;

        return $this;
    }

    /**
     * Gets create_epoch
     *
     * @return string|null
     */
    public function getCreateEpoch()
    {
        return $this->container['create_epoch'];
    }

    /**
     * Sets create_epoch
     *
     * @param string|null $create_epoch The date where the transaction was mined.
     *
     * @return self
     */
    public function setCreateEpoch($create_epoch)
    {

        if (is_null($create_epoch)) {
            array_push($this->openAPINullablesSetToNull, 'create_epoch');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('create_epoch', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['create_epoch'] = $create_epoch;

        return $this;
    }

    /**
     * Gets revert_epoch
     *
     * @return string|null
     */
    public function getRevertEpoch()
    {
        return $this->container['revert_epoch'];
    }

    /**
     * Sets revert_epoch
     *
     * @param string|null $revert_epoch 
     *
     * @return self
     */
    public function setRevertEpoch($revert_epoch)
    {

        if (is_null($revert_epoch)) {
            array_push($this->openAPINullablesSetToNull, 'revert_epoch');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('revert_epoch', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['revert_epoch'] = $revert_epoch;

        return $this;
    }

    /**
     * Gets tx_hash
     *
     * @return string|null
     */
    public function getTxHash()
    {
        return $this->container['tx_hash'];
    }

    /**
     * Sets tx_hash
     *
     * @param string|null $tx_hash 
     *
     * @return self
     */
    public function setTxHash($tx_hash)
    {

        if (is_null($tx_hash)) {
            array_push($this->openAPINullablesSetToNull, 'tx_hash');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tx_hash', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['tx_hash'] = $tx_hash;

        return $this;
    }

    /**
     * Gets tx_log_index
     *
     * @return string|null
     */
    public function getTxLogIndex()
    {
        return $this->container['tx_log_index'];
    }

    /**
     * Sets tx_log_index
     *
     * @param string|null $tx_log_index 
     *
     * @return self
     */
    public function setTxLogIndex($tx_log_index)
    {

        if (is_null($tx_log_index)) {
            array_push($this->openAPINullablesSetToNull, 'tx_log_index');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('tx_log_index', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['tx_log_index'] = $tx_log_index;

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
     * Gets pool_id
     *
     * @return string|null
     */
    public function getPoolId()
    {
        return $this->container['pool_id'];
    }

    /**
     * Sets pool_id
     *
     * @param string|null $pool_id pool_id
     *
     * @return self
     */
    public function setPoolId($pool_id)
    {

        if (is_null($pool_id)) {
            array_push($this->openAPINullablesSetToNull, 'pool_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('pool_id', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['pool_id'] = $pool_id;

        return $this;
    }

    /**
     * Gets transaction_id
     *
     * @return string|null
     */
    public function getTransactionId()
    {
        return $this->container['transaction_id'];
    }

    /**
     * Sets transaction_id
     *
     * @param string|null $transaction_id transaction_id
     *
     * @return self
     */
    public function setTransactionId($transaction_id)
    {

        if (is_null($transaction_id)) {
            array_push($this->openAPINullablesSetToNull, 'transaction_id');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('transaction_id', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['transaction_id'] = $transaction_id;

        return $this;
    }

    /**
     * Gets evaluated_price
     *
     * @return float|null
     */
    public function getEvaluatedPrice()
    {
        return $this->container['evaluated_price'];
    }

    /**
     * Sets evaluated_price
     *
     * @param float|null $evaluated_price evaluated_price
     *
     * @return self
     */
    public function setEvaluatedPrice($evaluated_price)
    {

        if (is_null($evaluated_price)) {
            throw new \InvalidArgumentException('non-nullable evaluated_price cannot be null');
        }

        $this->container['evaluated_price'] = $evaluated_price;

        return $this;
    }

    /**
     * Gets evaluated_amount
     *
     * @return float|null
     */
    public function getEvaluatedAmount()
    {
        return $this->container['evaluated_amount'];
    }

    /**
     * Sets evaluated_amount
     *
     * @param float|null $evaluated_amount evaluated_amount
     *
     * @return self
     */
    public function setEvaluatedAmount($evaluated_amount)
    {

        if (is_null($evaluated_amount)) {
            throw new \InvalidArgumentException('non-nullable evaluated_amount cannot be null');
        }

        $this->container['evaluated_amount'] = $evaluated_amount;

        return $this;
    }

    /**
     * Gets evaluated_aggressor
     *
     * @return \OpenAPI\Client\Model\TransactionsETradeAggressiveSide|null
     */
    public function getEvaluatedAggressor()
    {
        return $this->container['evaluated_aggressor'];
    }

    /**
     * Sets evaluated_aggressor
     *
     * @param \OpenAPI\Client\Model\TransactionsETradeAggressiveSide|null $evaluated_aggressor evaluated_aggressor
     *
     * @return self
     */
    public function setEvaluatedAggressor($evaluated_aggressor)
    {

        if (is_null($evaluated_aggressor)) {
            throw new \InvalidArgumentException('non-nullable evaluated_aggressor cannot be null');
        }

        $this->container['evaluated_aggressor'] = $evaluated_aggressor;

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


