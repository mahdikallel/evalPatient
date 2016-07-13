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
 * @author Nabil Moalla
 */
@Entity
@Table(name = "Action")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserAction.findAll", query = "SELECT u FROM UserAction u"),
    @NamedQuery(name = "UserAction.findByModule", query = "SELECT u FROM UserAction u WHERE u.module = :module"),
    @NamedQuery(name = "UserAction.findByMenu", query = "SELECT u FROM UserAction u WHERE u.menu = :menu"),
    @NamedQuery(name = "UserAction.findByAction", query = "SELECT u FROM UserAction u WHERE u.action = :action"),
    @NamedQuery(name = "UserAction.findByDesignationAction", query = "SELECT u FROM UserAction u WHERE u.designationAction = :designationAction"),
    @NamedQuery(name = "UserAction.findByAutre", query = "SELECT u FROM UserAction u WHERE u.autre = :autre")})
public class UserAction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "Module")
    private String module;
    @Size(max = 20)
    @Column(name = "Menu")
    private String menu;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Action")
    private String action;
    @Size(max = 50)
    @Column(name = "Designation_Action")
    private String designationAction;
    @Size(max = 50)
    @Column(name = "Autre")
    private String autre;

    public UserAction() {
    }

    public UserAction(String action) {
        this.action = action;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDesignationAction() {
        return designationAction;
    }

    public void setDesignationAction(String designationAction) {
        this.designationAction = designationAction;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (action != null ? action.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAction)) {
            return false;
        }
        UserAction other = (UserAction) object;
        if ((this.action == null && other.action != null) || (this.action != null && !this.action.equals(other.action))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.UserAction[ action=" + action + " ]";
    }
    
}
