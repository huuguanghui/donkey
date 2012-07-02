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
 *       &lt;choice>
 *         &lt;group ref="{}momlRequest"/>
 *         &lt;element ref="{}event"/>
 *       &lt;/choice>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *       &lt;attribute name="id" use="required" type="{}momlID.datatype" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "primitive",
    "control",
    "send",
    "event"
})
@XmlRootElement(name = "moml")
public class Moml {

    @XmlElementRef(name = "primitive", type = JAXBElement.class)
    protected JAXBElement<? extends PrimitiveType> primitive;
    protected ControlType control;
    protected List<Send> send;
    protected Event event;
    @XmlAttribute(required = true)
    protected String version;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Gets the value of the primitive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Dtmf }{@code >}
     *     {@link JAXBElement }{@code <}{@link Play }{@code >}
     *     {@link JAXBElement }{@code <}{@link Dtmfgen }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimitiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Record }{@code >}
     *     
     */
    public JAXBElement<? extends PrimitiveType> getPrimitive() {
        return primitive;
    }

    /**
     * Sets the value of the primitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Dtmf }{@code >}
     *     {@link JAXBElement }{@code <}{@link Play }{@code >}
     *     {@link JAXBElement }{@code <}{@link Dtmfgen }{@code >}
     *     {@link JAXBElement }{@code <}{@link PrimitiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Record }{@code >}
     *     
     */
    public void setPrimitive(JAXBElement<? extends PrimitiveType> value) {
        this.primitive = ((JAXBElement<? extends PrimitiveType> ) value);
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link ControlType }
     *     
     */
    public ControlType getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlType }
     *     
     */
    public void setControl(ControlType value) {
        this.control = value;
    }

    /**
     * Gets the value of the send property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the send property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSend().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Send }
     * 
     * 
     */
    public List<Send> getSend() {
        if (send == null) {
            send = new ArrayList<Send>();
        }
        return this.send;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
