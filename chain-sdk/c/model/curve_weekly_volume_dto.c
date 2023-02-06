#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "curve_weekly_volume_dto.h"



curve_weekly_volume_dto_t *curve_weekly_volume_dto_create(
    char *entry_time,
    char *recv_time,
    long block_number,
    char *id,
    char *pool,
    char *timestamp,
    char *volume,
    long vid
    ) {
    curve_weekly_volume_dto_t *curve_weekly_volume_dto_local_var = malloc(sizeof(curve_weekly_volume_dto_t));
    if (!curve_weekly_volume_dto_local_var) {
        return NULL;
    }
    curve_weekly_volume_dto_local_var->entry_time = entry_time;
    curve_weekly_volume_dto_local_var->recv_time = recv_time;
    curve_weekly_volume_dto_local_var->block_number = block_number;
    curve_weekly_volume_dto_local_var->id = id;
    curve_weekly_volume_dto_local_var->pool = pool;
    curve_weekly_volume_dto_local_var->timestamp = timestamp;
    curve_weekly_volume_dto_local_var->volume = volume;
    curve_weekly_volume_dto_local_var->vid = vid;

    return curve_weekly_volume_dto_local_var;
}


void curve_weekly_volume_dto_free(curve_weekly_volume_dto_t *curve_weekly_volume_dto) {
    if(NULL == curve_weekly_volume_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (curve_weekly_volume_dto->entry_time) {
        free(curve_weekly_volume_dto->entry_time);
        curve_weekly_volume_dto->entry_time = NULL;
    }
    if (curve_weekly_volume_dto->recv_time) {
        free(curve_weekly_volume_dto->recv_time);
        curve_weekly_volume_dto->recv_time = NULL;
    }
    if (curve_weekly_volume_dto->id) {
        free(curve_weekly_volume_dto->id);
        curve_weekly_volume_dto->id = NULL;
    }
    if (curve_weekly_volume_dto->pool) {
        free(curve_weekly_volume_dto->pool);
        curve_weekly_volume_dto->pool = NULL;
    }
    if (curve_weekly_volume_dto->timestamp) {
        free(curve_weekly_volume_dto->timestamp);
        curve_weekly_volume_dto->timestamp = NULL;
    }
    if (curve_weekly_volume_dto->volume) {
        free(curve_weekly_volume_dto->volume);
        curve_weekly_volume_dto->volume = NULL;
    }
    free(curve_weekly_volume_dto);
}

cJSON *curve_weekly_volume_dto_convertToJSON(curve_weekly_volume_dto_t *curve_weekly_volume_dto) {
    cJSON *item = cJSON_CreateObject();

    // curve_weekly_volume_dto->entry_time
    if(curve_weekly_volume_dto->entry_time) {
    if(cJSON_AddStringToObject(item, "entry_time", curve_weekly_volume_dto->entry_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // curve_weekly_volume_dto->recv_time
    if(curve_weekly_volume_dto->recv_time) {
    if(cJSON_AddStringToObject(item, "recv_time", curve_weekly_volume_dto->recv_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // curve_weekly_volume_dto->block_number
    if(curve_weekly_volume_dto->block_number) {
    if(cJSON_AddNumberToObject(item, "block_number", curve_weekly_volume_dto->block_number) == NULL) {
    goto fail; //Numeric
    }
    }


    // curve_weekly_volume_dto->id
    if(curve_weekly_volume_dto->id) {
    if(cJSON_AddStringToObject(item, "id", curve_weekly_volume_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // curve_weekly_volume_dto->pool
    if(curve_weekly_volume_dto->pool) {
    if(cJSON_AddStringToObject(item, "pool", curve_weekly_volume_dto->pool) == NULL) {
    goto fail; //String
    }
    }


    // curve_weekly_volume_dto->timestamp
    if(curve_weekly_volume_dto->timestamp) {
    if(cJSON_AddStringToObject(item, "timestamp", curve_weekly_volume_dto->timestamp) == NULL) {
    goto fail; //String
    }
    }


    // curve_weekly_volume_dto->volume
    if(curve_weekly_volume_dto->volume) {
    if(cJSON_AddStringToObject(item, "volume", curve_weekly_volume_dto->volume) == NULL) {
    goto fail; //String
    }
    }


    // curve_weekly_volume_dto->vid
    if(curve_weekly_volume_dto->vid) {
    if(cJSON_AddNumberToObject(item, "vid", curve_weekly_volume_dto->vid) == NULL) {
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

curve_weekly_volume_dto_t *curve_weekly_volume_dto_parseFromJSON(cJSON *curve_weekly_volume_dtoJSON){

    curve_weekly_volume_dto_t *curve_weekly_volume_dto_local_var = NULL;

    // curve_weekly_volume_dto->entry_time
    cJSON *entry_time = cJSON_GetObjectItemCaseSensitive(curve_weekly_volume_dtoJSON, "entry_time");
    if (entry_time) { 
    if(!cJSON_IsString(entry_time) && !cJSON_IsNull(entry_time))
    {
    goto end; //DateTime
    }
    }

    // curve_weekly_volume_dto->recv_time
    cJSON *recv_time = cJSON_GetObjectItemCaseSensitive(curve_weekly_volume_dtoJSON, "recv_time");
    if (recv_time) { 
    if(!cJSON_IsString(recv_time) && !cJSON_IsNull(recv_time))
    {
    goto end; //DateTime
    }
    }

    // curve_weekly_volume_dto->block_number
    cJSON *block_number = cJSON_GetObjectItemCaseSensitive(curve_weekly_volume_dtoJSON, "block_number");
    if (block_number) { 
    if(!cJSON_IsNumber(block_number))
    {
    goto end; //Numeric
    }
    }

    // curve_weekly_volume_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(curve_weekly_volume_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // curve_weekly_volume_dto->pool
    cJSON *pool = cJSON_GetObjectItemCaseSensitive(curve_weekly_volume_dtoJSON, "pool");
    if (pool) { 
    if(!cJSON_IsString(pool) && !cJSON_IsNull(pool))
    {
    goto end; //String
    }
    }

    // curve_weekly_volume_dto->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(curve_weekly_volume_dtoJSON, "timestamp");
    if (timestamp) { 
    if(!cJSON_IsString(timestamp) && !cJSON_IsNull(timestamp))
    {
    goto end; //String
    }
    }

    // curve_weekly_volume_dto->volume
    cJSON *volume = cJSON_GetObjectItemCaseSensitive(curve_weekly_volume_dtoJSON, "volume");
    if (volume) { 
    if(!cJSON_IsString(volume) && !cJSON_IsNull(volume))
    {
    goto end; //String
    }
    }

    // curve_weekly_volume_dto->vid
    cJSON *vid = cJSON_GetObjectItemCaseSensitive(curve_weekly_volume_dtoJSON, "vid");
    if (vid) { 
    if(!cJSON_IsNumber(vid))
    {
    goto end; //Numeric
    }
    }


    curve_weekly_volume_dto_local_var = curve_weekly_volume_dto_create (
        entry_time && !cJSON_IsNull(entry_time) ? strdup(entry_time->valuestring) : NULL,
        recv_time && !cJSON_IsNull(recv_time) ? strdup(recv_time->valuestring) : NULL,
        block_number ? block_number->valuedouble : 0,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        pool && !cJSON_IsNull(pool) ? strdup(pool->valuestring) : NULL,
        timestamp && !cJSON_IsNull(timestamp) ? strdup(timestamp->valuestring) : NULL,
        volume && !cJSON_IsNull(volume) ? strdup(volume->valuestring) : NULL,
        vid ? vid->valuedouble : 0
        );

    return curve_weekly_volume_dto_local_var;
end:
    return NULL;

}
