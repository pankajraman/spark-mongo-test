//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.07 at 01:19:54 PM IST 
//


package com.transset;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mgrAdjustmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mgrAdjustmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="payin"/>
 *     &lt;enumeration value="payout"/>
 *     &lt;enumeration value="safedrop"/>
 *     &lt;enumeration value="safeloan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mgrAdjustmentType")
@XmlEnum
public enum MgrAdjustmentType {

    @XmlEnumValue("payin")
    PAYIN("payin"),
    @XmlEnumValue("payout")
    PAYOUT("payout"),
    @XmlEnumValue("safedrop")
    SAFEDROP("safedrop"),
    @XmlEnumValue("safeloan")
    SAFELOAN("safeloan");
    private final String value;

    MgrAdjustmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MgrAdjustmentType fromValue(String v) {
        for (MgrAdjustmentType c: MgrAdjustmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
