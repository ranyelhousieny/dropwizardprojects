package com.yammer.dropwizarddemo.resources;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.JestResult;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.Get;
import org.eclipse.jetty.util.ajax.JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

// URL to Elasticsearch Index
@Path("/accounts")

public class AccountsFromElasticsearch {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAccountById() throws IOException {
        // 1. Create Jest Client Factory
        JestClientFactory factory = new JestClientFactory();

        // 2. Configure Elasticsearch URL
        factory.setHttpClientConfig(
                new HttpClientConfig
                        .Builder("http://localhost:9200")
                        .build());

        // 3. create Client from factory
        JestClient jestClient = factory.getObject();

        // 4. Build the GET Rest Command
        Get get = new Get.Builder("bank", "1").build();

        // 5. Create Result
        JestResult result = jestClient.execute(get);

        // return result as JSON
        return result.getJsonString();
    }



}
