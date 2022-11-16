/**
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import java.time.OffsetDateTime
import org.openapitools.client.core.ApiModel

case class RemoveLiquidityOneEventDTO (
  entryTime: Option[OffsetDateTime] = None,
  recvTime: Option[OffsetDateTime] = None,
  /* Number of block in which entity was recorded. */
  blockNumber: Option[Long] = None,
  /*  */
  id: Option[String] = None,
  /*  */
  pool: Option[String] = None,
  /*  */
  provider: Option[String] = None,
  /*  */
  tokenAmount: Option[String] = None,
  /*  */
  coinAmount: Option[String] = None,
  /*  */
  block: Option[String] = None,
  /*  */
  timestamp: Option[String] = None,
  /*  */
  transaction: Option[String] = None,
  /*  */
  vid: Option[Long] = None
) extends ApiModel

