/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.dao;

import com.csys.evalpatient.model.Echelle;
import java.text.DecimalFormat;
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
public class Echelledao {
    EntityManager em  =FactoriesRepository.GetEntityManager(FactoriesRepository.getEvalPatientPU());
    EntityTransaction tx = em.getTransaction();
    
    public List<Echelle> findallechelle(){
        Query q=em.createNamedQuery("Echelle.findAll", Echelle.class);
        return q.getResultList();
        
    }
    
    public void InsertEchelle(String code_Echelle, String designation, int valeur_Minimale, int valeur_Moyenne, int valeur_Maximale, String description) {
        try {

            tx.begin();
            //get id
          //  String id = IncrementID("code_Echelle", "Echelle");
            
            String sql;

            sql = "INSERT INTO [gclinPin].[dbo].[Echelle]([Code_Echelle],[Designation],[Valeur_Minimale],[Valeur_Moyenne],[Valeur_Maximale],[Description]) VALUES(" + code_Echelle + "," + designation + "," + valeur_Minimale + "," + valeur_Moyenne + "," + valeur_Maximale + "," + description + ")  ";
            System.out.println("Requete  " + sql);
            Query q = em.createNativeQuery(sql);
            q.executeUpdate();
            tx.commit();
        } catch (Exception e) {
            System.out.println("erreur INSERTION");
            Logger.getLogger(Echelledao.class.getName()).log(Level.SEVERE, null, e);

        }
    }
    
    public String IncrementID(String code,String tablename) {
        try {
            String sql;
            sql = "SELECT MAX(" + code + ") from " + tablename + "";
            //System.out.println("Requete  " + sql);
            Query q = em.createNativeQuery(sql);      
            List list = q.getResultList();        
            int number=Integer.parseInt(list.get(0).toString());
            DecimalFormat df=new DecimalFormat("000"); 
            //System.out.println(df.format(number));
            return df.format(number+1);
        } catch (Exception e) {
            Logger.getLogger(Echelledao.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }

    }
}
