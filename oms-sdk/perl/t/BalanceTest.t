=begin comment

OMS - REST API .

OMS Project

The version of the OpenAPI document: v1

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by the OpenAPI Generator
# Please update the test cases below to test the model.
# Ref: https://openapi-generator.tech
#
use Test::More tests => 2;
use Test::Exception;

use lib 'lib';
use strict;
use warnings;


use_ok('WWW::OpenAPIClient::Object::Balance');

my $instance = WWW::OpenAPIClient::Object::Balance->new();

isa_ok($instance, 'WWW::OpenAPIClient::Object::Balance');

