//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.07 at 03:15:00 PM CST 
//


package org.atomhopper.restconfig.jaxb.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xhtml:p xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:hopcfg="http://atomhopper.org/atom/hopper-config/v1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
 *                     Describe an ATOMpub Workspace. A workspace is a logical
 *                     collection of related feeds.
 *                 &lt;/xhtml:p&gt;
 * </pre>
 * 
 *             
 * 
 * <p>Java class for WorkspaceConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkspaceConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaults" type="{http://atomhopper.org/atom/hopper-config/v1.0}ConfigurationDefaults" minOccurs="0"/>
 *         &lt;element name="categories-descriptor" type="{http://atomhopper.org/atom/hopper-config/v1.0}AdapterDescriptor" minOccurs="0"/>
 *         &lt;element name="feed" type="{http://atomhopper.org/atom/hopper-config/v1.0}FeedConfiguration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="title" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resource" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkspaceConfiguration", propOrder = {
    "defaults",
    "categoriesDescriptor",
    "feed"
})
public class WorkspaceConfiguration {

    protected ConfigurationDefaults defaults;
    @XmlElement(name = "categories-descriptor")
    protected AdapterDescriptor categoriesDescriptor;
    @XmlElement(required = true)
    protected List<FeedConfiguration> feed;
    @XmlAttribute(required = true)
    protected String title;
    @XmlAttribute(required = true)
    protected String resource;

    /**
     * Gets the value of the defaults property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationDefaults }
     *     
     */
    public ConfigurationDefaults getDefaults() {
        return defaults;
    }

    /**
     * Sets the value of the defaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationDefaults }
     *     
     */
    public void setDefaults(ConfigurationDefaults value) {
        this.defaults = value;
    }

    /**
     * Gets the value of the categoriesDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link AdapterDescriptor }
     *     
     */
    public AdapterDescriptor getCategoriesDescriptor() {
        return categoriesDescriptor;
    }

    /**
     * Sets the value of the categoriesDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdapterDescriptor }
     *     
     */
    public void setCategoriesDescriptor(AdapterDescriptor value) {
        this.categoriesDescriptor = value;
    }

    /**
     * Gets the value of the feed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedConfiguration }
     * 
     * 
     */
    public List<FeedConfiguration> getFeed() {
        if (feed == null) {
            feed = new ArrayList<FeedConfiguration>();
        }
        return this.feed;
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

}
