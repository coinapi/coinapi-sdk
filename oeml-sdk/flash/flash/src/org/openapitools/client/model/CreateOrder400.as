package org.openapitools.client.model {


    [XmlRootNode(name="CreateOrder400")]
    public class CreateOrder400 {
                [XmlElement(name="type")]
        public var type: String = null;
                [XmlElement(name="title")]
        public var title: String = null;
                [XmlElement(name="status")]
        public var status: Number = 0.0;
                [XmlElement(name="traceId")]
        public var traceId: String = null;
                [XmlElement(name="errors")]
        public var errors: String = null;

    public function toString(): String {
        var str: String = "CreateOrder400: ";
        str += " (type: " + type + ")";
        str += " (title: " + title + ")";
        str += " (status: " + status + ")";
        str += " (traceId: " + traceId + ")";
        str += " (errors: " + errors + ")";
        return str;
    }

}

}
