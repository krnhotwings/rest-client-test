package org.acme;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @RestClient EchoClient api;

    private final List<String> params = List.of("abc", "123");

    @GET @Path("get")
    public Response getTest() {
        return api.get(params);
    }

    @GET @Path("post")
    public Response postTest() {
        return api.post(params);
    }
}
