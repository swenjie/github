
package com.ctvit.vdp.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DOFLAG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DODESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doflag",
    "dodesc"
})
@XmlRootElement(name = "synUsersResponse")
public class SynUsersResponse {

    @XmlElement(name = "DOFLAG")
    protected int doflag;
    @XmlElement(name = "DODESC")
    protected String dodesc;

    /**
     * Gets the value of the doflag property.
     * 
     */
    public int getDOFLAG() {
        return doflag;
    }

    /**
     * Sets the value of the doflag property.
     * 
     */
    public void setDOFLAG(int value) {
        this.doflag = value;
    }

    /**
     * Gets the value of the dodesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDODESC() {
        return dodesc;
    }

    /**
     * Sets the value of the dodesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDODESC(String value) {
        this.dodesc = value;
    }

}
