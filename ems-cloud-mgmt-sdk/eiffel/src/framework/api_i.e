note
 description:"[
		EMS - REST API
 		This section will provide necessary information about the `CoinAPI EMS REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>        Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints  <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this: `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class API_I

    inherit ANY redefine default_create end

feature {NONE} -- Initialization

    default_create
            -- Initialize USER_API with default api_client.
        do
            api_client := (create {CONFIGURATION}).default_api_client
        end

    make (a_client: API_CLIENT)
            -- Initialize USER_API with `api_client' `a_client'.
        do
            api_client := a_client
        end

    api_client: API_CLIENT
            -- Api client.

feature -- Status Report

    last_error: detachable API_ERROR
            -- Last error if any from the API call.

feature -- Error

	reset_error
			-- Reset `last_error' to void.
		do
			last_error := Void
		end


feature -- Serializer

	serializer (a_content_type: STRING; a_object: ANY): STRING
			-- Serializer object `a_object' with content type `a_content_type'.
			-- Return the serialized object or report an error if
			-- the serialization failed (ie, not supported, etc).
		local
			err: DEVELOPER_EXCEPTION
		do
				-- Serialized to be coded by a user.
				-- Add the support content types
			create Result.make_empty
			if a_content_type.is_case_insensitive_equal_general ("application/json") then
				Result := json_serializer (a_object)
			else
					-- Add your new serializer here.
					--! we have two options
					--! raise a developer exception.
					--! media type not supported!!!.
					--! or we create an object instance of API_ERROR.
				create err
				err.set_description ("Content type [" + a_content_type + "] not supported.")
				err.raise
			end
		end

	json_serializer (a_object: ANY): STRING
			-- Convert object `a_object' to JSON represented as STRING.
		local
			l_json: API_JSON_SERIALIZER
		do
			Result := l_json.to_json_string (a_object)
		end

feature -- Deserializer


	deserializer (a_content_type: STRING; a_body: STRING; a_type: TYPE [detachable ANY]): detachable ANY
			-- Deserialize a representation `a_body' with content type `a_content_type'.
			-- Return an object of type target if it's possible.
		local
			err: DEVELOPER_EXCEPTION
		do
			if a_content_type.is_case_insensitive_equal_general ("application/json") then
				Result := json_deserializer (a_body, a_type)
			else
				create err
				err.set_description ("Deserialization is not supported by default you will need to add it by hand.")
				err.raise
			end
		end


	json_deserializer (a_body: STRING; a_type: TYPE [detachable ANY]): detachable ANY
			-- Deserialize body 'a_body' to json to the target type 'a_type'.
		local
			l_json: API_JSON_DESERIALIZER
		do
			Result := l_json.from_json (a_body, a_type)
		end

end