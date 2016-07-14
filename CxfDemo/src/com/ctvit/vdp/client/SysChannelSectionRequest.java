
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
 *         &lt;element name="OPERATIONS" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OPERATION" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "operations"
})
@XmlRootElement(name = "sysChannelSectionRequest")
public class SysChannelSectionRequest {

    @XmlElement(name = "OPERATIONS", required = true)
    protected List<SysChannelSectionRequest.OPERATIONS> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPERATIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SysChannelSectionRequest.OPERATIONS }
     * 
     * 
     */
    public List<SysChannelSectionRequest.OPERATIONS> getOPERATIONS() {
        if (operations == null) {
            operations = new ArrayList<SysChannelSectionRequest.OPERATIONS>();
        }
        return this.operations;
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
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nodeID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nodeName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        "type",
        "nodeID",
        "nodeName"
    })
    public static class OPERATIONS {

        @XmlElement(name = "OPERATION")
        protected int operation;
        @XmlElement(name = "TYPE")
        protected int type;
        @XmlElement(required = true)
        protected String nodeID;
        protected Object nodeName;

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
         * Gets the value of the type property.
         * 
         */
        public int getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         */
        public void setTYPE(int value) {
            this.type = value;
        }

        /**
         * Gets the value of the nodeID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodeID() {
            return nodeID;
        }

        /**
         * Sets the value of the nodeID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodeID(String value) {
            this.nodeID = value;
        }

        /**
         * Gets the value of the nodeName property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNodeName() {
            return nodeName;
        }

        /**
         * Sets the value of the nodeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNodeName(Object value) {
            this.nodeName = value;
        }

    }

}
