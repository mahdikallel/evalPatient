/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.dao;

import com.csys.evalpatient.model.SousFamille;
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
public class SousFamilledao {
      EntityManager em  =FactoriesRepository.GetEntityManager(FactoriesRepository.getEvalPatientPU());
    EntityTransaction tx = em.getTransaction();
      
    public List<SousFamille> findallsousfamille(){
        Query q=em.createNamedQuery("SousFamille.findAll", SousFamille.class);
        return q.getResultList();
        
    }
    
     public void InsertSousFamille(String code_Sous_Famille, String designation, String code_Famille,int valeur) {
        try {

            tx.begin();
            String sql;

          
            
            sql = "INSERT INTO [gclinPin].[dbo].[Sous_Famille]([Code_Sous_Famille],[Designation],[Code_Famille],[Valeur]) VALUES(" + code_Sous_Famille + "," + designation + "," + code_Famille + ","+valeur+") ";
            System.out.println("Requete  " + sql);
            Query q = em.createNativeQuery(sql);
            q.executeUpdate();
            tx.commit();
        } catch (Exception e) {
            System.out.println("erreur INSERTION");
            Logger.getLogger(SousFamilledao.class.getName()).log(Level.SEVERE, null, e);

        }
    }
}
