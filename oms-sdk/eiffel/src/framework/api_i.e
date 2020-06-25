note
 description:"[
		OMS - REST API .
 		Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
  		The version of the OpenAPI document: v1
 	    

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
            -- last error if any from the API call.

feature -- Error

	reset_error
			-- reset `last_error' to void.
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