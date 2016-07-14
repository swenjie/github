
package com.ctvit.vdp.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="PRODUCTGUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRODUCTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRODUCTKEYWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRODUCTDURING" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CHANNELSECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROGRAMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORGANIZATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CREATERDATETIME" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PRODUCTDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CATADATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Files" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="File" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DURING" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="archive" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="storageid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="terminalid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="templateid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GROUPTYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EXTRAINFO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "productguid",
    "productname",
    "productkeyword",
    "productduring",
    "channelsection",
    "programetype",
    "organization",
    "source",
    "user",
    "createrdatetime",
    "productdesc",
    "catadata",
    "files",
    "extrainfo"
})
@XmlRootElement(name = "importProductRequest")
public class ImportProductRequest {

    @XmlElement(name = "PRODUCTGUID", required = true)
    protected String productguid;
    @XmlElement(name = "PRODUCTNAME", required = true)
    protected String productname;
    @XmlElement(name = "PRODUCTKEYWORD")
    protected String productkeyword;
    @XmlElement(name = "PRODUCTDURING")
    protected Integer productduring;
    @XmlElement(name = "CHANNELSECTION")
    protected String channelsection;
    @XmlElement(name = "PROGRAMETYPE")
    protected String programetype;
    @XmlElement(name = "ORGANIZATION")
    protected String organization;
    @XmlElement(name = "SOURCE")
    protected String source;
    @XmlElement(name = "USER")
    protected String user;
    @XmlElement(name = "CREATERDATETIME")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createrdatetime;
    @XmlElement(name = "PRODUCTDESC")
    protected String productdesc;
    @XmlElement(name = "CATADATA")
    protected String catadata;
    @XmlElement(name = "Files", required = true)
    protected List<ImportProductRequest.Files> files;
    @XmlElement(name = "EXTRAINFO")
    protected String extrainfo;

    /**
     * Gets the value of the productguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCTGUID() {
        return productguid;
    }

    /**
     * Sets the value of the productguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCTGUID(String value) {
        this.productguid = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getPRODUCTDURING() {
        return productduring;
    }

    /**
     * Sets the value of the productduring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPRODUCTDURING(Integer value) {
        this.productduring = value;
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
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSER() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSER(String value) {
        this.user = value;
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
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportProductRequest.Files }
     * 
     * 
     */
    public List<ImportProductRequest.Files> getFiles() {
        if (files == null) {
            files = new ArrayList<ImportProductRequest.Files>();
        }
        return this.files;
    }

    /**
     * Gets the value of the extrainfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXTRAINFO() {
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
    public void setEXTRAINFO(String value) {
        this.extrainfo = value;
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
     *         &lt;element name="File" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DURING" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="archive" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="storageid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="terminalid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="templateid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GROUPTYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "file"
    })
    public static class Files {

        @XmlElement(name = "File", required = true)
        protected List<ImportProductRequest.Files.File> file;
        @XmlAttribute(required = true)
        protected int archive;
        @XmlAttribute(required = true)
        protected String storageid;
        @XmlAttribute
        protected String terminalid;
        @XmlAttribute
        protected String templateid;
        @XmlAttribute(name = "GROUPTYPE", required = true)
        protected String grouptype;

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportProductRequest.Files.File }
         * 
         * 
         */
        public List<ImportProductRequest.Files.File> getFile() {
            if (file == null) {
                file = new ArrayList<ImportProductRequest.Files.File>();
            }
            return this.file;
        }

        /**
         * Gets the value of the archive property.
         * 
         */
        public int getArchive() {
            return archive;
        }

        /**
         * Sets the value of the archive property.
         * 
         */
        public void setArchive(int value) {
            this.archive = value;
        }

        /**
         * Gets the value of the storageid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStorageid() {
            return storageid;
        }

        /**
         * Sets the value of the storageid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStorageid(String value) {
            this.storageid = value;
        }

        /**
         * Gets the value of the terminalid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminalid() {
            return terminalid;
        }

        /**
         * Sets the value of the terminalid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminalid(String value) {
            this.terminalid = value;
        }

        /**
         * Gets the value of the templateid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplateid() {
            return templateid;
        }

        /**
         * Sets the value of the templateid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplateid(String value) {
            this.templateid = value;
        }

        /**
         * Gets the value of the grouptype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGROUPTYPE() {
            return grouptype;
        }

        /**
         * Sets the value of the grouptype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGROUPTYPE(String value) {
            this.grouptype = value;
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
         *         &lt;element name="PATH" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FILENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DURING" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "path",
            "filename",
            "during",
            "type"
        })
        public static class File {

            @XmlElement(name = "PATH", required = true)
            protected String path;
            @XmlElement(name = "FILENAME", required = true)
            protected String filename;
            @XmlElement(name = "DURING")
            protected Integer during;
            @XmlElement(name = "TYPE")
            protected Integer type;

            /**
             * Gets the value of the path property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPATH() {
                return path;
            }

            /**
             * Sets the value of the path property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPATH(String value) {
                this.path = value;
            }

            /**
             * Gets the value of the filename property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFILENAME() {
                return filename;
            }

            /**
             * Sets the value of the filename property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFILENAME(String value) {
                this.filename = value;
            }

            /**
             * Gets the value of the during property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDURING() {
                return during;
            }

            /**
             * Sets the value of the during property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDURING(Integer value) {
                this.during = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTYPE() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTYPE(Integer value) {
                this.type = value;
            }

        }

    }

}
