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
    /// Swap are created for each token swap within a pair.
    /// </summary>
    [DataContract]
    public partial class UniswapV2SwapV2DTO :  IEquatable<UniswapV2SwapV2DTO>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets EvaluatedAggressor
        /// </summary>
        [DataMember(Name="evaluated_aggressor", EmitDefaultValue=false)]
        public TransactionsETradeAggressiveSide? EvaluatedAggressor { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV2SwapV2DTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="vid">vid.</param>
        /// <param name="id">Transaction hash plus index in Transaction swap array..</param>
        /// <param name="transaction">Reference to transaction swap was included in..</param>
        /// <param name="timestamp">Timestamp of swap, used for sorted lookups..</param>
        /// <param name="pair">Reference to pair..</param>
        /// <param name="sender">Address that initiated the swap..</param>
        /// <param name="from">The EOA (Externally Owned Account) that initiated the transaction..</param>
        /// <param name="amount0In">Amount of token0 sold..</param>
        /// <param name="amount1In">Amount of token1 sold..</param>
        /// <param name="amount0Out">Amount of token0 received..</param>
        /// <param name="amount1Out">Amount of token1 received..</param>
        /// <param name="to">Recipient of output tokens..</param>
        /// <param name="logIndex">logIndex.</param>
        /// <param name="amountUsd">Derived amount of tokens sold in USD..</param>
        /// <param name="evaluatedAggressor">evaluatedAggressor.</param>
        public UniswapV2SwapV2DTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), long vid = default(long), string id = default(string), string transaction = default(string), DateTime timestamp = default(DateTime), string pair = default(string), string sender = default(string), string from = default(string), string amount0In = default(string), string amount1In = default(string), string amount0Out = default(string), string amount1Out = default(string), string to = default(string), NumericsBigInteger logIndex = default(NumericsBigInteger), string amountUsd = default(string), TransactionsETradeAggressiveSide? evaluatedAggressor = default(TransactionsETradeAggressiveSide?))
        {
            this.Id = id;
            this.Transaction = transaction;
            this.Pair = pair;
            this.Sender = sender;
            this.From = from;
            this.Amount0In = amount0In;
            this.Amount1In = amount1In;
            this.Amount0Out = amount0Out;
            this.Amount1Out = amount1Out;
            this.To = to;
            this.AmountUsd = amountUsd;
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Vid = vid;
            this.Id = id;
            this.Transaction = transaction;
            this.Timestamp = timestamp;
            this.Pair = pair;
            this.Sender = sender;
            this.From = from;
            this.Amount0In = amount0In;
            this.Amount1In = amount1In;
            this.Amount0Out = amount0Out;
            this.Amount1Out = amount1Out;
            this.To = to;
            this.LogIndex = logIndex;
            this.AmountUsd = amountUsd;
            this.EvaluatedAggressor = evaluatedAggressor;
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
        /// Transaction hash plus index in Transaction swap array.
        /// </summary>
        /// <value>Transaction hash plus index in Transaction swap array.</value>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Reference to transaction swap was included in.
        /// </summary>
        /// <value>Reference to transaction swap was included in.</value>
        [DataMember(Name="transaction", EmitDefaultValue=true)]
        public string Transaction { get; set; }

        /// <summary>
        /// Timestamp of swap, used for sorted lookups.
        /// </summary>
        /// <value>Timestamp of swap, used for sorted lookups.</value>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public DateTime Timestamp { get; set; }

        /// <summary>
        /// Reference to pair.
        /// </summary>
        /// <value>Reference to pair.</value>
        [DataMember(Name="pair", EmitDefaultValue=true)]
        public string Pair { get; set; }

        /// <summary>
        /// Address that initiated the swap.
        /// </summary>
        /// <value>Address that initiated the swap.</value>
        [DataMember(Name="sender", EmitDefaultValue=true)]
        public string Sender { get; set; }

        /// <summary>
        /// The EOA (Externally Owned Account) that initiated the transaction.
        /// </summary>
        /// <value>The EOA (Externally Owned Account) that initiated the transaction.</value>
        [DataMember(Name="from", EmitDefaultValue=true)]
        public string From { get; set; }

        /// <summary>
        /// Amount of token0 sold.
        /// </summary>
        /// <value>Amount of token0 sold.</value>
        [DataMember(Name="amount_0_in", EmitDefaultValue=true)]
        public string Amount0In { get; set; }

        /// <summary>
        /// Amount of token1 sold.
        /// </summary>
        /// <value>Amount of token1 sold.</value>
        [DataMember(Name="amount_1_in", EmitDefaultValue=true)]
        public string Amount1In { get; set; }

        /// <summary>
        /// Amount of token0 received.
        /// </summary>
        /// <value>Amount of token0 received.</value>
        [DataMember(Name="amount_0_out", EmitDefaultValue=true)]
        public string Amount0Out { get; set; }

        /// <summary>
        /// Amount of token1 received.
        /// </summary>
        /// <value>Amount of token1 received.</value>
        [DataMember(Name="amount_1_out", EmitDefaultValue=true)]
        public string Amount1Out { get; set; }

        /// <summary>
        /// Recipient of output tokens.
        /// </summary>
        /// <value>Recipient of output tokens.</value>
        [DataMember(Name="to", EmitDefaultValue=true)]
        public string To { get; set; }

        /// <summary>
        /// Gets or Sets LogIndex
        /// </summary>
        [DataMember(Name="log_index", EmitDefaultValue=false)]
        public NumericsBigInteger LogIndex { get; set; }

        /// <summary>
        /// Derived amount of tokens sold in USD.
        /// </summary>
        /// <value>Derived amount of tokens sold in USD.</value>
        [DataMember(Name="amount_usd", EmitDefaultValue=true)]
        public string AmountUsd { get; set; }

        /// <summary>
        /// Gets or Sets EvaluatedPrice
        /// </summary>
        [DataMember(Name="evaluated_price", EmitDefaultValue=false)]
        public double EvaluatedPrice { get; private set; }

        /// <summary>
        /// Gets or Sets EvaluatedAmount
        /// </summary>
        [DataMember(Name="evaluated_amount", EmitDefaultValue=false)]
        public double EvaluatedAmount { get; private set; }


        /// <summary>
        /// Gets or Sets PoolId
        /// </summary>
        [DataMember(Name="pool_id", EmitDefaultValue=true)]
        public string PoolId { get; private set; }

        /// <summary>
        /// Gets or Sets TransactionId
        /// </summary>
        [DataMember(Name="transaction_id", EmitDefaultValue=true)]
        public string TransactionId { get; private set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UniswapV2SwapV2DTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Transaction: ").Append(Transaction).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Pair: ").Append(Pair).Append("\n");
            sb.Append("  Sender: ").Append(Sender).Append("\n");
            sb.Append("  From: ").Append(From).Append("\n");
            sb.Append("  Amount0In: ").Append(Amount0In).Append("\n");
            sb.Append("  Amount1In: ").Append(Amount1In).Append("\n");
            sb.Append("  Amount0Out: ").Append(Amount0Out).Append("\n");
            sb.Append("  Amount1Out: ").Append(Amount1Out).Append("\n");
            sb.Append("  To: ").Append(To).Append("\n");
            sb.Append("  LogIndex: ").Append(LogIndex).Append("\n");
            sb.Append("  AmountUsd: ").Append(AmountUsd).Append("\n");
            sb.Append("  EvaluatedPrice: ").Append(EvaluatedPrice).Append("\n");
            sb.Append("  EvaluatedAmount: ").Append(EvaluatedAmount).Append("\n");
            sb.Append("  EvaluatedAggressor: ").Append(EvaluatedAggressor).Append("\n");
            sb.Append("  PoolId: ").Append(PoolId).Append("\n");
            sb.Append("  TransactionId: ").Append(TransactionId).Append("\n");
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
            return this.Equals(input as UniswapV2SwapV2DTO);
        }

        /// <summary>
        /// Returns true if UniswapV2SwapV2DTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV2SwapV2DTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV2SwapV2DTO input)
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
                    this.Pair == input.Pair ||
                    (this.Pair != null &&
                    this.Pair.Equals(input.Pair))
                ) && 
                (
                    this.Sender == input.Sender ||
                    (this.Sender != null &&
                    this.Sender.Equals(input.Sender))
                ) && 
                (
                    this.From == input.From ||
                    (this.From != null &&
                    this.From.Equals(input.From))
                ) && 
                (
                    this.Amount0In == input.Amount0In ||
                    (this.Amount0In != null &&
                    this.Amount0In.Equals(input.Amount0In))
                ) && 
                (
                    this.Amount1In == input.Amount1In ||
                    (this.Amount1In != null &&
                    this.Amount1In.Equals(input.Amount1In))
                ) && 
                (
                    this.Amount0Out == input.Amount0Out ||
                    (this.Amount0Out != null &&
                    this.Amount0Out.Equals(input.Amount0Out))
                ) && 
                (
                    this.Amount1Out == input.Amount1Out ||
                    (this.Amount1Out != null &&
                    this.Amount1Out.Equals(input.Amount1Out))
                ) && 
                (
                    this.To == input.To ||
                    (this.To != null &&
                    this.To.Equals(input.To))
                ) && 
                (
                    this.LogIndex == input.LogIndex ||
                    (this.LogIndex != null &&
                    this.LogIndex.Equals(input.LogIndex))
                ) && 
                (
                    this.AmountUsd == input.AmountUsd ||
                    (this.AmountUsd != null &&
                    this.AmountUsd.Equals(input.AmountUsd))
                ) && 
                (
                    this.EvaluatedPrice == input.EvaluatedPrice ||
                    (this.EvaluatedPrice != null &&
                    this.EvaluatedPrice.Equals(input.EvaluatedPrice))
                ) && 
                (
                    this.EvaluatedAmount == input.EvaluatedAmount ||
                    (this.EvaluatedAmount != null &&
                    this.EvaluatedAmount.Equals(input.EvaluatedAmount))
                ) && 
                (
                    this.EvaluatedAggressor == input.EvaluatedAggressor ||
                    (this.EvaluatedAggressor != null &&
                    this.EvaluatedAggressor.Equals(input.EvaluatedAggressor))
                ) && 
                (
                    this.PoolId == input.PoolId ||
                    (this.PoolId != null &&
                    this.PoolId.Equals(input.PoolId))
                ) && 
                (
                    this.TransactionId == input.TransactionId ||
                    (this.TransactionId != null &&
                    this.TransactionId.Equals(input.TransactionId))
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
                if (this.Transaction != null)
                    hashCode = hashCode * 59 + this.Transaction.GetHashCode();
                if (this.Timestamp != null)
                    hashCode = hashCode * 59 + this.Timestamp.GetHashCode();
                if (this.Pair != null)
                    hashCode = hashCode * 59 + this.Pair.GetHashCode();
                if (this.Sender != null)
                    hashCode = hashCode * 59 + this.Sender.GetHashCode();
                if (this.From != null)
                    hashCode = hashCode * 59 + this.From.GetHashCode();
                if (this.Amount0In != null)
                    hashCode = hashCode * 59 + this.Amount0In.GetHashCode();
                if (this.Amount1In != null)
                    hashCode = hashCode * 59 + this.Amount1In.GetHashCode();
                if (this.Amount0Out != null)
                    hashCode = hashCode * 59 + this.Amount0Out.GetHashCode();
                if (this.Amount1Out != null)
                    hashCode = hashCode * 59 + this.Amount1Out.GetHashCode();
                if (this.To != null)
                    hashCode = hashCode * 59 + this.To.GetHashCode();
                if (this.LogIndex != null)
                    hashCode = hashCode * 59 + this.LogIndex.GetHashCode();
                if (this.AmountUsd != null)
                    hashCode = hashCode * 59 + this.AmountUsd.GetHashCode();
                if (this.EvaluatedPrice != null)
                    hashCode = hashCode * 59 + this.EvaluatedPrice.GetHashCode();
                if (this.EvaluatedAmount != null)
                    hashCode = hashCode * 59 + this.EvaluatedAmount.GetHashCode();
                if (this.EvaluatedAggressor != null)
                    hashCode = hashCode * 59 + this.EvaluatedAggressor.GetHashCode();
                if (this.PoolId != null)
                    hashCode = hashCode * 59 + this.PoolId.GetHashCode();
                if (this.TransactionId != null)
                    hashCode = hashCode * 59 + this.TransactionId.GetHashCode();
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
