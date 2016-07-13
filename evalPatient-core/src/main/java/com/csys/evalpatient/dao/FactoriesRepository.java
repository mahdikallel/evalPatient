

package com.csys.evalpatient.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactoriesRepository{

    //persistence unit of DB Gclinique
    private final static  String evalPatientPU="EvalPatientPU";
  

    public static String getEvalPatientPU() {
        return evalPatientPU;
    }  

    public FactoriesRepository() {
    }
    
    static EntityManagerFactory factoryevalPatient =null;
//    static EntityManagerFactory factorylabo =null;
//    static EntityManagerFactory factoryph =null;
//    static EntityManagerFactory factory =null;
    static EntityManager em=null;  
     public static EntityManagerFactory getFactory() {
        return factory;
    }

    public static void setFactory(EntityManagerFactory factory) {
        FactoriesRepository.factory = factory;
    }

   
    static EntityManagerFactory factory = null;
    
    public  static EntityManager GetEntityManager(String PU)
    {
        if(PU.equalsIgnoreCase(getEvalPatientPU()))
        {
            if(factoryevalPatient==null)    
            {
                factoryevalPatient= Persistence.createEntityManagerFactory(PU);                         
            }            
            em= factoryevalPatient.createEntityManager();               
        }
        
                       
        return em;
    }
}
