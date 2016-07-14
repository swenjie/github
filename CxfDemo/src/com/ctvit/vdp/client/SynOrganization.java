
package com.ctvit.vdp.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="organization" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OPERATION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="organizationid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="organizationname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationdesc" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="organizationcreatetime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "organization"
})
@XmlRootElement(name = "synOrganization")
public class SynOrganization {

    @XmlElement(required = true)
    protected List<SynOrganization.Organization> organization;

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SynOrganization.Organization }
     * 
     * 
     */
    public List<SynOrganization.Organization> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<SynOrganization.Organization>();
        }
        return this.organization;
    }


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
     *         &lt;element name="OPERATION" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="organizationid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="organizationname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationdesc" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="organizationcreatetime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        "operation",
        "organizationid",
        "organizationname",
        "organizationdesc",
        "organizationcreatetime"
    })
    public static class Organization {

        @XmlElement(name = "OPERATION")
        protected int operation;
        @XmlElement(required = true)
        protected String organizationid;
        protected String organizationname;
        protected Object organizationdesc;
        protected Object organizationcreatetime;

        /**
         * Gets the value of the operation property.
         * 
         */
        public int getOPERATION() {
            return operation;
        }

        /**
         * Sets the value of the operation property.
         * 
         */
        public void setOPERATION(int value) {
            this.operation = value;
        }

        /**
         * Gets the value of the organizationid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationid() {
            return organizationid;
        }

        /**
         * Sets the value of the organizationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationid(String value) {
            this.organizationid = value;
        }

        /**
         * Gets the value of the organizationname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationname() {
            return organizationname;
        }

        /**
         * Sets the value of the organizationname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationname(String value) {
            this.organizationname = value;
        }

        /**
         * Gets the value of the organizationdesc property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOrganizationdesc() {
            return organizationdesc;
        }

        /**
         * Sets the value of the organizationdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOrganizationdesc(Object value) {
            this.organizationdesc = value;
        }

        /**
         * Gets the value of the organizationcreatetime property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOrganizationcreatetime() {
            return organizationcreatetime;
        }

        /**
         * Sets the value of the organizationcreatetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOrganizationcreatetime(Object value) {
            this.organizationcreatetime = value;
        }

    }

}
