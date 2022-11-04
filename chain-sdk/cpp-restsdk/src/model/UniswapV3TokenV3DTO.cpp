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



#include "CppRestOpenAPIClient/model/UniswapV3TokenV3DTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UniswapV3TokenV3DTO::UniswapV3TokenV3DTO()
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
    m_Symbol = utility::conversions::to_string_t("");
    m_SymbolIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Decimals = 0;
    m_DecimalsIsSet = false;
    m_Total_supplyIsSet = false;
    m_Volume = utility::conversions::to_string_t("");
    m_VolumeIsSet = false;
    m_Volume_usd = utility::conversions::to_string_t("");
    m_Volume_usdIsSet = false;
    m_Untracked_volume_usd = utility::conversions::to_string_t("");
    m_Untracked_volume_usdIsSet = false;
    m_Fees_usd = utility::conversions::to_string_t("");
    m_Fees_usdIsSet = false;
    m_Tx_countIsSet = false;
    m_Pool_countIsSet = false;
    m_Total_value_locked = utility::conversions::to_string_t("");
    m_Total_value_lockedIsSet = false;
    m_Total_value_locked_usd = utility::conversions::to_string_t("");
    m_Total_value_locked_usdIsSet = false;
    m_Total_value_locked_usd_untracked = utility::conversions::to_string_t("");
    m_Total_value_locked_usd_untrackedIsSet = false;
    m_Derived_eth = utility::conversions::to_string_t("");
    m_Derived_ethIsSet = false;
    m_Whitelist_poolsIsSet = false;
    m_Token_symbol = utility::conversions::to_string_t("");
    m_Token_symbolIsSet = false;
}

UniswapV3TokenV3DTO::~UniswapV3TokenV3DTO()
{
}

void UniswapV3TokenV3DTO::validate()
{
    // TODO: implement validation
}

web::json::value UniswapV3TokenV3DTO::toJson() const
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
    if(m_SymbolIsSet)
    {
        val[utility::conversions::to_string_t(U("symbol"))] = ModelBase::toJson(m_Symbol);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_DecimalsIsSet)
    {
        val[utility::conversions::to_string_t(U("decimals"))] = ModelBase::toJson(m_Decimals);
    }
    if(m_Total_supplyIsSet)
    {
        val[utility::conversions::to_string_t(U("total_supply"))] = ModelBase::toJson(m_Total_supply);
    }
    if(m_VolumeIsSet)
    {
        val[utility::conversions::to_string_t(U("volume"))] = ModelBase::toJson(m_Volume);
    }
    if(m_Volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("volume_usd"))] = ModelBase::toJson(m_Volume_usd);
    }
    if(m_Untracked_volume_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("untracked_volume_usd"))] = ModelBase::toJson(m_Untracked_volume_usd);
    }
    if(m_Fees_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("fees_usd"))] = ModelBase::toJson(m_Fees_usd);
    }
    if(m_Tx_countIsSet)
    {
        val[utility::conversions::to_string_t(U("tx_count"))] = ModelBase::toJson(m_Tx_count);
    }
    if(m_Pool_countIsSet)
    {
        val[utility::conversions::to_string_t(U("pool_count"))] = ModelBase::toJson(m_Pool_count);
    }
    if(m_Total_value_lockedIsSet)
    {
        val[utility::conversions::to_string_t(U("total_value_locked"))] = ModelBase::toJson(m_Total_value_locked);
    }
    if(m_Total_value_locked_usdIsSet)
    {
        val[utility::conversions::to_string_t(U("total_value_locked_usd"))] = ModelBase::toJson(m_Total_value_locked_usd);
    }
    if(m_Total_value_locked_usd_untrackedIsSet)
    {
        val[utility::conversions::to_string_t(U("total_value_locked_usd_untracked"))] = ModelBase::toJson(m_Total_value_locked_usd_untracked);
    }
    if(m_Derived_ethIsSet)
    {
        val[utility::conversions::to_string_t(U("derived_eth"))] = ModelBase::toJson(m_Derived_eth);
    }
    if(m_Whitelist_poolsIsSet)
    {
        val[utility::conversions::to_string_t(U("whitelist_pools"))] = ModelBase::toJson(m_Whitelist_pools);
    }
    if(m_Token_symbolIsSet)
    {
        val[utility::conversions::to_string_t(U("token_symbol"))] = ModelBase::toJson(m_Token_symbol);
    }

    return val;
}

bool UniswapV3TokenV3DTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("symbol"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("symbol")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSymbol;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSymbol);
            setSymbol(refVal_setSymbol);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("decimals"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("decimals")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setDecimals;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDecimals);
            setDecimals(refVal_setDecimals);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_supply"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_supply")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<NumericsBigInteger> refVal_setTotalSupply;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalSupply);
            setTotalSupply(refVal_setTotalSupply);
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
    if(val.has_field(utility::conversions::to_string_t(U("fees_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fees_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFeesUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeesUsd);
            setFeesUsd(refVal_setFeesUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("tx_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("tx_count")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<NumericsBigInteger> refVal_setTxCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTxCount);
            setTxCount(refVal_setTxCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pool_count"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pool_count")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<NumericsBigInteger> refVal_setPoolCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPoolCount);
            setPoolCount(refVal_setPoolCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_value_locked"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_value_locked")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalValueLocked;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalValueLocked);
            setTotalValueLocked(refVal_setTotalValueLocked);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_value_locked_usd"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_value_locked_usd")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalValueLockedUsd;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalValueLockedUsd);
            setTotalValueLockedUsd(refVal_setTotalValueLockedUsd);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total_value_locked_usd_untracked"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total_value_locked_usd_untracked")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTotalValueLockedUsdUntracked;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalValueLockedUsdUntracked);
            setTotalValueLockedUsdUntracked(refVal_setTotalValueLockedUsdUntracked);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("derived_eth"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("derived_eth")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDerivedEth;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDerivedEth);
            setDerivedEth(refVal_setDerivedEth);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("whitelist_pools"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("whitelist_pools")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setWhitelistPools;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWhitelistPools);
            setWhitelistPools(refVal_setWhitelistPools);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("token_symbol"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("token_symbol")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setTokenSymbol;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTokenSymbol);
            setTokenSymbol(refVal_setTokenSymbol);
        }
    }
    return ok;
}

void UniswapV3TokenV3DTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_SymbolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("symbol")), m_Symbol));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_DecimalsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("decimals")), m_Decimals));
    }
    if(m_Total_supplyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_supply")), m_Total_supply));
    }
    if(m_VolumeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume")), m_Volume));
    }
    if(m_Volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("volume_usd")), m_Volume_usd));
    }
    if(m_Untracked_volume_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("untracked_volume_usd")), m_Untracked_volume_usd));
    }
    if(m_Fees_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fees_usd")), m_Fees_usd));
    }
    if(m_Tx_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("tx_count")), m_Tx_count));
    }
    if(m_Pool_countIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pool_count")), m_Pool_count));
    }
    if(m_Total_value_lockedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_value_locked")), m_Total_value_locked));
    }
    if(m_Total_value_locked_usdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_value_locked_usd")), m_Total_value_locked_usd));
    }
    if(m_Total_value_locked_usd_untrackedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total_value_locked_usd_untracked")), m_Total_value_locked_usd_untracked));
    }
    if(m_Derived_ethIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("derived_eth")), m_Derived_eth));
    }
    if(m_Whitelist_poolsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("whitelist_pools")), m_Whitelist_pools));
    }
    if(m_Token_symbolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("token_symbol")), m_Token_symbol));
    }
}

bool UniswapV3TokenV3DTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("symbol"))))
    {
        utility::string_t refVal_setSymbol;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("symbol"))), refVal_setSymbol );
        setSymbol(refVal_setSymbol);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("decimals"))))
    {
        int32_t refVal_setDecimals;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("decimals"))), refVal_setDecimals );
        setDecimals(refVal_setDecimals);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_supply"))))
    {
        std::shared_ptr<NumericsBigInteger> refVal_setTotalSupply;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_supply"))), refVal_setTotalSupply );
        setTotalSupply(refVal_setTotalSupply);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("volume"))))
    {
        utility::string_t refVal_setVolume;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("volume"))), refVal_setVolume );
        setVolume(refVal_setVolume);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("fees_usd"))))
    {
        utility::string_t refVal_setFeesUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fees_usd"))), refVal_setFeesUsd );
        setFeesUsd(refVal_setFeesUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("tx_count"))))
    {
        std::shared_ptr<NumericsBigInteger> refVal_setTxCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("tx_count"))), refVal_setTxCount );
        setTxCount(refVal_setTxCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pool_count"))))
    {
        std::shared_ptr<NumericsBigInteger> refVal_setPoolCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pool_count"))), refVal_setPoolCount );
        setPoolCount(refVal_setPoolCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_value_locked"))))
    {
        utility::string_t refVal_setTotalValueLocked;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_value_locked"))), refVal_setTotalValueLocked );
        setTotalValueLocked(refVal_setTotalValueLocked);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_value_locked_usd"))))
    {
        utility::string_t refVal_setTotalValueLockedUsd;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_value_locked_usd"))), refVal_setTotalValueLockedUsd );
        setTotalValueLockedUsd(refVal_setTotalValueLockedUsd);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total_value_locked_usd_untracked"))))
    {
        utility::string_t refVal_setTotalValueLockedUsdUntracked;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total_value_locked_usd_untracked"))), refVal_setTotalValueLockedUsdUntracked );
        setTotalValueLockedUsdUntracked(refVal_setTotalValueLockedUsdUntracked);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("derived_eth"))))
    {
        utility::string_t refVal_setDerivedEth;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("derived_eth"))), refVal_setDerivedEth );
        setDerivedEth(refVal_setDerivedEth);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("whitelist_pools"))))
    {
        std::vector<utility::string_t> refVal_setWhitelistPools;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("whitelist_pools"))), refVal_setWhitelistPools );
        setWhitelistPools(refVal_setWhitelistPools);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("token_symbol"))))
    {
        utility::string_t refVal_setTokenSymbol;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("token_symbol"))), refVal_setTokenSymbol );
        setTokenSymbol(refVal_setTokenSymbol);
    }
    return ok;
}

utility::datetime UniswapV3TokenV3DTO::getEntryTime() const
{
    return m_Entry_time;
}

void UniswapV3TokenV3DTO::setEntryTime(const utility::datetime& value)
{
    m_Entry_time = value;
    m_Entry_timeIsSet = true;
}

bool UniswapV3TokenV3DTO::entryTimeIsSet() const
{
    return m_Entry_timeIsSet;
}

void UniswapV3TokenV3DTO::unsetEntry_time()
{
    m_Entry_timeIsSet = false;
}
utility::datetime UniswapV3TokenV3DTO::getRecvTime() const
{
    return m_Recv_time;
}

void UniswapV3TokenV3DTO::setRecvTime(const utility::datetime& value)
{
    m_Recv_time = value;
    m_Recv_timeIsSet = true;
}

bool UniswapV3TokenV3DTO::recvTimeIsSet() const
{
    return m_Recv_timeIsSet;
}

void UniswapV3TokenV3DTO::unsetRecv_time()
{
    m_Recv_timeIsSet = false;
}
int64_t UniswapV3TokenV3DTO::getBlockNumber() const
{
    return m_Block_number;
}

void UniswapV3TokenV3DTO::setBlockNumber(int64_t value)
{
    m_Block_number = value;
    m_Block_numberIsSet = true;
}

bool UniswapV3TokenV3DTO::blockNumberIsSet() const
{
    return m_Block_numberIsSet;
}

void UniswapV3TokenV3DTO::unsetBlock_number()
{
    m_Block_numberIsSet = false;
}
int64_t UniswapV3TokenV3DTO::getVid() const
{
    return m_Vid;
}

void UniswapV3TokenV3DTO::setVid(int64_t value)
{
    m_Vid = value;
    m_VidIsSet = true;
}

bool UniswapV3TokenV3DTO::vidIsSet() const
{
    return m_VidIsSet;
}

void UniswapV3TokenV3DTO::unsetVid()
{
    m_VidIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getId() const
{
    return m_Id;
}

void UniswapV3TokenV3DTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool UniswapV3TokenV3DTO::idIsSet() const
{
    return m_IdIsSet;
}

void UniswapV3TokenV3DTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getSymbol() const
{
    return m_Symbol;
}

void UniswapV3TokenV3DTO::setSymbol(const utility::string_t& value)
{
    m_Symbol = value;
    m_SymbolIsSet = true;
}

bool UniswapV3TokenV3DTO::symbolIsSet() const
{
    return m_SymbolIsSet;
}

void UniswapV3TokenV3DTO::unsetSymbol()
{
    m_SymbolIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getName() const
{
    return m_Name;
}

void UniswapV3TokenV3DTO::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool UniswapV3TokenV3DTO::nameIsSet() const
{
    return m_NameIsSet;
}

void UniswapV3TokenV3DTO::unsetName()
{
    m_NameIsSet = false;
}
int32_t UniswapV3TokenV3DTO::getDecimals() const
{
    return m_Decimals;
}

void UniswapV3TokenV3DTO::setDecimals(int32_t value)
{
    m_Decimals = value;
    m_DecimalsIsSet = true;
}

bool UniswapV3TokenV3DTO::decimalsIsSet() const
{
    return m_DecimalsIsSet;
}

void UniswapV3TokenV3DTO::unsetDecimals()
{
    m_DecimalsIsSet = false;
}
std::shared_ptr<NumericsBigInteger> UniswapV3TokenV3DTO::getTotalSupply() const
{
    return m_Total_supply;
}

void UniswapV3TokenV3DTO::setTotalSupply(const std::shared_ptr<NumericsBigInteger>& value)
{
    m_Total_supply = value;
    m_Total_supplyIsSet = true;
}

bool UniswapV3TokenV3DTO::totalSupplyIsSet() const
{
    return m_Total_supplyIsSet;
}

void UniswapV3TokenV3DTO::unsetTotal_supply()
{
    m_Total_supplyIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getVolume() const
{
    return m_Volume;
}

void UniswapV3TokenV3DTO::setVolume(const utility::string_t& value)
{
    m_Volume = value;
    m_VolumeIsSet = true;
}

bool UniswapV3TokenV3DTO::volumeIsSet() const
{
    return m_VolumeIsSet;
}

void UniswapV3TokenV3DTO::unsetVolume()
{
    m_VolumeIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getVolumeUsd() const
{
    return m_Volume_usd;
}

void UniswapV3TokenV3DTO::setVolumeUsd(const utility::string_t& value)
{
    m_Volume_usd = value;
    m_Volume_usdIsSet = true;
}

bool UniswapV3TokenV3DTO::volumeUsdIsSet() const
{
    return m_Volume_usdIsSet;
}

void UniswapV3TokenV3DTO::unsetVolume_usd()
{
    m_Volume_usdIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getUntrackedVolumeUsd() const
{
    return m_Untracked_volume_usd;
}

void UniswapV3TokenV3DTO::setUntrackedVolumeUsd(const utility::string_t& value)
{
    m_Untracked_volume_usd = value;
    m_Untracked_volume_usdIsSet = true;
}

bool UniswapV3TokenV3DTO::untrackedVolumeUsdIsSet() const
{
    return m_Untracked_volume_usdIsSet;
}

void UniswapV3TokenV3DTO::unsetUntracked_volume_usd()
{
    m_Untracked_volume_usdIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getFeesUsd() const
{
    return m_Fees_usd;
}

void UniswapV3TokenV3DTO::setFeesUsd(const utility::string_t& value)
{
    m_Fees_usd = value;
    m_Fees_usdIsSet = true;
}

bool UniswapV3TokenV3DTO::feesUsdIsSet() const
{
    return m_Fees_usdIsSet;
}

void UniswapV3TokenV3DTO::unsetFees_usd()
{
    m_Fees_usdIsSet = false;
}
std::shared_ptr<NumericsBigInteger> UniswapV3TokenV3DTO::getTxCount() const
{
    return m_Tx_count;
}

void UniswapV3TokenV3DTO::setTxCount(const std::shared_ptr<NumericsBigInteger>& value)
{
    m_Tx_count = value;
    m_Tx_countIsSet = true;
}

bool UniswapV3TokenV3DTO::txCountIsSet() const
{
    return m_Tx_countIsSet;
}

void UniswapV3TokenV3DTO::unsetTx_count()
{
    m_Tx_countIsSet = false;
}
std::shared_ptr<NumericsBigInteger> UniswapV3TokenV3DTO::getPoolCount() const
{
    return m_Pool_count;
}

void UniswapV3TokenV3DTO::setPoolCount(const std::shared_ptr<NumericsBigInteger>& value)
{
    m_Pool_count = value;
    m_Pool_countIsSet = true;
}

bool UniswapV3TokenV3DTO::poolCountIsSet() const
{
    return m_Pool_countIsSet;
}

void UniswapV3TokenV3DTO::unsetPool_count()
{
    m_Pool_countIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getTotalValueLocked() const
{
    return m_Total_value_locked;
}

void UniswapV3TokenV3DTO::setTotalValueLocked(const utility::string_t& value)
{
    m_Total_value_locked = value;
    m_Total_value_lockedIsSet = true;
}

bool UniswapV3TokenV3DTO::totalValueLockedIsSet() const
{
    return m_Total_value_lockedIsSet;
}

void UniswapV3TokenV3DTO::unsetTotal_value_locked()
{
    m_Total_value_lockedIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getTotalValueLockedUsd() const
{
    return m_Total_value_locked_usd;
}

void UniswapV3TokenV3DTO::setTotalValueLockedUsd(const utility::string_t& value)
{
    m_Total_value_locked_usd = value;
    m_Total_value_locked_usdIsSet = true;
}

bool UniswapV3TokenV3DTO::totalValueLockedUsdIsSet() const
{
    return m_Total_value_locked_usdIsSet;
}

void UniswapV3TokenV3DTO::unsetTotal_value_locked_usd()
{
    m_Total_value_locked_usdIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getTotalValueLockedUsdUntracked() const
{
    return m_Total_value_locked_usd_untracked;
}

void UniswapV3TokenV3DTO::setTotalValueLockedUsdUntracked(const utility::string_t& value)
{
    m_Total_value_locked_usd_untracked = value;
    m_Total_value_locked_usd_untrackedIsSet = true;
}

bool UniswapV3TokenV3DTO::totalValueLockedUsdUntrackedIsSet() const
{
    return m_Total_value_locked_usd_untrackedIsSet;
}

void UniswapV3TokenV3DTO::unsetTotal_value_locked_usd_untracked()
{
    m_Total_value_locked_usd_untrackedIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getDerivedEth() const
{
    return m_Derived_eth;
}

void UniswapV3TokenV3DTO::setDerivedEth(const utility::string_t& value)
{
    m_Derived_eth = value;
    m_Derived_ethIsSet = true;
}

bool UniswapV3TokenV3DTO::derivedEthIsSet() const
{
    return m_Derived_ethIsSet;
}

void UniswapV3TokenV3DTO::unsetDerived_eth()
{
    m_Derived_ethIsSet = false;
}
std::vector<utility::string_t>& UniswapV3TokenV3DTO::getWhitelistPools()
{
    return m_Whitelist_pools;
}

void UniswapV3TokenV3DTO::setWhitelistPools(const std::vector<utility::string_t>& value)
{
    m_Whitelist_pools = value;
    m_Whitelist_poolsIsSet = true;
}

bool UniswapV3TokenV3DTO::whitelistPoolsIsSet() const
{
    return m_Whitelist_poolsIsSet;
}

void UniswapV3TokenV3DTO::unsetWhitelist_pools()
{
    m_Whitelist_poolsIsSet = false;
}
utility::string_t UniswapV3TokenV3DTO::getTokenSymbol() const
{
    return m_Token_symbol;
}

void UniswapV3TokenV3DTO::setTokenSymbol(const utility::string_t& value)
{
    m_Token_symbol = value;
    m_Token_symbolIsSet = true;
}

bool UniswapV3TokenV3DTO::tokenSymbolIsSet() const
{
    return m_Token_symbolIsSet;
}

void UniswapV3TokenV3DTO::unsetToken_symbol()
{
    m_Token_symbolIsSet = false;
}
}
}
}
}


