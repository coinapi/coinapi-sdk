note
 description:"[
		On Chain Dapps - REST API
 		 This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class CURVE_PROPOSAL_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- 
    number: detachable STRING_32
      -- Sequential number in related to the realted voting app.
    app: detachable STRING_32
      -- Voting app instance.
    creator: detachable STRING_32
      -- Proposal creator's account.
    execution_script: detachable STRING_32
      -- 
    expire_date: detachable STRING_32
      -- 
    minimum_quorum: detachable STRING_32
      -- Percentage of positive votes in total possible votes for this proposal to be accepted.
    required_support: detachable STRING_32
      -- Percentage of positive votes needed for this proposal to be accepted.
    snapshot_block: detachable STRING_32
      -- 
    voting_power: detachable STRING_32
      -- 
    metadata: detachable STRING_32
      -- Link to metadata file.
    text: detachable STRING_32
      -- Proposal description text.
    vote_count: detachable STRING_32
      -- Number of votes received by the proposal.
    positive_vote_count: detachable STRING_32
      -- Number of positive votes (yes) received by the proposal.
    negative_vote_count: detachable STRING_32
      -- Number of negative votes (no) received by the proposal.
    current_quorum: detachable STRING_32
      -- 
    current_support: detachable STRING_32
      -- 
    staked_support: detachable STRING_32
      -- 
    total_staked: detachable STRING_32
      -- 
    created: detachable STRING_32
      -- 
    created_at_block: detachable STRING_32
      -- 
    created_at_transaction: detachable STRING_32
      -- 
    updated: detachable STRING_32
      -- 
    updated_at_block: detachable STRING_32
      -- 
    updated_at_transaction: detachable STRING_32
      -- 
    executed: detachable STRING_32
      -- 
    executed_at_block: detachable STRING_32
      -- 
    executed_at_transaction: detachable STRING_32
      -- 
 	vid: INTEGER_64
    	 -- 

feature -- Change Element

    set_entry_time (a_name: like entry_time)
        -- Set 'entry_time' with 'a_name'.
      do
        entry_time := a_name
      ensure
        entry_time_set: entry_time = a_name
      end

    set_recv_time (a_name: like recv_time)
        -- Set 'recv_time' with 'a_name'.
      do
        recv_time := a_name
      ensure
        recv_time_set: recv_time = a_name
      end

    set_block_number (a_name: like block_number)
        -- Set 'block_number' with 'a_name'.
      do
        block_number := a_name
      ensure
        block_number_set: block_number = a_name
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_number (a_name: like number)
        -- Set 'number' with 'a_name'.
      do
        number := a_name
      ensure
        number_set: number = a_name
      end

    set_app (a_name: like app)
        -- Set 'app' with 'a_name'.
      do
        app := a_name
      ensure
        app_set: app = a_name
      end

    set_creator (a_name: like creator)
        -- Set 'creator' with 'a_name'.
      do
        creator := a_name
      ensure
        creator_set: creator = a_name
      end

    set_execution_script (a_name: like execution_script)
        -- Set 'execution_script' with 'a_name'.
      do
        execution_script := a_name
      ensure
        execution_script_set: execution_script = a_name
      end

    set_expire_date (a_name: like expire_date)
        -- Set 'expire_date' with 'a_name'.
      do
        expire_date := a_name
      ensure
        expire_date_set: expire_date = a_name
      end

    set_minimum_quorum (a_name: like minimum_quorum)
        -- Set 'minimum_quorum' with 'a_name'.
      do
        minimum_quorum := a_name
      ensure
        minimum_quorum_set: minimum_quorum = a_name
      end

    set_required_support (a_name: like required_support)
        -- Set 'required_support' with 'a_name'.
      do
        required_support := a_name
      ensure
        required_support_set: required_support = a_name
      end

    set_snapshot_block (a_name: like snapshot_block)
        -- Set 'snapshot_block' with 'a_name'.
      do
        snapshot_block := a_name
      ensure
        snapshot_block_set: snapshot_block = a_name
      end

    set_voting_power (a_name: like voting_power)
        -- Set 'voting_power' with 'a_name'.
      do
        voting_power := a_name
      ensure
        voting_power_set: voting_power = a_name
      end

    set_metadata (a_name: like metadata)
        -- Set 'metadata' with 'a_name'.
      do
        metadata := a_name
      ensure
        metadata_set: metadata = a_name
      end

    set_text (a_name: like text)
        -- Set 'text' with 'a_name'.
      do
        text := a_name
      ensure
        text_set: text = a_name
      end

    set_vote_count (a_name: like vote_count)
        -- Set 'vote_count' with 'a_name'.
      do
        vote_count := a_name
      ensure
        vote_count_set: vote_count = a_name
      end

    set_positive_vote_count (a_name: like positive_vote_count)
        -- Set 'positive_vote_count' with 'a_name'.
      do
        positive_vote_count := a_name
      ensure
        positive_vote_count_set: positive_vote_count = a_name
      end

    set_negative_vote_count (a_name: like negative_vote_count)
        -- Set 'negative_vote_count' with 'a_name'.
      do
        negative_vote_count := a_name
      ensure
        negative_vote_count_set: negative_vote_count = a_name
      end

    set_current_quorum (a_name: like current_quorum)
        -- Set 'current_quorum' with 'a_name'.
      do
        current_quorum := a_name
      ensure
        current_quorum_set: current_quorum = a_name
      end

    set_current_support (a_name: like current_support)
        -- Set 'current_support' with 'a_name'.
      do
        current_support := a_name
      ensure
        current_support_set: current_support = a_name
      end

    set_staked_support (a_name: like staked_support)
        -- Set 'staked_support' with 'a_name'.
      do
        staked_support := a_name
      ensure
        staked_support_set: staked_support = a_name
      end

    set_total_staked (a_name: like total_staked)
        -- Set 'total_staked' with 'a_name'.
      do
        total_staked := a_name
      ensure
        total_staked_set: total_staked = a_name
      end

    set_created (a_name: like created)
        -- Set 'created' with 'a_name'.
      do
        created := a_name
      ensure
        created_set: created = a_name
      end

    set_created_at_block (a_name: like created_at_block)
        -- Set 'created_at_block' with 'a_name'.
      do
        created_at_block := a_name
      ensure
        created_at_block_set: created_at_block = a_name
      end

    set_created_at_transaction (a_name: like created_at_transaction)
        -- Set 'created_at_transaction' with 'a_name'.
      do
        created_at_transaction := a_name
      ensure
        created_at_transaction_set: created_at_transaction = a_name
      end

    set_updated (a_name: like updated)
        -- Set 'updated' with 'a_name'.
      do
        updated := a_name
      ensure
        updated_set: updated = a_name
      end

    set_updated_at_block (a_name: like updated_at_block)
        -- Set 'updated_at_block' with 'a_name'.
      do
        updated_at_block := a_name
      ensure
        updated_at_block_set: updated_at_block = a_name
      end

    set_updated_at_transaction (a_name: like updated_at_transaction)
        -- Set 'updated_at_transaction' with 'a_name'.
      do
        updated_at_transaction := a_name
      ensure
        updated_at_transaction_set: updated_at_transaction = a_name
      end

    set_executed (a_name: like executed)
        -- Set 'executed' with 'a_name'.
      do
        executed := a_name
      ensure
        executed_set: executed = a_name
      end

    set_executed_at_block (a_name: like executed_at_block)
        -- Set 'executed_at_block' with 'a_name'.
      do
        executed_at_block := a_name
      ensure
        executed_at_block_set: executed_at_block = a_name
      end

    set_executed_at_transaction (a_name: like executed_at_transaction)
        -- Set 'executed_at_transaction' with 'a_name'.
      do
        executed_at_transaction := a_name
      ensure
        executed_at_transaction_set: executed_at_transaction = a_name
      end

    set_vid (a_name: like vid)
        -- Set 'vid' with 'a_name'.
      do
        vid := a_name
      ensure
        vid_set: vid = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CURVE_PROPOSAL_DTO%N")
        if attached entry_time as l_entry_time then
          Result.append ("%Nentry_time:")
          Result.append (l_entry_time.out)
          Result.append ("%N")
        end
        if attached recv_time as l_recv_time then
          Result.append ("%Nrecv_time:")
          Result.append (l_recv_time.out)
          Result.append ("%N")
        end
        if attached block_number as l_block_number then
          Result.append ("%Nblock_number:")
          Result.append (l_block_number.out)
          Result.append ("%N")
        end
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached number as l_number then
          Result.append ("%Nnumber:")
          Result.append (l_number.out)
          Result.append ("%N")
        end
        if attached app as l_app then
          Result.append ("%Napp:")
          Result.append (l_app.out)
          Result.append ("%N")
        end
        if attached creator as l_creator then
          Result.append ("%Ncreator:")
          Result.append (l_creator.out)
          Result.append ("%N")
        end
        if attached execution_script as l_execution_script then
          Result.append ("%Nexecution_script:")
          Result.append (l_execution_script.out)
          Result.append ("%N")
        end
        if attached expire_date as l_expire_date then
          Result.append ("%Nexpire_date:")
          Result.append (l_expire_date.out)
          Result.append ("%N")
        end
        if attached minimum_quorum as l_minimum_quorum then
          Result.append ("%Nminimum_quorum:")
          Result.append (l_minimum_quorum.out)
          Result.append ("%N")
        end
        if attached required_support as l_required_support then
          Result.append ("%Nrequired_support:")
          Result.append (l_required_support.out)
          Result.append ("%N")
        end
        if attached snapshot_block as l_snapshot_block then
          Result.append ("%Nsnapshot_block:")
          Result.append (l_snapshot_block.out)
          Result.append ("%N")
        end
        if attached voting_power as l_voting_power then
          Result.append ("%Nvoting_power:")
          Result.append (l_voting_power.out)
          Result.append ("%N")
        end
        if attached metadata as l_metadata then
          Result.append ("%Nmetadata:")
          Result.append (l_metadata.out)
          Result.append ("%N")
        end
        if attached text as l_text then
          Result.append ("%Ntext:")
          Result.append (l_text.out)
          Result.append ("%N")
        end
        if attached vote_count as l_vote_count then
          Result.append ("%Nvote_count:")
          Result.append (l_vote_count.out)
          Result.append ("%N")
        end
        if attached positive_vote_count as l_positive_vote_count then
          Result.append ("%Npositive_vote_count:")
          Result.append (l_positive_vote_count.out)
          Result.append ("%N")
        end
        if attached negative_vote_count as l_negative_vote_count then
          Result.append ("%Nnegative_vote_count:")
          Result.append (l_negative_vote_count.out)
          Result.append ("%N")
        end
        if attached current_quorum as l_current_quorum then
          Result.append ("%Ncurrent_quorum:")
          Result.append (l_current_quorum.out)
          Result.append ("%N")
        end
        if attached current_support as l_current_support then
          Result.append ("%Ncurrent_support:")
          Result.append (l_current_support.out)
          Result.append ("%N")
        end
        if attached staked_support as l_staked_support then
          Result.append ("%Nstaked_support:")
          Result.append (l_staked_support.out)
          Result.append ("%N")
        end
        if attached total_staked as l_total_staked then
          Result.append ("%Ntotal_staked:")
          Result.append (l_total_staked.out)
          Result.append ("%N")
        end
        if attached created as l_created then
          Result.append ("%Ncreated:")
          Result.append (l_created.out)
          Result.append ("%N")
        end
        if attached created_at_block as l_created_at_block then
          Result.append ("%Ncreated_at_block:")
          Result.append (l_created_at_block.out)
          Result.append ("%N")
        end
        if attached created_at_transaction as l_created_at_transaction then
          Result.append ("%Ncreated_at_transaction:")
          Result.append (l_created_at_transaction.out)
          Result.append ("%N")
        end
        if attached updated as l_updated then
          Result.append ("%Nupdated:")
          Result.append (l_updated.out)
          Result.append ("%N")
        end
        if attached updated_at_block as l_updated_at_block then
          Result.append ("%Nupdated_at_block:")
          Result.append (l_updated_at_block.out)
          Result.append ("%N")
        end
        if attached updated_at_transaction as l_updated_at_transaction then
          Result.append ("%Nupdated_at_transaction:")
          Result.append (l_updated_at_transaction.out)
          Result.append ("%N")
        end
        if attached executed as l_executed then
          Result.append ("%Nexecuted:")
          Result.append (l_executed.out)
          Result.append ("%N")
        end
        if attached executed_at_block as l_executed_at_block then
          Result.append ("%Nexecuted_at_block:")
          Result.append (l_executed_at_block.out)
          Result.append ("%N")
        end
        if attached executed_at_transaction as l_executed_at_transaction then
          Result.append ("%Nexecuted_at_transaction:")
          Result.append (l_executed_at_transaction.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end

