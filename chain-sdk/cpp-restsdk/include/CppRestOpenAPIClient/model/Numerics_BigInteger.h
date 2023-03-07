/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Numerics_BigInteger.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Numerics_BigInteger_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Numerics_BigInteger_H_


#include "CppRestOpenAPIClient/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  Numerics_BigInteger
    : public ModelBase
{
public:
    Numerics_BigInteger();
    virtual ~Numerics_BigInteger();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Numerics_BigInteger members

    /// <summary>
    /// 
    /// </summary>
    bool isIsPowerOfTwo() const;
    bool isPowerOfTwoIsSet() const;
    void unsetIs_power_of_two();

    void setIsPowerOfTwo(bool value);

    /// <summary>
    /// 
    /// </summary>
    bool isIsZero() const;
    bool isZeroIsSet() const;
    void unsetIs_zero();

    void setIsZero(bool value);

    /// <summary>
    /// 
    /// </summary>
    bool isIsOne() const;
    bool isOneIsSet() const;
    void unsetIs_one();

    void setIsOne(bool value);

    /// <summary>
    /// 
    /// </summary>
    bool isIsEven() const;
    bool isEvenIsSet() const;
    void unsetIs_even();

    void setIsEven(bool value);

    /// <summary>
    /// 
    /// </summary>
    int32_t getSign() const;
    bool signIsSet() const;
    void unsetSign();

    void setSign(int32_t value);


protected:
    bool m_Is_power_of_two;
    bool m_Is_power_of_twoIsSet;
    bool m_Is_zero;
    bool m_Is_zeroIsSet;
    bool m_Is_one;
    bool m_Is_oneIsSet;
    bool m_Is_even;
    bool m_Is_evenIsSet;
    int32_t m_Sign;
    bool m_SignIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Numerics_BigInteger_H_ */
