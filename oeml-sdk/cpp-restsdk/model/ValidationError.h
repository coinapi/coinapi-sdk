/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.1.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ValidationError.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ValidationError_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ValidationError_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  ValidationError
    : public ModelBase
{
public:
    ValidationError();
    virtual ~ValidationError();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ValidationError members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTitle() const;
    bool titleIsSet() const;
    void unsetTitle();

    void setTitle(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    double getStatus() const;
    bool statusIsSet() const;
    void unsetStatus();

    void setStatus(double value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getTraceId() const;
    bool traceIdIsSet() const;
    void unsetTraceId();

    void setTraceId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getErrors() const;
    bool errorsIsSet() const;
    void unsetErrors();

    void setErrors(const utility::string_t& value);


protected:
    utility::string_t m_Type;
    bool m_TypeIsSet;
    utility::string_t m_Title;
    bool m_TitleIsSet;
    double m_Status;
    bool m_StatusIsSet;
    utility::string_t m_TraceId;
    bool m_TraceIdIsSet;
    utility::string_t m_Errors;
    bool m_ErrorsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ValidationError_H_ */
