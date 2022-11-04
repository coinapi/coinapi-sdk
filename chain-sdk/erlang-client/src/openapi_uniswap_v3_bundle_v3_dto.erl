-module(openapi_uniswap_v3_bundle_v3_dto).

-export([encode/1]).

-export_type([openapi_uniswap_v3_bundle_v3_dto/0]).

-type openapi_uniswap_v3_bundle_v3_dto() ::
    #{ 'entry_time' => openapi_date_time:openapi_date_time(),
       'recv_time' => openapi_date_time:openapi_date_time(),
       'block_number' => integer(),
       'id' => binary(),
       'eth_price_usd' => binary(),
       'vid' => integer()
     }.

encode(#{ 'entry_time' := EntryTime,
          'recv_time' := RecvTime,
          'block_number' := BlockNumber,
          'id' := Id,
          'eth_price_usd' := EthPriceUsd,
          'vid' := Vid
        }) ->
    #{ 'entry_time' => EntryTime,
       'recv_time' => RecvTime,
       'block_number' => BlockNumber,
       'id' => Id,
       'eth_price_usd' => EthPriceUsd,
       'vid' => Vid
     }.
