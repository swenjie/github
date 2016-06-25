
package com.hyan.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ServiceHelloService", targetNamespace = "http://service.hyan.com/", wsdlLocation = "http://localhost:9001/Service/ServiceHello?wsdl")
public class ServiceHelloService
    extends Service
{

    private final static URL SERVICEHELLOSERVICE_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9001/Service/ServiceHello?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        SERVICEHELLOSERVICE_WSDL_LOCATION = url;
    }

    public ServiceHelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceHelloService() {
        super(SERVICEHELLOSERVICE_WSDL_LOCATION, new QName("http://service.hyan.com/", "ServiceHelloService"));
    }

    /**
     * 
     * @return
     *     returns ServiceHello
     */
    @WebEndpoint(name = "ServiceHelloPort")
    public ServiceHello getServiceHelloPort() {
        return (ServiceHello)super.getPort(new QName("http://service.hyan.com/", "ServiceHelloPort"), ServiceHello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceHello
     */
    @WebEndpoint(name = "ServiceHelloPort")
    public ServiceHello getServiceHelloPort(WebServiceFeature... features) {
        return (ServiceHello)super.getPort(new QName("http://service.hyan.com/", "ServiceHelloPort"), ServiceHello.class, features);
    }

}