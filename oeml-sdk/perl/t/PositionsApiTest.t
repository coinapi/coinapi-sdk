=begin comment

OEML - REST API

This section will provide necessary information about the `CoinAPI OEML REST API` protocol. This API is also available in the Postman application: <a href=\"https://postman.coinapi.io/\" target=\"_blank\">https://postman.coinapi.io/</a>       

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator
# Please update the test cases below to test the API endpoints.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::OpenAPIClient::PositionsApi');

my $api = WWW::OpenAPIClient::PositionsApi->new();
isa_ok($api, 'WWW::OpenAPIClient::PositionsApi');

#
# v1_positions_get test
#
{
    my $exchange_id = undef; # replace NULL with a proper value
    my $result = $api->v1_positions_get(exchange_id => $exchange_id);
}


1;
