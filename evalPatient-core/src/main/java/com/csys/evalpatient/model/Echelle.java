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
import javax.persistence.Lob;
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
@Table(name = "Echelle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Echelle.findAll", query = "SELECT e FROM Echelle e"),
    @NamedQuery(name = "Echelle.findByCodeEchelle", query = "SELECT e FROM Echelle e WHERE e.codeEchelle = :codeEchelle"),
    @NamedQuery(name = "Echelle.findByDesignation", query = "SELECT e FROM Echelle e WHERE e.designation = :designation"),
    @NamedQuery(name = "Echelle.findByValeurMinimale", query = "SELECT e FROM Echelle e WHERE e.valeurMinimale = :valeurMinimale"),
    @NamedQuery(name = "Echelle.findByValeurMoyenne", query = "SELECT e FROM Echelle e WHERE e.valeurMoyenne = :valeurMoyenne"),
    @NamedQuery(name = "Echelle.findByValeurMaximale", query = "SELECT e FROM Echelle e WHERE e.valeurMaximale = :valeurMaximale")})
public class Echelle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Code_Echelle")
    private String codeEchelle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Designation")
    private String designation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valeur_Minimale")
    private int valeurMinimale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valeur_Moyenne")
    private int valeurMoyenne;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valeur_Maximale")
    private int valeurMaximale;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Description")
    private String description;

    public Echelle() {
    }

    public Echelle(String codeEchelle) {
        this.codeEchelle = codeEchelle;
    }

    public Echelle(String codeEchelle, String designation, int valeurMinimale, int valeurMoyenne, int valeurMaximale) {
        this.codeEchelle = codeEchelle;
        this.designation = designation;
        this.valeurMinimale = valeurMinimale;
        this.valeurMoyenne = valeurMoyenne;
        this.valeurMaximale = valeurMaximale;
    }

    public String getCodeEchelle() {
        return codeEchelle;
    }

    public void setCodeEchelle(String codeEchelle) {
        this.codeEchelle = codeEchelle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getValeurMinimale() {
        return valeurMinimale;
    }

    public void setValeurMinimale(int valeurMinimale) {
        this.valeurMinimale = valeurMinimale;
    }

    public int getValeurMoyenne() {
        return valeurMoyenne;
    }

    public void setValeurMoyenne(int valeurMoyenne) {
        this.valeurMoyenne = valeurMoyenne;
    }

    public int getValeurMaximale() {
        return valeurMaximale;
    }

    public void setValeurMaximale(int valeurMaximale) {
        this.valeurMaximale = valeurMaximale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEchelle != null ? codeEchelle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Echelle)) {
            return false;
        }
        Echelle other = (Echelle) object;
        if ((this.codeEchelle == null && other.codeEchelle != null) || (this.codeEchelle != null && !this.codeEchelle.equals(other.codeEchelle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.Echelle[ codeEchelle=" + codeEchelle + " ]";
    }
    
}
