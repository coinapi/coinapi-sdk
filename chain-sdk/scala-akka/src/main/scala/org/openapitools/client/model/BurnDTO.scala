/**
 * On Chain Dapps - REST API
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

case class BurnDTO (
  entryTime: Option[OffsetDateTime] = None,
  recvTime: Option[OffsetDateTime] = None,
  /* Number of block in which entity was recorded. */
  blockNumber: Option[Long] = None,
  /* Transaction hash + '#' + index in mints Transaction array. */
  id: Option[String] = None,
  /* Transaction burn was included in. */
  transaction: Option[String] = None,
  /* Pool position is within. */
  pool: Option[String] = None,
  /* Reference to token0 as stored in pool contract. */
  token0: Option[String] = None,
  /* Reference to token1 as stored in pool contract. */
  token1: Option[String] = None,
  /* Timestamp. */
  timestamp: Option[String] = None,
  /* Owner of position where liquidity was burned. */
  owner: Option[String] = None,
  /* Transaction origin: the EOA (Externally Owned Account) that initiated the transaction. */
  origin: Option[String] = None,
  /* Amount of liquidity burned. */
  amount: Option[String] = None,
  /* Amount of token 0 burned. */
  amount0: Option[String] = None,
  /* Amount of token 1 burned. */
  amount1: Option[String] = None,
  /* Derived amount based on available prices of tokens. */
  amountUsd: Option[String] = None,
  /* Lower tick of position. */
  tickLower: Option[String] = None,
  /* Upper tick of position. */
  tickUpper: Option[String] = None,
  /* Position within the transactions. */
  logIndex: Option[String] = None,
  /*  */
  vid: Option[Long] = None
) extends ApiModel

