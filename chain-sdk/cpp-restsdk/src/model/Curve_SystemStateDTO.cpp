/**
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Curve_SystemStateDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_SystemStateDTO::Curve_SystemStateDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Registry_contract = utility::conversions::to_string_t("");
    m_Registry_contractIsSet = false;
    m_Contract_count = utility::conversions::to_string_t("");
    m_Contract_countIsSet = false;
    m_Gauge_count = utility::conversions::to_string_t("");
    m_Gauge_countIsSet = false;
    m_Gauge_type_count = utility::conversions::to_string_t("");
    m_Gauge_type_countIsSet = false;
    m_Pool_count = utility::conversions::to_string_t("");
    m_Pool_countIsSet = false;
    m_Token_count = utility::conversions::to_string_t("");
    m_Token_countIsSet = false;
    m_Total_pool_count = utility::conversions::to_string_t("");
    m_Total_pool_countIsSet = false;
    m_Updated = utility::conversions::to_string_t("");
    m_UpdatedIsSet = false;
    m_Updated_at_block = utility::conversions::to_string_t("");
    m_Updated_at_blockIsSet = false;
    m_Updated_at_transaction = utility::conversions::to_string_t("");
    m_Updated_at_transactionIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Curve_SystemStateDTO::~Curve_SystemStateDTO()
{
}

void Curve_SystemStateDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_SystemStateDTO::toJson() const
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
    if(m_Registry_contractIsSet)
    {
        val[utility::conversions::to_string_t(U("registry_contract"))] = ModelBase::toJson(m_Registry_contract);
    }
    if(m_Contract_countIsSet)
    {
        val[utility::conversions::to_string_t(U("contract_count"))] = ModelBase::toJson(m_Contract_count);
    }
    if(m_Gauge_countIsSet)
    {
        val[utility::conversions::to_string_t(U("gauge_count"))] = ModelBase::toJson(m_Gauge_count);
    }
    if(m_Gauge_type_countIsSet)
    {
        val[utility::conversions::to_string_t(U("gauge_type_count"))] = ModelBase::toJson(m_Gauge_type_count);
    }
    if(m_Pool_countIsSet)
    {
        val[utility::conversions::to_string_t(U("pool_count"))] = ModelBase::toJson(m_Pool_count);
    }
    if(m_Token_countIsSet)
    {
        val[utility::conversions::to_string_t(U("token_count"))] = ModelBase::toJson(m_Token_count);
    }
    if(m_Total_pool_countIsSet)
    {
        val[utility::conversions::to_string_t(U("total_pool_count"))] = ModelBase::toJson(m_Total_pool_count);
    }
    if(m_UpdatedIsSet)
    {
        val[utility::conversions::to_string_t(U("updated"))] = ModelBase::toJson(m_Updated);
    }
    if(m_Updated_at_blockIsSet)
    {
        val[utility::conversions::to_string_t(U("updated_at_block"))] = ModelBase::toJson(m_Updated_at_block);
    }
    if(m_Updated_at_transactionIsSet)
    {
        val[utility::conversions::to_string_t(U("updated_at_transaction"))] = ModelBase::toJson(m_Updated_at_transaction);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Curve_SystemStateDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("registry_contract"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("registry_contract")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRegistryContract;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRegistryContract);
            setRegistryContract(refVal_setRegistryContract);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("contract_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("contract_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setContractCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setContractCount);
            setContractCount(refVal_setContractCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("gauge_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("gauge_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setGaugeCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setGaugeCount);
            setGaugeCount(refVal_setGaugeCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("gauge_type_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("gauge_type_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setGaugeTypeCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setGaugeTypeCount);
            setGaugeTypeCount(refVal_setGaugeTypeCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pool_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pool_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPoolCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPoolCount);
            setPoolCount(refVal_setPoolCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTokenCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTokenCount);
            setTokenCount(refVal_setTokenCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_pool_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_pool_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalPoolCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalPoolCount);
            setTotalPoolCount(refVal_setTotalPoolCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUpdated;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdated);
            setUpdated(refVal_setUpdated);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated_at_block"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated_at_block")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUpdatedAtBlock;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdatedAtBlock);
            setUpdatedAtBlock(refVal_setUpdatedAtBlock);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated_at_transaction"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated_at_transaction")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUpdatedAtTransaction;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdatedAtTransaction);
            setUpdatedAtTransaction(refVal_setUpdatedAtTransaction);
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

void Curve_SystemStateDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_Registry_contractIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("registry_contract")), m_Registry_contract));
    }
    if(m_Contract_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("contract_count")), m_Contract_count));
    }
    if(m_Gauge_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("gauge_count")), m_Gauge_count));
    }
    if(m_Gauge_type_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("gauge_type_count")), m_Gauge_type_count));
    }
    if(m_Pool_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pool_count")), m_Pool_count));
    }
    if(m_Token_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_count")), m_Token_count));
    }
    if(m_Total_pool_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_pool_count")), m_Total_pool_count));
    }
    if(m_UpdatedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated")), m_Updated));
    }
    if(m_Updated_at_blockIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated_at_block")), m_Updated_at_block));
    }
    if(m_Updated_at_transactionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated_at_transaction")), m_Updated_at_transaction));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Curve_SystemStateDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("registry_contract"))))
    {
        utility::string_t refVal_setRegistryContract;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("registry_contract"))), refVal_setRegistryContract );
        setRegistryContract(refVal_setRegistryContract);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("contract_count"))))
    {
        utility::string_t refVal_setContractCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("contract_count"))), refVal_setContractCount );
        setContractCount(refVal_setContractCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("gauge_count"))))
    {
        utility::string_t refVal_setGaugeCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("gauge_count"))), refVal_setGaugeCount );
        setGaugeCount(refVal_setGaugeCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("gauge_type_count"))))
    {
        utility::string_t refVal_setGaugeTypeCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("gauge_type_count"))), refVal_setGaugeTypeCount );
        setGaugeTypeCount(refVal_setGaugeTypeCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pool_count"))))
    {
        utility::string_t refVal_setPoolCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pool_count"))), refVal_setPoolCount );
        setPoolCount(refVal_setPoolCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_count"))))
    {
        utility::string_t refVal_setTokenCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_count"))), refVal_setTokenCount );
        setTokenCount(refVal_setTokenCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_pool_count"))))
    {
        utility::string_t refVal_setTotalPoolCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_pool_count"))), refVal_setTotalPoolCount );
        setTotalPoolCount(refVal_setTotalPoolCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated"))))
    {
        utility::string_t refVal_setUpdated;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated"))), refVal_setUpdated );
        setUpdated(refVal_setUpdated);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated_at_block"))))
    {
        utility::string_t refVal_setUpdatedAtBlock;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated_at_block"))), refVal_setUpdatedAtBlock );
        setUpdatedAtBlock(refVal_setUpdatedAtBlock);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated_at_transaction"))))
    {
        utility::string_t refVal_setUpdatedAtTransaction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated_at_transaction"))), refVal_setUpdatedAtTransaction );
        setUpdatedAtTransaction(refVal_setUpdatedAtTransaction);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Curve_SystemStateDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_SystemStateDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_SystemStateDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_SystemStateDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_SystemStateDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_SystemStateDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_SystemStateDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_SystemStateDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_SystemStateDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_SystemStateDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_SystemStateDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_SystemStateDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getId() const
{
    return m_Id;
}

void Curve_SystemStateDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_SystemStateDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_SystemStateDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getRegistryContract() const
{
    return m_Registry_contract;
}

void Curve_SystemStateDTO::setRegistryContract(const utility::string_t& value)
{
    m_Registry_contract = value;
    m_Registry_contractIsSet = true;
}

bool Curve_SystemStateDTO::registryContractIsSet() const
{
    return m_Registry_contractIsSet;
}

void Curve_SystemStateDTO::unsetRegistry_contract()
{
    m_Registry_contractIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getContractCount() const
{
    return m_Contract_count;
}

void Curve_SystemStateDTO::setContractCount(const utility::string_t& value)
{
    m_Contract_count = value;
    m_Contract_countIsSet = true;
}

bool Curve_SystemStateDTO::contractCountIsSet() const
{
    return m_Contract_countIsSet;
}

void Curve_SystemStateDTO::unsetContract_count()
{
    m_Contract_countIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getGaugeCount() const
{
    return m_Gauge_count;
}

void Curve_SystemStateDTO::setGaugeCount(const utility::string_t& value)
{
    m_Gauge_count = value;
    m_Gauge_countIsSet = true;
}

bool Curve_SystemStateDTO::gaugeCountIsSet() const
{
    return m_Gauge_countIsSet;
}

void Curve_SystemStateDTO::unsetGauge_count()
{
    m_Gauge_countIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getGaugeTypeCount() const
{
    return m_Gauge_type_count;
}

void Curve_SystemStateDTO::setGaugeTypeCount(const utility::string_t& value)
{
    m_Gauge_type_count = value;
    m_Gauge_type_countIsSet = true;
}

bool Curve_SystemStateDTO::gaugeTypeCountIsSet() const
{
    return m_Gauge_type_countIsSet;
}

void Curve_SystemStateDTO::unsetGauge_type_count()
{
    m_Gauge_type_countIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getPoolCount() const
{
    return m_Pool_count;
}

void Curve_SystemStateDTO::setPoolCount(const utility::string_t& value)
{
    m_Pool_count = value;
    m_Pool_countIsSet = true;
}

bool Curve_SystemStateDTO::poolCountIsSet() const
{
    return m_Pool_countIsSet;
}

void Curve_SystemStateDTO::unsetPool_count()
{
    m_Pool_countIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getTokenCount() const
{
    return m_Token_count;
}

void Curve_SystemStateDTO::setTokenCount(const utility::string_t& value)
{
    m_Token_count = value;
    m_Token_countIsSet = true;
}

bool Curve_SystemStateDTO::tokenCountIsSet() const
{
    return m_Token_countIsSet;
}

void Curve_SystemStateDTO::unsetToken_count()
{
    m_Token_countIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getTotalPoolCount() const
{
    return m_Total_pool_count;
}

void Curve_SystemStateDTO::setTotalPoolCount(const utility::string_t& value)
{
    m_Total_pool_count = value;
    m_Total_pool_countIsSet = true;
}

bool Curve_SystemStateDTO::totalPoolCountIsSet() const
{
    return m_Total_pool_countIsSet;
}

void Curve_SystemStateDTO::unsetTotal_pool_count()
{
    m_Total_pool_countIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getUpdated() const
{
    return m_Updated;
}

void Curve_SystemStateDTO::setUpdated(const utility::string_t& value)
{
    m_Updated = value;
    m_UpdatedIsSet = true;
}

bool Curve_SystemStateDTO::updatedIsSet() const
{
    return m_UpdatedIsSet;
}

void Curve_SystemStateDTO::unsetUpdated()
{
    m_UpdatedIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getUpdatedAtBlock() const
{
    return m_Updated_at_block;
}

void Curve_SystemStateDTO::setUpdatedAtBlock(const utility::string_t& value)
{
    m_Updated_at_block = value;
    m_Updated_at_blockIsSet = true;
}

bool Curve_SystemStateDTO::updatedAtBlockIsSet() const
{
    return m_Updated_at_blockIsSet;
}

void Curve_SystemStateDTO::unsetUpdated_at_block()
{
    m_Updated_at_blockIsSet = false;
}
utility::string_t Curve_SystemStateDTO::getUpdatedAtTransaction() const
{
    return m_Updated_at_transaction;
}

void Curve_SystemStateDTO::setUpdatedAtTransaction(const utility::string_t& value)
{
    m_Updated_at_transaction = value;
    m_Updated_at_transactionIsSet = true;
}

bool Curve_SystemStateDTO::updatedAtTransactionIsSet() const
{
    return m_Updated_at_transactionIsSet;
}

void Curve_SystemStateDTO::unsetUpdated_at_transaction()
{
    m_Updated_at_transactionIsSet = false;
}
int64_t Curve_SystemStateDTO::getVid() const
{
    return m_Vid;
}

void Curve_SystemStateDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_SystemStateDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_SystemStateDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


