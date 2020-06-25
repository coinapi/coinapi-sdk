# coding: utf-8

"""
    OMS - REST API .

    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama.   # noqa: E501

    The version of the OpenAPI document: v1
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class BalanceData(object):
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
        'balance': 'float',
        'available': 'float',
        'locked': 'float',
        'update_origin': 'str'
    }

    attribute_map = {
        'id': 'id',
        'symbol_exchange': 'symbol_exchange',
        'symbol_coinapi': 'symbol_coinapi',
        'balance': 'balance',
        'available': 'available',
        'locked': 'locked',
        'update_origin': 'update_origin'
    }

    def __init__(self, id=None, symbol_exchange=None, symbol_coinapi=None, balance=None, available=None, locked=None, update_origin=None, local_vars_configuration=None):  # noqa: E501
        """BalanceData - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._symbol_exchange = None
        self._symbol_coinapi = None
        self._balance = None
        self._available = None
        self._locked = None
        self._update_origin = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if symbol_exchange is not None:
            self.symbol_exchange = symbol_exchange
        if symbol_coinapi is not None:
            self.symbol_coinapi = symbol_coinapi
        if balance is not None:
            self.balance = balance
        if available is not None:
            self.available = available
        if locked is not None:
            self.locked = locked
        if update_origin is not None:
            self.update_origin = update_origin

    @property
    def id(self):
        """Gets the id of this BalanceData.  # noqa: E501

        symbol_exchange  # noqa: E501

        :return: The id of this BalanceData.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this BalanceData.

        symbol_exchange  # noqa: E501

        :param id: The id of this BalanceData.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def symbol_exchange(self):
        """Gets the symbol_exchange of this BalanceData.  # noqa: E501

        Currency code.  # noqa: E501

        :return: The symbol_exchange of this BalanceData.  # noqa: E501
        :rtype: str
        """
        return self._symbol_exchange

    @symbol_exchange.setter
    def symbol_exchange(self, symbol_exchange):
        """Sets the symbol_exchange of this BalanceData.

        Currency code.  # noqa: E501

        :param symbol_exchange: The symbol_exchange of this BalanceData.  # noqa: E501
        :type: str
        """

        self._symbol_exchange = symbol_exchange

    @property
    def symbol_coinapi(self):
        """Gets the symbol_coinapi of this BalanceData.  # noqa: E501

        CoinAPI currency code.  # noqa: E501

        :return: The symbol_coinapi of this BalanceData.  # noqa: E501
        :rtype: str
        """
        return self._symbol_coinapi

    @symbol_coinapi.setter
    def symbol_coinapi(self, symbol_coinapi):
        """Sets the symbol_coinapi of this BalanceData.

        CoinAPI currency code.  # noqa: E501

        :param symbol_coinapi: The symbol_coinapi of this BalanceData.  # noqa: E501
        :type: str
        """

        self._symbol_coinapi = symbol_coinapi

    @property
    def balance(self):
        """Gets the balance of this BalanceData.  # noqa: E501

        The current balance.  # noqa: E501

        :return: The balance of this BalanceData.  # noqa: E501
        :rtype: float
        """
        return self._balance

    @balance.setter
    def balance(self, balance):
        """Sets the balance of this BalanceData.

        The current balance.  # noqa: E501

        :param balance: The balance of this BalanceData.  # noqa: E501
        :type: float
        """

        self._balance = balance

    @property
    def available(self):
        """Gets the available of this BalanceData.  # noqa: E501

        The amount that is available to trade.  # noqa: E501

        :return: The available of this BalanceData.  # noqa: E501
        :rtype: float
        """
        return self._available

    @available.setter
    def available(self, available):
        """Sets the available of this BalanceData.

        The amount that is available to trade.  # noqa: E501

        :param available: The available of this BalanceData.  # noqa: E501
        :type: float
        """

        self._available = available

    @property
    def locked(self):
        """Gets the locked of this BalanceData.  # noqa: E501

        Blocked funds.  # noqa: E501

        :return: The locked of this BalanceData.  # noqa: E501
        :rtype: float
        """
        return self._locked

    @locked.setter
    def locked(self, locked):
        """Sets the locked of this BalanceData.

        Blocked funds.  # noqa: E501

        :param locked: The locked of this BalanceData.  # noqa: E501
        :type: float
        """

        self._locked = locked

    @property
    def update_origin(self):
        """Gets the update_origin of this BalanceData.  # noqa: E501

        Source of last modification.   # noqa: E501

        :return: The update_origin of this BalanceData.  # noqa: E501
        :rtype: str
        """
        return self._update_origin

    @update_origin.setter
    def update_origin(self, update_origin):
        """Sets the update_origin of this BalanceData.

        Source of last modification.   # noqa: E501

        :param update_origin: The update_origin of this BalanceData.  # noqa: E501
        :type: str
        """
        allowed_values = ["INITIALIZATION", "BALANCE_MANAGER", "EXCHANGE"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and update_origin not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `update_origin` ({0}), must be one of {1}"  # noqa: E501
                .format(update_origin, allowed_values)
            )

        self._update_origin = update_origin

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
        if not isinstance(other, BalanceData):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BalanceData):
            return True

        return self.to_dict() != other.to_dict()
