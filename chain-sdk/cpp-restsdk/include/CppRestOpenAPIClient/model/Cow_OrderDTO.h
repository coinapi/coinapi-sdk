/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Cow_OrderDTO.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Cow_OrderDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Cow_OrderDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  Cow_OrderDTO
    : public ModelBase
{
public:
    Cow_OrderDTO();
    virtual ~Cow_OrderDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Cow_OrderDTO members

    /// <summary>
    /// 
    /// </summary>
    utility::datetime getEntryTime() const;
    bool entryTimeIsSet() const;
    void unsetEntry_time();

    void setEntryTime(const utility::datetime& value);

    /// <summary>
    /// 
    /// </summary>
    utility::datetime getRecvTime() const;
    bool recvTimeIsSet() const;
    void unsetRecv_time();

    void setRecvTime(const utility::datetime& value);

    /// <summary>
    /// Number of block in which entity was recorded.
    /// </summary>
    int64_t getBlockNumber() const;
    bool blockNumberIsSet() const;
    void unsetBlock_number();

    void setBlockNumber(int64_t value);

    /// <summary>
    /// User&#39;s address.
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// User&#39;s address.
    /// </summary>
    utility::string_t getOwner() const;
    bool ownerIsSet() const;
    void unsetOwner();

    void setOwner(const utility::string_t& value);

    /// <summary>
    /// Block&#39;s timestamp on trade event.
    /// </summary>
    utility::string_t getTradesTimestamp() const;
    bool tradesTimestampIsSet() const;
    void unsetTrades_timestamp();

    void setTradesTimestamp(const utility::string_t& value);

    /// <summary>
    /// Block&#39;s timestamp on invalidate event.
    /// </summary>
    utility::string_t getInvalidateTimestamp() const;
    bool invalidateTimestampIsSet() const;
    void unsetInvalidate_timestamp();

    void setInvalidateTimestamp(const utility::string_t& value);

    /// <summary>
    /// Block&#39;s timestamp on presign event.
    /// </summary>
    utility::string_t getPresignTimestamp() const;
    bool presignTimestampIsSet() const;
    void unsetPresign_timestamp();

    void setPresignTimestamp(const utility::string_t& value);

    /// <summary>
    /// Determines whether order is signed.
    /// </summary>
    bool isIsSigned() const;
    bool isSignedIsSet() const;
    void unsetIs_signed();

    void setIsSigned(bool value);

    /// <summary>
    /// Determines whether order is valid.
    /// </summary>
    bool isIsValid() const;
    bool isValidIsSet() const;
    void unsetIs_valid();

    void setIsValid(bool value);

    /// <summary>
    /// 
    /// </summary>
    int64_t getVid() const;
    bool vidIsSet() const;
    void unsetVid();

    void setVid(int64_t value);


protected:
    utility::datetime m_Entry_time;
    bool m_Entry_timeIsSet;
    utility::datetime m_Recv_time;
    bool m_Recv_timeIsSet;
    int64_t m_Block_number;
    bool m_Block_numberIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Owner;
    bool m_OwnerIsSet;
    utility::string_t m_Trades_timestamp;
    bool m_Trades_timestampIsSet;
    utility::string_t m_Invalidate_timestamp;
    bool m_Invalidate_timestampIsSet;
    utility::string_t m_Presign_timestamp;
    bool m_Presign_timestampIsSet;
    bool m_Is_signed;
    bool m_Is_signedIsSet;
    bool m_Is_valid;
    bool m_Is_validIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Cow_OrderDTO_H_ */
