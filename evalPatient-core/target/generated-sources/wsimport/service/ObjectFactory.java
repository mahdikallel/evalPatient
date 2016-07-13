
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Specialite_QNAME = new QName("http://service.evalpatient.csys.com/", "specialite");
    private final static QName _Findallspecialite_QNAME = new QName("http://service.evalpatient.csys.com/", "findallspecialite");
    private final static QName _FindallspecialiteResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "findallspecialiteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Specialite }
     * 
     */
    public Specialite createSpecialite() {
        return new Specialite();
    }

    /**
     * Create an instance of {@link Findallspecialite }
     * 
     */
    public Findallspecialite createFindallspecialite() {
        return new Findallspecialite();
    }

    /**
     * Create an instance of {@link FindallspecialiteResponse }
     * 
     */
    public FindallspecialiteResponse createFindallspecialiteResponse() {
        return new FindallspecialiteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Specialite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "specialite")
    public JAXBElement<Specialite> createSpecialite(Specialite value) {
        return new JAXBElement<Specialite>(_Specialite_QNAME, Specialite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findallspecialite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallspecialite")
    public JAXBElement<Findallspecialite> createFindallspecialite(Findallspecialite value) {
        return new JAXBElement<Findallspecialite>(_Findallspecialite_QNAME, Findallspecialite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallspecialiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallspecialiteResponse")
    public JAXBElement<FindallspecialiteResponse> createFindallspecialiteResponse(FindallspecialiteResponse value) {
        return new JAXBElement<FindallspecialiteResponse>(_FindallspecialiteResponse_QNAME, FindallspecialiteResponse.class, null, value);
    }

}
