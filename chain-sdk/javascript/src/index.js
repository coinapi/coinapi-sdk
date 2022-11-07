/**
 * OnChain API
 *  This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from './ApiClient';
import NumericsBigInteger from './model/NumericsBigInteger';
import SushiswapBundleDTO from './model/SushiswapBundleDTO';
import SushiswapBurnDTO from './model/SushiswapBurnDTO';
import SushiswapDayDataDTO from './model/SushiswapDayDataDTO';
import SushiswapFactoryDTO from './model/SushiswapFactoryDTO';
import SushiswapHourDataDTO from './model/SushiswapHourDataDTO';
import SushiswapLiquidityPositionDTO from './model/SushiswapLiquidityPositionDTO';
import SushiswapLiquidityPositionSnapshotDTO from './model/SushiswapLiquidityPositionSnapshotDTO';
import SushiswapMintDTO from './model/SushiswapMintDTO';
import SushiswapPairDTO from './model/SushiswapPairDTO';
import SushiswapPairDayDataDTO from './model/SushiswapPairDayDataDTO';
import SushiswapPairHourDataDTO from './model/SushiswapPairHourDataDTO';
import SushiswapSwapDTO from './model/SushiswapSwapDTO';
import SushiswapTokenDTO from './model/SushiswapTokenDTO';
import SushiswapTokenDayDataDTO from './model/SushiswapTokenDayDataDTO';
import SushiswapTransactionDTO from './model/SushiswapTransactionDTO';
import SushiswapUserDTO from './model/SushiswapUserDTO';
import TransactionsETradeAggressiveSide from './model/TransactionsETradeAggressiveSide';
import UniswapV2PairV2DTO from './model/UniswapV2PairV2DTO';
import UniswapV2SwapV2DTO from './model/UniswapV2SwapV2DTO';
import UniswapV2TokenV2DTO from './model/UniswapV2TokenV2DTO';
import UniswapV3BundleV3DTO from './model/UniswapV3BundleV3DTO';
import UniswapV3BurnV3DTO from './model/UniswapV3BurnV3DTO';
import UniswapV3FactoryV3DTO from './model/UniswapV3FactoryV3DTO';
import UniswapV3MintV3DTO from './model/UniswapV3MintV3DTO';
import UniswapV3PoolDayDataV3DTO from './model/UniswapV3PoolDayDataV3DTO';
import UniswapV3PoolHourDataV3DTO from './model/UniswapV3PoolHourDataV3DTO';
import UniswapV3PoolV3DTO from './model/UniswapV3PoolV3DTO';
import UniswapV3PositionSnapshotV3DTO from './model/UniswapV3PositionSnapshotV3DTO';
import UniswapV3PositionV3DTO from './model/UniswapV3PositionV3DTO';
import UniswapV3SwapV3DTO from './model/UniswapV3SwapV3DTO';
import UniswapV3TickDayDataV3DTO from './model/UniswapV3TickDayDataV3DTO';
import UniswapV3TickV3DTO from './model/UniswapV3TickV3DTO';
import UniswapV3TokenHourDataV3DTO from './model/UniswapV3TokenHourDataV3DTO';
import UniswapV3TokenV3DTO from './model/UniswapV3TokenV3DTO';
import UniswapV3TokenV3DayDataDTO from './model/UniswapV3TokenV3DayDataDTO';
import UniswapV3UniswapDayDataV3DTO from './model/UniswapV3UniswapDayDataV3DTO';
import CowApi from './api/CowApi';
import CurveApi from './api/CurveApi';
import DexApi from './api/DexApi';
import SushiswapApi from './api/SushiswapApi';
import UniswapV2Api from './api/UniswapV2Api';
import UniswapV3Api from './api/UniswapV3Api';


/**
*  This section will provide necessary information about the &#x60;OnChain API&#x60; protocol.  &lt;br/&gt;&lt;br/&gt; Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry&#39;s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             .<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var OnChainApi = require('index'); // See note below*.
* var xxxSvc = new OnChainApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new OnChainApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new OnChainApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new OnChainApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version v1
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The NumericsBigInteger model constructor.
     * @property {module:model/NumericsBigInteger}
     */
    NumericsBigInteger,

    /**
     * The SushiswapBundleDTO model constructor.
     * @property {module:model/SushiswapBundleDTO}
     */
    SushiswapBundleDTO,

    /**
     * The SushiswapBurnDTO model constructor.
     * @property {module:model/SushiswapBurnDTO}
     */
    SushiswapBurnDTO,

    /**
     * The SushiswapDayDataDTO model constructor.
     * @property {module:model/SushiswapDayDataDTO}
     */
    SushiswapDayDataDTO,

    /**
     * The SushiswapFactoryDTO model constructor.
     * @property {module:model/SushiswapFactoryDTO}
     */
    SushiswapFactoryDTO,

    /**
     * The SushiswapHourDataDTO model constructor.
     * @property {module:model/SushiswapHourDataDTO}
     */
    SushiswapHourDataDTO,

    /**
     * The SushiswapLiquidityPositionDTO model constructor.
     * @property {module:model/SushiswapLiquidityPositionDTO}
     */
    SushiswapLiquidityPositionDTO,

    /**
     * The SushiswapLiquidityPositionSnapshotDTO model constructor.
     * @property {module:model/SushiswapLiquidityPositionSnapshotDTO}
     */
    SushiswapLiquidityPositionSnapshotDTO,

    /**
     * The SushiswapMintDTO model constructor.
     * @property {module:model/SushiswapMintDTO}
     */
    SushiswapMintDTO,

    /**
     * The SushiswapPairDTO model constructor.
     * @property {module:model/SushiswapPairDTO}
     */
    SushiswapPairDTO,

    /**
     * The SushiswapPairDayDataDTO model constructor.
     * @property {module:model/SushiswapPairDayDataDTO}
     */
    SushiswapPairDayDataDTO,

    /**
     * The SushiswapPairHourDataDTO model constructor.
     * @property {module:model/SushiswapPairHourDataDTO}
     */
    SushiswapPairHourDataDTO,

    /**
     * The SushiswapSwapDTO model constructor.
     * @property {module:model/SushiswapSwapDTO}
     */
    SushiswapSwapDTO,

    /**
     * The SushiswapTokenDTO model constructor.
     * @property {module:model/SushiswapTokenDTO}
     */
    SushiswapTokenDTO,

    /**
     * The SushiswapTokenDayDataDTO model constructor.
     * @property {module:model/SushiswapTokenDayDataDTO}
     */
    SushiswapTokenDayDataDTO,

    /**
     * The SushiswapTransactionDTO model constructor.
     * @property {module:model/SushiswapTransactionDTO}
     */
    SushiswapTransactionDTO,

    /**
     * The SushiswapUserDTO model constructor.
     * @property {module:model/SushiswapUserDTO}
     */
    SushiswapUserDTO,

    /**
     * The TransactionsETradeAggressiveSide model constructor.
     * @property {module:model/TransactionsETradeAggressiveSide}
     */
    TransactionsETradeAggressiveSide,

    /**
     * The UniswapV2PairV2DTO model constructor.
     * @property {module:model/UniswapV2PairV2DTO}
     */
    UniswapV2PairV2DTO,

    /**
     * The UniswapV2SwapV2DTO model constructor.
     * @property {module:model/UniswapV2SwapV2DTO}
     */
    UniswapV2SwapV2DTO,

    /**
     * The UniswapV2TokenV2DTO model constructor.
     * @property {module:model/UniswapV2TokenV2DTO}
     */
    UniswapV2TokenV2DTO,

    /**
     * The UniswapV3BundleV3DTO model constructor.
     * @property {module:model/UniswapV3BundleV3DTO}
     */
    UniswapV3BundleV3DTO,

    /**
     * The UniswapV3BurnV3DTO model constructor.
     * @property {module:model/UniswapV3BurnV3DTO}
     */
    UniswapV3BurnV3DTO,

    /**
     * The UniswapV3FactoryV3DTO model constructor.
     * @property {module:model/UniswapV3FactoryV3DTO}
     */
    UniswapV3FactoryV3DTO,

    /**
     * The UniswapV3MintV3DTO model constructor.
     * @property {module:model/UniswapV3MintV3DTO}
     */
    UniswapV3MintV3DTO,

    /**
     * The UniswapV3PoolDayDataV3DTO model constructor.
     * @property {module:model/UniswapV3PoolDayDataV3DTO}
     */
    UniswapV3PoolDayDataV3DTO,

    /**
     * The UniswapV3PoolHourDataV3DTO model constructor.
     * @property {module:model/UniswapV3PoolHourDataV3DTO}
     */
    UniswapV3PoolHourDataV3DTO,

    /**
     * The UniswapV3PoolV3DTO model constructor.
     * @property {module:model/UniswapV3PoolV3DTO}
     */
    UniswapV3PoolV3DTO,

    /**
     * The UniswapV3PositionSnapshotV3DTO model constructor.
     * @property {module:model/UniswapV3PositionSnapshotV3DTO}
     */
    UniswapV3PositionSnapshotV3DTO,

    /**
     * The UniswapV3PositionV3DTO model constructor.
     * @property {module:model/UniswapV3PositionV3DTO}
     */
    UniswapV3PositionV3DTO,

    /**
     * The UniswapV3SwapV3DTO model constructor.
     * @property {module:model/UniswapV3SwapV3DTO}
     */
    UniswapV3SwapV3DTO,

    /**
     * The UniswapV3TickDayDataV3DTO model constructor.
     * @property {module:model/UniswapV3TickDayDataV3DTO}
     */
    UniswapV3TickDayDataV3DTO,

    /**
     * The UniswapV3TickV3DTO model constructor.
     * @property {module:model/UniswapV3TickV3DTO}
     */
    UniswapV3TickV3DTO,

    /**
     * The UniswapV3TokenHourDataV3DTO model constructor.
     * @property {module:model/UniswapV3TokenHourDataV3DTO}
     */
    UniswapV3TokenHourDataV3DTO,

    /**
     * The UniswapV3TokenV3DTO model constructor.
     * @property {module:model/UniswapV3TokenV3DTO}
     */
    UniswapV3TokenV3DTO,

    /**
     * The UniswapV3TokenV3DayDataDTO model constructor.
     * @property {module:model/UniswapV3TokenV3DayDataDTO}
     */
    UniswapV3TokenV3DayDataDTO,

    /**
     * The UniswapV3UniswapDayDataV3DTO model constructor.
     * @property {module:model/UniswapV3UniswapDayDataV3DTO}
     */
    UniswapV3UniswapDayDataV3DTO,

    /**
    * The CowApi service constructor.
    * @property {module:api/CowApi}
    */
    CowApi,

    /**
    * The CurveApi service constructor.
    * @property {module:api/CurveApi}
    */
    CurveApi,

    /**
    * The DexApi service constructor.
    * @property {module:api/DexApi}
    */
    DexApi,

    /**
    * The SushiswapApi service constructor.
    * @property {module:api/SushiswapApi}
    */
    SushiswapApi,

    /**
    * The UniswapV2Api service constructor.
    * @property {module:api/UniswapV2Api}
    */
    UniswapV2Api,

    /**
    * The UniswapV3Api service constructor.
    * @property {module:api/UniswapV3Api}
    */
    UniswapV3Api
};
