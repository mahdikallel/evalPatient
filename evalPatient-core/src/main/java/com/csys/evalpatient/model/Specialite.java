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
@Table(name = "Specialite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialite.findAll", query = "SELECT s FROM Specialite s"),
    @NamedQuery(name = "Specialite.findByCodSpec", query = "SELECT s FROM Specialite s WHERE s.codSpec = :codSpec"),
    @NamedQuery(name = "Specialite.findByLibSpec", query = "SELECT s FROM Specialite s WHERE s.libSpec = :libSpec"),
    @NamedQuery(name = "Specialite.findByTxRetFraischange", query = "SELECT s FROM Specialite s WHERE s.txRetFraischange = :txRetFraischange")})
public class Specialite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "CodSpec")
    private String codSpec;
    @Size(max = 30)
    @Column(name = "LibSpec")
    private String libSpec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tx_Ret_Frais_change")
    private int txRetFraischange;

    public Specialite() {
    }

    public Specialite(String codSpec) {
        this.codSpec = codSpec;
    }

    public Specialite(String codSpec, int txRetFraischange) {
        this.codSpec = codSpec;
        this.txRetFraischange = txRetFraischange;
    }

    public String getCodSpec() {
        return codSpec;
    }

    public void setCodSpec(String codSpec) {
        this.codSpec = codSpec;
    }

    public String getLibSpec() {
        return libSpec;
    }

    public void setLibSpec(String libSpec) {
        this.libSpec = libSpec;
    }

    public int getTxRetFraischange() {
        return txRetFraischange;
    }

    public void setTxRetFraischange(int txRetFraischange) {
        this.txRetFraischange = txRetFraischange;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSpec != null ? codSpec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialite)) {
            return false;
        }
        Specialite other = (Specialite) object;
        if ((this.codSpec == null && other.codSpec != null) || (this.codSpec != null && !this.codSpec.equals(other.codSpec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.Specialite[ codSpec=" + codSpec + " ]";
    }
    
}
