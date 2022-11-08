-module(openapi_uniswap_v2_api).

-export([uniswap_v2_get_bundles_(historical)/1, uniswap_v2_get_bundles_(historical)/2,
         uniswap_v2_get_burns_(historical)/1, uniswap_v2_get_burns_(historical)/2,
         uniswap_v2_get_day_data_(historical)/1, uniswap_v2_get_day_data_(historical)/2,
         uniswap_v2_get_factory_(historical)/1, uniswap_v2_get_factory_(historical)/2,
         uniswap_v2_get_liquidity_positions_(historical)/1, uniswap_v2_get_liquidity_positions_(historical)/2,
         uniswap_v2_get_liquidity_positions_snapshots_(historical)/1, uniswap_v2_get_liquidity_positions_snapshots_(historical)/2,
         uniswap_v2_get_mints_(historical)/1, uniswap_v2_get_mints_(historical)/2,
         uniswap_v2_get_pools_(current)/1, uniswap_v2_get_pools_(current)/2,
         uniswap_v2_get_pools_(historical)/1, uniswap_v2_get_pools_(historical)/2,
         uniswap_v2_get_pools_day_data_(historical)/1, uniswap_v2_get_pools_day_data_(historical)/2,
         uniswap_v2_get_pools_hour_data_(historical)/1, uniswap_v2_get_pools_hour_data_(historical)/2,
         uniswap_v2_get_swaps_(current)/1, uniswap_v2_get_swaps_(current)/2,
         uniswap_v2_get_swaps_(historical)/1, uniswap_v2_get_swaps_(historical)/2,
         uniswap_v2_get_tokens_(current)/1, uniswap_v2_get_tokens_(current)/2,
         uniswap_v2_get_tokens_(historical)/1, uniswap_v2_get_tokens_(historical)/2,
         uniswap_v2_get_tokens_day_data_(historical)/1, uniswap_v2_get_tokens_day_data_(historical)/2,
         uniswap_v2_get_transactions_(historical)/1, uniswap_v2_get_transactions_(historical)/2,
         uniswap_v2_get_users_(historical)/1, uniswap_v2_get_users_(historical)/2]).

-define(BASE_URL, <<"">>).

%% @doc GetBundles (historical)
%% Gets bundles.
-spec uniswap_v2_get_bundles_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_bundle_v2_dto:openapi_uniswap_v2_bundle_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_bundles_(historical)(Ctx) ->
    uniswap_v2_get_bundles_(historical)(Ctx, #{}).

-spec uniswap_v2_get_bundles_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_bundle_v2_dto:openapi_uniswap_v2_bundle_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_bundles_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/bundles/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetBurns (historical)
%% Gets burns.
-spec uniswap_v2_get_burns_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_burn_v2_dto:openapi_uniswap_v2_burn_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_burns_(historical)(Ctx) ->
    uniswap_v2_get_burns_(historical)(Ctx, #{}).

-spec uniswap_v2_get_burns_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_burn_v2_dto:openapi_uniswap_v2_burn_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_burns_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/burns/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetDayData (historical)
%% Gets uniswapv2 day data.
-spec uniswap_v2_get_day_data_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_uniswap_day_data_v2_dto:openapi_uniswap_v2_uniswap_day_data_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_day_data_(historical)(Ctx) ->
    uniswap_v2_get_day_data_(historical)(Ctx, #{}).

-spec uniswap_v2_get_day_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_uniswap_day_data_v2_dto:openapi_uniswap_v2_uniswap_day_data_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_day_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/dayData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetFactory (historical)
%% Gets factory.
-spec uniswap_v2_get_factory_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_uniswap_factory_v2_dto:openapi_uniswap_v2_uniswap_factory_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_factory_(historical)(Ctx) ->
    uniswap_v2_get_factory_(historical)(Ctx, #{}).

-spec uniswap_v2_get_factory_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_uniswap_factory_v2_dto:openapi_uniswap_v2_uniswap_factory_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_factory_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/factory/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetLiquidityPositions (historical)
%% Gets liquidity positions.
-spec uniswap_v2_get_liquidity_positions_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_liquidity_position_v2_dto:openapi_uniswap_v2_liquidity_position_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_liquidity_positions_(historical)(Ctx) ->
    uniswap_v2_get_liquidity_positions_(historical)(Ctx, #{}).

-spec uniswap_v2_get_liquidity_positions_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_liquidity_position_v2_dto:openapi_uniswap_v2_liquidity_position_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_liquidity_positions_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/liquidityPositions/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetLiquidityPositionsSnapshots (historical)
%% Gets liquidity positions snapshots.
-spec uniswap_v2_get_liquidity_positions_snapshots_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_liquidity_position_snapshot_v2_dto:openapi_uniswap_v2_liquidity_position_snapshot_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_liquidity_positions_snapshots_(historical)(Ctx) ->
    uniswap_v2_get_liquidity_positions_snapshots_(historical)(Ctx, #{}).

-spec uniswap_v2_get_liquidity_positions_snapshots_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_liquidity_position_snapshot_v2_dto:openapi_uniswap_v2_liquidity_position_snapshot_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_liquidity_positions_snapshots_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/liquidityPositionsSnapshots/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetMints (historical)
%% Gets mints.
-spec uniswap_v2_get_mints_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_mint_v2_dto:openapi_uniswap_v2_mint_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_mints_(historical)(Ctx) ->
    uniswap_v2_get_mints_(historical)(Ctx, #{}).

-spec uniswap_v2_get_mints_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_mint_v2_dto:openapi_uniswap_v2_mint_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_mints_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/mints/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetPools (current) 🔥
%% Gets pools.
-spec uniswap_v2_get_pools_(current)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_pair_v2_dto:openapi_uniswap_v2_pair_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_pools_(current)(Ctx) ->
    uniswap_v2_get_pools_(current)(Ctx, #{}).

-spec uniswap_v2_get_pools_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_pair_v2_dto:openapi_uniswap_v2_pair_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_pools_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/pools/current">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['filter_pool_id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetPools (historical) 🔥
%% Gets pools.
-spec uniswap_v2_get_pools_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_pair_v2_dto:openapi_uniswap_v2_pair_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_pools_(historical)(Ctx) ->
    uniswap_v2_get_pools_(historical)(Ctx, #{}).

-spec uniswap_v2_get_pools_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_pair_v2_dto:openapi_uniswap_v2_pair_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_pools_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/pools/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetPoolsDayData (historical)
%% Gets pools day data.
-spec uniswap_v2_get_pools_day_data_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_pair_day_data_v2_dto:openapi_uniswap_v2_pair_day_data_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_pools_day_data_(historical)(Ctx) ->
    uniswap_v2_get_pools_day_data_(historical)(Ctx, #{}).

-spec uniswap_v2_get_pools_day_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_pair_day_data_v2_dto:openapi_uniswap_v2_pair_day_data_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_pools_day_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/poolsDayData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetPoolsHourData (historical)
%% Gets pools tracked each our.
-spec uniswap_v2_get_pools_hour_data_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_pair_hour_data_v2_dto:openapi_uniswap_v2_pair_hour_data_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_pools_hour_data_(historical)(Ctx) ->
    uniswap_v2_get_pools_hour_data_(historical)(Ctx, #{}).

-spec uniswap_v2_get_pools_hour_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_pair_hour_data_v2_dto:openapi_uniswap_v2_pair_hour_data_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_pools_hour_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/poolsHourData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetSwaps (current) 🔥
%% Gets swaps.
-spec uniswap_v2_get_swaps_(current)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_swap_v2_dto:openapi_uniswap_v2_swap_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_swaps_(current)(Ctx) ->
    uniswap_v2_get_swaps_(current)(Ctx, #{}).

-spec uniswap_v2_get_swaps_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_swap_v2_dto:openapi_uniswap_v2_swap_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_swaps_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/swaps/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetSwaps (historical) 🔥
%% Gets swaps.
-spec uniswap_v2_get_swaps_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_swap_v2_dto:openapi_uniswap_v2_swap_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_swaps_(historical)(Ctx) ->
    uniswap_v2_get_swaps_(historical)(Ctx, #{}).

-spec uniswap_v2_get_swaps_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_swap_v2_dto:openapi_uniswap_v2_swap_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_swaps_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/swaps/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'poolId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTokens (current) 🔥
%% Gets tokens.
-spec uniswap_v2_get_tokens_(current)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_token_v2_dto:openapi_uniswap_v2_token_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_tokens_(current)(Ctx) ->
    uniswap_v2_get_tokens_(current)(Ctx, #{}).

-spec uniswap_v2_get_tokens_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_token_v2_dto:openapi_uniswap_v2_token_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_tokens_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/tokens/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTokens (historical) 🔥
%% Gets tokens.
-spec uniswap_v2_get_tokens_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_token_v2_dto:openapi_uniswap_v2_token_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_tokens_(historical)(Ctx) ->
    uniswap_v2_get_tokens_(historical)(Ctx, #{}).

-spec uniswap_v2_get_tokens_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_token_v2_dto:openapi_uniswap_v2_token_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_tokens_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/tokens/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'tokenId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTokensDayData (historical)
%% Gets tokens day data.
-spec uniswap_v2_get_tokens_day_data_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_token_day_data_v2_dto:openapi_uniswap_v2_token_day_data_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_tokens_day_data_(historical)(Ctx) ->
    uniswap_v2_get_tokens_day_data_(historical)(Ctx, #{}).

-spec uniswap_v2_get_tokens_day_data_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_token_day_data_v2_dto:openapi_uniswap_v2_token_day_data_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_tokens_day_data_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/tokensDayData/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'tokenId'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetTransactions (historical)
%% Gets transactions.
-spec uniswap_v2_get_transactions_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_transaction_v2_dto:openapi_uniswap_v2_transaction_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_transactions_(historical)(Ctx) ->
    uniswap_v2_get_transactions_(historical)(Ctx, #{}).

-spec uniswap_v2_get_transactions_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_transaction_v2_dto:openapi_uniswap_v2_transaction_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_transactions_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/transactions/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc GetUsers (historical)
%% Gets users.
-spec uniswap_v2_get_users_(historical)(ctx:ctx()) -> {ok, [openapi_uniswap_v2_user_v2_dto:openapi_uniswap_v2_user_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_users_(historical)(Ctx) ->
    uniswap_v2_get_users_(historical)(Ctx, #{}).

-spec uniswap_v2_get_users_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_uniswap_v2_user_v2_dto:openapi_uniswap_v2_user_v2_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
uniswap_v2_get_users_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/uniswapv2/users/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


