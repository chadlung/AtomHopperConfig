package org.atomhopper.restconfig;

import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;


@ApplicationPath("/")
public class ConfigurationApplication extends PackagesResourceConfig {

    public ConfigurationApplication() {
        super("org.atomhopper.restconfig.resources.impl");
    }
}
