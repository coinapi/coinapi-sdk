# coding: utf-8

"""
    OnChain API

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


class TokenV2DTO(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Stores aggregated information for a specific token across all pairs that token is included in.
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
            
            
            class symbol(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'symbol':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class name(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'name':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            decimals = schemas.Int32Schema
        
            @staticmethod
            def total_supply() -> typing.Type['BigInteger']:
                return BigInteger
            
            
            class trade_volume(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'trade_volume':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class trade_volume_usd(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'trade_volume_usd':
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
        
            @staticmethod
            def tx_count() -> typing.Type['BigInteger']:
                return BigInteger
            
            
            class total_liquidity(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_liquidity':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class derived_eth(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'derived_eth':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class token_symbol(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'token_symbol':
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
                "symbol": symbol,
                "name": name,
                "decimals": decimals,
                "total_supply": total_supply,
                "trade_volume": trade_volume,
                "trade_volume_usd": trade_volume_usd,
                "untracked_volume_usd": untracked_volume_usd,
                "tx_count": tx_count,
                "total_liquidity": total_liquidity,
                "derived_eth": derived_eth,
                "token_symbol": token_symbol,
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
    def __getitem__(self, name: typing_extensions.Literal["symbol"]) -> MetaOapg.properties.symbol: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["decimals"]) -> MetaOapg.properties.decimals: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_supply"]) -> 'BigInteger': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["trade_volume"]) -> MetaOapg.properties.trade_volume: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["trade_volume_usd"]) -> MetaOapg.properties.trade_volume_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["untracked_volume_usd"]) -> MetaOapg.properties.untracked_volume_usd: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tx_count"]) -> 'BigInteger': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_liquidity"]) -> MetaOapg.properties.total_liquidity: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["derived_eth"]) -> MetaOapg.properties.derived_eth: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["token_symbol"]) -> MetaOapg.properties.token_symbol: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["vid"], typing_extensions.Literal["id"], typing_extensions.Literal["symbol"], typing_extensions.Literal["name"], typing_extensions.Literal["decimals"], typing_extensions.Literal["total_supply"], typing_extensions.Literal["trade_volume"], typing_extensions.Literal["trade_volume_usd"], typing_extensions.Literal["untracked_volume_usd"], typing_extensions.Literal["tx_count"], typing_extensions.Literal["total_liquidity"], typing_extensions.Literal["derived_eth"], typing_extensions.Literal["token_symbol"], ]):
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
    def get_item_oapg(self, name: typing_extensions.Literal["symbol"]) -> typing.Union[MetaOapg.properties.symbol, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> typing.Union[MetaOapg.properties.name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["decimals"]) -> typing.Union[MetaOapg.properties.decimals, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_supply"]) -> typing.Union['BigInteger', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["trade_volume"]) -> typing.Union[MetaOapg.properties.trade_volume, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["trade_volume_usd"]) -> typing.Union[MetaOapg.properties.trade_volume_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["untracked_volume_usd"]) -> typing.Union[MetaOapg.properties.untracked_volume_usd, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tx_count"]) -> typing.Union['BigInteger', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_liquidity"]) -> typing.Union[MetaOapg.properties.total_liquidity, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["derived_eth"]) -> typing.Union[MetaOapg.properties.derived_eth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["token_symbol"]) -> typing.Union[MetaOapg.properties.token_symbol, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["vid"], typing_extensions.Literal["id"], typing_extensions.Literal["symbol"], typing_extensions.Literal["name"], typing_extensions.Literal["decimals"], typing_extensions.Literal["total_supply"], typing_extensions.Literal["trade_volume"], typing_extensions.Literal["trade_volume_usd"], typing_extensions.Literal["untracked_volume_usd"], typing_extensions.Literal["tx_count"], typing_extensions.Literal["total_liquidity"], typing_extensions.Literal["derived_eth"], typing_extensions.Literal["token_symbol"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        entry_time: typing.Union[MetaOapg.properties.entry_time, str, datetime, schemas.Unset] = schemas.unset,
        recv_time: typing.Union[MetaOapg.properties.recv_time, str, datetime, schemas.Unset] = schemas.unset,
        block_number: typing.Union[MetaOapg.properties.block_number, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        vid: typing.Union[MetaOapg.properties.vid, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        id: typing.Union[MetaOapg.properties.id, None, str, schemas.Unset] = schemas.unset,
        symbol: typing.Union[MetaOapg.properties.symbol, None, str, schemas.Unset] = schemas.unset,
        name: typing.Union[MetaOapg.properties.name, None, str, schemas.Unset] = schemas.unset,
        decimals: typing.Union[MetaOapg.properties.decimals, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        total_supply: typing.Union['BigInteger', schemas.Unset] = schemas.unset,
        trade_volume: typing.Union[MetaOapg.properties.trade_volume, None, str, schemas.Unset] = schemas.unset,
        trade_volume_usd: typing.Union[MetaOapg.properties.trade_volume_usd, None, str, schemas.Unset] = schemas.unset,
        untracked_volume_usd: typing.Union[MetaOapg.properties.untracked_volume_usd, None, str, schemas.Unset] = schemas.unset,
        tx_count: typing.Union['BigInteger', schemas.Unset] = schemas.unset,
        total_liquidity: typing.Union[MetaOapg.properties.total_liquidity, None, str, schemas.Unset] = schemas.unset,
        derived_eth: typing.Union[MetaOapg.properties.derived_eth, None, str, schemas.Unset] = schemas.unset,
        token_symbol: typing.Union[MetaOapg.properties.token_symbol, None, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'TokenV2DTO':
        return super().__new__(
            cls,
            *args,
            entry_time=entry_time,
            recv_time=recv_time,
            block_number=block_number,
            vid=vid,
            id=id,
            symbol=symbol,
            name=name,
            decimals=decimals,
            total_supply=total_supply,
            trade_volume=trade_volume,
            trade_volume_usd=trade_volume_usd,
            untracked_volume_usd=untracked_volume_usd,
            tx_count=tx_count,
            total_liquidity=total_liquidity,
            derived_eth=derived_eth,
            token_symbol=token_symbol,
            _configuration=_configuration,
        )

from openapi_client.model.big_integer import BigInteger
