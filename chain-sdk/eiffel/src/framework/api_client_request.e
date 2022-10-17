note
 description:"[
		EMS - REST API
 		This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
  		The version of the OpenAPI document: v1
 	    Contact: support@coinapi.io

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	API_CLIENT_REQUEST

inherit

	ANY
		redefine
			default_create
		end


feature -- Access

	default_create
		do
			create {ARRAYED_LIST [TUPLE [name: STRING; value: STRING]]} query_params.make (0)
			create header_params.make (0)
			create form_params.make (0)
			create auth_names.make_empty
		end

feature -- Access

	query_params: LIST [TUPLE [name: STRING; value: STRING]]
			-- List of query parameters as a pair name, value.

	header_params: STRING_TABLE [STRING]
			-- table of header parameters.

	form_params: STRING_TABLE [ANY]
			-- table of form parameters.

	body: detachable ANY
			--	The request body object.

	auth_names: ARRAY [STRING]
			-- The authentications to apply	.

feature -- Change Element

	fill_query_params (a_params: like query_params)
			-- Fill all of the elements in the specified list `a_params' to the end of
     		-- `query_params'.
		do
			query_params.fill (a_params)
		end

	add_header (new: STRING; key: READABLE_STRING_GENERAL)
			-- Update `header_params' so that `new' will be the item associated
			-- with `key'.
		do
			header_params.force (new, key)
		end

	add_form (new: ANY; key: READABLE_STRING_GENERAL)
			-- Update `form_params' so that `new' will be the item associated
			-- with `key'.
		do
			form_params.force (new, key)
		end

	set_body (a_body: like body)
			-- Set 	'body' with 'a_body'.
		do
			body := a_body
		ensure
			body_set: body = a_body
		end

	set_auth_names (a_auth_names: like auth_names)
			-- Set 'auth_names' with 'a_auth_names'.
		do
			auth_names := a_auth_names
		ensure
			auth_names_set: auth_names = a_auth_names
		end
end