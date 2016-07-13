
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
@WebServiceClient(name = "EchelleSpecialiteWS", targetNamespace = "http://service.evalpatient.csys.com/", wsdlLocation = "file:/C:/Users/Nabil%20Moalla/Google%20Drive/Stage%202eme%20ann\u00e9e/ProjetGit/evalPatient/evalPatient-core/target/generated-sources/wsdl/EchelleSpecialiteWS.wsdl")
public class EchelleSpecialiteWS_Service
    extends Service
{

    private final static URL ECHELLESPECIALITEWS_WSDL_LOCATION;
    private final static WebServiceException ECHELLESPECIALITEWS_EXCEPTION;
    private final static QName ECHELLESPECIALITEWS_QNAME = new QName("http://service.evalpatient.csys.com/", "EchelleSpecialiteWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Nabil%20Moalla/Google%20Drive/Stage%202eme%20ann\u00e9e/ProjetGit/evalPatient/evalPatient-core/target/generated-sources/wsdl/EchelleSpecialiteWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECHELLESPECIALITEWS_WSDL_LOCATION = url;
        ECHELLESPECIALITEWS_EXCEPTION = e;
    }

    public EchelleSpecialiteWS_Service() {
        super(__getWsdlLocation(), ECHELLESPECIALITEWS_QNAME);
    }

    public EchelleSpecialiteWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ECHELLESPECIALITEWS_QNAME, features);
    }

    public EchelleSpecialiteWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ECHELLESPECIALITEWS_QNAME);
    }

    public EchelleSpecialiteWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ECHELLESPECIALITEWS_QNAME, features);
    }

    public EchelleSpecialiteWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EchelleSpecialiteWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EchelleSpecialiteWS
     */
    @WebEndpoint(name = "EchelleSpecialiteWSPort")
    public EchelleSpecialiteWS getEchelleSpecialiteWSPort() {
        return super.getPort(new QName("http://service.evalpatient.csys.com/", "EchelleSpecialiteWSPort"), EchelleSpecialiteWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EchelleSpecialiteWS
     */
    @WebEndpoint(name = "EchelleSpecialiteWSPort")
    public EchelleSpecialiteWS getEchelleSpecialiteWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.evalpatient.csys.com/", "EchelleSpecialiteWSPort"), EchelleSpecialiteWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ECHELLESPECIALITEWS_EXCEPTION!= null) {
            throw ECHELLESPECIALITEWS_EXCEPTION;
        }
        return ECHELLESPECIALITEWS_WSDL_LOCATION;
    }

}
