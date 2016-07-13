
package com.csys.evalpatient.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.csys.evalpatient.model.SousFamille;

@XmlRootElement(name = "findallsousfamilleResponse", namespace = "http://service.evalpatient.csys.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findallsousfamilleResponse", namespace = "http://service.evalpatient.csys.com/")
public class FindallsousfamilleResponse {

    @XmlElement(name = "return", namespace = "")
    private List<SousFamille> _return;

    /**
     * 
     * @return
     *     returns List<SousFamille>
     */
    public List<SousFamille> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<SousFamille> _return) {
        this._return = _return;
    }

}
