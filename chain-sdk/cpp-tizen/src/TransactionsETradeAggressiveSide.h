/*
 * Transactions.ETradeAggressiveSide.h
 *
 * 
 */

#ifndef _Transactions.ETradeAggressiveSide_H_
#define _Transactions.ETradeAggressiveSide_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Transactions.ETradeAggressiveSide : public Object {
public:
	/*! \brief Constructor.
	 */
	Transactions.ETradeAggressiveSide();
	Transactions.ETradeAggressiveSide(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Transactions.ETradeAggressiveSide();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _Transactions.ETradeAggressiveSide_H_ */
