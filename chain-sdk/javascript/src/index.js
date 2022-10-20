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
import BigInteger from './model/BigInteger';
import BundleV3DTO from './model/BundleV3DTO';
import BurnV3DTO from './model/BurnV3DTO';
import ETradeAggressiveSide from './model/ETradeAggressiveSide';
import FactoryV3DTO from './model/FactoryV3DTO';
import MintV3DTO from './model/MintV3DTO';
import PairDTO from './model/PairDTO';
import PairV2DTO from './model/PairV2DTO';
import PoolDayDataV3DTO from './model/PoolDayDataV3DTO';
import PoolHourDataV3DTO from './model/PoolHourDataV3DTO';
import PoolV3DTO from './model/PoolV3DTO';
import PositionSnapshotV3DTO from './model/PositionSnapshotV3DTO';
import PositionV3DTO from './model/PositionV3DTO';
import SwapDTO from './model/SwapDTO';
import SwapV2DTO from './model/SwapV2DTO';
import SwapV3DTO from './model/SwapV3DTO';
import TickDayDataV3DTO from './model/TickDayDataV3DTO';
import TickV3DTO from './model/TickV3DTO';
import TokenDTO from './model/TokenDTO';
import TokenHourDataV3DTO from './model/TokenHourDataV3DTO';
import TokenV2DTO from './model/TokenV2DTO';
import TokenV3DTO from './model/TokenV3DTO';
import TokenV3DayDataDTO from './model/TokenV3DayDataDTO';
import UniswapDayDataV3DTO from './model/UniswapDayDataV3DTO';
import BundlesApi from './api/BundlesApi';
import BurnsApi from './api/BurnsApi';
import FactoryApi from './api/FactoryApi';
import MintsApi from './api/MintsApi';
import PoiApi from './api/PoiApi';
import PoolDayDataApi from './api/PoolDayDataApi';
import PoolHourDataApi from './api/PoolHourDataApi';
import PoolsApi from './api/PoolsApi';
import SushiswapApi from './api/SushiswapApi';
import SwapsApi from './api/SwapsApi';
import TokensApi from './api/TokensApi';
import TradesApi from './api/TradesApi';
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
     * The BigInteger model constructor.
     * @property {module:model/BigInteger}
     */
    BigInteger,

    /**
     * The BundleV3DTO model constructor.
     * @property {module:model/BundleV3DTO}
     */
    BundleV3DTO,

    /**
     * The BurnV3DTO model constructor.
     * @property {module:model/BurnV3DTO}
     */
    BurnV3DTO,

    /**
     * The ETradeAggressiveSide model constructor.
     * @property {module:model/ETradeAggressiveSide}
     */
    ETradeAggressiveSide,

    /**
     * The FactoryV3DTO model constructor.
     * @property {module:model/FactoryV3DTO}
     */
    FactoryV3DTO,

    /**
     * The MintV3DTO model constructor.
     * @property {module:model/MintV3DTO}
     */
    MintV3DTO,

    /**
     * The PairDTO model constructor.
     * @property {module:model/PairDTO}
     */
    PairDTO,

    /**
     * The PairV2DTO model constructor.
     * @property {module:model/PairV2DTO}
     */
    PairV2DTO,

    /**
     * The PoolDayDataV3DTO model constructor.
     * @property {module:model/PoolDayDataV3DTO}
     */
    PoolDayDataV3DTO,

    /**
     * The PoolHourDataV3DTO model constructor.
     * @property {module:model/PoolHourDataV3DTO}
     */
    PoolHourDataV3DTO,

    /**
     * The PoolV3DTO model constructor.
     * @property {module:model/PoolV3DTO}
     */
    PoolV3DTO,

    /**
     * The PositionSnapshotV3DTO model constructor.
     * @property {module:model/PositionSnapshotV3DTO}
     */
    PositionSnapshotV3DTO,

    /**
     * The PositionV3DTO model constructor.
     * @property {module:model/PositionV3DTO}
     */
    PositionV3DTO,

    /**
     * The SwapDTO model constructor.
     * @property {module:model/SwapDTO}
     */
    SwapDTO,

    /**
     * The SwapV2DTO model constructor.
     * @property {module:model/SwapV2DTO}
     */
    SwapV2DTO,

    /**
     * The SwapV3DTO model constructor.
     * @property {module:model/SwapV3DTO}
     */
    SwapV3DTO,

    /**
     * The TickDayDataV3DTO model constructor.
     * @property {module:model/TickDayDataV3DTO}
     */
    TickDayDataV3DTO,

    /**
     * The TickV3DTO model constructor.
     * @property {module:model/TickV3DTO}
     */
    TickV3DTO,

    /**
     * The TokenDTO model constructor.
     * @property {module:model/TokenDTO}
     */
    TokenDTO,

    /**
     * The TokenHourDataV3DTO model constructor.
     * @property {module:model/TokenHourDataV3DTO}
     */
    TokenHourDataV3DTO,

    /**
     * The TokenV2DTO model constructor.
     * @property {module:model/TokenV2DTO}
     */
    TokenV2DTO,

    /**
     * The TokenV3DTO model constructor.
     * @property {module:model/TokenV3DTO}
     */
    TokenV3DTO,

    /**
     * The TokenV3DayDataDTO model constructor.
     * @property {module:model/TokenV3DayDataDTO}
     */
    TokenV3DayDataDTO,

    /**
     * The UniswapDayDataV3DTO model constructor.
     * @property {module:model/UniswapDayDataV3DTO}
     */
    UniswapDayDataV3DTO,

    /**
    * The BundlesApi service constructor.
    * @property {module:api/BundlesApi}
    */
    BundlesApi,

    /**
    * The BurnsApi service constructor.
    * @property {module:api/BurnsApi}
    */
    BurnsApi,

    /**
    * The FactoryApi service constructor.
    * @property {module:api/FactoryApi}
    */
    FactoryApi,

    /**
    * The MintsApi service constructor.
    * @property {module:api/MintsApi}
    */
    MintsApi,

    /**
    * The PoiApi service constructor.
    * @property {module:api/PoiApi}
    */
    PoiApi,

    /**
    * The PoolDayDataApi service constructor.
    * @property {module:api/PoolDayDataApi}
    */
    PoolDayDataApi,

    /**
    * The PoolHourDataApi service constructor.
    * @property {module:api/PoolHourDataApi}
    */
    PoolHourDataApi,

    /**
    * The PoolsApi service constructor.
    * @property {module:api/PoolsApi}
    */
    PoolsApi,

    /**
    * The SushiswapApi service constructor.
    * @property {module:api/SushiswapApi}
    */
    SushiswapApi,

    /**
    * The SwapsApi service constructor.
    * @property {module:api/SwapsApi}
    */
    SwapsApi,

    /**
    * The TokensApi service constructor.
    * @property {module:api/TokensApi}
    */
    TokensApi,

    /**
    * The TradesApi service constructor.
    * @property {module:api/TradesApi}
    */
    TradesApi,

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
