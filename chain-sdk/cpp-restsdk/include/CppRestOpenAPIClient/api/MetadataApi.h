/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.3.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * MetadataApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_MetadataApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_MetadataApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"
#include "CppRestOpenAPIClient/ModelBase.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  MetadataApi 
{
public:

    explicit MetadataApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~MetadataApi();

    /// <summary>
    /// List all chains.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<void> metadataChainsGet(
    ) const;
    /// <summary>
    /// Gets dapp by name.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="dappName"></param>
    pplx::task<void> metadataDappsDappNameGet(
        utility::string_t dappName
    ) const;
    /// <summary>
    /// List all decentralized applications.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    pplx::task<void> metadataDappsGet(
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_MetadataApi_H_ */

