/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.service;


import com.csys.evalpatient.dao.Resultatdao;
import com.csys.evalpatient.model.Resultat;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


/**
 *
 * @author Nabil Moalla
 */
@WebService(serviceName = "ResultatWS")
public class ResultatWS {

     /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallresultat")
    public List<Resultat> findallresultat() {
        return new Resultatdao().findallresultat();
    }
}
