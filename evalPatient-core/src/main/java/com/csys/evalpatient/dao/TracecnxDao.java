/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.dao;

import com.csys.evalpatient.model.Tracecnx;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Mahdi Kallel <mahdi-kallel@live.fr>
 */
public class TracecnxDao {

    EntityManager em = FactoriesRepository.GetEntityManager(FactoriesRepository.getEvalPatientPU());

    public List<Tracecnx> getTracecnxByLoginIP(String login, String adresseip) {
        Query q = em.createNamedQuery("Tracecnx.getTracecnxByLoginIP", Tracecnx.class);
        q.setParameter("login", login);
        q.setParameter("adresseIP", adresseip);
        return q.getResultList();

    }
}
