/**
 * OMS - REST API .
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAICancelAllOrder.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICancelAllOrder::OAICancelAllOrder(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICancelAllOrder::OAICancelAllOrder() {
    this->initializeModel();
}

OAICancelAllOrder::~OAICancelAllOrder() {}

void OAICancelAllOrder::initializeModel() {

    m_exchange_id_isSet = false;
    m_exchange_id_isValid = false;
}

void OAICancelAllOrder::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICancelAllOrder::fromJsonObject(QJsonObject json) {

    m_exchange_id_isValid = ::OpenAPI::fromJsonValue(exchange_id, json[QString("exchange_id")]);
    m_exchange_id_isSet = !json[QString("exchange_id")].isNull() && m_exchange_id_isValid;
}

QString OAICancelAllOrder::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICancelAllOrder::asJsonObject() const {
    QJsonObject obj;
    if (m_exchange_id_isSet) {
        obj.insert(QString("exchange_id"), ::OpenAPI::toJsonValue(exchange_id));
    }
    return obj;
}

QString OAICancelAllOrder::getExchangeId() const {
    return exchange_id;
}
void OAICancelAllOrder::setExchangeId(const QString &exchange_id) {
    this->exchange_id = exchange_id;
    this->m_exchange_id_isSet = true;
}

bool OAICancelAllOrder::is_exchange_id_Set() const{
    return m_exchange_id_isSet;
}

bool OAICancelAllOrder::is_exchange_id_Valid() const{
    return m_exchange_id_isValid;
}

bool OAICancelAllOrder::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_exchange_id_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAICancelAllOrder::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
