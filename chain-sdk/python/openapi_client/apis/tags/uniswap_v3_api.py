# coding: utf-8

"""
    OnChain API

     This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                               # noqa: E501

    The version of the OpenAPI document: v1
    Contact: support@coinapi.io
    Generated by: https://openapi-generator.tech
"""

from openapi_client.paths.dapps_uniswapv3_bundles_current.get import UniswapV3GetBundlesCurrent
from openapi_client.paths.dapps_uniswapv3_bundles_historical_manual.get import UniswapV3GetBundlesHistorical
from openapi_client.paths.dapps_uniswapv3_burns_current.get import UniswapV3GetBurnsCurrent
from openapi_client.paths.dapps_uniswapv3_burns_historical_manual.get import UniswapV3GetBurnsHistorical
from openapi_client.paths.dapps_uniswapv3_day_data_current.get import UniswapV3GetDayDataCurrent
from openapi_client.paths.dapps_uniswapv3_day_data_historical_manual.get import UniswapV3GetDayDataHistorical
from openapi_client.paths.dapps_uniswapv3_factory_current.get import UniswapV3GetFactoryCurrent
from openapi_client.paths.dapps_uniswapv3_factory_historical_manual.get import UniswapV3GetFactoryHistorical
from openapi_client.paths.dapps_uniswapv3_mints_current.get import UniswapV3GetMintsCurrent
from openapi_client.paths.dapps_uniswapv3_mints_historical_manual.get import UniswapV3GetMintsHistorical
from openapi_client.paths.dapps_uniswapv3_pools_current.get import UniswapV3GetPoolsCurrent
from openapi_client.paths.dapps_uniswapv3_pools_historical_manual.get import UniswapV3GetPoolsHistorical
from openapi_client.paths.dapps_uniswapv3_pools_day_data_current.get import UniswapV3GetPoolsDayDataCurrent
from openapi_client.paths.dapps_uniswapv3_pools_day_data_historical_manual.get import UniswapV3GetPoolsDayDataHistorical
from openapi_client.paths.dapps_uniswapv3_pools_hour_data_current.get import UniswapV3GetPoolsHourDataCurrent
from openapi_client.paths.dapps_uniswapv3_pools_hour_data_historical_manual.get import UniswapV3GetPoolsHourDataHistorical
from openapi_client.paths.dapps_uniswapv3_positions_current.get import UniswapV3GetPositionsCurrent
from openapi_client.paths.dapps_uniswapv3_positions_historical_manual.get import UniswapV3GetPositionsHistorical
from openapi_client.paths.dapps_uniswapv3_positions_snapshots_historical_manual.get import UniswapV3GetPositionsSnaphotsHistorical
from openapi_client.paths.dapps_uniswapv3_position_snapshots_current.get import UniswapV3GetPositionsSnapshotsCurrent
from openapi_client.paths.dapps_uniswapv3_swaps_current.get import UniswapV3GetSwapsCurrent
from openapi_client.paths.dapps_uniswapv3_swaps_historical_manual.get import UniswapV3GetSwapsHistorical
from openapi_client.paths.dapps_uniswapv3_ticks_current.get import UniswapV3GetTicksCurrent
from openapi_client.paths.dapps_uniswapv3_ticks_historical_manual.get import UniswapV3GetTicksHistorical
from openapi_client.paths.dapps_uniswapv3_ticks_day_data_current.get import UniswapV3GetTicksDayDataCurrent
from openapi_client.paths.dapps_uniswapv3_ticks_day_data_historical_manual.get import UniswapV3GetTicksDayDataHistorical
from openapi_client.paths.dapps_uniswapv3_tokens_current.get import UniswapV3GetTokensCurrent
from openapi_client.paths.dapps_uniswapv3_tokens_historical_manual.get import UniswapV3GetTokensHistorical
from openapi_client.paths.dapps_uniswapv3_tokens_day_data_current.get import UniswapV3GetTokensDayDataCurrent
from openapi_client.paths.dapps_uniswapv3_tokens_day_data_historical_manual.get import UniswapV3GetTokensDayDataHistorical
from openapi_client.paths.dapps_uniswapv3_tokens_hour_data_current.get import UniswapV3GetTokensHourDataCurrent
from openapi_client.paths.dapps_uniswapv3_tokens_hour_data_historical_manual.get import UniswapV3GetTokensHourDataHistorical
from openapi_client.paths.dapps_uniswapv3_transactions_historical_manual.get import UniswapV3GetTransactionsHistorical


class UniswapV3Api(
    UniswapV3GetBundlesCurrent,
    UniswapV3GetBundlesHistorical,
    UniswapV3GetBurnsCurrent,
    UniswapV3GetBurnsHistorical,
    UniswapV3GetDayDataCurrent,
    UniswapV3GetDayDataHistorical,
    UniswapV3GetFactoryCurrent,
    UniswapV3GetFactoryHistorical,
    UniswapV3GetMintsCurrent,
    UniswapV3GetMintsHistorical,
    UniswapV3GetPoolsCurrent,
    UniswapV3GetPoolsHistorical,
    UniswapV3GetPoolsDayDataCurrent,
    UniswapV3GetPoolsDayDataHistorical,
    UniswapV3GetPoolsHourDataCurrent,
    UniswapV3GetPoolsHourDataHistorical,
    UniswapV3GetPositionsCurrent,
    UniswapV3GetPositionsHistorical,
    UniswapV3GetPositionsSnaphotsHistorical,
    UniswapV3GetPositionsSnapshotsCurrent,
    UniswapV3GetSwapsCurrent,
    UniswapV3GetSwapsHistorical,
    UniswapV3GetTicksCurrent,
    UniswapV3GetTicksHistorical,
    UniswapV3GetTicksDayDataCurrent,
    UniswapV3GetTicksDayDataHistorical,
    UniswapV3GetTokensCurrent,
    UniswapV3GetTokensHistorical,
    UniswapV3GetTokensDayDataCurrent,
    UniswapV3GetTokensDayDataHistorical,
    UniswapV3GetTokensHourDataCurrent,
    UniswapV3GetTokensHourDataHistorical,
    UniswapV3GetTransactionsHistorical,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
