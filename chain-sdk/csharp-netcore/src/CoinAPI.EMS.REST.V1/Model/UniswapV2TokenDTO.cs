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
    /// Stores aggregated information for a specific token across all pairs that token is included in.
    /// </summary>
    [DataContract(Name = "UniswapV2.TokenDTO")]
    public partial class UniswapV2TokenDTO : IEquatable<UniswapV2TokenDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV2TokenDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="vid">vid.</param>
        /// <param name="id">Token address..</param>
        /// <param name="symbol">Token symbol..</param>
        /// <param name="name">Token name..</param>
        /// <param name="decimals">Token decimals..</param>
        /// <param name="totalSupply">totalSupply.</param>
        /// <param name="tradeVolume">Amount of token traded all time across all pairs..</param>
        /// <param name="tradeVolumeUsd">Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold)..</param>
        /// <param name="untrackedVolumeUsd">Amount of token in USD traded all time across pairs (no minimum liquidity threshold)..</param>
        /// <param name="txCount">txCount.</param>
        /// <param name="totalLiquidity">Total amount of token provided as liquidity across all pairs..</param>
        /// <param name="derivedEth">ETH per token..</param>
        public UniswapV2TokenDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), long vid = default(long), string id = default(string), string symbol = default(string), string name = default(string), int decimals = default(int), NumericsBigInteger totalSupply = default(NumericsBigInteger), string tradeVolume = default(string), string tradeVolumeUsd = default(string), string untrackedVolumeUsd = default(string), NumericsBigInteger txCount = default(NumericsBigInteger), string totalLiquidity = default(string), string derivedEth = default(string))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Vid = vid;
            this.Id = id;
            this.Symbol = symbol;
            this.Name = name;
            this.Decimals = decimals;
            this.TotalSupply = totalSupply;
            this.TradeVolume = tradeVolume;
            this.TradeVolumeUsd = tradeVolumeUsd;
            this.UntrackedVolumeUsd = untrackedVolumeUsd;
            this.TxCount = txCount;
            this.TotalLiquidity = totalLiquidity;
            this.DerivedEth = derivedEth;
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
        /// Token address.
        /// </summary>
        /// <value>Token address.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Token symbol.
        /// </summary>
        /// <value>Token symbol.</value>
        [DataMember(Name = "symbol", EmitDefaultValue = true)]
        public string Symbol { get; set; }

        /// <summary>
        /// Token name.
        /// </summary>
        /// <value>Token name.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Token decimals.
        /// </summary>
        /// <value>Token decimals.</value>
        [DataMember(Name = "decimals", EmitDefaultValue = false)]
        public int Decimals { get; set; }

        /// <summary>
        /// Gets or Sets TotalSupply
        /// </summary>
        [DataMember(Name = "total_supply", EmitDefaultValue = false)]
        public NumericsBigInteger TotalSupply { get; set; }

        /// <summary>
        /// Amount of token traded all time across all pairs.
        /// </summary>
        /// <value>Amount of token traded all time across all pairs.</value>
        [DataMember(Name = "trade_volume", EmitDefaultValue = true)]
        public string TradeVolume { get; set; }

        /// <summary>
        /// Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).
        /// </summary>
        /// <value>Amount of token in USD traded all time across pairs (only for tokens with liquidity above minimum threshold).</value>
        [DataMember(Name = "trade_volume_usd", EmitDefaultValue = true)]
        public string TradeVolumeUsd { get; set; }

        /// <summary>
        /// Amount of token in USD traded all time across pairs (no minimum liquidity threshold).
        /// </summary>
        /// <value>Amount of token in USD traded all time across pairs (no minimum liquidity threshold).</value>
        [DataMember(Name = "untracked_volume_usd", EmitDefaultValue = true)]
        public string UntrackedVolumeUsd { get; set; }

        /// <summary>
        /// Gets or Sets TxCount
        /// </summary>
        [DataMember(Name = "tx_count", EmitDefaultValue = false)]
        public NumericsBigInteger TxCount { get; set; }

        /// <summary>
        /// Total amount of token provided as liquidity across all pairs.
        /// </summary>
        /// <value>Total amount of token provided as liquidity across all pairs.</value>
        [DataMember(Name = "total_liquidity", EmitDefaultValue = true)]
        public string TotalLiquidity { get; set; }

        /// <summary>
        /// ETH per token.
        /// </summary>
        /// <value>ETH per token.</value>
        [DataMember(Name = "derived_eth", EmitDefaultValue = true)]
        public string DerivedEth { get; set; }

        /// <summary>
        /// Gets or Sets TokenSymbol
        /// </summary>
        [DataMember(Name = "token_symbol", EmitDefaultValue = true)]
        public string TokenSymbol { get; private set; }

        /// <summary>
        /// Returns false as TokenSymbol should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeTokenSymbol()
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
            sb.Append("class UniswapV2TokenDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Decimals: ").Append(Decimals).Append("\n");
            sb.Append("  TotalSupply: ").Append(TotalSupply).Append("\n");
            sb.Append("  TradeVolume: ").Append(TradeVolume).Append("\n");
            sb.Append("  TradeVolumeUsd: ").Append(TradeVolumeUsd).Append("\n");
            sb.Append("  UntrackedVolumeUsd: ").Append(UntrackedVolumeUsd).Append("\n");
            sb.Append("  TxCount: ").Append(TxCount).Append("\n");
            sb.Append("  TotalLiquidity: ").Append(TotalLiquidity).Append("\n");
            sb.Append("  DerivedEth: ").Append(DerivedEth).Append("\n");
            sb.Append("  TokenSymbol: ").Append(TokenSymbol).Append("\n");
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
            return this.Equals(input as UniswapV2TokenDTO);
        }

        /// <summary>
        /// Returns true if UniswapV2TokenDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV2TokenDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV2TokenDTO input)
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
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Decimals == input.Decimals ||
                    this.Decimals.Equals(input.Decimals)
                ) && 
                (
                    this.TotalSupply == input.TotalSupply ||
                    (this.TotalSupply != null &&
                    this.TotalSupply.Equals(input.TotalSupply))
                ) && 
                (
                    this.TradeVolume == input.TradeVolume ||
                    (this.TradeVolume != null &&
                    this.TradeVolume.Equals(input.TradeVolume))
                ) && 
                (
                    this.TradeVolumeUsd == input.TradeVolumeUsd ||
                    (this.TradeVolumeUsd != null &&
                    this.TradeVolumeUsd.Equals(input.TradeVolumeUsd))
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
                    this.TotalLiquidity == input.TotalLiquidity ||
                    (this.TotalLiquidity != null &&
                    this.TotalLiquidity.Equals(input.TotalLiquidity))
                ) && 
                (
                    this.DerivedEth == input.DerivedEth ||
                    (this.DerivedEth != null &&
                    this.DerivedEth.Equals(input.DerivedEth))
                ) && 
                (
                    this.TokenSymbol == input.TokenSymbol ||
                    (this.TokenSymbol != null &&
                    this.TokenSymbol.Equals(input.TokenSymbol))
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
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Decimals.GetHashCode();
                if (this.TotalSupply != null)
                {
                    hashCode = (hashCode * 59) + this.TotalSupply.GetHashCode();
                }
                if (this.TradeVolume != null)
                {
                    hashCode = (hashCode * 59) + this.TradeVolume.GetHashCode();
                }
                if (this.TradeVolumeUsd != null)
                {
                    hashCode = (hashCode * 59) + this.TradeVolumeUsd.GetHashCode();
                }
                if (this.UntrackedVolumeUsd != null)
                {
                    hashCode = (hashCode * 59) + this.UntrackedVolumeUsd.GetHashCode();
                }
                if (this.TxCount != null)
                {
                    hashCode = (hashCode * 59) + this.TxCount.GetHashCode();
                }
                if (this.TotalLiquidity != null)
                {
                    hashCode = (hashCode * 59) + this.TotalLiquidity.GetHashCode();
                }
                if (this.DerivedEth != null)
                {
                    hashCode = (hashCode * 59) + this.DerivedEth.GetHashCode();
                }
                if (this.TokenSymbol != null)
                {
                    hashCode = (hashCode * 59) + this.TokenSymbol.GetHashCode();
                }
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