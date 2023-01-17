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
    /// CurveCoinDTO
    /// </summary>
    [DataContract(Name = "Curve.CoinDTO")]
    public partial class CurveCoinDTO : IEquatable<CurveCoinDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CurveCoinDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">Identifier, format: (pool_id)-(coin_index)..</param>
        /// <param name="index">Coin index..</param>
        /// <param name="pool">pool.</param>
        /// <param name="token">token.</param>
        /// <param name="underlying">underlying.</param>
        /// <param name="balance">balance.</param>
        /// <param name="rate">Exchange rate between this coin and the associated underlying coin within the pool..</param>
        /// <param name="updated">updated.</param>
        /// <param name="updatedAtBlock">updatedAtBlock.</param>
        /// <param name="updatedAtTransaction">updatedAtTransaction.</param>
        /// <param name="vid">vid.</param>
        /// <param name="blockRange">blockRange.</param>
        public CurveCoinDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), int index = default(int), string pool = default(string), string token = default(string), string underlying = default(string), string balance = default(string), string rate = default(string), string updated = default(string), string updatedAtBlock = default(string), string updatedAtTransaction = default(string), long vid = default(long), string blockRange = default(string))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Index = index;
            this.Pool = pool;
            this.Token = token;
            this.Underlying = underlying;
            this.Balance = balance;
            this.Rate = rate;
            this.Updated = updated;
            this.UpdatedAtBlock = updatedAtBlock;
            this.UpdatedAtTransaction = updatedAtTransaction;
            this.Vid = vid;
            this.BlockRange = blockRange;
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
        /// Identifier, format: (pool_id)-(coin_index).
        /// </summary>
        /// <value>Identifier, format: (pool_id)-(coin_index).</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Coin index.
        /// </summary>
        /// <value>Coin index.</value>
        [DataMember(Name = "index", EmitDefaultValue = false)]
        public int Index { get; set; }

        /// <summary>
        /// Gets or Sets Pool
        /// </summary>
        [DataMember(Name = "pool", EmitDefaultValue = true)]
        public string Pool { get; set; }

        /// <summary>
        /// Gets or Sets Token
        /// </summary>
        [DataMember(Name = "token", EmitDefaultValue = true)]
        public string Token { get; set; }

        /// <summary>
        /// Gets or Sets Underlying
        /// </summary>
        [DataMember(Name = "underlying", EmitDefaultValue = true)]
        public string Underlying { get; set; }

        /// <summary>
        /// Gets or Sets Balance
        /// </summary>
        [DataMember(Name = "balance", EmitDefaultValue = true)]
        public string Balance { get; set; }

        /// <summary>
        /// Exchange rate between this coin and the associated underlying coin within the pool.
        /// </summary>
        /// <value>Exchange rate between this coin and the associated underlying coin within the pool.</value>
        [DataMember(Name = "rate", EmitDefaultValue = true)]
        public string Rate { get; set; }

        /// <summary>
        /// Gets or Sets Updated
        /// </summary>
        [DataMember(Name = "updated", EmitDefaultValue = true)]
        public string Updated { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAtBlock
        /// </summary>
        [DataMember(Name = "updated_at_block", EmitDefaultValue = true)]
        public string UpdatedAtBlock { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAtTransaction
        /// </summary>
        [DataMember(Name = "updated_at_transaction", EmitDefaultValue = true)]
        public string UpdatedAtTransaction { get; set; }

        /// <summary>
        /// Gets or Sets Vid
        /// </summary>
        [DataMember(Name = "vid", EmitDefaultValue = false)]
        public long Vid { get; set; }

        /// <summary>
        /// Gets or Sets BlockRange
        /// </summary>
        [DataMember(Name = "block_range", EmitDefaultValue = true)]
        public string BlockRange { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CurveCoinDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Index: ").Append(Index).Append("\n");
            sb.Append("  Pool: ").Append(Pool).Append("\n");
            sb.Append("  Token: ").Append(Token).Append("\n");
            sb.Append("  Underlying: ").Append(Underlying).Append("\n");
            sb.Append("  Balance: ").Append(Balance).Append("\n");
            sb.Append("  Rate: ").Append(Rate).Append("\n");
            sb.Append("  Updated: ").Append(Updated).Append("\n");
            sb.Append("  UpdatedAtBlock: ").Append(UpdatedAtBlock).Append("\n");
            sb.Append("  UpdatedAtTransaction: ").Append(UpdatedAtTransaction).Append("\n");
            sb.Append("  Vid: ").Append(Vid).Append("\n");
            sb.Append("  BlockRange: ").Append(BlockRange).Append("\n");
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
            return this.Equals(input as CurveCoinDTO);
        }

        /// <summary>
        /// Returns true if CurveCoinDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of CurveCoinDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CurveCoinDTO input)
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
                    this.Index == input.Index ||
                    this.Index.Equals(input.Index)
                ) && 
                (
                    this.Pool == input.Pool ||
                    (this.Pool != null &&
                    this.Pool.Equals(input.Pool))
                ) && 
                (
                    this.Token == input.Token ||
                    (this.Token != null &&
                    this.Token.Equals(input.Token))
                ) && 
                (
                    this.Underlying == input.Underlying ||
                    (this.Underlying != null &&
                    this.Underlying.Equals(input.Underlying))
                ) && 
                (
                    this.Balance == input.Balance ||
                    (this.Balance != null &&
                    this.Balance.Equals(input.Balance))
                ) && 
                (
                    this.Rate == input.Rate ||
                    (this.Rate != null &&
                    this.Rate.Equals(input.Rate))
                ) && 
                (
                    this.Updated == input.Updated ||
                    (this.Updated != null &&
                    this.Updated.Equals(input.Updated))
                ) && 
                (
                    this.UpdatedAtBlock == input.UpdatedAtBlock ||
                    (this.UpdatedAtBlock != null &&
                    this.UpdatedAtBlock.Equals(input.UpdatedAtBlock))
                ) && 
                (
                    this.UpdatedAtTransaction == input.UpdatedAtTransaction ||
                    (this.UpdatedAtTransaction != null &&
                    this.UpdatedAtTransaction.Equals(input.UpdatedAtTransaction))
                ) && 
                (
                    this.Vid == input.Vid ||
                    this.Vid.Equals(input.Vid)
                ) && 
                (
                    this.BlockRange == input.BlockRange ||
                    (this.BlockRange != null &&
                    this.BlockRange.Equals(input.BlockRange))
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
                hashCode = (hashCode * 59) + this.Index.GetHashCode();
                if (this.Pool != null)
                {
                    hashCode = (hashCode * 59) + this.Pool.GetHashCode();
                }
                if (this.Token != null)
                {
                    hashCode = (hashCode * 59) + this.Token.GetHashCode();
                }
                if (this.Underlying != null)
                {
                    hashCode = (hashCode * 59) + this.Underlying.GetHashCode();
                }
                if (this.Balance != null)
                {
                    hashCode = (hashCode * 59) + this.Balance.GetHashCode();
                }
                if (this.Rate != null)
                {
                    hashCode = (hashCode * 59) + this.Rate.GetHashCode();
                }
                if (this.Updated != null)
                {
                    hashCode = (hashCode * 59) + this.Updated.GetHashCode();
                }
                if (this.UpdatedAtBlock != null)
                {
                    hashCode = (hashCode * 59) + this.UpdatedAtBlock.GetHashCode();
                }
                if (this.UpdatedAtTransaction != null)
                {
                    hashCode = (hashCode * 59) + this.UpdatedAtTransaction.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Vid.GetHashCode();
                if (this.BlockRange != null)
                {
                    hashCode = (hashCode * 59) + this.BlockRange.GetHashCode();
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
