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
class UNISWAP_V3_MINT_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- Transaction hash + '#' + index in mints Transaction array.
    transaction: detachable STRING_32
      -- Which txn the mint was included in.
    timestamp: detachable STRING_32
      -- Time of transaction.
    pool: detachable STRING_32
      -- Pool address.
    token_0: detachable STRING_32
      -- Reference to token0 as stored in pool contract.
    token_1: detachable STRING_32
      -- Reference to token1 as stored in pool contract.
    owner: detachable STRING_32
      -- Owner of position where liquidity minted to.
    sender: detachable STRING_32
      -- The address that minted the liquidity.
    origin: detachable STRING_32
      -- Transaction origin: the EOA (Externally Owned Account) that initiated the transaction.
    amount: detachable STRING_32
      -- Amount of liquidity minted.
    amount_0: detachable STRING_32
      -- Amount of token 0 minted.
    amount_1: detachable STRING_32
      -- Amount of token 1 minted.
    amount_usd: detachable STRING_32
      -- Derived amount based on available prices of tokens.
    tick_lower: detachable STRING_32
      -- Lower tick of the position.
    tick_upper: detachable STRING_32
      -- Upper tick of the position.
    log_index: detachable STRING_32
      -- Order within the transaction.
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

    set_transaction (a_name: like transaction)
        -- Set 'transaction' with 'a_name'.
      do
        transaction := a_name
      ensure
        transaction_set: transaction = a_name
      end

    set_timestamp (a_name: like timestamp)
        -- Set 'timestamp' with 'a_name'.
      do
        timestamp := a_name
      ensure
        timestamp_set: timestamp = a_name
      end

    set_pool (a_name: like pool)
        -- Set 'pool' with 'a_name'.
      do
        pool := a_name
      ensure
        pool_set: pool = a_name
      end

    set_token_0 (a_name: like token_0)
        -- Set 'token_0' with 'a_name'.
      do
        token_0 := a_name
      ensure
        token_0_set: token_0 = a_name
      end

    set_token_1 (a_name: like token_1)
        -- Set 'token_1' with 'a_name'.
      do
        token_1 := a_name
      ensure
        token_1_set: token_1 = a_name
      end

    set_owner (a_name: like owner)
        -- Set 'owner' with 'a_name'.
      do
        owner := a_name
      ensure
        owner_set: owner = a_name
      end

    set_sender (a_name: like sender)
        -- Set 'sender' with 'a_name'.
      do
        sender := a_name
      ensure
        sender_set: sender = a_name
      end

    set_origin (a_name: like origin)
        -- Set 'origin' with 'a_name'.
      do
        origin := a_name
      ensure
        origin_set: origin = a_name
      end

    set_amount (a_name: like amount)
        -- Set 'amount' with 'a_name'.
      do
        amount := a_name
      ensure
        amount_set: amount = a_name
      end

    set_amount_0 (a_name: like amount_0)
        -- Set 'amount_0' with 'a_name'.
      do
        amount_0 := a_name
      ensure
        amount_0_set: amount_0 = a_name
      end

    set_amount_1 (a_name: like amount_1)
        -- Set 'amount_1' with 'a_name'.
      do
        amount_1 := a_name
      ensure
        amount_1_set: amount_1 = a_name
      end

    set_amount_usd (a_name: like amount_usd)
        -- Set 'amount_usd' with 'a_name'.
      do
        amount_usd := a_name
      ensure
        amount_usd_set: amount_usd = a_name
      end

    set_tick_lower (a_name: like tick_lower)
        -- Set 'tick_lower' with 'a_name'.
      do
        tick_lower := a_name
      ensure
        tick_lower_set: tick_lower = a_name
      end

    set_tick_upper (a_name: like tick_upper)
        -- Set 'tick_upper' with 'a_name'.
      do
        tick_upper := a_name
      ensure
        tick_upper_set: tick_upper = a_name
      end

    set_log_index (a_name: like log_index)
        -- Set 'log_index' with 'a_name'.
      do
        log_index := a_name
      ensure
        log_index_set: log_index = a_name
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
        Result.append("%Nclass UNISWAP_V3_MINT_DTO%N")
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
        if attached transaction as l_transaction then
          Result.append ("%Ntransaction:")
          Result.append (l_transaction.out)
          Result.append ("%N")
        end
        if attached timestamp as l_timestamp then
          Result.append ("%Ntimestamp:")
          Result.append (l_timestamp.out)
          Result.append ("%N")
        end
        if attached pool as l_pool then
          Result.append ("%Npool:")
          Result.append (l_pool.out)
          Result.append ("%N")
        end
        if attached token_0 as l_token_0 then
          Result.append ("%Ntoken_0:")
          Result.append (l_token_0.out)
          Result.append ("%N")
        end
        if attached token_1 as l_token_1 then
          Result.append ("%Ntoken_1:")
          Result.append (l_token_1.out)
          Result.append ("%N")
        end
        if attached owner as l_owner then
          Result.append ("%Nowner:")
          Result.append (l_owner.out)
          Result.append ("%N")
        end
        if attached sender as l_sender then
          Result.append ("%Nsender:")
          Result.append (l_sender.out)
          Result.append ("%N")
        end
        if attached origin as l_origin then
          Result.append ("%Norigin:")
          Result.append (l_origin.out)
          Result.append ("%N")
        end
        if attached amount as l_amount then
          Result.append ("%Namount:")
          Result.append (l_amount.out)
          Result.append ("%N")
        end
        if attached amount_0 as l_amount_0 then
          Result.append ("%Namount_0:")
          Result.append (l_amount_0.out)
          Result.append ("%N")
        end
        if attached amount_1 as l_amount_1 then
          Result.append ("%Namount_1:")
          Result.append (l_amount_1.out)
          Result.append ("%N")
        end
        if attached amount_usd as l_amount_usd then
          Result.append ("%Namount_usd:")
          Result.append (l_amount_usd.out)
          Result.append ("%N")
        end
        if attached tick_lower as l_tick_lower then
          Result.append ("%Ntick_lower:")
          Result.append (l_tick_lower.out)
          Result.append ("%N")
        end
        if attached tick_upper as l_tick_upper then
          Result.append ("%Ntick_upper:")
          Result.append (l_tick_upper.out)
          Result.append ("%N")
        end
        if attached log_index as l_log_index then
          Result.append ("%Nlog_index:")
          Result.append (l_log_index.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end

