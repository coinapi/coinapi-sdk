"""
    OEML - REST API

    This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>         # noqa: E501

    The version of the OpenAPI document: v1
    Contact: support@coinapi.io
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import openapi_client
from openapi_client.model.severity import Severity
globals()['Severity'] = Severity
from openapi_client.model.message import Message


class TestMessage(unittest.TestCase):
    """Message unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testMessage(self):
        """Test Message"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Message()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
