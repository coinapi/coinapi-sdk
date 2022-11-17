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
package WWW::OpenAPIClient::Object::UniswapV2PairDTO;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use WWW::OpenAPIClient::Object::NumericsBigInteger;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

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
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {});
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new {
    my ($class, %args) = @_;

    my $self = bless {}, $class;

    $self->init(%args);

    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON {
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            my $_json_attribute = $self->attribute_map->{$_key};
            my $_type = $self->openapi_types->{$_key};
            my $_value = $self->{$_key};
            if ($_type =~ /^array\[(.+)\]$/i) { # array
                my $_subclass = $1;
                $_data->{$_json_attribute} =  [ map { $self->_to_json_primitives($_subclass, $_) } @$_value ];
            } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
                my $_subclass = $1;
                my %_hash = ();
                while (my($_key, $_element) = each %{$_value}) {
                    $_hash{$_key} = $self->_to_json_primitives($_subclass, $_element);
                }
                $_data->{$_json_attribute} = \%_hash;
            } elsif ( grep( /^$_type$/, ('int', 'double', 'string', 'boolean', 'DATE', 'DATE_TIME'))) {
                $_data->{$_json_attribute} = $self->_to_json_primitives($_type, $_value);
            } else {
                $_data->{$_json_attribute} = $_value;
            }
        }
    }

    return $_data;
}

# to_json non-array data
sub _to_json_primitives {
    my ($self, $type, $data) = @_;
    if ( grep( /^$type$/, ('int', 'double'))) {
        # https://metacpan.org/pod/JSON#simple-scalars
        # numify it, ensuring it will be dumped as a number
        return undef unless defined $data;
        return $data + 0;
    } elsif ($type eq 'string') {
        # https://metacpan.org/pod/JSON#simple-scalars
        # stringified
        return undef unless defined $data;
        return $data . q();
    } elsif ($type eq 'boolean') {
        # https://metacpan.org/pod/JSON#JSON::true,-JSON::false,-JSON::null
        return $data ? \1 : \0;
    } elsif ($type eq 'DATE') {
        return undef unless defined $data;
        if (ref($data) eq 'DateTime') {
            # https://metacpan.org/pod/DateTime#$dt-%3Eymd($optional_separator),-$dt-%3Emdy(...),-$dt-%3Edmy(...)
            return $data->ymd;
        }
        return $data .q();
    } elsif ($type eq 'DATE_TIME') {
        return undef unless defined $data;
        # the date-time notation as defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z
        if (ref($data) eq 'DateTime') {
            # https://metacpan.org/pod/DateTime#$dt-%3Erfc3339
            return $data->rfc3339;
        }
        return $data .q();
    } else { # hash (model),  In this case, the TO_JSON of the $data object is executed
        return $data;
    }
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key};
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }

    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if (grep( /^$type$/ , ('DATE_TIME', 'DATE'))) {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double'))) {
        return undef unless defined $data;
        return $data + 0;
    } elsif ($type eq 'string') {
        return undef unless defined $data;
        return $data . q();
    } elsif ($type eq 'boolean') {
        return !!$data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}


__PACKAGE__->class_documentation({description => 'Information about a pair. Includes references to each token within the pair, volume information, liquidity information, and more. The pair entity mirrors the pair smart contract, and also contains aggregated information about use.',
                                  class => 'UniswapV2PairDTO',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'entry_time' => {
        datatype => 'DATE_TIME',
        base_name => 'entry_time',
        description => '',
        format => '',
        read_only => '',
            },
    'recv_time' => {
        datatype => 'DATE_TIME',
        base_name => 'recv_time',
        description => '',
        format => '',
        read_only => '',
            },
    'block_number' => {
        datatype => 'int',
        base_name => 'block_number',
        description => 'Number of block in which entity was recorded.',
        format => '',
        read_only => '',
            },
    'vid' => {
        datatype => 'int',
        base_name => 'vid',
        description => '',
        format => '',
        read_only => '',
            },
    'id' => {
        datatype => 'string',
        base_name => 'id',
        description => 'Pair contract address.',
        format => '',
        read_only => '',
            },
    'token_0' => {
        datatype => 'string',
        base_name => 'token_0',
        description => 'Reference to token0 as stored in pair contract.',
        format => '',
        read_only => '',
            },
    'token_1' => {
        datatype => 'string',
        base_name => 'token_1',
        description => 'Reference to token1 as stored in pair contract.',
        format => '',
        read_only => '',
            },
    'reserve_0' => {
        datatype => 'string',
        base_name => 'reserve_0',
        description => 'Reserve of token0.',
        format => '',
        read_only => '',
            },
    'reserve_1' => {
        datatype => 'string',
        base_name => 'reserve_1',
        description => 'Reserve of token1.',
        format => '',
        read_only => '',
            },
    'total_supply' => {
        datatype => 'string',
        base_name => 'total_supply',
        description => 'Total supply of liquidity token distributed to LPs.',
        format => '',
        read_only => '',
            },
    'reserve_eth' => {
        datatype => 'string',
        base_name => 'reserve_eth',
        description => 'Total liquidity in pair stored as an amount of ETH.',
        format => '',
        read_only => '',
            },
    'reserve_usd' => {
        datatype => 'string',
        base_name => 'reserve_usd',
        description => 'Total liquidity amount in pair stored as an amount of USD.',
        format => '',
        read_only => '',
            },
    'tracked_reserve_eth' => {
        datatype => 'string',
        base_name => 'tracked_reserve_eth',
        description => 'Total liquidity with only tracked amount.',
        format => '',
        read_only => '',
            },
    'token_0_price' => {
        datatype => 'string',
        base_name => 'token_0_price',
        description => 'Token0 per token1.',
        format => '',
        read_only => '',
            },
    'token_1_price' => {
        datatype => 'string',
        base_name => 'token_1_price',
        description => 'Token1 per token0.',
        format => '',
        read_only => '',
            },
    'volume_token_0' => {
        datatype => 'string',
        base_name => 'volume_token_0',
        description => 'Amount of token0 swapped on this pair.',
        format => '',
        read_only => '',
            },
    'volume_token_1' => {
        datatype => 'string',
        base_name => 'volume_token_1',
        description => 'Amount of token1 swapped on this pair.',
        format => '',
        read_only => '',
            },
    'volume_usd' => {
        datatype => 'string',
        base_name => 'volume_usd',
        description => 'Total amount swapped all time in this pair stored in USD (only tracked if USD liquidity is above minimum threshold).',
        format => '',
        read_only => '',
            },
    'untracked_volume_usd' => {
        datatype => 'string',
        base_name => 'untracked_volume_usd',
        description => 'Total amount swapped all time in this pair stored in USD, no minimum liquidity threshold.',
        format => '',
        read_only => '',
            },
    'tx_count' => {
        datatype => 'NumericsBigInteger',
        base_name => 'tx_count',
        description => '',
        format => '',
        read_only => '',
            },
    'created_at_timestamp' => {
        datatype => 'DATE_TIME',
        base_name => 'created_at_timestamp',
        description => 'Timestamp contract was created.',
        format => '',
        read_only => '',
            },
    'liquidity_provider_count' => {
        datatype => 'string',
        base_name => 'liquidity_provider_count',
        description => 'Total number of LPs.',
        format => '',
        read_only => '',
            },
    'evaluated_ask' => {
        datatype => 'double',
        base_name => 'evaluated_ask',
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'entry_time' => 'DATE_TIME',
    'recv_time' => 'DATE_TIME',
    'block_number' => 'int',
    'vid' => 'int',
    'id' => 'string',
    'token_0' => 'string',
    'token_1' => 'string',
    'reserve_0' => 'string',
    'reserve_1' => 'string',
    'total_supply' => 'string',
    'reserve_eth' => 'string',
    'reserve_usd' => 'string',
    'tracked_reserve_eth' => 'string',
    'token_0_price' => 'string',
    'token_1_price' => 'string',
    'volume_token_0' => 'string',
    'volume_token_1' => 'string',
    'volume_usd' => 'string',
    'untracked_volume_usd' => 'string',
    'tx_count' => 'NumericsBigInteger',
    'created_at_timestamp' => 'DATE_TIME',
    'liquidity_provider_count' => 'string',
    'evaluated_ask' => 'double'
} );

__PACKAGE__->attribute_map( {
    'entry_time' => 'entry_time',
    'recv_time' => 'recv_time',
    'block_number' => 'block_number',
    'vid' => 'vid',
    'id' => 'id',
    'token_0' => 'token_0',
    'token_1' => 'token_1',
    'reserve_0' => 'reserve_0',
    'reserve_1' => 'reserve_1',
    'total_supply' => 'total_supply',
    'reserve_eth' => 'reserve_eth',
    'reserve_usd' => 'reserve_usd',
    'tracked_reserve_eth' => 'tracked_reserve_eth',
    'token_0_price' => 'token_0_price',
    'token_1_price' => 'token_1_price',
    'volume_token_0' => 'volume_token_0',
    'volume_token_1' => 'volume_token_1',
    'volume_usd' => 'volume_usd',
    'untracked_volume_usd' => 'untracked_volume_usd',
    'tx_count' => 'tx_count',
    'created_at_timestamp' => 'created_at_timestamp',
    'liquidity_provider_count' => 'liquidity_provider_count',
    'evaluated_ask' => 'evaluated_ask'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
