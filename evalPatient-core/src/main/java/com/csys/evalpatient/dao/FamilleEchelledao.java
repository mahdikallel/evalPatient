/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.dao;


import com.csys.evalpatient.model.FamilleEchelle;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Nabil Moalla
 */
public class FamilleEchelledao {
     EntityManager em  =FactoriesRepository.GetEntityManager(FactoriesRepository.getEvalPatientPU());
     EntityTransaction tx = em.getTransaction();
    
    public List<FamilleEchelle> findallfamilleechelle(){
        Query q=em.createNamedQuery("FamilleEchelle.findAll", FamilleEchelle.class);
        return q.getResultList();
        
    }
    
     public void InsertFamilleEchelle(String code_Famille, String designation, String code_Echelle,String code_Aide) {
        try {

            tx.begin();
            String sql;

          
            
            sql = "INSERT INTO [gclinPin].[dbo].[Famille_Echelle]([Code_Famille],[Designation],[Code_Echelle],[Code_Aide]) VALUES(" + code_Famille + "," + designation + "," + code_Echelle + ","+code_Aide+") ";
            System.out.println("Requete  " + sql);
            Query q = em.createNativeQuery(sql);
            q.executeUpdate();
            tx.commit();
        } catch (Exception e) {
            System.out.println("erreur INSERTION");
            Logger.getLogger(FamilleEchelledao.class.getName()).log(Level.SEVERE, null, e);

        }
    }
}
