/**
 * OMS - REST API .
 * OMS Project
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 4.3.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * MessagesInfo.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_MessagesInfo_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_MessagesInfo_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  MessagesInfo
    : public ModelBase
{
public:
    MessagesInfo();
    virtual ~MessagesInfo();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// MessagesInfo members

    /// <summary>
    /// Type of message
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// Exchange name
    /// </summary>
    utility::string_t getExchangeId() const;
    bool exchangeIdIsSet() const;
    void unsetExchange_id();

    void setExchangeId(const utility::string_t& value);

    /// <summary>
    /// Error message
    /// </summary>
    utility::string_t getErrorMessage() const;
    bool errorMessageIsSet() const;
    void unsetError_message();

    void setErrorMessage(const utility::string_t& value);


protected:
    utility::string_t m_Type;
    bool m_TypeIsSet;
    utility::string_t m_Exchange_id;
    bool m_Exchange_idIsSet;
    utility::string_t m_Error_message;
    bool m_Error_messageIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_MessagesInfo_H_ */
