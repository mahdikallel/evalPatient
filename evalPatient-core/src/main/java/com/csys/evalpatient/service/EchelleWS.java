/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.service;

import com.csys.evalpatient.dao.Echelledao;
import com.csys.evalpatient.model.Echelle;
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
     * @return 
     */
    @WebMethod(operationName = "findallechelle")
    public List<Echelle> findallechelle() {
        return new Echelledao().findallechelle();
    }
}
