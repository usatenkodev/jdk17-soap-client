package org.usdev.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request_Details_Type", propOrder = {
        "atmId"
})
public class SoapRequest {
    @XmlElement(name = "Atm_Id")
    int atmId;

    public SoapRequest(int atmId) {
        this.atmId = atmId;
    }

    public SoapRequest() {
    }
}