/*
 * OEML - REST API
 * This section will provide necessary information about the `CoinAPI OEML REST API` protocol.\n
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASMessage
 */
public class OASMessage implements OAS.MappedProperties {
    /**
     * Type of message.
     * @return r_type
     */
    public String r_type { get; set; }

    /**
     * Get severity
     * @return severity
     */
    public OASSeverity severity { get; set; }

    /**
     * If message related exchange then identifier of this exchange.
     * @return exchangeId
     */
    public String exchangeId { get; set; }

    /**
     * Message text.
     * @return message
     */
    public String message { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'type' => 'r_type',
        'exchange_id' => 'exchangeId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASMessage getExample() {
        OASMessage message = new OASMessage();
          message.r_type = 'message';
          message.severity = OASSeverity.getExample();
          message.exchangeId = 'KRAKEN';
          message.message = 'Ok';
        return message;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMessage) {           
            OASMessage message = (OASMessage) obj;
            return this.r_type == message.r_type
                && this.severity == message.severity
                && this.exchangeId == message.exchangeId
                && this.message == message.message;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (r_type == null ? 0 : System.hashCode(r_type));
        hashCode = (17 * hashCode) + (severity == null ? 0 : System.hashCode(severity));
        hashCode = (17 * hashCode) + (exchangeId == null ? 0 : System.hashCode(exchangeId));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        return hashCode;
    }
}
