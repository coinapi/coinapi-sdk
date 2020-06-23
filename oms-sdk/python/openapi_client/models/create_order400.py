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


class CreateOrder400(object):
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
        'type': 'str',
        'title': 'str',
        'status': 'float',
        'trace_id': 'str',
        'errors': 'str'
    }

    attribute_map = {
        'type': 'type',
        'title': 'title',
        'status': 'status',
        'trace_id': 'traceId',
        'errors': 'errors'
    }

    def __init__(self, type=None, title=None, status=None, trace_id=None, errors=None, local_vars_configuration=None):  # noqa: E501
        """CreateOrder400 - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._type = None
        self._title = None
        self._status = None
        self._trace_id = None
        self._errors = None
        self.discriminator = None

        if type is not None:
            self.type = type
        if title is not None:
            self.title = title
        if status is not None:
            self.status = status
        if trace_id is not None:
            self.trace_id = trace_id
        if errors is not None:
            self.errors = errors

    @property
    def type(self):
        """Gets the type of this CreateOrder400.  # noqa: E501


        :return: The type of this CreateOrder400.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this CreateOrder400.


        :param type: The type of this CreateOrder400.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def title(self):
        """Gets the title of this CreateOrder400.  # noqa: E501


        :return: The title of this CreateOrder400.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this CreateOrder400.


        :param title: The title of this CreateOrder400.  # noqa: E501
        :type: str
        """

        self._title = title

    @property
    def status(self):
        """Gets the status of this CreateOrder400.  # noqa: E501


        :return: The status of this CreateOrder400.  # noqa: E501
        :rtype: float
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this CreateOrder400.


        :param status: The status of this CreateOrder400.  # noqa: E501
        :type: float
        """

        self._status = status

    @property
    def trace_id(self):
        """Gets the trace_id of this CreateOrder400.  # noqa: E501


        :return: The trace_id of this CreateOrder400.  # noqa: E501
        :rtype: str
        """
        return self._trace_id

    @trace_id.setter
    def trace_id(self, trace_id):
        """Sets the trace_id of this CreateOrder400.


        :param trace_id: The trace_id of this CreateOrder400.  # noqa: E501
        :type: str
        """

        self._trace_id = trace_id

    @property
    def errors(self):
        """Gets the errors of this CreateOrder400.  # noqa: E501


        :return: The errors of this CreateOrder400.  # noqa: E501
        :rtype: str
        """
        return self._errors

    @errors.setter
    def errors(self, errors):
        """Sets the errors of this CreateOrder400.


        :param errors: The errors of this CreateOrder400.  # noqa: E501
        :type: str
        """

        self._errors = errors

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
        if not isinstance(other, CreateOrder400):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, CreateOrder400):
            return True

        return self.to_dict() != other.to_dict()
