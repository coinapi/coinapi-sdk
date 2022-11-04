#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UniswapV3TokenV3DayDataDTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UniswapV3TokenV3DayDataDTO::UniswapV3TokenV3DayDataDTO()
{
	//__init();
}

UniswapV3TokenV3DayDataDTO::~UniswapV3TokenV3DayDataDTO()
{
	//__cleanup();
}

void
UniswapV3TokenV3DayDataDTO::__init()
{
	//entry_time = null;
	//recv_time = null;
	//block_number = long(0);
	//vid = long(0);
	//id = std::string();
	//date = int(0);
	//token = std::string();
	//volume = std::string();
	//volume_usd = std::string();
	//untracked_volume_usd = std::string();
	//total_value_locked = std::string();
	//total_value_locked_usd = std::string();
	//price_usd = std::string();
	//fees_usd = std::string();
	//open = std::string();
	//high = std::string();
	//low = std::string();
	//close = std::string();
}

void
UniswapV3TokenV3DayDataDTO::__cleanup()
{
	//if(entry_time != NULL) {
	//
	//delete entry_time;
	//entry_time = NULL;
	//}
	//if(recv_time != NULL) {
	//
	//delete recv_time;
	//recv_time = NULL;
	//}
	//if(block_number != NULL) {
	//
	//delete block_number;
	//block_number = NULL;
	//}
	//if(vid != NULL) {
	//
	//delete vid;
	//vid = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//if(token != NULL) {
	//
	//delete token;
	//token = NULL;
	//}
	//if(volume != NULL) {
	//
	//delete volume;
	//volume = NULL;
	//}
	//if(volume_usd != NULL) {
	//
	//delete volume_usd;
	//volume_usd = NULL;
	//}
	//if(untracked_volume_usd != NULL) {
	//
	//delete untracked_volume_usd;
	//untracked_volume_usd = NULL;
	//}
	//if(total_value_locked != NULL) {
	//
	//delete total_value_locked;
	//total_value_locked = NULL;
	//}
	//if(total_value_locked_usd != NULL) {
	//
	//delete total_value_locked_usd;
	//total_value_locked_usd = NULL;
	//}
	//if(price_usd != NULL) {
	//
	//delete price_usd;
	//price_usd = NULL;
	//}
	//if(fees_usd != NULL) {
	//
	//delete fees_usd;
	//fees_usd = NULL;
	//}
	//if(open != NULL) {
	//
	//delete open;
	//open = NULL;
	//}
	//if(high != NULL) {
	//
	//delete high;
	//high = NULL;
	//}
	//if(low != NULL) {
	//
	//delete low;
	//low = NULL;
	//}
	//if(close != NULL) {
	//
	//delete close;
	//close = NULL;
	//}
	//
}

void
UniswapV3TokenV3DayDataDTO::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *entry_timeKey = "entry_time";
	node = json_object_get_member(pJsonObject, entry_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entry_time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *recv_timeKey = "recv_time";
	node = json_object_get_member(pJsonObject, recv_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&recv_time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *block_numberKey = "block_number";
	node = json_object_get_member(pJsonObject, block_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&block_number, node, "long long", "");
		} else {
			
		}
	}
	const gchar *vidKey = "vid";
	node = json_object_get_member(pJsonObject, vidKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&vid, node, "long long", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&date, node, "int", "");
		} else {
			
		}
	}
	const gchar *tokenKey = "token";
	node = json_object_get_member(pJsonObject, tokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&token, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *volumeKey = "volume";
	node = json_object_get_member(pJsonObject, volumeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&volume, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *volume_usdKey = "volume_usd";
	node = json_object_get_member(pJsonObject, volume_usdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&volume_usd, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *untracked_volume_usdKey = "untracked_volume_usd";
	node = json_object_get_member(pJsonObject, untracked_volume_usdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&untracked_volume_usd, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *total_value_lockedKey = "total_value_locked";
	node = json_object_get_member(pJsonObject, total_value_lockedKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&total_value_locked, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *total_value_locked_usdKey = "total_value_locked_usd";
	node = json_object_get_member(pJsonObject, total_value_locked_usdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&total_value_locked_usd, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *price_usdKey = "price_usd";
	node = json_object_get_member(pJsonObject, price_usdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&price_usd, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *fees_usdKey = "fees_usd";
	node = json_object_get_member(pJsonObject, fees_usdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&fees_usd, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *openKey = "open";
	node = json_object_get_member(pJsonObject, openKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&open, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *highKey = "high";
	node = json_object_get_member(pJsonObject, highKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&high, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *lowKey = "low";
	node = json_object_get_member(pJsonObject, lowKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&low, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *closeKey = "close";
	node = json_object_get_member(pJsonObject, closeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&close, node, "std::string", "");
		} else {
			
		}
	}
}

UniswapV3TokenV3DayDataDTO::UniswapV3TokenV3DayDataDTO(char* json)
{
	this->fromJson(json);
}

char*
UniswapV3TokenV3DayDataDTO::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEntryTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entry_timeKey = "entry_time";
	json_object_set_member(pJsonObject, entry_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRecvTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *recv_timeKey = "recv_time";
	json_object_set_member(pJsonObject, recv_timeKey, node);
	if (isprimitive("long long")) {
		long long obj = getBlockNumber();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *block_numberKey = "block_number";
	json_object_set_member(pJsonObject, block_numberKey, node);
	if (isprimitive("long long")) {
		long long obj = getVid();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *vidKey = "vid";
	json_object_set_member(pJsonObject, vidKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("int")) {
		int obj = getDate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tokenKey = "token";
	json_object_set_member(pJsonObject, tokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVolume();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *volumeKey = "volume";
	json_object_set_member(pJsonObject, volumeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVolumeUsd();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *volume_usdKey = "volume_usd";
	json_object_set_member(pJsonObject, volume_usdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUntrackedVolumeUsd();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *untracked_volume_usdKey = "untracked_volume_usd";
	json_object_set_member(pJsonObject, untracked_volume_usdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTotalValueLocked();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *total_value_lockedKey = "total_value_locked";
	json_object_set_member(pJsonObject, total_value_lockedKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTotalValueLockedUsd();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *total_value_locked_usdKey = "total_value_locked_usd";
	json_object_set_member(pJsonObject, total_value_locked_usdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPriceUsd();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *price_usdKey = "price_usd";
	json_object_set_member(pJsonObject, price_usdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeesUsd();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *fees_usdKey = "fees_usd";
	json_object_set_member(pJsonObject, fees_usdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOpen();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *openKey = "open";
	json_object_set_member(pJsonObject, openKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHigh();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *highKey = "high";
	json_object_set_member(pJsonObject, highKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLow();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lowKey = "low";
	json_object_set_member(pJsonObject, lowKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClose();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *closeKey = "close";
	json_object_set_member(pJsonObject, closeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UniswapV3TokenV3DayDataDTO::getEntryTime()
{
	return entry_time;
}

void
UniswapV3TokenV3DayDataDTO::setEntryTime(std::string  entry_time)
{
	this->entry_time = entry_time;
}

std::string
UniswapV3TokenV3DayDataDTO::getRecvTime()
{
	return recv_time;
}

void
UniswapV3TokenV3DayDataDTO::setRecvTime(std::string  recv_time)
{
	this->recv_time = recv_time;
}

long long
UniswapV3TokenV3DayDataDTO::getBlockNumber()
{
	return block_number;
}

void
UniswapV3TokenV3DayDataDTO::setBlockNumber(long long  block_number)
{
	this->block_number = block_number;
}

long long
UniswapV3TokenV3DayDataDTO::getVid()
{
	return vid;
}

void
UniswapV3TokenV3DayDataDTO::setVid(long long  vid)
{
	this->vid = vid;
}

std::string
UniswapV3TokenV3DayDataDTO::getId()
{
	return id;
}

void
UniswapV3TokenV3DayDataDTO::setId(std::string  id)
{
	this->id = id;
}

int
UniswapV3TokenV3DayDataDTO::getDate()
{
	return date;
}

void
UniswapV3TokenV3DayDataDTO::setDate(int  date)
{
	this->date = date;
}

std::string
UniswapV3TokenV3DayDataDTO::getToken()
{
	return token;
}

void
UniswapV3TokenV3DayDataDTO::setToken(std::string  token)
{
	this->token = token;
}

std::string
UniswapV3TokenV3DayDataDTO::getVolume()
{
	return volume;
}

void
UniswapV3TokenV3DayDataDTO::setVolume(std::string  volume)
{
	this->volume = volume;
}

std::string
UniswapV3TokenV3DayDataDTO::getVolumeUsd()
{
	return volume_usd;
}

void
UniswapV3TokenV3DayDataDTO::setVolumeUsd(std::string  volume_usd)
{
	this->volume_usd = volume_usd;
}

std::string
UniswapV3TokenV3DayDataDTO::getUntrackedVolumeUsd()
{
	return untracked_volume_usd;
}

void
UniswapV3TokenV3DayDataDTO::setUntrackedVolumeUsd(std::string  untracked_volume_usd)
{
	this->untracked_volume_usd = untracked_volume_usd;
}

std::string
UniswapV3TokenV3DayDataDTO::getTotalValueLocked()
{
	return total_value_locked;
}

void
UniswapV3TokenV3DayDataDTO::setTotalValueLocked(std::string  total_value_locked)
{
	this->total_value_locked = total_value_locked;
}

std::string
UniswapV3TokenV3DayDataDTO::getTotalValueLockedUsd()
{
	return total_value_locked_usd;
}

void
UniswapV3TokenV3DayDataDTO::setTotalValueLockedUsd(std::string  total_value_locked_usd)
{
	this->total_value_locked_usd = total_value_locked_usd;
}

std::string
UniswapV3TokenV3DayDataDTO::getPriceUsd()
{
	return price_usd;
}

void
UniswapV3TokenV3DayDataDTO::setPriceUsd(std::string  price_usd)
{
	this->price_usd = price_usd;
}

std::string
UniswapV3TokenV3DayDataDTO::getFeesUsd()
{
	return fees_usd;
}

void
UniswapV3TokenV3DayDataDTO::setFeesUsd(std::string  fees_usd)
{
	this->fees_usd = fees_usd;
}

std::string
UniswapV3TokenV3DayDataDTO::getOpen()
{
	return open;
}

void
UniswapV3TokenV3DayDataDTO::setOpen(std::string  open)
{
	this->open = open;
}

std::string
UniswapV3TokenV3DayDataDTO::getHigh()
{
	return high;
}

void
UniswapV3TokenV3DayDataDTO::setHigh(std::string  high)
{
	this->high = high;
}

std::string
UniswapV3TokenV3DayDataDTO::getLow()
{
	return low;
}

void
UniswapV3TokenV3DayDataDTO::setLow(std::string  low)
{
	this->low = low;
}

std::string
UniswapV3TokenV3DayDataDTO::getClose()
{
	return close;
}

void
UniswapV3TokenV3DayDataDTO::setClose(std::string  close)
{
	this->close = close;
}


