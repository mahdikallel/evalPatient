/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.dao;


import com.csys.evalpatient.model.Resultat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Nabil Moalla
 */
public class Resultatdao {
     EntityManager em  =FactoriesRepository.GetEntityManager(FactoriesRepository.getEvalPatientPU());
    
    public List<Resultat> findallresultat(){
        Query q=em.createNamedQuery("Resultat.findAll", Resultat.class);
        return q.getResultList();
        
    }
    
    public List<Object[]> GetResultByNumDossAndCodeEchelle(int numDoss,int codeEchelle) {
        try {
            List<Object[]> list = new ArrayList<Object[]>();
            String sql;
            sql = "SELECT SUM(Resultat.valeur),date FROM Resultat INNER JOIN Sous_Famille ON Resultat.Code_Sous_Famille = Sous_Famille.Code_Sous_Famille INNER JOIN Famille_Echelle ON Sous_Famille.Code_Famille = Famille_Echelle.Code_Famille where Num_Dossier =" + numDoss + " AND Code_Echelle =" + codeEchelle + "  group by date";
            Query q = em.createNativeQuery(sql);
            list = q.getResultList();
            return list;
        } catch (Exception e) {
            Logger.getLogger(Resultatdao.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }     
}
