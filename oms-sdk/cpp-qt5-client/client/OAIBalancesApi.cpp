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

#include "OAIBalancesApi.h"
#include "OAIHelpers.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIBalancesApi::OAIBalancesApi(const QString &scheme, const QString &host, int port, const QString &basePath, const int timeOut)
    : _scheme(scheme),
      _host(host),
      _port(port),
      _basePath(basePath),
      _timeOut(timeOut),
      isResponseCompressionEnabled(false),
      isRequestCompressionEnabled(false) {}

OAIBalancesApi::~OAIBalancesApi() {
}

void OAIBalancesApi::setScheme(const QString &scheme) {
    _scheme = scheme;
}

void OAIBalancesApi::setHost(const QString &host) {
    _host = host;
}

void OAIBalancesApi::setPort(int port) {
    _port = port;
}

void OAIBalancesApi::setBasePath(const QString &basePath) {
    _basePath = basePath;
}

void OAIBalancesApi::setTimeOut(const int timeOut) {
    _timeOut = timeOut;
}

void OAIBalancesApi::setWorkingDirectory(const QString &path) {
    _workingDirectory = path;
}

void OAIBalancesApi::addHeaders(const QString &key, const QString &value) {
    defaultHeaders.insert(key, value);
}

void OAIBalancesApi::enableRequestCompression() {
    isRequestCompressionEnabled = true;
}

void OAIBalancesApi::enableResponseCompression() {
    isResponseCompressionEnabled = true;
}

void OAIBalancesApi::abortRequests(){
    emit abortRequestsSignal();
}

void OAIBalancesApi::v1BalancesGet(const QString &exchange_id) {
    QString fullPath = QString("%1://%2%3%4%5")
                           .arg(_scheme)
                           .arg(_host)
                           .arg(_port ? ":" + QString::number(_port) : "")
                           .arg(_basePath)
                           .arg("/v1/balances");

    if (fullPath.indexOf("?") > 0)
        fullPath.append("&");
    else
        fullPath.append("?");
    fullPath.append(QUrl::toPercentEncoding("exchange_id")).append("=").append(QUrl::toPercentEncoding(::OpenAPI::toStringValue(exchange_id)));

    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker(this);
    worker->setTimeOut(_timeOut);
    worker->setWorkingDirectory(_workingDirectory);
    OAIHttpRequestInput input(fullPath, "GET");

    foreach (QString key, this->defaultHeaders.keys()) { input.headers.insert(key, this->defaultHeaders.value(key)); }

    connect(worker, &OAIHttpRequestWorker::on_execution_finished, this, &OAIBalancesApi::v1BalancesGetCallback);
    connect(this, &OAIBalancesApi::abortRequestsSignal, worker, &QObject::deleteLater); 
    worker->execute(&input);
}

void OAIBalancesApi::v1BalancesGetCallback(OAIHttpRequestWorker *worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    } else {
        msg = "Error: " + worker->error_str;
        error_str = QString("%1, %2").arg(worker->error_str).arg(QString(worker->response));
    }
    QList<OAIBalance> output;
    QString json(worker->response);
    QByteArray array(json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    foreach (QJsonValue obj, jsonArray) {
        OAIBalance val;
        ::OpenAPI::fromJsonValue(val, obj);
        output.append(val);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit v1BalancesGetSignal(output);
        emit v1BalancesGetSignalFull(worker, output);
    } else {
        emit v1BalancesGetSignalE(output, error_type, error_str);
        emit v1BalancesGetSignalEFull(worker, error_type, error_str);
    }
}

} // namespace OpenAPI
