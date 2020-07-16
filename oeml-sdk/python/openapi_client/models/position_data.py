# coding: utf-8

"""
    OEML - REST API

    This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>         # noqa: E501

    The version of the OpenAPI document: v1
    Contact: support@coinapi.io
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
        'symbol_id_exchange': 'str',
        'symbol_id_coinapi': 'str',
        'avg_entry_price': 'float',
        'quantity': 'float',
        'side': 'OrdSide',
        'unrealized_pnl': 'float',
        'leverage': 'float',
        'cross_margin': 'bool',
        'liquidation_price': 'float',
        'raw_data': 'object'
    }

    attribute_map = {
        'symbol_id_exchange': 'symbol_id_exchange',
        'symbol_id_coinapi': 'symbol_id_coinapi',
        'avg_entry_price': 'avg_entry_price',
        'quantity': 'quantity',
        'side': 'side',
        'unrealized_pnl': 'unrealized_pnl',
        'leverage': 'leverage',
        'cross_margin': 'cross_margin',
        'liquidation_price': 'liquidation_price',
        'raw_data': 'raw_data'
    }

    def __init__(self, symbol_id_exchange=None, symbol_id_coinapi=None, avg_entry_price=None, quantity=None, side=None, unrealized_pnl=None, leverage=None, cross_margin=None, liquidation_price=None, raw_data=None, local_vars_configuration=None):  # noqa: E501
        """PositionData - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._symbol_id_exchange = None
        self._symbol_id_coinapi = None
        self._avg_entry_price = None
        self._quantity = None
        self._side = None
        self._unrealized_pnl = None
        self._leverage = None
        self._cross_margin = None
        self._liquidation_price = None
        self._raw_data = None
        self.discriminator = None

        if symbol_id_exchange is not None:
            self.symbol_id_exchange = symbol_id_exchange
        if symbol_id_coinapi is not None:
            self.symbol_id_coinapi = symbol_id_coinapi
        if avg_entry_price is not None:
            self.avg_entry_price = avg_entry_price
        if quantity is not None:
            self.quantity = quantity
        if side is not None:
            self.side = side
        if unrealized_pnl is not None:
            self.unrealized_pnl = unrealized_pnl
        if leverage is not None:
            self.leverage = leverage
        if cross_margin is not None:
            self.cross_margin = cross_margin
        if liquidation_price is not None:
            self.liquidation_price = liquidation_price
        if raw_data is not None:
            self.raw_data = raw_data

    @property
    def symbol_id_exchange(self):
        """Gets the symbol_id_exchange of this PositionData.  # noqa: E501

        Exchange symbol.  # noqa: E501

        :return: The symbol_id_exchange of this PositionData.  # noqa: E501
        :rtype: str
        """
        return self._symbol_id_exchange

    @symbol_id_exchange.setter
    def symbol_id_exchange(self, symbol_id_exchange):
        """Sets the symbol_id_exchange of this PositionData.

        Exchange symbol.  # noqa: E501

        :param symbol_id_exchange: The symbol_id_exchange of this PositionData.  # noqa: E501
        :type: str
        """

        self._symbol_id_exchange = symbol_id_exchange

    @property
    def symbol_id_coinapi(self):
        """Gets the symbol_id_coinapi of this PositionData.  # noqa: E501

        CoinAPI symbol.  # noqa: E501

        :return: The symbol_id_coinapi of this PositionData.  # noqa: E501
        :rtype: str
        """
        return self._symbol_id_coinapi

    @symbol_id_coinapi.setter
    def symbol_id_coinapi(self, symbol_id_coinapi):
        """Sets the symbol_id_coinapi of this PositionData.

        CoinAPI symbol.  # noqa: E501

        :param symbol_id_coinapi: The symbol_id_coinapi of this PositionData.  # noqa: E501
        :type: str
        """

        self._symbol_id_coinapi = symbol_id_coinapi

    @property
    def avg_entry_price(self):
        """Gets the avg_entry_price of this PositionData.  # noqa: E501

        Calculated average price of all fills on this position.  # noqa: E501

        :return: The avg_entry_price of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._avg_entry_price

    @avg_entry_price.setter
    def avg_entry_price(self, avg_entry_price):
        """Sets the avg_entry_price of this PositionData.

        Calculated average price of all fills on this position.  # noqa: E501

        :param avg_entry_price: The avg_entry_price of this PositionData.  # noqa: E501
        :type: float
        """

        self._avg_entry_price = avg_entry_price

    @property
    def quantity(self):
        """Gets the quantity of this PositionData.  # noqa: E501

        The current position quantity.  # noqa: E501

        :return: The quantity of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._quantity

    @quantity.setter
    def quantity(self, quantity):
        """Sets the quantity of this PositionData.

        The current position quantity.  # noqa: E501

        :param quantity: The quantity of this PositionData.  # noqa: E501
        :type: float
        """

        self._quantity = quantity

    @property
    def side(self):
        """Gets the side of this PositionData.  # noqa: E501


        :return: The side of this PositionData.  # noqa: E501
        :rtype: OrdSide
        """
        return self._side

    @side.setter
    def side(self, side):
        """Sets the side of this PositionData.


        :param side: The side of this PositionData.  # noqa: E501
        :type: OrdSide
        """

        self._side = side

    @property
    def unrealized_pnl(self):
        """Gets the unrealized_pnl of this PositionData.  # noqa: E501

        Unrealised profit or loss (PNL) of this position.  # noqa: E501

        :return: The unrealized_pnl of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._unrealized_pnl

    @unrealized_pnl.setter
    def unrealized_pnl(self, unrealized_pnl):
        """Sets the unrealized_pnl of this PositionData.

        Unrealised profit or loss (PNL) of this position.  # noqa: E501

        :param unrealized_pnl: The unrealized_pnl of this PositionData.  # noqa: E501
        :type: float
        """

        self._unrealized_pnl = unrealized_pnl

    @property
    def leverage(self):
        """Gets the leverage of this PositionData.  # noqa: E501

        Leverage for this position reported by the exchange.  # noqa: E501

        :return: The leverage of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._leverage

    @leverage.setter
    def leverage(self, leverage):
        """Sets the leverage of this PositionData.

        Leverage for this position reported by the exchange.  # noqa: E501

        :param leverage: The leverage of this PositionData.  # noqa: E501
        :type: float
        """

        self._leverage = leverage

    @property
    def cross_margin(self):
        """Gets the cross_margin of this PositionData.  # noqa: E501

        Is cross margin mode enable for this position?  # noqa: E501

        :return: The cross_margin of this PositionData.  # noqa: E501
        :rtype: bool
        """
        return self._cross_margin

    @cross_margin.setter
    def cross_margin(self, cross_margin):
        """Sets the cross_margin of this PositionData.

        Is cross margin mode enable for this position?  # noqa: E501

        :param cross_margin: The cross_margin of this PositionData.  # noqa: E501
        :type: bool
        """

        self._cross_margin = cross_margin

    @property
    def liquidation_price(self):
        """Gets the liquidation_price of this PositionData.  # noqa: E501

        Liquidation price. If mark price will reach this value, the position will be liquidated.  # noqa: E501

        :return: The liquidation_price of this PositionData.  # noqa: E501
        :rtype: float
        """
        return self._liquidation_price

    @liquidation_price.setter
    def liquidation_price(self, liquidation_price):
        """Sets the liquidation_price of this PositionData.

        Liquidation price. If mark price will reach this value, the position will be liquidated.  # noqa: E501

        :param liquidation_price: The liquidation_price of this PositionData.  # noqa: E501
        :type: float
        """

        self._liquidation_price = liquidation_price

    @property
    def raw_data(self):
        """Gets the raw_data of this PositionData.  # noqa: E501


        :return: The raw_data of this PositionData.  # noqa: E501
        :rtype: object
        """
        return self._raw_data

    @raw_data.setter
    def raw_data(self, raw_data):
        """Sets the raw_data of this PositionData.


        :param raw_data: The raw_data of this PositionData.  # noqa: E501
        :type: object
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
