/**
 * On Chain Dapps - REST API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.3.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Dex_OrderDTO.h
 *
 * Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_OrderDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_OrderDTO_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// Order submitted by an user. It has a validity (dates) so they can only be executed from/until some given batches. Partial executions of this trades must respect the limit price.
/// </summary>
class  Dex_OrderDTO
    : public ModelBase
{
public:
    Dex_OrderDTO();
    virtual ~Dex_OrderDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Dex_OrderDTO members

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
    /// Identifier, format: (owner address)-(order id)
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// Reference to owner.
    /// </summary>
    utility::string_t getOwner() const;
    bool ownerIsSet() const;
    void unsetOwner();

    void setOwner(const utility::string_t& value);

    /// <summary>
    /// Order id.
    /// </summary>
    int32_t getOrderId() const;
    bool orderIdIsSet() const;
    void unsetOrder_id();

    void setOrderId(int32_t value);

    /// <summary>
    /// Batch id from which order became valid.
    /// </summary>
    utility::string_t getFromBatchId() const;
    bool fromBatchIdIsSet() const;
    void unsetFrom_batch_id();

    void setFromBatchId(const utility::string_t& value);

    /// <summary>
    /// Start of epoch in which order was placed and became valid.
    /// </summary>
    utility::string_t getFromEpoch() const;
    bool fromEpochIsSet() const;
    void unsetFrom_epoch();

    void setFromEpoch(const utility::string_t& value);

    /// <summary>
    /// Batch id until which trade was still valid.
    /// </summary>
    utility::string_t getUntilBatchId() const;
    bool untilBatchIdIsSet() const;
    void unsetUntil_batch_id();

    void setUntilBatchId(const utility::string_t& value);

    /// <summary>
    /// End of epoch in which order was placed.
    /// </summary>
    utility::string_t getUntilEpoch() const;
    bool untilEpochIsSet() const;
    void unsetUntil_epoch();

    void setUntilEpoch(const utility::string_t& value);

    /// <summary>
    /// Identifier of token that was bought.
    /// </summary>
    utility::string_t getBuyToken() const;
    bool buyTokenIsSet() const;
    void unsetBuy_token();

    void setBuyToken(const utility::string_t& value);

    /// <summary>
    /// Identifier of token that was sold.
    /// </summary>
    utility::string_t getSellToken() const;
    bool sellTokenIsSet() const;
    void unsetSell_token();

    void setSellToken(const utility::string_t& value);

    /// <summary>
    /// Price enumerator.
    /// </summary>
    utility::string_t getPriceNumerator() const;
    bool priceNumeratorIsSet() const;
    void unsetPrice_numerator();

    void setPriceNumerator(const utility::string_t& value);

    /// <summary>
    /// Price denominator.
    /// </summary>
    utility::string_t getPriceDenominator() const;
    bool priceDenominatorIsSet() const;
    void unsetPrice_denominator();

    void setPriceDenominator(const utility::string_t& value);

    /// <summary>
    /// Maximum sell amount.
    /// </summary>
    utility::string_t getMaxSellAmount() const;
    bool maxSellAmountIsSet() const;
    void unsetMax_sell_amount();

    void setMaxSellAmount(const utility::string_t& value);

    /// <summary>
    /// Minimum receive amount.
    /// </summary>
    utility::string_t getMinReceiveAmount() const;
    bool minReceiveAmountIsSet() const;
    void unsetMin_receive_amount();

    void setMinReceiveAmount(const utility::string_t& value);

    /// <summary>
    /// Sold volume.
    /// </summary>
    utility::string_t getSoldVolume() const;
    bool soldVolumeIsSet() const;
    void unsetSold_volume();

    void setSoldVolume(const utility::string_t& value);

    /// <summary>
    /// Bought volume.
    /// </summary>
    utility::string_t getBoughtVolume() const;
    bool boughtVolumeIsSet() const;
    void unsetBought_volume();

    void setBoughtVolume(const utility::string_t& value);

    /// <summary>
    /// Epoch in which order was created.
    /// </summary>
    utility::string_t getCreateEpoch() const;
    bool createEpochIsSet() const;
    void unsetCreate_epoch();

    void setCreateEpoch(const utility::string_t& value);

    /// <summary>
    /// Epoch in which order was cancelled.
    /// </summary>
    utility::string_t getCancelEpoch() const;
    bool cancelEpochIsSet() const;
    void unsetCancel_epoch();

    void setCancelEpoch(const utility::string_t& value);

    /// <summary>
    /// Epoch in which order was deleted.
    /// </summary>
    utility::string_t getDeleteEpoch() const;
    bool deleteEpochIsSet() const;
    void unsetDelete_epoch();

    void setDeleteEpoch(const utility::string_t& value);

    /// <summary>
    /// Transaction hash.
    /// </summary>
    utility::string_t getTxHash() const;
    bool txHashIsSet() const;
    void unsetTx_hash();

    void setTxHash(const utility::string_t& value);

    /// <summary>
    /// Event index within transaction.
    /// </summary>
    utility::string_t getTxLogIndex() const;
    bool txLogIndexIsSet() const;
    void unsetTx_log_index();

    void setTxLogIndex(const utility::string_t& value);

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
    int32_t m_Order_id;
    bool m_Order_idIsSet;
    utility::string_t m_From_batch_id;
    bool m_From_batch_idIsSet;
    utility::string_t m_From_epoch;
    bool m_From_epochIsSet;
    utility::string_t m_Until_batch_id;
    bool m_Until_batch_idIsSet;
    utility::string_t m_Until_epoch;
    bool m_Until_epochIsSet;
    utility::string_t m_Buy_token;
    bool m_Buy_tokenIsSet;
    utility::string_t m_Sell_token;
    bool m_Sell_tokenIsSet;
    utility::string_t m_Price_numerator;
    bool m_Price_numeratorIsSet;
    utility::string_t m_Price_denominator;
    bool m_Price_denominatorIsSet;
    utility::string_t m_Max_sell_amount;
    bool m_Max_sell_amountIsSet;
    utility::string_t m_Min_receive_amount;
    bool m_Min_receive_amountIsSet;
    utility::string_t m_Sold_volume;
    bool m_Sold_volumeIsSet;
    utility::string_t m_Bought_volume;
    bool m_Bought_volumeIsSet;
    utility::string_t m_Create_epoch;
    bool m_Create_epochIsSet;
    utility::string_t m_Cancel_epoch;
    bool m_Cancel_epochIsSet;
    utility::string_t m_Delete_epoch;
    bool m_Delete_epochIsSet;
    utility::string_t m_Tx_hash;
    bool m_Tx_hashIsSet;
    utility::string_t m_Tx_log_index;
    bool m_Tx_log_indexIsSet;
    int64_t m_Vid;
    bool m_VidIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_Dex_OrderDTO_H_ */
