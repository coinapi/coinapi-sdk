<?php
/**
 * OrdStatus
 *
 * PHP version 7.3
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * OEML - REST API
 *
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.3.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;
use \OpenAPI\Client\ObjectSerializer;

/**
 * OrdStatus Class Doc Comment
 *
 * @category Class
 * @description Order statuses and the lifecycle are documented in the separate section: &lt;a href&#x3D;\&quot;#oeml-order-lifecycle\&quot;&gt;OEML / Starter Guide / Order Lifecycle&lt;/a&gt;
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class OrdStatus
{
    /**
     * Possible values of this enum
     */
    const RECEIVED = 'RECEIVED';

    const ROUTING = 'ROUTING';

    const ROUTED = 'ROUTED';

    const _NEW = 'NEW';

    const PENDING_CANCEL = 'PENDING_CANCEL';

    const PARTIALLY_FILLED = 'PARTIALLY_FILLED';

    const FILLED = 'FILLED';

    const CANCELED = 'CANCELED';

    const REJECTED = 'REJECTED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::RECEIVED,
            self::ROUTING,
            self::ROUTED,
            self::_NEW,
            self::PENDING_CANCEL,
            self::PARTIALLY_FILLED,
            self::FILLED,
            self::CANCELED,
            self::REJECTED
        ];
    }
}


