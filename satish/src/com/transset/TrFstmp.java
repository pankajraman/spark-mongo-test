//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.07 at 01:19:54 PM IST 
//


package com.transset;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="trFstmpTot" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="trFstmpTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="trFstmpChg" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="trFstmpTnd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "trFstmpTot",
    "trFstmpTax",
    "trFstmpChg",
    "trFstmpTnd"
})
@XmlRootElement(name = "trFstmp")
public class TrFstmp {

    protected BigDecimal trFstmpTot;
    protected BigDecimal trFstmpTax;
    protected BigDecimal trFstmpChg;
    protected BigDecimal trFstmpTnd;

    /**
     * Gets the value of the trFstmpTot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrFstmpTot() {
        return trFstmpTot;
    }

    /**
     * Sets the value of the trFstmpTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrFstmpTot(BigDecimal value) {
        this.trFstmpTot = value;
    }

    /**
     * Gets the value of the trFstmpTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrFstmpTax() {
        return trFstmpTax;
    }

    /**
     * Sets the value of the trFstmpTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrFstmpTax(BigDecimal value) {
        this.trFstmpTax = value;
    }

    /**
     * Gets the value of the trFstmpChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrFstmpChg() {
        return trFstmpChg;
    }

    /**
     * Sets the value of the trFstmpChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrFstmpChg(BigDecimal value) {
        this.trFstmpChg = value;
    }

    /**
     * Gets the value of the trFstmpTnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrFstmpTnd() {
        return trFstmpTnd;
    }

    /**
     * Sets the value of the trFstmpTnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrFstmpTnd(BigDecimal value) {
        this.trFstmpTnd = value;
    }

}