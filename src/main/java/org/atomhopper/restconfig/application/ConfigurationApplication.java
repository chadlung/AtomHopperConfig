package org.atomhopper.restconfig.application;


import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class ConfigurationApplication extends PackagesResourceConfig {

    public ConfigurationApplication() {
        super("org.atomhopper.resources.impl");
    }
}
