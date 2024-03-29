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
    /// CurveGaugeLiquidityDTO
    /// </summary>
    [DataContract]
    public partial class CurveGaugeLiquidityDTO :  IEquatable<CurveGaugeLiquidityDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CurveGaugeLiquidityDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">id.</param>
        /// <param name="user">user.</param>
        /// <param name="gauge">gauge.</param>
        /// <param name="originalBalance">originalBalance.</param>
        /// <param name="originalSupply">originalSupply.</param>
        /// <param name="workingBalance">workingBalance.</param>
        /// <param name="workingSupply">workingSupply.</param>
        /// <param name="timestamp">timestamp.</param>
        /// <param name="block">block.</param>
        /// <param name="transaction">transaction.</param>
        /// <param name="vid">vid.</param>
        public CurveGaugeLiquidityDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), string user = default(string), string gauge = default(string), string originalBalance = default(string), string originalSupply = default(string), string workingBalance = default(string), string workingSupply = default(string), string timestamp = default(string), string block = default(string), string transaction = default(string), long vid = default(long))
        {
            this.Id = id;
            this.User = user;
            this.Gauge = gauge;
            this.OriginalBalance = originalBalance;
            this.OriginalSupply = originalSupply;
            this.WorkingBalance = workingBalance;
            this.WorkingSupply = workingSupply;
            this.Timestamp = timestamp;
            this.Block = block;
            this.Transaction = transaction;
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.User = user;
            this.Gauge = gauge;
            this.OriginalBalance = originalBalance;
            this.OriginalSupply = originalSupply;
            this.WorkingBalance = workingBalance;
            this.WorkingSupply = workingSupply;
            this.Timestamp = timestamp;
            this.Block = block;
            this.Transaction = transaction;
            this.Vid = vid;
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
        /// Gets or Sets User
        /// </summary>
        [DataMember(Name="user", EmitDefaultValue=true)]
        public string User { get; set; }

        /// <summary>
        /// Gets or Sets Gauge
        /// </summary>
        [DataMember(Name="gauge", EmitDefaultValue=true)]
        public string Gauge { get; set; }

        /// <summary>
        /// Gets or Sets OriginalBalance
        /// </summary>
        [DataMember(Name="original_balance", EmitDefaultValue=true)]
        public string OriginalBalance { get; set; }

        /// <summary>
        /// Gets or Sets OriginalSupply
        /// </summary>
        [DataMember(Name="original_supply", EmitDefaultValue=true)]
        public string OriginalSupply { get; set; }

        /// <summary>
        /// Gets or Sets WorkingBalance
        /// </summary>
        [DataMember(Name="working_balance", EmitDefaultValue=true)]
        public string WorkingBalance { get; set; }

        /// <summary>
        /// Gets or Sets WorkingSupply
        /// </summary>
        [DataMember(Name="working_supply", EmitDefaultValue=true)]
        public string WorkingSupply { get; set; }

        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name="timestamp", EmitDefaultValue=true)]
        public string Timestamp { get; set; }

        /// <summary>
        /// Gets or Sets Block
        /// </summary>
        [DataMember(Name="block", EmitDefaultValue=true)]
        public string Block { get; set; }

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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CurveGaugeLiquidityDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  User: ").Append(User).Append("\n");
            sb.Append("  Gauge: ").Append(Gauge).Append("\n");
            sb.Append("  OriginalBalance: ").Append(OriginalBalance).Append("\n");
            sb.Append("  OriginalSupply: ").Append(OriginalSupply).Append("\n");
            sb.Append("  WorkingBalance: ").Append(WorkingBalance).Append("\n");
            sb.Append("  WorkingSupply: ").Append(WorkingSupply).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Block: ").Append(Block).Append("\n");
            sb.Append("  Transaction: ").Append(Transaction).Append("\n");
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
            return this.Equals(input as CurveGaugeLiquidityDTO);
        }

        /// <summary>
        /// Returns true if CurveGaugeLiquidityDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of CurveGaugeLiquidityDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CurveGaugeLiquidityDTO input)
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
                    this.User == input.User ||
                    (this.User != null &&
                    this.User.Equals(input.User))
                ) && 
                (
                    this.Gauge == input.Gauge ||
                    (this.Gauge != null &&
                    this.Gauge.Equals(input.Gauge))
                ) && 
                (
                    this.OriginalBalance == input.OriginalBalance ||
                    (this.OriginalBalance != null &&
                    this.OriginalBalance.Equals(input.OriginalBalance))
                ) && 
                (
                    this.OriginalSupply == input.OriginalSupply ||
                    (this.OriginalSupply != null &&
                    this.OriginalSupply.Equals(input.OriginalSupply))
                ) && 
                (
                    this.WorkingBalance == input.WorkingBalance ||
                    (this.WorkingBalance != null &&
                    this.WorkingBalance.Equals(input.WorkingBalance))
                ) && 
                (
                    this.WorkingSupply == input.WorkingSupply ||
                    (this.WorkingSupply != null &&
                    this.WorkingSupply.Equals(input.WorkingSupply))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
                ) && 
                (
                    this.Block == input.Block ||
                    (this.Block != null &&
                    this.Block.Equals(input.Block))
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
                if (this.User != null)
                    hashCode = hashCode * 59 + this.User.GetHashCode();
                if (this.Gauge != null)
                    hashCode = hashCode * 59 + this.Gauge.GetHashCode();
                if (this.OriginalBalance != null)
                    hashCode = hashCode * 59 + this.OriginalBalance.GetHashCode();
                if (this.OriginalSupply != null)
                    hashCode = hashCode * 59 + this.OriginalSupply.GetHashCode();
                if (this.WorkingBalance != null)
                    hashCode = hashCode * 59 + this.WorkingBalance.GetHashCode();
                if (this.WorkingSupply != null)
                    hashCode = hashCode * 59 + this.WorkingSupply.GetHashCode();
                if (this.Timestamp != null)
                    hashCode = hashCode * 59 + this.Timestamp.GetHashCode();
                if (this.Block != null)
                    hashCode = hashCode * 59 + this.Block.GetHashCode();
                if (this.Transaction != null)
                    hashCode = hashCode * 59 + this.Transaction.GetHashCode();
                if (this.Vid != null)
                    hashCode = hashCode * 59 + this.Vid.GetHashCode();
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
