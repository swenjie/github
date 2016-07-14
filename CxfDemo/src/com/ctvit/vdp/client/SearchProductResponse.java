
package com.ctvit.vdp.client;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ResultsTotal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PRODUCTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PRODUCTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PRODUCTKEYWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRODUCTDURING" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="CHANNEL_SECTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PUBLISHCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PROGRAMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ORGANIZATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CREATERDATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="CATASTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRODUCTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RECOVERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PRODUCTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CATADATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PLAYURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FileGroups">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FileGroup" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="grouptype" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="bitbare" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="storageid" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="files" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "resultsTotal",
    "product"
})
@XmlRootElement(name = "searchProductResponse")
public class SearchProductResponse {

    @XmlElement(name = "ResultsTotal")
    protected int resultsTotal;
    @XmlElement(name = "Product")
    protected List<SearchProductResponse.Product> product;

    /**
     * Gets the value of the resultsTotal property.
     * 
     */
    public int getResultsTotal() {
        return resultsTotal;
    }

    /**
     * Sets the value of the resultsTotal property.
     * 
     */
    public void setResultsTotal(int value) {
        this.resultsTotal = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchProductResponse.Product }
     * 
     * 
     */
    public List<SearchProductResponse.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<SearchProductResponse.Product>();
        }
        return this.product;
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
     *         &lt;element name="PRODUCTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PRODUCTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PRODUCTKEYWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRODUCTDURING" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="CHANNEL_SECTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PUBLISHCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PROGRAMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ORGANIZATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="USERNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CREATERDATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="CATASTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRODUCTSTATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RECOVERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PRODUCTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CATADATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PLAYURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FileGroups">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FileGroup" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="grouptype" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="bitbare" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="storageid" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="files" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "productid",
        "productname",
        "productkeyword",
        "productduring",
        "channelsections",
        "publishcode",
        "programetype",
        "organization",
        "source",
        "username",
        "createrdatetime",
        "catastatus",
        "productstatus",
        "recoverid",
        "productdesc",
        "catadata",
        "playurl",
        "fileGroups"
    })
    public static class Product {

        @XmlElement(name = "PRODUCTID", required = true)
        protected String productid;
        @XmlElement(name = "PRODUCTNAME", required = true)
        protected String productname;
        @XmlElement(name = "PRODUCTKEYWORD")
        protected String productkeyword;
        @XmlElement(name = "PRODUCTDURING")
        protected Long productduring;
        @XmlElement(name = "CHANNEL_SECTIONS")
        protected String channelsections;
        @XmlElement(name = "PUBLISHCODE")
        protected String publishcode;
        @XmlElement(name = "PROGRAMETYPE")
        protected String programetype;
        @XmlElement(name = "ORGANIZATION")
        protected String organization;
        @XmlElement(name = "SOURCE")
        protected String source;
        @XmlElement(name = "USERNAME")
        protected String username;
        @XmlElement(name = "CREATERDATETIME")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createrdatetime;
        @XmlElement(name = "CATASTATUS")
        protected String catastatus;
        @XmlElement(name = "PRODUCTSTATUS")
        protected String productstatus;
        @XmlElement(name = "RECOVERID")
        protected String recoverid;
        @XmlElement(name = "PRODUCTDESC")
        protected String productdesc;
        @XmlElement(name = "CATADATA")
        protected String catadata;
        @XmlElement(name = "PLAYURL")
        protected String playurl;
        @XmlElement(name = "FileGroups", required = true)
        protected SearchProductResponse.Product.FileGroups fileGroups;

        /**
         * Gets the value of the productid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCTID() {
            return productid;
        }

        /**
         * Sets the value of the productid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCTID(String value) {
            this.productid = value;
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
         * Gets the value of the productkeyword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCTKEYWORD() {
            return productkeyword;
        }

        /**
         * Sets the value of the productkeyword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCTKEYWORD(String value) {
            this.productkeyword = value;
        }

        /**
         * Gets the value of the productduring property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getPRODUCTDURING() {
            return productduring;
        }

        /**
         * Sets the value of the productduring property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setPRODUCTDURING(Long value) {
            this.productduring = value;
        }

        /**
         * Gets the value of the channelsections property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCHANNELSECTIONS() {
            return channelsections;
        }

        /**
         * Sets the value of the channelsections property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCHANNELSECTIONS(String value) {
            this.channelsections = value;
        }

        /**
         * Gets the value of the publishcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPUBLISHCODE() {
            return publishcode;
        }

        /**
         * Sets the value of the publishcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPUBLISHCODE(String value) {
            this.publishcode = value;
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
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSOURCE() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSOURCE(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the username property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERNAME() {
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
        public void setUSERNAME(String value) {
            this.username = value;
        }

        /**
         * Gets the value of the createrdatetime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCREATERDATETIME() {
            return createrdatetime;
        }

        /**
         * Sets the value of the createrdatetime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCREATERDATETIME(XMLGregorianCalendar value) {
            this.createrdatetime = value;
        }

        /**
         * Gets the value of the catastatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCATASTATUS() {
            return catastatus;
        }

        /**
         * Sets the value of the catastatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCATASTATUS(String value) {
            this.catastatus = value;
        }

        /**
         * Gets the value of the productstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCTSTATUS() {
            return productstatus;
        }

        /**
         * Sets the value of the productstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCTSTATUS(String value) {
            this.productstatus = value;
        }

        /**
         * Gets the value of the recoverid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRECOVERID() {
            return recoverid;
        }

        /**
         * Sets the value of the recoverid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRECOVERID(String value) {
            this.recoverid = value;
        }

        /**
         * Gets the value of the productdesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRODUCTDESC() {
            return productdesc;
        }

        /**
         * Sets the value of the productdesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRODUCTDESC(String value) {
            this.productdesc = value;
        }

        /**
         * Gets the value of the catadata property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCATADATA() {
            return catadata;
        }

        /**
         * Sets the value of the catadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCATADATA(String value) {
            this.catadata = value;
        }

        /**
         * Gets the value of the playurl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPLAYURL() {
            return playurl;
        }

        /**
         * Sets the value of the playurl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPLAYURL(String value) {
            this.playurl = value;
        }

        /**
         * Gets the value of the fileGroups property.
         * 
         * @return
         *     possible object is
         *     {@link SearchProductResponse.Product.FileGroups }
         *     
         */
        public SearchProductResponse.Product.FileGroups getFileGroups() {
            return fileGroups;
        }

        /**
         * Sets the value of the fileGroups property.
         * 
         * @param value
         *     allowed object is
         *     {@link SearchProductResponse.Product.FileGroups }
         *     
         */
        public void setFileGroups(SearchProductResponse.Product.FileGroups value) {
            this.fileGroups = value;
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
         *         &lt;element name="FileGroup" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="grouptype" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="bitbare" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="storageid" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="files" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
            "fileGroup"
        })
        public static class FileGroups {

            @XmlElement(name = "FileGroup", required = true)
            protected List<SearchProductResponse.Product.FileGroups.FileGroup> fileGroup;

            /**
             * Gets the value of the fileGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fileGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFileGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchProductResponse.Product.FileGroups.FileGroup }
             * 
             * 
             */
            public List<SearchProductResponse.Product.FileGroups.FileGroup> getFileGroup() {
                if (fileGroup == null) {
                    fileGroup = new ArrayList<SearchProductResponse.Product.FileGroups.FileGroup>();
                }
                return this.fileGroup;
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
             *         &lt;element name="grouptype" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="bitbare" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="storageid" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="files" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
                "grouptype",
                "bitbare",
                "storageid",
                "files"
            })
            public static class FileGroup {

                @XmlElement(required = true)
                protected Object grouptype;
                @XmlElement(required = true)
                protected Object bitbare;
                @XmlElement(required = true)
                protected Object storageid;
                @XmlElement(required = true)
                protected Object files;

                /**
                 * Gets the value of the grouptype property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getGrouptype() {
                    return grouptype;
                }

                /**
                 * Sets the value of the grouptype property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setGrouptype(Object value) {
                    this.grouptype = value;
                }

                /**
                 * Gets the value of the bitbare property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getBitbare() {
                    return bitbare;
                }

                /**
                 * Sets the value of the bitbare property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setBitbare(Object value) {
                    this.bitbare = value;
                }

                /**
                 * Gets the value of the storageid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getStorageid() {
                    return storageid;
                }

                /**
                 * Sets the value of the storageid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setStorageid(Object value) {
                    this.storageid = value;
                }

                /**
                 * Gets the value of the files property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getFiles() {
                    return files;
                }

                /**
                 * Sets the value of the files property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setFiles(Object value) {
                    this.files = value;
                }

            }

        }

    }

}
