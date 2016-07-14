
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
 *         &lt;element name="treename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="treeparentname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="extrainfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "treename",
    "treeparentname",
    "extrainfo"
})
@XmlRootElement(name = "synSortTreeRequest")
public class SynSortTreeRequest {

    @XmlElement(required = true)
    protected String treename;
    @XmlElement(required = true)
    protected String treeparentname;
    protected String extrainfo;

    /**
     * Gets the value of the treename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreename() {
        return treename;
    }

    /**
     * Sets the value of the treename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreename(String value) {
        this.treename = value;
    }

    /**
     * Gets the value of the treeparentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeparentname() {
        return treeparentname;
    }

    /**
     * Sets the value of the treeparentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeparentname(String value) {
        this.treeparentname = value;
    }

    /**
     * Gets the value of the extrainfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrainfo() {
        return extrainfo;
    }

    /**
     * Sets the value of the extrainfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrainfo(String value) {
        this.extrainfo = value;
    }

}
