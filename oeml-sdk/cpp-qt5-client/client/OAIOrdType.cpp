/**
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIOrdType.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIOrdType::OAIOrdType(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIOrdType::OAIOrdType() {
    this->initializeModel();
}

OAIOrdType::~OAIOrdType() {}

void OAIOrdType::initializeModel() {

    m_value_isSet = false;
    m_value_isValid = false;
    m_value = eOAIOrdType::INVALID_VALUE_OPENAPI_GENERATED;
}

void OAIOrdType::fromJson(QString jsonString) {
    
    if ( jsonString.compare("LIMIT", Qt::CaseInsensitive) == 0) {
        m_value = eOAIOrdType::LIMIT;
        m_value_isSet = m_value_isValid = true;
    }
}

void OAIOrdType::fromJsonValue(QJsonValue json) {
fromJson(json.toString());
}

QString OAIOrdType::asJson() const {
    
    QString val;
    switch (m_value){
        case eOAIOrdType::LIMIT:
            val = "LIMIT";
            break;
        default:
            break;
    }
    return val;
}

QJsonValue OAIOrdType::asJsonValue() const {
    
    return QJsonValue(asJson());
}


OAIOrdType::eOAIOrdType OAIOrdType::getValue() const {
    return m_value;
}

void OAIOrdType::setValue(const OAIOrdType::eOAIOrdType& value){
    m_value = value;
    m_value_isSet = true;
}
bool OAIOrdType::isSet() const {
    
    return m_value_isSet;
}

bool OAIOrdType::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_value_isValid;
}

} // namespace OpenAPI
