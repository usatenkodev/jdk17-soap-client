package org.usdev.soap;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@ApplicationScoped
public class SoapIntegrationService {
    @Inject
    Logger log;

    public SoapResponse getSoapData() {
        var wsClient = setupWsClient();
        log.info("Getting all ATMs integration call");
        return wsClient.getData(new SoapRequest(1));
//    return restClient.getAtmLocations(generateSoapRequestBody(new AtmRequestDetailsType(0)));
    }

    public DataClientService setupWsClient() {
        final ClassLoader targetClassLoader = DataClientService_Service.class.getClassLoader();
        final Thread currentThread = Thread.currentThread();
        final ClassLoader contextClassLoader = currentThread.getContextClassLoader();
        try {
//      currentThread.setContextClassLoader(targetClassLoader);
            var service = new DataClientService_Service();
            return service.getDataClientServicePort();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//    finally {
//      currentThread.setContextClassLoader(contextClassLoader);
//    }
    }
}
