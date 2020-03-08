package com.yammer.dropwizarddemo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/samples")
public class SampleResource {
    @GET
    public String getSamples(){
        return "This is a sample Dropwizard Service";
    }
}
