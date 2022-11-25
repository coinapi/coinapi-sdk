<?php
/**
 * CurveExchangeDTO
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
 * CurveExchangeDTO Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CurveExchangeDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Curve.ExchangeDTO';

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
        'pool' => 'string',
        'buyer' => 'string',
        'receiver' => 'string',
        'token_sold' => 'string',
        'token_bought' => 'string',
        'amount_sold' => 'string',
        'amount_bought' => 'string',
        'block' => 'string',
        'timestamp' => 'string',
        'transaction' => 'string',
        'vid' => 'int',
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
        'id' => null,
        'pool' => null,
        'buyer' => null,
        'receiver' => null,
        'token_sold' => null,
        'token_bought' => null,
        'amount_sold' => null,
        'amount_bought' => null,
        'block' => null,
        'timestamp' => null,
        'transaction' => null,
        'vid' => 'int64',
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
		'id' => true,
		'pool' => true,
		'buyer' => true,
		'receiver' => true,
		'token_sold' => true,
		'token_bought' => true,
		'amount_sold' => true,
		'amount_bought' => true,
		'block' => true,
		'timestamp' => true,
		'transaction' => true,
		'vid' => false,
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
        'id' => 'id',
        'pool' => 'pool',
        'buyer' => 'buyer',
        'receiver' => 'receiver',
        'token_sold' => 'token_sold',
        'token_bought' => 'token_bought',
        'amount_sold' => 'amount_sold',
        'amount_bought' => 'amount_bought',
        'block' => 'block',
        'timestamp' => 'timestamp',
        'transaction' => 'transaction',
        'vid' => 'vid',
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
        'id' => 'setId',
        'pool' => 'setPool',
        'buyer' => 'setBuyer',
        'receiver' => 'setReceiver',
        'token_sold' => 'setTokenSold',
        'token_bought' => 'setTokenBought',
        'amount_sold' => 'setAmountSold',
        'amount_bought' => 'setAmountBought',
        'block' => 'setBlock',
        'timestamp' => 'setTimestamp',
        'transaction' => 'setTransaction',
        'vid' => 'setVid',
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
        'id' => 'getId',
        'pool' => 'getPool',
        'buyer' => 'getBuyer',
        'receiver' => 'getReceiver',
        'token_sold' => 'getTokenSold',
        'token_bought' => 'getTokenBought',
        'amount_sold' => 'getAmountSold',
        'amount_bought' => 'getAmountBought',
        'block' => 'getBlock',
        'timestamp' => 'getTimestamp',
        'transaction' => 'getTransaction',
        'vid' => 'getVid',
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
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('pool', $data ?? [], null);
        $this->setIfExists('buyer', $data ?? [], null);
        $this->setIfExists('receiver', $data ?? [], null);
        $this->setIfExists('token_sold', $data ?? [], null);
        $this->setIfExists('token_bought', $data ?? [], null);
        $this->setIfExists('amount_sold', $data ?? [], null);
        $this->setIfExists('amount_bought', $data ?? [], null);
        $this->setIfExists('block', $data ?? [], null);
        $this->setIfExists('timestamp', $data ?? [], null);
        $this->setIfExists('transaction', $data ?? [], null);
        $this->setIfExists('vid', $data ?? [], null);
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
     * @param string|null $pool 
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
     * Gets buyer
     *
     * @return string|null
     */
    public function getBuyer()
    {
        return $this->container['buyer'];
    }

    /**
     * Sets buyer
     *
     * @param string|null $buyer 
     *
     * @return self
     */
    public function setBuyer($buyer)
    {

        if (is_null($buyer)) {
            array_push($this->openAPINullablesSetToNull, 'buyer');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('buyer', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['buyer'] = $buyer;

        return $this;
    }

    /**
     * Gets receiver
     *
     * @return string|null
     */
    public function getReceiver()
    {
        return $this->container['receiver'];
    }

    /**
     * Sets receiver
     *
     * @param string|null $receiver 
     *
     * @return self
     */
    public function setReceiver($receiver)
    {

        if (is_null($receiver)) {
            array_push($this->openAPINullablesSetToNull, 'receiver');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('receiver', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['receiver'] = $receiver;

        return $this;
    }

    /**
     * Gets token_sold
     *
     * @return string|null
     */
    public function getTokenSold()
    {
        return $this->container['token_sold'];
    }

    /**
     * Sets token_sold
     *
     * @param string|null $token_sold 
     *
     * @return self
     */
    public function setTokenSold($token_sold)
    {

        if (is_null($token_sold)) {
            array_push($this->openAPINullablesSetToNull, 'token_sold');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_sold', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_sold'] = $token_sold;

        return $this;
    }

    /**
     * Gets token_bought
     *
     * @return string|null
     */
    public function getTokenBought()
    {
        return $this->container['token_bought'];
    }

    /**
     * Sets token_bought
     *
     * @param string|null $token_bought 
     *
     * @return self
     */
    public function setTokenBought($token_bought)
    {

        if (is_null($token_bought)) {
            array_push($this->openAPINullablesSetToNull, 'token_bought');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_bought', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_bought'] = $token_bought;

        return $this;
    }

    /**
     * Gets amount_sold
     *
     * @return string|null
     */
    public function getAmountSold()
    {
        return $this->container['amount_sold'];
    }

    /**
     * Sets amount_sold
     *
     * @param string|null $amount_sold 
     *
     * @return self
     */
    public function setAmountSold($amount_sold)
    {

        if (is_null($amount_sold)) {
            array_push($this->openAPINullablesSetToNull, 'amount_sold');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('amount_sold', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['amount_sold'] = $amount_sold;

        return $this;
    }

    /**
     * Gets amount_bought
     *
     * @return string|null
     */
    public function getAmountBought()
    {
        return $this->container['amount_bought'];
    }

    /**
     * Sets amount_bought
     *
     * @param string|null $amount_bought 
     *
     * @return self
     */
    public function setAmountBought($amount_bought)
    {

        if (is_null($amount_bought)) {
            array_push($this->openAPINullablesSetToNull, 'amount_bought');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('amount_bought', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['amount_bought'] = $amount_bought;

        return $this;
    }

    /**
     * Gets block
     *
     * @return string|null
     */
    public function getBlock()
    {
        return $this->container['block'];
    }

    /**
     * Sets block
     *
     * @param string|null $block 
     *
     * @return self
     */
    public function setBlock($block)
    {

        if (is_null($block)) {
            array_push($this->openAPINullablesSetToNull, 'block');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('block', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['block'] = $block;

        return $this;
    }

    /**
     * Gets timestamp
     *
     * @return string|null
     */
    public function getTimestamp()
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     *
     * @param string|null $timestamp 
     *
     * @return self
     */
    public function setTimestamp($timestamp)
    {

        if (is_null($timestamp)) {
            array_push($this->openAPINullablesSetToNull, 'timestamp');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('timestamp', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['timestamp'] = $timestamp;

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
     * @param string|null $transaction 
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


