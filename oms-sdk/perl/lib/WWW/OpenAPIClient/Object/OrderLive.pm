=begin comment

OMS - REST API .

Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 

The version of the OpenAPI document: v1

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::Object::OrderLive;

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

use WWW::OpenAPIClient::Object::OrderStatus;
use WWW::OpenAPIClient::Object::TimeInForce;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

OMS - REST API .

Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. ###Lifecycle Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham. ###Lifecycle 2 Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackhama. 

The version of the OpenAPI document: v1

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
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }

    return $_data;
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

    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => '',
                                  class => 'OrderLive',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'type' => {
        datatype => 'string',
        base_name => 'type',
        description => 'Result type name',
        format => '',
        read_only => '',
            },
    'exchange_id' => {
        datatype => 'string',
        base_name => 'exchange_id',
        description => 'Exchange name',
        format => '',
        read_only => '',
            },
    'id' => {
        datatype => 'string',
        base_name => 'id',
        description => 'Client unique identifier for the trade.',
        format => '',
        read_only => '',
            },
    'client_order_id_format_exchange' => {
        datatype => 'string',
        base_name => 'client_order_id_format_exchange',
        description => 'Hash client id',
        format => '',
        read_only => '',
            },
    'exchange_order_id' => {
        datatype => 'string',
        base_name => 'exchange_order_id',
        description => 'Exchange order id',
        format => '',
        read_only => '',
            },
    'amount_open' => {
        datatype => 'double',
        base_name => 'amount_open',
        description => 'Amount open',
        format => '',
        read_only => '',
            },
    'amount_filled' => {
        datatype => 'double',
        base_name => 'amount_filled',
        description => 'Amount filled',
        format => '',
        read_only => '',
            },
    'status' => {
        datatype => 'OrderStatus',
        base_name => 'status',
        description => '',
        format => '',
        read_only => '',
            },
    'time_order' => {
        datatype => 'ARRAY[ARRAY[string]]',
        base_name => 'time_order',
        description => 'History of order status changes',
        format => '',
        read_only => '',
            },
    'error_message' => {
        datatype => 'string',
        base_name => 'error_message',
        description => 'Error message',
        format => '',
        read_only => '',
            },
    'client_order_id' => {
        datatype => 'string',
        base_name => 'client_order_id',
        description => 'Client unique identifier for the trade.',
        format => '',
        read_only => '',
            },
    'symbol_exchange' => {
        datatype => 'string',
        base_name => 'symbol_exchange',
        description => 'The symbol of the order.',
        format => '',
        read_only => '',
            },
    'symbol_coinapi' => {
        datatype => 'string',
        base_name => 'symbol_coinapi',
        description => 'The CoinAPI symbol of the order.',
        format => '',
        read_only => '',
            },
    'amount_order' => {
        datatype => 'double',
        base_name => 'amount_order',
        description => 'Quoted decimal amount to purchase.',
        format => '',
        read_only => '',
            },
    'price' => {
        datatype => 'double',
        base_name => 'price',
        description => 'Quoted decimal amount to spend per unit.',
        format => '',
        read_only => '',
            },
    'side' => {
        datatype => 'string',
        base_name => 'side',
        description => 'Buy or Sell',
        format => '',
        read_only => '',
            },
    'order_type' => {
        datatype => 'string',
        base_name => 'order_type',
        description => 'The order type.',
        format => '',
        read_only => '',
            },
    'time_in_force' => {
        datatype => 'TimeInForce',
        base_name => 'time_in_force',
        description => '',
        format => '',
        read_only => '',
            },
    'expire_time' => {
        datatype => 'DateTime',
        base_name => 'expire_time',
        description => 'Required for orders with time_in_force &#x3D; GOOD_TILL_TIME_EXCHANGE, GOOD_TILL_TIME_OMS',
        format => '',
        read_only => '',
            },
    'exec_inst' => {
        datatype => 'ARRAY[string]',
        base_name => 'exec_inst',
        description => 'TODO: description exec inst  | Parameter | Description | |-----------|--------| | &#x60;MAKER_OR_CANCEL&#x60; | Rests on the continuous order book at a specified price. If any quantity can be filled immediately, the entire order is canceled. | ##### Exec inst options  | Exchange | MAKER_OR_CANCEL | | --- | --- | | BINANCE | X | | BITFINEX | X | | BITMEX | X | | BLOCKCHAINEXCHANGE | X | | BITSTAMP |  | | COINBASE | X | | GEMINI | X | | KRAKEN | X | | POLONIEX | X | | HITBTC |  | | KRAKENFTS | X | ',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'type' => 'string',
    'exchange_id' => 'string',
    'id' => 'string',
    'client_order_id_format_exchange' => 'string',
    'exchange_order_id' => 'string',
    'amount_open' => 'double',
    'amount_filled' => 'double',
    'status' => 'OrderStatus',
    'time_order' => 'ARRAY[ARRAY[string]]',
    'error_message' => 'string',
    'client_order_id' => 'string',
    'symbol_exchange' => 'string',
    'symbol_coinapi' => 'string',
    'amount_order' => 'double',
    'price' => 'double',
    'side' => 'string',
    'order_type' => 'string',
    'time_in_force' => 'TimeInForce',
    'expire_time' => 'DateTime',
    'exec_inst' => 'ARRAY[string]'
} );

__PACKAGE__->attribute_map( {
    'type' => 'type',
    'exchange_id' => 'exchange_id',
    'id' => 'id',
    'client_order_id_format_exchange' => 'client_order_id_format_exchange',
    'exchange_order_id' => 'exchange_order_id',
    'amount_open' => 'amount_open',
    'amount_filled' => 'amount_filled',
    'status' => 'status',
    'time_order' => 'time_order',
    'error_message' => 'error_message',
    'client_order_id' => 'client_order_id',
    'symbol_exchange' => 'symbol_exchange',
    'symbol_coinapi' => 'symbol_coinapi',
    'amount_order' => 'amount_order',
    'price' => 'price',
    'side' => 'side',
    'order_type' => 'order_type',
    'time_in_force' => 'time_in_force',
    'expire_time' => 'expire_time',
    'exec_inst' => 'exec_inst'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
