
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EchelleWS", targetNamespace = "http://service.evalpatient.csys.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EchelleWS {


    /**
     * 
     * @return
     *     returns java.util.List<service.Resultat>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findallresultat", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.Findallresultat")
    @ResponseWrapper(localName = "findallresultatResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.FindallresultatResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/findallresultatRequest", output = "http://service.evalpatient.csys.com/EchelleWS/findallresultatResponse")
    public List<Resultat> findallresultat();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<service.Tracecnx>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTraceCnx", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.GetTraceCnx")
    @ResponseWrapper(localName = "getTraceCnxResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.GetTraceCnxResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/getTraceCnxRequest", output = "http://service.evalpatient.csys.com/EchelleWS/getTraceCnxResponse")
    public List<Tracecnx> getTraceCnx(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<service.Echelle>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findallechelle", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.Findallechelle")
    @ResponseWrapper(localName = "findallechelleResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.FindallechelleResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/findallechelleRequest", output = "http://service.evalpatient.csys.com/EchelleWS/findallechelleResponse")
    public List<Echelle> findallechelle();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "InsertEchelle")
    @RequestWrapper(localName = "InsertEchelle", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InsertEchelle")
    @ResponseWrapper(localName = "InsertEchelleResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InsertEchelleResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/InsertEchelleRequest", output = "http://service.evalpatient.csys.com/EchelleWS/InsertEchelleResponse")
    public void insertEchelle(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "IncrementID")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "IncrementID", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.IncrementID")
    @ResponseWrapper(localName = "IncrementIDResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.IncrementIDResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/IncrementIDRequest", output = "http://service.evalpatient.csys.com/EchelleWS/IncrementIDResponse")
    public String incrementID(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns service.AccessControl
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "verifLogin", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.VerifLogin")
    @ResponseWrapper(localName = "verifLoginResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.VerifLoginResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/verifLoginRequest", output = "http://service.evalpatient.csys.com/EchelleWS/verifLoginResponse")
    public AccessControl verifLogin(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<service.EchelleSpecialite>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findallechellespecialite", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.Findallechellespecialite")
    @ResponseWrapper(localName = "findallechellespecialiteResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.FindallechellespecialiteResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/findallechellespecialiteRequest", output = "http://service.evalpatient.csys.com/EchelleWS/findallechellespecialiteResponse")
    public List<EchelleSpecialite> findallechellespecialite();

    /**
     * 
     * @return
     *     returns java.util.List<service.FamilleEchelle>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findallfamilleechelle", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.Findallfamilleechelle")
    @ResponseWrapper(localName = "findallfamilleechelleResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.FindallfamilleechelleResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/findallfamilleechelleRequest", output = "http://service.evalpatient.csys.com/EchelleWS/findallfamilleechelleResponse")
    public List<FamilleEchelle> findallfamilleechelle();

    /**
     * 
     * @return
     *     returns java.util.List<service.SousFamille>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findallsousfamille", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.Findallsousfamille")
    @ResponseWrapper(localName = "findallsousfamilleResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.FindallsousfamilleResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/findallsousfamilleRequest", output = "http://service.evalpatient.csys.com/EchelleWS/findallsousfamilleResponse")
    public List<SousFamille> findallsousfamille();

    /**
     * 
     * @return
     *     returns java.util.List<service.Specialite>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findallspecialite", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.Findallspecialite")
    @ResponseWrapper(localName = "findallspecialiteResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.FindallspecialiteResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/findallspecialiteRequest", output = "http://service.evalpatient.csys.com/EchelleWS/findallspecialiteResponse")
    public List<Specialite> findallspecialite();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<service.AnyTypeArray>
     */
    @WebMethod(operationName = "GetResultByNumDossAndCodeEchelle")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetResultByNumDossAndCodeEchelle", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.GetResultByNumDossAndCodeEchelle")
    @ResponseWrapper(localName = "GetResultByNumDossAndCodeEchelleResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.GetResultByNumDossAndCodeEchelleResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/GetResultByNumDossAndCodeEchelleRequest", output = "http://service.evalpatient.csys.com/EchelleWS/GetResultByNumDossAndCodeEchelleResponse")
    public List<AnyTypeArray> getResultByNumDossAndCodeEchelle(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<service.AnyTypeArray>
     */
    @WebMethod(operationName = "GetListReponseParEchelle")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetListReponseParEchelle", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.GetListReponseParEchelle")
    @ResponseWrapper(localName = "GetListReponseParEchelleResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.GetListReponseParEchelleResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/GetListReponseParEchelleRequest", output = "http://service.evalpatient.csys.com/EchelleWS/GetListReponseParEchelleResponse")
    public List<AnyTypeArray> getListReponseParEchelle(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns service.Evaluation
     */
    @WebMethod(operationName = "InstanceEvaluation")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "InstanceEvaluation", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InstanceEvaluation")
    @ResponseWrapper(localName = "InstanceEvaluationResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InstanceEvaluationResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/InstanceEvaluationRequest", output = "http://service.evalpatient.csys.com/EchelleWS/InstanceEvaluationResponse")
    public Evaluation instanceEvaluation();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "InsertResultatEvaluation")
    @RequestWrapper(localName = "InsertResultatEvaluation", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InsertResultatEvaluation")
    @ResponseWrapper(localName = "InsertResultatEvaluationResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InsertResultatEvaluationResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/InsertResultatEvaluationRequest", output = "http://service.evalpatient.csys.com/EchelleWS/InsertResultatEvaluationResponse")
    public void insertResultatEvaluation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "InsertFamilleEchelle")
    @RequestWrapper(localName = "InsertFamilleEchelle", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InsertFamilleEchelle")
    @ResponseWrapper(localName = "InsertFamilleEchelleResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InsertFamilleEchelleResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/InsertFamilleEchelleRequest", output = "http://service.evalpatient.csys.com/EchelleWS/InsertFamilleEchelleResponse")
    public void insertFamilleEchelle(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "InsertSousFamille")
    @RequestWrapper(localName = "InsertSousFamille", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InsertSousFamille")
    @ResponseWrapper(localName = "InsertSousFamilleResponse", targetNamespace = "http://service.evalpatient.csys.com/", className = "service.InsertSousFamilleResponse")
    @Action(input = "http://service.evalpatient.csys.com/EchelleWS/InsertSousFamilleRequest", output = "http://service.evalpatient.csys.com/EchelleWS/InsertSousFamilleResponse")
    public void insertSousFamille(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

}
