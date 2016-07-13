
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

    private final static QName _FamilleEchelle_QNAME = new QName("http://service.evalpatient.csys.com/", "familleEchelle");
    private final static QName _Findallsousfamille_QNAME = new QName("http://service.evalpatient.csys.com/", "findallsousfamille");
    private final static QName _FindallsousfamilleResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "findallsousfamilleResponse");
    private final static QName _SousFamille_QNAME = new QName("http://service.evalpatient.csys.com/", "sousFamille");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FamilleEchelle }
     * 
     */
    public FamilleEchelle createFamilleEchelle() {
        return new FamilleEchelle();
    }

    /**
     * Create an instance of {@link FindallsousfamilleResponse }
     * 
     */
    public FindallsousfamilleResponse createFindallsousfamilleResponse() {
        return new FindallsousfamilleResponse();
    }

    /**
     * Create an instance of {@link SousFamille }
     * 
     */
    public SousFamille createSousFamille() {
        return new SousFamille();
    }

    /**
     * Create an instance of {@link Findallsousfamille }
     * 
     */
    public Findallsousfamille createFindallsousfamille() {
        return new Findallsousfamille();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilleEchelle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "familleEchelle")
    public JAXBElement<FamilleEchelle> createFamilleEchelle(FamilleEchelle value) {
        return new JAXBElement<FamilleEchelle>(_FamilleEchelle_QNAME, FamilleEchelle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findallsousfamille }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallsousfamille")
    public JAXBElement<Findallsousfamille> createFindallsousfamille(Findallsousfamille value) {
        return new JAXBElement<Findallsousfamille>(_Findallsousfamille_QNAME, Findallsousfamille.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallsousfamilleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallsousfamilleResponse")
    public JAXBElement<FindallsousfamilleResponse> createFindallsousfamilleResponse(FindallsousfamilleResponse value) {
        return new JAXBElement<FindallsousfamilleResponse>(_FindallsousfamilleResponse_QNAME, FindallsousfamilleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SousFamille }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "sousFamille")
    public JAXBElement<SousFamille> createSousFamille(SousFamille value) {
        return new JAXBElement<SousFamille>(_SousFamille_QNAME, SousFamille.class, null, value);
    }

}
