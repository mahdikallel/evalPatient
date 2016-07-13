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
@Table(name = "Echelle_Specialite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EchelleSpecialite.findAll", query = "SELECT e FROM EchelleSpecialite e"),
    @NamedQuery(name = "EchelleSpecialite.findByCodeechelleSpecialite", query = "SELECT e FROM EchelleSpecialite e WHERE e.codeechelleSpecialite = :codeechelleSpecialite"),
    @NamedQuery(name = "EchelleSpecialite.findByCodeEchelle", query = "SELECT e FROM EchelleSpecialite e WHERE e.codeEchelle = :codeEchelle"),
    @NamedQuery(name = "EchelleSpecialite.findByCodeSpecialite", query = "SELECT e FROM EchelleSpecialite e WHERE e.codeSpecialite = :codeSpecialite")})
public class EchelleSpecialite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Code_echelle_Specialite")
    private String codeechelleSpecialite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Code_Echelle")
    private String codeEchelle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Code_Specialite")
    private String codeSpecialite;

    public EchelleSpecialite() {
    }

    public EchelleSpecialite(String codeechelleSpecialite) {
        this.codeechelleSpecialite = codeechelleSpecialite;
    }

    public EchelleSpecialite(String codeechelleSpecialite, String codeEchelle, String codeSpecialite) {
        this.codeechelleSpecialite = codeechelleSpecialite;
        this.codeEchelle = codeEchelle;
        this.codeSpecialite = codeSpecialite;
    }

    public String getCodeechelleSpecialite() {
        return codeechelleSpecialite;
    }

    public void setCodeechelleSpecialite(String codeechelleSpecialite) {
        this.codeechelleSpecialite = codeechelleSpecialite;
    }

    public String getCodeEchelle() {
        return codeEchelle;
    }

    public void setCodeEchelle(String codeEchelle) {
        this.codeEchelle = codeEchelle;
    }

    public String getCodeSpecialite() {
        return codeSpecialite;
    }

    public void setCodeSpecialite(String codeSpecialite) {
        this.codeSpecialite = codeSpecialite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeechelleSpecialite != null ? codeechelleSpecialite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EchelleSpecialite)) {
            return false;
        }
        EchelleSpecialite other = (EchelleSpecialite) object;
        if ((this.codeechelleSpecialite == null && other.codeechelleSpecialite != null) || (this.codeechelleSpecialite != null && !this.codeechelleSpecialite.equals(other.codeechelleSpecialite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.EchelleSpecialite[ codeechelleSpecialite=" + codeechelleSpecialite + " ]";
    }
    
}
