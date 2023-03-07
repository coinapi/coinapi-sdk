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



#include "CppRestOpenAPIClient/model/Dex_PriceDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Dex_PriceDTO::Dex_PriceDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Token = utility::conversions::to_string_t("");
    m_TokenIsSet = false;
    m_Batch_id = utility::conversions::to_string_t("");
    m_Batch_idIsSet = false;
    m_Price_in_owl_numerator = utility::conversions::to_string_t("");
    m_Price_in_owl_numeratorIsSet = false;
    m_Price_in_owl_denominator = utility::conversions::to_string_t("");
    m_Price_in_owl_denominatorIsSet = false;
    m_Volume = utility::conversions::to_string_t("");
    m_VolumeIsSet = false;
    m_Create_epoch = utility::conversions::to_string_t("");
    m_Create_epochIsSet = false;
    m_Tx_hash = utility::conversions::to_string_t("");
    m_Tx_hashIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Dex_PriceDTO::~Dex_PriceDTO()
{
}

void Dex_PriceDTO::validate()
{
    // TODO: implement validation
}

web::json::value Dex_PriceDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Entry_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("entry_time"))] = ModelBase::toJson(m_Entry_time);
    }
    if(m_Recv_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("recv_time"))] = ModelBase::toJson(m_Recv_time);
    }
    if(m_Block_numberIsSet)
    {
        val[utility::conversions::to_string_t(U("block_number"))] = ModelBase::toJson(m_Block_number);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_TokenIsSet)
    {
        val[utility::conversions::to_string_t(U("token"))] = ModelBase::toJson(m_Token);
    }
    if(m_Batch_idIsSet)
    {
        val[utility::conversions::to_string_t(U("batch_id"))] = ModelBase::toJson(m_Batch_id);
    }
    if(m_Price_in_owl_numeratorIsSet)
    {
        val[utility::conversions::to_string_t(U("price_in_owl_numerator"))] = ModelBase::toJson(m_Price_in_owl_numerator);
    }
    if(m_Price_in_owl_denominatorIsSet)
    {
        val[utility::conversions::to_string_t(U("price_in_owl_denominator"))] = ModelBase::toJson(m_Price_in_owl_denominator);
    }
    if(m_VolumeIsSet)
    {
        val[utility::conversions::to_string_t(U("volume"))] = ModelBase::toJson(m_Volume);
    }
    if(m_Create_epochIsSet)
    {
        val[utility::conversions::to_string_t(U("create_epoch"))] = ModelBase::toJson(m_Create_epoch);
    }
    if(m_Tx_hashIsSet)
    {
        val[utility::conversions::to_string_t(U("tx_hash"))] = ModelBase::toJson(m_Tx_hash);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Dex_PriceDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("entry_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("entry_time")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setEntryTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEntryTime);
            setEntryTime(refVal_setEntryTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("recv_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("recv_time")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setRecvTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRecvTime);
            setRecvTime(refVal_setRecvTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("block_number"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("block_number")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setBlockNumber;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBlockNumber);
            setBlockNumber(refVal_setBlockNumber);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken);
            setToken(refVal_setToken);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("batch_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("batch_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBatchId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBatchId);
            setBatchId(refVal_setBatchId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("price_in_owl_numerator"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("price_in_owl_numerator")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPriceInOwlNumerator;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPriceInOwlNumerator);
            setPriceInOwlNumerator(refVal_setPriceInOwlNumerator);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("price_in_owl_denominator"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("price_in_owl_denominator")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPriceInOwlDenominator;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPriceInOwlDenominator);
            setPriceInOwlDenominator(refVal_setPriceInOwlDenominator);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("volume"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("volume")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVolume;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVolume);
            setVolume(refVal_setVolume);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("create_epoch"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("create_epoch")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreateEpoch;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreateEpoch);
            setCreateEpoch(refVal_setCreateEpoch);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tx_hash"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tx_hash")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTxHash;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTxHash);
            setTxHash(refVal_setTxHash);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("vid"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("vid")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setVid;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVid);
            setVid(refVal_setVid);
        }
    }
    return ok;
}

void Dex_PriceDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Entry_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("entry_time")), m_Entry_time));
    }
    if(m_Recv_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("recv_time")), m_Recv_time));
    }
    if(m_Block_numberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("block_number")), m_Block_number));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_TokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token")), m_Token));
    }
    if(m_Batch_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("batch_id")), m_Batch_id));
    }
    if(m_Price_in_owl_numeratorIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("price_in_owl_numerator")), m_Price_in_owl_numerator));
    }
    if(m_Price_in_owl_denominatorIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("price_in_owl_denominator")), m_Price_in_owl_denominator));
    }
    if(m_VolumeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume")), m_Volume));
    }
    if(m_Create_epochIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("create_epoch")), m_Create_epoch));
    }
    if(m_Tx_hashIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tx_hash")), m_Tx_hash));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Dex_PriceDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("entry_time"))))
    {
        utility::datetime refVal_setEntryTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("entry_time"))), refVal_setEntryTime );
        setEntryTime(refVal_setEntryTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("recv_time"))))
    {
        utility::datetime refVal_setRecvTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("recv_time"))), refVal_setRecvTime );
        setRecvTime(refVal_setRecvTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("block_number"))))
    {
        int64_t refVal_setBlockNumber;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("block_number"))), refVal_setBlockNumber );
        setBlockNumber(refVal_setBlockNumber);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token"))))
    {
        utility::string_t refVal_setToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token"))), refVal_setToken );
        setToken(refVal_setToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("batch_id"))))
    {
        utility::string_t refVal_setBatchId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("batch_id"))), refVal_setBatchId );
        setBatchId(refVal_setBatchId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("price_in_owl_numerator"))))
    {
        utility::string_t refVal_setPriceInOwlNumerator;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("price_in_owl_numerator"))), refVal_setPriceInOwlNumerator );
        setPriceInOwlNumerator(refVal_setPriceInOwlNumerator);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("price_in_owl_denominator"))))
    {
        utility::string_t refVal_setPriceInOwlDenominator;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("price_in_owl_denominator"))), refVal_setPriceInOwlDenominator );
        setPriceInOwlDenominator(refVal_setPriceInOwlDenominator);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume"))))
    {
        utility::string_t refVal_setVolume;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume"))), refVal_setVolume );
        setVolume(refVal_setVolume);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("create_epoch"))))
    {
        utility::string_t refVal_setCreateEpoch;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("create_epoch"))), refVal_setCreateEpoch );
        setCreateEpoch(refVal_setCreateEpoch);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tx_hash"))))
    {
        utility::string_t refVal_setTxHash;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tx_hash"))), refVal_setTxHash );
        setTxHash(refVal_setTxHash);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Dex_PriceDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Dex_PriceDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Dex_PriceDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Dex_PriceDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Dex_PriceDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Dex_PriceDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Dex_PriceDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Dex_PriceDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Dex_PriceDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Dex_PriceDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Dex_PriceDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Dex_PriceDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Dex_PriceDTO::getId() const
{
    return m_Id;
}

void Dex_PriceDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Dex_PriceDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Dex_PriceDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Dex_PriceDTO::getToken() const
{
    return m_Token;
}

void Dex_PriceDTO::setToken(const utility::string_t& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}

bool Dex_PriceDTO::tokenIsSet() const
{
    return m_TokenIsSet;
}

void Dex_PriceDTO::unsetToken()
{
    m_TokenIsSet = false;
}
utility::string_t Dex_PriceDTO::getBatchId() const
{
    return m_Batch_id;
}

void Dex_PriceDTO::setBatchId(const utility::string_t& value)
{
    m_Batch_id = value;
    m_Batch_idIsSet = true;
}

bool Dex_PriceDTO::batchIdIsSet() const
{
    return m_Batch_idIsSet;
}

void Dex_PriceDTO::unsetBatch_id()
{
    m_Batch_idIsSet = false;
}
utility::string_t Dex_PriceDTO::getPriceInOwlNumerator() const
{
    return m_Price_in_owl_numerator;
}

void Dex_PriceDTO::setPriceInOwlNumerator(const utility::string_t& value)
{
    m_Price_in_owl_numerator = value;
    m_Price_in_owl_numeratorIsSet = true;
}

bool Dex_PriceDTO::priceInOwlNumeratorIsSet() const
{
    return m_Price_in_owl_numeratorIsSet;
}

void Dex_PriceDTO::unsetPrice_in_owl_numerator()
{
    m_Price_in_owl_numeratorIsSet = false;
}
utility::string_t Dex_PriceDTO::getPriceInOwlDenominator() const
{
    return m_Price_in_owl_denominator;
}

void Dex_PriceDTO::setPriceInOwlDenominator(const utility::string_t& value)
{
    m_Price_in_owl_denominator = value;
    m_Price_in_owl_denominatorIsSet = true;
}

bool Dex_PriceDTO::priceInOwlDenominatorIsSet() const
{
    return m_Price_in_owl_denominatorIsSet;
}

void Dex_PriceDTO::unsetPrice_in_owl_denominator()
{
    m_Price_in_owl_denominatorIsSet = false;
}
utility::string_t Dex_PriceDTO::getVolume() const
{
    return m_Volume;
}

void Dex_PriceDTO::setVolume(const utility::string_t& value)
{
    m_Volume = value;
    m_VolumeIsSet = true;
}

bool Dex_PriceDTO::volumeIsSet() const
{
    return m_VolumeIsSet;
}

void Dex_PriceDTO::unsetVolume()
{
    m_VolumeIsSet = false;
}
utility::string_t Dex_PriceDTO::getCreateEpoch() const
{
    return m_Create_epoch;
}

void Dex_PriceDTO::setCreateEpoch(const utility::string_t& value)
{
    m_Create_epoch = value;
    m_Create_epochIsSet = true;
}

bool Dex_PriceDTO::createEpochIsSet() const
{
    return m_Create_epochIsSet;
}

void Dex_PriceDTO::unsetCreate_epoch()
{
    m_Create_epochIsSet = false;
}
utility::string_t Dex_PriceDTO::getTxHash() const
{
    return m_Tx_hash;
}

void Dex_PriceDTO::setTxHash(const utility::string_t& value)
{
    m_Tx_hash = value;
    m_Tx_hashIsSet = true;
}

bool Dex_PriceDTO::txHashIsSet() const
{
    return m_Tx_hashIsSet;
}

void Dex_PriceDTO::unsetTx_hash()
{
    m_Tx_hashIsSet = false;
}
int64_t Dex_PriceDTO::getVid() const
{
    return m_Vid;
}

void Dex_PriceDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Dex_PriceDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Dex_PriceDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


