package com.csys.evalpatient.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-13T13:50:57")
@StaticMetamodel(Resultat.class)
public class Resultat_ { 

    public static volatile SingularAttribute<Resultat, Date> date;
    public static volatile SingularAttribute<Resultat, String> numDossier;
    public static volatile SingularAttribute<Resultat, Integer> valeur;
    public static volatile SingularAttribute<Resultat, String> codeSousFamille;
    public static volatile SingularAttribute<Resultat, Long> codeResultat;

}