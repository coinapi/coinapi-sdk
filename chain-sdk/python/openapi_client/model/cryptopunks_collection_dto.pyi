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


class CRYPTOPUNKSCollectionDTO(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        
        class properties:
            entry_time = schemas.DateTimeSchema
            recv_time = schemas.DateTimeSchema
            block_number = schemas.Int64Schema
            vid = schemas.Int64Schema
            
            
            class block_range(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'block_range':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class id(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'id':
                    return super().__new__(
                        cls,
                        *_args,
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
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'name':
                    return super().__new__(
                        cls,
                        *_args,
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
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'symbol':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class total_supply(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_supply':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class royalty_fee(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'royalty_fee':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class cumulative_trade_volume_eth(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'cumulative_trade_volume_eth':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class marketplace_revenue_eth(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'marketplace_revenue_eth':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class creator_revenue_eth(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'creator_revenue_eth':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            
            
            class total_revenue_eth(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *_args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'total_revenue_eth':
                    return super().__new__(
                        cls,
                        *_args,
                        _configuration=_configuration,
                    )
            trade_count = schemas.Int32Schema
            buyer_count = schemas.Int32Schema
            seller_count = schemas.Int32Schema
            __annotations__ = {
                "entry_time": entry_time,
                "recv_time": recv_time,
                "block_number": block_number,
                "vid": vid,
                "block_range": block_range,
                "id": id,
                "name": name,
                "symbol": symbol,
                "total_supply": total_supply,
                "royalty_fee": royalty_fee,
                "cumulative_trade_volume_eth": cumulative_trade_volume_eth,
                "marketplace_revenue_eth": marketplace_revenue_eth,
                "creator_revenue_eth": creator_revenue_eth,
                "total_revenue_eth": total_revenue_eth,
                "trade_count": trade_count,
                "buyer_count": buyer_count,
                "seller_count": seller_count,
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
    def __getitem__(self, name: typing_extensions.Literal["block_range"]) -> MetaOapg.properties.block_range: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["name"]) -> MetaOapg.properties.name: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["symbol"]) -> MetaOapg.properties.symbol: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_supply"]) -> MetaOapg.properties.total_supply: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["royalty_fee"]) -> MetaOapg.properties.royalty_fee: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["cumulative_trade_volume_eth"]) -> MetaOapg.properties.cumulative_trade_volume_eth: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["marketplace_revenue_eth"]) -> MetaOapg.properties.marketplace_revenue_eth: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["creator_revenue_eth"]) -> MetaOapg.properties.creator_revenue_eth: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_revenue_eth"]) -> MetaOapg.properties.total_revenue_eth: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["trade_count"]) -> MetaOapg.properties.trade_count: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["buyer_count"]) -> MetaOapg.properties.buyer_count: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["seller_count"]) -> MetaOapg.properties.seller_count: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["vid"], typing_extensions.Literal["block_range"], typing_extensions.Literal["id"], typing_extensions.Literal["name"], typing_extensions.Literal["symbol"], typing_extensions.Literal["total_supply"], typing_extensions.Literal["royalty_fee"], typing_extensions.Literal["cumulative_trade_volume_eth"], typing_extensions.Literal["marketplace_revenue_eth"], typing_extensions.Literal["creator_revenue_eth"], typing_extensions.Literal["total_revenue_eth"], typing_extensions.Literal["trade_count"], typing_extensions.Literal["buyer_count"], typing_extensions.Literal["seller_count"], ]):
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
    def get_item_oapg(self, name: typing_extensions.Literal["block_range"]) -> typing.Union[MetaOapg.properties.block_range, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["name"]) -> typing.Union[MetaOapg.properties.name, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["symbol"]) -> typing.Union[MetaOapg.properties.symbol, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_supply"]) -> typing.Union[MetaOapg.properties.total_supply, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["royalty_fee"]) -> typing.Union[MetaOapg.properties.royalty_fee, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["cumulative_trade_volume_eth"]) -> typing.Union[MetaOapg.properties.cumulative_trade_volume_eth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["marketplace_revenue_eth"]) -> typing.Union[MetaOapg.properties.marketplace_revenue_eth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["creator_revenue_eth"]) -> typing.Union[MetaOapg.properties.creator_revenue_eth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_revenue_eth"]) -> typing.Union[MetaOapg.properties.total_revenue_eth, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["trade_count"]) -> typing.Union[MetaOapg.properties.trade_count, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["buyer_count"]) -> typing.Union[MetaOapg.properties.buyer_count, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["seller_count"]) -> typing.Union[MetaOapg.properties.seller_count, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["vid"], typing_extensions.Literal["block_range"], typing_extensions.Literal["id"], typing_extensions.Literal["name"], typing_extensions.Literal["symbol"], typing_extensions.Literal["total_supply"], typing_extensions.Literal["royalty_fee"], typing_extensions.Literal["cumulative_trade_volume_eth"], typing_extensions.Literal["marketplace_revenue_eth"], typing_extensions.Literal["creator_revenue_eth"], typing_extensions.Literal["total_revenue_eth"], typing_extensions.Literal["trade_count"], typing_extensions.Literal["buyer_count"], typing_extensions.Literal["seller_count"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *_args: typing.Union[dict, frozendict.frozendict, ],
        entry_time: typing.Union[MetaOapg.properties.entry_time, str, datetime, schemas.Unset] = schemas.unset,
        recv_time: typing.Union[MetaOapg.properties.recv_time, str, datetime, schemas.Unset] = schemas.unset,
        block_number: typing.Union[MetaOapg.properties.block_number, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        vid: typing.Union[MetaOapg.properties.vid, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        block_range: typing.Union[MetaOapg.properties.block_range, None, str, schemas.Unset] = schemas.unset,
        id: typing.Union[MetaOapg.properties.id, None, str, schemas.Unset] = schemas.unset,
        name: typing.Union[MetaOapg.properties.name, None, str, schemas.Unset] = schemas.unset,
        symbol: typing.Union[MetaOapg.properties.symbol, None, str, schemas.Unset] = schemas.unset,
        total_supply: typing.Union[MetaOapg.properties.total_supply, None, str, schemas.Unset] = schemas.unset,
        royalty_fee: typing.Union[MetaOapg.properties.royalty_fee, None, str, schemas.Unset] = schemas.unset,
        cumulative_trade_volume_eth: typing.Union[MetaOapg.properties.cumulative_trade_volume_eth, None, str, schemas.Unset] = schemas.unset,
        marketplace_revenue_eth: typing.Union[MetaOapg.properties.marketplace_revenue_eth, None, str, schemas.Unset] = schemas.unset,
        creator_revenue_eth: typing.Union[MetaOapg.properties.creator_revenue_eth, None, str, schemas.Unset] = schemas.unset,
        total_revenue_eth: typing.Union[MetaOapg.properties.total_revenue_eth, None, str, schemas.Unset] = schemas.unset,
        trade_count: typing.Union[MetaOapg.properties.trade_count, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        buyer_count: typing.Union[MetaOapg.properties.buyer_count, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        seller_count: typing.Union[MetaOapg.properties.seller_count, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'CRYPTOPUNKSCollectionDTO':
        return super().__new__(
            cls,
            *_args,
            entry_time=entry_time,
            recv_time=recv_time,
            block_number=block_number,
            vid=vid,
            block_range=block_range,
            id=id,
            name=name,
            symbol=symbol,
            total_supply=total_supply,
            royalty_fee=royalty_fee,
            cumulative_trade_volume_eth=cumulative_trade_volume_eth,
            marketplace_revenue_eth=marketplace_revenue_eth,
            creator_revenue_eth=creator_revenue_eth,
            total_revenue_eth=total_revenue_eth,
            trade_count=trade_count,
            buyer_count=buyer_count,
            seller_count=seller_count,
            _configuration=_configuration,
        )
