/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Curve_VotingAppDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Curve_VotingAppDTO::Curve_VotingAppDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Address = utility::conversions::to_string_t("");
    m_AddressIsSet = false;
    m_Codename = utility::conversions::to_string_t("");
    m_CodenameIsSet = false;
    m_Minimum_balance = utility::conversions::to_string_t("");
    m_Minimum_balanceIsSet = false;
    m_Minimum_quorum = utility::conversions::to_string_t("");
    m_Minimum_quorumIsSet = false;
    m_Minimum_time = utility::conversions::to_string_t("");
    m_Minimum_timeIsSet = false;
    m_Required_support = utility::conversions::to_string_t("");
    m_Required_supportIsSet = false;
    m_Vote_time = utility::conversions::to_string_t("");
    m_Vote_timeIsSet = false;
    m_Proposal_count = utility::conversions::to_string_t("");
    m_Proposal_countIsSet = false;
    m_Vote_count = utility::conversions::to_string_t("");
    m_Vote_countIsSet = false;
    m_Token = utility::conversions::to_string_t("");
    m_TokenIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

Curve_VotingAppDTO::~Curve_VotingAppDTO()
{
}

void Curve_VotingAppDTO::validate()
{
    // TODO: implement validation
}

web::json::value Curve_VotingAppDTO::toJson() const
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
    if(m_AddressIsSet)
    {
        val[utility::conversions::to_string_t(U("address"))] = ModelBase::toJson(m_Address);
    }
    if(m_CodenameIsSet)
    {
        val[utility::conversions::to_string_t(U("codename"))] = ModelBase::toJson(m_Codename);
    }
    if(m_Minimum_balanceIsSet)
    {
        val[utility::conversions::to_string_t(U("minimum_balance"))] = ModelBase::toJson(m_Minimum_balance);
    }
    if(m_Minimum_quorumIsSet)
    {
        val[utility::conversions::to_string_t(U("minimum_quorum"))] = ModelBase::toJson(m_Minimum_quorum);
    }
    if(m_Minimum_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("minimum_time"))] = ModelBase::toJson(m_Minimum_time);
    }
    if(m_Required_supportIsSet)
    {
        val[utility::conversions::to_string_t(U("required_support"))] = ModelBase::toJson(m_Required_support);
    }
    if(m_Vote_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("vote_time"))] = ModelBase::toJson(m_Vote_time);
    }
    if(m_Proposal_countIsSet)
    {
        val[utility::conversions::to_string_t(U("proposal_count"))] = ModelBase::toJson(m_Proposal_count);
    }
    if(m_Vote_countIsSet)
    {
        val[utility::conversions::to_string_t(U("vote_count"))] = ModelBase::toJson(m_Vote_count);
    }
    if(m_TokenIsSet)
    {
        val[utility::conversions::to_string_t(U("token"))] = ModelBase::toJson(m_Token);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool Curve_VotingAppDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("address"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("address")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAddress;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAddress);
            setAddress(refVal_setAddress);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("codename"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("codename")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCodename;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCodename);
            setCodename(refVal_setCodename);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("minimum_balance"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("minimum_balance")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMinimumBalance;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMinimumBalance);
            setMinimumBalance(refVal_setMinimumBalance);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("minimum_quorum"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("minimum_quorum")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMinimumQuorum;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMinimumQuorum);
            setMinimumQuorum(refVal_setMinimumQuorum);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("minimum_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("minimum_time")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMinimumTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMinimumTime);
            setMinimumTime(refVal_setMinimumTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("required_support"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("required_support")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRequiredSupport;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRequiredSupport);
            setRequiredSupport(refVal_setRequiredSupport);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("vote_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("vote_time")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVoteTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVoteTime);
            setVoteTime(refVal_setVoteTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("proposal_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("proposal_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setProposalCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProposalCount);
            setProposalCount(refVal_setProposalCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("vote_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("vote_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVoteCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVoteCount);
            setVoteCount(refVal_setVoteCount);
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

void Curve_VotingAppDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_AddressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("address")), m_Address));
    }
    if(m_CodenameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("codename")), m_Codename));
    }
    if(m_Minimum_balanceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("minimum_balance")), m_Minimum_balance));
    }
    if(m_Minimum_quorumIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("minimum_quorum")), m_Minimum_quorum));
    }
    if(m_Minimum_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("minimum_time")), m_Minimum_time));
    }
    if(m_Required_supportIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("required_support")), m_Required_support));
    }
    if(m_Vote_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vote_time")), m_Vote_time));
    }
    if(m_Proposal_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("proposal_count")), m_Proposal_count));
    }
    if(m_Vote_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vote_count")), m_Vote_count));
    }
    if(m_TokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token")), m_Token));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool Curve_VotingAppDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("address"))))
    {
        utility::string_t refVal_setAddress;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("address"))), refVal_setAddress );
        setAddress(refVal_setAddress);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("codename"))))
    {
        utility::string_t refVal_setCodename;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("codename"))), refVal_setCodename );
        setCodename(refVal_setCodename);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("minimum_balance"))))
    {
        utility::string_t refVal_setMinimumBalance;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("minimum_balance"))), refVal_setMinimumBalance );
        setMinimumBalance(refVal_setMinimumBalance);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("minimum_quorum"))))
    {
        utility::string_t refVal_setMinimumQuorum;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("minimum_quorum"))), refVal_setMinimumQuorum );
        setMinimumQuorum(refVal_setMinimumQuorum);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("minimum_time"))))
    {
        utility::string_t refVal_setMinimumTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("minimum_time"))), refVal_setMinimumTime );
        setMinimumTime(refVal_setMinimumTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("required_support"))))
    {
        utility::string_t refVal_setRequiredSupport;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("required_support"))), refVal_setRequiredSupport );
        setRequiredSupport(refVal_setRequiredSupport);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vote_time"))))
    {
        utility::string_t refVal_setVoteTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vote_time"))), refVal_setVoteTime );
        setVoteTime(refVal_setVoteTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("proposal_count"))))
    {
        utility::string_t refVal_setProposalCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("proposal_count"))), refVal_setProposalCount );
        setProposalCount(refVal_setProposalCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vote_count"))))
    {
        utility::string_t refVal_setVoteCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vote_count"))), refVal_setVoteCount );
        setVoteCount(refVal_setVoteCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token"))))
    {
        utility::string_t refVal_setToken;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token"))), refVal_setToken );
        setToken(refVal_setToken);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime Curve_VotingAppDTO::getEntryTime() const
{
    return m_Entry_time;
}

void Curve_VotingAppDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool Curve_VotingAppDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void Curve_VotingAppDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime Curve_VotingAppDTO::getRecvTime() const
{
    return m_Recv_time;
}

void Curve_VotingAppDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool Curve_VotingAppDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void Curve_VotingAppDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t Curve_VotingAppDTO::getBlockNumber() const
{
    return m_Block_number;
}

void Curve_VotingAppDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool Curve_VotingAppDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void Curve_VotingAppDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getId() const
{
    return m_Id;
}

void Curve_VotingAppDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool Curve_VotingAppDTO::idIsSet() const
{
    return m_IdIsSet;
}

void Curve_VotingAppDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getAddress() const
{
    return m_Address;
}

void Curve_VotingAppDTO::setAddress(const utility::string_t& value)
{
    m_Address = value;
    m_AddressIsSet = true;
}

bool Curve_VotingAppDTO::addressIsSet() const
{
    return m_AddressIsSet;
}

void Curve_VotingAppDTO::unsetAddress()
{
    m_AddressIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getCodename() const
{
    return m_Codename;
}

void Curve_VotingAppDTO::setCodename(const utility::string_t& value)
{
    m_Codename = value;
    m_CodenameIsSet = true;
}

bool Curve_VotingAppDTO::codenameIsSet() const
{
    return m_CodenameIsSet;
}

void Curve_VotingAppDTO::unsetCodename()
{
    m_CodenameIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getMinimumBalance() const
{
    return m_Minimum_balance;
}

void Curve_VotingAppDTO::setMinimumBalance(const utility::string_t& value)
{
    m_Minimum_balance = value;
    m_Minimum_balanceIsSet = true;
}

bool Curve_VotingAppDTO::minimumBalanceIsSet() const
{
    return m_Minimum_balanceIsSet;
}

void Curve_VotingAppDTO::unsetMinimum_balance()
{
    m_Minimum_balanceIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getMinimumQuorum() const
{
    return m_Minimum_quorum;
}

void Curve_VotingAppDTO::setMinimumQuorum(const utility::string_t& value)
{
    m_Minimum_quorum = value;
    m_Minimum_quorumIsSet = true;
}

bool Curve_VotingAppDTO::minimumQuorumIsSet() const
{
    return m_Minimum_quorumIsSet;
}

void Curve_VotingAppDTO::unsetMinimum_quorum()
{
    m_Minimum_quorumIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getMinimumTime() const
{
    return m_Minimum_time;
}

void Curve_VotingAppDTO::setMinimumTime(const utility::string_t& value)
{
    m_Minimum_time = value;
    m_Minimum_timeIsSet = true;
}

bool Curve_VotingAppDTO::minimumTimeIsSet() const
{
    return m_Minimum_timeIsSet;
}

void Curve_VotingAppDTO::unsetMinimum_time()
{
    m_Minimum_timeIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getRequiredSupport() const
{
    return m_Required_support;
}

void Curve_VotingAppDTO::setRequiredSupport(const utility::string_t& value)
{
    m_Required_support = value;
    m_Required_supportIsSet = true;
}

bool Curve_VotingAppDTO::requiredSupportIsSet() const
{
    return m_Required_supportIsSet;
}

void Curve_VotingAppDTO::unsetRequired_support()
{
    m_Required_supportIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getVoteTime() const
{
    return m_Vote_time;
}

void Curve_VotingAppDTO::setVoteTime(const utility::string_t& value)
{
    m_Vote_time = value;
    m_Vote_timeIsSet = true;
}

bool Curve_VotingAppDTO::voteTimeIsSet() const
{
    return m_Vote_timeIsSet;
}

void Curve_VotingAppDTO::unsetVote_time()
{
    m_Vote_timeIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getProposalCount() const
{
    return m_Proposal_count;
}

void Curve_VotingAppDTO::setProposalCount(const utility::string_t& value)
{
    m_Proposal_count = value;
    m_Proposal_countIsSet = true;
}

bool Curve_VotingAppDTO::proposalCountIsSet() const
{
    return m_Proposal_countIsSet;
}

void Curve_VotingAppDTO::unsetProposal_count()
{
    m_Proposal_countIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getVoteCount() const
{
    return m_Vote_count;
}

void Curve_VotingAppDTO::setVoteCount(const utility::string_t& value)
{
    m_Vote_count = value;
    m_Vote_countIsSet = true;
}

bool Curve_VotingAppDTO::voteCountIsSet() const
{
    return m_Vote_countIsSet;
}

void Curve_VotingAppDTO::unsetVote_count()
{
    m_Vote_countIsSet = false;
}
utility::string_t Curve_VotingAppDTO::getToken() const
{
    return m_Token;
}

void Curve_VotingAppDTO::setToken(const utility::string_t& value)
{
    m_Token = value;
    m_TokenIsSet = true;
}

bool Curve_VotingAppDTO::tokenIsSet() const
{
    return m_TokenIsSet;
}

void Curve_VotingAppDTO::unsetToken()
{
    m_TokenIsSet = false;
}
int64_t Curve_VotingAppDTO::getVid() const
{
    return m_Vid;
}

void Curve_VotingAppDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool Curve_VotingAppDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void Curve_VotingAppDTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


