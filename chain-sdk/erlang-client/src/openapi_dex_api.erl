-module(openapi_dex_api).

-export([dex_batchs_(current)/1, dex_batchs_(current)/2,
         dex_deposits_(current)/1, dex_deposits_(current)/2,
         dex_get_batchs_(historical)/1, dex_get_batchs_(historical)/2,
         dex_get_deposits_(historical)/1, dex_get_deposits_(historical)/2,
         dex_get_orders_(historical)/1, dex_get_orders_(historical)/2,
         dex_get_prices_(historical)/1, dex_get_prices_(historical)/2,
         dex_get_solutions_(historical)/1, dex_get_solutions_(historical)/2,
         dex_get_statss_(historical)/1, dex_get_statss_(historical)/2,
         dex_get_tokens_(historical)/1, dex_get_tokens_(historical)/2,
         dex_get_trades_(historical)/1, dex_get_trades_(historical)/2,
         dex_get_users_(historical)/1, dex_get_users_(historical)/2,
         dex_get_withdraw_requests_(historical)/1, dex_get_withdraw_requests_(historical)/2,
         dex_get_withdraws_(historical)/1, dex_get_withdraws_(historical)/2,
         dex_orders_(current)/1, dex_orders_(current)/2,
         dex_prices_(current)/1, dex_prices_(current)/2,
         dex_solutions_(current)/1, dex_solutions_(current)/2,
         dex_statss_(current)/1, dex_statss_(current)/2,
         dex_tokens_(current)/1, dex_tokens_(current)/2,
         dex_trades_(current)/1, dex_trades_(current)/2,
         dex_users_(current)/1, dex_users_(current)/2,
         dex_withdraw_requests_(current)/1, dex_withdraw_requests_(current)/2,
         dex_withdraws_(current)/1, dex_withdraws_(current)/2]).

-define(BASE_URL, <<"">>).

%% @doc Batchs (current)
%% Gets batchs.
-spec dex_batchs_(current)(ctx:ctx()) -> {ok, [openapi_dex_batch_dto:openapi_dex_batch_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_batchs_(current)(Ctx) ->
    dex_batchs_(current)(Ctx, #{}).

-spec dex_batchs_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_batch_dto:openapi_dex_batch_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_batchs_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/batchs/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deposits (current)
%% Gets deposits.
-spec dex_deposits_(current)(ctx:ctx()) -> {ok, [openapi_dex_deposit_dto:openapi_dex_deposit_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_deposits_(current)(Ctx) ->
    dex_deposits_(current)(Ctx, #{}).

-spec dex_deposits_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_deposit_dto:openapi_dex_deposit_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_deposits_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/deposits/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Batchs (historical) 🔥
%% Gets batchs.
-spec dex_get_batchs_(historical)(ctx:ctx()) -> {ok, [openapi_dex_batch_dto:openapi_dex_batch_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_batchs_(historical)(Ctx) ->
    dex_get_batchs_(historical)(Ctx, #{}).

-spec dex_get_batchs_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_batch_dto:openapi_dex_batch_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_batchs_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/batchs/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Deposits (historical) 🔥
%% Gets deposits.
-spec dex_get_deposits_(historical)(ctx:ctx()) -> {ok, [openapi_dex_deposit_dto:openapi_dex_deposit_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_deposits_(historical)(Ctx) ->
    dex_get_deposits_(historical)(Ctx, #{}).

-spec dex_get_deposits_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_deposit_dto:openapi_dex_deposit_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_deposits_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/deposits/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id', 'user'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Orders (historical) 🔥
%% Gets orders.
-spec dex_get_orders_(historical)(ctx:ctx()) -> {ok, [openapi_dex_order_dto:openapi_dex_order_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_orders_(historical)(Ctx) ->
    dex_get_orders_(historical)(Ctx, #{}).

-spec dex_get_orders_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_order_dto:openapi_dex_order_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_orders_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/orders/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id', 'buy_token', 'sell_token'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Prices (historical) 🔥
%% Gets prices.
-spec dex_get_prices_(historical)(ctx:ctx()) -> {ok, [openapi_dex_price_dto:openapi_dex_price_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_prices_(historical)(Ctx) ->
    dex_get_prices_(historical)(Ctx, #{}).

-spec dex_get_prices_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_price_dto:openapi_dex_price_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_prices_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/prices/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Solutions (historical) 🔥
%% Gets solutions.
-spec dex_get_solutions_(historical)(ctx:ctx()) -> {ok, [openapi_dex_solution_dto:openapi_dex_solution_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_solutions_(historical)(Ctx) ->
    dex_get_solutions_(historical)(Ctx, #{}).

-spec dex_get_solutions_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_solution_dto:openapi_dex_solution_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_solutions_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/solutions/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Statss (historical) 🔥
%% Gets statss.
-spec dex_get_statss_(historical)(ctx:ctx()) -> {ok, [openapi_dex_stats_dto:openapi_dex_stats_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_statss_(historical)(Ctx) ->
    dex_get_statss_(historical)(Ctx, #{}).

-spec dex_get_statss_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_stats_dto:openapi_dex_stats_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_statss_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/statss/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Tokens (historical) 🔥
%% Gets tokens.
-spec dex_get_tokens_(historical)(ctx:ctx()) -> {ok, [openapi_dex_token_dto:openapi_dex_token_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_tokens_(historical)(Ctx) ->
    dex_get_tokens_(historical)(Ctx, #{}).

-spec dex_get_tokens_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_token_dto:openapi_dex_token_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_tokens_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/tokens/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id', 'address', 'symbol', 'name'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Trades (historical) 🔥
%% Gets trades.
-spec dex_get_trades_(historical)(ctx:ctx()) -> {ok, [openapi_dex_trade_dto:openapi_dex_trade_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_trades_(historical)(Ctx) ->
    dex_get_trades_(historical)(Ctx, #{}).

-spec dex_get_trades_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_trade_dto:openapi_dex_trade_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_trades_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/trades/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id', 'buy_token', 'sell_token'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Users (historical) 🔥
%% Gets users.
-spec dex_get_users_(historical)(ctx:ctx()) -> {ok, [openapi_dex_user_dto:openapi_dex_user_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_users_(historical)(Ctx) ->
    dex_get_users_(historical)(Ctx, #{}).

-spec dex_get_users_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_user_dto:openapi_dex_user_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_users_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/users/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc WithdrawRequests (historical) 🔥
%% Gets withdrawRequests.
-spec dex_get_withdraw_requests_(historical)(ctx:ctx()) -> {ok, [openapi_dex_withdraw_request_dto:openapi_dex_withdraw_request_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_withdraw_requests_(historical)(Ctx) ->
    dex_get_withdraw_requests_(historical)(Ctx, #{}).

-spec dex_get_withdraw_requests_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_withdraw_request_dto:openapi_dex_withdraw_request_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_withdraw_requests_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/withdrawRequests/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id', 'user'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Withdraws (historical) 🔥
%% Gets withdraws.
-spec dex_get_withdraws_(historical)(ctx:ctx()) -> {ok, [openapi_dex_withdraw_dto:openapi_dex_withdraw_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_withdraws_(historical)(Ctx) ->
    dex_get_withdraws_(historical)(Ctx, #{}).

-spec dex_get_withdraws_(historical)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_withdraw_dto:openapi_dex_withdraw_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_get_withdraws_(historical)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/withdraws/historical">>],
    QS = lists:flatten([])++openapi_utils:optional_params(['startBlock', 'endBlock', 'startDate', 'endDate', 'id', 'user'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Orders (current)
%% Gets orders.
-spec dex_orders_(current)(ctx:ctx()) -> {ok, [openapi_dex_order_dto:openapi_dex_order_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_orders_(current)(Ctx) ->
    dex_orders_(current)(Ctx, #{}).

-spec dex_orders_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_order_dto:openapi_dex_order_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_orders_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/orders/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Prices (current)
%% Gets prices.
-spec dex_prices_(current)(ctx:ctx()) -> {ok, [openapi_dex_price_dto:openapi_dex_price_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_prices_(current)(Ctx) ->
    dex_prices_(current)(Ctx, #{}).

-spec dex_prices_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_price_dto:openapi_dex_price_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_prices_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/prices/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Solutions (current)
%% Gets solutions.
-spec dex_solutions_(current)(ctx:ctx()) -> {ok, [openapi_dex_solution_dto:openapi_dex_solution_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_solutions_(current)(Ctx) ->
    dex_solutions_(current)(Ctx, #{}).

-spec dex_solutions_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_solution_dto:openapi_dex_solution_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_solutions_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/solutions/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Statss (current)
%% Gets statss.
-spec dex_statss_(current)(ctx:ctx()) -> {ok, [openapi_dex_stats_dto:openapi_dex_stats_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_statss_(current)(Ctx) ->
    dex_statss_(current)(Ctx, #{}).

-spec dex_statss_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_stats_dto:openapi_dex_stats_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_statss_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/statss/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Tokens (current)
%% Gets tokens.
-spec dex_tokens_(current)(ctx:ctx()) -> {ok, [openapi_dex_token_dto:openapi_dex_token_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_tokens_(current)(Ctx) ->
    dex_tokens_(current)(Ctx, #{}).

-spec dex_tokens_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_token_dto:openapi_dex_token_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_tokens_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/tokens/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Trades (current)
%% Gets trades.
-spec dex_trades_(current)(ctx:ctx()) -> {ok, [openapi_dex_trade_dto:openapi_dex_trade_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_trades_(current)(Ctx) ->
    dex_trades_(current)(Ctx, #{}).

-spec dex_trades_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_trade_dto:openapi_dex_trade_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_trades_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/trades/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Users (current)
%% Gets users.
-spec dex_users_(current)(ctx:ctx()) -> {ok, [openapi_dex_user_dto:openapi_dex_user_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_users_(current)(Ctx) ->
    dex_users_(current)(Ctx, #{}).

-spec dex_users_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_user_dto:openapi_dex_user_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_users_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/users/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc WithdrawRequests (current)
%% Gets withdrawRequests.
-spec dex_withdraw_requests_(current)(ctx:ctx()) -> {ok, [openapi_dex_withdraw_request_dto:openapi_dex_withdraw_request_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_withdraw_requests_(current)(Ctx) ->
    dex_withdraw_requests_(current)(Ctx, #{}).

-spec dex_withdraw_requests_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_withdraw_request_dto:openapi_dex_withdraw_request_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_withdraw_requests_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/withdrawRequests/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Withdraws (current)
%% Gets withdraws.
-spec dex_withdraws_(current)(ctx:ctx()) -> {ok, [openapi_dex_withdraw_dto:openapi_dex_withdraw_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_withdraws_(current)(Ctx) ->
    dex_withdraws_(current)(Ctx, #{}).

-spec dex_withdraws_(current)(ctx:ctx(), maps:map()) -> {ok, [openapi_dex_withdraw_dto:openapi_dex_withdraw_dto()], openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
dex_withdraws_(current)(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(kuberl, config, #{})),

    Method = get,
    Path = [<<"/dapps/dex/withdraws/current">>],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, [?BASE_URL, Path], QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


