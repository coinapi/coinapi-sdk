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
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = CoinAPI.EMS.REST.V1.Client.OpenAPIDateConverter;

namespace CoinAPI.EMS.REST.V1.Model
{
    /// <summary>
    /// Ticks are the boundaries between discrete areas in price space.
    /// </summary>
    [DataContract]
    public partial class UniswapV3TickDTO :  IEquatable<UniswapV3TickDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV3TickDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="vid">vid.</param>
        /// <param name="id">Identifier, format: (pool address)#(tick index).</param>
        /// <param name="poolAddress">Pool address..</param>
        /// <param name="tickIdx">tickIdx.</param>
        /// <param name="pool">Pool address..</param>
        /// <param name="liquidityGross">liquidityGross.</param>
        /// <param name="liquidityNet">liquidityNet.</param>
        /// <param name="price0">Calculated price of token0 of tick within this pool - constant..</param>
        /// <param name="price1">Calculated price of token1 of tick within this pool - constant..</param>
        /// <param name="volumeToken0">Lifetime volume of token0 with this tick in range..</param>
        /// <param name="volumeToken1">Lifetime volume of token1 with this tick in range..</param>
        /// <param name="volumeUsd">Lifetime volume in derived USD with this tick in range..</param>
        /// <param name="untrackedVolumeUsd">Lifetime volume in untracked USD with this tick in range..</param>
        /// <param name="feesUsd">Fees in USD..</param>
        /// <param name="collectedFeesToken0">All time collected fees in token0..</param>
        /// <param name="collectedFeesToken1">All time collected fees in token1..</param>
        /// <param name="collectedFeesUsd">All time collected fees in USD..</param>
        /// <param name="createdAtTimestamp">Created time..</param>
        /// <param name="liquidityProviderCount">liquidityProviderCount.</param>
        /// <param name="feeGrowthOutside0x128">feeGrowthOutside0x128.</param>
        /// <param name="feeGrowthOutside1x128">feeGrowthOutside1x128.</param>
        public UniswapV3TickDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), long vid = default(long), string id = default(string), string poolAddress = default(string), NumericsBigInteger tickIdx = default(NumericsBigInteger), string pool = default(string), NumericsBigInteger liquidityGross = default(NumericsBigInteger), NumericsBigInteger liquidityNet = default(NumericsBigInteger), string price0 = default(string), string price1 = default(string), string volumeToken0 = default(string), string volumeToken1 = default(string), string volumeUsd = default(string), string untrackedVolumeUsd = default(string), string feesUsd = default(string), string collectedFeesToken0 = default(string), string collectedFeesToken1 = default(string), string collectedFeesUsd = default(string), DateTime createdAtTimestamp = default(DateTime), NumericsBigInteger liquidityProviderCount = default(NumericsBigInteger), NumericsBigInteger feeGrowthOutside0x128 = default(NumericsBigInteger), NumericsBigInteger feeGrowthOutside1x128 = default(NumericsBigInteger))
        {
            this.Id = id;
            this.PoolAddress = poolAddress;
            this.Pool = pool;
            this.Price0 = price0;
            this.Price1 = price1;
            this.VolumeToken0 = volumeToken0;
            this.VolumeToken1 = volumeToken1;
            this.VolumeUsd = volumeUsd;
            this.UntrackedVolumeUsd = untrackedVolumeUsd;
            this.FeesUsd = feesUsd;
            this.CollectedFeesToken0 = collectedFeesToken0;
            this.CollectedFeesToken1 = collectedFeesToken1;
            this.CollectedFeesUsd = collectedFeesUsd;
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Vid = vid;
            this.Id = id;
            this.PoolAddress = poolAddress;
            this.TickIdx = tickIdx;
            this.Pool = pool;
            this.LiquidityGross = liquidityGross;
            this.LiquidityNet = liquidityNet;
            this.Price0 = price0;
            this.Price1 = price1;
            this.VolumeToken0 = volumeToken0;
            this.VolumeToken1 = volumeToken1;
            this.VolumeUsd = volumeUsd;
            this.UntrackedVolumeUsd = untrackedVolumeUsd;
            this.FeesUsd = feesUsd;
            this.CollectedFeesToken0 = collectedFeesToken0;
            this.CollectedFeesToken1 = collectedFeesToken1;
            this.CollectedFeesUsd = collectedFeesUsd;
            this.CreatedAtTimestamp = createdAtTimestamp;
            this.LiquidityProviderCount = liquidityProviderCount;
            this.FeeGrowthOutside0x128 = feeGrowthOutside0x128;
            this.FeeGrowthOutside1x128 = feeGrowthOutside1x128;
        }

        /// <summary>
        /// Gets or Sets EntryTime
        /// </summary>
        [DataMember(Name="entry_time", EmitDefaultValue=false)]
        public DateTime EntryTime { get; set; }

        /// <summary>
        /// Gets or Sets RecvTime
        /// </summary>
        [DataMember(Name="recv_time", EmitDefaultValue=false)]
        public DateTime RecvTime { get; set; }

        /// <summary>
        /// Number of block in which entity was recorded.
        /// </summary>
        /// <value>Number of block in which entity was recorded.</value>
        [DataMember(Name="block_number", EmitDefaultValue=false)]
        public long BlockNumber { get; set; }

        /// <summary>
        /// Gets or Sets Vid
        /// </summary>
        [DataMember(Name="vid", EmitDefaultValue=false)]
        public long Vid { get; set; }

        /// <summary>
        /// Identifier, format: (pool address)#(tick index)
        /// </summary>
        /// <value>Identifier, format: (pool address)#(tick index)</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Pool address.
        /// </summary>
        /// <value>Pool address.</value>
        [DataMember(Name="pool_address", EmitDefaultValue=true)]
        public string PoolAddress { get; set; }

        /// <summary>
        /// Gets or Sets TickIdx
        /// </summary>
        [DataMember(Name="tick_idx", EmitDefaultValue=false)]
        public NumericsBigInteger TickIdx { get; set; }

        /// <summary>
        /// Pool address.
        /// </summary>
        /// <value>Pool address.</value>
        [DataMember(Name="pool", EmitDefaultValue=true)]
        public string Pool { get; set; }

        /// <summary>
        /// Gets or Sets LiquidityGross
        /// </summary>
        [DataMember(Name="liquidity_gross", EmitDefaultValue=false)]
        public NumericsBigInteger LiquidityGross { get; set; }

        /// <summary>
        /// Gets or Sets LiquidityNet
        /// </summary>
        [DataMember(Name="liquidity_net", EmitDefaultValue=false)]
        public NumericsBigInteger LiquidityNet { get; set; }

        /// <summary>
        /// Calculated price of token0 of tick within this pool - constant.
        /// </summary>
        /// <value>Calculated price of token0 of tick within this pool - constant.</value>
        [DataMember(Name="price_0", EmitDefaultValue=true)]
        public string Price0 { get; set; }

        /// <summary>
        /// Calculated price of token1 of tick within this pool - constant.
        /// </summary>
        /// <value>Calculated price of token1 of tick within this pool - constant.</value>
        [DataMember(Name="price_1", EmitDefaultValue=true)]
        public string Price1 { get; set; }

        /// <summary>
        /// Lifetime volume of token0 with this tick in range.
        /// </summary>
        /// <value>Lifetime volume of token0 with this tick in range.</value>
        [DataMember(Name="volume_token_0", EmitDefaultValue=true)]
        public string VolumeToken0 { get; set; }

        /// <summary>
        /// Lifetime volume of token1 with this tick in range.
        /// </summary>
        /// <value>Lifetime volume of token1 with this tick in range.</value>
        [DataMember(Name="volume_token_1", EmitDefaultValue=true)]
        public string VolumeToken1 { get; set; }

        /// <summary>
        /// Lifetime volume in derived USD with this tick in range.
        /// </summary>
        /// <value>Lifetime volume in derived USD with this tick in range.</value>
        [DataMember(Name="volume_usd", EmitDefaultValue=true)]
        public string VolumeUsd { get; set; }

        /// <summary>
        /// Lifetime volume in untracked USD with this tick in range.
        /// </summary>
        /// <value>Lifetime volume in untracked USD with this tick in range.</value>
        [DataMember(Name="untracked_volume_usd", EmitDefaultValue=true)]
        public string UntrackedVolumeUsd { get; set; }

        /// <summary>
        /// Fees in USD.
        /// </summary>
        /// <value>Fees in USD.</value>
        [DataMember(Name="fees_usd", EmitDefaultValue=true)]
        public string FeesUsd { get; set; }

        /// <summary>
        /// All time collected fees in token0.
        /// </summary>
        /// <value>All time collected fees in token0.</value>
        [DataMember(Name="collected_fees_token_0", EmitDefaultValue=true)]
        public string CollectedFeesToken0 { get; set; }

        /// <summary>
        /// All time collected fees in token1.
        /// </summary>
        /// <value>All time collected fees in token1.</value>
        [DataMember(Name="collected_fees_token_1", EmitDefaultValue=true)]
        public string CollectedFeesToken1 { get; set; }

        /// <summary>
        /// All time collected fees in USD.
        /// </summary>
        /// <value>All time collected fees in USD.</value>
        [DataMember(Name="collected_fees_usd", EmitDefaultValue=true)]
        public string CollectedFeesUsd { get; set; }

        /// <summary>
        /// Created time.
        /// </summary>
        /// <value>Created time.</value>
        [DataMember(Name="created_at_timestamp", EmitDefaultValue=false)]
        public DateTime CreatedAtTimestamp { get; set; }

        /// <summary>
        /// Gets or Sets LiquidityProviderCount
        /// </summary>
        [DataMember(Name="liquidity_provider_count", EmitDefaultValue=false)]
        public NumericsBigInteger LiquidityProviderCount { get; set; }

        /// <summary>
        /// Gets or Sets FeeGrowthOutside0x128
        /// </summary>
        [DataMember(Name="fee_growth_outside_0x128", EmitDefaultValue=false)]
        public NumericsBigInteger FeeGrowthOutside0x128 { get; set; }

        /// <summary>
        /// Gets or Sets FeeGrowthOutside1x128
        /// </summary>
        [DataMember(Name="fee_growth_outside_1x128", EmitDefaultValue=false)]
        public NumericsBigInteger FeeGrowthOutside1x128 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UniswapV3TickDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  PoolAddress: ").Append(PoolAddress).Append("\n");
            sb.Append("  TickIdx: ").Append(TickIdx).Append("\n");
            sb.Append("  Pool: ").Append(Pool).Append("\n");
            sb.Append("  LiquidityGross: ").Append(LiquidityGross).Append("\n");
            sb.Append("  LiquidityNet: ").Append(LiquidityNet).Append("\n");
            sb.Append("  Price0: ").Append(Price0).Append("\n");
            sb.Append("  Price1: ").Append(Price1).Append("\n");
            sb.Append("  VolumeToken0: ").Append(VolumeToken0).Append("\n");
            sb.Append("  VolumeToken1: ").Append(VolumeToken1).Append("\n");
            sb.Append("  VolumeUsd: ").Append(VolumeUsd).Append("\n");
            sb.Append("  UntrackedVolumeUsd: ").Append(UntrackedVolumeUsd).Append("\n");
            sb.Append("  FeesUsd: ").Append(FeesUsd).Append("\n");
            sb.Append("  CollectedFeesToken0: ").Append(CollectedFeesToken0).Append("\n");
            sb.Append("  CollectedFeesToken1: ").Append(CollectedFeesToken1).Append("\n");
            sb.Append("  CollectedFeesUsd: ").Append(CollectedFeesUsd).Append("\n");
            sb.Append("  CreatedAtTimestamp: ").Append(CreatedAtTimestamp).Append("\n");
            sb.Append("  LiquidityProviderCount: ").Append(LiquidityProviderCount).Append("\n");
            sb.Append("  FeeGrowthOutside0x128: ").Append(FeeGrowthOutside0x128).Append("\n");
            sb.Append("  FeeGrowthOutside1x128: ").Append(FeeGrowthOutside1x128).Append("\n");
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
            return this.Equals(input as UniswapV3TickDTO);
        }

        /// <summary>
        /// Returns true if UniswapV3TickDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV3TickDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV3TickDTO input)
        {
            if (input == null)
                return false;

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
                    (this.BlockNumber != null &&
                    this.BlockNumber.Equals(input.BlockNumber))
                ) && 
                (
                    this.Vid == input.Vid ||
                    (this.Vid != null &&
                    this.Vid.Equals(input.Vid))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.PoolAddress == input.PoolAddress ||
                    (this.PoolAddress != null &&
                    this.PoolAddress.Equals(input.PoolAddress))
                ) && 
                (
                    this.TickIdx == input.TickIdx ||
                    (this.TickIdx != null &&
                    this.TickIdx.Equals(input.TickIdx))
                ) && 
                (
                    this.Pool == input.Pool ||
                    (this.Pool != null &&
                    this.Pool.Equals(input.Pool))
                ) && 
                (
                    this.LiquidityGross == input.LiquidityGross ||
                    (this.LiquidityGross != null &&
                    this.LiquidityGross.Equals(input.LiquidityGross))
                ) && 
                (
                    this.LiquidityNet == input.LiquidityNet ||
                    (this.LiquidityNet != null &&
                    this.LiquidityNet.Equals(input.LiquidityNet))
                ) && 
                (
                    this.Price0 == input.Price0 ||
                    (this.Price0 != null &&
                    this.Price0.Equals(input.Price0))
                ) && 
                (
                    this.Price1 == input.Price1 ||
                    (this.Price1 != null &&
                    this.Price1.Equals(input.Price1))
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
                    this.FeeGrowthOutside0x128 == input.FeeGrowthOutside0x128 ||
                    (this.FeeGrowthOutside0x128 != null &&
                    this.FeeGrowthOutside0x128.Equals(input.FeeGrowthOutside0x128))
                ) && 
                (
                    this.FeeGrowthOutside1x128 == input.FeeGrowthOutside1x128 ||
                    (this.FeeGrowthOutside1x128 != null &&
                    this.FeeGrowthOutside1x128.Equals(input.FeeGrowthOutside1x128))
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
                    hashCode = hashCode * 59 + this.EntryTime.GetHashCode();
                if (this.RecvTime != null)
                    hashCode = hashCode * 59 + this.RecvTime.GetHashCode();
                if (this.BlockNumber != null)
                    hashCode = hashCode * 59 + this.BlockNumber.GetHashCode();
                if (this.Vid != null)
                    hashCode = hashCode * 59 + this.Vid.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.PoolAddress != null)
                    hashCode = hashCode * 59 + this.PoolAddress.GetHashCode();
                if (this.TickIdx != null)
                    hashCode = hashCode * 59 + this.TickIdx.GetHashCode();
                if (this.Pool != null)
                    hashCode = hashCode * 59 + this.Pool.GetHashCode();
                if (this.LiquidityGross != null)
                    hashCode = hashCode * 59 + this.LiquidityGross.GetHashCode();
                if (this.LiquidityNet != null)
                    hashCode = hashCode * 59 + this.LiquidityNet.GetHashCode();
                if (this.Price0 != null)
                    hashCode = hashCode * 59 + this.Price0.GetHashCode();
                if (this.Price1 != null)
                    hashCode = hashCode * 59 + this.Price1.GetHashCode();
                if (this.VolumeToken0 != null)
                    hashCode = hashCode * 59 + this.VolumeToken0.GetHashCode();
                if (this.VolumeToken1 != null)
                    hashCode = hashCode * 59 + this.VolumeToken1.GetHashCode();
                if (this.VolumeUsd != null)
                    hashCode = hashCode * 59 + this.VolumeUsd.GetHashCode();
                if (this.UntrackedVolumeUsd != null)
                    hashCode = hashCode * 59 + this.UntrackedVolumeUsd.GetHashCode();
                if (this.FeesUsd != null)
                    hashCode = hashCode * 59 + this.FeesUsd.GetHashCode();
                if (this.CollectedFeesToken0 != null)
                    hashCode = hashCode * 59 + this.CollectedFeesToken0.GetHashCode();
                if (this.CollectedFeesToken1 != null)
                    hashCode = hashCode * 59 + this.CollectedFeesToken1.GetHashCode();
                if (this.CollectedFeesUsd != null)
                    hashCode = hashCode * 59 + this.CollectedFeesUsd.GetHashCode();
                if (this.CreatedAtTimestamp != null)
                    hashCode = hashCode * 59 + this.CreatedAtTimestamp.GetHashCode();
                if (this.LiquidityProviderCount != null)
                    hashCode = hashCode * 59 + this.LiquidityProviderCount.GetHashCode();
                if (this.FeeGrowthOutside0x128 != null)
                    hashCode = hashCode * 59 + this.FeeGrowthOutside0x128.GetHashCode();
                if (this.FeeGrowthOutside1x128 != null)
                    hashCode = hashCode * 59 + this.FeeGrowthOutside1x128.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
