//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.07 at 03:15:00 PM CST 
//


package org.atomhopper.restconfig.jaxb.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.atomhopper.atom.hopper_config.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AtomHopperConfig_QNAME = new QName("http://atomhopper.org/atom/hopper-config/v1.0", "atom-hopper-config");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.atomhopper.atom.hopper_config.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdapterParameter }
     * 
     */
    public AdapterParameter createAdapterParameter() {
        return new AdapterParameter();
    }

    /**
     * Create an instance of {@link FeedConfiguration }
     * 
     */
    public FeedConfiguration createFeedConfiguration() {
        return new FeedConfiguration();
    }

    /**
     * Create an instance of {@link HostConfiguration }
     * 
     */
    public HostConfiguration createHostConfiguration() {
        return new HostConfiguration();
    }

    /**
     * Create an instance of {@link AdapterDescriptor }
     * 
     */
    public AdapterDescriptor createAdapterDescriptor() {
        return new AdapterDescriptor();
    }

    /**
     * Create an instance of {@link ConfigurationDefaults }
     * 
     */
    public ConfigurationDefaults createConfigurationDefaults() {
        return new ConfigurationDefaults();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link WorkspaceConfiguration }
     * 
     */
    public WorkspaceConfiguration createWorkspaceConfiguration() {
        return new WorkspaceConfiguration();
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atomhopper.org/atom/hopper-config/v1.0", name = "atom-hopper-config")
    public JAXBElement<Configuration> createAtomHopperConfig(Configuration value) {
        return new JAXBElement<Configuration>(_AtomHopperConfig_QNAME, Configuration.class, null, value);
    }

}