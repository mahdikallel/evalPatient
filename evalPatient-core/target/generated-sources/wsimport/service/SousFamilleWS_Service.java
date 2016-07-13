
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
@WebServiceClient(name = "SousFamilleWS", targetNamespace = "http://service.evalpatient.csys.com/", wsdlLocation = "file:/R:/Dropbox/IIT/2%20\u00e9me%20anne\u00e9/Stage%20d'ete/Essai/evalPatient/evalPatient-core/target/generated-sources/wsdl/SousFamilleWS.wsdl")
public class SousFamilleWS_Service
    extends Service
{

    private final static URL SOUSFAMILLEWS_WSDL_LOCATION;
    private final static WebServiceException SOUSFAMILLEWS_EXCEPTION;
    private final static QName SOUSFAMILLEWS_QNAME = new QName("http://service.evalpatient.csys.com/", "SousFamilleWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/R:/Dropbox/IIT/2%20\u00e9me%20anne\u00e9/Stage%20d'ete/Essai/evalPatient/evalPatient-core/target/generated-sources/wsdl/SousFamilleWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOUSFAMILLEWS_WSDL_LOCATION = url;
        SOUSFAMILLEWS_EXCEPTION = e;
    }

    public SousFamilleWS_Service() {
        super(__getWsdlLocation(), SOUSFAMILLEWS_QNAME);
    }

    public SousFamilleWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOUSFAMILLEWS_QNAME, features);
    }

    public SousFamilleWS_Service(URL wsdlLocation) {
        super(wsdlLocation, SOUSFAMILLEWS_QNAME);
    }

    public SousFamilleWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOUSFAMILLEWS_QNAME, features);
    }

    public SousFamilleWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SousFamilleWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SousFamilleWS
     */
    @WebEndpoint(name = "SousFamilleWSPort")
    public SousFamilleWS getSousFamilleWSPort() {
        return super.getPort(new QName("http://service.evalpatient.csys.com/", "SousFamilleWSPort"), SousFamilleWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SousFamilleWS
     */
    @WebEndpoint(name = "SousFamilleWSPort")
    public SousFamilleWS getSousFamilleWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.evalpatient.csys.com/", "SousFamilleWSPort"), SousFamilleWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOUSFAMILLEWS_EXCEPTION!= null) {
            throw SOUSFAMILLEWS_EXCEPTION;
        }
        return SOUSFAMILLEWS_WSDL_LOCATION;
    }

}
