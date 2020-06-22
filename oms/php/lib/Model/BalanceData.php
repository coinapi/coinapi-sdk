<?php
/**
 * BalanceData
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OMS - REST API ...@
 *
 * OMS Project
 *
 * The version of the OpenAPI document: v1
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.3.1
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
 * BalanceData Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class BalanceData implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'balance_data';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'id' => 'string',
        'symbol_exchange' => 'string',
        'symbol_coinapi' => 'string',
        'balance' => 'float',
        'available' => 'float',
        'locked' => 'float',
        'update_origin' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'id' => null,
        'symbol_exchange' => null,
        'symbol_coinapi' => null,
        'balance' => 'float',
        'available' => 'float',
        'locked' => 'float',
        'update_origin' => null
    ];

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
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'symbol_exchange' => 'symbol_exchange',
        'symbol_coinapi' => 'symbol_coinapi',
        'balance' => 'balance',
        'available' => 'available',
        'locked' => 'locked',
        'update_origin' => 'update_origin'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'symbol_exchange' => 'setSymbolExchange',
        'symbol_coinapi' => 'setSymbolCoinapi',
        'balance' => 'setBalance',
        'available' => 'setAvailable',
        'locked' => 'setLocked',
        'update_origin' => 'setUpdateOrigin'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'symbol_exchange' => 'getSymbolExchange',
        'symbol_coinapi' => 'getSymbolCoinapi',
        'balance' => 'getBalance',
        'available' => 'getAvailable',
        'locked' => 'getLocked',
        'update_origin' => 'getUpdateOrigin'
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

    const UPDATE_ORIGIN_INITIALIZATION = 'INITIALIZATION';
    const UPDATE_ORIGIN_BALANCE_MANAGER = 'BALANCE_MANAGER';
    const UPDATE_ORIGIN_EXCHANGE = 'EXCHANGE';
    

    
    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getUpdateOriginAllowableValues()
    {
        return [
            self::UPDATE_ORIGIN_INITIALIZATION,
            self::UPDATE_ORIGIN_BALANCE_MANAGER,
            self::UPDATE_ORIGIN_EXCHANGE,
        ];
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
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['symbol_exchange'] = isset($data['symbol_exchange']) ? $data['symbol_exchange'] : null;
        $this->container['symbol_coinapi'] = isset($data['symbol_coinapi']) ? $data['symbol_coinapi'] : null;
        $this->container['balance'] = isset($data['balance']) ? $data['balance'] : null;
        $this->container['available'] = isset($data['available']) ? $data['available'] : null;
        $this->container['locked'] = isset($data['locked']) ? $data['locked'] : null;
        $this->container['update_origin'] = isset($data['update_origin']) ? $data['update_origin'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        $allowedValues = $this->getUpdateOriginAllowableValues();
        if (!is_null($this->container['update_origin']) && !in_array($this->container['update_origin'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value for 'update_origin', must be one of '%s'",
                implode("', '", $allowedValues)
            );
        }

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
     * @param string|null $id symbol_exchange
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets symbol_exchange
     *
     * @return string|null
     */
    public function getSymbolExchange()
    {
        return $this->container['symbol_exchange'];
    }

    /**
     * Sets symbol_exchange
     *
     * @param string|null $symbol_exchange Currency code.
     *
     * @return $this
     */
    public function setSymbolExchange($symbol_exchange)
    {
        $this->container['symbol_exchange'] = $symbol_exchange;

        return $this;
    }

    /**
     * Gets symbol_coinapi
     *
     * @return string|null
     */
    public function getSymbolCoinapi()
    {
        return $this->container['symbol_coinapi'];
    }

    /**
     * Sets symbol_coinapi
     *
     * @param string|null $symbol_coinapi CoinAPI currency code.
     *
     * @return $this
     */
    public function setSymbolCoinapi($symbol_coinapi)
    {
        $this->container['symbol_coinapi'] = $symbol_coinapi;

        return $this;
    }

    /**
     * Gets balance
     *
     * @return float|null
     */
    public function getBalance()
    {
        return $this->container['balance'];
    }

    /**
     * Sets balance
     *
     * @param float|null $balance The current balance.
     *
     * @return $this
     */
    public function setBalance($balance)
    {
        $this->container['balance'] = $balance;

        return $this;
    }

    /**
     * Gets available
     *
     * @return float|null
     */
    public function getAvailable()
    {
        return $this->container['available'];
    }

    /**
     * Sets available
     *
     * @param float|null $available The amount that is available to trade.
     *
     * @return $this
     */
    public function setAvailable($available)
    {
        $this->container['available'] = $available;

        return $this;
    }

    /**
     * Gets locked
     *
     * @return float|null
     */
    public function getLocked()
    {
        return $this->container['locked'];
    }

    /**
     * Sets locked
     *
     * @param float|null $locked Blocked funds.
     *
     * @return $this
     */
    public function setLocked($locked)
    {
        $this->container['locked'] = $locked;

        return $this;
    }

    /**
     * Gets update_origin
     *
     * @return string|null
     */
    public function getUpdateOrigin()
    {
        return $this->container['update_origin'];
    }

    /**
     * Sets update_origin
     *
     * @param string|null $update_origin Source of last modification.
     *
     * @return $this
     */
    public function setUpdateOrigin($update_origin)
    {
        $allowedValues = $this->getUpdateOriginAllowableValues();
        if (!is_null($update_origin) && !in_array($update_origin, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value for 'update_origin', must be one of '%s'",
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['update_origin'] = $update_origin;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
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
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
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


