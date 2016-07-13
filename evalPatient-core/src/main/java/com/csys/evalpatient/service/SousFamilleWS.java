/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.service;

import com.csys.evalpatient.dao.SousFamilledao;
import com.csys.evalpatient.model.SousFamille;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


/**
 *
 * @author Nabil Moalla
 */
@WebService(serviceName = "SousFamilleWS")
public class SousFamilleWS {

     /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallsousfamille")
    public List<SousFamille> findallsousfamille() {
        return new SousFamilledao().findallsousfamille();
    }
}
