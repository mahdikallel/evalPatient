/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.service;

import com.csys.evalpatient.dao.EchelleSpecialitedao;
import com.csys.evalpatient.model.EchelleSpecialite;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


/**
 *
 * @author Nabil Moalla
 */
@WebService(serviceName = "EchelleSpecialiteWS")
public class EchelleSpecialiteWS {

    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallechellespecialite")
    public List<EchelleSpecialite> findallechellespecialite() {
        return new EchelleSpecialitedao().findallechellespecialite();
    }
}
