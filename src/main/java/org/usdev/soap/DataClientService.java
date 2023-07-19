package org.usdev.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(
        name = "DataWSService",
        targetNamespace = "http://impl/"
)
public interface DataClientService {

    @WebMethod(
            operationName = "getData"
    )
    @WebResult(
            targetNamespace = ""
    )
    @RequestWrapper(
            localName = "SoapRequest",
            targetNamespace = "http://impl/",
            className = "impl.SoapRequest"
    )
    @ResponseWrapper(
            localName = "SoapResponse",
            targetNamespace = "http://impl/",
            className = "impl.SoapResponse"
    )
    SoapResponse getData(@WebParam(name = "arg0", targetNamespace = "") SoapRequest var1);
}
