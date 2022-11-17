<?php
/**
 * UniswapV2SwapDTO
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
 * UniswapV2SwapDTO Class Doc Comment
 *
 * @category Class
 * @description Swap are created for each token swap within a pair.
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UniswapV2SwapDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'UniswapV2.SwapDTO';

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
        'transaction' => 'string',
        'timestamp' => '\DateTime',
        'pair' => 'string',
        'sender' => 'string',
        'from' => 'string',
        'amount_0_in' => 'string',
        'amount_1_in' => 'string',
        'amount_0_out' => 'string',
        'amount_1_out' => 'string',
        'to' => 'string',
        'log_index' => '\OpenAPI\Client\Model\NumericsBigInteger',
        'amount_usd' => 'string',
        'evaluated_price' => 'float',
        'evaluated_amount' => 'float',
        'evaluated_aggressor' => '\OpenAPI\Client\Model\TransactionsETradeAggressiveSide',
        'pool_id' => 'string',
        'transaction_id' => 'string'
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
        'transaction' => null,
        'timestamp' => 'date-time',
        'pair' => null,
        'sender' => null,
        'from' => null,
        'amount_0_in' => null,
        'amount_1_in' => null,
        'amount_0_out' => null,
        'amount_1_out' => null,
        'to' => null,
        'log_index' => null,
        'amount_usd' => null,
        'evaluated_price' => 'double',
        'evaluated_amount' => 'double',
        'evaluated_aggressor' => null,
        'pool_id' => null,
        'transaction_id' => null
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
		'transaction' => true,
		'timestamp' => false,
		'pair' => true,
		'sender' => true,
		'from' => true,
		'amount_0_in' => true,
		'amount_1_in' => true,
		'amount_0_out' => true,
		'amount_1_out' => true,
		'to' => true,
		'log_index' => false,
		'amount_usd' => true,
		'evaluated_price' => false,
		'evaluated_amount' => false,
		'evaluated_aggressor' => false,
		'pool_id' => true,
		'transaction_id' => true
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
        'transaction' => 'transaction',
        'timestamp' => 'timestamp',
        'pair' => 'pair',
        'sender' => 'sender',
        'from' => 'from',
        'amount_0_in' => 'amount_0_in',
        'amount_1_in' => 'amount_1_in',
        'amount_0_out' => 'amount_0_out',
        'amount_1_out' => 'amount_1_out',
        'to' => 'to',
        'log_index' => 'log_index',
        'amount_usd' => 'amount_usd',
        'evaluated_price' => 'evaluated_price',
        'evaluated_amount' => 'evaluated_amount',
        'evaluated_aggressor' => 'evaluated_aggressor',
        'pool_id' => 'pool_id',
        'transaction_id' => 'transaction_id'
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
        'transaction' => 'setTransaction',
        'timestamp' => 'setTimestamp',
        'pair' => 'setPair',
        'sender' => 'setSender',
        'from' => 'setFrom',
        'amount_0_in' => 'setAmount0In',
        'amount_1_in' => 'setAmount1In',
        'amount_0_out' => 'setAmount0Out',
        'amount_1_out' => 'setAmount1Out',
        'to' => 'setTo',
        'log_index' => 'setLogIndex',
        'amount_usd' => 'setAmountUsd',
        'evaluated_price' => 'setEvaluatedPrice',
        'evaluated_amount' => 'setEvaluatedAmount',
        'evaluated_aggressor' => 'setEvaluatedAggressor',
        'pool_id' => 'setPoolId',
        'transaction_id' => 'setTransactionId'
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
        'transaction' => 'getTransaction',
        'timestamp' => 'getTimestamp',
        'pair' => 'getPair',
        'sender' => 'getSender',
        'from' => 'getFrom',
        'amount_0_in' => 'getAmount0In',
        'amount_1_in' => 'getAmount1In',
        'amount_0_out' => 'getAmount0Out',
        'amount_1_out' => 'getAmount1Out',
        'to' => 'getTo',
        'log_index' => 'getLogIndex',
        'amount_usd' => 'getAmountUsd',
        'evaluated_price' => 'getEvaluatedPrice',
        'evaluated_amount' => 'getEvaluatedAmount',
        'evaluated_aggressor' => 'getEvaluatedAggressor',
        'pool_id' => 'getPoolId',
        'transaction_id' => 'getTransactionId'
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
        $this->setIfExists('transaction', $data ?? [], null);
        $this->setIfExists('timestamp', $data ?? [], null);
        $this->setIfExists('pair', $data ?? [], null);
        $this->setIfExists('sender', $data ?? [], null);
        $this->setIfExists('from', $data ?? [], null);
        $this->setIfExists('amount_0_in', $data ?? [], null);
        $this->setIfExists('amount_1_in', $data ?? [], null);
        $this->setIfExists('amount_0_out', $data ?? [], null);
        $this->setIfExists('amount_1_out', $data ?? [], null);
        $this->setIfExists('to', $data ?? [], null);
        $this->setIfExists('log_index', $data ?? [], null);
        $this->setIfExists('amount_usd', $data ?? [], null);
        $this->setIfExists('evaluated_price', $data ?? [], null);
        $this->setIfExists('evaluated_amount', $data ?? [], null);
        $this->setIfExists('evaluated_aggressor', $data ?? [], null);
        $this->setIfExists('pool_id', $data ?? [], null);
        $this->setIfExists('transaction_id', $data ?? [], null);
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
     * @param string|null $id Transaction hash plus index in Transaction swap array.
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
     * @param string|null $transaction Reference to transaction swap was included in.
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
     * Gets timestamp
     *
     * @return \DateTime|null
     */
    public function getTimestamp()
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     *
     * @param \DateTime|null $timestamp Timestamp of swap, used for sorted lookups.
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
     * @param string|null $pair Reference to pair.
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
     * Gets sender
     *
     * @return string|null
     */
    public function getSender()
    {
        return $this->container['sender'];
    }

    /**
     * Sets sender
     *
     * @param string|null $sender Address that initiated the swap.
     *
     * @return self
     */
    public function setSender($sender)
    {

        if (is_null($sender)) {
            array_push($this->openAPINullablesSetToNull, 'sender');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('sender', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['sender'] = $sender;

        return $this;
    }

    /**
     * Gets from
     *
     * @return string|null
     */
    public function getFrom()
    {
        return $this->container['from'];
    }

    /**
     * Sets from
     *
     * @param string|null $from The EOA (Externally Owned Account) that initiated the transaction.
     *
     * @return self
     */
    public function setFrom($from)
    {

        if (is_null($from)) {
            array_push($this->openAPINullablesSetToNull, 'from');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('from', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['from'] = $from;

        return $this;
    }

    /**
     * Gets amount_0_in
     *
     * @return string|null
     */
    public function getAmount0In()
    {
        return $this->container['amount_0_in'];
    }

    /**
     * Sets amount_0_in
     *
     * @param string|null $amount_0_in Amount of token0 sold.
     *
     * @return self
     */
    public function setAmount0In($amount_0_in)
    {

        if (is_null($amount_0_in)) {
            array_push($this->openAPINullablesSetToNull, 'amount_0_in');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('amount_0_in', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['amount_0_in'] = $amount_0_in;

        return $this;
    }

    /**
     * Gets amount_1_in
     *
     * @return string|null
     */
    public function getAmount1In()
    {
        return $this->container['amount_1_in'];
    }

    /**
     * Sets amount_1_in
     *
     * @param string|null $amount_1_in Amount of token1 sold.
     *
     * @return self
     */
    public function setAmount1In($amount_1_in)
    {

        if (is_null($amount_1_in)) {
            array_push($this->openAPINullablesSetToNull, 'amount_1_in');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('amount_1_in', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['amount_1_in'] = $amount_1_in;

        return $this;
    }

    /**
     * Gets amount_0_out
     *
     * @return string|null
     */
    public function getAmount0Out()
    {
        return $this->container['amount_0_out'];
    }

    /**
     * Sets amount_0_out
     *
     * @param string|null $amount_0_out Amount of token0 received.
     *
     * @return self
     */
    public function setAmount0Out($amount_0_out)
    {

        if (is_null($amount_0_out)) {
            array_push($this->openAPINullablesSetToNull, 'amount_0_out');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('amount_0_out', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['amount_0_out'] = $amount_0_out;

        return $this;
    }

    /**
     * Gets amount_1_out
     *
     * @return string|null
     */
    public function getAmount1Out()
    {
        return $this->container['amount_1_out'];
    }

    /**
     * Sets amount_1_out
     *
     * @param string|null $amount_1_out Amount of token1 received.
     *
     * @return self
     */
    public function setAmount1Out($amount_1_out)
    {

        if (is_null($amount_1_out)) {
            array_push($this->openAPINullablesSetToNull, 'amount_1_out');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('amount_1_out', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['amount_1_out'] = $amount_1_out;

        return $this;
    }

    /**
     * Gets to
     *
     * @return string|null
     */
    public function getTo()
    {
        return $this->container['to'];
    }

    /**
     * Sets to
     *
     * @param string|null $to Recipient of output tokens.
     *
     * @return self
     */
    public function setTo($to)
    {

        if (is_null($to)) {
            array_push($this->openAPINullablesSetToNull, 'to');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('to', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['to'] = $to;

        return $this;
    }

    /**
     * Gets log_index
     *
     * @return \OpenAPI\Client\Model\NumericsBigInteger|null
     */
    public function getLogIndex()
    {
        return $this->container['log_index'];
    }

    /**
     * Sets log_index
     *
     * @param \OpenAPI\Client\Model\NumericsBigInteger|null $log_index log_index
     *
     * @return self
     */
    public function setLogIndex($log_index)
    {

        if (is_null($log_index)) {
            throw new \InvalidArgumentException('non-nullable log_index cannot be null');
        }

        $this->container['log_index'] = $log_index;

        return $this;
    }

    /**
     * Gets amount_usd
     *
     * @return string|null
     */
    public function getAmountUsd()
    {
        return $this->container['amount_usd'];
    }

    /**
     * Sets amount_usd
     *
     * @param string|null $amount_usd Derived amount of tokens sold in USD.
     *
     * @return self
     */
    public function setAmountUsd($amount_usd)
    {

        if (is_null($amount_usd)) {
            array_push($this->openAPINullablesSetToNull, 'amount_usd');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('amount_usd', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['amount_usd'] = $amount_usd;

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


