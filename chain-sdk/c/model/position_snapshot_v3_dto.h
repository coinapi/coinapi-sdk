/*
 * position_snapshot_v3_dto.h
 *
 * 
 */

#ifndef _position_snapshot_v3_dto_H_
#define _position_snapshot_v3_dto_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct position_snapshot_v3_dto_t position_snapshot_v3_dto_t;




typedef struct position_snapshot_v3_dto_t {
    char *entry_time; //date time
    char *recv_time; //date time
    long block_number; //numeric
    char *id; // string
    char *owner; // string
    char *pool; // string
    char *position; // string
    char *timestamp; // string
    char *liquidity; // string
    char *deposited_token_0; // string
    char *deposited_token_1; // string
    char *withdrawn_token_0; // string
    char *withdrawn_token_1; // string
    char *collected_fees_token_0; // string
    char *collected_fees_token_1; // string
    char *transaction; // string
    char *fee_growth_inside_0_last_x128; // string
    char *fee_growth_inside_1_last_x128; // string
    long vid; //numeric

} position_snapshot_v3_dto_t;

position_snapshot_v3_dto_t *position_snapshot_v3_dto_create(
    char *entry_time,
    char *recv_time,
    long block_number,
    char *id,
    char *owner,
    char *pool,
    char *position,
    char *timestamp,
    char *liquidity,
    char *deposited_token_0,
    char *deposited_token_1,
    char *withdrawn_token_0,
    char *withdrawn_token_1,
    char *collected_fees_token_0,
    char *collected_fees_token_1,
    char *transaction,
    char *fee_growth_inside_0_last_x128,
    char *fee_growth_inside_1_last_x128,
    long vid
);

void position_snapshot_v3_dto_free(position_snapshot_v3_dto_t *position_snapshot_v3_dto);

position_snapshot_v3_dto_t *position_snapshot_v3_dto_parseFromJSON(cJSON *position_snapshot_v3_dtoJSON);

cJSON *position_snapshot_v3_dto_convertToJSON(position_snapshot_v3_dto_t *position_snapshot_v3_dto);

#endif /* _position_snapshot_v3_dto_H_ */
