#ifndef uniswap_v3_swap_v3_dto_TEST
#define uniswap_v3_swap_v3_dto_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define uniswap_v3_swap_v3_dto_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/uniswap_v3_swap_v3_dto.h"
uniswap_v3_swap_v3_dto_t* instantiate_uniswap_v3_swap_v3_dto(int include_optional);

#include "test_numerics_big_integer.c"
#include "test_numerics_big_integer.c"
#include "test_numerics_big_integer.c"


uniswap_v3_swap_v3_dto_t* instantiate_uniswap_v3_swap_v3_dto(int include_optional) {
  uniswap_v3_swap_v3_dto_t* uniswap_v3_swap_v3_dto = NULL;
  if (include_optional) {
    uniswap_v3_swap_v3_dto = uniswap_v3_swap_v3_dto_create(
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      56,
      56,
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_numerics_big_integer(0),
       // false, not to have infinite recursion
      instantiate_numerics_big_integer(0),
       // false, not to have infinite recursion
      instantiate_numerics_big_integer(0),
      1.337,
      1.337,
      onchain_api_uniswap_v3_swap_v3_dto__Buy,
      "0",
      "0"
    );
  } else {
    uniswap_v3_swap_v3_dto = uniswap_v3_swap_v3_dto_create(
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      56,
      56,
      "0",
      "0",
      "2013-10-20T19:20:30+01:00",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      NULL,
      NULL,
      NULL,
      1.337,
      1.337,
      onchain_api_uniswap_v3_swap_v3_dto__Buy,
      "0",
      "0"
    );
  }

  return uniswap_v3_swap_v3_dto;
}


#ifdef uniswap_v3_swap_v3_dto_MAIN

void test_uniswap_v3_swap_v3_dto(int include_optional) {
    uniswap_v3_swap_v3_dto_t* uniswap_v3_swap_v3_dto_1 = instantiate_uniswap_v3_swap_v3_dto(include_optional);

	cJSON* jsonuniswap_v3_swap_v3_dto_1 = uniswap_v3_swap_v3_dto_convertToJSON(uniswap_v3_swap_v3_dto_1);
	printf("uniswap_v3_swap_v3_dto :\n%s\n", cJSON_Print(jsonuniswap_v3_swap_v3_dto_1));
	uniswap_v3_swap_v3_dto_t* uniswap_v3_swap_v3_dto_2 = uniswap_v3_swap_v3_dto_parseFromJSON(jsonuniswap_v3_swap_v3_dto_1);
	cJSON* jsonuniswap_v3_swap_v3_dto_2 = uniswap_v3_swap_v3_dto_convertToJSON(uniswap_v3_swap_v3_dto_2);
	printf("repeating uniswap_v3_swap_v3_dto:\n%s\n", cJSON_Print(jsonuniswap_v3_swap_v3_dto_2));
}

int main() {
  test_uniswap_v3_swap_v3_dto(1);
  test_uniswap_v3_swap_v3_dto(0);

  printf("Hello world \n");
  return 0;
}

#endif // uniswap_v3_swap_v3_dto_MAIN
#endif // uniswap_v3_swap_v3_dto_TEST
