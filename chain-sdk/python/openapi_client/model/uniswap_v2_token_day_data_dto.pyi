# coding: utf-8

"""
    On Chain Dapps - REST API

     This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                               # noqa: E501

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


class UniswapV2TokenDayDataDTO(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Token data aggregated across all pairs that include token.
    """


    class MetaOapg:
        
        class properties:
            entry_time = schemas.DateTimeSchema
            recv_time = schemas.DateTimeSchema
            block_number = schemas.Int64Schema
            
            
            class id(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'id':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            date = schemas.Int32Schema
            
            
            class token(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'token':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class daily_volume_token(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'daily_volume_token':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class daily_volume_eth(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'daily_volume_eth':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class daily_volume_usd(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'daily_volume_usd':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class daily_txns(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'daily_txns':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_liquidity_token(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_liquidity_token':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_liquidity_eth(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_liquidity_eth':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_liquidity_usd(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_liquidity_usd':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class price_usd(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'price_usd':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            vid = schemas.Int64Schema
            __annotations__ = {
                "entry_time": entry_time,
                "recv_time": recv_time,
                "block_number": block_number,
                "id": id,
                "date": date,
                "token": token,
                "daily_volume_token": daily_volume_token,
                "daily_volume_eth": daily_volume_eth,
                "daily_volume_usd": daily_volume_usd,
                "daily_txns": daily_txns,
                "total_liquidity_token": total_liquidity_token,
                "total_liquidity_eth": total_liquidity_eth,
                "total_liquidity_usd": total_liquidity_usd,
                "price_usd": price_usd,
                "vid": vid,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["entry_time"]) -> MetaOapg.properties.entry_time: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["recv_time"]) -> MetaOapg.properties.recv_time: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["block_number"]) -> MetaOapg.properties.block_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> MetaOapg.properties.date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["token"]) -> MetaOapg.properties.token: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["daily_volume_token"]) -> MetaOapg.properties.daily_volume_token: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["daily_volume_eth"]) -> MetaOapg.properties.daily_volume_eth: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["daily_volume_usd"]) -> MetaOapg.properties.daily_volume_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["daily_txns"]) -> MetaOapg.properties.daily_txns: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_liquidity_token"]) -> MetaOapg.properties.total_liquidity_token: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_liquidity_eth"]) -> MetaOapg.properties.total_liquidity_eth: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_liquidity_usd"]) -> MetaOapg.properties.total_liquidity_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["price_usd"]) -> MetaOapg.properties.price_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["vid"]) -> MetaOapg.properties.vid: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["id"], typing_extensions.Literal["date"], typing_extensions.Literal["token"], typing_extensions.Literal["daily_volume_token"], typing_extensions.Literal["daily_volume_eth"], typing_extensions.Literal["daily_volume_usd"], typing_extensions.Literal["daily_txns"], typing_extensions.Literal["total_liquidity_token"], typing_extensions.Literal["total_liquidity_eth"], typing_extensions.Literal["total_liquidity_usd"], typing_extensions.Literal["price_usd"], typing_extensions.Literal["vid"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["entry_time"]) -> typing.Union[MetaOapg.properties.entry_time, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["recv_time"]) -> typing.Union[MetaOapg.properties.recv_time, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["block_number"]) -> typing.Union[MetaOapg.properties.block_number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date"]) -> typing.Union[MetaOapg.properties.date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["token"]) -> typing.Union[MetaOapg.properties.token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["daily_volume_token"]) -> typing.Union[MetaOapg.properties.daily_volume_token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["daily_volume_eth"]) -> typing.Union[MetaOapg.properties.daily_volume_eth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["daily_volume_usd"]) -> typing.Union[MetaOapg.properties.daily_volume_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["daily_txns"]) -> typing.Union[MetaOapg.properties.daily_txns, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_liquidity_token"]) -> typing.Union[MetaOapg.properties.total_liquidity_token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_liquidity_eth"]) -> typing.Union[MetaOapg.properties.total_liquidity_eth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_liquidity_usd"]) -> typing.Union[MetaOapg.properties.total_liquidity_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["price_usd"]) -> typing.Union[MetaOapg.properties.price_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["vid"]) -> typing.Union[MetaOapg.properties.vid, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["id"], typing_extensions.Literal["date"], typing_extensions.Literal["token"], typing_extensions.Literal["daily_volume_token"], typing_extensions.Literal["daily_volume_eth"], typing_extensions.Literal["daily_volume_usd"], typing_extensions.Literal["daily_txns"], typing_extensions.Literal["total_liquidity_token"], typing_extensions.Literal["total_liquidity_eth"], typing_extensions.Literal["total_liquidity_usd"], typing_extensions.Literal["price_usd"], typing_extensions.Literal["vid"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        entry_time: typing.Union[MetaOapg.properties.entry_time, str, datetime, schemas.Unset] = schemas.unset,
        recv_time: typing.Union[MetaOapg.properties.recv_time, str, datetime, schemas.Unset] = schemas.unset,
        block_number: typing.Union[MetaOapg.properties.block_number, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        id: typing.Union[MetaOapg.properties.id, None, str, schemas.Unset] = schemas.unset,
        date: typing.Union[MetaOapg.properties.date, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        token: typing.Union[MetaOapg.properties.token, None, str, schemas.Unset] = schemas.unset,
        daily_volume_token: typing.Union[MetaOapg.properties.daily_volume_token, None, str, schemas.Unset] = schemas.unset,
        daily_volume_eth: typing.Union[MetaOapg.properties.daily_volume_eth, None, str, schemas.Unset] = schemas.unset,
        daily_volume_usd: typing.Union[MetaOapg.properties.daily_volume_usd, None, str, schemas.Unset] = schemas.unset,
        daily_txns: typing.Union[MetaOapg.properties.daily_txns, None, str, schemas.Unset] = schemas.unset,
        total_liquidity_token: typing.Union[MetaOapg.properties.total_liquidity_token, None, str, schemas.Unset] = schemas.unset,
        total_liquidity_eth: typing.Union[MetaOapg.properties.total_liquidity_eth, None, str, schemas.Unset] = schemas.unset,
        total_liquidity_usd: typing.Union[MetaOapg.properties.total_liquidity_usd, None, str, schemas.Unset] = schemas.unset,
        price_usd: typing.Union[MetaOapg.properties.price_usd, None, str, schemas.Unset] = schemas.unset,
        vid: typing.Union[MetaOapg.properties.vid, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'UniswapV2TokenDayDataDTO':
        return super().__new__(
            cls,
            *args,
            entry_time=entry_time,
            recv_time=recv_time,
            block_number=block_number,
            id=id,
            date=date,
            token=token,
            daily_volume_token=daily_volume_token,
            daily_volume_eth=daily_volume_eth,
            daily_volume_usd=daily_volume_usd,
            daily_txns=daily_txns,
            total_liquidity_token=total_liquidity_token,
            total_liquidity_eth=total_liquidity_eth,
            total_liquidity_usd=total_liquidity_usd,
            price_usd=price_usd,
            vid=vid,
            _configuration=_configuration,
        )
