/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mahdi Kallel <mahdi-kallel@live.fr>
 */
@Entity
@Table(name = "Sous_Famille")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SousFamille.findAll", query = "SELECT s FROM SousFamille s"),
    @NamedQuery(name = "SousFamille.findByCodeSousFamille", query = "SELECT s FROM SousFamille s WHERE s.codeSousFamille = :codeSousFamille"),
    @NamedQuery(name = "SousFamille.findByDesignation", query = "SELECT s FROM SousFamille s WHERE s.designation = :designation"),
    @NamedQuery(name = "SousFamille.findByValeur", query = "SELECT s FROM SousFamille s WHERE s.valeur = :valeur")})
public class SousFamille implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Code_Sous_Famille")
    private String codeSousFamille;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Designation")
    private String designation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valeur")
    private int valeur;
    @JoinColumn(name = "Code_Famille", referencedColumnName = "Code_Famille")
    @ManyToOne(optional = false)
    private FamilleEchelle codeFamille;

    public SousFamille() {
    }

    public SousFamille(String codeSousFamille) {
        this.codeSousFamille = codeSousFamille;
    }

    public SousFamille(String codeSousFamille, String designation, int valeur) {
        this.codeSousFamille = codeSousFamille;
        this.designation = designation;
        this.valeur = valeur;
    }

    public String getCodeSousFamille() {
        return codeSousFamille;
    }

    public void setCodeSousFamille(String codeSousFamille) {
        this.codeSousFamille = codeSousFamille;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public FamilleEchelle getCodeFamille() {
        return codeFamille;
    }

    public void setCodeFamille(FamilleEchelle codeFamille) {
        this.codeFamille = codeFamille;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSousFamille != null ? codeSousFamille.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SousFamille)) {
            return false;
        }
        SousFamille other = (SousFamille) object;
        if ((this.codeSousFamille == null && other.codeSousFamille != null) || (this.codeSousFamille != null && !this.codeSousFamille.equals(other.codeSousFamille))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.SousFamille[ codeSousFamille=" + codeSousFamille + " ]";
    }
    
}
