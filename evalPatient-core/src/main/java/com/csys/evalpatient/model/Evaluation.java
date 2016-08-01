/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.evalpatient.model;

/**
 *
 * @author Mahdi Kallel <mahdi-kallel@live.fr>
 */
public class Evaluation {
    
    private String id;
    private String famille;
    private String sousFamille;
    private String valeur;
    private String codeFamille;
    private String codeSousFamille;
    private String codeAide;

    public Evaluation(String id, String famille, String sousFamille, String valeur, String codeFamille, String codeSousFamille, String codeAide) {
        this.id = id;
        this.famille = famille;
        this.sousFamille = sousFamille;
        this.valeur = valeur;
        this.codeFamille = codeFamille;
        this.codeSousFamille = codeSousFamille;
        this.codeAide = codeAide;
    }

    public Evaluation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getSousFamille() {
        return sousFamille;
    }

    public void setSousFamille(String sousFamille) {
        this.sousFamille = sousFamille;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public String getCodeFamille() {
        return codeFamille;
    }

    public void setCodeFamille(String codeFamille) {
        this.codeFamille = codeFamille;
    }

    public String getCodeSousFamille() {
        return codeSousFamille;
    }

    public void setCodeSousFamille(String codeSousFamille) {
        this.codeSousFamille = codeSousFamille;
    }

    public String getCodeAide() {
        return codeAide;
    }

    public void setCodeAide(String codeAide) {
        this.codeAide = codeAide;
    }
    
    
    
    
}
