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
    /// CurveExchangeDTO
    /// </summary>
    [DataContract]
    public partial class CurveExchangeDTO :  IEquatable<CurveExchangeDTO>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets EvaluatedAggressor
        /// </summary>
        [DataMember(Name="evaluated_aggressor", EmitDefaultValue=false)]
        public TransactionsETradeAggressiveSide? EvaluatedAggressor { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CurveExchangeDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">id.</param>
        /// <param name="pool">pool.</param>
        /// <param name="buyer">buyer.</param>
        /// <param name="receiver">receiver.</param>
        /// <param name="tokenSold">tokenSold.</param>
        /// <param name="tokenBought">tokenBought.</param>
        /// <param name="amountSold">amountSold.</param>
        /// <param name="amountBought">amountBought.</param>
        /// <param name="block">block.</param>
        /// <param name="timestamp">timestamp.</param>
        /// <param name="transaction">transaction.</param>
        /// <param name="vid">vid.</param>
        /// <param name="evaluatedAggressor">evaluatedAggressor.</param>
        public CurveExchangeDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), string pool = default(string), string buyer = default(string), string receiver = default(string), string tokenSold = default(string), string tokenBought = default(string), string amountSold = default(string), string amountBought = default(string), string block = default(string), string timestamp = default(string), string transaction = default(string), long vid = default(long), TransactionsETradeAggressiveSide? evaluatedAggressor = default(TransactionsETradeAggressiveSide?))
        {
            this.Id = id;
            this.Pool = pool;
            this.Buyer = buyer;
            this.Receiver = receiver;
            this.TokenSold = tokenSold;
            this.TokenBought = tokenBought;
            this.AmountSold = amountSold;
            this.AmountBought = amountBought;
            this.Block = block;
            this.Timestamp = timestamp;
            this.Transaction = transaction;
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Pool = pool;
            this.Buyer = buyer;
            this.Receiver = receiver;
            this.TokenSold = tokenSold;
            this.TokenBought = tokenBought;
            this.AmountSold = amountSold;
            this.AmountBought = amountBought;
            this.Block = block;
            this.Timestamp = timestamp;
            this.Transaction = transaction;
            this.Vid = vid;
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
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Pool
        /// </summary>
        [DataMember(Name="pool", EmitDefaultValue=true)]
        public string Pool { get; set; }

        /// <summary>
        /// Gets or Sets Buyer
        /// </summary>
        [DataMember(Name="buyer", EmitDefaultValue=true)]
        public string Buyer { get; set; }

        /// <summary>
        /// Gets or Sets Receiver
        /// </summary>
        [DataMember(Name="receiver", EmitDefaultValue=true)]
        public string Receiver { get; set; }

        /// <summary>
        /// Gets or Sets TokenSold
        /// </summary>
        [DataMember(Name="token_sold", EmitDefaultValue=true)]
        public string TokenSold { get; set; }

        /// <summary>
        /// Gets or Sets TokenBought
        /// </summary>
        [DataMember(Name="token_bought", EmitDefaultValue=true)]
        public string TokenBought { get; set; }

        /// <summary>
        /// Gets or Sets AmountSold
        /// </summary>
        [DataMember(Name="amount_sold", EmitDefaultValue=true)]
        public string AmountSold { get; set; }

        /// <summary>
        /// Gets or Sets AmountBought
        /// </summary>
        [DataMember(Name="amount_bought", EmitDefaultValue=true)]
        public string AmountBought { get; set; }

        /// <summary>
        /// Gets or Sets Block
        /// </summary>
        [DataMember(Name="block", EmitDefaultValue=true)]
        public string Block { get; set; }

        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name="timestamp", EmitDefaultValue=true)]
        public string Timestamp { get; set; }

        /// <summary>
        /// Gets or Sets Transaction
        /// </summary>
        [DataMember(Name="transaction", EmitDefaultValue=true)]
        public string Transaction { get; set; }

        /// <summary>
        /// Gets or Sets Vid
        /// </summary>
        [DataMember(Name="vid", EmitDefaultValue=false)]
        public long Vid { get; set; }

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
            sb.Append("class CurveExchangeDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Pool: ").Append(Pool).Append("\n");
            sb.Append("  Buyer: ").Append(Buyer).Append("\n");
            sb.Append("  Receiver: ").Append(Receiver).Append("\n");
            sb.Append("  TokenSold: ").Append(TokenSold).Append("\n");
            sb.Append("  TokenBought: ").Append(TokenBought).Append("\n");
            sb.Append("  AmountSold: ").Append(AmountSold).Append("\n");
            sb.Append("  AmountBought: ").Append(AmountBought).Append("\n");
            sb.Append("  Block: ").Append(Block).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Transaction: ").Append(Transaction).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
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
            return this.Equals(input as CurveExchangeDTO);
        }

        /// <summary>
        /// Returns true if CurveExchangeDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of CurveExchangeDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CurveExchangeDTO input)
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
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Pool == input.Pool ||
                    (this.Pool != null &&
                    this.Pool.Equals(input.Pool))
                ) && 
                (
                    this.Buyer == input.Buyer ||
                    (this.Buyer != null &&
                    this.Buyer.Equals(input.Buyer))
                ) && 
                (
                    this.Receiver == input.Receiver ||
                    (this.Receiver != null &&
                    this.Receiver.Equals(input.Receiver))
                ) && 
                (
                    this.TokenSold == input.TokenSold ||
                    (this.TokenSold != null &&
                    this.TokenSold.Equals(input.TokenSold))
                ) && 
                (
                    this.TokenBought == input.TokenBought ||
                    (this.TokenBought != null &&
                    this.TokenBought.Equals(input.TokenBought))
                ) && 
                (
                    this.AmountSold == input.AmountSold ||
                    (this.AmountSold != null &&
                    this.AmountSold.Equals(input.AmountSold))
                ) && 
                (
                    this.AmountBought == input.AmountBought ||
                    (this.AmountBought != null &&
                    this.AmountBought.Equals(input.AmountBought))
                ) && 
                (
                    this.Block == input.Block ||
                    (this.Block != null &&
                    this.Block.Equals(input.Block))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
                ) && 
                (
                    this.Transaction == input.Transaction ||
                    (this.Transaction != null &&
                    this.Transaction.Equals(input.Transaction))
                ) && 
                (
                    this.Vid == input.Vid ||
                    (this.Vid != null &&
                    this.Vid.Equals(input.Vid))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Pool != null)
                    hashCode = hashCode * 59 + this.Pool.GetHashCode();
                if (this.Buyer != null)
                    hashCode = hashCode * 59 + this.Buyer.GetHashCode();
                if (this.Receiver != null)
                    hashCode = hashCode * 59 + this.Receiver.GetHashCode();
                if (this.TokenSold != null)
                    hashCode = hashCode * 59 + this.TokenSold.GetHashCode();
                if (this.TokenBought != null)
                    hashCode = hashCode * 59 + this.TokenBought.GetHashCode();
                if (this.AmountSold != null)
                    hashCode = hashCode * 59 + this.AmountSold.GetHashCode();
                if (this.AmountBought != null)
                    hashCode = hashCode * 59 + this.AmountBought.GetHashCode();
                if (this.Block != null)
                    hashCode = hashCode * 59 + this.Block.GetHashCode();
                if (this.Timestamp != null)
                    hashCode = hashCode * 59 + this.Timestamp.GetHashCode();
                if (this.Transaction != null)
                    hashCode = hashCode * 59 + this.Transaction.GetHashCode();
                if (this.Vid != null)
                    hashCode = hashCode * 59 + this.Vid.GetHashCode();
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
