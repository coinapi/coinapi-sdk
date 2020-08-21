# coding: utf-8

"""
    OEML - REST API

    This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>         # noqa: E501

    The version of the OpenAPI document: v1
    Contact: support@coinapi.io
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import openapi_client
from openapi_client.models.balance import Balance  # noqa: E501
from openapi_client.rest import ApiException

class TestBalance(unittest.TestCase):
    """Balance unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test Balance
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = openapi_client.models.balance.Balance()  # noqa: E501
        if include_optional :
            return Balance(
                exchange_id = 'KRAKEN', 
                data = [
                    openapi_client.models.balance_data.Balance_data(
                        asset_id_exchange = 'XBT', 
                        asset_id_coinapi = 'BTC', 
                        balance = 0.00134444, 
                        available = 0.00134444, 
                        locked = 0.0, 
                        last_updated_by = 'EXCHANGE', 
                        rate_usd = 1355.12, 
                        traded = 0.007, )
                    ]
            )
        else :
            return Balance(
        )

    def testBalance(self):
        """Test Balance"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
