#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UniswapV3BundleV3DTO.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UniswapV3BundleV3DTO::UniswapV3BundleV3DTO()
{
	//__init();
}

UniswapV3BundleV3DTO::~UniswapV3BundleV3DTO()
{
	//__cleanup();
}

void
UniswapV3BundleV3DTO::__init()
{
	//entry_time = null;
	//recv_time = null;
	//block_number = long(0);
	//id = std::string();
	//eth_price_usd = std::string();
	//vid = long(0);
}

void
UniswapV3BundleV3DTO::__cleanup()
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
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(eth_price_usd != NULL) {
	//
	//delete eth_price_usd;
	//eth_price_usd = NULL;
	//}
	//if(vid != NULL) {
	//
	//delete vid;
	//vid = NULL;
	//}
	//
}

void
UniswapV3BundleV3DTO::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *eth_price_usdKey = "eth_price_usd";
	node = json_object_get_member(pJsonObject, eth_price_usdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&eth_price_usd, node, "std::string", "");
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
}

UniswapV3BundleV3DTO::UniswapV3BundleV3DTO(char* json)
{
	this->fromJson(json);
}

char*
UniswapV3BundleV3DTO::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEthPriceUsd();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *eth_price_usdKey = "eth_price_usd";
	json_object_set_member(pJsonObject, eth_price_usdKey, node);
	if (isprimitive("long long")) {
		long long obj = getVid();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *vidKey = "vid";
	json_object_set_member(pJsonObject, vidKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UniswapV3BundleV3DTO::getEntryTime()
{
	return entry_time;
}

void
UniswapV3BundleV3DTO::setEntryTime(std::string  entry_time)
{
	this->entry_time = entry_time;
}

std::string
UniswapV3BundleV3DTO::getRecvTime()
{
	return recv_time;
}

void
UniswapV3BundleV3DTO::setRecvTime(std::string  recv_time)
{
	this->recv_time = recv_time;
}

long long
UniswapV3BundleV3DTO::getBlockNumber()
{
	return block_number;
}

void
UniswapV3BundleV3DTO::setBlockNumber(long long  block_number)
{
	this->block_number = block_number;
}

std::string
UniswapV3BundleV3DTO::getId()
{
	return id;
}

void
UniswapV3BundleV3DTO::setId(std::string  id)
{
	this->id = id;
}

std::string
UniswapV3BundleV3DTO::getEthPriceUsd()
{
	return eth_price_usd;
}

void
UniswapV3BundleV3DTO::setEthPriceUsd(std::string  eth_price_usd)
{
	this->eth_price_usd = eth_price_usd;
}

long long
UniswapV3BundleV3DTO::getVid()
{
	return vid;
}

void
UniswapV3BundleV3DTO::setVid(long long  vid)
{
	this->vid = vid;
}


