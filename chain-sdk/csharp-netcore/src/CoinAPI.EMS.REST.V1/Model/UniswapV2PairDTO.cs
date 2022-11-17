/*
 * OnChain API
 *
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = CoinAPI.EMS.REST.V1.Client.OpenAPIDateConverter;

namespace CoinAPI.EMS.REST.V1.Model
{
    /// <summary>
    /// Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.
    /// </summary>
    [DataContract(Name = "UniswapV2.PairDTO")]
    public partial class UniswapV2PairDTO : IEquatable<UniswapV2PairDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV2PairDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="vid">vid.</param>
        /// <param name="id">Pair contract address..</param>
        /// <param name="token0">Reference to token0 as stored in pair contract..</param>
        /// <param name="token1">Reference to token1 as stored in pair contract..</param>
        /// <param name="reserve0">Reserve of token0..</param>
        /// <param name="reserve1">Reserve of token1..</param>
        /// <param name="totalSupply">Total supply of liquidity token distributed to LPs..</param>
        /// <param name="reserveEth">Total liquidity in pair stored as an amount of ETH..</param>
        /// <param name="reserveUsd">Total liquidity amount in pair stored as an amount of USD..</param>
        /// <param name="trackedReserveEth">Total liquidity with only tracked amount..</param>
        /// <param name="token0Price">Token0 per token1..</param>
        /// <param name="token1Price">Token1 per token0..</param>
        /// <param name="volumeToken0">Amount of token0 swapped on this pair..</param>
        /// <param name="volumeToken1">Amount of token1 swapped on this pair..</param>
        /// <param name="volumeUsd">Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold)..</param>
        /// <param name="untrackedVolumeUsd">Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold..</param>
        /// <param name="txCount">txCount.</param>
        /// <param name="createdAtTimestamp">Timestamp contract was created..</param>
        /// <param name="liquidityProviderCount">Total number of LPs..</param>
        public UniswapV2PairDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), long vid = default(long), string id = default(string), string token0 = default(string), string token1 = default(string), string reserve0 = default(string), string reserve1 = default(string), string totalSupply = default(string), string reserveEth = default(string), string reserveUsd = default(string), string trackedReserveEth = default(string), string token0Price = default(string), string token1Price = default(string), string volumeToken0 = default(string), string volumeToken1 = default(string), string volumeUsd = default(string), string untrackedVolumeUsd = default(string), NumericsBigInteger txCount = default(NumericsBigInteger), DateTime createdAtTimestamp = default(DateTime), string liquidityProviderCount = default(string))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Vid = vid;
            this.Id = id;
            this.Token0 = token0;
            this.Token1 = token1;
            this.Reserve0 = reserve0;
            this.Reserve1 = reserve1;
            this.TotalSupply = totalSupply;
            this.ReserveEth = reserveEth;
            this.ReserveUsd = reserveUsd;
            this.TrackedReserveEth = trackedReserveEth;
            this.Token0Price = token0Price;
            this.Token1Price = token1Price;
            this.VolumeToken0 = volumeToken0;
            this.VolumeToken1 = volumeToken1;
            this.VolumeUsd = volumeUsd;
            this.UntrackedVolumeUsd = untrackedVolumeUsd;
            this.TxCount = txCount;
            this.CreatedAtTimestamp = createdAtTimestamp;
            this.LiquidityProviderCount = liquidityProviderCount;
        }

        /// <summary>
        /// Gets or Sets EntryTime
        /// </summary>
        [DataMember(Name = "entry_time", EmitDefaultValue = false)]
        public DateTime EntryTime { get; set; }

        /// <summary>
        /// Gets or Sets RecvTime
        /// </summary>
        [DataMember(Name = "recv_time", EmitDefaultValue = false)]
        public DateTime RecvTime { get; set; }

        /// <summary>
        /// Number of block in which entity was recorded.
        /// </summary>
        /// <value>Number of block in which entity was recorded.</value>
        [DataMember(Name = "block_number", EmitDefaultValue = false)]
        public long BlockNumber { get; set; }

        /// <summary>
        /// Gets or Sets Vid
        /// </summary>
        [DataMember(Name = "vid", EmitDefaultValue = false)]
        public long Vid { get; set; }

        /// <summary>
        /// Pair contract address.
        /// </summary>
        /// <value>Pair contract address.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Reference to token0 as stored in pair contract.
        /// </summary>
        /// <value>Reference to token0 as stored in pair contract.</value>
        [DataMember(Name = "token_0", EmitDefaultValue = true)]
        public string Token0 { get; set; }

        /// <summary>
        /// Reference to token1 as stored in pair contract.
        /// </summary>
        /// <value>Reference to token1 as stored in pair contract.</value>
        [DataMember(Name = "token_1", EmitDefaultValue = true)]
        public string Token1 { get; set; }

        /// <summary>
        /// Reserve of token0.
        /// </summary>
        /// <value>Reserve of token0.</value>
        [DataMember(Name = "reserve_0", EmitDefaultValue = true)]
        public string Reserve0 { get; set; }

        /// <summary>
        /// Reserve of token1.
        /// </summary>
        /// <value>Reserve of token1.</value>
        [DataMember(Name = "reserve_1", EmitDefaultValue = true)]
        public string Reserve1 { get; set; }

        /// <summary>
        /// Total supply of liquidity token distributed to LPs.
        /// </summary>
        /// <value>Total supply of liquidity token distributed to LPs.</value>
        [DataMember(Name = "total_supply", EmitDefaultValue = true)]
        public string TotalSupply { get; set; }

        /// <summary>
        /// Total liquidity in pair stored as an amount of ETH.
        /// </summary>
        /// <value>Total liquidity in pair stored as an amount of ETH.</value>
        [DataMember(Name = "reserve_eth", EmitDefaultValue = true)]
        public string ReserveEth { get; set; }

        /// <summary>
        /// Total liquidity amount in pair stored as an amount of USD.
        /// </summary>
        /// <value>Total liquidity amount in pair stored as an amount of USD.</value>
        [DataMember(Name = "reserve_usd", EmitDefaultValue = true)]
        public string ReserveUsd { get; set; }

        /// <summary>
        /// Total liquidity with only tracked amount.
        /// </summary>
        /// <value>Total liquidity with only tracked amount.</value>
        [DataMember(Name = "tracked_reserve_eth", EmitDefaultValue = true)]
        public string TrackedReserveEth { get; set; }

        /// <summary>
        /// Token0 per token1.
        /// </summary>
        /// <value>Token0 per token1.</value>
        [DataMember(Name = "token_0_price", EmitDefaultValue = true)]
        public string Token0Price { get; set; }

        /// <summary>
        /// Token1 per token0.
        /// </summary>
        /// <value>Token1 per token0.</value>
        [DataMember(Name = "token_1_price", EmitDefaultValue = true)]
        public string Token1Price { get; set; }

        /// <summary>
        /// Amount of token0 swapped on this pair.
        /// </summary>
        /// <value>Amount of token0 swapped on this pair.</value>
        [DataMember(Name = "volume_token_0", EmitDefaultValue = true)]
        public string VolumeToken0 { get; set; }

        /// <summary>
        /// Amount of token1 swapped on this pair.
        /// </summary>
        /// <value>Amount of token1 swapped on this pair.</value>
        [DataMember(Name = "volume_token_1", EmitDefaultValue = true)]
        public string VolumeToken1 { get; set; }

        /// <summary>
        /// Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold).
        /// </summary>
        /// <value>Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold).</value>
        [DataMember(Name = "volume_usd", EmitDefaultValue = true)]
        public string VolumeUsd { get; set; }

        /// <summary>
        /// Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold.
        /// </summary>
        /// <value>Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold.</value>
        [DataMember(Name = "untracked_volume_usd", EmitDefaultValue = true)]
        public string UntrackedVolumeUsd { get; set; }

        /// <summary>
        /// Gets or Sets TxCount
        /// </summary>
        [DataMember(Name = "tx_count", EmitDefaultValue = false)]
        public NumericsBigInteger TxCount { get; set; }

        /// <summary>
        /// Timestamp contract was created.
        /// </summary>
        /// <value>Timestamp contract was created.</value>
        [DataMember(Name = "created_at_timestamp", EmitDefaultValue = false)]
        public DateTime CreatedAtTimestamp { get; set; }

        /// <summary>
        /// Total number of LPs.
        /// </summary>
        /// <value>Total number of LPs.</value>
        [DataMember(Name = "liquidity_provider_count", EmitDefaultValue = true)]
        public string LiquidityProviderCount { get; set; }

        /// <summary>
        /// Gets or Sets EvaluatedAsk
        /// </summary>
        [DataMember(Name = "evaluated_ask", EmitDefaultValue = false)]
        public double EvaluatedAsk { get; private set; }

        /// <summary>
        /// Returns false as EvaluatedAsk should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeEvaluatedAsk()
        {
            return false;
        }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UniswapV2PairDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Token0: ").Append(Token0).Append("\n");
            sb.Append("  Token1: ").Append(Token1).Append("\n");
            sb.Append("  Reserve0: ").Append(Reserve0).Append("\n");
            sb.Append("  Reserve1: ").Append(Reserve1).Append("\n");
            sb.Append("  TotalSupply: ").Append(TotalSupply).Append("\n");
            sb.Append("  ReserveEth: ").Append(ReserveEth).Append("\n");
            sb.Append("  ReserveUsd: ").Append(ReserveUsd).Append("\n");
            sb.Append("  TrackedReserveEth: ").Append(TrackedReserveEth).Append("\n");
            sb.Append("  Token0Price: ").Append(Token0Price).Append("\n");
            sb.Append("  Token1Price: ").Append(Token1Price).Append("\n");
            sb.Append("  VolumeToken0: ").Append(VolumeToken0).Append("\n");
            sb.Append("  VolumeToken1: ").Append(VolumeToken1).Append("\n");
            sb.Append("  VolumeUsd: ").Append(VolumeUsd).Append("\n");
            sb.Append("  UntrackedVolumeUsd: ").Append(UntrackedVolumeUsd).Append("\n");
            sb.Append("  TxCount: ").Append(TxCount).Append("\n");
            sb.Append("  CreatedAtTimestamp: ").Append(CreatedAtTimestamp).Append("\n");
            sb.Append("  LiquidityProviderCount: ").Append(LiquidityProviderCount).Append("\n");
            sb.Append("  EvaluatedAsk: ").Append(EvaluatedAsk).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as UniswapV2PairDTO);
        }

        /// <summary>
        /// Returns true if UniswapV2PairDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV2PairDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV2PairDTO input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.EntryTime == input.EntryTime ||
                    (this.EntryTime != null &&
                    this.EntryTime.Equals(input.EntryTime))
                ) && 
                (
                    this.RecvTime == input.RecvTime ||
                    (this.RecvTime != null &&
                    this.RecvTime.Equals(input.RecvTime))
                ) && 
                (
                    this.BlockNumber == input.BlockNumber ||
                    this.BlockNumber.Equals(input.BlockNumber)
                ) && 
                (
                    this.Vid == input.Vid ||
                    this.Vid.Equals(input.Vid)
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Token0 == input.Token0 ||
                    (this.Token0 != null &&
                    this.Token0.Equals(input.Token0))
                ) && 
                (
                    this.Token1 == input.Token1 ||
                    (this.Token1 != null &&
                    this.Token1.Equals(input.Token1))
                ) && 
                (
                    this.Reserve0 == input.Reserve0 ||
                    (this.Reserve0 != null &&
                    this.Reserve0.Equals(input.Reserve0))
                ) && 
                (
                    this.Reserve1 == input.Reserve1 ||
                    (this.Reserve1 != null &&
                    this.Reserve1.Equals(input.Reserve1))
                ) && 
                (
                    this.TotalSupply == input.TotalSupply ||
                    (this.TotalSupply != null &&
                    this.TotalSupply.Equals(input.TotalSupply))
                ) && 
                (
                    this.ReserveEth == input.ReserveEth ||
                    (this.ReserveEth != null &&
                    this.ReserveEth.Equals(input.ReserveEth))
                ) && 
                (
                    this.ReserveUsd == input.ReserveUsd ||
                    (this.ReserveUsd != null &&
                    this.ReserveUsd.Equals(input.ReserveUsd))
                ) && 
                (
                    this.TrackedReserveEth == input.TrackedReserveEth ||
                    (this.TrackedReserveEth != null &&
                    this.TrackedReserveEth.Equals(input.TrackedReserveEth))
                ) && 
                (
                    this.Token0Price == input.Token0Price ||
                    (this.Token0Price != null &&
                    this.Token0Price.Equals(input.Token0Price))
                ) && 
                (
                    this.Token1Price == input.Token1Price ||
                    (this.Token1Price != null &&
                    this.Token1Price.Equals(input.Token1Price))
                ) && 
                (
                    this.VolumeToken0 == input.VolumeToken0 ||
                    (this.VolumeToken0 != null &&
                    this.VolumeToken0.Equals(input.VolumeToken0))
                ) && 
                (
                    this.VolumeToken1 == input.VolumeToken1 ||
                    (this.VolumeToken1 != null &&
                    this.VolumeToken1.Equals(input.VolumeToken1))
                ) && 
                (
                    this.VolumeUsd == input.VolumeUsd ||
                    (this.VolumeUsd != null &&
                    this.VolumeUsd.Equals(input.VolumeUsd))
                ) && 
                (
                    this.UntrackedVolumeUsd == input.UntrackedVolumeUsd ||
                    (this.UntrackedVolumeUsd != null &&
                    this.UntrackedVolumeUsd.Equals(input.UntrackedVolumeUsd))
                ) && 
                (
                    this.TxCount == input.TxCount ||
                    (this.TxCount != null &&
                    this.TxCount.Equals(input.TxCount))
                ) && 
                (
                    this.CreatedAtTimestamp == input.CreatedAtTimestamp ||
                    (this.CreatedAtTimestamp != null &&
                    this.CreatedAtTimestamp.Equals(input.CreatedAtTimestamp))
                ) && 
                (
                    this.LiquidityProviderCount == input.LiquidityProviderCount ||
                    (this.LiquidityProviderCount != null &&
                    this.LiquidityProviderCount.Equals(input.LiquidityProviderCount))
                ) && 
                (
                    this.EvaluatedAsk == input.EvaluatedAsk ||
                    this.EvaluatedAsk.Equals(input.EvaluatedAsk)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.EntryTime != null)
                {
                    hashCode = (hashCode * 59) + this.EntryTime.GetHashCode();
                }
                if (this.RecvTime != null)
                {
                    hashCode = (hashCode * 59) + this.RecvTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.BlockNumber.GetHashCode();
                hashCode = (hashCode * 59) + this.Vid.GetHashCode();
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Token0 != null)
                {
                    hashCode = (hashCode * 59) + this.Token0.GetHashCode();
                }
                if (this.Token1 != null)
                {
                    hashCode = (hashCode * 59) + this.Token1.GetHashCode();
                }
                if (this.Reserve0 != null)
                {
                    hashCode = (hashCode * 59) + this.Reserve0.GetHashCode();
                }
                if (this.Reserve1 != null)
                {
                    hashCode = (hashCode * 59) + this.Reserve1.GetHashCode();
                }
                if (this.TotalSupply != null)
                {
                    hashCode = (hashCode * 59) + this.TotalSupply.GetHashCode();
                }
                if (this.ReserveEth != null)
                {
                    hashCode = (hashCode * 59) + this.ReserveEth.GetHashCode();
                }
                if (this.ReserveUsd != null)
                {
                    hashCode = (hashCode * 59) + this.ReserveUsd.GetHashCode();
                }
                if (this.TrackedReserveEth != null)
                {
                    hashCode = (hashCode * 59) + this.TrackedReserveEth.GetHashCode();
                }
                if (this.Token0Price != null)
                {
                    hashCode = (hashCode * 59) + this.Token0Price.GetHashCode();
                }
                if (this.Token1Price != null)
                {
                    hashCode = (hashCode * 59) + this.Token1Price.GetHashCode();
                }
                if (this.VolumeToken0 != null)
                {
                    hashCode = (hashCode * 59) + this.VolumeToken0.GetHashCode();
                }
                if (this.VolumeToken1 != null)
                {
                    hashCode = (hashCode * 59) + this.VolumeToken1.GetHashCode();
                }
                if (this.VolumeUsd != null)
                {
                    hashCode = (hashCode * 59) + this.VolumeUsd.GetHashCode();
                }
                if (this.UntrackedVolumeUsd != null)
                {
                    hashCode = (hashCode * 59) + this.UntrackedVolumeUsd.GetHashCode();
                }
                if (this.TxCount != null)
                {
                    hashCode = (hashCode * 59) + this.TxCount.GetHashCode();
                }
                if (this.CreatedAtTimestamp != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAtTimestamp.GetHashCode();
                }
                if (this.LiquidityProviderCount != null)
                {
                    hashCode = (hashCode * 59) + this.LiquidityProviderCount.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.EvaluatedAsk.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
