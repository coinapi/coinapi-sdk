/**
 * OMS - REST API .
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "MultipartFormData.h"
#include "ModelBase.h"

#include <boost/uuid/random_generator.hpp>
#include <boost/uuid/uuid_io.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace model {

MultipartFormData::MultipartFormData()
{
    utility::stringstream_t uuidString;
    uuidString << boost::uuids::random_generator()();
    m_Boundary = uuidString.str();
}

MultipartFormData::MultipartFormData(const utility::string_t& boundary)
    : m_Boundary(boundary)
{

}

MultipartFormData::~MultipartFormData()
{
}

utility::string_t MultipartFormData::getBoundary()
{
    return m_Boundary;
}

void MultipartFormData::add( std::shared_ptr<HttpContent> content )
{
    m_Contents.push_back( content );
    m_ContentLookup[content->getName()] = content;
}

bool MultipartFormData::hasContent(const utility::string_t& name) const
{
    return m_ContentLookup.find(name) != m_ContentLookup.end();
}

std::shared_ptr<HttpContent> MultipartFormData::getContent(const utility::string_t& name) const
{
    auto result = m_ContentLookup.find(name);
    if(result == m_ContentLookup.end())
    {
        return std::shared_ptr<HttpContent>(nullptr);
    }
    return result->second;
}

void MultipartFormData::writeTo( std::ostream& target )
{
    for ( size_t i = 0; i < m_Contents.size(); i++ )
    {
        std::shared_ptr<HttpContent> content = m_Contents[i];

        // boundary
        target << "\r\n" << "--" << utility::conversions::to_utf8string( m_Boundary ) << "\r\n";

        // headers
        target << "Content-Disposition: " << utility::conversions::to_utf8string( content->getContentDisposition() );
        if ( content->getName().size() > 0 )
        {
            target << "; name=\"" << utility::conversions::to_utf8string( content->getName() ) << "\"";
        }
        if ( content->getFileName().size() > 0 )
        {
            target << "; filename=\"" << utility::conversions::to_utf8string( content->getFileName() ) << "\"";
        }
        target << "\r\n";

        if ( content->getContentType().size() > 0 )
        {
            target << "Content-Type: " << utility::conversions::to_utf8string( content->getContentType() ) << "\r\n";
        }

        target << "\r\n";

        // body
        std::shared_ptr<std::istream> data = content->getData();

		data->seekg( 0, data->end );
		std::vector<char> dataBytes( data->tellg() );

		data->seekg( 0, data->beg );
		data->read( &dataBytes[0], dataBytes.size() );

		std::copy( dataBytes.begin(), dataBytes.end(), std::ostreambuf_iterator<char>( target ) );
    }

    target << "\r\n--" << utility::conversions::to_utf8string( m_Boundary ) << "--\r\n";
}

}
}
}
}
