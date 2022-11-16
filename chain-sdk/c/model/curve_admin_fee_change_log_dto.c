#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "curve_admin_fee_change_log_dto.h"



curve_admin_fee_change_log_dto_t *curve_admin_fee_change_log_dto_create(
    char *entry_time,
    char *recv_time,
    long block_number,
    char *id,
    char *pool,
    char *value,
    char *block,
    char *timestamp,
    char *transaction,
    long vid
    ) {
    curve_admin_fee_change_log_dto_t *curve_admin_fee_change_log_dto_local_var = malloc(sizeof(curve_admin_fee_change_log_dto_t));
    if (!curve_admin_fee_change_log_dto_local_var) {
        return NULL;
    }
    curve_admin_fee_change_log_dto_local_var->entry_time = entry_time;
    curve_admin_fee_change_log_dto_local_var->recv_time = recv_time;
    curve_admin_fee_change_log_dto_local_var->block_number = block_number;
    curve_admin_fee_change_log_dto_local_var->id = id;
    curve_admin_fee_change_log_dto_local_var->pool = pool;
    curve_admin_fee_change_log_dto_local_var->value = value;
    curve_admin_fee_change_log_dto_local_var->block = block;
    curve_admin_fee_change_log_dto_local_var->timestamp = timestamp;
    curve_admin_fee_change_log_dto_local_var->transaction = transaction;
    curve_admin_fee_change_log_dto_local_var->vid = vid;

    return curve_admin_fee_change_log_dto_local_var;
}


void curve_admin_fee_change_log_dto_free(curve_admin_fee_change_log_dto_t *curve_admin_fee_change_log_dto) {
    if(NULL == curve_admin_fee_change_log_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (curve_admin_fee_change_log_dto->entry_time) {
        free(curve_admin_fee_change_log_dto->entry_time);
        curve_admin_fee_change_log_dto->entry_time = NULL;
    }
    if (curve_admin_fee_change_log_dto->recv_time) {
        free(curve_admin_fee_change_log_dto->recv_time);
        curve_admin_fee_change_log_dto->recv_time = NULL;
    }
    if (curve_admin_fee_change_log_dto->id) {
        free(curve_admin_fee_change_log_dto->id);
        curve_admin_fee_change_log_dto->id = NULL;
    }
    if (curve_admin_fee_change_log_dto->pool) {
        free(curve_admin_fee_change_log_dto->pool);
        curve_admin_fee_change_log_dto->pool = NULL;
    }
    if (curve_admin_fee_change_log_dto->value) {
        free(curve_admin_fee_change_log_dto->value);
        curve_admin_fee_change_log_dto->value = NULL;
    }
    if (curve_admin_fee_change_log_dto->block) {
        free(curve_admin_fee_change_log_dto->block);
        curve_admin_fee_change_log_dto->block = NULL;
    }
    if (curve_admin_fee_change_log_dto->timestamp) {
        free(curve_admin_fee_change_log_dto->timestamp);
        curve_admin_fee_change_log_dto->timestamp = NULL;
    }
    if (curve_admin_fee_change_log_dto->transaction) {
        free(curve_admin_fee_change_log_dto->transaction);
        curve_admin_fee_change_log_dto->transaction = NULL;
    }
    free(curve_admin_fee_change_log_dto);
}

cJSON *curve_admin_fee_change_log_dto_convertToJSON(curve_admin_fee_change_log_dto_t *curve_admin_fee_change_log_dto) {
    cJSON *item = cJSON_CreateObject();

    // curve_admin_fee_change_log_dto->entry_time
    if(curve_admin_fee_change_log_dto->entry_time) {
    if(cJSON_AddStringToObject(item, "entry_time", curve_admin_fee_change_log_dto->entry_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // curve_admin_fee_change_log_dto->recv_time
    if(curve_admin_fee_change_log_dto->recv_time) {
    if(cJSON_AddStringToObject(item, "recv_time", curve_admin_fee_change_log_dto->recv_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // curve_admin_fee_change_log_dto->block_number
    if(curve_admin_fee_change_log_dto->block_number) {
    if(cJSON_AddNumberToObject(item, "block_number", curve_admin_fee_change_log_dto->block_number) == NULL) {
    goto fail; //Numeric
    }
    }


    // curve_admin_fee_change_log_dto->id
    if(curve_admin_fee_change_log_dto->id) {
    if(cJSON_AddStringToObject(item, "id", curve_admin_fee_change_log_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // curve_admin_fee_change_log_dto->pool
    if(curve_admin_fee_change_log_dto->pool) {
    if(cJSON_AddStringToObject(item, "pool", curve_admin_fee_change_log_dto->pool) == NULL) {
    goto fail; //String
    }
    }


    // curve_admin_fee_change_log_dto->value
    if(curve_admin_fee_change_log_dto->value) {
    if(cJSON_AddStringToObject(item, "value", curve_admin_fee_change_log_dto->value) == NULL) {
    goto fail; //String
    }
    }


    // curve_admin_fee_change_log_dto->block
    if(curve_admin_fee_change_log_dto->block) {
    if(cJSON_AddStringToObject(item, "block", curve_admin_fee_change_log_dto->block) == NULL) {
    goto fail; //String
    }
    }


    // curve_admin_fee_change_log_dto->timestamp
    if(curve_admin_fee_change_log_dto->timestamp) {
    if(cJSON_AddStringToObject(item, "timestamp", curve_admin_fee_change_log_dto->timestamp) == NULL) {
    goto fail; //String
    }
    }


    // curve_admin_fee_change_log_dto->transaction
    if(curve_admin_fee_change_log_dto->transaction) {
    if(cJSON_AddStringToObject(item, "transaction", curve_admin_fee_change_log_dto->transaction) == NULL) {
    goto fail; //String
    }
    }


    // curve_admin_fee_change_log_dto->vid
    if(curve_admin_fee_change_log_dto->vid) {
    if(cJSON_AddNumberToObject(item, "vid", curve_admin_fee_change_log_dto->vid) == NULL) {
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

curve_admin_fee_change_log_dto_t *curve_admin_fee_change_log_dto_parseFromJSON(cJSON *curve_admin_fee_change_log_dtoJSON){

    curve_admin_fee_change_log_dto_t *curve_admin_fee_change_log_dto_local_var = NULL;

    // curve_admin_fee_change_log_dto->entry_time
    cJSON *entry_time = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "entry_time");
    if (entry_time) { 
    if(!cJSON_IsString(entry_time))
    {
    goto end; //DateTime
    }
    }

    // curve_admin_fee_change_log_dto->recv_time
    cJSON *recv_time = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "recv_time");
    if (recv_time) { 
    if(!cJSON_IsString(recv_time))
    {
    goto end; //DateTime
    }
    }

    // curve_admin_fee_change_log_dto->block_number
    cJSON *block_number = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "block_number");
    if (block_number) { 
    if(!cJSON_IsNumber(block_number))
    {
    goto end; //Numeric
    }
    }

    // curve_admin_fee_change_log_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }

    // curve_admin_fee_change_log_dto->pool
    cJSON *pool = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "pool");
    if (pool) { 
    if(!cJSON_IsString(pool))
    {
    goto end; //String
    }
    }

    // curve_admin_fee_change_log_dto->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "value");
    if (value) { 
    if(!cJSON_IsString(value))
    {
    goto end; //String
    }
    }

    // curve_admin_fee_change_log_dto->block
    cJSON *block = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "block");
    if (block) { 
    if(!cJSON_IsString(block))
    {
    goto end; //String
    }
    }

    // curve_admin_fee_change_log_dto->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "timestamp");
    if (timestamp) { 
    if(!cJSON_IsString(timestamp))
    {
    goto end; //String
    }
    }

    // curve_admin_fee_change_log_dto->transaction
    cJSON *transaction = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "transaction");
    if (transaction) { 
    if(!cJSON_IsString(transaction))
    {
    goto end; //String
    }
    }

    // curve_admin_fee_change_log_dto->vid
    cJSON *vid = cJSON_GetObjectItemCaseSensitive(curve_admin_fee_change_log_dtoJSON, "vid");
    if (vid) { 
    if(!cJSON_IsNumber(vid))
    {
    goto end; //Numeric
    }
    }


    curve_admin_fee_change_log_dto_local_var = curve_admin_fee_change_log_dto_create (
        entry_time ? strdup(entry_time->valuestring) : NULL,
        recv_time ? strdup(recv_time->valuestring) : NULL,
        block_number ? block_number->valuedouble : 0,
        id ? strdup(id->valuestring) : NULL,
        pool ? strdup(pool->valuestring) : NULL,
        value ? strdup(value->valuestring) : NULL,
        block ? strdup(block->valuestring) : NULL,
        timestamp ? strdup(timestamp->valuestring) : NULL,
        transaction ? strdup(transaction->valuestring) : NULL,
        vid ? vid->valuedouble : 0
        );

    return curve_admin_fee_change_log_dto_local_var;
end:
    return NULL;

}
