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
    /// Mint entities are created for every emitted Mint event on the Uniswap core contracts. The Mint entity stores key data about the event like token amounts, who sent the transaction, and more.
    /// </summary>
    [DataContract(Name = "UniswapV3.MintDTO")]
    public partial class UniswapV3MintDTO : IEquatable<UniswapV3MintDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV3MintDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">Transaction hash + &#39;#&#39; + index in mints Transaction array..</param>
        /// <param name="transaction">Which txn the mint was included in..</param>
        /// <param name="timestamp">Time of transaction..</param>
        /// <param name="pool">Pool address..</param>
        /// <param name="token0">Reference to token0 as stored in pool contract..</param>
        /// <param name="token1">Reference to token1 as stored in pool contract..</param>
        /// <param name="owner">Owner of position where liquidity minted to..</param>
        /// <param name="sender">The address that minted the liquidity..</param>
        /// <param name="origin">Transaction origin: the EOA (Externally Owned Account) that initiated the transaction..</param>
        /// <param name="amount">Amount of liquidity minted..</param>
        /// <param name="amount0">Amount of token 0 minted..</param>
        /// <param name="amount1">Amount of token 1 minted..</param>
        /// <param name="amountUsd">Derived amount based on available prices of tokens..</param>
        /// <param name="tickLower">Lower tick of the position..</param>
        /// <param name="tickUpper">Upper tick of the position..</param>
        /// <param name="logIndex">Order within the transaction..</param>
        /// <param name="vid">vid.</param>
        public UniswapV3MintDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), string transaction = default(string), string timestamp = default(string), string pool = default(string), string token0 = default(string), string token1 = default(string), string owner = default(string), string sender = default(string), string origin = default(string), string amount = default(string), string amount0 = default(string), string amount1 = default(string), string amountUsd = default(string), string tickLower = default(string), string tickUpper = default(string), string logIndex = default(string), long vid = default(long))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Transaction = transaction;
            this.Timestamp = timestamp;
            this.Pool = pool;
            this.Token0 = token0;
            this.Token1 = token1;
            this.Owner = owner;
            this.Sender = sender;
            this.Origin = origin;
            this.Amount = amount;
            this.Amount0 = amount0;
            this.Amount1 = amount1;
            this.AmountUsd = amountUsd;
            this.TickLower = tickLower;
            this.TickUpper = tickUpper;
            this.LogIndex = logIndex;
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
        /// Transaction hash + &#39;#&#39; + index in mints Transaction array.
        /// </summary>
        /// <value>Transaction hash + &#39;#&#39; + index in mints Transaction array.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Which txn the mint was included in.
        /// </summary>
        /// <value>Which txn the mint was included in.</value>
        [DataMember(Name = "transaction", EmitDefaultValue = true)]
        public string Transaction { get; set; }

        /// <summary>
        /// Time of transaction.
        /// </summary>
        /// <value>Time of transaction.</value>
        [DataMember(Name = "timestamp", EmitDefaultValue = true)]
        public string Timestamp { get; set; }

        /// <summary>
        /// Pool address.
        /// </summary>
        /// <value>Pool address.</value>
        [DataMember(Name = "pool", EmitDefaultValue = true)]
        public string Pool { get; set; }

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
        /// Owner of position where liquidity minted to.
        /// </summary>
        /// <value>Owner of position where liquidity minted to.</value>
        [DataMember(Name = "owner", EmitDefaultValue = true)]
        public string Owner { get; set; }

        /// <summary>
        /// The address that minted the liquidity.
        /// </summary>
        /// <value>The address that minted the liquidity.</value>
        [DataMember(Name = "sender", EmitDefaultValue = true)]
        public string Sender { get; set; }

        /// <summary>
        /// Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
        /// </summary>
        /// <value>Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.</value>
        [DataMember(Name = "origin", EmitDefaultValue = true)]
        public string Origin { get; set; }

        /// <summary>
        /// Amount of liquidity minted.
        /// </summary>
        /// <value>Amount of liquidity minted.</value>
        [DataMember(Name = "amount", EmitDefaultValue = true)]
        public string Amount { get; set; }

        /// <summary>
        /// Amount of token 0 minted.
        /// </summary>
        /// <value>Amount of token 0 minted.</value>
        [DataMember(Name = "amount_0", EmitDefaultValue = true)]
        public string Amount0 { get; set; }

        /// <summary>
        /// Amount of token 1 minted.
        /// </summary>
        /// <value>Amount of token 1 minted.</value>
        [DataMember(Name = "amount_1", EmitDefaultValue = true)]
        public string Amount1 { get; set; }

        /// <summary>
        /// Derived amount based on available prices of tokens.
        /// </summary>
        /// <value>Derived amount based on available prices of tokens.</value>
        [DataMember(Name = "amount_usd", EmitDefaultValue = true)]
        public string AmountUsd { get; set; }

        /// <summary>
        /// Lower tick of the position.
        /// </summary>
        /// <value>Lower tick of the position.</value>
        [DataMember(Name = "tick_lower", EmitDefaultValue = true)]
        public string TickLower { get; set; }

        /// <summary>
        /// Upper tick of the position.
        /// </summary>
        /// <value>Upper tick of the position.</value>
        [DataMember(Name = "tick_upper", EmitDefaultValue = true)]
        public string TickUpper { get; set; }

        /// <summary>
        /// Order within the transaction.
        /// </summary>
        /// <value>Order within the transaction.</value>
        [DataMember(Name = "log_index", EmitDefaultValue = true)]
        public string LogIndex { get; set; }

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
            sb.Append("class UniswapV3MintDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Transaction: ").Append(Transaction).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Pool: ").Append(Pool).Append("\n");
            sb.Append("  Token0: ").Append(Token0).Append("\n");
            sb.Append("  Token1: ").Append(Token1).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  Sender: ").Append(Sender).Append("\n");
            sb.Append("  Origin: ").Append(Origin).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Amount0: ").Append(Amount0).Append("\n");
            sb.Append("  Amount1: ").Append(Amount1).Append("\n");
            sb.Append("  AmountUsd: ").Append(AmountUsd).Append("\n");
            sb.Append("  TickLower: ").Append(TickLower).Append("\n");
            sb.Append("  TickUpper: ").Append(TickUpper).Append("\n");
            sb.Append("  LogIndex: ").Append(LogIndex).Append("\n");
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
            return this.Equals(input as UniswapV3MintDTO);
        }

        /// <summary>
        /// Returns true if UniswapV3MintDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV3MintDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV3MintDTO input)
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
                    this.Transaction == input.Transaction ||
                    (this.Transaction != null &&
                    this.Transaction.Equals(input.Transaction))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
                ) && 
                (
                    this.Pool == input.Pool ||
                    (this.Pool != null &&
                    this.Pool.Equals(input.Pool))
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
                    this.Owner == input.Owner ||
                    (this.Owner != null &&
                    this.Owner.Equals(input.Owner))
                ) && 
                (
                    this.Sender == input.Sender ||
                    (this.Sender != null &&
                    this.Sender.Equals(input.Sender))
                ) && 
                (
                    this.Origin == input.Origin ||
                    (this.Origin != null &&
                    this.Origin.Equals(input.Origin))
                ) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && 
                (
                    this.Amount0 == input.Amount0 ||
                    (this.Amount0 != null &&
                    this.Amount0.Equals(input.Amount0))
                ) && 
                (
                    this.Amount1 == input.Amount1 ||
                    (this.Amount1 != null &&
                    this.Amount1.Equals(input.Amount1))
                ) && 
                (
                    this.AmountUsd == input.AmountUsd ||
                    (this.AmountUsd != null &&
                    this.AmountUsd.Equals(input.AmountUsd))
                ) && 
                (
                    this.TickLower == input.TickLower ||
                    (this.TickLower != null &&
                    this.TickLower.Equals(input.TickLower))
                ) && 
                (
                    this.TickUpper == input.TickUpper ||
                    (this.TickUpper != null &&
                    this.TickUpper.Equals(input.TickUpper))
                ) && 
                (
                    this.LogIndex == input.LogIndex ||
                    (this.LogIndex != null &&
                    this.LogIndex.Equals(input.LogIndex))
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
                if (this.Transaction != null)
                {
                    hashCode = (hashCode * 59) + this.Transaction.GetHashCode();
                }
                if (this.Timestamp != null)
                {
                    hashCode = (hashCode * 59) + this.Timestamp.GetHashCode();
                }
                if (this.Pool != null)
                {
                    hashCode = (hashCode * 59) + this.Pool.GetHashCode();
                }
                if (this.Token0 != null)
                {
                    hashCode = (hashCode * 59) + this.Token0.GetHashCode();
                }
                if (this.Token1 != null)
                {
                    hashCode = (hashCode * 59) + this.Token1.GetHashCode();
                }
                if (this.Owner != null)
                {
                    hashCode = (hashCode * 59) + this.Owner.GetHashCode();
                }
                if (this.Sender != null)
                {
                    hashCode = (hashCode * 59) + this.Sender.GetHashCode();
                }
                if (this.Origin != null)
                {
                    hashCode = (hashCode * 59) + this.Origin.GetHashCode();
                }
                if (this.Amount != null)
                {
                    hashCode = (hashCode * 59) + this.Amount.GetHashCode();
                }
                if (this.Amount0 != null)
                {
                    hashCode = (hashCode * 59) + this.Amount0.GetHashCode();
                }
                if (this.Amount1 != null)
                {
                    hashCode = (hashCode * 59) + this.Amount1.GetHashCode();
                }
                if (this.AmountUsd != null)
                {
                    hashCode = (hashCode * 59) + this.AmountUsd.GetHashCode();
                }
                if (this.TickLower != null)
                {
                    hashCode = (hashCode * 59) + this.TickLower.GetHashCode();
                }
                if (this.TickUpper != null)
                {
                    hashCode = (hashCode * 59) + this.TickUpper.GetHashCode();
                }
                if (this.LogIndex != null)
                {
                    hashCode = (hashCode * 59) + this.LogIndex.GetHashCode();
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
