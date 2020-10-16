package br.com.luvva;

import com.learnwebservices.services.hello.HelloEndpoint;
import com.learnwebservices.services.hello.HelloRequest;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Tag(name = "default")
public class HelloResource {

    @Inject HelloEndpoint service;

    @POST
    @Path("{hello}")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@PathParam("hello") @NotNull String hello) {
        HelloRequest helloRequest = new HelloRequest();
        helloRequest.setName(hello);
        return service.sayHello(helloRequest).getMessage();
    }
}
