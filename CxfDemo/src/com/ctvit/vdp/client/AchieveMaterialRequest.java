
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
 *         &lt;element name="MaterialID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="MATERIALNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KEYWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATERIALDURING" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CHANNEL_SECTIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROGRAMETYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ORGANIZATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACHIEVEUSER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MATERIALDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CATADATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "materialID",
    "materialname",
    "keyword",
    "materialduring",
    "channelsections",
    "programetype",
    "organization",
    "achieveuser",
    "materialdesc",
    "catadata",
    "fileGroups"
})
@XmlRootElement(name = "achieveMaterialRequest")
public class AchieveMaterialRequest {

    @XmlElement(name = "MaterialID", required = true)
    protected Object materialID;
    @XmlElement(name = "MATERIALNAME", required = true)
    protected String materialname;
    @XmlElement(name = "KEYWORD")
    protected String keyword;
    @XmlElement(name = "MATERIALDURING")
    protected Long materialduring;
    @XmlElement(name = "CHANNEL_SECTIONS")
    protected String channelsections;
    @XmlElement(name = "PROGRAMETYPE")
    protected String programetype;
    @XmlElement(name = "ORGANIZATION")
    protected String organization;
    @XmlElement(name = "ACHIEVEUSER")
    protected String achieveuser;
    @XmlElement(name = "MATERIALDESC")
    protected String materialdesc;
    @XmlElement(name = "CATADATA")
    protected String catadata;
    @XmlElement(name = "FileGroups", required = true)
    protected AchieveMaterialRequest.FileGroups fileGroups;

    /**
     * Gets the value of the materialID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMaterialID() {
        return materialID;
    }

    /**
     * Sets the value of the materialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMaterialID(Object value) {
        this.materialID = value;
    }

    /**
     * Gets the value of the materialname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIALNAME() {
        return materialname;
    }

    /**
     * Sets the value of the materialname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIALNAME(String value) {
        this.materialname = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYWORD() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYWORD(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the materialduring property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMATERIALDURING() {
        return materialduring;
    }

    /**
     * Sets the value of the materialduring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMATERIALDURING(Long value) {
        this.materialduring = value;
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
     * Gets the value of the achieveuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACHIEVEUSER() {
        return achieveuser;
    }

    /**
     * Sets the value of the achieveuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACHIEVEUSER(String value) {
        this.achieveuser = value;
    }

    /**
     * Gets the value of the materialdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIALDESC() {
        return materialdesc;
    }

    /**
     * Sets the value of the materialdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIALDESC(String value) {
        this.materialdesc = value;
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
     * Gets the value of the fileGroups property.
     * 
     * @return
     *     possible object is
     *     {@link AchieveMaterialRequest.FileGroups }
     *     
     */
    public AchieveMaterialRequest.FileGroups getFileGroups() {
        return fileGroups;
    }

    /**
     * Sets the value of the fileGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchieveMaterialRequest.FileGroups }
     *     
     */
    public void setFileGroups(AchieveMaterialRequest.FileGroups value) {
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
        protected List<AchieveMaterialRequest.FileGroups.FileGroup> fileGroup;

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
         * {@link AchieveMaterialRequest.FileGroups.FileGroup }
         * 
         * 
         */
        public List<AchieveMaterialRequest.FileGroups.FileGroup> getFileGroup() {
            if (fileGroup == null) {
                fileGroup = new ArrayList<AchieveMaterialRequest.FileGroups.FileGroup>();
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
