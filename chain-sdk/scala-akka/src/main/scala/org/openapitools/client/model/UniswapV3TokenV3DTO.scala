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

case class UniswapV3TokenV3DTO (
  entryTime: Option[OffsetDateTime] = None,
  recvTime: Option[OffsetDateTime] = None,
  /* Number of block in which entity was recorded. */
  blockNumber: Option[Long] = None,
  /*  */
  vid: Option[Long] = None,
  /* Token address. */
  id: Option[String] = None,
  /* Token symbol. */
  symbol: Option[String] = None,
  /* Token name. */
  name: Option[String] = None,
  /* Token decimals. */
  decimals: Option[Int] = None,
  totalSupply: Option[NumericsBigInteger] = None,
  /* Volume in token units. */
  volume: Option[String] = None,
  /* Volume in derived USD. */
  volumeUsd: Option[String] = None,
  /* Volume in USD even on pools with less reliable USD values. */
  untrackedVolumeUsd: Option[String] = None,
  /* Fees in USD. */
  feesUsd: Option[String] = None,
  txCount: Option[NumericsBigInteger] = None,
  poolCount: Option[NumericsBigInteger] = None,
  /* Liquidity across all pools in token units. */
  totalValueLocked: Option[String] = None,
  /* Liquidity across all pools in derived USD. */
  totalValueLockedUsd: Option[String] = None,
  /* TVL derived in USD untracked. */
  totalValueLockedUsdUntracked: Option[String] = None,
  /* Derived price in ETH. */
  derivedEth: Option[String] = None,
  /* Pools token is in that are white listed for USD pricing. */
  whitelistPools: Option[Seq[String]] = None,
  tokenSymbol: Option[String] = None
) extends ApiModel

