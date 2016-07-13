/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.dao;


import com.csys.evalpatient.model.FamilleEchelle;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Nabil Moalla
 */
public class FamilleEchelledao {
     EntityManager em  =FactoriesRepository.GetEntityManager(FactoriesRepository.getEvalPatientPU());
    
    public List<FamilleEchelle> findallfamilleechelle(){
        Query q=em.createNamedQuery("FamilleEchelle.findAll", FamilleEchelle.class);
        return q.getResultList();
        
    }
}
