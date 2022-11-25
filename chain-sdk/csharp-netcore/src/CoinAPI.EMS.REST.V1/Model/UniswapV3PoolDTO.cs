/*
 * On Chain Dapps - REST API
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
    /// Information about a pool. Includes references to each token within the pool, volume information, liquidity information, and more. The pool entity mirrors the pool smart contract, and also contains aggregated information about use.
    /// </summary>
    [DataContract(Name = "UniswapV3.PoolDTO")]
    public partial class UniswapV3PoolDTO : IEquatable<UniswapV3PoolDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV3PoolDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="vid">vid.</param>
        /// <param name="id">Pool address..</param>
        /// <param name="createdAtTimestamp">Creation time..</param>
        /// <param name="token0">Reference to token0 as stored in pool contract..</param>
        /// <param name="token1">Reference to token1 as stored in pool contract..</param>
        /// <param name="feeTier">feeTier.</param>
        /// <param name="liquidity">liquidity.</param>
        /// <param name="sqrtPrice">sqrtPrice.</param>
        /// <param name="feeGrowthGlobal0x128">feeGrowthGlobal0x128.</param>
        /// <param name="feeGrowthGlobal1x128">feeGrowthGlobal1x128.</param>
        /// <param name="token0Price">Token0 per token1..</param>
        /// <param name="token1Price">Token1 per token0..</param>
        /// <param name="tick">tick.</param>
        /// <param name="observationIndex">observationIndex.</param>
        /// <param name="volumeToken0">All time token0 swapped..</param>
        /// <param name="volumeToken1">All time token1 swapped..</param>
        /// <param name="volumeUsd">All time USD swapped..</param>
        /// <param name="untrackedVolumeUsd">All time USD swapped, unfiltered for unreliable USD pools..</param>
        /// <param name="feesUsd">Fees in USD..</param>
        /// <param name="txCount">txCount.</param>
        /// <param name="collectedFeesToken0">All time fees collected token0..</param>
        /// <param name="collectedFeesToken1">All time fees collected token1..</param>
        /// <param name="collectedFeesUsd">All time fees collected derived USD..</param>
        /// <param name="totalValueLockedToken0">Total token 0 across all ticks..</param>
        /// <param name="totalValueLockedToken1">totalValueLockedToken1.</param>
        /// <param name="totalValueLockedEth">Total token 1 across all ticks..</param>
        /// <param name="totalValueLockedUsd">Total value locked USD..</param>
        /// <param name="totalValueLockedUsdUntracked">Total value locked derived ETH..</param>
        /// <param name="liquidityProviderCount">Liquidity providers count, used to detect new exchanges..</param>
        public UniswapV3PoolDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), long vid = default(long), string id = default(string), DateTime createdAtTimestamp = default(DateTime), string token0 = default(string), string token1 = default(string), NumericsBigInteger feeTier = default(NumericsBigInteger), NumericsBigInteger liquidity = default(NumericsBigInteger), NumericsBigInteger sqrtPrice = default(NumericsBigInteger), NumericsBigInteger feeGrowthGlobal0x128 = default(NumericsBigInteger), NumericsBigInteger feeGrowthGlobal1x128 = default(NumericsBigInteger), string token0Price = default(string), string token1Price = default(string), NumericsBigInteger tick = default(NumericsBigInteger), NumericsBigInteger observationIndex = default(NumericsBigInteger), string volumeToken0 = default(string), string volumeToken1 = default(string), string volumeUsd = default(string), string untrackedVolumeUsd = default(string), string feesUsd = default(string), NumericsBigInteger txCount = default(NumericsBigInteger), string collectedFeesToken0 = default(string), string collectedFeesToken1 = default(string), string collectedFeesUsd = default(string), string totalValueLockedToken0 = default(string), string totalValueLockedToken1 = default(string), string totalValueLockedEth = default(string), string totalValueLockedUsd = default(string), string totalValueLockedUsdUntracked = default(string), string liquidityProviderCount = default(string))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Vid = vid;
            this.Id = id;
            this.CreatedAtTimestamp = createdAtTimestamp;
            this.Token0 = token0;
            this.Token1 = token1;
            this.FeeTier = feeTier;
            this.Liquidity = liquidity;
            this.SqrtPrice = sqrtPrice;
            this.FeeGrowthGlobal0x128 = feeGrowthGlobal0x128;
            this.FeeGrowthGlobal1x128 = feeGrowthGlobal1x128;
            this.Token0Price = token0Price;
            this.Token1Price = token1Price;
            this.Tick = tick;
            this.ObservationIndex = observationIndex;
            this.VolumeToken0 = volumeToken0;
            this.VolumeToken1 = volumeToken1;
            this.VolumeUsd = volumeUsd;
            this.UntrackedVolumeUsd = untrackedVolumeUsd;
            this.FeesUsd = feesUsd;
            this.TxCount = txCount;
            this.CollectedFeesToken0 = collectedFeesToken0;
            this.CollectedFeesToken1 = collectedFeesToken1;
            this.CollectedFeesUsd = collectedFeesUsd;
            this.TotalValueLockedToken0 = totalValueLockedToken0;
            this.TotalValueLockedToken1 = totalValueLockedToken1;
            this.TotalValueLockedEth = totalValueLockedEth;
            this.TotalValueLockedUsd = totalValueLockedUsd;
            this.TotalValueLockedUsdUntracked = totalValueLockedUsdUntracked;
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
        /// Pool address.
        /// </summary>
        /// <value>Pool address.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Creation time.
        /// </summary>
        /// <value>Creation time.</value>
        [DataMember(Name = "created_at_timestamp", EmitDefaultValue = false)]
        public DateTime CreatedAtTimestamp { get; set; }

        /// <summary>
        /// Reference to token0 as stored in pool contract.
        /// </summary>
        /// <value>Reference to token0 as stored in pool contract.</value>
        [DataMember(Name = "token_0", EmitDefaultValue = true)]
        public string Token0 { get; set; }

        /// <summary>
        /// Reference to token1 as stored in pool contract.
        /// </summary>
        /// <value>Reference to token1 as stored in pool contract.</value>
        [DataMember(Name = "token_1", EmitDefaultValue = true)]
        public string Token1 { get; set; }

        /// <summary>
        /// Gets or Sets FeeTier
        /// </summary>
        [DataMember(Name = "fee_tier", EmitDefaultValue = false)]
        public NumericsBigInteger FeeTier { get; set; }

        /// <summary>
        /// Gets or Sets Liquidity
        /// </summary>
        [DataMember(Name = "liquidity", EmitDefaultValue = false)]
        public NumericsBigInteger Liquidity { get; set; }

        /// <summary>
        /// Gets or Sets SqrtPrice
        /// </summary>
        [DataMember(Name = "sqrt_price", EmitDefaultValue = false)]
        public NumericsBigInteger SqrtPrice { get; set; }

        /// <summary>
        /// Gets or Sets FeeGrowthGlobal0x128
        /// </summary>
        [DataMember(Name = "fee_growth_global_0x128", EmitDefaultValue = false)]
        public NumericsBigInteger FeeGrowthGlobal0x128 { get; set; }

        /// <summary>
        /// Gets or Sets FeeGrowthGlobal1x128
        /// </summary>
        [DataMember(Name = "fee_growth_global_1x128", EmitDefaultValue = false)]
        public NumericsBigInteger FeeGrowthGlobal1x128 { get; set; }

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
        /// Gets or Sets Tick
        /// </summary>
        [DataMember(Name = "tick", EmitDefaultValue = false)]
        public NumericsBigInteger Tick { get; set; }

        /// <summary>
        /// Gets or Sets ObservationIndex
        /// </summary>
        [DataMember(Name = "observation_index", EmitDefaultValue = false)]
        public NumericsBigInteger ObservationIndex { get; set; }

        /// <summary>
        /// All time token0 swapped.
        /// </summary>
        /// <value>All time token0 swapped.</value>
        [DataMember(Name = "volume_token_0", EmitDefaultValue = true)]
        public string VolumeToken0 { get; set; }

        /// <summary>
        /// All time token1 swapped.
        /// </summary>
        /// <value>All time token1 swapped.</value>
        [DataMember(Name = "volume_token_1", EmitDefaultValue = true)]
        public string VolumeToken1 { get; set; }

        /// <summary>
        /// All time USD swapped.
        /// </summary>
        /// <value>All time USD swapped.</value>
        [DataMember(Name = "volume_usd", EmitDefaultValue = true)]
        public string VolumeUsd { get; set; }

        /// <summary>
        /// All time USD swapped, unfiltered for unreliable USD pools.
        /// </summary>
        /// <value>All time USD swapped, unfiltered for unreliable USD pools.</value>
        [DataMember(Name = "untracked_volume_usd", EmitDefaultValue = true)]
        public string UntrackedVolumeUsd { get; set; }

        /// <summary>
        /// Fees in USD.
        /// </summary>
        /// <value>Fees in USD.</value>
        [DataMember(Name = "fees_usd", EmitDefaultValue = true)]
        public string FeesUsd { get; set; }

        /// <summary>
        /// Gets or Sets TxCount
        /// </summary>
        [DataMember(Name = "tx_count", EmitDefaultValue = false)]
        public NumericsBigInteger TxCount { get; set; }

        /// <summary>
        /// All time fees collected token0.
        /// </summary>
        /// <value>All time fees collected token0.</value>
        [DataMember(Name = "collected_fees_token_0", EmitDefaultValue = true)]
        public string CollectedFeesToken0 { get; set; }

        /// <summary>
        /// All time fees collected token1.
        /// </summary>
        /// <value>All time fees collected token1.</value>
        [DataMember(Name = "collected_fees_token_1", EmitDefaultValue = true)]
        public string CollectedFeesToken1 { get; set; }

        /// <summary>
        /// All time fees collected derived USD.
        /// </summary>
        /// <value>All time fees collected derived USD.</value>
        [DataMember(Name = "collected_fees_usd", EmitDefaultValue = true)]
        public string CollectedFeesUsd { get; set; }

        /// <summary>
        /// Total token 0 across all ticks.
        /// </summary>
        /// <value>Total token 0 across all ticks.</value>
        [DataMember(Name = "total_value_locked_token_0", EmitDefaultValue = true)]
        public string TotalValueLockedToken0 { get; set; }

        /// <summary>
        /// Gets or Sets TotalValueLockedToken1
        /// </summary>
        [DataMember(Name = "total_value_locked_token_1", EmitDefaultValue = true)]
        public string TotalValueLockedToken1 { get; set; }

        /// <summary>
        /// Total token 1 across all ticks.
        /// </summary>
        /// <value>Total token 1 across all ticks.</value>
        [DataMember(Name = "total_value_locked_eth", EmitDefaultValue = true)]
        public string TotalValueLockedEth { get; set; }

        /// <summary>
        /// Total value locked USD.
        /// </summary>
        /// <value>Total value locked USD.</value>
        [DataMember(Name = "total_value_locked_usd", EmitDefaultValue = true)]
        public string TotalValueLockedUsd { get; set; }

        /// <summary>
        /// Total value locked derived ETH.
        /// </summary>
        /// <value>Total value locked derived ETH.</value>
        [DataMember(Name = "total_value_locked_usd_untracked", EmitDefaultValue = true)]
        public string TotalValueLockedUsdUntracked { get; set; }

        /// <summary>
        /// Liquidity providers count, used to detect new exchanges.
        /// </summary>
        /// <value>Liquidity providers count, used to detect new exchanges.</value>
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
            sb.Append("class UniswapV3PoolDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  CreatedAtTimestamp: ").Append(CreatedAtTimestamp).Append("\n");
            sb.Append("  Token0: ").Append(Token0).Append("\n");
            sb.Append("  Token1: ").Append(Token1).Append("\n");
            sb.Append("  FeeTier: ").Append(FeeTier).Append("\n");
            sb.Append("  Liquidity: ").Append(Liquidity).Append("\n");
            sb.Append("  SqrtPrice: ").Append(SqrtPrice).Append("\n");
            sb.Append("  FeeGrowthGlobal0x128: ").Append(FeeGrowthGlobal0x128).Append("\n");
            sb.Append("  FeeGrowthGlobal1x128: ").Append(FeeGrowthGlobal1x128).Append("\n");
            sb.Append("  Token0Price: ").Append(Token0Price).Append("\n");
            sb.Append("  Token1Price: ").Append(Token1Price).Append("\n");
            sb.Append("  Tick: ").Append(Tick).Append("\n");
            sb.Append("  ObservationIndex: ").Append(ObservationIndex).Append("\n");
            sb.Append("  VolumeToken0: ").Append(VolumeToken0).Append("\n");
            sb.Append("  VolumeToken1: ").Append(VolumeToken1).Append("\n");
            sb.Append("  VolumeUsd: ").Append(VolumeUsd).Append("\n");
            sb.Append("  UntrackedVolumeUsd: ").Append(UntrackedVolumeUsd).Append("\n");
            sb.Append("  FeesUsd: ").Append(FeesUsd).Append("\n");
            sb.Append("  TxCount: ").Append(TxCount).Append("\n");
            sb.Append("  CollectedFeesToken0: ").Append(CollectedFeesToken0).Append("\n");
            sb.Append("  CollectedFeesToken1: ").Append(CollectedFeesToken1).Append("\n");
            sb.Append("  CollectedFeesUsd: ").Append(CollectedFeesUsd).Append("\n");
            sb.Append("  TotalValueLockedToken0: ").Append(TotalValueLockedToken0).Append("\n");
            sb.Append("  TotalValueLockedToken1: ").Append(TotalValueLockedToken1).Append("\n");
            sb.Append("  TotalValueLockedEth: ").Append(TotalValueLockedEth).Append("\n");
            sb.Append("  TotalValueLockedUsd: ").Append(TotalValueLockedUsd).Append("\n");
            sb.Append("  TotalValueLockedUsdUntracked: ").Append(TotalValueLockedUsdUntracked).Append("\n");
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
            return this.Equals(input as UniswapV3PoolDTO);
        }

        /// <summary>
        /// Returns true if UniswapV3PoolDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV3PoolDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV3PoolDTO input)
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
                    this.CreatedAtTimestamp == input.CreatedAtTimestamp ||
                    (this.CreatedAtTimestamp != null &&
                    this.CreatedAtTimestamp.Equals(input.CreatedAtTimestamp))
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
                    this.FeeTier == input.FeeTier ||
                    (this.FeeTier != null &&
                    this.FeeTier.Equals(input.FeeTier))
                ) && 
                (
                    this.Liquidity == input.Liquidity ||
                    (this.Liquidity != null &&
                    this.Liquidity.Equals(input.Liquidity))
                ) && 
                (
                    this.SqrtPrice == input.SqrtPrice ||
                    (this.SqrtPrice != null &&
                    this.SqrtPrice.Equals(input.SqrtPrice))
                ) && 
                (
                    this.FeeGrowthGlobal0x128 == input.FeeGrowthGlobal0x128 ||
                    (this.FeeGrowthGlobal0x128 != null &&
                    this.FeeGrowthGlobal0x128.Equals(input.FeeGrowthGlobal0x128))
                ) && 
                (
                    this.FeeGrowthGlobal1x128 == input.FeeGrowthGlobal1x128 ||
                    (this.FeeGrowthGlobal1x128 != null &&
                    this.FeeGrowthGlobal1x128.Equals(input.FeeGrowthGlobal1x128))
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
                    this.Tick == input.Tick ||
                    (this.Tick != null &&
                    this.Tick.Equals(input.Tick))
                ) && 
                (
                    this.ObservationIndex == input.ObservationIndex ||
                    (this.ObservationIndex != null &&
                    this.ObservationIndex.Equals(input.ObservationIndex))
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
                    this.FeesUsd == input.FeesUsd ||
                    (this.FeesUsd != null &&
                    this.FeesUsd.Equals(input.FeesUsd))
                ) && 
                (
                    this.TxCount == input.TxCount ||
                    (this.TxCount != null &&
                    this.TxCount.Equals(input.TxCount))
                ) && 
                (
                    this.CollectedFeesToken0 == input.CollectedFeesToken0 ||
                    (this.CollectedFeesToken0 != null &&
                    this.CollectedFeesToken0.Equals(input.CollectedFeesToken0))
                ) && 
                (
                    this.CollectedFeesToken1 == input.CollectedFeesToken1 ||
                    (this.CollectedFeesToken1 != null &&
                    this.CollectedFeesToken1.Equals(input.CollectedFeesToken1))
                ) && 
                (
                    this.CollectedFeesUsd == input.CollectedFeesUsd ||
                    (this.CollectedFeesUsd != null &&
                    this.CollectedFeesUsd.Equals(input.CollectedFeesUsd))
                ) && 
                (
                    this.TotalValueLockedToken0 == input.TotalValueLockedToken0 ||
                    (this.TotalValueLockedToken0 != null &&
                    this.TotalValueLockedToken0.Equals(input.TotalValueLockedToken0))
                ) && 
                (
                    this.TotalValueLockedToken1 == input.TotalValueLockedToken1 ||
                    (this.TotalValueLockedToken1 != null &&
                    this.TotalValueLockedToken1.Equals(input.TotalValueLockedToken1))
                ) && 
                (
                    this.TotalValueLockedEth == input.TotalValueLockedEth ||
                    (this.TotalValueLockedEth != null &&
                    this.TotalValueLockedEth.Equals(input.TotalValueLockedEth))
                ) && 
                (
                    this.TotalValueLockedUsd == input.TotalValueLockedUsd ||
                    (this.TotalValueLockedUsd != null &&
                    this.TotalValueLockedUsd.Equals(input.TotalValueLockedUsd))
                ) && 
                (
                    this.TotalValueLockedUsdUntracked == input.TotalValueLockedUsdUntracked ||
                    (this.TotalValueLockedUsdUntracked != null &&
                    this.TotalValueLockedUsdUntracked.Equals(input.TotalValueLockedUsdUntracked))
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
                if (this.CreatedAtTimestamp != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAtTimestamp.GetHashCode();
                }
                if (this.Token0 != null)
                {
                    hashCode = (hashCode * 59) + this.Token0.GetHashCode();
                }
                if (this.Token1 != null)
                {
                    hashCode = (hashCode * 59) + this.Token1.GetHashCode();
                }
                if (this.FeeTier != null)
                {
                    hashCode = (hashCode * 59) + this.FeeTier.GetHashCode();
                }
                if (this.Liquidity != null)
                {
                    hashCode = (hashCode * 59) + this.Liquidity.GetHashCode();
                }
                if (this.SqrtPrice != null)
                {
                    hashCode = (hashCode * 59) + this.SqrtPrice.GetHashCode();
                }
                if (this.FeeGrowthGlobal0x128 != null)
                {
                    hashCode = (hashCode * 59) + this.FeeGrowthGlobal0x128.GetHashCode();
                }
                if (this.FeeGrowthGlobal1x128 != null)
                {
                    hashCode = (hashCode * 59) + this.FeeGrowthGlobal1x128.GetHashCode();
                }
                if (this.Token0Price != null)
                {
                    hashCode = (hashCode * 59) + this.Token0Price.GetHashCode();
                }
                if (this.Token1Price != null)
                {
                    hashCode = (hashCode * 59) + this.Token1Price.GetHashCode();
                }
                if (this.Tick != null)
                {
                    hashCode = (hashCode * 59) + this.Tick.GetHashCode();
                }
                if (this.ObservationIndex != null)
                {
                    hashCode = (hashCode * 59) + this.ObservationIndex.GetHashCode();
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
                if (this.FeesUsd != null)
                {
                    hashCode = (hashCode * 59) + this.FeesUsd.GetHashCode();
                }
                if (this.TxCount != null)
                {
                    hashCode = (hashCode * 59) + this.TxCount.GetHashCode();
                }
                if (this.CollectedFeesToken0 != null)
                {
                    hashCode = (hashCode * 59) + this.CollectedFeesToken0.GetHashCode();
                }
                if (this.CollectedFeesToken1 != null)
                {
                    hashCode = (hashCode * 59) + this.CollectedFeesToken1.GetHashCode();
                }
                if (this.CollectedFeesUsd != null)
                {
                    hashCode = (hashCode * 59) + this.CollectedFeesUsd.GetHashCode();
                }
                if (this.TotalValueLockedToken0 != null)
                {
                    hashCode = (hashCode * 59) + this.TotalValueLockedToken0.GetHashCode();
                }
                if (this.TotalValueLockedToken1 != null)
                {
                    hashCode = (hashCode * 59) + this.TotalValueLockedToken1.GetHashCode();
                }
                if (this.TotalValueLockedEth != null)
                {
                    hashCode = (hashCode * 59) + this.TotalValueLockedEth.GetHashCode();
                }
                if (this.TotalValueLockedUsd != null)
                {
                    hashCode = (hashCode * 59) + this.TotalValueLockedUsd.GetHashCode();
                }
                if (this.TotalValueLockedUsdUntracked != null)
                {
                    hashCode = (hashCode * 59) + this.TotalValueLockedUsdUntracked.GetHashCode();
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
