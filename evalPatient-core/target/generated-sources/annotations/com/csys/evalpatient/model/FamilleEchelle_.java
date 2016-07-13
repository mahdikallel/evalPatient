package com.csys.evalpatient.model;

import com.csys.evalpatient.model.SousFamille;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-13T12:46:27")
@StaticMetamodel(FamilleEchelle.class)
public class FamilleEchelle_ { 

    public static volatile SingularAttribute<FamilleEchelle, String> codeFamille;
    public static volatile SingularAttribute<FamilleEchelle, String> designation;
    public static volatile SingularAttribute<FamilleEchelle, String> codeAide;
    public static volatile CollectionAttribute<FamilleEchelle, SousFamille> sousFamilleCollection;
    public static volatile SingularAttribute<FamilleEchelle, String> codeEchelle;

}