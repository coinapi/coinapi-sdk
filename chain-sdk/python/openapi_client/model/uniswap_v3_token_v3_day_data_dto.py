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


class UniswapV3TokenV3DayDataDTO(
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
            vid = schemas.Int64Schema
            
            
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
            
            
            class volume(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'volume':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class volume_usd(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'volume_usd':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class untracked_volume_usd(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'untracked_volume_usd':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_value_locked(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_value_locked':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class total_value_locked_usd(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_value_locked_usd':
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
            
            
            class fees_usd(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'fees_usd':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class open(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'open':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class high(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'high':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class low(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'low':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class close(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'close':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "entry_time": entry_time,
                "recv_time": recv_time,
                "block_number": block_number,
                "vid": vid,
                "id": id,
                "date": date,
                "token": token,
                "volume": volume,
                "volume_usd": volume_usd,
                "untracked_volume_usd": untracked_volume_usd,
                "total_value_locked": total_value_locked,
                "total_value_locked_usd": total_value_locked_usd,
                "price_usd": price_usd,
                "fees_usd": fees_usd,
                "open": open,
                "high": high,
                "low": low,
                "close": close,
            }
        additional_properties = schemas.NotAnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["entry_time"]) -> MetaOapg.properties.entry_time: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["recv_time"]) -> MetaOapg.properties.recv_time: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["block_number"]) -> MetaOapg.properties.block_number: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["vid"]) -> MetaOapg.properties.vid: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["date"]) -> MetaOapg.properties.date: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["token"]) -> MetaOapg.properties.token: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["volume"]) -> MetaOapg.properties.volume: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["volume_usd"]) -> MetaOapg.properties.volume_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["untracked_volume_usd"]) -> MetaOapg.properties.untracked_volume_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_value_locked"]) -> MetaOapg.properties.total_value_locked: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_value_locked_usd"]) -> MetaOapg.properties.total_value_locked_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["price_usd"]) -> MetaOapg.properties.price_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["fees_usd"]) -> MetaOapg.properties.fees_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["open"]) -> MetaOapg.properties.open: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["high"]) -> MetaOapg.properties.high: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["low"]) -> MetaOapg.properties.low: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["close"]) -> MetaOapg.properties.close: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["vid"], typing_extensions.Literal["id"], typing_extensions.Literal["date"], typing_extensions.Literal["token"], typing_extensions.Literal["volume"], typing_extensions.Literal["volume_usd"], typing_extensions.Literal["untracked_volume_usd"], typing_extensions.Literal["total_value_locked"], typing_extensions.Literal["total_value_locked_usd"], typing_extensions.Literal["price_usd"], typing_extensions.Literal["fees_usd"], typing_extensions.Literal["open"], typing_extensions.Literal["high"], typing_extensions.Literal["low"], typing_extensions.Literal["close"], ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["entry_time"]) -> typing.Union[MetaOapg.properties.entry_time, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["recv_time"]) -> typing.Union[MetaOapg.properties.recv_time, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["block_number"]) -> typing.Union[MetaOapg.properties.block_number, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["vid"]) -> typing.Union[MetaOapg.properties.vid, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["date"]) -> typing.Union[MetaOapg.properties.date, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["token"]) -> typing.Union[MetaOapg.properties.token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["volume"]) -> typing.Union[MetaOapg.properties.volume, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["volume_usd"]) -> typing.Union[MetaOapg.properties.volume_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["untracked_volume_usd"]) -> typing.Union[MetaOapg.properties.untracked_volume_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_value_locked"]) -> typing.Union[MetaOapg.properties.total_value_locked, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_value_locked_usd"]) -> typing.Union[MetaOapg.properties.total_value_locked_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["price_usd"]) -> typing.Union[MetaOapg.properties.price_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["fees_usd"]) -> typing.Union[MetaOapg.properties.fees_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["open"]) -> typing.Union[MetaOapg.properties.open, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["high"]) -> typing.Union[MetaOapg.properties.high, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["low"]) -> typing.Union[MetaOapg.properties.low, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["close"]) -> typing.Union[MetaOapg.properties.close, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["vid"], typing_extensions.Literal["id"], typing_extensions.Literal["date"], typing_extensions.Literal["token"], typing_extensions.Literal["volume"], typing_extensions.Literal["volume_usd"], typing_extensions.Literal["untracked_volume_usd"], typing_extensions.Literal["total_value_locked"], typing_extensions.Literal["total_value_locked_usd"], typing_extensions.Literal["price_usd"], typing_extensions.Literal["fees_usd"], typing_extensions.Literal["open"], typing_extensions.Literal["high"], typing_extensions.Literal["low"], typing_extensions.Literal["close"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        entry_time: typing.Union[MetaOapg.properties.entry_time, str, datetime, schemas.Unset] = schemas.unset,
        recv_time: typing.Union[MetaOapg.properties.recv_time, str, datetime, schemas.Unset] = schemas.unset,
        block_number: typing.Union[MetaOapg.properties.block_number, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        vid: typing.Union[MetaOapg.properties.vid, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        id: typing.Union[MetaOapg.properties.id, None, str, schemas.Unset] = schemas.unset,
        date: typing.Union[MetaOapg.properties.date, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        token: typing.Union[MetaOapg.properties.token, None, str, schemas.Unset] = schemas.unset,
        volume: typing.Union[MetaOapg.properties.volume, None, str, schemas.Unset] = schemas.unset,
        volume_usd: typing.Union[MetaOapg.properties.volume_usd, None, str, schemas.Unset] = schemas.unset,
        untracked_volume_usd: typing.Union[MetaOapg.properties.untracked_volume_usd, None, str, schemas.Unset] = schemas.unset,
        total_value_locked: typing.Union[MetaOapg.properties.total_value_locked, None, str, schemas.Unset] = schemas.unset,
        total_value_locked_usd: typing.Union[MetaOapg.properties.total_value_locked_usd, None, str, schemas.Unset] = schemas.unset,
        price_usd: typing.Union[MetaOapg.properties.price_usd, None, str, schemas.Unset] = schemas.unset,
        fees_usd: typing.Union[MetaOapg.properties.fees_usd, None, str, schemas.Unset] = schemas.unset,
        open: typing.Union[MetaOapg.properties.open, None, str, schemas.Unset] = schemas.unset,
        high: typing.Union[MetaOapg.properties.high, None, str, schemas.Unset] = schemas.unset,
        low: typing.Union[MetaOapg.properties.low, None, str, schemas.Unset] = schemas.unset,
        close: typing.Union[MetaOapg.properties.close, None, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'UniswapV3TokenV3DayDataDTO':
        return super().__new__(
            cls,
            *args,
            entry_time=entry_time,
            recv_time=recv_time,
            block_number=block_number,
            vid=vid,
            id=id,
            date=date,
            token=token,
            volume=volume,
            volume_usd=volume_usd,
            untracked_volume_usd=untracked_volume_usd,
            total_value_locked=total_value_locked,
            total_value_locked_usd=total_value_locked_usd,
            price_usd=price_usd,
            fees_usd=fees_usd,
            open=open,
            high=high,
            low=low,
            close=close,
            _configuration=_configuration,
        )
