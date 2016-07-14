
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
 *         &lt;element name="COMMITFLAG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="COMMITDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "commitflag",
    "commitdesc"
})
@XmlRootElement(name = "achieveMaterialResponse")
public class AchieveMaterialResponse {

    @XmlElement(name = "COMMITFLAG")
    protected int commitflag;
    @XmlElement(name = "COMMITDESC")
    protected String commitdesc;

    /**
     * Gets the value of the commitflag property.
     * 
     */
    public int getCOMMITFLAG() {
        return commitflag;
    }

    /**
     * Sets the value of the commitflag property.
     * 
     */
    public void setCOMMITFLAG(int value) {
        this.commitflag = value;
    }

    /**
     * Gets the value of the commitdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMMITDESC() {
        return commitdesc;
    }

    /**
     * Sets the value of the commitdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMMITDESC(String value) {
        this.commitdesc = value;
    }

}
