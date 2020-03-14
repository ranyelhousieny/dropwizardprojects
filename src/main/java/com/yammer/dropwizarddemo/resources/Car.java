package com.yammer.dropwizarddemo.resources;

import com.yammer.dropwizarddemo.SampleService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("car")
public class Car {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addCar(
            @FormParam("licenseplate") String licensePlate,
            @FormParam("color") String color){

        return null;
    }

}
