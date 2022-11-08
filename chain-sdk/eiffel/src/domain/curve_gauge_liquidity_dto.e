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
class CURVE_GAUGE_LIQUIDITY_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- 
    user: detachable STRING_32
      -- 
    gauge: detachable STRING_32
      -- 
    original_balance: detachable STRING_32
      -- 
    original_supply: detachable STRING_32
      -- 
    working_balance: detachable STRING_32
      -- 
    working_supply: detachable STRING_32
      -- 
    timestamp: detachable STRING_32
      -- 
    block: detachable STRING_32
      -- 
    transaction: detachable STRING_32
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

    set_user (a_name: like user)
        -- Set 'user' with 'a_name'.
      do
        user := a_name
      ensure
        user_set: user = a_name
      end

    set_gauge (a_name: like gauge)
        -- Set 'gauge' with 'a_name'.
      do
        gauge := a_name
      ensure
        gauge_set: gauge = a_name
      end

    set_original_balance (a_name: like original_balance)
        -- Set 'original_balance' with 'a_name'.
      do
        original_balance := a_name
      ensure
        original_balance_set: original_balance = a_name
      end

    set_original_supply (a_name: like original_supply)
        -- Set 'original_supply' with 'a_name'.
      do
        original_supply := a_name
      ensure
        original_supply_set: original_supply = a_name
      end

    set_working_balance (a_name: like working_balance)
        -- Set 'working_balance' with 'a_name'.
      do
        working_balance := a_name
      ensure
        working_balance_set: working_balance = a_name
      end

    set_working_supply (a_name: like working_supply)
        -- Set 'working_supply' with 'a_name'.
      do
        working_supply := a_name
      ensure
        working_supply_set: working_supply = a_name
      end

    set_timestamp (a_name: like timestamp)
        -- Set 'timestamp' with 'a_name'.
      do
        timestamp := a_name
      ensure
        timestamp_set: timestamp = a_name
      end

    set_block (a_name: like block)
        -- Set 'block' with 'a_name'.
      do
        block := a_name
      ensure
        block_set: block = a_name
      end

    set_transaction (a_name: like transaction)
        -- Set 'transaction' with 'a_name'.
      do
        transaction := a_name
      ensure
        transaction_set: transaction = a_name
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
        Result.append("%Nclass CURVE_GAUGE_LIQUIDITY_DTO%N")
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
        if attached gauge as l_gauge then
          Result.append ("%Ngauge:")
          Result.append (l_gauge.out)
          Result.append ("%N")
        end
        if attached original_balance as l_original_balance then
          Result.append ("%Noriginal_balance:")
          Result.append (l_original_balance.out)
          Result.append ("%N")
        end
        if attached original_supply as l_original_supply then
          Result.append ("%Noriginal_supply:")
          Result.append (l_original_supply.out)
          Result.append ("%N")
        end
        if attached working_balance as l_working_balance then
          Result.append ("%Nworking_balance:")
          Result.append (l_working_balance.out)
          Result.append ("%N")
        end
        if attached working_supply as l_working_supply then
          Result.append ("%Nworking_supply:")
          Result.append (l_working_supply.out)
          Result.append ("%N")
        end
        if attached timestamp as l_timestamp then
          Result.append ("%Ntimestamp:")
          Result.append (l_timestamp.out)
          Result.append ("%N")
        end
        if attached block as l_block then
          Result.append ("%Nblock:")
          Result.append (l_block.out)
          Result.append ("%N")
        end
        if attached transaction as l_transaction then
          Result.append ("%Ntransaction:")
          Result.append (l_transaction.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end

