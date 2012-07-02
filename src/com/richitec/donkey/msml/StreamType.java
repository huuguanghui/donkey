//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.29 at 03:35:44 ���� CST 
//


package com.richitec.donkey.msml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for streamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="streamType">
 *   &lt;complexContent>
 *     &lt;extension base="{}basicStreamType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="gain">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="amt" type="{}gainAmt.datatype" />
 *                 &lt;attribute name="agc" type="{}gainAgc.datatype" />
 *                 &lt;attribute name="tgtlvl">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonPositiveInteger">
 *                       &lt;minInclusive value="-40"/>
 *                       &lt;maxInclusive value="0"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="maxgain" default="10">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                       &lt;minInclusive value="0"/>
 *                       &lt;maxInclusive value="40"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clamp">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="dtmf" type="{}boolean.datatype" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamType", propOrder = {
    "gainOrClamp"
})
public class StreamType
    extends BasicStreamType
{

    @XmlElements({
        @XmlElement(name = "clamp", type = StreamType.Clamp.class),
        @XmlElement(name = "gain", type = StreamType.Gain.class)
    })
    protected List<Object> gainOrClamp;

    /**
     * Gets the value of the gainOrClamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gainOrClamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGainOrClamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreamType.Clamp }
     * {@link StreamType.Gain }
     * 
     * 
     */
    public List<Object> getGainOrClamp() {
        if (gainOrClamp == null) {
            gainOrClamp = new ArrayList<Object>();
        }
        return this.gainOrClamp;
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
     *       &lt;attribute name="dtmf" type="{}boolean.datatype" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Clamp {

        @XmlAttribute
        protected BooleanDatatype dtmf;

        /**
         * Gets the value of the dtmf property.
         * 
         * @return
         *     possible object is
         *     {@link BooleanDatatype }
         *     
         */
        public BooleanDatatype getDtmf() {
            return dtmf;
        }

        /**
         * Sets the value of the dtmf property.
         * 
         * @param value
         *     allowed object is
         *     {@link BooleanDatatype }
         *     
         */
        public void setDtmf(BooleanDatatype value) {
            this.dtmf = value;
        }

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
     *       &lt;attribute name="amt" type="{}gainAmt.datatype" />
     *       &lt;attribute name="agc" type="{}gainAgc.datatype" />
     *       &lt;attribute name="tgtlvl">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonPositiveInteger">
     *             &lt;minInclusive value="-40"/>
     *             &lt;maxInclusive value="0"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="maxgain" default="10">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *             &lt;minInclusive value="0"/>
     *             &lt;maxInclusive value="40"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Gain {

        @XmlAttribute
        protected String amt;
        @XmlAttribute
        protected GainAgcDatatype agc;
        @XmlAttribute
        protected Integer tgtlvl;
        @XmlAttribute
        protected Integer maxgain;

        /**
         * Gets the value of the amt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmt() {
            return amt;
        }

        /**
         * Sets the value of the amt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmt(String value) {
            this.amt = value;
        }

        /**
         * Gets the value of the agc property.
         * 
         * @return
         *     possible object is
         *     {@link GainAgcDatatype }
         *     
         */
        public GainAgcDatatype getAgc() {
            return agc;
        }

        /**
         * Sets the value of the agc property.
         * 
         * @param value
         *     allowed object is
         *     {@link GainAgcDatatype }
         *     
         */
        public void setAgc(GainAgcDatatype value) {
            this.agc = value;
        }

        /**
         * Gets the value of the tgtlvl property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTgtlvl() {
            return tgtlvl;
        }

        /**
         * Sets the value of the tgtlvl property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTgtlvl(Integer value) {
            this.tgtlvl = value;
        }

        /**
         * Gets the value of the maxgain property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getMaxgain() {
            if (maxgain == null) {
                return  10;
            } else {
                return maxgain;
            }
        }

        /**
         * Sets the value of the maxgain property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaxgain(Integer value) {
            this.maxgain = value;
        }

    }

}
