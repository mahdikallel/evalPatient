
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour sousFamille complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sousFamille">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeFamille" type="{http://service.evalpatient.csys.com/}familleEchelle" minOccurs="0"/>
 *         &lt;element name="codeSousFamille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valeur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sousFamille", propOrder = {
    "codeFamille",
    "codeSousFamille",
    "designation",
    "valeur"
})
public class SousFamille {

    protected FamilleEchelle codeFamille;
    protected String codeSousFamille;
    protected String designation;
    protected int valeur;

    /**
     * Obtient la valeur de la propriété codeFamille.
     * 
     * @return
     *     possible object is
     *     {@link FamilleEchelle }
     *     
     */
    public FamilleEchelle getCodeFamille() {
        return codeFamille;
    }

    /**
     * Définit la valeur de la propriété codeFamille.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilleEchelle }
     *     
     */
    public void setCodeFamille(FamilleEchelle value) {
        this.codeFamille = value;
    }

    /**
     * Obtient la valeur de la propriété codeSousFamille.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSousFamille() {
        return codeSousFamille;
    }

    /**
     * Définit la valeur de la propriété codeSousFamille.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSousFamille(String value) {
        this.codeSousFamille = value;
    }

    /**
     * Obtient la valeur de la propriété designation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Définit la valeur de la propriété designation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignation(String value) {
        this.designation = value;
    }

    /**
     * Obtient la valeur de la propriété valeur.
     * 
     */
    public int getValeur() {
        return valeur;
    }

    /**
     * Définit la valeur de la propriété valeur.
     * 
     */
    public void setValeur(int value) {
        this.valeur = value;
    }

}
