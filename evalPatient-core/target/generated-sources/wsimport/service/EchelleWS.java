
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

}
