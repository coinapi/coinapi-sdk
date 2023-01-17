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
    /// Trade entity.
    /// </summary>
    [DataContract(Name = "Cow.TradeDTO")]
    public partial class CowTradeDTO : IEquatable<CowTradeDTO>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets EvaluatedAggressor
        /// </summary>
        [DataMember(Name = "evaluated_aggressor", EmitDefaultValue = false)]
        public TransactionsETradeAggressiveSide? EvaluatedAggressor { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CowTradeDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">Identifier, format: (order id)|(transaction hash)|(event index)..</param>
        /// <param name="timestamp">Block&#39;s timestamp..</param>
        /// <param name="gasPrice">Transaction&#39;s gas price..</param>
        /// <param name="gasLimit">Transaction&#39;s gas limit..</param>
        /// <param name="feeAmount">Trade&#39;s fee amount..</param>
        /// <param name="txHash">Trade event transaction hash..</param>
        /// <param name="settlement">Reference to settlement..</param>
        /// <param name="buyAmount">Buy amount..</param>
        /// <param name="sellAmount">Sell amount..</param>
        /// <param name="sellToken">Address of token that is sold..</param>
        /// <param name="buyToken">Address of token that is bought..</param>
        /// <param name="order">Reference to order..</param>
        /// <param name="vid">vid.</param>
        /// <param name="evaluatedAggressor">evaluatedAggressor.</param>
        public CowTradeDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), string timestamp = default(string), string gasPrice = default(string), string gasLimit = default(string), string feeAmount = default(string), string txHash = default(string), string settlement = default(string), string buyAmount = default(string), string sellAmount = default(string), string sellToken = default(string), string buyToken = default(string), string order = default(string), long vid = default(long), TransactionsETradeAggressiveSide? evaluatedAggressor = default(TransactionsETradeAggressiveSide?))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Timestamp = timestamp;
            this.GasPrice = gasPrice;
            this.GasLimit = gasLimit;
            this.FeeAmount = feeAmount;
            this.TxHash = txHash;
            this.Settlement = settlement;
            this.BuyAmount = buyAmount;
            this.SellAmount = sellAmount;
            this.SellToken = sellToken;
            this.BuyToken = buyToken;
            this.Order = order;
            this.Vid = vid;
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
        /// Identifier, format: (order id)|(transaction hash)|(event index).
        /// </summary>
        /// <value>Identifier, format: (order id)|(transaction hash)|(event index).</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Block&#39;s timestamp.
        /// </summary>
        /// <value>Block&#39;s timestamp.</value>
        [DataMember(Name = "timestamp", EmitDefaultValue = true)]
        public string Timestamp { get; set; }

        /// <summary>
        /// Transaction&#39;s gas price.
        /// </summary>
        /// <value>Transaction&#39;s gas price.</value>
        [DataMember(Name = "gas_price", EmitDefaultValue = true)]
        public string GasPrice { get; set; }

        /// <summary>
        /// Transaction&#39;s gas limit.
        /// </summary>
        /// <value>Transaction&#39;s gas limit.</value>
        [DataMember(Name = "gas_limit", EmitDefaultValue = true)]
        public string GasLimit { get; set; }

        /// <summary>
        /// Trade&#39;s fee amount.
        /// </summary>
        /// <value>Trade&#39;s fee amount.</value>
        [DataMember(Name = "fee_amount", EmitDefaultValue = true)]
        public string FeeAmount { get; set; }

        /// <summary>
        /// Trade event transaction hash.
        /// </summary>
        /// <value>Trade event transaction hash.</value>
        [DataMember(Name = "tx_hash", EmitDefaultValue = true)]
        public string TxHash { get; set; }

        /// <summary>
        /// Reference to settlement.
        /// </summary>
        /// <value>Reference to settlement.</value>
        [DataMember(Name = "settlement", EmitDefaultValue = true)]
        public string Settlement { get; set; }

        /// <summary>
        /// Buy amount.
        /// </summary>
        /// <value>Buy amount.</value>
        [DataMember(Name = "buy_amount", EmitDefaultValue = true)]
        public string BuyAmount { get; set; }

        /// <summary>
        /// Sell amount.
        /// </summary>
        /// <value>Sell amount.</value>
        [DataMember(Name = "sell_amount", EmitDefaultValue = true)]
        public string SellAmount { get; set; }

        /// <summary>
        /// Address of token that is sold.
        /// </summary>
        /// <value>Address of token that is sold.</value>
        [DataMember(Name = "sell_token", EmitDefaultValue = true)]
        public string SellToken { get; set; }

        /// <summary>
        /// Address of token that is bought.
        /// </summary>
        /// <value>Address of token that is bought.</value>
        [DataMember(Name = "buy_token", EmitDefaultValue = true)]
        public string BuyToken { get; set; }

        /// <summary>
        /// Reference to order.
        /// </summary>
        /// <value>Reference to order.</value>
        [DataMember(Name = "order", EmitDefaultValue = true)]
        public string Order { get; set; }

        /// <summary>
        /// Gets or Sets Vid
        /// </summary>
        [DataMember(Name = "vid", EmitDefaultValue = false)]
        public long Vid { get; set; }

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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CowTradeDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  GasPrice: ").Append(GasPrice).Append("\n");
            sb.Append("  GasLimit: ").Append(GasLimit).Append("\n");
            sb.Append("  FeeAmount: ").Append(FeeAmount).Append("\n");
            sb.Append("  TxHash: ").Append(TxHash).Append("\n");
            sb.Append("  Settlement: ").Append(Settlement).Append("\n");
            sb.Append("  BuyAmount: ").Append(BuyAmount).Append("\n");
            sb.Append("  SellAmount: ").Append(SellAmount).Append("\n");
            sb.Append("  SellToken: ").Append(SellToken).Append("\n");
            sb.Append("  BuyToken: ").Append(BuyToken).Append("\n");
            sb.Append("  Order: ").Append(Order).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  PoolId: ").Append(PoolId).Append("\n");
            sb.Append("  TransactionId: ").Append(TransactionId).Append("\n");
            sb.Append("  EvaluatedPrice: ").Append(EvaluatedPrice).Append("\n");
            sb.Append("  EvaluatedAmount: ").Append(EvaluatedAmount).Append("\n");
            sb.Append("  EvaluatedAggressor: ").Append(EvaluatedAggressor).Append("\n");
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
            return this.Equals(input as CowTradeDTO);
        }

        /// <summary>
        /// Returns true if CowTradeDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of CowTradeDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CowTradeDTO input)
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
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
                ) && 
                (
                    this.GasPrice == input.GasPrice ||
                    (this.GasPrice != null &&
                    this.GasPrice.Equals(input.GasPrice))
                ) && 
                (
                    this.GasLimit == input.GasLimit ||
                    (this.GasLimit != null &&
                    this.GasLimit.Equals(input.GasLimit))
                ) && 
                (
                    this.FeeAmount == input.FeeAmount ||
                    (this.FeeAmount != null &&
                    this.FeeAmount.Equals(input.FeeAmount))
                ) && 
                (
                    this.TxHash == input.TxHash ||
                    (this.TxHash != null &&
                    this.TxHash.Equals(input.TxHash))
                ) && 
                (
                    this.Settlement == input.Settlement ||
                    (this.Settlement != null &&
                    this.Settlement.Equals(input.Settlement))
                ) && 
                (
                    this.BuyAmount == input.BuyAmount ||
                    (this.BuyAmount != null &&
                    this.BuyAmount.Equals(input.BuyAmount))
                ) && 
                (
                    this.SellAmount == input.SellAmount ||
                    (this.SellAmount != null &&
                    this.SellAmount.Equals(input.SellAmount))
                ) && 
                (
                    this.SellToken == input.SellToken ||
                    (this.SellToken != null &&
                    this.SellToken.Equals(input.SellToken))
                ) && 
                (
                    this.BuyToken == input.BuyToken ||
                    (this.BuyToken != null &&
                    this.BuyToken.Equals(input.BuyToken))
                ) && 
                (
                    this.Order == input.Order ||
                    (this.Order != null &&
                    this.Order.Equals(input.Order))
                ) && 
                (
                    this.Vid == input.Vid ||
                    this.Vid.Equals(input.Vid)
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
                if (this.Timestamp != null)
                {
                    hashCode = (hashCode * 59) + this.Timestamp.GetHashCode();
                }
                if (this.GasPrice != null)
                {
                    hashCode = (hashCode * 59) + this.GasPrice.GetHashCode();
                }
                if (this.GasLimit != null)
                {
                    hashCode = (hashCode * 59) + this.GasLimit.GetHashCode();
                }
                if (this.FeeAmount != null)
                {
                    hashCode = (hashCode * 59) + this.FeeAmount.GetHashCode();
                }
                if (this.TxHash != null)
                {
                    hashCode = (hashCode * 59) + this.TxHash.GetHashCode();
                }
                if (this.Settlement != null)
                {
                    hashCode = (hashCode * 59) + this.Settlement.GetHashCode();
                }
                if (this.BuyAmount != null)
                {
                    hashCode = (hashCode * 59) + this.BuyAmount.GetHashCode();
                }
                if (this.SellAmount != null)
                {
                    hashCode = (hashCode * 59) + this.SellAmount.GetHashCode();
                }
                if (this.SellToken != null)
                {
                    hashCode = (hashCode * 59) + this.SellToken.GetHashCode();
                }
                if (this.BuyToken != null)
                {
                    hashCode = (hashCode * 59) + this.BuyToken.GetHashCode();
                }
                if (this.Order != null)
                {
                    hashCode = (hashCode * 59) + this.Order.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Vid.GetHashCode();
                if (this.PoolId != null)
                {
                    hashCode = (hashCode * 59) + this.PoolId.GetHashCode();
                }
                if (this.TransactionId != null)
                {
                    hashCode = (hashCode * 59) + this.TransactionId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.EvaluatedPrice.GetHashCode();
                hashCode = (hashCode * 59) + this.EvaluatedAmount.GetHashCode();
                hashCode = (hashCode * 59) + this.EvaluatedAggressor.GetHashCode();
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
