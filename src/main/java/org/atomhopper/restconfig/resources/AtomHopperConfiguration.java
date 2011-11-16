package org.atomhopper.restconfig.resources;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.atomhopper.restconfig.jaxb.generated.Configuration;


public interface AtomHopperConfiguration {
    
    @POST
    @Consumes(MediaType.TEXT_XML)
    Response modifyConfiguration(Configuration config);
    
    @GET
    @Produces(MediaType.TEXT_XML)
    Response retrieveConfiguration();    
}
