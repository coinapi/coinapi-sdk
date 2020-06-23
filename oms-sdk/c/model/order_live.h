/*
 * order_live.h
 *
 * 
 */

#ifndef _order_live_H_
#define _order_live_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_live_t order_live_t;

#include "order_status.h"
#include "time_in_force.h"

// Enum  for order_live

typedef enum  { oms___rest_api___order_live__NULL = 0, oms___rest_api___order_live__RECEIVED, oms___rest_api___order_live__ROUTING, oms___rest_api___order_live__ROUTED, oms___rest_api___order_live__NEW, oms___rest_api___order_live__PENDING_CANCEL, oms___rest_api___order_live__PARTIALLY_FILLED, oms___rest_api___order_live__FILLED, oms___rest_api___order_live__CANCELED, oms___rest_api___order_live__REJECTED } oms___rest_api___order_live__e;

char* order_live_status_ToString(oms___rest_api___order_live__e status);

oms___rest_api___order_live__e order_live_status_FromString(char* status);

// Enum SIDE for order_live

typedef enum  { oms___rest_api___order_live_SIDE_NULL = 0, oms___rest_api___order_live_SIDE_BUY, oms___rest_api___order_live_SIDE_SELL } oms___rest_api___order_live_SIDE_e;

char* order_live_side_ToString(oms___rest_api___order_live_SIDE_e side);

oms___rest_api___order_live_SIDE_e order_live_side_FromString(char* side);

// Enum ORDERTYPE for order_live

typedef enum  { oms___rest_api___order_live_ORDERTYPE_NULL = 0, oms___rest_api___order_live_ORDERTYPE_LIMIT } oms___rest_api___order_live_ORDERTYPE_e;

char* order_live_order_type_ToString(oms___rest_api___order_live_ORDERTYPE_e order_type);

oms___rest_api___order_live_ORDERTYPE_e order_live_order_type_FromString(char* order_type);

// Enum  for order_live

typedef enum  { oms___rest_api___order_live__NULL = 0, oms___rest_api___order_live__GOOD_TILL_CANCEL, oms___rest_api___order_live__GOOD_TILL_TIME_EXCHANGE, oms___rest_api___order_live__GOOD_TILL_TIME_OMS, oms___rest_api___order_live__FILL_OR_KILL, oms___rest_api___order_live__IMMEDIATE_OR_CANCEL, oms___rest_api___order_live__AUCTION_ONLY, oms___rest_api___order_live__INDICATION_OF_INTEREST } oms___rest_api___order_live__e;

char* order_live_time_in_force_ToString(oms___rest_api___order_live__e time_in_force);

oms___rest_api___order_live__e order_live_time_in_force_FromString(char* time_in_force);

// Enum EXECINST for order_live

typedef enum  { oms___rest_api___order_live_EXECINST_NULL = 0, oms___rest_api___order_live_EXECINST_MAKER_OR_CANCEL } oms___rest_api___order_live_EXECINST_e;

char* order_live_exec_inst_ToString(oms___rest_api___order_live_EXECINST_e exec_inst);

oms___rest_api___order_live_EXECINST_e order_live_exec_inst_FromString(char* exec_inst);



typedef struct order_live_t {
    char *type; // string
    char *exchange_id; // string
    char *id; // string
    char *client_order_id_format_exchange; // string
    char *exchange_order_id; // string
    double amount_open; //numeric
    double amount_filled; //numeric
    list_t *time_order; //primitive container
    char *error_message; // string
    char *client_order_id; // string
    char *symbol_exchange; // string
    char *symbol_coinapi; // string
    double amount_order; //numeric
    double price; //numeric
    oms___rest_api___order_live_SIDE_e side; //enum
    oms___rest_api___order_live_ORDERTYPE_e order_type; //enum
    list_t *exec_inst; //primitive container

} order_live_t;

order_live_t *order_live_create(
    char *type,
    char *exchange_id,
    char *id,
    char *client_order_id_format_exchange,
    char *exchange_order_id,
    double amount_open,
    double amount_filled,
    list_t *time_order,
    char *error_message,
    char *client_order_id,
    char *symbol_exchange,
    char *symbol_coinapi,
    double amount_order,
    double price,
    oms___rest_api___order_live_SIDE_e side,
    oms___rest_api___order_live_ORDERTYPE_e order_type,
    list_t *exec_inst
);

void order_live_free(order_live_t *order_live);

order_live_t *order_live_parseFromJSON(cJSON *order_liveJSON);

cJSON *order_live_convertToJSON(order_live_t *order_live);

#endif /* _order_live_H_ */

