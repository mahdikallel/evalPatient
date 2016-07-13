
package com.csys.evalpatient.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.csys.evalpatient.model.Resultat;

@XmlRootElement(name = "findallresultatResponse", namespace = "http://service.evalpatient.csys.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findallresultatResponse", namespace = "http://service.evalpatient.csys.com/")
public class FindallresultatResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Resultat> _return;

    /**
     * 
     * @return
     *     returns List<Resultat>
     */
    public List<Resultat> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Resultat> _return) {
        this._return = _return;
    }

}
