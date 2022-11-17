#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "uniswap_v3_burn_dto.h"



uniswap_v3_burn_dto_t *uniswap_v3_burn_dto_create(
    char *entry_time,
    char *recv_time,
    long block_number,
    char *id,
    char *transaction,
    char *pool,
    char *token_0,
    char *token_1,
    char *timestamp,
    char *owner,
    char *origin,
    char *amount,
    char *amount_0,
    char *amount_1,
    char *amount_usd,
    char *tick_lower,
    char *tick_upper,
    char *log_index,
    long vid
    ) {
    uniswap_v3_burn_dto_t *uniswap_v3_burn_dto_local_var = malloc(sizeof(uniswap_v3_burn_dto_t));
    if (!uniswap_v3_burn_dto_local_var) {
        return NULL;
    }
    uniswap_v3_burn_dto_local_var->entry_time = entry_time;
    uniswap_v3_burn_dto_local_var->recv_time = recv_time;
    uniswap_v3_burn_dto_local_var->block_number = block_number;
    uniswap_v3_burn_dto_local_var->id = id;
    uniswap_v3_burn_dto_local_var->transaction = transaction;
    uniswap_v3_burn_dto_local_var->pool = pool;
    uniswap_v3_burn_dto_local_var->token_0 = token_0;
    uniswap_v3_burn_dto_local_var->token_1 = token_1;
    uniswap_v3_burn_dto_local_var->timestamp = timestamp;
    uniswap_v3_burn_dto_local_var->owner = owner;
    uniswap_v3_burn_dto_local_var->origin = origin;
    uniswap_v3_burn_dto_local_var->amount = amount;
    uniswap_v3_burn_dto_local_var->amount_0 = amount_0;
    uniswap_v3_burn_dto_local_var->amount_1 = amount_1;
    uniswap_v3_burn_dto_local_var->amount_usd = amount_usd;
    uniswap_v3_burn_dto_local_var->tick_lower = tick_lower;
    uniswap_v3_burn_dto_local_var->tick_upper = tick_upper;
    uniswap_v3_burn_dto_local_var->log_index = log_index;
    uniswap_v3_burn_dto_local_var->vid = vid;

    return uniswap_v3_burn_dto_local_var;
}


void uniswap_v3_burn_dto_free(uniswap_v3_burn_dto_t *uniswap_v3_burn_dto) {
    if(NULL == uniswap_v3_burn_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (uniswap_v3_burn_dto->entry_time) {
        free(uniswap_v3_burn_dto->entry_time);
        uniswap_v3_burn_dto->entry_time = NULL;
    }
    if (uniswap_v3_burn_dto->recv_time) {
        free(uniswap_v3_burn_dto->recv_time);
        uniswap_v3_burn_dto->recv_time = NULL;
    }
    if (uniswap_v3_burn_dto->id) {
        free(uniswap_v3_burn_dto->id);
        uniswap_v3_burn_dto->id = NULL;
    }
    if (uniswap_v3_burn_dto->transaction) {
        free(uniswap_v3_burn_dto->transaction);
        uniswap_v3_burn_dto->transaction = NULL;
    }
    if (uniswap_v3_burn_dto->pool) {
        free(uniswap_v3_burn_dto->pool);
        uniswap_v3_burn_dto->pool = NULL;
    }
    if (uniswap_v3_burn_dto->token_0) {
        free(uniswap_v3_burn_dto->token_0);
        uniswap_v3_burn_dto->token_0 = NULL;
    }
    if (uniswap_v3_burn_dto->token_1) {
        free(uniswap_v3_burn_dto->token_1);
        uniswap_v3_burn_dto->token_1 = NULL;
    }
    if (uniswap_v3_burn_dto->timestamp) {
        free(uniswap_v3_burn_dto->timestamp);
        uniswap_v3_burn_dto->timestamp = NULL;
    }
    if (uniswap_v3_burn_dto->owner) {
        free(uniswap_v3_burn_dto->owner);
        uniswap_v3_burn_dto->owner = NULL;
    }
    if (uniswap_v3_burn_dto->origin) {
        free(uniswap_v3_burn_dto->origin);
        uniswap_v3_burn_dto->origin = NULL;
    }
    if (uniswap_v3_burn_dto->amount) {
        free(uniswap_v3_burn_dto->amount);
        uniswap_v3_burn_dto->amount = NULL;
    }
    if (uniswap_v3_burn_dto->amount_0) {
        free(uniswap_v3_burn_dto->amount_0);
        uniswap_v3_burn_dto->amount_0 = NULL;
    }
    if (uniswap_v3_burn_dto->amount_1) {
        free(uniswap_v3_burn_dto->amount_1);
        uniswap_v3_burn_dto->amount_1 = NULL;
    }
    if (uniswap_v3_burn_dto->amount_usd) {
        free(uniswap_v3_burn_dto->amount_usd);
        uniswap_v3_burn_dto->amount_usd = NULL;
    }
    if (uniswap_v3_burn_dto->tick_lower) {
        free(uniswap_v3_burn_dto->tick_lower);
        uniswap_v3_burn_dto->tick_lower = NULL;
    }
    if (uniswap_v3_burn_dto->tick_upper) {
        free(uniswap_v3_burn_dto->tick_upper);
        uniswap_v3_burn_dto->tick_upper = NULL;
    }
    if (uniswap_v3_burn_dto->log_index) {
        free(uniswap_v3_burn_dto->log_index);
        uniswap_v3_burn_dto->log_index = NULL;
    }
    free(uniswap_v3_burn_dto);
}

cJSON *uniswap_v3_burn_dto_convertToJSON(uniswap_v3_burn_dto_t *uniswap_v3_burn_dto) {
    cJSON *item = cJSON_CreateObject();

    // uniswap_v3_burn_dto->entry_time
    if(uniswap_v3_burn_dto->entry_time) {
    if(cJSON_AddStringToObject(item, "entry_time", uniswap_v3_burn_dto->entry_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // uniswap_v3_burn_dto->recv_time
    if(uniswap_v3_burn_dto->recv_time) {
    if(cJSON_AddStringToObject(item, "recv_time", uniswap_v3_burn_dto->recv_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // uniswap_v3_burn_dto->block_number
    if(uniswap_v3_burn_dto->block_number) {
    if(cJSON_AddNumberToObject(item, "block_number", uniswap_v3_burn_dto->block_number) == NULL) {
    goto fail; //Numeric
    }
    }


    // uniswap_v3_burn_dto->id
    if(uniswap_v3_burn_dto->id) {
    if(cJSON_AddStringToObject(item, "id", uniswap_v3_burn_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->transaction
    if(uniswap_v3_burn_dto->transaction) {
    if(cJSON_AddStringToObject(item, "transaction", uniswap_v3_burn_dto->transaction) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->pool
    if(uniswap_v3_burn_dto->pool) {
    if(cJSON_AddStringToObject(item, "pool", uniswap_v3_burn_dto->pool) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->token_0
    if(uniswap_v3_burn_dto->token_0) {
    if(cJSON_AddStringToObject(item, "token_0", uniswap_v3_burn_dto->token_0) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->token_1
    if(uniswap_v3_burn_dto->token_1) {
    if(cJSON_AddStringToObject(item, "token_1", uniswap_v3_burn_dto->token_1) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->timestamp
    if(uniswap_v3_burn_dto->timestamp) {
    if(cJSON_AddStringToObject(item, "timestamp", uniswap_v3_burn_dto->timestamp) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->owner
    if(uniswap_v3_burn_dto->owner) {
    if(cJSON_AddStringToObject(item, "owner", uniswap_v3_burn_dto->owner) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->origin
    if(uniswap_v3_burn_dto->origin) {
    if(cJSON_AddStringToObject(item, "origin", uniswap_v3_burn_dto->origin) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->amount
    if(uniswap_v3_burn_dto->amount) {
    if(cJSON_AddStringToObject(item, "amount", uniswap_v3_burn_dto->amount) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->amount_0
    if(uniswap_v3_burn_dto->amount_0) {
    if(cJSON_AddStringToObject(item, "amount_0", uniswap_v3_burn_dto->amount_0) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->amount_1
    if(uniswap_v3_burn_dto->amount_1) {
    if(cJSON_AddStringToObject(item, "amount_1", uniswap_v3_burn_dto->amount_1) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->amount_usd
    if(uniswap_v3_burn_dto->amount_usd) {
    if(cJSON_AddStringToObject(item, "amount_usd", uniswap_v3_burn_dto->amount_usd) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->tick_lower
    if(uniswap_v3_burn_dto->tick_lower) {
    if(cJSON_AddStringToObject(item, "tick_lower", uniswap_v3_burn_dto->tick_lower) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->tick_upper
    if(uniswap_v3_burn_dto->tick_upper) {
    if(cJSON_AddStringToObject(item, "tick_upper", uniswap_v3_burn_dto->tick_upper) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->log_index
    if(uniswap_v3_burn_dto->log_index) {
    if(cJSON_AddStringToObject(item, "log_index", uniswap_v3_burn_dto->log_index) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_burn_dto->vid
    if(uniswap_v3_burn_dto->vid) {
    if(cJSON_AddNumberToObject(item, "vid", uniswap_v3_burn_dto->vid) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

uniswap_v3_burn_dto_t *uniswap_v3_burn_dto_parseFromJSON(cJSON *uniswap_v3_burn_dtoJSON){

    uniswap_v3_burn_dto_t *uniswap_v3_burn_dto_local_var = NULL;

    // uniswap_v3_burn_dto->entry_time
    cJSON *entry_time = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "entry_time");
    if (entry_time) { 
    if(!cJSON_IsString(entry_time))
    {
    goto end; //DateTime
    }
    }

    // uniswap_v3_burn_dto->recv_time
    cJSON *recv_time = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "recv_time");
    if (recv_time) { 
    if(!cJSON_IsString(recv_time))
    {
    goto end; //DateTime
    }
    }

    // uniswap_v3_burn_dto->block_number
    cJSON *block_number = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "block_number");
    if (block_number) { 
    if(!cJSON_IsNumber(block_number))
    {
    goto end; //Numeric
    }
    }

    // uniswap_v3_burn_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->transaction
    cJSON *transaction = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "transaction");
    if (transaction) { 
    if(!cJSON_IsString(transaction))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->pool
    cJSON *pool = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "pool");
    if (pool) { 
    if(!cJSON_IsString(pool))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->token_0
    cJSON *token_0 = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "token_0");
    if (token_0) { 
    if(!cJSON_IsString(token_0))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->token_1
    cJSON *token_1 = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "token_1");
    if (token_1) { 
    if(!cJSON_IsString(token_1))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "timestamp");
    if (timestamp) { 
    if(!cJSON_IsString(timestamp))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->owner
    cJSON *owner = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "owner");
    if (owner) { 
    if(!cJSON_IsString(owner))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->origin
    cJSON *origin = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "origin");
    if (origin) { 
    if(!cJSON_IsString(origin))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->amount
    cJSON *amount = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "amount");
    if (amount) { 
    if(!cJSON_IsString(amount))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->amount_0
    cJSON *amount_0 = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "amount_0");
    if (amount_0) { 
    if(!cJSON_IsString(amount_0))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->amount_1
    cJSON *amount_1 = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "amount_1");
    if (amount_1) { 
    if(!cJSON_IsString(amount_1))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->amount_usd
    cJSON *amount_usd = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "amount_usd");
    if (amount_usd) { 
    if(!cJSON_IsString(amount_usd))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->tick_lower
    cJSON *tick_lower = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "tick_lower");
    if (tick_lower) { 
    if(!cJSON_IsString(tick_lower))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->tick_upper
    cJSON *tick_upper = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "tick_upper");
    if (tick_upper) { 
    if(!cJSON_IsString(tick_upper))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->log_index
    cJSON *log_index = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "log_index");
    if (log_index) { 
    if(!cJSON_IsString(log_index))
    {
    goto end; //String
    }
    }

    // uniswap_v3_burn_dto->vid
    cJSON *vid = cJSON_GetObjectItemCaseSensitive(uniswap_v3_burn_dtoJSON, "vid");
    if (vid) { 
    if(!cJSON_IsNumber(vid))
    {
    goto end; //Numeric
    }
    }


    uniswap_v3_burn_dto_local_var = uniswap_v3_burn_dto_create (
        entry_time ? strdup(entry_time->valuestring) : NULL,
        recv_time ? strdup(recv_time->valuestring) : NULL,
        block_number ? block_number->valuedouble : 0,
        id ? strdup(id->valuestring) : NULL,
        transaction ? strdup(transaction->valuestring) : NULL,
        pool ? strdup(pool->valuestring) : NULL,
        token_0 ? strdup(token_0->valuestring) : NULL,
        token_1 ? strdup(token_1->valuestring) : NULL,
        timestamp ? strdup(timestamp->valuestring) : NULL,
        owner ? strdup(owner->valuestring) : NULL,
        origin ? strdup(origin->valuestring) : NULL,
        amount ? strdup(amount->valuestring) : NULL,
        amount_0 ? strdup(amount_0->valuestring) : NULL,
        amount_1 ? strdup(amount_1->valuestring) : NULL,
        amount_usd ? strdup(amount_usd->valuestring) : NULL,
        tick_lower ? strdup(tick_lower->valuestring) : NULL,
        tick_upper ? strdup(tick_upper->valuestring) : NULL,
        log_index ? strdup(log_index->valuestring) : NULL,
        vid ? vid->valuedouble : 0
        );

    return uniswap_v3_burn_dto_local_var;
end:
    return NULL;

}
