/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "CppRestOpenAPIClient/ModelBase.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ModelBase::ModelBase(): m_IsSet(false)
{
}
ModelBase::~ModelBase()
{
}
bool ModelBase::isSet() const
{
    return m_IsSet;
}
utility::string_t ModelBase::toString( const bool val )
{
    utility::stringstream_t ss;
    ss << val;
    return utility::string_t(ss.str());
}
utility::string_t ModelBase::toString( const float val )
{
    utility::stringstream_t ss;
    ss << val;
    return utility::string_t(ss.str());
}
utility::string_t ModelBase::toString( const double val )
{
    utility::stringstream_t ss;
    ss << val;
    return utility::string_t(ss.str());
}
utility::string_t ModelBase::toString( const int32_t val )
{
    utility::stringstream_t ss;
    ss << val;
    return utility::string_t(ss.str());
}
utility::string_t ModelBase::toString( const int64_t val )
{
    utility::stringstream_t ss;
    ss << val;
    return utility::string_t(ss.str());
}
utility::string_t ModelBase::toString (const utility::string_t &val )
{
    utility::stringstream_t ss;
    ss << val;
    return utility::string_t(ss.str());
}
utility::string_t ModelBase::toString( const utility::datetime &val )
{
    return val.to_string(utility::datetime::ISO_8601);
}
utility::string_t ModelBase::toString( const web::json::value &val )
{
    return val.serialize();
}
utility::string_t ModelBase::toString( const std::shared_ptr<HttpContent>& val )
{
    utility::stringstream_t ss;
    if( val != nullptr )
    {
        ss << val->getData();
    }
    return  utility::string_t(ss.str());
}
web::json::value ModelBase::toJson(bool value)
{
    return web::json::value::boolean(value);
}
web::json::value ModelBase::toJson( float value )
{
    return web::json::value::number(value);
}
web::json::value ModelBase::toJson( double value )
{
    return web::json::value::number(value);
}
web::json::value ModelBase::toJson( int32_t value )
{
    return web::json::value::number(value);
}
web::json::value ModelBase::toJson( int64_t value )
{
    return web::json::value::number(value);
}
web::json::value ModelBase::toJson( const utility::string_t& value )
{
    return web::json::value::string(value);
}
web::json::value ModelBase::toJson( const utility::datetime& value )
{
    return web::json::value::string(value.to_string(utility::datetime::ISO_8601));
}
web::json::value ModelBase::toJson( const web::json::value& value )
{
    return value;
}
web::json::value ModelBase::toJson( const std::shared_ptr<HttpContent>& content )
{
    web::json::value value;
    if(content != nullptr)
    {
        value[utility::conversions::to_string_t("ContentDisposition")] = ModelBase::toJson(content->getContentDisposition());
        value[utility::conversions::to_string_t("ContentType")] = ModelBase::toJson(content->getContentType());
        value[utility::conversions::to_string_t("FileName")] = ModelBase::toJson(content->getFileName());
        value[utility::conversions::to_string_t("InputStream")] = web::json::value::string( ModelBase::toBase64(content->getData()) );
    }
    return value;
}
web::json::value ModelBase::toJson( const std::shared_ptr<utility::datetime>& val )
{
    web::json::value retVal;
    if(val != nullptr)
    {
        retVal = toJson(*val);
    }
    return retVal;
}
bool ModelBase::fromString( const utility::string_t& val, bool &outVal )
{
    utility::stringstream_t ss(val);
    bool success = true;
    try
    {
        ss >> outVal;
    }
    catch (...)
    {
        success = false;
    }
    return success;
}
bool ModelBase::fromString( const utility::string_t& val, float &outVal )
{
    utility::stringstream_t ss(val);
    bool success = true;
    try
    {
        ss >> outVal;
    }
    catch (...)
    {
        int64_t intVal = 0;
        success = ModelBase::fromString(val, intVal);
        if(success)
        {
            outVal = static_cast<float>(intVal);
        }
    }
    return success;
}
bool ModelBase::fromString( const utility::string_t& val, double &outVal )
{
    utility::stringstream_t ss(val);
    bool success = true;
    try
    {
        ss >> outVal;
    }
    catch (...)
    {
        int64_t intVal = 0;
        success = ModelBase::fromString(val, intVal);
        if(success)
        {
            outVal = static_cast<double>(intVal);
        }
    }
    return success;
}
bool ModelBase::fromString( const utility::string_t& val, int32_t &outVal )
{
    utility::stringstream_t ss(val);
    bool success = true;
    try
    {
        ss >> outVal;
    }
    catch (...)
    {
        success = false;
    }
    return success;
}
bool ModelBase::fromString( const utility::string_t& val, int64_t &outVal )
{
    utility::stringstream_t ss(val);
    bool success = true;
    try
    {
        ss >> outVal;
    }
    catch (...)
    {
        success = false;
    }
    return success;
}
bool ModelBase::fromString( const utility::string_t& val, utility::string_t &outVal )
{
    utility::stringstream_t ss(val);
    bool success = true;
    try
    {
        ss >> outVal;
    }
    catch (...)
    {
        success = false;
    }
    return success;
}
bool ModelBase::fromString( const utility::string_t& val, utility::datetime &outVal )
{
    bool success = true;
    auto dt = utility::datetime::from_string(val, utility::datetime::ISO_8601);
    if( dt.is_initialized() )
    {
        outVal = dt;
    }
    else
    {
        success = false;
    }
    return success;
}
bool ModelBase::fromString( const utility::string_t& val, web::json::value &outVal )
{
    outVal = web::json::value::parse(val);
    return !outVal.is_null();
}
bool ModelBase::fromString( const utility::string_t& val, std::shared_ptr<HttpContent>& outVal )
{
    bool ok = true;
    if(outVal == nullptr)
    {
        outVal = std::shared_ptr<HttpContent>(new HttpContent());
    }
    if(outVal != nullptr)
    {
        outVal->setData(std::shared_ptr<std::istream>(new std::stringstream(utility::conversions::to_utf8string(val))));
    }
    else
    {
        ok = false;
    }
    return ok;
}
bool ModelBase::fromString( const utility::string_t& val, std::shared_ptr<utility::datetime>& outVal )
{
    bool ok = false;
    if(outVal == nullptr)
    {
        outVal = std::shared_ptr<utility::datetime>(new utility::datetime());
    }
    if( outVal != nullptr )
    {
        ok = fromJson(web::json::value::parse(val), *outVal);
    }
    return ok;
}
bool ModelBase::fromJson( const web::json::value& val, bool & outVal )
{
    outVal = !val.is_boolean() ? false : val.as_bool();
    return val.is_boolean();
}
bool ModelBase::fromJson( const web::json::value& val, float & outVal )
{
    outVal = (!val.is_double() && !val.is_integer()) ? std::numeric_limits<float>::quiet_NaN(): static_cast<float>(val.as_double());
    return val.is_double() || val.is_integer();
}
bool ModelBase::fromJson( const web::json::value& val, double & outVal )
{
    outVal = (!val.is_double() && !val.is_integer()) ? std::numeric_limits<double>::quiet_NaN(): val.as_double();
    return val.is_double() || val.is_integer();
}
bool ModelBase::fromJson( const web::json::value& val, int32_t & outVal )
{
    outVal = !val.is_integer() ? std::numeric_limits<int32_t>::quiet_NaN() : val.as_integer();
    return val.is_integer();
}
bool ModelBase::fromJson( const web::json::value& val, int64_t & outVal )
{
    outVal = !val.is_number() ? std::numeric_limits<int64_t>::quiet_NaN() : val.as_number().to_int64();
    return val.is_number();
}
bool ModelBase::fromJson( const web::json::value& val, utility::string_t & outVal )
{
    outVal = val.is_string() ? val.as_string() : utility::conversions::to_string_t("");
    return val.is_string();
}
bool ModelBase::fromJson( const web::json::value& val, utility::datetime & outVal )
{
    outVal = val.is_null() ? utility::datetime::from_string(utility::conversions::to_string_t("NULL"), utility::datetime::ISO_8601) : utility::datetime::from_string(val.as_string(), utility::datetime::ISO_8601);
    return outVal.is_initialized();
}
bool ModelBase::fromJson( const web::json::value& val, web::json::value & outVal )
{
    outVal = val;
    return !val.is_null();
}
bool ModelBase::fromJson( const web::json::value& val, std::shared_ptr<HttpContent>& content )
{
    bool result = false;
    if( content != nullptr)
    {
        result = true;
        if(content == nullptr)
        {
            content = std::shared_ptr<HttpContent>(new HttpContent());
        }
        if(val.has_field(utility::conversions::to_string_t("ContentDisposition")))
        {
            utility::string_t value;
            result = result && ModelBase::fromJson(val.at(utility::conversions::to_string_t("ContentDisposition")), value);
            content->setContentDisposition( value );
        }
        if(val.has_field(utility::conversions::to_string_t("ContentType")))
        {
            utility::string_t value;
            result = result && ModelBase::fromJson(val.at(utility::conversions::to_string_t("ContentType")), value);
            content->setContentType( value );
        }
        if(val.has_field(utility::conversions::to_string_t("FileName")))
        {
            utility::string_t value;
            result = result && ModelBase::fromJson(val.at(utility::conversions::to_string_t("FileName")), value);
            content->setFileName( value );
        }
        if(val.has_field(utility::conversions::to_string_t("InputStream")))
        {
            utility::string_t value;
            result = result && ModelBase::fromJson(val.at(utility::conversions::to_string_t("InputStream")), value);
            content->setData( ModelBase::fromBase64( value ) );
        }
    }
    return result;
}
bool ModelBase::fromJson( const web::json::value& val, std::shared_ptr<utility::datetime> &outVal )
{
    bool ok = false;
    if(outVal == nullptr)
    {
        outVal = std::shared_ptr<utility::datetime>(new utility::datetime());
    }
    if( outVal != nullptr )
    {
        ok = fromJson(val, *outVal);
    }
    return ok;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, bool value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    std::stringstream* valueAsStringStream = new std::stringstream();
    (*valueAsStringStream) << value;
    content->setData( std::shared_ptr<std::istream>( valueAsStringStream ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, float value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    std::stringstream* valueAsStringStream = new std::stringstream();
    (*valueAsStringStream) << value;
    content->setData( std::shared_ptr<std::istream>( valueAsStringStream ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, double value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    std::stringstream* valueAsStringStream = new std::stringstream();
    (*valueAsStringStream) << value;
    content->setData( std::shared_ptr<std::istream>( valueAsStringStream ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, int32_t value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    std::stringstream* valueAsStringStream = new std::stringstream();
    (*valueAsStringStream) << value;
    content->setData( std::shared_ptr<std::istream>( valueAsStringStream ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, int64_t value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    std::stringstream* valueAsStringStream = new std::stringstream();
    (*valueAsStringStream) << value;
    content->setData( std::shared_ptr<std::istream>( valueAsStringStream) ) ;
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const utility::string_t& value, const utility::string_t& contentType)
{
    std::shared_ptr<HttpContent> content(new HttpContent);
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(value) ) ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const utility::datetime& value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(value.to_string(utility::datetime::ISO_8601) ) ) ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const web::json::value& value, const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(value.serialize()) ) ) );
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const std::shared_ptr<HttpContent>& value )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    if( value != nullptr )
    {
        content->setName( name );
        content->setContentDisposition( value->getContentDisposition() );
        content->setContentType( value->getContentType() );
        content->setData( value->getData() );
        content->setFileName( value->getFileName() );
    }
    return content;
}
std::shared_ptr<HttpContent> ModelBase::toHttpContent(const utility::string_t& name, const std::shared_ptr<utility::datetime>& value , const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    if (value != nullptr )
    {
        content->setName( name );
        content->setContentDisposition( utility::conversions::to_string_t("form-data") );
        content->setContentType( contentType );
        content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string( toJson(*value).serialize() ) ) ) );
    }
    return content;
}
bool ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, bool & outVal )
{
    utility::string_t str;
    if( val == nullptr ) return  false;
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
bool ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, float & outVal )
{
    utility::string_t str;
    if( val == nullptr ) return  false;
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
bool ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, double & outVal )
{
    utility::string_t str;
    if( val == nullptr ) return  false;
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
bool ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, int32_t & outVal )
{
    utility::string_t str;
    if( val == nullptr ) return  false;
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
bool ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, int64_t & outVal )
{
    utility::string_t str;
    if( val == nullptr ) return  false;
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
bool ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, utility::string_t & outVal )
{
    if( val == nullptr ) return  false;
    std::shared_ptr<std::istream> data = val->getData();
    data->seekg( 0, data->beg );

    std::string str((std::istreambuf_iterator<char>(*data.get())),
                 std::istreambuf_iterator<char>());
    outVal = utility::conversions::to_string_t(str);
    return true;
}
bool ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, utility::datetime & outVal )
{
    utility::string_t str;
    if( val == nullptr ) return  false;
    ModelBase::fromHttpContent(val, str);
    outVal =  utility::datetime::from_string(str, utility::datetime::ISO_8601);
    return true;
}
bool  ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, web::json::value & outVal )
{
    utility::string_t str;
    if( val == nullptr ) return  false;
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
bool  ModelBase::fromHttpContent(std::shared_ptr<HttpContent> val, std::shared_ptr<HttpContent>& outVal )
{
    utility::string_t str;
    if( val == nullptr ) return  false;
    if( outVal == nullptr )
    {
        outVal = std::shared_ptr<HttpContent>(new HttpContent());
    }
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
// base64 encoding/decoding based on : https://en.wikibooks.org/wiki/Algorithm_Implementation/Miscellaneous/Base64#C.2B.2B
const static char Base64Chars[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
const static char Base64PadChar = '=';
utility::string_t ModelBase::toBase64( utility::string_t value )
{
    std::shared_ptr<std::istream> source( new std::stringstream( utility::conversions::to_utf8string(value) ) );
    return ModelBase::toBase64(source);
}
utility::string_t ModelBase::toBase64( std::shared_ptr<std::istream> value )
{
    value->seekg( 0, value->end );
    size_t length = value->tellg();
    value->seekg( 0, value->beg );
    utility::string_t base64;
    base64.reserve( ((length / 3) + (length % 3 > 0)) * 4 );
    char read[3] = { 0 };
    uint32_t temp;
    for ( size_t idx = 0; idx < length / 3; idx++ )
    {
        value->read( read, 3 );
        temp = (read[0]) << 16;
        temp += (read[1]) << 8;
        temp += (read[2]);
        base64.append( 1, Base64Chars[(temp & 0x00FC0000) >> 18] );
        base64.append( 1, Base64Chars[(temp & 0x0003F000) >> 12] );
        base64.append( 1, Base64Chars[(temp & 0x00000FC0) >> 6] );
        base64.append( 1, Base64Chars[(temp & 0x0000003F)] );
    }
    switch ( length % 3 )
    {
        case 1:
            value->read( read, 1 );
            temp = read[0] << 16;
            base64.append( 1, Base64Chars[(temp & 0x00FC0000) >> 18] );
            base64.append( 1, Base64Chars[(temp & 0x0003F000) >> 12] );
            base64.append( 2, Base64PadChar );
            break;
        case 2:
            value->read( read, 2 );
            temp = read[0] << 16;
            temp += read[1] << 8;
            base64.append( 1, Base64Chars[(temp & 0x00FC0000) >> 18] );
            base64.append( 1, Base64Chars[(temp & 0x0003F000) >> 12] );
            base64.append( 1, Base64Chars[(temp & 0x00000FC0) >> 6] );
            base64.append( 1, Base64PadChar );
            break;
    }
    return base64;
}
std::shared_ptr<std::istream> ModelBase::fromBase64( const utility::string_t& encoded )
{
    std::shared_ptr<std::stringstream> result(new std::stringstream);

    char outBuf[3] = { 0 };
    uint32_t temp = 0;

    utility::string_t::const_iterator cursor = encoded.begin();
    while ( cursor < encoded.end() )
    {
        for ( size_t quantumPosition = 0; quantumPosition < 4; quantumPosition++ )
        {
            temp <<= 6;
            if ( *cursor >= 0x41 && *cursor <= 0x5A )
            {
                temp |= *cursor - 0x41;
            }
            else if ( *cursor >= 0x61 && *cursor <= 0x7A )
            {
                temp |= *cursor - 0x47;
            }
            else if ( *cursor >= 0x30 && *cursor <= 0x39 )
            {
                temp |= *cursor + 0x04;
            }
            else if ( *cursor == 0x2B )
            {
                temp |= 0x3E; //change to 0x2D for URL alphabet
            }
            else if ( *cursor == 0x2F )
            {
                temp |= 0x3F; //change to 0x5F for URL alphabet
            }
            else if ( *cursor == Base64PadChar ) //pad
            {
                switch ( encoded.end() - cursor )
                {
                    case 1: //One pad character
                        outBuf[0] = (temp >> 16) & 0x000000FF;
                        outBuf[1] = (temp >> 8) & 0x000000FF;
                        result->write( outBuf, 2 );
                        return result;
                    case 2: //Two pad characters
                        outBuf[0] = (temp >> 10) & 0x000000FF;
                        result->write( outBuf, 1 );
                        return result;
                    default:
                        throw web::json::json_exception( utility::conversions::to_string_t( "Invalid Padding in Base 64!" ).c_str() );
                }
            }
            else
            {
                throw web::json::json_exception( utility::conversions::to_string_t( "Non-Valid Character in Base 64!" ).c_str() );
            }
            ++cursor;
        }

        outBuf[0] = (temp >> 16) & 0x000000FF;
        outBuf[1] = (temp >> 8) & 0x000000FF;
        outBuf[2] = (temp) & 0x000000FF;
        result->write( outBuf, 3 );
    }

    return result;
}

}
}
}
}
