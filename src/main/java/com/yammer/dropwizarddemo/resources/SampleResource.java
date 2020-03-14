package com.yammer.dropwizarddemo.resources;



import com.fasterxml.jackson.databind.ObjectMapper;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.indices.IndicesExists;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.transport.client.PreBuiltTransportClient;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import java.io.IOException;
import java.util.function.Supplier;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Get;
import io.searchbox.core.Index;
import io.searchbox.core.Search;


@Path("/bank")
public class SampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getSamples() throws IOException {


        JestClientFactory factory = new JestClientFactory();
        factory.setHttpClientConfig(
                new HttpClientConfig
                        .Builder("http://localhost:9200")
                        .build());
        JestClient jestClient = factory.getObject();

        Get get = new Get.Builder("bank", "1")
                .build();

        JestResult result = jestClient.execute(get);



        return result.getJsonString();
    }
}
