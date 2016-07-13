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
 * @author Nabil Moalla
 */
@Entity
@Table(name = "Trace_cnx")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tracecnx.findAll", query = "SELECT t FROM Tracecnx t"),
    @NamedQuery(name = "Tracecnx.findById", query = "SELECT t FROM Tracecnx t WHERE t.id = :id"),
    @NamedQuery(name = "Tracecnx.findByDateCnx", query = "SELECT t FROM Tracecnx t WHERE t.dateCnx = :dateCnx"),
    @NamedQuery(name = "Tracecnx.findByEtat", query = "SELECT t FROM Tracecnx t WHERE t.etat = :etat"),
    @NamedQuery(name = "Tracecnx.findByLogin", query = "SELECT t FROM Tracecnx t WHERE t.login = :login"),
    @NamedQuery(name = "Tracecnx.findByAdresseIP", query = "SELECT t FROM Tracecnx t WHERE t.adresseIP = :adresseIP"),
    @NamedQuery(name = "Tracecnx.findByCompteur", query = "SELECT t FROM Tracecnx t WHERE t.compteur = :compteur")})
public class Tracecnx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_cnx")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCnx;
    @Column(name = "etat")
    private Boolean etat;
    @Size(max = 255)
    @Column(name = "login")
    private String login;
    @Size(max = 255)
    @Column(name = "adresseIP")
    private String adresseIP;
    @Column(name = "compteur")
    private Integer compteur;

    public Tracecnx() {
    }

    public Tracecnx(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCnx() {
        return dateCnx;
    }

    public void setDateCnx(Date dateCnx) {
        this.dateCnx = dateCnx;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAdresseIP() {
        return adresseIP;
    }

    public void setAdresseIP(String adresseIP) {
        this.adresseIP = adresseIP;
    }

    public Integer getCompteur() {
        return compteur;
    }

    public void setCompteur(Integer compteur) {
        this.compteur = compteur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tracecnx)) {
            return false;
        }
        Tracecnx other = (Tracecnx) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.Tracecnx[ id=" + id + " ]";
    }
    
}
