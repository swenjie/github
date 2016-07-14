
package com.ctvit.vdp.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="sorttreeid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="epgdate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "sorttreeid",
    "epgdate"
})
@XmlRootElement(name = "synEPGRequest")
public class SynEPGRequest {

    @XmlElement(required = true)
    protected String sorttreeid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar epgdate;

    /**
     * Gets the value of the sorttreeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorttreeid() {
        return sorttreeid;
    }

    /**
     * Sets the value of the sorttreeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorttreeid(String value) {
        this.sorttreeid = value;
    }

    /**
     * Gets the value of the epgdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEpgdate() {
        return epgdate;
    }

    /**
     * Sets the value of the epgdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEpgdate(XMLGregorianCalendar value) {
        this.epgdate = value;
    }

}
