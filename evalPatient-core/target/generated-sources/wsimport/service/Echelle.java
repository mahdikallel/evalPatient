
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour echelle complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="echelle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeEchelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="designation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valeurMaximale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valeurMinimale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valeurMoyenne" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "echelle", propOrder = {
    "codeEchelle",
    "description",
    "designation",
    "valeurMaximale",
    "valeurMinimale",
    "valeurMoyenne"
})
public class Echelle {

    protected String codeEchelle;
    protected String description;
    protected String designation;
    protected int valeurMaximale;
    protected int valeurMinimale;
    protected int valeurMoyenne;

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
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Obtient la valeur de la propriété valeurMaximale.
     * 
     */
    public int getValeurMaximale() {
        return valeurMaximale;
    }

    /**
     * Définit la valeur de la propriété valeurMaximale.
     * 
     */
    public void setValeurMaximale(int value) {
        this.valeurMaximale = value;
    }

    /**
     * Obtient la valeur de la propriété valeurMinimale.
     * 
     */
    public int getValeurMinimale() {
        return valeurMinimale;
    }

    /**
     * Définit la valeur de la propriété valeurMinimale.
     * 
     */
    public void setValeurMinimale(int value) {
        this.valeurMinimale = value;
    }

    /**
     * Obtient la valeur de la propriété valeurMoyenne.
     * 
     */
    public int getValeurMoyenne() {
        return valeurMoyenne;
    }

    /**
     * Définit la valeur de la propriété valeurMoyenne.
     * 
     */
    public void setValeurMoyenne(int value) {
        this.valeurMoyenne = value;
    }

}
