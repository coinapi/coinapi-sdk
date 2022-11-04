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



#include "CppRestOpenAPIClient/model/UniswapV3PositionSnapshotV3DTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UniswapV3PositionSnapshotV3DTO::UniswapV3PositionSnapshotV3DTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Owner = utility::conversions::to_string_t("");
    m_OwnerIsSet = false;
    m_Pool = utility::conversions::to_string_t("");
    m_PoolIsSet = false;
    m_Position = utility::conversions::to_string_t("");
    m_PositionIsSet = false;
    m_Timestamp = utility::conversions::to_string_t("");
    m_TimestampIsSet = false;
    m_Liquidity = utility::conversions::to_string_t("");
    m_LiquidityIsSet = false;
    m_Deposited_token_0 = utility::conversions::to_string_t("");
    m_Deposited_token_0IsSet = false;
    m_Deposited_token_1 = utility::conversions::to_string_t("");
    m_Deposited_token_1IsSet = false;
    m_Withdrawn_token_0 = utility::conversions::to_string_t("");
    m_Withdrawn_token_0IsSet = false;
    m_Withdrawn_token_1 = utility::conversions::to_string_t("");
    m_Withdrawn_token_1IsSet = false;
    m_Collected_fees_token_0 = utility::conversions::to_string_t("");
    m_Collected_fees_token_0IsSet = false;
    m_Collected_fees_token_1 = utility::conversions::to_string_t("");
    m_Collected_fees_token_1IsSet = false;
    m_Transaction = utility::conversions::to_string_t("");
    m_TransactionIsSet = false;
    m_Fee_growth_inside_0_last_x128 = utility::conversions::to_string_t("");
    m_Fee_growth_inside_0_last_x128IsSet = false;
    m_Fee_growth_inside_1_last_x128 = utility::conversions::to_string_t("");
    m_Fee_growth_inside_1_last_x128IsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
}

UniswapV3PositionSnapshotV3DTO::~UniswapV3PositionSnapshotV3DTO()
{
}

void UniswapV3PositionSnapshotV3DTO::validate()
{
    // TODO: implement validation
}

web::json::value UniswapV3PositionSnapshotV3DTO::toJson() const
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
    if(m_OwnerIsSet)
    {
        val[utility::conversions::to_string_t(U("owner"))] = ModelBase::toJson(m_Owner);
    }
    if(m_PoolIsSet)
    {
        val[utility::conversions::to_string_t(U("pool"))] = ModelBase::toJson(m_Pool);
    }
    if(m_PositionIsSet)
    {
        val[utility::conversions::to_string_t(U("position"))] = ModelBase::toJson(m_Position);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t(U("timestamp"))] = ModelBase::toJson(m_Timestamp);
    }
    if(m_LiquidityIsSet)
    {
        val[utility::conversions::to_string_t(U("liquidity"))] = ModelBase::toJson(m_Liquidity);
    }
    if(m_Deposited_token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("deposited_token_0"))] = ModelBase::toJson(m_Deposited_token_0);
    }
    if(m_Deposited_token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("deposited_token_1"))] = ModelBase::toJson(m_Deposited_token_1);
    }
    if(m_Withdrawn_token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("withdrawn_token_0"))] = ModelBase::toJson(m_Withdrawn_token_0);
    }
    if(m_Withdrawn_token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("withdrawn_token_1"))] = ModelBase::toJson(m_Withdrawn_token_1);
    }
    if(m_Collected_fees_token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("collected_fees_token_0"))] = ModelBase::toJson(m_Collected_fees_token_0);
    }
    if(m_Collected_fees_token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("collected_fees_token_1"))] = ModelBase::toJson(m_Collected_fees_token_1);
    }
    if(m_TransactionIsSet)
    {
        val[utility::conversions::to_string_t(U("transaction"))] = ModelBase::toJson(m_Transaction);
    }
    if(m_Fee_growth_inside_0_last_x128IsSet)
    {
        val[utility::conversions::to_string_t(U("fee_growth_inside_0_last_x128"))] = ModelBase::toJson(m_Fee_growth_inside_0_last_x128);
    }
    if(m_Fee_growth_inside_1_last_x128IsSet)
    {
        val[utility::conversions::to_string_t(U("fee_growth_inside_1_last_x128"))] = ModelBase::toJson(m_Fee_growth_inside_1_last_x128);
    }
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }

    return val;
}

bool UniswapV3PositionSnapshotV3DTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("owner"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("owner")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOwner;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOwner);
            setOwner(refVal_setOwner);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pool"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pool")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPool;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPool);
            setPool(refVal_setPool);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("position"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("position")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPosition;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPosition);
            setPosition(refVal_setPosition);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("timestamp"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("timestamp")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTimestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimestamp);
            setTimestamp(refVal_setTimestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("liquidity"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("liquidity")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLiquidity;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLiquidity);
            setLiquidity(refVal_setLiquidity);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("deposited_token_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("deposited_token_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDepositedToken0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDepositedToken0);
            setDepositedToken0(refVal_setDepositedToken0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("deposited_token_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("deposited_token_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDepositedToken1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDepositedToken1);
            setDepositedToken1(refVal_setDepositedToken1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("withdrawn_token_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("withdrawn_token_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setWithdrawnToken0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWithdrawnToken0);
            setWithdrawnToken0(refVal_setWithdrawnToken0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("withdrawn_token_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("withdrawn_token_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setWithdrawnToken1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWithdrawnToken1);
            setWithdrawnToken1(refVal_setWithdrawnToken1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("collected_fees_token_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("collected_fees_token_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCollectedFeesToken0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCollectedFeesToken0);
            setCollectedFeesToken0(refVal_setCollectedFeesToken0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("collected_fees_token_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("collected_fees_token_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCollectedFeesToken1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCollectedFeesToken1);
            setCollectedFeesToken1(refVal_setCollectedFeesToken1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("transaction"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("transaction")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTransaction;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTransaction);
            setTransaction(refVal_setTransaction);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("fee_growth_inside_0_last_x128"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fee_growth_inside_0_last_x128")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFeeGrowthInside0LastX128;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeeGrowthInside0LastX128);
            setFeeGrowthInside0LastX128(refVal_setFeeGrowthInside0LastX128);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("fee_growth_inside_1_last_x128"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fee_growth_inside_1_last_x128")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFeeGrowthInside1LastX128;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeeGrowthInside1LastX128);
            setFeeGrowthInside1LastX128(refVal_setFeeGrowthInside1LastX128);
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

void UniswapV3PositionSnapshotV3DTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_OwnerIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("owner")), m_Owner));
    }
    if(m_PoolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pool")), m_Pool));
    }
    if(m_PositionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("position")), m_Position));
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timestamp")), m_Timestamp));
    }
    if(m_LiquidityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("liquidity")), m_Liquidity));
    }
    if(m_Deposited_token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("deposited_token_0")), m_Deposited_token_0));
    }
    if(m_Deposited_token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("deposited_token_1")), m_Deposited_token_1));
    }
    if(m_Withdrawn_token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("withdrawn_token_0")), m_Withdrawn_token_0));
    }
    if(m_Withdrawn_token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("withdrawn_token_1")), m_Withdrawn_token_1));
    }
    if(m_Collected_fees_token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("collected_fees_token_0")), m_Collected_fees_token_0));
    }
    if(m_Collected_fees_token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("collected_fees_token_1")), m_Collected_fees_token_1));
    }
    if(m_TransactionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("transaction")), m_Transaction));
    }
    if(m_Fee_growth_inside_0_last_x128IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fee_growth_inside_0_last_x128")), m_Fee_growth_inside_0_last_x128));
    }
    if(m_Fee_growth_inside_1_last_x128IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fee_growth_inside_1_last_x128")), m_Fee_growth_inside_1_last_x128));
    }
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
}

bool UniswapV3PositionSnapshotV3DTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("owner"))))
    {
        utility::string_t refVal_setOwner;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("owner"))), refVal_setOwner );
        setOwner(refVal_setOwner);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pool"))))
    {
        utility::string_t refVal_setPool;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pool"))), refVal_setPool );
        setPool(refVal_setPool);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("position"))))
    {
        utility::string_t refVal_setPosition;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("position"))), refVal_setPosition );
        setPosition(refVal_setPosition);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timestamp"))))
    {
        utility::string_t refVal_setTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timestamp"))), refVal_setTimestamp );
        setTimestamp(refVal_setTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("liquidity"))))
    {
        utility::string_t refVal_setLiquidity;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("liquidity"))), refVal_setLiquidity );
        setLiquidity(refVal_setLiquidity);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("deposited_token_0"))))
    {
        utility::string_t refVal_setDepositedToken0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("deposited_token_0"))), refVal_setDepositedToken0 );
        setDepositedToken0(refVal_setDepositedToken0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("deposited_token_1"))))
    {
        utility::string_t refVal_setDepositedToken1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("deposited_token_1"))), refVal_setDepositedToken1 );
        setDepositedToken1(refVal_setDepositedToken1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("withdrawn_token_0"))))
    {
        utility::string_t refVal_setWithdrawnToken0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("withdrawn_token_0"))), refVal_setWithdrawnToken0 );
        setWithdrawnToken0(refVal_setWithdrawnToken0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("withdrawn_token_1"))))
    {
        utility::string_t refVal_setWithdrawnToken1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("withdrawn_token_1"))), refVal_setWithdrawnToken1 );
        setWithdrawnToken1(refVal_setWithdrawnToken1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("collected_fees_token_0"))))
    {
        utility::string_t refVal_setCollectedFeesToken0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("collected_fees_token_0"))), refVal_setCollectedFeesToken0 );
        setCollectedFeesToken0(refVal_setCollectedFeesToken0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("collected_fees_token_1"))))
    {
        utility::string_t refVal_setCollectedFeesToken1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("collected_fees_token_1"))), refVal_setCollectedFeesToken1 );
        setCollectedFeesToken1(refVal_setCollectedFeesToken1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("transaction"))))
    {
        utility::string_t refVal_setTransaction;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("transaction"))), refVal_setTransaction );
        setTransaction(refVal_setTransaction);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("fee_growth_inside_0_last_x128"))))
    {
        utility::string_t refVal_setFeeGrowthInside0LastX128;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fee_growth_inside_0_last_x128"))), refVal_setFeeGrowthInside0LastX128 );
        setFeeGrowthInside0LastX128(refVal_setFeeGrowthInside0LastX128);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("fee_growth_inside_1_last_x128"))))
    {
        utility::string_t refVal_setFeeGrowthInside1LastX128;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fee_growth_inside_1_last_x128"))), refVal_setFeeGrowthInside1LastX128 );
        setFeeGrowthInside1LastX128(refVal_setFeeGrowthInside1LastX128);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    return ok;
}

utility::datetime UniswapV3PositionSnapshotV3DTO::getEntryTime() const
{
    return m_Entry_time;
}

void UniswapV3PositionSnapshotV3DTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime UniswapV3PositionSnapshotV3DTO::getRecvTime() const
{
    return m_Recv_time;
}

void UniswapV3PositionSnapshotV3DTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t UniswapV3PositionSnapshotV3DTO::getBlockNumber() const
{
    return m_Block_number;
}

void UniswapV3PositionSnapshotV3DTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getId() const
{
    return m_Id;
}

void UniswapV3PositionSnapshotV3DTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::idIsSet() const
{
    return m_IdIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getOwner() const
{
    return m_Owner;
}

void UniswapV3PositionSnapshotV3DTO::setOwner(const utility::string_t& value)
{
    m_Owner = value;
    m_OwnerIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::ownerIsSet() const
{
    return m_OwnerIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetOwner()
{
    m_OwnerIsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getPool() const
{
    return m_Pool;
}

void UniswapV3PositionSnapshotV3DTO::setPool(const utility::string_t& value)
{
    m_Pool = value;
    m_PoolIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::poolIsSet() const
{
    return m_PoolIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetPool()
{
    m_PoolIsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getPosition() const
{
    return m_Position;
}

void UniswapV3PositionSnapshotV3DTO::setPosition(const utility::string_t& value)
{
    m_Position = value;
    m_PositionIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::positionIsSet() const
{
    return m_PositionIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetPosition()
{
    m_PositionIsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getTimestamp() const
{
    return m_Timestamp;
}

void UniswapV3PositionSnapshotV3DTO::setTimestamp(const utility::string_t& value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetTimestamp()
{
    m_TimestampIsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getLiquidity() const
{
    return m_Liquidity;
}

void UniswapV3PositionSnapshotV3DTO::setLiquidity(const utility::string_t& value)
{
    m_Liquidity = value;
    m_LiquidityIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::liquidityIsSet() const
{
    return m_LiquidityIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetLiquidity()
{
    m_LiquidityIsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getDepositedToken0() const
{
    return m_Deposited_token_0;
}

void UniswapV3PositionSnapshotV3DTO::setDepositedToken0(const utility::string_t& value)
{
    m_Deposited_token_0 = value;
    m_Deposited_token_0IsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::depositedToken0IsSet() const
{
    return m_Deposited_token_0IsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetDeposited_token_0()
{
    m_Deposited_token_0IsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getDepositedToken1() const
{
    return m_Deposited_token_1;
}

void UniswapV3PositionSnapshotV3DTO::setDepositedToken1(const utility::string_t& value)
{
    m_Deposited_token_1 = value;
    m_Deposited_token_1IsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::depositedToken1IsSet() const
{
    return m_Deposited_token_1IsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetDeposited_token_1()
{
    m_Deposited_token_1IsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getWithdrawnToken0() const
{
    return m_Withdrawn_token_0;
}

void UniswapV3PositionSnapshotV3DTO::setWithdrawnToken0(const utility::string_t& value)
{
    m_Withdrawn_token_0 = value;
    m_Withdrawn_token_0IsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::withdrawnToken0IsSet() const
{
    return m_Withdrawn_token_0IsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetWithdrawn_token_0()
{
    m_Withdrawn_token_0IsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getWithdrawnToken1() const
{
    return m_Withdrawn_token_1;
}

void UniswapV3PositionSnapshotV3DTO::setWithdrawnToken1(const utility::string_t& value)
{
    m_Withdrawn_token_1 = value;
    m_Withdrawn_token_1IsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::withdrawnToken1IsSet() const
{
    return m_Withdrawn_token_1IsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetWithdrawn_token_1()
{
    m_Withdrawn_token_1IsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getCollectedFeesToken0() const
{
    return m_Collected_fees_token_0;
}

void UniswapV3PositionSnapshotV3DTO::setCollectedFeesToken0(const utility::string_t& value)
{
    m_Collected_fees_token_0 = value;
    m_Collected_fees_token_0IsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::collectedFeesToken0IsSet() const
{
    return m_Collected_fees_token_0IsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetCollected_fees_token_0()
{
    m_Collected_fees_token_0IsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getCollectedFeesToken1() const
{
    return m_Collected_fees_token_1;
}

void UniswapV3PositionSnapshotV3DTO::setCollectedFeesToken1(const utility::string_t& value)
{
    m_Collected_fees_token_1 = value;
    m_Collected_fees_token_1IsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::collectedFeesToken1IsSet() const
{
    return m_Collected_fees_token_1IsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetCollected_fees_token_1()
{
    m_Collected_fees_token_1IsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getTransaction() const
{
    return m_Transaction;
}

void UniswapV3PositionSnapshotV3DTO::setTransaction(const utility::string_t& value)
{
    m_Transaction = value;
    m_TransactionIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::transactionIsSet() const
{
    return m_TransactionIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetTransaction()
{
    m_TransactionIsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getFeeGrowthInside0LastX128() const
{
    return m_Fee_growth_inside_0_last_x128;
}

void UniswapV3PositionSnapshotV3DTO::setFeeGrowthInside0LastX128(const utility::string_t& value)
{
    m_Fee_growth_inside_0_last_x128 = value;
    m_Fee_growth_inside_0_last_x128IsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::feeGrowthInside0LastX128IsSet() const
{
    return m_Fee_growth_inside_0_last_x128IsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetFee_growth_inside_0_last_x128()
{
    m_Fee_growth_inside_0_last_x128IsSet = false;
}
utility::string_t UniswapV3PositionSnapshotV3DTO::getFeeGrowthInside1LastX128() const
{
    return m_Fee_growth_inside_1_last_x128;
}

void UniswapV3PositionSnapshotV3DTO::setFeeGrowthInside1LastX128(const utility::string_t& value)
{
    m_Fee_growth_inside_1_last_x128 = value;
    m_Fee_growth_inside_1_last_x128IsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::feeGrowthInside1LastX128IsSet() const
{
    return m_Fee_growth_inside_1_last_x128IsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetFee_growth_inside_1_last_x128()
{
    m_Fee_growth_inside_1_last_x128IsSet = false;
}
int64_t UniswapV3PositionSnapshotV3DTO::getVid() const
{
    return m_Vid;
}

void UniswapV3PositionSnapshotV3DTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool UniswapV3PositionSnapshotV3DTO::vidIsSet() const
{
    return m_VidIsSet;
}

void UniswapV3PositionSnapshotV3DTO::unsetVid()
{
    m_VidIsSet = false;
}
}
}
}
}


