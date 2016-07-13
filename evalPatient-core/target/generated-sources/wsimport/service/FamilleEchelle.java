
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour familleEchelle complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="familleEchelle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeAide" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeEchelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeFamille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "familleEchelle", propOrder = {
    "codeAide",
    "codeEchelle",
    "codeFamille",
    "designation"
})
public class FamilleEchelle {

    protected String codeAide;
    protected String codeEchelle;
    protected String codeFamille;
    protected String designation;

    /**
     * Obtient la valeur de la propriété codeAide.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAide() {
        return codeAide;
    }

    /**
     * Définit la valeur de la propriété codeAide.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAide(String value) {
        this.codeAide = value;
    }

    /**
     * Obtient la valeur de la propriété codeEchelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeEchelle() {
        return codeEchelle;
    }

    /**
     * Définit la valeur de la propriété codeEchelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeEchelle(String value) {
        this.codeEchelle = value;
    }

    /**
     * Obtient la valeur de la propriété codeFamille.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeFamille() {
        return codeFamille;
    }

    /**
     * Définit la valeur de la propriété codeFamille.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeFamille(String value) {
        this.codeFamille = value;
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

}
