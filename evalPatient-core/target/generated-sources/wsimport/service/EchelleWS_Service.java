
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
<<<<<<< HEAD
@WebServiceClient(name = "EchelleWS", targetNamespace = "http://service.evalpatient.csys.com/", wsdlLocation = "file:/R:/Dropbox/IIT/2%20\u00e9me%20anne\u00e9/Stage%20d'ete/Essai/evalPatient/evalPatient-core/target/generated-sources/wsdl/EchelleWS.wsdl")
=======
@WebServiceClient(name = "EchelleWS", targetNamespace = "http://service.evalpatient.csys.com/", wsdlLocation = "file:/C:/Users/Nabil%20Moalla/Google%20Drive/Stage%202eme%20ann\u00e9e/ProjetGit/evalPatient/evalPatient-core/target/generated-sources/wsdl/EchelleWS.wsdl")
>>>>>>> 110afb3c0de212199c5063e31a4c39992dc2fc3a
public class EchelleWS_Service
    extends Service
{

    private final static URL ECHELLEWS_WSDL_LOCATION;
    private final static WebServiceException ECHELLEWS_EXCEPTION;
    private final static QName ECHELLEWS_QNAME = new QName("http://service.evalpatient.csys.com/", "EchelleWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
<<<<<<< HEAD
            url = new URL("file:/R:/Dropbox/IIT/2%20\u00e9me%20anne\u00e9/Stage%20d'ete/Essai/evalPatient/evalPatient-core/target/generated-sources/wsdl/EchelleWS.wsdl");
=======
            url = new URL("file:/C:/Users/Nabil%20Moalla/Google%20Drive/Stage%202eme%20ann\u00e9e/ProjetGit/evalPatient/evalPatient-core/target/generated-sources/wsdl/EchelleWS.wsdl");
>>>>>>> 110afb3c0de212199c5063e31a4c39992dc2fc3a
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ECHELLEWS_WSDL_LOCATION = url;
        ECHELLEWS_EXCEPTION = e;
    }

    public EchelleWS_Service() {
        super(__getWsdlLocation(), ECHELLEWS_QNAME);
    }

    public EchelleWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ECHELLEWS_QNAME, features);
    }

    public EchelleWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ECHELLEWS_QNAME);
    }

    public EchelleWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ECHELLEWS_QNAME, features);
    }

    public EchelleWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EchelleWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EchelleWS
     */
    @WebEndpoint(name = "EchelleWSPort")
    public EchelleWS getEchelleWSPort() {
        return super.getPort(new QName("http://service.evalpatient.csys.com/", "EchelleWSPort"), EchelleWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EchelleWS
     */
    @WebEndpoint(name = "EchelleWSPort")
    public EchelleWS getEchelleWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.evalpatient.csys.com/", "EchelleWSPort"), EchelleWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ECHELLEWS_EXCEPTION!= null) {
            throw ECHELLEWS_EXCEPTION;
        }
        return ECHELLEWS_WSDL_LOCATION;
    }

}
