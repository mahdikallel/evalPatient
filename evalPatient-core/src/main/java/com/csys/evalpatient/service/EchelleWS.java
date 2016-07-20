/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.service;
import com.csys.evalpatient.dao.AccessControldao;
import com.csys.evalpatient.model.Tracecnx;
import com.csys.evalpatient.dao.TracecnxDao;
import com.csys.evalpatient.dao.EchelleSpecialitedao;
import com.csys.evalpatient.dao.Echelledao;
import com.csys.evalpatient.dao.FamilleEchelledao;
import com.csys.evalpatient.dao.Resultatdao;
import com.csys.evalpatient.dao.SousFamilledao;
import com.csys.evalpatient.dao.Specialitedao;
import com.csys.evalpatient.model.AccessControl;
import com.csys.evalpatient.model.Echelle;
import com.csys.evalpatient.model.EchelleSpecialite;
import com.csys.evalpatient.model.FamilleEchelle;
import com.csys.evalpatient.model.Resultat;
import com.csys.evalpatient.model.SousFamille;
import com.csys.evalpatient.model.Specialite;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Nabil Moalla
 */
@WebService(serviceName = "EchelleWS")
public class EchelleWS {

     /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallechelle")
    public List<Echelle> findallechelle() {
        return new Echelledao().findallechelle();
    }
    
     /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallechellespecialite")
    public List<EchelleSpecialite> findallechellespecialite() {
        return new EchelleSpecialitedao().findallechellespecialite();
    }
    
     /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallfamilleechelle")
    public List<FamilleEchelle> findallfamilleechelle() {
        return new FamilleEchelledao().findallfamilleechelle();
    }
    
     /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallresultat")
    public List<Resultat> findallresultat() {
        return new Resultatdao().findallresultat();
    }
    
    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallsousfamille")
    public List<SousFamille> findallsousfamille() {
        return new SousFamilledao().findallsousfamille();
    }
    
      /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallspecialite")
    public List<Specialite> findallspecialite() {
        return new Specialitedao().findallspecialite();
    }
    
    
       /**
     * This is a sample web service operation
     * @param numDoss
     * @param CodeEchelle
     * @return 
     */
    @WebMethod(operationName = "GetResultByNumDossAndCodeEchelle")
    public List<Object[]> GetResultByNumDossAndCodeEchelle(int numDoss,int CodeEchelle) {
        return new Resultatdao().GetResultByNumDossAndCodeEchelle(numDoss,CodeEchelle);
    }
    
     /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "verifLogin")
    public AccessControl verifLogin(@WebParam(name = "login") String l, @WebParam(name = "pass") String p) {
        return new AccessControldao().authentification(l, p);
    }
    
    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "getTraceCnx")
    public List<Tracecnx> getTraceCnx(@WebParam(name = "login") String l, @WebParam(name = "pass") String p) {
        return new TracecnxDao().getTracecnxByLoginIP(l, p);
    }
    
}
