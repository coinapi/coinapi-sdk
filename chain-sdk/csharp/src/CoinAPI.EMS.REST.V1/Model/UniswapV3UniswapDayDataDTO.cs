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
    /// Data accumulated and condensed into day stats for all of Uniswap.
    /// </summary>
    [DataContract]
    public partial class UniswapV3UniswapDayDataDTO :  IEquatable<UniswapV3UniswapDayDataDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV3UniswapDayDataDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="vid">vid.</param>
        /// <param name="id">Timestamp rounded to current day by dividing by 86400..</param>
        /// <param name="date">Timestamp rounded to current day by dividing by 86400..</param>
        /// <param name="volumeEth">Total volume across all pairs on this day, stored as a derived amount of ETH..</param>
        /// <param name="volumeUsd">Total volume across all pairs on this day, stored as a derived amount of USD..</param>
        /// <param name="volumeUsdUntracked">Total daily volume in Uniswap derived in terms of USD untracked..</param>
        /// <param name="feesUsd">Fees in USD.</param>
        /// <param name="txCount">txCount.</param>
        /// <param name="tvlUsd">Tvl in terms of USD..</param>
        public UniswapV3UniswapDayDataDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), long vid = default(long), string id = default(string), int date = default(int), string volumeEth = default(string), string volumeUsd = default(string), string volumeUsdUntracked = default(string), string feesUsd = default(string), NumericsBigInteger txCount = default(NumericsBigInteger), string tvlUsd = default(string))
        {
            this.Id = id;
            this.VolumeEth = volumeEth;
            this.VolumeUsd = volumeUsd;
            this.VolumeUsdUntracked = volumeUsdUntracked;
            this.FeesUsd = feesUsd;
            this.TvlUsd = tvlUsd;
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Vid = vid;
            this.Id = id;
            this.Date = date;
            this.VolumeEth = volumeEth;
            this.VolumeUsd = volumeUsd;
            this.VolumeUsdUntracked = volumeUsdUntracked;
            this.FeesUsd = feesUsd;
            this.TxCount = txCount;
            this.TvlUsd = tvlUsd;
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
        /// Timestamp rounded to current day by dividing by 86400.
        /// </summary>
        /// <value>Timestamp rounded to current day by dividing by 86400.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Timestamp rounded to current day by dividing by 86400.
        /// </summary>
        /// <value>Timestamp rounded to current day by dividing by 86400.</value>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public int Date { get; set; }

        /// <summary>
        /// Total volume across all pairs on this day, stored as a derived amount of ETH.
        /// </summary>
        /// <value>Total volume across all pairs on this day, stored as a derived amount of ETH.</value>
        [DataMember(Name="volume_eth", EmitDefaultValue=true)]
        public string VolumeEth { get; set; }

        /// <summary>
        /// Total volume across all pairs on this day, stored as a derived amount of USD.
        /// </summary>
        /// <value>Total volume across all pairs on this day, stored as a derived amount of USD.</value>
        [DataMember(Name="volume_usd", EmitDefaultValue=true)]
        public string VolumeUsd { get; set; }

        /// <summary>
        /// Total daily volume in Uniswap derived in terms of USD untracked.
        /// </summary>
        /// <value>Total daily volume in Uniswap derived in terms of USD untracked.</value>
        [DataMember(Name="volume_usd_untracked", EmitDefaultValue=true)]
        public string VolumeUsdUntracked { get; set; }

        /// <summary>
        /// Fees in USD
        /// </summary>
        /// <value>Fees in USD</value>
        [DataMember(Name="fees_usd", EmitDefaultValue=true)]
        public string FeesUsd { get; set; }

        /// <summary>
        /// Gets or Sets TxCount
        /// </summary>
        [DataMember(Name="tx_count", EmitDefaultValue=false)]
        public NumericsBigInteger TxCount { get; set; }

        /// <summary>
        /// Tvl in terms of USD.
        /// </summary>
        /// <value>Tvl in terms of USD.</value>
        [DataMember(Name="tvl_usd", EmitDefaultValue=true)]
        public string TvlUsd { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UniswapV3UniswapDayDataDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  VolumeEth: ").Append(VolumeEth).Append("\n");
            sb.Append("  VolumeUsd: ").Append(VolumeUsd).Append("\n");
            sb.Append("  VolumeUsdUntracked: ").Append(VolumeUsdUntracked).Append("\n");
            sb.Append("  FeesUsd: ").Append(FeesUsd).Append("\n");
            sb.Append("  TxCount: ").Append(TxCount).Append("\n");
            sb.Append("  TvlUsd: ").Append(TvlUsd).Append("\n");
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
            return this.Equals(input as UniswapV3UniswapDayDataDTO);
        }

        /// <summary>
        /// Returns true if UniswapV3UniswapDayDataDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV3UniswapDayDataDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV3UniswapDayDataDTO input)
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
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.VolumeEth == input.VolumeEth ||
                    (this.VolumeEth != null &&
                    this.VolumeEth.Equals(input.VolumeEth))
                ) && 
                (
                    this.VolumeUsd == input.VolumeUsd ||
                    (this.VolumeUsd != null &&
                    this.VolumeUsd.Equals(input.VolumeUsd))
                ) && 
                (
                    this.VolumeUsdUntracked == input.VolumeUsdUntracked ||
                    (this.VolumeUsdUntracked != null &&
                    this.VolumeUsdUntracked.Equals(input.VolumeUsdUntracked))
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
                    this.TvlUsd == input.TvlUsd ||
                    (this.TvlUsd != null &&
                    this.TvlUsd.Equals(input.TvlUsd))
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
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.VolumeEth != null)
                    hashCode = hashCode * 59 + this.VolumeEth.GetHashCode();
                if (this.VolumeUsd != null)
                    hashCode = hashCode * 59 + this.VolumeUsd.GetHashCode();
                if (this.VolumeUsdUntracked != null)
                    hashCode = hashCode * 59 + this.VolumeUsdUntracked.GetHashCode();
                if (this.FeesUsd != null)
                    hashCode = hashCode * 59 + this.FeesUsd.GetHashCode();
                if (this.TxCount != null)
                    hashCode = hashCode * 59 + this.TxCount.GetHashCode();
                if (this.TvlUsd != null)
                    hashCode = hashCode * 59 + this.TvlUsd.GetHashCode();
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
