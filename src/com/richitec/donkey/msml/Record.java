//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.29 at 03:35:44 ���� CST 
//


package com.richitec.donkey.msml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}primitiveType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="recordexit">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{}sendType"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="append" type="{}boolean.datatype" default="false" />
 *       &lt;attribute name="dest" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="format" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="maxtime" use="required" type="{}posDuration.datatype" />
 *       &lt;attribute ref="{http://convedia.com/ext}pre-speech default="0s""/>
 *       &lt;attribute ref="{http://convedia.com/ext}post-speech default="0s""/>
 *       &lt;attribute ref="{http://convedia.com/ext}termkey"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recordexit"
})
public class Record
    extends PrimitiveType
{

    protected Record.Recordexit recordexit;
    @XmlAttribute
    protected BooleanDatatype append;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String dest;
    @XmlAttribute(required = true)
    protected String format;
    @XmlAttribute(required = true)
    protected String maxtime;
    @XmlAttribute(name = "pre-speech", namespace = "http://convedia.com/ext")
    protected String preSpeech;
    @XmlAttribute(name = "post-speech", namespace = "http://convedia.com/ext")
    protected String postSpeech;
    @XmlAttribute(namespace = "http://convedia.com/ext")
    protected String termkey;

    /**
     * Gets the value of the recordexit property.
     * 
     * @return
     *     possible object is
     *     {@link Record.Recordexit }
     *     
     */
    public Record.Recordexit getRecordexit() {
        return recordexit;
    }

    /**
     * Sets the value of the recordexit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Record.Recordexit }
     *     
     */
    public void setRecordexit(Record.Recordexit value) {
        this.recordexit = value;
    }

    /**
     * Gets the value of the append property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanDatatype }
     *     
     */
    public BooleanDatatype getAppend() {
        if (append == null) {
            return BooleanDatatype.FALSE;
        } else {
            return append;
        }
    }

    /**
     * Sets the value of the append property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanDatatype }
     *     
     */
    public void setAppend(BooleanDatatype value) {
        this.append = value;
    }

    /**
     * Gets the value of the dest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest() {
        return dest;
    }

    /**
     * Sets the value of the dest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest(String value) {
        this.dest = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the maxtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxtime() {
        return maxtime;
    }

    /**
     * Sets the value of the maxtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxtime(String value) {
        this.maxtime = value;
    }

    /**
     * Gets the value of the preSpeech property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreSpeech() {
        if (preSpeech == null) {
            return "0s";
        } else {
            return preSpeech;
        }
    }

    /**
     * Sets the value of the preSpeech property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreSpeech(String value) {
        this.preSpeech = value;
    }

    /**
     * Gets the value of the postSpeech property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostSpeech() {
        if (postSpeech == null) {
            return "0s";
        } else {
            return postSpeech;
        }
    }

    /**
     * Sets the value of the postSpeech property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostSpeech(String value) {
        this.postSpeech = value;
    }

    /**
     * Gets the value of the termkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermkey() {
        return termkey;
    }

    /**
     * Sets the value of the termkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermkey(String value) {
        this.termkey = value;
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
     *       &lt;group ref="{}sendType"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Recordexit {

        @XmlElementRefs({
            @XmlElementRef(name = "send", type = Send.class),
            @XmlElementRef(name = "exit", type = JAXBElement.class)
        })
        protected List<Object> content;

        /**
         * Gets the rest of the content model. 
         * 
         * <p>
         * You are getting this "catch-all" property because of the following reason: 
         * The field name "Exit" is used by two different parts of a schema. See: 
         * line 28 of file:/F:/workspace/donkey/WebContent/msml/moml-core-module.xsd
         * line 25 of file:/F:/workspace/donkey/WebContent/msml/moml-core-module.xsd
         * <p>
         * To get rid of this property, apply a property customization to one 
         * of both of the following declarations to change their names: 
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link ExitType }{@code >}
         * {@link Send }
         * 
         * 
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
