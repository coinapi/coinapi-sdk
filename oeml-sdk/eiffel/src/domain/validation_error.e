note
 description:"[
		OEML - REST API
 		This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class VALIDATION_ERROR 

inherit

  ANY
      redefine
          out 
      end


feature --Access

    type: detachable STRING_32 
      
    title: detachable STRING_32 
      
    status: REAL_32 
      
    trace_id: detachable STRING_32 
      
    errors: detachable STRING_32 
      

feature -- Change Element  
 
    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name		
      end

    set_title (a_name: like title)
        -- Set 'title' with 'a_name'.
      do
        title := a_name
      ensure
        title_set: title = a_name		
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name		
      end

    set_trace_id (a_name: like trace_id)
        -- Set 'trace_id' with 'a_name'.
      do
        trace_id := a_name
      ensure
        trace_id_set: trace_id = a_name		
      end

    set_errors (a_name: like errors)
        -- Set 'errors' with 'a_name'.
      do
        errors := a_name
      ensure
        errors_set: errors = a_name		
      end


 feature -- Status Report

    out: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass VALIDATION_ERROR%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")    
        end  
        if attached title as l_title then
          Result.append ("%Ntitle:")
          Result.append (l_title.out)
          Result.append ("%N")    
        end  
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")    
        end  
        if attached trace_id as l_trace_id then
          Result.append ("%Ntrace_id:")
          Result.append (l_trace_id.out)
          Result.append ("%N")    
        end  
        if attached errors as l_errors then
          Result.append ("%Nerrors:")
          Result.append (l_errors.out)
          Result.append ("%N")    
        end  
      end
end


