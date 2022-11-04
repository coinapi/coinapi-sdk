#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "uniswap_v3_token_hour_data_v3_dto.h"



uniswap_v3_token_hour_data_v3_dto_t *uniswap_v3_token_hour_data_v3_dto_create(
    char *entry_time,
    char *recv_time,
    long block_number,
    char *id,
    int period_start_unix,
    char *token,
    char *volume,
    char *volume_usd,
    char *untracked_volume_usd,
    char *total_value_locked,
    char *total_value_locked_usd,
    char *price_usd,
    char *fees_usd,
    char *open,
    char *high,
    char *low,
    char *close,
    long vid
    ) {
    uniswap_v3_token_hour_data_v3_dto_t *uniswap_v3_token_hour_data_v3_dto_local_var = malloc(sizeof(uniswap_v3_token_hour_data_v3_dto_t));
    if (!uniswap_v3_token_hour_data_v3_dto_local_var) {
        return NULL;
    }
    uniswap_v3_token_hour_data_v3_dto_local_var->entry_time = entry_time;
    uniswap_v3_token_hour_data_v3_dto_local_var->recv_time = recv_time;
    uniswap_v3_token_hour_data_v3_dto_local_var->block_number = block_number;
    uniswap_v3_token_hour_data_v3_dto_local_var->id = id;
    uniswap_v3_token_hour_data_v3_dto_local_var->period_start_unix = period_start_unix;
    uniswap_v3_token_hour_data_v3_dto_local_var->token = token;
    uniswap_v3_token_hour_data_v3_dto_local_var->volume = volume;
    uniswap_v3_token_hour_data_v3_dto_local_var->volume_usd = volume_usd;
    uniswap_v3_token_hour_data_v3_dto_local_var->untracked_volume_usd = untracked_volume_usd;
    uniswap_v3_token_hour_data_v3_dto_local_var->total_value_locked = total_value_locked;
    uniswap_v3_token_hour_data_v3_dto_local_var->total_value_locked_usd = total_value_locked_usd;
    uniswap_v3_token_hour_data_v3_dto_local_var->price_usd = price_usd;
    uniswap_v3_token_hour_data_v3_dto_local_var->fees_usd = fees_usd;
    uniswap_v3_token_hour_data_v3_dto_local_var->open = open;
    uniswap_v3_token_hour_data_v3_dto_local_var->high = high;
    uniswap_v3_token_hour_data_v3_dto_local_var->low = low;
    uniswap_v3_token_hour_data_v3_dto_local_var->close = close;
    uniswap_v3_token_hour_data_v3_dto_local_var->vid = vid;

    return uniswap_v3_token_hour_data_v3_dto_local_var;
}


void uniswap_v3_token_hour_data_v3_dto_free(uniswap_v3_token_hour_data_v3_dto_t *uniswap_v3_token_hour_data_v3_dto) {
    if(NULL == uniswap_v3_token_hour_data_v3_dto){
        return ;
    }
    listEntry_t *listEntry;
    if (uniswap_v3_token_hour_data_v3_dto->entry_time) {
        free(uniswap_v3_token_hour_data_v3_dto->entry_time);
        uniswap_v3_token_hour_data_v3_dto->entry_time = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->recv_time) {
        free(uniswap_v3_token_hour_data_v3_dto->recv_time);
        uniswap_v3_token_hour_data_v3_dto->recv_time = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->id) {
        free(uniswap_v3_token_hour_data_v3_dto->id);
        uniswap_v3_token_hour_data_v3_dto->id = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->token) {
        free(uniswap_v3_token_hour_data_v3_dto->token);
        uniswap_v3_token_hour_data_v3_dto->token = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->volume) {
        free(uniswap_v3_token_hour_data_v3_dto->volume);
        uniswap_v3_token_hour_data_v3_dto->volume = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->volume_usd) {
        free(uniswap_v3_token_hour_data_v3_dto->volume_usd);
        uniswap_v3_token_hour_data_v3_dto->volume_usd = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->untracked_volume_usd) {
        free(uniswap_v3_token_hour_data_v3_dto->untracked_volume_usd);
        uniswap_v3_token_hour_data_v3_dto->untracked_volume_usd = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->total_value_locked) {
        free(uniswap_v3_token_hour_data_v3_dto->total_value_locked);
        uniswap_v3_token_hour_data_v3_dto->total_value_locked = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->total_value_locked_usd) {
        free(uniswap_v3_token_hour_data_v3_dto->total_value_locked_usd);
        uniswap_v3_token_hour_data_v3_dto->total_value_locked_usd = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->price_usd) {
        free(uniswap_v3_token_hour_data_v3_dto->price_usd);
        uniswap_v3_token_hour_data_v3_dto->price_usd = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->fees_usd) {
        free(uniswap_v3_token_hour_data_v3_dto->fees_usd);
        uniswap_v3_token_hour_data_v3_dto->fees_usd = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->open) {
        free(uniswap_v3_token_hour_data_v3_dto->open);
        uniswap_v3_token_hour_data_v3_dto->open = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->high) {
        free(uniswap_v3_token_hour_data_v3_dto->high);
        uniswap_v3_token_hour_data_v3_dto->high = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->low) {
        free(uniswap_v3_token_hour_data_v3_dto->low);
        uniswap_v3_token_hour_data_v3_dto->low = NULL;
    }
    if (uniswap_v3_token_hour_data_v3_dto->close) {
        free(uniswap_v3_token_hour_data_v3_dto->close);
        uniswap_v3_token_hour_data_v3_dto->close = NULL;
    }
    free(uniswap_v3_token_hour_data_v3_dto);
}

cJSON *uniswap_v3_token_hour_data_v3_dto_convertToJSON(uniswap_v3_token_hour_data_v3_dto_t *uniswap_v3_token_hour_data_v3_dto) {
    cJSON *item = cJSON_CreateObject();

    // uniswap_v3_token_hour_data_v3_dto->entry_time
    if(uniswap_v3_token_hour_data_v3_dto->entry_time) {
    if(cJSON_AddStringToObject(item, "entry_time", uniswap_v3_token_hour_data_v3_dto->entry_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->recv_time
    if(uniswap_v3_token_hour_data_v3_dto->recv_time) {
    if(cJSON_AddStringToObject(item, "recv_time", uniswap_v3_token_hour_data_v3_dto->recv_time) == NULL) {
    goto fail; //Date-Time
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->block_number
    if(uniswap_v3_token_hour_data_v3_dto->block_number) {
    if(cJSON_AddNumberToObject(item, "block_number", uniswap_v3_token_hour_data_v3_dto->block_number) == NULL) {
    goto fail; //Numeric
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->id
    if(uniswap_v3_token_hour_data_v3_dto->id) {
    if(cJSON_AddStringToObject(item, "id", uniswap_v3_token_hour_data_v3_dto->id) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->period_start_unix
    if(uniswap_v3_token_hour_data_v3_dto->period_start_unix) {
    if(cJSON_AddNumberToObject(item, "period_start_unix", uniswap_v3_token_hour_data_v3_dto->period_start_unix) == NULL) {
    goto fail; //Numeric
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->token
    if(uniswap_v3_token_hour_data_v3_dto->token) {
    if(cJSON_AddStringToObject(item, "token", uniswap_v3_token_hour_data_v3_dto->token) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->volume
    if(uniswap_v3_token_hour_data_v3_dto->volume) {
    if(cJSON_AddStringToObject(item, "volume", uniswap_v3_token_hour_data_v3_dto->volume) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->volume_usd
    if(uniswap_v3_token_hour_data_v3_dto->volume_usd) {
    if(cJSON_AddStringToObject(item, "volume_usd", uniswap_v3_token_hour_data_v3_dto->volume_usd) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->untracked_volume_usd
    if(uniswap_v3_token_hour_data_v3_dto->untracked_volume_usd) {
    if(cJSON_AddStringToObject(item, "untracked_volume_usd", uniswap_v3_token_hour_data_v3_dto->untracked_volume_usd) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->total_value_locked
    if(uniswap_v3_token_hour_data_v3_dto->total_value_locked) {
    if(cJSON_AddStringToObject(item, "total_value_locked", uniswap_v3_token_hour_data_v3_dto->total_value_locked) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->total_value_locked_usd
    if(uniswap_v3_token_hour_data_v3_dto->total_value_locked_usd) {
    if(cJSON_AddStringToObject(item, "total_value_locked_usd", uniswap_v3_token_hour_data_v3_dto->total_value_locked_usd) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->price_usd
    if(uniswap_v3_token_hour_data_v3_dto->price_usd) {
    if(cJSON_AddStringToObject(item, "price_usd", uniswap_v3_token_hour_data_v3_dto->price_usd) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->fees_usd
    if(uniswap_v3_token_hour_data_v3_dto->fees_usd) {
    if(cJSON_AddStringToObject(item, "fees_usd", uniswap_v3_token_hour_data_v3_dto->fees_usd) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->open
    if(uniswap_v3_token_hour_data_v3_dto->open) {
    if(cJSON_AddStringToObject(item, "open", uniswap_v3_token_hour_data_v3_dto->open) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->high
    if(uniswap_v3_token_hour_data_v3_dto->high) {
    if(cJSON_AddStringToObject(item, "high", uniswap_v3_token_hour_data_v3_dto->high) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->low
    if(uniswap_v3_token_hour_data_v3_dto->low) {
    if(cJSON_AddStringToObject(item, "low", uniswap_v3_token_hour_data_v3_dto->low) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->close
    if(uniswap_v3_token_hour_data_v3_dto->close) {
    if(cJSON_AddStringToObject(item, "close", uniswap_v3_token_hour_data_v3_dto->close) == NULL) {
    goto fail; //String
    }
    }


    // uniswap_v3_token_hour_data_v3_dto->vid
    if(uniswap_v3_token_hour_data_v3_dto->vid) {
    if(cJSON_AddNumberToObject(item, "vid", uniswap_v3_token_hour_data_v3_dto->vid) == NULL) {
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

uniswap_v3_token_hour_data_v3_dto_t *uniswap_v3_token_hour_data_v3_dto_parseFromJSON(cJSON *uniswap_v3_token_hour_data_v3_dtoJSON){

    uniswap_v3_token_hour_data_v3_dto_t *uniswap_v3_token_hour_data_v3_dto_local_var = NULL;

    // uniswap_v3_token_hour_data_v3_dto->entry_time
    cJSON *entry_time = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "entry_time");
    if (entry_time) { 
    if(!cJSON_IsString(entry_time))
    {
    goto end; //DateTime
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->recv_time
    cJSON *recv_time = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "recv_time");
    if (recv_time) { 
    if(!cJSON_IsString(recv_time))
    {
    goto end; //DateTime
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->block_number
    cJSON *block_number = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "block_number");
    if (block_number) { 
    if(!cJSON_IsNumber(block_number))
    {
    goto end; //Numeric
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "id");
    if (id) { 
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->period_start_unix
    cJSON *period_start_unix = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "period_start_unix");
    if (period_start_unix) { 
    if(!cJSON_IsNumber(period_start_unix))
    {
    goto end; //Numeric
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->token
    cJSON *token = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "token");
    if (token) { 
    if(!cJSON_IsString(token))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->volume
    cJSON *volume = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "volume");
    if (volume) { 
    if(!cJSON_IsString(volume))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->volume_usd
    cJSON *volume_usd = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "volume_usd");
    if (volume_usd) { 
    if(!cJSON_IsString(volume_usd))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->untracked_volume_usd
    cJSON *untracked_volume_usd = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "untracked_volume_usd");
    if (untracked_volume_usd) { 
    if(!cJSON_IsString(untracked_volume_usd))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->total_value_locked
    cJSON *total_value_locked = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "total_value_locked");
    if (total_value_locked) { 
    if(!cJSON_IsString(total_value_locked))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->total_value_locked_usd
    cJSON *total_value_locked_usd = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "total_value_locked_usd");
    if (total_value_locked_usd) { 
    if(!cJSON_IsString(total_value_locked_usd))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->price_usd
    cJSON *price_usd = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "price_usd");
    if (price_usd) { 
    if(!cJSON_IsString(price_usd))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->fees_usd
    cJSON *fees_usd = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "fees_usd");
    if (fees_usd) { 
    if(!cJSON_IsString(fees_usd))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->open
    cJSON *open = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "open");
    if (open) { 
    if(!cJSON_IsString(open))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->high
    cJSON *high = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "high");
    if (high) { 
    if(!cJSON_IsString(high))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->low
    cJSON *low = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "low");
    if (low) { 
    if(!cJSON_IsString(low))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->close
    cJSON *close = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "close");
    if (close) { 
    if(!cJSON_IsString(close))
    {
    goto end; //String
    }
    }

    // uniswap_v3_token_hour_data_v3_dto->vid
    cJSON *vid = cJSON_GetObjectItemCaseSensitive(uniswap_v3_token_hour_data_v3_dtoJSON, "vid");
    if (vid) { 
    if(!cJSON_IsNumber(vid))
    {
    goto end; //Numeric
    }
    }


    uniswap_v3_token_hour_data_v3_dto_local_var = uniswap_v3_token_hour_data_v3_dto_create (
        entry_time ? strdup(entry_time->valuestring) : NULL,
        recv_time ? strdup(recv_time->valuestring) : NULL,
        block_number ? block_number->valuedouble : 0,
        id ? strdup(id->valuestring) : NULL,
        period_start_unix ? period_start_unix->valuedouble : 0,
        token ? strdup(token->valuestring) : NULL,
        volume ? strdup(volume->valuestring) : NULL,
        volume_usd ? strdup(volume_usd->valuestring) : NULL,
        untracked_volume_usd ? strdup(untracked_volume_usd->valuestring) : NULL,
        total_value_locked ? strdup(total_value_locked->valuestring) : NULL,
        total_value_locked_usd ? strdup(total_value_locked_usd->valuestring) : NULL,
        price_usd ? strdup(price_usd->valuestring) : NULL,
        fees_usd ? strdup(fees_usd->valuestring) : NULL,
        open ? strdup(open->valuestring) : NULL,
        high ? strdup(high->valuestring) : NULL,
        low ? strdup(low->valuestring) : NULL,
        close ? strdup(close->valuestring) : NULL,
        vid ? vid->valuedouble : 0
        );

    return uniswap_v3_token_hour_data_v3_dto_local_var;
end:
    return NULL;

}