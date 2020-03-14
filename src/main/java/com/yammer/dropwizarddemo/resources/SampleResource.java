package com.yammer.dropwizarddemo.resources;



import com.fasterxml.jackson.databind.ObjectMapper;
import io.searchbox.client.JestClientFactory;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.transport.client.PreBuiltTransportClient;


import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import java.util.function.Supplier;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Get;
import io.searchbox.core.Index;
import io.searchbox.core.Search;


@Path("/users/{ name }")
public class SampleResource {
    private Supplier<JestClient> clientSupplier;
    private ObjectMapper mapper;

    public SampleResource(Supplier<JestClient> clientSupplier) {

        this.clientSupplier = clientSupplier;
    }

    public static JestClient jestClient = null;
    public static final String ES_HOST = "localhost";
    public static final String ES_PORT = "9200";

    public static void init(){
        try {
            JestClientFactory factory = new JestClientFactory();
            factory.setHttpClientConfig();
        }
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSamples(@PathParam("name") String name){
        String jsonObject = "{\"age\":10,\"dateOfBirth\":1471466076564,"
                +"\"fullName\":\"John Doe\"}";
        return "Hello, Mr. " + name + " !!!";
    }
}
