/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.service;


import com.csys.evalpatient.dao.Specialitedao;
import com.csys.evalpatient.model.Specialite;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;


/**
 *
 * @author Nabil Moalla
 */
@WebService(serviceName = "SpecialiteWS")
public class SpecialiteWS {

     /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "findallspecialite")
    public List<Specialite> findallspecialite() {
        return new Specialitedao().findallspecialite();
    }
}
