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
class CURVE_TOKEN_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- 
    address: detachable STRING_32
      -- 
    decimals: detachable STRING_32
      -- 
    name: detachable STRING_32
      -- 
    symbol: detachable STRING_32
      -- 
    pools: detachable LIST [STRING_32]
      -- 
 	vid: INTEGER_64
    	 -- 
    token_symbol: detachable STRING_32
      

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

    set_address (a_name: like address)
        -- Set 'address' with 'a_name'.
      do
        address := a_name
      ensure
        address_set: address = a_name
      end

    set_decimals (a_name: like decimals)
        -- Set 'decimals' with 'a_name'.
      do
        decimals := a_name
      ensure
        decimals_set: decimals = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_symbol (a_name: like symbol)
        -- Set 'symbol' with 'a_name'.
      do
        symbol := a_name
      ensure
        symbol_set: symbol = a_name
      end

    set_pools (a_name: like pools)
        -- Set 'pools' with 'a_name'.
      do
        pools := a_name
      ensure
        pools_set: pools = a_name
      end

    set_vid (a_name: like vid)
        -- Set 'vid' with 'a_name'.
      do
        vid := a_name
      ensure
        vid_set: vid = a_name
      end

    set_token_symbol (a_name: like token_symbol)
        -- Set 'token_symbol' with 'a_name'.
      do
        token_symbol := a_name
      ensure
        token_symbol_set: token_symbol = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CURVE_TOKEN_DTO%N")
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
        if attached address as l_address then
          Result.append ("%Naddress:")
          Result.append (l_address.out)
          Result.append ("%N")
        end
        if attached decimals as l_decimals then
          Result.append ("%Ndecimals:")
          Result.append (l_decimals.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached symbol as l_symbol then
          Result.append ("%Nsymbol:")
          Result.append (l_symbol.out)
          Result.append ("%N")
        end
        if attached pools as l_pools then
          across l_pools as ic loop
            Result.append ("%N pools:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
        if attached token_symbol as l_token_symbol then
          Result.append ("%Ntoken_symbol:")
          Result.append (l_token_symbol.out)
          Result.append ("%N")
        end
      end
end

