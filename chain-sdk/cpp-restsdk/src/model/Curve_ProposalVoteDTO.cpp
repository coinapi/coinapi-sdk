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



#include "CppRestOpenAPIClient/model/Curve_ProposalVoteDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_ProposalVoteDTO::Curve_ProposalVoteDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Proposal = utility::conversions::to_string_t("");
    m_ProposalIsSet = false;
    m_Supports = false;
    m_SupportsIsSet = false;
    m_Stake = utility::conversions::to_string_t("");
    m_StakeIsSet = false;
    m_Voter = utility::conversions::to_string_t("");
    m_VoterIsSet = false;
    m_Created = utility::conversions::to_string_t("");
    m_CreatedIsSet = false;
    m_Created_at_block = utility::conversions::to_string_t("");
    m_Created_at_blockIsSet = false;
    m_Created_at_transaction = utility::conversions::to_string_t("");
    m_Created_at_transactionIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Curve_ProposalVoteDTO::~Curve_ProposalVoteDTO()
{
}

void Curve_ProposalVoteDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_ProposalVoteDTO::toJson() const
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
    if(m_ProposalIsSet)
    {
        val[utility::conversions::to_string_t(U("proposal"))] = ModelBase::toJson(m_Proposal);
    }
    if(m_SupportsIsSet)
    {
        val[utility::conversions::to_string_t(U("supports"))] = ModelBase::toJson(m_Supports);
    }
    if(m_StakeIsSet)
    {
        val[utility::conversions::to_string_t(U("stake"))] = ModelBase::toJson(m_Stake);
    }
    if(m_VoterIsSet)
    {
        val[utility::conversions::to_string_t(U("voter"))] = ModelBase::toJson(m_Voter);
    }
    if(m_CreatedIsSet)
    {
        val[utility::conversions::to_string_t(U("created"))] = ModelBase::toJson(m_Created);
    }
    if(m_Created_at_blockIsSet)
    {
        val[utility::conversions::to_string_t(U("created_at_block"))] = ModelBase::toJson(m_Created_at_block);
    }
    if(m_Created_at_transactionIsSet)
    {
        val[utility::conversions::to_string_t(U("created_at_transaction"))] = ModelBase::toJson(m_Created_at_transaction);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Curve_ProposalVoteDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("proposal"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("proposal")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProposal;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProposal);
            setProposal(refVal_setProposal);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("supports"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("supports")));
        if(!fieldValue.is_null())
        {
            bool refVal_setSupports;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSupports);
            setSupports(refVal_setSupports);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("stake"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("stake")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setStake;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStake);
            setStake(refVal_setStake);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("voter"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("voter")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVoter;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVoter);
            setVoter(refVal_setVoter);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreated;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreated);
            setCreated(refVal_setCreated);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created_at_block"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created_at_block")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreatedAtBlock;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatedAtBlock);
            setCreatedAtBlock(refVal_setCreatedAtBlock);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created_at_transaction"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created_at_transaction")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCreatedAtTransaction;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatedAtTransaction);
            setCreatedAtTransaction(refVal_setCreatedAtTransaction);
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

void Curve_ProposalVoteDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_ProposalIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("proposal")), m_Proposal));
    }
    if(m_SupportsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("supports")), m_Supports));
    }
    if(m_StakeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("stake")), m_Stake));
    }
    if(m_VoterIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("voter")), m_Voter));
    }
    if(m_CreatedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created")), m_Created));
    }
    if(m_Created_at_blockIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_at_block")), m_Created_at_block));
    }
    if(m_Created_at_transactionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_at_transaction")), m_Created_at_transaction));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Curve_ProposalVoteDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("proposal"))))
    {
        utility::string_t refVal_setProposal;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("proposal"))), refVal_setProposal );
        setProposal(refVal_setProposal);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("supports"))))
    {
        bool refVal_setSupports;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("supports"))), refVal_setSupports );
        setSupports(refVal_setSupports);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("stake"))))
    {
        utility::string_t refVal_setStake;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("stake"))), refVal_setStake );
        setStake(refVal_setStake);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("voter"))))
    {
        utility::string_t refVal_setVoter;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("voter"))), refVal_setVoter );
        setVoter(refVal_setVoter);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created"))))
    {
        utility::string_t refVal_setCreated;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created"))), refVal_setCreated );
        setCreated(refVal_setCreated);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created_at_block"))))
    {
        utility::string_t refVal_setCreatedAtBlock;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_at_block"))), refVal_setCreatedAtBlock );
        setCreatedAtBlock(refVal_setCreatedAtBlock);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created_at_transaction"))))
    {
        utility::string_t refVal_setCreatedAtTransaction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_at_transaction"))), refVal_setCreatedAtTransaction );
        setCreatedAtTransaction(refVal_setCreatedAtTransaction);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Curve_ProposalVoteDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_ProposalVoteDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_ProposalVoteDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_ProposalVoteDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_ProposalVoteDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_ProposalVoteDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_ProposalVoteDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_ProposalVoteDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_ProposalVoteDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_ProposalVoteDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_ProposalVoteDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_ProposalVoteDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_ProposalVoteDTO::getId() const
{
    return m_Id;
}

void Curve_ProposalVoteDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_ProposalVoteDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_ProposalVoteDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Curve_ProposalVoteDTO::getProposal() const
{
    return m_Proposal;
}

void Curve_ProposalVoteDTO::setProposal(const utility::string_t& value)
{
    m_Proposal = value;
    m_ProposalIsSet = true;
}

bool Curve_ProposalVoteDTO::proposalIsSet() const
{
    return m_ProposalIsSet;
}

void Curve_ProposalVoteDTO::unsetProposal()
{
    m_ProposalIsSet = false;
}
bool Curve_ProposalVoteDTO::isSupports() const
{
    return m_Supports;
}

void Curve_ProposalVoteDTO::setSupports(bool value)
{
    m_Supports = value;
    m_SupportsIsSet = true;
}

bool Curve_ProposalVoteDTO::supportsIsSet() const
{
    return m_SupportsIsSet;
}

void Curve_ProposalVoteDTO::unsetSupports()
{
    m_SupportsIsSet = false;
}
utility::string_t Curve_ProposalVoteDTO::getStake() const
{
    return m_Stake;
}

void Curve_ProposalVoteDTO::setStake(const utility::string_t& value)
{
    m_Stake = value;
    m_StakeIsSet = true;
}

bool Curve_ProposalVoteDTO::stakeIsSet() const
{
    return m_StakeIsSet;
}

void Curve_ProposalVoteDTO::unsetStake()
{
    m_StakeIsSet = false;
}
utility::string_t Curve_ProposalVoteDTO::getVoter() const
{
    return m_Voter;
}

void Curve_ProposalVoteDTO::setVoter(const utility::string_t& value)
{
    m_Voter = value;
    m_VoterIsSet = true;
}

bool Curve_ProposalVoteDTO::voterIsSet() const
{
    return m_VoterIsSet;
}

void Curve_ProposalVoteDTO::unsetVoter()
{
    m_VoterIsSet = false;
}
utility::string_t Curve_ProposalVoteDTO::getCreated() const
{
    return m_Created;
}

void Curve_ProposalVoteDTO::setCreated(const utility::string_t& value)
{
    m_Created = value;
    m_CreatedIsSet = true;
}

bool Curve_ProposalVoteDTO::createdIsSet() const
{
    return m_CreatedIsSet;
}

void Curve_ProposalVoteDTO::unsetCreated()
{
    m_CreatedIsSet = false;
}
utility::string_t Curve_ProposalVoteDTO::getCreatedAtBlock() const
{
    return m_Created_at_block;
}

void Curve_ProposalVoteDTO::setCreatedAtBlock(const utility::string_t& value)
{
    m_Created_at_block = value;
    m_Created_at_blockIsSet = true;
}

bool Curve_ProposalVoteDTO::createdAtBlockIsSet() const
{
    return m_Created_at_blockIsSet;
}

void Curve_ProposalVoteDTO::unsetCreated_at_block()
{
    m_Created_at_blockIsSet = false;
}
utility::string_t Curve_ProposalVoteDTO::getCreatedAtTransaction() const
{
    return m_Created_at_transaction;
}

void Curve_ProposalVoteDTO::setCreatedAtTransaction(const utility::string_t& value)
{
    m_Created_at_transaction = value;
    m_Created_at_transactionIsSet = true;
}

bool Curve_ProposalVoteDTO::createdAtTransactionIsSet() const
{
    return m_Created_at_transactionIsSet;
}

void Curve_ProposalVoteDTO::unsetCreated_at_transaction()
{
    m_Created_at_transactionIsSet = false;
}
int64_t Curve_ProposalVoteDTO::getVid() const
{
    return m_Vid;
}

void Curve_ProposalVoteDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_ProposalVoteDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_ProposalVoteDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


