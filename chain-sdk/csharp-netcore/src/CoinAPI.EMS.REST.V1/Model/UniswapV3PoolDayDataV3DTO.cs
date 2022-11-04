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
    /// Data accumulated and condensed into day stats for each pool.
    /// </summary>
    [DataContract(Name = "UniswapV3PoolDayDataV3DTO")]
    public partial class UniswapV3PoolDayDataV3DTO : IEquatable<UniswapV3PoolDayDataV3DTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV3PoolDayDataV3DTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">Identifier, format: &lt;pool address&gt;-&lt;day id&gt;..</param>
        /// <param name="date">Timestamp rounded to current day by dividing by 86400.</param>
        /// <param name="pool">Pointer to pool..</param>
        /// <param name="liquidity">In range liquidity at end of period..</param>
        /// <param name="sqrtPrice">Current price tracker at end of period..</param>
        /// <param name="token0Price">Price of token0 - derived from sqrtPrice..</param>
        /// <param name="token1Price">Price of token1 - derived from sqrtPrice..</param>
        /// <param name="tick">Current tick at end of period..</param>
        /// <param name="feeGrowthGlobal0x128">Tracker for global fee growth..</param>
        /// <param name="feeGrowthGlobal1x128">Tracker for global fee growth..</param>
        /// <param name="tvlUsd">Total value locked derived in USD at end of period..</param>
        /// <param name="volumeToken0">Volume in token0..</param>
        /// <param name="volumeToken1">Volume in token1..</param>
        /// <param name="volumeUsd">Volume in USD..</param>
        /// <param name="feesUsd">Fees in USD..</param>
        /// <param name="txCount">Number of transactions during period..</param>
        /// <param name="open">Opening price of token0..</param>
        /// <param name="high">High price of token0..</param>
        /// <param name="low">Low price of token0..</param>
        /// <param name="close">Close price of token0..</param>
        /// <param name="vid">vid.</param>
        public UniswapV3PoolDayDataV3DTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), int date = default(int), string pool = default(string), string liquidity = default(string), string sqrtPrice = default(string), string token0Price = default(string), string token1Price = default(string), string tick = default(string), string feeGrowthGlobal0x128 = default(string), string feeGrowthGlobal1x128 = default(string), string tvlUsd = default(string), string volumeToken0 = default(string), string volumeToken1 = default(string), string volumeUsd = default(string), string feesUsd = default(string), string txCount = default(string), string open = default(string), string high = default(string), string low = default(string), string close = default(string), long vid = default(long))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Date = date;
            this.Pool = pool;
            this.Liquidity = liquidity;
            this.SqrtPrice = sqrtPrice;
            this.Token0Price = token0Price;
            this.Token1Price = token1Price;
            this.Tick = tick;
            this.FeeGrowthGlobal0x128 = feeGrowthGlobal0x128;
            this.FeeGrowthGlobal1x128 = feeGrowthGlobal1x128;
            this.TvlUsd = tvlUsd;
            this.VolumeToken0 = volumeToken0;
            this.VolumeToken1 = volumeToken1;
            this.VolumeUsd = volumeUsd;
            this.FeesUsd = feesUsd;
            this.TxCount = txCount;
            this.Open = open;
            this.High = high;
            this.Low = low;
            this.Close = close;
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
        /// Identifier, format: &lt;pool address&gt;-&lt;day id&gt;.
        /// </summary>
        /// <value>Identifier, format: &lt;pool address&gt;-&lt;day id&gt;.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Timestamp rounded to current day by dividing by 86400
        /// </summary>
        /// <value>Timestamp rounded to current day by dividing by 86400</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public int Date { get; set; }

        /// <summary>
        /// Pointer to pool.
        /// </summary>
        /// <value>Pointer to pool.</value>
        [DataMember(Name = "pool", EmitDefaultValue = true)]
        public string Pool { get; set; }

        /// <summary>
        /// In range liquidity at end of period.
        /// </summary>
        /// <value>In range liquidity at end of period.</value>
        [DataMember(Name = "liquidity", EmitDefaultValue = true)]
        public string Liquidity { get; set; }

        /// <summary>
        /// Current price tracker at end of period.
        /// </summary>
        /// <value>Current price tracker at end of period.</value>
        [DataMember(Name = "sqrt_price", EmitDefaultValue = true)]
        public string SqrtPrice { get; set; }

        /// <summary>
        /// Price of token0 - derived from sqrtPrice.
        /// </summary>
        /// <value>Price of token0 - derived from sqrtPrice.</value>
        [DataMember(Name = "token_0_price", EmitDefaultValue = true)]
        public string Token0Price { get; set; }

        /// <summary>
        /// Price of token1 - derived from sqrtPrice.
        /// </summary>
        /// <value>Price of token1 - derived from sqrtPrice.</value>
        [DataMember(Name = "token_1_price", EmitDefaultValue = true)]
        public string Token1Price { get; set; }

        /// <summary>
        /// Current tick at end of period.
        /// </summary>
        /// <value>Current tick at end of period.</value>
        [DataMember(Name = "tick", EmitDefaultValue = true)]
        public string Tick { get; set; }

        /// <summary>
        /// Tracker for global fee growth.
        /// </summary>
        /// <value>Tracker for global fee growth.</value>
        [DataMember(Name = "fee_growth_global_0x128", EmitDefaultValue = true)]
        public string FeeGrowthGlobal0x128 { get; set; }

        /// <summary>
        /// Tracker for global fee growth.
        /// </summary>
        /// <value>Tracker for global fee growth.</value>
        [DataMember(Name = "fee_growth_global_1x128", EmitDefaultValue = true)]
        public string FeeGrowthGlobal1x128 { get; set; }

        /// <summary>
        /// Total value locked derived in USD at end of period.
        /// </summary>
        /// <value>Total value locked derived in USD at end of period.</value>
        [DataMember(Name = "tvl_usd", EmitDefaultValue = true)]
        public string TvlUsd { get; set; }

        /// <summary>
        /// Volume in token0.
        /// </summary>
        /// <value>Volume in token0.</value>
        [DataMember(Name = "volume_token_0", EmitDefaultValue = true)]
        public string VolumeToken0 { get; set; }

        /// <summary>
        /// Volume in token1.
        /// </summary>
        /// <value>Volume in token1.</value>
        [DataMember(Name = "volume_token_1", EmitDefaultValue = true)]
        public string VolumeToken1 { get; set; }

        /// <summary>
        /// Volume in USD.
        /// </summary>
        /// <value>Volume in USD.</value>
        [DataMember(Name = "volume_usd", EmitDefaultValue = true)]
        public string VolumeUsd { get; set; }

        /// <summary>
        /// Fees in USD.
        /// </summary>
        /// <value>Fees in USD.</value>
        [DataMember(Name = "fees_usd", EmitDefaultValue = true)]
        public string FeesUsd { get; set; }

        /// <summary>
        /// Number of transactions during period.
        /// </summary>
        /// <value>Number of transactions during period.</value>
        [DataMember(Name = "tx_count", EmitDefaultValue = true)]
        public string TxCount { get; set; }

        /// <summary>
        /// Opening price of token0.
        /// </summary>
        /// <value>Opening price of token0.</value>
        [DataMember(Name = "open", EmitDefaultValue = true)]
        public string Open { get; set; }

        /// <summary>
        /// High price of token0.
        /// </summary>
        /// <value>High price of token0.</value>
        [DataMember(Name = "high", EmitDefaultValue = true)]
        public string High { get; set; }

        /// <summary>
        /// Low price of token0.
        /// </summary>
        /// <value>Low price of token0.</value>
        [DataMember(Name = "low", EmitDefaultValue = true)]
        public string Low { get; set; }

        /// <summary>
        /// Close price of token0.
        /// </summary>
        /// <value>Close price of token0.</value>
        [DataMember(Name = "close", EmitDefaultValue = true)]
        public string Close { get; set; }

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
            sb.Append("class UniswapV3PoolDayDataV3DTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Pool: ").Append(Pool).Append("\n");
            sb.Append("  Liquidity: ").Append(Liquidity).Append("\n");
            sb.Append("  SqrtPrice: ").Append(SqrtPrice).Append("\n");
            sb.Append("  Token0Price: ").Append(Token0Price).Append("\n");
            sb.Append("  Token1Price: ").Append(Token1Price).Append("\n");
            sb.Append("  Tick: ").Append(Tick).Append("\n");
            sb.Append("  FeeGrowthGlobal0x128: ").Append(FeeGrowthGlobal0x128).Append("\n");
            sb.Append("  FeeGrowthGlobal1x128: ").Append(FeeGrowthGlobal1x128).Append("\n");
            sb.Append("  TvlUsd: ").Append(TvlUsd).Append("\n");
            sb.Append("  VolumeToken0: ").Append(VolumeToken0).Append("\n");
            sb.Append("  VolumeToken1: ").Append(VolumeToken1).Append("\n");
            sb.Append("  VolumeUsd: ").Append(VolumeUsd).Append("\n");
            sb.Append("  FeesUsd: ").Append(FeesUsd).Append("\n");
            sb.Append("  TxCount: ").Append(TxCount).Append("\n");
            sb.Append("  Open: ").Append(Open).Append("\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
            sb.Append("  Close: ").Append(Close).Append("\n");
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
            return this.Equals(input as UniswapV3PoolDayDataV3DTO);
        }

        /// <summary>
        /// Returns true if UniswapV3PoolDayDataV3DTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV3PoolDayDataV3DTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV3PoolDayDataV3DTO input)
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
                    this.Pool == input.Pool ||
                    (this.Pool != null &&
                    this.Pool.Equals(input.Pool))
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
                    this.TvlUsd == input.TvlUsd ||
                    (this.TvlUsd != null &&
                    this.TvlUsd.Equals(input.TvlUsd))
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
                    this.Open == input.Open ||
                    (this.Open != null &&
                    this.Open.Equals(input.Open))
                ) && 
                (
                    this.High == input.High ||
                    (this.High != null &&
                    this.High.Equals(input.High))
                ) && 
                (
                    this.Low == input.Low ||
                    (this.Low != null &&
                    this.Low.Equals(input.Low))
                ) && 
                (
                    this.Close == input.Close ||
                    (this.Close != null &&
                    this.Close.Equals(input.Close))
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
                if (this.Pool != null)
                {
                    hashCode = (hashCode * 59) + this.Pool.GetHashCode();
                }
                if (this.Liquidity != null)
                {
                    hashCode = (hashCode * 59) + this.Liquidity.GetHashCode();
                }
                if (this.SqrtPrice != null)
                {
                    hashCode = (hashCode * 59) + this.SqrtPrice.GetHashCode();
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
                if (this.FeeGrowthGlobal0x128 != null)
                {
                    hashCode = (hashCode * 59) + this.FeeGrowthGlobal0x128.GetHashCode();
                }
                if (this.FeeGrowthGlobal1x128 != null)
                {
                    hashCode = (hashCode * 59) + this.FeeGrowthGlobal1x128.GetHashCode();
                }
                if (this.TvlUsd != null)
                {
                    hashCode = (hashCode * 59) + this.TvlUsd.GetHashCode();
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
                if (this.FeesUsd != null)
                {
                    hashCode = (hashCode * 59) + this.FeesUsd.GetHashCode();
                }
                if (this.TxCount != null)
                {
                    hashCode = (hashCode * 59) + this.TxCount.GetHashCode();
                }
                if (this.Open != null)
                {
                    hashCode = (hashCode * 59) + this.Open.GetHashCode();
                }
                if (this.High != null)
                {
                    hashCode = (hashCode * 59) + this.High.GetHashCode();
                }
                if (this.Low != null)
                {
                    hashCode = (hashCode * 59) + this.Low.GetHashCode();
                }
                if (this.Close != null)
                {
                    hashCode = (hashCode * 59) + this.Close.GetHashCode();
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
