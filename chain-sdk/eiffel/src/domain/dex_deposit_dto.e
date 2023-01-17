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
class DEX_DEPOSIT_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- Identifier, format: (transaction hash)-(token id).
    user: detachable STRING_32
      -- User address.
    token_address: detachable STRING_32
      -- Token address.
    amount: detachable STRING_32
      -- Amount of deposit.
    batch_id: detachable STRING_32
      -- Identifier (numerical).
    create_epoch: detachable STRING_32
      -- Create epoch.
    tx_hash: detachable STRING_32
      -- Transaction hash.
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

    set_user (a_name: like user)
        -- Set 'user' with 'a_name'.
      do
        user := a_name
      ensure
        user_set: user = a_name
      end

    set_token_address (a_name: like token_address)
        -- Set 'token_address' with 'a_name'.
      do
        token_address := a_name
      ensure
        token_address_set: token_address = a_name
      end

    set_amount (a_name: like amount)
        -- Set 'amount' with 'a_name'.
      do
        amount := a_name
      ensure
        amount_set: amount = a_name
      end

    set_batch_id (a_name: like batch_id)
        -- Set 'batch_id' with 'a_name'.
      do
        batch_id := a_name
      ensure
        batch_id_set: batch_id = a_name
      end

    set_create_epoch (a_name: like create_epoch)
        -- Set 'create_epoch' with 'a_name'.
      do
        create_epoch := a_name
      ensure
        create_epoch_set: create_epoch = a_name
      end

    set_tx_hash (a_name: like tx_hash)
        -- Set 'tx_hash' with 'a_name'.
      do
        tx_hash := a_name
      ensure
        tx_hash_set: tx_hash = a_name
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
        Result.append("%Nclass DEX_DEPOSIT_DTO%N")
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
        if attached user as l_user then
          Result.append ("%Nuser:")
          Result.append (l_user.out)
          Result.append ("%N")
        end
        if attached token_address as l_token_address then
          Result.append ("%Ntoken_address:")
          Result.append (l_token_address.out)
          Result.append ("%N")
        end
        if attached amount as l_amount then
          Result.append ("%Namount:")
          Result.append (l_amount.out)
          Result.append ("%N")
        end
        if attached batch_id as l_batch_id then
          Result.append ("%Nbatch_id:")
          Result.append (l_batch_id.out)
          Result.append ("%N")
        end
        if attached create_epoch as l_create_epoch then
          Result.append ("%Ncreate_epoch:")
          Result.append (l_create_epoch.out)
          Result.append ("%N")
        end
        if attached tx_hash as l_tx_hash then
          Result.append ("%Ntx_hash:")
          Result.append (l_tx_hash.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end

