package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestForm;

import jakarta.ws.rs.POST;
import java.util.List;

@RegisterRestClient(configKey = "echo")
public interface EchoClient {

    @POST
    public Response post(@RestForm List<String> myParam);
}
