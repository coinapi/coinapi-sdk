/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. 
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIOrderStatus.h
 *
 * Order statuses and the lifecycle are documented in the separate section: &lt;a href&#x3D;\&quot;#oeml-order-lifecycle\&quot;&gt;OEML / Starter Guide / Order Lifecycle&lt;/a&gt; 
 */

#ifndef OAIOrderStatus_H
#define OAIOrderStatus_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOrderStatus : public OAIEnum {
public:
    OAIOrderStatus();
    OAIOrderStatus(QString json);
    ~OAIOrderStatus() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIOrderStatus {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        RECEIVED, 
        ROUTING, 
        ROUTED, 
        NEW, 
        PENDING_CANCEL, 
        PARTIALLY_FILLED, 
        FILLED, 
        CANCELED, 
        REJECTED
    };
    OAIOrderStatus::eOAIOrderStatus getValue() const;
    void setValue(const OAIOrderStatus::eOAIOrderStatus& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIOrderStatus m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOrderStatus)

#endif // OAIOrderStatus_H
