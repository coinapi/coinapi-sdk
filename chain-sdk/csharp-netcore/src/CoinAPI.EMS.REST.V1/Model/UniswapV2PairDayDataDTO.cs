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
    /// Tracks pair data across each day.
    /// </summary>
    [DataContract(Name = "UniswapV2.PairDayDataDTO")]
    public partial class UniswapV2PairDayDataDTO : IEquatable<UniswapV2PairDayDataDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV2PairDayDataDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">id.</param>
        /// <param name="date">Unix timestamp for start of day..</param>
        /// <param name="pairAddress">Address for pair contract..</param>
        /// <param name="token0">Reference to token0..</param>
        /// <param name="token1">Reference to token1..</param>
        /// <param name="reserve0">Reserve of token0 (updated during each transaction on pair)..</param>
        /// <param name="reserve1">Reserve of token1 (updated during each transaction on pair)..</param>
        /// <param name="totalSupply">Total supply of liquidity token distributed to LPs..</param>
        /// <param name="reserveUsd">Reserve of token0 plus token1 stored as a derived USD amount..</param>
        /// <param name="dailyVolumeToken0">Total amount of token0 swapped throughout day..</param>
        /// <param name="dailyVolumeToken1">Total amount of token1 swapped throughout day..</param>
        /// <param name="dailyVolumeUsd">Total volume within pair throughout day..</param>
        /// <param name="dailyTxns">Amount of transactions on pair throughout day..</param>
        /// <param name="vid">vid.</param>
        public UniswapV2PairDayDataDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), int date = default(int), string pairAddress = default(string), string token0 = default(string), string token1 = default(string), string reserve0 = default(string), string reserve1 = default(string), string totalSupply = default(string), string reserveUsd = default(string), string dailyVolumeToken0 = default(string), string dailyVolumeToken1 = default(string), string dailyVolumeUsd = default(string), string dailyTxns = default(string), long vid = default(long))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Date = date;
            this.PairAddress = pairAddress;
            this.Token0 = token0;
            this.Token1 = token1;
            this.Reserve0 = reserve0;
            this.Reserve1 = reserve1;
            this.TotalSupply = totalSupply;
            this.ReserveUsd = reserveUsd;
            this.DailyVolumeToken0 = dailyVolumeToken0;
            this.DailyVolumeToken1 = dailyVolumeToken1;
            this.DailyVolumeUsd = dailyVolumeUsd;
            this.DailyTxns = dailyTxns;
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
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Unix timestamp for start of day.
        /// </summary>
        /// <value>Unix timestamp for start of day.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public int Date { get; set; }

        /// <summary>
        /// Address for pair contract.
        /// </summary>
        /// <value>Address for pair contract.</value>
        [DataMember(Name = "pair_address", EmitDefaultValue = true)]
        public string PairAddress { get; set; }

        /// <summary>
        /// Reference to token0.
        /// </summary>
        /// <value>Reference to token0.</value>
        [DataMember(Name = "token_0", EmitDefaultValue = true)]
        public string Token0 { get; set; }

        /// <summary>
        /// Reference to token1.
        /// </summary>
        /// <value>Reference to token1.</value>
        [DataMember(Name = "token_1", EmitDefaultValue = true)]
        public string Token1 { get; set; }

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
        /// Total supply of liquidity token distributed to LPs.
        /// </summary>
        /// <value>Total supply of liquidity token distributed to LPs.</value>
        [DataMember(Name = "total_supply", EmitDefaultValue = true)]
        public string TotalSupply { get; set; }

        /// <summary>
        /// Reserve of token0 plus token1 stored as a derived USD amount.
        /// </summary>
        /// <value>Reserve of token0 plus token1 stored as a derived USD amount.</value>
        [DataMember(Name = "reserve_usd", EmitDefaultValue = true)]
        public string ReserveUsd { get; set; }

        /// <summary>
        /// Total amount of token0 swapped throughout day.
        /// </summary>
        /// <value>Total amount of token0 swapped throughout day.</value>
        [DataMember(Name = "daily_volume_token_0", EmitDefaultValue = true)]
        public string DailyVolumeToken0 { get; set; }

        /// <summary>
        /// Total amount of token1 swapped throughout day.
        /// </summary>
        /// <value>Total amount of token1 swapped throughout day.</value>
        [DataMember(Name = "daily_volume_token_1", EmitDefaultValue = true)]
        public string DailyVolumeToken1 { get; set; }

        /// <summary>
        /// Total volume within pair throughout day.
        /// </summary>
        /// <value>Total volume within pair throughout day.</value>
        [DataMember(Name = "daily_volume_usd", EmitDefaultValue = true)]
        public string DailyVolumeUsd { get; set; }

        /// <summary>
        /// Amount of transactions on pair throughout day.
        /// </summary>
        /// <value>Amount of transactions on pair throughout day.</value>
        [DataMember(Name = "daily_txns", EmitDefaultValue = true)]
        public string DailyTxns { get; set; }

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
            sb.Append("class UniswapV2PairDayDataDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  PairAddress: ").Append(PairAddress).Append("\n");
            sb.Append("  Token0: ").Append(Token0).Append("\n");
            sb.Append("  Token1: ").Append(Token1).Append("\n");
            sb.Append("  Reserve0: ").Append(Reserve0).Append("\n");
            sb.Append("  Reserve1: ").Append(Reserve1).Append("\n");
            sb.Append("  TotalSupply: ").Append(TotalSupply).Append("\n");
            sb.Append("  ReserveUsd: ").Append(ReserveUsd).Append("\n");
            sb.Append("  DailyVolumeToken0: ").Append(DailyVolumeToken0).Append("\n");
            sb.Append("  DailyVolumeToken1: ").Append(DailyVolumeToken1).Append("\n");
            sb.Append("  DailyVolumeUsd: ").Append(DailyVolumeUsd).Append("\n");
            sb.Append("  DailyTxns: ").Append(DailyTxns).Append("\n");
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
            return this.Equals(input as UniswapV2PairDayDataDTO);
        }

        /// <summary>
        /// Returns true if UniswapV2PairDayDataDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV2PairDayDataDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV2PairDayDataDTO input)
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
                    this.PairAddress == input.PairAddress ||
                    (this.PairAddress != null &&
                    this.PairAddress.Equals(input.PairAddress))
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
                    this.ReserveUsd == input.ReserveUsd ||
                    (this.ReserveUsd != null &&
                    this.ReserveUsd.Equals(input.ReserveUsd))
                ) && 
                (
                    this.DailyVolumeToken0 == input.DailyVolumeToken0 ||
                    (this.DailyVolumeToken0 != null &&
                    this.DailyVolumeToken0.Equals(input.DailyVolumeToken0))
                ) && 
                (
                    this.DailyVolumeToken1 == input.DailyVolumeToken1 ||
                    (this.DailyVolumeToken1 != null &&
                    this.DailyVolumeToken1.Equals(input.DailyVolumeToken1))
                ) && 
                (
                    this.DailyVolumeUsd == input.DailyVolumeUsd ||
                    (this.DailyVolumeUsd != null &&
                    this.DailyVolumeUsd.Equals(input.DailyVolumeUsd))
                ) && 
                (
                    this.DailyTxns == input.DailyTxns ||
                    (this.DailyTxns != null &&
                    this.DailyTxns.Equals(input.DailyTxns))
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
                if (this.PairAddress != null)
                {
                    hashCode = (hashCode * 59) + this.PairAddress.GetHashCode();
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
                if (this.ReserveUsd != null)
                {
                    hashCode = (hashCode * 59) + this.ReserveUsd.GetHashCode();
                }
                if (this.DailyVolumeToken0 != null)
                {
                    hashCode = (hashCode * 59) + this.DailyVolumeToken0.GetHashCode();
                }
                if (this.DailyVolumeToken1 != null)
                {
                    hashCode = (hashCode * 59) + this.DailyVolumeToken1.GetHashCode();
                }
                if (this.DailyVolumeUsd != null)
                {
                    hashCode = (hashCode * 59) + this.DailyVolumeUsd.GetHashCode();
                }
                if (this.DailyTxns != null)
                {
                    hashCode = (hashCode * 59) + this.DailyTxns.GetHashCode();
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
