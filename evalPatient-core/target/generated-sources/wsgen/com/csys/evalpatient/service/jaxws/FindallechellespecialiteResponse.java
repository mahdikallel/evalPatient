
package com.csys.evalpatient.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.csys.evalpatient.model.EchelleSpecialite;

@XmlRootElement(name = "findallechellespecialiteResponse", namespace = "http://service.evalpatient.csys.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findallechellespecialiteResponse", namespace = "http://service.evalpatient.csys.com/")
public class FindallechellespecialiteResponse {

    @XmlElement(name = "return", namespace = "")
    private List<EchelleSpecialite> _return;

    /**
     * 
     * @return
     *     returns List<EchelleSpecialite>
     */
    public List<EchelleSpecialite> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<EchelleSpecialite> _return) {
        this._return = _return;
    }

}
