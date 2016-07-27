
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

    private final static QName _Findallechellespecialite_QNAME = new QName("http://service.evalpatient.csys.com/", "findallechellespecialite");
    private final static QName _Findallfamilleechelle_QNAME = new QName("http://service.evalpatient.csys.com/", "findallfamilleechelle");
    private final static QName _FamilleEchelle_QNAME = new QName("http://service.evalpatient.csys.com/", "familleEchelle");
    private final static QName _EchelleSpecialite_QNAME = new QName("http://service.evalpatient.csys.com/", "echelleSpecialite");
    private final static QName _InstanceEvaluationResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "InstanceEvaluationResponse");
    private final static QName _InstanceEvaluation_QNAME = new QName("http://service.evalpatient.csys.com/", "InstanceEvaluation");
    private final static QName _Echelle_QNAME = new QName("http://service.evalpatient.csys.com/", "echelle");
    private final static QName _Findallechelle_QNAME = new QName("http://service.evalpatient.csys.com/", "findallechelle");
    private final static QName _FindallechelleResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "findallechelleResponse");
    private final static QName _Specialite_QNAME = new QName("http://service.evalpatient.csys.com/", "specialite");
    private final static QName _FindallfamilleechelleResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "findallfamilleechelleResponse");
    private final static QName _AccessControl_QNAME = new QName("http://service.evalpatient.csys.com/", "accessControl");
    private final static QName _GetTraceCnx_QNAME = new QName("http://service.evalpatient.csys.com/", "getTraceCnx");
    private final static QName _Findallsousfamille_QNAME = new QName("http://service.evalpatient.csys.com/", "findallsousfamille");
    private final static QName _Findallspecialite_QNAME = new QName("http://service.evalpatient.csys.com/", "findallspecialite");
    private final static QName _InsertResultatEvaluationResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "InsertResultatEvaluationResponse");
    private final static QName _Findallresultat_QNAME = new QName("http://service.evalpatient.csys.com/", "findallresultat");
    private final static QName _GetResultByNumDossAndCodeEchelleResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "GetResultByNumDossAndCodeEchelleResponse");
    private final static QName _FindallsousfamilleResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "findallsousfamilleResponse");
    private final static QName _VerifLogin_QNAME = new QName("http://service.evalpatient.csys.com/", "verifLogin");
    private final static QName _VerifLoginResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "verifLoginResponse");
    private final static QName _GetTraceCnxResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "getTraceCnxResponse");
    private final static QName _Tracecnx_QNAME = new QName("http://service.evalpatient.csys.com/", "tracecnx");
    private final static QName _InsertResultatEvaluation_QNAME = new QName("http://service.evalpatient.csys.com/", "InsertResultatEvaluation");
    private final static QName _FindallechellespecialiteResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "findallechellespecialiteResponse");
    private final static QName _SousFamille_QNAME = new QName("http://service.evalpatient.csys.com/", "sousFamille");
    private final static QName _GetListReponseParEchelleResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "GetListReponseParEchelleResponse");
    private final static QName _FindallresultatResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "findallresultatResponse");
    private final static QName _Resultat_QNAME = new QName("http://service.evalpatient.csys.com/", "resultat");
    private final static QName _GetResultByNumDossAndCodeEchelle_QNAME = new QName("http://service.evalpatient.csys.com/", "GetResultByNumDossAndCodeEchelle");
    private final static QName _FindallspecialiteResponse_QNAME = new QName("http://service.evalpatient.csys.com/", "findallspecialiteResponse");
    private final static QName _GetListReponseParEchelle_QNAME = new QName("http://service.evalpatient.csys.com/", "GetListReponseParEchelle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnyTypeArray }
     * 
     */
    public AnyTypeArray createAnyTypeArray() {
        return new AnyTypeArray();
    }

    /**
     * Create an instance of {@link FindallfamilleechelleResponse }
     * 
     */
    public FindallfamilleechelleResponse createFindallfamilleechelleResponse() {
        return new FindallfamilleechelleResponse();
    }

    /**
     * Create an instance of {@link AccessControl }
     * 
     */
    public AccessControl createAccessControl() {
        return new AccessControl();
    }

    /**
     * Create an instance of {@link Echelle }
     * 
     */
    public Echelle createEchelle() {
        return new Echelle();
    }

    /**
     * Create an instance of {@link Findallechelle }
     * 
     */
    public Findallechelle createFindallechelle() {
        return new Findallechelle();
    }

    /**
     * Create an instance of {@link FindallechelleResponse }
     * 
     */
    public FindallechelleResponse createFindallechelleResponse() {
        return new FindallechelleResponse();
    }

    /**
     * Create an instance of {@link Specialite }
     * 
     */
    public Specialite createSpecialite() {
        return new Specialite();
    }

    /**
     * Create an instance of {@link GetResultByNumDossAndCodeEchelleResponse }
     * 
     */
    public GetResultByNumDossAndCodeEchelleResponse createGetResultByNumDossAndCodeEchelleResponse() {
        return new GetResultByNumDossAndCodeEchelleResponse();
    }

    /**
     * Create an instance of {@link FindallsousfamilleResponse }
     * 
     */
    public FindallsousfamilleResponse createFindallsousfamilleResponse() {
        return new FindallsousfamilleResponse();
    }

    /**
     * Create an instance of {@link Findallsousfamille }
     * 
     */
    public Findallsousfamille createFindallsousfamille() {
        return new Findallsousfamille();
    }

    /**
     * Create an instance of {@link Findallspecialite }
     * 
     */
    public Findallspecialite createFindallspecialite() {
        return new Findallspecialite();
    }

    /**
     * Create an instance of {@link InsertResultatEvaluationResponse }
     * 
     */
    public InsertResultatEvaluationResponse createInsertResultatEvaluationResponse() {
        return new InsertResultatEvaluationResponse();
    }

    /**
     * Create an instance of {@link Findallresultat }
     * 
     */
    public Findallresultat createFindallresultat() {
        return new Findallresultat();
    }

    /**
     * Create an instance of {@link GetTraceCnx }
     * 
     */
    public GetTraceCnx createGetTraceCnx() {
        return new GetTraceCnx();
    }

    /**
     * Create an instance of {@link FamilleEchelle }
     * 
     */
    public FamilleEchelle createFamilleEchelle() {
        return new FamilleEchelle();
    }

    /**
     * Create an instance of {@link EchelleSpecialite }
     * 
     */
    public EchelleSpecialite createEchelleSpecialite() {
        return new EchelleSpecialite();
    }

    /**
     * Create an instance of {@link Findallfamilleechelle }
     * 
     */
    public Findallfamilleechelle createFindallfamilleechelle() {
        return new Findallfamilleechelle();
    }

    /**
     * Create an instance of {@link Findallechellespecialite }
     * 
     */
    public Findallechellespecialite createFindallechellespecialite() {
        return new Findallechellespecialite();
    }

    /**
     * Create an instance of {@link InstanceEvaluation }
     * 
     */
    public InstanceEvaluation createInstanceEvaluation() {
        return new InstanceEvaluation();
    }

    /**
     * Create an instance of {@link InstanceEvaluationResponse }
     * 
     */
    public InstanceEvaluationResponse createInstanceEvaluationResponse() {
        return new InstanceEvaluationResponse();
    }

    /**
     * Create an instance of {@link GetListReponseParEchelleResponse }
     * 
     */
    public GetListReponseParEchelleResponse createGetListReponseParEchelleResponse() {
        return new GetListReponseParEchelleResponse();
    }

    /**
     * Create an instance of {@link FindallspecialiteResponse }
     * 
     */
    public FindallspecialiteResponse createFindallspecialiteResponse() {
        return new FindallspecialiteResponse();
    }

    /**
     * Create an instance of {@link GetListReponseParEchelle }
     * 
     */
    public GetListReponseParEchelle createGetListReponseParEchelle() {
        return new GetListReponseParEchelle();
    }

    /**
     * Create an instance of {@link FindallresultatResponse }
     * 
     */
    public FindallresultatResponse createFindallresultatResponse() {
        return new FindallresultatResponse();
    }

    /**
     * Create an instance of {@link Resultat }
     * 
     */
    public Resultat createResultat() {
        return new Resultat();
    }

    /**
     * Create an instance of {@link GetResultByNumDossAndCodeEchelle }
     * 
     */
    public GetResultByNumDossAndCodeEchelle createGetResultByNumDossAndCodeEchelle() {
        return new GetResultByNumDossAndCodeEchelle();
    }

    /**
     * Create an instance of {@link VerifLogin }
     * 
     */
    public VerifLogin createVerifLogin() {
        return new VerifLogin();
    }

    /**
     * Create an instance of {@link VerifLoginResponse }
     * 
     */
    public VerifLoginResponse createVerifLoginResponse() {
        return new VerifLoginResponse();
    }

    /**
     * Create an instance of {@link FindallechellespecialiteResponse }
     * 
     */
    public FindallechellespecialiteResponse createFindallechellespecialiteResponse() {
        return new FindallechellespecialiteResponse();
    }

    /**
     * Create an instance of {@link SousFamille }
     * 
     */
    public SousFamille createSousFamille() {
        return new SousFamille();
    }

    /**
     * Create an instance of {@link InsertResultatEvaluation }
     * 
     */
    public InsertResultatEvaluation createInsertResultatEvaluation() {
        return new InsertResultatEvaluation();
    }

    /**
     * Create an instance of {@link GetTraceCnxResponse }
     * 
     */
    public GetTraceCnxResponse createGetTraceCnxResponse() {
        return new GetTraceCnxResponse();
    }

    /**
     * Create an instance of {@link Tracecnx }
     * 
     */
    public Tracecnx createTracecnx() {
        return new Tracecnx();
    }

    /**
     * Create an instance of {@link Evaluation }
     * 
     */
    public Evaluation createEvaluation() {
        return new Evaluation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findallechellespecialite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallechellespecialite")
    public JAXBElement<Findallechellespecialite> createFindallechellespecialite(Findallechellespecialite value) {
        return new JAXBElement<Findallechellespecialite>(_Findallechellespecialite_QNAME, Findallechellespecialite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findallfamilleechelle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallfamilleechelle")
    public JAXBElement<Findallfamilleechelle> createFindallfamilleechelle(Findallfamilleechelle value) {
        return new JAXBElement<Findallfamilleechelle>(_Findallfamilleechelle_QNAME, Findallfamilleechelle.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EchelleSpecialite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "echelleSpecialite")
    public JAXBElement<EchelleSpecialite> createEchelleSpecialite(EchelleSpecialite value) {
        return new JAXBElement<EchelleSpecialite>(_EchelleSpecialite_QNAME, EchelleSpecialite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceEvaluationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "InstanceEvaluationResponse")
    public JAXBElement<InstanceEvaluationResponse> createInstanceEvaluationResponse(InstanceEvaluationResponse value) {
        return new JAXBElement<InstanceEvaluationResponse>(_InstanceEvaluationResponse_QNAME, InstanceEvaluationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstanceEvaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "InstanceEvaluation")
    public JAXBElement<InstanceEvaluation> createInstanceEvaluation(InstanceEvaluation value) {
        return new JAXBElement<InstanceEvaluation>(_InstanceEvaluation_QNAME, InstanceEvaluation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Echelle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "echelle")
    public JAXBElement<Echelle> createEchelle(Echelle value) {
        return new JAXBElement<Echelle>(_Echelle_QNAME, Echelle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findallechelle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallechelle")
    public JAXBElement<Findallechelle> createFindallechelle(Findallechelle value) {
        return new JAXBElement<Findallechelle>(_Findallechelle_QNAME, Findallechelle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallechelleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallechelleResponse")
    public JAXBElement<FindallechelleResponse> createFindallechelleResponse(FindallechelleResponse value) {
        return new JAXBElement<FindallechelleResponse>(_FindallechelleResponse_QNAME, FindallechelleResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallfamilleechelleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallfamilleechelleResponse")
    public JAXBElement<FindallfamilleechelleResponse> createFindallfamilleechelleResponse(FindallfamilleechelleResponse value) {
        return new JAXBElement<FindallfamilleechelleResponse>(_FindallfamilleechelleResponse_QNAME, FindallfamilleechelleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "accessControl")
    public JAXBElement<AccessControl> createAccessControl(AccessControl value) {
        return new JAXBElement<AccessControl>(_AccessControl_QNAME, AccessControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTraceCnx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "getTraceCnx")
    public JAXBElement<GetTraceCnx> createGetTraceCnx(GetTraceCnx value) {
        return new JAXBElement<GetTraceCnx>(_GetTraceCnx_QNAME, GetTraceCnx.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Findallspecialite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallspecialite")
    public JAXBElement<Findallspecialite> createFindallspecialite(Findallspecialite value) {
        return new JAXBElement<Findallspecialite>(_Findallspecialite_QNAME, Findallspecialite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResultatEvaluationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "InsertResultatEvaluationResponse")
    public JAXBElement<InsertResultatEvaluationResponse> createInsertResultatEvaluationResponse(InsertResultatEvaluationResponse value) {
        return new JAXBElement<InsertResultatEvaluationResponse>(_InsertResultatEvaluationResponse_QNAME, InsertResultatEvaluationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Findallresultat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallresultat")
    public JAXBElement<Findallresultat> createFindallresultat(Findallresultat value) {
        return new JAXBElement<Findallresultat>(_Findallresultat_QNAME, Findallresultat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultByNumDossAndCodeEchelleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "GetResultByNumDossAndCodeEchelleResponse")
    public JAXBElement<GetResultByNumDossAndCodeEchelleResponse> createGetResultByNumDossAndCodeEchelleResponse(GetResultByNumDossAndCodeEchelleResponse value) {
        return new JAXBElement<GetResultByNumDossAndCodeEchelleResponse>(_GetResultByNumDossAndCodeEchelleResponse_QNAME, GetResultByNumDossAndCodeEchelleResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "verifLogin")
    public JAXBElement<VerifLogin> createVerifLogin(VerifLogin value) {
        return new JAXBElement<VerifLogin>(_VerifLogin_QNAME, VerifLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "verifLoginResponse")
    public JAXBElement<VerifLoginResponse> createVerifLoginResponse(VerifLoginResponse value) {
        return new JAXBElement<VerifLoginResponse>(_VerifLoginResponse_QNAME, VerifLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTraceCnxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "getTraceCnxResponse")
    public JAXBElement<GetTraceCnxResponse> createGetTraceCnxResponse(GetTraceCnxResponse value) {
        return new JAXBElement<GetTraceCnxResponse>(_GetTraceCnxResponse_QNAME, GetTraceCnxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tracecnx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "tracecnx")
    public JAXBElement<Tracecnx> createTracecnx(Tracecnx value) {
        return new JAXBElement<Tracecnx>(_Tracecnx_QNAME, Tracecnx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResultatEvaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "InsertResultatEvaluation")
    public JAXBElement<InsertResultatEvaluation> createInsertResultatEvaluation(InsertResultatEvaluation value) {
        return new JAXBElement<InsertResultatEvaluation>(_InsertResultatEvaluation_QNAME, InsertResultatEvaluation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallechellespecialiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallechellespecialiteResponse")
    public JAXBElement<FindallechellespecialiteResponse> createFindallechellespecialiteResponse(FindallechellespecialiteResponse value) {
        return new JAXBElement<FindallechellespecialiteResponse>(_FindallechellespecialiteResponse_QNAME, FindallechellespecialiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SousFamille }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "sousFamille")
    public JAXBElement<SousFamille> createSousFamille(SousFamille value) {
        return new JAXBElement<SousFamille>(_SousFamille_QNAME, SousFamille.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListReponseParEchelleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "GetListReponseParEchelleResponse")
    public JAXBElement<GetListReponseParEchelleResponse> createGetListReponseParEchelleResponse(GetListReponseParEchelleResponse value) {
        return new JAXBElement<GetListReponseParEchelleResponse>(_GetListReponseParEchelleResponse_QNAME, GetListReponseParEchelleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallresultatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallresultatResponse")
    public JAXBElement<FindallresultatResponse> createFindallresultatResponse(FindallresultatResponse value) {
        return new JAXBElement<FindallresultatResponse>(_FindallresultatResponse_QNAME, FindallresultatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resultat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "resultat")
    public JAXBElement<Resultat> createResultat(Resultat value) {
        return new JAXBElement<Resultat>(_Resultat_QNAME, Resultat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultByNumDossAndCodeEchelle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "GetResultByNumDossAndCodeEchelle")
    public JAXBElement<GetResultByNumDossAndCodeEchelle> createGetResultByNumDossAndCodeEchelle(GetResultByNumDossAndCodeEchelle value) {
        return new JAXBElement<GetResultByNumDossAndCodeEchelle>(_GetResultByNumDossAndCodeEchelle_QNAME, GetResultByNumDossAndCodeEchelle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindallspecialiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "findallspecialiteResponse")
    public JAXBElement<FindallspecialiteResponse> createFindallspecialiteResponse(FindallspecialiteResponse value) {
        return new JAXBElement<FindallspecialiteResponse>(_FindallspecialiteResponse_QNAME, FindallspecialiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListReponseParEchelle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.evalpatient.csys.com/", name = "GetListReponseParEchelle")
    public JAXBElement<GetListReponseParEchelle> createGetListReponseParEchelle(GetListReponseParEchelle value) {
        return new JAXBElement<GetListReponseParEchelle>(_GetListReponseParEchelle_QNAME, GetListReponseParEchelle.class, null, value);
    }

}
