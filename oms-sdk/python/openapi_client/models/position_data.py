# coding: utf-8

"""
    OMS - REST API .

    OMS Project  # noqa: E501

    The version of the OpenAPI document: v1
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class PositionData(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'id': 'str',
        'symbol_exchange': 'str',
        'symbol_coinapi': 'str',
        'avg_entry_price': 'float',
        'quantity': 'float',
        'is_buy': 'bool',
        'unrealised_pn_l': 'float',
        'leverage': 'float',
        'cross_margin': 'bool',
        'liquidation_price': 'float',
        'raw_data': 'str'
    }

    attribute_map = {
        'id': 'id',
        'symbol_exchange': 'symbol_exchange',
        'symbol_coinapi': 'symbol_coinapi',
        'avg_entry_price': 'avg_entry_price',
        'quantity': 'quantity',
        'is_buy': 'is_buy',
        'unrealised_pn_l': 'unrealised_pn_l',
        'leverage': 'leverage',
        'cross_margin': 'cross_margin',
        'liquidation_price': 'liquidation_price',
        'raw_data': 'raw_data'
    }

    def __init__(self, id=None, symbol_exchange=None, symbol_coinapi=None, avg_entry_price=None, quantity=None, is_buy=None, unrealised_pn_l=None, leverage=None, cross_margin=None, liquidation_price=None, raw_data=None, local_vars_configuration=None):  # noqa: E501
        """PositionData - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._symbol_exchange = None
        self._symbol_coinapi = None
        self._avg_entry_price = None
        self._quantity = None
        self._is_buy = None
        self._unrealised_pn_l = None
        self._leverage = None
        self._cross_margin = None
        self._liquidation_price = None
        self._raw_data = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if symbol_exchange is not None:
            self.symbol_exchange = symbol_exchange
        if symbol_coinapi is not None:
            self.symbol_coinapi = symbol_coinapi
        if avg_entry_price is not None:
            self.avg_entry_price = avg_entry_price
        if quantity is not None:
            self.quantity = quantity
        if is_buy is not None:
            self.is_buy = is_buy
        if unrealised_pn_l is not None:
            self.unrealised_pn_l = unrealised_pn_l
        if leverage is not None:
            self.leverage = leverage
        if cross_margin is not None:
            self.cross_margin = cross_margin
        if liquidation_price is not None:
            self.liquidation_price = liquidation_price
        if raw_data is not None:
            self.raw_data = raw_data

    @property
    def id(self):
        """Gets the id of this PositionData.  # noqa: E501

        Unique position ID  # noqa: E501

        :return: The id of this PositionData.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PositionData.

        Unique position ID  # noqa: E501

        :param id: The id of this PositionData.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def symbol_exchange(self):
        """Gets the symbol_exchange of this PositionData.  # noqa: E501

        The contract for this position.  # noqa: E501

        :return: The symbol_exchange of this PositionData.  # noqa: E501
        :rtype: str
        """
        return self._symbol_exchange

    @symbol_exchange.setter
    def symbol_exchange(self, symbol_exchange):
        """Sets the symbol_exchange of this PositionData.

        The contract for this position.  # noqa: E501

        :param symbol_exchange: The symbol_exchange of this PositionData.  # noqa: E501
        :type: str
        """

        self._symbol_exchange = symbol_exchange

    @property
    def symbol_coinapi(self):
        """Gets the symbol_coinapi of this PositionData.  # noqa: E501

        The coinapi contract for this position.  # noqa: E501

        :return: The symbol_coinapi of this PositionData.  # noqa: E501
        :rtype: str
        """
        return self._symbol_coinapi

    @symbol_coinapi.setter
    def symbol_coinapi(self, symbol_coinapi):
        """Sets the symbol_coinapi of this PositionData.

        The coinapi contract for this position.  # noqa: E501

        :param symbol_coinapi: The symbol_coinapi of this PositionData.  # noqa: E501
        :type: str
        """

        self._symbol_coinapi = symbol_coinapi

    @property
    def avg_entry_price(self):
        """Gets the avg_entry_price of this PositionData.  # noqa: E501


        :return: The avg_entry_price of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._avg_entry_price

    @avg_entry_price.setter
    def avg_entry_price(self, avg_entry_price):
        """Sets the avg_entry_price of this PositionData.


        :param avg_entry_price: The avg_entry_price of this PositionData.  # noqa: E501
        :type: float
        """

        self._avg_entry_price = avg_entry_price

    @property
    def quantity(self):
        """Gets the quantity of this PositionData.  # noqa: E501

        The current position amount in contracts.  # noqa: E501

        :return: The quantity of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._quantity

    @quantity.setter
    def quantity(self, quantity):
        """Sets the quantity of this PositionData.

        The current position amount in contracts.  # noqa: E501

        :param quantity: The quantity of this PositionData.  # noqa: E501
        :type: float
        """

        self._quantity = quantity

    @property
    def is_buy(self):
        """Gets the is_buy of this PositionData.  # noqa: E501


        :return: The is_buy of this PositionData.  # noqa: E501
        :rtype: bool
        """
        return self._is_buy

    @is_buy.setter
    def is_buy(self, is_buy):
        """Sets the is_buy of this PositionData.


        :param is_buy: The is_buy of this PositionData.  # noqa: E501
        :type: bool
        """

        self._is_buy = is_buy

    @property
    def unrealised_pn_l(self):
        """Gets the unrealised_pn_l of this PositionData.  # noqa: E501

        Unrealised PNL is all the unrealised profit or loss coming from your portfolio's open positions.  # noqa: E501

        :return: The unrealised_pn_l of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._unrealised_pn_l

    @unrealised_pn_l.setter
    def unrealised_pn_l(self, unrealised_pn_l):
        """Sets the unrealised_pn_l of this PositionData.

        Unrealised PNL is all the unrealised profit or loss coming from your portfolio's open positions.  # noqa: E501

        :param unrealised_pn_l: The unrealised_pn_l of this PositionData.  # noqa: E501
        :type: float
        """

        self._unrealised_pn_l = unrealised_pn_l

    @property
    def leverage(self):
        """Gets the leverage of this PositionData.  # noqa: E501

        1 / initMarginReq.  # noqa: E501

        :return: The leverage of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._leverage

    @leverage.setter
    def leverage(self, leverage):
        """Sets the leverage of this PositionData.

        1 / initMarginReq.  # noqa: E501

        :param leverage: The leverage of this PositionData.  # noqa: E501
        :type: float
        """

        self._leverage = leverage

    @property
    def cross_margin(self):
        """Gets the cross_margin of this PositionData.  # noqa: E501

        True/false depending on whether you set cross margin on this position.  # noqa: E501

        :return: The cross_margin of this PositionData.  # noqa: E501
        :rtype: bool
        """
        return self._cross_margin

    @cross_margin.setter
    def cross_margin(self, cross_margin):
        """Sets the cross_margin of this PositionData.

        True/false depending on whether you set cross margin on this position.  # noqa: E501

        :param cross_margin: The cross_margin of this PositionData.  # noqa: E501
        :type: bool
        """

        self._cross_margin = cross_margin

    @property
    def liquidation_price(self):
        """Gets the liquidation_price of this PositionData.  # noqa: E501

        Once markPrice reaches this price, this position will be liquidated.  # noqa: E501

        :return: The liquidation_price of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._liquidation_price

    @liquidation_price.setter
    def liquidation_price(self, liquidation_price):
        """Sets the liquidation_price of this PositionData.

        Once markPrice reaches this price, this position will be liquidated.  # noqa: E501

        :param liquidation_price: The liquidation_price of this PositionData.  # noqa: E501
        :type: float
        """

        self._liquidation_price = liquidation_price

    @property
    def raw_data(self):
        """Gets the raw_data of this PositionData.  # noqa: E501


        :return: The raw_data of this PositionData.  # noqa: E501
        :rtype: str
        """
        return self._raw_data

    @raw_data.setter
    def raw_data(self, raw_data):
        """Sets the raw_data of this PositionData.


        :param raw_data: The raw_data of this PositionData.  # noqa: E501
        :type: str
        """

        self._raw_data = raw_data

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PositionData):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PositionData):
            return True

        return self.to_dict() != other.to_dict()
