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
 * <p>Java class for NAXMLPromoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NAXMLPromoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="combinationOffer"/>
 *     &lt;enumeration value="fuelsDiscCarWash"/>
 *     &lt;enumeration value="mixAndMatchOffer"/>
 *     &lt;enumeration value="tempPriceChange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NAXMLPromoType")
@XmlEnum
public enum NAXMLPromoType {

    @XmlEnumValue("combinationOffer")
    COMBINATION_OFFER("combinationOffer"),
    @XmlEnumValue("fuelsDiscCarWash")
    FUELS_DISC_CAR_WASH("fuelsDiscCarWash"),
    @XmlEnumValue("mixAndMatchOffer")
    MIX_AND_MATCH_OFFER("mixAndMatchOffer"),
    @XmlEnumValue("tempPriceChange")
    TEMP_PRICE_CHANGE("tempPriceChange");
    private final String value;

    NAXMLPromoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NAXMLPromoType fromValue(String v) {
        for (NAXMLPromoType c: NAXMLPromoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
