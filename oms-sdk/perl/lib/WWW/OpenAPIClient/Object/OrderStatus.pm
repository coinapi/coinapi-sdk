=begin comment

OMS - REST API .

OMS Project

The version of the OpenAPI document: v1

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::Object::OrderStatus;

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


use base ("Class::Accessor", "Class::Data::Inheritable");

#
#Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. 
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

OMS - REST API .

OMS Project

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



__PACKAGE__->class_documentation({description => 'Order statuses ##### Status description  | Name | Possible transitions to | Status description  | --- | --- | --- | | RECEIVED | REJECTED, ROUTING | We received an order and will send it to the exchange immedaitely | ROUTING | ROUTED | We are in the process of sending order to the exchange | ROUTED | REJECTED, NEW, PARTIALLY_FILLED, FILLED, CANCELED | Order was sent to the exchange from our side, but it&#39;s not yet active in order book | NEW | PARTIALLY_FILLED, FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s untouched | PENDING_CANCEL | NEW, PARTIALLY_FILLED, FILLED, CANCELED | We received order cancel request and relayed it succesfully to the exchange.  | PARTIALLY_FILLED | FILLED, PENDING_CANCEL, CANCELED | Order is active in the order book and it&#39;s partially filled | FILLED | | Order is no longer active in the order book as was completely filled  | CANCELED | | Order is no longer active in the order book as was canceled | REJECTED | | Order was rejected by OMS or exchange. ##### Status transitions  | Source Status | Destination status | Description | --- | --- | --- | | | RECEIVED | OMS received new order from you | | NEW | OMS received unseen new order from the exchange (order was relayed to the exchnage outside the OMS) | | PARTIALLY_FILLED | OMS received unseen partially filled order from the exchange (order was relayed to the exchnage outside the OMS) | RECEIVED | REJECTED | OMS rejected your order | RECEIVED | ROUTING | We started relaying order to the exchange | ROUTING | ROUTED | Order was relayed to the exchange and we are waiting to be active in the order book | ROUTED | REJECTED | Exchange rejected your order | ROUTED | NEW | Exchange accepted your passive order into order book | ROUTED | PARTIALLY_FILLED | Exchange actively filled part of your order and the remaining was accepted into order book | ROUTED | FILLED | Exchange actively filled your order in whole. | ROUTED | CANCELED | Exchange canceled your order before accepting it to the order book. | NEW | PARTIALLY_FILLED | Part of your order was filled. | NEW | FILLED | Whole order was filled. | NEW | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | NEW | CANCELED | Your order was canceled. | PARTIALLY_FILLED | FILLED | Remaining active part of the order was filled succesfully. | PARTIALLY_FILLED | PENDING_CANCEL | We received cancel request and successfully relayed it to the exchange. | PARTIALLY_FILLED | CANCELED | Your order was canceled. | PENDING_CANCEL | NEW | Exchange responded to the cancelation message that your order is fully active in the order book. | PENDING_CANCEL | PARTIALLY_FILLED | Your order was filled partially after we relayed cancelation message to the exchange. | PENDING_CANCEL | FILLED | Your order was completely filled before the cancel was executed by the exchange. | PENDING_CANCEL | CANCELED | Your order was canceled. ',
                                  class => 'OrderStatus',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
});

__PACKAGE__->openapi_types( {
    
} );

__PACKAGE__->attribute_map( {
    
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
