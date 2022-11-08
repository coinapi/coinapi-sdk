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
    /// DexSolutionDTO
    /// </summary>
    [DataContract(Name = "Dex.SolutionDTO")]
    public partial class DexSolutionDTO : IEquatable<DexSolutionDTO>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DexSolutionDTO" /> class.
        /// </summary>
        /// <param name="entryTime">entryTime.</param>
        /// <param name="recvTime">recvTime.</param>
        /// <param name="blockNumber">Number of block in which entity was recorded..</param>
        /// <param name="id">id.</param>
        /// <param name="batch">batch.</param>
        /// <param name="solver">solver.</param>
        /// <param name="feeReward">feeReward.</param>
        /// <param name="objectiveValue">objectiveValue.</param>
        /// <param name="utility">utility.</param>
        /// <param name="trades">trades.</param>
        /// <param name="createEpoch">createEpoch.</param>
        /// <param name="revertEpoch">revertEpoch.</param>
        /// <param name="txHash">txHash.</param>
        /// <param name="txLogIndex">txLogIndex.</param>
        /// <param name="vid">vid.</param>
        public DexSolutionDTO(DateTime entryTime = default(DateTime), DateTime recvTime = default(DateTime), long blockNumber = default(long), string id = default(string), string batch = default(string), string solver = default(string), string feeReward = default(string), string objectiveValue = default(string), string utility = default(string), List<string> trades = default(List<string>), string createEpoch = default(string), string revertEpoch = default(string), string txHash = default(string), string txLogIndex = default(string), long vid = default(long))
        {
            this.EntryTime = entryTime;
            this.RecvTime = recvTime;
            this.BlockNumber = blockNumber;
            this.Id = id;
            this.Batch = batch;
            this.Solver = solver;
            this.FeeReward = feeReward;
            this.ObjectiveValue = objectiveValue;
            this.Utility = utility;
            this.Trades = trades;
            this.CreateEpoch = createEpoch;
            this.RevertEpoch = revertEpoch;
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
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Batch
        /// </summary>
        [DataMember(Name = "batch", EmitDefaultValue = true)]
        public string Batch { get; set; }

        /// <summary>
        /// Gets or Sets Solver
        /// </summary>
        [DataMember(Name = "solver", EmitDefaultValue = true)]
        public string Solver { get; set; }

        /// <summary>
        /// Gets or Sets FeeReward
        /// </summary>
        [DataMember(Name = "fee_reward", EmitDefaultValue = true)]
        public string FeeReward { get; set; }

        /// <summary>
        /// Gets or Sets ObjectiveValue
        /// </summary>
        [DataMember(Name = "objective_value", EmitDefaultValue = true)]
        public string ObjectiveValue { get; set; }

        /// <summary>
        /// Gets or Sets Utility
        /// </summary>
        [DataMember(Name = "utility", EmitDefaultValue = true)]
        public string Utility { get; set; }

        /// <summary>
        /// Gets or Sets Trades
        /// </summary>
        [DataMember(Name = "trades", EmitDefaultValue = true)]
        public List<string> Trades { get; set; }

        /// <summary>
        /// Gets or Sets CreateEpoch
        /// </summary>
        [DataMember(Name = "create_epoch", EmitDefaultValue = true)]
        public string CreateEpoch { get; set; }

        /// <summary>
        /// Gets or Sets RevertEpoch
        /// </summary>
        [DataMember(Name = "revert_epoch", EmitDefaultValue = true)]
        public string RevertEpoch { get; set; }

        /// <summary>
        /// Gets or Sets TxHash
        /// </summary>
        [DataMember(Name = "tx_hash", EmitDefaultValue = true)]
        public string TxHash { get; set; }

        /// <summary>
        /// Gets or Sets TxLogIndex
        /// </summary>
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
            sb.Append("class DexSolutionDTO {\n");
            sb.Append("  EntryTime: ").Append(EntryTime).Append("\n");
            sb.Append("  RecvTime: ").Append(RecvTime).Append("\n");
            sb.Append("  BlockNumber: ").Append(BlockNumber).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Batch: ").Append(Batch).Append("\n");
            sb.Append("  Solver: ").Append(Solver).Append("\n");
            sb.Append("  FeeReward: ").Append(FeeReward).Append("\n");
            sb.Append("  ObjectiveValue: ").Append(ObjectiveValue).Append("\n");
            sb.Append("  Utility: ").Append(Utility).Append("\n");
            sb.Append("  Trades: ").Append(Trades).Append("\n");
            sb.Append("  CreateEpoch: ").Append(CreateEpoch).Append("\n");
            sb.Append("  RevertEpoch: ").Append(RevertEpoch).Append("\n");
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
            return this.Equals(input as DexSolutionDTO);
        }

        /// <summary>
        /// Returns true if DexSolutionDTO instances are equal
        /// </summary>
        /// <param name="input">Instance of DexSolutionDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DexSolutionDTO input)
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
                    this.Batch == input.Batch ||
                    (this.Batch != null &&
                    this.Batch.Equals(input.Batch))
                ) && 
                (
                    this.Solver == input.Solver ||
                    (this.Solver != null &&
                    this.Solver.Equals(input.Solver))
                ) && 
                (
                    this.FeeReward == input.FeeReward ||
                    (this.FeeReward != null &&
                    this.FeeReward.Equals(input.FeeReward))
                ) && 
                (
                    this.ObjectiveValue == input.ObjectiveValue ||
                    (this.ObjectiveValue != null &&
                    this.ObjectiveValue.Equals(input.ObjectiveValue))
                ) && 
                (
                    this.Utility == input.Utility ||
                    (this.Utility != null &&
                    this.Utility.Equals(input.Utility))
                ) && 
                (
                    this.Trades == input.Trades ||
                    this.Trades != null &&
                    input.Trades != null &&
                    this.Trades.SequenceEqual(input.Trades)
                ) && 
                (
                    this.CreateEpoch == input.CreateEpoch ||
                    (this.CreateEpoch != null &&
                    this.CreateEpoch.Equals(input.CreateEpoch))
                ) && 
                (
                    this.RevertEpoch == input.RevertEpoch ||
                    (this.RevertEpoch != null &&
                    this.RevertEpoch.Equals(input.RevertEpoch))
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
                if (this.Batch != null)
                {
                    hashCode = (hashCode * 59) + this.Batch.GetHashCode();
                }
                if (this.Solver != null)
                {
                    hashCode = (hashCode * 59) + this.Solver.GetHashCode();
                }
                if (this.FeeReward != null)
                {
                    hashCode = (hashCode * 59) + this.FeeReward.GetHashCode();
                }
                if (this.ObjectiveValue != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectiveValue.GetHashCode();
                }
                if (this.Utility != null)
                {
                    hashCode = (hashCode * 59) + this.Utility.GetHashCode();
                }
                if (this.Trades != null)
                {
                    hashCode = (hashCode * 59) + this.Trades.GetHashCode();
                }
                if (this.CreateEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.CreateEpoch.GetHashCode();
                }
                if (this.RevertEpoch != null)
                {
                    hashCode = (hashCode * 59) + this.RevertEpoch.GetHashCode();
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
