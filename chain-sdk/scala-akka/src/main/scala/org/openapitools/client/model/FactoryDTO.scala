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

case class FactoryDTO (
  entryTime: Option[OffsetDateTime] = None,
  recvTime: Option[OffsetDateTime] = None,
  /* Number of block in which entity was recorded. */
  blockNumber: Option[Long] = None,
  /* Factory address. */
  id: Option[String] = None,
  /* Amount of pools created. */
  poolCount: Option[String] = None,
  /* Amount of transactions all time. */
  txCount: Option[String] = None,
  /* Total volume all time in derived USD. */
  totalVolumeUsd: Option[String] = None,
  /* Total volume all time in derived ETH. */
  totalVolumeEth: Option[String] = None,
  /* Total swap fees all time in USD. */
  totalFeesUsd: Option[String] = None,
  /* All volume even through less reliable USD values. */
  totalFeesEth: Option[String] = None,
  /* All volume even through less reliable USD values. */
  untrackedVolumeUsd: Option[String] = None,
  /* Total value locked derived in USD. */
  totalValueLockedUsd: Option[String] = None,
  /* Total value locked derived in ETH. */
  totalValueLockedEth: Option[String] = None,
  /* Total value locked derived in USD untracked. */
  totalValueLockedUsdUntracked: Option[String] = None,
  /* Total value locked derived in ETH untracked. */
  totalValueLockedEthUntracked: Option[String] = None,
  /* Current owner of the factory. */
  owner: Option[String] = None,
  /*  */
  vid: Option[Long] = None
) extends ApiModel

