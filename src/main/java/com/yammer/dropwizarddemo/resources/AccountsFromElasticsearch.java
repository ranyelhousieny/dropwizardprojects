package com.yammer.dropwizarddemo.resources;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.JestResult;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.Get;
import org.eclipse.jetty.util.ajax.JSON;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

// URL to Elasticsearch Index
@Path("/accounts/{ id }")
public class AccountsFromElasticsearch {

    // 1. Create Jest Client Factory
    public static JestClientFactory factory = new JestClientFactory();

    // 2. create Jest Client
    public static JestClient jestClient;

    static {
        // 3. Configure Elasticsearch URL
        factory.setHttpClientConfig(
                new HttpClientConfig
                        .Builder("http://localhost:9200")
                        .build());

        jestClient = factory.getObject();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAccountById(@PathParam("id") String accountId) throws IOException {



        // 4. Build the GET Rest Command
        Get get = new Get.Builder("bank", accountId).build();

        // 5. Create Result
        JestResult result = jestClient.execute(get);

        // return result as JSON
        return result.getJsonString();
    }



}
