goog.provide('API.Client.ExchangeLoginRequire');

/**
 * @record
 */
API.Client.ExchangeLoginRequire = function() {}

/**
 * Exchange identifier and optional tag identifying specific account configured when the software will be managing multiple accounts on the same exchange; for eg:  <code>BITSTAMP</code> <code>BITSTAMP/7c177641-74bd-4dbe-9b01-2497c12a5f70`</code> <code>BITSTAMP/2574</code> Allowed separators between the exchange identifier and the tag: <code>~/.,:;\\!@#$%^&*-_+=.</code> 
 * @type {!string}
 * @export
 */
API.Client.ExchangeLoginRequire.prototype.exchangeId;

/**
 * Location identifier
 * @type {!string}
 * @export
 */
API.Client.ExchangeLoginRequire.prototype.locationId;

/**
 * Parameters required to log into the exchange
 * @type {!Array<!string>}
 * @export
 */
API.Client.ExchangeLoginRequire.prototype.requiredParameters;
