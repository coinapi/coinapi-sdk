=begin comment

OnChain API

 This section will provide necessary information about the `OnChain API` protocol.  <br/><br/> Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.                             

The version of the OpenAPI document: v1
Contact: support@coinapi.io
Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::CowApi;

require 5.6.0;
use strict;
use warnings;
use utf8;
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::OpenAPIClient::ApiClient;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class = shift;
    my $api_client;

    if ($_[0] && ref $_[0] && ref $_[0] eq 'WWW::OpenAPIClient::ApiClient' ) {
        $api_client = $_[0];
    } else {
        $api_client = WWW::OpenAPIClient::ApiClient->new(@_);
    }

    bless { api_client => $api_client }, $class;

}


#
# cow_get_orders__historical
#
# GetOrders (historical)
#
# @param int $start_block  (optional)
# @param int $end_block  (optional)
# @param DATE_TIME $start_date  (optional)
# @param DATE_TIME $end_date  (optional)
{
    my $params = {
    'start_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'end_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'start_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    'end_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'cow_get_orders__historical' } = {
        summary => 'GetOrders (historical)',
        params => $params,
        returns => 'ARRAY[CowOrderDTO]',
        };
}
# @return ARRAY[CowOrderDTO]
#
sub cow_get_orders__historical {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/dapps/cow/orders/historical';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('text/plain', 'application/json', 'text/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'start_block'}) {
        $query_params->{'startBlock'} = $self->{api_client}->to_query_value($args{'start_block'});
    }

    # query params
    if ( exists $args{'end_block'}) {
        $query_params->{'endBlock'} = $self->{api_client}->to_query_value($args{'end_block'});
    }

    # query params
    if ( exists $args{'start_date'}) {
        $query_params->{'startDate'} = $self->{api_client}->to_query_value($args{'start_date'});
    }

    # query params
    if ( exists $args{'end_date'}) {
        $query_params->{'endDate'} = $self->{api_client}->to_query_value($args{'end_date'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[CowOrderDTO]', $response);
    return $_response_object;
}

#
# cow_get_settlements__historical
#
# GetSettlements (historical)
#
# @param int $start_block  (optional)
# @param int $end_block  (optional)
# @param DATE_TIME $start_date  (optional)
# @param DATE_TIME $end_date  (optional)
{
    my $params = {
    'start_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'end_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'start_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    'end_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'cow_get_settlements__historical' } = {
        summary => 'GetSettlements (historical)',
        params => $params,
        returns => 'ARRAY[CowSettlementDTO]',
        };
}
# @return ARRAY[CowSettlementDTO]
#
sub cow_get_settlements__historical {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/dapps/cow/settlements/historical';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('text/plain', 'application/json', 'text/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'start_block'}) {
        $query_params->{'startBlock'} = $self->{api_client}->to_query_value($args{'start_block'});
    }

    # query params
    if ( exists $args{'end_block'}) {
        $query_params->{'endBlock'} = $self->{api_client}->to_query_value($args{'end_block'});
    }

    # query params
    if ( exists $args{'start_date'}) {
        $query_params->{'startDate'} = $self->{api_client}->to_query_value($args{'start_date'});
    }

    # query params
    if ( exists $args{'end_date'}) {
        $query_params->{'endDate'} = $self->{api_client}->to_query_value($args{'end_date'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[CowSettlementDTO]', $response);
    return $_response_object;
}

#
# cow_get_tokens__historical
#
# GetTokens (historical) 🔥
#
# @param int $start_block  (optional)
# @param int $end_block  (optional)
# @param DATE_TIME $start_date  (optional)
# @param DATE_TIME $end_date  (optional)
# @param string $token_id  (optional)
{
    my $params = {
    'start_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'end_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'start_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    'end_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    'token_id' => {
        data_type => 'string',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'cow_get_tokens__historical' } = {
        summary => 'GetTokens (historical) 🔥',
        params => $params,
        returns => 'ARRAY[CowTokenDTO]',
        };
}
# @return ARRAY[CowTokenDTO]
#
sub cow_get_tokens__historical {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/dapps/cow/tokens/historical';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('text/plain', 'application/json', 'text/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'start_block'}) {
        $query_params->{'startBlock'} = $self->{api_client}->to_query_value($args{'start_block'});
    }

    # query params
    if ( exists $args{'end_block'}) {
        $query_params->{'endBlock'} = $self->{api_client}->to_query_value($args{'end_block'});
    }

    # query params
    if ( exists $args{'start_date'}) {
        $query_params->{'startDate'} = $self->{api_client}->to_query_value($args{'start_date'});
    }

    # query params
    if ( exists $args{'end_date'}) {
        $query_params->{'endDate'} = $self->{api_client}->to_query_value($args{'end_date'});
    }

    # query params
    if ( exists $args{'token_id'}) {
        $query_params->{'tokenId'} = $self->{api_client}->to_query_value($args{'token_id'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[CowTokenDTO]', $response);
    return $_response_object;
}

#
# cow_get_trades__historical
#
# GetTrades (historical) 🔥
#
# @param int $start_block  (optional)
# @param int $end_block  (optional)
# @param DATE_TIME $start_date  (optional)
# @param DATE_TIME $end_date  (optional)
{
    my $params = {
    'start_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'end_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'start_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    'end_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'cow_get_trades__historical' } = {
        summary => 'GetTrades (historical) 🔥',
        params => $params,
        returns => 'ARRAY[CowTradeDTO]',
        };
}
# @return ARRAY[CowTradeDTO]
#
sub cow_get_trades__historical {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/dapps/cow/trades/historical';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('text/plain', 'application/json', 'text/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'start_block'}) {
        $query_params->{'startBlock'} = $self->{api_client}->to_query_value($args{'start_block'});
    }

    # query params
    if ( exists $args{'end_block'}) {
        $query_params->{'endBlock'} = $self->{api_client}->to_query_value($args{'end_block'});
    }

    # query params
    if ( exists $args{'start_date'}) {
        $query_params->{'startDate'} = $self->{api_client}->to_query_value($args{'start_date'});
    }

    # query params
    if ( exists $args{'end_date'}) {
        $query_params->{'endDate'} = $self->{api_client}->to_query_value($args{'end_date'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[CowTradeDTO]', $response);
    return $_response_object;
}

#
# cow_get_users__historical
#
# GetUsers (historical)
#
# @param int $start_block  (optional)
# @param int $end_block  (optional)
# @param DATE_TIME $start_date  (optional)
# @param DATE_TIME $end_date  (optional)
{
    my $params = {
    'start_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'end_block' => {
        data_type => 'int',
        description => '',
        required => '0',
    },
    'start_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    'end_date' => {
        data_type => 'DATE_TIME',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'cow_get_users__historical' } = {
        summary => 'GetUsers (historical)',
        params => $params,
        returns => 'ARRAY[CowUserDTO]',
        };
}
# @return ARRAY[CowUserDTO]
#
sub cow_get_users__historical {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/dapps/cow/users/historical';

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('text/plain', 'application/json', 'text/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'start_block'}) {
        $query_params->{'startBlock'} = $self->{api_client}->to_query_value($args{'start_block'});
    }

    # query params
    if ( exists $args{'end_block'}) {
        $query_params->{'endBlock'} = $self->{api_client}->to_query_value($args{'end_block'});
    }

    # query params
    if ( exists $args{'start_date'}) {
        $query_params->{'startDate'} = $self->{api_client}->to_query_value($args{'start_date'});
    }

    # query params
    if ( exists $args{'end_date'}) {
        $query_params->{'endDate'} = $self->{api_client}->to_query_value($args{'end_date'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('ARRAY[CowUserDTO]', $response);
    return $_response_object;
}

1;
