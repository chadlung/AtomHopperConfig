//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.07 at 03:15:00 PM CST 
//


package org.atomhopper.restconfig.jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeedConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{http://atomhopper.org/atom/hopper-config/v1.0}Author" minOccurs="0"/>
 *         &lt;element name="feed-source" type="{http://atomhopper.org/atom/hopper-config/v1.0}AdapterDescriptor" minOccurs="0"/>
 *         &lt;element name="publisher" type="{http://atomhopper.org/atom/hopper-config/v1.0}AdapterDescriptor" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="archived" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedConfiguration", propOrder = {
    "author",
    "feedSource",
    "publisher"
})
public class FeedConfiguration {

    protected Author author;
    @XmlElement(name = "feed-source")
    protected AdapterDescriptor feedSource;
    protected AdapterDescriptor publisher;
    @XmlAttribute(required = true)
    protected String title;
    @XmlAttribute(required = true)
    protected String resource;
    @XmlAttribute
    protected Boolean archived;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link Author }
     *     
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link Author }
     *     
     */
    public void setAuthor(Author value) {
        this.author = value;
    }

    /**
     * Gets the value of the feedSource property.
     * 
     * @return
     *     possible object is
     *     {@link AdapterDescriptor }
     *     
     */
    public AdapterDescriptor getFeedSource() {
        return feedSource;
    }

    /**
     * Sets the value of the feedSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdapterDescriptor }
     *     
     */
    public void setFeedSource(AdapterDescriptor value) {
        this.feedSource = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link AdapterDescriptor }
     *     
     */
    public AdapterDescriptor getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdapterDescriptor }
     *     
     */
    public void setPublisher(AdapterDescriptor value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResource(String value) {
        this.resource = value;
    }

    /**
     * Gets the value of the archived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isArchived() {
        if (archived == null) {
            return false;
        } else {
            return archived;
        }
    }

    /**
     * Sets the value of the archived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArchived(Boolean value) {
        this.archived = value;
    }

}
