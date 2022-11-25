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
    /// Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.
    /// </summary>
    [DataContract(Name = "Dex.OrderDTO")]
    public partial class DexOrderDTO : IEquatable<DexOrderDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DexOrderDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">Identifier, format: &lt;owner address&gt;-&lt;order id&gt;.</param>
        /// <param name="owner">Reference to owner..</param>
        /// <param name="orderId">Order id..</param>
        /// <param name="fromBatchId">Batch id from which order became valid..</param>
        /// <param name="fromEpoch">Start of epoch in which order was placed and became valid..</param>
        /// <param name="untilBatchId">Batch id until which trade was still valid..</param>
        /// <param name="untilEpoch">End of epoch in which order was placed..</param>
        /// <param name="buyToken">Identifier of token that was bought..</param>
        /// <param name="sellToken">Identifier of token that was sold..</param>
        /// <param name="priceNumerator">Price enumerator..</param>
        /// <param name="priceDenominator">Price denominator..</param>
        /// <param name="maxSellAmount">Maximum sell amount..</param>
        /// <param name="minReceiveAmount">Minimum receive amount..</param>
        /// <param name="soldVolume">Sold volume..</param>
        /// <param name="boughtVolume">Bought volume..</param>
        /// <param name="createEpoch">Epoch in which order was created..</param>
        /// <param name="cancelEpoch">Epoch in which order was cancelled..</param>
        /// <param name="deleteEpoch">Epoch in which order was deleted..</param>
        /// <param name="txHash">Transaction hash..</param>
        /// <param name="txLogIndex">Event index within transaction..</param>
        /// <param name="vid">vid.</param>
        public DexOrderDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), string owner = default(string), int orderId = default(int), string fromBatchId = default(string), string fromEpoch = default(string), string untilBatchId = default(string), string untilEpoch = default(string), string buyToken = default(string), string sellToken = default(string), string priceNumerator = default(string), string priceDenominator = default(string), string maxSellAmount = default(string), string minReceiveAmount = default(string), string soldVolume = default(string), string boughtVolume = default(string), string createEpoch = default(string), string cancelEpoch = default(string), string deleteEpoch = default(string), string txHash = default(string), string txLogIndex = default(string), long vid = default(long))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Owner = owner;
            this.OrderId = orderId;
            this.FromBatchId = fromBatchId;
            this.FromEpoch = fromEpoch;
            this.UntilBatchId = untilBatchId;
            this.UntilEpoch = untilEpoch;
            this.BuyToken = buyToken;
            this.SellToken = sellToken;
            this.PriceNumerator = priceNumerator;
            this.PriceDenominator = priceDenominator;
            this.MaxSellAmount = maxSellAmount;
            this.MinReceiveAmount = minReceiveAmount;
            this.SoldVolume = soldVolume;
            this.BoughtVolume = boughtVolume;
            this.CreateEpoch = createEpoch;
            this.CancelEpoch = cancelEpoch;
            this.DeleteEpoch = deleteEpoch;
            this.TxHash = txHash;
            this.TxLogIndex = txLogIndex;
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
        /// Identifier, format: &lt;owner address&gt;-&lt;order id&gt;
        /// </summary>
        /// <value>Identifier, format: &lt;owner address&gt;-&lt;order id&gt;</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Reference to owner.
        /// </summary>
        /// <value>Reference to owner.</value>
        [DataMember(Name = "owner", EmitDefaultValue = true)]
        public string Owner { get; set; }

        /// <summary>
        /// Order id.
        /// </summary>
        /// <value>Order id.</value>
        [DataMember(Name = "order_id", EmitDefaultValue = false)]
        public int OrderId { get; set; }

        /// <summary>
        /// Batch id from which order became valid.
        /// </summary>
        /// <value>Batch id from which order became valid.</value>
        [DataMember(Name = "from_batch_id", EmitDefaultValue = true)]
        public string FromBatchId { get; set; }

        /// <summary>
        /// Start of epoch in which order was placed and became valid.
        /// </summary>
        /// <value>Start of epoch in which order was placed and became valid.</value>
        [DataMember(Name = "from_epoch", EmitDefaultValue = true)]
        public string FromEpoch { get; set; }

        /// <summary>
        /// Batch id until which trade was still valid.
        /// </summary>
        /// <value>Batch id until which trade was still valid.</value>
        [DataMember(Name = "until_batch_id", EmitDefaultValue = true)]
        public string UntilBatchId { get; set; }

        /// <summary>
        /// End of epoch in which order was placed.
        /// </summary>
        /// <value>End of epoch in which order was placed.</value>
        [DataMember(Name = "until_epoch", EmitDefaultValue = true)]
        public string UntilEpoch { get; set; }

        /// <summary>
        /// Identifier of token that was bought.
        /// </summary>
        /// <value>Identifier of token that was bought.</value>
        [DataMember(Name = "buy_token", EmitDefaultValue = true)]
        public string BuyToken { get; set; }

        /// <summary>
        /// Identifier of token that was sold.
        /// </summary>
        /// <value>Identifier of token that was sold.</value>
        [DataMember(Name = "sell_token", EmitDefaultValue = true)]
        public string SellToken { get; set; }

        /// <summary>
        /// Price enumerator.
        /// </summary>
        /// <value>Price enumerator.</value>
        [DataMember(Name = "price_numerator", EmitDefaultValue = true)]
        public string PriceNumerator { get; set; }

        /// <summary>
        /// Price denominator.
        /// </summary>
        /// <value>Price denominator.</value>
        [DataMember(Name = "price_denominator", EmitDefaultValue = true)]
        public string PriceDenominator { get; set; }

        /// <summary>
        /// Maximum sell amount.
        /// </summary>
        /// <value>Maximum sell amount.</value>
        [DataMember(Name = "max_sell_amount", EmitDefaultValue = true)]
        public string MaxSellAmount { get; set; }

        /// <summary>
        /// Minimum receive amount.
        /// </summary>
        /// <value>Minimum receive amount.</value>
        [DataMember(Name = "min_receive_amount", EmitDefaultValue = true)]
        public string MinReceiveAmount { get; set; }

        /// <summary>
        /// Sold volume.
        /// </summary>
        /// <value>Sold volume.</value>
        [DataMember(Name = "sold_volume", EmitDefaultValue = true)]
        public string SoldVolume { get; set; }

        /// <summary>
        /// Bought volume.
        /// </summary>
        /// <value>Bought volume.</value>
        [DataMember(Name = "bought_volume", EmitDefaultValue = true)]
        public string BoughtVolume { get; set; }

        /// <summary>
        /// Epoch in which order was created.
        /// </summary>
        /// <value>Epoch in which order was created.</value>
        [DataMember(Name = "create_epoch", EmitDefaultValue = true)]
        public string CreateEpoch { get; set; }

        /// <summary>
        /// Epoch in which order was cancelled.
        /// </summary>
        /// <value>Epoch in which order was cancelled.</value>
        [DataMember(Name = "cancel_epoch", EmitDefaultValue = true)]
        public string CancelEpoch { get; set; }

        /// <summary>
        /// Epoch in which order was deleted.
        /// </summary>
        /// <value>Epoch in which order was deleted.</value>
        [DataMember(Name = "delete_epoch", EmitDefaultValue = true)]
        public string DeleteEpoch { get; set; }

        /// <summary>
        /// Transaction hash.
        /// </summary>
        /// <value>Transaction hash.</value>
        [DataMember(Name = "tx_hash", EmitDefaultValue = true)]
        public string TxHash { get; set; }

        /// <summary>
        /// Event index within transaction.
        /// </summary>
        /// <value>Event index within transaction.</value>
        [DataMember(Name = "tx_log_index", EmitDefaultValue = true)]
        public string TxLogIndex { get; set; }

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
            sb.Append("class DexOrderDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Owner: ").Append(Owner).Append("\n");
            sb.Append("  OrderId: ").Append(OrderId).Append("\n");
            sb.Append("  FromBatchId: ").Append(FromBatchId).Append("\n");
            sb.Append("  FromEpoch: ").Append(FromEpoch).Append("\n");
            sb.Append("  UntilBatchId: ").Append(UntilBatchId).Append("\n");
            sb.Append("  UntilEpoch: ").Append(UntilEpoch).Append("\n");
            sb.Append("  BuyToken: ").Append(BuyToken).Append("\n");
            sb.Append("  SellToken: ").Append(SellToken).Append("\n");
            sb.Append("  PriceNumerator: ").Append(PriceNumerator).Append("\n");
            sb.Append("  PriceDenominator: ").Append(PriceDenominator).Append("\n");
            sb.Append("  MaxSellAmount: ").Append(MaxSellAmount).Append("\n");
            sb.Append("  MinReceiveAmount: ").Append(MinReceiveAmount).Append("\n");
            sb.Append("  SoldVolume: ").Append(SoldVolume).Append("\n");
            sb.Append("  BoughtVolume: ").Append(BoughtVolume).Append("\n");
            sb.Append("  CreateEpoch: ").Append(CreateEpoch).Append("\n");
            sb.Append("  CancelEpoch: ").Append(CancelEpoch).Append("\n");
            sb.Append("  DeleteEpoch: ").Append(DeleteEpoch).Append("\n");
            sb.Append("  TxHash: ").Append(TxHash).Append("\n");
            sb.Append("  TxLogIndex: ").Append(TxLogIndex).Append("\n");
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
            return this.Equals(input as DexOrderDTO);
        }

        /// <summary>
        /// Returns true if DexOrderDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of DexOrderDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DexOrderDTO input)
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
                    this.Owner == input.Owner ||
                    (this.Owner != null &&
                    this.Owner.Equals(input.Owner))
                ) && 
                (
                    this.OrderId == input.OrderId ||
                    this.OrderId.Equals(input.OrderId)
                ) && 
                (
                    this.FromBatchId == input.FromBatchId ||
                    (this.FromBatchId != null &&
                    this.FromBatchId.Equals(input.FromBatchId))
                ) && 
                (
                    this.FromEpoch == input.FromEpoch ||
                    (this.FromEpoch != null &&
                    this.FromEpoch.Equals(input.FromEpoch))
                ) && 
                (
                    this.UntilBatchId == input.UntilBatchId ||
                    (this.UntilBatchId != null &&
                    this.UntilBatchId.Equals(input.UntilBatchId))
                ) && 
                (
                    this.UntilEpoch == input.UntilEpoch ||
                    (this.UntilEpoch != null &&
                    this.UntilEpoch.Equals(input.UntilEpoch))
                ) && 
                (
                    this.BuyToken == input.BuyToken ||
                    (this.BuyToken != null &&
                    this.BuyToken.Equals(input.BuyToken))
                ) && 
                (
                    this.SellToken == input.SellToken ||
                    (this.SellToken != null &&
                    this.SellToken.Equals(input.SellToken))
                ) && 
                (
                    this.PriceNumerator == input.PriceNumerator ||
                    (this.PriceNumerator != null &&
                    this.PriceNumerator.Equals(input.PriceNumerator))
                ) && 
                (
                    this.PriceDenominator == input.PriceDenominator ||
                    (this.PriceDenominator != null &&
                    this.PriceDenominator.Equals(input.PriceDenominator))
                ) && 
                (
                    this.MaxSellAmount == input.MaxSellAmount ||
                    (this.MaxSellAmount != null &&
                    this.MaxSellAmount.Equals(input.MaxSellAmount))
                ) && 
                (
                    this.MinReceiveAmount == input.MinReceiveAmount ||
                    (this.MinReceiveAmount != null &&
                    this.MinReceiveAmount.Equals(input.MinReceiveAmount))
                ) && 
                (
                    this.SoldVolume == input.SoldVolume ||
                    (this.SoldVolume != null &&
                    this.SoldVolume.Equals(input.SoldVolume))
                ) && 
                (
                    this.BoughtVolume == input.BoughtVolume ||
                    (this.BoughtVolume != null &&
                    this.BoughtVolume.Equals(input.BoughtVolume))
                ) && 
                (
                    this.CreateEpoch == input.CreateEpoch ||
                    (this.CreateEpoch != null &&
                    this.CreateEpoch.Equals(input.CreateEpoch))
                ) && 
                (
                    this.CancelEpoch == input.CancelEpoch ||
                    (this.CancelEpoch != null &&
                    this.CancelEpoch.Equals(input.CancelEpoch))
                ) && 
                (
                    this.DeleteEpoch == input.DeleteEpoch ||
                    (this.DeleteEpoch != null &&
                    this.DeleteEpoch.Equals(input.DeleteEpoch))
                ) && 
                (
                    this.TxHash == input.TxHash ||
                    (this.TxHash != null &&
                    this.TxHash.Equals(input.TxHash))
                ) && 
                (
                    this.TxLogIndex == input.TxLogIndex ||
                    (this.TxLogIndex != null &&
                    this.TxLogIndex.Equals(input.TxLogIndex))
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
                if (this.Owner != null)
                {
                    hashCode = (hashCode * 59) + this.Owner.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.OrderId.GetHashCode();
                if (this.FromBatchId != null)
                {
                    hashCode = (hashCode * 59) + this.FromBatchId.GetHashCode();
                }
                if (this.FromEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.FromEpoch.GetHashCode();
                }
                if (this.UntilBatchId != null)
                {
                    hashCode = (hashCode * 59) + this.UntilBatchId.GetHashCode();
                }
                if (this.UntilEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.UntilEpoch.GetHashCode();
                }
                if (this.BuyToken != null)
                {
                    hashCode = (hashCode * 59) + this.BuyToken.GetHashCode();
                }
                if (this.SellToken != null)
                {
                    hashCode = (hashCode * 59) + this.SellToken.GetHashCode();
                }
                if (this.PriceNumerator != null)
                {
                    hashCode = (hashCode * 59) + this.PriceNumerator.GetHashCode();
                }
                if (this.PriceDenominator != null)
                {
                    hashCode = (hashCode * 59) + this.PriceDenominator.GetHashCode();
                }
                if (this.MaxSellAmount != null)
                {
                    hashCode = (hashCode * 59) + this.MaxSellAmount.GetHashCode();
                }
                if (this.MinReceiveAmount != null)
                {
                    hashCode = (hashCode * 59) + this.MinReceiveAmount.GetHashCode();
                }
                if (this.SoldVolume != null)
                {
                    hashCode = (hashCode * 59) + this.SoldVolume.GetHashCode();
                }
                if (this.BoughtVolume != null)
                {
                    hashCode = (hashCode * 59) + this.BoughtVolume.GetHashCode();
                }
                if (this.CreateEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.CreateEpoch.GetHashCode();
                }
                if (this.CancelEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.CancelEpoch.GetHashCode();
                }
                if (this.DeleteEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.DeleteEpoch.GetHashCode();
                }
                if (this.TxHash != null)
                {
                    hashCode = (hashCode * 59) + this.TxHash.GetHashCode();
                }
                if (this.TxLogIndex != null)
                {
                    hashCode = (hashCode * 59) + this.TxLogIndex.GetHashCode();
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
