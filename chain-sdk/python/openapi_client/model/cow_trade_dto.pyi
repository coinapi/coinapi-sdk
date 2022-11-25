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


class CowTradeDTO(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Trade entity.
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
            
            
            class timestamp(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'timestamp':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class gas_price(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'gas_price':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class gas_limit(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'gas_limit':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class fee_amount(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'fee_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class tx_hash(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'tx_hash':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class settlement(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'settlement':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class buy_amount(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'buy_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class sell_amount(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'sell_amount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class sell_token(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'sell_token':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class buy_token(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'buy_token':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class order(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'order':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            vid = schemas.Int64Schema
            
            
            class pool_id(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'pool_id':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class transaction_id(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'transaction_id':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            evaluated_price = schemas.Float64Schema
            evaluated_amount = schemas.Float64Schema
        
            @staticmethod
            def evaluated_aggressor() -> typing.Type['TransactionsETradeAggressiveSide']:
                return TransactionsETradeAggressiveSide
            __annotations__ = {
                "entry_time": entry_time,
                "recv_time": recv_time,
                "block_number": block_number,
                "id": id,
                "timestamp": timestamp,
                "gas_price": gas_price,
                "gas_limit": gas_limit,
                "fee_amount": fee_amount,
                "tx_hash": tx_hash,
                "settlement": settlement,
                "buy_amount": buy_amount,
                "sell_amount": sell_amount,
                "sell_token": sell_token,
                "buy_token": buy_token,
                "order": order,
                "vid": vid,
                "pool_id": pool_id,
                "transaction_id": transaction_id,
                "evaluated_price": evaluated_price,
                "evaluated_amount": evaluated_amount,
                "evaluated_aggressor": evaluated_aggressor,
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
    def __getitem__(self, name: typing_extensions.Literal["timestamp"]) -> MetaOapg.properties.timestamp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["gas_price"]) -> MetaOapg.properties.gas_price: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["gas_limit"]) -> MetaOapg.properties.gas_limit: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["fee_amount"]) -> MetaOapg.properties.fee_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["tx_hash"]) -> MetaOapg.properties.tx_hash: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["settlement"]) -> MetaOapg.properties.settlement: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["buy_amount"]) -> MetaOapg.properties.buy_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sell_amount"]) -> MetaOapg.properties.sell_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sell_token"]) -> MetaOapg.properties.sell_token: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["buy_token"]) -> MetaOapg.properties.buy_token: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["order"]) -> MetaOapg.properties.order: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["vid"]) -> MetaOapg.properties.vid: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pool_id"]) -> MetaOapg.properties.pool_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["transaction_id"]) -> MetaOapg.properties.transaction_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["evaluated_price"]) -> MetaOapg.properties.evaluated_price: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["evaluated_amount"]) -> MetaOapg.properties.evaluated_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["evaluated_aggressor"]) -> 'TransactionsETradeAggressiveSide': ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["id"], typing_extensions.Literal["timestamp"], typing_extensions.Literal["gas_price"], typing_extensions.Literal["gas_limit"], typing_extensions.Literal["fee_amount"], typing_extensions.Literal["tx_hash"], typing_extensions.Literal["settlement"], typing_extensions.Literal["buy_amount"], typing_extensions.Literal["sell_amount"], typing_extensions.Literal["sell_token"], typing_extensions.Literal["buy_token"], typing_extensions.Literal["order"], typing_extensions.Literal["vid"], typing_extensions.Literal["pool_id"], typing_extensions.Literal["transaction_id"], typing_extensions.Literal["evaluated_price"], typing_extensions.Literal["evaluated_amount"], typing_extensions.Literal["evaluated_aggressor"], ]):
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
    def get_item_oapg(self, name: typing_extensions.Literal["timestamp"]) -> typing.Union[MetaOapg.properties.timestamp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["gas_price"]) -> typing.Union[MetaOapg.properties.gas_price, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["gas_limit"]) -> typing.Union[MetaOapg.properties.gas_limit, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["fee_amount"]) -> typing.Union[MetaOapg.properties.fee_amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["tx_hash"]) -> typing.Union[MetaOapg.properties.tx_hash, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["settlement"]) -> typing.Union[MetaOapg.properties.settlement, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["buy_amount"]) -> typing.Union[MetaOapg.properties.buy_amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sell_amount"]) -> typing.Union[MetaOapg.properties.sell_amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sell_token"]) -> typing.Union[MetaOapg.properties.sell_token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["buy_token"]) -> typing.Union[MetaOapg.properties.buy_token, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["order"]) -> typing.Union[MetaOapg.properties.order, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["vid"]) -> typing.Union[MetaOapg.properties.vid, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pool_id"]) -> typing.Union[MetaOapg.properties.pool_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["transaction_id"]) -> typing.Union[MetaOapg.properties.transaction_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["evaluated_price"]) -> typing.Union[MetaOapg.properties.evaluated_price, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["evaluated_amount"]) -> typing.Union[MetaOapg.properties.evaluated_amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["evaluated_aggressor"]) -> typing.Union['TransactionsETradeAggressiveSide', schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["id"], typing_extensions.Literal["timestamp"], typing_extensions.Literal["gas_price"], typing_extensions.Literal["gas_limit"], typing_extensions.Literal["fee_amount"], typing_extensions.Literal["tx_hash"], typing_extensions.Literal["settlement"], typing_extensions.Literal["buy_amount"], typing_extensions.Literal["sell_amount"], typing_extensions.Literal["sell_token"], typing_extensions.Literal["buy_token"], typing_extensions.Literal["order"], typing_extensions.Literal["vid"], typing_extensions.Literal["pool_id"], typing_extensions.Literal["transaction_id"], typing_extensions.Literal["evaluated_price"], typing_extensions.Literal["evaluated_amount"], typing_extensions.Literal["evaluated_aggressor"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        entry_time: typing.Union[MetaOapg.properties.entry_time, str, datetime, schemas.Unset] = schemas.unset,
        recv_time: typing.Union[MetaOapg.properties.recv_time, str, datetime, schemas.Unset] = schemas.unset,
        block_number: typing.Union[MetaOapg.properties.block_number, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        id: typing.Union[MetaOapg.properties.id, None, str, schemas.Unset] = schemas.unset,
        timestamp: typing.Union[MetaOapg.properties.timestamp, None, str, schemas.Unset] = schemas.unset,
        gas_price: typing.Union[MetaOapg.properties.gas_price, None, str, schemas.Unset] = schemas.unset,
        gas_limit: typing.Union[MetaOapg.properties.gas_limit, None, str, schemas.Unset] = schemas.unset,
        fee_amount: typing.Union[MetaOapg.properties.fee_amount, None, str, schemas.Unset] = schemas.unset,
        tx_hash: typing.Union[MetaOapg.properties.tx_hash, None, str, schemas.Unset] = schemas.unset,
        settlement: typing.Union[MetaOapg.properties.settlement, None, str, schemas.Unset] = schemas.unset,
        buy_amount: typing.Union[MetaOapg.properties.buy_amount, None, str, schemas.Unset] = schemas.unset,
        sell_amount: typing.Union[MetaOapg.properties.sell_amount, None, str, schemas.Unset] = schemas.unset,
        sell_token: typing.Union[MetaOapg.properties.sell_token, None, str, schemas.Unset] = schemas.unset,
        buy_token: typing.Union[MetaOapg.properties.buy_token, None, str, schemas.Unset] = schemas.unset,
        order: typing.Union[MetaOapg.properties.order, None, str, schemas.Unset] = schemas.unset,
        vid: typing.Union[MetaOapg.properties.vid, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        pool_id: typing.Union[MetaOapg.properties.pool_id, None, str, schemas.Unset] = schemas.unset,
        transaction_id: typing.Union[MetaOapg.properties.transaction_id, None, str, schemas.Unset] = schemas.unset,
        evaluated_price: typing.Union[MetaOapg.properties.evaluated_price, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        evaluated_amount: typing.Union[MetaOapg.properties.evaluated_amount, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        evaluated_aggressor: typing.Union['TransactionsETradeAggressiveSide', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'CowTradeDTO':
        return super().__new__(
            cls,
            *args,
            entry_time=entry_time,
            recv_time=recv_time,
            block_number=block_number,
            id=id,
            timestamp=timestamp,
            gas_price=gas_price,
            gas_limit=gas_limit,
            fee_amount=fee_amount,
            tx_hash=tx_hash,
            settlement=settlement,
            buy_amount=buy_amount,
            sell_amount=sell_amount,
            sell_token=sell_token,
            buy_token=buy_token,
            order=order,
            vid=vid,
            pool_id=pool_id,
            transaction_id=transaction_id,
            evaluated_price=evaluated_price,
            evaluated_amount=evaluated_amount,
            evaluated_aggressor=evaluated_aggressor,
            _configuration=_configuration,
        )

from openapi_client.model.transactions_e_trade_aggressive_side import TransactionsETradeAggressiveSide
