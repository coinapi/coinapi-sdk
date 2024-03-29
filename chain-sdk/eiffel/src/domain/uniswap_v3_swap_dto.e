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
class UNISWAP_V3_SWAP_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
 	vid: INTEGER_64
    	 -- 
    id: detachable STRING_32
      -- Identifier, format: (transaction hash) + # + (index in swaps Transaction array).
    transaction: detachable STRING_32
      -- Pointer to transaction.
    timestamp: detachable DATE_TIME
      -- Timestamp of transaction.
    pool: detachable STRING_32
      -- Pool swap occured within.
    token_0: detachable STRING_32
      -- Reference to token0 as stored in pair contract.
    token_1: detachable STRING_32
      -- Reference to token1 as stored in pair contract.
    sender: detachable STRING_32
      -- Sender of the swap.
    recipient: detachable STRING_32
      -- Recipient of the swap.
    origin: detachable STRING_32
      -- Transaction origin: the EOA (Externally Owned Account) that initiated the transaction
    amount_0: detachable STRING_32
      -- Delta of token0 swapped.
    amount_1: detachable STRING_32
      -- Delta of token1 swapped.
    amount_usd: detachable STRING_32
      -- Derived amount of tokens sold in USD.
    sqrt_price_x96: detachable NUMERICS_BIG_INTEGER
      
    tick: detachable NUMERICS_BIG_INTEGER
      
    log_index: detachable NUMERICS_BIG_INTEGER
      
 	evaluated_price: REAL_64
    	 
 	evaluated_amount: REAL_64
    	 
    evaluated_aggressor: detachable TRANSACTIONS_E_TRADE_AGGRESSIVE_SIDE
      
    pool_id: detachable STRING_32
      
    transaction_id: detachable STRING_32
      

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

    set_vid (a_name: like vid)
        -- Set 'vid' with 'a_name'.
      do
        vid := a_name
      ensure
        vid_set: vid = a_name
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

    set_sender (a_name: like sender)
        -- Set 'sender' with 'a_name'.
      do
        sender := a_name
      ensure
        sender_set: sender = a_name
      end

    set_recipient (a_name: like recipient)
        -- Set 'recipient' with 'a_name'.
      do
        recipient := a_name
      ensure
        recipient_set: recipient = a_name
      end

    set_origin (a_name: like origin)
        -- Set 'origin' with 'a_name'.
      do
        origin := a_name
      ensure
        origin_set: origin = a_name
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

    set_sqrt_price_x96 (a_name: like sqrt_price_x96)
        -- Set 'sqrt_price_x96' with 'a_name'.
      do
        sqrt_price_x96 := a_name
      ensure
        sqrt_price_x96_set: sqrt_price_x96 = a_name
      end

    set_tick (a_name: like tick)
        -- Set 'tick' with 'a_name'.
      do
        tick := a_name
      ensure
        tick_set: tick = a_name
      end

    set_log_index (a_name: like log_index)
        -- Set 'log_index' with 'a_name'.
      do
        log_index := a_name
      ensure
        log_index_set: log_index = a_name
      end

    set_evaluated_price (a_name: like evaluated_price)
        -- Set 'evaluated_price' with 'a_name'.
      do
        evaluated_price := a_name
      ensure
        evaluated_price_set: evaluated_price = a_name
      end

    set_evaluated_amount (a_name: like evaluated_amount)
        -- Set 'evaluated_amount' with 'a_name'.
      do
        evaluated_amount := a_name
      ensure
        evaluated_amount_set: evaluated_amount = a_name
      end

    set_evaluated_aggressor (a_name: like evaluated_aggressor)
        -- Set 'evaluated_aggressor' with 'a_name'.
      do
        evaluated_aggressor := a_name
      ensure
        evaluated_aggressor_set: evaluated_aggressor = a_name
      end

    set_pool_id (a_name: like pool_id)
        -- Set 'pool_id' with 'a_name'.
      do
        pool_id := a_name
      ensure
        pool_id_set: pool_id = a_name
      end

    set_transaction_id (a_name: like transaction_id)
        -- Set 'transaction_id' with 'a_name'.
      do
        transaction_id := a_name
      ensure
        transaction_id_set: transaction_id = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UNISWAP_V3_SWAP_DTO%N")
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
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
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
        if attached sender as l_sender then
          Result.append ("%Nsender:")
          Result.append (l_sender.out)
          Result.append ("%N")
        end
        if attached recipient as l_recipient then
          Result.append ("%Nrecipient:")
          Result.append (l_recipient.out)
          Result.append ("%N")
        end
        if attached origin as l_origin then
          Result.append ("%Norigin:")
          Result.append (l_origin.out)
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
        if attached sqrt_price_x96 as l_sqrt_price_x96 then
          Result.append ("%Nsqrt_price_x96:")
          Result.append (l_sqrt_price_x96.out)
          Result.append ("%N")
        end
        if attached tick as l_tick then
          Result.append ("%Ntick:")
          Result.append (l_tick.out)
          Result.append ("%N")
        end
        if attached log_index as l_log_index then
          Result.append ("%Nlog_index:")
          Result.append (l_log_index.out)
          Result.append ("%N")
        end
        if attached evaluated_price as l_evaluated_price then
          Result.append ("%Nevaluated_price:")
          Result.append (l_evaluated_price.out)
          Result.append ("%N")
        end
        if attached evaluated_amount as l_evaluated_amount then
          Result.append ("%Nevaluated_amount:")
          Result.append (l_evaluated_amount.out)
          Result.append ("%N")
        end
        if attached evaluated_aggressor as l_evaluated_aggressor then
          Result.append ("%Nevaluated_aggressor:")
          Result.append (l_evaluated_aggressor.out)
          Result.append ("%N")
        end
        if attached pool_id as l_pool_id then
          Result.append ("%Npool_id:")
          Result.append (l_pool_id.out)
          Result.append ("%N")
        end
        if attached transaction_id as l_transaction_id then
          Result.append ("%Ntransaction_id:")
          Result.append (l_transaction_id.out)
          Result.append ("%N")
        end
      end
end

