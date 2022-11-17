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
class DEX_TRADE_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- 
    order: detachable STRING_32
      -- 
    owner: detachable STRING_32
      -- 
    sell_volume: detachable STRING_32
      -- 
    buy_volume: detachable STRING_32
      -- 
    trade_batch_id: detachable STRING_32
      -- 
    trade_epoch: detachable STRING_32
      -- The date of the end of the batch.
    buy_token: detachable STRING_32
      -- 
    sell_token: detachable STRING_32
      -- 
    create_epoch: detachable STRING_32
      -- The date where the transaction was mined.
    revert_epoch: detachable STRING_32
      -- 
    tx_hash: detachable STRING_32
      -- 
    tx_log_index: detachable STRING_32
      -- 
 	vid: INTEGER_64
    	 -- 
    pool_id: detachable STRING_32
      
    transaction_id: detachable STRING_32
      
 	evaluated_price: REAL_64
    	 
 	evaluated_amount: REAL_64
    	 
    evaluated_aggressor: detachable TRANSACTIONS_E_TRADE_AGGRESSIVE_SIDE
      

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

    set_order (a_name: like order)
        -- Set 'order' with 'a_name'.
      do
        order := a_name
      ensure
        order_set: order = a_name
      end

    set_owner (a_name: like owner)
        -- Set 'owner' with 'a_name'.
      do
        owner := a_name
      ensure
        owner_set: owner = a_name
      end

    set_sell_volume (a_name: like sell_volume)
        -- Set 'sell_volume' with 'a_name'.
      do
        sell_volume := a_name
      ensure
        sell_volume_set: sell_volume = a_name
      end

    set_buy_volume (a_name: like buy_volume)
        -- Set 'buy_volume' with 'a_name'.
      do
        buy_volume := a_name
      ensure
        buy_volume_set: buy_volume = a_name
      end

    set_trade_batch_id (a_name: like trade_batch_id)
        -- Set 'trade_batch_id' with 'a_name'.
      do
        trade_batch_id := a_name
      ensure
        trade_batch_id_set: trade_batch_id = a_name
      end

    set_trade_epoch (a_name: like trade_epoch)
        -- Set 'trade_epoch' with 'a_name'.
      do
        trade_epoch := a_name
      ensure
        trade_epoch_set: trade_epoch = a_name
      end

    set_buy_token (a_name: like buy_token)
        -- Set 'buy_token' with 'a_name'.
      do
        buy_token := a_name
      ensure
        buy_token_set: buy_token = a_name
      end

    set_sell_token (a_name: like sell_token)
        -- Set 'sell_token' with 'a_name'.
      do
        sell_token := a_name
      ensure
        sell_token_set: sell_token = a_name
      end

    set_create_epoch (a_name: like create_epoch)
        -- Set 'create_epoch' with 'a_name'.
      do
        create_epoch := a_name
      ensure
        create_epoch_set: create_epoch = a_name
      end

    set_revert_epoch (a_name: like revert_epoch)
        -- Set 'revert_epoch' with 'a_name'.
      do
        revert_epoch := a_name
      ensure
        revert_epoch_set: revert_epoch = a_name
      end

    set_tx_hash (a_name: like tx_hash)
        -- Set 'tx_hash' with 'a_name'.
      do
        tx_hash := a_name
      ensure
        tx_hash_set: tx_hash = a_name
      end

    set_tx_log_index (a_name: like tx_log_index)
        -- Set 'tx_log_index' with 'a_name'.
      do
        tx_log_index := a_name
      ensure
        tx_log_index_set: tx_log_index = a_name
      end

    set_vid (a_name: like vid)
        -- Set 'vid' with 'a_name'.
      do
        vid := a_name
      ensure
        vid_set: vid = a_name
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


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass DEX_TRADE_DTO%N")
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
        if attached order as l_order then
          Result.append ("%Norder:")
          Result.append (l_order.out)
          Result.append ("%N")
        end
        if attached owner as l_owner then
          Result.append ("%Nowner:")
          Result.append (l_owner.out)
          Result.append ("%N")
        end
        if attached sell_volume as l_sell_volume then
          Result.append ("%Nsell_volume:")
          Result.append (l_sell_volume.out)
          Result.append ("%N")
        end
        if attached buy_volume as l_buy_volume then
          Result.append ("%Nbuy_volume:")
          Result.append (l_buy_volume.out)
          Result.append ("%N")
        end
        if attached trade_batch_id as l_trade_batch_id then
          Result.append ("%Ntrade_batch_id:")
          Result.append (l_trade_batch_id.out)
          Result.append ("%N")
        end
        if attached trade_epoch as l_trade_epoch then
          Result.append ("%Ntrade_epoch:")
          Result.append (l_trade_epoch.out)
          Result.append ("%N")
        end
        if attached buy_token as l_buy_token then
          Result.append ("%Nbuy_token:")
          Result.append (l_buy_token.out)
          Result.append ("%N")
        end
        if attached sell_token as l_sell_token then
          Result.append ("%Nsell_token:")
          Result.append (l_sell_token.out)
          Result.append ("%N")
        end
        if attached create_epoch as l_create_epoch then
          Result.append ("%Ncreate_epoch:")
          Result.append (l_create_epoch.out)
          Result.append ("%N")
        end
        if attached revert_epoch as l_revert_epoch then
          Result.append ("%Nrevert_epoch:")
          Result.append (l_revert_epoch.out)
          Result.append ("%N")
        end
        if attached tx_hash as l_tx_hash then
          Result.append ("%Ntx_hash:")
          Result.append (l_tx_hash.out)
          Result.append ("%N")
        end
        if attached tx_log_index as l_tx_log_index then
          Result.append ("%Ntx_log_index:")
          Result.append (l_tx_log_index.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
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
      end
end
