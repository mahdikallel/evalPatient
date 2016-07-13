/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.service;


import com.csys.evalpatient.dao.FamilleEchelledao;
import com.csys.evalpatient.model.FamilleEchelle;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


/**
 *
 * @author Nabil Moalla
 */
@WebService(serviceName = "FamilleEchelleWS")
public class FamilleEchelleWS {

     /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallfamilleechelle")
    public List<FamilleEchelle> findallfamilleechelle() {
        return new FamilleEchelledao().findallfamilleechelle();
    }
}
