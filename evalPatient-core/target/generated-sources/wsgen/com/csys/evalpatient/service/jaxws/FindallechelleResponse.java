
package com.csys.evalpatient.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.csys.evalpatient.model.Echelle;

@XmlRootElement(name = "findallechelleResponse", namespace = "http://service.evalpatient.csys.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findallechelleResponse", namespace = "http://service.evalpatient.csys.com/")
public class FindallechelleResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Echelle> _return;

    /**
     * 
     * @return
     *     returns List<Echelle>
     */
    public List<Echelle> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Echelle> _return) {
        this._return = _return;
    }

}
