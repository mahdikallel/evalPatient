
package com.csys.evalpatient.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.csys.evalpatient.model.FamilleEchelle;

@XmlRootElement(name = "findallfamilleechelleResponse", namespace = "http://service.evalpatient.csys.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findallfamilleechelleResponse", namespace = "http://service.evalpatient.csys.com/")
public class FindallfamilleechelleResponse {

    @XmlElement(name = "return", namespace = "")
    private List<FamilleEchelle> _return;

    /**
     * 
     * @return
     *     returns List<FamilleEchelle>
     */
    public List<FamilleEchelle> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<FamilleEchelle> _return) {
        this._return = _return;
    }

}
