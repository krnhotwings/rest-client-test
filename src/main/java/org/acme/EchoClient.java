package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestForm;
import org.jboss.resteasy.reactive.RestQuery;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@RegisterRestClient(configKey = "echo")
public interface EchoClient {

    @GET @Path("get")
    public Response get(@RestQuery List<String> queryParam);

    @POST @Path("post")
    public Response post(@RestForm List<String> formParam);
}
