# coding: utf-8

"""
    EMS - REST API

    This section will provide necessary information about the `CoinAPI EMS REST API` protocol. <br/> This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       <br/><br/> Implemented Standards:    * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)   * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)   * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)     ### Endpoints <table>   <thead>     <tr>       <th>Deployment method</th>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Managed Cloud</td>       <td>Production</td>       <td>Use <a href=\"#ems-docs-sh\">Managed Cloud REST API /v1/locations</a> to get specific endpoints to each server site where your deployments span</td>     </tr>     <tr>       <td>Managed Cloud</td>       <td>Sandbox</td>       <td><code>https://ems-gateway-aws-eu-central-1-dev.coinapi.io/</code></td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Production</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>     <tr>       <td>Self Hosted</td>       <td>Sandbox</td>       <td>IP Address of the <code>ems-gateway</code> container/excecutable in the closest server site to the caller location</td>     </tr>   </tbody> </table>  ### Authentication If the software is deployed as `Self-Hosted` then API do not require authentication as inside your infrastructure, your company is responsible for the security and access controls.  <br/><br/> If the software is deployed in our `Managed Cloud`, there are 2 methods for authenticating with us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key` with the API Key  2. Query string parameter named `apikey` with the API Key  3. <a href=\"#certificate\">TLS Client Certificate</a> from the `Managed Cloud REST API` (/v1/certificate/pem endpoint) while establishing a TLS session with us.  #### Custom authorization header You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY` <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside> #### Query string authorization parameter You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request. Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all balances, then your query string should look like this:  <br/><br/> `GET /v1/balances?apikey=73034021-THIS-IS-SAMPLE-KEY` <aside class=\"notice\">Query string method may be more practical for development activities.</aside>   # noqa: E501

    The version of the OpenAPI document: v1
    Contact: support@coinapi.io
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from openapi_client import schemas  # noqa: F401


class Balance(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
            exchange_id = schemas.StrSchema
            
            
            class data(
                schemas.ListSchema
            ):
            
            
                class MetaOapg:
                    
                    
                    class items(
                        schemas.DictSchema
                    ):
                    
                    
                        class MetaOapg:
                            
                            class properties:
                                asset_id_exchange = schemas.StrSchema
                                asset_id_coinapi = schemas.StrSchema
                                balance = schemas.Float64Schema
                                available = schemas.Float64Schema
                                locked = schemas.Float64Schema
                                
                                
                                class last_updated_by(
                                    schemas.EnumBase,
                                    schemas.StrSchema
                                ):
                                    
                                    @schemas.classproperty
                                    def INITIALIZATION(cls):
                                        return cls("INITIALIZATION")
                                    
                                    @schemas.classproperty
                                    def BALANCE_MANAGER(cls):
                                        return cls("BALANCE_MANAGER")
                                    
                                    @schemas.classproperty
                                    def EXCHANGE(cls):
                                        return cls("EXCHANGE")
                                rate_usd = schemas.Float64Schema
                                traded = schemas.Float64Schema
                                __annotations__ = {
                                    "asset_id_exchange": asset_id_exchange,
                                    "asset_id_coinapi": asset_id_coinapi,
                                    "balance": balance,
                                    "available": available,
                                    "locked": locked,
                                    "last_updated_by": last_updated_by,
                                    "rate_usd": rate_usd,
                                    "traded": traded,
                                }
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["asset_id_exchange"]) -> MetaOapg.properties.asset_id_exchange: ...
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["asset_id_coinapi"]) -> MetaOapg.properties.asset_id_coinapi: ...
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["balance"]) -> MetaOapg.properties.balance: ...
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["available"]) -> MetaOapg.properties.available: ...
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["locked"]) -> MetaOapg.properties.locked: ...
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["last_updated_by"]) -> MetaOapg.properties.last_updated_by: ...
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["rate_usd"]) -> MetaOapg.properties.rate_usd: ...
                        
                        @typing.overload
                        def __getitem__(self, name: typing_extensions.Literal["traded"]) -> MetaOapg.properties.traded: ...
                        
                        @typing.overload
                        def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
                        
                        def __getitem__(self, name: typing.Union[typing_extensions.Literal["asset_id_exchange", "asset_id_coinapi", "balance", "available", "locked", "last_updated_by", "rate_usd", "traded", ], str]):
                            # dict_instance[name] accessor
                            return super().__getitem__(name)
                        
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["asset_id_exchange"]) -> typing.Union[MetaOapg.properties.asset_id_exchange, schemas.Unset]: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["asset_id_coinapi"]) -> typing.Union[MetaOapg.properties.asset_id_coinapi, schemas.Unset]: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["balance"]) -> typing.Union[MetaOapg.properties.balance, schemas.Unset]: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["available"]) -> typing.Union[MetaOapg.properties.available, schemas.Unset]: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["locked"]) -> typing.Union[MetaOapg.properties.locked, schemas.Unset]: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["last_updated_by"]) -> typing.Union[MetaOapg.properties.last_updated_by, schemas.Unset]: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["rate_usd"]) -> typing.Union[MetaOapg.properties.rate_usd, schemas.Unset]: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: typing_extensions.Literal["traded"]) -> typing.Union[MetaOapg.properties.traded, schemas.Unset]: ...
                        
                        @typing.overload
                        def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
                        
                        def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["asset_id_exchange", "asset_id_coinapi", "balance", "available", "locked", "last_updated_by", "rate_usd", "traded", ], str]):
                            return super().get_item_oapg(name)
                        
                    
                        def __new__(
                            cls,
                            *args: typing.Union[dict, frozendict.frozendict, ],
                            asset_id_exchange: typing.Union[MetaOapg.properties.asset_id_exchange, str, schemas.Unset] = schemas.unset,
                            asset_id_coinapi: typing.Union[MetaOapg.properties.asset_id_coinapi, str, schemas.Unset] = schemas.unset,
                            balance: typing.Union[MetaOapg.properties.balance, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
                            available: typing.Union[MetaOapg.properties.available, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
                            locked: typing.Union[MetaOapg.properties.locked, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
                            last_updated_by: typing.Union[MetaOapg.properties.last_updated_by, str, schemas.Unset] = schemas.unset,
                            rate_usd: typing.Union[MetaOapg.properties.rate_usd, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
                            traded: typing.Union[MetaOapg.properties.traded, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
                            _configuration: typing.Optional[schemas.Configuration] = None,
                            **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                        ) -> 'items':
                            return super().__new__(
                                cls,
                                *args,
                                asset_id_exchange=asset_id_exchange,
                                asset_id_coinapi=asset_id_coinapi,
                                balance=balance,
                                available=available,
                                locked=locked,
                                last_updated_by=last_updated_by,
                                rate_usd=rate_usd,
                                traded=traded,
                                _configuration=_configuration,
                                **kwargs,
                            )
            
                def __new__(
                    cls,
                    arg: typing.Union[typing.Tuple[typing.Union[MetaOapg.items, dict, frozendict.frozendict, ]], typing.List[typing.Union[MetaOapg.items, dict, frozendict.frozendict, ]]],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'data':
                    return super().__new__(
                        cls,
                        arg,
                        _configuration=_configuration,
                    )
            
                def __getitem__(self, i: int) -> MetaOapg.items:
                    return super().__getitem__(i)
            __annotations__ = {
                "exchange_id": exchange_id,
                "data": data,
            }
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["exchange_id"]) -> MetaOapg.properties.exchange_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["data"]) -> MetaOapg.properties.data: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["exchange_id", "data", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["exchange_id"]) -> typing.Union[MetaOapg.properties.exchange_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["data"]) -> typing.Union[MetaOapg.properties.data, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["exchange_id", "data", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        exchange_id: typing.Union[MetaOapg.properties.exchange_id, str, schemas.Unset] = schemas.unset,
        data: typing.Union[MetaOapg.properties.data, list, tuple, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'Balance':
        return super().__new__(
            cls,
            *args,
            exchange_id=exchange_id,
            data=data,
            _configuration=_configuration,
            **kwargs,
        )