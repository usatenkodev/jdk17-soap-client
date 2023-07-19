package org.usdev.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SoapResponse")
public class SoapResponse {

    @XmlElement(name = "response", required = true)
    private String response;

    public String getResponse() {
        return this.response;
    }

}
