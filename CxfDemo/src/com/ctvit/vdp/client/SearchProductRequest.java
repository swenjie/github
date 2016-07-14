
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
 *         &lt;element name="CREATERDATETIME_FROM" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CREATERDATETIME_TO" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PRODUCTNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORGANIZATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROGRAMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHANNEL_SECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "createrdatetimefrom",
    "createrdatetimeto",
    "productname",
    "organization",
    "programetype",
    "channelsection",
    "pageNum",
    "pageSize"
})
@XmlRootElement(name = "searchProductRequest")
public class SearchProductRequest {

    @XmlElement(name = "CREATERDATETIME_FROM")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createrdatetimefrom;
    @XmlElement(name = "CREATERDATETIME_TO")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createrdatetimeto;
    @XmlElement(name = "PRODUCTNAME")
    protected String productname;
    @XmlElement(name = "ORGANIZATION")
    protected String organization;
    @XmlElement(name = "PROGRAMETYPE")
    protected String programetype;
    @XmlElement(name = "CHANNEL_SECTION")
    protected String channelsection;
    @XmlElement(name = "PageNum")
    protected Integer pageNum;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;

    /**
     * Gets the value of the createrdatetimefrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATERDATETIMEFROM() {
        return createrdatetimefrom;
    }

    /**
     * Sets the value of the createrdatetimefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATERDATETIMEFROM(XMLGregorianCalendar value) {
        this.createrdatetimefrom = value;
    }

    /**
     * Gets the value of the createrdatetimeto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATERDATETIMETO() {
        return createrdatetimeto;
    }

    /**
     * Sets the value of the createrdatetimeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATERDATETIMETO(XMLGregorianCalendar value) {
        this.createrdatetimeto = value;
    }

    /**
     * Gets the value of the productname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTNAME() {
        return productname;
    }

    /**
     * Sets the value of the productname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTNAME(String value) {
        this.productname = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGANIZATION() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGANIZATION(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the programetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGRAMETYPE() {
        return programetype;
    }

    /**
     * Sets the value of the programetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGRAMETYPE(String value) {
        this.programetype = value;
    }

    /**
     * Gets the value of the channelsection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHANNELSECTION() {
        return channelsection;
    }

    /**
     * Sets the value of the channelsection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHANNELSECTION(String value) {
        this.channelsection = value;
    }

    /**
     * Gets the value of the pageNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * Sets the value of the pageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNum(Integer value) {
        this.pageNum = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

}
