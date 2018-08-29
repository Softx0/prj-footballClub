
package webService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConfirmacionWebService", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:17155/WebServiceConfirmacion/ConfirmacionWebService?wsdl")
public class ConfirmacionWebService_Service
    extends Service
{

    private final static URL CONFIRMACIONWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONFIRMACIONWEBSERVICE_EXCEPTION;
    private final static QName CONFIRMACIONWEBSERVICE_QNAME = new QName("http://webservice/", "ConfirmacionWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:17155/WebServiceConfirmacion/ConfirmacionWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONFIRMACIONWEBSERVICE_WSDL_LOCATION = url;
        CONFIRMACIONWEBSERVICE_EXCEPTION = e;
    }

    public ConfirmacionWebService_Service() {
        super(__getWsdlLocation(), CONFIRMACIONWEBSERVICE_QNAME);
    }

    public ConfirmacionWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONFIRMACIONWEBSERVICE_QNAME, features);
    }

    public ConfirmacionWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, CONFIRMACIONWEBSERVICE_QNAME);
    }

    public ConfirmacionWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONFIRMACIONWEBSERVICE_QNAME, features);
    }

    public ConfirmacionWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConfirmacionWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConfirmacionWebService
     */
    @WebEndpoint(name = "ConfirmacionWebServicePort")
    public ConfirmacionWebService getConfirmacionWebServicePort() {
        return super.getPort(new QName("http://webservice/", "ConfirmacionWebServicePort"), ConfirmacionWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConfirmacionWebService
     */
    @WebEndpoint(name = "ConfirmacionWebServicePort")
    public ConfirmacionWebService getConfirmacionWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "ConfirmacionWebServicePort"), ConfirmacionWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONFIRMACIONWEBSERVICE_EXCEPTION!= null) {
            throw CONFIRMACIONWEBSERVICE_EXCEPTION;
        }
        return CONFIRMACIONWEBSERVICE_WSDL_LOCATION;
    }

}