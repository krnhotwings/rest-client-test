package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class GreetingResource {

    @RestClient EchoClient api;

    @GET
    public Response hello() {
        return api.post(java.util.List.of("abc", "123"));
    }
}
