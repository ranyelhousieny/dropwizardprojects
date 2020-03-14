package com.yammer.dropwizarddemo.resources;



import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
@Path("/users/{ name }")
public class SampleResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSamples(@PathParam("name") String name){
        return "Hello, " + name + " !!!";
    }
}
