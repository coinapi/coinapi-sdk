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
    /// This entity is used to store data about a user&#39;s liquidity position over time. This information, along with information from the pair itself can be used to provide position sizes, token deposits, and more. It gets created and never updated.
    /// </summary>
    [DataContract(Name = "Sushiswap.LiquidityPositionSnapshotDTO")]
    public partial class SushiswapLiquidityPositionSnapshotDTO : IEquatable<SushiswapLiquidityPositionSnapshotDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SushiswapLiquidityPositionSnapshotDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">Identifier, format: (pair address)-(user address)-(timestamp).</param>
        /// <param name="liquidityPosition">Reference to LP identifier..</param>
        /// <param name="timestamp">Creation time..</param>
        /// <param name="block">Block in which snapshot has been created..</param>
        /// <param name="user">Reference to user..</param>
        /// <param name="pair">Reference to the pair liquidity is being provided on..</param>
        /// <param name="token0PriceUsd">Snapshot of token0 price in USD..</param>
        /// <param name="token1PriceUsd">Snapshot of token0 price in USD..</param>
        /// <param name="reserve0">Snapshot of pair token0 reserves..</param>
        /// <param name="reserve1">Snapshot of pair token1 reserves..</param>
        /// <param name="reserveUsd">Snapshot of pair reserves in USD..</param>
        /// <param name="liquidityTokenTotalSupply">Snapshot of pool token supply..</param>
        /// <param name="liquidityTokenBalance">Snapshot of users pool token balance..</param>
        /// <param name="vid">vid.</param>
        public SushiswapLiquidityPositionSnapshotDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), string liquidityPosition = default(string), int timestamp = default(int), int block = default(int), string user = default(string), string pair = default(string), string token0PriceUsd = default(string), string token1PriceUsd = default(string), string reserve0 = default(string), string reserve1 = default(string), string reserveUsd = default(string), string liquidityTokenTotalSupply = default(string), string liquidityTokenBalance = default(string), long vid = default(long))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.LiquidityPosition = liquidityPosition;
            this.Timestamp = timestamp;
            this.Block = block;
            this.User = user;
            this.Pair = pair;
            this.Token0PriceUsd = token0PriceUsd;
            this.Token1PriceUsd = token1PriceUsd;
            this.Reserve0 = reserve0;
            this.Reserve1 = reserve1;
            this.ReserveUsd = reserveUsd;
            this.LiquidityTokenTotalSupply = liquidityTokenTotalSupply;
            this.LiquidityTokenBalance = liquidityTokenBalance;
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
        /// Identifier, format: (pair address)-(user address)-(timestamp)
        /// </summary>
        /// <value>Identifier, format: (pair address)-(user address)-(timestamp)</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Reference to LP identifier.
        /// </summary>
        /// <value>Reference to LP identifier.</value>
        [DataMember(Name = "liquidity_position", EmitDefaultValue = true)]
        public string LiquidityPosition { get; set; }

        /// <summary>
        /// Creation time.
        /// </summary>
        /// <value>Creation time.</value>
        [DataMember(Name = "timestamp", EmitDefaultValue = false)]
        public int Timestamp { get; set; }

        /// <summary>
        /// Block in which snapshot has been created.
        /// </summary>
        /// <value>Block in which snapshot has been created.</value>
        [DataMember(Name = "block", EmitDefaultValue = false)]
        public int Block { get; set; }

        /// <summary>
        /// Reference to user.
        /// </summary>
        /// <value>Reference to user.</value>
        [DataMember(Name = "user", EmitDefaultValue = true)]
        public string User { get; set; }

        /// <summary>
        /// Reference to the pair liquidity is being provided on.
        /// </summary>
        /// <value>Reference to the pair liquidity is being provided on.</value>
        [DataMember(Name = "pair", EmitDefaultValue = true)]
        public string Pair { get; set; }

        /// <summary>
        /// Snapshot of token0 price in USD.
        /// </summary>
        /// <value>Snapshot of token0 price in USD.</value>
        [DataMember(Name = "token_0_price_usd", EmitDefaultValue = true)]
        public string Token0PriceUsd { get; set; }

        /// <summary>
        /// Snapshot of token0 price in USD.
        /// </summary>
        /// <value>Snapshot of token0 price in USD.</value>
        [DataMember(Name = "token_1_price_usd", EmitDefaultValue = true)]
        public string Token1PriceUsd { get; set; }

        /// <summary>
        /// Snapshot of pair token0 reserves.
        /// </summary>
        /// <value>Snapshot of pair token0 reserves.</value>
        [DataMember(Name = "reserve_0", EmitDefaultValue = true)]
        public string Reserve0 { get; set; }

        /// <summary>
        /// Snapshot of pair token1 reserves.
        /// </summary>
        /// <value>Snapshot of pair token1 reserves.</value>
        [DataMember(Name = "reserve_1", EmitDefaultValue = true)]
        public string Reserve1 { get; set; }

        /// <summary>
        /// Snapshot of pair reserves in USD.
        /// </summary>
        /// <value>Snapshot of pair reserves in USD.</value>
        [DataMember(Name = "reserve_usd", EmitDefaultValue = true)]
        public string ReserveUsd { get; set; }

        /// <summary>
        /// Snapshot of pool token supply.
        /// </summary>
        /// <value>Snapshot of pool token supply.</value>
        [DataMember(Name = "liquidity_token_total_supply", EmitDefaultValue = true)]
        public string LiquidityTokenTotalSupply { get; set; }

        /// <summary>
        /// Snapshot of users pool token balance.
        /// </summary>
        /// <value>Snapshot of users pool token balance.</value>
        [DataMember(Name = "liquidity_token_balance", EmitDefaultValue = true)]
        public string LiquidityTokenBalance { get; set; }

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
            sb.Append("class SushiswapLiquidityPositionSnapshotDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  LiquidityPosition: ").Append(LiquidityPosition).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Block: ").Append(Block).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  Pair: ").Append(Pair).Append("\n");
            sb.Append("  Token0PriceUsd: ").Append(Token0PriceUsd).Append("\n");
            sb.Append("  Token1PriceUsd: ").Append(Token1PriceUsd).Append("\n");
            sb.Append("  Reserve0: ").Append(Reserve0).Append("\n");
            sb.Append("  Reserve1: ").Append(Reserve1).Append("\n");
            sb.Append("  ReserveUsd: ").Append(ReserveUsd).Append("\n");
            sb.Append("  LiquidityTokenTotalSupply: ").Append(LiquidityTokenTotalSupply).Append("\n");
            sb.Append("  LiquidityTokenBalance: ").Append(LiquidityTokenBalance).Append("\n");
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
            return this.Equals(input as SushiswapLiquidityPositionSnapshotDTO);
        }

        /// <summary>
        /// Returns true if SushiswapLiquidityPositionSnapshotDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of SushiswapLiquidityPositionSnapshotDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SushiswapLiquidityPositionSnapshotDTO input)
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
                    this.LiquidityPosition == input.LiquidityPosition ||
                    (this.LiquidityPosition != null &&
                    this.LiquidityPosition.Equals(input.LiquidityPosition))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    this.Timestamp.Equals(input.Timestamp)
                ) && 
                (
                    this.Block == input.Block ||
                    this.Block.Equals(input.Block)
                ) && 
                (
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
                (
                    this.Pair == input.Pair ||
                    (this.Pair != null &&
                    this.Pair.Equals(input.Pair))
                ) && 
                (
                    this.Token0PriceUsd == input.Token0PriceUsd ||
                    (this.Token0PriceUsd != null &&
                    this.Token0PriceUsd.Equals(input.Token0PriceUsd))
                ) && 
                (
                    this.Token1PriceUsd == input.Token1PriceUsd ||
                    (this.Token1PriceUsd != null &&
                    this.Token1PriceUsd.Equals(input.Token1PriceUsd))
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
                    this.LiquidityTokenTotalSupply == input.LiquidityTokenTotalSupply ||
                    (this.LiquidityTokenTotalSupply != null &&
                    this.LiquidityTokenTotalSupply.Equals(input.LiquidityTokenTotalSupply))
                ) && 
                (
                    this.LiquidityTokenBalance == input.LiquidityTokenBalance ||
                    (this.LiquidityTokenBalance != null &&
                    this.LiquidityTokenBalance.Equals(input.LiquidityTokenBalance))
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
                if (this.LiquidityPosition != null)
                {
                    hashCode = (hashCode * 59) + this.LiquidityPosition.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Timestamp.GetHashCode();
                hashCode = (hashCode * 59) + this.Block.GetHashCode();
                if (this.User != null)
                {
                    hashCode = (hashCode * 59) + this.User.GetHashCode();
                }
                if (this.Pair != null)
                {
                    hashCode = (hashCode * 59) + this.Pair.GetHashCode();
                }
                if (this.Token0PriceUsd != null)
                {
                    hashCode = (hashCode * 59) + this.Token0PriceUsd.GetHashCode();
                }
                if (this.Token1PriceUsd != null)
                {
                    hashCode = (hashCode * 59) + this.Token1PriceUsd.GetHashCode();
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
                if (this.LiquidityTokenTotalSupply != null)
                {
                    hashCode = (hashCode * 59) + this.LiquidityTokenTotalSupply.GetHashCode();
                }
                if (this.LiquidityTokenBalance != null)
                {
                    hashCode = (hashCode * 59) + this.LiquidityTokenBalance.GetHashCode();
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
