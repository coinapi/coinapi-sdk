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


class TransactionsETradeAggressiveSide(
    schemas.EnumBase,
    schemas.StrSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        enum_value_to_name = {
            "Buy": "BUY",
            "Sell": "SELL",
            "EstimatedBuy": "ESTIMATED_BUY",
            "EstimatedSell": "ESTIMATED_SELL",
            "Unknown": "UNKNOWN",
        }
    
    @schemas.classproperty
    def BUY(cls):
        return cls("Buy")
    
    @schemas.classproperty
    def SELL(cls):
        return cls("Sell")
    
    @schemas.classproperty
    def ESTIMATED_BUY(cls):
        return cls("EstimatedBuy")
    
    @schemas.classproperty
    def ESTIMATED_SELL(cls):
        return cls("EstimatedSell")
    
    @schemas.classproperty
    def UNKNOWN(cls):
        return cls("Unknown")
