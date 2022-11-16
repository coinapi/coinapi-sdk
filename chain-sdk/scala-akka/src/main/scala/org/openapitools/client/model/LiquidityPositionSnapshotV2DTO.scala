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

case class LiquidityPositionSnapshotV2DTO (
  entryTime: Option[OffsetDateTime] = None,
  recvTime: Option[OffsetDateTime] = None,
  /* Number of block in which entity was recorded. */
  blockNumber: Option[Long] = None,
  /* Identifier, format: <pair address>-<user address> */
  id: Option[String] = None,
  /* Reference to LP identifier. */
  liquidityPosition: Option[String] = None,
  /* Creation time. */
  timestamp: Option[Int] = None,
  /* Number of block in which LP snapshot was recorded. */
  block: Option[Int] = None,
  /* Reference to user. */
  user: Option[String] = None,
  /* Reference to the pair liquidity is being provided on. */
  pair: Option[String] = None,
  /* Snapshot of token0 price. */
  token0PriceUsd: Option[String] = None,
  /* Snapshot of token0 price. */
  token1PriceUsd: Option[String] = None,
  /* Snapshot of pair token0 reserves. */
  reserve0: Option[String] = None,
  /* Snapshot of pair token1 reserves. */
  reserve1: Option[String] = None,
  /* Snapshot of pair reserves in USD. */
  reserveUsd: Option[String] = None,
  /* Snapshot of pool token supply. */
  liquidityTokenTotalSupply: Option[String] = None,
  /* Snapshot of users pool token balance. */
  liquidityTokenBalance: Option[String] = None,
  /*  */
  vid: Option[Long] = None,
  /*  */
  blockRange: Option[String] = None
) extends ApiModel

