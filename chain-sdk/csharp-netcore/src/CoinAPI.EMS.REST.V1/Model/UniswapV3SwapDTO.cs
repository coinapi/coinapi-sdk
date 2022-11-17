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
    /// Swap are created for each token swap within a pair.
    /// </summary>
    [DataContract(Name = "UniswapV3.SwapDTO")]
    public partial class UniswapV3SwapDTO : IEquatable<UniswapV3SwapDTO>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets EvaluatedAggressor
        /// </summary>
        [DataMember(Name = "evaluated_aggressor", EmitDefaultValue = false)]
        public TransactionsETradeAggressiveSide? EvaluatedAggressor { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="UniswapV3SwapDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="vid">vid.</param>
        /// <param name="id">Identifier, format: transaction hash + \&quot;#\&quot; + index in swaps Transaction array..</param>
        /// <param name="transaction">Pointer to transaction..</param>
        /// <param name="timestamp">Timestamp of transaction..</param>
        /// <param name="pool">Pool swap occured within..</param>
        /// <param name="token0">Reference to token0 as stored in pair contract..</param>
        /// <param name="token1">Reference to token1 as stored in pair contract..</param>
        /// <param name="sender">Sender of the swap..</param>
        /// <param name="recipient">Recipient of the swap..</param>
        /// <param name="origin">Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.</param>
        /// <param name="amount0">Delta of token0 swapped..</param>
        /// <param name="amount1">Delta of token1 swapped..</param>
        /// <param name="amountUsd">Derived amount of tokens sold in USD..</param>
        /// <param name="sqrtPriceX96">sqrtPriceX96.</param>
        /// <param name="tick">tick.</param>
        /// <param name="logIndex">logIndex.</param>
        /// <param name="evaluatedAggressor">evaluatedAggressor.</param>
        public UniswapV3SwapDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), long vid = default(long), string id = default(string), string transaction = default(string), DateTime timestamp = default(DateTime), string pool = default(string), string token0 = default(string), string token1 = default(string), string sender = default(string), string recipient = default(string), string origin = default(string), string amount0 = default(string), string amount1 = default(string), string amountUsd = default(string), NumericsBigInteger sqrtPriceX96 = default(NumericsBigInteger), NumericsBigInteger tick = default(NumericsBigInteger), NumericsBigInteger logIndex = default(NumericsBigInteger), TransactionsETradeAggressiveSide? evaluatedAggressor = default(TransactionsETradeAggressiveSide?))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Vid = vid;
            this.Id = id;
            this.Transaction = transaction;
            this.Timestamp = timestamp;
            this.Pool = pool;
            this.Token0 = token0;
            this.Token1 = token1;
            this.Sender = sender;
            this.Recipient = recipient;
            this.Origin = origin;
            this.Amount0 = amount0;
            this.Amount1 = amount1;
            this.AmountUsd = amountUsd;
            this.SqrtPriceX96 = sqrtPriceX96;
            this.Tick = tick;
            this.LogIndex = logIndex;
            this.EvaluatedAggressor = evaluatedAggressor;
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
        /// Identifier, format: transaction hash + \&quot;#\&quot; + index in swaps Transaction array.
        /// </summary>
        /// <value>Identifier, format: transaction hash + \&quot;#\&quot; + index in swaps Transaction array.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Pointer to transaction.
        /// </summary>
        /// <value>Pointer to transaction.</value>
        [DataMember(Name = "transaction", EmitDefaultValue = true)]
        public string Transaction { get; set; }

        /// <summary>
        /// Timestamp of transaction.
        /// </summary>
        /// <value>Timestamp of transaction.</value>
        [DataMember(Name = "timestamp", EmitDefaultValue = false)]
        public DateTime Timestamp { get; set; }

        /// <summary>
        /// Pool swap occured within.
        /// </summary>
        /// <value>Pool swap occured within.</value>
        [DataMember(Name = "pool", EmitDefaultValue = true)]
        public string Pool { get; set; }

        /// <summary>
        /// Reference to token0 as stored in pair contract.
        /// </summary>
        /// <value>Reference to token0 as stored in pair contract.</value>
        [DataMember(Name = "token_0", EmitDefaultValue = true)]
        public string Token0 { get; set; }

        /// <summary>
        /// Reference to token1 as stored in pair contract.
        /// </summary>
        /// <value>Reference to token1 as stored in pair contract.</value>
        [DataMember(Name = "token_1", EmitDefaultValue = true)]
        public string Token1 { get; set; }

        /// <summary>
        /// Sender of the swap.
        /// </summary>
        /// <value>Sender of the swap.</value>
        [DataMember(Name = "sender", EmitDefaultValue = true)]
        public string Sender { get; set; }

        /// <summary>
        /// Recipient of the swap.
        /// </summary>
        /// <value>Recipient of the swap.</value>
        [DataMember(Name = "recipient", EmitDefaultValue = true)]
        public string Recipient { get; set; }

        /// <summary>
        /// Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
        /// </summary>
        /// <value>Transaction origin: the EOA (Externally Owned Account) that initiated the transaction</value>
        [DataMember(Name = "origin", EmitDefaultValue = true)]
        public string Origin { get; set; }

        /// <summary>
        /// Delta of token0 swapped.
        /// </summary>
        /// <value>Delta of token0 swapped.</value>
        [DataMember(Name = "amount_0", EmitDefaultValue = true)]
        public string Amount0 { get; set; }

        /// <summary>
        /// Delta of token1 swapped.
        /// </summary>
        /// <value>Delta of token1 swapped.</value>
        [DataMember(Name = "amount_1", EmitDefaultValue = true)]
        public string Amount1 { get; set; }

        /// <summary>
        /// Derived amount of tokens sold in USD.
        /// </summary>
        /// <value>Derived amount of tokens sold in USD.</value>
        [DataMember(Name = "amount_usd", EmitDefaultValue = true)]
        public string AmountUsd { get; set; }

        /// <summary>
        /// Gets or Sets SqrtPriceX96
        /// </summary>
        [DataMember(Name = "sqrt_price_x96", EmitDefaultValue = false)]
        public NumericsBigInteger SqrtPriceX96 { get; set; }

        /// <summary>
        /// Gets or Sets Tick
        /// </summary>
        [DataMember(Name = "tick", EmitDefaultValue = false)]
        public NumericsBigInteger Tick { get; set; }

        /// <summary>
        /// Gets or Sets LogIndex
        /// </summary>
        [DataMember(Name = "log_index", EmitDefaultValue = false)]
        public NumericsBigInteger LogIndex { get; set; }

        /// <summary>
        /// Gets or Sets EvaluatedPrice
        /// </summary>
        [DataMember(Name = "evaluated_price", EmitDefaultValue = false)]
        public double EvaluatedPrice { get; private set; }

        /// <summary>
        /// Returns false as EvaluatedPrice should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeEvaluatedPrice()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets EvaluatedAmount
        /// </summary>
        [DataMember(Name = "evaluated_amount", EmitDefaultValue = false)]
        public double EvaluatedAmount { get; private set; }

        /// <summary>
        /// Returns false as EvaluatedAmount should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeEvaluatedAmount()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets PoolId
        /// </summary>
        [DataMember(Name = "pool_id", EmitDefaultValue = true)]
        public string PoolId { get; private set; }

        /// <summary>
        /// Returns false as PoolId should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializePoolId()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets TransactionId
        /// </summary>
        [DataMember(Name = "transaction_id", EmitDefaultValue = true)]
        public string TransactionId { get; private set; }

        /// <summary>
        /// Returns false as TransactionId should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeTransactionId()
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
            sb.Append("class UniswapV3SwapDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Transaction: ").Append(Transaction).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Pool: ").Append(Pool).Append("\n");
            sb.Append("  Token0: ").Append(Token0).Append("\n");
            sb.Append("  Token1: ").Append(Token1).Append("\n");
            sb.Append("  Sender: ").Append(Sender).Append("\n");
            sb.Append("  Recipient: ").Append(Recipient).Append("\n");
            sb.Append("  Origin: ").Append(Origin).Append("\n");
            sb.Append("  Amount0: ").Append(Amount0).Append("\n");
            sb.Append("  Amount1: ").Append(Amount1).Append("\n");
            sb.Append("  AmountUsd: ").Append(AmountUsd).Append("\n");
            sb.Append("  SqrtPriceX96: ").Append(SqrtPriceX96).Append("\n");
            sb.Append("  Tick: ").Append(Tick).Append("\n");
            sb.Append("  LogIndex: ").Append(LogIndex).Append("\n");
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
            return this.Equals(input as UniswapV3SwapDTO);
        }

        /// <summary>
        /// Returns true if UniswapV3SwapDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of UniswapV3SwapDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniswapV3SwapDTO input)
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
                    this.Sender == input.Sender ||
                    (this.Sender != null &&
                    this.Sender.Equals(input.Sender))
                ) && 
                (
                    this.Recipient == input.Recipient ||
                    (this.Recipient != null &&
                    this.Recipient.Equals(input.Recipient))
                ) && 
                (
                    this.Origin == input.Origin ||
                    (this.Origin != null &&
                    this.Origin.Equals(input.Origin))
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
                    this.SqrtPriceX96 == input.SqrtPriceX96 ||
                    (this.SqrtPriceX96 != null &&
                    this.SqrtPriceX96.Equals(input.SqrtPriceX96))
                ) && 
                (
                    this.Tick == input.Tick ||
                    (this.Tick != null &&
                    this.Tick.Equals(input.Tick))
                ) && 
                (
                    this.LogIndex == input.LogIndex ||
                    (this.LogIndex != null &&
                    this.LogIndex.Equals(input.LogIndex))
                ) && 
                (
                    this.EvaluatedPrice == input.EvaluatedPrice ||
                    this.EvaluatedPrice.Equals(input.EvaluatedPrice)
                ) && 
                (
                    this.EvaluatedAmount == input.EvaluatedAmount ||
                    this.EvaluatedAmount.Equals(input.EvaluatedAmount)
                ) && 
                (
                    this.EvaluatedAggressor == input.EvaluatedAggressor ||
                    this.EvaluatedAggressor.Equals(input.EvaluatedAggressor)
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
                if (this.Sender != null)
                {
                    hashCode = (hashCode * 59) + this.Sender.GetHashCode();
                }
                if (this.Recipient != null)
                {
                    hashCode = (hashCode * 59) + this.Recipient.GetHashCode();
                }
                if (this.Origin != null)
                {
                    hashCode = (hashCode * 59) + this.Origin.GetHashCode();
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
                if (this.SqrtPriceX96 != null)
                {
                    hashCode = (hashCode * 59) + this.SqrtPriceX96.GetHashCode();
                }
                if (this.Tick != null)
                {
                    hashCode = (hashCode * 59) + this.Tick.GetHashCode();
                }
                if (this.LogIndex != null)
                {
                    hashCode = (hashCode * 59) + this.LogIndex.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.EvaluatedPrice.GetHashCode();
                hashCode = (hashCode * 59) + this.EvaluatedAmount.GetHashCode();
                hashCode = (hashCode * 59) + this.EvaluatedAggressor.GetHashCode();
                if (this.PoolId != null)
                {
                    hashCode = (hashCode * 59) + this.PoolId.GetHashCode();
                }
                if (this.TransactionId != null)
                {
                    hashCode = (hashCode * 59) + this.TransactionId.GetHashCode();
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
