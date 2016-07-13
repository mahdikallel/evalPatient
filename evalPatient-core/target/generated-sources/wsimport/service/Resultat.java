
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour resultat complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="resultat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeResultat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="codeSousFamille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "resultat", propOrder = {
    "codeResultat",
    "codeSousFamille",
    "date",
    "numDossier",
    "valeur"
})
public class Resultat {

    protected Long codeResultat;
    protected String codeSousFamille;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected String numDossier;
    protected int valeur;

    /**
     * Obtient la valeur de la propriété codeResultat.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeResultat() {
        return codeResultat;
    }

    /**
     * Définit la valeur de la propriété codeResultat.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeResultat(Long value) {
        this.codeResultat = value;
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
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propriété numDossier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDossier() {
        return numDossier;
    }

    /**
     * Définit la valeur de la propriété numDossier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDossier(String value) {
        this.numDossier = value;
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
