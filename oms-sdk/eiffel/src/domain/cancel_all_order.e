note
 description:"[
		OMS - REST API .
 		OMS Project
  		The version of the OpenAPI document: v1
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class CANCEL_ALL_ORDER 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    exchange_id: detachable STRING_32 
      -- Exchange name

feature -- Change Element  
 
    set_exchange_id (a_name: like exchange_id)
        -- Set 'exchange_id' with 'a_name'.
      do
        exchange_id := a_name
      ensure
        exchange_id_set: exchange_id = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CANCEL_ALL_ORDER%N")
        if attached exchange_id as l_exchange_id then
          Result.append ("%Nexchange_id:")
          Result.append (l_exchange_id.out)
          Result.append ("%N")    
        end  
      end
end


