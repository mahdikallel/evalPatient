package com.csys.evalpatient.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-29T10:54:38")
@StaticMetamodel(AccessControl.class)
public class AccessControl_ { 

    public static volatile SingularAttribute<AccessControl, String> passWord;
    public static volatile SingularAttribute<AccessControl, Boolean> validPHNuit;
    public static volatile SingularAttribute<AccessControl, Integer> nbreJoursExpiration;
    public static volatile SingularAttribute<AccessControl, Date> dateModPwd;
    public static volatile SingularAttribute<AccessControl, Boolean> compteExpire;
    public static volatile SingularAttribute<AccessControl, String> codeCarteMinus;
    public static volatile SingularAttribute<AccessControl, String> matricule;
    public static volatile SingularAttribute<AccessControl, String> description;
    public static volatile SingularAttribute<AccessControl, String> chStat;
    public static volatile SingularAttribute<AccessControl, String> codePin;
    public static volatile SingularAttribute<AccessControl, String> natureuserDS;
    public static volatile SingularAttribute<AccessControl, String> autoriseav;
    public static volatile SingularAttribute<AccessControl, String> traceNotif;
    public static volatile SingularAttribute<AccessControl, Boolean> validCptRend;
    public static volatile SingularAttribute<AccessControl, String> codeMedecinInfirmier;
    public static volatile SingularAttribute<AccessControl, String> grp;
    public static volatile SingularAttribute<AccessControl, String> nature;
    public static volatile SingularAttribute<AccessControl, String> codeCarte;
    public static volatile SingularAttribute<AccessControl, String> userModif;
    public static volatile SingularAttribute<AccessControl, String> actif;
    public static volatile SingularAttribute<AccessControl, String> userName;
    public static volatile SingularAttribute<AccessControl, Boolean> autorisesecurite;
    public static volatile SingularAttribute<AccessControl, Boolean> adminEvIndesirable;
    public static volatile SingularAttribute<AccessControl, Boolean> styleClaire;
    public static volatile SingularAttribute<AccessControl, String> cledallas;
    public static volatile SingularAttribute<AccessControl, String> oldGrp;
    public static volatile SingularAttribute<AccessControl, Boolean> cptconsultActivityAll;
    public static volatile SingularAttribute<AccessControl, Boolean> expire;
    public static volatile SingularAttribute<AccessControl, Date> dateExpirationCompte;
    public static volatile SingularAttribute<AccessControl, String> matriculeResp;
    public static volatile SingularAttribute<AccessControl, Boolean> cptShowAllPatient;
    public static volatile SingularAttribute<AccessControl, Date> dernierDateCnx;

}