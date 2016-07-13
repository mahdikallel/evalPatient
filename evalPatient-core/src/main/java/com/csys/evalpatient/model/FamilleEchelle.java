/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mahdi Kallel <mahdi-kallel@live.fr>
 */
@Entity
@Table(name = "Famille_Echelle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FamilleEchelle.findAll", query = "SELECT f FROM FamilleEchelle f"),
    @NamedQuery(name = "FamilleEchelle.findByCodeFamille", query = "SELECT f FROM FamilleEchelle f WHERE f.codeFamille = :codeFamille"),
    @NamedQuery(name = "FamilleEchelle.findByDesignation", query = "SELECT f FROM FamilleEchelle f WHERE f.designation = :designation"),
    @NamedQuery(name = "FamilleEchelle.findByCodeEchelle", query = "SELECT f FROM FamilleEchelle f WHERE f.codeEchelle = :codeEchelle"),
    @NamedQuery(name = "FamilleEchelle.findByCodeAide", query = "SELECT f FROM FamilleEchelle f WHERE f.codeAide = :codeAide")})
public class FamilleEchelle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Code_Famille")
    private String codeFamille;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Designation")
    private String designation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Code_Echelle")
    private String codeEchelle;
    @Size(max = 5)
    @Column(name = "Code_Aide")
    private String codeAide;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeFamille")
    private Collection<SousFamille> sousFamilleCollection;

    public FamilleEchelle() {
    }

    public FamilleEchelle(String codeFamille) {
        this.codeFamille = codeFamille;
    }

    public FamilleEchelle(String codeFamille, String designation, String codeEchelle) {
        this.codeFamille = codeFamille;
        this.designation = designation;
        this.codeEchelle = codeEchelle;
    }

    public String getCodeFamille() {
        return codeFamille;
    }

    public void setCodeFamille(String codeFamille) {
        this.codeFamille = codeFamille;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCodeEchelle() {
        return codeEchelle;
    }

    public void setCodeEchelle(String codeEchelle) {
        this.codeEchelle = codeEchelle;
    }

    public String getCodeAide() {
        return codeAide;
    }

    public void setCodeAide(String codeAide) {
        this.codeAide = codeAide;
    }

    @XmlTransient
    public Collection<SousFamille> getSousFamilleCollection() {
        return sousFamilleCollection;
    }

    public void setSousFamilleCollection(Collection<SousFamille> sousFamilleCollection) {
        this.sousFamilleCollection = sousFamilleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeFamille != null ? codeFamille.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FamilleEchelle)) {
            return false;
        }
        FamilleEchelle other = (FamilleEchelle) object;
        if ((this.codeFamille == null && other.codeFamille != null) || (this.codeFamille != null && !this.codeFamille.equals(other.codeFamille))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.FamilleEchelle[ codeFamille=" + codeFamille + " ]";
    }
    
}
