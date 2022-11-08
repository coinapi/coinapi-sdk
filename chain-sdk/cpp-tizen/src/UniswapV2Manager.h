#ifndef _UniswapV2Manager_H_
#define _UniswapV2Manager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "UniswapV2.BundleV2DTO.h"
#include "UniswapV2.BurnV2DTO.h"
#include "UniswapV2.LiquidityPositionSnapshotV2DTO.h"
#include "UniswapV2.LiquidityPositionV2DTO.h"
#include "UniswapV2.MintV2DTO.h"
#include "UniswapV2.PairDayDataV2DTO.h"
#include "UniswapV2.PairHourDataV2DTO.h"
#include "UniswapV2.PairV2DTO.h"
#include "UniswapV2.SwapV2DTO.h"
#include "UniswapV2.TokenDayDataV2DTO.h"
#include "UniswapV2.TokenV2DTO.h"
#include "UniswapV2.TransactionV2DTO.h"
#include "UniswapV2.UniswapDayDataV2DTO.h"
#include "UniswapV2.UniswapFactoryV2DTO.h"
#include "UniswapV2.UserV2DTO.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup UniswapV2 UniswapV2
 * \ingroup Operations
 *  @{
 */
class UniswapV2Manager {
public:
	UniswapV2Manager();
	virtual ~UniswapV2Manager();

/*! \brief GetBundles (historical). *Synchronous*
 *
 * Gets bundles.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetBundles (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.BundleV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetBundles (historical). *Asynchronous*
 *
 * Gets bundles.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetBundles (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.BundleV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetBurns (historical). *Synchronous*
 *
 * Gets burns.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetBurns (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.BurnV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetBurns (historical). *Asynchronous*
 *
 * Gets burns.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetBurns (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.BurnV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetDayData (historical). *Synchronous*
 *
 * Gets uniswapv2 day data.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetDayData (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.UniswapDayDataV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetDayData (historical). *Asynchronous*
 *
 * Gets uniswapv2 day data.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetDayData (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.UniswapDayDataV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetFactory (historical). *Synchronous*
 *
 * Gets factory.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetFactory (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.UniswapFactoryV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetFactory (historical). *Asynchronous*
 *
 * Gets factory.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetFactory (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.UniswapFactoryV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetLiquidityPositions (historical). *Synchronous*
 *
 * Gets liquidity positions.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetLiquidityPositions (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.LiquidityPositionV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetLiquidityPositions (historical). *Asynchronous*
 *
 * Gets liquidity positions.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetLiquidityPositions (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.LiquidityPositionV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetLiquidityPositionsSnapshots (historical). *Synchronous*
 *
 * Gets liquidity positions snapshots.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetLiquidityPositionsSnapshots (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.LiquidityPositionSnapshotV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetLiquidityPositionsSnapshots (historical). *Asynchronous*
 *
 * Gets liquidity positions snapshots.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetLiquidityPositionsSnapshots (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.LiquidityPositionSnapshotV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetMints (historical). *Synchronous*
 *
 * Gets mints.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetMints (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.MintV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetMints (historical). *Asynchronous*
 *
 * Gets mints.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetMints (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.MintV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetPools (current) 🔥. *Synchronous*
 *
 * Gets pools.
 * \param filterPoolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetPools (current)Sync(char * accessToken,
	std::string filterPoolId, 
	void(* handler)(std::list<UniswapV2.PairV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetPools (current) 🔥. *Asynchronous*
 *
 * Gets pools.
 * \param filterPoolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetPools (current)Async(char * accessToken,
	std::string filterPoolId, 
	void(* handler)(std::list<UniswapV2.PairV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetPools (historical) 🔥. *Synchronous*
 *
 * Gets pools.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetPools (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.PairV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetPools (historical) 🔥. *Asynchronous*
 *
 * Gets pools.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetPools (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.PairV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetPoolsDayData (historical). *Synchronous*
 *
 * Gets pools day data.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetPoolsDayData (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.PairDayDataV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetPoolsDayData (historical). *Asynchronous*
 *
 * Gets pools day data.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetPoolsDayData (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.PairDayDataV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetPoolsHourData (historical). *Synchronous*
 *
 * Gets pools tracked each our.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetPoolsHourData (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.PairHourDataV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetPoolsHourData (historical). *Asynchronous*
 *
 * Gets pools tracked each our.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetPoolsHourData (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.PairHourDataV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetSwaps (current) 🔥. *Synchronous*
 *
 * Gets swaps.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetSwaps (current)Sync(char * accessToken,
	
	void(* handler)(std::list<UniswapV2.SwapV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetSwaps (current) 🔥. *Asynchronous*
 *
 * Gets swaps.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetSwaps (current)Async(char * accessToken,
	
	void(* handler)(std::list<UniswapV2.SwapV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetSwaps (historical) 🔥. *Synchronous*
 *
 * Gets swaps.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetSwaps (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.SwapV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetSwaps (historical) 🔥. *Asynchronous*
 *
 * Gets swaps.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param poolId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetSwaps (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string poolId, 
	void(* handler)(std::list<UniswapV2.SwapV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetTokens (current) 🔥. *Synchronous*
 *
 * Gets tokens.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetTokens (current)Sync(char * accessToken,
	
	void(* handler)(std::list<UniswapV2.TokenV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetTokens (current) 🔥. *Asynchronous*
 *
 * Gets tokens.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetTokens (current)Async(char * accessToken,
	
	void(* handler)(std::list<UniswapV2.TokenV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetTokens (historical) 🔥. *Synchronous*
 *
 * Gets tokens.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param tokenId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetTokens (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string tokenId, 
	void(* handler)(std::list<UniswapV2.TokenV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetTokens (historical) 🔥. *Asynchronous*
 *
 * Gets tokens.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param tokenId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetTokens (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string tokenId, 
	void(* handler)(std::list<UniswapV2.TokenV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetTokensDayData (historical). *Synchronous*
 *
 * Gets tokens day data.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param tokenId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetTokensDayData (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string tokenId, 
	void(* handler)(std::list<UniswapV2.TokenDayDataV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetTokensDayData (historical). *Asynchronous*
 *
 * Gets tokens day data.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param tokenId 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetTokensDayData (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, std::string tokenId, 
	void(* handler)(std::list<UniswapV2.TokenDayDataV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetTransactions (historical). *Synchronous*
 *
 * Gets transactions.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetTransactions (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.TransactionV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetTransactions (historical). *Asynchronous*
 *
 * Gets transactions.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetTransactions (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.TransactionV2DTO>, Error, void* )
	, void* userData);


/*! \brief GetUsers (historical). *Synchronous*
 *
 * Gets users.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetUsers (historical)Sync(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.UserV2DTO>, Error, void* )
	, void* userData);

/*! \brief GetUsers (historical). *Asynchronous*
 *
 * Gets users.
 * \param startBlock 
 * \param endBlock 
 * \param startDate 
 * \param endDate 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uniswapV2GetUsers (historical)Async(char * accessToken,
	long long startBlock, long long endBlock, std::string startDate, std::string endDate, 
	void(* handler)(std::list<UniswapV2.UserV2DTO>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://onchain.coinapi.io";
	}
};
/** @}*/

}
}
#endif /* UniswapV2Manager_H_ */
