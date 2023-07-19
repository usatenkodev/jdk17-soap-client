package org.usdev.soap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;
@WebServiceClient(
        name = "DataClientService",
        targetNamespace = "http://impl/",
        wsdlLocation = "file:/Users/musat/Projects/soap-client/src/main/resources/test.wsdl"
)
public class DataClientService_Service extends Service {
    private static final URL ATMDATAWSSERVICE_WSDL_LOCATION;
    private static final WebServiceException ATMDATAWSSERVICE_EXCEPTION;
    private static final QName ATMDATAWSSERVICE_QNAME = new QName("http://impl/", "DataClientService");

    public DataClientService_Service() {
        super(__getWsdlLocation(), ATMDATAWSSERVICE_QNAME);
    }

    public DataClientService_Service(WebServiceFeature... var1) {
        super(__getWsdlLocation(), ATMDATAWSSERVICE_QNAME, var1);
    }

    public DataClientService_Service(URL var1) {
        super(var1, ATMDATAWSSERVICE_QNAME);
    }

    public DataClientService_Service(URL var1, WebServiceFeature... var2) {
        super(var1, ATMDATAWSSERVICE_QNAME, var2);
    }

    public DataClientService_Service(URL var1, QName var2) {
        super(var1, var2);
    }

    public DataClientService_Service(URL var1, QName var2, WebServiceFeature... var3) {
        super(var1, var2, var3);
    }

    @WebEndpoint(
            name = "DataClientServicePort"
    )
    public DataClientService getDataClientServicePort() {
        return (DataClientService)super.getPort(new QName("http://impl/", "DataClientServicePort"), DataClientService.class);
    }

    @WebEndpoint(
            name = "DataClientServicePort"
    )
    public DataClientService getDataClientServicePort(WebServiceFeature... var1) {
        return (DataClientService)super.getPort(new QName("http://impl/", "DataClientServicePort"), DataClientService.class, var1);
    }


    private static URL __getWsdlLocation() {
        if (ATMDATAWSSERVICE_EXCEPTION != null) {
            throw ATMDATAWSSERVICE_EXCEPTION;
        } else {
            return ATMDATAWSSERVICE_WSDL_LOCATION;
        }
    }

    static {
        URL var0 = null;
        WebServiceException var1 = null;

        try {
            var0 = new URL("file:/Users/musat/Projects/soap-client/src/main/resources/test.wsdl");
        } catch (MalformedURLException var3) {
            var1 = new WebServiceException(var3);
        }

        ATMDATAWSSERVICE_WSDL_LOCATION = var0;
        ATMDATAWSSERVICE_EXCEPTION = var1;
    }
}