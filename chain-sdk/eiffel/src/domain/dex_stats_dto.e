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
class DEX_STATS_DTO




feature --Access

    entry_time: detachable DATE_TIME
      
    recv_time: detachable DATE_TIME
      
 	block_number: INTEGER_64
    	 -- Number of block in which entity was recorded.
    id: detachable STRING_32
      -- 
    volume_in_owl: detachable STRING_32
      -- The total volume denominated in OWL (all sell amounts combined).
    utility_in_owl: detachable STRING_32
      -- The total trader surplus in OWL.
    owl_burnt: detachable STRING_32
      -- The total amount of OWL burnt (equivalent to fees rewarded to solvers).
 	settled_batch_count: INTEGER_32
    	 -- The total number of settled batches.
 	settled_trade_count: INTEGER_32
    	 -- The total number of settled trades.
 	listed_tokens: INTEGER_32
    	 -- The number of listed tokens.
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

    set_volume_in_owl (a_name: like volume_in_owl)
        -- Set 'volume_in_owl' with 'a_name'.
      do
        volume_in_owl := a_name
      ensure
        volume_in_owl_set: volume_in_owl = a_name
      end

    set_utility_in_owl (a_name: like utility_in_owl)
        -- Set 'utility_in_owl' with 'a_name'.
      do
        utility_in_owl := a_name
      ensure
        utility_in_owl_set: utility_in_owl = a_name
      end

    set_owl_burnt (a_name: like owl_burnt)
        -- Set 'owl_burnt' with 'a_name'.
      do
        owl_burnt := a_name
      ensure
        owl_burnt_set: owl_burnt = a_name
      end

    set_settled_batch_count (a_name: like settled_batch_count)
        -- Set 'settled_batch_count' with 'a_name'.
      do
        settled_batch_count := a_name
      ensure
        settled_batch_count_set: settled_batch_count = a_name
      end

    set_settled_trade_count (a_name: like settled_trade_count)
        -- Set 'settled_trade_count' with 'a_name'.
      do
        settled_trade_count := a_name
      ensure
        settled_trade_count_set: settled_trade_count = a_name
      end

    set_listed_tokens (a_name: like listed_tokens)
        -- Set 'listed_tokens' with 'a_name'.
      do
        listed_tokens := a_name
      ensure
        listed_tokens_set: listed_tokens = a_name
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
        Result.append("%Nclass DEX_STATS_DTO%N")
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
        if attached volume_in_owl as l_volume_in_owl then
          Result.append ("%Nvolume_in_owl:")
          Result.append (l_volume_in_owl.out)
          Result.append ("%N")
        end
        if attached utility_in_owl as l_utility_in_owl then
          Result.append ("%Nutility_in_owl:")
          Result.append (l_utility_in_owl.out)
          Result.append ("%N")
        end
        if attached owl_burnt as l_owl_burnt then
          Result.append ("%Nowl_burnt:")
          Result.append (l_owl_burnt.out)
          Result.append ("%N")
        end
        if attached settled_batch_count as l_settled_batch_count then
          Result.append ("%Nsettled_batch_count:")
          Result.append (l_settled_batch_count.out)
          Result.append ("%N")
        end
        if attached settled_trade_count as l_settled_trade_count then
          Result.append ("%Nsettled_trade_count:")
          Result.append (l_settled_trade_count.out)
          Result.append ("%N")
        end
        if attached listed_tokens as l_listed_tokens then
          Result.append ("%Nlisted_tokens:")
          Result.append (l_listed_tokens.out)
          Result.append ("%N")
        end
        if attached vid as l_vid then
          Result.append ("%Nvid:")
          Result.append (l_vid.out)
          Result.append ("%N")
        end
      end
end
