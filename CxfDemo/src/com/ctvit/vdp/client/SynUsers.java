
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
 *         &lt;element name="user" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OPERATION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationid" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="userpassword" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="userrealname" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="userflag" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="useremail" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="userphone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="createtime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "user"
})
@XmlRootElement(name = "synUsers")
public class SynUsers {

    @XmlElement(required = true)
    protected List<SynUsers.User> user;

    /**
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SynUsers.User }
     * 
     * 
     */
    public List<SynUsers.User> getUser() {
        if (user == null) {
            user = new ArrayList<SynUsers.User>();
        }
        return this.user;
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
     *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationid" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="userpassword" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="userrealname" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="userflag" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="useremail" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="userphone" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="createtime" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        "userid",
        "username",
        "organizationid",
        "organizationName",
        "userpassword",
        "userrealname",
        "userflag",
        "useremail",
        "userphone",
        "createtime"
    })
    public static class User {

        @XmlElement(name = "OPERATION")
        protected int operation;
        @XmlElement(required = true)
        protected String userid;
        protected String username;
        protected Object organizationid;
        protected Object organizationName;
        protected Object userpassword;
        protected Object userrealname;
        protected Object userflag;
        protected Object useremail;
        protected Object userphone;
        protected Object createtime;

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
         * Gets the value of the userid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserid() {
            return userid;
        }

        /**
         * Sets the value of the userid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserid(String value) {
            this.userid = value;
        }

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Sets the value of the username property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the organizationid property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOrganizationid() {
            return organizationid;
        }

        /**
         * Sets the value of the organizationid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOrganizationid(Object value) {
            this.organizationid = value;
        }

        /**
         * Gets the value of the organizationName property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOrganizationName() {
            return organizationName;
        }

        /**
         * Sets the value of the organizationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOrganizationName(Object value) {
            this.organizationName = value;
        }

        /**
         * Gets the value of the userpassword property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUserpassword() {
            return userpassword;
        }

        /**
         * Sets the value of the userpassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUserpassword(Object value) {
            this.userpassword = value;
        }

        /**
         * Gets the value of the userrealname property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUserrealname() {
            return userrealname;
        }

        /**
         * Sets the value of the userrealname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUserrealname(Object value) {
            this.userrealname = value;
        }

        /**
         * Gets the value of the userflag property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUserflag() {
            return userflag;
        }

        /**
         * Sets the value of the userflag property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUserflag(Object value) {
            this.userflag = value;
        }

        /**
         * Gets the value of the useremail property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUseremail() {
            return useremail;
        }

        /**
         * Sets the value of the useremail property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUseremail(Object value) {
            this.useremail = value;
        }

        /**
         * Gets the value of the userphone property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getUserphone() {
            return userphone;
        }

        /**
         * Sets the value of the userphone property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setUserphone(Object value) {
            this.userphone = value;
        }

        /**
         * Gets the value of the createtime property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCreatetime() {
            return createtime;
        }

        /**
         * Sets the value of the createtime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCreatetime(Object value) {
            this.createtime = value;
        }

    }

}
