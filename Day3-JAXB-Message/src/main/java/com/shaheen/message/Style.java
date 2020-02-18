//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.18 at 04:34:43 PM EET 
//


package com.shaheen.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for style complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="style">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fill" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="font-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="font-family" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="font-size" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="font-weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fill-background" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style", propOrder = {
        "fill",
        "fontName",
        "fontFamily",
        "fontSize",
        "fontWeight",
        "fillBackground"
})
public class Style {

    @XmlElement(required = true)
    protected String fill;
    @XmlElement(name = "font-name", required = true)
    protected String fontName;
    @XmlElement(name = "font-family", required = true)
    protected String fontFamily;
    @XmlElement(name = "font-size", required = true)
    protected String fontSize;
    @XmlElement(name = "font-weight", required = true)
    protected String fontWeight;
    @XmlElement(name = "fill-background", required = true)
    protected String fillBackground;

    /**
     * Gets the value of the fill property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the fontName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFontName() {
        return fontName;
    }

    /**
     * Sets the value of the fontName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**
     * Gets the value of the fontFamily property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontWeight property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFontWeight(String value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the fillBackground property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFillBackground() {
        return fillBackground;
    }

    /**
     * Sets the value of the fillBackground property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFillBackground(String value) {
        this.fillBackground = value;
    }

}
