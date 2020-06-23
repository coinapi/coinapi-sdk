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
 * CancelOrder.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CancelOrder_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CancelOrder_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  CancelOrder
    : public ModelBase
{
public:
    CancelOrder();
    virtual ~CancelOrder();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CancelOrder members

    /// <summary>
    /// Exchange name
    /// </summary>
    utility::string_t getExchangeId() const;
    bool exchangeIdIsSet() const;
    void unsetExchange_id();

    void setExchangeId(const utility::string_t& value);

    /// <summary>
    /// Order Id
    /// </summary>
    utility::string_t getExchangeOrderId() const;
    bool exchangeOrderIdIsSet() const;
    void unsetExchange_order_id();

    void setExchangeOrderId(const utility::string_t& value);

    /// <summary>
    /// Client order Id
    /// </summary>
    utility::string_t getClientOrderId() const;
    bool clientOrderIdIsSet() const;
    void unsetClient_order_id();

    void setClientOrderId(const utility::string_t& value);


protected:
    utility::string_t m_Exchange_id;
    bool m_Exchange_idIsSet;
    utility::string_t m_Exchange_order_id;
    bool m_Exchange_order_idIsSet;
    utility::string_t m_Client_order_id;
    bool m_Client_order_idIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CancelOrder_H_ */
