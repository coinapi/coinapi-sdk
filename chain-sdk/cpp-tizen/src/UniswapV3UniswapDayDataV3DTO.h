/*
 * UniswapV3UniswapDayDataV3DTO.h
 *
 * Data accumulated and condensed into day stats for all of Uniswap.
 */

#ifndef _UniswapV3UniswapDayDataV3DTO_H_
#define _UniswapV3UniswapDayDataV3DTO_H_


#include <string>
#include "NumericsBigInteger.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Data accumulated and condensed into day stats for all of Uniswap.
 *
 *  \ingroup Models
 *
 */

class UniswapV3UniswapDayDataV3DTO : public Object {
public:
	/*! \brief Constructor.
	 */
	UniswapV3UniswapDayDataV3DTO();
	UniswapV3UniswapDayDataV3DTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UniswapV3UniswapDayDataV3DTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getEntryTime();

	/*! \brief Set 
	 */
	void setEntryTime(std::string  entry_time);
	/*! \brief Get 
	 */
	std::string getRecvTime();

	/*! \brief Set 
	 */
	void setRecvTime(std::string  recv_time);
	/*! \brief Get Number of block in which entity was recorded.
	 */
	long long getBlockNumber();

	/*! \brief Set Number of block in which entity was recorded.
	 */
	void setBlockNumber(long long  block_number);
	/*! \brief Get 
	 */
	long long getVid();

	/*! \brief Set 
	 */
	void setVid(long long  vid);
	/*! \brief Get Timestamp rounded to current day by dividing by 86400.
	 */
	std::string getId();

	/*! \brief Set Timestamp rounded to current day by dividing by 86400.
	 */
	void setId(std::string  id);
	/*! \brief Get Timestamp rounded to current day by dividing by 86400.
	 */
	int getDate();

	/*! \brief Set Timestamp rounded to current day by dividing by 86400.
	 */
	void setDate(int  date);
	/*! \brief Get Total volume across all pairs on this day, stored as a derived amount of ETH.
	 */
	std::string getVolumeEth();

	/*! \brief Set Total volume across all pairs on this day, stored as a derived amount of ETH.
	 */
	void setVolumeEth(std::string  volume_eth);
	/*! \brief Get Total volume across all pairs on this day, stored as a derived amount of USD.
	 */
	std::string getVolumeUsd();

	/*! \brief Set Total volume across all pairs on this day, stored as a derived amount of USD.
	 */
	void setVolumeUsd(std::string  volume_usd);
	/*! \brief Get Total daily volume in Uniswap derived in terms of USD untracked.
	 */
	std::string getVolumeUsdUntracked();

	/*! \brief Set Total daily volume in Uniswap derived in terms of USD untracked.
	 */
	void setVolumeUsdUntracked(std::string  volume_usd_untracked);
	/*! \brief Get Fees in USD
	 */
	std::string getFeesUsd();

	/*! \brief Set Fees in USD
	 */
	void setFeesUsd(std::string  fees_usd);
	/*! \brief Get 
	 */
	NumericsBigInteger getTxCount();

	/*! \brief Set 
	 */
	void setTxCount(NumericsBigInteger  tx_count);
	/*! \brief Get Tvl in terms of USD.
	 */
	std::string getTvlUsd();

	/*! \brief Set Tvl in terms of USD.
	 */
	void setTvlUsd(std::string  tvl_usd);

private:
	std::string entry_time;
	std::string recv_time;
	long long block_number;
	long long vid;
	std::string id;
	int date;
	std::string volume_eth;
	std::string volume_usd;
	std::string volume_usd_untracked;
	std::string fees_usd;
	NumericsBigInteger tx_count;
	std::string tvl_usd;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UniswapV3UniswapDayDataV3DTO_H_ */
