=begin comment

OMS - REST API .

OMS Project

The version of the OpenAPI document: v1

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

use_ok('WWW::OpenAPIClient::OrdersApi');

my $api = WWW::OpenAPIClient::OrdersApi->new();
isa_ok($api, 'WWW::OpenAPIClient::OrdersApi');

#
# v1_orders_cancel_all_post test
#
{
    my $cancel_all_order = undef; # replace NULL with a proper value
    my $result = $api->v1_orders_cancel_all_post(cancel_all_order => $cancel_all_order);
}

#
# v1_orders_cancel_post test
#
{
    my $cancel_order = undef; # replace NULL with a proper value
    my $result = $api->v1_orders_cancel_post(cancel_order => $cancel_order);
}

#
# v1_orders_get test
#
{
    my $exchange_id = undef; # replace NULL with a proper value
    my $result = $api->v1_orders_get(exchange_id => $exchange_id);
}

#
# v1_orders_post test
#
{
    my $new_order = undef; # replace NULL with a proper value
    my $result = $api->v1_orders_post(new_order => $new_order);
}


1;
