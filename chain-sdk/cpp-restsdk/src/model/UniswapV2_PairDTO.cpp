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



#include "CppRestOpenAPIClient/model/UniswapV2_PairDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UniswapV2_PairDTO::UniswapV2_PairDTO()
{
    m_Entry_time = utility::datetime();
    m_Entry_timeIsSet = false;
    m_Recv_time = utility::datetime();
    m_Recv_timeIsSet = false;
    m_Block_number = 0L;
    m_Block_numberIsSet = false;
    m_Vid = 0L;
    m_VidIsSet = false;
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Token_0 = utility::conversions::to_string_t("");
    m_Token_0IsSet = false;
    m_Token_1 = utility::conversions::to_string_t("");
    m_Token_1IsSet = false;
    m_Reserve_0 = utility::conversions::to_string_t("");
    m_Reserve_0IsSet = false;
    m_Reserve_1 = utility::conversions::to_string_t("");
    m_Reserve_1IsSet = false;
    m_Total_supply = utility::conversions::to_string_t("");
    m_Total_supplyIsSet = false;
    m_Reserve_eth = utility::conversions::to_string_t("");
    m_Reserve_ethIsSet = false;
    m_Reserve_usd = utility::conversions::to_string_t("");
    m_Reserve_usdIsSet = false;
    m_Tracked_reserve_eth = utility::conversions::to_string_t("");
    m_Tracked_reserve_ethIsSet = false;
    m_Token_0_price = utility::conversions::to_string_t("");
    m_Token_0_priceIsSet = false;
    m_Token_1_price = utility::conversions::to_string_t("");
    m_Token_1_priceIsSet = false;
    m_Volume_token_0 = utility::conversions::to_string_t("");
    m_Volume_token_0IsSet = false;
    m_Volume_token_1 = utility::conversions::to_string_t("");
    m_Volume_token_1IsSet = false;
    m_Volume_usd = utility::conversions::to_string_t("");
    m_Volume_usdIsSet = false;
    m_Untracked_volume_usd = utility::conversions::to_string_t("");
    m_Untracked_volume_usdIsSet = false;
    m_Tx_countIsSet = false;
    m_Created_at_timestamp = utility::datetime();
    m_Created_at_timestampIsSet = false;
    m_Liquidity_provider_count = utility::conversions::to_string_t("");
    m_Liquidity_provider_countIsSet = false;
    m_Evaluated_ask = 0.0;
    m_Evaluated_askIsSet = false;
}

UniswapV2_PairDTO::~UniswapV2_PairDTO()
{
}

void UniswapV2_PairDTO::validate()
{
    // TODO: implement validation
}

web::json::value UniswapV2_PairDTO::toJson() const
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
    if(m_VidIsSet)
    {
        val[utility::conversions::to_string_t(U("vid"))] = ModelBase::toJson(m_Vid);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_Token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("token_0"))] = ModelBase::toJson(m_Token_0);
    }
    if(m_Token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("token_1"))] = ModelBase::toJson(m_Token_1);
    }
    if(m_Reserve_0IsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_0"))] = ModelBase::toJson(m_Reserve_0);
    }
    if(m_Reserve_1IsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_1"))] = ModelBase::toJson(m_Reserve_1);
    }
    if(m_Total_supplyIsSet)
    {
        val[utility::conversions::to_string_t(U("total_supply"))] = ModelBase::toJson(m_Total_supply);
    }
    if(m_Reserve_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_eth"))] = ModelBase::toJson(m_Reserve_eth);
    }
    if(m_Reserve_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("reserve_usd"))] = ModelBase::toJson(m_Reserve_usd);
    }
    if(m_Tracked_reserve_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("tracked_reserve_eth"))] = ModelBase::toJson(m_Tracked_reserve_eth);
    }
    if(m_Token_0_priceIsSet)
    {
        val[utility::conversions::to_string_t(U("token_0_price"))] = ModelBase::toJson(m_Token_0_price);
    }
    if(m_Token_1_priceIsSet)
    {
        val[utility::conversions::to_string_t(U("token_1_price"))] = ModelBase::toJson(m_Token_1_price);
    }
    if(m_Volume_token_0IsSet)
    {
        val[utility::conversions::to_string_t(U("volume_token_0"))] = ModelBase::toJson(m_Volume_token_0);
    }
    if(m_Volume_token_1IsSet)
    {
        val[utility::conversions::to_string_t(U("volume_token_1"))] = ModelBase::toJson(m_Volume_token_1);
    }
    if(m_Volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("volume_usd"))] = ModelBase::toJson(m_Volume_usd);
    }
    if(m_Untracked_volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("untracked_volume_usd"))] = ModelBase::toJson(m_Untracked_volume_usd);
    }
    if(m_Tx_countIsSet)
    {
        val[utility::conversions::to_string_t(U("tx_count"))] = ModelBase::toJson(m_Tx_count);
    }
    if(m_Created_at_timestampIsSet)
    {
        val[utility::conversions::to_string_t(U("created_at_timestamp"))] = ModelBase::toJson(m_Created_at_timestamp);
    }
    if(m_Liquidity_provider_countIsSet)
    {
        val[utility::conversions::to_string_t(U("liquidity_provider_count"))] = ModelBase::toJson(m_Liquidity_provider_count);
    }
    if(m_Evaluated_askIsSet)
    {
        val[utility::conversions::to_string_t(U("evaluated_ask"))] = ModelBase::toJson(m_Evaluated_ask);
    }

    return val;
}

bool UniswapV2_PairDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("token_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken0);
            setToken0(refVal_setToken0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken1);
            setToken1(refVal_setToken1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("reserve_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("reserve_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setReserve0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReserve0);
            setReserve0(refVal_setReserve0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("reserve_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("reserve_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setReserve1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReserve1);
            setReserve1(refVal_setReserve1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_supply"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_supply")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalSupply;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalSupply);
            setTotalSupply(refVal_setTotalSupply);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("reserve_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("reserve_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setReserveEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReserveEth);
            setReserveEth(refVal_setReserveEth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("reserve_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("reserve_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setReserveUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setReserveUsd);
            setReserveUsd(refVal_setReserveUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tracked_reserve_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tracked_reserve_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTrackedReserveEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTrackedReserveEth);
            setTrackedReserveEth(refVal_setTrackedReserveEth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_0_price"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_0_price")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken0Price;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken0Price);
            setToken0Price(refVal_setToken0Price);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_1_price"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_1_price")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setToken1Price;
            ok &= ModelBase::fromJson(fieldValue, refVal_setToken1Price);
            setToken1Price(refVal_setToken1Price);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("volume_token_0"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("volume_token_0")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVolumeToken0;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVolumeToken0);
            setVolumeToken0(refVal_setVolumeToken0);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("volume_token_1"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("volume_token_1")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVolumeToken1;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVolumeToken1);
            setVolumeToken1(refVal_setVolumeToken1);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("volume_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("volume_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setVolumeUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVolumeUsd);
            setVolumeUsd(refVal_setVolumeUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("untracked_volume_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("untracked_volume_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUntrackedVolumeUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUntrackedVolumeUsd);
            setUntrackedVolumeUsd(refVal_setUntrackedVolumeUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tx_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tx_count")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Numerics_BigInteger> refVal_setTxCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTxCount);
            setTxCount(refVal_setTxCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created_at_timestamp"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created_at_timestamp")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setCreatedAtTimestamp;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatedAtTimestamp);
            setCreatedAtTimestamp(refVal_setCreatedAtTimestamp);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("liquidity_provider_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("liquidity_provider_count")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLiquidityProviderCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLiquidityProviderCount);
            setLiquidityProviderCount(refVal_setLiquidityProviderCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("evaluated_ask"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("evaluated_ask")));
        if(!fieldValue.is_null())
        {
            double refVal_setEvaluatedAsk;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEvaluatedAsk);
            setEvaluatedAsk(refVal_setEvaluatedAsk);
        }
    }
    return ok;
}

void UniswapV2_PairDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_VidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vid")), m_Vid));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_Token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_0")), m_Token_0));
    }
    if(m_Token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_1")), m_Token_1));
    }
    if(m_Reserve_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_0")), m_Reserve_0));
    }
    if(m_Reserve_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_1")), m_Reserve_1));
    }
    if(m_Total_supplyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_supply")), m_Total_supply));
    }
    if(m_Reserve_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_eth")), m_Reserve_eth));
    }
    if(m_Reserve_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("reserve_usd")), m_Reserve_usd));
    }
    if(m_Tracked_reserve_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tracked_reserve_eth")), m_Tracked_reserve_eth));
    }
    if(m_Token_0_priceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_0_price")), m_Token_0_price));
    }
    if(m_Token_1_priceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_1_price")), m_Token_1_price));
    }
    if(m_Volume_token_0IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume_token_0")), m_Volume_token_0));
    }
    if(m_Volume_token_1IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume_token_1")), m_Volume_token_1));
    }
    if(m_Volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume_usd")), m_Volume_usd));
    }
    if(m_Untracked_volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("untracked_volume_usd")), m_Untracked_volume_usd));
    }
    if(m_Tx_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tx_count")), m_Tx_count));
    }
    if(m_Created_at_timestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_at_timestamp")), m_Created_at_timestamp));
    }
    if(m_Liquidity_provider_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("liquidity_provider_count")), m_Liquidity_provider_count));
    }
    if(m_Evaluated_askIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("evaluated_ask")), m_Evaluated_ask));
    }
}

bool UniswapV2_PairDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("vid"))))
    {
        int64_t refVal_setVid;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vid"))), refVal_setVid );
        setVid(refVal_setVid);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_0"))))
    {
        utility::string_t refVal_setToken0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_0"))), refVal_setToken0 );
        setToken0(refVal_setToken0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_1"))))
    {
        utility::string_t refVal_setToken1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_1"))), refVal_setToken1 );
        setToken1(refVal_setToken1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("reserve_0"))))
    {
        utility::string_t refVal_setReserve0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reserve_0"))), refVal_setReserve0 );
        setReserve0(refVal_setReserve0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("reserve_1"))))
    {
        utility::string_t refVal_setReserve1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reserve_1"))), refVal_setReserve1 );
        setReserve1(refVal_setReserve1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_supply"))))
    {
        utility::string_t refVal_setTotalSupply;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_supply"))), refVal_setTotalSupply );
        setTotalSupply(refVal_setTotalSupply);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("reserve_eth"))))
    {
        utility::string_t refVal_setReserveEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reserve_eth"))), refVal_setReserveEth );
        setReserveEth(refVal_setReserveEth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("reserve_usd"))))
    {
        utility::string_t refVal_setReserveUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("reserve_usd"))), refVal_setReserveUsd );
        setReserveUsd(refVal_setReserveUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tracked_reserve_eth"))))
    {
        utility::string_t refVal_setTrackedReserveEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tracked_reserve_eth"))), refVal_setTrackedReserveEth );
        setTrackedReserveEth(refVal_setTrackedReserveEth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_0_price"))))
    {
        utility::string_t refVal_setToken0Price;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_0_price"))), refVal_setToken0Price );
        setToken0Price(refVal_setToken0Price);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_1_price"))))
    {
        utility::string_t refVal_setToken1Price;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_1_price"))), refVal_setToken1Price );
        setToken1Price(refVal_setToken1Price);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume_token_0"))))
    {
        utility::string_t refVal_setVolumeToken0;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume_token_0"))), refVal_setVolumeToken0 );
        setVolumeToken0(refVal_setVolumeToken0);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume_token_1"))))
    {
        utility::string_t refVal_setVolumeToken1;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume_token_1"))), refVal_setVolumeToken1 );
        setVolumeToken1(refVal_setVolumeToken1);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume_usd"))))
    {
        utility::string_t refVal_setVolumeUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume_usd"))), refVal_setVolumeUsd );
        setVolumeUsd(refVal_setVolumeUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("untracked_volume_usd"))))
    {
        utility::string_t refVal_setUntrackedVolumeUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("untracked_volume_usd"))), refVal_setUntrackedVolumeUsd );
        setUntrackedVolumeUsd(refVal_setUntrackedVolumeUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tx_count"))))
    {
        std::shared_ptr<Numerics_BigInteger> refVal_setTxCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tx_count"))), refVal_setTxCount );
        setTxCount(refVal_setTxCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created_at_timestamp"))))
    {
        utility::datetime refVal_setCreatedAtTimestamp;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_at_timestamp"))), refVal_setCreatedAtTimestamp );
        setCreatedAtTimestamp(refVal_setCreatedAtTimestamp);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("liquidity_provider_count"))))
    {
        utility::string_t refVal_setLiquidityProviderCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("liquidity_provider_count"))), refVal_setLiquidityProviderCount );
        setLiquidityProviderCount(refVal_setLiquidityProviderCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("evaluated_ask"))))
    {
        double refVal_setEvaluatedAsk;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("evaluated_ask"))), refVal_setEvaluatedAsk );
        setEvaluatedAsk(refVal_setEvaluatedAsk);
    }
    return ok;
}

utility::datetime UniswapV2_PairDTO::getEntryTime() const
{
    return m_Entry_time;
}

void UniswapV2_PairDTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool UniswapV2_PairDTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void UniswapV2_PairDTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime UniswapV2_PairDTO::getRecvTime() const
{
    return m_Recv_time;
}

void UniswapV2_PairDTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool UniswapV2_PairDTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void UniswapV2_PairDTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t UniswapV2_PairDTO::getBlockNumber() const
{
    return m_Block_number;
}

void UniswapV2_PairDTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool UniswapV2_PairDTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void UniswapV2_PairDTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
int64_t UniswapV2_PairDTO::getVid() const
{
    return m_Vid;
}

void UniswapV2_PairDTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool UniswapV2_PairDTO::vidIsSet() const
{
    return m_VidIsSet;
}

void UniswapV2_PairDTO::unsetVid()
{
    m_VidIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getId() const
{
    return m_Id;
}

void UniswapV2_PairDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool UniswapV2_PairDTO::idIsSet() const
{
    return m_IdIsSet;
}

void UniswapV2_PairDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getToken0() const
{
    return m_Token_0;
}

void UniswapV2_PairDTO::setToken0(const utility::string_t& value)
{
    m_Token_0 = value;
    m_Token_0IsSet = true;
}

bool UniswapV2_PairDTO::token0IsSet() const
{
    return m_Token_0IsSet;
}

void UniswapV2_PairDTO::unsetToken_0()
{
    m_Token_0IsSet = false;
}
utility::string_t UniswapV2_PairDTO::getToken1() const
{
    return m_Token_1;
}

void UniswapV2_PairDTO::setToken1(const utility::string_t& value)
{
    m_Token_1 = value;
    m_Token_1IsSet = true;
}

bool UniswapV2_PairDTO::token1IsSet() const
{
    return m_Token_1IsSet;
}

void UniswapV2_PairDTO::unsetToken_1()
{
    m_Token_1IsSet = false;
}
utility::string_t UniswapV2_PairDTO::getReserve0() const
{
    return m_Reserve_0;
}

void UniswapV2_PairDTO::setReserve0(const utility::string_t& value)
{
    m_Reserve_0 = value;
    m_Reserve_0IsSet = true;
}

bool UniswapV2_PairDTO::reserve0IsSet() const
{
    return m_Reserve_0IsSet;
}

void UniswapV2_PairDTO::unsetReserve_0()
{
    m_Reserve_0IsSet = false;
}
utility::string_t UniswapV2_PairDTO::getReserve1() const
{
    return m_Reserve_1;
}

void UniswapV2_PairDTO::setReserve1(const utility::string_t& value)
{
    m_Reserve_1 = value;
    m_Reserve_1IsSet = true;
}

bool UniswapV2_PairDTO::reserve1IsSet() const
{
    return m_Reserve_1IsSet;
}

void UniswapV2_PairDTO::unsetReserve_1()
{
    m_Reserve_1IsSet = false;
}
utility::string_t UniswapV2_PairDTO::getTotalSupply() const
{
    return m_Total_supply;
}

void UniswapV2_PairDTO::setTotalSupply(const utility::string_t& value)
{
    m_Total_supply = value;
    m_Total_supplyIsSet = true;
}

bool UniswapV2_PairDTO::totalSupplyIsSet() const
{
    return m_Total_supplyIsSet;
}

void UniswapV2_PairDTO::unsetTotal_supply()
{
    m_Total_supplyIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getReserveEth() const
{
    return m_Reserve_eth;
}

void UniswapV2_PairDTO::setReserveEth(const utility::string_t& value)
{
    m_Reserve_eth = value;
    m_Reserve_ethIsSet = true;
}

bool UniswapV2_PairDTO::reserveEthIsSet() const
{
    return m_Reserve_ethIsSet;
}

void UniswapV2_PairDTO::unsetReserve_eth()
{
    m_Reserve_ethIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getReserveUsd() const
{
    return m_Reserve_usd;
}

void UniswapV2_PairDTO::setReserveUsd(const utility::string_t& value)
{
    m_Reserve_usd = value;
    m_Reserve_usdIsSet = true;
}

bool UniswapV2_PairDTO::reserveUsdIsSet() const
{
    return m_Reserve_usdIsSet;
}

void UniswapV2_PairDTO::unsetReserve_usd()
{
    m_Reserve_usdIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getTrackedReserveEth() const
{
    return m_Tracked_reserve_eth;
}

void UniswapV2_PairDTO::setTrackedReserveEth(const utility::string_t& value)
{
    m_Tracked_reserve_eth = value;
    m_Tracked_reserve_ethIsSet = true;
}

bool UniswapV2_PairDTO::trackedReserveEthIsSet() const
{
    return m_Tracked_reserve_ethIsSet;
}

void UniswapV2_PairDTO::unsetTracked_reserve_eth()
{
    m_Tracked_reserve_ethIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getToken0Price() const
{
    return m_Token_0_price;
}

void UniswapV2_PairDTO::setToken0Price(const utility::string_t& value)
{
    m_Token_0_price = value;
    m_Token_0_priceIsSet = true;
}

bool UniswapV2_PairDTO::token0PriceIsSet() const
{
    return m_Token_0_priceIsSet;
}

void UniswapV2_PairDTO::unsetToken_0_price()
{
    m_Token_0_priceIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getToken1Price() const
{
    return m_Token_1_price;
}

void UniswapV2_PairDTO::setToken1Price(const utility::string_t& value)
{
    m_Token_1_price = value;
    m_Token_1_priceIsSet = true;
}

bool UniswapV2_PairDTO::token1PriceIsSet() const
{
    return m_Token_1_priceIsSet;
}

void UniswapV2_PairDTO::unsetToken_1_price()
{
    m_Token_1_priceIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getVolumeToken0() const
{
    return m_Volume_token_0;
}

void UniswapV2_PairDTO::setVolumeToken0(const utility::string_t& value)
{
    m_Volume_token_0 = value;
    m_Volume_token_0IsSet = true;
}

bool UniswapV2_PairDTO::volumeToken0IsSet() const
{
    return m_Volume_token_0IsSet;
}

void UniswapV2_PairDTO::unsetVolume_token_0()
{
    m_Volume_token_0IsSet = false;
}
utility::string_t UniswapV2_PairDTO::getVolumeToken1() const
{
    return m_Volume_token_1;
}

void UniswapV2_PairDTO::setVolumeToken1(const utility::string_t& value)
{
    m_Volume_token_1 = value;
    m_Volume_token_1IsSet = true;
}

bool UniswapV2_PairDTO::volumeToken1IsSet() const
{
    return m_Volume_token_1IsSet;
}

void UniswapV2_PairDTO::unsetVolume_token_1()
{
    m_Volume_token_1IsSet = false;
}
utility::string_t UniswapV2_PairDTO::getVolumeUsd() const
{
    return m_Volume_usd;
}

void UniswapV2_PairDTO::setVolumeUsd(const utility::string_t& value)
{
    m_Volume_usd = value;
    m_Volume_usdIsSet = true;
}

bool UniswapV2_PairDTO::volumeUsdIsSet() const
{
    return m_Volume_usdIsSet;
}

void UniswapV2_PairDTO::unsetVolume_usd()
{
    m_Volume_usdIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getUntrackedVolumeUsd() const
{
    return m_Untracked_volume_usd;
}

void UniswapV2_PairDTO::setUntrackedVolumeUsd(const utility::string_t& value)
{
    m_Untracked_volume_usd = value;
    m_Untracked_volume_usdIsSet = true;
}

bool UniswapV2_PairDTO::untrackedVolumeUsdIsSet() const
{
    return m_Untracked_volume_usdIsSet;
}

void UniswapV2_PairDTO::unsetUntracked_volume_usd()
{
    m_Untracked_volume_usdIsSet = false;
}
std::shared_ptr<Numerics_BigInteger> UniswapV2_PairDTO::getTxCount() const
{
    return m_Tx_count;
}

void UniswapV2_PairDTO::setTxCount(const std::shared_ptr<Numerics_BigInteger>& value)
{
    m_Tx_count = value;
    m_Tx_countIsSet = true;
}

bool UniswapV2_PairDTO::txCountIsSet() const
{
    return m_Tx_countIsSet;
}

void UniswapV2_PairDTO::unsetTx_count()
{
    m_Tx_countIsSet = false;
}
utility::datetime UniswapV2_PairDTO::getCreatedAtTimestamp() const
{
    return m_Created_at_timestamp;
}

void UniswapV2_PairDTO::setCreatedAtTimestamp(const utility::datetime& value)
{
    m_Created_at_timestamp = value;
    m_Created_at_timestampIsSet = true;
}

bool UniswapV2_PairDTO::createdAtTimestampIsSet() const
{
    return m_Created_at_timestampIsSet;
}

void UniswapV2_PairDTO::unsetCreated_at_timestamp()
{
    m_Created_at_timestampIsSet = false;
}
utility::string_t UniswapV2_PairDTO::getLiquidityProviderCount() const
{
    return m_Liquidity_provider_count;
}

void UniswapV2_PairDTO::setLiquidityProviderCount(const utility::string_t& value)
{
    m_Liquidity_provider_count = value;
    m_Liquidity_provider_countIsSet = true;
}

bool UniswapV2_PairDTO::liquidityProviderCountIsSet() const
{
    return m_Liquidity_provider_countIsSet;
}

void UniswapV2_PairDTO::unsetLiquidity_provider_count()
{
    m_Liquidity_provider_countIsSet = false;
}
double UniswapV2_PairDTO::getEvaluatedAsk() const
{
    return m_Evaluated_ask;
}

void UniswapV2_PairDTO::setEvaluatedAsk(double value)
{
    m_Evaluated_ask = value;
    m_Evaluated_askIsSet = true;
}

bool UniswapV2_PairDTO::evaluatedAskIsSet() const
{
    return m_Evaluated_askIsSet;
}

void UniswapV2_PairDTO::unsetEvaluated_ask()
{
    m_Evaluated_askIsSet = false;
}
}
}
}
}


