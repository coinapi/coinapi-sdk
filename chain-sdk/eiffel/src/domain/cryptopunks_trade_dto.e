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
class CRYPTOPUNKS_TRADE_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
    block_number: detachable STRING_32
      -- 
 	vid: INTEGER_64
    	 -- 
    block_range: detachable STRING_32
      -- 
    id: detachable STRING_32
      -- 
    transaction_hash: detachable STRING_32
      -- 
 	log_index: INTEGER_32
    	 -- 
    timestamp: detachable STRING_32
      -- 
 	is_bundle: BOOLEAN
    	 -- 
    collection: detachable STRING_32
      -- 
    token_id: detachable STRING_32
      -- 
    amount: detachable STRING_32
      -- 
    price_eth: detachable STRING_32
      -- 
    buyer: detachable STRING_32
      -- 
    seller: detachable STRING_32
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

    set_vid (a_name: like vid)
        -- Set 'vid' with 'a_name'.
      do
        vid := a_name
      ensure
        vid_set: vid = a_name
      end

    set_block_range (a_name: like block_range)
        -- Set 'block_range' with 'a_name'.
      do
        block_range := a_name
      ensure
        block_range_set: block_range = a_name
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_transaction_hash (a_name: like transaction_hash)
        -- Set 'transaction_hash' with 'a_name'.
      do
        transaction_hash := a_name
      ensure
        transaction_hash_set: transaction_hash = a_name
      end

    set_log_index (a_name: like log_index)
        -- Set 'log_index' with 'a_name'.
      do
        log_index := a_name
      ensure
        log_index_set: log_index = a_name
      end

    set_timestamp (a_name: like timestamp)
        -- Set 'timestamp' with 'a_name'.
      do
        timestamp := a_name
      ensure
        timestamp_set: timestamp = a_name
      end

    set_is_bundle (a_name: like is_bundle)
        -- Set 'is_bundle' with 'a_name'.
      do
        is_bundle := a_name
      ensure
        is_bundle_set: is_bundle = a_name
      end

    set_collection (a_name: like collection)
        -- Set 'collection' with 'a_name'.
      do
        collection := a_name
      ensure
        collection_set: collection = a_name
      end

    set_token_id (a_name: like token_id)
        -- Set 'token_id' with 'a_name'.
      do
        token_id := a_name
      ensure
        token_id_set: token_id = a_name
      end

    set_amount (a_name: like amount)
        -- Set 'amount' with 'a_name'.
      do
        amount := a_name
      ensure
        amount_set: amount = a_name
      end

    set_price_eth (a_name: like price_eth)
        -- Set 'price_eth' with 'a_name'.
      do
        price_eth := a_name
      ensure
        price_eth_set: price_eth = a_name
      end

    set_buyer (a_name: like buyer)
        -- Set 'buyer' with 'a_name'.
      do
        buyer := a_name
      ensure
        buyer_set: buyer = a_name
      end

    set_seller (a_name: like seller)
        -- Set 'seller' with 'a_name'.
      do
        seller := a_name
      ensure
        seller_set: seller = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CRYPTOPUNKS_TRADE_DTO%N")
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
        if attached block_range as l_block_range then
          Result.append ("%Nblock_range:")
          Result.append (l_block_range.out)
          Result.append ("%N")
        end
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached transaction_hash as l_transaction_hash then
          Result.append ("%Ntransaction_hash:")
          Result.append (l_transaction_hash.out)
          Result.append ("%N")
        end
        if attached log_index as l_log_index then
          Result.append ("%Nlog_index:")
          Result.append (l_log_index.out)
          Result.append ("%N")
        end
        if attached timestamp as l_timestamp then
          Result.append ("%Ntimestamp:")
          Result.append (l_timestamp.out)
          Result.append ("%N")
        end
        if attached is_bundle as l_is_bundle then
          Result.append ("%Nis_bundle:")
          Result.append (l_is_bundle.out)
          Result.append ("%N")
        end
        if attached collection as l_collection then
          Result.append ("%Ncollection:")
          Result.append (l_collection.out)
          Result.append ("%N")
        end
        if attached token_id as l_token_id then
          Result.append ("%Ntoken_id:")
          Result.append (l_token_id.out)
          Result.append ("%N")
        end
        if attached amount as l_amount then
          Result.append ("%Namount:")
          Result.append (l_amount.out)
          Result.append ("%N")
        end
        if attached price_eth as l_price_eth then
          Result.append ("%Nprice_eth:")
          Result.append (l_price_eth.out)
          Result.append ("%N")
        end
        if attached buyer as l_buyer then
          Result.append ("%Nbuyer:")
          Result.append (l_buyer.out)
          Result.append ("%N")
        end
        if attached seller as l_seller then
          Result.append ("%Nseller:")
          Result.append (l_seller.out)
          Result.append ("%N")
        end
      end
end

