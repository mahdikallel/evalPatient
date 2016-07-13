
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour echelleSpecialite complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="echelleSpecialite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeEchelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeSpecialite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeechelleSpecialite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "echelleSpecialite", propOrder = {
    "codeEchelle",
    "codeSpecialite",
    "codeechelleSpecialite"
})
public class EchelleSpecialite {

    protected String codeEchelle;
    protected String codeSpecialite;
    protected String codeechelleSpecialite;

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
     * Obtient la valeur de la propriété codeSpecialite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSpecialite() {
        return codeSpecialite;
    }

    /**
     * Définit la valeur de la propriété codeSpecialite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSpecialite(String value) {
        this.codeSpecialite = value;
    }

    /**
     * Obtient la valeur de la propriété codeechelleSpecialite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeechelleSpecialite() {
        return codeechelleSpecialite;
    }

    /**
     * Définit la valeur de la propriété codeechelleSpecialite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeechelleSpecialite(String value) {
        this.codeechelleSpecialite = value;
    }

}
