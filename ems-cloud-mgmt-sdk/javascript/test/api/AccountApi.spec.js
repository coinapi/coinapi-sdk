/**
 * EMS - Managed Cloud REST API
 * This section will provide necessary information about the `CoinAPI EMS Managed Cloud REST API` protocol.  <br/><br/> This API is used to manage the overall deployment of **Execution Management System API** (`EMS API`) software,  which means that in this API, you define the accounts, credentials, and configurations for the order destinations or identify the CoinAPI endpoints where you need to connect to access the `EMS API`.  <br/><br/> Implemented Standards:   * [HTTP1.0](https://datatracker.ietf.org/doc/html/rfc1945)  * [HTTP1.1](https://datatracker.ietf.org/doc/html/rfc2616)  * [HTTP2.0](https://datatracker.ietf.org/doc/html/rfc7540)   ### Endpoints <table>   <thead>     <tr>       <th>Environment</th>       <th>Url</th>     </tr>   </thead>   <tbody>     <tr>       <td>Production</td>       <td><code>https://ems-mgmt.coinapi.io/</code></td>     </tr>     <tr>       <td>Sandbox</td>       <td><code>https://ems-mgmt-sandbox.coinapi.io/</code></td>     </tr>   </tbody> </table>  ### Authentication  To use resources that require authorized access, you will need to provide an API key to us when making HTTP requests.  There are 2 methods for passing the API key to us, you only need to use one:   1. Custom authorization header named `X-CoinAPI-Key`  2. Query string parameter named `apikey`  #### Custom authorization header  You can authorize by providing additional custom header named `X-CoinAPI-Key` and API key as its value.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY`, then the authorization header you should send to us will look like: <br/><br/> `X-CoinAPI-Key: 73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"success\">This method is recommended by us and you should use it in production environments.</aside>  #### Query string authorization parameter  You can authorize by providing an additional parameter named `apikey` with a value equal to your API key in the query string of your HTTP request.  Assuming that your API key is `73034021-THIS-IS-SAMPLE-KEY` and that you want to request all accounts, then your query string should look like this:  <br/><br/> `GET /v1/accounts?apikey=73034021-THIS-IS-SAMPLE-KEY`  <aside class=\"notice\"> Query string method may be more practical for development activities. </aside> 
 *
 * The version of the OpenAPI document: v1
 * Contact: support@coinapi.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.EmsManagedCloudRestApi);
  }
}(this, function(expect, EmsManagedCloudRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new EmsManagedCloudRestApi.AccountApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AccountApi', function() {
    describe('deleteAccount', function() {
      it('should call deleteAccount successfully', function(done) {
        //uncomment below and update the code to test deleteAccount
        //instance.deleteAccount(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteAccountAll', function() {
      it('should call deleteAccountAll successfully', function(done) {
        //uncomment below and update the code to test deleteAccountAll
        //instance.deleteAccountAll(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAccount', function() {
      it('should call getAccount successfully', function(done) {
        //uncomment below and update the code to test getAccount
        //instance.getAccount(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('persistAccount', function() {
      it('should call persistAccount successfully', function(done) {
        //uncomment below and update the code to test persistAccount
        //instance.persistAccount(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
