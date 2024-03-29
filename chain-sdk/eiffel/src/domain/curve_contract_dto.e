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
class CURVE_CONTRACT_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- 
    description: detachable STRING_32
      -- Human-readable description.
    added: detachable STRING_32
      -- 
    added_at_block: detachable STRING_32
      -- 
    added_at_transaction: detachable STRING_32
      -- 
    modified: detachable STRING_32
      -- 
    modified_at_block: detachable STRING_32
      -- 
    modified_at_transaction: detachable STRING_32
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

    set_description (a_name: like description)
        -- Set 'description' with 'a_name'.
      do
        description := a_name
      ensure
        description_set: description = a_name
      end

    set_added (a_name: like added)
        -- Set 'added' with 'a_name'.
      do
        added := a_name
      ensure
        added_set: added = a_name
      end

    set_added_at_block (a_name: like added_at_block)
        -- Set 'added_at_block' with 'a_name'.
      do
        added_at_block := a_name
      ensure
        added_at_block_set: added_at_block = a_name
      end

    set_added_at_transaction (a_name: like added_at_transaction)
        -- Set 'added_at_transaction' with 'a_name'.
      do
        added_at_transaction := a_name
      ensure
        added_at_transaction_set: added_at_transaction = a_name
      end

    set_modified (a_name: like modified)
        -- Set 'modified' with 'a_name'.
      do
        modified := a_name
      ensure
        modified_set: modified = a_name
      end

    set_modified_at_block (a_name: like modified_at_block)
        -- Set 'modified_at_block' with 'a_name'.
      do
        modified_at_block := a_name
      ensure
        modified_at_block_set: modified_at_block = a_name
      end

    set_modified_at_transaction (a_name: like modified_at_transaction)
        -- Set 'modified_at_transaction' with 'a_name'.
      do
        modified_at_transaction := a_name
      ensure
        modified_at_transaction_set: modified_at_transaction = a_name
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
        Result.append("%Nclass CURVE_CONTRACT_DTO%N")
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
        if attached description as l_description then
          Result.append ("%Ndescription:")
          Result.append (l_description.out)
          Result.append ("%N")
        end
        if attached added as l_added then
          Result.append ("%Nadded:")
          Result.append (l_added.out)
          Result.append ("%N")
        end
        if attached added_at_block as l_added_at_block then
          Result.append ("%Nadded_at_block:")
          Result.append (l_added_at_block.out)
          Result.append ("%N")
        end
        if attached added_at_transaction as l_added_at_transaction then
          Result.append ("%Nadded_at_transaction:")
          Result.append (l_added_at_transaction.out)
          Result.append ("%N")
        end
        if attached modified as l_modified then
          Result.append ("%Nmodified:")
          Result.append (l_modified.out)
          Result.append ("%N")
        end
        if attached modified_at_block as l_modified_at_block then
          Result.append ("%Nmodified_at_block:")
          Result.append (l_modified_at_block.out)
          Result.append ("%N")
        end
        if attached modified_at_transaction as l_modified_at_transaction then
          Result.append ("%Nmodified_at_transaction:")
          Result.append (l_modified_at_transaction.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end

