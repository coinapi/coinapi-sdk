/**
 * EMS - REST API
 * This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a hrefs=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ModelBase.h
 *
 * This is the base class for all model classes
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ModelBase_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ModelBase_H_


#include <map>
#include <vector>

#include "HttpContent.h"
#include "MultipartFormData.h"

#include <cpprest/details/basic_types.h>
#include <cpprest/json.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class  ModelBase
{
public:
    ModelBase();
    virtual ~ModelBase();

    virtual void validate() = 0;

    virtual web::json::value toJson() const = 0;
    virtual bool fromJson( const web::json::value& json ) = 0;

    virtual void toMultipart( std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix ) const = 0;
    virtual bool fromMultiPart( std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix ) = 0;

    virtual bool isSet() const;

    static utility::string_t toString( const bool val );
    static utility::string_t toString( const float val );
    static utility::string_t toString( const double val );
    static utility::string_t toString( const int32_t val );
    static utility::string_t toString( const int64_t val );
    static utility::string_t toString( const utility::string_t &val );
    static utility::string_t toString( const utility::datetime &val );
    static utility::string_t toString( const web::json::value &val );
    static utility::string_t toString( const std::shared_ptr<HttpContent>& val );
    template <typename T>
    static utility::string_t toString( const std::shared_ptr<T>& val );
    template <typename T>
    static utility::string_t toString( const std::vector<T> & val );

    static web::json::value toJson( bool val );
    static web::json::value toJson( float val );
    static web::json::value toJson( double val );
    static web::json::value toJson( int32_t val );
    static web::json::value toJson( int64_t val );
    static web::json::value toJson( const utility::string_t& val );
    static web::json::value toJson( const utility::datetime& val );
    static web::json::value toJson( const web::json::value& val );
    static web::json::value toJson( const std::shared_ptr<HttpContent>& val );
    template<typename T>
    static web::json::value toJson( const std::shared_ptr<T>& val );
    static web::json::value toJson( const std::shared_ptr<utility::datetime>& val );
    template<typename T>
    static web::json::value toJson( const std::vector<T>& val );
    template<typename T>
    static web::json::value toJson( const std::map<utility::string_t, T>& val );

    static bool fromString( const utility::string_t& val, bool & );
    static bool fromString( const utility::string_t& val, float & );
    static bool fromString( const utility::string_t& val, double & );
    static bool fromString( const utility::string_t& val, int32_t & );
    static bool fromString( const utility::string_t& val, int64_t & );
    static bool fromString( const utility::string_t& val, utility::string_t & );
    static bool fromString( const utility::string_t& val, utility::datetime & );
    static bool fromString( const utility::string_t& val, web::json::value & );
    static bool fromString( const utility::string_t& val, std::shared_ptr<HttpContent> & );
    template<typename T>
    static bool fromString( const utility::string_t& val, std::shared_ptr<T>& );
    static bool fromString( const utility::string_t& val, std::shared_ptr<utility::datetime>& outVal );
    template<typename T>
    static bool fromString( const utility::string_t& val, std::vector<T> & );
    template<typename T>
    static bool fromString( const utility::string_t& val, std::map<utility::string_t, T> & );

    static bool fromJson( const web::json::value& val, bool & );
    static bool fromJson( const web::json::value& val, float & );
    static bool fromJson( const web::json::value& val, double & );
    static bool fromJson( const web::json::value& val, int32_t & );
    static bool fromJson( const web::json::value& val, int64_t & );
    static bool fromJson( const web::json::value& val, utility::string_t & );
    static bool fromJson( const web::json::value& val, utility::datetime & );
    static bool fromJson( const web::json::value& val, web::json::value & );
    static bool fromJson( const web::json::value& val, std::shared_ptr<HttpContent> & );
    template<typename T>
    static bool fromJson( const web::json::value& val, std::shared_ptr<T>& );
    static bool fromJson( const web::json::value& val, std::shared_ptr<utility::datetime> &outVal );
    template<typename T>
    static bool fromJson( const web::json::value& val, std::vector<T> & );
    template<typename T>
    static bool fromJson( const web::json::value& val, std::map<utility::string_t, T> & );


    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, bool value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, float value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, double value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, int32_t value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, int64_t value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const utility::string_t& value, const utility::string_t& contentType = utility::conversions::to_string_t(""));
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const utility::datetime& value, const utility::string_t& contentType = utility::conversions::to_string_t(""));
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const web::json::value& value, const utility::string_t& contentType = utility::conversions::to_string_t("application/json") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::shared_ptr<HttpContent>& );
    template <typename T>
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::shared_ptr<T>& , const utility::string_t& contentType = utility::conversions::to_string_t("application/json") );
    static std::shared_ptr<HttpContent> toHttpContent(const utility::string_t& name, const std::shared_ptr<utility::datetime>& value , const utility::string_t& contentType = utility::conversions::to_string_t("application/json") );
    template <typename T>
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::vector<T>& value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    template <typename T>
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::map<utility::string_t, T>& value, const utility::string_t& contentType = utility::conversions::to_string_t("") );

    static bool fromHttpContent( std::shared_ptr<HttpContent> val, bool & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, float & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, double & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, int64_t & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, int32_t & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, utility::string_t & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, utility::datetime & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, web::json::value & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::shared_ptr<HttpContent>& );
    template <typename T>
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::shared_ptr<T>& );
    template <typename T>
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::vector<T> & );
    template <typename T>
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::map<utility::string_t, T> & );

    static utility::string_t toBase64( utility::string_t value );
    static utility::string_t toBase64( std::shared_ptr<std::istream> value );
    static std::shared_ptr<std::istream> fromBase64( const utility::string_t& encoded );
protected:
    bool m_IsSet;
};

template <typename T>
utility::string_t ModelBase::toString( const std::shared_ptr<T>& val )
{
    utility::stringstream_t ss;
    if( val != nullptr )
    {
        val->toJson().serialize(ss);
    }
    return  utility::string_t(ss.str());
}
template<typename T>
utility::string_t ModelBase::toString( const std::vector<T> & val )
{
    utility::string_t strArray;
    for ( const auto &item : val )
    {
        strArray.append( toString(item) + "," );
    }
    if (val.count() > 0)
    {
        strArray.pop_back();
    }
    return strArray;
}
template<typename T>
web::json::value ModelBase::toJson( const std::shared_ptr<T>& val )
{
    web::json::value retVal;
    if(val != nullptr)
    {
        retVal = val->toJson();
    }
    return retVal;
}
template<typename T>
web::json::value ModelBase::toJson( const std::vector<T>& value )
{
    std::vector<web::json::value> ret;
    for ( const auto& x : value )
    {
        ret.push_back( toJson(x) );
    }
    return web::json::value::array(ret);
}
template<typename T>
web::json::value ModelBase::toJson( const std::map<utility::string_t, T>& val )
{
    web::json::value obj;
    for ( const auto &itemkey : val )
    {
        obj[itemkey.first] = toJson( itemkey.second );
    }
    return obj;
}
template<typename T>
bool ModelBase::fromString( const utility::string_t& val, std::shared_ptr<T>& outVal )
{
    bool ok = false;
    if(outVal == nullptr)
    {
        outVal = std::shared_ptr<T>(new T());
    }
    if( outVal != nullptr )
    {
        ok = outVal->fromJson(web::json::value::parse(val));
    }
    return ok;
}
template<typename T>
bool ModelBase::fromJson( const web::json::value& val, std::shared_ptr<T> &outVal )
{
    bool ok = false;
    if(outVal == nullptr)
    {
        outVal = std::shared_ptr<T>(new T());
    }
    if( outVal != nullptr )
    {
        ok = outVal->fromJson(val);
    }
    return ok;
}
template<typename T>
bool ModelBase::fromJson( const web::json::value& val, std::vector<T> &outVal )
{
    bool ok = true;
    if (val.is_array())
    {
        for (const auto jitem : val.as_array())
        {
            T item;
            ok &= fromJson(jitem, item);
            outVal.push_back(item);
        }
    }
    else
    {
        ok = false;
    }
    return ok;
}
template<typename T>
bool ModelBase::fromJson( const web::json::value& jval, std::map<utility::string_t, T> &outVal )
{
    bool ok = true;
    if ( jval.is_object() )
    {
        auto obj = jval.as_object();
        for( auto objItr = obj.begin() ; objItr != obj.end() ; objItr++ )
        {
            T itemVal;
            ok &= fromJson(objItr->second, itemVal);
            outVal.insert(std::pair<utility::string_t, T>(objItr->first, itemVal));
        }
    }
    else
    {
        ok = false;
    }
    return ok;
}
template <typename T>
std::shared_ptr<HttpContent> ModelBase::toHttpContent(const utility::string_t& name, const std::shared_ptr<T>& value , const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    if (value != nullptr )
    {
        content->setName( name );
        content->setContentDisposition( utility::conversions::to_string_t("form-data") );
        content->setContentType( contentType );
        content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string( value->toJson().serialize() ) ) ) );
    }
    return content;
}
template <typename T>
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const std::vector<T>& value, const utility::string_t& contentType )
{
    web::json::value json_array = ModelBase::toJson(value);
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(json_array.serialize()) ) ) );
    return content;
}
template <typename T>
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const std::map<utility::string_t, T>& value, const utility::string_t& contentType )
{
    web::json::value jobj = ModelBase::toJson(value);
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(jobj.serialize()) ) ) );
    return content;
}
template <typename T>
bool ModelBase::fromHttpContent( std::shared_ptr<HttpContent> val,  std::shared_ptr<T>& outVal )
{
    utility::string_t str;
    if(val == nullptr) return false;
    if( outVal == nullptr )
    {
        outVal = std::shared_ptr<T>(new T());
    }
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
template <typename T>
bool ModelBase::fromHttpContent( std::shared_ptr<HttpContent> val, std::vector<T> & )
{
    return true;
}
template <typename T>
bool ModelBase::fromHttpContent( std::shared_ptr<HttpContent> val, std::map<utility::string_t, T> & )
{
    return true;
}
}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ModelBase_H_ */
