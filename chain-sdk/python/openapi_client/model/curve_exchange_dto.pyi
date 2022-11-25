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


class CurveExchangeDTO(
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
            
            
            class pool(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'pool':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class buyer(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'buyer':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class receiver(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'receiver':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class token_sold(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'token_sold':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class token_bought(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'token_bought':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class amount_sold(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'amount_sold':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class amount_bought(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'amount_bought':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class block(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'block':
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
            
            
            class transaction(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'transaction':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            vid = schemas.Int64Schema
            evaluated_price = schemas.Float64Schema
            evaluated_amount = schemas.Float64Schema
        
            @staticmethod
            def evaluated_aggressor() -> typing.Type['TransactionsETradeAggressiveSide']:
                return TransactionsETradeAggressiveSide
            
            
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
            __annotations__ = {
                "entry_time": entry_time,
                "recv_time": recv_time,
                "block_number": block_number,
                "id": id,
                "pool": pool,
                "buyer": buyer,
                "receiver": receiver,
                "token_sold": token_sold,
                "token_bought": token_bought,
                "amount_sold": amount_sold,
                "amount_bought": amount_bought,
                "block": block,
                "timestamp": timestamp,
                "transaction": transaction,
                "vid": vid,
                "evaluated_price": evaluated_price,
                "evaluated_amount": evaluated_amount,
                "evaluated_aggressor": evaluated_aggressor,
                "pool_id": pool_id,
                "transaction_id": transaction_id,
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
    def __getitem__(self, name: typing_extensions.Literal["pool"]) -> MetaOapg.properties.pool: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["buyer"]) -> MetaOapg.properties.buyer: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["receiver"]) -> MetaOapg.properties.receiver: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["token_sold"]) -> MetaOapg.properties.token_sold: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["token_bought"]) -> MetaOapg.properties.token_bought: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["amount_sold"]) -> MetaOapg.properties.amount_sold: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["amount_bought"]) -> MetaOapg.properties.amount_bought: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["block"]) -> MetaOapg.properties.block: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["timestamp"]) -> MetaOapg.properties.timestamp: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["transaction"]) -> MetaOapg.properties.transaction: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["vid"]) -> MetaOapg.properties.vid: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["evaluated_price"]) -> MetaOapg.properties.evaluated_price: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["evaluated_amount"]) -> MetaOapg.properties.evaluated_amount: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["evaluated_aggressor"]) -> 'TransactionsETradeAggressiveSide': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["pool_id"]) -> MetaOapg.properties.pool_id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["transaction_id"]) -> MetaOapg.properties.transaction_id: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["id"], typing_extensions.Literal["pool"], typing_extensions.Literal["buyer"], typing_extensions.Literal["receiver"], typing_extensions.Literal["token_sold"], typing_extensions.Literal["token_bought"], typing_extensions.Literal["amount_sold"], typing_extensions.Literal["amount_bought"], typing_extensions.Literal["block"], typing_extensions.Literal["timestamp"], typing_extensions.Literal["transaction"], typing_extensions.Literal["vid"], typing_extensions.Literal["evaluated_price"], typing_extensions.Literal["evaluated_amount"], typing_extensions.Literal["evaluated_aggressor"], typing_extensions.Literal["pool_id"], typing_extensions.Literal["transaction_id"], ]):
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
    def get_item_oapg(self, name: typing_extensions.Literal["pool"]) -> typing.Union[MetaOapg.properties.pool, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["buyer"]) -> typing.Union[MetaOapg.properties.buyer, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["receiver"]) -> typing.Union[MetaOapg.properties.receiver, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["token_sold"]) -> typing.Union[MetaOapg.properties.token_sold, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["token_bought"]) -> typing.Union[MetaOapg.properties.token_bought, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["amount_sold"]) -> typing.Union[MetaOapg.properties.amount_sold, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["amount_bought"]) -> typing.Union[MetaOapg.properties.amount_bought, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["block"]) -> typing.Union[MetaOapg.properties.block, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["timestamp"]) -> typing.Union[MetaOapg.properties.timestamp, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["transaction"]) -> typing.Union[MetaOapg.properties.transaction, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["vid"]) -> typing.Union[MetaOapg.properties.vid, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["evaluated_price"]) -> typing.Union[MetaOapg.properties.evaluated_price, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["evaluated_amount"]) -> typing.Union[MetaOapg.properties.evaluated_amount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["evaluated_aggressor"]) -> typing.Union['TransactionsETradeAggressiveSide', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["pool_id"]) -> typing.Union[MetaOapg.properties.pool_id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["transaction_id"]) -> typing.Union[MetaOapg.properties.transaction_id, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["entry_time"], typing_extensions.Literal["recv_time"], typing_extensions.Literal["block_number"], typing_extensions.Literal["id"], typing_extensions.Literal["pool"], typing_extensions.Literal["buyer"], typing_extensions.Literal["receiver"], typing_extensions.Literal["token_sold"], typing_extensions.Literal["token_bought"], typing_extensions.Literal["amount_sold"], typing_extensions.Literal["amount_bought"], typing_extensions.Literal["block"], typing_extensions.Literal["timestamp"], typing_extensions.Literal["transaction"], typing_extensions.Literal["vid"], typing_extensions.Literal["evaluated_price"], typing_extensions.Literal["evaluated_amount"], typing_extensions.Literal["evaluated_aggressor"], typing_extensions.Literal["pool_id"], typing_extensions.Literal["transaction_id"], ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        entry_time: typing.Union[MetaOapg.properties.entry_time, str, datetime, schemas.Unset] = schemas.unset,
        recv_time: typing.Union[MetaOapg.properties.recv_time, str, datetime, schemas.Unset] = schemas.unset,
        block_number: typing.Union[MetaOapg.properties.block_number, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        id: typing.Union[MetaOapg.properties.id, None, str, schemas.Unset] = schemas.unset,
        pool: typing.Union[MetaOapg.properties.pool, None, str, schemas.Unset] = schemas.unset,
        buyer: typing.Union[MetaOapg.properties.buyer, None, str, schemas.Unset] = schemas.unset,
        receiver: typing.Union[MetaOapg.properties.receiver, None, str, schemas.Unset] = schemas.unset,
        token_sold: typing.Union[MetaOapg.properties.token_sold, None, str, schemas.Unset] = schemas.unset,
        token_bought: typing.Union[MetaOapg.properties.token_bought, None, str, schemas.Unset] = schemas.unset,
        amount_sold: typing.Union[MetaOapg.properties.amount_sold, None, str, schemas.Unset] = schemas.unset,
        amount_bought: typing.Union[MetaOapg.properties.amount_bought, None, str, schemas.Unset] = schemas.unset,
        block: typing.Union[MetaOapg.properties.block, None, str, schemas.Unset] = schemas.unset,
        timestamp: typing.Union[MetaOapg.properties.timestamp, None, str, schemas.Unset] = schemas.unset,
        transaction: typing.Union[MetaOapg.properties.transaction, None, str, schemas.Unset] = schemas.unset,
        vid: typing.Union[MetaOapg.properties.vid, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        evaluated_price: typing.Union[MetaOapg.properties.evaluated_price, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        evaluated_amount: typing.Union[MetaOapg.properties.evaluated_amount, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        evaluated_aggressor: typing.Union['TransactionsETradeAggressiveSide', schemas.Unset] = schemas.unset,
        pool_id: typing.Union[MetaOapg.properties.pool_id, None, str, schemas.Unset] = schemas.unset,
        transaction_id: typing.Union[MetaOapg.properties.transaction_id, None, str, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
    ) -> 'CurveExchangeDTO':
        return super().__new__(
            cls,
            *args,
            entry_time=entry_time,
            recv_time=recv_time,
            block_number=block_number,
            id=id,
            pool=pool,
            buyer=buyer,
            receiver=receiver,
            token_sold=token_sold,
            token_bought=token_bought,
            amount_sold=amount_sold,
            amount_bought=amount_bought,
            block=block,
            timestamp=timestamp,
            transaction=transaction,
            vid=vid,
            evaluated_price=evaluated_price,
            evaluated_amount=evaluated_amount,
            evaluated_aggressor=evaluated_aggressor,
            pool_id=pool_id,
            transaction_id=transaction_id,
            _configuration=_configuration,
        )

from openapi_client.model.transactions_e_trade_aggressive_side import TransactionsETradeAggressiveSide
