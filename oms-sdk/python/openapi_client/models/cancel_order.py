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


class CancelOrder(object):
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
        'exchange_id': 'str',
        'exchange_order_id': 'str',
        'client_order_id': 'str'
    }

    attribute_map = {
        'exchange_id': 'exchange_id',
        'exchange_order_id': 'exchange_order_id',
        'client_order_id': 'client_order_id'
    }

    def __init__(self, exchange_id=None, exchange_order_id=None, client_order_id=None, local_vars_configuration=None):  # noqa: E501
        """CancelOrder - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._exchange_id = None
        self._exchange_order_id = None
        self._client_order_id = None
        self.discriminator = None

        if exchange_id is not None:
            self.exchange_id = exchange_id
        if exchange_order_id is not None:
            self.exchange_order_id = exchange_order_id
        if client_order_id is not None:
            self.client_order_id = client_order_id

    @property
    def exchange_id(self):
        """Gets the exchange_id of this CancelOrder.  # noqa: E501

        Exchange name  # noqa: E501

        :return: The exchange_id of this CancelOrder.  # noqa: E501
        :rtype: str
        """
        return self._exchange_id

    @exchange_id.setter
    def exchange_id(self, exchange_id):
        """Sets the exchange_id of this CancelOrder.

        Exchange name  # noqa: E501

        :param exchange_id: The exchange_id of this CancelOrder.  # noqa: E501
        :type: str
        """

        self._exchange_id = exchange_id

    @property
    def exchange_order_id(self):
        """Gets the exchange_order_id of this CancelOrder.  # noqa: E501

        Order Id  # noqa: E501

        :return: The exchange_order_id of this CancelOrder.  # noqa: E501
        :rtype: str
        """
        return self._exchange_order_id

    @exchange_order_id.setter
    def exchange_order_id(self, exchange_order_id):
        """Sets the exchange_order_id of this CancelOrder.

        Order Id  # noqa: E501

        :param exchange_order_id: The exchange_order_id of this CancelOrder.  # noqa: E501
        :type: str
        """

        self._exchange_order_id = exchange_order_id

    @property
    def client_order_id(self):
        """Gets the client_order_id of this CancelOrder.  # noqa: E501

        Client order Id  # noqa: E501

        :return: The client_order_id of this CancelOrder.  # noqa: E501
        :rtype: str
        """
        return self._client_order_id

    @client_order_id.setter
    def client_order_id(self, client_order_id):
        """Sets the client_order_id of this CancelOrder.

        Client order Id  # noqa: E501

        :param client_order_id: The client_order_id of this CancelOrder.  # noqa: E501
        :type: str
        """

        self._client_order_id = client_order_id

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
        if not isinstance(other, CancelOrder):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CancelOrder):
            return True

        return self.to_dict() != other.to_dict()
