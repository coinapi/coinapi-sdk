# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import openapi_client
from openapi_client.paths.dapps_sushiswap_pools_historical import get  # noqa: E501
from openapi_client import configuration, schemas, api_client

from .. import ApiTestMixin


class TestDappsSushiswapPoolsHistorical(ApiTestMixin, unittest.TestCase):
    """
    DappsSushiswapPoolsHistorical unit test stubs
        Gets list of ETH.DeFi.DTO.Sushiswap.PairDTO data for the given filters.  # noqa: E501
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = get.ApiForget(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 200








if __name__ == '__main__':
    unittest.main()
