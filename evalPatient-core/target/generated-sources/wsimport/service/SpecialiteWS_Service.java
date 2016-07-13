
package service;

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
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SpecialiteWS", targetNamespace = "http://service.evalpatient.csys.com/", wsdlLocation = "file:/R:/Dropbox/IIT/2%20\u00e9me%20anne\u00e9/Stage%20d'ete/Essai/evalPatient/evalPatient-core/target/generated-sources/wsdl/SpecialiteWS.wsdl")
public class SpecialiteWS_Service
    extends Service
{

    private final static URL SPECIALITEWS_WSDL_LOCATION;
    private final static WebServiceException SPECIALITEWS_EXCEPTION;
    private final static QName SPECIALITEWS_QNAME = new QName("http://service.evalpatient.csys.com/", "SpecialiteWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/R:/Dropbox/IIT/2%20\u00e9me%20anne\u00e9/Stage%20d'ete/Essai/evalPatient/evalPatient-core/target/generated-sources/wsdl/SpecialiteWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SPECIALITEWS_WSDL_LOCATION = url;
        SPECIALITEWS_EXCEPTION = e;
    }

    public SpecialiteWS_Service() {
        super(__getWsdlLocation(), SPECIALITEWS_QNAME);
    }

    public SpecialiteWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SPECIALITEWS_QNAME, features);
    }

    public SpecialiteWS_Service(URL wsdlLocation) {
        super(wsdlLocation, SPECIALITEWS_QNAME);
    }

    public SpecialiteWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SPECIALITEWS_QNAME, features);
    }

    public SpecialiteWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SpecialiteWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SpecialiteWS
     */
    @WebEndpoint(name = "SpecialiteWSPort")
    public SpecialiteWS getSpecialiteWSPort() {
        return super.getPort(new QName("http://service.evalpatient.csys.com/", "SpecialiteWSPort"), SpecialiteWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SpecialiteWS
     */
    @WebEndpoint(name = "SpecialiteWSPort")
    public SpecialiteWS getSpecialiteWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.evalpatient.csys.com/", "SpecialiteWSPort"), SpecialiteWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SPECIALITEWS_EXCEPTION!= null) {
            throw SPECIALITEWS_EXCEPTION;
        }
        return SPECIALITEWS_WSDL_LOCATION;
    }

}
