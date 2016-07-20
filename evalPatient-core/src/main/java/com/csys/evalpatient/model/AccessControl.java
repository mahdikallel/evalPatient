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
@Table(name = "Access Control")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccessControl.findAll", query = "SELECT a FROM AccessControl a"),
    @NamedQuery(name = "AccessControl.findByUserName", query = "SELECT a FROM AccessControl a WHERE a.userName = :userName"),
    @NamedQuery(name = "AccessControl.authentification", query = "SELECT a FROM AccessControl a WHERE a.userName = :userName and a.passWord = :passWord"),
    @NamedQuery(name = "AccessControl.findByMatricule", query = "SELECT a FROM AccessControl a WHERE a.matricule = :matricule"),
    @NamedQuery(name = "AccessControl.findByDescription", query = "SELECT a FROM AccessControl a WHERE a.description = :description"),
    @NamedQuery(name = "AccessControl.findByPassWord", query = "SELECT a FROM AccessControl a WHERE a.passWord = :passWord"),
    @NamedQuery(name = "AccessControl.findByGrp", query = "SELECT a FROM AccessControl a WHERE a.grp = :grp"),
    @NamedQuery(name = "AccessControl.findByOldGrp", query = "SELECT a FROM AccessControl a WHERE a.oldGrp = :oldGrp"),
    @NamedQuery(name = "AccessControl.findByCodeMedecinInfirmier", query = "SELECT a FROM AccessControl a WHERE a.codeMedecinInfirmier = :codeMedecinInfirmier"),
    @NamedQuery(name = "AccessControl.findByActif", query = "SELECT a FROM AccessControl a WHERE a.actif = :actif"),
    @NamedQuery(name = "AccessControl.findByChStat", query = "SELECT a FROM AccessControl a WHERE a.chStat = :chStat"),
    @NamedQuery(name = "AccessControl.findByDernierDateCnx", query = "SELECT a FROM AccessControl a WHERE a.dernierDateCnx = :dernierDateCnx"),
    @NamedQuery(name = "AccessControl.findByDateModPwd", query = "SELECT a FROM AccessControl a WHERE a.dateModPwd = :dateModPwd"),
    @NamedQuery(name = "AccessControl.findByTraceNotif", query = "SELECT a FROM AccessControl a WHERE a.traceNotif = :traceNotif"),
    @NamedQuery(name = "AccessControl.findByValidCptRend", query = "SELECT a FROM AccessControl a WHERE a.validCptRend = :validCptRend"),
    @NamedQuery(name = "AccessControl.findByCodeCarte", query = "SELECT a FROM AccessControl a WHERE a.codeCarte = :codeCarte"),
    @NamedQuery(name = "AccessControl.findByCodeCarteMinus", query = "SELECT a FROM AccessControl a WHERE a.codeCarteMinus = :codeCarteMinus"),
    @NamedQuery(name = "AccessControl.findByCledallas", query = "SELECT a FROM AccessControl a WHERE a.cledallas = :cledallas"),
    @NamedQuery(name = "AccessControl.findByStyleClaire", query = "SELECT a FROM AccessControl a WHERE a.styleClaire = :styleClaire"),
    @NamedQuery(name = "AccessControl.findByUserModif", query = "SELECT a FROM AccessControl a WHERE a.userModif = :userModif"),
    @NamedQuery(name = "AccessControl.findByAutoriseav", query = "SELECT a FROM AccessControl a WHERE a.autoriseav = :autoriseav"),
    @NamedQuery(name = "AccessControl.findByMatriculeResp", query = "SELECT a FROM AccessControl a WHERE a.matriculeResp = :matriculeResp"),
    @NamedQuery(name = "AccessControl.findByAutorisesecurite", query = "SELECT a FROM AccessControl a WHERE a.autorisesecurite = :autorisesecurite"),
    @NamedQuery(name = "AccessControl.findByExpire", query = "SELECT a FROM AccessControl a WHERE a.expire = :expire"),
    @NamedQuery(name = "AccessControl.findByNatureuserDS", query = "SELECT a FROM AccessControl a WHERE a.natureuserDS = :natureuserDS"),
    @NamedQuery(name = "AccessControl.findByValidPHNuit", query = "SELECT a FROM AccessControl a WHERE a.validPHNuit = :validPHNuit"),
    @NamedQuery(name = "AccessControl.findByAdminEvIndesirable", query = "SELECT a FROM AccessControl a WHERE a.adminEvIndesirable = :adminEvIndesirable"),
    @NamedQuery(name = "AccessControl.findByCodePin", query = "SELECT a FROM AccessControl a WHERE a.codePin = :codePin"),
    @NamedQuery(name = "AccessControl.findByCptShowAllPatient", query = "SELECT a FROM AccessControl a WHERE a.cptShowAllPatient = :cptShowAllPatient"),
    @NamedQuery(name = "AccessControl.findByCptconsultActivityAll", query = "SELECT a FROM AccessControl a WHERE a.cptconsultActivityAll = :cptconsultActivityAll"),
    @NamedQuery(name = "AccessControl.findByNature", query = "SELECT a FROM AccessControl a WHERE a.nature = :nature"),
    @NamedQuery(name = "AccessControl.findByCompteExpire", query = "SELECT a FROM AccessControl a WHERE a.compteExpire = :compteExpire"),
    @NamedQuery(name = "AccessControl.findByDateExpirationCompte", query = "SELECT a FROM AccessControl a WHERE a.dateExpirationCompte = :dateExpirationCompte"),
    @NamedQuery(name = "AccessControl.findByNbreJoursExpiration", query = "SELECT a FROM AccessControl a WHERE a.nbreJoursExpiration = :nbreJoursExpiration")})
public class AccessControl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "UserName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Matricule")
    private String matricule;
    @Size(max = 60)
    @Column(name = "Description")
    private String description;
    @Size(max = 15)
    @Column(name = "PassWord")
    private String passWord;
    @Size(max = 200)
    @Column(name = "Grp")
    private String grp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Old_Grp")
    private String oldGrp;
    @Size(max = 10)
    @Column(name = "Code_Medecin_Infirmier")
    private String codeMedecinInfirmier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "Actif")
    private String actif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "Ch_Stat")
    private String chStat;
    @Column(name = "Dernier_Date_Cnx")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dernierDateCnx;
    @Column(name = "Date_Mod_Pwd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModPwd;
    @Size(max = 2147483647)
    @Column(name = "TraceNotif")
    private String traceNotif;
    @Column(name = "Valid_Cpt_Rend")
    private Boolean validCptRend;
    @Size(max = 10)
    @Column(name = "Code_Carte")
    private String codeCarte;
    @Size(max = 10)
    @Column(name = "Code_Carte_Minus")
    private String codeCarteMinus;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Cledallas")
    private String cledallas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "styleClaire")
    private boolean styleClaire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "UserModif")
    private String userModif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "Autorise_av")
    private String autoriseav;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "MatriculeResp")
    private String matriculeResp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Autorise_securite")
    private boolean autorisesecurite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expire")
    private boolean expire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nature_user_DS")
    private String natureuserDS;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valid_PH_Nuit")
    private boolean validPHNuit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Admin_Ev_Indesirable")
    private boolean adminEvIndesirable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "codePin")
    private String codePin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cptShowAllPatient")
    private boolean cptShowAllPatient;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cptconsultActivityAll")
    private boolean cptconsultActivityAll;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nature")
    private String nature;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CompteExpire")
    private boolean compteExpire;
    @Column(name = "dateExpirationCompte")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateExpirationCompte;
    @Column(name = "nbre_jours_expiration")
    private Integer nbreJoursExpiration;

    public AccessControl() {
    }

    public AccessControl(String userName) {
        this.userName = userName;
    }

    public AccessControl(String userName, String matricule, String oldGrp, String actif, String chStat, String cledallas, boolean styleClaire, String userModif, String autoriseav, String matriculeResp, boolean autorisesecurite, boolean expire, String natureuserDS, boolean validPHNuit, boolean adminEvIndesirable, String codePin, boolean cptShowAllPatient, boolean cptconsultActivityAll, String nature, boolean compteExpire) {
        this.userName = userName;
        this.matricule = matricule;
        this.oldGrp = oldGrp;
        this.actif = actif;
        this.chStat = chStat;
        this.cledallas = cledallas;
        this.styleClaire = styleClaire;
        this.userModif = userModif;
        this.autoriseav = autoriseav;
        this.matriculeResp = matriculeResp;
        this.autorisesecurite = autorisesecurite;
        this.expire = expire;
        this.natureuserDS = natureuserDS;
        this.validPHNuit = validPHNuit;
        this.adminEvIndesirable = adminEvIndesirable;
        this.codePin = codePin;
        this.cptShowAllPatient = cptShowAllPatient;
        this.cptconsultActivityAll = cptconsultActivityAll;
        this.nature = nature;
        this.compteExpire = compteExpire;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public String getOldGrp() {
        return oldGrp;
    }

    public void setOldGrp(String oldGrp) {
        this.oldGrp = oldGrp;
    }

    public String getCodeMedecinInfirmier() {
        return codeMedecinInfirmier;
    }

    public void setCodeMedecinInfirmier(String codeMedecinInfirmier) {
        this.codeMedecinInfirmier = codeMedecinInfirmier;
    }

    public String getActif() {
        return actif;
    }

    public void setActif(String actif) {
        this.actif = actif;
    }

    public String getChStat() {
        return chStat;
    }

    public void setChStat(String chStat) {
        this.chStat = chStat;
    }

    public Date getDernierDateCnx() {
        return dernierDateCnx;
    }

    public void setDernierDateCnx(Date dernierDateCnx) {
        this.dernierDateCnx = dernierDateCnx;
    }

    public Date getDateModPwd() {
        return dateModPwd;
    }

    public void setDateModPwd(Date dateModPwd) {
        this.dateModPwd = dateModPwd;
    }

    public String getTraceNotif() {
        return traceNotif;
    }

    public void setTraceNotif(String traceNotif) {
        this.traceNotif = traceNotif;
    }

    public Boolean getValidCptRend() {
        return validCptRend;
    }

    public void setValidCptRend(Boolean validCptRend) {
        this.validCptRend = validCptRend;
    }

    public String getCodeCarte() {
        return codeCarte;
    }

    public void setCodeCarte(String codeCarte) {
        this.codeCarte = codeCarte;
    }

    public String getCodeCarteMinus() {
        return codeCarteMinus;
    }

    public void setCodeCarteMinus(String codeCarteMinus) {
        this.codeCarteMinus = codeCarteMinus;
    }

    public String getCledallas() {
        return cledallas;
    }

    public void setCledallas(String cledallas) {
        this.cledallas = cledallas;
    }

    public boolean getStyleClaire() {
        return styleClaire;
    }

    public void setStyleClaire(boolean styleClaire) {
        this.styleClaire = styleClaire;
    }

    public String getUserModif() {
        return userModif;
    }

    public void setUserModif(String userModif) {
        this.userModif = userModif;
    }

    public String getAutoriseav() {
        return autoriseav;
    }

    public void setAutoriseav(String autoriseav) {
        this.autoriseav = autoriseav;
    }

    public String getMatriculeResp() {
        return matriculeResp;
    }

    public void setMatriculeResp(String matriculeResp) {
        this.matriculeResp = matriculeResp;
    }

    public boolean getAutorisesecurite() {
        return autorisesecurite;
    }

    public void setAutorisesecurite(boolean autorisesecurite) {
        this.autorisesecurite = autorisesecurite;
    }

    public boolean getExpire() {
        return expire;
    }

    public void setExpire(boolean expire) {
        this.expire = expire;
    }

    public String getNatureuserDS() {
        return natureuserDS;
    }

    public void setNatureuserDS(String natureuserDS) {
        this.natureuserDS = natureuserDS;
    }

    public boolean getValidPHNuit() {
        return validPHNuit;
    }

    public void setValidPHNuit(boolean validPHNuit) {
        this.validPHNuit = validPHNuit;
    }

    public boolean getAdminEvIndesirable() {
        return adminEvIndesirable;
    }

    public void setAdminEvIndesirable(boolean adminEvIndesirable) {
        this.adminEvIndesirable = adminEvIndesirable;
    }

    public String getCodePin() {
        return codePin;
    }

    public void setCodePin(String codePin) {
        this.codePin = codePin;
    }

    public boolean getCptShowAllPatient() {
        return cptShowAllPatient;
    }

    public void setCptShowAllPatient(boolean cptShowAllPatient) {
        this.cptShowAllPatient = cptShowAllPatient;
    }

    public boolean getCptconsultActivityAll() {
        return cptconsultActivityAll;
    }

    public void setCptconsultActivityAll(boolean cptconsultActivityAll) {
        this.cptconsultActivityAll = cptconsultActivityAll;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public boolean getCompteExpire() {
        return compteExpire;
    }

    public void setCompteExpire(boolean compteExpire) {
        this.compteExpire = compteExpire;
    }

    public Date getDateExpirationCompte() {
        return dateExpirationCompte;
    }

    public void setDateExpirationCompte(Date dateExpirationCompte) {
        this.dateExpirationCompte = dateExpirationCompte;
    }

    public Integer getNbreJoursExpiration() {
        return nbreJoursExpiration;
    }

    public void setNbreJoursExpiration(Integer nbreJoursExpiration) {
        this.nbreJoursExpiration = nbreJoursExpiration;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessControl)) {
            return false;
        }
        AccessControl other = (AccessControl) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.evalpatient.model.AccessControl[ userName=" + userName + " ]";
    }
    
}
