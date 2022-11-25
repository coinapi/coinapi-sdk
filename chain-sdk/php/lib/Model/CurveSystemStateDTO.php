<?php
/**
 * CurveSystemStateDTO
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
 * CurveSystemStateDTO Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class CurveSystemStateDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Curve.SystemStateDTO';

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
        'registry_contract' => 'string',
        'contract_count' => 'string',
        'gauge_count' => 'string',
        'gauge_type_count' => 'string',
        'pool_count' => 'string',
        'token_count' => 'string',
        'total_pool_count' => 'string',
        'updated' => 'string',
        'updated_at_block' => 'string',
        'updated_at_transaction' => 'string',
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
        'registry_contract' => null,
        'contract_count' => null,
        'gauge_count' => null,
        'gauge_type_count' => null,
        'pool_count' => null,
        'token_count' => null,
        'total_pool_count' => null,
        'updated' => null,
        'updated_at_block' => null,
        'updated_at_transaction' => null,
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
		'registry_contract' => true,
		'contract_count' => true,
		'gauge_count' => true,
		'gauge_type_count' => true,
		'pool_count' => true,
		'token_count' => true,
		'total_pool_count' => true,
		'updated' => true,
		'updated_at_block' => true,
		'updated_at_transaction' => true,
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
        'registry_contract' => 'registry_contract',
        'contract_count' => 'contract_count',
        'gauge_count' => 'gauge_count',
        'gauge_type_count' => 'gauge_type_count',
        'pool_count' => 'pool_count',
        'token_count' => 'token_count',
        'total_pool_count' => 'total_pool_count',
        'updated' => 'updated',
        'updated_at_block' => 'updated_at_block',
        'updated_at_transaction' => 'updated_at_transaction',
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
        'registry_contract' => 'setRegistryContract',
        'contract_count' => 'setContractCount',
        'gauge_count' => 'setGaugeCount',
        'gauge_type_count' => 'setGaugeTypeCount',
        'pool_count' => 'setPoolCount',
        'token_count' => 'setTokenCount',
        'total_pool_count' => 'setTotalPoolCount',
        'updated' => 'setUpdated',
        'updated_at_block' => 'setUpdatedAtBlock',
        'updated_at_transaction' => 'setUpdatedAtTransaction',
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
        'registry_contract' => 'getRegistryContract',
        'contract_count' => 'getContractCount',
        'gauge_count' => 'getGaugeCount',
        'gauge_type_count' => 'getGaugeTypeCount',
        'pool_count' => 'getPoolCount',
        'token_count' => 'getTokenCount',
        'total_pool_count' => 'getTotalPoolCount',
        'updated' => 'getUpdated',
        'updated_at_block' => 'getUpdatedAtBlock',
        'updated_at_transaction' => 'getUpdatedAtTransaction',
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
        $this->setIfExists('registry_contract', $data ?? [], null);
        $this->setIfExists('contract_count', $data ?? [], null);
        $this->setIfExists('gauge_count', $data ?? [], null);
        $this->setIfExists('gauge_type_count', $data ?? [], null);
        $this->setIfExists('pool_count', $data ?? [], null);
        $this->setIfExists('token_count', $data ?? [], null);
        $this->setIfExists('total_pool_count', $data ?? [], null);
        $this->setIfExists('updated', $data ?? [], null);
        $this->setIfExists('updated_at_block', $data ?? [], null);
        $this->setIfExists('updated_at_transaction', $data ?? [], null);
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
     * @param string|null $id Singleton ID, equals to 'current'.
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
     * Gets registry_contract
     *
     * @return string|null
     */
    public function getRegistryContract()
    {
        return $this->container['registry_contract'];
    }

    /**
     * Sets registry_contract
     *
     * @param string|null $registry_contract Current pool registry address.
     *
     * @return self
     */
    public function setRegistryContract($registry_contract)
    {

        if (is_null($registry_contract)) {
            array_push($this->openAPINullablesSetToNull, 'registry_contract');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('registry_contract', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['registry_contract'] = $registry_contract;

        return $this;
    }

    /**
     * Gets contract_count
     *
     * @return string|null
     */
    public function getContractCount()
    {
        return $this->container['contract_count'];
    }

    /**
     * Sets contract_count
     *
     * @param string|null $contract_count Number of contracts in the AddressProvider registry.
     *
     * @return self
     */
    public function setContractCount($contract_count)
    {

        if (is_null($contract_count)) {
            array_push($this->openAPINullablesSetToNull, 'contract_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('contract_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['contract_count'] = $contract_count;

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
     * @param string|null $gauge_count Number of gauges registered.
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
     * Gets gauge_type_count
     *
     * @return string|null
     */
    public function getGaugeTypeCount()
    {
        return $this->container['gauge_type_count'];
    }

    /**
     * Sets gauge_type_count
     *
     * @param string|null $gauge_type_count Number of gauge types registered.
     *
     * @return self
     */
    public function setGaugeTypeCount($gauge_type_count)
    {

        if (is_null($gauge_type_count)) {
            array_push($this->openAPINullablesSetToNull, 'gauge_type_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('gauge_type_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['gauge_type_count'] = $gauge_type_count;

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
     * @param string|null $pool_count Number of active pools.
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
     * Gets token_count
     *
     * @return string|null
     */
    public function getTokenCount()
    {
        return $this->container['token_count'];
    }

    /**
     * Sets token_count
     *
     * @param string|null $token_count Number of tokens registered.
     *
     * @return self
     */
    public function setTokenCount($token_count)
    {

        if (is_null($token_count)) {
            array_push($this->openAPINullablesSetToNull, 'token_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('token_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['token_count'] = $token_count;

        return $this;
    }

    /**
     * Gets total_pool_count
     *
     * @return string|null
     */
    public function getTotalPoolCount()
    {
        return $this->container['total_pool_count'];
    }

    /**
     * Sets total_pool_count
     *
     * @param string|null $total_pool_count Total number of pools (including removed ones).
     *
     * @return self
     */
    public function setTotalPoolCount($total_pool_count)
    {

        if (is_null($total_pool_count)) {
            array_push($this->openAPINullablesSetToNull, 'total_pool_count');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('total_pool_count', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['total_pool_count'] = $total_pool_count;

        return $this;
    }

    /**
     * Gets updated
     *
     * @return string|null
     */
    public function getUpdated()
    {
        return $this->container['updated'];
    }

    /**
     * Sets updated
     *
     * @param string|null $updated 
     *
     * @return self
     */
    public function setUpdated($updated)
    {

        if (is_null($updated)) {
            array_push($this->openAPINullablesSetToNull, 'updated');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('updated', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['updated'] = $updated;

        return $this;
    }

    /**
     * Gets updated_at_block
     *
     * @return string|null
     */
    public function getUpdatedAtBlock()
    {
        return $this->container['updated_at_block'];
    }

    /**
     * Sets updated_at_block
     *
     * @param string|null $updated_at_block 
     *
     * @return self
     */
    public function setUpdatedAtBlock($updated_at_block)
    {

        if (is_null($updated_at_block)) {
            array_push($this->openAPINullablesSetToNull, 'updated_at_block');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('updated_at_block', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['updated_at_block'] = $updated_at_block;

        return $this;
    }

    /**
     * Gets updated_at_transaction
     *
     * @return string|null
     */
    public function getUpdatedAtTransaction()
    {
        return $this->container['updated_at_transaction'];
    }

    /**
     * Sets updated_at_transaction
     *
     * @param string|null $updated_at_transaction 
     *
     * @return self
     */
    public function setUpdatedAtTransaction($updated_at_transaction)
    {

        if (is_null($updated_at_transaction)) {
            array_push($this->openAPINullablesSetToNull, 'updated_at_transaction');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('updated_at_transaction', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }

        $this->container['updated_at_transaction'] = $updated_at_transaction;

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


