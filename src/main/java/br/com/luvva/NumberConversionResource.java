package br.com.luvva;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.tempuri.CalculatorSoap;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Tag(name = "default")
public class NumberConversionResource {

    @Inject CalculatorSoap service;

    @POST
    @Path("{number1}/{number2}")
    @Produces(MediaType.TEXT_PLAIN)
    public int get(@PathParam("number1") int number1, @PathParam("number2") int number2) {
        return service.add(number1, number2);
    }
}
