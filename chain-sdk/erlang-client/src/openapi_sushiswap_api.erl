-module(openapi_sushiswap_api).

-export([curve_get_exchanges_(current)/1, curve_get_exchanges_(current)/2,
         dex_get_trades_(current)/1, dex_get_trades_(current)/2,
         sushiswap_get_bundles_(historical)/1, sushiswap_get_bundles_(historical)/2,
         sushiswap_get_burns_(historical)/1, sushiswap_get_burns_(historical)/2,
         sushiswap_get_day_data_(historical)/1, sushiswap_get_day_data_(historical)/2,
         sushiswap_get_factory_(historical)/1, sushiswap_get_factory_(historical)/2,
         sushiswap_get_hour_data_(historical)/1, sushiswap_get_hour_data_(historical)/2,
         sushiswap_get_liquidity_position_(historical)/1, sushiswap_get_liquidity_position_(historical)/2,
         sushiswap_get_liquidity_position_snapshot_(historical)/1, sushiswap_get_liquidity_position_snapshot_(historical)/2,
         sushiswap_get_mints_(historical)/1, sushiswap_get_mints_(historical)/2,
         sushiswap_get_pools_(current)/1, sushiswap_get_pools_(current)/2,
         sushiswap_get_pools_(historical)/1, sushiswap_get_pools_(historical)/2,
         sushiswap_get_pools_day_data_(historical)/1, sushiswap_get_pools_day_data_(historical)/2,
         sushiswap_get_pools_hour_data_(historical)/1, sushiswap_get_pools_hour_data_(historical)/2,
         sushiswap_get_swaps_(current)/1, sushiswap_get_swaps_(current)/2,
         sushiswap_get_swaps_(historical)/1, sushiswap_get_swaps_(historical)/2,
         sushiswap_get_tokens_(current)/1, sushiswap_get_tokens_(current)/2,
         sushiswap_get_tokens_(historical)/1, sushiswap_get_tokens_(historical)/2,
         sushiswap_get_tokens_day_data_(historical)/1, sushiswap_get_tokens_day_data_(historical)/2,
         sushiswap_get_transactions_(historical)/1, sushiswap_get_transactions_(historical)/2,
         sushiswap_get_users_(historical)/1, sushiswap_get_users_(historical)/2]).

-define(BASE_URL, <<"">>).

%% @doc GetExchanges (current) 🔥
%% Gets exchanges.
-spec curve_get_exchanges_(current)(ctx:ctx()) -> {ok, [openapi_curve_exchange_dto:openapi_curve_exchange_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
curve_get_exchanges_(current)(Ctx) ->
    curve_get_exchanges_(current)(Ctx, #{}).

-spec curve_get_exchanges_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_curve_exchange_dto:openapi_curve_exchange_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
curve_get_exchanges_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/exchanges/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTrades (current) 🔥
%% Gets trades.
-spec dex_get_trades_(current)(ctx:ctx()) -> {ok, [openapi_dex_trade_dto:openapi_dex_trade_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_trades_(current)(Ctx) ->
    dex_get_trades_(current)(Ctx, #{}).

-spec dex_get_trades_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_trade_dto:openapi_dex_trade_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_trades_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/trades/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetBundles (historical)
%% Gets bundles.
-spec sushiswap_get_bundles_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_bundle_dto:openapi_sushiswap_bundle_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_bundles_(historical)(Ctx) ->
    sushiswap_get_bundles_(historical)(Ctx, #{}).

-spec sushiswap_get_bundles_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_bundle_dto:openapi_sushiswap_bundle_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_bundles_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/bundles/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetBurns (historical)
%% Gets burns.
-spec sushiswap_get_burns_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_burn_dto:openapi_sushiswap_burn_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_burns_(historical)(Ctx) ->
    sushiswap_get_burns_(historical)(Ctx, #{}).

-spec sushiswap_get_burns_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_burn_dto:openapi_sushiswap_burn_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_burns_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/burns/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetDayData (historical)
%% Gets day data.
-spec sushiswap_get_day_data_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_day_data_dto:openapi_sushiswap_day_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_day_data_(historical)(Ctx) ->
    sushiswap_get_day_data_(historical)(Ctx, #{}).

-spec sushiswap_get_day_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_day_data_dto:openapi_sushiswap_day_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_day_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/dayData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetFactory (historical)
%% Gets factory.
-spec sushiswap_get_factory_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_factory_dto:openapi_sushiswap_factory_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_factory_(historical)(Ctx) ->
    sushiswap_get_factory_(historical)(Ctx, #{}).

-spec sushiswap_get_factory_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_factory_dto:openapi_sushiswap_factory_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_factory_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/factory/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetHourData (historical)
%% Gets hour data.
-spec sushiswap_get_hour_data_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_hour_data_dto:openapi_sushiswap_hour_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_hour_data_(historical)(Ctx) ->
    sushiswap_get_hour_data_(historical)(Ctx, #{}).

-spec sushiswap_get_hour_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_hour_data_dto:openapi_sushiswap_hour_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_hour_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/hourData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetLiquidityPosition (historical)
%% Gets liquidity position.
-spec sushiswap_get_liquidity_position_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_liquidity_position_dto:openapi_sushiswap_liquidity_position_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_liquidity_position_(historical)(Ctx) ->
    sushiswap_get_liquidity_position_(historical)(Ctx, #{}).

-spec sushiswap_get_liquidity_position_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_liquidity_position_dto:openapi_sushiswap_liquidity_position_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_liquidity_position_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/liquidityPosition/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetLiquidityPositionSnapshot (historical)
%% Gets liquidity position snapshot.
-spec sushiswap_get_liquidity_position_snapshot_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_liquidity_position_snapshot_dto:openapi_sushiswap_liquidity_position_snapshot_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_liquidity_position_snapshot_(historical)(Ctx) ->
    sushiswap_get_liquidity_position_snapshot_(historical)(Ctx, #{}).

-spec sushiswap_get_liquidity_position_snapshot_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_liquidity_position_snapshot_dto:openapi_sushiswap_liquidity_position_snapshot_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_liquidity_position_snapshot_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/liquidityPositionSnapshots/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetMints (historical)
%% Gets mints.
-spec sushiswap_get_mints_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_mint_dto:openapi_sushiswap_mint_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_mints_(historical)(Ctx) ->
    sushiswap_get_mints_(historical)(Ctx, #{}).

-spec sushiswap_get_mints_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_mint_dto:openapi_sushiswap_mint_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_mints_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/mints/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetPools (current) 🔥
%% Gets pools.
-spec sushiswap_get_pools_(current)(ctx:ctx()) -> {ok, [openapi_sushiswap_pair_dto:openapi_sushiswap_pair_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_pools_(current)(Ctx) ->
    sushiswap_get_pools_(current)(Ctx, #{}).

-spec sushiswap_get_pools_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_pair_dto:openapi_sushiswap_pair_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_pools_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/pools/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetPools (historical) 🔥
%% Gets list of pools for given filters.
-spec sushiswap_get_pools_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_pair_dto:openapi_sushiswap_pair_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_pools_(historical)(Ctx) ->
    sushiswap_get_pools_(historical)(Ctx, #{}).

-spec sushiswap_get_pools_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_pair_dto:openapi_sushiswap_pair_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_pools_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/pools/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetPoolsDayData (historical)
%% Gets pools day data.
-spec sushiswap_get_pools_day_data_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_pair_day_data_dto:openapi_sushiswap_pair_day_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_pools_day_data_(historical)(Ctx) ->
    sushiswap_get_pools_day_data_(historical)(Ctx, #{}).

-spec sushiswap_get_pools_day_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_pair_day_data_dto:openapi_sushiswap_pair_day_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_pools_day_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/poolsDayData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetPoolsHourData (historical)
%% Gets pools tracked each our.
-spec sushiswap_get_pools_hour_data_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_pair_hour_data_dto:openapi_sushiswap_pair_hour_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_pools_hour_data_(historical)(Ctx) ->
    sushiswap_get_pools_hour_data_(historical)(Ctx, #{}).

-spec sushiswap_get_pools_hour_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_pair_hour_data_dto:openapi_sushiswap_pair_hour_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_pools_hour_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/poolsHourData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetSwaps (current) 🔥
%% Gets swaps.
-spec sushiswap_get_swaps_(current)(ctx:ctx()) -> {ok, [openapi_sushiswap_swap_dto:openapi_sushiswap_swap_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_swaps_(current)(Ctx) ->
    sushiswap_get_swaps_(current)(Ctx, #{}).

-spec sushiswap_get_swaps_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_swap_dto:openapi_sushiswap_swap_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_swaps_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/swaps/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetSwaps (historical) 🔥
%% Gets list of swaps for given filters.
-spec sushiswap_get_swaps_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_swap_dto:openapi_sushiswap_swap_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_swaps_(historical)(Ctx) ->
    sushiswap_get_swaps_(historical)(Ctx, #{}).

-spec sushiswap_get_swaps_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_swap_dto:openapi_sushiswap_swap_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_swaps_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/swaps/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTokens (current) 🔥
%% Gets tokens.
-spec sushiswap_get_tokens_(current)(ctx:ctx()) -> {ok, [openapi_sushiswap_token_dto:openapi_sushiswap_token_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_tokens_(current)(Ctx) ->
    sushiswap_get_tokens_(current)(Ctx, #{}).

-spec sushiswap_get_tokens_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_token_dto:openapi_sushiswap_token_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_tokens_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/tokens/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTokens (historical) 🔥
%% Gets list of tokens for given filters.
-spec sushiswap_get_tokens_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_token_dto:openapi_sushiswap_token_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_tokens_(historical)(Ctx) ->
    sushiswap_get_tokens_(historical)(Ctx, #{}).

-spec sushiswap_get_tokens_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_token_dto:openapi_sushiswap_token_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_tokens_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/tokens/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'tokenId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTokensDayData (historical)
%% Gets tokens day data.
-spec sushiswap_get_tokens_day_data_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_token_day_data_dto:openapi_sushiswap_token_day_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_tokens_day_data_(historical)(Ctx) ->
    sushiswap_get_tokens_day_data_(historical)(Ctx, #{}).

-spec sushiswap_get_tokens_day_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_token_day_data_dto:openapi_sushiswap_token_day_data_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_tokens_day_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/tokensDayData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'tokenId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTransactions (historical)
%% Gets transactions.
-spec sushiswap_get_transactions_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_transaction_dto:openapi_sushiswap_transaction_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_transactions_(historical)(Ctx) ->
    sushiswap_get_transactions_(historical)(Ctx, #{}).

-spec sushiswap_get_transactions_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_transaction_dto:openapi_sushiswap_transaction_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_transactions_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/transactions/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetUsers (historical)
%% Gets users.
-spec sushiswap_get_users_(historical)(ctx:ctx()) -> {ok, [openapi_sushiswap_user_dto:openapi_sushiswap_user_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_users_(historical)(Ctx) ->
    sushiswap_get_users_(historical)(Ctx, #{}).

-spec sushiswap_get_users_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_sushiswap_user_dto:openapi_sushiswap_user_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
sushiswap_get_users_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/sushiswap/users/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


