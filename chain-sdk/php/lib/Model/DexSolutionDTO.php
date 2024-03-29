<?php
/**
 * DexSolutionDTO
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
 * DexSolutionDTO Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class DexSolutionDTO implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'Dex.SolutionDTO';

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
        'batch' => 'string',
        'solver' => 'string',
        'fee_reward' => 'string',
        'objective_value' => 'string',
        'utility' => 'string',
        'trades' => 'string[]',
        'create_epoch' => 'string',
        'revert_epoch' => 'string',
        'tx_hash' => 'string',
        'tx_log_index' => 'string',
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
        'batch' => null,
        'solver' => null,
        'fee_reward' => null,
        'objective_value' => null,
        'utility' => null,
        'trades' => null,
        'create_epoch' => null,
        'revert_epoch' => null,
        'tx_hash' => null,
        'tx_log_index' => null,
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
		'batch' => true,
		'solver' => true,
		'fee_reward' => true,
		'objective_value' => true,
		'utility' => true,
		'trades' => true,
		'create_epoch' => true,
		'revert_epoch' => true,
		'tx_hash' => true,
		'tx_log_index' => true,
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
        'batch' => 'batch',
        'solver' => 'solver',
        'fee_reward' => 'fee_reward',
        'objective_value' => 'objective_value',
        'utility' => 'utility',
        'trades' => 'trades',
        'create_epoch' => 'create_epoch',
        'revert_epoch' => 'revert_epoch',
        'tx_hash' => 'tx_hash',
        'tx_log_index' => 'tx_log_index',
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
        'batch' => 'setBatch',
        'solver' => 'setSolver',
        'fee_reward' => 'setFeeReward',
        'objective_value' => 'setObjectiveValue',
        'utility' => 'setUtility',
        'trades' => 'setTrades',
        'create_epoch' => 'setCreateEpoch',
        'revert_epoch' => 'setRevertEpoch',
        'tx_hash' => 'setTxHash',
        'tx_log_index' => 'setTxLogIndex',
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
        'batch' => 'getBatch',
        'solver' => 'getSolver',
        'fee_reward' => 'getFeeReward',
        'objective_value' => 'getObjectiveValue',
        'utility' => 'getUtility',
        'trades' => 'getTrades',
        'create_epoch' => 'getCreateEpoch',
        'revert_epoch' => 'getRevertEpoch',
        'tx_hash' => 'getTxHash',
        'tx_log_index' => 'getTxLogIndex',
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
        $this->setIfExists('batch', $data ?? [], null);
        $this->setIfExists('solver', $data ?? [], null);
        $this->setIfExists('fee_reward', $data ?? [], null);
        $this->setIfExists('objective_value', $data ?? [], null);
        $this->setIfExists('utility', $data ?? [], null);
        $this->setIfExists('trades', $data ?? [], null);
        $this->setIfExists('create_epoch', $data ?? [], null);
        $this->setIfExists('revert_epoch', $data ?? [], null);
        $this->setIfExists('tx_hash', $data ?? [], null);
        $this->setIfExists('tx_log_index', $data ?? [], null);
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
     * Gets batch
     *
     * @return string|null
     */
    public function getBatch()
    {
        return $this->container['batch'];
    }

    /**
     * Sets batch
     *
     * @param string|null $batch 
     *
     * @return self
     */
    public function setBatch($batch)
    {
        if (is_null($batch)) {
            array_push($this->openAPINullablesSetToNull, 'batch');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('batch', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['batch'] = $batch;

        return $this;
    }

    /**
     * Gets solver
     *
     * @return string|null
     */
    public function getSolver()
    {
        return $this->container['solver'];
    }

    /**
     * Sets solver
     *
     * @param string|null $solver 
     *
     * @return self
     */
    public function setSolver($solver)
    {
        if (is_null($solver)) {
            array_push($this->openAPINullablesSetToNull, 'solver');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('solver', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['solver'] = $solver;

        return $this;
    }

    /**
     * Gets fee_reward
     *
     * @return string|null
     */
    public function getFeeReward()
    {
        return $this->container['fee_reward'];
    }

    /**
     * Sets fee_reward
     *
     * @param string|null $fee_reward 
     *
     * @return self
     */
    public function setFeeReward($fee_reward)
    {
        if (is_null($fee_reward)) {
            array_push($this->openAPINullablesSetToNull, 'fee_reward');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('fee_reward', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['fee_reward'] = $fee_reward;

        return $this;
    }

    /**
     * Gets objective_value
     *
     * @return string|null
     */
    public function getObjectiveValue()
    {
        return $this->container['objective_value'];
    }

    /**
     * Sets objective_value
     *
     * @param string|null $objective_value 
     *
     * @return self
     */
    public function setObjectiveValue($objective_value)
    {
        if (is_null($objective_value)) {
            array_push($this->openAPINullablesSetToNull, 'objective_value');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('objective_value', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['objective_value'] = $objective_value;

        return $this;
    }

    /**
     * Gets utility
     *
     * @return string|null
     */
    public function getUtility()
    {
        return $this->container['utility'];
    }

    /**
     * Sets utility
     *
     * @param string|null $utility 
     *
     * @return self
     */
    public function setUtility($utility)
    {
        if (is_null($utility)) {
            array_push($this->openAPINullablesSetToNull, 'utility');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('utility', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['utility'] = $utility;

        return $this;
    }

    /**
     * Gets trades
     *
     * @return string[]|null
     */
    public function getTrades()
    {
        return $this->container['trades'];
    }

    /**
     * Sets trades
     *
     * @param string[]|null $trades 
     *
     * @return self
     */
    public function setTrades($trades)
    {
        if (is_null($trades)) {
            array_push($this->openAPINullablesSetToNull, 'trades');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('trades', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['trades'] = $trades;

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
     * @param string|null $create_epoch 
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


