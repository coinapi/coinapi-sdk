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
    /// Batch executed. Every batch will contain at least solution with the a set of trades that are executed in it
    /// </summary>
    [DataContract(Name = "Dex.BatchDTO")]
    public partial class DexBatchDTO : IEquatable<DexBatchDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DexBatchDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">Identifier..</param>
        /// <param name="startEpoch">Start epoch..</param>
        /// <param name="endEpoch">End epoch..</param>
        /// <param name="solution">Reference to solution..</param>
        /// <param name="firstSolutionEpoch">First solution epoch..</param>
        /// <param name="lastRevertEpoch">Last revert epoch..</param>
        /// <param name="txHash">Transaction hash..</param>
        /// <param name="vid">vid.</param>
        public DexBatchDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), string startEpoch = default(string), string endEpoch = default(string), string solution = default(string), string firstSolutionEpoch = default(string), string lastRevertEpoch = default(string), string txHash = default(string), long vid = default(long))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.StartEpoch = startEpoch;
            this.EndEpoch = endEpoch;
            this.Solution = solution;
            this.FirstSolutionEpoch = firstSolutionEpoch;
            this.LastRevertEpoch = lastRevertEpoch;
            this.TxHash = txHash;
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
        /// Identifier.
        /// </summary>
        /// <value>Identifier.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Start epoch.
        /// </summary>
        /// <value>Start epoch.</value>
        [DataMember(Name = "start_epoch", EmitDefaultValue = true)]
        public string StartEpoch { get; set; }

        /// <summary>
        /// End epoch.
        /// </summary>
        /// <value>End epoch.</value>
        [DataMember(Name = "end_epoch", EmitDefaultValue = true)]
        public string EndEpoch { get; set; }

        /// <summary>
        /// Reference to solution.
        /// </summary>
        /// <value>Reference to solution.</value>
        [DataMember(Name = "solution", EmitDefaultValue = true)]
        public string Solution { get; set; }

        /// <summary>
        /// First solution epoch.
        /// </summary>
        /// <value>First solution epoch.</value>
        [DataMember(Name = "first_solution_epoch", EmitDefaultValue = true)]
        public string FirstSolutionEpoch { get; set; }

        /// <summary>
        /// Last revert epoch.
        /// </summary>
        /// <value>Last revert epoch.</value>
        [DataMember(Name = "last_revert_epoch", EmitDefaultValue = true)]
        public string LastRevertEpoch { get; set; }

        /// <summary>
        /// Transaction hash.
        /// </summary>
        /// <value>Transaction hash.</value>
        [DataMember(Name = "tx_hash", EmitDefaultValue = true)]
        public string TxHash { get; set; }

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
            sb.Append("class DexBatchDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  StartEpoch: ").Append(StartEpoch).Append("\n");
            sb.Append("  EndEpoch: ").Append(EndEpoch).Append("\n");
            sb.Append("  Solution: ").Append(Solution).Append("\n");
            sb.Append("  FirstSolutionEpoch: ").Append(FirstSolutionEpoch).Append("\n");
            sb.Append("  LastRevertEpoch: ").Append(LastRevertEpoch).Append("\n");
            sb.Append("  TxHash: ").Append(TxHash).Append("\n");
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
            return this.Equals(input as DexBatchDTO);
        }

        /// <summary>
        /// Returns true if DexBatchDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of DexBatchDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DexBatchDTO input)
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
                    this.StartEpoch == input.StartEpoch ||
                    (this.StartEpoch != null &&
                    this.StartEpoch.Equals(input.StartEpoch))
                ) && 
                (
                    this.EndEpoch == input.EndEpoch ||
                    (this.EndEpoch != null &&
                    this.EndEpoch.Equals(input.EndEpoch))
                ) && 
                (
                    this.Solution == input.Solution ||
                    (this.Solution != null &&
                    this.Solution.Equals(input.Solution))
                ) && 
                (
                    this.FirstSolutionEpoch == input.FirstSolutionEpoch ||
                    (this.FirstSolutionEpoch != null &&
                    this.FirstSolutionEpoch.Equals(input.FirstSolutionEpoch))
                ) && 
                (
                    this.LastRevertEpoch == input.LastRevertEpoch ||
                    (this.LastRevertEpoch != null &&
                    this.LastRevertEpoch.Equals(input.LastRevertEpoch))
                ) && 
                (
                    this.TxHash == input.TxHash ||
                    (this.TxHash != null &&
                    this.TxHash.Equals(input.TxHash))
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
                if (this.StartEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.StartEpoch.GetHashCode();
                }
                if (this.EndEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.EndEpoch.GetHashCode();
                }
                if (this.Solution != null)
                {
                    hashCode = (hashCode * 59) + this.Solution.GetHashCode();
                }
                if (this.FirstSolutionEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.FirstSolutionEpoch.GetHashCode();
                }
                if (this.LastRevertEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.LastRevertEpoch.GetHashCode();
                }
                if (this.TxHash != null)
                {
                    hashCode = (hashCode * 59) + this.TxHash.GetHashCode();
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
