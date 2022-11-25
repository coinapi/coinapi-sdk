=begin comment

On Chain Dapps - REST API

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
package WWW::OpenAPIClient::Object::CowTradeDTO;

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

use WWW::OpenAPIClient::Object::TransactionsETradeAggressiveSide;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#Trade entity.
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

On Chain Dapps - REST API

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


__PACKAGE__->class_documentation({description => 'Trade entity.',
                                  class => 'CowTradeDTO',
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
    'id' => {
        datatype => 'string',
        base_name => 'id',
        description => 'Identifier, format: &lt;order id&gt;|&lt;transaction hash&gt;|&lt;event index&gt;.',
        format => '',
        read_only => '',
            },
    'timestamp' => {
        datatype => 'string',
        base_name => 'timestamp',
        description => 'Block&#39;s timestamp.',
        format => '',
        read_only => '',
            },
    'gas_price' => {
        datatype => 'string',
        base_name => 'gas_price',
        description => 'Transaction&#39;s gas price.',
        format => '',
        read_only => '',
            },
    'gas_limit' => {
        datatype => 'string',
        base_name => 'gas_limit',
        description => 'Transaction&#39;s gas limit.',
        format => '',
        read_only => '',
            },
    'fee_amount' => {
        datatype => 'string',
        base_name => 'fee_amount',
        description => 'Trade&#39;s fee amount.',
        format => '',
        read_only => '',
            },
    'tx_hash' => {
        datatype => 'string',
        base_name => 'tx_hash',
        description => 'Trade event transaction hash.',
        format => '',
        read_only => '',
            },
    'settlement' => {
        datatype => 'string',
        base_name => 'settlement',
        description => 'Reference to settlement.',
        format => '',
        read_only => '',
            },
    'buy_amount' => {
        datatype => 'string',
        base_name => 'buy_amount',
        description => 'Buy amount.',
        format => '',
        read_only => '',
            },
    'sell_amount' => {
        datatype => 'string',
        base_name => 'sell_amount',
        description => 'Sell amount.',
        format => '',
        read_only => '',
            },
    'sell_token' => {
        datatype => 'string',
        base_name => 'sell_token',
        description => 'Address of token that is sold.',
        format => '',
        read_only => '',
            },
    'buy_token' => {
        datatype => 'string',
        base_name => 'buy_token',
        description => 'Address of token that is bought.',
        format => '',
        read_only => '',
            },
    'order' => {
        datatype => 'string',
        base_name => 'order',
        description => 'Reference to order.',
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
    'pool_id' => {
        datatype => 'string',
        base_name => 'pool_id',
        description => '',
        format => '',
        read_only => '',
            },
    'transaction_id' => {
        datatype => 'string',
        base_name => 'transaction_id',
        description => '',
        format => '',
        read_only => '',
            },
    'evaluated_price' => {
        datatype => 'double',
        base_name => 'evaluated_price',
        description => '',
        format => '',
        read_only => '',
            },
    'evaluated_amount' => {
        datatype => 'double',
        base_name => 'evaluated_amount',
        description => '',
        format => '',
        read_only => '',
            },
    'evaluated_aggressor' => {
        datatype => 'TransactionsETradeAggressiveSide',
        base_name => 'evaluated_aggressor',
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'entry_time' => 'DATE_TIME',
    'recv_time' => 'DATE_TIME',
    'block_number' => 'int',
    'id' => 'string',
    'timestamp' => 'string',
    'gas_price' => 'string',
    'gas_limit' => 'string',
    'fee_amount' => 'string',
    'tx_hash' => 'string',
    'settlement' => 'string',
    'buy_amount' => 'string',
    'sell_amount' => 'string',
    'sell_token' => 'string',
    'buy_token' => 'string',
    'order' => 'string',
    'vid' => 'int',
    'pool_id' => 'string',
    'transaction_id' => 'string',
    'evaluated_price' => 'double',
    'evaluated_amount' => 'double',
    'evaluated_aggressor' => 'TransactionsETradeAggressiveSide'
} );

__PACKAGE__->attribute_map( {
    'entry_time' => 'entry_time',
    'recv_time' => 'recv_time',
    'block_number' => 'block_number',
    'id' => 'id',
    'timestamp' => 'timestamp',
    'gas_price' => 'gas_price',
    'gas_limit' => 'gas_limit',
    'fee_amount' => 'fee_amount',
    'tx_hash' => 'tx_hash',
    'settlement' => 'settlement',
    'buy_amount' => 'buy_amount',
    'sell_amount' => 'sell_amount',
    'sell_token' => 'sell_token',
    'buy_token' => 'buy_token',
    'order' => 'order',
    'vid' => 'vid',
    'pool_id' => 'pool_id',
    'transaction_id' => 'transaction_id',
    'evaluated_price' => 'evaluated_price',
    'evaluated_amount' => 'evaluated_amount',
    'evaluated_aggressor' => 'evaluated_aggressor'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
