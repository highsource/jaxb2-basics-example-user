@XmlSchema(namespace = "http://example.com/User",
        xmlns = {
                @XmlNs(namespaceURI = "http://example.com/User", prefix = ""),
                @XmlNs(namespaceURI = "http://example.com/Common", prefix = "com"),
        },
        elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED)

package com.example.user;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;
