
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour specialite complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="specialite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="libSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="txRetFraischange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specialite", propOrder = {
    "codSpec",
    "libSpec",
    "txRetFraischange"
})
public class Specialite {

    protected String codSpec;
    protected String libSpec;
    protected int txRetFraischange;

    /**
     * Obtient la valeur de la propriété codSpec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSpec() {
        return codSpec;
    }

    /**
     * Définit la valeur de la propriété codSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSpec(String value) {
        this.codSpec = value;
    }

    /**
     * Obtient la valeur de la propriété libSpec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibSpec() {
        return libSpec;
    }

    /**
     * Définit la valeur de la propriété libSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibSpec(String value) {
        this.libSpec = value;
    }

    /**
     * Obtient la valeur de la propriété txRetFraischange.
     * 
     */
    public int getTxRetFraischange() {
        return txRetFraischange;
    }

    /**
     * Définit la valeur de la propriété txRetFraischange.
     * 
     */
    public void setTxRetFraischange(int value) {
        this.txRetFraischange = value;
    }

}
