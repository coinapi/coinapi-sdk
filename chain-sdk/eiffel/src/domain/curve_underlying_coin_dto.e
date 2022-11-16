note
 description:"[
		OnChain API
 		 This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class CURVE_UNDERLYING_COIN_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- Equals to: <pool_id>-<coin_index>.
 	index: INTEGER_32
    	 -- Coin index.
    pool: detachable STRING_32
      -- 
    token: detachable STRING_32
      -- 
    coin: detachable STRING_32
      -- 
    balance: detachable STRING_32
      -- 
    updated: detachable STRING_32
      -- 
    updated_at_block: detachable STRING_32
      -- 
    updated_at_transaction: detachable STRING_32
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

    set_index (a_name: like index)
        -- Set 'index' with 'a_name'.
      do
        index := a_name
      ensure
        index_set: index = a_name
      end

    set_pool (a_name: like pool)
        -- Set 'pool' with 'a_name'.
      do
        pool := a_name
      ensure
        pool_set: pool = a_name
      end

    set_token (a_name: like token)
        -- Set 'token' with 'a_name'.
      do
        token := a_name
      ensure
        token_set: token = a_name
      end

    set_coin (a_name: like coin)
        -- Set 'coin' with 'a_name'.
      do
        coin := a_name
      ensure
        coin_set: coin = a_name
      end

    set_balance (a_name: like balance)
        -- Set 'balance' with 'a_name'.
      do
        balance := a_name
      ensure
        balance_set: balance = a_name
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
        Result.append("%Nclass CURVE_UNDERLYING_COIN_DTO%N")
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
        if attached index as l_index then
          Result.append ("%Nindex:")
          Result.append (l_index.out)
          Result.append ("%N")
        end
        if attached pool as l_pool then
          Result.append ("%Npool:")
          Result.append (l_pool.out)
          Result.append ("%N")
        end
        if attached token as l_token then
          Result.append ("%Ntoken:")
          Result.append (l_token.out)
          Result.append ("%N")
        end
        if attached coin as l_coin then
          Result.append ("%Ncoin:")
          Result.append (l_coin.out)
          Result.append ("%N")
        end
        if attached balance as l_balance then
          Result.append ("%Nbalance:")
          Result.append (l_balance.out)
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
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end

