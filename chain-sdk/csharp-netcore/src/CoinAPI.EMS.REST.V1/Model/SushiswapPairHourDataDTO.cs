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
    /// Tracks pair data across each hour.
    /// </summary>
    [DataContract(Name = "Sushiswap.PairHourDataDTO")]
    public partial class SushiswapPairHourDataDTO : IEquatable<SushiswapPairHourDataDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SushiswapPairHourDataDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">Identifier, format: &lt;pair id&gt;-&lt;hour start timestamp&gt;..</param>
        /// <param name="date">Hour start timestamp..</param>
        /// <param name="pair">Reference to pair..</param>
        /// <param name="reserve0">Reserve of token0 (updated during each transaction on pair)..</param>
        /// <param name="reserve1">Reserve of token1 (updated during each transaction on pair)..</param>
        /// <param name="reserveUsd">Reserve of token0 plus token1 stored as a derived USD amount..</param>
        /// <param name="volumeToken0">Total amount of token0 swapped throughout hour..</param>
        /// <param name="volumeToken1">Total amount of token1 swapped throughout hour..</param>
        /// <param name="volumeUsd">Total volume within pair throughout hour..</param>
        /// <param name="txCount">Amount of transactions on pair throughout hour..</param>
        /// <param name="vid">vid.</param>
        public SushiswapPairHourDataDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), int date = default(int), string pair = default(string), string reserve0 = default(string), string reserve1 = default(string), string reserveUsd = default(string), string volumeToken0 = default(string), string volumeToken1 = default(string), string volumeUsd = default(string), string txCount = default(string), long vid = default(long))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Date = date;
            this.Pair = pair;
            this.Reserve0 = reserve0;
            this.Reserve1 = reserve1;
            this.ReserveUsd = reserveUsd;
            this.VolumeToken0 = volumeToken0;
            this.VolumeToken1 = volumeToken1;
            this.VolumeUsd = volumeUsd;
            this.TxCount = txCount;
            this.Vid = vid;
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
        /// Identifier, format: &lt;pair id&gt;-&lt;hour start timestamp&gt;.
        /// </summary>
        /// <value>Identifier, format: &lt;pair id&gt;-&lt;hour start timestamp&gt;.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Hour start timestamp.
        /// </summary>
        /// <value>Hour start timestamp.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public int Date { get; set; }

        /// <summary>
        /// Reference to pair.
        /// </summary>
        /// <value>Reference to pair.</value>
        [DataMember(Name = "pair", EmitDefaultValue = true)]
        public string Pair { get; set; }

        /// <summary>
        /// Reserve of token0 (updated during each transaction on pair).
        /// </summary>
        /// <value>Reserve of token0 (updated during each transaction on pair).</value>
        [DataMember(Name = "reserve_0", EmitDefaultValue = true)]
        public string Reserve0 { get; set; }

        /// <summary>
        /// Reserve of token1 (updated during each transaction on pair).
        /// </summary>
        /// <value>Reserve of token1 (updated during each transaction on pair).</value>
        [DataMember(Name = "reserve_1", EmitDefaultValue = true)]
        public string Reserve1 { get; set; }

        /// <summary>
        /// Reserve of token0 plus token1 stored as a derived USD amount.
        /// </summary>
        /// <value>Reserve of token0 plus token1 stored as a derived USD amount.</value>
        [DataMember(Name = "reserve_usd", EmitDefaultValue = true)]
        public string ReserveUsd { get; set; }

        /// <summary>
        /// Total amount of token0 swapped throughout hour.
        /// </summary>
        /// <value>Total amount of token0 swapped throughout hour.</value>
        [DataMember(Name = "volume_token_0", EmitDefaultValue = true)]
        public string VolumeToken0 { get; set; }

        /// <summary>
        /// Total amount of token1 swapped throughout hour.
        /// </summary>
        /// <value>Total amount of token1 swapped throughout hour.</value>
        [DataMember(Name = "volume_token_1", EmitDefaultValue = true)]
        public string VolumeToken1 { get; set; }

        /// <summary>
        /// Total volume within pair throughout hour.
        /// </summary>
        /// <value>Total volume within pair throughout hour.</value>
        [DataMember(Name = "volume_usd", EmitDefaultValue = true)]
        public string VolumeUsd { get; set; }

        /// <summary>
        /// Amount of transactions on pair throughout hour.
        /// </summary>
        /// <value>Amount of transactions on pair throughout hour.</value>
        [DataMember(Name = "tx_count", EmitDefaultValue = true)]
        public string TxCount { get; set; }

        /// <summary>
        /// Gets or Sets Vid
        /// </summary>
        [DataMember(Name = "vid", EmitDefaultValue = false)]
        public long Vid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SushiswapPairHourDataDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Pair: ").Append(Pair).Append("\n");
            sb.Append("  Reserve0: ").Append(Reserve0).Append("\n");
            sb.Append("  Reserve1: ").Append(Reserve1).Append("\n");
            sb.Append("  ReserveUsd: ").Append(ReserveUsd).Append("\n");
            sb.Append("  VolumeToken0: ").Append(VolumeToken0).Append("\n");
            sb.Append("  VolumeToken1: ").Append(VolumeToken1).Append("\n");
            sb.Append("  VolumeUsd: ").Append(VolumeUsd).Append("\n");
            sb.Append("  TxCount: ").Append(TxCount).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
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
            return this.Equals(input as SushiswapPairHourDataDTO);
        }

        /// <summary>
        /// Returns true if SushiswapPairHourDataDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of SushiswapPairHourDataDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SushiswapPairHourDataDTO input)
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
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Date == input.Date ||
                    this.Date.Equals(input.Date)
                ) && 
                (
                    this.Pair == input.Pair ||
                    (this.Pair != null &&
                    this.Pair.Equals(input.Pair))
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
                    this.ReserveUsd == input.ReserveUsd ||
                    (this.ReserveUsd != null &&
                    this.ReserveUsd.Equals(input.ReserveUsd))
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
                    this.TxCount == input.TxCount ||
                    (this.TxCount != null &&
                    this.TxCount.Equals(input.TxCount))
                ) && 
                (
                    this.Vid == input.Vid ||
                    this.Vid.Equals(input.Vid)
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Date.GetHashCode();
                if (this.Pair != null)
                {
                    hashCode = (hashCode * 59) + this.Pair.GetHashCode();
                }
                if (this.Reserve0 != null)
                {
                    hashCode = (hashCode * 59) + this.Reserve0.GetHashCode();
                }
                if (this.Reserve1 != null)
                {
                    hashCode = (hashCode * 59) + this.Reserve1.GetHashCode();
                }
                if (this.ReserveUsd != null)
                {
                    hashCode = (hashCode * 59) + this.ReserveUsd.GetHashCode();
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
                if (this.TxCount != null)
                {
                    hashCode = (hashCode * 59) + this.TxCount.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Vid.GetHashCode();
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
