/*
 * balance.h
 *
 * 
 */

#ifndef _balance_H_
#define _balance_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct balance_t balance_t;

#include "balance_data.h"



typedef struct balance_t {
    char *type; // string
    char *exchange_name; // string
    list_t *data; //nonprimitive container

} balance_t;

balance_t *balance_create(
    char *type,
    char *exchange_name,
    list_t *data
);

void balance_free(balance_t *balance);

balance_t *balance_parseFromJSON(cJSON *balanceJSON);

cJSON *balance_convertToJSON(balance_t *balance);

#endif /* _balance_H_ */

