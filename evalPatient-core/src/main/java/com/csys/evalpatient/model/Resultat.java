/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mahdi Kallel <mahdi-kallel@live.fr>
 */
@Entity
@Table(name = "Resultat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resultat.findAll", query = "SELECT r FROM Resultat r"),
    @NamedQuery(name = "Resultat.findByCodeResultat", query = "SELECT r FROM Resultat r WHERE r.codeResultat = :codeResultat"),
    @NamedQuery(name = "Resultat.findByNumDossier", query = "SELECT r FROM Resultat r WHERE r.numDossier = :numDossier"),
    @NamedQuery(name = "Resultat.findByCodeSousFamille", query = "SELECT r FROM Resultat r WHERE r.codeSousFamille = :codeSousFamille"),
    @NamedQuery(name = "Resultat.findByValeur", query = "SELECT r FROM Resultat r WHERE r.valeur = :valeur"),
    @NamedQuery(name = "Resultat.findByDate", query = "SELECT r FROM Resultat r WHERE r.date = :date")})
   
public class Resultat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Code_Resultat")
    private Long codeResultat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Num_Dossier")
    private String numDossier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Code_Sous_Famille")
    private String codeSousFamille;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valeur")
    private int valeur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Resultat() {
    }

    public Resultat(Long codeResultat) {
        this.codeResultat = codeResultat;
    }

    public Resultat(Long codeResultat, String numDossier, String codeSousFamille, int valeur, Date date) {
        this.codeResultat = codeResultat;
        this.numDossier = numDossier;
        this.codeSousFamille = codeSousFamille;
        this.valeur = valeur;
        this.date = date;
    }

    public Long getCodeResultat() {
        return codeResultat;
    }

    public void setCodeResultat(Long codeResultat) {
        this.codeResultat = codeResultat;
    }

    public String getNumDossier() {
        return numDossier;
    }

    public void setNumDossier(String numDossier) {
        this.numDossier = numDossier;
    }

    public String getCodeSousFamille() {
        return codeSousFamille;
    }

    public void setCodeSousFamille(String codeSousFamille) {
        this.codeSousFamille = codeSousFamille;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeResultat != null ? codeResultat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resultat)) {
            return false;
        }
        Resultat other = (Resultat) object;
        if ((this.codeResultat == null && other.codeResultat != null) || (this.codeResultat != null && !this.codeResultat.equals(other.codeResultat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.Resultat[ codeResultat=" + codeResultat + " ]";
    }
    
}
