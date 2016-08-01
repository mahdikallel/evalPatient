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
import com.csys.evalpatient.model.Evaluation;
import com.csys.evalpatient.model.FamilleEchelle;
import com.csys.evalpatient.model.Resultat;
import com.csys.evalpatient.model.SousFamille;
import com.csys.evalpatient.model.Specialite;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


/**
 *
 * @author Nabil Moalla
 */
@WebService(serviceName = "EchelleWS")
public class EchelleWS {

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "findallechelle")
    public List<Echelle> findallechelle() {
        return new Echelledao().findallechelle();
    }

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "findallechellespecialite")
    public List<EchelleSpecialite> findallechellespecialite() {
        return new EchelleSpecialitedao().findallechellespecialite();
    }

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "findallfamilleechelle")
    public List<FamilleEchelle> findallfamilleechelle() {
        return new FamilleEchelledao().findallfamilleechelle();
    }

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "findallresultat")
    public List<Resultat> findallresultat() {
        return new Resultatdao().findallresultat();
    }

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "findallsousfamille")
    public List<SousFamille> findallsousfamille() {
        return new SousFamilledao().findallsousfamille();
    }

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "findallspecialite")
    public List<Specialite> findallspecialite() {
        return new Specialitedao().findallspecialite();
    }

    /**
     * This is a sample web service operation
     *
     * @param numDoss
     * @param CodeEchelle
     * @return
     */
    @WebMethod(operationName = "GetResultByNumDossAndCodeEchelle")
    public List<Object[]> GetResultByNumDossAndCodeEchelle(int numDoss, int CodeEchelle) {
        return new Resultatdao().GetResultByNumDossAndCodeEchelle(numDoss, CodeEchelle);
    }


    /**
     * This is a sample web service operation
     *
     * @param l
     * @param p
     * @return
     */
    @WebMethod(operationName = "verifLogin")
    public AccessControl verifLogin(String l,String p) {
        return new AccessControldao().authentification(l, p);
    }

    /**
     * This is a sample web service operation
     *
     * @param l
     * @param p
     * @return
     */
    @WebMethod(operationName = "getTraceCnx")
    public List<Tracecnx> getTraceCnx(String l,String p) {
        return new TracecnxDao().getTracecnxByLoginIP(l, p);
    }


    /**
     * This is a sample web service operation
     *
     * @param numEchelle
     * @return
     */
    @WebMethod(operationName = "GetListReponseParEchelle")
    public List<Object[]> GetListReponseParEchelle(int numEchelle) {
        return new Resultatdao().GetListReponseParEchelle(numEchelle);
    }

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "InstanceEvaluation")
    public Evaluation InstanceEvaluation() {
        return new Evaluation();
    }

    /**
     * This is a sample web service operation
     *
     * @param numDos
     * @param codSousFamille
     * @param valeur
     * @param dateSys
     *
     */
    @WebMethod(operationName = "InsertResultatEvaluation")
    public void InsertResultatEvaluation(int numDos, String codSousFamille, int valeur,String dateSys) {
        new Resultatdao().InsertResultatEvaluation(numDos, codSousFamille, valeur,dateSys);
    }

     /**
     * This is a sample web service operation
     *
     
     *
     * @param code_Echelle
     * @param designation
     * @param valeur_Minimale
     * @param valeur_Moyenne
     * @param description
     * @param valeur_Maximale
     */
    @WebMethod(operationName = "InsertEchelle")
    public void InsertEchelle(String code_Echelle, String designation, int valeur_Minimale, int valeur_Moyenne, int valeur_Maximale, String description) {
        new Echelledao().InsertEchelle(code_Echelle, designation,  valeur_Minimale,  valeur_Moyenne,  valeur_Maximale,  description);
    }
    
    
    /**
     * This is a sample web service operation
     *
     
     *
     * @param code_Famille 
     * @param designation 
     * @param code_Echelle 
     * @param code_Aide 
     */
    @WebMethod(operationName = "InsertFamilleEchelle")
    public void InsertFamilleEchelle(String code_Famille, String designation, String code_Echelle,String code_Aide) {
        new FamilleEchelledao().InsertFamilleEchelle( code_Famille,  designation,  code_Echelle, code_Aide);
    }
    
    
     /**
     * This is a sample web service operation
     *
     
     *
     * @param code_Sous_Famille    
     * @param designation    
     * @param code_Famille    
     * @param valeur    
     */
    @WebMethod(operationName = "InsertSousFamille")
    public void InsertSousFamille(String code_Sous_Famille, String designation, String code_Famille,int valeur) {
        new SousFamilledao().InsertSousFamille( code_Sous_Famille,  designation,  code_Famille, valeur);
    }
}
