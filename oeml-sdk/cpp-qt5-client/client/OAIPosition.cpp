/**
 * OEML - REST API
 * Lorem2 Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 
 *
 * The version of the OpenAPI document: v1
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIPosition.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIPosition::OAIPosition(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIPosition::OAIPosition() {
    this->initializeModel();
}

OAIPosition::~OAIPosition() {}

void OAIPosition::initializeModel() {

    m_type_isSet = false;
    m_type_isValid = false;

    m_exchange_name_isSet = false;
    m_exchange_name_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;
}

void OAIPosition::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIPosition::fromJsonObject(QJsonObject json) {

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_exchange_name_isValid = ::OpenAPI::fromJsonValue(exchange_name, json[QString("exchange_name")]);
    m_exchange_name_isSet = !json[QString("exchange_name")].isNull() && m_exchange_name_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;
}

QString OAIPosition::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIPosition::asJsonObject() const {
    QJsonObject obj;
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (m_exchange_name_isSet) {
        obj.insert(QString("exchange_name"), ::OpenAPI::toJsonValue(exchange_name));
    }
    if (data.size() > 0) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    return obj;
}

QString OAIPosition::getType() const {
    return type;
}
void OAIPosition::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIPosition::is_type_Set() const{
    return m_type_isSet;
}

bool OAIPosition::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIPosition::getExchangeName() const {
    return exchange_name;
}
void OAIPosition::setExchangeName(const QString &exchange_name) {
    this->exchange_name = exchange_name;
    this->m_exchange_name_isSet = true;
}

bool OAIPosition::is_exchange_name_Set() const{
    return m_exchange_name_isSet;
}

bool OAIPosition::is_exchange_name_Valid() const{
    return m_exchange_name_isValid;
}

QList<OAIPosition_data> OAIPosition::getData() const {
    return data;
}
void OAIPosition::setData(const QList<OAIPosition_data> &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIPosition::is_data_Set() const{
    return m_data_isSet;
}

bool OAIPosition::is_data_Valid() const{
    return m_data_isValid;
}

bool OAIPosition::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_exchange_name_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (data.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIPosition::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
